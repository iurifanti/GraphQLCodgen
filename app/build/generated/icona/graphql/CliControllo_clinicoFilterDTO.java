package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Controllo_clinico.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliControllo_clinicoFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private Integer ALT___eq;
    private Integer ALT___ne;
    private Boolean ALT___null;
    private Boolean ALT___not___null;
    private java.util.List<Integer> ALT___in;
    private java.util.List<Integer> ALT___not___in;
    private Integer ALT___lt;
    private Integer ALT___lte;
    private Integer ALT___gt;
    private Integer ALT___gte;
    private Integer AST___eq;
    private Integer AST___ne;
    private Boolean AST___null;
    private Boolean AST___not___null;
    private java.util.List<Integer> AST___in;
    private java.util.List<Integer> AST___not___in;
    private Integer AST___lt;
    private Integer AST___lte;
    private Integer AST___gt;
    private Integer AST___gte;
    private Integer HDL___eq;
    private Integer HDL___ne;
    private Boolean HDL___null;
    private Boolean HDL___not___null;
    private java.util.List<Integer> HDL___in;
    private java.util.List<Integer> HDL___not___in;
    private Integer HDL___lt;
    private Integer HDL___lte;
    private Integer HDL___gt;
    private Integer HDL___gte;
    private Integer LDL___eq;
    private Integer LDL___ne;
    private Boolean LDL___null;
    private Boolean LDL___not___null;
    private java.util.List<Integer> LDL___in;
    private java.util.List<Integer> LDL___not___in;
    private Integer LDL___lt;
    private Integer LDL___lte;
    private Integer LDL___gt;
    private Integer LDL___gte;
    private String MCV___eq;
    private String MCV___ne;
    private Boolean MCV___null;
    private Boolean MCV___not___null;
    private java.util.List<String> MCV___in;
    private java.util.List<String> MCV___not___in;
    private String MCV___lt;
    private String MCV___lte;
    private String MCV___gt;
    private String MCV___gte;
    private String PCHE___eq;
    private String PCHE___ne;
    private Boolean PCHE___null;
    private Boolean PCHE___not___null;
    private java.util.List<String> PCHE___in;
    private java.util.List<String> PCHE___not___in;
    private String PCHE___lt;
    private String PCHE___lte;
    private String PCHE___gt;
    private String PCHE___gte;
    private Boolean PPD___eq;
    private Boolean PPD___ne;
    private Boolean PPD___null;
    private Boolean PPD___not___null;
    private String PT_INR___eq;
    private String PT_INR___ne;
    private Boolean PT_INR___null;
    private Boolean PT_INR___not___null;
    private java.util.List<String> PT_INR___in;
    private java.util.List<String> PT_INR___not___in;
    private String PT_INR___lt;
    private String PT_INR___lte;
    private String PT_INR___gt;
    private String PT_INR___gte;
    private String PT_percentuale___eq;
    private String PT_percentuale___ne;
    private Boolean PT_percentuale___null;
    private Boolean PT_percentuale___not___null;
    private java.util.List<String> PT_percentuale___in;
    private java.util.List<String> PT_percentuale___not___in;
    private String PT_percentuale___lt;
    private String PT_percentuale___lte;
    private String PT_percentuale___gt;
    private String PT_percentuale___gte;
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
    private String acido_lattico___eq;
    private String acido_lattico___ne;
    private Boolean acido_lattico___null;
    private Boolean acido_lattico___not___null;
    private java.util.List<String> acido_lattico___in;
    private java.util.List<String> acido_lattico___not___in;
    private String acido_lattico___lt;
    private String acido_lattico___lte;
    private String acido_lattico___gt;
    private String acido_lattico___gte;
    private String albumina___eq;
    private String albumina___ne;
    private Boolean albumina___null;
    private Boolean albumina___not___null;
    private java.util.List<String> albumina___in;
    private java.util.List<String> albumina___not___in;
    private String albumina___lt;
    private String albumina___lte;
    private String albumina___gt;
    private String albumina___gte;
    private String alfafetoproteina___eq;
    private String alfafetoproteina___ne;
    private Boolean alfafetoproteina___null;
    private Boolean alfafetoproteina___not___null;
    private java.util.List<String> alfafetoproteina___in;
    private java.util.List<String> alfafetoproteina___not___in;
    private String alfafetoproteina___lt;
    private String alfafetoproteina___lte;
    private String alfafetoproteina___gt;
    private String alfafetoproteina___gte;
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
    private String altro_beve___eq;
    private String altro_beve___ne;
    private Boolean altro_beve___null;
    private Boolean altro_beve___not___null;
    private java.util.List<String> altro_beve___in;
    private java.util.List<String> altro_beve___not___in;
    private String altro_beve___lt;
    private String altro_beve___lte;
    private String altro_beve___gt;
    private String altro_beve___gte;
    private String altro_beve___contains;
    private String altro_beve___not___contains;
    private String altro_beve___starts_with;
    private String altro_beve___not___starts_with;
    private String altro_beve___ends_with;
    private String altro_beve___not___ends_with;
    private Integer azotemia___eq;
    private Integer azotemia___ne;
    private Boolean azotemia___null;
    private Boolean azotemia___not___null;
    private java.util.List<Integer> azotemia___in;
    private java.util.List<Integer> azotemia___not___in;
    private Integer azotemia___lt;
    private Integer azotemia___lte;
    private Integer azotemia___gt;
    private Integer azotemia___gte;
    private Boolean beve___eq;
    private Boolean beve___ne;
    private Boolean beve___null;
    private Boolean beve___not___null;
    private String bilirubina_diretta___eq;
    private String bilirubina_diretta___ne;
    private Boolean bilirubina_diretta___null;
    private Boolean bilirubina_diretta___not___null;
    private java.util.List<String> bilirubina_diretta___in;
    private java.util.List<String> bilirubina_diretta___not___in;
    private String bilirubina_diretta___lt;
    private String bilirubina_diretta___lte;
    private String bilirubina_diretta___gt;
    private String bilirubina_diretta___gte;
    private String bilirubina_totale___eq;
    private String bilirubina_totale___ne;
    private Boolean bilirubina_totale___null;
    private Boolean bilirubina_totale___not___null;
    private java.util.List<String> bilirubina_totale___in;
    private java.util.List<String> bilirubina_totale___not___in;
    private String bilirubina_totale___lt;
    private String bilirubina_totale___lte;
    private String bilirubina_totale___gt;
    private String bilirubina_totale___gte;
    private Integer birra___eq;
    private Integer birra___ne;
    private Boolean birra___null;
    private Boolean birra___not___null;
    private java.util.List<Integer> birra___in;
    private java.util.List<Integer> birra___not___in;
    private Integer birra___lt;
    private Integer birra___lte;
    private Integer birra___gt;
    private Integer birra___gte;
    private String calcio___eq;
    private String calcio___ne;
    private Boolean calcio___null;
    private Boolean calcio___not___null;
    private java.util.List<String> calcio___in;
    private java.util.List<String> calcio___not___in;
    private String calcio___lt;
    private String calcio___lte;
    private String calcio___gt;
    private String calcio___gte;
    private Boolean campione___eq;
    private Boolean campione___ne;
    private Boolean campione___null;
    private Boolean campione___not___null;
    private Boolean chemsex___eq;
    private Boolean chemsex___ne;
    private Boolean chemsex___null;
    private Boolean chemsex___not___null;
    private Integer circonferenza_vita___eq;
    private Integer circonferenza_vita___ne;
    private Boolean circonferenza_vita___null;
    private Boolean circonferenza_vita___not___null;
    private java.util.List<Integer> circonferenza_vita___in;
    private java.util.List<Integer> circonferenza_vita___not___in;
    private Integer circonferenza_vita___lt;
    private Integer circonferenza_vita___lte;
    private Integer circonferenza_vita___gt;
    private Integer circonferenza_vita___gte;
    private Boolean cmvigg___eq;
    private Boolean cmvigg___ne;
    private Boolean cmvigg___null;
    private Boolean cmvigg___not___null;
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
    private Integer colesterolo___eq;
    private Integer colesterolo___ne;
    private Boolean colesterolo___null;
    private Boolean colesterolo___not___null;
    private java.util.List<Integer> colesterolo___in;
    private java.util.List<Integer> colesterolo___not___in;
    private Integer colesterolo___lt;
    private Integer colesterolo___lte;
    private Integer colesterolo___gt;
    private Integer colesterolo___gte;
    private Boolean cov_igg___eq;
    private Boolean cov_igg___ne;
    private Boolean cov_igg___null;
    private Boolean cov_igg___not___null;
    private String cov_igg_titolo___eq;
    private String cov_igg_titolo___ne;
    private Boolean cov_igg_titolo___null;
    private Boolean cov_igg_titolo___not___null;
    private java.util.List<String> cov_igg_titolo___in;
    private java.util.List<String> cov_igg_titolo___not___in;
    private String cov_igg_titolo___lt;
    private String cov_igg_titolo___lte;
    private String cov_igg_titolo___gt;
    private String cov_igg_titolo___gte;
    private Boolean cov_igm___eq;
    private Boolean cov_igm___ne;
    private Boolean cov_igm___null;
    private Boolean cov_igm___not___null;
    private String cov_igm_titolo___eq;
    private String cov_igm_titolo___ne;
    private Boolean cov_igm_titolo___null;
    private Boolean cov_igm_titolo___not___null;
    private java.util.List<String> cov_igm_titolo___in;
    private java.util.List<String> cov_igm_titolo___not___in;
    private String cov_igm_titolo___lt;
    private String cov_igm_titolo___lte;
    private String cov_igm_titolo___gt;
    private String cov_igm_titolo___gte;
    private Boolean cov_rna___eq;
    private Boolean cov_rna___ne;
    private Boolean cov_rna___null;
    private Boolean cov_rna___not___null;
    private String cov_test___eq;
    private String cov_test___ne;
    private Boolean cov_test___null;
    private Boolean cov_test___not___null;
    private java.util.List<String> cov_test___in;
    private java.util.List<String> cov_test___not___in;
    private String cov_test___lt;
    private String cov_test___lte;
    private String cov_test___gt;
    private String cov_test___gte;
    private String cov_test___contains;
    private String cov_test___not___contains;
    private String cov_test___starts_with;
    private String cov_test___not___starts_with;
    private String cov_test___ends_with;
    private String cov_test___not___ends_with;
    private Boolean cov_vax___eq;
    private Boolean cov_vax___ne;
    private Boolean cov_vax___null;
    private Boolean cov_vax___not___null;
    private String creatinina___eq;
    private String creatinina___ne;
    private Boolean creatinina___null;
    private Boolean creatinina___not___null;
    private java.util.List<String> creatinina___in;
    private java.util.List<String> creatinina___not___in;
    private String creatinina___lt;
    private String creatinina___lte;
    private String creatinina___gt;
    private String creatinina___gte;
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
    private String data_campione___eq;
    private String data_campione___ne;
    private Boolean data_campione___null;
    private Boolean data_campione___not___null;
    private java.util.List<String> data_campione___in;
    private java.util.List<String> data_campione___not___in;
    private String data_campione___lt;
    private String data_campione___lte;
    private String data_campione___gt;
    private String data_campione___gte;
    private String data_presunta_parto___eq;
    private String data_presunta_parto___ne;
    private Boolean data_presunta_parto___null;
    private Boolean data_presunta_parto___not___null;
    private java.util.List<String> data_presunta_parto___in;
    private java.util.List<String> data_presunta_parto___not___in;
    private String data_presunta_parto___lt;
    private String data_presunta_parto___lte;
    private String data_presunta_parto___gt;
    private String data_presunta_parto___gte;
    private String data_questionario___eq;
    private String data_questionario___ne;
    private Boolean data_questionario___null;
    private Boolean data_questionario___not___null;
    private java.util.List<String> data_questionario___in;
    private java.util.List<String> data_questionario___not___in;
    private String data_questionario___lt;
    private String data_questionario___lte;
    private String data_questionario___gt;
    private String data_questionario___gte;
    private Integer dosi_omesse___eq;
    private Integer dosi_omesse___ne;
    private Boolean dosi_omesse___null;
    private Boolean dosi_omesse___not___null;
    private java.util.List<Integer> dosi_omesse___in;
    private java.util.List<Integer> dosi_omesse___not___in;
    private Integer dosi_omesse___lt;
    private Integer dosi_omesse___lte;
    private Integer dosi_omesse___gt;
    private Integer dosi_omesse___gte;
    private String emoglobina___eq;
    private String emoglobina___ne;
    private Boolean emoglobina___null;
    private Boolean emoglobina___not___null;
    private java.util.List<String> emoglobina___in;
    private java.util.List<String> emoglobina___not___in;
    private String emoglobina___lt;
    private String emoglobina___lte;
    private String emoglobina___gt;
    private String emoglobina___gte;
    private String emoglobina_glicata___eq;
    private String emoglobina_glicata___ne;
    private Boolean emoglobina_glicata___null;
    private Boolean emoglobina_glicata___not___null;
    private java.util.List<String> emoglobina_glicata___in;
    private java.util.List<String> emoglobina_glicata___not___in;
    private String emoglobina_glicata___lt;
    private String emoglobina_glicata___lte;
    private String emoglobina_glicata___gt;
    private String emoglobina_glicata___gte;
    private String followup_questionario___eq;
    private String followup_questionario___ne;
    private Boolean followup_questionario___null;
    private Boolean followup_questionario___not___null;
    private java.util.List<String> followup_questionario___in;
    private java.util.List<String> followup_questionario___not___in;
    private String followup_questionario___lt;
    private String followup_questionario___lte;
    private String followup_questionario___gt;
    private String followup_questionario___gte;
    private String followup_questionario___contains;
    private String followup_questionario___not___contains;
    private String followup_questionario___starts_with;
    private String followup_questionario___not___starts_with;
    private String followup_questionario___ends_with;
    private String followup_questionario___not___ends_with;
    private Integer fosfatasi_alcalina___eq;
    private Integer fosfatasi_alcalina___ne;
    private Boolean fosfatasi_alcalina___null;
    private Boolean fosfatasi_alcalina___not___null;
    private java.util.List<Integer> fosfatasi_alcalina___in;
    private java.util.List<Integer> fosfatasi_alcalina___not___in;
    private Integer fosfatasi_alcalina___lt;
    private Integer fosfatasi_alcalina___lte;
    private Integer fosfatasi_alcalina___gt;
    private Integer fosfatasi_alcalina___gte;
    private String fosforo___eq;
    private String fosforo___ne;
    private Boolean fosforo___null;
    private Boolean fosforo___not___null;
    private java.util.List<String> fosforo___in;
    private java.util.List<String> fosforo___not___in;
    private String fosforo___lt;
    private String fosforo___lte;
    private String fosforo___gt;
    private String fosforo___gte;
    private String frequenza___eq;
    private String frequenza___ne;
    private Boolean frequenza___null;
    private Boolean frequenza___not___null;
    private java.util.List<String> frequenza___in;
    private java.util.List<String> frequenza___not___in;
    private String frequenza___lt;
    private String frequenza___lte;
    private String frequenza___gt;
    private String frequenza___gte;
    private String frequenza___contains;
    private String frequenza___not___contains;
    private String frequenza___starts_with;
    private String frequenza___not___starts_with;
    private String frequenza___ends_with;
    private String frequenza___not___ends_with;
    private Boolean fumatore_attivo___eq;
    private Boolean fumatore_attivo___ne;
    private Boolean fumatore_attivo___null;
    private Boolean fumatore_attivo___not___null;
    private Integer gamma_gt___eq;
    private Integer gamma_gt___ne;
    private Boolean gamma_gt___null;
    private Boolean gamma_gt___not___null;
    private java.util.List<Integer> gamma_gt___in;
    private java.util.List<Integer> gamma_gt___not___in;
    private Integer gamma_gt___lt;
    private Integer gamma_gt___lte;
    private Integer gamma_gt___gt;
    private Integer gamma_gt___gte;
    private Integer glicemia___eq;
    private Integer glicemia___ne;
    private Boolean glicemia___null;
    private Boolean glicemia___not___null;
    private java.util.List<Integer> glicemia___in;
    private java.util.List<Integer> glicemia___not___in;
    private Integer glicemia___lt;
    private Integer glicemia___lte;
    private Integer glicemia___gt;
    private Integer glicemia___gte;
    private Integer globuli_bianchi___eq;
    private Integer globuli_bianchi___ne;
    private Boolean globuli_bianchi___null;
    private Boolean globuli_bianchi___not___null;
    private java.util.List<Integer> globuli_bianchi___in;
    private java.util.List<Integer> globuli_bianchi___not___in;
    private Integer globuli_bianchi___lt;
    private Integer globuli_bianchi___lte;
    private Integer globuli_bianchi___gt;
    private Integer globuli_bianchi___gte;
    private Boolean gravidanza___eq;
    private Boolean gravidanza___ne;
    private Boolean gravidanza___null;
    private Boolean gravidanza___not___null;
    private Boolean havabtotali___eq;
    private Boolean havabtotali___ne;
    private Boolean havabtotali___null;
    private Boolean havabtotali___not___null;
    private Boolean havigm___eq;
    private Boolean havigm___ne;
    private Boolean havigm___null;
    private Boolean havigm___not___null;
    private Boolean hbcab___eq;
    private Boolean hbcab___ne;
    private Boolean hbcab___null;
    private Boolean hbcab___not___null;
    private Boolean hbcigm___eq;
    private Boolean hbcigm___ne;
    private Boolean hbcigm___null;
    private Boolean hbcigm___not___null;
    private Boolean hbeab___eq;
    private Boolean hbeab___ne;
    private Boolean hbeab___null;
    private Boolean hbeab___not___null;
    private Boolean hbeag___eq;
    private Boolean hbeag___ne;
    private Boolean hbeag___null;
    private Boolean hbeag___not___null;
    private Boolean hbsab___eq;
    private Boolean hbsab___ne;
    private Boolean hbsab___null;
    private Boolean hbsab___not___null;
    private String hbsab_totali___eq;
    private String hbsab_totali___ne;
    private Boolean hbsab_totali___null;
    private Boolean hbsab_totali___not___null;
    private java.util.List<String> hbsab_totali___in;
    private java.util.List<String> hbsab_totali___not___in;
    private String hbsab_totali___lt;
    private String hbsab_totali___lte;
    private String hbsab_totali___gt;
    private String hbsab_totali___gte;
    private Boolean hbsag___eq;
    private Boolean hbsag___ne;
    private Boolean hbsag___null;
    private Boolean hbsag___not___null;
    private String hbsag_totali___eq;
    private String hbsag_totali___ne;
    private Boolean hbsag_totali___null;
    private Boolean hbsag_totali___not___null;
    private java.util.List<String> hbsag_totali___in;
    private java.util.List<String> hbsag_totali___not___in;
    private String hbsag_totali___lt;
    private String hbsag_totali___lte;
    private String hbsag_totali___gt;
    private String hbsag_totali___gte;
    private Boolean hcvab___eq;
    private Boolean hcvab___ne;
    private Boolean hcvab___null;
    private Boolean hcvab___not___null;
    private Boolean hcvag___eq;
    private Boolean hcvag___ne;
    private Boolean hcvag___null;
    private Boolean hcvag___not___null;
    private Boolean hdvab___eq;
    private Boolean hdvab___ne;
    private Boolean hdvab___null;
    private Boolean hdvab___not___null;
    private Boolean hdvab_igg___eq;
    private Boolean hdvab_igg___ne;
    private Boolean hdvab_igg___null;
    private Boolean hdvab_igg___not___null;
    private Boolean hdvabigm___eq;
    private Boolean hdvabigm___ne;
    private Boolean hdvabigm___null;
    private Boolean hdvabigm___not___null;
    private String hdvabtotali___eq;
    private String hdvabtotali___ne;
    private Boolean hdvabtotali___null;
    private Boolean hdvabtotali___not___null;
    private java.util.List<String> hdvabtotali___in;
    private java.util.List<String> hdvabtotali___not___in;
    private String hdvabtotali___lt;
    private String hdvabtotali___lte;
    private String hdvabtotali___gt;
    private String hdvabtotali___gte;
    private Boolean interruzioni___eq;
    private Boolean interruzioni___ne;
    private Boolean interruzioni___null;
    private Boolean interruzioni___not___null;
    private String mdw___eq;
    private String mdw___ne;
    private Boolean mdw___null;
    private Boolean mdw___not___null;
    private java.util.List<String> mdw___in;
    private java.util.List<String> mdw___not___in;
    private String mdw___lt;
    private String mdw___lte;
    private String mdw___gt;
    private String mdw___gte;
    private String metodica_vitamina_D_2___eq;
    private String metodica_vitamina_D_2___ne;
    private Boolean metodica_vitamina_D_2___null;
    private Boolean metodica_vitamina_D_2___not___null;
    private java.util.List<String> metodica_vitamina_D_2___in;
    private java.util.List<String> metodica_vitamina_D_2___not___in;
    private String metodica_vitamina_D_2___lt;
    private String metodica_vitamina_D_2___lte;
    private String metodica_vitamina_D_2___gt;
    private String metodica_vitamina_D_2___gte;
    private String metodica_vitamina_D_2___contains;
    private String metodica_vitamina_D_2___not___contains;
    private String metodica_vitamina_D_2___starts_with;
    private String metodica_vitamina_D_2___not___starts_with;
    private String metodica_vitamina_D_2___ends_with;
    private String metodica_vitamina_D_2___not___ends_with;
    private Integer monociti___eq;
    private Integer monociti___ne;
    private Boolean monociti___null;
    private Boolean monociti___not___null;
    private java.util.List<Integer> monociti___in;
    private java.util.List<Integer> monociti___not___in;
    private Integer monociti___lt;
    private Integer monociti___lte;
    private Integer monociti___gt;
    private Integer monociti___gte;
    private Boolean non_trepon___eq;
    private Boolean non_trepon___ne;
    private Boolean non_trepon___null;
    private Boolean non_trepon___not___null;
    private Integer nr_neutrofili___eq;
    private Integer nr_neutrofili___ne;
    private Boolean nr_neutrofili___null;
    private Boolean nr_neutrofili___not___null;
    private java.util.List<Integer> nr_neutrofili___in;
    private java.util.List<Integer> nr_neutrofili___not___in;
    private Integer nr_neutrofili___lt;
    private Integer nr_neutrofili___lte;
    private Integer nr_neutrofili___gt;
    private Integer nr_neutrofili___gte;
    private Boolean omissione___eq;
    private Boolean omissione___ne;
    private Boolean omissione___null;
    private Boolean omissione___not___null;
    private Integer pa_max___eq;
    private Integer pa_max___ne;
    private Boolean pa_max___null;
    private Boolean pa_max___not___null;
    private java.util.List<Integer> pa_max___in;
    private java.util.List<Integer> pa_max___not___in;
    private Integer pa_max___lt;
    private Integer pa_max___lte;
    private Integer pa_max___gt;
    private Integer pa_max___gte;
    private Integer pa_min___eq;
    private Integer pa_min___ne;
    private Boolean pa_min___null;
    private Boolean pa_min___not___null;
    private java.util.List<Integer> pa_min___in;
    private java.util.List<Integer> pa_min___not___in;
    private Integer pa_min___lt;
    private Integer pa_min___lte;
    private Integer pa_min___gt;
    private Integer pa_min___gte;
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
    private String peso___eq;
    private String peso___ne;
    private Boolean peso___null;
    private Boolean peso___not___null;
    private java.util.List<String> peso___in;
    private java.util.List<String> peso___not___in;
    private String peso___lt;
    private String peso___lte;
    private String peso___gt;
    private String peso___gte;
    private Integer piastrine___eq;
    private Integer piastrine___ne;
    private Boolean piastrine___null;
    private Boolean piastrine___not___null;
    private java.util.List<Integer> piastrine___in;
    private java.util.List<Integer> piastrine___not___in;
    private Integer piastrine___lt;
    private Integer piastrine___lte;
    private Integer piastrine___gt;
    private Integer piastrine___gte;
    private String proteinuria___eq;
    private String proteinuria___ne;
    private Boolean proteinuria___null;
    private Boolean proteinuria___not___null;
    private java.util.List<String> proteinuria___in;
    private java.util.List<String> proteinuria___not___in;
    private String proteinuria___lt;
    private String proteinuria___lte;
    private String proteinuria___gt;
    private String proteinuria___gte;
    private Boolean questionario_str___eq;
    private Boolean questionario_str___ne;
    private Boolean questionario_str___null;
    private Boolean questionario_str___not___null;
    private String sesso_ok___eq;
    private String sesso_ok___ne;
    private Boolean sesso_ok___null;
    private Boolean sesso_ok___not___null;
    private java.util.List<String> sesso_ok___in;
    private java.util.List<String> sesso_ok___not___in;
    private String sesso_ok___lt;
    private String sesso_ok___lte;
    private String sesso_ok___gt;
    private String sesso_ok___gte;
    private String sesso_ok___contains;
    private String sesso_ok___not___contains;
    private String sesso_ok___starts_with;
    private String sesso_ok___not___starts_with;
    private String sesso_ok___ends_with;
    private String sesso_ok___not___ends_with;
    private Integer superalcolici___eq;
    private Integer superalcolici___ne;
    private Boolean superalcolici___null;
    private Boolean superalcolici___not___null;
    private java.util.List<Integer> superalcolici___in;
    private java.util.List<Integer> superalcolici___not___in;
    private Integer superalcolici___lt;
    private Integer superalcolici___lte;
    private Integer superalcolici___gt;
    private Integer superalcolici___gte;
    private Boolean tossicodip_attivo___eq;
    private Boolean tossicodip_attivo___ne;
    private Boolean tossicodip_attivo___null;
    private Boolean tossicodip_attivo___not___null;
    private Boolean toxoigg___eq;
    private Boolean toxoigg___ne;
    private Boolean toxoigg___null;
    private Boolean toxoigg___not___null;
    private Boolean trepon___eq;
    private Boolean trepon___ne;
    private Boolean trepon___null;
    private Boolean trepon___not___null;
    private Integer trigliceridi___eq;
    private Integer trigliceridi___ne;
    private Boolean trigliceridi___null;
    private Boolean trigliceridi___not___null;
    private java.util.List<Integer> trigliceridi___in;
    private java.util.List<Integer> trigliceridi___not___in;
    private Integer trigliceridi___lt;
    private Integer trigliceridi___lte;
    private Integer trigliceridi___gt;
    private Integer trigliceridi___gte;
    private String unita_vitamina_D___eq;
    private String unita_vitamina_D___ne;
    private Boolean unita_vitamina_D___null;
    private Boolean unita_vitamina_D___not___null;
    private java.util.List<String> unita_vitamina_D___in;
    private java.util.List<String> unita_vitamina_D___not___in;
    private String unita_vitamina_D___lt;
    private String unita_vitamina_D___lte;
    private String unita_vitamina_D___gt;
    private String unita_vitamina_D___gte;
    private String unita_vitamina_D___contains;
    private String unita_vitamina_D___not___contains;
    private String unita_vitamina_D___starts_with;
    private String unita_vitamina_D___not___starts_with;
    private String unita_vitamina_D___ends_with;
    private String unita_vitamina_D___not___ends_with;
    private String vas___eq;
    private String vas___ne;
    private Boolean vas___null;
    private Boolean vas___not___null;
    private java.util.List<String> vas___in;
    private java.util.List<String> vas___not___in;
    private String vas___lt;
    private String vas___lte;
    private String vas___gt;
    private String vas___gte;
    private String vas_globale___eq;
    private String vas_globale___ne;
    private Boolean vas_globale___null;
    private Boolean vas_globale___not___null;
    private java.util.List<String> vas_globale___in;
    private java.util.List<String> vas_globale___not___in;
    private String vas_globale___lt;
    private String vas_globale___lte;
    private String vas_globale___gt;
    private String vas_globale___gte;
    private Integer vino___eq;
    private Integer vino___ne;
    private Boolean vino___null;
    private Boolean vino___not___null;
    private java.util.List<Integer> vino___in;
    private java.util.List<Integer> vino___not___in;
    private Integer vino___lt;
    private Integer vino___lte;
    private Integer vino___gt;
    private Integer vino___gte;
    private String vitamina_D___eq;
    private String vitamina_D___ne;
    private Boolean vitamina_D___null;
    private Boolean vitamina_D___not___null;
    private java.util.List<String> vitamina_D___in;
    private java.util.List<String> vitamina_D___not___in;
    private String vitamina_D___lt;
    private String vitamina_D___lte;
    private String vitamina_D___gt;
    private String vitamina_D___gte;
    private java.util.List<CliControllo_clinicoFilterDTO> AND;
    private java.util.List<CliControllo_clinicoFilterDTO> OR;
    private CliControllo_clinicoFilterDTO NOT;

    public CliControllo_clinicoFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public Integer getALT___eq() {
        return ALT___eq;
    }
    public void setALT___eq(Integer ALT___eq) {
        this.ALT___eq = ALT___eq;
    }

    public Integer getALT___ne() {
        return ALT___ne;
    }
    public void setALT___ne(Integer ALT___ne) {
        this.ALT___ne = ALT___ne;
    }

    public Boolean getALT___null() {
        return ALT___null;
    }
    public void setALT___null(Boolean ALT___null) {
        this.ALT___null = ALT___null;
    }

    public Boolean getALT___not___null() {
        return ALT___not___null;
    }
    public void setALT___not___null(Boolean ALT___not___null) {
        this.ALT___not___null = ALT___not___null;
    }

    public java.util.List<Integer> getALT___in() {
        return ALT___in;
    }
    public void setALT___in(java.util.List<Integer> ALT___in) {
        this.ALT___in = ALT___in;
    }

    public java.util.List<Integer> getALT___not___in() {
        return ALT___not___in;
    }
    public void setALT___not___in(java.util.List<Integer> ALT___not___in) {
        this.ALT___not___in = ALT___not___in;
    }

    public Integer getALT___lt() {
        return ALT___lt;
    }
    public void setALT___lt(Integer ALT___lt) {
        this.ALT___lt = ALT___lt;
    }

    public Integer getALT___lte() {
        return ALT___lte;
    }
    public void setALT___lte(Integer ALT___lte) {
        this.ALT___lte = ALT___lte;
    }

    public Integer getALT___gt() {
        return ALT___gt;
    }
    public void setALT___gt(Integer ALT___gt) {
        this.ALT___gt = ALT___gt;
    }

    public Integer getALT___gte() {
        return ALT___gte;
    }
    public void setALT___gte(Integer ALT___gte) {
        this.ALT___gte = ALT___gte;
    }

    public Integer getAST___eq() {
        return AST___eq;
    }
    public void setAST___eq(Integer AST___eq) {
        this.AST___eq = AST___eq;
    }

    public Integer getAST___ne() {
        return AST___ne;
    }
    public void setAST___ne(Integer AST___ne) {
        this.AST___ne = AST___ne;
    }

    public Boolean getAST___null() {
        return AST___null;
    }
    public void setAST___null(Boolean AST___null) {
        this.AST___null = AST___null;
    }

    public Boolean getAST___not___null() {
        return AST___not___null;
    }
    public void setAST___not___null(Boolean AST___not___null) {
        this.AST___not___null = AST___not___null;
    }

    public java.util.List<Integer> getAST___in() {
        return AST___in;
    }
    public void setAST___in(java.util.List<Integer> AST___in) {
        this.AST___in = AST___in;
    }

    public java.util.List<Integer> getAST___not___in() {
        return AST___not___in;
    }
    public void setAST___not___in(java.util.List<Integer> AST___not___in) {
        this.AST___not___in = AST___not___in;
    }

    public Integer getAST___lt() {
        return AST___lt;
    }
    public void setAST___lt(Integer AST___lt) {
        this.AST___lt = AST___lt;
    }

    public Integer getAST___lte() {
        return AST___lte;
    }
    public void setAST___lte(Integer AST___lte) {
        this.AST___lte = AST___lte;
    }

    public Integer getAST___gt() {
        return AST___gt;
    }
    public void setAST___gt(Integer AST___gt) {
        this.AST___gt = AST___gt;
    }

    public Integer getAST___gte() {
        return AST___gte;
    }
    public void setAST___gte(Integer AST___gte) {
        this.AST___gte = AST___gte;
    }

    public Integer getHDL___eq() {
        return HDL___eq;
    }
    public void setHDL___eq(Integer HDL___eq) {
        this.HDL___eq = HDL___eq;
    }

    public Integer getHDL___ne() {
        return HDL___ne;
    }
    public void setHDL___ne(Integer HDL___ne) {
        this.HDL___ne = HDL___ne;
    }

    public Boolean getHDL___null() {
        return HDL___null;
    }
    public void setHDL___null(Boolean HDL___null) {
        this.HDL___null = HDL___null;
    }

    public Boolean getHDL___not___null() {
        return HDL___not___null;
    }
    public void setHDL___not___null(Boolean HDL___not___null) {
        this.HDL___not___null = HDL___not___null;
    }

    public java.util.List<Integer> getHDL___in() {
        return HDL___in;
    }
    public void setHDL___in(java.util.List<Integer> HDL___in) {
        this.HDL___in = HDL___in;
    }

    public java.util.List<Integer> getHDL___not___in() {
        return HDL___not___in;
    }
    public void setHDL___not___in(java.util.List<Integer> HDL___not___in) {
        this.HDL___not___in = HDL___not___in;
    }

    public Integer getHDL___lt() {
        return HDL___lt;
    }
    public void setHDL___lt(Integer HDL___lt) {
        this.HDL___lt = HDL___lt;
    }

    public Integer getHDL___lte() {
        return HDL___lte;
    }
    public void setHDL___lte(Integer HDL___lte) {
        this.HDL___lte = HDL___lte;
    }

    public Integer getHDL___gt() {
        return HDL___gt;
    }
    public void setHDL___gt(Integer HDL___gt) {
        this.HDL___gt = HDL___gt;
    }

    public Integer getHDL___gte() {
        return HDL___gte;
    }
    public void setHDL___gte(Integer HDL___gte) {
        this.HDL___gte = HDL___gte;
    }

    public Integer getLDL___eq() {
        return LDL___eq;
    }
    public void setLDL___eq(Integer LDL___eq) {
        this.LDL___eq = LDL___eq;
    }

    public Integer getLDL___ne() {
        return LDL___ne;
    }
    public void setLDL___ne(Integer LDL___ne) {
        this.LDL___ne = LDL___ne;
    }

    public Boolean getLDL___null() {
        return LDL___null;
    }
    public void setLDL___null(Boolean LDL___null) {
        this.LDL___null = LDL___null;
    }

    public Boolean getLDL___not___null() {
        return LDL___not___null;
    }
    public void setLDL___not___null(Boolean LDL___not___null) {
        this.LDL___not___null = LDL___not___null;
    }

    public java.util.List<Integer> getLDL___in() {
        return LDL___in;
    }
    public void setLDL___in(java.util.List<Integer> LDL___in) {
        this.LDL___in = LDL___in;
    }

    public java.util.List<Integer> getLDL___not___in() {
        return LDL___not___in;
    }
    public void setLDL___not___in(java.util.List<Integer> LDL___not___in) {
        this.LDL___not___in = LDL___not___in;
    }

    public Integer getLDL___lt() {
        return LDL___lt;
    }
    public void setLDL___lt(Integer LDL___lt) {
        this.LDL___lt = LDL___lt;
    }

    public Integer getLDL___lte() {
        return LDL___lte;
    }
    public void setLDL___lte(Integer LDL___lte) {
        this.LDL___lte = LDL___lte;
    }

    public Integer getLDL___gt() {
        return LDL___gt;
    }
    public void setLDL___gt(Integer LDL___gt) {
        this.LDL___gt = LDL___gt;
    }

    public Integer getLDL___gte() {
        return LDL___gte;
    }
    public void setLDL___gte(Integer LDL___gte) {
        this.LDL___gte = LDL___gte;
    }

    public String getMCV___eq() {
        return MCV___eq;
    }
    public void setMCV___eq(String MCV___eq) {
        this.MCV___eq = MCV___eq;
    }

    public String getMCV___ne() {
        return MCV___ne;
    }
    public void setMCV___ne(String MCV___ne) {
        this.MCV___ne = MCV___ne;
    }

    public Boolean getMCV___null() {
        return MCV___null;
    }
    public void setMCV___null(Boolean MCV___null) {
        this.MCV___null = MCV___null;
    }

    public Boolean getMCV___not___null() {
        return MCV___not___null;
    }
    public void setMCV___not___null(Boolean MCV___not___null) {
        this.MCV___not___null = MCV___not___null;
    }

    public java.util.List<String> getMCV___in() {
        return MCV___in;
    }
    public void setMCV___in(java.util.List<String> MCV___in) {
        this.MCV___in = MCV___in;
    }

    public java.util.List<String> getMCV___not___in() {
        return MCV___not___in;
    }
    public void setMCV___not___in(java.util.List<String> MCV___not___in) {
        this.MCV___not___in = MCV___not___in;
    }

    public String getMCV___lt() {
        return MCV___lt;
    }
    public void setMCV___lt(String MCV___lt) {
        this.MCV___lt = MCV___lt;
    }

    public String getMCV___lte() {
        return MCV___lte;
    }
    public void setMCV___lte(String MCV___lte) {
        this.MCV___lte = MCV___lte;
    }

    public String getMCV___gt() {
        return MCV___gt;
    }
    public void setMCV___gt(String MCV___gt) {
        this.MCV___gt = MCV___gt;
    }

    public String getMCV___gte() {
        return MCV___gte;
    }
    public void setMCV___gte(String MCV___gte) {
        this.MCV___gte = MCV___gte;
    }

    public String getPCHE___eq() {
        return PCHE___eq;
    }
    public void setPCHE___eq(String PCHE___eq) {
        this.PCHE___eq = PCHE___eq;
    }

    public String getPCHE___ne() {
        return PCHE___ne;
    }
    public void setPCHE___ne(String PCHE___ne) {
        this.PCHE___ne = PCHE___ne;
    }

    public Boolean getPCHE___null() {
        return PCHE___null;
    }
    public void setPCHE___null(Boolean PCHE___null) {
        this.PCHE___null = PCHE___null;
    }

    public Boolean getPCHE___not___null() {
        return PCHE___not___null;
    }
    public void setPCHE___not___null(Boolean PCHE___not___null) {
        this.PCHE___not___null = PCHE___not___null;
    }

    public java.util.List<String> getPCHE___in() {
        return PCHE___in;
    }
    public void setPCHE___in(java.util.List<String> PCHE___in) {
        this.PCHE___in = PCHE___in;
    }

    public java.util.List<String> getPCHE___not___in() {
        return PCHE___not___in;
    }
    public void setPCHE___not___in(java.util.List<String> PCHE___not___in) {
        this.PCHE___not___in = PCHE___not___in;
    }

    public String getPCHE___lt() {
        return PCHE___lt;
    }
    public void setPCHE___lt(String PCHE___lt) {
        this.PCHE___lt = PCHE___lt;
    }

    public String getPCHE___lte() {
        return PCHE___lte;
    }
    public void setPCHE___lte(String PCHE___lte) {
        this.PCHE___lte = PCHE___lte;
    }

    public String getPCHE___gt() {
        return PCHE___gt;
    }
    public void setPCHE___gt(String PCHE___gt) {
        this.PCHE___gt = PCHE___gt;
    }

    public String getPCHE___gte() {
        return PCHE___gte;
    }
    public void setPCHE___gte(String PCHE___gte) {
        this.PCHE___gte = PCHE___gte;
    }

    public Boolean getPPD___eq() {
        return PPD___eq;
    }
    public void setPPD___eq(Boolean PPD___eq) {
        this.PPD___eq = PPD___eq;
    }

    public Boolean getPPD___ne() {
        return PPD___ne;
    }
    public void setPPD___ne(Boolean PPD___ne) {
        this.PPD___ne = PPD___ne;
    }

    public Boolean getPPD___null() {
        return PPD___null;
    }
    public void setPPD___null(Boolean PPD___null) {
        this.PPD___null = PPD___null;
    }

    public Boolean getPPD___not___null() {
        return PPD___not___null;
    }
    public void setPPD___not___null(Boolean PPD___not___null) {
        this.PPD___not___null = PPD___not___null;
    }

    public String getPT_INR___eq() {
        return PT_INR___eq;
    }
    public void setPT_INR___eq(String PT_INR___eq) {
        this.PT_INR___eq = PT_INR___eq;
    }

    public String getPT_INR___ne() {
        return PT_INR___ne;
    }
    public void setPT_INR___ne(String PT_INR___ne) {
        this.PT_INR___ne = PT_INR___ne;
    }

    public Boolean getPT_INR___null() {
        return PT_INR___null;
    }
    public void setPT_INR___null(Boolean PT_INR___null) {
        this.PT_INR___null = PT_INR___null;
    }

    public Boolean getPT_INR___not___null() {
        return PT_INR___not___null;
    }
    public void setPT_INR___not___null(Boolean PT_INR___not___null) {
        this.PT_INR___not___null = PT_INR___not___null;
    }

    public java.util.List<String> getPT_INR___in() {
        return PT_INR___in;
    }
    public void setPT_INR___in(java.util.List<String> PT_INR___in) {
        this.PT_INR___in = PT_INR___in;
    }

    public java.util.List<String> getPT_INR___not___in() {
        return PT_INR___not___in;
    }
    public void setPT_INR___not___in(java.util.List<String> PT_INR___not___in) {
        this.PT_INR___not___in = PT_INR___not___in;
    }

    public String getPT_INR___lt() {
        return PT_INR___lt;
    }
    public void setPT_INR___lt(String PT_INR___lt) {
        this.PT_INR___lt = PT_INR___lt;
    }

    public String getPT_INR___lte() {
        return PT_INR___lte;
    }
    public void setPT_INR___lte(String PT_INR___lte) {
        this.PT_INR___lte = PT_INR___lte;
    }

    public String getPT_INR___gt() {
        return PT_INR___gt;
    }
    public void setPT_INR___gt(String PT_INR___gt) {
        this.PT_INR___gt = PT_INR___gt;
    }

    public String getPT_INR___gte() {
        return PT_INR___gte;
    }
    public void setPT_INR___gte(String PT_INR___gte) {
        this.PT_INR___gte = PT_INR___gte;
    }

    public String getPT_percentuale___eq() {
        return PT_percentuale___eq;
    }
    public void setPT_percentuale___eq(String PT_percentuale___eq) {
        this.PT_percentuale___eq = PT_percentuale___eq;
    }

    public String getPT_percentuale___ne() {
        return PT_percentuale___ne;
    }
    public void setPT_percentuale___ne(String PT_percentuale___ne) {
        this.PT_percentuale___ne = PT_percentuale___ne;
    }

    public Boolean getPT_percentuale___null() {
        return PT_percentuale___null;
    }
    public void setPT_percentuale___null(Boolean PT_percentuale___null) {
        this.PT_percentuale___null = PT_percentuale___null;
    }

    public Boolean getPT_percentuale___not___null() {
        return PT_percentuale___not___null;
    }
    public void setPT_percentuale___not___null(Boolean PT_percentuale___not___null) {
        this.PT_percentuale___not___null = PT_percentuale___not___null;
    }

    public java.util.List<String> getPT_percentuale___in() {
        return PT_percentuale___in;
    }
    public void setPT_percentuale___in(java.util.List<String> PT_percentuale___in) {
        this.PT_percentuale___in = PT_percentuale___in;
    }

    public java.util.List<String> getPT_percentuale___not___in() {
        return PT_percentuale___not___in;
    }
    public void setPT_percentuale___not___in(java.util.List<String> PT_percentuale___not___in) {
        this.PT_percentuale___not___in = PT_percentuale___not___in;
    }

    public String getPT_percentuale___lt() {
        return PT_percentuale___lt;
    }
    public void setPT_percentuale___lt(String PT_percentuale___lt) {
        this.PT_percentuale___lt = PT_percentuale___lt;
    }

    public String getPT_percentuale___lte() {
        return PT_percentuale___lte;
    }
    public void setPT_percentuale___lte(String PT_percentuale___lte) {
        this.PT_percentuale___lte = PT_percentuale___lte;
    }

    public String getPT_percentuale___gt() {
        return PT_percentuale___gt;
    }
    public void setPT_percentuale___gt(String PT_percentuale___gt) {
        this.PT_percentuale___gt = PT_percentuale___gt;
    }

    public String getPT_percentuale___gte() {
        return PT_percentuale___gte;
    }
    public void setPT_percentuale___gte(String PT_percentuale___gte) {
        this.PT_percentuale___gte = PT_percentuale___gte;
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

    public String getAcido_lattico___eq() {
        return acido_lattico___eq;
    }
    public void setAcido_lattico___eq(String acido_lattico___eq) {
        this.acido_lattico___eq = acido_lattico___eq;
    }

    public String getAcido_lattico___ne() {
        return acido_lattico___ne;
    }
    public void setAcido_lattico___ne(String acido_lattico___ne) {
        this.acido_lattico___ne = acido_lattico___ne;
    }

    public Boolean getAcido_lattico___null() {
        return acido_lattico___null;
    }
    public void setAcido_lattico___null(Boolean acido_lattico___null) {
        this.acido_lattico___null = acido_lattico___null;
    }

    public Boolean getAcido_lattico___not___null() {
        return acido_lattico___not___null;
    }
    public void setAcido_lattico___not___null(Boolean acido_lattico___not___null) {
        this.acido_lattico___not___null = acido_lattico___not___null;
    }

    public java.util.List<String> getAcido_lattico___in() {
        return acido_lattico___in;
    }
    public void setAcido_lattico___in(java.util.List<String> acido_lattico___in) {
        this.acido_lattico___in = acido_lattico___in;
    }

    public java.util.List<String> getAcido_lattico___not___in() {
        return acido_lattico___not___in;
    }
    public void setAcido_lattico___not___in(java.util.List<String> acido_lattico___not___in) {
        this.acido_lattico___not___in = acido_lattico___not___in;
    }

    public String getAcido_lattico___lt() {
        return acido_lattico___lt;
    }
    public void setAcido_lattico___lt(String acido_lattico___lt) {
        this.acido_lattico___lt = acido_lattico___lt;
    }

    public String getAcido_lattico___lte() {
        return acido_lattico___lte;
    }
    public void setAcido_lattico___lte(String acido_lattico___lte) {
        this.acido_lattico___lte = acido_lattico___lte;
    }

    public String getAcido_lattico___gt() {
        return acido_lattico___gt;
    }
    public void setAcido_lattico___gt(String acido_lattico___gt) {
        this.acido_lattico___gt = acido_lattico___gt;
    }

    public String getAcido_lattico___gte() {
        return acido_lattico___gte;
    }
    public void setAcido_lattico___gte(String acido_lattico___gte) {
        this.acido_lattico___gte = acido_lattico___gte;
    }

    public String getAlbumina___eq() {
        return albumina___eq;
    }
    public void setAlbumina___eq(String albumina___eq) {
        this.albumina___eq = albumina___eq;
    }

    public String getAlbumina___ne() {
        return albumina___ne;
    }
    public void setAlbumina___ne(String albumina___ne) {
        this.albumina___ne = albumina___ne;
    }

    public Boolean getAlbumina___null() {
        return albumina___null;
    }
    public void setAlbumina___null(Boolean albumina___null) {
        this.albumina___null = albumina___null;
    }

    public Boolean getAlbumina___not___null() {
        return albumina___not___null;
    }
    public void setAlbumina___not___null(Boolean albumina___not___null) {
        this.albumina___not___null = albumina___not___null;
    }

    public java.util.List<String> getAlbumina___in() {
        return albumina___in;
    }
    public void setAlbumina___in(java.util.List<String> albumina___in) {
        this.albumina___in = albumina___in;
    }

    public java.util.List<String> getAlbumina___not___in() {
        return albumina___not___in;
    }
    public void setAlbumina___not___in(java.util.List<String> albumina___not___in) {
        this.albumina___not___in = albumina___not___in;
    }

    public String getAlbumina___lt() {
        return albumina___lt;
    }
    public void setAlbumina___lt(String albumina___lt) {
        this.albumina___lt = albumina___lt;
    }

    public String getAlbumina___lte() {
        return albumina___lte;
    }
    public void setAlbumina___lte(String albumina___lte) {
        this.albumina___lte = albumina___lte;
    }

    public String getAlbumina___gt() {
        return albumina___gt;
    }
    public void setAlbumina___gt(String albumina___gt) {
        this.albumina___gt = albumina___gt;
    }

    public String getAlbumina___gte() {
        return albumina___gte;
    }
    public void setAlbumina___gte(String albumina___gte) {
        this.albumina___gte = albumina___gte;
    }

    public String getAlfafetoproteina___eq() {
        return alfafetoproteina___eq;
    }
    public void setAlfafetoproteina___eq(String alfafetoproteina___eq) {
        this.alfafetoproteina___eq = alfafetoproteina___eq;
    }

    public String getAlfafetoproteina___ne() {
        return alfafetoproteina___ne;
    }
    public void setAlfafetoproteina___ne(String alfafetoproteina___ne) {
        this.alfafetoproteina___ne = alfafetoproteina___ne;
    }

    public Boolean getAlfafetoproteina___null() {
        return alfafetoproteina___null;
    }
    public void setAlfafetoproteina___null(Boolean alfafetoproteina___null) {
        this.alfafetoproteina___null = alfafetoproteina___null;
    }

    public Boolean getAlfafetoproteina___not___null() {
        return alfafetoproteina___not___null;
    }
    public void setAlfafetoproteina___not___null(Boolean alfafetoproteina___not___null) {
        this.alfafetoproteina___not___null = alfafetoproteina___not___null;
    }

    public java.util.List<String> getAlfafetoproteina___in() {
        return alfafetoproteina___in;
    }
    public void setAlfafetoproteina___in(java.util.List<String> alfafetoproteina___in) {
        this.alfafetoproteina___in = alfafetoproteina___in;
    }

    public java.util.List<String> getAlfafetoproteina___not___in() {
        return alfafetoproteina___not___in;
    }
    public void setAlfafetoproteina___not___in(java.util.List<String> alfafetoproteina___not___in) {
        this.alfafetoproteina___not___in = alfafetoproteina___not___in;
    }

    public String getAlfafetoproteina___lt() {
        return alfafetoproteina___lt;
    }
    public void setAlfafetoproteina___lt(String alfafetoproteina___lt) {
        this.alfafetoproteina___lt = alfafetoproteina___lt;
    }

    public String getAlfafetoproteina___lte() {
        return alfafetoproteina___lte;
    }
    public void setAlfafetoproteina___lte(String alfafetoproteina___lte) {
        this.alfafetoproteina___lte = alfafetoproteina___lte;
    }

    public String getAlfafetoproteina___gt() {
        return alfafetoproteina___gt;
    }
    public void setAlfafetoproteina___gt(String alfafetoproteina___gt) {
        this.alfafetoproteina___gt = alfafetoproteina___gt;
    }

    public String getAlfafetoproteina___gte() {
        return alfafetoproteina___gte;
    }
    public void setAlfafetoproteina___gte(String alfafetoproteina___gte) {
        this.alfafetoproteina___gte = alfafetoproteina___gte;
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

    public String getAltro_beve___eq() {
        return altro_beve___eq;
    }
    public void setAltro_beve___eq(String altro_beve___eq) {
        this.altro_beve___eq = altro_beve___eq;
    }

    public String getAltro_beve___ne() {
        return altro_beve___ne;
    }
    public void setAltro_beve___ne(String altro_beve___ne) {
        this.altro_beve___ne = altro_beve___ne;
    }

    public Boolean getAltro_beve___null() {
        return altro_beve___null;
    }
    public void setAltro_beve___null(Boolean altro_beve___null) {
        this.altro_beve___null = altro_beve___null;
    }

    public Boolean getAltro_beve___not___null() {
        return altro_beve___not___null;
    }
    public void setAltro_beve___not___null(Boolean altro_beve___not___null) {
        this.altro_beve___not___null = altro_beve___not___null;
    }

    public java.util.List<String> getAltro_beve___in() {
        return altro_beve___in;
    }
    public void setAltro_beve___in(java.util.List<String> altro_beve___in) {
        this.altro_beve___in = altro_beve___in;
    }

    public java.util.List<String> getAltro_beve___not___in() {
        return altro_beve___not___in;
    }
    public void setAltro_beve___not___in(java.util.List<String> altro_beve___not___in) {
        this.altro_beve___not___in = altro_beve___not___in;
    }

    public String getAltro_beve___lt() {
        return altro_beve___lt;
    }
    public void setAltro_beve___lt(String altro_beve___lt) {
        this.altro_beve___lt = altro_beve___lt;
    }

    public String getAltro_beve___lte() {
        return altro_beve___lte;
    }
    public void setAltro_beve___lte(String altro_beve___lte) {
        this.altro_beve___lte = altro_beve___lte;
    }

    public String getAltro_beve___gt() {
        return altro_beve___gt;
    }
    public void setAltro_beve___gt(String altro_beve___gt) {
        this.altro_beve___gt = altro_beve___gt;
    }

    public String getAltro_beve___gte() {
        return altro_beve___gte;
    }
    public void setAltro_beve___gte(String altro_beve___gte) {
        this.altro_beve___gte = altro_beve___gte;
    }

    public String getAltro_beve___contains() {
        return altro_beve___contains;
    }
    public void setAltro_beve___contains(String altro_beve___contains) {
        this.altro_beve___contains = altro_beve___contains;
    }

    public String getAltro_beve___not___contains() {
        return altro_beve___not___contains;
    }
    public void setAltro_beve___not___contains(String altro_beve___not___contains) {
        this.altro_beve___not___contains = altro_beve___not___contains;
    }

    public String getAltro_beve___starts_with() {
        return altro_beve___starts_with;
    }
    public void setAltro_beve___starts_with(String altro_beve___starts_with) {
        this.altro_beve___starts_with = altro_beve___starts_with;
    }

    public String getAltro_beve___not___starts_with() {
        return altro_beve___not___starts_with;
    }
    public void setAltro_beve___not___starts_with(String altro_beve___not___starts_with) {
        this.altro_beve___not___starts_with = altro_beve___not___starts_with;
    }

    public String getAltro_beve___ends_with() {
        return altro_beve___ends_with;
    }
    public void setAltro_beve___ends_with(String altro_beve___ends_with) {
        this.altro_beve___ends_with = altro_beve___ends_with;
    }

    public String getAltro_beve___not___ends_with() {
        return altro_beve___not___ends_with;
    }
    public void setAltro_beve___not___ends_with(String altro_beve___not___ends_with) {
        this.altro_beve___not___ends_with = altro_beve___not___ends_with;
    }

    public Integer getAzotemia___eq() {
        return azotemia___eq;
    }
    public void setAzotemia___eq(Integer azotemia___eq) {
        this.azotemia___eq = azotemia___eq;
    }

    public Integer getAzotemia___ne() {
        return azotemia___ne;
    }
    public void setAzotemia___ne(Integer azotemia___ne) {
        this.azotemia___ne = azotemia___ne;
    }

    public Boolean getAzotemia___null() {
        return azotemia___null;
    }
    public void setAzotemia___null(Boolean azotemia___null) {
        this.azotemia___null = azotemia___null;
    }

    public Boolean getAzotemia___not___null() {
        return azotemia___not___null;
    }
    public void setAzotemia___not___null(Boolean azotemia___not___null) {
        this.azotemia___not___null = azotemia___not___null;
    }

    public java.util.List<Integer> getAzotemia___in() {
        return azotemia___in;
    }
    public void setAzotemia___in(java.util.List<Integer> azotemia___in) {
        this.azotemia___in = azotemia___in;
    }

    public java.util.List<Integer> getAzotemia___not___in() {
        return azotemia___not___in;
    }
    public void setAzotemia___not___in(java.util.List<Integer> azotemia___not___in) {
        this.azotemia___not___in = azotemia___not___in;
    }

    public Integer getAzotemia___lt() {
        return azotemia___lt;
    }
    public void setAzotemia___lt(Integer azotemia___lt) {
        this.azotemia___lt = azotemia___lt;
    }

    public Integer getAzotemia___lte() {
        return azotemia___lte;
    }
    public void setAzotemia___lte(Integer azotemia___lte) {
        this.azotemia___lte = azotemia___lte;
    }

    public Integer getAzotemia___gt() {
        return azotemia___gt;
    }
    public void setAzotemia___gt(Integer azotemia___gt) {
        this.azotemia___gt = azotemia___gt;
    }

    public Integer getAzotemia___gte() {
        return azotemia___gte;
    }
    public void setAzotemia___gte(Integer azotemia___gte) {
        this.azotemia___gte = azotemia___gte;
    }

    public Boolean getBeve___eq() {
        return beve___eq;
    }
    public void setBeve___eq(Boolean beve___eq) {
        this.beve___eq = beve___eq;
    }

    public Boolean getBeve___ne() {
        return beve___ne;
    }
    public void setBeve___ne(Boolean beve___ne) {
        this.beve___ne = beve___ne;
    }

    public Boolean getBeve___null() {
        return beve___null;
    }
    public void setBeve___null(Boolean beve___null) {
        this.beve___null = beve___null;
    }

    public Boolean getBeve___not___null() {
        return beve___not___null;
    }
    public void setBeve___not___null(Boolean beve___not___null) {
        this.beve___not___null = beve___not___null;
    }

    public String getBilirubina_diretta___eq() {
        return bilirubina_diretta___eq;
    }
    public void setBilirubina_diretta___eq(String bilirubina_diretta___eq) {
        this.bilirubina_diretta___eq = bilirubina_diretta___eq;
    }

    public String getBilirubina_diretta___ne() {
        return bilirubina_diretta___ne;
    }
    public void setBilirubina_diretta___ne(String bilirubina_diretta___ne) {
        this.bilirubina_diretta___ne = bilirubina_diretta___ne;
    }

    public Boolean getBilirubina_diretta___null() {
        return bilirubina_diretta___null;
    }
    public void setBilirubina_diretta___null(Boolean bilirubina_diretta___null) {
        this.bilirubina_diretta___null = bilirubina_diretta___null;
    }

    public Boolean getBilirubina_diretta___not___null() {
        return bilirubina_diretta___not___null;
    }
    public void setBilirubina_diretta___not___null(Boolean bilirubina_diretta___not___null) {
        this.bilirubina_diretta___not___null = bilirubina_diretta___not___null;
    }

    public java.util.List<String> getBilirubina_diretta___in() {
        return bilirubina_diretta___in;
    }
    public void setBilirubina_diretta___in(java.util.List<String> bilirubina_diretta___in) {
        this.bilirubina_diretta___in = bilirubina_diretta___in;
    }

    public java.util.List<String> getBilirubina_diretta___not___in() {
        return bilirubina_diretta___not___in;
    }
    public void setBilirubina_diretta___not___in(java.util.List<String> bilirubina_diretta___not___in) {
        this.bilirubina_diretta___not___in = bilirubina_diretta___not___in;
    }

    public String getBilirubina_diretta___lt() {
        return bilirubina_diretta___lt;
    }
    public void setBilirubina_diretta___lt(String bilirubina_diretta___lt) {
        this.bilirubina_diretta___lt = bilirubina_diretta___lt;
    }

    public String getBilirubina_diretta___lte() {
        return bilirubina_diretta___lte;
    }
    public void setBilirubina_diretta___lte(String bilirubina_diretta___lte) {
        this.bilirubina_diretta___lte = bilirubina_diretta___lte;
    }

    public String getBilirubina_diretta___gt() {
        return bilirubina_diretta___gt;
    }
    public void setBilirubina_diretta___gt(String bilirubina_diretta___gt) {
        this.bilirubina_diretta___gt = bilirubina_diretta___gt;
    }

    public String getBilirubina_diretta___gte() {
        return bilirubina_diretta___gte;
    }
    public void setBilirubina_diretta___gte(String bilirubina_diretta___gte) {
        this.bilirubina_diretta___gte = bilirubina_diretta___gte;
    }

    public String getBilirubina_totale___eq() {
        return bilirubina_totale___eq;
    }
    public void setBilirubina_totale___eq(String bilirubina_totale___eq) {
        this.bilirubina_totale___eq = bilirubina_totale___eq;
    }

    public String getBilirubina_totale___ne() {
        return bilirubina_totale___ne;
    }
    public void setBilirubina_totale___ne(String bilirubina_totale___ne) {
        this.bilirubina_totale___ne = bilirubina_totale___ne;
    }

    public Boolean getBilirubina_totale___null() {
        return bilirubina_totale___null;
    }
    public void setBilirubina_totale___null(Boolean bilirubina_totale___null) {
        this.bilirubina_totale___null = bilirubina_totale___null;
    }

    public Boolean getBilirubina_totale___not___null() {
        return bilirubina_totale___not___null;
    }
    public void setBilirubina_totale___not___null(Boolean bilirubina_totale___not___null) {
        this.bilirubina_totale___not___null = bilirubina_totale___not___null;
    }

    public java.util.List<String> getBilirubina_totale___in() {
        return bilirubina_totale___in;
    }
    public void setBilirubina_totale___in(java.util.List<String> bilirubina_totale___in) {
        this.bilirubina_totale___in = bilirubina_totale___in;
    }

    public java.util.List<String> getBilirubina_totale___not___in() {
        return bilirubina_totale___not___in;
    }
    public void setBilirubina_totale___not___in(java.util.List<String> bilirubina_totale___not___in) {
        this.bilirubina_totale___not___in = bilirubina_totale___not___in;
    }

    public String getBilirubina_totale___lt() {
        return bilirubina_totale___lt;
    }
    public void setBilirubina_totale___lt(String bilirubina_totale___lt) {
        this.bilirubina_totale___lt = bilirubina_totale___lt;
    }

    public String getBilirubina_totale___lte() {
        return bilirubina_totale___lte;
    }
    public void setBilirubina_totale___lte(String bilirubina_totale___lte) {
        this.bilirubina_totale___lte = bilirubina_totale___lte;
    }

    public String getBilirubina_totale___gt() {
        return bilirubina_totale___gt;
    }
    public void setBilirubina_totale___gt(String bilirubina_totale___gt) {
        this.bilirubina_totale___gt = bilirubina_totale___gt;
    }

    public String getBilirubina_totale___gte() {
        return bilirubina_totale___gte;
    }
    public void setBilirubina_totale___gte(String bilirubina_totale___gte) {
        this.bilirubina_totale___gte = bilirubina_totale___gte;
    }

    public Integer getBirra___eq() {
        return birra___eq;
    }
    public void setBirra___eq(Integer birra___eq) {
        this.birra___eq = birra___eq;
    }

    public Integer getBirra___ne() {
        return birra___ne;
    }
    public void setBirra___ne(Integer birra___ne) {
        this.birra___ne = birra___ne;
    }

    public Boolean getBirra___null() {
        return birra___null;
    }
    public void setBirra___null(Boolean birra___null) {
        this.birra___null = birra___null;
    }

    public Boolean getBirra___not___null() {
        return birra___not___null;
    }
    public void setBirra___not___null(Boolean birra___not___null) {
        this.birra___not___null = birra___not___null;
    }

    public java.util.List<Integer> getBirra___in() {
        return birra___in;
    }
    public void setBirra___in(java.util.List<Integer> birra___in) {
        this.birra___in = birra___in;
    }

    public java.util.List<Integer> getBirra___not___in() {
        return birra___not___in;
    }
    public void setBirra___not___in(java.util.List<Integer> birra___not___in) {
        this.birra___not___in = birra___not___in;
    }

    public Integer getBirra___lt() {
        return birra___lt;
    }
    public void setBirra___lt(Integer birra___lt) {
        this.birra___lt = birra___lt;
    }

    public Integer getBirra___lte() {
        return birra___lte;
    }
    public void setBirra___lte(Integer birra___lte) {
        this.birra___lte = birra___lte;
    }

    public Integer getBirra___gt() {
        return birra___gt;
    }
    public void setBirra___gt(Integer birra___gt) {
        this.birra___gt = birra___gt;
    }

    public Integer getBirra___gte() {
        return birra___gte;
    }
    public void setBirra___gte(Integer birra___gte) {
        this.birra___gte = birra___gte;
    }

    public String getCalcio___eq() {
        return calcio___eq;
    }
    public void setCalcio___eq(String calcio___eq) {
        this.calcio___eq = calcio___eq;
    }

    public String getCalcio___ne() {
        return calcio___ne;
    }
    public void setCalcio___ne(String calcio___ne) {
        this.calcio___ne = calcio___ne;
    }

    public Boolean getCalcio___null() {
        return calcio___null;
    }
    public void setCalcio___null(Boolean calcio___null) {
        this.calcio___null = calcio___null;
    }

    public Boolean getCalcio___not___null() {
        return calcio___not___null;
    }
    public void setCalcio___not___null(Boolean calcio___not___null) {
        this.calcio___not___null = calcio___not___null;
    }

    public java.util.List<String> getCalcio___in() {
        return calcio___in;
    }
    public void setCalcio___in(java.util.List<String> calcio___in) {
        this.calcio___in = calcio___in;
    }

    public java.util.List<String> getCalcio___not___in() {
        return calcio___not___in;
    }
    public void setCalcio___not___in(java.util.List<String> calcio___not___in) {
        this.calcio___not___in = calcio___not___in;
    }

    public String getCalcio___lt() {
        return calcio___lt;
    }
    public void setCalcio___lt(String calcio___lt) {
        this.calcio___lt = calcio___lt;
    }

    public String getCalcio___lte() {
        return calcio___lte;
    }
    public void setCalcio___lte(String calcio___lte) {
        this.calcio___lte = calcio___lte;
    }

    public String getCalcio___gt() {
        return calcio___gt;
    }
    public void setCalcio___gt(String calcio___gt) {
        this.calcio___gt = calcio___gt;
    }

    public String getCalcio___gte() {
        return calcio___gte;
    }
    public void setCalcio___gte(String calcio___gte) {
        this.calcio___gte = calcio___gte;
    }

    public Boolean getCampione___eq() {
        return campione___eq;
    }
    public void setCampione___eq(Boolean campione___eq) {
        this.campione___eq = campione___eq;
    }

    public Boolean getCampione___ne() {
        return campione___ne;
    }
    public void setCampione___ne(Boolean campione___ne) {
        this.campione___ne = campione___ne;
    }

    public Boolean getCampione___null() {
        return campione___null;
    }
    public void setCampione___null(Boolean campione___null) {
        this.campione___null = campione___null;
    }

    public Boolean getCampione___not___null() {
        return campione___not___null;
    }
    public void setCampione___not___null(Boolean campione___not___null) {
        this.campione___not___null = campione___not___null;
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

    public Integer getCirconferenza_vita___eq() {
        return circonferenza_vita___eq;
    }
    public void setCirconferenza_vita___eq(Integer circonferenza_vita___eq) {
        this.circonferenza_vita___eq = circonferenza_vita___eq;
    }

    public Integer getCirconferenza_vita___ne() {
        return circonferenza_vita___ne;
    }
    public void setCirconferenza_vita___ne(Integer circonferenza_vita___ne) {
        this.circonferenza_vita___ne = circonferenza_vita___ne;
    }

    public Boolean getCirconferenza_vita___null() {
        return circonferenza_vita___null;
    }
    public void setCirconferenza_vita___null(Boolean circonferenza_vita___null) {
        this.circonferenza_vita___null = circonferenza_vita___null;
    }

    public Boolean getCirconferenza_vita___not___null() {
        return circonferenza_vita___not___null;
    }
    public void setCirconferenza_vita___not___null(Boolean circonferenza_vita___not___null) {
        this.circonferenza_vita___not___null = circonferenza_vita___not___null;
    }

    public java.util.List<Integer> getCirconferenza_vita___in() {
        return circonferenza_vita___in;
    }
    public void setCirconferenza_vita___in(java.util.List<Integer> circonferenza_vita___in) {
        this.circonferenza_vita___in = circonferenza_vita___in;
    }

    public java.util.List<Integer> getCirconferenza_vita___not___in() {
        return circonferenza_vita___not___in;
    }
    public void setCirconferenza_vita___not___in(java.util.List<Integer> circonferenza_vita___not___in) {
        this.circonferenza_vita___not___in = circonferenza_vita___not___in;
    }

    public Integer getCirconferenza_vita___lt() {
        return circonferenza_vita___lt;
    }
    public void setCirconferenza_vita___lt(Integer circonferenza_vita___lt) {
        this.circonferenza_vita___lt = circonferenza_vita___lt;
    }

    public Integer getCirconferenza_vita___lte() {
        return circonferenza_vita___lte;
    }
    public void setCirconferenza_vita___lte(Integer circonferenza_vita___lte) {
        this.circonferenza_vita___lte = circonferenza_vita___lte;
    }

    public Integer getCirconferenza_vita___gt() {
        return circonferenza_vita___gt;
    }
    public void setCirconferenza_vita___gt(Integer circonferenza_vita___gt) {
        this.circonferenza_vita___gt = circonferenza_vita___gt;
    }

    public Integer getCirconferenza_vita___gte() {
        return circonferenza_vita___gte;
    }
    public void setCirconferenza_vita___gte(Integer circonferenza_vita___gte) {
        this.circonferenza_vita___gte = circonferenza_vita___gte;
    }

    public Boolean getCmvigg___eq() {
        return cmvigg___eq;
    }
    public void setCmvigg___eq(Boolean cmvigg___eq) {
        this.cmvigg___eq = cmvigg___eq;
    }

    public Boolean getCmvigg___ne() {
        return cmvigg___ne;
    }
    public void setCmvigg___ne(Boolean cmvigg___ne) {
        this.cmvigg___ne = cmvigg___ne;
    }

    public Boolean getCmvigg___null() {
        return cmvigg___null;
    }
    public void setCmvigg___null(Boolean cmvigg___null) {
        this.cmvigg___null = cmvigg___null;
    }

    public Boolean getCmvigg___not___null() {
        return cmvigg___not___null;
    }
    public void setCmvigg___not___null(Boolean cmvigg___not___null) {
        this.cmvigg___not___null = cmvigg___not___null;
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

    public Integer getColesterolo___eq() {
        return colesterolo___eq;
    }
    public void setColesterolo___eq(Integer colesterolo___eq) {
        this.colesterolo___eq = colesterolo___eq;
    }

    public Integer getColesterolo___ne() {
        return colesterolo___ne;
    }
    public void setColesterolo___ne(Integer colesterolo___ne) {
        this.colesterolo___ne = colesterolo___ne;
    }

    public Boolean getColesterolo___null() {
        return colesterolo___null;
    }
    public void setColesterolo___null(Boolean colesterolo___null) {
        this.colesterolo___null = colesterolo___null;
    }

    public Boolean getColesterolo___not___null() {
        return colesterolo___not___null;
    }
    public void setColesterolo___not___null(Boolean colesterolo___not___null) {
        this.colesterolo___not___null = colesterolo___not___null;
    }

    public java.util.List<Integer> getColesterolo___in() {
        return colesterolo___in;
    }
    public void setColesterolo___in(java.util.List<Integer> colesterolo___in) {
        this.colesterolo___in = colesterolo___in;
    }

    public java.util.List<Integer> getColesterolo___not___in() {
        return colesterolo___not___in;
    }
    public void setColesterolo___not___in(java.util.List<Integer> colesterolo___not___in) {
        this.colesterolo___not___in = colesterolo___not___in;
    }

    public Integer getColesterolo___lt() {
        return colesterolo___lt;
    }
    public void setColesterolo___lt(Integer colesterolo___lt) {
        this.colesterolo___lt = colesterolo___lt;
    }

    public Integer getColesterolo___lte() {
        return colesterolo___lte;
    }
    public void setColesterolo___lte(Integer colesterolo___lte) {
        this.colesterolo___lte = colesterolo___lte;
    }

    public Integer getColesterolo___gt() {
        return colesterolo___gt;
    }
    public void setColesterolo___gt(Integer colesterolo___gt) {
        this.colesterolo___gt = colesterolo___gt;
    }

    public Integer getColesterolo___gte() {
        return colesterolo___gte;
    }
    public void setColesterolo___gte(Integer colesterolo___gte) {
        this.colesterolo___gte = colesterolo___gte;
    }

    public Boolean getCov_igg___eq() {
        return cov_igg___eq;
    }
    public void setCov_igg___eq(Boolean cov_igg___eq) {
        this.cov_igg___eq = cov_igg___eq;
    }

    public Boolean getCov_igg___ne() {
        return cov_igg___ne;
    }
    public void setCov_igg___ne(Boolean cov_igg___ne) {
        this.cov_igg___ne = cov_igg___ne;
    }

    public Boolean getCov_igg___null() {
        return cov_igg___null;
    }
    public void setCov_igg___null(Boolean cov_igg___null) {
        this.cov_igg___null = cov_igg___null;
    }

    public Boolean getCov_igg___not___null() {
        return cov_igg___not___null;
    }
    public void setCov_igg___not___null(Boolean cov_igg___not___null) {
        this.cov_igg___not___null = cov_igg___not___null;
    }

    public String getCov_igg_titolo___eq() {
        return cov_igg_titolo___eq;
    }
    public void setCov_igg_titolo___eq(String cov_igg_titolo___eq) {
        this.cov_igg_titolo___eq = cov_igg_titolo___eq;
    }

    public String getCov_igg_titolo___ne() {
        return cov_igg_titolo___ne;
    }
    public void setCov_igg_titolo___ne(String cov_igg_titolo___ne) {
        this.cov_igg_titolo___ne = cov_igg_titolo___ne;
    }

    public Boolean getCov_igg_titolo___null() {
        return cov_igg_titolo___null;
    }
    public void setCov_igg_titolo___null(Boolean cov_igg_titolo___null) {
        this.cov_igg_titolo___null = cov_igg_titolo___null;
    }

    public Boolean getCov_igg_titolo___not___null() {
        return cov_igg_titolo___not___null;
    }
    public void setCov_igg_titolo___not___null(Boolean cov_igg_titolo___not___null) {
        this.cov_igg_titolo___not___null = cov_igg_titolo___not___null;
    }

    public java.util.List<String> getCov_igg_titolo___in() {
        return cov_igg_titolo___in;
    }
    public void setCov_igg_titolo___in(java.util.List<String> cov_igg_titolo___in) {
        this.cov_igg_titolo___in = cov_igg_titolo___in;
    }

    public java.util.List<String> getCov_igg_titolo___not___in() {
        return cov_igg_titolo___not___in;
    }
    public void setCov_igg_titolo___not___in(java.util.List<String> cov_igg_titolo___not___in) {
        this.cov_igg_titolo___not___in = cov_igg_titolo___not___in;
    }

    public String getCov_igg_titolo___lt() {
        return cov_igg_titolo___lt;
    }
    public void setCov_igg_titolo___lt(String cov_igg_titolo___lt) {
        this.cov_igg_titolo___lt = cov_igg_titolo___lt;
    }

    public String getCov_igg_titolo___lte() {
        return cov_igg_titolo___lte;
    }
    public void setCov_igg_titolo___lte(String cov_igg_titolo___lte) {
        this.cov_igg_titolo___lte = cov_igg_titolo___lte;
    }

    public String getCov_igg_titolo___gt() {
        return cov_igg_titolo___gt;
    }
    public void setCov_igg_titolo___gt(String cov_igg_titolo___gt) {
        this.cov_igg_titolo___gt = cov_igg_titolo___gt;
    }

    public String getCov_igg_titolo___gte() {
        return cov_igg_titolo___gte;
    }
    public void setCov_igg_titolo___gte(String cov_igg_titolo___gte) {
        this.cov_igg_titolo___gte = cov_igg_titolo___gte;
    }

    public Boolean getCov_igm___eq() {
        return cov_igm___eq;
    }
    public void setCov_igm___eq(Boolean cov_igm___eq) {
        this.cov_igm___eq = cov_igm___eq;
    }

    public Boolean getCov_igm___ne() {
        return cov_igm___ne;
    }
    public void setCov_igm___ne(Boolean cov_igm___ne) {
        this.cov_igm___ne = cov_igm___ne;
    }

    public Boolean getCov_igm___null() {
        return cov_igm___null;
    }
    public void setCov_igm___null(Boolean cov_igm___null) {
        this.cov_igm___null = cov_igm___null;
    }

    public Boolean getCov_igm___not___null() {
        return cov_igm___not___null;
    }
    public void setCov_igm___not___null(Boolean cov_igm___not___null) {
        this.cov_igm___not___null = cov_igm___not___null;
    }

    public String getCov_igm_titolo___eq() {
        return cov_igm_titolo___eq;
    }
    public void setCov_igm_titolo___eq(String cov_igm_titolo___eq) {
        this.cov_igm_titolo___eq = cov_igm_titolo___eq;
    }

    public String getCov_igm_titolo___ne() {
        return cov_igm_titolo___ne;
    }
    public void setCov_igm_titolo___ne(String cov_igm_titolo___ne) {
        this.cov_igm_titolo___ne = cov_igm_titolo___ne;
    }

    public Boolean getCov_igm_titolo___null() {
        return cov_igm_titolo___null;
    }
    public void setCov_igm_titolo___null(Boolean cov_igm_titolo___null) {
        this.cov_igm_titolo___null = cov_igm_titolo___null;
    }

    public Boolean getCov_igm_titolo___not___null() {
        return cov_igm_titolo___not___null;
    }
    public void setCov_igm_titolo___not___null(Boolean cov_igm_titolo___not___null) {
        this.cov_igm_titolo___not___null = cov_igm_titolo___not___null;
    }

    public java.util.List<String> getCov_igm_titolo___in() {
        return cov_igm_titolo___in;
    }
    public void setCov_igm_titolo___in(java.util.List<String> cov_igm_titolo___in) {
        this.cov_igm_titolo___in = cov_igm_titolo___in;
    }

    public java.util.List<String> getCov_igm_titolo___not___in() {
        return cov_igm_titolo___not___in;
    }
    public void setCov_igm_titolo___not___in(java.util.List<String> cov_igm_titolo___not___in) {
        this.cov_igm_titolo___not___in = cov_igm_titolo___not___in;
    }

    public String getCov_igm_titolo___lt() {
        return cov_igm_titolo___lt;
    }
    public void setCov_igm_titolo___lt(String cov_igm_titolo___lt) {
        this.cov_igm_titolo___lt = cov_igm_titolo___lt;
    }

    public String getCov_igm_titolo___lte() {
        return cov_igm_titolo___lte;
    }
    public void setCov_igm_titolo___lte(String cov_igm_titolo___lte) {
        this.cov_igm_titolo___lte = cov_igm_titolo___lte;
    }

    public String getCov_igm_titolo___gt() {
        return cov_igm_titolo___gt;
    }
    public void setCov_igm_titolo___gt(String cov_igm_titolo___gt) {
        this.cov_igm_titolo___gt = cov_igm_titolo___gt;
    }

    public String getCov_igm_titolo___gte() {
        return cov_igm_titolo___gte;
    }
    public void setCov_igm_titolo___gte(String cov_igm_titolo___gte) {
        this.cov_igm_titolo___gte = cov_igm_titolo___gte;
    }

    public Boolean getCov_rna___eq() {
        return cov_rna___eq;
    }
    public void setCov_rna___eq(Boolean cov_rna___eq) {
        this.cov_rna___eq = cov_rna___eq;
    }

    public Boolean getCov_rna___ne() {
        return cov_rna___ne;
    }
    public void setCov_rna___ne(Boolean cov_rna___ne) {
        this.cov_rna___ne = cov_rna___ne;
    }

    public Boolean getCov_rna___null() {
        return cov_rna___null;
    }
    public void setCov_rna___null(Boolean cov_rna___null) {
        this.cov_rna___null = cov_rna___null;
    }

    public Boolean getCov_rna___not___null() {
        return cov_rna___not___null;
    }
    public void setCov_rna___not___null(Boolean cov_rna___not___null) {
        this.cov_rna___not___null = cov_rna___not___null;
    }

    public String getCov_test___eq() {
        return cov_test___eq;
    }
    public void setCov_test___eq(String cov_test___eq) {
        this.cov_test___eq = cov_test___eq;
    }

    public String getCov_test___ne() {
        return cov_test___ne;
    }
    public void setCov_test___ne(String cov_test___ne) {
        this.cov_test___ne = cov_test___ne;
    }

    public Boolean getCov_test___null() {
        return cov_test___null;
    }
    public void setCov_test___null(Boolean cov_test___null) {
        this.cov_test___null = cov_test___null;
    }

    public Boolean getCov_test___not___null() {
        return cov_test___not___null;
    }
    public void setCov_test___not___null(Boolean cov_test___not___null) {
        this.cov_test___not___null = cov_test___not___null;
    }

    public java.util.List<String> getCov_test___in() {
        return cov_test___in;
    }
    public void setCov_test___in(java.util.List<String> cov_test___in) {
        this.cov_test___in = cov_test___in;
    }

    public java.util.List<String> getCov_test___not___in() {
        return cov_test___not___in;
    }
    public void setCov_test___not___in(java.util.List<String> cov_test___not___in) {
        this.cov_test___not___in = cov_test___not___in;
    }

    public String getCov_test___lt() {
        return cov_test___lt;
    }
    public void setCov_test___lt(String cov_test___lt) {
        this.cov_test___lt = cov_test___lt;
    }

    public String getCov_test___lte() {
        return cov_test___lte;
    }
    public void setCov_test___lte(String cov_test___lte) {
        this.cov_test___lte = cov_test___lte;
    }

    public String getCov_test___gt() {
        return cov_test___gt;
    }
    public void setCov_test___gt(String cov_test___gt) {
        this.cov_test___gt = cov_test___gt;
    }

    public String getCov_test___gte() {
        return cov_test___gte;
    }
    public void setCov_test___gte(String cov_test___gte) {
        this.cov_test___gte = cov_test___gte;
    }

    public String getCov_test___contains() {
        return cov_test___contains;
    }
    public void setCov_test___contains(String cov_test___contains) {
        this.cov_test___contains = cov_test___contains;
    }

    public String getCov_test___not___contains() {
        return cov_test___not___contains;
    }
    public void setCov_test___not___contains(String cov_test___not___contains) {
        this.cov_test___not___contains = cov_test___not___contains;
    }

    public String getCov_test___starts_with() {
        return cov_test___starts_with;
    }
    public void setCov_test___starts_with(String cov_test___starts_with) {
        this.cov_test___starts_with = cov_test___starts_with;
    }

    public String getCov_test___not___starts_with() {
        return cov_test___not___starts_with;
    }
    public void setCov_test___not___starts_with(String cov_test___not___starts_with) {
        this.cov_test___not___starts_with = cov_test___not___starts_with;
    }

    public String getCov_test___ends_with() {
        return cov_test___ends_with;
    }
    public void setCov_test___ends_with(String cov_test___ends_with) {
        this.cov_test___ends_with = cov_test___ends_with;
    }

    public String getCov_test___not___ends_with() {
        return cov_test___not___ends_with;
    }
    public void setCov_test___not___ends_with(String cov_test___not___ends_with) {
        this.cov_test___not___ends_with = cov_test___not___ends_with;
    }

    public Boolean getCov_vax___eq() {
        return cov_vax___eq;
    }
    public void setCov_vax___eq(Boolean cov_vax___eq) {
        this.cov_vax___eq = cov_vax___eq;
    }

    public Boolean getCov_vax___ne() {
        return cov_vax___ne;
    }
    public void setCov_vax___ne(Boolean cov_vax___ne) {
        this.cov_vax___ne = cov_vax___ne;
    }

    public Boolean getCov_vax___null() {
        return cov_vax___null;
    }
    public void setCov_vax___null(Boolean cov_vax___null) {
        this.cov_vax___null = cov_vax___null;
    }

    public Boolean getCov_vax___not___null() {
        return cov_vax___not___null;
    }
    public void setCov_vax___not___null(Boolean cov_vax___not___null) {
        this.cov_vax___not___null = cov_vax___not___null;
    }

    public String getCreatinina___eq() {
        return creatinina___eq;
    }
    public void setCreatinina___eq(String creatinina___eq) {
        this.creatinina___eq = creatinina___eq;
    }

    public String getCreatinina___ne() {
        return creatinina___ne;
    }
    public void setCreatinina___ne(String creatinina___ne) {
        this.creatinina___ne = creatinina___ne;
    }

    public Boolean getCreatinina___null() {
        return creatinina___null;
    }
    public void setCreatinina___null(Boolean creatinina___null) {
        this.creatinina___null = creatinina___null;
    }

    public Boolean getCreatinina___not___null() {
        return creatinina___not___null;
    }
    public void setCreatinina___not___null(Boolean creatinina___not___null) {
        this.creatinina___not___null = creatinina___not___null;
    }

    public java.util.List<String> getCreatinina___in() {
        return creatinina___in;
    }
    public void setCreatinina___in(java.util.List<String> creatinina___in) {
        this.creatinina___in = creatinina___in;
    }

    public java.util.List<String> getCreatinina___not___in() {
        return creatinina___not___in;
    }
    public void setCreatinina___not___in(java.util.List<String> creatinina___not___in) {
        this.creatinina___not___in = creatinina___not___in;
    }

    public String getCreatinina___lt() {
        return creatinina___lt;
    }
    public void setCreatinina___lt(String creatinina___lt) {
        this.creatinina___lt = creatinina___lt;
    }

    public String getCreatinina___lte() {
        return creatinina___lte;
    }
    public void setCreatinina___lte(String creatinina___lte) {
        this.creatinina___lte = creatinina___lte;
    }

    public String getCreatinina___gt() {
        return creatinina___gt;
    }
    public void setCreatinina___gt(String creatinina___gt) {
        this.creatinina___gt = creatinina___gt;
    }

    public String getCreatinina___gte() {
        return creatinina___gte;
    }
    public void setCreatinina___gte(String creatinina___gte) {
        this.creatinina___gte = creatinina___gte;
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

    public String getData_campione___eq() {
        return data_campione___eq;
    }
    public void setData_campione___eq(String data_campione___eq) {
        this.data_campione___eq = data_campione___eq;
    }

    public String getData_campione___ne() {
        return data_campione___ne;
    }
    public void setData_campione___ne(String data_campione___ne) {
        this.data_campione___ne = data_campione___ne;
    }

    public Boolean getData_campione___null() {
        return data_campione___null;
    }
    public void setData_campione___null(Boolean data_campione___null) {
        this.data_campione___null = data_campione___null;
    }

    public Boolean getData_campione___not___null() {
        return data_campione___not___null;
    }
    public void setData_campione___not___null(Boolean data_campione___not___null) {
        this.data_campione___not___null = data_campione___not___null;
    }

    public java.util.List<String> getData_campione___in() {
        return data_campione___in;
    }
    public void setData_campione___in(java.util.List<String> data_campione___in) {
        this.data_campione___in = data_campione___in;
    }

    public java.util.List<String> getData_campione___not___in() {
        return data_campione___not___in;
    }
    public void setData_campione___not___in(java.util.List<String> data_campione___not___in) {
        this.data_campione___not___in = data_campione___not___in;
    }

    public String getData_campione___lt() {
        return data_campione___lt;
    }
    public void setData_campione___lt(String data_campione___lt) {
        this.data_campione___lt = data_campione___lt;
    }

    public String getData_campione___lte() {
        return data_campione___lte;
    }
    public void setData_campione___lte(String data_campione___lte) {
        this.data_campione___lte = data_campione___lte;
    }

    public String getData_campione___gt() {
        return data_campione___gt;
    }
    public void setData_campione___gt(String data_campione___gt) {
        this.data_campione___gt = data_campione___gt;
    }

    public String getData_campione___gte() {
        return data_campione___gte;
    }
    public void setData_campione___gte(String data_campione___gte) {
        this.data_campione___gte = data_campione___gte;
    }

    public String getData_presunta_parto___eq() {
        return data_presunta_parto___eq;
    }
    public void setData_presunta_parto___eq(String data_presunta_parto___eq) {
        this.data_presunta_parto___eq = data_presunta_parto___eq;
    }

    public String getData_presunta_parto___ne() {
        return data_presunta_parto___ne;
    }
    public void setData_presunta_parto___ne(String data_presunta_parto___ne) {
        this.data_presunta_parto___ne = data_presunta_parto___ne;
    }

    public Boolean getData_presunta_parto___null() {
        return data_presunta_parto___null;
    }
    public void setData_presunta_parto___null(Boolean data_presunta_parto___null) {
        this.data_presunta_parto___null = data_presunta_parto___null;
    }

    public Boolean getData_presunta_parto___not___null() {
        return data_presunta_parto___not___null;
    }
    public void setData_presunta_parto___not___null(Boolean data_presunta_parto___not___null) {
        this.data_presunta_parto___not___null = data_presunta_parto___not___null;
    }

    public java.util.List<String> getData_presunta_parto___in() {
        return data_presunta_parto___in;
    }
    public void setData_presunta_parto___in(java.util.List<String> data_presunta_parto___in) {
        this.data_presunta_parto___in = data_presunta_parto___in;
    }

    public java.util.List<String> getData_presunta_parto___not___in() {
        return data_presunta_parto___not___in;
    }
    public void setData_presunta_parto___not___in(java.util.List<String> data_presunta_parto___not___in) {
        this.data_presunta_parto___not___in = data_presunta_parto___not___in;
    }

    public String getData_presunta_parto___lt() {
        return data_presunta_parto___lt;
    }
    public void setData_presunta_parto___lt(String data_presunta_parto___lt) {
        this.data_presunta_parto___lt = data_presunta_parto___lt;
    }

    public String getData_presunta_parto___lte() {
        return data_presunta_parto___lte;
    }
    public void setData_presunta_parto___lte(String data_presunta_parto___lte) {
        this.data_presunta_parto___lte = data_presunta_parto___lte;
    }

    public String getData_presunta_parto___gt() {
        return data_presunta_parto___gt;
    }
    public void setData_presunta_parto___gt(String data_presunta_parto___gt) {
        this.data_presunta_parto___gt = data_presunta_parto___gt;
    }

    public String getData_presunta_parto___gte() {
        return data_presunta_parto___gte;
    }
    public void setData_presunta_parto___gte(String data_presunta_parto___gte) {
        this.data_presunta_parto___gte = data_presunta_parto___gte;
    }

    public String getData_questionario___eq() {
        return data_questionario___eq;
    }
    public void setData_questionario___eq(String data_questionario___eq) {
        this.data_questionario___eq = data_questionario___eq;
    }

    public String getData_questionario___ne() {
        return data_questionario___ne;
    }
    public void setData_questionario___ne(String data_questionario___ne) {
        this.data_questionario___ne = data_questionario___ne;
    }

    public Boolean getData_questionario___null() {
        return data_questionario___null;
    }
    public void setData_questionario___null(Boolean data_questionario___null) {
        this.data_questionario___null = data_questionario___null;
    }

    public Boolean getData_questionario___not___null() {
        return data_questionario___not___null;
    }
    public void setData_questionario___not___null(Boolean data_questionario___not___null) {
        this.data_questionario___not___null = data_questionario___not___null;
    }

    public java.util.List<String> getData_questionario___in() {
        return data_questionario___in;
    }
    public void setData_questionario___in(java.util.List<String> data_questionario___in) {
        this.data_questionario___in = data_questionario___in;
    }

    public java.util.List<String> getData_questionario___not___in() {
        return data_questionario___not___in;
    }
    public void setData_questionario___not___in(java.util.List<String> data_questionario___not___in) {
        this.data_questionario___not___in = data_questionario___not___in;
    }

    public String getData_questionario___lt() {
        return data_questionario___lt;
    }
    public void setData_questionario___lt(String data_questionario___lt) {
        this.data_questionario___lt = data_questionario___lt;
    }

    public String getData_questionario___lte() {
        return data_questionario___lte;
    }
    public void setData_questionario___lte(String data_questionario___lte) {
        this.data_questionario___lte = data_questionario___lte;
    }

    public String getData_questionario___gt() {
        return data_questionario___gt;
    }
    public void setData_questionario___gt(String data_questionario___gt) {
        this.data_questionario___gt = data_questionario___gt;
    }

    public String getData_questionario___gte() {
        return data_questionario___gte;
    }
    public void setData_questionario___gte(String data_questionario___gte) {
        this.data_questionario___gte = data_questionario___gte;
    }

    public Integer getDosi_omesse___eq() {
        return dosi_omesse___eq;
    }
    public void setDosi_omesse___eq(Integer dosi_omesse___eq) {
        this.dosi_omesse___eq = dosi_omesse___eq;
    }

    public Integer getDosi_omesse___ne() {
        return dosi_omesse___ne;
    }
    public void setDosi_omesse___ne(Integer dosi_omesse___ne) {
        this.dosi_omesse___ne = dosi_omesse___ne;
    }

    public Boolean getDosi_omesse___null() {
        return dosi_omesse___null;
    }
    public void setDosi_omesse___null(Boolean dosi_omesse___null) {
        this.dosi_omesse___null = dosi_omesse___null;
    }

    public Boolean getDosi_omesse___not___null() {
        return dosi_omesse___not___null;
    }
    public void setDosi_omesse___not___null(Boolean dosi_omesse___not___null) {
        this.dosi_omesse___not___null = dosi_omesse___not___null;
    }

    public java.util.List<Integer> getDosi_omesse___in() {
        return dosi_omesse___in;
    }
    public void setDosi_omesse___in(java.util.List<Integer> dosi_omesse___in) {
        this.dosi_omesse___in = dosi_omesse___in;
    }

    public java.util.List<Integer> getDosi_omesse___not___in() {
        return dosi_omesse___not___in;
    }
    public void setDosi_omesse___not___in(java.util.List<Integer> dosi_omesse___not___in) {
        this.dosi_omesse___not___in = dosi_omesse___not___in;
    }

    public Integer getDosi_omesse___lt() {
        return dosi_omesse___lt;
    }
    public void setDosi_omesse___lt(Integer dosi_omesse___lt) {
        this.dosi_omesse___lt = dosi_omesse___lt;
    }

    public Integer getDosi_omesse___lte() {
        return dosi_omesse___lte;
    }
    public void setDosi_omesse___lte(Integer dosi_omesse___lte) {
        this.dosi_omesse___lte = dosi_omesse___lte;
    }

    public Integer getDosi_omesse___gt() {
        return dosi_omesse___gt;
    }
    public void setDosi_omesse___gt(Integer dosi_omesse___gt) {
        this.dosi_omesse___gt = dosi_omesse___gt;
    }

    public Integer getDosi_omesse___gte() {
        return dosi_omesse___gte;
    }
    public void setDosi_omesse___gte(Integer dosi_omesse___gte) {
        this.dosi_omesse___gte = dosi_omesse___gte;
    }

    public String getEmoglobina___eq() {
        return emoglobina___eq;
    }
    public void setEmoglobina___eq(String emoglobina___eq) {
        this.emoglobina___eq = emoglobina___eq;
    }

    public String getEmoglobina___ne() {
        return emoglobina___ne;
    }
    public void setEmoglobina___ne(String emoglobina___ne) {
        this.emoglobina___ne = emoglobina___ne;
    }

    public Boolean getEmoglobina___null() {
        return emoglobina___null;
    }
    public void setEmoglobina___null(Boolean emoglobina___null) {
        this.emoglobina___null = emoglobina___null;
    }

    public Boolean getEmoglobina___not___null() {
        return emoglobina___not___null;
    }
    public void setEmoglobina___not___null(Boolean emoglobina___not___null) {
        this.emoglobina___not___null = emoglobina___not___null;
    }

    public java.util.List<String> getEmoglobina___in() {
        return emoglobina___in;
    }
    public void setEmoglobina___in(java.util.List<String> emoglobina___in) {
        this.emoglobina___in = emoglobina___in;
    }

    public java.util.List<String> getEmoglobina___not___in() {
        return emoglobina___not___in;
    }
    public void setEmoglobina___not___in(java.util.List<String> emoglobina___not___in) {
        this.emoglobina___not___in = emoglobina___not___in;
    }

    public String getEmoglobina___lt() {
        return emoglobina___lt;
    }
    public void setEmoglobina___lt(String emoglobina___lt) {
        this.emoglobina___lt = emoglobina___lt;
    }

    public String getEmoglobina___lte() {
        return emoglobina___lte;
    }
    public void setEmoglobina___lte(String emoglobina___lte) {
        this.emoglobina___lte = emoglobina___lte;
    }

    public String getEmoglobina___gt() {
        return emoglobina___gt;
    }
    public void setEmoglobina___gt(String emoglobina___gt) {
        this.emoglobina___gt = emoglobina___gt;
    }

    public String getEmoglobina___gte() {
        return emoglobina___gte;
    }
    public void setEmoglobina___gte(String emoglobina___gte) {
        this.emoglobina___gte = emoglobina___gte;
    }

    public String getEmoglobina_glicata___eq() {
        return emoglobina_glicata___eq;
    }
    public void setEmoglobina_glicata___eq(String emoglobina_glicata___eq) {
        this.emoglobina_glicata___eq = emoglobina_glicata___eq;
    }

    public String getEmoglobina_glicata___ne() {
        return emoglobina_glicata___ne;
    }
    public void setEmoglobina_glicata___ne(String emoglobina_glicata___ne) {
        this.emoglobina_glicata___ne = emoglobina_glicata___ne;
    }

    public Boolean getEmoglobina_glicata___null() {
        return emoglobina_glicata___null;
    }
    public void setEmoglobina_glicata___null(Boolean emoglobina_glicata___null) {
        this.emoglobina_glicata___null = emoglobina_glicata___null;
    }

    public Boolean getEmoglobina_glicata___not___null() {
        return emoglobina_glicata___not___null;
    }
    public void setEmoglobina_glicata___not___null(Boolean emoglobina_glicata___not___null) {
        this.emoglobina_glicata___not___null = emoglobina_glicata___not___null;
    }

    public java.util.List<String> getEmoglobina_glicata___in() {
        return emoglobina_glicata___in;
    }
    public void setEmoglobina_glicata___in(java.util.List<String> emoglobina_glicata___in) {
        this.emoglobina_glicata___in = emoglobina_glicata___in;
    }

    public java.util.List<String> getEmoglobina_glicata___not___in() {
        return emoglobina_glicata___not___in;
    }
    public void setEmoglobina_glicata___not___in(java.util.List<String> emoglobina_glicata___not___in) {
        this.emoglobina_glicata___not___in = emoglobina_glicata___not___in;
    }

    public String getEmoglobina_glicata___lt() {
        return emoglobina_glicata___lt;
    }
    public void setEmoglobina_glicata___lt(String emoglobina_glicata___lt) {
        this.emoglobina_glicata___lt = emoglobina_glicata___lt;
    }

    public String getEmoglobina_glicata___lte() {
        return emoglobina_glicata___lte;
    }
    public void setEmoglobina_glicata___lte(String emoglobina_glicata___lte) {
        this.emoglobina_glicata___lte = emoglobina_glicata___lte;
    }

    public String getEmoglobina_glicata___gt() {
        return emoglobina_glicata___gt;
    }
    public void setEmoglobina_glicata___gt(String emoglobina_glicata___gt) {
        this.emoglobina_glicata___gt = emoglobina_glicata___gt;
    }

    public String getEmoglobina_glicata___gte() {
        return emoglobina_glicata___gte;
    }
    public void setEmoglobina_glicata___gte(String emoglobina_glicata___gte) {
        this.emoglobina_glicata___gte = emoglobina_glicata___gte;
    }

    public String getFollowup_questionario___eq() {
        return followup_questionario___eq;
    }
    public void setFollowup_questionario___eq(String followup_questionario___eq) {
        this.followup_questionario___eq = followup_questionario___eq;
    }

    public String getFollowup_questionario___ne() {
        return followup_questionario___ne;
    }
    public void setFollowup_questionario___ne(String followup_questionario___ne) {
        this.followup_questionario___ne = followup_questionario___ne;
    }

    public Boolean getFollowup_questionario___null() {
        return followup_questionario___null;
    }
    public void setFollowup_questionario___null(Boolean followup_questionario___null) {
        this.followup_questionario___null = followup_questionario___null;
    }

    public Boolean getFollowup_questionario___not___null() {
        return followup_questionario___not___null;
    }
    public void setFollowup_questionario___not___null(Boolean followup_questionario___not___null) {
        this.followup_questionario___not___null = followup_questionario___not___null;
    }

    public java.util.List<String> getFollowup_questionario___in() {
        return followup_questionario___in;
    }
    public void setFollowup_questionario___in(java.util.List<String> followup_questionario___in) {
        this.followup_questionario___in = followup_questionario___in;
    }

    public java.util.List<String> getFollowup_questionario___not___in() {
        return followup_questionario___not___in;
    }
    public void setFollowup_questionario___not___in(java.util.List<String> followup_questionario___not___in) {
        this.followup_questionario___not___in = followup_questionario___not___in;
    }

    public String getFollowup_questionario___lt() {
        return followup_questionario___lt;
    }
    public void setFollowup_questionario___lt(String followup_questionario___lt) {
        this.followup_questionario___lt = followup_questionario___lt;
    }

    public String getFollowup_questionario___lte() {
        return followup_questionario___lte;
    }
    public void setFollowup_questionario___lte(String followup_questionario___lte) {
        this.followup_questionario___lte = followup_questionario___lte;
    }

    public String getFollowup_questionario___gt() {
        return followup_questionario___gt;
    }
    public void setFollowup_questionario___gt(String followup_questionario___gt) {
        this.followup_questionario___gt = followup_questionario___gt;
    }

    public String getFollowup_questionario___gte() {
        return followup_questionario___gte;
    }
    public void setFollowup_questionario___gte(String followup_questionario___gte) {
        this.followup_questionario___gte = followup_questionario___gte;
    }

    public String getFollowup_questionario___contains() {
        return followup_questionario___contains;
    }
    public void setFollowup_questionario___contains(String followup_questionario___contains) {
        this.followup_questionario___contains = followup_questionario___contains;
    }

    public String getFollowup_questionario___not___contains() {
        return followup_questionario___not___contains;
    }
    public void setFollowup_questionario___not___contains(String followup_questionario___not___contains) {
        this.followup_questionario___not___contains = followup_questionario___not___contains;
    }

    public String getFollowup_questionario___starts_with() {
        return followup_questionario___starts_with;
    }
    public void setFollowup_questionario___starts_with(String followup_questionario___starts_with) {
        this.followup_questionario___starts_with = followup_questionario___starts_with;
    }

    public String getFollowup_questionario___not___starts_with() {
        return followup_questionario___not___starts_with;
    }
    public void setFollowup_questionario___not___starts_with(String followup_questionario___not___starts_with) {
        this.followup_questionario___not___starts_with = followup_questionario___not___starts_with;
    }

    public String getFollowup_questionario___ends_with() {
        return followup_questionario___ends_with;
    }
    public void setFollowup_questionario___ends_with(String followup_questionario___ends_with) {
        this.followup_questionario___ends_with = followup_questionario___ends_with;
    }

    public String getFollowup_questionario___not___ends_with() {
        return followup_questionario___not___ends_with;
    }
    public void setFollowup_questionario___not___ends_with(String followup_questionario___not___ends_with) {
        this.followup_questionario___not___ends_with = followup_questionario___not___ends_with;
    }

    public Integer getFosfatasi_alcalina___eq() {
        return fosfatasi_alcalina___eq;
    }
    public void setFosfatasi_alcalina___eq(Integer fosfatasi_alcalina___eq) {
        this.fosfatasi_alcalina___eq = fosfatasi_alcalina___eq;
    }

    public Integer getFosfatasi_alcalina___ne() {
        return fosfatasi_alcalina___ne;
    }
    public void setFosfatasi_alcalina___ne(Integer fosfatasi_alcalina___ne) {
        this.fosfatasi_alcalina___ne = fosfatasi_alcalina___ne;
    }

    public Boolean getFosfatasi_alcalina___null() {
        return fosfatasi_alcalina___null;
    }
    public void setFosfatasi_alcalina___null(Boolean fosfatasi_alcalina___null) {
        this.fosfatasi_alcalina___null = fosfatasi_alcalina___null;
    }

    public Boolean getFosfatasi_alcalina___not___null() {
        return fosfatasi_alcalina___not___null;
    }
    public void setFosfatasi_alcalina___not___null(Boolean fosfatasi_alcalina___not___null) {
        this.fosfatasi_alcalina___not___null = fosfatasi_alcalina___not___null;
    }

    public java.util.List<Integer> getFosfatasi_alcalina___in() {
        return fosfatasi_alcalina___in;
    }
    public void setFosfatasi_alcalina___in(java.util.List<Integer> fosfatasi_alcalina___in) {
        this.fosfatasi_alcalina___in = fosfatasi_alcalina___in;
    }

    public java.util.List<Integer> getFosfatasi_alcalina___not___in() {
        return fosfatasi_alcalina___not___in;
    }
    public void setFosfatasi_alcalina___not___in(java.util.List<Integer> fosfatasi_alcalina___not___in) {
        this.fosfatasi_alcalina___not___in = fosfatasi_alcalina___not___in;
    }

    public Integer getFosfatasi_alcalina___lt() {
        return fosfatasi_alcalina___lt;
    }
    public void setFosfatasi_alcalina___lt(Integer fosfatasi_alcalina___lt) {
        this.fosfatasi_alcalina___lt = fosfatasi_alcalina___lt;
    }

    public Integer getFosfatasi_alcalina___lte() {
        return fosfatasi_alcalina___lte;
    }
    public void setFosfatasi_alcalina___lte(Integer fosfatasi_alcalina___lte) {
        this.fosfatasi_alcalina___lte = fosfatasi_alcalina___lte;
    }

    public Integer getFosfatasi_alcalina___gt() {
        return fosfatasi_alcalina___gt;
    }
    public void setFosfatasi_alcalina___gt(Integer fosfatasi_alcalina___gt) {
        this.fosfatasi_alcalina___gt = fosfatasi_alcalina___gt;
    }

    public Integer getFosfatasi_alcalina___gte() {
        return fosfatasi_alcalina___gte;
    }
    public void setFosfatasi_alcalina___gte(Integer fosfatasi_alcalina___gte) {
        this.fosfatasi_alcalina___gte = fosfatasi_alcalina___gte;
    }

    public String getFosforo___eq() {
        return fosforo___eq;
    }
    public void setFosforo___eq(String fosforo___eq) {
        this.fosforo___eq = fosforo___eq;
    }

    public String getFosforo___ne() {
        return fosforo___ne;
    }
    public void setFosforo___ne(String fosforo___ne) {
        this.fosforo___ne = fosforo___ne;
    }

    public Boolean getFosforo___null() {
        return fosforo___null;
    }
    public void setFosforo___null(Boolean fosforo___null) {
        this.fosforo___null = fosforo___null;
    }

    public Boolean getFosforo___not___null() {
        return fosforo___not___null;
    }
    public void setFosforo___not___null(Boolean fosforo___not___null) {
        this.fosforo___not___null = fosforo___not___null;
    }

    public java.util.List<String> getFosforo___in() {
        return fosforo___in;
    }
    public void setFosforo___in(java.util.List<String> fosforo___in) {
        this.fosforo___in = fosforo___in;
    }

    public java.util.List<String> getFosforo___not___in() {
        return fosforo___not___in;
    }
    public void setFosforo___not___in(java.util.List<String> fosforo___not___in) {
        this.fosforo___not___in = fosforo___not___in;
    }

    public String getFosforo___lt() {
        return fosforo___lt;
    }
    public void setFosforo___lt(String fosforo___lt) {
        this.fosforo___lt = fosforo___lt;
    }

    public String getFosforo___lte() {
        return fosforo___lte;
    }
    public void setFosforo___lte(String fosforo___lte) {
        this.fosforo___lte = fosforo___lte;
    }

    public String getFosforo___gt() {
        return fosforo___gt;
    }
    public void setFosforo___gt(String fosforo___gt) {
        this.fosforo___gt = fosforo___gt;
    }

    public String getFosforo___gte() {
        return fosforo___gte;
    }
    public void setFosforo___gte(String fosforo___gte) {
        this.fosforo___gte = fosforo___gte;
    }

    public String getFrequenza___eq() {
        return frequenza___eq;
    }
    public void setFrequenza___eq(String frequenza___eq) {
        this.frequenza___eq = frequenza___eq;
    }

    public String getFrequenza___ne() {
        return frequenza___ne;
    }
    public void setFrequenza___ne(String frequenza___ne) {
        this.frequenza___ne = frequenza___ne;
    }

    public Boolean getFrequenza___null() {
        return frequenza___null;
    }
    public void setFrequenza___null(Boolean frequenza___null) {
        this.frequenza___null = frequenza___null;
    }

    public Boolean getFrequenza___not___null() {
        return frequenza___not___null;
    }
    public void setFrequenza___not___null(Boolean frequenza___not___null) {
        this.frequenza___not___null = frequenza___not___null;
    }

    public java.util.List<String> getFrequenza___in() {
        return frequenza___in;
    }
    public void setFrequenza___in(java.util.List<String> frequenza___in) {
        this.frequenza___in = frequenza___in;
    }

    public java.util.List<String> getFrequenza___not___in() {
        return frequenza___not___in;
    }
    public void setFrequenza___not___in(java.util.List<String> frequenza___not___in) {
        this.frequenza___not___in = frequenza___not___in;
    }

    public String getFrequenza___lt() {
        return frequenza___lt;
    }
    public void setFrequenza___lt(String frequenza___lt) {
        this.frequenza___lt = frequenza___lt;
    }

    public String getFrequenza___lte() {
        return frequenza___lte;
    }
    public void setFrequenza___lte(String frequenza___lte) {
        this.frequenza___lte = frequenza___lte;
    }

    public String getFrequenza___gt() {
        return frequenza___gt;
    }
    public void setFrequenza___gt(String frequenza___gt) {
        this.frequenza___gt = frequenza___gt;
    }

    public String getFrequenza___gte() {
        return frequenza___gte;
    }
    public void setFrequenza___gte(String frequenza___gte) {
        this.frequenza___gte = frequenza___gte;
    }

    public String getFrequenza___contains() {
        return frequenza___contains;
    }
    public void setFrequenza___contains(String frequenza___contains) {
        this.frequenza___contains = frequenza___contains;
    }

    public String getFrequenza___not___contains() {
        return frequenza___not___contains;
    }
    public void setFrequenza___not___contains(String frequenza___not___contains) {
        this.frequenza___not___contains = frequenza___not___contains;
    }

    public String getFrequenza___starts_with() {
        return frequenza___starts_with;
    }
    public void setFrequenza___starts_with(String frequenza___starts_with) {
        this.frequenza___starts_with = frequenza___starts_with;
    }

    public String getFrequenza___not___starts_with() {
        return frequenza___not___starts_with;
    }
    public void setFrequenza___not___starts_with(String frequenza___not___starts_with) {
        this.frequenza___not___starts_with = frequenza___not___starts_with;
    }

    public String getFrequenza___ends_with() {
        return frequenza___ends_with;
    }
    public void setFrequenza___ends_with(String frequenza___ends_with) {
        this.frequenza___ends_with = frequenza___ends_with;
    }

    public String getFrequenza___not___ends_with() {
        return frequenza___not___ends_with;
    }
    public void setFrequenza___not___ends_with(String frequenza___not___ends_with) {
        this.frequenza___not___ends_with = frequenza___not___ends_with;
    }

    public Boolean getFumatore_attivo___eq() {
        return fumatore_attivo___eq;
    }
    public void setFumatore_attivo___eq(Boolean fumatore_attivo___eq) {
        this.fumatore_attivo___eq = fumatore_attivo___eq;
    }

    public Boolean getFumatore_attivo___ne() {
        return fumatore_attivo___ne;
    }
    public void setFumatore_attivo___ne(Boolean fumatore_attivo___ne) {
        this.fumatore_attivo___ne = fumatore_attivo___ne;
    }

    public Boolean getFumatore_attivo___null() {
        return fumatore_attivo___null;
    }
    public void setFumatore_attivo___null(Boolean fumatore_attivo___null) {
        this.fumatore_attivo___null = fumatore_attivo___null;
    }

    public Boolean getFumatore_attivo___not___null() {
        return fumatore_attivo___not___null;
    }
    public void setFumatore_attivo___not___null(Boolean fumatore_attivo___not___null) {
        this.fumatore_attivo___not___null = fumatore_attivo___not___null;
    }

    public Integer getGamma_gt___eq() {
        return gamma_gt___eq;
    }
    public void setGamma_gt___eq(Integer gamma_gt___eq) {
        this.gamma_gt___eq = gamma_gt___eq;
    }

    public Integer getGamma_gt___ne() {
        return gamma_gt___ne;
    }
    public void setGamma_gt___ne(Integer gamma_gt___ne) {
        this.gamma_gt___ne = gamma_gt___ne;
    }

    public Boolean getGamma_gt___null() {
        return gamma_gt___null;
    }
    public void setGamma_gt___null(Boolean gamma_gt___null) {
        this.gamma_gt___null = gamma_gt___null;
    }

    public Boolean getGamma_gt___not___null() {
        return gamma_gt___not___null;
    }
    public void setGamma_gt___not___null(Boolean gamma_gt___not___null) {
        this.gamma_gt___not___null = gamma_gt___not___null;
    }

    public java.util.List<Integer> getGamma_gt___in() {
        return gamma_gt___in;
    }
    public void setGamma_gt___in(java.util.List<Integer> gamma_gt___in) {
        this.gamma_gt___in = gamma_gt___in;
    }

    public java.util.List<Integer> getGamma_gt___not___in() {
        return gamma_gt___not___in;
    }
    public void setGamma_gt___not___in(java.util.List<Integer> gamma_gt___not___in) {
        this.gamma_gt___not___in = gamma_gt___not___in;
    }

    public Integer getGamma_gt___lt() {
        return gamma_gt___lt;
    }
    public void setGamma_gt___lt(Integer gamma_gt___lt) {
        this.gamma_gt___lt = gamma_gt___lt;
    }

    public Integer getGamma_gt___lte() {
        return gamma_gt___lte;
    }
    public void setGamma_gt___lte(Integer gamma_gt___lte) {
        this.gamma_gt___lte = gamma_gt___lte;
    }

    public Integer getGamma_gt___gt() {
        return gamma_gt___gt;
    }
    public void setGamma_gt___gt(Integer gamma_gt___gt) {
        this.gamma_gt___gt = gamma_gt___gt;
    }

    public Integer getGamma_gt___gte() {
        return gamma_gt___gte;
    }
    public void setGamma_gt___gte(Integer gamma_gt___gte) {
        this.gamma_gt___gte = gamma_gt___gte;
    }

    public Integer getGlicemia___eq() {
        return glicemia___eq;
    }
    public void setGlicemia___eq(Integer glicemia___eq) {
        this.glicemia___eq = glicemia___eq;
    }

    public Integer getGlicemia___ne() {
        return glicemia___ne;
    }
    public void setGlicemia___ne(Integer glicemia___ne) {
        this.glicemia___ne = glicemia___ne;
    }

    public Boolean getGlicemia___null() {
        return glicemia___null;
    }
    public void setGlicemia___null(Boolean glicemia___null) {
        this.glicemia___null = glicemia___null;
    }

    public Boolean getGlicemia___not___null() {
        return glicemia___not___null;
    }
    public void setGlicemia___not___null(Boolean glicemia___not___null) {
        this.glicemia___not___null = glicemia___not___null;
    }

    public java.util.List<Integer> getGlicemia___in() {
        return glicemia___in;
    }
    public void setGlicemia___in(java.util.List<Integer> glicemia___in) {
        this.glicemia___in = glicemia___in;
    }

    public java.util.List<Integer> getGlicemia___not___in() {
        return glicemia___not___in;
    }
    public void setGlicemia___not___in(java.util.List<Integer> glicemia___not___in) {
        this.glicemia___not___in = glicemia___not___in;
    }

    public Integer getGlicemia___lt() {
        return glicemia___lt;
    }
    public void setGlicemia___lt(Integer glicemia___lt) {
        this.glicemia___lt = glicemia___lt;
    }

    public Integer getGlicemia___lte() {
        return glicemia___lte;
    }
    public void setGlicemia___lte(Integer glicemia___lte) {
        this.glicemia___lte = glicemia___lte;
    }

    public Integer getGlicemia___gt() {
        return glicemia___gt;
    }
    public void setGlicemia___gt(Integer glicemia___gt) {
        this.glicemia___gt = glicemia___gt;
    }

    public Integer getGlicemia___gte() {
        return glicemia___gte;
    }
    public void setGlicemia___gte(Integer glicemia___gte) {
        this.glicemia___gte = glicemia___gte;
    }

    public Integer getGlobuli_bianchi___eq() {
        return globuli_bianchi___eq;
    }
    public void setGlobuli_bianchi___eq(Integer globuli_bianchi___eq) {
        this.globuli_bianchi___eq = globuli_bianchi___eq;
    }

    public Integer getGlobuli_bianchi___ne() {
        return globuli_bianchi___ne;
    }
    public void setGlobuli_bianchi___ne(Integer globuli_bianchi___ne) {
        this.globuli_bianchi___ne = globuli_bianchi___ne;
    }

    public Boolean getGlobuli_bianchi___null() {
        return globuli_bianchi___null;
    }
    public void setGlobuli_bianchi___null(Boolean globuli_bianchi___null) {
        this.globuli_bianchi___null = globuli_bianchi___null;
    }

    public Boolean getGlobuli_bianchi___not___null() {
        return globuli_bianchi___not___null;
    }
    public void setGlobuli_bianchi___not___null(Boolean globuli_bianchi___not___null) {
        this.globuli_bianchi___not___null = globuli_bianchi___not___null;
    }

    public java.util.List<Integer> getGlobuli_bianchi___in() {
        return globuli_bianchi___in;
    }
    public void setGlobuli_bianchi___in(java.util.List<Integer> globuli_bianchi___in) {
        this.globuli_bianchi___in = globuli_bianchi___in;
    }

    public java.util.List<Integer> getGlobuli_bianchi___not___in() {
        return globuli_bianchi___not___in;
    }
    public void setGlobuli_bianchi___not___in(java.util.List<Integer> globuli_bianchi___not___in) {
        this.globuli_bianchi___not___in = globuli_bianchi___not___in;
    }

    public Integer getGlobuli_bianchi___lt() {
        return globuli_bianchi___lt;
    }
    public void setGlobuli_bianchi___lt(Integer globuli_bianchi___lt) {
        this.globuli_bianchi___lt = globuli_bianchi___lt;
    }

    public Integer getGlobuli_bianchi___lte() {
        return globuli_bianchi___lte;
    }
    public void setGlobuli_bianchi___lte(Integer globuli_bianchi___lte) {
        this.globuli_bianchi___lte = globuli_bianchi___lte;
    }

    public Integer getGlobuli_bianchi___gt() {
        return globuli_bianchi___gt;
    }
    public void setGlobuli_bianchi___gt(Integer globuli_bianchi___gt) {
        this.globuli_bianchi___gt = globuli_bianchi___gt;
    }

    public Integer getGlobuli_bianchi___gte() {
        return globuli_bianchi___gte;
    }
    public void setGlobuli_bianchi___gte(Integer globuli_bianchi___gte) {
        this.globuli_bianchi___gte = globuli_bianchi___gte;
    }

    public Boolean getGravidanza___eq() {
        return gravidanza___eq;
    }
    public void setGravidanza___eq(Boolean gravidanza___eq) {
        this.gravidanza___eq = gravidanza___eq;
    }

    public Boolean getGravidanza___ne() {
        return gravidanza___ne;
    }
    public void setGravidanza___ne(Boolean gravidanza___ne) {
        this.gravidanza___ne = gravidanza___ne;
    }

    public Boolean getGravidanza___null() {
        return gravidanza___null;
    }
    public void setGravidanza___null(Boolean gravidanza___null) {
        this.gravidanza___null = gravidanza___null;
    }

    public Boolean getGravidanza___not___null() {
        return gravidanza___not___null;
    }
    public void setGravidanza___not___null(Boolean gravidanza___not___null) {
        this.gravidanza___not___null = gravidanza___not___null;
    }

    public Boolean getHavabtotali___eq() {
        return havabtotali___eq;
    }
    public void setHavabtotali___eq(Boolean havabtotali___eq) {
        this.havabtotali___eq = havabtotali___eq;
    }

    public Boolean getHavabtotali___ne() {
        return havabtotali___ne;
    }
    public void setHavabtotali___ne(Boolean havabtotali___ne) {
        this.havabtotali___ne = havabtotali___ne;
    }

    public Boolean getHavabtotali___null() {
        return havabtotali___null;
    }
    public void setHavabtotali___null(Boolean havabtotali___null) {
        this.havabtotali___null = havabtotali___null;
    }

    public Boolean getHavabtotali___not___null() {
        return havabtotali___not___null;
    }
    public void setHavabtotali___not___null(Boolean havabtotali___not___null) {
        this.havabtotali___not___null = havabtotali___not___null;
    }

    public Boolean getHavigm___eq() {
        return havigm___eq;
    }
    public void setHavigm___eq(Boolean havigm___eq) {
        this.havigm___eq = havigm___eq;
    }

    public Boolean getHavigm___ne() {
        return havigm___ne;
    }
    public void setHavigm___ne(Boolean havigm___ne) {
        this.havigm___ne = havigm___ne;
    }

    public Boolean getHavigm___null() {
        return havigm___null;
    }
    public void setHavigm___null(Boolean havigm___null) {
        this.havigm___null = havigm___null;
    }

    public Boolean getHavigm___not___null() {
        return havigm___not___null;
    }
    public void setHavigm___not___null(Boolean havigm___not___null) {
        this.havigm___not___null = havigm___not___null;
    }

    public Boolean getHbcab___eq() {
        return hbcab___eq;
    }
    public void setHbcab___eq(Boolean hbcab___eq) {
        this.hbcab___eq = hbcab___eq;
    }

    public Boolean getHbcab___ne() {
        return hbcab___ne;
    }
    public void setHbcab___ne(Boolean hbcab___ne) {
        this.hbcab___ne = hbcab___ne;
    }

    public Boolean getHbcab___null() {
        return hbcab___null;
    }
    public void setHbcab___null(Boolean hbcab___null) {
        this.hbcab___null = hbcab___null;
    }

    public Boolean getHbcab___not___null() {
        return hbcab___not___null;
    }
    public void setHbcab___not___null(Boolean hbcab___not___null) {
        this.hbcab___not___null = hbcab___not___null;
    }

    public Boolean getHbcigm___eq() {
        return hbcigm___eq;
    }
    public void setHbcigm___eq(Boolean hbcigm___eq) {
        this.hbcigm___eq = hbcigm___eq;
    }

    public Boolean getHbcigm___ne() {
        return hbcigm___ne;
    }
    public void setHbcigm___ne(Boolean hbcigm___ne) {
        this.hbcigm___ne = hbcigm___ne;
    }

    public Boolean getHbcigm___null() {
        return hbcigm___null;
    }
    public void setHbcigm___null(Boolean hbcigm___null) {
        this.hbcigm___null = hbcigm___null;
    }

    public Boolean getHbcigm___not___null() {
        return hbcigm___not___null;
    }
    public void setHbcigm___not___null(Boolean hbcigm___not___null) {
        this.hbcigm___not___null = hbcigm___not___null;
    }

    public Boolean getHbeab___eq() {
        return hbeab___eq;
    }
    public void setHbeab___eq(Boolean hbeab___eq) {
        this.hbeab___eq = hbeab___eq;
    }

    public Boolean getHbeab___ne() {
        return hbeab___ne;
    }
    public void setHbeab___ne(Boolean hbeab___ne) {
        this.hbeab___ne = hbeab___ne;
    }

    public Boolean getHbeab___null() {
        return hbeab___null;
    }
    public void setHbeab___null(Boolean hbeab___null) {
        this.hbeab___null = hbeab___null;
    }

    public Boolean getHbeab___not___null() {
        return hbeab___not___null;
    }
    public void setHbeab___not___null(Boolean hbeab___not___null) {
        this.hbeab___not___null = hbeab___not___null;
    }

    public Boolean getHbeag___eq() {
        return hbeag___eq;
    }
    public void setHbeag___eq(Boolean hbeag___eq) {
        this.hbeag___eq = hbeag___eq;
    }

    public Boolean getHbeag___ne() {
        return hbeag___ne;
    }
    public void setHbeag___ne(Boolean hbeag___ne) {
        this.hbeag___ne = hbeag___ne;
    }

    public Boolean getHbeag___null() {
        return hbeag___null;
    }
    public void setHbeag___null(Boolean hbeag___null) {
        this.hbeag___null = hbeag___null;
    }

    public Boolean getHbeag___not___null() {
        return hbeag___not___null;
    }
    public void setHbeag___not___null(Boolean hbeag___not___null) {
        this.hbeag___not___null = hbeag___not___null;
    }

    public Boolean getHbsab___eq() {
        return hbsab___eq;
    }
    public void setHbsab___eq(Boolean hbsab___eq) {
        this.hbsab___eq = hbsab___eq;
    }

    public Boolean getHbsab___ne() {
        return hbsab___ne;
    }
    public void setHbsab___ne(Boolean hbsab___ne) {
        this.hbsab___ne = hbsab___ne;
    }

    public Boolean getHbsab___null() {
        return hbsab___null;
    }
    public void setHbsab___null(Boolean hbsab___null) {
        this.hbsab___null = hbsab___null;
    }

    public Boolean getHbsab___not___null() {
        return hbsab___not___null;
    }
    public void setHbsab___not___null(Boolean hbsab___not___null) {
        this.hbsab___not___null = hbsab___not___null;
    }

    public String getHbsab_totali___eq() {
        return hbsab_totali___eq;
    }
    public void setHbsab_totali___eq(String hbsab_totali___eq) {
        this.hbsab_totali___eq = hbsab_totali___eq;
    }

    public String getHbsab_totali___ne() {
        return hbsab_totali___ne;
    }
    public void setHbsab_totali___ne(String hbsab_totali___ne) {
        this.hbsab_totali___ne = hbsab_totali___ne;
    }

    public Boolean getHbsab_totali___null() {
        return hbsab_totali___null;
    }
    public void setHbsab_totali___null(Boolean hbsab_totali___null) {
        this.hbsab_totali___null = hbsab_totali___null;
    }

    public Boolean getHbsab_totali___not___null() {
        return hbsab_totali___not___null;
    }
    public void setHbsab_totali___not___null(Boolean hbsab_totali___not___null) {
        this.hbsab_totali___not___null = hbsab_totali___not___null;
    }

    public java.util.List<String> getHbsab_totali___in() {
        return hbsab_totali___in;
    }
    public void setHbsab_totali___in(java.util.List<String> hbsab_totali___in) {
        this.hbsab_totali___in = hbsab_totali___in;
    }

    public java.util.List<String> getHbsab_totali___not___in() {
        return hbsab_totali___not___in;
    }
    public void setHbsab_totali___not___in(java.util.List<String> hbsab_totali___not___in) {
        this.hbsab_totali___not___in = hbsab_totali___not___in;
    }

    public String getHbsab_totali___lt() {
        return hbsab_totali___lt;
    }
    public void setHbsab_totali___lt(String hbsab_totali___lt) {
        this.hbsab_totali___lt = hbsab_totali___lt;
    }

    public String getHbsab_totali___lte() {
        return hbsab_totali___lte;
    }
    public void setHbsab_totali___lte(String hbsab_totali___lte) {
        this.hbsab_totali___lte = hbsab_totali___lte;
    }

    public String getHbsab_totali___gt() {
        return hbsab_totali___gt;
    }
    public void setHbsab_totali___gt(String hbsab_totali___gt) {
        this.hbsab_totali___gt = hbsab_totali___gt;
    }

    public String getHbsab_totali___gte() {
        return hbsab_totali___gte;
    }
    public void setHbsab_totali___gte(String hbsab_totali___gte) {
        this.hbsab_totali___gte = hbsab_totali___gte;
    }

    public Boolean getHbsag___eq() {
        return hbsag___eq;
    }
    public void setHbsag___eq(Boolean hbsag___eq) {
        this.hbsag___eq = hbsag___eq;
    }

    public Boolean getHbsag___ne() {
        return hbsag___ne;
    }
    public void setHbsag___ne(Boolean hbsag___ne) {
        this.hbsag___ne = hbsag___ne;
    }

    public Boolean getHbsag___null() {
        return hbsag___null;
    }
    public void setHbsag___null(Boolean hbsag___null) {
        this.hbsag___null = hbsag___null;
    }

    public Boolean getHbsag___not___null() {
        return hbsag___not___null;
    }
    public void setHbsag___not___null(Boolean hbsag___not___null) {
        this.hbsag___not___null = hbsag___not___null;
    }

    public String getHbsag_totali___eq() {
        return hbsag_totali___eq;
    }
    public void setHbsag_totali___eq(String hbsag_totali___eq) {
        this.hbsag_totali___eq = hbsag_totali___eq;
    }

    public String getHbsag_totali___ne() {
        return hbsag_totali___ne;
    }
    public void setHbsag_totali___ne(String hbsag_totali___ne) {
        this.hbsag_totali___ne = hbsag_totali___ne;
    }

    public Boolean getHbsag_totali___null() {
        return hbsag_totali___null;
    }
    public void setHbsag_totali___null(Boolean hbsag_totali___null) {
        this.hbsag_totali___null = hbsag_totali___null;
    }

    public Boolean getHbsag_totali___not___null() {
        return hbsag_totali___not___null;
    }
    public void setHbsag_totali___not___null(Boolean hbsag_totali___not___null) {
        this.hbsag_totali___not___null = hbsag_totali___not___null;
    }

    public java.util.List<String> getHbsag_totali___in() {
        return hbsag_totali___in;
    }
    public void setHbsag_totali___in(java.util.List<String> hbsag_totali___in) {
        this.hbsag_totali___in = hbsag_totali___in;
    }

    public java.util.List<String> getHbsag_totali___not___in() {
        return hbsag_totali___not___in;
    }
    public void setHbsag_totali___not___in(java.util.List<String> hbsag_totali___not___in) {
        this.hbsag_totali___not___in = hbsag_totali___not___in;
    }

    public String getHbsag_totali___lt() {
        return hbsag_totali___lt;
    }
    public void setHbsag_totali___lt(String hbsag_totali___lt) {
        this.hbsag_totali___lt = hbsag_totali___lt;
    }

    public String getHbsag_totali___lte() {
        return hbsag_totali___lte;
    }
    public void setHbsag_totali___lte(String hbsag_totali___lte) {
        this.hbsag_totali___lte = hbsag_totali___lte;
    }

    public String getHbsag_totali___gt() {
        return hbsag_totali___gt;
    }
    public void setHbsag_totali___gt(String hbsag_totali___gt) {
        this.hbsag_totali___gt = hbsag_totali___gt;
    }

    public String getHbsag_totali___gte() {
        return hbsag_totali___gte;
    }
    public void setHbsag_totali___gte(String hbsag_totali___gte) {
        this.hbsag_totali___gte = hbsag_totali___gte;
    }

    public Boolean getHcvab___eq() {
        return hcvab___eq;
    }
    public void setHcvab___eq(Boolean hcvab___eq) {
        this.hcvab___eq = hcvab___eq;
    }

    public Boolean getHcvab___ne() {
        return hcvab___ne;
    }
    public void setHcvab___ne(Boolean hcvab___ne) {
        this.hcvab___ne = hcvab___ne;
    }

    public Boolean getHcvab___null() {
        return hcvab___null;
    }
    public void setHcvab___null(Boolean hcvab___null) {
        this.hcvab___null = hcvab___null;
    }

    public Boolean getHcvab___not___null() {
        return hcvab___not___null;
    }
    public void setHcvab___not___null(Boolean hcvab___not___null) {
        this.hcvab___not___null = hcvab___not___null;
    }

    public Boolean getHcvag___eq() {
        return hcvag___eq;
    }
    public void setHcvag___eq(Boolean hcvag___eq) {
        this.hcvag___eq = hcvag___eq;
    }

    public Boolean getHcvag___ne() {
        return hcvag___ne;
    }
    public void setHcvag___ne(Boolean hcvag___ne) {
        this.hcvag___ne = hcvag___ne;
    }

    public Boolean getHcvag___null() {
        return hcvag___null;
    }
    public void setHcvag___null(Boolean hcvag___null) {
        this.hcvag___null = hcvag___null;
    }

    public Boolean getHcvag___not___null() {
        return hcvag___not___null;
    }
    public void setHcvag___not___null(Boolean hcvag___not___null) {
        this.hcvag___not___null = hcvag___not___null;
    }

    public Boolean getHdvab___eq() {
        return hdvab___eq;
    }
    public void setHdvab___eq(Boolean hdvab___eq) {
        this.hdvab___eq = hdvab___eq;
    }

    public Boolean getHdvab___ne() {
        return hdvab___ne;
    }
    public void setHdvab___ne(Boolean hdvab___ne) {
        this.hdvab___ne = hdvab___ne;
    }

    public Boolean getHdvab___null() {
        return hdvab___null;
    }
    public void setHdvab___null(Boolean hdvab___null) {
        this.hdvab___null = hdvab___null;
    }

    public Boolean getHdvab___not___null() {
        return hdvab___not___null;
    }
    public void setHdvab___not___null(Boolean hdvab___not___null) {
        this.hdvab___not___null = hdvab___not___null;
    }

    public Boolean getHdvab_igg___eq() {
        return hdvab_igg___eq;
    }
    public void setHdvab_igg___eq(Boolean hdvab_igg___eq) {
        this.hdvab_igg___eq = hdvab_igg___eq;
    }

    public Boolean getHdvab_igg___ne() {
        return hdvab_igg___ne;
    }
    public void setHdvab_igg___ne(Boolean hdvab_igg___ne) {
        this.hdvab_igg___ne = hdvab_igg___ne;
    }

    public Boolean getHdvab_igg___null() {
        return hdvab_igg___null;
    }
    public void setHdvab_igg___null(Boolean hdvab_igg___null) {
        this.hdvab_igg___null = hdvab_igg___null;
    }

    public Boolean getHdvab_igg___not___null() {
        return hdvab_igg___not___null;
    }
    public void setHdvab_igg___not___null(Boolean hdvab_igg___not___null) {
        this.hdvab_igg___not___null = hdvab_igg___not___null;
    }

    public Boolean getHdvabigm___eq() {
        return hdvabigm___eq;
    }
    public void setHdvabigm___eq(Boolean hdvabigm___eq) {
        this.hdvabigm___eq = hdvabigm___eq;
    }

    public Boolean getHdvabigm___ne() {
        return hdvabigm___ne;
    }
    public void setHdvabigm___ne(Boolean hdvabigm___ne) {
        this.hdvabigm___ne = hdvabigm___ne;
    }

    public Boolean getHdvabigm___null() {
        return hdvabigm___null;
    }
    public void setHdvabigm___null(Boolean hdvabigm___null) {
        this.hdvabigm___null = hdvabigm___null;
    }

    public Boolean getHdvabigm___not___null() {
        return hdvabigm___not___null;
    }
    public void setHdvabigm___not___null(Boolean hdvabigm___not___null) {
        this.hdvabigm___not___null = hdvabigm___not___null;
    }

    public String getHdvabtotali___eq() {
        return hdvabtotali___eq;
    }
    public void setHdvabtotali___eq(String hdvabtotali___eq) {
        this.hdvabtotali___eq = hdvabtotali___eq;
    }

    public String getHdvabtotali___ne() {
        return hdvabtotali___ne;
    }
    public void setHdvabtotali___ne(String hdvabtotali___ne) {
        this.hdvabtotali___ne = hdvabtotali___ne;
    }

    public Boolean getHdvabtotali___null() {
        return hdvabtotali___null;
    }
    public void setHdvabtotali___null(Boolean hdvabtotali___null) {
        this.hdvabtotali___null = hdvabtotali___null;
    }

    public Boolean getHdvabtotali___not___null() {
        return hdvabtotali___not___null;
    }
    public void setHdvabtotali___not___null(Boolean hdvabtotali___not___null) {
        this.hdvabtotali___not___null = hdvabtotali___not___null;
    }

    public java.util.List<String> getHdvabtotali___in() {
        return hdvabtotali___in;
    }
    public void setHdvabtotali___in(java.util.List<String> hdvabtotali___in) {
        this.hdvabtotali___in = hdvabtotali___in;
    }

    public java.util.List<String> getHdvabtotali___not___in() {
        return hdvabtotali___not___in;
    }
    public void setHdvabtotali___not___in(java.util.List<String> hdvabtotali___not___in) {
        this.hdvabtotali___not___in = hdvabtotali___not___in;
    }

    public String getHdvabtotali___lt() {
        return hdvabtotali___lt;
    }
    public void setHdvabtotali___lt(String hdvabtotali___lt) {
        this.hdvabtotali___lt = hdvabtotali___lt;
    }

    public String getHdvabtotali___lte() {
        return hdvabtotali___lte;
    }
    public void setHdvabtotali___lte(String hdvabtotali___lte) {
        this.hdvabtotali___lte = hdvabtotali___lte;
    }

    public String getHdvabtotali___gt() {
        return hdvabtotali___gt;
    }
    public void setHdvabtotali___gt(String hdvabtotali___gt) {
        this.hdvabtotali___gt = hdvabtotali___gt;
    }

    public String getHdvabtotali___gte() {
        return hdvabtotali___gte;
    }
    public void setHdvabtotali___gte(String hdvabtotali___gte) {
        this.hdvabtotali___gte = hdvabtotali___gte;
    }

    public Boolean getInterruzioni___eq() {
        return interruzioni___eq;
    }
    public void setInterruzioni___eq(Boolean interruzioni___eq) {
        this.interruzioni___eq = interruzioni___eq;
    }

    public Boolean getInterruzioni___ne() {
        return interruzioni___ne;
    }
    public void setInterruzioni___ne(Boolean interruzioni___ne) {
        this.interruzioni___ne = interruzioni___ne;
    }

    public Boolean getInterruzioni___null() {
        return interruzioni___null;
    }
    public void setInterruzioni___null(Boolean interruzioni___null) {
        this.interruzioni___null = interruzioni___null;
    }

    public Boolean getInterruzioni___not___null() {
        return interruzioni___not___null;
    }
    public void setInterruzioni___not___null(Boolean interruzioni___not___null) {
        this.interruzioni___not___null = interruzioni___not___null;
    }

    public String getMdw___eq() {
        return mdw___eq;
    }
    public void setMdw___eq(String mdw___eq) {
        this.mdw___eq = mdw___eq;
    }

    public String getMdw___ne() {
        return mdw___ne;
    }
    public void setMdw___ne(String mdw___ne) {
        this.mdw___ne = mdw___ne;
    }

    public Boolean getMdw___null() {
        return mdw___null;
    }
    public void setMdw___null(Boolean mdw___null) {
        this.mdw___null = mdw___null;
    }

    public Boolean getMdw___not___null() {
        return mdw___not___null;
    }
    public void setMdw___not___null(Boolean mdw___not___null) {
        this.mdw___not___null = mdw___not___null;
    }

    public java.util.List<String> getMdw___in() {
        return mdw___in;
    }
    public void setMdw___in(java.util.List<String> mdw___in) {
        this.mdw___in = mdw___in;
    }

    public java.util.List<String> getMdw___not___in() {
        return mdw___not___in;
    }
    public void setMdw___not___in(java.util.List<String> mdw___not___in) {
        this.mdw___not___in = mdw___not___in;
    }

    public String getMdw___lt() {
        return mdw___lt;
    }
    public void setMdw___lt(String mdw___lt) {
        this.mdw___lt = mdw___lt;
    }

    public String getMdw___lte() {
        return mdw___lte;
    }
    public void setMdw___lte(String mdw___lte) {
        this.mdw___lte = mdw___lte;
    }

    public String getMdw___gt() {
        return mdw___gt;
    }
    public void setMdw___gt(String mdw___gt) {
        this.mdw___gt = mdw___gt;
    }

    public String getMdw___gte() {
        return mdw___gte;
    }
    public void setMdw___gte(String mdw___gte) {
        this.mdw___gte = mdw___gte;
    }

    public String getMetodica_vitamina_D_2___eq() {
        return metodica_vitamina_D_2___eq;
    }
    public void setMetodica_vitamina_D_2___eq(String metodica_vitamina_D_2___eq) {
        this.metodica_vitamina_D_2___eq = metodica_vitamina_D_2___eq;
    }

    public String getMetodica_vitamina_D_2___ne() {
        return metodica_vitamina_D_2___ne;
    }
    public void setMetodica_vitamina_D_2___ne(String metodica_vitamina_D_2___ne) {
        this.metodica_vitamina_D_2___ne = metodica_vitamina_D_2___ne;
    }

    public Boolean getMetodica_vitamina_D_2___null() {
        return metodica_vitamina_D_2___null;
    }
    public void setMetodica_vitamina_D_2___null(Boolean metodica_vitamina_D_2___null) {
        this.metodica_vitamina_D_2___null = metodica_vitamina_D_2___null;
    }

    public Boolean getMetodica_vitamina_D_2___not___null() {
        return metodica_vitamina_D_2___not___null;
    }
    public void setMetodica_vitamina_D_2___not___null(Boolean metodica_vitamina_D_2___not___null) {
        this.metodica_vitamina_D_2___not___null = metodica_vitamina_D_2___not___null;
    }

    public java.util.List<String> getMetodica_vitamina_D_2___in() {
        return metodica_vitamina_D_2___in;
    }
    public void setMetodica_vitamina_D_2___in(java.util.List<String> metodica_vitamina_D_2___in) {
        this.metodica_vitamina_D_2___in = metodica_vitamina_D_2___in;
    }

    public java.util.List<String> getMetodica_vitamina_D_2___not___in() {
        return metodica_vitamina_D_2___not___in;
    }
    public void setMetodica_vitamina_D_2___not___in(java.util.List<String> metodica_vitamina_D_2___not___in) {
        this.metodica_vitamina_D_2___not___in = metodica_vitamina_D_2___not___in;
    }

    public String getMetodica_vitamina_D_2___lt() {
        return metodica_vitamina_D_2___lt;
    }
    public void setMetodica_vitamina_D_2___lt(String metodica_vitamina_D_2___lt) {
        this.metodica_vitamina_D_2___lt = metodica_vitamina_D_2___lt;
    }

    public String getMetodica_vitamina_D_2___lte() {
        return metodica_vitamina_D_2___lte;
    }
    public void setMetodica_vitamina_D_2___lte(String metodica_vitamina_D_2___lte) {
        this.metodica_vitamina_D_2___lte = metodica_vitamina_D_2___lte;
    }

    public String getMetodica_vitamina_D_2___gt() {
        return metodica_vitamina_D_2___gt;
    }
    public void setMetodica_vitamina_D_2___gt(String metodica_vitamina_D_2___gt) {
        this.metodica_vitamina_D_2___gt = metodica_vitamina_D_2___gt;
    }

    public String getMetodica_vitamina_D_2___gte() {
        return metodica_vitamina_D_2___gte;
    }
    public void setMetodica_vitamina_D_2___gte(String metodica_vitamina_D_2___gte) {
        this.metodica_vitamina_D_2___gte = metodica_vitamina_D_2___gte;
    }

    public String getMetodica_vitamina_D_2___contains() {
        return metodica_vitamina_D_2___contains;
    }
    public void setMetodica_vitamina_D_2___contains(String metodica_vitamina_D_2___contains) {
        this.metodica_vitamina_D_2___contains = metodica_vitamina_D_2___contains;
    }

    public String getMetodica_vitamina_D_2___not___contains() {
        return metodica_vitamina_D_2___not___contains;
    }
    public void setMetodica_vitamina_D_2___not___contains(String metodica_vitamina_D_2___not___contains) {
        this.metodica_vitamina_D_2___not___contains = metodica_vitamina_D_2___not___contains;
    }

    public String getMetodica_vitamina_D_2___starts_with() {
        return metodica_vitamina_D_2___starts_with;
    }
    public void setMetodica_vitamina_D_2___starts_with(String metodica_vitamina_D_2___starts_with) {
        this.metodica_vitamina_D_2___starts_with = metodica_vitamina_D_2___starts_with;
    }

    public String getMetodica_vitamina_D_2___not___starts_with() {
        return metodica_vitamina_D_2___not___starts_with;
    }
    public void setMetodica_vitamina_D_2___not___starts_with(String metodica_vitamina_D_2___not___starts_with) {
        this.metodica_vitamina_D_2___not___starts_with = metodica_vitamina_D_2___not___starts_with;
    }

    public String getMetodica_vitamina_D_2___ends_with() {
        return metodica_vitamina_D_2___ends_with;
    }
    public void setMetodica_vitamina_D_2___ends_with(String metodica_vitamina_D_2___ends_with) {
        this.metodica_vitamina_D_2___ends_with = metodica_vitamina_D_2___ends_with;
    }

    public String getMetodica_vitamina_D_2___not___ends_with() {
        return metodica_vitamina_D_2___not___ends_with;
    }
    public void setMetodica_vitamina_D_2___not___ends_with(String metodica_vitamina_D_2___not___ends_with) {
        this.metodica_vitamina_D_2___not___ends_with = metodica_vitamina_D_2___not___ends_with;
    }

    public Integer getMonociti___eq() {
        return monociti___eq;
    }
    public void setMonociti___eq(Integer monociti___eq) {
        this.monociti___eq = monociti___eq;
    }

    public Integer getMonociti___ne() {
        return monociti___ne;
    }
    public void setMonociti___ne(Integer monociti___ne) {
        this.monociti___ne = monociti___ne;
    }

    public Boolean getMonociti___null() {
        return monociti___null;
    }
    public void setMonociti___null(Boolean monociti___null) {
        this.monociti___null = monociti___null;
    }

    public Boolean getMonociti___not___null() {
        return monociti___not___null;
    }
    public void setMonociti___not___null(Boolean monociti___not___null) {
        this.monociti___not___null = monociti___not___null;
    }

    public java.util.List<Integer> getMonociti___in() {
        return monociti___in;
    }
    public void setMonociti___in(java.util.List<Integer> monociti___in) {
        this.monociti___in = monociti___in;
    }

    public java.util.List<Integer> getMonociti___not___in() {
        return monociti___not___in;
    }
    public void setMonociti___not___in(java.util.List<Integer> monociti___not___in) {
        this.monociti___not___in = monociti___not___in;
    }

    public Integer getMonociti___lt() {
        return monociti___lt;
    }
    public void setMonociti___lt(Integer monociti___lt) {
        this.monociti___lt = monociti___lt;
    }

    public Integer getMonociti___lte() {
        return monociti___lte;
    }
    public void setMonociti___lte(Integer monociti___lte) {
        this.monociti___lte = monociti___lte;
    }

    public Integer getMonociti___gt() {
        return monociti___gt;
    }
    public void setMonociti___gt(Integer monociti___gt) {
        this.monociti___gt = monociti___gt;
    }

    public Integer getMonociti___gte() {
        return monociti___gte;
    }
    public void setMonociti___gte(Integer monociti___gte) {
        this.monociti___gte = monociti___gte;
    }

    public Boolean getNon_trepon___eq() {
        return non_trepon___eq;
    }
    public void setNon_trepon___eq(Boolean non_trepon___eq) {
        this.non_trepon___eq = non_trepon___eq;
    }

    public Boolean getNon_trepon___ne() {
        return non_trepon___ne;
    }
    public void setNon_trepon___ne(Boolean non_trepon___ne) {
        this.non_trepon___ne = non_trepon___ne;
    }

    public Boolean getNon_trepon___null() {
        return non_trepon___null;
    }
    public void setNon_trepon___null(Boolean non_trepon___null) {
        this.non_trepon___null = non_trepon___null;
    }

    public Boolean getNon_trepon___not___null() {
        return non_trepon___not___null;
    }
    public void setNon_trepon___not___null(Boolean non_trepon___not___null) {
        this.non_trepon___not___null = non_trepon___not___null;
    }

    public Integer getNr_neutrofili___eq() {
        return nr_neutrofili___eq;
    }
    public void setNr_neutrofili___eq(Integer nr_neutrofili___eq) {
        this.nr_neutrofili___eq = nr_neutrofili___eq;
    }

    public Integer getNr_neutrofili___ne() {
        return nr_neutrofili___ne;
    }
    public void setNr_neutrofili___ne(Integer nr_neutrofili___ne) {
        this.nr_neutrofili___ne = nr_neutrofili___ne;
    }

    public Boolean getNr_neutrofili___null() {
        return nr_neutrofili___null;
    }
    public void setNr_neutrofili___null(Boolean nr_neutrofili___null) {
        this.nr_neutrofili___null = nr_neutrofili___null;
    }

    public Boolean getNr_neutrofili___not___null() {
        return nr_neutrofili___not___null;
    }
    public void setNr_neutrofili___not___null(Boolean nr_neutrofili___not___null) {
        this.nr_neutrofili___not___null = nr_neutrofili___not___null;
    }

    public java.util.List<Integer> getNr_neutrofili___in() {
        return nr_neutrofili___in;
    }
    public void setNr_neutrofili___in(java.util.List<Integer> nr_neutrofili___in) {
        this.nr_neutrofili___in = nr_neutrofili___in;
    }

    public java.util.List<Integer> getNr_neutrofili___not___in() {
        return nr_neutrofili___not___in;
    }
    public void setNr_neutrofili___not___in(java.util.List<Integer> nr_neutrofili___not___in) {
        this.nr_neutrofili___not___in = nr_neutrofili___not___in;
    }

    public Integer getNr_neutrofili___lt() {
        return nr_neutrofili___lt;
    }
    public void setNr_neutrofili___lt(Integer nr_neutrofili___lt) {
        this.nr_neutrofili___lt = nr_neutrofili___lt;
    }

    public Integer getNr_neutrofili___lte() {
        return nr_neutrofili___lte;
    }
    public void setNr_neutrofili___lte(Integer nr_neutrofili___lte) {
        this.nr_neutrofili___lte = nr_neutrofili___lte;
    }

    public Integer getNr_neutrofili___gt() {
        return nr_neutrofili___gt;
    }
    public void setNr_neutrofili___gt(Integer nr_neutrofili___gt) {
        this.nr_neutrofili___gt = nr_neutrofili___gt;
    }

    public Integer getNr_neutrofili___gte() {
        return nr_neutrofili___gte;
    }
    public void setNr_neutrofili___gte(Integer nr_neutrofili___gte) {
        this.nr_neutrofili___gte = nr_neutrofili___gte;
    }

    public Boolean getOmissione___eq() {
        return omissione___eq;
    }
    public void setOmissione___eq(Boolean omissione___eq) {
        this.omissione___eq = omissione___eq;
    }

    public Boolean getOmissione___ne() {
        return omissione___ne;
    }
    public void setOmissione___ne(Boolean omissione___ne) {
        this.omissione___ne = omissione___ne;
    }

    public Boolean getOmissione___null() {
        return omissione___null;
    }
    public void setOmissione___null(Boolean omissione___null) {
        this.omissione___null = omissione___null;
    }

    public Boolean getOmissione___not___null() {
        return omissione___not___null;
    }
    public void setOmissione___not___null(Boolean omissione___not___null) {
        this.omissione___not___null = omissione___not___null;
    }

    public Integer getPa_max___eq() {
        return pa_max___eq;
    }
    public void setPa_max___eq(Integer pa_max___eq) {
        this.pa_max___eq = pa_max___eq;
    }

    public Integer getPa_max___ne() {
        return pa_max___ne;
    }
    public void setPa_max___ne(Integer pa_max___ne) {
        this.pa_max___ne = pa_max___ne;
    }

    public Boolean getPa_max___null() {
        return pa_max___null;
    }
    public void setPa_max___null(Boolean pa_max___null) {
        this.pa_max___null = pa_max___null;
    }

    public Boolean getPa_max___not___null() {
        return pa_max___not___null;
    }
    public void setPa_max___not___null(Boolean pa_max___not___null) {
        this.pa_max___not___null = pa_max___not___null;
    }

    public java.util.List<Integer> getPa_max___in() {
        return pa_max___in;
    }
    public void setPa_max___in(java.util.List<Integer> pa_max___in) {
        this.pa_max___in = pa_max___in;
    }

    public java.util.List<Integer> getPa_max___not___in() {
        return pa_max___not___in;
    }
    public void setPa_max___not___in(java.util.List<Integer> pa_max___not___in) {
        this.pa_max___not___in = pa_max___not___in;
    }

    public Integer getPa_max___lt() {
        return pa_max___lt;
    }
    public void setPa_max___lt(Integer pa_max___lt) {
        this.pa_max___lt = pa_max___lt;
    }

    public Integer getPa_max___lte() {
        return pa_max___lte;
    }
    public void setPa_max___lte(Integer pa_max___lte) {
        this.pa_max___lte = pa_max___lte;
    }

    public Integer getPa_max___gt() {
        return pa_max___gt;
    }
    public void setPa_max___gt(Integer pa_max___gt) {
        this.pa_max___gt = pa_max___gt;
    }

    public Integer getPa_max___gte() {
        return pa_max___gte;
    }
    public void setPa_max___gte(Integer pa_max___gte) {
        this.pa_max___gte = pa_max___gte;
    }

    public Integer getPa_min___eq() {
        return pa_min___eq;
    }
    public void setPa_min___eq(Integer pa_min___eq) {
        this.pa_min___eq = pa_min___eq;
    }

    public Integer getPa_min___ne() {
        return pa_min___ne;
    }
    public void setPa_min___ne(Integer pa_min___ne) {
        this.pa_min___ne = pa_min___ne;
    }

    public Boolean getPa_min___null() {
        return pa_min___null;
    }
    public void setPa_min___null(Boolean pa_min___null) {
        this.pa_min___null = pa_min___null;
    }

    public Boolean getPa_min___not___null() {
        return pa_min___not___null;
    }
    public void setPa_min___not___null(Boolean pa_min___not___null) {
        this.pa_min___not___null = pa_min___not___null;
    }

    public java.util.List<Integer> getPa_min___in() {
        return pa_min___in;
    }
    public void setPa_min___in(java.util.List<Integer> pa_min___in) {
        this.pa_min___in = pa_min___in;
    }

    public java.util.List<Integer> getPa_min___not___in() {
        return pa_min___not___in;
    }
    public void setPa_min___not___in(java.util.List<Integer> pa_min___not___in) {
        this.pa_min___not___in = pa_min___not___in;
    }

    public Integer getPa_min___lt() {
        return pa_min___lt;
    }
    public void setPa_min___lt(Integer pa_min___lt) {
        this.pa_min___lt = pa_min___lt;
    }

    public Integer getPa_min___lte() {
        return pa_min___lte;
    }
    public void setPa_min___lte(Integer pa_min___lte) {
        this.pa_min___lte = pa_min___lte;
    }

    public Integer getPa_min___gt() {
        return pa_min___gt;
    }
    public void setPa_min___gt(Integer pa_min___gt) {
        this.pa_min___gt = pa_min___gt;
    }

    public Integer getPa_min___gte() {
        return pa_min___gte;
    }
    public void setPa_min___gte(Integer pa_min___gte) {
        this.pa_min___gte = pa_min___gte;
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

    public String getPeso___eq() {
        return peso___eq;
    }
    public void setPeso___eq(String peso___eq) {
        this.peso___eq = peso___eq;
    }

    public String getPeso___ne() {
        return peso___ne;
    }
    public void setPeso___ne(String peso___ne) {
        this.peso___ne = peso___ne;
    }

    public Boolean getPeso___null() {
        return peso___null;
    }
    public void setPeso___null(Boolean peso___null) {
        this.peso___null = peso___null;
    }

    public Boolean getPeso___not___null() {
        return peso___not___null;
    }
    public void setPeso___not___null(Boolean peso___not___null) {
        this.peso___not___null = peso___not___null;
    }

    public java.util.List<String> getPeso___in() {
        return peso___in;
    }
    public void setPeso___in(java.util.List<String> peso___in) {
        this.peso___in = peso___in;
    }

    public java.util.List<String> getPeso___not___in() {
        return peso___not___in;
    }
    public void setPeso___not___in(java.util.List<String> peso___not___in) {
        this.peso___not___in = peso___not___in;
    }

    public String getPeso___lt() {
        return peso___lt;
    }
    public void setPeso___lt(String peso___lt) {
        this.peso___lt = peso___lt;
    }

    public String getPeso___lte() {
        return peso___lte;
    }
    public void setPeso___lte(String peso___lte) {
        this.peso___lte = peso___lte;
    }

    public String getPeso___gt() {
        return peso___gt;
    }
    public void setPeso___gt(String peso___gt) {
        this.peso___gt = peso___gt;
    }

    public String getPeso___gte() {
        return peso___gte;
    }
    public void setPeso___gte(String peso___gte) {
        this.peso___gte = peso___gte;
    }

    public Integer getPiastrine___eq() {
        return piastrine___eq;
    }
    public void setPiastrine___eq(Integer piastrine___eq) {
        this.piastrine___eq = piastrine___eq;
    }

    public Integer getPiastrine___ne() {
        return piastrine___ne;
    }
    public void setPiastrine___ne(Integer piastrine___ne) {
        this.piastrine___ne = piastrine___ne;
    }

    public Boolean getPiastrine___null() {
        return piastrine___null;
    }
    public void setPiastrine___null(Boolean piastrine___null) {
        this.piastrine___null = piastrine___null;
    }

    public Boolean getPiastrine___not___null() {
        return piastrine___not___null;
    }
    public void setPiastrine___not___null(Boolean piastrine___not___null) {
        this.piastrine___not___null = piastrine___not___null;
    }

    public java.util.List<Integer> getPiastrine___in() {
        return piastrine___in;
    }
    public void setPiastrine___in(java.util.List<Integer> piastrine___in) {
        this.piastrine___in = piastrine___in;
    }

    public java.util.List<Integer> getPiastrine___not___in() {
        return piastrine___not___in;
    }
    public void setPiastrine___not___in(java.util.List<Integer> piastrine___not___in) {
        this.piastrine___not___in = piastrine___not___in;
    }

    public Integer getPiastrine___lt() {
        return piastrine___lt;
    }
    public void setPiastrine___lt(Integer piastrine___lt) {
        this.piastrine___lt = piastrine___lt;
    }

    public Integer getPiastrine___lte() {
        return piastrine___lte;
    }
    public void setPiastrine___lte(Integer piastrine___lte) {
        this.piastrine___lte = piastrine___lte;
    }

    public Integer getPiastrine___gt() {
        return piastrine___gt;
    }
    public void setPiastrine___gt(Integer piastrine___gt) {
        this.piastrine___gt = piastrine___gt;
    }

    public Integer getPiastrine___gte() {
        return piastrine___gte;
    }
    public void setPiastrine___gte(Integer piastrine___gte) {
        this.piastrine___gte = piastrine___gte;
    }

    public String getProteinuria___eq() {
        return proteinuria___eq;
    }
    public void setProteinuria___eq(String proteinuria___eq) {
        this.proteinuria___eq = proteinuria___eq;
    }

    public String getProteinuria___ne() {
        return proteinuria___ne;
    }
    public void setProteinuria___ne(String proteinuria___ne) {
        this.proteinuria___ne = proteinuria___ne;
    }

    public Boolean getProteinuria___null() {
        return proteinuria___null;
    }
    public void setProteinuria___null(Boolean proteinuria___null) {
        this.proteinuria___null = proteinuria___null;
    }

    public Boolean getProteinuria___not___null() {
        return proteinuria___not___null;
    }
    public void setProteinuria___not___null(Boolean proteinuria___not___null) {
        this.proteinuria___not___null = proteinuria___not___null;
    }

    public java.util.List<String> getProteinuria___in() {
        return proteinuria___in;
    }
    public void setProteinuria___in(java.util.List<String> proteinuria___in) {
        this.proteinuria___in = proteinuria___in;
    }

    public java.util.List<String> getProteinuria___not___in() {
        return proteinuria___not___in;
    }
    public void setProteinuria___not___in(java.util.List<String> proteinuria___not___in) {
        this.proteinuria___not___in = proteinuria___not___in;
    }

    public String getProteinuria___lt() {
        return proteinuria___lt;
    }
    public void setProteinuria___lt(String proteinuria___lt) {
        this.proteinuria___lt = proteinuria___lt;
    }

    public String getProteinuria___lte() {
        return proteinuria___lte;
    }
    public void setProteinuria___lte(String proteinuria___lte) {
        this.proteinuria___lte = proteinuria___lte;
    }

    public String getProteinuria___gt() {
        return proteinuria___gt;
    }
    public void setProteinuria___gt(String proteinuria___gt) {
        this.proteinuria___gt = proteinuria___gt;
    }

    public String getProteinuria___gte() {
        return proteinuria___gte;
    }
    public void setProteinuria___gte(String proteinuria___gte) {
        this.proteinuria___gte = proteinuria___gte;
    }

    public Boolean getQuestionario_str___eq() {
        return questionario_str___eq;
    }
    public void setQuestionario_str___eq(Boolean questionario_str___eq) {
        this.questionario_str___eq = questionario_str___eq;
    }

    public Boolean getQuestionario_str___ne() {
        return questionario_str___ne;
    }
    public void setQuestionario_str___ne(Boolean questionario_str___ne) {
        this.questionario_str___ne = questionario_str___ne;
    }

    public Boolean getQuestionario_str___null() {
        return questionario_str___null;
    }
    public void setQuestionario_str___null(Boolean questionario_str___null) {
        this.questionario_str___null = questionario_str___null;
    }

    public Boolean getQuestionario_str___not___null() {
        return questionario_str___not___null;
    }
    public void setQuestionario_str___not___null(Boolean questionario_str___not___null) {
        this.questionario_str___not___null = questionario_str___not___null;
    }

    public String getSesso_ok___eq() {
        return sesso_ok___eq;
    }
    public void setSesso_ok___eq(String sesso_ok___eq) {
        this.sesso_ok___eq = sesso_ok___eq;
    }

    public String getSesso_ok___ne() {
        return sesso_ok___ne;
    }
    public void setSesso_ok___ne(String sesso_ok___ne) {
        this.sesso_ok___ne = sesso_ok___ne;
    }

    public Boolean getSesso_ok___null() {
        return sesso_ok___null;
    }
    public void setSesso_ok___null(Boolean sesso_ok___null) {
        this.sesso_ok___null = sesso_ok___null;
    }

    public Boolean getSesso_ok___not___null() {
        return sesso_ok___not___null;
    }
    public void setSesso_ok___not___null(Boolean sesso_ok___not___null) {
        this.sesso_ok___not___null = sesso_ok___not___null;
    }

    public java.util.List<String> getSesso_ok___in() {
        return sesso_ok___in;
    }
    public void setSesso_ok___in(java.util.List<String> sesso_ok___in) {
        this.sesso_ok___in = sesso_ok___in;
    }

    public java.util.List<String> getSesso_ok___not___in() {
        return sesso_ok___not___in;
    }
    public void setSesso_ok___not___in(java.util.List<String> sesso_ok___not___in) {
        this.sesso_ok___not___in = sesso_ok___not___in;
    }

    public String getSesso_ok___lt() {
        return sesso_ok___lt;
    }
    public void setSesso_ok___lt(String sesso_ok___lt) {
        this.sesso_ok___lt = sesso_ok___lt;
    }

    public String getSesso_ok___lte() {
        return sesso_ok___lte;
    }
    public void setSesso_ok___lte(String sesso_ok___lte) {
        this.sesso_ok___lte = sesso_ok___lte;
    }

    public String getSesso_ok___gt() {
        return sesso_ok___gt;
    }
    public void setSesso_ok___gt(String sesso_ok___gt) {
        this.sesso_ok___gt = sesso_ok___gt;
    }

    public String getSesso_ok___gte() {
        return sesso_ok___gte;
    }
    public void setSesso_ok___gte(String sesso_ok___gte) {
        this.sesso_ok___gte = sesso_ok___gte;
    }

    public String getSesso_ok___contains() {
        return sesso_ok___contains;
    }
    public void setSesso_ok___contains(String sesso_ok___contains) {
        this.sesso_ok___contains = sesso_ok___contains;
    }

    public String getSesso_ok___not___contains() {
        return sesso_ok___not___contains;
    }
    public void setSesso_ok___not___contains(String sesso_ok___not___contains) {
        this.sesso_ok___not___contains = sesso_ok___not___contains;
    }

    public String getSesso_ok___starts_with() {
        return sesso_ok___starts_with;
    }
    public void setSesso_ok___starts_with(String sesso_ok___starts_with) {
        this.sesso_ok___starts_with = sesso_ok___starts_with;
    }

    public String getSesso_ok___not___starts_with() {
        return sesso_ok___not___starts_with;
    }
    public void setSesso_ok___not___starts_with(String sesso_ok___not___starts_with) {
        this.sesso_ok___not___starts_with = sesso_ok___not___starts_with;
    }

    public String getSesso_ok___ends_with() {
        return sesso_ok___ends_with;
    }
    public void setSesso_ok___ends_with(String sesso_ok___ends_with) {
        this.sesso_ok___ends_with = sesso_ok___ends_with;
    }

    public String getSesso_ok___not___ends_with() {
        return sesso_ok___not___ends_with;
    }
    public void setSesso_ok___not___ends_with(String sesso_ok___not___ends_with) {
        this.sesso_ok___not___ends_with = sesso_ok___not___ends_with;
    }

    public Integer getSuperalcolici___eq() {
        return superalcolici___eq;
    }
    public void setSuperalcolici___eq(Integer superalcolici___eq) {
        this.superalcolici___eq = superalcolici___eq;
    }

    public Integer getSuperalcolici___ne() {
        return superalcolici___ne;
    }
    public void setSuperalcolici___ne(Integer superalcolici___ne) {
        this.superalcolici___ne = superalcolici___ne;
    }

    public Boolean getSuperalcolici___null() {
        return superalcolici___null;
    }
    public void setSuperalcolici___null(Boolean superalcolici___null) {
        this.superalcolici___null = superalcolici___null;
    }

    public Boolean getSuperalcolici___not___null() {
        return superalcolici___not___null;
    }
    public void setSuperalcolici___not___null(Boolean superalcolici___not___null) {
        this.superalcolici___not___null = superalcolici___not___null;
    }

    public java.util.List<Integer> getSuperalcolici___in() {
        return superalcolici___in;
    }
    public void setSuperalcolici___in(java.util.List<Integer> superalcolici___in) {
        this.superalcolici___in = superalcolici___in;
    }

    public java.util.List<Integer> getSuperalcolici___not___in() {
        return superalcolici___not___in;
    }
    public void setSuperalcolici___not___in(java.util.List<Integer> superalcolici___not___in) {
        this.superalcolici___not___in = superalcolici___not___in;
    }

    public Integer getSuperalcolici___lt() {
        return superalcolici___lt;
    }
    public void setSuperalcolici___lt(Integer superalcolici___lt) {
        this.superalcolici___lt = superalcolici___lt;
    }

    public Integer getSuperalcolici___lte() {
        return superalcolici___lte;
    }
    public void setSuperalcolici___lte(Integer superalcolici___lte) {
        this.superalcolici___lte = superalcolici___lte;
    }

    public Integer getSuperalcolici___gt() {
        return superalcolici___gt;
    }
    public void setSuperalcolici___gt(Integer superalcolici___gt) {
        this.superalcolici___gt = superalcolici___gt;
    }

    public Integer getSuperalcolici___gte() {
        return superalcolici___gte;
    }
    public void setSuperalcolici___gte(Integer superalcolici___gte) {
        this.superalcolici___gte = superalcolici___gte;
    }

    public Boolean getTossicodip_attivo___eq() {
        return tossicodip_attivo___eq;
    }
    public void setTossicodip_attivo___eq(Boolean tossicodip_attivo___eq) {
        this.tossicodip_attivo___eq = tossicodip_attivo___eq;
    }

    public Boolean getTossicodip_attivo___ne() {
        return tossicodip_attivo___ne;
    }
    public void setTossicodip_attivo___ne(Boolean tossicodip_attivo___ne) {
        this.tossicodip_attivo___ne = tossicodip_attivo___ne;
    }

    public Boolean getTossicodip_attivo___null() {
        return tossicodip_attivo___null;
    }
    public void setTossicodip_attivo___null(Boolean tossicodip_attivo___null) {
        this.tossicodip_attivo___null = tossicodip_attivo___null;
    }

    public Boolean getTossicodip_attivo___not___null() {
        return tossicodip_attivo___not___null;
    }
    public void setTossicodip_attivo___not___null(Boolean tossicodip_attivo___not___null) {
        this.tossicodip_attivo___not___null = tossicodip_attivo___not___null;
    }

    public Boolean getToxoigg___eq() {
        return toxoigg___eq;
    }
    public void setToxoigg___eq(Boolean toxoigg___eq) {
        this.toxoigg___eq = toxoigg___eq;
    }

    public Boolean getToxoigg___ne() {
        return toxoigg___ne;
    }
    public void setToxoigg___ne(Boolean toxoigg___ne) {
        this.toxoigg___ne = toxoigg___ne;
    }

    public Boolean getToxoigg___null() {
        return toxoigg___null;
    }
    public void setToxoigg___null(Boolean toxoigg___null) {
        this.toxoigg___null = toxoigg___null;
    }

    public Boolean getToxoigg___not___null() {
        return toxoigg___not___null;
    }
    public void setToxoigg___not___null(Boolean toxoigg___not___null) {
        this.toxoigg___not___null = toxoigg___not___null;
    }

    public Boolean getTrepon___eq() {
        return trepon___eq;
    }
    public void setTrepon___eq(Boolean trepon___eq) {
        this.trepon___eq = trepon___eq;
    }

    public Boolean getTrepon___ne() {
        return trepon___ne;
    }
    public void setTrepon___ne(Boolean trepon___ne) {
        this.trepon___ne = trepon___ne;
    }

    public Boolean getTrepon___null() {
        return trepon___null;
    }
    public void setTrepon___null(Boolean trepon___null) {
        this.trepon___null = trepon___null;
    }

    public Boolean getTrepon___not___null() {
        return trepon___not___null;
    }
    public void setTrepon___not___null(Boolean trepon___not___null) {
        this.trepon___not___null = trepon___not___null;
    }

    public Integer getTrigliceridi___eq() {
        return trigliceridi___eq;
    }
    public void setTrigliceridi___eq(Integer trigliceridi___eq) {
        this.trigliceridi___eq = trigliceridi___eq;
    }

    public Integer getTrigliceridi___ne() {
        return trigliceridi___ne;
    }
    public void setTrigliceridi___ne(Integer trigliceridi___ne) {
        this.trigliceridi___ne = trigliceridi___ne;
    }

    public Boolean getTrigliceridi___null() {
        return trigliceridi___null;
    }
    public void setTrigliceridi___null(Boolean trigliceridi___null) {
        this.trigliceridi___null = trigliceridi___null;
    }

    public Boolean getTrigliceridi___not___null() {
        return trigliceridi___not___null;
    }
    public void setTrigliceridi___not___null(Boolean trigliceridi___not___null) {
        this.trigliceridi___not___null = trigliceridi___not___null;
    }

    public java.util.List<Integer> getTrigliceridi___in() {
        return trigliceridi___in;
    }
    public void setTrigliceridi___in(java.util.List<Integer> trigliceridi___in) {
        this.trigliceridi___in = trigliceridi___in;
    }

    public java.util.List<Integer> getTrigliceridi___not___in() {
        return trigliceridi___not___in;
    }
    public void setTrigliceridi___not___in(java.util.List<Integer> trigliceridi___not___in) {
        this.trigliceridi___not___in = trigliceridi___not___in;
    }

    public Integer getTrigliceridi___lt() {
        return trigliceridi___lt;
    }
    public void setTrigliceridi___lt(Integer trigliceridi___lt) {
        this.trigliceridi___lt = trigliceridi___lt;
    }

    public Integer getTrigliceridi___lte() {
        return trigliceridi___lte;
    }
    public void setTrigliceridi___lte(Integer trigliceridi___lte) {
        this.trigliceridi___lte = trigliceridi___lte;
    }

    public Integer getTrigliceridi___gt() {
        return trigliceridi___gt;
    }
    public void setTrigliceridi___gt(Integer trigliceridi___gt) {
        this.trigliceridi___gt = trigliceridi___gt;
    }

    public Integer getTrigliceridi___gte() {
        return trigliceridi___gte;
    }
    public void setTrigliceridi___gte(Integer trigliceridi___gte) {
        this.trigliceridi___gte = trigliceridi___gte;
    }

    public String getUnita_vitamina_D___eq() {
        return unita_vitamina_D___eq;
    }
    public void setUnita_vitamina_D___eq(String unita_vitamina_D___eq) {
        this.unita_vitamina_D___eq = unita_vitamina_D___eq;
    }

    public String getUnita_vitamina_D___ne() {
        return unita_vitamina_D___ne;
    }
    public void setUnita_vitamina_D___ne(String unita_vitamina_D___ne) {
        this.unita_vitamina_D___ne = unita_vitamina_D___ne;
    }

    public Boolean getUnita_vitamina_D___null() {
        return unita_vitamina_D___null;
    }
    public void setUnita_vitamina_D___null(Boolean unita_vitamina_D___null) {
        this.unita_vitamina_D___null = unita_vitamina_D___null;
    }

    public Boolean getUnita_vitamina_D___not___null() {
        return unita_vitamina_D___not___null;
    }
    public void setUnita_vitamina_D___not___null(Boolean unita_vitamina_D___not___null) {
        this.unita_vitamina_D___not___null = unita_vitamina_D___not___null;
    }

    public java.util.List<String> getUnita_vitamina_D___in() {
        return unita_vitamina_D___in;
    }
    public void setUnita_vitamina_D___in(java.util.List<String> unita_vitamina_D___in) {
        this.unita_vitamina_D___in = unita_vitamina_D___in;
    }

    public java.util.List<String> getUnita_vitamina_D___not___in() {
        return unita_vitamina_D___not___in;
    }
    public void setUnita_vitamina_D___not___in(java.util.List<String> unita_vitamina_D___not___in) {
        this.unita_vitamina_D___not___in = unita_vitamina_D___not___in;
    }

    public String getUnita_vitamina_D___lt() {
        return unita_vitamina_D___lt;
    }
    public void setUnita_vitamina_D___lt(String unita_vitamina_D___lt) {
        this.unita_vitamina_D___lt = unita_vitamina_D___lt;
    }

    public String getUnita_vitamina_D___lte() {
        return unita_vitamina_D___lte;
    }
    public void setUnita_vitamina_D___lte(String unita_vitamina_D___lte) {
        this.unita_vitamina_D___lte = unita_vitamina_D___lte;
    }

    public String getUnita_vitamina_D___gt() {
        return unita_vitamina_D___gt;
    }
    public void setUnita_vitamina_D___gt(String unita_vitamina_D___gt) {
        this.unita_vitamina_D___gt = unita_vitamina_D___gt;
    }

    public String getUnita_vitamina_D___gte() {
        return unita_vitamina_D___gte;
    }
    public void setUnita_vitamina_D___gte(String unita_vitamina_D___gte) {
        this.unita_vitamina_D___gte = unita_vitamina_D___gte;
    }

    public String getUnita_vitamina_D___contains() {
        return unita_vitamina_D___contains;
    }
    public void setUnita_vitamina_D___contains(String unita_vitamina_D___contains) {
        this.unita_vitamina_D___contains = unita_vitamina_D___contains;
    }

    public String getUnita_vitamina_D___not___contains() {
        return unita_vitamina_D___not___contains;
    }
    public void setUnita_vitamina_D___not___contains(String unita_vitamina_D___not___contains) {
        this.unita_vitamina_D___not___contains = unita_vitamina_D___not___contains;
    }

    public String getUnita_vitamina_D___starts_with() {
        return unita_vitamina_D___starts_with;
    }
    public void setUnita_vitamina_D___starts_with(String unita_vitamina_D___starts_with) {
        this.unita_vitamina_D___starts_with = unita_vitamina_D___starts_with;
    }

    public String getUnita_vitamina_D___not___starts_with() {
        return unita_vitamina_D___not___starts_with;
    }
    public void setUnita_vitamina_D___not___starts_with(String unita_vitamina_D___not___starts_with) {
        this.unita_vitamina_D___not___starts_with = unita_vitamina_D___not___starts_with;
    }

    public String getUnita_vitamina_D___ends_with() {
        return unita_vitamina_D___ends_with;
    }
    public void setUnita_vitamina_D___ends_with(String unita_vitamina_D___ends_with) {
        this.unita_vitamina_D___ends_with = unita_vitamina_D___ends_with;
    }

    public String getUnita_vitamina_D___not___ends_with() {
        return unita_vitamina_D___not___ends_with;
    }
    public void setUnita_vitamina_D___not___ends_with(String unita_vitamina_D___not___ends_with) {
        this.unita_vitamina_D___not___ends_with = unita_vitamina_D___not___ends_with;
    }

    public String getVas___eq() {
        return vas___eq;
    }
    public void setVas___eq(String vas___eq) {
        this.vas___eq = vas___eq;
    }

    public String getVas___ne() {
        return vas___ne;
    }
    public void setVas___ne(String vas___ne) {
        this.vas___ne = vas___ne;
    }

    public Boolean getVas___null() {
        return vas___null;
    }
    public void setVas___null(Boolean vas___null) {
        this.vas___null = vas___null;
    }

    public Boolean getVas___not___null() {
        return vas___not___null;
    }
    public void setVas___not___null(Boolean vas___not___null) {
        this.vas___not___null = vas___not___null;
    }

    public java.util.List<String> getVas___in() {
        return vas___in;
    }
    public void setVas___in(java.util.List<String> vas___in) {
        this.vas___in = vas___in;
    }

    public java.util.List<String> getVas___not___in() {
        return vas___not___in;
    }
    public void setVas___not___in(java.util.List<String> vas___not___in) {
        this.vas___not___in = vas___not___in;
    }

    public String getVas___lt() {
        return vas___lt;
    }
    public void setVas___lt(String vas___lt) {
        this.vas___lt = vas___lt;
    }

    public String getVas___lte() {
        return vas___lte;
    }
    public void setVas___lte(String vas___lte) {
        this.vas___lte = vas___lte;
    }

    public String getVas___gt() {
        return vas___gt;
    }
    public void setVas___gt(String vas___gt) {
        this.vas___gt = vas___gt;
    }

    public String getVas___gte() {
        return vas___gte;
    }
    public void setVas___gte(String vas___gte) {
        this.vas___gte = vas___gte;
    }

    public String getVas_globale___eq() {
        return vas_globale___eq;
    }
    public void setVas_globale___eq(String vas_globale___eq) {
        this.vas_globale___eq = vas_globale___eq;
    }

    public String getVas_globale___ne() {
        return vas_globale___ne;
    }
    public void setVas_globale___ne(String vas_globale___ne) {
        this.vas_globale___ne = vas_globale___ne;
    }

    public Boolean getVas_globale___null() {
        return vas_globale___null;
    }
    public void setVas_globale___null(Boolean vas_globale___null) {
        this.vas_globale___null = vas_globale___null;
    }

    public Boolean getVas_globale___not___null() {
        return vas_globale___not___null;
    }
    public void setVas_globale___not___null(Boolean vas_globale___not___null) {
        this.vas_globale___not___null = vas_globale___not___null;
    }

    public java.util.List<String> getVas_globale___in() {
        return vas_globale___in;
    }
    public void setVas_globale___in(java.util.List<String> vas_globale___in) {
        this.vas_globale___in = vas_globale___in;
    }

    public java.util.List<String> getVas_globale___not___in() {
        return vas_globale___not___in;
    }
    public void setVas_globale___not___in(java.util.List<String> vas_globale___not___in) {
        this.vas_globale___not___in = vas_globale___not___in;
    }

    public String getVas_globale___lt() {
        return vas_globale___lt;
    }
    public void setVas_globale___lt(String vas_globale___lt) {
        this.vas_globale___lt = vas_globale___lt;
    }

    public String getVas_globale___lte() {
        return vas_globale___lte;
    }
    public void setVas_globale___lte(String vas_globale___lte) {
        this.vas_globale___lte = vas_globale___lte;
    }

    public String getVas_globale___gt() {
        return vas_globale___gt;
    }
    public void setVas_globale___gt(String vas_globale___gt) {
        this.vas_globale___gt = vas_globale___gt;
    }

    public String getVas_globale___gte() {
        return vas_globale___gte;
    }
    public void setVas_globale___gte(String vas_globale___gte) {
        this.vas_globale___gte = vas_globale___gte;
    }

    public Integer getVino___eq() {
        return vino___eq;
    }
    public void setVino___eq(Integer vino___eq) {
        this.vino___eq = vino___eq;
    }

    public Integer getVino___ne() {
        return vino___ne;
    }
    public void setVino___ne(Integer vino___ne) {
        this.vino___ne = vino___ne;
    }

    public Boolean getVino___null() {
        return vino___null;
    }
    public void setVino___null(Boolean vino___null) {
        this.vino___null = vino___null;
    }

    public Boolean getVino___not___null() {
        return vino___not___null;
    }
    public void setVino___not___null(Boolean vino___not___null) {
        this.vino___not___null = vino___not___null;
    }

    public java.util.List<Integer> getVino___in() {
        return vino___in;
    }
    public void setVino___in(java.util.List<Integer> vino___in) {
        this.vino___in = vino___in;
    }

    public java.util.List<Integer> getVino___not___in() {
        return vino___not___in;
    }
    public void setVino___not___in(java.util.List<Integer> vino___not___in) {
        this.vino___not___in = vino___not___in;
    }

    public Integer getVino___lt() {
        return vino___lt;
    }
    public void setVino___lt(Integer vino___lt) {
        this.vino___lt = vino___lt;
    }

    public Integer getVino___lte() {
        return vino___lte;
    }
    public void setVino___lte(Integer vino___lte) {
        this.vino___lte = vino___lte;
    }

    public Integer getVino___gt() {
        return vino___gt;
    }
    public void setVino___gt(Integer vino___gt) {
        this.vino___gt = vino___gt;
    }

    public Integer getVino___gte() {
        return vino___gte;
    }
    public void setVino___gte(Integer vino___gte) {
        this.vino___gte = vino___gte;
    }

    public String getVitamina_D___eq() {
        return vitamina_D___eq;
    }
    public void setVitamina_D___eq(String vitamina_D___eq) {
        this.vitamina_D___eq = vitamina_D___eq;
    }

    public String getVitamina_D___ne() {
        return vitamina_D___ne;
    }
    public void setVitamina_D___ne(String vitamina_D___ne) {
        this.vitamina_D___ne = vitamina_D___ne;
    }

    public Boolean getVitamina_D___null() {
        return vitamina_D___null;
    }
    public void setVitamina_D___null(Boolean vitamina_D___null) {
        this.vitamina_D___null = vitamina_D___null;
    }

    public Boolean getVitamina_D___not___null() {
        return vitamina_D___not___null;
    }
    public void setVitamina_D___not___null(Boolean vitamina_D___not___null) {
        this.vitamina_D___not___null = vitamina_D___not___null;
    }

    public java.util.List<String> getVitamina_D___in() {
        return vitamina_D___in;
    }
    public void setVitamina_D___in(java.util.List<String> vitamina_D___in) {
        this.vitamina_D___in = vitamina_D___in;
    }

    public java.util.List<String> getVitamina_D___not___in() {
        return vitamina_D___not___in;
    }
    public void setVitamina_D___not___in(java.util.List<String> vitamina_D___not___in) {
        this.vitamina_D___not___in = vitamina_D___not___in;
    }

    public String getVitamina_D___lt() {
        return vitamina_D___lt;
    }
    public void setVitamina_D___lt(String vitamina_D___lt) {
        this.vitamina_D___lt = vitamina_D___lt;
    }

    public String getVitamina_D___lte() {
        return vitamina_D___lte;
    }
    public void setVitamina_D___lte(String vitamina_D___lte) {
        this.vitamina_D___lte = vitamina_D___lte;
    }

    public String getVitamina_D___gt() {
        return vitamina_D___gt;
    }
    public void setVitamina_D___gt(String vitamina_D___gt) {
        this.vitamina_D___gt = vitamina_D___gt;
    }

    public String getVitamina_D___gte() {
        return vitamina_D___gte;
    }
    public void setVitamina_D___gte(String vitamina_D___gte) {
        this.vitamina_D___gte = vitamina_D___gte;
    }

    public java.util.List<CliControllo_clinicoFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliControllo_clinicoFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliControllo_clinicoFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliControllo_clinicoFilterDTO> OR) {
        this.OR = OR;
    }

    public CliControllo_clinicoFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliControllo_clinicoFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (ALT___eq != null) {
            joiner.add("ALT___eq: " + GraphQLRequestSerializer.getEntry(ALT___eq));
        }
        if (ALT___ne != null) {
            joiner.add("ALT___ne: " + GraphQLRequestSerializer.getEntry(ALT___ne));
        }
        if (ALT___null != null) {
            joiner.add("ALT___null: " + GraphQLRequestSerializer.getEntry(ALT___null));
        }
        if (ALT___not___null != null) {
            joiner.add("ALT___not___null: " + GraphQLRequestSerializer.getEntry(ALT___not___null));
        }
        if (ALT___in != null) {
            joiner.add("ALT___in: " + GraphQLRequestSerializer.getEntry(ALT___in));
        }
        if (ALT___not___in != null) {
            joiner.add("ALT___not___in: " + GraphQLRequestSerializer.getEntry(ALT___not___in));
        }
        if (ALT___lt != null) {
            joiner.add("ALT___lt: " + GraphQLRequestSerializer.getEntry(ALT___lt));
        }
        if (ALT___lte != null) {
            joiner.add("ALT___lte: " + GraphQLRequestSerializer.getEntry(ALT___lte));
        }
        if (ALT___gt != null) {
            joiner.add("ALT___gt: " + GraphQLRequestSerializer.getEntry(ALT___gt));
        }
        if (ALT___gte != null) {
            joiner.add("ALT___gte: " + GraphQLRequestSerializer.getEntry(ALT___gte));
        }
        if (AST___eq != null) {
            joiner.add("AST___eq: " + GraphQLRequestSerializer.getEntry(AST___eq));
        }
        if (AST___ne != null) {
            joiner.add("AST___ne: " + GraphQLRequestSerializer.getEntry(AST___ne));
        }
        if (AST___null != null) {
            joiner.add("AST___null: " + GraphQLRequestSerializer.getEntry(AST___null));
        }
        if (AST___not___null != null) {
            joiner.add("AST___not___null: " + GraphQLRequestSerializer.getEntry(AST___not___null));
        }
        if (AST___in != null) {
            joiner.add("AST___in: " + GraphQLRequestSerializer.getEntry(AST___in));
        }
        if (AST___not___in != null) {
            joiner.add("AST___not___in: " + GraphQLRequestSerializer.getEntry(AST___not___in));
        }
        if (AST___lt != null) {
            joiner.add("AST___lt: " + GraphQLRequestSerializer.getEntry(AST___lt));
        }
        if (AST___lte != null) {
            joiner.add("AST___lte: " + GraphQLRequestSerializer.getEntry(AST___lte));
        }
        if (AST___gt != null) {
            joiner.add("AST___gt: " + GraphQLRequestSerializer.getEntry(AST___gt));
        }
        if (AST___gte != null) {
            joiner.add("AST___gte: " + GraphQLRequestSerializer.getEntry(AST___gte));
        }
        if (HDL___eq != null) {
            joiner.add("HDL___eq: " + GraphQLRequestSerializer.getEntry(HDL___eq));
        }
        if (HDL___ne != null) {
            joiner.add("HDL___ne: " + GraphQLRequestSerializer.getEntry(HDL___ne));
        }
        if (HDL___null != null) {
            joiner.add("HDL___null: " + GraphQLRequestSerializer.getEntry(HDL___null));
        }
        if (HDL___not___null != null) {
            joiner.add("HDL___not___null: " + GraphQLRequestSerializer.getEntry(HDL___not___null));
        }
        if (HDL___in != null) {
            joiner.add("HDL___in: " + GraphQLRequestSerializer.getEntry(HDL___in));
        }
        if (HDL___not___in != null) {
            joiner.add("HDL___not___in: " + GraphQLRequestSerializer.getEntry(HDL___not___in));
        }
        if (HDL___lt != null) {
            joiner.add("HDL___lt: " + GraphQLRequestSerializer.getEntry(HDL___lt));
        }
        if (HDL___lte != null) {
            joiner.add("HDL___lte: " + GraphQLRequestSerializer.getEntry(HDL___lte));
        }
        if (HDL___gt != null) {
            joiner.add("HDL___gt: " + GraphQLRequestSerializer.getEntry(HDL___gt));
        }
        if (HDL___gte != null) {
            joiner.add("HDL___gte: " + GraphQLRequestSerializer.getEntry(HDL___gte));
        }
        if (LDL___eq != null) {
            joiner.add("LDL___eq: " + GraphQLRequestSerializer.getEntry(LDL___eq));
        }
        if (LDL___ne != null) {
            joiner.add("LDL___ne: " + GraphQLRequestSerializer.getEntry(LDL___ne));
        }
        if (LDL___null != null) {
            joiner.add("LDL___null: " + GraphQLRequestSerializer.getEntry(LDL___null));
        }
        if (LDL___not___null != null) {
            joiner.add("LDL___not___null: " + GraphQLRequestSerializer.getEntry(LDL___not___null));
        }
        if (LDL___in != null) {
            joiner.add("LDL___in: " + GraphQLRequestSerializer.getEntry(LDL___in));
        }
        if (LDL___not___in != null) {
            joiner.add("LDL___not___in: " + GraphQLRequestSerializer.getEntry(LDL___not___in));
        }
        if (LDL___lt != null) {
            joiner.add("LDL___lt: " + GraphQLRequestSerializer.getEntry(LDL___lt));
        }
        if (LDL___lte != null) {
            joiner.add("LDL___lte: " + GraphQLRequestSerializer.getEntry(LDL___lte));
        }
        if (LDL___gt != null) {
            joiner.add("LDL___gt: " + GraphQLRequestSerializer.getEntry(LDL___gt));
        }
        if (LDL___gte != null) {
            joiner.add("LDL___gte: " + GraphQLRequestSerializer.getEntry(LDL___gte));
        }
        if (MCV___eq != null) {
            joiner.add("MCV___eq: " + GraphQLRequestSerializer.getEntry(MCV___eq));
        }
        if (MCV___ne != null) {
            joiner.add("MCV___ne: " + GraphQLRequestSerializer.getEntry(MCV___ne));
        }
        if (MCV___null != null) {
            joiner.add("MCV___null: " + GraphQLRequestSerializer.getEntry(MCV___null));
        }
        if (MCV___not___null != null) {
            joiner.add("MCV___not___null: " + GraphQLRequestSerializer.getEntry(MCV___not___null));
        }
        if (MCV___in != null) {
            joiner.add("MCV___in: " + GraphQLRequestSerializer.getEntry(MCV___in));
        }
        if (MCV___not___in != null) {
            joiner.add("MCV___not___in: " + GraphQLRequestSerializer.getEntry(MCV___not___in));
        }
        if (MCV___lt != null) {
            joiner.add("MCV___lt: " + GraphQLRequestSerializer.getEntry(MCV___lt));
        }
        if (MCV___lte != null) {
            joiner.add("MCV___lte: " + GraphQLRequestSerializer.getEntry(MCV___lte));
        }
        if (MCV___gt != null) {
            joiner.add("MCV___gt: " + GraphQLRequestSerializer.getEntry(MCV___gt));
        }
        if (MCV___gte != null) {
            joiner.add("MCV___gte: " + GraphQLRequestSerializer.getEntry(MCV___gte));
        }
        if (PCHE___eq != null) {
            joiner.add("PCHE___eq: " + GraphQLRequestSerializer.getEntry(PCHE___eq));
        }
        if (PCHE___ne != null) {
            joiner.add("PCHE___ne: " + GraphQLRequestSerializer.getEntry(PCHE___ne));
        }
        if (PCHE___null != null) {
            joiner.add("PCHE___null: " + GraphQLRequestSerializer.getEntry(PCHE___null));
        }
        if (PCHE___not___null != null) {
            joiner.add("PCHE___not___null: " + GraphQLRequestSerializer.getEntry(PCHE___not___null));
        }
        if (PCHE___in != null) {
            joiner.add("PCHE___in: " + GraphQLRequestSerializer.getEntry(PCHE___in));
        }
        if (PCHE___not___in != null) {
            joiner.add("PCHE___not___in: " + GraphQLRequestSerializer.getEntry(PCHE___not___in));
        }
        if (PCHE___lt != null) {
            joiner.add("PCHE___lt: " + GraphQLRequestSerializer.getEntry(PCHE___lt));
        }
        if (PCHE___lte != null) {
            joiner.add("PCHE___lte: " + GraphQLRequestSerializer.getEntry(PCHE___lte));
        }
        if (PCHE___gt != null) {
            joiner.add("PCHE___gt: " + GraphQLRequestSerializer.getEntry(PCHE___gt));
        }
        if (PCHE___gte != null) {
            joiner.add("PCHE___gte: " + GraphQLRequestSerializer.getEntry(PCHE___gte));
        }
        if (PPD___eq != null) {
            joiner.add("PPD___eq: " + GraphQLRequestSerializer.getEntry(PPD___eq));
        }
        if (PPD___ne != null) {
            joiner.add("PPD___ne: " + GraphQLRequestSerializer.getEntry(PPD___ne));
        }
        if (PPD___null != null) {
            joiner.add("PPD___null: " + GraphQLRequestSerializer.getEntry(PPD___null));
        }
        if (PPD___not___null != null) {
            joiner.add("PPD___not___null: " + GraphQLRequestSerializer.getEntry(PPD___not___null));
        }
        if (PT_INR___eq != null) {
            joiner.add("PT_INR___eq: " + GraphQLRequestSerializer.getEntry(PT_INR___eq));
        }
        if (PT_INR___ne != null) {
            joiner.add("PT_INR___ne: " + GraphQLRequestSerializer.getEntry(PT_INR___ne));
        }
        if (PT_INR___null != null) {
            joiner.add("PT_INR___null: " + GraphQLRequestSerializer.getEntry(PT_INR___null));
        }
        if (PT_INR___not___null != null) {
            joiner.add("PT_INR___not___null: " + GraphQLRequestSerializer.getEntry(PT_INR___not___null));
        }
        if (PT_INR___in != null) {
            joiner.add("PT_INR___in: " + GraphQLRequestSerializer.getEntry(PT_INR___in));
        }
        if (PT_INR___not___in != null) {
            joiner.add("PT_INR___not___in: " + GraphQLRequestSerializer.getEntry(PT_INR___not___in));
        }
        if (PT_INR___lt != null) {
            joiner.add("PT_INR___lt: " + GraphQLRequestSerializer.getEntry(PT_INR___lt));
        }
        if (PT_INR___lte != null) {
            joiner.add("PT_INR___lte: " + GraphQLRequestSerializer.getEntry(PT_INR___lte));
        }
        if (PT_INR___gt != null) {
            joiner.add("PT_INR___gt: " + GraphQLRequestSerializer.getEntry(PT_INR___gt));
        }
        if (PT_INR___gte != null) {
            joiner.add("PT_INR___gte: " + GraphQLRequestSerializer.getEntry(PT_INR___gte));
        }
        if (PT_percentuale___eq != null) {
            joiner.add("PT_percentuale___eq: " + GraphQLRequestSerializer.getEntry(PT_percentuale___eq));
        }
        if (PT_percentuale___ne != null) {
            joiner.add("PT_percentuale___ne: " + GraphQLRequestSerializer.getEntry(PT_percentuale___ne));
        }
        if (PT_percentuale___null != null) {
            joiner.add("PT_percentuale___null: " + GraphQLRequestSerializer.getEntry(PT_percentuale___null));
        }
        if (PT_percentuale___not___null != null) {
            joiner.add("PT_percentuale___not___null: " + GraphQLRequestSerializer.getEntry(PT_percentuale___not___null));
        }
        if (PT_percentuale___in != null) {
            joiner.add("PT_percentuale___in: " + GraphQLRequestSerializer.getEntry(PT_percentuale___in));
        }
        if (PT_percentuale___not___in != null) {
            joiner.add("PT_percentuale___not___in: " + GraphQLRequestSerializer.getEntry(PT_percentuale___not___in));
        }
        if (PT_percentuale___lt != null) {
            joiner.add("PT_percentuale___lt: " + GraphQLRequestSerializer.getEntry(PT_percentuale___lt));
        }
        if (PT_percentuale___lte != null) {
            joiner.add("PT_percentuale___lte: " + GraphQLRequestSerializer.getEntry(PT_percentuale___lte));
        }
        if (PT_percentuale___gt != null) {
            joiner.add("PT_percentuale___gt: " + GraphQLRequestSerializer.getEntry(PT_percentuale___gt));
        }
        if (PT_percentuale___gte != null) {
            joiner.add("PT_percentuale___gte: " + GraphQLRequestSerializer.getEntry(PT_percentuale___gte));
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
        if (acido_lattico___eq != null) {
            joiner.add("acido_lattico___eq: " + GraphQLRequestSerializer.getEntry(acido_lattico___eq));
        }
        if (acido_lattico___ne != null) {
            joiner.add("acido_lattico___ne: " + GraphQLRequestSerializer.getEntry(acido_lattico___ne));
        }
        if (acido_lattico___null != null) {
            joiner.add("acido_lattico___null: " + GraphQLRequestSerializer.getEntry(acido_lattico___null));
        }
        if (acido_lattico___not___null != null) {
            joiner.add("acido_lattico___not___null: " + GraphQLRequestSerializer.getEntry(acido_lattico___not___null));
        }
        if (acido_lattico___in != null) {
            joiner.add("acido_lattico___in: " + GraphQLRequestSerializer.getEntry(acido_lattico___in));
        }
        if (acido_lattico___not___in != null) {
            joiner.add("acido_lattico___not___in: " + GraphQLRequestSerializer.getEntry(acido_lattico___not___in));
        }
        if (acido_lattico___lt != null) {
            joiner.add("acido_lattico___lt: " + GraphQLRequestSerializer.getEntry(acido_lattico___lt));
        }
        if (acido_lattico___lte != null) {
            joiner.add("acido_lattico___lte: " + GraphQLRequestSerializer.getEntry(acido_lattico___lte));
        }
        if (acido_lattico___gt != null) {
            joiner.add("acido_lattico___gt: " + GraphQLRequestSerializer.getEntry(acido_lattico___gt));
        }
        if (acido_lattico___gte != null) {
            joiner.add("acido_lattico___gte: " + GraphQLRequestSerializer.getEntry(acido_lattico___gte));
        }
        if (albumina___eq != null) {
            joiner.add("albumina___eq: " + GraphQLRequestSerializer.getEntry(albumina___eq));
        }
        if (albumina___ne != null) {
            joiner.add("albumina___ne: " + GraphQLRequestSerializer.getEntry(albumina___ne));
        }
        if (albumina___null != null) {
            joiner.add("albumina___null: " + GraphQLRequestSerializer.getEntry(albumina___null));
        }
        if (albumina___not___null != null) {
            joiner.add("albumina___not___null: " + GraphQLRequestSerializer.getEntry(albumina___not___null));
        }
        if (albumina___in != null) {
            joiner.add("albumina___in: " + GraphQLRequestSerializer.getEntry(albumina___in));
        }
        if (albumina___not___in != null) {
            joiner.add("albumina___not___in: " + GraphQLRequestSerializer.getEntry(albumina___not___in));
        }
        if (albumina___lt != null) {
            joiner.add("albumina___lt: " + GraphQLRequestSerializer.getEntry(albumina___lt));
        }
        if (albumina___lte != null) {
            joiner.add("albumina___lte: " + GraphQLRequestSerializer.getEntry(albumina___lte));
        }
        if (albumina___gt != null) {
            joiner.add("albumina___gt: " + GraphQLRequestSerializer.getEntry(albumina___gt));
        }
        if (albumina___gte != null) {
            joiner.add("albumina___gte: " + GraphQLRequestSerializer.getEntry(albumina___gte));
        }
        if (alfafetoproteina___eq != null) {
            joiner.add("alfafetoproteina___eq: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___eq));
        }
        if (alfafetoproteina___ne != null) {
            joiner.add("alfafetoproteina___ne: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___ne));
        }
        if (alfafetoproteina___null != null) {
            joiner.add("alfafetoproteina___null: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___null));
        }
        if (alfafetoproteina___not___null != null) {
            joiner.add("alfafetoproteina___not___null: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___not___null));
        }
        if (alfafetoproteina___in != null) {
            joiner.add("alfafetoproteina___in: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___in));
        }
        if (alfafetoproteina___not___in != null) {
            joiner.add("alfafetoproteina___not___in: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___not___in));
        }
        if (alfafetoproteina___lt != null) {
            joiner.add("alfafetoproteina___lt: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___lt));
        }
        if (alfafetoproteina___lte != null) {
            joiner.add("alfafetoproteina___lte: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___lte));
        }
        if (alfafetoproteina___gt != null) {
            joiner.add("alfafetoproteina___gt: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___gt));
        }
        if (alfafetoproteina___gte != null) {
            joiner.add("alfafetoproteina___gte: " + GraphQLRequestSerializer.getEntry(alfafetoproteina___gte));
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
        if (altro_beve___eq != null) {
            joiner.add("altro_beve___eq: " + GraphQLRequestSerializer.getEntry(altro_beve___eq));
        }
        if (altro_beve___ne != null) {
            joiner.add("altro_beve___ne: " + GraphQLRequestSerializer.getEntry(altro_beve___ne));
        }
        if (altro_beve___null != null) {
            joiner.add("altro_beve___null: " + GraphQLRequestSerializer.getEntry(altro_beve___null));
        }
        if (altro_beve___not___null != null) {
            joiner.add("altro_beve___not___null: " + GraphQLRequestSerializer.getEntry(altro_beve___not___null));
        }
        if (altro_beve___in != null) {
            joiner.add("altro_beve___in: " + GraphQLRequestSerializer.getEntry(altro_beve___in));
        }
        if (altro_beve___not___in != null) {
            joiner.add("altro_beve___not___in: " + GraphQLRequestSerializer.getEntry(altro_beve___not___in));
        }
        if (altro_beve___lt != null) {
            joiner.add("altro_beve___lt: " + GraphQLRequestSerializer.getEntry(altro_beve___lt));
        }
        if (altro_beve___lte != null) {
            joiner.add("altro_beve___lte: " + GraphQLRequestSerializer.getEntry(altro_beve___lte));
        }
        if (altro_beve___gt != null) {
            joiner.add("altro_beve___gt: " + GraphQLRequestSerializer.getEntry(altro_beve___gt));
        }
        if (altro_beve___gte != null) {
            joiner.add("altro_beve___gte: " + GraphQLRequestSerializer.getEntry(altro_beve___gte));
        }
        if (altro_beve___contains != null) {
            joiner.add("altro_beve___contains: " + GraphQLRequestSerializer.getEntry(altro_beve___contains));
        }
        if (altro_beve___not___contains != null) {
            joiner.add("altro_beve___not___contains: " + GraphQLRequestSerializer.getEntry(altro_beve___not___contains));
        }
        if (altro_beve___starts_with != null) {
            joiner.add("altro_beve___starts_with: " + GraphQLRequestSerializer.getEntry(altro_beve___starts_with));
        }
        if (altro_beve___not___starts_with != null) {
            joiner.add("altro_beve___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_beve___not___starts_with));
        }
        if (altro_beve___ends_with != null) {
            joiner.add("altro_beve___ends_with: " + GraphQLRequestSerializer.getEntry(altro_beve___ends_with));
        }
        if (altro_beve___not___ends_with != null) {
            joiner.add("altro_beve___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_beve___not___ends_with));
        }
        if (azotemia___eq != null) {
            joiner.add("azotemia___eq: " + GraphQLRequestSerializer.getEntry(azotemia___eq));
        }
        if (azotemia___ne != null) {
            joiner.add("azotemia___ne: " + GraphQLRequestSerializer.getEntry(azotemia___ne));
        }
        if (azotemia___null != null) {
            joiner.add("azotemia___null: " + GraphQLRequestSerializer.getEntry(azotemia___null));
        }
        if (azotemia___not___null != null) {
            joiner.add("azotemia___not___null: " + GraphQLRequestSerializer.getEntry(azotemia___not___null));
        }
        if (azotemia___in != null) {
            joiner.add("azotemia___in: " + GraphQLRequestSerializer.getEntry(azotemia___in));
        }
        if (azotemia___not___in != null) {
            joiner.add("azotemia___not___in: " + GraphQLRequestSerializer.getEntry(azotemia___not___in));
        }
        if (azotemia___lt != null) {
            joiner.add("azotemia___lt: " + GraphQLRequestSerializer.getEntry(azotemia___lt));
        }
        if (azotemia___lte != null) {
            joiner.add("azotemia___lte: " + GraphQLRequestSerializer.getEntry(azotemia___lte));
        }
        if (azotemia___gt != null) {
            joiner.add("azotemia___gt: " + GraphQLRequestSerializer.getEntry(azotemia___gt));
        }
        if (azotemia___gte != null) {
            joiner.add("azotemia___gte: " + GraphQLRequestSerializer.getEntry(azotemia___gte));
        }
        if (beve___eq != null) {
            joiner.add("beve___eq: " + GraphQLRequestSerializer.getEntry(beve___eq));
        }
        if (beve___ne != null) {
            joiner.add("beve___ne: " + GraphQLRequestSerializer.getEntry(beve___ne));
        }
        if (beve___null != null) {
            joiner.add("beve___null: " + GraphQLRequestSerializer.getEntry(beve___null));
        }
        if (beve___not___null != null) {
            joiner.add("beve___not___null: " + GraphQLRequestSerializer.getEntry(beve___not___null));
        }
        if (bilirubina_diretta___eq != null) {
            joiner.add("bilirubina_diretta___eq: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___eq));
        }
        if (bilirubina_diretta___ne != null) {
            joiner.add("bilirubina_diretta___ne: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___ne));
        }
        if (bilirubina_diretta___null != null) {
            joiner.add("bilirubina_diretta___null: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___null));
        }
        if (bilirubina_diretta___not___null != null) {
            joiner.add("bilirubina_diretta___not___null: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___not___null));
        }
        if (bilirubina_diretta___in != null) {
            joiner.add("bilirubina_diretta___in: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___in));
        }
        if (bilirubina_diretta___not___in != null) {
            joiner.add("bilirubina_diretta___not___in: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___not___in));
        }
        if (bilirubina_diretta___lt != null) {
            joiner.add("bilirubina_diretta___lt: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___lt));
        }
        if (bilirubina_diretta___lte != null) {
            joiner.add("bilirubina_diretta___lte: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___lte));
        }
        if (bilirubina_diretta___gt != null) {
            joiner.add("bilirubina_diretta___gt: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___gt));
        }
        if (bilirubina_diretta___gte != null) {
            joiner.add("bilirubina_diretta___gte: " + GraphQLRequestSerializer.getEntry(bilirubina_diretta___gte));
        }
        if (bilirubina_totale___eq != null) {
            joiner.add("bilirubina_totale___eq: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___eq));
        }
        if (bilirubina_totale___ne != null) {
            joiner.add("bilirubina_totale___ne: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___ne));
        }
        if (bilirubina_totale___null != null) {
            joiner.add("bilirubina_totale___null: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___null));
        }
        if (bilirubina_totale___not___null != null) {
            joiner.add("bilirubina_totale___not___null: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___not___null));
        }
        if (bilirubina_totale___in != null) {
            joiner.add("bilirubina_totale___in: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___in));
        }
        if (bilirubina_totale___not___in != null) {
            joiner.add("bilirubina_totale___not___in: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___not___in));
        }
        if (bilirubina_totale___lt != null) {
            joiner.add("bilirubina_totale___lt: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___lt));
        }
        if (bilirubina_totale___lte != null) {
            joiner.add("bilirubina_totale___lte: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___lte));
        }
        if (bilirubina_totale___gt != null) {
            joiner.add("bilirubina_totale___gt: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___gt));
        }
        if (bilirubina_totale___gte != null) {
            joiner.add("bilirubina_totale___gte: " + GraphQLRequestSerializer.getEntry(bilirubina_totale___gte));
        }
        if (birra___eq != null) {
            joiner.add("birra___eq: " + GraphQLRequestSerializer.getEntry(birra___eq));
        }
        if (birra___ne != null) {
            joiner.add("birra___ne: " + GraphQLRequestSerializer.getEntry(birra___ne));
        }
        if (birra___null != null) {
            joiner.add("birra___null: " + GraphQLRequestSerializer.getEntry(birra___null));
        }
        if (birra___not___null != null) {
            joiner.add("birra___not___null: " + GraphQLRequestSerializer.getEntry(birra___not___null));
        }
        if (birra___in != null) {
            joiner.add("birra___in: " + GraphQLRequestSerializer.getEntry(birra___in));
        }
        if (birra___not___in != null) {
            joiner.add("birra___not___in: " + GraphQLRequestSerializer.getEntry(birra___not___in));
        }
        if (birra___lt != null) {
            joiner.add("birra___lt: " + GraphQLRequestSerializer.getEntry(birra___lt));
        }
        if (birra___lte != null) {
            joiner.add("birra___lte: " + GraphQLRequestSerializer.getEntry(birra___lte));
        }
        if (birra___gt != null) {
            joiner.add("birra___gt: " + GraphQLRequestSerializer.getEntry(birra___gt));
        }
        if (birra___gte != null) {
            joiner.add("birra___gte: " + GraphQLRequestSerializer.getEntry(birra___gte));
        }
        if (calcio___eq != null) {
            joiner.add("calcio___eq: " + GraphQLRequestSerializer.getEntry(calcio___eq));
        }
        if (calcio___ne != null) {
            joiner.add("calcio___ne: " + GraphQLRequestSerializer.getEntry(calcio___ne));
        }
        if (calcio___null != null) {
            joiner.add("calcio___null: " + GraphQLRequestSerializer.getEntry(calcio___null));
        }
        if (calcio___not___null != null) {
            joiner.add("calcio___not___null: " + GraphQLRequestSerializer.getEntry(calcio___not___null));
        }
        if (calcio___in != null) {
            joiner.add("calcio___in: " + GraphQLRequestSerializer.getEntry(calcio___in));
        }
        if (calcio___not___in != null) {
            joiner.add("calcio___not___in: " + GraphQLRequestSerializer.getEntry(calcio___not___in));
        }
        if (calcio___lt != null) {
            joiner.add("calcio___lt: " + GraphQLRequestSerializer.getEntry(calcio___lt));
        }
        if (calcio___lte != null) {
            joiner.add("calcio___lte: " + GraphQLRequestSerializer.getEntry(calcio___lte));
        }
        if (calcio___gt != null) {
            joiner.add("calcio___gt: " + GraphQLRequestSerializer.getEntry(calcio___gt));
        }
        if (calcio___gte != null) {
            joiner.add("calcio___gte: " + GraphQLRequestSerializer.getEntry(calcio___gte));
        }
        if (campione___eq != null) {
            joiner.add("campione___eq: " + GraphQLRequestSerializer.getEntry(campione___eq));
        }
        if (campione___ne != null) {
            joiner.add("campione___ne: " + GraphQLRequestSerializer.getEntry(campione___ne));
        }
        if (campione___null != null) {
            joiner.add("campione___null: " + GraphQLRequestSerializer.getEntry(campione___null));
        }
        if (campione___not___null != null) {
            joiner.add("campione___not___null: " + GraphQLRequestSerializer.getEntry(campione___not___null));
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
        if (circonferenza_vita___eq != null) {
            joiner.add("circonferenza_vita___eq: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___eq));
        }
        if (circonferenza_vita___ne != null) {
            joiner.add("circonferenza_vita___ne: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___ne));
        }
        if (circonferenza_vita___null != null) {
            joiner.add("circonferenza_vita___null: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___null));
        }
        if (circonferenza_vita___not___null != null) {
            joiner.add("circonferenza_vita___not___null: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___not___null));
        }
        if (circonferenza_vita___in != null) {
            joiner.add("circonferenza_vita___in: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___in));
        }
        if (circonferenza_vita___not___in != null) {
            joiner.add("circonferenza_vita___not___in: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___not___in));
        }
        if (circonferenza_vita___lt != null) {
            joiner.add("circonferenza_vita___lt: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___lt));
        }
        if (circonferenza_vita___lte != null) {
            joiner.add("circonferenza_vita___lte: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___lte));
        }
        if (circonferenza_vita___gt != null) {
            joiner.add("circonferenza_vita___gt: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___gt));
        }
        if (circonferenza_vita___gte != null) {
            joiner.add("circonferenza_vita___gte: " + GraphQLRequestSerializer.getEntry(circonferenza_vita___gte));
        }
        if (cmvigg___eq != null) {
            joiner.add("cmvigg___eq: " + GraphQLRequestSerializer.getEntry(cmvigg___eq));
        }
        if (cmvigg___ne != null) {
            joiner.add("cmvigg___ne: " + GraphQLRequestSerializer.getEntry(cmvigg___ne));
        }
        if (cmvigg___null != null) {
            joiner.add("cmvigg___null: " + GraphQLRequestSerializer.getEntry(cmvigg___null));
        }
        if (cmvigg___not___null != null) {
            joiner.add("cmvigg___not___null: " + GraphQLRequestSerializer.getEntry(cmvigg___not___null));
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
        if (colesterolo___eq != null) {
            joiner.add("colesterolo___eq: " + GraphQLRequestSerializer.getEntry(colesterolo___eq));
        }
        if (colesterolo___ne != null) {
            joiner.add("colesterolo___ne: " + GraphQLRequestSerializer.getEntry(colesterolo___ne));
        }
        if (colesterolo___null != null) {
            joiner.add("colesterolo___null: " + GraphQLRequestSerializer.getEntry(colesterolo___null));
        }
        if (colesterolo___not___null != null) {
            joiner.add("colesterolo___not___null: " + GraphQLRequestSerializer.getEntry(colesterolo___not___null));
        }
        if (colesterolo___in != null) {
            joiner.add("colesterolo___in: " + GraphQLRequestSerializer.getEntry(colesterolo___in));
        }
        if (colesterolo___not___in != null) {
            joiner.add("colesterolo___not___in: " + GraphQLRequestSerializer.getEntry(colesterolo___not___in));
        }
        if (colesterolo___lt != null) {
            joiner.add("colesterolo___lt: " + GraphQLRequestSerializer.getEntry(colesterolo___lt));
        }
        if (colesterolo___lte != null) {
            joiner.add("colesterolo___lte: " + GraphQLRequestSerializer.getEntry(colesterolo___lte));
        }
        if (colesterolo___gt != null) {
            joiner.add("colesterolo___gt: " + GraphQLRequestSerializer.getEntry(colesterolo___gt));
        }
        if (colesterolo___gte != null) {
            joiner.add("colesterolo___gte: " + GraphQLRequestSerializer.getEntry(colesterolo___gte));
        }
        if (cov_igg___eq != null) {
            joiner.add("cov_igg___eq: " + GraphQLRequestSerializer.getEntry(cov_igg___eq));
        }
        if (cov_igg___ne != null) {
            joiner.add("cov_igg___ne: " + GraphQLRequestSerializer.getEntry(cov_igg___ne));
        }
        if (cov_igg___null != null) {
            joiner.add("cov_igg___null: " + GraphQLRequestSerializer.getEntry(cov_igg___null));
        }
        if (cov_igg___not___null != null) {
            joiner.add("cov_igg___not___null: " + GraphQLRequestSerializer.getEntry(cov_igg___not___null));
        }
        if (cov_igg_titolo___eq != null) {
            joiner.add("cov_igg_titolo___eq: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___eq));
        }
        if (cov_igg_titolo___ne != null) {
            joiner.add("cov_igg_titolo___ne: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___ne));
        }
        if (cov_igg_titolo___null != null) {
            joiner.add("cov_igg_titolo___null: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___null));
        }
        if (cov_igg_titolo___not___null != null) {
            joiner.add("cov_igg_titolo___not___null: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___not___null));
        }
        if (cov_igg_titolo___in != null) {
            joiner.add("cov_igg_titolo___in: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___in));
        }
        if (cov_igg_titolo___not___in != null) {
            joiner.add("cov_igg_titolo___not___in: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___not___in));
        }
        if (cov_igg_titolo___lt != null) {
            joiner.add("cov_igg_titolo___lt: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___lt));
        }
        if (cov_igg_titolo___lte != null) {
            joiner.add("cov_igg_titolo___lte: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___lte));
        }
        if (cov_igg_titolo___gt != null) {
            joiner.add("cov_igg_titolo___gt: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___gt));
        }
        if (cov_igg_titolo___gte != null) {
            joiner.add("cov_igg_titolo___gte: " + GraphQLRequestSerializer.getEntry(cov_igg_titolo___gte));
        }
        if (cov_igm___eq != null) {
            joiner.add("cov_igm___eq: " + GraphQLRequestSerializer.getEntry(cov_igm___eq));
        }
        if (cov_igm___ne != null) {
            joiner.add("cov_igm___ne: " + GraphQLRequestSerializer.getEntry(cov_igm___ne));
        }
        if (cov_igm___null != null) {
            joiner.add("cov_igm___null: " + GraphQLRequestSerializer.getEntry(cov_igm___null));
        }
        if (cov_igm___not___null != null) {
            joiner.add("cov_igm___not___null: " + GraphQLRequestSerializer.getEntry(cov_igm___not___null));
        }
        if (cov_igm_titolo___eq != null) {
            joiner.add("cov_igm_titolo___eq: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___eq));
        }
        if (cov_igm_titolo___ne != null) {
            joiner.add("cov_igm_titolo___ne: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___ne));
        }
        if (cov_igm_titolo___null != null) {
            joiner.add("cov_igm_titolo___null: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___null));
        }
        if (cov_igm_titolo___not___null != null) {
            joiner.add("cov_igm_titolo___not___null: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___not___null));
        }
        if (cov_igm_titolo___in != null) {
            joiner.add("cov_igm_titolo___in: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___in));
        }
        if (cov_igm_titolo___not___in != null) {
            joiner.add("cov_igm_titolo___not___in: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___not___in));
        }
        if (cov_igm_titolo___lt != null) {
            joiner.add("cov_igm_titolo___lt: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___lt));
        }
        if (cov_igm_titolo___lte != null) {
            joiner.add("cov_igm_titolo___lte: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___lte));
        }
        if (cov_igm_titolo___gt != null) {
            joiner.add("cov_igm_titolo___gt: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___gt));
        }
        if (cov_igm_titolo___gte != null) {
            joiner.add("cov_igm_titolo___gte: " + GraphQLRequestSerializer.getEntry(cov_igm_titolo___gte));
        }
        if (cov_rna___eq != null) {
            joiner.add("cov_rna___eq: " + GraphQLRequestSerializer.getEntry(cov_rna___eq));
        }
        if (cov_rna___ne != null) {
            joiner.add("cov_rna___ne: " + GraphQLRequestSerializer.getEntry(cov_rna___ne));
        }
        if (cov_rna___null != null) {
            joiner.add("cov_rna___null: " + GraphQLRequestSerializer.getEntry(cov_rna___null));
        }
        if (cov_rna___not___null != null) {
            joiner.add("cov_rna___not___null: " + GraphQLRequestSerializer.getEntry(cov_rna___not___null));
        }
        if (cov_test___eq != null) {
            joiner.add("cov_test___eq: " + GraphQLRequestSerializer.getEntry(cov_test___eq));
        }
        if (cov_test___ne != null) {
            joiner.add("cov_test___ne: " + GraphQLRequestSerializer.getEntry(cov_test___ne));
        }
        if (cov_test___null != null) {
            joiner.add("cov_test___null: " + GraphQLRequestSerializer.getEntry(cov_test___null));
        }
        if (cov_test___not___null != null) {
            joiner.add("cov_test___not___null: " + GraphQLRequestSerializer.getEntry(cov_test___not___null));
        }
        if (cov_test___in != null) {
            joiner.add("cov_test___in: " + GraphQLRequestSerializer.getEntry(cov_test___in));
        }
        if (cov_test___not___in != null) {
            joiner.add("cov_test___not___in: " + GraphQLRequestSerializer.getEntry(cov_test___not___in));
        }
        if (cov_test___lt != null) {
            joiner.add("cov_test___lt: " + GraphQLRequestSerializer.getEntry(cov_test___lt));
        }
        if (cov_test___lte != null) {
            joiner.add("cov_test___lte: " + GraphQLRequestSerializer.getEntry(cov_test___lte));
        }
        if (cov_test___gt != null) {
            joiner.add("cov_test___gt: " + GraphQLRequestSerializer.getEntry(cov_test___gt));
        }
        if (cov_test___gte != null) {
            joiner.add("cov_test___gte: " + GraphQLRequestSerializer.getEntry(cov_test___gte));
        }
        if (cov_test___contains != null) {
            joiner.add("cov_test___contains: " + GraphQLRequestSerializer.getEntry(cov_test___contains));
        }
        if (cov_test___not___contains != null) {
            joiner.add("cov_test___not___contains: " + GraphQLRequestSerializer.getEntry(cov_test___not___contains));
        }
        if (cov_test___starts_with != null) {
            joiner.add("cov_test___starts_with: " + GraphQLRequestSerializer.getEntry(cov_test___starts_with));
        }
        if (cov_test___not___starts_with != null) {
            joiner.add("cov_test___not___starts_with: " + GraphQLRequestSerializer.getEntry(cov_test___not___starts_with));
        }
        if (cov_test___ends_with != null) {
            joiner.add("cov_test___ends_with: " + GraphQLRequestSerializer.getEntry(cov_test___ends_with));
        }
        if (cov_test___not___ends_with != null) {
            joiner.add("cov_test___not___ends_with: " + GraphQLRequestSerializer.getEntry(cov_test___not___ends_with));
        }
        if (cov_vax___eq != null) {
            joiner.add("cov_vax___eq: " + GraphQLRequestSerializer.getEntry(cov_vax___eq));
        }
        if (cov_vax___ne != null) {
            joiner.add("cov_vax___ne: " + GraphQLRequestSerializer.getEntry(cov_vax___ne));
        }
        if (cov_vax___null != null) {
            joiner.add("cov_vax___null: " + GraphQLRequestSerializer.getEntry(cov_vax___null));
        }
        if (cov_vax___not___null != null) {
            joiner.add("cov_vax___not___null: " + GraphQLRequestSerializer.getEntry(cov_vax___not___null));
        }
        if (creatinina___eq != null) {
            joiner.add("creatinina___eq: " + GraphQLRequestSerializer.getEntry(creatinina___eq));
        }
        if (creatinina___ne != null) {
            joiner.add("creatinina___ne: " + GraphQLRequestSerializer.getEntry(creatinina___ne));
        }
        if (creatinina___null != null) {
            joiner.add("creatinina___null: " + GraphQLRequestSerializer.getEntry(creatinina___null));
        }
        if (creatinina___not___null != null) {
            joiner.add("creatinina___not___null: " + GraphQLRequestSerializer.getEntry(creatinina___not___null));
        }
        if (creatinina___in != null) {
            joiner.add("creatinina___in: " + GraphQLRequestSerializer.getEntry(creatinina___in));
        }
        if (creatinina___not___in != null) {
            joiner.add("creatinina___not___in: " + GraphQLRequestSerializer.getEntry(creatinina___not___in));
        }
        if (creatinina___lt != null) {
            joiner.add("creatinina___lt: " + GraphQLRequestSerializer.getEntry(creatinina___lt));
        }
        if (creatinina___lte != null) {
            joiner.add("creatinina___lte: " + GraphQLRequestSerializer.getEntry(creatinina___lte));
        }
        if (creatinina___gt != null) {
            joiner.add("creatinina___gt: " + GraphQLRequestSerializer.getEntry(creatinina___gt));
        }
        if (creatinina___gte != null) {
            joiner.add("creatinina___gte: " + GraphQLRequestSerializer.getEntry(creatinina___gte));
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
        if (data_campione___eq != null) {
            joiner.add("data_campione___eq: " + GraphQLRequestSerializer.getEntry(data_campione___eq));
        }
        if (data_campione___ne != null) {
            joiner.add("data_campione___ne: " + GraphQLRequestSerializer.getEntry(data_campione___ne));
        }
        if (data_campione___null != null) {
            joiner.add("data_campione___null: " + GraphQLRequestSerializer.getEntry(data_campione___null));
        }
        if (data_campione___not___null != null) {
            joiner.add("data_campione___not___null: " + GraphQLRequestSerializer.getEntry(data_campione___not___null));
        }
        if (data_campione___in != null) {
            joiner.add("data_campione___in: " + GraphQLRequestSerializer.getEntry(data_campione___in));
        }
        if (data_campione___not___in != null) {
            joiner.add("data_campione___not___in: " + GraphQLRequestSerializer.getEntry(data_campione___not___in));
        }
        if (data_campione___lt != null) {
            joiner.add("data_campione___lt: " + GraphQLRequestSerializer.getEntry(data_campione___lt));
        }
        if (data_campione___lte != null) {
            joiner.add("data_campione___lte: " + GraphQLRequestSerializer.getEntry(data_campione___lte));
        }
        if (data_campione___gt != null) {
            joiner.add("data_campione___gt: " + GraphQLRequestSerializer.getEntry(data_campione___gt));
        }
        if (data_campione___gte != null) {
            joiner.add("data_campione___gte: " + GraphQLRequestSerializer.getEntry(data_campione___gte));
        }
        if (data_presunta_parto___eq != null) {
            joiner.add("data_presunta_parto___eq: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___eq));
        }
        if (data_presunta_parto___ne != null) {
            joiner.add("data_presunta_parto___ne: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___ne));
        }
        if (data_presunta_parto___null != null) {
            joiner.add("data_presunta_parto___null: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___null));
        }
        if (data_presunta_parto___not___null != null) {
            joiner.add("data_presunta_parto___not___null: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___not___null));
        }
        if (data_presunta_parto___in != null) {
            joiner.add("data_presunta_parto___in: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___in));
        }
        if (data_presunta_parto___not___in != null) {
            joiner.add("data_presunta_parto___not___in: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___not___in));
        }
        if (data_presunta_parto___lt != null) {
            joiner.add("data_presunta_parto___lt: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___lt));
        }
        if (data_presunta_parto___lte != null) {
            joiner.add("data_presunta_parto___lte: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___lte));
        }
        if (data_presunta_parto___gt != null) {
            joiner.add("data_presunta_parto___gt: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___gt));
        }
        if (data_presunta_parto___gte != null) {
            joiner.add("data_presunta_parto___gte: " + GraphQLRequestSerializer.getEntry(data_presunta_parto___gte));
        }
        if (data_questionario___eq != null) {
            joiner.add("data_questionario___eq: " + GraphQLRequestSerializer.getEntry(data_questionario___eq));
        }
        if (data_questionario___ne != null) {
            joiner.add("data_questionario___ne: " + GraphQLRequestSerializer.getEntry(data_questionario___ne));
        }
        if (data_questionario___null != null) {
            joiner.add("data_questionario___null: " + GraphQLRequestSerializer.getEntry(data_questionario___null));
        }
        if (data_questionario___not___null != null) {
            joiner.add("data_questionario___not___null: " + GraphQLRequestSerializer.getEntry(data_questionario___not___null));
        }
        if (data_questionario___in != null) {
            joiner.add("data_questionario___in: " + GraphQLRequestSerializer.getEntry(data_questionario___in));
        }
        if (data_questionario___not___in != null) {
            joiner.add("data_questionario___not___in: " + GraphQLRequestSerializer.getEntry(data_questionario___not___in));
        }
        if (data_questionario___lt != null) {
            joiner.add("data_questionario___lt: " + GraphQLRequestSerializer.getEntry(data_questionario___lt));
        }
        if (data_questionario___lte != null) {
            joiner.add("data_questionario___lte: " + GraphQLRequestSerializer.getEntry(data_questionario___lte));
        }
        if (data_questionario___gt != null) {
            joiner.add("data_questionario___gt: " + GraphQLRequestSerializer.getEntry(data_questionario___gt));
        }
        if (data_questionario___gte != null) {
            joiner.add("data_questionario___gte: " + GraphQLRequestSerializer.getEntry(data_questionario___gte));
        }
        if (dosi_omesse___eq != null) {
            joiner.add("dosi_omesse___eq: " + GraphQLRequestSerializer.getEntry(dosi_omesse___eq));
        }
        if (dosi_omesse___ne != null) {
            joiner.add("dosi_omesse___ne: " + GraphQLRequestSerializer.getEntry(dosi_omesse___ne));
        }
        if (dosi_omesse___null != null) {
            joiner.add("dosi_omesse___null: " + GraphQLRequestSerializer.getEntry(dosi_omesse___null));
        }
        if (dosi_omesse___not___null != null) {
            joiner.add("dosi_omesse___not___null: " + GraphQLRequestSerializer.getEntry(dosi_omesse___not___null));
        }
        if (dosi_omesse___in != null) {
            joiner.add("dosi_omesse___in: " + GraphQLRequestSerializer.getEntry(dosi_omesse___in));
        }
        if (dosi_omesse___not___in != null) {
            joiner.add("dosi_omesse___not___in: " + GraphQLRequestSerializer.getEntry(dosi_omesse___not___in));
        }
        if (dosi_omesse___lt != null) {
            joiner.add("dosi_omesse___lt: " + GraphQLRequestSerializer.getEntry(dosi_omesse___lt));
        }
        if (dosi_omesse___lte != null) {
            joiner.add("dosi_omesse___lte: " + GraphQLRequestSerializer.getEntry(dosi_omesse___lte));
        }
        if (dosi_omesse___gt != null) {
            joiner.add("dosi_omesse___gt: " + GraphQLRequestSerializer.getEntry(dosi_omesse___gt));
        }
        if (dosi_omesse___gte != null) {
            joiner.add("dosi_omesse___gte: " + GraphQLRequestSerializer.getEntry(dosi_omesse___gte));
        }
        if (emoglobina___eq != null) {
            joiner.add("emoglobina___eq: " + GraphQLRequestSerializer.getEntry(emoglobina___eq));
        }
        if (emoglobina___ne != null) {
            joiner.add("emoglobina___ne: " + GraphQLRequestSerializer.getEntry(emoglobina___ne));
        }
        if (emoglobina___null != null) {
            joiner.add("emoglobina___null: " + GraphQLRequestSerializer.getEntry(emoglobina___null));
        }
        if (emoglobina___not___null != null) {
            joiner.add("emoglobina___not___null: " + GraphQLRequestSerializer.getEntry(emoglobina___not___null));
        }
        if (emoglobina___in != null) {
            joiner.add("emoglobina___in: " + GraphQLRequestSerializer.getEntry(emoglobina___in));
        }
        if (emoglobina___not___in != null) {
            joiner.add("emoglobina___not___in: " + GraphQLRequestSerializer.getEntry(emoglobina___not___in));
        }
        if (emoglobina___lt != null) {
            joiner.add("emoglobina___lt: " + GraphQLRequestSerializer.getEntry(emoglobina___lt));
        }
        if (emoglobina___lte != null) {
            joiner.add("emoglobina___lte: " + GraphQLRequestSerializer.getEntry(emoglobina___lte));
        }
        if (emoglobina___gt != null) {
            joiner.add("emoglobina___gt: " + GraphQLRequestSerializer.getEntry(emoglobina___gt));
        }
        if (emoglobina___gte != null) {
            joiner.add("emoglobina___gte: " + GraphQLRequestSerializer.getEntry(emoglobina___gte));
        }
        if (emoglobina_glicata___eq != null) {
            joiner.add("emoglobina_glicata___eq: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___eq));
        }
        if (emoglobina_glicata___ne != null) {
            joiner.add("emoglobina_glicata___ne: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___ne));
        }
        if (emoglobina_glicata___null != null) {
            joiner.add("emoglobina_glicata___null: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___null));
        }
        if (emoglobina_glicata___not___null != null) {
            joiner.add("emoglobina_glicata___not___null: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___not___null));
        }
        if (emoglobina_glicata___in != null) {
            joiner.add("emoglobina_glicata___in: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___in));
        }
        if (emoglobina_glicata___not___in != null) {
            joiner.add("emoglobina_glicata___not___in: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___not___in));
        }
        if (emoglobina_glicata___lt != null) {
            joiner.add("emoglobina_glicata___lt: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___lt));
        }
        if (emoglobina_glicata___lte != null) {
            joiner.add("emoglobina_glicata___lte: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___lte));
        }
        if (emoglobina_glicata___gt != null) {
            joiner.add("emoglobina_glicata___gt: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___gt));
        }
        if (emoglobina_glicata___gte != null) {
            joiner.add("emoglobina_glicata___gte: " + GraphQLRequestSerializer.getEntry(emoglobina_glicata___gte));
        }
        if (followup_questionario___eq != null) {
            joiner.add("followup_questionario___eq: " + GraphQLRequestSerializer.getEntry(followup_questionario___eq));
        }
        if (followup_questionario___ne != null) {
            joiner.add("followup_questionario___ne: " + GraphQLRequestSerializer.getEntry(followup_questionario___ne));
        }
        if (followup_questionario___null != null) {
            joiner.add("followup_questionario___null: " + GraphQLRequestSerializer.getEntry(followup_questionario___null));
        }
        if (followup_questionario___not___null != null) {
            joiner.add("followup_questionario___not___null: " + GraphQLRequestSerializer.getEntry(followup_questionario___not___null));
        }
        if (followup_questionario___in != null) {
            joiner.add("followup_questionario___in: " + GraphQLRequestSerializer.getEntry(followup_questionario___in));
        }
        if (followup_questionario___not___in != null) {
            joiner.add("followup_questionario___not___in: " + GraphQLRequestSerializer.getEntry(followup_questionario___not___in));
        }
        if (followup_questionario___lt != null) {
            joiner.add("followup_questionario___lt: " + GraphQLRequestSerializer.getEntry(followup_questionario___lt));
        }
        if (followup_questionario___lte != null) {
            joiner.add("followup_questionario___lte: " + GraphQLRequestSerializer.getEntry(followup_questionario___lte));
        }
        if (followup_questionario___gt != null) {
            joiner.add("followup_questionario___gt: " + GraphQLRequestSerializer.getEntry(followup_questionario___gt));
        }
        if (followup_questionario___gte != null) {
            joiner.add("followup_questionario___gte: " + GraphQLRequestSerializer.getEntry(followup_questionario___gte));
        }
        if (followup_questionario___contains != null) {
            joiner.add("followup_questionario___contains: " + GraphQLRequestSerializer.getEntry(followup_questionario___contains));
        }
        if (followup_questionario___not___contains != null) {
            joiner.add("followup_questionario___not___contains: " + GraphQLRequestSerializer.getEntry(followup_questionario___not___contains));
        }
        if (followup_questionario___starts_with != null) {
            joiner.add("followup_questionario___starts_with: " + GraphQLRequestSerializer.getEntry(followup_questionario___starts_with));
        }
        if (followup_questionario___not___starts_with != null) {
            joiner.add("followup_questionario___not___starts_with: " + GraphQLRequestSerializer.getEntry(followup_questionario___not___starts_with));
        }
        if (followup_questionario___ends_with != null) {
            joiner.add("followup_questionario___ends_with: " + GraphQLRequestSerializer.getEntry(followup_questionario___ends_with));
        }
        if (followup_questionario___not___ends_with != null) {
            joiner.add("followup_questionario___not___ends_with: " + GraphQLRequestSerializer.getEntry(followup_questionario___not___ends_with));
        }
        if (fosfatasi_alcalina___eq != null) {
            joiner.add("fosfatasi_alcalina___eq: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___eq));
        }
        if (fosfatasi_alcalina___ne != null) {
            joiner.add("fosfatasi_alcalina___ne: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___ne));
        }
        if (fosfatasi_alcalina___null != null) {
            joiner.add("fosfatasi_alcalina___null: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___null));
        }
        if (fosfatasi_alcalina___not___null != null) {
            joiner.add("fosfatasi_alcalina___not___null: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___not___null));
        }
        if (fosfatasi_alcalina___in != null) {
            joiner.add("fosfatasi_alcalina___in: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___in));
        }
        if (fosfatasi_alcalina___not___in != null) {
            joiner.add("fosfatasi_alcalina___not___in: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___not___in));
        }
        if (fosfatasi_alcalina___lt != null) {
            joiner.add("fosfatasi_alcalina___lt: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___lt));
        }
        if (fosfatasi_alcalina___lte != null) {
            joiner.add("fosfatasi_alcalina___lte: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___lte));
        }
        if (fosfatasi_alcalina___gt != null) {
            joiner.add("fosfatasi_alcalina___gt: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___gt));
        }
        if (fosfatasi_alcalina___gte != null) {
            joiner.add("fosfatasi_alcalina___gte: " + GraphQLRequestSerializer.getEntry(fosfatasi_alcalina___gte));
        }
        if (fosforo___eq != null) {
            joiner.add("fosforo___eq: " + GraphQLRequestSerializer.getEntry(fosforo___eq));
        }
        if (fosforo___ne != null) {
            joiner.add("fosforo___ne: " + GraphQLRequestSerializer.getEntry(fosforo___ne));
        }
        if (fosforo___null != null) {
            joiner.add("fosforo___null: " + GraphQLRequestSerializer.getEntry(fosforo___null));
        }
        if (fosforo___not___null != null) {
            joiner.add("fosforo___not___null: " + GraphQLRequestSerializer.getEntry(fosforo___not___null));
        }
        if (fosforo___in != null) {
            joiner.add("fosforo___in: " + GraphQLRequestSerializer.getEntry(fosforo___in));
        }
        if (fosforo___not___in != null) {
            joiner.add("fosforo___not___in: " + GraphQLRequestSerializer.getEntry(fosforo___not___in));
        }
        if (fosforo___lt != null) {
            joiner.add("fosforo___lt: " + GraphQLRequestSerializer.getEntry(fosforo___lt));
        }
        if (fosforo___lte != null) {
            joiner.add("fosforo___lte: " + GraphQLRequestSerializer.getEntry(fosforo___lte));
        }
        if (fosforo___gt != null) {
            joiner.add("fosforo___gt: " + GraphQLRequestSerializer.getEntry(fosforo___gt));
        }
        if (fosforo___gte != null) {
            joiner.add("fosforo___gte: " + GraphQLRequestSerializer.getEntry(fosforo___gte));
        }
        if (frequenza___eq != null) {
            joiner.add("frequenza___eq: " + GraphQLRequestSerializer.getEntry(frequenza___eq));
        }
        if (frequenza___ne != null) {
            joiner.add("frequenza___ne: " + GraphQLRequestSerializer.getEntry(frequenza___ne));
        }
        if (frequenza___null != null) {
            joiner.add("frequenza___null: " + GraphQLRequestSerializer.getEntry(frequenza___null));
        }
        if (frequenza___not___null != null) {
            joiner.add("frequenza___not___null: " + GraphQLRequestSerializer.getEntry(frequenza___not___null));
        }
        if (frequenza___in != null) {
            joiner.add("frequenza___in: " + GraphQLRequestSerializer.getEntry(frequenza___in));
        }
        if (frequenza___not___in != null) {
            joiner.add("frequenza___not___in: " + GraphQLRequestSerializer.getEntry(frequenza___not___in));
        }
        if (frequenza___lt != null) {
            joiner.add("frequenza___lt: " + GraphQLRequestSerializer.getEntry(frequenza___lt));
        }
        if (frequenza___lte != null) {
            joiner.add("frequenza___lte: " + GraphQLRequestSerializer.getEntry(frequenza___lte));
        }
        if (frequenza___gt != null) {
            joiner.add("frequenza___gt: " + GraphQLRequestSerializer.getEntry(frequenza___gt));
        }
        if (frequenza___gte != null) {
            joiner.add("frequenza___gte: " + GraphQLRequestSerializer.getEntry(frequenza___gte));
        }
        if (frequenza___contains != null) {
            joiner.add("frequenza___contains: " + GraphQLRequestSerializer.getEntry(frequenza___contains));
        }
        if (frequenza___not___contains != null) {
            joiner.add("frequenza___not___contains: " + GraphQLRequestSerializer.getEntry(frequenza___not___contains));
        }
        if (frequenza___starts_with != null) {
            joiner.add("frequenza___starts_with: " + GraphQLRequestSerializer.getEntry(frequenza___starts_with));
        }
        if (frequenza___not___starts_with != null) {
            joiner.add("frequenza___not___starts_with: " + GraphQLRequestSerializer.getEntry(frequenza___not___starts_with));
        }
        if (frequenza___ends_with != null) {
            joiner.add("frequenza___ends_with: " + GraphQLRequestSerializer.getEntry(frequenza___ends_with));
        }
        if (frequenza___not___ends_with != null) {
            joiner.add("frequenza___not___ends_with: " + GraphQLRequestSerializer.getEntry(frequenza___not___ends_with));
        }
        if (fumatore_attivo___eq != null) {
            joiner.add("fumatore_attivo___eq: " + GraphQLRequestSerializer.getEntry(fumatore_attivo___eq));
        }
        if (fumatore_attivo___ne != null) {
            joiner.add("fumatore_attivo___ne: " + GraphQLRequestSerializer.getEntry(fumatore_attivo___ne));
        }
        if (fumatore_attivo___null != null) {
            joiner.add("fumatore_attivo___null: " + GraphQLRequestSerializer.getEntry(fumatore_attivo___null));
        }
        if (fumatore_attivo___not___null != null) {
            joiner.add("fumatore_attivo___not___null: " + GraphQLRequestSerializer.getEntry(fumatore_attivo___not___null));
        }
        if (gamma_gt___eq != null) {
            joiner.add("gamma_gt___eq: " + GraphQLRequestSerializer.getEntry(gamma_gt___eq));
        }
        if (gamma_gt___ne != null) {
            joiner.add("gamma_gt___ne: " + GraphQLRequestSerializer.getEntry(gamma_gt___ne));
        }
        if (gamma_gt___null != null) {
            joiner.add("gamma_gt___null: " + GraphQLRequestSerializer.getEntry(gamma_gt___null));
        }
        if (gamma_gt___not___null != null) {
            joiner.add("gamma_gt___not___null: " + GraphQLRequestSerializer.getEntry(gamma_gt___not___null));
        }
        if (gamma_gt___in != null) {
            joiner.add("gamma_gt___in: " + GraphQLRequestSerializer.getEntry(gamma_gt___in));
        }
        if (gamma_gt___not___in != null) {
            joiner.add("gamma_gt___not___in: " + GraphQLRequestSerializer.getEntry(gamma_gt___not___in));
        }
        if (gamma_gt___lt != null) {
            joiner.add("gamma_gt___lt: " + GraphQLRequestSerializer.getEntry(gamma_gt___lt));
        }
        if (gamma_gt___lte != null) {
            joiner.add("gamma_gt___lte: " + GraphQLRequestSerializer.getEntry(gamma_gt___lte));
        }
        if (gamma_gt___gt != null) {
            joiner.add("gamma_gt___gt: " + GraphQLRequestSerializer.getEntry(gamma_gt___gt));
        }
        if (gamma_gt___gte != null) {
            joiner.add("gamma_gt___gte: " + GraphQLRequestSerializer.getEntry(gamma_gt___gte));
        }
        if (glicemia___eq != null) {
            joiner.add("glicemia___eq: " + GraphQLRequestSerializer.getEntry(glicemia___eq));
        }
        if (glicemia___ne != null) {
            joiner.add("glicemia___ne: " + GraphQLRequestSerializer.getEntry(glicemia___ne));
        }
        if (glicemia___null != null) {
            joiner.add("glicemia___null: " + GraphQLRequestSerializer.getEntry(glicemia___null));
        }
        if (glicemia___not___null != null) {
            joiner.add("glicemia___not___null: " + GraphQLRequestSerializer.getEntry(glicemia___not___null));
        }
        if (glicemia___in != null) {
            joiner.add("glicemia___in: " + GraphQLRequestSerializer.getEntry(glicemia___in));
        }
        if (glicemia___not___in != null) {
            joiner.add("glicemia___not___in: " + GraphQLRequestSerializer.getEntry(glicemia___not___in));
        }
        if (glicemia___lt != null) {
            joiner.add("glicemia___lt: " + GraphQLRequestSerializer.getEntry(glicemia___lt));
        }
        if (glicemia___lte != null) {
            joiner.add("glicemia___lte: " + GraphQLRequestSerializer.getEntry(glicemia___lte));
        }
        if (glicemia___gt != null) {
            joiner.add("glicemia___gt: " + GraphQLRequestSerializer.getEntry(glicemia___gt));
        }
        if (glicemia___gte != null) {
            joiner.add("glicemia___gte: " + GraphQLRequestSerializer.getEntry(glicemia___gte));
        }
        if (globuli_bianchi___eq != null) {
            joiner.add("globuli_bianchi___eq: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___eq));
        }
        if (globuli_bianchi___ne != null) {
            joiner.add("globuli_bianchi___ne: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___ne));
        }
        if (globuli_bianchi___null != null) {
            joiner.add("globuli_bianchi___null: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___null));
        }
        if (globuli_bianchi___not___null != null) {
            joiner.add("globuli_bianchi___not___null: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___not___null));
        }
        if (globuli_bianchi___in != null) {
            joiner.add("globuli_bianchi___in: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___in));
        }
        if (globuli_bianchi___not___in != null) {
            joiner.add("globuli_bianchi___not___in: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___not___in));
        }
        if (globuli_bianchi___lt != null) {
            joiner.add("globuli_bianchi___lt: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___lt));
        }
        if (globuli_bianchi___lte != null) {
            joiner.add("globuli_bianchi___lte: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___lte));
        }
        if (globuli_bianchi___gt != null) {
            joiner.add("globuli_bianchi___gt: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___gt));
        }
        if (globuli_bianchi___gte != null) {
            joiner.add("globuli_bianchi___gte: " + GraphQLRequestSerializer.getEntry(globuli_bianchi___gte));
        }
        if (gravidanza___eq != null) {
            joiner.add("gravidanza___eq: " + GraphQLRequestSerializer.getEntry(gravidanza___eq));
        }
        if (gravidanza___ne != null) {
            joiner.add("gravidanza___ne: " + GraphQLRequestSerializer.getEntry(gravidanza___ne));
        }
        if (gravidanza___null != null) {
            joiner.add("gravidanza___null: " + GraphQLRequestSerializer.getEntry(gravidanza___null));
        }
        if (gravidanza___not___null != null) {
            joiner.add("gravidanza___not___null: " + GraphQLRequestSerializer.getEntry(gravidanza___not___null));
        }
        if (havabtotali___eq != null) {
            joiner.add("havabtotali___eq: " + GraphQLRequestSerializer.getEntry(havabtotali___eq));
        }
        if (havabtotali___ne != null) {
            joiner.add("havabtotali___ne: " + GraphQLRequestSerializer.getEntry(havabtotali___ne));
        }
        if (havabtotali___null != null) {
            joiner.add("havabtotali___null: " + GraphQLRequestSerializer.getEntry(havabtotali___null));
        }
        if (havabtotali___not___null != null) {
            joiner.add("havabtotali___not___null: " + GraphQLRequestSerializer.getEntry(havabtotali___not___null));
        }
        if (havigm___eq != null) {
            joiner.add("havigm___eq: " + GraphQLRequestSerializer.getEntry(havigm___eq));
        }
        if (havigm___ne != null) {
            joiner.add("havigm___ne: " + GraphQLRequestSerializer.getEntry(havigm___ne));
        }
        if (havigm___null != null) {
            joiner.add("havigm___null: " + GraphQLRequestSerializer.getEntry(havigm___null));
        }
        if (havigm___not___null != null) {
            joiner.add("havigm___not___null: " + GraphQLRequestSerializer.getEntry(havigm___not___null));
        }
        if (hbcab___eq != null) {
            joiner.add("hbcab___eq: " + GraphQLRequestSerializer.getEntry(hbcab___eq));
        }
        if (hbcab___ne != null) {
            joiner.add("hbcab___ne: " + GraphQLRequestSerializer.getEntry(hbcab___ne));
        }
        if (hbcab___null != null) {
            joiner.add("hbcab___null: " + GraphQLRequestSerializer.getEntry(hbcab___null));
        }
        if (hbcab___not___null != null) {
            joiner.add("hbcab___not___null: " + GraphQLRequestSerializer.getEntry(hbcab___not___null));
        }
        if (hbcigm___eq != null) {
            joiner.add("hbcigm___eq: " + GraphQLRequestSerializer.getEntry(hbcigm___eq));
        }
        if (hbcigm___ne != null) {
            joiner.add("hbcigm___ne: " + GraphQLRequestSerializer.getEntry(hbcigm___ne));
        }
        if (hbcigm___null != null) {
            joiner.add("hbcigm___null: " + GraphQLRequestSerializer.getEntry(hbcigm___null));
        }
        if (hbcigm___not___null != null) {
            joiner.add("hbcigm___not___null: " + GraphQLRequestSerializer.getEntry(hbcigm___not___null));
        }
        if (hbeab___eq != null) {
            joiner.add("hbeab___eq: " + GraphQLRequestSerializer.getEntry(hbeab___eq));
        }
        if (hbeab___ne != null) {
            joiner.add("hbeab___ne: " + GraphQLRequestSerializer.getEntry(hbeab___ne));
        }
        if (hbeab___null != null) {
            joiner.add("hbeab___null: " + GraphQLRequestSerializer.getEntry(hbeab___null));
        }
        if (hbeab___not___null != null) {
            joiner.add("hbeab___not___null: " + GraphQLRequestSerializer.getEntry(hbeab___not___null));
        }
        if (hbeag___eq != null) {
            joiner.add("hbeag___eq: " + GraphQLRequestSerializer.getEntry(hbeag___eq));
        }
        if (hbeag___ne != null) {
            joiner.add("hbeag___ne: " + GraphQLRequestSerializer.getEntry(hbeag___ne));
        }
        if (hbeag___null != null) {
            joiner.add("hbeag___null: " + GraphQLRequestSerializer.getEntry(hbeag___null));
        }
        if (hbeag___not___null != null) {
            joiner.add("hbeag___not___null: " + GraphQLRequestSerializer.getEntry(hbeag___not___null));
        }
        if (hbsab___eq != null) {
            joiner.add("hbsab___eq: " + GraphQLRequestSerializer.getEntry(hbsab___eq));
        }
        if (hbsab___ne != null) {
            joiner.add("hbsab___ne: " + GraphQLRequestSerializer.getEntry(hbsab___ne));
        }
        if (hbsab___null != null) {
            joiner.add("hbsab___null: " + GraphQLRequestSerializer.getEntry(hbsab___null));
        }
        if (hbsab___not___null != null) {
            joiner.add("hbsab___not___null: " + GraphQLRequestSerializer.getEntry(hbsab___not___null));
        }
        if (hbsab_totali___eq != null) {
            joiner.add("hbsab_totali___eq: " + GraphQLRequestSerializer.getEntry(hbsab_totali___eq));
        }
        if (hbsab_totali___ne != null) {
            joiner.add("hbsab_totali___ne: " + GraphQLRequestSerializer.getEntry(hbsab_totali___ne));
        }
        if (hbsab_totali___null != null) {
            joiner.add("hbsab_totali___null: " + GraphQLRequestSerializer.getEntry(hbsab_totali___null));
        }
        if (hbsab_totali___not___null != null) {
            joiner.add("hbsab_totali___not___null: " + GraphQLRequestSerializer.getEntry(hbsab_totali___not___null));
        }
        if (hbsab_totali___in != null) {
            joiner.add("hbsab_totali___in: " + GraphQLRequestSerializer.getEntry(hbsab_totali___in));
        }
        if (hbsab_totali___not___in != null) {
            joiner.add("hbsab_totali___not___in: " + GraphQLRequestSerializer.getEntry(hbsab_totali___not___in));
        }
        if (hbsab_totali___lt != null) {
            joiner.add("hbsab_totali___lt: " + GraphQLRequestSerializer.getEntry(hbsab_totali___lt));
        }
        if (hbsab_totali___lte != null) {
            joiner.add("hbsab_totali___lte: " + GraphQLRequestSerializer.getEntry(hbsab_totali___lte));
        }
        if (hbsab_totali___gt != null) {
            joiner.add("hbsab_totali___gt: " + GraphQLRequestSerializer.getEntry(hbsab_totali___gt));
        }
        if (hbsab_totali___gte != null) {
            joiner.add("hbsab_totali___gte: " + GraphQLRequestSerializer.getEntry(hbsab_totali___gte));
        }
        if (hbsag___eq != null) {
            joiner.add("hbsag___eq: " + GraphQLRequestSerializer.getEntry(hbsag___eq));
        }
        if (hbsag___ne != null) {
            joiner.add("hbsag___ne: " + GraphQLRequestSerializer.getEntry(hbsag___ne));
        }
        if (hbsag___null != null) {
            joiner.add("hbsag___null: " + GraphQLRequestSerializer.getEntry(hbsag___null));
        }
        if (hbsag___not___null != null) {
            joiner.add("hbsag___not___null: " + GraphQLRequestSerializer.getEntry(hbsag___not___null));
        }
        if (hbsag_totali___eq != null) {
            joiner.add("hbsag_totali___eq: " + GraphQLRequestSerializer.getEntry(hbsag_totali___eq));
        }
        if (hbsag_totali___ne != null) {
            joiner.add("hbsag_totali___ne: " + GraphQLRequestSerializer.getEntry(hbsag_totali___ne));
        }
        if (hbsag_totali___null != null) {
            joiner.add("hbsag_totali___null: " + GraphQLRequestSerializer.getEntry(hbsag_totali___null));
        }
        if (hbsag_totali___not___null != null) {
            joiner.add("hbsag_totali___not___null: " + GraphQLRequestSerializer.getEntry(hbsag_totali___not___null));
        }
        if (hbsag_totali___in != null) {
            joiner.add("hbsag_totali___in: " + GraphQLRequestSerializer.getEntry(hbsag_totali___in));
        }
        if (hbsag_totali___not___in != null) {
            joiner.add("hbsag_totali___not___in: " + GraphQLRequestSerializer.getEntry(hbsag_totali___not___in));
        }
        if (hbsag_totali___lt != null) {
            joiner.add("hbsag_totali___lt: " + GraphQLRequestSerializer.getEntry(hbsag_totali___lt));
        }
        if (hbsag_totali___lte != null) {
            joiner.add("hbsag_totali___lte: " + GraphQLRequestSerializer.getEntry(hbsag_totali___lte));
        }
        if (hbsag_totali___gt != null) {
            joiner.add("hbsag_totali___gt: " + GraphQLRequestSerializer.getEntry(hbsag_totali___gt));
        }
        if (hbsag_totali___gte != null) {
            joiner.add("hbsag_totali___gte: " + GraphQLRequestSerializer.getEntry(hbsag_totali___gte));
        }
        if (hcvab___eq != null) {
            joiner.add("hcvab___eq: " + GraphQLRequestSerializer.getEntry(hcvab___eq));
        }
        if (hcvab___ne != null) {
            joiner.add("hcvab___ne: " + GraphQLRequestSerializer.getEntry(hcvab___ne));
        }
        if (hcvab___null != null) {
            joiner.add("hcvab___null: " + GraphQLRequestSerializer.getEntry(hcvab___null));
        }
        if (hcvab___not___null != null) {
            joiner.add("hcvab___not___null: " + GraphQLRequestSerializer.getEntry(hcvab___not___null));
        }
        if (hcvag___eq != null) {
            joiner.add("hcvag___eq: " + GraphQLRequestSerializer.getEntry(hcvag___eq));
        }
        if (hcvag___ne != null) {
            joiner.add("hcvag___ne: " + GraphQLRequestSerializer.getEntry(hcvag___ne));
        }
        if (hcvag___null != null) {
            joiner.add("hcvag___null: " + GraphQLRequestSerializer.getEntry(hcvag___null));
        }
        if (hcvag___not___null != null) {
            joiner.add("hcvag___not___null: " + GraphQLRequestSerializer.getEntry(hcvag___not___null));
        }
        if (hdvab___eq != null) {
            joiner.add("hdvab___eq: " + GraphQLRequestSerializer.getEntry(hdvab___eq));
        }
        if (hdvab___ne != null) {
            joiner.add("hdvab___ne: " + GraphQLRequestSerializer.getEntry(hdvab___ne));
        }
        if (hdvab___null != null) {
            joiner.add("hdvab___null: " + GraphQLRequestSerializer.getEntry(hdvab___null));
        }
        if (hdvab___not___null != null) {
            joiner.add("hdvab___not___null: " + GraphQLRequestSerializer.getEntry(hdvab___not___null));
        }
        if (hdvab_igg___eq != null) {
            joiner.add("hdvab_igg___eq: " + GraphQLRequestSerializer.getEntry(hdvab_igg___eq));
        }
        if (hdvab_igg___ne != null) {
            joiner.add("hdvab_igg___ne: " + GraphQLRequestSerializer.getEntry(hdvab_igg___ne));
        }
        if (hdvab_igg___null != null) {
            joiner.add("hdvab_igg___null: " + GraphQLRequestSerializer.getEntry(hdvab_igg___null));
        }
        if (hdvab_igg___not___null != null) {
            joiner.add("hdvab_igg___not___null: " + GraphQLRequestSerializer.getEntry(hdvab_igg___not___null));
        }
        if (hdvabigm___eq != null) {
            joiner.add("hdvabigm___eq: " + GraphQLRequestSerializer.getEntry(hdvabigm___eq));
        }
        if (hdvabigm___ne != null) {
            joiner.add("hdvabigm___ne: " + GraphQLRequestSerializer.getEntry(hdvabigm___ne));
        }
        if (hdvabigm___null != null) {
            joiner.add("hdvabigm___null: " + GraphQLRequestSerializer.getEntry(hdvabigm___null));
        }
        if (hdvabigm___not___null != null) {
            joiner.add("hdvabigm___not___null: " + GraphQLRequestSerializer.getEntry(hdvabigm___not___null));
        }
        if (hdvabtotali___eq != null) {
            joiner.add("hdvabtotali___eq: " + GraphQLRequestSerializer.getEntry(hdvabtotali___eq));
        }
        if (hdvabtotali___ne != null) {
            joiner.add("hdvabtotali___ne: " + GraphQLRequestSerializer.getEntry(hdvabtotali___ne));
        }
        if (hdvabtotali___null != null) {
            joiner.add("hdvabtotali___null: " + GraphQLRequestSerializer.getEntry(hdvabtotali___null));
        }
        if (hdvabtotali___not___null != null) {
            joiner.add("hdvabtotali___not___null: " + GraphQLRequestSerializer.getEntry(hdvabtotali___not___null));
        }
        if (hdvabtotali___in != null) {
            joiner.add("hdvabtotali___in: " + GraphQLRequestSerializer.getEntry(hdvabtotali___in));
        }
        if (hdvabtotali___not___in != null) {
            joiner.add("hdvabtotali___not___in: " + GraphQLRequestSerializer.getEntry(hdvabtotali___not___in));
        }
        if (hdvabtotali___lt != null) {
            joiner.add("hdvabtotali___lt: " + GraphQLRequestSerializer.getEntry(hdvabtotali___lt));
        }
        if (hdvabtotali___lte != null) {
            joiner.add("hdvabtotali___lte: " + GraphQLRequestSerializer.getEntry(hdvabtotali___lte));
        }
        if (hdvabtotali___gt != null) {
            joiner.add("hdvabtotali___gt: " + GraphQLRequestSerializer.getEntry(hdvabtotali___gt));
        }
        if (hdvabtotali___gte != null) {
            joiner.add("hdvabtotali___gte: " + GraphQLRequestSerializer.getEntry(hdvabtotali___gte));
        }
        if (interruzioni___eq != null) {
            joiner.add("interruzioni___eq: " + GraphQLRequestSerializer.getEntry(interruzioni___eq));
        }
        if (interruzioni___ne != null) {
            joiner.add("interruzioni___ne: " + GraphQLRequestSerializer.getEntry(interruzioni___ne));
        }
        if (interruzioni___null != null) {
            joiner.add("interruzioni___null: " + GraphQLRequestSerializer.getEntry(interruzioni___null));
        }
        if (interruzioni___not___null != null) {
            joiner.add("interruzioni___not___null: " + GraphQLRequestSerializer.getEntry(interruzioni___not___null));
        }
        if (mdw___eq != null) {
            joiner.add("mdw___eq: " + GraphQLRequestSerializer.getEntry(mdw___eq));
        }
        if (mdw___ne != null) {
            joiner.add("mdw___ne: " + GraphQLRequestSerializer.getEntry(mdw___ne));
        }
        if (mdw___null != null) {
            joiner.add("mdw___null: " + GraphQLRequestSerializer.getEntry(mdw___null));
        }
        if (mdw___not___null != null) {
            joiner.add("mdw___not___null: " + GraphQLRequestSerializer.getEntry(mdw___not___null));
        }
        if (mdw___in != null) {
            joiner.add("mdw___in: " + GraphQLRequestSerializer.getEntry(mdw___in));
        }
        if (mdw___not___in != null) {
            joiner.add("mdw___not___in: " + GraphQLRequestSerializer.getEntry(mdw___not___in));
        }
        if (mdw___lt != null) {
            joiner.add("mdw___lt: " + GraphQLRequestSerializer.getEntry(mdw___lt));
        }
        if (mdw___lte != null) {
            joiner.add("mdw___lte: " + GraphQLRequestSerializer.getEntry(mdw___lte));
        }
        if (mdw___gt != null) {
            joiner.add("mdw___gt: " + GraphQLRequestSerializer.getEntry(mdw___gt));
        }
        if (mdw___gte != null) {
            joiner.add("mdw___gte: " + GraphQLRequestSerializer.getEntry(mdw___gte));
        }
        if (metodica_vitamina_D_2___eq != null) {
            joiner.add("metodica_vitamina_D_2___eq: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___eq));
        }
        if (metodica_vitamina_D_2___ne != null) {
            joiner.add("metodica_vitamina_D_2___ne: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___ne));
        }
        if (metodica_vitamina_D_2___null != null) {
            joiner.add("metodica_vitamina_D_2___null: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___null));
        }
        if (metodica_vitamina_D_2___not___null != null) {
            joiner.add("metodica_vitamina_D_2___not___null: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___not___null));
        }
        if (metodica_vitamina_D_2___in != null) {
            joiner.add("metodica_vitamina_D_2___in: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___in));
        }
        if (metodica_vitamina_D_2___not___in != null) {
            joiner.add("metodica_vitamina_D_2___not___in: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___not___in));
        }
        if (metodica_vitamina_D_2___lt != null) {
            joiner.add("metodica_vitamina_D_2___lt: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___lt));
        }
        if (metodica_vitamina_D_2___lte != null) {
            joiner.add("metodica_vitamina_D_2___lte: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___lte));
        }
        if (metodica_vitamina_D_2___gt != null) {
            joiner.add("metodica_vitamina_D_2___gt: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___gt));
        }
        if (metodica_vitamina_D_2___gte != null) {
            joiner.add("metodica_vitamina_D_2___gte: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___gte));
        }
        if (metodica_vitamina_D_2___contains != null) {
            joiner.add("metodica_vitamina_D_2___contains: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___contains));
        }
        if (metodica_vitamina_D_2___not___contains != null) {
            joiner.add("metodica_vitamina_D_2___not___contains: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___not___contains));
        }
        if (metodica_vitamina_D_2___starts_with != null) {
            joiner.add("metodica_vitamina_D_2___starts_with: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___starts_with));
        }
        if (metodica_vitamina_D_2___not___starts_with != null) {
            joiner.add("metodica_vitamina_D_2___not___starts_with: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___not___starts_with));
        }
        if (metodica_vitamina_D_2___ends_with != null) {
            joiner.add("metodica_vitamina_D_2___ends_with: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___ends_with));
        }
        if (metodica_vitamina_D_2___not___ends_with != null) {
            joiner.add("metodica_vitamina_D_2___not___ends_with: " + GraphQLRequestSerializer.getEntry(metodica_vitamina_D_2___not___ends_with));
        }
        if (monociti___eq != null) {
            joiner.add("monociti___eq: " + GraphQLRequestSerializer.getEntry(monociti___eq));
        }
        if (monociti___ne != null) {
            joiner.add("monociti___ne: " + GraphQLRequestSerializer.getEntry(monociti___ne));
        }
        if (monociti___null != null) {
            joiner.add("monociti___null: " + GraphQLRequestSerializer.getEntry(monociti___null));
        }
        if (monociti___not___null != null) {
            joiner.add("monociti___not___null: " + GraphQLRequestSerializer.getEntry(monociti___not___null));
        }
        if (monociti___in != null) {
            joiner.add("monociti___in: " + GraphQLRequestSerializer.getEntry(monociti___in));
        }
        if (monociti___not___in != null) {
            joiner.add("monociti___not___in: " + GraphQLRequestSerializer.getEntry(monociti___not___in));
        }
        if (monociti___lt != null) {
            joiner.add("monociti___lt: " + GraphQLRequestSerializer.getEntry(monociti___lt));
        }
        if (monociti___lte != null) {
            joiner.add("monociti___lte: " + GraphQLRequestSerializer.getEntry(monociti___lte));
        }
        if (monociti___gt != null) {
            joiner.add("monociti___gt: " + GraphQLRequestSerializer.getEntry(monociti___gt));
        }
        if (monociti___gte != null) {
            joiner.add("monociti___gte: " + GraphQLRequestSerializer.getEntry(monociti___gte));
        }
        if (non_trepon___eq != null) {
            joiner.add("non_trepon___eq: " + GraphQLRequestSerializer.getEntry(non_trepon___eq));
        }
        if (non_trepon___ne != null) {
            joiner.add("non_trepon___ne: " + GraphQLRequestSerializer.getEntry(non_trepon___ne));
        }
        if (non_trepon___null != null) {
            joiner.add("non_trepon___null: " + GraphQLRequestSerializer.getEntry(non_trepon___null));
        }
        if (non_trepon___not___null != null) {
            joiner.add("non_trepon___not___null: " + GraphQLRequestSerializer.getEntry(non_trepon___not___null));
        }
        if (nr_neutrofili___eq != null) {
            joiner.add("nr_neutrofili___eq: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___eq));
        }
        if (nr_neutrofili___ne != null) {
            joiner.add("nr_neutrofili___ne: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___ne));
        }
        if (nr_neutrofili___null != null) {
            joiner.add("nr_neutrofili___null: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___null));
        }
        if (nr_neutrofili___not___null != null) {
            joiner.add("nr_neutrofili___not___null: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___not___null));
        }
        if (nr_neutrofili___in != null) {
            joiner.add("nr_neutrofili___in: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___in));
        }
        if (nr_neutrofili___not___in != null) {
            joiner.add("nr_neutrofili___not___in: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___not___in));
        }
        if (nr_neutrofili___lt != null) {
            joiner.add("nr_neutrofili___lt: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___lt));
        }
        if (nr_neutrofili___lte != null) {
            joiner.add("nr_neutrofili___lte: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___lte));
        }
        if (nr_neutrofili___gt != null) {
            joiner.add("nr_neutrofili___gt: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___gt));
        }
        if (nr_neutrofili___gte != null) {
            joiner.add("nr_neutrofili___gte: " + GraphQLRequestSerializer.getEntry(nr_neutrofili___gte));
        }
        if (omissione___eq != null) {
            joiner.add("omissione___eq: " + GraphQLRequestSerializer.getEntry(omissione___eq));
        }
        if (omissione___ne != null) {
            joiner.add("omissione___ne: " + GraphQLRequestSerializer.getEntry(omissione___ne));
        }
        if (omissione___null != null) {
            joiner.add("omissione___null: " + GraphQLRequestSerializer.getEntry(omissione___null));
        }
        if (omissione___not___null != null) {
            joiner.add("omissione___not___null: " + GraphQLRequestSerializer.getEntry(omissione___not___null));
        }
        if (pa_max___eq != null) {
            joiner.add("pa_max___eq: " + GraphQLRequestSerializer.getEntry(pa_max___eq));
        }
        if (pa_max___ne != null) {
            joiner.add("pa_max___ne: " + GraphQLRequestSerializer.getEntry(pa_max___ne));
        }
        if (pa_max___null != null) {
            joiner.add("pa_max___null: " + GraphQLRequestSerializer.getEntry(pa_max___null));
        }
        if (pa_max___not___null != null) {
            joiner.add("pa_max___not___null: " + GraphQLRequestSerializer.getEntry(pa_max___not___null));
        }
        if (pa_max___in != null) {
            joiner.add("pa_max___in: " + GraphQLRequestSerializer.getEntry(pa_max___in));
        }
        if (pa_max___not___in != null) {
            joiner.add("pa_max___not___in: " + GraphQLRequestSerializer.getEntry(pa_max___not___in));
        }
        if (pa_max___lt != null) {
            joiner.add("pa_max___lt: " + GraphQLRequestSerializer.getEntry(pa_max___lt));
        }
        if (pa_max___lte != null) {
            joiner.add("pa_max___lte: " + GraphQLRequestSerializer.getEntry(pa_max___lte));
        }
        if (pa_max___gt != null) {
            joiner.add("pa_max___gt: " + GraphQLRequestSerializer.getEntry(pa_max___gt));
        }
        if (pa_max___gte != null) {
            joiner.add("pa_max___gte: " + GraphQLRequestSerializer.getEntry(pa_max___gte));
        }
        if (pa_min___eq != null) {
            joiner.add("pa_min___eq: " + GraphQLRequestSerializer.getEntry(pa_min___eq));
        }
        if (pa_min___ne != null) {
            joiner.add("pa_min___ne: " + GraphQLRequestSerializer.getEntry(pa_min___ne));
        }
        if (pa_min___null != null) {
            joiner.add("pa_min___null: " + GraphQLRequestSerializer.getEntry(pa_min___null));
        }
        if (pa_min___not___null != null) {
            joiner.add("pa_min___not___null: " + GraphQLRequestSerializer.getEntry(pa_min___not___null));
        }
        if (pa_min___in != null) {
            joiner.add("pa_min___in: " + GraphQLRequestSerializer.getEntry(pa_min___in));
        }
        if (pa_min___not___in != null) {
            joiner.add("pa_min___not___in: " + GraphQLRequestSerializer.getEntry(pa_min___not___in));
        }
        if (pa_min___lt != null) {
            joiner.add("pa_min___lt: " + GraphQLRequestSerializer.getEntry(pa_min___lt));
        }
        if (pa_min___lte != null) {
            joiner.add("pa_min___lte: " + GraphQLRequestSerializer.getEntry(pa_min___lte));
        }
        if (pa_min___gt != null) {
            joiner.add("pa_min___gt: " + GraphQLRequestSerializer.getEntry(pa_min___gt));
        }
        if (pa_min___gte != null) {
            joiner.add("pa_min___gte: " + GraphQLRequestSerializer.getEntry(pa_min___gte));
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
        if (peso___eq != null) {
            joiner.add("peso___eq: " + GraphQLRequestSerializer.getEntry(peso___eq));
        }
        if (peso___ne != null) {
            joiner.add("peso___ne: " + GraphQLRequestSerializer.getEntry(peso___ne));
        }
        if (peso___null != null) {
            joiner.add("peso___null: " + GraphQLRequestSerializer.getEntry(peso___null));
        }
        if (peso___not___null != null) {
            joiner.add("peso___not___null: " + GraphQLRequestSerializer.getEntry(peso___not___null));
        }
        if (peso___in != null) {
            joiner.add("peso___in: " + GraphQLRequestSerializer.getEntry(peso___in));
        }
        if (peso___not___in != null) {
            joiner.add("peso___not___in: " + GraphQLRequestSerializer.getEntry(peso___not___in));
        }
        if (peso___lt != null) {
            joiner.add("peso___lt: " + GraphQLRequestSerializer.getEntry(peso___lt));
        }
        if (peso___lte != null) {
            joiner.add("peso___lte: " + GraphQLRequestSerializer.getEntry(peso___lte));
        }
        if (peso___gt != null) {
            joiner.add("peso___gt: " + GraphQLRequestSerializer.getEntry(peso___gt));
        }
        if (peso___gte != null) {
            joiner.add("peso___gte: " + GraphQLRequestSerializer.getEntry(peso___gte));
        }
        if (piastrine___eq != null) {
            joiner.add("piastrine___eq: " + GraphQLRequestSerializer.getEntry(piastrine___eq));
        }
        if (piastrine___ne != null) {
            joiner.add("piastrine___ne: " + GraphQLRequestSerializer.getEntry(piastrine___ne));
        }
        if (piastrine___null != null) {
            joiner.add("piastrine___null: " + GraphQLRequestSerializer.getEntry(piastrine___null));
        }
        if (piastrine___not___null != null) {
            joiner.add("piastrine___not___null: " + GraphQLRequestSerializer.getEntry(piastrine___not___null));
        }
        if (piastrine___in != null) {
            joiner.add("piastrine___in: " + GraphQLRequestSerializer.getEntry(piastrine___in));
        }
        if (piastrine___not___in != null) {
            joiner.add("piastrine___not___in: " + GraphQLRequestSerializer.getEntry(piastrine___not___in));
        }
        if (piastrine___lt != null) {
            joiner.add("piastrine___lt: " + GraphQLRequestSerializer.getEntry(piastrine___lt));
        }
        if (piastrine___lte != null) {
            joiner.add("piastrine___lte: " + GraphQLRequestSerializer.getEntry(piastrine___lte));
        }
        if (piastrine___gt != null) {
            joiner.add("piastrine___gt: " + GraphQLRequestSerializer.getEntry(piastrine___gt));
        }
        if (piastrine___gte != null) {
            joiner.add("piastrine___gte: " + GraphQLRequestSerializer.getEntry(piastrine___gte));
        }
        if (proteinuria___eq != null) {
            joiner.add("proteinuria___eq: " + GraphQLRequestSerializer.getEntry(proteinuria___eq));
        }
        if (proteinuria___ne != null) {
            joiner.add("proteinuria___ne: " + GraphQLRequestSerializer.getEntry(proteinuria___ne));
        }
        if (proteinuria___null != null) {
            joiner.add("proteinuria___null: " + GraphQLRequestSerializer.getEntry(proteinuria___null));
        }
        if (proteinuria___not___null != null) {
            joiner.add("proteinuria___not___null: " + GraphQLRequestSerializer.getEntry(proteinuria___not___null));
        }
        if (proteinuria___in != null) {
            joiner.add("proteinuria___in: " + GraphQLRequestSerializer.getEntry(proteinuria___in));
        }
        if (proteinuria___not___in != null) {
            joiner.add("proteinuria___not___in: " + GraphQLRequestSerializer.getEntry(proteinuria___not___in));
        }
        if (proteinuria___lt != null) {
            joiner.add("proteinuria___lt: " + GraphQLRequestSerializer.getEntry(proteinuria___lt));
        }
        if (proteinuria___lte != null) {
            joiner.add("proteinuria___lte: " + GraphQLRequestSerializer.getEntry(proteinuria___lte));
        }
        if (proteinuria___gt != null) {
            joiner.add("proteinuria___gt: " + GraphQLRequestSerializer.getEntry(proteinuria___gt));
        }
        if (proteinuria___gte != null) {
            joiner.add("proteinuria___gte: " + GraphQLRequestSerializer.getEntry(proteinuria___gte));
        }
        if (questionario_str___eq != null) {
            joiner.add("questionario_str___eq: " + GraphQLRequestSerializer.getEntry(questionario_str___eq));
        }
        if (questionario_str___ne != null) {
            joiner.add("questionario_str___ne: " + GraphQLRequestSerializer.getEntry(questionario_str___ne));
        }
        if (questionario_str___null != null) {
            joiner.add("questionario_str___null: " + GraphQLRequestSerializer.getEntry(questionario_str___null));
        }
        if (questionario_str___not___null != null) {
            joiner.add("questionario_str___not___null: " + GraphQLRequestSerializer.getEntry(questionario_str___not___null));
        }
        if (sesso_ok___eq != null) {
            joiner.add("sesso_ok___eq: " + GraphQLRequestSerializer.getEntry(sesso_ok___eq));
        }
        if (sesso_ok___ne != null) {
            joiner.add("sesso_ok___ne: " + GraphQLRequestSerializer.getEntry(sesso_ok___ne));
        }
        if (sesso_ok___null != null) {
            joiner.add("sesso_ok___null: " + GraphQLRequestSerializer.getEntry(sesso_ok___null));
        }
        if (sesso_ok___not___null != null) {
            joiner.add("sesso_ok___not___null: " + GraphQLRequestSerializer.getEntry(sesso_ok___not___null));
        }
        if (sesso_ok___in != null) {
            joiner.add("sesso_ok___in: " + GraphQLRequestSerializer.getEntry(sesso_ok___in));
        }
        if (sesso_ok___not___in != null) {
            joiner.add("sesso_ok___not___in: " + GraphQLRequestSerializer.getEntry(sesso_ok___not___in));
        }
        if (sesso_ok___lt != null) {
            joiner.add("sesso_ok___lt: " + GraphQLRequestSerializer.getEntry(sesso_ok___lt));
        }
        if (sesso_ok___lte != null) {
            joiner.add("sesso_ok___lte: " + GraphQLRequestSerializer.getEntry(sesso_ok___lte));
        }
        if (sesso_ok___gt != null) {
            joiner.add("sesso_ok___gt: " + GraphQLRequestSerializer.getEntry(sesso_ok___gt));
        }
        if (sesso_ok___gte != null) {
            joiner.add("sesso_ok___gte: " + GraphQLRequestSerializer.getEntry(sesso_ok___gte));
        }
        if (sesso_ok___contains != null) {
            joiner.add("sesso_ok___contains: " + GraphQLRequestSerializer.getEntry(sesso_ok___contains));
        }
        if (sesso_ok___not___contains != null) {
            joiner.add("sesso_ok___not___contains: " + GraphQLRequestSerializer.getEntry(sesso_ok___not___contains));
        }
        if (sesso_ok___starts_with != null) {
            joiner.add("sesso_ok___starts_with: " + GraphQLRequestSerializer.getEntry(sesso_ok___starts_with));
        }
        if (sesso_ok___not___starts_with != null) {
            joiner.add("sesso_ok___not___starts_with: " + GraphQLRequestSerializer.getEntry(sesso_ok___not___starts_with));
        }
        if (sesso_ok___ends_with != null) {
            joiner.add("sesso_ok___ends_with: " + GraphQLRequestSerializer.getEntry(sesso_ok___ends_with));
        }
        if (sesso_ok___not___ends_with != null) {
            joiner.add("sesso_ok___not___ends_with: " + GraphQLRequestSerializer.getEntry(sesso_ok___not___ends_with));
        }
        if (superalcolici___eq != null) {
            joiner.add("superalcolici___eq: " + GraphQLRequestSerializer.getEntry(superalcolici___eq));
        }
        if (superalcolici___ne != null) {
            joiner.add("superalcolici___ne: " + GraphQLRequestSerializer.getEntry(superalcolici___ne));
        }
        if (superalcolici___null != null) {
            joiner.add("superalcolici___null: " + GraphQLRequestSerializer.getEntry(superalcolici___null));
        }
        if (superalcolici___not___null != null) {
            joiner.add("superalcolici___not___null: " + GraphQLRequestSerializer.getEntry(superalcolici___not___null));
        }
        if (superalcolici___in != null) {
            joiner.add("superalcolici___in: " + GraphQLRequestSerializer.getEntry(superalcolici___in));
        }
        if (superalcolici___not___in != null) {
            joiner.add("superalcolici___not___in: " + GraphQLRequestSerializer.getEntry(superalcolici___not___in));
        }
        if (superalcolici___lt != null) {
            joiner.add("superalcolici___lt: " + GraphQLRequestSerializer.getEntry(superalcolici___lt));
        }
        if (superalcolici___lte != null) {
            joiner.add("superalcolici___lte: " + GraphQLRequestSerializer.getEntry(superalcolici___lte));
        }
        if (superalcolici___gt != null) {
            joiner.add("superalcolici___gt: " + GraphQLRequestSerializer.getEntry(superalcolici___gt));
        }
        if (superalcolici___gte != null) {
            joiner.add("superalcolici___gte: " + GraphQLRequestSerializer.getEntry(superalcolici___gte));
        }
        if (tossicodip_attivo___eq != null) {
            joiner.add("tossicodip_attivo___eq: " + GraphQLRequestSerializer.getEntry(tossicodip_attivo___eq));
        }
        if (tossicodip_attivo___ne != null) {
            joiner.add("tossicodip_attivo___ne: " + GraphQLRequestSerializer.getEntry(tossicodip_attivo___ne));
        }
        if (tossicodip_attivo___null != null) {
            joiner.add("tossicodip_attivo___null: " + GraphQLRequestSerializer.getEntry(tossicodip_attivo___null));
        }
        if (tossicodip_attivo___not___null != null) {
            joiner.add("tossicodip_attivo___not___null: " + GraphQLRequestSerializer.getEntry(tossicodip_attivo___not___null));
        }
        if (toxoigg___eq != null) {
            joiner.add("toxoigg___eq: " + GraphQLRequestSerializer.getEntry(toxoigg___eq));
        }
        if (toxoigg___ne != null) {
            joiner.add("toxoigg___ne: " + GraphQLRequestSerializer.getEntry(toxoigg___ne));
        }
        if (toxoigg___null != null) {
            joiner.add("toxoigg___null: " + GraphQLRequestSerializer.getEntry(toxoigg___null));
        }
        if (toxoigg___not___null != null) {
            joiner.add("toxoigg___not___null: " + GraphQLRequestSerializer.getEntry(toxoigg___not___null));
        }
        if (trepon___eq != null) {
            joiner.add("trepon___eq: " + GraphQLRequestSerializer.getEntry(trepon___eq));
        }
        if (trepon___ne != null) {
            joiner.add("trepon___ne: " + GraphQLRequestSerializer.getEntry(trepon___ne));
        }
        if (trepon___null != null) {
            joiner.add("trepon___null: " + GraphQLRequestSerializer.getEntry(trepon___null));
        }
        if (trepon___not___null != null) {
            joiner.add("trepon___not___null: " + GraphQLRequestSerializer.getEntry(trepon___not___null));
        }
        if (trigliceridi___eq != null) {
            joiner.add("trigliceridi___eq: " + GraphQLRequestSerializer.getEntry(trigliceridi___eq));
        }
        if (trigliceridi___ne != null) {
            joiner.add("trigliceridi___ne: " + GraphQLRequestSerializer.getEntry(trigliceridi___ne));
        }
        if (trigliceridi___null != null) {
            joiner.add("trigliceridi___null: " + GraphQLRequestSerializer.getEntry(trigliceridi___null));
        }
        if (trigliceridi___not___null != null) {
            joiner.add("trigliceridi___not___null: " + GraphQLRequestSerializer.getEntry(trigliceridi___not___null));
        }
        if (trigliceridi___in != null) {
            joiner.add("trigliceridi___in: " + GraphQLRequestSerializer.getEntry(trigliceridi___in));
        }
        if (trigliceridi___not___in != null) {
            joiner.add("trigliceridi___not___in: " + GraphQLRequestSerializer.getEntry(trigliceridi___not___in));
        }
        if (trigliceridi___lt != null) {
            joiner.add("trigliceridi___lt: " + GraphQLRequestSerializer.getEntry(trigliceridi___lt));
        }
        if (trigliceridi___lte != null) {
            joiner.add("trigliceridi___lte: " + GraphQLRequestSerializer.getEntry(trigliceridi___lte));
        }
        if (trigliceridi___gt != null) {
            joiner.add("trigliceridi___gt: " + GraphQLRequestSerializer.getEntry(trigliceridi___gt));
        }
        if (trigliceridi___gte != null) {
            joiner.add("trigliceridi___gte: " + GraphQLRequestSerializer.getEntry(trigliceridi___gte));
        }
        if (unita_vitamina_D___eq != null) {
            joiner.add("unita_vitamina_D___eq: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___eq));
        }
        if (unita_vitamina_D___ne != null) {
            joiner.add("unita_vitamina_D___ne: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___ne));
        }
        if (unita_vitamina_D___null != null) {
            joiner.add("unita_vitamina_D___null: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___null));
        }
        if (unita_vitamina_D___not___null != null) {
            joiner.add("unita_vitamina_D___not___null: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___not___null));
        }
        if (unita_vitamina_D___in != null) {
            joiner.add("unita_vitamina_D___in: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___in));
        }
        if (unita_vitamina_D___not___in != null) {
            joiner.add("unita_vitamina_D___not___in: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___not___in));
        }
        if (unita_vitamina_D___lt != null) {
            joiner.add("unita_vitamina_D___lt: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___lt));
        }
        if (unita_vitamina_D___lte != null) {
            joiner.add("unita_vitamina_D___lte: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___lte));
        }
        if (unita_vitamina_D___gt != null) {
            joiner.add("unita_vitamina_D___gt: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___gt));
        }
        if (unita_vitamina_D___gte != null) {
            joiner.add("unita_vitamina_D___gte: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___gte));
        }
        if (unita_vitamina_D___contains != null) {
            joiner.add("unita_vitamina_D___contains: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___contains));
        }
        if (unita_vitamina_D___not___contains != null) {
            joiner.add("unita_vitamina_D___not___contains: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___not___contains));
        }
        if (unita_vitamina_D___starts_with != null) {
            joiner.add("unita_vitamina_D___starts_with: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___starts_with));
        }
        if (unita_vitamina_D___not___starts_with != null) {
            joiner.add("unita_vitamina_D___not___starts_with: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___not___starts_with));
        }
        if (unita_vitamina_D___ends_with != null) {
            joiner.add("unita_vitamina_D___ends_with: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___ends_with));
        }
        if (unita_vitamina_D___not___ends_with != null) {
            joiner.add("unita_vitamina_D___not___ends_with: " + GraphQLRequestSerializer.getEntry(unita_vitamina_D___not___ends_with));
        }
        if (vas___eq != null) {
            joiner.add("vas___eq: " + GraphQLRequestSerializer.getEntry(vas___eq));
        }
        if (vas___ne != null) {
            joiner.add("vas___ne: " + GraphQLRequestSerializer.getEntry(vas___ne));
        }
        if (vas___null != null) {
            joiner.add("vas___null: " + GraphQLRequestSerializer.getEntry(vas___null));
        }
        if (vas___not___null != null) {
            joiner.add("vas___not___null: " + GraphQLRequestSerializer.getEntry(vas___not___null));
        }
        if (vas___in != null) {
            joiner.add("vas___in: " + GraphQLRequestSerializer.getEntry(vas___in));
        }
        if (vas___not___in != null) {
            joiner.add("vas___not___in: " + GraphQLRequestSerializer.getEntry(vas___not___in));
        }
        if (vas___lt != null) {
            joiner.add("vas___lt: " + GraphQLRequestSerializer.getEntry(vas___lt));
        }
        if (vas___lte != null) {
            joiner.add("vas___lte: " + GraphQLRequestSerializer.getEntry(vas___lte));
        }
        if (vas___gt != null) {
            joiner.add("vas___gt: " + GraphQLRequestSerializer.getEntry(vas___gt));
        }
        if (vas___gte != null) {
            joiner.add("vas___gte: " + GraphQLRequestSerializer.getEntry(vas___gte));
        }
        if (vas_globale___eq != null) {
            joiner.add("vas_globale___eq: " + GraphQLRequestSerializer.getEntry(vas_globale___eq));
        }
        if (vas_globale___ne != null) {
            joiner.add("vas_globale___ne: " + GraphQLRequestSerializer.getEntry(vas_globale___ne));
        }
        if (vas_globale___null != null) {
            joiner.add("vas_globale___null: " + GraphQLRequestSerializer.getEntry(vas_globale___null));
        }
        if (vas_globale___not___null != null) {
            joiner.add("vas_globale___not___null: " + GraphQLRequestSerializer.getEntry(vas_globale___not___null));
        }
        if (vas_globale___in != null) {
            joiner.add("vas_globale___in: " + GraphQLRequestSerializer.getEntry(vas_globale___in));
        }
        if (vas_globale___not___in != null) {
            joiner.add("vas_globale___not___in: " + GraphQLRequestSerializer.getEntry(vas_globale___not___in));
        }
        if (vas_globale___lt != null) {
            joiner.add("vas_globale___lt: " + GraphQLRequestSerializer.getEntry(vas_globale___lt));
        }
        if (vas_globale___lte != null) {
            joiner.add("vas_globale___lte: " + GraphQLRequestSerializer.getEntry(vas_globale___lte));
        }
        if (vas_globale___gt != null) {
            joiner.add("vas_globale___gt: " + GraphQLRequestSerializer.getEntry(vas_globale___gt));
        }
        if (vas_globale___gte != null) {
            joiner.add("vas_globale___gte: " + GraphQLRequestSerializer.getEntry(vas_globale___gte));
        }
        if (vino___eq != null) {
            joiner.add("vino___eq: " + GraphQLRequestSerializer.getEntry(vino___eq));
        }
        if (vino___ne != null) {
            joiner.add("vino___ne: " + GraphQLRequestSerializer.getEntry(vino___ne));
        }
        if (vino___null != null) {
            joiner.add("vino___null: " + GraphQLRequestSerializer.getEntry(vino___null));
        }
        if (vino___not___null != null) {
            joiner.add("vino___not___null: " + GraphQLRequestSerializer.getEntry(vino___not___null));
        }
        if (vino___in != null) {
            joiner.add("vino___in: " + GraphQLRequestSerializer.getEntry(vino___in));
        }
        if (vino___not___in != null) {
            joiner.add("vino___not___in: " + GraphQLRequestSerializer.getEntry(vino___not___in));
        }
        if (vino___lt != null) {
            joiner.add("vino___lt: " + GraphQLRequestSerializer.getEntry(vino___lt));
        }
        if (vino___lte != null) {
            joiner.add("vino___lte: " + GraphQLRequestSerializer.getEntry(vino___lte));
        }
        if (vino___gt != null) {
            joiner.add("vino___gt: " + GraphQLRequestSerializer.getEntry(vino___gt));
        }
        if (vino___gte != null) {
            joiner.add("vino___gte: " + GraphQLRequestSerializer.getEntry(vino___gte));
        }
        if (vitamina_D___eq != null) {
            joiner.add("vitamina_D___eq: " + GraphQLRequestSerializer.getEntry(vitamina_D___eq));
        }
        if (vitamina_D___ne != null) {
            joiner.add("vitamina_D___ne: " + GraphQLRequestSerializer.getEntry(vitamina_D___ne));
        }
        if (vitamina_D___null != null) {
            joiner.add("vitamina_D___null: " + GraphQLRequestSerializer.getEntry(vitamina_D___null));
        }
        if (vitamina_D___not___null != null) {
            joiner.add("vitamina_D___not___null: " + GraphQLRequestSerializer.getEntry(vitamina_D___not___null));
        }
        if (vitamina_D___in != null) {
            joiner.add("vitamina_D___in: " + GraphQLRequestSerializer.getEntry(vitamina_D___in));
        }
        if (vitamina_D___not___in != null) {
            joiner.add("vitamina_D___not___in: " + GraphQLRequestSerializer.getEntry(vitamina_D___not___in));
        }
        if (vitamina_D___lt != null) {
            joiner.add("vitamina_D___lt: " + GraphQLRequestSerializer.getEntry(vitamina_D___lt));
        }
        if (vitamina_D___lte != null) {
            joiner.add("vitamina_D___lte: " + GraphQLRequestSerializer.getEntry(vitamina_D___lte));
        }
        if (vitamina_D___gt != null) {
            joiner.add("vitamina_D___gt: " + GraphQLRequestSerializer.getEntry(vitamina_D___gt));
        }
        if (vitamina_D___gte != null) {
            joiner.add("vitamina_D___gte: " + GraphQLRequestSerializer.getEntry(vitamina_D___gte));
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

    public static CliControllo_clinicoFilterDTO.Builder builder() {
        return new CliControllo_clinicoFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private Integer ALT___eq;
        private Integer ALT___ne;
        private Boolean ALT___null;
        private Boolean ALT___not___null;
        private java.util.List<Integer> ALT___in;
        private java.util.List<Integer> ALT___not___in;
        private Integer ALT___lt;
        private Integer ALT___lte;
        private Integer ALT___gt;
        private Integer ALT___gte;
        private Integer AST___eq;
        private Integer AST___ne;
        private Boolean AST___null;
        private Boolean AST___not___null;
        private java.util.List<Integer> AST___in;
        private java.util.List<Integer> AST___not___in;
        private Integer AST___lt;
        private Integer AST___lte;
        private Integer AST___gt;
        private Integer AST___gte;
        private Integer HDL___eq;
        private Integer HDL___ne;
        private Boolean HDL___null;
        private Boolean HDL___not___null;
        private java.util.List<Integer> HDL___in;
        private java.util.List<Integer> HDL___not___in;
        private Integer HDL___lt;
        private Integer HDL___lte;
        private Integer HDL___gt;
        private Integer HDL___gte;
        private Integer LDL___eq;
        private Integer LDL___ne;
        private Boolean LDL___null;
        private Boolean LDL___not___null;
        private java.util.List<Integer> LDL___in;
        private java.util.List<Integer> LDL___not___in;
        private Integer LDL___lt;
        private Integer LDL___lte;
        private Integer LDL___gt;
        private Integer LDL___gte;
        private String MCV___eq;
        private String MCV___ne;
        private Boolean MCV___null;
        private Boolean MCV___not___null;
        private java.util.List<String> MCV___in;
        private java.util.List<String> MCV___not___in;
        private String MCV___lt;
        private String MCV___lte;
        private String MCV___gt;
        private String MCV___gte;
        private String PCHE___eq;
        private String PCHE___ne;
        private Boolean PCHE___null;
        private Boolean PCHE___not___null;
        private java.util.List<String> PCHE___in;
        private java.util.List<String> PCHE___not___in;
        private String PCHE___lt;
        private String PCHE___lte;
        private String PCHE___gt;
        private String PCHE___gte;
        private Boolean PPD___eq;
        private Boolean PPD___ne;
        private Boolean PPD___null;
        private Boolean PPD___not___null;
        private String PT_INR___eq;
        private String PT_INR___ne;
        private Boolean PT_INR___null;
        private Boolean PT_INR___not___null;
        private java.util.List<String> PT_INR___in;
        private java.util.List<String> PT_INR___not___in;
        private String PT_INR___lt;
        private String PT_INR___lte;
        private String PT_INR___gt;
        private String PT_INR___gte;
        private String PT_percentuale___eq;
        private String PT_percentuale___ne;
        private Boolean PT_percentuale___null;
        private Boolean PT_percentuale___not___null;
        private java.util.List<String> PT_percentuale___in;
        private java.util.List<String> PT_percentuale___not___in;
        private String PT_percentuale___lt;
        private String PT_percentuale___lte;
        private String PT_percentuale___gt;
        private String PT_percentuale___gte;
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
        private String acido_lattico___eq;
        private String acido_lattico___ne;
        private Boolean acido_lattico___null;
        private Boolean acido_lattico___not___null;
        private java.util.List<String> acido_lattico___in;
        private java.util.List<String> acido_lattico___not___in;
        private String acido_lattico___lt;
        private String acido_lattico___lte;
        private String acido_lattico___gt;
        private String acido_lattico___gte;
        private String albumina___eq;
        private String albumina___ne;
        private Boolean albumina___null;
        private Boolean albumina___not___null;
        private java.util.List<String> albumina___in;
        private java.util.List<String> albumina___not___in;
        private String albumina___lt;
        private String albumina___lte;
        private String albumina___gt;
        private String albumina___gte;
        private String alfafetoproteina___eq;
        private String alfafetoproteina___ne;
        private Boolean alfafetoproteina___null;
        private Boolean alfafetoproteina___not___null;
        private java.util.List<String> alfafetoproteina___in;
        private java.util.List<String> alfafetoproteina___not___in;
        private String alfafetoproteina___lt;
        private String alfafetoproteina___lte;
        private String alfafetoproteina___gt;
        private String alfafetoproteina___gte;
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
        private String altro_beve___eq;
        private String altro_beve___ne;
        private Boolean altro_beve___null;
        private Boolean altro_beve___not___null;
        private java.util.List<String> altro_beve___in;
        private java.util.List<String> altro_beve___not___in;
        private String altro_beve___lt;
        private String altro_beve___lte;
        private String altro_beve___gt;
        private String altro_beve___gte;
        private String altro_beve___contains;
        private String altro_beve___not___contains;
        private String altro_beve___starts_with;
        private String altro_beve___not___starts_with;
        private String altro_beve___ends_with;
        private String altro_beve___not___ends_with;
        private Integer azotemia___eq;
        private Integer azotemia___ne;
        private Boolean azotemia___null;
        private Boolean azotemia___not___null;
        private java.util.List<Integer> azotemia___in;
        private java.util.List<Integer> azotemia___not___in;
        private Integer azotemia___lt;
        private Integer azotemia___lte;
        private Integer azotemia___gt;
        private Integer azotemia___gte;
        private Boolean beve___eq;
        private Boolean beve___ne;
        private Boolean beve___null;
        private Boolean beve___not___null;
        private String bilirubina_diretta___eq;
        private String bilirubina_diretta___ne;
        private Boolean bilirubina_diretta___null;
        private Boolean bilirubina_diretta___not___null;
        private java.util.List<String> bilirubina_diretta___in;
        private java.util.List<String> bilirubina_diretta___not___in;
        private String bilirubina_diretta___lt;
        private String bilirubina_diretta___lte;
        private String bilirubina_diretta___gt;
        private String bilirubina_diretta___gte;
        private String bilirubina_totale___eq;
        private String bilirubina_totale___ne;
        private Boolean bilirubina_totale___null;
        private Boolean bilirubina_totale___not___null;
        private java.util.List<String> bilirubina_totale___in;
        private java.util.List<String> bilirubina_totale___not___in;
        private String bilirubina_totale___lt;
        private String bilirubina_totale___lte;
        private String bilirubina_totale___gt;
        private String bilirubina_totale___gte;
        private Integer birra___eq;
        private Integer birra___ne;
        private Boolean birra___null;
        private Boolean birra___not___null;
        private java.util.List<Integer> birra___in;
        private java.util.List<Integer> birra___not___in;
        private Integer birra___lt;
        private Integer birra___lte;
        private Integer birra___gt;
        private Integer birra___gte;
        private String calcio___eq;
        private String calcio___ne;
        private Boolean calcio___null;
        private Boolean calcio___not___null;
        private java.util.List<String> calcio___in;
        private java.util.List<String> calcio___not___in;
        private String calcio___lt;
        private String calcio___lte;
        private String calcio___gt;
        private String calcio___gte;
        private Boolean campione___eq;
        private Boolean campione___ne;
        private Boolean campione___null;
        private Boolean campione___not___null;
        private Boolean chemsex___eq;
        private Boolean chemsex___ne;
        private Boolean chemsex___null;
        private Boolean chemsex___not___null;
        private Integer circonferenza_vita___eq;
        private Integer circonferenza_vita___ne;
        private Boolean circonferenza_vita___null;
        private Boolean circonferenza_vita___not___null;
        private java.util.List<Integer> circonferenza_vita___in;
        private java.util.List<Integer> circonferenza_vita___not___in;
        private Integer circonferenza_vita___lt;
        private Integer circonferenza_vita___lte;
        private Integer circonferenza_vita___gt;
        private Integer circonferenza_vita___gte;
        private Boolean cmvigg___eq;
        private Boolean cmvigg___ne;
        private Boolean cmvigg___null;
        private Boolean cmvigg___not___null;
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
        private Integer colesterolo___eq;
        private Integer colesterolo___ne;
        private Boolean colesterolo___null;
        private Boolean colesterolo___not___null;
        private java.util.List<Integer> colesterolo___in;
        private java.util.List<Integer> colesterolo___not___in;
        private Integer colesterolo___lt;
        private Integer colesterolo___lte;
        private Integer colesterolo___gt;
        private Integer colesterolo___gte;
        private Boolean cov_igg___eq;
        private Boolean cov_igg___ne;
        private Boolean cov_igg___null;
        private Boolean cov_igg___not___null;
        private String cov_igg_titolo___eq;
        private String cov_igg_titolo___ne;
        private Boolean cov_igg_titolo___null;
        private Boolean cov_igg_titolo___not___null;
        private java.util.List<String> cov_igg_titolo___in;
        private java.util.List<String> cov_igg_titolo___not___in;
        private String cov_igg_titolo___lt;
        private String cov_igg_titolo___lte;
        private String cov_igg_titolo___gt;
        private String cov_igg_titolo___gte;
        private Boolean cov_igm___eq;
        private Boolean cov_igm___ne;
        private Boolean cov_igm___null;
        private Boolean cov_igm___not___null;
        private String cov_igm_titolo___eq;
        private String cov_igm_titolo___ne;
        private Boolean cov_igm_titolo___null;
        private Boolean cov_igm_titolo___not___null;
        private java.util.List<String> cov_igm_titolo___in;
        private java.util.List<String> cov_igm_titolo___not___in;
        private String cov_igm_titolo___lt;
        private String cov_igm_titolo___lte;
        private String cov_igm_titolo___gt;
        private String cov_igm_titolo___gte;
        private Boolean cov_rna___eq;
        private Boolean cov_rna___ne;
        private Boolean cov_rna___null;
        private Boolean cov_rna___not___null;
        private String cov_test___eq;
        private String cov_test___ne;
        private Boolean cov_test___null;
        private Boolean cov_test___not___null;
        private java.util.List<String> cov_test___in;
        private java.util.List<String> cov_test___not___in;
        private String cov_test___lt;
        private String cov_test___lte;
        private String cov_test___gt;
        private String cov_test___gte;
        private String cov_test___contains;
        private String cov_test___not___contains;
        private String cov_test___starts_with;
        private String cov_test___not___starts_with;
        private String cov_test___ends_with;
        private String cov_test___not___ends_with;
        private Boolean cov_vax___eq;
        private Boolean cov_vax___ne;
        private Boolean cov_vax___null;
        private Boolean cov_vax___not___null;
        private String creatinina___eq;
        private String creatinina___ne;
        private Boolean creatinina___null;
        private Boolean creatinina___not___null;
        private java.util.List<String> creatinina___in;
        private java.util.List<String> creatinina___not___in;
        private String creatinina___lt;
        private String creatinina___lte;
        private String creatinina___gt;
        private String creatinina___gte;
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
        private String data_campione___eq;
        private String data_campione___ne;
        private Boolean data_campione___null;
        private Boolean data_campione___not___null;
        private java.util.List<String> data_campione___in;
        private java.util.List<String> data_campione___not___in;
        private String data_campione___lt;
        private String data_campione___lte;
        private String data_campione___gt;
        private String data_campione___gte;
        private String data_presunta_parto___eq;
        private String data_presunta_parto___ne;
        private Boolean data_presunta_parto___null;
        private Boolean data_presunta_parto___not___null;
        private java.util.List<String> data_presunta_parto___in;
        private java.util.List<String> data_presunta_parto___not___in;
        private String data_presunta_parto___lt;
        private String data_presunta_parto___lte;
        private String data_presunta_parto___gt;
        private String data_presunta_parto___gte;
        private String data_questionario___eq;
        private String data_questionario___ne;
        private Boolean data_questionario___null;
        private Boolean data_questionario___not___null;
        private java.util.List<String> data_questionario___in;
        private java.util.List<String> data_questionario___not___in;
        private String data_questionario___lt;
        private String data_questionario___lte;
        private String data_questionario___gt;
        private String data_questionario___gte;
        private Integer dosi_omesse___eq;
        private Integer dosi_omesse___ne;
        private Boolean dosi_omesse___null;
        private Boolean dosi_omesse___not___null;
        private java.util.List<Integer> dosi_omesse___in;
        private java.util.List<Integer> dosi_omesse___not___in;
        private Integer dosi_omesse___lt;
        private Integer dosi_omesse___lte;
        private Integer dosi_omesse___gt;
        private Integer dosi_omesse___gte;
        private String emoglobina___eq;
        private String emoglobina___ne;
        private Boolean emoglobina___null;
        private Boolean emoglobina___not___null;
        private java.util.List<String> emoglobina___in;
        private java.util.List<String> emoglobina___not___in;
        private String emoglobina___lt;
        private String emoglobina___lte;
        private String emoglobina___gt;
        private String emoglobina___gte;
        private String emoglobina_glicata___eq;
        private String emoglobina_glicata___ne;
        private Boolean emoglobina_glicata___null;
        private Boolean emoglobina_glicata___not___null;
        private java.util.List<String> emoglobina_glicata___in;
        private java.util.List<String> emoglobina_glicata___not___in;
        private String emoglobina_glicata___lt;
        private String emoglobina_glicata___lte;
        private String emoglobina_glicata___gt;
        private String emoglobina_glicata___gte;
        private String followup_questionario___eq;
        private String followup_questionario___ne;
        private Boolean followup_questionario___null;
        private Boolean followup_questionario___not___null;
        private java.util.List<String> followup_questionario___in;
        private java.util.List<String> followup_questionario___not___in;
        private String followup_questionario___lt;
        private String followup_questionario___lte;
        private String followup_questionario___gt;
        private String followup_questionario___gte;
        private String followup_questionario___contains;
        private String followup_questionario___not___contains;
        private String followup_questionario___starts_with;
        private String followup_questionario___not___starts_with;
        private String followup_questionario___ends_with;
        private String followup_questionario___not___ends_with;
        private Integer fosfatasi_alcalina___eq;
        private Integer fosfatasi_alcalina___ne;
        private Boolean fosfatasi_alcalina___null;
        private Boolean fosfatasi_alcalina___not___null;
        private java.util.List<Integer> fosfatasi_alcalina___in;
        private java.util.List<Integer> fosfatasi_alcalina___not___in;
        private Integer fosfatasi_alcalina___lt;
        private Integer fosfatasi_alcalina___lte;
        private Integer fosfatasi_alcalina___gt;
        private Integer fosfatasi_alcalina___gte;
        private String fosforo___eq;
        private String fosforo___ne;
        private Boolean fosforo___null;
        private Boolean fosforo___not___null;
        private java.util.List<String> fosforo___in;
        private java.util.List<String> fosforo___not___in;
        private String fosforo___lt;
        private String fosforo___lte;
        private String fosforo___gt;
        private String fosforo___gte;
        private String frequenza___eq;
        private String frequenza___ne;
        private Boolean frequenza___null;
        private Boolean frequenza___not___null;
        private java.util.List<String> frequenza___in;
        private java.util.List<String> frequenza___not___in;
        private String frequenza___lt;
        private String frequenza___lte;
        private String frequenza___gt;
        private String frequenza___gte;
        private String frequenza___contains;
        private String frequenza___not___contains;
        private String frequenza___starts_with;
        private String frequenza___not___starts_with;
        private String frequenza___ends_with;
        private String frequenza___not___ends_with;
        private Boolean fumatore_attivo___eq;
        private Boolean fumatore_attivo___ne;
        private Boolean fumatore_attivo___null;
        private Boolean fumatore_attivo___not___null;
        private Integer gamma_gt___eq;
        private Integer gamma_gt___ne;
        private Boolean gamma_gt___null;
        private Boolean gamma_gt___not___null;
        private java.util.List<Integer> gamma_gt___in;
        private java.util.List<Integer> gamma_gt___not___in;
        private Integer gamma_gt___lt;
        private Integer gamma_gt___lte;
        private Integer gamma_gt___gt;
        private Integer gamma_gt___gte;
        private Integer glicemia___eq;
        private Integer glicemia___ne;
        private Boolean glicemia___null;
        private Boolean glicemia___not___null;
        private java.util.List<Integer> glicemia___in;
        private java.util.List<Integer> glicemia___not___in;
        private Integer glicemia___lt;
        private Integer glicemia___lte;
        private Integer glicemia___gt;
        private Integer glicemia___gte;
        private Integer globuli_bianchi___eq;
        private Integer globuli_bianchi___ne;
        private Boolean globuli_bianchi___null;
        private Boolean globuli_bianchi___not___null;
        private java.util.List<Integer> globuli_bianchi___in;
        private java.util.List<Integer> globuli_bianchi___not___in;
        private Integer globuli_bianchi___lt;
        private Integer globuli_bianchi___lte;
        private Integer globuli_bianchi___gt;
        private Integer globuli_bianchi___gte;
        private Boolean gravidanza___eq;
        private Boolean gravidanza___ne;
        private Boolean gravidanza___null;
        private Boolean gravidanza___not___null;
        private Boolean havabtotali___eq;
        private Boolean havabtotali___ne;
        private Boolean havabtotali___null;
        private Boolean havabtotali___not___null;
        private Boolean havigm___eq;
        private Boolean havigm___ne;
        private Boolean havigm___null;
        private Boolean havigm___not___null;
        private Boolean hbcab___eq;
        private Boolean hbcab___ne;
        private Boolean hbcab___null;
        private Boolean hbcab___not___null;
        private Boolean hbcigm___eq;
        private Boolean hbcigm___ne;
        private Boolean hbcigm___null;
        private Boolean hbcigm___not___null;
        private Boolean hbeab___eq;
        private Boolean hbeab___ne;
        private Boolean hbeab___null;
        private Boolean hbeab___not___null;
        private Boolean hbeag___eq;
        private Boolean hbeag___ne;
        private Boolean hbeag___null;
        private Boolean hbeag___not___null;
        private Boolean hbsab___eq;
        private Boolean hbsab___ne;
        private Boolean hbsab___null;
        private Boolean hbsab___not___null;
        private String hbsab_totali___eq;
        private String hbsab_totali___ne;
        private Boolean hbsab_totali___null;
        private Boolean hbsab_totali___not___null;
        private java.util.List<String> hbsab_totali___in;
        private java.util.List<String> hbsab_totali___not___in;
        private String hbsab_totali___lt;
        private String hbsab_totali___lte;
        private String hbsab_totali___gt;
        private String hbsab_totali___gte;
        private Boolean hbsag___eq;
        private Boolean hbsag___ne;
        private Boolean hbsag___null;
        private Boolean hbsag___not___null;
        private String hbsag_totali___eq;
        private String hbsag_totali___ne;
        private Boolean hbsag_totali___null;
        private Boolean hbsag_totali___not___null;
        private java.util.List<String> hbsag_totali___in;
        private java.util.List<String> hbsag_totali___not___in;
        private String hbsag_totali___lt;
        private String hbsag_totali___lte;
        private String hbsag_totali___gt;
        private String hbsag_totali___gte;
        private Boolean hcvab___eq;
        private Boolean hcvab___ne;
        private Boolean hcvab___null;
        private Boolean hcvab___not___null;
        private Boolean hcvag___eq;
        private Boolean hcvag___ne;
        private Boolean hcvag___null;
        private Boolean hcvag___not___null;
        private Boolean hdvab___eq;
        private Boolean hdvab___ne;
        private Boolean hdvab___null;
        private Boolean hdvab___not___null;
        private Boolean hdvab_igg___eq;
        private Boolean hdvab_igg___ne;
        private Boolean hdvab_igg___null;
        private Boolean hdvab_igg___not___null;
        private Boolean hdvabigm___eq;
        private Boolean hdvabigm___ne;
        private Boolean hdvabigm___null;
        private Boolean hdvabigm___not___null;
        private String hdvabtotali___eq;
        private String hdvabtotali___ne;
        private Boolean hdvabtotali___null;
        private Boolean hdvabtotali___not___null;
        private java.util.List<String> hdvabtotali___in;
        private java.util.List<String> hdvabtotali___not___in;
        private String hdvabtotali___lt;
        private String hdvabtotali___lte;
        private String hdvabtotali___gt;
        private String hdvabtotali___gte;
        private Boolean interruzioni___eq;
        private Boolean interruzioni___ne;
        private Boolean interruzioni___null;
        private Boolean interruzioni___not___null;
        private String mdw___eq;
        private String mdw___ne;
        private Boolean mdw___null;
        private Boolean mdw___not___null;
        private java.util.List<String> mdw___in;
        private java.util.List<String> mdw___not___in;
        private String mdw___lt;
        private String mdw___lte;
        private String mdw___gt;
        private String mdw___gte;
        private String metodica_vitamina_D_2___eq;
        private String metodica_vitamina_D_2___ne;
        private Boolean metodica_vitamina_D_2___null;
        private Boolean metodica_vitamina_D_2___not___null;
        private java.util.List<String> metodica_vitamina_D_2___in;
        private java.util.List<String> metodica_vitamina_D_2___not___in;
        private String metodica_vitamina_D_2___lt;
        private String metodica_vitamina_D_2___lte;
        private String metodica_vitamina_D_2___gt;
        private String metodica_vitamina_D_2___gte;
        private String metodica_vitamina_D_2___contains;
        private String metodica_vitamina_D_2___not___contains;
        private String metodica_vitamina_D_2___starts_with;
        private String metodica_vitamina_D_2___not___starts_with;
        private String metodica_vitamina_D_2___ends_with;
        private String metodica_vitamina_D_2___not___ends_with;
        private Integer monociti___eq;
        private Integer monociti___ne;
        private Boolean monociti___null;
        private Boolean monociti___not___null;
        private java.util.List<Integer> monociti___in;
        private java.util.List<Integer> monociti___not___in;
        private Integer monociti___lt;
        private Integer monociti___lte;
        private Integer monociti___gt;
        private Integer monociti___gte;
        private Boolean non_trepon___eq;
        private Boolean non_trepon___ne;
        private Boolean non_trepon___null;
        private Boolean non_trepon___not___null;
        private Integer nr_neutrofili___eq;
        private Integer nr_neutrofili___ne;
        private Boolean nr_neutrofili___null;
        private Boolean nr_neutrofili___not___null;
        private java.util.List<Integer> nr_neutrofili___in;
        private java.util.List<Integer> nr_neutrofili___not___in;
        private Integer nr_neutrofili___lt;
        private Integer nr_neutrofili___lte;
        private Integer nr_neutrofili___gt;
        private Integer nr_neutrofili___gte;
        private Boolean omissione___eq;
        private Boolean omissione___ne;
        private Boolean omissione___null;
        private Boolean omissione___not___null;
        private Integer pa_max___eq;
        private Integer pa_max___ne;
        private Boolean pa_max___null;
        private Boolean pa_max___not___null;
        private java.util.List<Integer> pa_max___in;
        private java.util.List<Integer> pa_max___not___in;
        private Integer pa_max___lt;
        private Integer pa_max___lte;
        private Integer pa_max___gt;
        private Integer pa_max___gte;
        private Integer pa_min___eq;
        private Integer pa_min___ne;
        private Boolean pa_min___null;
        private Boolean pa_min___not___null;
        private java.util.List<Integer> pa_min___in;
        private java.util.List<Integer> pa_min___not___in;
        private Integer pa_min___lt;
        private Integer pa_min___lte;
        private Integer pa_min___gt;
        private Integer pa_min___gte;
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
        private String peso___eq;
        private String peso___ne;
        private Boolean peso___null;
        private Boolean peso___not___null;
        private java.util.List<String> peso___in;
        private java.util.List<String> peso___not___in;
        private String peso___lt;
        private String peso___lte;
        private String peso___gt;
        private String peso___gte;
        private Integer piastrine___eq;
        private Integer piastrine___ne;
        private Boolean piastrine___null;
        private Boolean piastrine___not___null;
        private java.util.List<Integer> piastrine___in;
        private java.util.List<Integer> piastrine___not___in;
        private Integer piastrine___lt;
        private Integer piastrine___lte;
        private Integer piastrine___gt;
        private Integer piastrine___gte;
        private String proteinuria___eq;
        private String proteinuria___ne;
        private Boolean proteinuria___null;
        private Boolean proteinuria___not___null;
        private java.util.List<String> proteinuria___in;
        private java.util.List<String> proteinuria___not___in;
        private String proteinuria___lt;
        private String proteinuria___lte;
        private String proteinuria___gt;
        private String proteinuria___gte;
        private Boolean questionario_str___eq;
        private Boolean questionario_str___ne;
        private Boolean questionario_str___null;
        private Boolean questionario_str___not___null;
        private String sesso_ok___eq;
        private String sesso_ok___ne;
        private Boolean sesso_ok___null;
        private Boolean sesso_ok___not___null;
        private java.util.List<String> sesso_ok___in;
        private java.util.List<String> sesso_ok___not___in;
        private String sesso_ok___lt;
        private String sesso_ok___lte;
        private String sesso_ok___gt;
        private String sesso_ok___gte;
        private String sesso_ok___contains;
        private String sesso_ok___not___contains;
        private String sesso_ok___starts_with;
        private String sesso_ok___not___starts_with;
        private String sesso_ok___ends_with;
        private String sesso_ok___not___ends_with;
        private Integer superalcolici___eq;
        private Integer superalcolici___ne;
        private Boolean superalcolici___null;
        private Boolean superalcolici___not___null;
        private java.util.List<Integer> superalcolici___in;
        private java.util.List<Integer> superalcolici___not___in;
        private Integer superalcolici___lt;
        private Integer superalcolici___lte;
        private Integer superalcolici___gt;
        private Integer superalcolici___gte;
        private Boolean tossicodip_attivo___eq;
        private Boolean tossicodip_attivo___ne;
        private Boolean tossicodip_attivo___null;
        private Boolean tossicodip_attivo___not___null;
        private Boolean toxoigg___eq;
        private Boolean toxoigg___ne;
        private Boolean toxoigg___null;
        private Boolean toxoigg___not___null;
        private Boolean trepon___eq;
        private Boolean trepon___ne;
        private Boolean trepon___null;
        private Boolean trepon___not___null;
        private Integer trigliceridi___eq;
        private Integer trigliceridi___ne;
        private Boolean trigliceridi___null;
        private Boolean trigliceridi___not___null;
        private java.util.List<Integer> trigliceridi___in;
        private java.util.List<Integer> trigliceridi___not___in;
        private Integer trigliceridi___lt;
        private Integer trigliceridi___lte;
        private Integer trigliceridi___gt;
        private Integer trigliceridi___gte;
        private String unita_vitamina_D___eq;
        private String unita_vitamina_D___ne;
        private Boolean unita_vitamina_D___null;
        private Boolean unita_vitamina_D___not___null;
        private java.util.List<String> unita_vitamina_D___in;
        private java.util.List<String> unita_vitamina_D___not___in;
        private String unita_vitamina_D___lt;
        private String unita_vitamina_D___lte;
        private String unita_vitamina_D___gt;
        private String unita_vitamina_D___gte;
        private String unita_vitamina_D___contains;
        private String unita_vitamina_D___not___contains;
        private String unita_vitamina_D___starts_with;
        private String unita_vitamina_D___not___starts_with;
        private String unita_vitamina_D___ends_with;
        private String unita_vitamina_D___not___ends_with;
        private String vas___eq;
        private String vas___ne;
        private Boolean vas___null;
        private Boolean vas___not___null;
        private java.util.List<String> vas___in;
        private java.util.List<String> vas___not___in;
        private String vas___lt;
        private String vas___lte;
        private String vas___gt;
        private String vas___gte;
        private String vas_globale___eq;
        private String vas_globale___ne;
        private Boolean vas_globale___null;
        private Boolean vas_globale___not___null;
        private java.util.List<String> vas_globale___in;
        private java.util.List<String> vas_globale___not___in;
        private String vas_globale___lt;
        private String vas_globale___lte;
        private String vas_globale___gt;
        private String vas_globale___gte;
        private Integer vino___eq;
        private Integer vino___ne;
        private Boolean vino___null;
        private Boolean vino___not___null;
        private java.util.List<Integer> vino___in;
        private java.util.List<Integer> vino___not___in;
        private Integer vino___lt;
        private Integer vino___lte;
        private Integer vino___gt;
        private Integer vino___gte;
        private String vitamina_D___eq;
        private String vitamina_D___ne;
        private Boolean vitamina_D___null;
        private Boolean vitamina_D___not___null;
        private java.util.List<String> vitamina_D___in;
        private java.util.List<String> vitamina_D___not___in;
        private String vitamina_D___lt;
        private String vitamina_D___lte;
        private String vitamina_D___gt;
        private String vitamina_D___gte;
        private java.util.List<CliControllo_clinicoFilterDTO> AND;
        private java.util.List<CliControllo_clinicoFilterDTO> OR;
        private CliControllo_clinicoFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder setALT___eq(Integer ALT___eq) {
            this.ALT___eq = ALT___eq;
            return this;
        }

        public Builder setALT___ne(Integer ALT___ne) {
            this.ALT___ne = ALT___ne;
            return this;
        }

        public Builder setALT___null(Boolean ALT___null) {
            this.ALT___null = ALT___null;
            return this;
        }

        public Builder setALT___not___null(Boolean ALT___not___null) {
            this.ALT___not___null = ALT___not___null;
            return this;
        }

        public Builder setALT___in(java.util.List<Integer> ALT___in) {
            this.ALT___in = ALT___in;
            return this;
        }

        public Builder setALT___not___in(java.util.List<Integer> ALT___not___in) {
            this.ALT___not___in = ALT___not___in;
            return this;
        }

        public Builder setALT___lt(Integer ALT___lt) {
            this.ALT___lt = ALT___lt;
            return this;
        }

        public Builder setALT___lte(Integer ALT___lte) {
            this.ALT___lte = ALT___lte;
            return this;
        }

        public Builder setALT___gt(Integer ALT___gt) {
            this.ALT___gt = ALT___gt;
            return this;
        }

        public Builder setALT___gte(Integer ALT___gte) {
            this.ALT___gte = ALT___gte;
            return this;
        }

        public Builder setAST___eq(Integer AST___eq) {
            this.AST___eq = AST___eq;
            return this;
        }

        public Builder setAST___ne(Integer AST___ne) {
            this.AST___ne = AST___ne;
            return this;
        }

        public Builder setAST___null(Boolean AST___null) {
            this.AST___null = AST___null;
            return this;
        }

        public Builder setAST___not___null(Boolean AST___not___null) {
            this.AST___not___null = AST___not___null;
            return this;
        }

        public Builder setAST___in(java.util.List<Integer> AST___in) {
            this.AST___in = AST___in;
            return this;
        }

        public Builder setAST___not___in(java.util.List<Integer> AST___not___in) {
            this.AST___not___in = AST___not___in;
            return this;
        }

        public Builder setAST___lt(Integer AST___lt) {
            this.AST___lt = AST___lt;
            return this;
        }

        public Builder setAST___lte(Integer AST___lte) {
            this.AST___lte = AST___lte;
            return this;
        }

        public Builder setAST___gt(Integer AST___gt) {
            this.AST___gt = AST___gt;
            return this;
        }

        public Builder setAST___gte(Integer AST___gte) {
            this.AST___gte = AST___gte;
            return this;
        }

        public Builder setHDL___eq(Integer HDL___eq) {
            this.HDL___eq = HDL___eq;
            return this;
        }

        public Builder setHDL___ne(Integer HDL___ne) {
            this.HDL___ne = HDL___ne;
            return this;
        }

        public Builder setHDL___null(Boolean HDL___null) {
            this.HDL___null = HDL___null;
            return this;
        }

        public Builder setHDL___not___null(Boolean HDL___not___null) {
            this.HDL___not___null = HDL___not___null;
            return this;
        }

        public Builder setHDL___in(java.util.List<Integer> HDL___in) {
            this.HDL___in = HDL___in;
            return this;
        }

        public Builder setHDL___not___in(java.util.List<Integer> HDL___not___in) {
            this.HDL___not___in = HDL___not___in;
            return this;
        }

        public Builder setHDL___lt(Integer HDL___lt) {
            this.HDL___lt = HDL___lt;
            return this;
        }

        public Builder setHDL___lte(Integer HDL___lte) {
            this.HDL___lte = HDL___lte;
            return this;
        }

        public Builder setHDL___gt(Integer HDL___gt) {
            this.HDL___gt = HDL___gt;
            return this;
        }

        public Builder setHDL___gte(Integer HDL___gte) {
            this.HDL___gte = HDL___gte;
            return this;
        }

        public Builder setLDL___eq(Integer LDL___eq) {
            this.LDL___eq = LDL___eq;
            return this;
        }

        public Builder setLDL___ne(Integer LDL___ne) {
            this.LDL___ne = LDL___ne;
            return this;
        }

        public Builder setLDL___null(Boolean LDL___null) {
            this.LDL___null = LDL___null;
            return this;
        }

        public Builder setLDL___not___null(Boolean LDL___not___null) {
            this.LDL___not___null = LDL___not___null;
            return this;
        }

        public Builder setLDL___in(java.util.List<Integer> LDL___in) {
            this.LDL___in = LDL___in;
            return this;
        }

        public Builder setLDL___not___in(java.util.List<Integer> LDL___not___in) {
            this.LDL___not___in = LDL___not___in;
            return this;
        }

        public Builder setLDL___lt(Integer LDL___lt) {
            this.LDL___lt = LDL___lt;
            return this;
        }

        public Builder setLDL___lte(Integer LDL___lte) {
            this.LDL___lte = LDL___lte;
            return this;
        }

        public Builder setLDL___gt(Integer LDL___gt) {
            this.LDL___gt = LDL___gt;
            return this;
        }

        public Builder setLDL___gte(Integer LDL___gte) {
            this.LDL___gte = LDL___gte;
            return this;
        }

        public Builder setMCV___eq(String MCV___eq) {
            this.MCV___eq = MCV___eq;
            return this;
        }

        public Builder setMCV___ne(String MCV___ne) {
            this.MCV___ne = MCV___ne;
            return this;
        }

        public Builder setMCV___null(Boolean MCV___null) {
            this.MCV___null = MCV___null;
            return this;
        }

        public Builder setMCV___not___null(Boolean MCV___not___null) {
            this.MCV___not___null = MCV___not___null;
            return this;
        }

        public Builder setMCV___in(java.util.List<String> MCV___in) {
            this.MCV___in = MCV___in;
            return this;
        }

        public Builder setMCV___not___in(java.util.List<String> MCV___not___in) {
            this.MCV___not___in = MCV___not___in;
            return this;
        }

        public Builder setMCV___lt(String MCV___lt) {
            this.MCV___lt = MCV___lt;
            return this;
        }

        public Builder setMCV___lte(String MCV___lte) {
            this.MCV___lte = MCV___lte;
            return this;
        }

        public Builder setMCV___gt(String MCV___gt) {
            this.MCV___gt = MCV___gt;
            return this;
        }

        public Builder setMCV___gte(String MCV___gte) {
            this.MCV___gte = MCV___gte;
            return this;
        }

        public Builder setPCHE___eq(String PCHE___eq) {
            this.PCHE___eq = PCHE___eq;
            return this;
        }

        public Builder setPCHE___ne(String PCHE___ne) {
            this.PCHE___ne = PCHE___ne;
            return this;
        }

        public Builder setPCHE___null(Boolean PCHE___null) {
            this.PCHE___null = PCHE___null;
            return this;
        }

        public Builder setPCHE___not___null(Boolean PCHE___not___null) {
            this.PCHE___not___null = PCHE___not___null;
            return this;
        }

        public Builder setPCHE___in(java.util.List<String> PCHE___in) {
            this.PCHE___in = PCHE___in;
            return this;
        }

        public Builder setPCHE___not___in(java.util.List<String> PCHE___not___in) {
            this.PCHE___not___in = PCHE___not___in;
            return this;
        }

        public Builder setPCHE___lt(String PCHE___lt) {
            this.PCHE___lt = PCHE___lt;
            return this;
        }

        public Builder setPCHE___lte(String PCHE___lte) {
            this.PCHE___lte = PCHE___lte;
            return this;
        }

        public Builder setPCHE___gt(String PCHE___gt) {
            this.PCHE___gt = PCHE___gt;
            return this;
        }

        public Builder setPCHE___gte(String PCHE___gte) {
            this.PCHE___gte = PCHE___gte;
            return this;
        }

        public Builder setPPD___eq(Boolean PPD___eq) {
            this.PPD___eq = PPD___eq;
            return this;
        }

        public Builder setPPD___ne(Boolean PPD___ne) {
            this.PPD___ne = PPD___ne;
            return this;
        }

        public Builder setPPD___null(Boolean PPD___null) {
            this.PPD___null = PPD___null;
            return this;
        }

        public Builder setPPD___not___null(Boolean PPD___not___null) {
            this.PPD___not___null = PPD___not___null;
            return this;
        }

        public Builder setPT_INR___eq(String PT_INR___eq) {
            this.PT_INR___eq = PT_INR___eq;
            return this;
        }

        public Builder setPT_INR___ne(String PT_INR___ne) {
            this.PT_INR___ne = PT_INR___ne;
            return this;
        }

        public Builder setPT_INR___null(Boolean PT_INR___null) {
            this.PT_INR___null = PT_INR___null;
            return this;
        }

        public Builder setPT_INR___not___null(Boolean PT_INR___not___null) {
            this.PT_INR___not___null = PT_INR___not___null;
            return this;
        }

        public Builder setPT_INR___in(java.util.List<String> PT_INR___in) {
            this.PT_INR___in = PT_INR___in;
            return this;
        }

        public Builder setPT_INR___not___in(java.util.List<String> PT_INR___not___in) {
            this.PT_INR___not___in = PT_INR___not___in;
            return this;
        }

        public Builder setPT_INR___lt(String PT_INR___lt) {
            this.PT_INR___lt = PT_INR___lt;
            return this;
        }

        public Builder setPT_INR___lte(String PT_INR___lte) {
            this.PT_INR___lte = PT_INR___lte;
            return this;
        }

        public Builder setPT_INR___gt(String PT_INR___gt) {
            this.PT_INR___gt = PT_INR___gt;
            return this;
        }

        public Builder setPT_INR___gte(String PT_INR___gte) {
            this.PT_INR___gte = PT_INR___gte;
            return this;
        }

        public Builder setPT_percentuale___eq(String PT_percentuale___eq) {
            this.PT_percentuale___eq = PT_percentuale___eq;
            return this;
        }

        public Builder setPT_percentuale___ne(String PT_percentuale___ne) {
            this.PT_percentuale___ne = PT_percentuale___ne;
            return this;
        }

        public Builder setPT_percentuale___null(Boolean PT_percentuale___null) {
            this.PT_percentuale___null = PT_percentuale___null;
            return this;
        }

        public Builder setPT_percentuale___not___null(Boolean PT_percentuale___not___null) {
            this.PT_percentuale___not___null = PT_percentuale___not___null;
            return this;
        }

        public Builder setPT_percentuale___in(java.util.List<String> PT_percentuale___in) {
            this.PT_percentuale___in = PT_percentuale___in;
            return this;
        }

        public Builder setPT_percentuale___not___in(java.util.List<String> PT_percentuale___not___in) {
            this.PT_percentuale___not___in = PT_percentuale___not___in;
            return this;
        }

        public Builder setPT_percentuale___lt(String PT_percentuale___lt) {
            this.PT_percentuale___lt = PT_percentuale___lt;
            return this;
        }

        public Builder setPT_percentuale___lte(String PT_percentuale___lte) {
            this.PT_percentuale___lte = PT_percentuale___lte;
            return this;
        }

        public Builder setPT_percentuale___gt(String PT_percentuale___gt) {
            this.PT_percentuale___gt = PT_percentuale___gt;
            return this;
        }

        public Builder setPT_percentuale___gte(String PT_percentuale___gte) {
            this.PT_percentuale___gte = PT_percentuale___gte;
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

        public Builder setAcido_lattico___eq(String acido_lattico___eq) {
            this.acido_lattico___eq = acido_lattico___eq;
            return this;
        }

        public Builder setAcido_lattico___ne(String acido_lattico___ne) {
            this.acido_lattico___ne = acido_lattico___ne;
            return this;
        }

        public Builder setAcido_lattico___null(Boolean acido_lattico___null) {
            this.acido_lattico___null = acido_lattico___null;
            return this;
        }

        public Builder setAcido_lattico___not___null(Boolean acido_lattico___not___null) {
            this.acido_lattico___not___null = acido_lattico___not___null;
            return this;
        }

        public Builder setAcido_lattico___in(java.util.List<String> acido_lattico___in) {
            this.acido_lattico___in = acido_lattico___in;
            return this;
        }

        public Builder setAcido_lattico___not___in(java.util.List<String> acido_lattico___not___in) {
            this.acido_lattico___not___in = acido_lattico___not___in;
            return this;
        }

        public Builder setAcido_lattico___lt(String acido_lattico___lt) {
            this.acido_lattico___lt = acido_lattico___lt;
            return this;
        }

        public Builder setAcido_lattico___lte(String acido_lattico___lte) {
            this.acido_lattico___lte = acido_lattico___lte;
            return this;
        }

        public Builder setAcido_lattico___gt(String acido_lattico___gt) {
            this.acido_lattico___gt = acido_lattico___gt;
            return this;
        }

        public Builder setAcido_lattico___gte(String acido_lattico___gte) {
            this.acido_lattico___gte = acido_lattico___gte;
            return this;
        }

        public Builder setAlbumina___eq(String albumina___eq) {
            this.albumina___eq = albumina___eq;
            return this;
        }

        public Builder setAlbumina___ne(String albumina___ne) {
            this.albumina___ne = albumina___ne;
            return this;
        }

        public Builder setAlbumina___null(Boolean albumina___null) {
            this.albumina___null = albumina___null;
            return this;
        }

        public Builder setAlbumina___not___null(Boolean albumina___not___null) {
            this.albumina___not___null = albumina___not___null;
            return this;
        }

        public Builder setAlbumina___in(java.util.List<String> albumina___in) {
            this.albumina___in = albumina___in;
            return this;
        }

        public Builder setAlbumina___not___in(java.util.List<String> albumina___not___in) {
            this.albumina___not___in = albumina___not___in;
            return this;
        }

        public Builder setAlbumina___lt(String albumina___lt) {
            this.albumina___lt = albumina___lt;
            return this;
        }

        public Builder setAlbumina___lte(String albumina___lte) {
            this.albumina___lte = albumina___lte;
            return this;
        }

        public Builder setAlbumina___gt(String albumina___gt) {
            this.albumina___gt = albumina___gt;
            return this;
        }

        public Builder setAlbumina___gte(String albumina___gte) {
            this.albumina___gte = albumina___gte;
            return this;
        }

        public Builder setAlfafetoproteina___eq(String alfafetoproteina___eq) {
            this.alfafetoproteina___eq = alfafetoproteina___eq;
            return this;
        }

        public Builder setAlfafetoproteina___ne(String alfafetoproteina___ne) {
            this.alfafetoproteina___ne = alfafetoproteina___ne;
            return this;
        }

        public Builder setAlfafetoproteina___null(Boolean alfafetoproteina___null) {
            this.alfafetoproteina___null = alfafetoproteina___null;
            return this;
        }

        public Builder setAlfafetoproteina___not___null(Boolean alfafetoproteina___not___null) {
            this.alfafetoproteina___not___null = alfafetoproteina___not___null;
            return this;
        }

        public Builder setAlfafetoproteina___in(java.util.List<String> alfafetoproteina___in) {
            this.alfafetoproteina___in = alfafetoproteina___in;
            return this;
        }

        public Builder setAlfafetoproteina___not___in(java.util.List<String> alfafetoproteina___not___in) {
            this.alfafetoproteina___not___in = alfafetoproteina___not___in;
            return this;
        }

        public Builder setAlfafetoproteina___lt(String alfafetoproteina___lt) {
            this.alfafetoproteina___lt = alfafetoproteina___lt;
            return this;
        }

        public Builder setAlfafetoproteina___lte(String alfafetoproteina___lte) {
            this.alfafetoproteina___lte = alfafetoproteina___lte;
            return this;
        }

        public Builder setAlfafetoproteina___gt(String alfafetoproteina___gt) {
            this.alfafetoproteina___gt = alfafetoproteina___gt;
            return this;
        }

        public Builder setAlfafetoproteina___gte(String alfafetoproteina___gte) {
            this.alfafetoproteina___gte = alfafetoproteina___gte;
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

        public Builder setAltro_beve___eq(String altro_beve___eq) {
            this.altro_beve___eq = altro_beve___eq;
            return this;
        }

        public Builder setAltro_beve___ne(String altro_beve___ne) {
            this.altro_beve___ne = altro_beve___ne;
            return this;
        }

        public Builder setAltro_beve___null(Boolean altro_beve___null) {
            this.altro_beve___null = altro_beve___null;
            return this;
        }

        public Builder setAltro_beve___not___null(Boolean altro_beve___not___null) {
            this.altro_beve___not___null = altro_beve___not___null;
            return this;
        }

        public Builder setAltro_beve___in(java.util.List<String> altro_beve___in) {
            this.altro_beve___in = altro_beve___in;
            return this;
        }

        public Builder setAltro_beve___not___in(java.util.List<String> altro_beve___not___in) {
            this.altro_beve___not___in = altro_beve___not___in;
            return this;
        }

        public Builder setAltro_beve___lt(String altro_beve___lt) {
            this.altro_beve___lt = altro_beve___lt;
            return this;
        }

        public Builder setAltro_beve___lte(String altro_beve___lte) {
            this.altro_beve___lte = altro_beve___lte;
            return this;
        }

        public Builder setAltro_beve___gt(String altro_beve___gt) {
            this.altro_beve___gt = altro_beve___gt;
            return this;
        }

        public Builder setAltro_beve___gte(String altro_beve___gte) {
            this.altro_beve___gte = altro_beve___gte;
            return this;
        }

        public Builder setAltro_beve___contains(String altro_beve___contains) {
            this.altro_beve___contains = altro_beve___contains;
            return this;
        }

        public Builder setAltro_beve___not___contains(String altro_beve___not___contains) {
            this.altro_beve___not___contains = altro_beve___not___contains;
            return this;
        }

        public Builder setAltro_beve___starts_with(String altro_beve___starts_with) {
            this.altro_beve___starts_with = altro_beve___starts_with;
            return this;
        }

        public Builder setAltro_beve___not___starts_with(String altro_beve___not___starts_with) {
            this.altro_beve___not___starts_with = altro_beve___not___starts_with;
            return this;
        }

        public Builder setAltro_beve___ends_with(String altro_beve___ends_with) {
            this.altro_beve___ends_with = altro_beve___ends_with;
            return this;
        }

        public Builder setAltro_beve___not___ends_with(String altro_beve___not___ends_with) {
            this.altro_beve___not___ends_with = altro_beve___not___ends_with;
            return this;
        }

        public Builder setAzotemia___eq(Integer azotemia___eq) {
            this.azotemia___eq = azotemia___eq;
            return this;
        }

        public Builder setAzotemia___ne(Integer azotemia___ne) {
            this.azotemia___ne = azotemia___ne;
            return this;
        }

        public Builder setAzotemia___null(Boolean azotemia___null) {
            this.azotemia___null = azotemia___null;
            return this;
        }

        public Builder setAzotemia___not___null(Boolean azotemia___not___null) {
            this.azotemia___not___null = azotemia___not___null;
            return this;
        }

        public Builder setAzotemia___in(java.util.List<Integer> azotemia___in) {
            this.azotemia___in = azotemia___in;
            return this;
        }

        public Builder setAzotemia___not___in(java.util.List<Integer> azotemia___not___in) {
            this.azotemia___not___in = azotemia___not___in;
            return this;
        }

        public Builder setAzotemia___lt(Integer azotemia___lt) {
            this.azotemia___lt = azotemia___lt;
            return this;
        }

        public Builder setAzotemia___lte(Integer azotemia___lte) {
            this.azotemia___lte = azotemia___lte;
            return this;
        }

        public Builder setAzotemia___gt(Integer azotemia___gt) {
            this.azotemia___gt = azotemia___gt;
            return this;
        }

        public Builder setAzotemia___gte(Integer azotemia___gte) {
            this.azotemia___gte = azotemia___gte;
            return this;
        }

        public Builder setBeve___eq(Boolean beve___eq) {
            this.beve___eq = beve___eq;
            return this;
        }

        public Builder setBeve___ne(Boolean beve___ne) {
            this.beve___ne = beve___ne;
            return this;
        }

        public Builder setBeve___null(Boolean beve___null) {
            this.beve___null = beve___null;
            return this;
        }

        public Builder setBeve___not___null(Boolean beve___not___null) {
            this.beve___not___null = beve___not___null;
            return this;
        }

        public Builder setBilirubina_diretta___eq(String bilirubina_diretta___eq) {
            this.bilirubina_diretta___eq = bilirubina_diretta___eq;
            return this;
        }

        public Builder setBilirubina_diretta___ne(String bilirubina_diretta___ne) {
            this.bilirubina_diretta___ne = bilirubina_diretta___ne;
            return this;
        }

        public Builder setBilirubina_diretta___null(Boolean bilirubina_diretta___null) {
            this.bilirubina_diretta___null = bilirubina_diretta___null;
            return this;
        }

        public Builder setBilirubina_diretta___not___null(Boolean bilirubina_diretta___not___null) {
            this.bilirubina_diretta___not___null = bilirubina_diretta___not___null;
            return this;
        }

        public Builder setBilirubina_diretta___in(java.util.List<String> bilirubina_diretta___in) {
            this.bilirubina_diretta___in = bilirubina_diretta___in;
            return this;
        }

        public Builder setBilirubina_diretta___not___in(java.util.List<String> bilirubina_diretta___not___in) {
            this.bilirubina_diretta___not___in = bilirubina_diretta___not___in;
            return this;
        }

        public Builder setBilirubina_diretta___lt(String bilirubina_diretta___lt) {
            this.bilirubina_diretta___lt = bilirubina_diretta___lt;
            return this;
        }

        public Builder setBilirubina_diretta___lte(String bilirubina_diretta___lte) {
            this.bilirubina_diretta___lte = bilirubina_diretta___lte;
            return this;
        }

        public Builder setBilirubina_diretta___gt(String bilirubina_diretta___gt) {
            this.bilirubina_diretta___gt = bilirubina_diretta___gt;
            return this;
        }

        public Builder setBilirubina_diretta___gte(String bilirubina_diretta___gte) {
            this.bilirubina_diretta___gte = bilirubina_diretta___gte;
            return this;
        }

        public Builder setBilirubina_totale___eq(String bilirubina_totale___eq) {
            this.bilirubina_totale___eq = bilirubina_totale___eq;
            return this;
        }

        public Builder setBilirubina_totale___ne(String bilirubina_totale___ne) {
            this.bilirubina_totale___ne = bilirubina_totale___ne;
            return this;
        }

        public Builder setBilirubina_totale___null(Boolean bilirubina_totale___null) {
            this.bilirubina_totale___null = bilirubina_totale___null;
            return this;
        }

        public Builder setBilirubina_totale___not___null(Boolean bilirubina_totale___not___null) {
            this.bilirubina_totale___not___null = bilirubina_totale___not___null;
            return this;
        }

        public Builder setBilirubina_totale___in(java.util.List<String> bilirubina_totale___in) {
            this.bilirubina_totale___in = bilirubina_totale___in;
            return this;
        }

        public Builder setBilirubina_totale___not___in(java.util.List<String> bilirubina_totale___not___in) {
            this.bilirubina_totale___not___in = bilirubina_totale___not___in;
            return this;
        }

        public Builder setBilirubina_totale___lt(String bilirubina_totale___lt) {
            this.bilirubina_totale___lt = bilirubina_totale___lt;
            return this;
        }

        public Builder setBilirubina_totale___lte(String bilirubina_totale___lte) {
            this.bilirubina_totale___lte = bilirubina_totale___lte;
            return this;
        }

        public Builder setBilirubina_totale___gt(String bilirubina_totale___gt) {
            this.bilirubina_totale___gt = bilirubina_totale___gt;
            return this;
        }

        public Builder setBilirubina_totale___gte(String bilirubina_totale___gte) {
            this.bilirubina_totale___gte = bilirubina_totale___gte;
            return this;
        }

        public Builder setBirra___eq(Integer birra___eq) {
            this.birra___eq = birra___eq;
            return this;
        }

        public Builder setBirra___ne(Integer birra___ne) {
            this.birra___ne = birra___ne;
            return this;
        }

        public Builder setBirra___null(Boolean birra___null) {
            this.birra___null = birra___null;
            return this;
        }

        public Builder setBirra___not___null(Boolean birra___not___null) {
            this.birra___not___null = birra___not___null;
            return this;
        }

        public Builder setBirra___in(java.util.List<Integer> birra___in) {
            this.birra___in = birra___in;
            return this;
        }

        public Builder setBirra___not___in(java.util.List<Integer> birra___not___in) {
            this.birra___not___in = birra___not___in;
            return this;
        }

        public Builder setBirra___lt(Integer birra___lt) {
            this.birra___lt = birra___lt;
            return this;
        }

        public Builder setBirra___lte(Integer birra___lte) {
            this.birra___lte = birra___lte;
            return this;
        }

        public Builder setBirra___gt(Integer birra___gt) {
            this.birra___gt = birra___gt;
            return this;
        }

        public Builder setBirra___gte(Integer birra___gte) {
            this.birra___gte = birra___gte;
            return this;
        }

        public Builder setCalcio___eq(String calcio___eq) {
            this.calcio___eq = calcio___eq;
            return this;
        }

        public Builder setCalcio___ne(String calcio___ne) {
            this.calcio___ne = calcio___ne;
            return this;
        }

        public Builder setCalcio___null(Boolean calcio___null) {
            this.calcio___null = calcio___null;
            return this;
        }

        public Builder setCalcio___not___null(Boolean calcio___not___null) {
            this.calcio___not___null = calcio___not___null;
            return this;
        }

        public Builder setCalcio___in(java.util.List<String> calcio___in) {
            this.calcio___in = calcio___in;
            return this;
        }

        public Builder setCalcio___not___in(java.util.List<String> calcio___not___in) {
            this.calcio___not___in = calcio___not___in;
            return this;
        }

        public Builder setCalcio___lt(String calcio___lt) {
            this.calcio___lt = calcio___lt;
            return this;
        }

        public Builder setCalcio___lte(String calcio___lte) {
            this.calcio___lte = calcio___lte;
            return this;
        }

        public Builder setCalcio___gt(String calcio___gt) {
            this.calcio___gt = calcio___gt;
            return this;
        }

        public Builder setCalcio___gte(String calcio___gte) {
            this.calcio___gte = calcio___gte;
            return this;
        }

        public Builder setCampione___eq(Boolean campione___eq) {
            this.campione___eq = campione___eq;
            return this;
        }

        public Builder setCampione___ne(Boolean campione___ne) {
            this.campione___ne = campione___ne;
            return this;
        }

        public Builder setCampione___null(Boolean campione___null) {
            this.campione___null = campione___null;
            return this;
        }

        public Builder setCampione___not___null(Boolean campione___not___null) {
            this.campione___not___null = campione___not___null;
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

        public Builder setCirconferenza_vita___eq(Integer circonferenza_vita___eq) {
            this.circonferenza_vita___eq = circonferenza_vita___eq;
            return this;
        }

        public Builder setCirconferenza_vita___ne(Integer circonferenza_vita___ne) {
            this.circonferenza_vita___ne = circonferenza_vita___ne;
            return this;
        }

        public Builder setCirconferenza_vita___null(Boolean circonferenza_vita___null) {
            this.circonferenza_vita___null = circonferenza_vita___null;
            return this;
        }

        public Builder setCirconferenza_vita___not___null(Boolean circonferenza_vita___not___null) {
            this.circonferenza_vita___not___null = circonferenza_vita___not___null;
            return this;
        }

        public Builder setCirconferenza_vita___in(java.util.List<Integer> circonferenza_vita___in) {
            this.circonferenza_vita___in = circonferenza_vita___in;
            return this;
        }

        public Builder setCirconferenza_vita___not___in(java.util.List<Integer> circonferenza_vita___not___in) {
            this.circonferenza_vita___not___in = circonferenza_vita___not___in;
            return this;
        }

        public Builder setCirconferenza_vita___lt(Integer circonferenza_vita___lt) {
            this.circonferenza_vita___lt = circonferenza_vita___lt;
            return this;
        }

        public Builder setCirconferenza_vita___lte(Integer circonferenza_vita___lte) {
            this.circonferenza_vita___lte = circonferenza_vita___lte;
            return this;
        }

        public Builder setCirconferenza_vita___gt(Integer circonferenza_vita___gt) {
            this.circonferenza_vita___gt = circonferenza_vita___gt;
            return this;
        }

        public Builder setCirconferenza_vita___gte(Integer circonferenza_vita___gte) {
            this.circonferenza_vita___gte = circonferenza_vita___gte;
            return this;
        }

        public Builder setCmvigg___eq(Boolean cmvigg___eq) {
            this.cmvigg___eq = cmvigg___eq;
            return this;
        }

        public Builder setCmvigg___ne(Boolean cmvigg___ne) {
            this.cmvigg___ne = cmvigg___ne;
            return this;
        }

        public Builder setCmvigg___null(Boolean cmvigg___null) {
            this.cmvigg___null = cmvigg___null;
            return this;
        }

        public Builder setCmvigg___not___null(Boolean cmvigg___not___null) {
            this.cmvigg___not___null = cmvigg___not___null;
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

        public Builder setColesterolo___eq(Integer colesterolo___eq) {
            this.colesterolo___eq = colesterolo___eq;
            return this;
        }

        public Builder setColesterolo___ne(Integer colesterolo___ne) {
            this.colesterolo___ne = colesterolo___ne;
            return this;
        }

        public Builder setColesterolo___null(Boolean colesterolo___null) {
            this.colesterolo___null = colesterolo___null;
            return this;
        }

        public Builder setColesterolo___not___null(Boolean colesterolo___not___null) {
            this.colesterolo___not___null = colesterolo___not___null;
            return this;
        }

        public Builder setColesterolo___in(java.util.List<Integer> colesterolo___in) {
            this.colesterolo___in = colesterolo___in;
            return this;
        }

        public Builder setColesterolo___not___in(java.util.List<Integer> colesterolo___not___in) {
            this.colesterolo___not___in = colesterolo___not___in;
            return this;
        }

        public Builder setColesterolo___lt(Integer colesterolo___lt) {
            this.colesterolo___lt = colesterolo___lt;
            return this;
        }

        public Builder setColesterolo___lte(Integer colesterolo___lte) {
            this.colesterolo___lte = colesterolo___lte;
            return this;
        }

        public Builder setColesterolo___gt(Integer colesterolo___gt) {
            this.colesterolo___gt = colesterolo___gt;
            return this;
        }

        public Builder setColesterolo___gte(Integer colesterolo___gte) {
            this.colesterolo___gte = colesterolo___gte;
            return this;
        }

        public Builder setCov_igg___eq(Boolean cov_igg___eq) {
            this.cov_igg___eq = cov_igg___eq;
            return this;
        }

        public Builder setCov_igg___ne(Boolean cov_igg___ne) {
            this.cov_igg___ne = cov_igg___ne;
            return this;
        }

        public Builder setCov_igg___null(Boolean cov_igg___null) {
            this.cov_igg___null = cov_igg___null;
            return this;
        }

        public Builder setCov_igg___not___null(Boolean cov_igg___not___null) {
            this.cov_igg___not___null = cov_igg___not___null;
            return this;
        }

        public Builder setCov_igg_titolo___eq(String cov_igg_titolo___eq) {
            this.cov_igg_titolo___eq = cov_igg_titolo___eq;
            return this;
        }

        public Builder setCov_igg_titolo___ne(String cov_igg_titolo___ne) {
            this.cov_igg_titolo___ne = cov_igg_titolo___ne;
            return this;
        }

        public Builder setCov_igg_titolo___null(Boolean cov_igg_titolo___null) {
            this.cov_igg_titolo___null = cov_igg_titolo___null;
            return this;
        }

        public Builder setCov_igg_titolo___not___null(Boolean cov_igg_titolo___not___null) {
            this.cov_igg_titolo___not___null = cov_igg_titolo___not___null;
            return this;
        }

        public Builder setCov_igg_titolo___in(java.util.List<String> cov_igg_titolo___in) {
            this.cov_igg_titolo___in = cov_igg_titolo___in;
            return this;
        }

        public Builder setCov_igg_titolo___not___in(java.util.List<String> cov_igg_titolo___not___in) {
            this.cov_igg_titolo___not___in = cov_igg_titolo___not___in;
            return this;
        }

        public Builder setCov_igg_titolo___lt(String cov_igg_titolo___lt) {
            this.cov_igg_titolo___lt = cov_igg_titolo___lt;
            return this;
        }

        public Builder setCov_igg_titolo___lte(String cov_igg_titolo___lte) {
            this.cov_igg_titolo___lte = cov_igg_titolo___lte;
            return this;
        }

        public Builder setCov_igg_titolo___gt(String cov_igg_titolo___gt) {
            this.cov_igg_titolo___gt = cov_igg_titolo___gt;
            return this;
        }

        public Builder setCov_igg_titolo___gte(String cov_igg_titolo___gte) {
            this.cov_igg_titolo___gte = cov_igg_titolo___gte;
            return this;
        }

        public Builder setCov_igm___eq(Boolean cov_igm___eq) {
            this.cov_igm___eq = cov_igm___eq;
            return this;
        }

        public Builder setCov_igm___ne(Boolean cov_igm___ne) {
            this.cov_igm___ne = cov_igm___ne;
            return this;
        }

        public Builder setCov_igm___null(Boolean cov_igm___null) {
            this.cov_igm___null = cov_igm___null;
            return this;
        }

        public Builder setCov_igm___not___null(Boolean cov_igm___not___null) {
            this.cov_igm___not___null = cov_igm___not___null;
            return this;
        }

        public Builder setCov_igm_titolo___eq(String cov_igm_titolo___eq) {
            this.cov_igm_titolo___eq = cov_igm_titolo___eq;
            return this;
        }

        public Builder setCov_igm_titolo___ne(String cov_igm_titolo___ne) {
            this.cov_igm_titolo___ne = cov_igm_titolo___ne;
            return this;
        }

        public Builder setCov_igm_titolo___null(Boolean cov_igm_titolo___null) {
            this.cov_igm_titolo___null = cov_igm_titolo___null;
            return this;
        }

        public Builder setCov_igm_titolo___not___null(Boolean cov_igm_titolo___not___null) {
            this.cov_igm_titolo___not___null = cov_igm_titolo___not___null;
            return this;
        }

        public Builder setCov_igm_titolo___in(java.util.List<String> cov_igm_titolo___in) {
            this.cov_igm_titolo___in = cov_igm_titolo___in;
            return this;
        }

        public Builder setCov_igm_titolo___not___in(java.util.List<String> cov_igm_titolo___not___in) {
            this.cov_igm_titolo___not___in = cov_igm_titolo___not___in;
            return this;
        }

        public Builder setCov_igm_titolo___lt(String cov_igm_titolo___lt) {
            this.cov_igm_titolo___lt = cov_igm_titolo___lt;
            return this;
        }

        public Builder setCov_igm_titolo___lte(String cov_igm_titolo___lte) {
            this.cov_igm_titolo___lte = cov_igm_titolo___lte;
            return this;
        }

        public Builder setCov_igm_titolo___gt(String cov_igm_titolo___gt) {
            this.cov_igm_titolo___gt = cov_igm_titolo___gt;
            return this;
        }

        public Builder setCov_igm_titolo___gte(String cov_igm_titolo___gte) {
            this.cov_igm_titolo___gte = cov_igm_titolo___gte;
            return this;
        }

        public Builder setCov_rna___eq(Boolean cov_rna___eq) {
            this.cov_rna___eq = cov_rna___eq;
            return this;
        }

        public Builder setCov_rna___ne(Boolean cov_rna___ne) {
            this.cov_rna___ne = cov_rna___ne;
            return this;
        }

        public Builder setCov_rna___null(Boolean cov_rna___null) {
            this.cov_rna___null = cov_rna___null;
            return this;
        }

        public Builder setCov_rna___not___null(Boolean cov_rna___not___null) {
            this.cov_rna___not___null = cov_rna___not___null;
            return this;
        }

        public Builder setCov_test___eq(String cov_test___eq) {
            this.cov_test___eq = cov_test___eq;
            return this;
        }

        public Builder setCov_test___ne(String cov_test___ne) {
            this.cov_test___ne = cov_test___ne;
            return this;
        }

        public Builder setCov_test___null(Boolean cov_test___null) {
            this.cov_test___null = cov_test___null;
            return this;
        }

        public Builder setCov_test___not___null(Boolean cov_test___not___null) {
            this.cov_test___not___null = cov_test___not___null;
            return this;
        }

        public Builder setCov_test___in(java.util.List<String> cov_test___in) {
            this.cov_test___in = cov_test___in;
            return this;
        }

        public Builder setCov_test___not___in(java.util.List<String> cov_test___not___in) {
            this.cov_test___not___in = cov_test___not___in;
            return this;
        }

        public Builder setCov_test___lt(String cov_test___lt) {
            this.cov_test___lt = cov_test___lt;
            return this;
        }

        public Builder setCov_test___lte(String cov_test___lte) {
            this.cov_test___lte = cov_test___lte;
            return this;
        }

        public Builder setCov_test___gt(String cov_test___gt) {
            this.cov_test___gt = cov_test___gt;
            return this;
        }

        public Builder setCov_test___gte(String cov_test___gte) {
            this.cov_test___gte = cov_test___gte;
            return this;
        }

        public Builder setCov_test___contains(String cov_test___contains) {
            this.cov_test___contains = cov_test___contains;
            return this;
        }

        public Builder setCov_test___not___contains(String cov_test___not___contains) {
            this.cov_test___not___contains = cov_test___not___contains;
            return this;
        }

        public Builder setCov_test___starts_with(String cov_test___starts_with) {
            this.cov_test___starts_with = cov_test___starts_with;
            return this;
        }

        public Builder setCov_test___not___starts_with(String cov_test___not___starts_with) {
            this.cov_test___not___starts_with = cov_test___not___starts_with;
            return this;
        }

        public Builder setCov_test___ends_with(String cov_test___ends_with) {
            this.cov_test___ends_with = cov_test___ends_with;
            return this;
        }

        public Builder setCov_test___not___ends_with(String cov_test___not___ends_with) {
            this.cov_test___not___ends_with = cov_test___not___ends_with;
            return this;
        }

        public Builder setCov_vax___eq(Boolean cov_vax___eq) {
            this.cov_vax___eq = cov_vax___eq;
            return this;
        }

        public Builder setCov_vax___ne(Boolean cov_vax___ne) {
            this.cov_vax___ne = cov_vax___ne;
            return this;
        }

        public Builder setCov_vax___null(Boolean cov_vax___null) {
            this.cov_vax___null = cov_vax___null;
            return this;
        }

        public Builder setCov_vax___not___null(Boolean cov_vax___not___null) {
            this.cov_vax___not___null = cov_vax___not___null;
            return this;
        }

        public Builder setCreatinina___eq(String creatinina___eq) {
            this.creatinina___eq = creatinina___eq;
            return this;
        }

        public Builder setCreatinina___ne(String creatinina___ne) {
            this.creatinina___ne = creatinina___ne;
            return this;
        }

        public Builder setCreatinina___null(Boolean creatinina___null) {
            this.creatinina___null = creatinina___null;
            return this;
        }

        public Builder setCreatinina___not___null(Boolean creatinina___not___null) {
            this.creatinina___not___null = creatinina___not___null;
            return this;
        }

        public Builder setCreatinina___in(java.util.List<String> creatinina___in) {
            this.creatinina___in = creatinina___in;
            return this;
        }

        public Builder setCreatinina___not___in(java.util.List<String> creatinina___not___in) {
            this.creatinina___not___in = creatinina___not___in;
            return this;
        }

        public Builder setCreatinina___lt(String creatinina___lt) {
            this.creatinina___lt = creatinina___lt;
            return this;
        }

        public Builder setCreatinina___lte(String creatinina___lte) {
            this.creatinina___lte = creatinina___lte;
            return this;
        }

        public Builder setCreatinina___gt(String creatinina___gt) {
            this.creatinina___gt = creatinina___gt;
            return this;
        }

        public Builder setCreatinina___gte(String creatinina___gte) {
            this.creatinina___gte = creatinina___gte;
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

        public Builder setData_campione___eq(String data_campione___eq) {
            this.data_campione___eq = data_campione___eq;
            return this;
        }

        public Builder setData_campione___ne(String data_campione___ne) {
            this.data_campione___ne = data_campione___ne;
            return this;
        }

        public Builder setData_campione___null(Boolean data_campione___null) {
            this.data_campione___null = data_campione___null;
            return this;
        }

        public Builder setData_campione___not___null(Boolean data_campione___not___null) {
            this.data_campione___not___null = data_campione___not___null;
            return this;
        }

        public Builder setData_campione___in(java.util.List<String> data_campione___in) {
            this.data_campione___in = data_campione___in;
            return this;
        }

        public Builder setData_campione___not___in(java.util.List<String> data_campione___not___in) {
            this.data_campione___not___in = data_campione___not___in;
            return this;
        }

        public Builder setData_campione___lt(String data_campione___lt) {
            this.data_campione___lt = data_campione___lt;
            return this;
        }

        public Builder setData_campione___lte(String data_campione___lte) {
            this.data_campione___lte = data_campione___lte;
            return this;
        }

        public Builder setData_campione___gt(String data_campione___gt) {
            this.data_campione___gt = data_campione___gt;
            return this;
        }

        public Builder setData_campione___gte(String data_campione___gte) {
            this.data_campione___gte = data_campione___gte;
            return this;
        }

        public Builder setData_presunta_parto___eq(String data_presunta_parto___eq) {
            this.data_presunta_parto___eq = data_presunta_parto___eq;
            return this;
        }

        public Builder setData_presunta_parto___ne(String data_presunta_parto___ne) {
            this.data_presunta_parto___ne = data_presunta_parto___ne;
            return this;
        }

        public Builder setData_presunta_parto___null(Boolean data_presunta_parto___null) {
            this.data_presunta_parto___null = data_presunta_parto___null;
            return this;
        }

        public Builder setData_presunta_parto___not___null(Boolean data_presunta_parto___not___null) {
            this.data_presunta_parto___not___null = data_presunta_parto___not___null;
            return this;
        }

        public Builder setData_presunta_parto___in(java.util.List<String> data_presunta_parto___in) {
            this.data_presunta_parto___in = data_presunta_parto___in;
            return this;
        }

        public Builder setData_presunta_parto___not___in(java.util.List<String> data_presunta_parto___not___in) {
            this.data_presunta_parto___not___in = data_presunta_parto___not___in;
            return this;
        }

        public Builder setData_presunta_parto___lt(String data_presunta_parto___lt) {
            this.data_presunta_parto___lt = data_presunta_parto___lt;
            return this;
        }

        public Builder setData_presunta_parto___lte(String data_presunta_parto___lte) {
            this.data_presunta_parto___lte = data_presunta_parto___lte;
            return this;
        }

        public Builder setData_presunta_parto___gt(String data_presunta_parto___gt) {
            this.data_presunta_parto___gt = data_presunta_parto___gt;
            return this;
        }

        public Builder setData_presunta_parto___gte(String data_presunta_parto___gte) {
            this.data_presunta_parto___gte = data_presunta_parto___gte;
            return this;
        }

        public Builder setData_questionario___eq(String data_questionario___eq) {
            this.data_questionario___eq = data_questionario___eq;
            return this;
        }

        public Builder setData_questionario___ne(String data_questionario___ne) {
            this.data_questionario___ne = data_questionario___ne;
            return this;
        }

        public Builder setData_questionario___null(Boolean data_questionario___null) {
            this.data_questionario___null = data_questionario___null;
            return this;
        }

        public Builder setData_questionario___not___null(Boolean data_questionario___not___null) {
            this.data_questionario___not___null = data_questionario___not___null;
            return this;
        }

        public Builder setData_questionario___in(java.util.List<String> data_questionario___in) {
            this.data_questionario___in = data_questionario___in;
            return this;
        }

        public Builder setData_questionario___not___in(java.util.List<String> data_questionario___not___in) {
            this.data_questionario___not___in = data_questionario___not___in;
            return this;
        }

        public Builder setData_questionario___lt(String data_questionario___lt) {
            this.data_questionario___lt = data_questionario___lt;
            return this;
        }

        public Builder setData_questionario___lte(String data_questionario___lte) {
            this.data_questionario___lte = data_questionario___lte;
            return this;
        }

        public Builder setData_questionario___gt(String data_questionario___gt) {
            this.data_questionario___gt = data_questionario___gt;
            return this;
        }

        public Builder setData_questionario___gte(String data_questionario___gte) {
            this.data_questionario___gte = data_questionario___gte;
            return this;
        }

        public Builder setDosi_omesse___eq(Integer dosi_omesse___eq) {
            this.dosi_omesse___eq = dosi_omesse___eq;
            return this;
        }

        public Builder setDosi_omesse___ne(Integer dosi_omesse___ne) {
            this.dosi_omesse___ne = dosi_omesse___ne;
            return this;
        }

        public Builder setDosi_omesse___null(Boolean dosi_omesse___null) {
            this.dosi_omesse___null = dosi_omesse___null;
            return this;
        }

        public Builder setDosi_omesse___not___null(Boolean dosi_omesse___not___null) {
            this.dosi_omesse___not___null = dosi_omesse___not___null;
            return this;
        }

        public Builder setDosi_omesse___in(java.util.List<Integer> dosi_omesse___in) {
            this.dosi_omesse___in = dosi_omesse___in;
            return this;
        }

        public Builder setDosi_omesse___not___in(java.util.List<Integer> dosi_omesse___not___in) {
            this.dosi_omesse___not___in = dosi_omesse___not___in;
            return this;
        }

        public Builder setDosi_omesse___lt(Integer dosi_omesse___lt) {
            this.dosi_omesse___lt = dosi_omesse___lt;
            return this;
        }

        public Builder setDosi_omesse___lte(Integer dosi_omesse___lte) {
            this.dosi_omesse___lte = dosi_omesse___lte;
            return this;
        }

        public Builder setDosi_omesse___gt(Integer dosi_omesse___gt) {
            this.dosi_omesse___gt = dosi_omesse___gt;
            return this;
        }

        public Builder setDosi_omesse___gte(Integer dosi_omesse___gte) {
            this.dosi_omesse___gte = dosi_omesse___gte;
            return this;
        }

        public Builder setEmoglobina___eq(String emoglobina___eq) {
            this.emoglobina___eq = emoglobina___eq;
            return this;
        }

        public Builder setEmoglobina___ne(String emoglobina___ne) {
            this.emoglobina___ne = emoglobina___ne;
            return this;
        }

        public Builder setEmoglobina___null(Boolean emoglobina___null) {
            this.emoglobina___null = emoglobina___null;
            return this;
        }

        public Builder setEmoglobina___not___null(Boolean emoglobina___not___null) {
            this.emoglobina___not___null = emoglobina___not___null;
            return this;
        }

        public Builder setEmoglobina___in(java.util.List<String> emoglobina___in) {
            this.emoglobina___in = emoglobina___in;
            return this;
        }

        public Builder setEmoglobina___not___in(java.util.List<String> emoglobina___not___in) {
            this.emoglobina___not___in = emoglobina___not___in;
            return this;
        }

        public Builder setEmoglobina___lt(String emoglobina___lt) {
            this.emoglobina___lt = emoglobina___lt;
            return this;
        }

        public Builder setEmoglobina___lte(String emoglobina___lte) {
            this.emoglobina___lte = emoglobina___lte;
            return this;
        }

        public Builder setEmoglobina___gt(String emoglobina___gt) {
            this.emoglobina___gt = emoglobina___gt;
            return this;
        }

        public Builder setEmoglobina___gte(String emoglobina___gte) {
            this.emoglobina___gte = emoglobina___gte;
            return this;
        }

        public Builder setEmoglobina_glicata___eq(String emoglobina_glicata___eq) {
            this.emoglobina_glicata___eq = emoglobina_glicata___eq;
            return this;
        }

        public Builder setEmoglobina_glicata___ne(String emoglobina_glicata___ne) {
            this.emoglobina_glicata___ne = emoglobina_glicata___ne;
            return this;
        }

        public Builder setEmoglobina_glicata___null(Boolean emoglobina_glicata___null) {
            this.emoglobina_glicata___null = emoglobina_glicata___null;
            return this;
        }

        public Builder setEmoglobina_glicata___not___null(Boolean emoglobina_glicata___not___null) {
            this.emoglobina_glicata___not___null = emoglobina_glicata___not___null;
            return this;
        }

        public Builder setEmoglobina_glicata___in(java.util.List<String> emoglobina_glicata___in) {
            this.emoglobina_glicata___in = emoglobina_glicata___in;
            return this;
        }

        public Builder setEmoglobina_glicata___not___in(java.util.List<String> emoglobina_glicata___not___in) {
            this.emoglobina_glicata___not___in = emoglobina_glicata___not___in;
            return this;
        }

        public Builder setEmoglobina_glicata___lt(String emoglobina_glicata___lt) {
            this.emoglobina_glicata___lt = emoglobina_glicata___lt;
            return this;
        }

        public Builder setEmoglobina_glicata___lte(String emoglobina_glicata___lte) {
            this.emoglobina_glicata___lte = emoglobina_glicata___lte;
            return this;
        }

        public Builder setEmoglobina_glicata___gt(String emoglobina_glicata___gt) {
            this.emoglobina_glicata___gt = emoglobina_glicata___gt;
            return this;
        }

        public Builder setEmoglobina_glicata___gte(String emoglobina_glicata___gte) {
            this.emoglobina_glicata___gte = emoglobina_glicata___gte;
            return this;
        }

        public Builder setFollowup_questionario___eq(String followup_questionario___eq) {
            this.followup_questionario___eq = followup_questionario___eq;
            return this;
        }

        public Builder setFollowup_questionario___ne(String followup_questionario___ne) {
            this.followup_questionario___ne = followup_questionario___ne;
            return this;
        }

        public Builder setFollowup_questionario___null(Boolean followup_questionario___null) {
            this.followup_questionario___null = followup_questionario___null;
            return this;
        }

        public Builder setFollowup_questionario___not___null(Boolean followup_questionario___not___null) {
            this.followup_questionario___not___null = followup_questionario___not___null;
            return this;
        }

        public Builder setFollowup_questionario___in(java.util.List<String> followup_questionario___in) {
            this.followup_questionario___in = followup_questionario___in;
            return this;
        }

        public Builder setFollowup_questionario___not___in(java.util.List<String> followup_questionario___not___in) {
            this.followup_questionario___not___in = followup_questionario___not___in;
            return this;
        }

        public Builder setFollowup_questionario___lt(String followup_questionario___lt) {
            this.followup_questionario___lt = followup_questionario___lt;
            return this;
        }

        public Builder setFollowup_questionario___lte(String followup_questionario___lte) {
            this.followup_questionario___lte = followup_questionario___lte;
            return this;
        }

        public Builder setFollowup_questionario___gt(String followup_questionario___gt) {
            this.followup_questionario___gt = followup_questionario___gt;
            return this;
        }

        public Builder setFollowup_questionario___gte(String followup_questionario___gte) {
            this.followup_questionario___gte = followup_questionario___gte;
            return this;
        }

        public Builder setFollowup_questionario___contains(String followup_questionario___contains) {
            this.followup_questionario___contains = followup_questionario___contains;
            return this;
        }

        public Builder setFollowup_questionario___not___contains(String followup_questionario___not___contains) {
            this.followup_questionario___not___contains = followup_questionario___not___contains;
            return this;
        }

        public Builder setFollowup_questionario___starts_with(String followup_questionario___starts_with) {
            this.followup_questionario___starts_with = followup_questionario___starts_with;
            return this;
        }

        public Builder setFollowup_questionario___not___starts_with(String followup_questionario___not___starts_with) {
            this.followup_questionario___not___starts_with = followup_questionario___not___starts_with;
            return this;
        }

        public Builder setFollowup_questionario___ends_with(String followup_questionario___ends_with) {
            this.followup_questionario___ends_with = followup_questionario___ends_with;
            return this;
        }

        public Builder setFollowup_questionario___not___ends_with(String followup_questionario___not___ends_with) {
            this.followup_questionario___not___ends_with = followup_questionario___not___ends_with;
            return this;
        }

        public Builder setFosfatasi_alcalina___eq(Integer fosfatasi_alcalina___eq) {
            this.fosfatasi_alcalina___eq = fosfatasi_alcalina___eq;
            return this;
        }

        public Builder setFosfatasi_alcalina___ne(Integer fosfatasi_alcalina___ne) {
            this.fosfatasi_alcalina___ne = fosfatasi_alcalina___ne;
            return this;
        }

        public Builder setFosfatasi_alcalina___null(Boolean fosfatasi_alcalina___null) {
            this.fosfatasi_alcalina___null = fosfatasi_alcalina___null;
            return this;
        }

        public Builder setFosfatasi_alcalina___not___null(Boolean fosfatasi_alcalina___not___null) {
            this.fosfatasi_alcalina___not___null = fosfatasi_alcalina___not___null;
            return this;
        }

        public Builder setFosfatasi_alcalina___in(java.util.List<Integer> fosfatasi_alcalina___in) {
            this.fosfatasi_alcalina___in = fosfatasi_alcalina___in;
            return this;
        }

        public Builder setFosfatasi_alcalina___not___in(java.util.List<Integer> fosfatasi_alcalina___not___in) {
            this.fosfatasi_alcalina___not___in = fosfatasi_alcalina___not___in;
            return this;
        }

        public Builder setFosfatasi_alcalina___lt(Integer fosfatasi_alcalina___lt) {
            this.fosfatasi_alcalina___lt = fosfatasi_alcalina___lt;
            return this;
        }

        public Builder setFosfatasi_alcalina___lte(Integer fosfatasi_alcalina___lte) {
            this.fosfatasi_alcalina___lte = fosfatasi_alcalina___lte;
            return this;
        }

        public Builder setFosfatasi_alcalina___gt(Integer fosfatasi_alcalina___gt) {
            this.fosfatasi_alcalina___gt = fosfatasi_alcalina___gt;
            return this;
        }

        public Builder setFosfatasi_alcalina___gte(Integer fosfatasi_alcalina___gte) {
            this.fosfatasi_alcalina___gte = fosfatasi_alcalina___gte;
            return this;
        }

        public Builder setFosforo___eq(String fosforo___eq) {
            this.fosforo___eq = fosforo___eq;
            return this;
        }

        public Builder setFosforo___ne(String fosforo___ne) {
            this.fosforo___ne = fosforo___ne;
            return this;
        }

        public Builder setFosforo___null(Boolean fosforo___null) {
            this.fosforo___null = fosforo___null;
            return this;
        }

        public Builder setFosforo___not___null(Boolean fosforo___not___null) {
            this.fosforo___not___null = fosforo___not___null;
            return this;
        }

        public Builder setFosforo___in(java.util.List<String> fosforo___in) {
            this.fosforo___in = fosforo___in;
            return this;
        }

        public Builder setFosforo___not___in(java.util.List<String> fosforo___not___in) {
            this.fosforo___not___in = fosforo___not___in;
            return this;
        }

        public Builder setFosforo___lt(String fosforo___lt) {
            this.fosforo___lt = fosforo___lt;
            return this;
        }

        public Builder setFosforo___lte(String fosforo___lte) {
            this.fosforo___lte = fosforo___lte;
            return this;
        }

        public Builder setFosforo___gt(String fosforo___gt) {
            this.fosforo___gt = fosforo___gt;
            return this;
        }

        public Builder setFosforo___gte(String fosforo___gte) {
            this.fosforo___gte = fosforo___gte;
            return this;
        }

        public Builder setFrequenza___eq(String frequenza___eq) {
            this.frequenza___eq = frequenza___eq;
            return this;
        }

        public Builder setFrequenza___ne(String frequenza___ne) {
            this.frequenza___ne = frequenza___ne;
            return this;
        }

        public Builder setFrequenza___null(Boolean frequenza___null) {
            this.frequenza___null = frequenza___null;
            return this;
        }

        public Builder setFrequenza___not___null(Boolean frequenza___not___null) {
            this.frequenza___not___null = frequenza___not___null;
            return this;
        }

        public Builder setFrequenza___in(java.util.List<String> frequenza___in) {
            this.frequenza___in = frequenza___in;
            return this;
        }

        public Builder setFrequenza___not___in(java.util.List<String> frequenza___not___in) {
            this.frequenza___not___in = frequenza___not___in;
            return this;
        }

        public Builder setFrequenza___lt(String frequenza___lt) {
            this.frequenza___lt = frequenza___lt;
            return this;
        }

        public Builder setFrequenza___lte(String frequenza___lte) {
            this.frequenza___lte = frequenza___lte;
            return this;
        }

        public Builder setFrequenza___gt(String frequenza___gt) {
            this.frequenza___gt = frequenza___gt;
            return this;
        }

        public Builder setFrequenza___gte(String frequenza___gte) {
            this.frequenza___gte = frequenza___gte;
            return this;
        }

        public Builder setFrequenza___contains(String frequenza___contains) {
            this.frequenza___contains = frequenza___contains;
            return this;
        }

        public Builder setFrequenza___not___contains(String frequenza___not___contains) {
            this.frequenza___not___contains = frequenza___not___contains;
            return this;
        }

        public Builder setFrequenza___starts_with(String frequenza___starts_with) {
            this.frequenza___starts_with = frequenza___starts_with;
            return this;
        }

        public Builder setFrequenza___not___starts_with(String frequenza___not___starts_with) {
            this.frequenza___not___starts_with = frequenza___not___starts_with;
            return this;
        }

        public Builder setFrequenza___ends_with(String frequenza___ends_with) {
            this.frequenza___ends_with = frequenza___ends_with;
            return this;
        }

        public Builder setFrequenza___not___ends_with(String frequenza___not___ends_with) {
            this.frequenza___not___ends_with = frequenza___not___ends_with;
            return this;
        }

        public Builder setFumatore_attivo___eq(Boolean fumatore_attivo___eq) {
            this.fumatore_attivo___eq = fumatore_attivo___eq;
            return this;
        }

        public Builder setFumatore_attivo___ne(Boolean fumatore_attivo___ne) {
            this.fumatore_attivo___ne = fumatore_attivo___ne;
            return this;
        }

        public Builder setFumatore_attivo___null(Boolean fumatore_attivo___null) {
            this.fumatore_attivo___null = fumatore_attivo___null;
            return this;
        }

        public Builder setFumatore_attivo___not___null(Boolean fumatore_attivo___not___null) {
            this.fumatore_attivo___not___null = fumatore_attivo___not___null;
            return this;
        }

        public Builder setGamma_gt___eq(Integer gamma_gt___eq) {
            this.gamma_gt___eq = gamma_gt___eq;
            return this;
        }

        public Builder setGamma_gt___ne(Integer gamma_gt___ne) {
            this.gamma_gt___ne = gamma_gt___ne;
            return this;
        }

        public Builder setGamma_gt___null(Boolean gamma_gt___null) {
            this.gamma_gt___null = gamma_gt___null;
            return this;
        }

        public Builder setGamma_gt___not___null(Boolean gamma_gt___not___null) {
            this.gamma_gt___not___null = gamma_gt___not___null;
            return this;
        }

        public Builder setGamma_gt___in(java.util.List<Integer> gamma_gt___in) {
            this.gamma_gt___in = gamma_gt___in;
            return this;
        }

        public Builder setGamma_gt___not___in(java.util.List<Integer> gamma_gt___not___in) {
            this.gamma_gt___not___in = gamma_gt___not___in;
            return this;
        }

        public Builder setGamma_gt___lt(Integer gamma_gt___lt) {
            this.gamma_gt___lt = gamma_gt___lt;
            return this;
        }

        public Builder setGamma_gt___lte(Integer gamma_gt___lte) {
            this.gamma_gt___lte = gamma_gt___lte;
            return this;
        }

        public Builder setGamma_gt___gt(Integer gamma_gt___gt) {
            this.gamma_gt___gt = gamma_gt___gt;
            return this;
        }

        public Builder setGamma_gt___gte(Integer gamma_gt___gte) {
            this.gamma_gt___gte = gamma_gt___gte;
            return this;
        }

        public Builder setGlicemia___eq(Integer glicemia___eq) {
            this.glicemia___eq = glicemia___eq;
            return this;
        }

        public Builder setGlicemia___ne(Integer glicemia___ne) {
            this.glicemia___ne = glicemia___ne;
            return this;
        }

        public Builder setGlicemia___null(Boolean glicemia___null) {
            this.glicemia___null = glicemia___null;
            return this;
        }

        public Builder setGlicemia___not___null(Boolean glicemia___not___null) {
            this.glicemia___not___null = glicemia___not___null;
            return this;
        }

        public Builder setGlicemia___in(java.util.List<Integer> glicemia___in) {
            this.glicemia___in = glicemia___in;
            return this;
        }

        public Builder setGlicemia___not___in(java.util.List<Integer> glicemia___not___in) {
            this.glicemia___not___in = glicemia___not___in;
            return this;
        }

        public Builder setGlicemia___lt(Integer glicemia___lt) {
            this.glicemia___lt = glicemia___lt;
            return this;
        }

        public Builder setGlicemia___lte(Integer glicemia___lte) {
            this.glicemia___lte = glicemia___lte;
            return this;
        }

        public Builder setGlicemia___gt(Integer glicemia___gt) {
            this.glicemia___gt = glicemia___gt;
            return this;
        }

        public Builder setGlicemia___gte(Integer glicemia___gte) {
            this.glicemia___gte = glicemia___gte;
            return this;
        }

        public Builder setGlobuli_bianchi___eq(Integer globuli_bianchi___eq) {
            this.globuli_bianchi___eq = globuli_bianchi___eq;
            return this;
        }

        public Builder setGlobuli_bianchi___ne(Integer globuli_bianchi___ne) {
            this.globuli_bianchi___ne = globuli_bianchi___ne;
            return this;
        }

        public Builder setGlobuli_bianchi___null(Boolean globuli_bianchi___null) {
            this.globuli_bianchi___null = globuli_bianchi___null;
            return this;
        }

        public Builder setGlobuli_bianchi___not___null(Boolean globuli_bianchi___not___null) {
            this.globuli_bianchi___not___null = globuli_bianchi___not___null;
            return this;
        }

        public Builder setGlobuli_bianchi___in(java.util.List<Integer> globuli_bianchi___in) {
            this.globuli_bianchi___in = globuli_bianchi___in;
            return this;
        }

        public Builder setGlobuli_bianchi___not___in(java.util.List<Integer> globuli_bianchi___not___in) {
            this.globuli_bianchi___not___in = globuli_bianchi___not___in;
            return this;
        }

        public Builder setGlobuli_bianchi___lt(Integer globuli_bianchi___lt) {
            this.globuli_bianchi___lt = globuli_bianchi___lt;
            return this;
        }

        public Builder setGlobuli_bianchi___lte(Integer globuli_bianchi___lte) {
            this.globuli_bianchi___lte = globuli_bianchi___lte;
            return this;
        }

        public Builder setGlobuli_bianchi___gt(Integer globuli_bianchi___gt) {
            this.globuli_bianchi___gt = globuli_bianchi___gt;
            return this;
        }

        public Builder setGlobuli_bianchi___gte(Integer globuli_bianchi___gte) {
            this.globuli_bianchi___gte = globuli_bianchi___gte;
            return this;
        }

        public Builder setGravidanza___eq(Boolean gravidanza___eq) {
            this.gravidanza___eq = gravidanza___eq;
            return this;
        }

        public Builder setGravidanza___ne(Boolean gravidanza___ne) {
            this.gravidanza___ne = gravidanza___ne;
            return this;
        }

        public Builder setGravidanza___null(Boolean gravidanza___null) {
            this.gravidanza___null = gravidanza___null;
            return this;
        }

        public Builder setGravidanza___not___null(Boolean gravidanza___not___null) {
            this.gravidanza___not___null = gravidanza___not___null;
            return this;
        }

        public Builder setHavabtotali___eq(Boolean havabtotali___eq) {
            this.havabtotali___eq = havabtotali___eq;
            return this;
        }

        public Builder setHavabtotali___ne(Boolean havabtotali___ne) {
            this.havabtotali___ne = havabtotali___ne;
            return this;
        }

        public Builder setHavabtotali___null(Boolean havabtotali___null) {
            this.havabtotali___null = havabtotali___null;
            return this;
        }

        public Builder setHavabtotali___not___null(Boolean havabtotali___not___null) {
            this.havabtotali___not___null = havabtotali___not___null;
            return this;
        }

        public Builder setHavigm___eq(Boolean havigm___eq) {
            this.havigm___eq = havigm___eq;
            return this;
        }

        public Builder setHavigm___ne(Boolean havigm___ne) {
            this.havigm___ne = havigm___ne;
            return this;
        }

        public Builder setHavigm___null(Boolean havigm___null) {
            this.havigm___null = havigm___null;
            return this;
        }

        public Builder setHavigm___not___null(Boolean havigm___not___null) {
            this.havigm___not___null = havigm___not___null;
            return this;
        }

        public Builder setHbcab___eq(Boolean hbcab___eq) {
            this.hbcab___eq = hbcab___eq;
            return this;
        }

        public Builder setHbcab___ne(Boolean hbcab___ne) {
            this.hbcab___ne = hbcab___ne;
            return this;
        }

        public Builder setHbcab___null(Boolean hbcab___null) {
            this.hbcab___null = hbcab___null;
            return this;
        }

        public Builder setHbcab___not___null(Boolean hbcab___not___null) {
            this.hbcab___not___null = hbcab___not___null;
            return this;
        }

        public Builder setHbcigm___eq(Boolean hbcigm___eq) {
            this.hbcigm___eq = hbcigm___eq;
            return this;
        }

        public Builder setHbcigm___ne(Boolean hbcigm___ne) {
            this.hbcigm___ne = hbcigm___ne;
            return this;
        }

        public Builder setHbcigm___null(Boolean hbcigm___null) {
            this.hbcigm___null = hbcigm___null;
            return this;
        }

        public Builder setHbcigm___not___null(Boolean hbcigm___not___null) {
            this.hbcigm___not___null = hbcigm___not___null;
            return this;
        }

        public Builder setHbeab___eq(Boolean hbeab___eq) {
            this.hbeab___eq = hbeab___eq;
            return this;
        }

        public Builder setHbeab___ne(Boolean hbeab___ne) {
            this.hbeab___ne = hbeab___ne;
            return this;
        }

        public Builder setHbeab___null(Boolean hbeab___null) {
            this.hbeab___null = hbeab___null;
            return this;
        }

        public Builder setHbeab___not___null(Boolean hbeab___not___null) {
            this.hbeab___not___null = hbeab___not___null;
            return this;
        }

        public Builder setHbeag___eq(Boolean hbeag___eq) {
            this.hbeag___eq = hbeag___eq;
            return this;
        }

        public Builder setHbeag___ne(Boolean hbeag___ne) {
            this.hbeag___ne = hbeag___ne;
            return this;
        }

        public Builder setHbeag___null(Boolean hbeag___null) {
            this.hbeag___null = hbeag___null;
            return this;
        }

        public Builder setHbeag___not___null(Boolean hbeag___not___null) {
            this.hbeag___not___null = hbeag___not___null;
            return this;
        }

        public Builder setHbsab___eq(Boolean hbsab___eq) {
            this.hbsab___eq = hbsab___eq;
            return this;
        }

        public Builder setHbsab___ne(Boolean hbsab___ne) {
            this.hbsab___ne = hbsab___ne;
            return this;
        }

        public Builder setHbsab___null(Boolean hbsab___null) {
            this.hbsab___null = hbsab___null;
            return this;
        }

        public Builder setHbsab___not___null(Boolean hbsab___not___null) {
            this.hbsab___not___null = hbsab___not___null;
            return this;
        }

        public Builder setHbsab_totali___eq(String hbsab_totali___eq) {
            this.hbsab_totali___eq = hbsab_totali___eq;
            return this;
        }

        public Builder setHbsab_totali___ne(String hbsab_totali___ne) {
            this.hbsab_totali___ne = hbsab_totali___ne;
            return this;
        }

        public Builder setHbsab_totali___null(Boolean hbsab_totali___null) {
            this.hbsab_totali___null = hbsab_totali___null;
            return this;
        }

        public Builder setHbsab_totali___not___null(Boolean hbsab_totali___not___null) {
            this.hbsab_totali___not___null = hbsab_totali___not___null;
            return this;
        }

        public Builder setHbsab_totali___in(java.util.List<String> hbsab_totali___in) {
            this.hbsab_totali___in = hbsab_totali___in;
            return this;
        }

        public Builder setHbsab_totali___not___in(java.util.List<String> hbsab_totali___not___in) {
            this.hbsab_totali___not___in = hbsab_totali___not___in;
            return this;
        }

        public Builder setHbsab_totali___lt(String hbsab_totali___lt) {
            this.hbsab_totali___lt = hbsab_totali___lt;
            return this;
        }

        public Builder setHbsab_totali___lte(String hbsab_totali___lte) {
            this.hbsab_totali___lte = hbsab_totali___lte;
            return this;
        }

        public Builder setHbsab_totali___gt(String hbsab_totali___gt) {
            this.hbsab_totali___gt = hbsab_totali___gt;
            return this;
        }

        public Builder setHbsab_totali___gte(String hbsab_totali___gte) {
            this.hbsab_totali___gte = hbsab_totali___gte;
            return this;
        }

        public Builder setHbsag___eq(Boolean hbsag___eq) {
            this.hbsag___eq = hbsag___eq;
            return this;
        }

        public Builder setHbsag___ne(Boolean hbsag___ne) {
            this.hbsag___ne = hbsag___ne;
            return this;
        }

        public Builder setHbsag___null(Boolean hbsag___null) {
            this.hbsag___null = hbsag___null;
            return this;
        }

        public Builder setHbsag___not___null(Boolean hbsag___not___null) {
            this.hbsag___not___null = hbsag___not___null;
            return this;
        }

        public Builder setHbsag_totali___eq(String hbsag_totali___eq) {
            this.hbsag_totali___eq = hbsag_totali___eq;
            return this;
        }

        public Builder setHbsag_totali___ne(String hbsag_totali___ne) {
            this.hbsag_totali___ne = hbsag_totali___ne;
            return this;
        }

        public Builder setHbsag_totali___null(Boolean hbsag_totali___null) {
            this.hbsag_totali___null = hbsag_totali___null;
            return this;
        }

        public Builder setHbsag_totali___not___null(Boolean hbsag_totali___not___null) {
            this.hbsag_totali___not___null = hbsag_totali___not___null;
            return this;
        }

        public Builder setHbsag_totali___in(java.util.List<String> hbsag_totali___in) {
            this.hbsag_totali___in = hbsag_totali___in;
            return this;
        }

        public Builder setHbsag_totali___not___in(java.util.List<String> hbsag_totali___not___in) {
            this.hbsag_totali___not___in = hbsag_totali___not___in;
            return this;
        }

        public Builder setHbsag_totali___lt(String hbsag_totali___lt) {
            this.hbsag_totali___lt = hbsag_totali___lt;
            return this;
        }

        public Builder setHbsag_totali___lte(String hbsag_totali___lte) {
            this.hbsag_totali___lte = hbsag_totali___lte;
            return this;
        }

        public Builder setHbsag_totali___gt(String hbsag_totali___gt) {
            this.hbsag_totali___gt = hbsag_totali___gt;
            return this;
        }

        public Builder setHbsag_totali___gte(String hbsag_totali___gte) {
            this.hbsag_totali___gte = hbsag_totali___gte;
            return this;
        }

        public Builder setHcvab___eq(Boolean hcvab___eq) {
            this.hcvab___eq = hcvab___eq;
            return this;
        }

        public Builder setHcvab___ne(Boolean hcvab___ne) {
            this.hcvab___ne = hcvab___ne;
            return this;
        }

        public Builder setHcvab___null(Boolean hcvab___null) {
            this.hcvab___null = hcvab___null;
            return this;
        }

        public Builder setHcvab___not___null(Boolean hcvab___not___null) {
            this.hcvab___not___null = hcvab___not___null;
            return this;
        }

        public Builder setHcvag___eq(Boolean hcvag___eq) {
            this.hcvag___eq = hcvag___eq;
            return this;
        }

        public Builder setHcvag___ne(Boolean hcvag___ne) {
            this.hcvag___ne = hcvag___ne;
            return this;
        }

        public Builder setHcvag___null(Boolean hcvag___null) {
            this.hcvag___null = hcvag___null;
            return this;
        }

        public Builder setHcvag___not___null(Boolean hcvag___not___null) {
            this.hcvag___not___null = hcvag___not___null;
            return this;
        }

        public Builder setHdvab___eq(Boolean hdvab___eq) {
            this.hdvab___eq = hdvab___eq;
            return this;
        }

        public Builder setHdvab___ne(Boolean hdvab___ne) {
            this.hdvab___ne = hdvab___ne;
            return this;
        }

        public Builder setHdvab___null(Boolean hdvab___null) {
            this.hdvab___null = hdvab___null;
            return this;
        }

        public Builder setHdvab___not___null(Boolean hdvab___not___null) {
            this.hdvab___not___null = hdvab___not___null;
            return this;
        }

        public Builder setHdvab_igg___eq(Boolean hdvab_igg___eq) {
            this.hdvab_igg___eq = hdvab_igg___eq;
            return this;
        }

        public Builder setHdvab_igg___ne(Boolean hdvab_igg___ne) {
            this.hdvab_igg___ne = hdvab_igg___ne;
            return this;
        }

        public Builder setHdvab_igg___null(Boolean hdvab_igg___null) {
            this.hdvab_igg___null = hdvab_igg___null;
            return this;
        }

        public Builder setHdvab_igg___not___null(Boolean hdvab_igg___not___null) {
            this.hdvab_igg___not___null = hdvab_igg___not___null;
            return this;
        }

        public Builder setHdvabigm___eq(Boolean hdvabigm___eq) {
            this.hdvabigm___eq = hdvabigm___eq;
            return this;
        }

        public Builder setHdvabigm___ne(Boolean hdvabigm___ne) {
            this.hdvabigm___ne = hdvabigm___ne;
            return this;
        }

        public Builder setHdvabigm___null(Boolean hdvabigm___null) {
            this.hdvabigm___null = hdvabigm___null;
            return this;
        }

        public Builder setHdvabigm___not___null(Boolean hdvabigm___not___null) {
            this.hdvabigm___not___null = hdvabigm___not___null;
            return this;
        }

        public Builder setHdvabtotali___eq(String hdvabtotali___eq) {
            this.hdvabtotali___eq = hdvabtotali___eq;
            return this;
        }

        public Builder setHdvabtotali___ne(String hdvabtotali___ne) {
            this.hdvabtotali___ne = hdvabtotali___ne;
            return this;
        }

        public Builder setHdvabtotali___null(Boolean hdvabtotali___null) {
            this.hdvabtotali___null = hdvabtotali___null;
            return this;
        }

        public Builder setHdvabtotali___not___null(Boolean hdvabtotali___not___null) {
            this.hdvabtotali___not___null = hdvabtotali___not___null;
            return this;
        }

        public Builder setHdvabtotali___in(java.util.List<String> hdvabtotali___in) {
            this.hdvabtotali___in = hdvabtotali___in;
            return this;
        }

        public Builder setHdvabtotali___not___in(java.util.List<String> hdvabtotali___not___in) {
            this.hdvabtotali___not___in = hdvabtotali___not___in;
            return this;
        }

        public Builder setHdvabtotali___lt(String hdvabtotali___lt) {
            this.hdvabtotali___lt = hdvabtotali___lt;
            return this;
        }

        public Builder setHdvabtotali___lte(String hdvabtotali___lte) {
            this.hdvabtotali___lte = hdvabtotali___lte;
            return this;
        }

        public Builder setHdvabtotali___gt(String hdvabtotali___gt) {
            this.hdvabtotali___gt = hdvabtotali___gt;
            return this;
        }

        public Builder setHdvabtotali___gte(String hdvabtotali___gte) {
            this.hdvabtotali___gte = hdvabtotali___gte;
            return this;
        }

        public Builder setInterruzioni___eq(Boolean interruzioni___eq) {
            this.interruzioni___eq = interruzioni___eq;
            return this;
        }

        public Builder setInterruzioni___ne(Boolean interruzioni___ne) {
            this.interruzioni___ne = interruzioni___ne;
            return this;
        }

        public Builder setInterruzioni___null(Boolean interruzioni___null) {
            this.interruzioni___null = interruzioni___null;
            return this;
        }

        public Builder setInterruzioni___not___null(Boolean interruzioni___not___null) {
            this.interruzioni___not___null = interruzioni___not___null;
            return this;
        }

        public Builder setMdw___eq(String mdw___eq) {
            this.mdw___eq = mdw___eq;
            return this;
        }

        public Builder setMdw___ne(String mdw___ne) {
            this.mdw___ne = mdw___ne;
            return this;
        }

        public Builder setMdw___null(Boolean mdw___null) {
            this.mdw___null = mdw___null;
            return this;
        }

        public Builder setMdw___not___null(Boolean mdw___not___null) {
            this.mdw___not___null = mdw___not___null;
            return this;
        }

        public Builder setMdw___in(java.util.List<String> mdw___in) {
            this.mdw___in = mdw___in;
            return this;
        }

        public Builder setMdw___not___in(java.util.List<String> mdw___not___in) {
            this.mdw___not___in = mdw___not___in;
            return this;
        }

        public Builder setMdw___lt(String mdw___lt) {
            this.mdw___lt = mdw___lt;
            return this;
        }

        public Builder setMdw___lte(String mdw___lte) {
            this.mdw___lte = mdw___lte;
            return this;
        }

        public Builder setMdw___gt(String mdw___gt) {
            this.mdw___gt = mdw___gt;
            return this;
        }

        public Builder setMdw___gte(String mdw___gte) {
            this.mdw___gte = mdw___gte;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___eq(String metodica_vitamina_D_2___eq) {
            this.metodica_vitamina_D_2___eq = metodica_vitamina_D_2___eq;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___ne(String metodica_vitamina_D_2___ne) {
            this.metodica_vitamina_D_2___ne = metodica_vitamina_D_2___ne;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___null(Boolean metodica_vitamina_D_2___null) {
            this.metodica_vitamina_D_2___null = metodica_vitamina_D_2___null;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___not___null(Boolean metodica_vitamina_D_2___not___null) {
            this.metodica_vitamina_D_2___not___null = metodica_vitamina_D_2___not___null;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___in(java.util.List<String> metodica_vitamina_D_2___in) {
            this.metodica_vitamina_D_2___in = metodica_vitamina_D_2___in;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___not___in(java.util.List<String> metodica_vitamina_D_2___not___in) {
            this.metodica_vitamina_D_2___not___in = metodica_vitamina_D_2___not___in;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___lt(String metodica_vitamina_D_2___lt) {
            this.metodica_vitamina_D_2___lt = metodica_vitamina_D_2___lt;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___lte(String metodica_vitamina_D_2___lte) {
            this.metodica_vitamina_D_2___lte = metodica_vitamina_D_2___lte;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___gt(String metodica_vitamina_D_2___gt) {
            this.metodica_vitamina_D_2___gt = metodica_vitamina_D_2___gt;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___gte(String metodica_vitamina_D_2___gte) {
            this.metodica_vitamina_D_2___gte = metodica_vitamina_D_2___gte;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___contains(String metodica_vitamina_D_2___contains) {
            this.metodica_vitamina_D_2___contains = metodica_vitamina_D_2___contains;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___not___contains(String metodica_vitamina_D_2___not___contains) {
            this.metodica_vitamina_D_2___not___contains = metodica_vitamina_D_2___not___contains;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___starts_with(String metodica_vitamina_D_2___starts_with) {
            this.metodica_vitamina_D_2___starts_with = metodica_vitamina_D_2___starts_with;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___not___starts_with(String metodica_vitamina_D_2___not___starts_with) {
            this.metodica_vitamina_D_2___not___starts_with = metodica_vitamina_D_2___not___starts_with;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___ends_with(String metodica_vitamina_D_2___ends_with) {
            this.metodica_vitamina_D_2___ends_with = metodica_vitamina_D_2___ends_with;
            return this;
        }

        public Builder setMetodica_vitamina_D_2___not___ends_with(String metodica_vitamina_D_2___not___ends_with) {
            this.metodica_vitamina_D_2___not___ends_with = metodica_vitamina_D_2___not___ends_with;
            return this;
        }

        public Builder setMonociti___eq(Integer monociti___eq) {
            this.monociti___eq = monociti___eq;
            return this;
        }

        public Builder setMonociti___ne(Integer monociti___ne) {
            this.monociti___ne = monociti___ne;
            return this;
        }

        public Builder setMonociti___null(Boolean monociti___null) {
            this.monociti___null = monociti___null;
            return this;
        }

        public Builder setMonociti___not___null(Boolean monociti___not___null) {
            this.monociti___not___null = monociti___not___null;
            return this;
        }

        public Builder setMonociti___in(java.util.List<Integer> monociti___in) {
            this.monociti___in = monociti___in;
            return this;
        }

        public Builder setMonociti___not___in(java.util.List<Integer> monociti___not___in) {
            this.monociti___not___in = monociti___not___in;
            return this;
        }

        public Builder setMonociti___lt(Integer monociti___lt) {
            this.monociti___lt = monociti___lt;
            return this;
        }

        public Builder setMonociti___lte(Integer monociti___lte) {
            this.monociti___lte = monociti___lte;
            return this;
        }

        public Builder setMonociti___gt(Integer monociti___gt) {
            this.monociti___gt = monociti___gt;
            return this;
        }

        public Builder setMonociti___gte(Integer monociti___gte) {
            this.monociti___gte = monociti___gte;
            return this;
        }

        public Builder setNon_trepon___eq(Boolean non_trepon___eq) {
            this.non_trepon___eq = non_trepon___eq;
            return this;
        }

        public Builder setNon_trepon___ne(Boolean non_trepon___ne) {
            this.non_trepon___ne = non_trepon___ne;
            return this;
        }

        public Builder setNon_trepon___null(Boolean non_trepon___null) {
            this.non_trepon___null = non_trepon___null;
            return this;
        }

        public Builder setNon_trepon___not___null(Boolean non_trepon___not___null) {
            this.non_trepon___not___null = non_trepon___not___null;
            return this;
        }

        public Builder setNr_neutrofili___eq(Integer nr_neutrofili___eq) {
            this.nr_neutrofili___eq = nr_neutrofili___eq;
            return this;
        }

        public Builder setNr_neutrofili___ne(Integer nr_neutrofili___ne) {
            this.nr_neutrofili___ne = nr_neutrofili___ne;
            return this;
        }

        public Builder setNr_neutrofili___null(Boolean nr_neutrofili___null) {
            this.nr_neutrofili___null = nr_neutrofili___null;
            return this;
        }

        public Builder setNr_neutrofili___not___null(Boolean nr_neutrofili___not___null) {
            this.nr_neutrofili___not___null = nr_neutrofili___not___null;
            return this;
        }

        public Builder setNr_neutrofili___in(java.util.List<Integer> nr_neutrofili___in) {
            this.nr_neutrofili___in = nr_neutrofili___in;
            return this;
        }

        public Builder setNr_neutrofili___not___in(java.util.List<Integer> nr_neutrofili___not___in) {
            this.nr_neutrofili___not___in = nr_neutrofili___not___in;
            return this;
        }

        public Builder setNr_neutrofili___lt(Integer nr_neutrofili___lt) {
            this.nr_neutrofili___lt = nr_neutrofili___lt;
            return this;
        }

        public Builder setNr_neutrofili___lte(Integer nr_neutrofili___lte) {
            this.nr_neutrofili___lte = nr_neutrofili___lte;
            return this;
        }

        public Builder setNr_neutrofili___gt(Integer nr_neutrofili___gt) {
            this.nr_neutrofili___gt = nr_neutrofili___gt;
            return this;
        }

        public Builder setNr_neutrofili___gte(Integer nr_neutrofili___gte) {
            this.nr_neutrofili___gte = nr_neutrofili___gte;
            return this;
        }

        public Builder setOmissione___eq(Boolean omissione___eq) {
            this.omissione___eq = omissione___eq;
            return this;
        }

        public Builder setOmissione___ne(Boolean omissione___ne) {
            this.omissione___ne = omissione___ne;
            return this;
        }

        public Builder setOmissione___null(Boolean omissione___null) {
            this.omissione___null = omissione___null;
            return this;
        }

        public Builder setOmissione___not___null(Boolean omissione___not___null) {
            this.omissione___not___null = omissione___not___null;
            return this;
        }

        public Builder setPa_max___eq(Integer pa_max___eq) {
            this.pa_max___eq = pa_max___eq;
            return this;
        }

        public Builder setPa_max___ne(Integer pa_max___ne) {
            this.pa_max___ne = pa_max___ne;
            return this;
        }

        public Builder setPa_max___null(Boolean pa_max___null) {
            this.pa_max___null = pa_max___null;
            return this;
        }

        public Builder setPa_max___not___null(Boolean pa_max___not___null) {
            this.pa_max___not___null = pa_max___not___null;
            return this;
        }

        public Builder setPa_max___in(java.util.List<Integer> pa_max___in) {
            this.pa_max___in = pa_max___in;
            return this;
        }

        public Builder setPa_max___not___in(java.util.List<Integer> pa_max___not___in) {
            this.pa_max___not___in = pa_max___not___in;
            return this;
        }

        public Builder setPa_max___lt(Integer pa_max___lt) {
            this.pa_max___lt = pa_max___lt;
            return this;
        }

        public Builder setPa_max___lte(Integer pa_max___lte) {
            this.pa_max___lte = pa_max___lte;
            return this;
        }

        public Builder setPa_max___gt(Integer pa_max___gt) {
            this.pa_max___gt = pa_max___gt;
            return this;
        }

        public Builder setPa_max___gte(Integer pa_max___gte) {
            this.pa_max___gte = pa_max___gte;
            return this;
        }

        public Builder setPa_min___eq(Integer pa_min___eq) {
            this.pa_min___eq = pa_min___eq;
            return this;
        }

        public Builder setPa_min___ne(Integer pa_min___ne) {
            this.pa_min___ne = pa_min___ne;
            return this;
        }

        public Builder setPa_min___null(Boolean pa_min___null) {
            this.pa_min___null = pa_min___null;
            return this;
        }

        public Builder setPa_min___not___null(Boolean pa_min___not___null) {
            this.pa_min___not___null = pa_min___not___null;
            return this;
        }

        public Builder setPa_min___in(java.util.List<Integer> pa_min___in) {
            this.pa_min___in = pa_min___in;
            return this;
        }

        public Builder setPa_min___not___in(java.util.List<Integer> pa_min___not___in) {
            this.pa_min___not___in = pa_min___not___in;
            return this;
        }

        public Builder setPa_min___lt(Integer pa_min___lt) {
            this.pa_min___lt = pa_min___lt;
            return this;
        }

        public Builder setPa_min___lte(Integer pa_min___lte) {
            this.pa_min___lte = pa_min___lte;
            return this;
        }

        public Builder setPa_min___gt(Integer pa_min___gt) {
            this.pa_min___gt = pa_min___gt;
            return this;
        }

        public Builder setPa_min___gte(Integer pa_min___gte) {
            this.pa_min___gte = pa_min___gte;
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

        public Builder setPeso___eq(String peso___eq) {
            this.peso___eq = peso___eq;
            return this;
        }

        public Builder setPeso___ne(String peso___ne) {
            this.peso___ne = peso___ne;
            return this;
        }

        public Builder setPeso___null(Boolean peso___null) {
            this.peso___null = peso___null;
            return this;
        }

        public Builder setPeso___not___null(Boolean peso___not___null) {
            this.peso___not___null = peso___not___null;
            return this;
        }

        public Builder setPeso___in(java.util.List<String> peso___in) {
            this.peso___in = peso___in;
            return this;
        }

        public Builder setPeso___not___in(java.util.List<String> peso___not___in) {
            this.peso___not___in = peso___not___in;
            return this;
        }

        public Builder setPeso___lt(String peso___lt) {
            this.peso___lt = peso___lt;
            return this;
        }

        public Builder setPeso___lte(String peso___lte) {
            this.peso___lte = peso___lte;
            return this;
        }

        public Builder setPeso___gt(String peso___gt) {
            this.peso___gt = peso___gt;
            return this;
        }

        public Builder setPeso___gte(String peso___gte) {
            this.peso___gte = peso___gte;
            return this;
        }

        public Builder setPiastrine___eq(Integer piastrine___eq) {
            this.piastrine___eq = piastrine___eq;
            return this;
        }

        public Builder setPiastrine___ne(Integer piastrine___ne) {
            this.piastrine___ne = piastrine___ne;
            return this;
        }

        public Builder setPiastrine___null(Boolean piastrine___null) {
            this.piastrine___null = piastrine___null;
            return this;
        }

        public Builder setPiastrine___not___null(Boolean piastrine___not___null) {
            this.piastrine___not___null = piastrine___not___null;
            return this;
        }

        public Builder setPiastrine___in(java.util.List<Integer> piastrine___in) {
            this.piastrine___in = piastrine___in;
            return this;
        }

        public Builder setPiastrine___not___in(java.util.List<Integer> piastrine___not___in) {
            this.piastrine___not___in = piastrine___not___in;
            return this;
        }

        public Builder setPiastrine___lt(Integer piastrine___lt) {
            this.piastrine___lt = piastrine___lt;
            return this;
        }

        public Builder setPiastrine___lte(Integer piastrine___lte) {
            this.piastrine___lte = piastrine___lte;
            return this;
        }

        public Builder setPiastrine___gt(Integer piastrine___gt) {
            this.piastrine___gt = piastrine___gt;
            return this;
        }

        public Builder setPiastrine___gte(Integer piastrine___gte) {
            this.piastrine___gte = piastrine___gte;
            return this;
        }

        public Builder setProteinuria___eq(String proteinuria___eq) {
            this.proteinuria___eq = proteinuria___eq;
            return this;
        }

        public Builder setProteinuria___ne(String proteinuria___ne) {
            this.proteinuria___ne = proteinuria___ne;
            return this;
        }

        public Builder setProteinuria___null(Boolean proteinuria___null) {
            this.proteinuria___null = proteinuria___null;
            return this;
        }

        public Builder setProteinuria___not___null(Boolean proteinuria___not___null) {
            this.proteinuria___not___null = proteinuria___not___null;
            return this;
        }

        public Builder setProteinuria___in(java.util.List<String> proteinuria___in) {
            this.proteinuria___in = proteinuria___in;
            return this;
        }

        public Builder setProteinuria___not___in(java.util.List<String> proteinuria___not___in) {
            this.proteinuria___not___in = proteinuria___not___in;
            return this;
        }

        public Builder setProteinuria___lt(String proteinuria___lt) {
            this.proteinuria___lt = proteinuria___lt;
            return this;
        }

        public Builder setProteinuria___lte(String proteinuria___lte) {
            this.proteinuria___lte = proteinuria___lte;
            return this;
        }

        public Builder setProteinuria___gt(String proteinuria___gt) {
            this.proteinuria___gt = proteinuria___gt;
            return this;
        }

        public Builder setProteinuria___gte(String proteinuria___gte) {
            this.proteinuria___gte = proteinuria___gte;
            return this;
        }

        public Builder setQuestionario_str___eq(Boolean questionario_str___eq) {
            this.questionario_str___eq = questionario_str___eq;
            return this;
        }

        public Builder setQuestionario_str___ne(Boolean questionario_str___ne) {
            this.questionario_str___ne = questionario_str___ne;
            return this;
        }

        public Builder setQuestionario_str___null(Boolean questionario_str___null) {
            this.questionario_str___null = questionario_str___null;
            return this;
        }

        public Builder setQuestionario_str___not___null(Boolean questionario_str___not___null) {
            this.questionario_str___not___null = questionario_str___not___null;
            return this;
        }

        public Builder setSesso_ok___eq(String sesso_ok___eq) {
            this.sesso_ok___eq = sesso_ok___eq;
            return this;
        }

        public Builder setSesso_ok___ne(String sesso_ok___ne) {
            this.sesso_ok___ne = sesso_ok___ne;
            return this;
        }

        public Builder setSesso_ok___null(Boolean sesso_ok___null) {
            this.sesso_ok___null = sesso_ok___null;
            return this;
        }

        public Builder setSesso_ok___not___null(Boolean sesso_ok___not___null) {
            this.sesso_ok___not___null = sesso_ok___not___null;
            return this;
        }

        public Builder setSesso_ok___in(java.util.List<String> sesso_ok___in) {
            this.sesso_ok___in = sesso_ok___in;
            return this;
        }

        public Builder setSesso_ok___not___in(java.util.List<String> sesso_ok___not___in) {
            this.sesso_ok___not___in = sesso_ok___not___in;
            return this;
        }

        public Builder setSesso_ok___lt(String sesso_ok___lt) {
            this.sesso_ok___lt = sesso_ok___lt;
            return this;
        }

        public Builder setSesso_ok___lte(String sesso_ok___lte) {
            this.sesso_ok___lte = sesso_ok___lte;
            return this;
        }

        public Builder setSesso_ok___gt(String sesso_ok___gt) {
            this.sesso_ok___gt = sesso_ok___gt;
            return this;
        }

        public Builder setSesso_ok___gte(String sesso_ok___gte) {
            this.sesso_ok___gte = sesso_ok___gte;
            return this;
        }

        public Builder setSesso_ok___contains(String sesso_ok___contains) {
            this.sesso_ok___contains = sesso_ok___contains;
            return this;
        }

        public Builder setSesso_ok___not___contains(String sesso_ok___not___contains) {
            this.sesso_ok___not___contains = sesso_ok___not___contains;
            return this;
        }

        public Builder setSesso_ok___starts_with(String sesso_ok___starts_with) {
            this.sesso_ok___starts_with = sesso_ok___starts_with;
            return this;
        }

        public Builder setSesso_ok___not___starts_with(String sesso_ok___not___starts_with) {
            this.sesso_ok___not___starts_with = sesso_ok___not___starts_with;
            return this;
        }

        public Builder setSesso_ok___ends_with(String sesso_ok___ends_with) {
            this.sesso_ok___ends_with = sesso_ok___ends_with;
            return this;
        }

        public Builder setSesso_ok___not___ends_with(String sesso_ok___not___ends_with) {
            this.sesso_ok___not___ends_with = sesso_ok___not___ends_with;
            return this;
        }

        public Builder setSuperalcolici___eq(Integer superalcolici___eq) {
            this.superalcolici___eq = superalcolici___eq;
            return this;
        }

        public Builder setSuperalcolici___ne(Integer superalcolici___ne) {
            this.superalcolici___ne = superalcolici___ne;
            return this;
        }

        public Builder setSuperalcolici___null(Boolean superalcolici___null) {
            this.superalcolici___null = superalcolici___null;
            return this;
        }

        public Builder setSuperalcolici___not___null(Boolean superalcolici___not___null) {
            this.superalcolici___not___null = superalcolici___not___null;
            return this;
        }

        public Builder setSuperalcolici___in(java.util.List<Integer> superalcolici___in) {
            this.superalcolici___in = superalcolici___in;
            return this;
        }

        public Builder setSuperalcolici___not___in(java.util.List<Integer> superalcolici___not___in) {
            this.superalcolici___not___in = superalcolici___not___in;
            return this;
        }

        public Builder setSuperalcolici___lt(Integer superalcolici___lt) {
            this.superalcolici___lt = superalcolici___lt;
            return this;
        }

        public Builder setSuperalcolici___lte(Integer superalcolici___lte) {
            this.superalcolici___lte = superalcolici___lte;
            return this;
        }

        public Builder setSuperalcolici___gt(Integer superalcolici___gt) {
            this.superalcolici___gt = superalcolici___gt;
            return this;
        }

        public Builder setSuperalcolici___gte(Integer superalcolici___gte) {
            this.superalcolici___gte = superalcolici___gte;
            return this;
        }

        public Builder setTossicodip_attivo___eq(Boolean tossicodip_attivo___eq) {
            this.tossicodip_attivo___eq = tossicodip_attivo___eq;
            return this;
        }

        public Builder setTossicodip_attivo___ne(Boolean tossicodip_attivo___ne) {
            this.tossicodip_attivo___ne = tossicodip_attivo___ne;
            return this;
        }

        public Builder setTossicodip_attivo___null(Boolean tossicodip_attivo___null) {
            this.tossicodip_attivo___null = tossicodip_attivo___null;
            return this;
        }

        public Builder setTossicodip_attivo___not___null(Boolean tossicodip_attivo___not___null) {
            this.tossicodip_attivo___not___null = tossicodip_attivo___not___null;
            return this;
        }

        public Builder setToxoigg___eq(Boolean toxoigg___eq) {
            this.toxoigg___eq = toxoigg___eq;
            return this;
        }

        public Builder setToxoigg___ne(Boolean toxoigg___ne) {
            this.toxoigg___ne = toxoigg___ne;
            return this;
        }

        public Builder setToxoigg___null(Boolean toxoigg___null) {
            this.toxoigg___null = toxoigg___null;
            return this;
        }

        public Builder setToxoigg___not___null(Boolean toxoigg___not___null) {
            this.toxoigg___not___null = toxoigg___not___null;
            return this;
        }

        public Builder setTrepon___eq(Boolean trepon___eq) {
            this.trepon___eq = trepon___eq;
            return this;
        }

        public Builder setTrepon___ne(Boolean trepon___ne) {
            this.trepon___ne = trepon___ne;
            return this;
        }

        public Builder setTrepon___null(Boolean trepon___null) {
            this.trepon___null = trepon___null;
            return this;
        }

        public Builder setTrepon___not___null(Boolean trepon___not___null) {
            this.trepon___not___null = trepon___not___null;
            return this;
        }

        public Builder setTrigliceridi___eq(Integer trigliceridi___eq) {
            this.trigliceridi___eq = trigliceridi___eq;
            return this;
        }

        public Builder setTrigliceridi___ne(Integer trigliceridi___ne) {
            this.trigliceridi___ne = trigliceridi___ne;
            return this;
        }

        public Builder setTrigliceridi___null(Boolean trigliceridi___null) {
            this.trigliceridi___null = trigliceridi___null;
            return this;
        }

        public Builder setTrigliceridi___not___null(Boolean trigliceridi___not___null) {
            this.trigliceridi___not___null = trigliceridi___not___null;
            return this;
        }

        public Builder setTrigliceridi___in(java.util.List<Integer> trigliceridi___in) {
            this.trigliceridi___in = trigliceridi___in;
            return this;
        }

        public Builder setTrigliceridi___not___in(java.util.List<Integer> trigliceridi___not___in) {
            this.trigliceridi___not___in = trigliceridi___not___in;
            return this;
        }

        public Builder setTrigliceridi___lt(Integer trigliceridi___lt) {
            this.trigliceridi___lt = trigliceridi___lt;
            return this;
        }

        public Builder setTrigliceridi___lte(Integer trigliceridi___lte) {
            this.trigliceridi___lte = trigliceridi___lte;
            return this;
        }

        public Builder setTrigliceridi___gt(Integer trigliceridi___gt) {
            this.trigliceridi___gt = trigliceridi___gt;
            return this;
        }

        public Builder setTrigliceridi___gte(Integer trigliceridi___gte) {
            this.trigliceridi___gte = trigliceridi___gte;
            return this;
        }

        public Builder setUnita_vitamina_D___eq(String unita_vitamina_D___eq) {
            this.unita_vitamina_D___eq = unita_vitamina_D___eq;
            return this;
        }

        public Builder setUnita_vitamina_D___ne(String unita_vitamina_D___ne) {
            this.unita_vitamina_D___ne = unita_vitamina_D___ne;
            return this;
        }

        public Builder setUnita_vitamina_D___null(Boolean unita_vitamina_D___null) {
            this.unita_vitamina_D___null = unita_vitamina_D___null;
            return this;
        }

        public Builder setUnita_vitamina_D___not___null(Boolean unita_vitamina_D___not___null) {
            this.unita_vitamina_D___not___null = unita_vitamina_D___not___null;
            return this;
        }

        public Builder setUnita_vitamina_D___in(java.util.List<String> unita_vitamina_D___in) {
            this.unita_vitamina_D___in = unita_vitamina_D___in;
            return this;
        }

        public Builder setUnita_vitamina_D___not___in(java.util.List<String> unita_vitamina_D___not___in) {
            this.unita_vitamina_D___not___in = unita_vitamina_D___not___in;
            return this;
        }

        public Builder setUnita_vitamina_D___lt(String unita_vitamina_D___lt) {
            this.unita_vitamina_D___lt = unita_vitamina_D___lt;
            return this;
        }

        public Builder setUnita_vitamina_D___lte(String unita_vitamina_D___lte) {
            this.unita_vitamina_D___lte = unita_vitamina_D___lte;
            return this;
        }

        public Builder setUnita_vitamina_D___gt(String unita_vitamina_D___gt) {
            this.unita_vitamina_D___gt = unita_vitamina_D___gt;
            return this;
        }

        public Builder setUnita_vitamina_D___gte(String unita_vitamina_D___gte) {
            this.unita_vitamina_D___gte = unita_vitamina_D___gte;
            return this;
        }

        public Builder setUnita_vitamina_D___contains(String unita_vitamina_D___contains) {
            this.unita_vitamina_D___contains = unita_vitamina_D___contains;
            return this;
        }

        public Builder setUnita_vitamina_D___not___contains(String unita_vitamina_D___not___contains) {
            this.unita_vitamina_D___not___contains = unita_vitamina_D___not___contains;
            return this;
        }

        public Builder setUnita_vitamina_D___starts_with(String unita_vitamina_D___starts_with) {
            this.unita_vitamina_D___starts_with = unita_vitamina_D___starts_with;
            return this;
        }

        public Builder setUnita_vitamina_D___not___starts_with(String unita_vitamina_D___not___starts_with) {
            this.unita_vitamina_D___not___starts_with = unita_vitamina_D___not___starts_with;
            return this;
        }

        public Builder setUnita_vitamina_D___ends_with(String unita_vitamina_D___ends_with) {
            this.unita_vitamina_D___ends_with = unita_vitamina_D___ends_with;
            return this;
        }

        public Builder setUnita_vitamina_D___not___ends_with(String unita_vitamina_D___not___ends_with) {
            this.unita_vitamina_D___not___ends_with = unita_vitamina_D___not___ends_with;
            return this;
        }

        public Builder setVas___eq(String vas___eq) {
            this.vas___eq = vas___eq;
            return this;
        }

        public Builder setVas___ne(String vas___ne) {
            this.vas___ne = vas___ne;
            return this;
        }

        public Builder setVas___null(Boolean vas___null) {
            this.vas___null = vas___null;
            return this;
        }

        public Builder setVas___not___null(Boolean vas___not___null) {
            this.vas___not___null = vas___not___null;
            return this;
        }

        public Builder setVas___in(java.util.List<String> vas___in) {
            this.vas___in = vas___in;
            return this;
        }

        public Builder setVas___not___in(java.util.List<String> vas___not___in) {
            this.vas___not___in = vas___not___in;
            return this;
        }

        public Builder setVas___lt(String vas___lt) {
            this.vas___lt = vas___lt;
            return this;
        }

        public Builder setVas___lte(String vas___lte) {
            this.vas___lte = vas___lte;
            return this;
        }

        public Builder setVas___gt(String vas___gt) {
            this.vas___gt = vas___gt;
            return this;
        }

        public Builder setVas___gte(String vas___gte) {
            this.vas___gte = vas___gte;
            return this;
        }

        public Builder setVas_globale___eq(String vas_globale___eq) {
            this.vas_globale___eq = vas_globale___eq;
            return this;
        }

        public Builder setVas_globale___ne(String vas_globale___ne) {
            this.vas_globale___ne = vas_globale___ne;
            return this;
        }

        public Builder setVas_globale___null(Boolean vas_globale___null) {
            this.vas_globale___null = vas_globale___null;
            return this;
        }

        public Builder setVas_globale___not___null(Boolean vas_globale___not___null) {
            this.vas_globale___not___null = vas_globale___not___null;
            return this;
        }

        public Builder setVas_globale___in(java.util.List<String> vas_globale___in) {
            this.vas_globale___in = vas_globale___in;
            return this;
        }

        public Builder setVas_globale___not___in(java.util.List<String> vas_globale___not___in) {
            this.vas_globale___not___in = vas_globale___not___in;
            return this;
        }

        public Builder setVas_globale___lt(String vas_globale___lt) {
            this.vas_globale___lt = vas_globale___lt;
            return this;
        }

        public Builder setVas_globale___lte(String vas_globale___lte) {
            this.vas_globale___lte = vas_globale___lte;
            return this;
        }

        public Builder setVas_globale___gt(String vas_globale___gt) {
            this.vas_globale___gt = vas_globale___gt;
            return this;
        }

        public Builder setVas_globale___gte(String vas_globale___gte) {
            this.vas_globale___gte = vas_globale___gte;
            return this;
        }

        public Builder setVino___eq(Integer vino___eq) {
            this.vino___eq = vino___eq;
            return this;
        }

        public Builder setVino___ne(Integer vino___ne) {
            this.vino___ne = vino___ne;
            return this;
        }

        public Builder setVino___null(Boolean vino___null) {
            this.vino___null = vino___null;
            return this;
        }

        public Builder setVino___not___null(Boolean vino___not___null) {
            this.vino___not___null = vino___not___null;
            return this;
        }

        public Builder setVino___in(java.util.List<Integer> vino___in) {
            this.vino___in = vino___in;
            return this;
        }

        public Builder setVino___not___in(java.util.List<Integer> vino___not___in) {
            this.vino___not___in = vino___not___in;
            return this;
        }

        public Builder setVino___lt(Integer vino___lt) {
            this.vino___lt = vino___lt;
            return this;
        }

        public Builder setVino___lte(Integer vino___lte) {
            this.vino___lte = vino___lte;
            return this;
        }

        public Builder setVino___gt(Integer vino___gt) {
            this.vino___gt = vino___gt;
            return this;
        }

        public Builder setVino___gte(Integer vino___gte) {
            this.vino___gte = vino___gte;
            return this;
        }

        public Builder setVitamina_D___eq(String vitamina_D___eq) {
            this.vitamina_D___eq = vitamina_D___eq;
            return this;
        }

        public Builder setVitamina_D___ne(String vitamina_D___ne) {
            this.vitamina_D___ne = vitamina_D___ne;
            return this;
        }

        public Builder setVitamina_D___null(Boolean vitamina_D___null) {
            this.vitamina_D___null = vitamina_D___null;
            return this;
        }

        public Builder setVitamina_D___not___null(Boolean vitamina_D___not___null) {
            this.vitamina_D___not___null = vitamina_D___not___null;
            return this;
        }

        public Builder setVitamina_D___in(java.util.List<String> vitamina_D___in) {
            this.vitamina_D___in = vitamina_D___in;
            return this;
        }

        public Builder setVitamina_D___not___in(java.util.List<String> vitamina_D___not___in) {
            this.vitamina_D___not___in = vitamina_D___not___in;
            return this;
        }

        public Builder setVitamina_D___lt(String vitamina_D___lt) {
            this.vitamina_D___lt = vitamina_D___lt;
            return this;
        }

        public Builder setVitamina_D___lte(String vitamina_D___lte) {
            this.vitamina_D___lte = vitamina_D___lte;
            return this;
        }

        public Builder setVitamina_D___gt(String vitamina_D___gt) {
            this.vitamina_D___gt = vitamina_D___gt;
            return this;
        }

        public Builder setVitamina_D___gte(String vitamina_D___gte) {
            this.vitamina_D___gte = vitamina_D___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliControllo_clinicoFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliControllo_clinicoFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliControllo_clinicoFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliControllo_clinicoFilterDTO build() {
            CliControllo_clinicoFilterDTO result = new CliControllo_clinicoFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.setALT___eq(this.ALT___eq);
            result.setALT___ne(this.ALT___ne);
            result.setALT___null(this.ALT___null);
            result.setALT___not___null(this.ALT___not___null);
            result.setALT___in(this.ALT___in);
            result.setALT___not___in(this.ALT___not___in);
            result.setALT___lt(this.ALT___lt);
            result.setALT___lte(this.ALT___lte);
            result.setALT___gt(this.ALT___gt);
            result.setALT___gte(this.ALT___gte);
            result.setAST___eq(this.AST___eq);
            result.setAST___ne(this.AST___ne);
            result.setAST___null(this.AST___null);
            result.setAST___not___null(this.AST___not___null);
            result.setAST___in(this.AST___in);
            result.setAST___not___in(this.AST___not___in);
            result.setAST___lt(this.AST___lt);
            result.setAST___lte(this.AST___lte);
            result.setAST___gt(this.AST___gt);
            result.setAST___gte(this.AST___gte);
            result.setHDL___eq(this.HDL___eq);
            result.setHDL___ne(this.HDL___ne);
            result.setHDL___null(this.HDL___null);
            result.setHDL___not___null(this.HDL___not___null);
            result.setHDL___in(this.HDL___in);
            result.setHDL___not___in(this.HDL___not___in);
            result.setHDL___lt(this.HDL___lt);
            result.setHDL___lte(this.HDL___lte);
            result.setHDL___gt(this.HDL___gt);
            result.setHDL___gte(this.HDL___gte);
            result.setLDL___eq(this.LDL___eq);
            result.setLDL___ne(this.LDL___ne);
            result.setLDL___null(this.LDL___null);
            result.setLDL___not___null(this.LDL___not___null);
            result.setLDL___in(this.LDL___in);
            result.setLDL___not___in(this.LDL___not___in);
            result.setLDL___lt(this.LDL___lt);
            result.setLDL___lte(this.LDL___lte);
            result.setLDL___gt(this.LDL___gt);
            result.setLDL___gte(this.LDL___gte);
            result.setMCV___eq(this.MCV___eq);
            result.setMCV___ne(this.MCV___ne);
            result.setMCV___null(this.MCV___null);
            result.setMCV___not___null(this.MCV___not___null);
            result.setMCV___in(this.MCV___in);
            result.setMCV___not___in(this.MCV___not___in);
            result.setMCV___lt(this.MCV___lt);
            result.setMCV___lte(this.MCV___lte);
            result.setMCV___gt(this.MCV___gt);
            result.setMCV___gte(this.MCV___gte);
            result.setPCHE___eq(this.PCHE___eq);
            result.setPCHE___ne(this.PCHE___ne);
            result.setPCHE___null(this.PCHE___null);
            result.setPCHE___not___null(this.PCHE___not___null);
            result.setPCHE___in(this.PCHE___in);
            result.setPCHE___not___in(this.PCHE___not___in);
            result.setPCHE___lt(this.PCHE___lt);
            result.setPCHE___lte(this.PCHE___lte);
            result.setPCHE___gt(this.PCHE___gt);
            result.setPCHE___gte(this.PCHE___gte);
            result.setPPD___eq(this.PPD___eq);
            result.setPPD___ne(this.PPD___ne);
            result.setPPD___null(this.PPD___null);
            result.setPPD___not___null(this.PPD___not___null);
            result.setPT_INR___eq(this.PT_INR___eq);
            result.setPT_INR___ne(this.PT_INR___ne);
            result.setPT_INR___null(this.PT_INR___null);
            result.setPT_INR___not___null(this.PT_INR___not___null);
            result.setPT_INR___in(this.PT_INR___in);
            result.setPT_INR___not___in(this.PT_INR___not___in);
            result.setPT_INR___lt(this.PT_INR___lt);
            result.setPT_INR___lte(this.PT_INR___lte);
            result.setPT_INR___gt(this.PT_INR___gt);
            result.setPT_INR___gte(this.PT_INR___gte);
            result.setPT_percentuale___eq(this.PT_percentuale___eq);
            result.setPT_percentuale___ne(this.PT_percentuale___ne);
            result.setPT_percentuale___null(this.PT_percentuale___null);
            result.setPT_percentuale___not___null(this.PT_percentuale___not___null);
            result.setPT_percentuale___in(this.PT_percentuale___in);
            result.setPT_percentuale___not___in(this.PT_percentuale___not___in);
            result.setPT_percentuale___lt(this.PT_percentuale___lt);
            result.setPT_percentuale___lte(this.PT_percentuale___lte);
            result.setPT_percentuale___gt(this.PT_percentuale___gt);
            result.setPT_percentuale___gte(this.PT_percentuale___gte);
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
            result.setAcido_lattico___eq(this.acido_lattico___eq);
            result.setAcido_lattico___ne(this.acido_lattico___ne);
            result.setAcido_lattico___null(this.acido_lattico___null);
            result.setAcido_lattico___not___null(this.acido_lattico___not___null);
            result.setAcido_lattico___in(this.acido_lattico___in);
            result.setAcido_lattico___not___in(this.acido_lattico___not___in);
            result.setAcido_lattico___lt(this.acido_lattico___lt);
            result.setAcido_lattico___lte(this.acido_lattico___lte);
            result.setAcido_lattico___gt(this.acido_lattico___gt);
            result.setAcido_lattico___gte(this.acido_lattico___gte);
            result.setAlbumina___eq(this.albumina___eq);
            result.setAlbumina___ne(this.albumina___ne);
            result.setAlbumina___null(this.albumina___null);
            result.setAlbumina___not___null(this.albumina___not___null);
            result.setAlbumina___in(this.albumina___in);
            result.setAlbumina___not___in(this.albumina___not___in);
            result.setAlbumina___lt(this.albumina___lt);
            result.setAlbumina___lte(this.albumina___lte);
            result.setAlbumina___gt(this.albumina___gt);
            result.setAlbumina___gte(this.albumina___gte);
            result.setAlfafetoproteina___eq(this.alfafetoproteina___eq);
            result.setAlfafetoproteina___ne(this.alfafetoproteina___ne);
            result.setAlfafetoproteina___null(this.alfafetoproteina___null);
            result.setAlfafetoproteina___not___null(this.alfafetoproteina___not___null);
            result.setAlfafetoproteina___in(this.alfafetoproteina___in);
            result.setAlfafetoproteina___not___in(this.alfafetoproteina___not___in);
            result.setAlfafetoproteina___lt(this.alfafetoproteina___lt);
            result.setAlfafetoproteina___lte(this.alfafetoproteina___lte);
            result.setAlfafetoproteina___gt(this.alfafetoproteina___gt);
            result.setAlfafetoproteina___gte(this.alfafetoproteina___gte);
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
            result.setAltro_beve___eq(this.altro_beve___eq);
            result.setAltro_beve___ne(this.altro_beve___ne);
            result.setAltro_beve___null(this.altro_beve___null);
            result.setAltro_beve___not___null(this.altro_beve___not___null);
            result.setAltro_beve___in(this.altro_beve___in);
            result.setAltro_beve___not___in(this.altro_beve___not___in);
            result.setAltro_beve___lt(this.altro_beve___lt);
            result.setAltro_beve___lte(this.altro_beve___lte);
            result.setAltro_beve___gt(this.altro_beve___gt);
            result.setAltro_beve___gte(this.altro_beve___gte);
            result.setAltro_beve___contains(this.altro_beve___contains);
            result.setAltro_beve___not___contains(this.altro_beve___not___contains);
            result.setAltro_beve___starts_with(this.altro_beve___starts_with);
            result.setAltro_beve___not___starts_with(this.altro_beve___not___starts_with);
            result.setAltro_beve___ends_with(this.altro_beve___ends_with);
            result.setAltro_beve___not___ends_with(this.altro_beve___not___ends_with);
            result.setAzotemia___eq(this.azotemia___eq);
            result.setAzotemia___ne(this.azotemia___ne);
            result.setAzotemia___null(this.azotemia___null);
            result.setAzotemia___not___null(this.azotemia___not___null);
            result.setAzotemia___in(this.azotemia___in);
            result.setAzotemia___not___in(this.azotemia___not___in);
            result.setAzotemia___lt(this.azotemia___lt);
            result.setAzotemia___lte(this.azotemia___lte);
            result.setAzotemia___gt(this.azotemia___gt);
            result.setAzotemia___gte(this.azotemia___gte);
            result.setBeve___eq(this.beve___eq);
            result.setBeve___ne(this.beve___ne);
            result.setBeve___null(this.beve___null);
            result.setBeve___not___null(this.beve___not___null);
            result.setBilirubina_diretta___eq(this.bilirubina_diretta___eq);
            result.setBilirubina_diretta___ne(this.bilirubina_diretta___ne);
            result.setBilirubina_diretta___null(this.bilirubina_diretta___null);
            result.setBilirubina_diretta___not___null(this.bilirubina_diretta___not___null);
            result.setBilirubina_diretta___in(this.bilirubina_diretta___in);
            result.setBilirubina_diretta___not___in(this.bilirubina_diretta___not___in);
            result.setBilirubina_diretta___lt(this.bilirubina_diretta___lt);
            result.setBilirubina_diretta___lte(this.bilirubina_diretta___lte);
            result.setBilirubina_diretta___gt(this.bilirubina_diretta___gt);
            result.setBilirubina_diretta___gte(this.bilirubina_diretta___gte);
            result.setBilirubina_totale___eq(this.bilirubina_totale___eq);
            result.setBilirubina_totale___ne(this.bilirubina_totale___ne);
            result.setBilirubina_totale___null(this.bilirubina_totale___null);
            result.setBilirubina_totale___not___null(this.bilirubina_totale___not___null);
            result.setBilirubina_totale___in(this.bilirubina_totale___in);
            result.setBilirubina_totale___not___in(this.bilirubina_totale___not___in);
            result.setBilirubina_totale___lt(this.bilirubina_totale___lt);
            result.setBilirubina_totale___lte(this.bilirubina_totale___lte);
            result.setBilirubina_totale___gt(this.bilirubina_totale___gt);
            result.setBilirubina_totale___gte(this.bilirubina_totale___gte);
            result.setBirra___eq(this.birra___eq);
            result.setBirra___ne(this.birra___ne);
            result.setBirra___null(this.birra___null);
            result.setBirra___not___null(this.birra___not___null);
            result.setBirra___in(this.birra___in);
            result.setBirra___not___in(this.birra___not___in);
            result.setBirra___lt(this.birra___lt);
            result.setBirra___lte(this.birra___lte);
            result.setBirra___gt(this.birra___gt);
            result.setBirra___gte(this.birra___gte);
            result.setCalcio___eq(this.calcio___eq);
            result.setCalcio___ne(this.calcio___ne);
            result.setCalcio___null(this.calcio___null);
            result.setCalcio___not___null(this.calcio___not___null);
            result.setCalcio___in(this.calcio___in);
            result.setCalcio___not___in(this.calcio___not___in);
            result.setCalcio___lt(this.calcio___lt);
            result.setCalcio___lte(this.calcio___lte);
            result.setCalcio___gt(this.calcio___gt);
            result.setCalcio___gte(this.calcio___gte);
            result.setCampione___eq(this.campione___eq);
            result.setCampione___ne(this.campione___ne);
            result.setCampione___null(this.campione___null);
            result.setCampione___not___null(this.campione___not___null);
            result.setChemsex___eq(this.chemsex___eq);
            result.setChemsex___ne(this.chemsex___ne);
            result.setChemsex___null(this.chemsex___null);
            result.setChemsex___not___null(this.chemsex___not___null);
            result.setCirconferenza_vita___eq(this.circonferenza_vita___eq);
            result.setCirconferenza_vita___ne(this.circonferenza_vita___ne);
            result.setCirconferenza_vita___null(this.circonferenza_vita___null);
            result.setCirconferenza_vita___not___null(this.circonferenza_vita___not___null);
            result.setCirconferenza_vita___in(this.circonferenza_vita___in);
            result.setCirconferenza_vita___not___in(this.circonferenza_vita___not___in);
            result.setCirconferenza_vita___lt(this.circonferenza_vita___lt);
            result.setCirconferenza_vita___lte(this.circonferenza_vita___lte);
            result.setCirconferenza_vita___gt(this.circonferenza_vita___gt);
            result.setCirconferenza_vita___gte(this.circonferenza_vita___gte);
            result.setCmvigg___eq(this.cmvigg___eq);
            result.setCmvigg___ne(this.cmvigg___ne);
            result.setCmvigg___null(this.cmvigg___null);
            result.setCmvigg___not___null(this.cmvigg___not___null);
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
            result.setColesterolo___eq(this.colesterolo___eq);
            result.setColesterolo___ne(this.colesterolo___ne);
            result.setColesterolo___null(this.colesterolo___null);
            result.setColesterolo___not___null(this.colesterolo___not___null);
            result.setColesterolo___in(this.colesterolo___in);
            result.setColesterolo___not___in(this.colesterolo___not___in);
            result.setColesterolo___lt(this.colesterolo___lt);
            result.setColesterolo___lte(this.colesterolo___lte);
            result.setColesterolo___gt(this.colesterolo___gt);
            result.setColesterolo___gte(this.colesterolo___gte);
            result.setCov_igg___eq(this.cov_igg___eq);
            result.setCov_igg___ne(this.cov_igg___ne);
            result.setCov_igg___null(this.cov_igg___null);
            result.setCov_igg___not___null(this.cov_igg___not___null);
            result.setCov_igg_titolo___eq(this.cov_igg_titolo___eq);
            result.setCov_igg_titolo___ne(this.cov_igg_titolo___ne);
            result.setCov_igg_titolo___null(this.cov_igg_titolo___null);
            result.setCov_igg_titolo___not___null(this.cov_igg_titolo___not___null);
            result.setCov_igg_titolo___in(this.cov_igg_titolo___in);
            result.setCov_igg_titolo___not___in(this.cov_igg_titolo___not___in);
            result.setCov_igg_titolo___lt(this.cov_igg_titolo___lt);
            result.setCov_igg_titolo___lte(this.cov_igg_titolo___lte);
            result.setCov_igg_titolo___gt(this.cov_igg_titolo___gt);
            result.setCov_igg_titolo___gte(this.cov_igg_titolo___gte);
            result.setCov_igm___eq(this.cov_igm___eq);
            result.setCov_igm___ne(this.cov_igm___ne);
            result.setCov_igm___null(this.cov_igm___null);
            result.setCov_igm___not___null(this.cov_igm___not___null);
            result.setCov_igm_titolo___eq(this.cov_igm_titolo___eq);
            result.setCov_igm_titolo___ne(this.cov_igm_titolo___ne);
            result.setCov_igm_titolo___null(this.cov_igm_titolo___null);
            result.setCov_igm_titolo___not___null(this.cov_igm_titolo___not___null);
            result.setCov_igm_titolo___in(this.cov_igm_titolo___in);
            result.setCov_igm_titolo___not___in(this.cov_igm_titolo___not___in);
            result.setCov_igm_titolo___lt(this.cov_igm_titolo___lt);
            result.setCov_igm_titolo___lte(this.cov_igm_titolo___lte);
            result.setCov_igm_titolo___gt(this.cov_igm_titolo___gt);
            result.setCov_igm_titolo___gte(this.cov_igm_titolo___gte);
            result.setCov_rna___eq(this.cov_rna___eq);
            result.setCov_rna___ne(this.cov_rna___ne);
            result.setCov_rna___null(this.cov_rna___null);
            result.setCov_rna___not___null(this.cov_rna___not___null);
            result.setCov_test___eq(this.cov_test___eq);
            result.setCov_test___ne(this.cov_test___ne);
            result.setCov_test___null(this.cov_test___null);
            result.setCov_test___not___null(this.cov_test___not___null);
            result.setCov_test___in(this.cov_test___in);
            result.setCov_test___not___in(this.cov_test___not___in);
            result.setCov_test___lt(this.cov_test___lt);
            result.setCov_test___lte(this.cov_test___lte);
            result.setCov_test___gt(this.cov_test___gt);
            result.setCov_test___gte(this.cov_test___gte);
            result.setCov_test___contains(this.cov_test___contains);
            result.setCov_test___not___contains(this.cov_test___not___contains);
            result.setCov_test___starts_with(this.cov_test___starts_with);
            result.setCov_test___not___starts_with(this.cov_test___not___starts_with);
            result.setCov_test___ends_with(this.cov_test___ends_with);
            result.setCov_test___not___ends_with(this.cov_test___not___ends_with);
            result.setCov_vax___eq(this.cov_vax___eq);
            result.setCov_vax___ne(this.cov_vax___ne);
            result.setCov_vax___null(this.cov_vax___null);
            result.setCov_vax___not___null(this.cov_vax___not___null);
            result.setCreatinina___eq(this.creatinina___eq);
            result.setCreatinina___ne(this.creatinina___ne);
            result.setCreatinina___null(this.creatinina___null);
            result.setCreatinina___not___null(this.creatinina___not___null);
            result.setCreatinina___in(this.creatinina___in);
            result.setCreatinina___not___in(this.creatinina___not___in);
            result.setCreatinina___lt(this.creatinina___lt);
            result.setCreatinina___lte(this.creatinina___lte);
            result.setCreatinina___gt(this.creatinina___gt);
            result.setCreatinina___gte(this.creatinina___gte);
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
            result.setData_campione___eq(this.data_campione___eq);
            result.setData_campione___ne(this.data_campione___ne);
            result.setData_campione___null(this.data_campione___null);
            result.setData_campione___not___null(this.data_campione___not___null);
            result.setData_campione___in(this.data_campione___in);
            result.setData_campione___not___in(this.data_campione___not___in);
            result.setData_campione___lt(this.data_campione___lt);
            result.setData_campione___lte(this.data_campione___lte);
            result.setData_campione___gt(this.data_campione___gt);
            result.setData_campione___gte(this.data_campione___gte);
            result.setData_presunta_parto___eq(this.data_presunta_parto___eq);
            result.setData_presunta_parto___ne(this.data_presunta_parto___ne);
            result.setData_presunta_parto___null(this.data_presunta_parto___null);
            result.setData_presunta_parto___not___null(this.data_presunta_parto___not___null);
            result.setData_presunta_parto___in(this.data_presunta_parto___in);
            result.setData_presunta_parto___not___in(this.data_presunta_parto___not___in);
            result.setData_presunta_parto___lt(this.data_presunta_parto___lt);
            result.setData_presunta_parto___lte(this.data_presunta_parto___lte);
            result.setData_presunta_parto___gt(this.data_presunta_parto___gt);
            result.setData_presunta_parto___gte(this.data_presunta_parto___gte);
            result.setData_questionario___eq(this.data_questionario___eq);
            result.setData_questionario___ne(this.data_questionario___ne);
            result.setData_questionario___null(this.data_questionario___null);
            result.setData_questionario___not___null(this.data_questionario___not___null);
            result.setData_questionario___in(this.data_questionario___in);
            result.setData_questionario___not___in(this.data_questionario___not___in);
            result.setData_questionario___lt(this.data_questionario___lt);
            result.setData_questionario___lte(this.data_questionario___lte);
            result.setData_questionario___gt(this.data_questionario___gt);
            result.setData_questionario___gte(this.data_questionario___gte);
            result.setDosi_omesse___eq(this.dosi_omesse___eq);
            result.setDosi_omesse___ne(this.dosi_omesse___ne);
            result.setDosi_omesse___null(this.dosi_omesse___null);
            result.setDosi_omesse___not___null(this.dosi_omesse___not___null);
            result.setDosi_omesse___in(this.dosi_omesse___in);
            result.setDosi_omesse___not___in(this.dosi_omesse___not___in);
            result.setDosi_omesse___lt(this.dosi_omesse___lt);
            result.setDosi_omesse___lte(this.dosi_omesse___lte);
            result.setDosi_omesse___gt(this.dosi_omesse___gt);
            result.setDosi_omesse___gte(this.dosi_omesse___gte);
            result.setEmoglobina___eq(this.emoglobina___eq);
            result.setEmoglobina___ne(this.emoglobina___ne);
            result.setEmoglobina___null(this.emoglobina___null);
            result.setEmoglobina___not___null(this.emoglobina___not___null);
            result.setEmoglobina___in(this.emoglobina___in);
            result.setEmoglobina___not___in(this.emoglobina___not___in);
            result.setEmoglobina___lt(this.emoglobina___lt);
            result.setEmoglobina___lte(this.emoglobina___lte);
            result.setEmoglobina___gt(this.emoglobina___gt);
            result.setEmoglobina___gte(this.emoglobina___gte);
            result.setEmoglobina_glicata___eq(this.emoglobina_glicata___eq);
            result.setEmoglobina_glicata___ne(this.emoglobina_glicata___ne);
            result.setEmoglobina_glicata___null(this.emoglobina_glicata___null);
            result.setEmoglobina_glicata___not___null(this.emoglobina_glicata___not___null);
            result.setEmoglobina_glicata___in(this.emoglobina_glicata___in);
            result.setEmoglobina_glicata___not___in(this.emoglobina_glicata___not___in);
            result.setEmoglobina_glicata___lt(this.emoglobina_glicata___lt);
            result.setEmoglobina_glicata___lte(this.emoglobina_glicata___lte);
            result.setEmoglobina_glicata___gt(this.emoglobina_glicata___gt);
            result.setEmoglobina_glicata___gte(this.emoglobina_glicata___gte);
            result.setFollowup_questionario___eq(this.followup_questionario___eq);
            result.setFollowup_questionario___ne(this.followup_questionario___ne);
            result.setFollowup_questionario___null(this.followup_questionario___null);
            result.setFollowup_questionario___not___null(this.followup_questionario___not___null);
            result.setFollowup_questionario___in(this.followup_questionario___in);
            result.setFollowup_questionario___not___in(this.followup_questionario___not___in);
            result.setFollowup_questionario___lt(this.followup_questionario___lt);
            result.setFollowup_questionario___lte(this.followup_questionario___lte);
            result.setFollowup_questionario___gt(this.followup_questionario___gt);
            result.setFollowup_questionario___gte(this.followup_questionario___gte);
            result.setFollowup_questionario___contains(this.followup_questionario___contains);
            result.setFollowup_questionario___not___contains(this.followup_questionario___not___contains);
            result.setFollowup_questionario___starts_with(this.followup_questionario___starts_with);
            result.setFollowup_questionario___not___starts_with(this.followup_questionario___not___starts_with);
            result.setFollowup_questionario___ends_with(this.followup_questionario___ends_with);
            result.setFollowup_questionario___not___ends_with(this.followup_questionario___not___ends_with);
            result.setFosfatasi_alcalina___eq(this.fosfatasi_alcalina___eq);
            result.setFosfatasi_alcalina___ne(this.fosfatasi_alcalina___ne);
            result.setFosfatasi_alcalina___null(this.fosfatasi_alcalina___null);
            result.setFosfatasi_alcalina___not___null(this.fosfatasi_alcalina___not___null);
            result.setFosfatasi_alcalina___in(this.fosfatasi_alcalina___in);
            result.setFosfatasi_alcalina___not___in(this.fosfatasi_alcalina___not___in);
            result.setFosfatasi_alcalina___lt(this.fosfatasi_alcalina___lt);
            result.setFosfatasi_alcalina___lte(this.fosfatasi_alcalina___lte);
            result.setFosfatasi_alcalina___gt(this.fosfatasi_alcalina___gt);
            result.setFosfatasi_alcalina___gte(this.fosfatasi_alcalina___gte);
            result.setFosforo___eq(this.fosforo___eq);
            result.setFosforo___ne(this.fosforo___ne);
            result.setFosforo___null(this.fosforo___null);
            result.setFosforo___not___null(this.fosforo___not___null);
            result.setFosforo___in(this.fosforo___in);
            result.setFosforo___not___in(this.fosforo___not___in);
            result.setFosforo___lt(this.fosforo___lt);
            result.setFosforo___lte(this.fosforo___lte);
            result.setFosforo___gt(this.fosforo___gt);
            result.setFosforo___gte(this.fosforo___gte);
            result.setFrequenza___eq(this.frequenza___eq);
            result.setFrequenza___ne(this.frequenza___ne);
            result.setFrequenza___null(this.frequenza___null);
            result.setFrequenza___not___null(this.frequenza___not___null);
            result.setFrequenza___in(this.frequenza___in);
            result.setFrequenza___not___in(this.frequenza___not___in);
            result.setFrequenza___lt(this.frequenza___lt);
            result.setFrequenza___lte(this.frequenza___lte);
            result.setFrequenza___gt(this.frequenza___gt);
            result.setFrequenza___gte(this.frequenza___gte);
            result.setFrequenza___contains(this.frequenza___contains);
            result.setFrequenza___not___contains(this.frequenza___not___contains);
            result.setFrequenza___starts_with(this.frequenza___starts_with);
            result.setFrequenza___not___starts_with(this.frequenza___not___starts_with);
            result.setFrequenza___ends_with(this.frequenza___ends_with);
            result.setFrequenza___not___ends_with(this.frequenza___not___ends_with);
            result.setFumatore_attivo___eq(this.fumatore_attivo___eq);
            result.setFumatore_attivo___ne(this.fumatore_attivo___ne);
            result.setFumatore_attivo___null(this.fumatore_attivo___null);
            result.setFumatore_attivo___not___null(this.fumatore_attivo___not___null);
            result.setGamma_gt___eq(this.gamma_gt___eq);
            result.setGamma_gt___ne(this.gamma_gt___ne);
            result.setGamma_gt___null(this.gamma_gt___null);
            result.setGamma_gt___not___null(this.gamma_gt___not___null);
            result.setGamma_gt___in(this.gamma_gt___in);
            result.setGamma_gt___not___in(this.gamma_gt___not___in);
            result.setGamma_gt___lt(this.gamma_gt___lt);
            result.setGamma_gt___lte(this.gamma_gt___lte);
            result.setGamma_gt___gt(this.gamma_gt___gt);
            result.setGamma_gt___gte(this.gamma_gt___gte);
            result.setGlicemia___eq(this.glicemia___eq);
            result.setGlicemia___ne(this.glicemia___ne);
            result.setGlicemia___null(this.glicemia___null);
            result.setGlicemia___not___null(this.glicemia___not___null);
            result.setGlicemia___in(this.glicemia___in);
            result.setGlicemia___not___in(this.glicemia___not___in);
            result.setGlicemia___lt(this.glicemia___lt);
            result.setGlicemia___lte(this.glicemia___lte);
            result.setGlicemia___gt(this.glicemia___gt);
            result.setGlicemia___gte(this.glicemia___gte);
            result.setGlobuli_bianchi___eq(this.globuli_bianchi___eq);
            result.setGlobuli_bianchi___ne(this.globuli_bianchi___ne);
            result.setGlobuli_bianchi___null(this.globuli_bianchi___null);
            result.setGlobuli_bianchi___not___null(this.globuli_bianchi___not___null);
            result.setGlobuli_bianchi___in(this.globuli_bianchi___in);
            result.setGlobuli_bianchi___not___in(this.globuli_bianchi___not___in);
            result.setGlobuli_bianchi___lt(this.globuli_bianchi___lt);
            result.setGlobuli_bianchi___lte(this.globuli_bianchi___lte);
            result.setGlobuli_bianchi___gt(this.globuli_bianchi___gt);
            result.setGlobuli_bianchi___gte(this.globuli_bianchi___gte);
            result.setGravidanza___eq(this.gravidanza___eq);
            result.setGravidanza___ne(this.gravidanza___ne);
            result.setGravidanza___null(this.gravidanza___null);
            result.setGravidanza___not___null(this.gravidanza___not___null);
            result.setHavabtotali___eq(this.havabtotali___eq);
            result.setHavabtotali___ne(this.havabtotali___ne);
            result.setHavabtotali___null(this.havabtotali___null);
            result.setHavabtotali___not___null(this.havabtotali___not___null);
            result.setHavigm___eq(this.havigm___eq);
            result.setHavigm___ne(this.havigm___ne);
            result.setHavigm___null(this.havigm___null);
            result.setHavigm___not___null(this.havigm___not___null);
            result.setHbcab___eq(this.hbcab___eq);
            result.setHbcab___ne(this.hbcab___ne);
            result.setHbcab___null(this.hbcab___null);
            result.setHbcab___not___null(this.hbcab___not___null);
            result.setHbcigm___eq(this.hbcigm___eq);
            result.setHbcigm___ne(this.hbcigm___ne);
            result.setHbcigm___null(this.hbcigm___null);
            result.setHbcigm___not___null(this.hbcigm___not___null);
            result.setHbeab___eq(this.hbeab___eq);
            result.setHbeab___ne(this.hbeab___ne);
            result.setHbeab___null(this.hbeab___null);
            result.setHbeab___not___null(this.hbeab___not___null);
            result.setHbeag___eq(this.hbeag___eq);
            result.setHbeag___ne(this.hbeag___ne);
            result.setHbeag___null(this.hbeag___null);
            result.setHbeag___not___null(this.hbeag___not___null);
            result.setHbsab___eq(this.hbsab___eq);
            result.setHbsab___ne(this.hbsab___ne);
            result.setHbsab___null(this.hbsab___null);
            result.setHbsab___not___null(this.hbsab___not___null);
            result.setHbsab_totali___eq(this.hbsab_totali___eq);
            result.setHbsab_totali___ne(this.hbsab_totali___ne);
            result.setHbsab_totali___null(this.hbsab_totali___null);
            result.setHbsab_totali___not___null(this.hbsab_totali___not___null);
            result.setHbsab_totali___in(this.hbsab_totali___in);
            result.setHbsab_totali___not___in(this.hbsab_totali___not___in);
            result.setHbsab_totali___lt(this.hbsab_totali___lt);
            result.setHbsab_totali___lte(this.hbsab_totali___lte);
            result.setHbsab_totali___gt(this.hbsab_totali___gt);
            result.setHbsab_totali___gte(this.hbsab_totali___gte);
            result.setHbsag___eq(this.hbsag___eq);
            result.setHbsag___ne(this.hbsag___ne);
            result.setHbsag___null(this.hbsag___null);
            result.setHbsag___not___null(this.hbsag___not___null);
            result.setHbsag_totali___eq(this.hbsag_totali___eq);
            result.setHbsag_totali___ne(this.hbsag_totali___ne);
            result.setHbsag_totali___null(this.hbsag_totali___null);
            result.setHbsag_totali___not___null(this.hbsag_totali___not___null);
            result.setHbsag_totali___in(this.hbsag_totali___in);
            result.setHbsag_totali___not___in(this.hbsag_totali___not___in);
            result.setHbsag_totali___lt(this.hbsag_totali___lt);
            result.setHbsag_totali___lte(this.hbsag_totali___lte);
            result.setHbsag_totali___gt(this.hbsag_totali___gt);
            result.setHbsag_totali___gte(this.hbsag_totali___gte);
            result.setHcvab___eq(this.hcvab___eq);
            result.setHcvab___ne(this.hcvab___ne);
            result.setHcvab___null(this.hcvab___null);
            result.setHcvab___not___null(this.hcvab___not___null);
            result.setHcvag___eq(this.hcvag___eq);
            result.setHcvag___ne(this.hcvag___ne);
            result.setHcvag___null(this.hcvag___null);
            result.setHcvag___not___null(this.hcvag___not___null);
            result.setHdvab___eq(this.hdvab___eq);
            result.setHdvab___ne(this.hdvab___ne);
            result.setHdvab___null(this.hdvab___null);
            result.setHdvab___not___null(this.hdvab___not___null);
            result.setHdvab_igg___eq(this.hdvab_igg___eq);
            result.setHdvab_igg___ne(this.hdvab_igg___ne);
            result.setHdvab_igg___null(this.hdvab_igg___null);
            result.setHdvab_igg___not___null(this.hdvab_igg___not___null);
            result.setHdvabigm___eq(this.hdvabigm___eq);
            result.setHdvabigm___ne(this.hdvabigm___ne);
            result.setHdvabigm___null(this.hdvabigm___null);
            result.setHdvabigm___not___null(this.hdvabigm___not___null);
            result.setHdvabtotali___eq(this.hdvabtotali___eq);
            result.setHdvabtotali___ne(this.hdvabtotali___ne);
            result.setHdvabtotali___null(this.hdvabtotali___null);
            result.setHdvabtotali___not___null(this.hdvabtotali___not___null);
            result.setHdvabtotali___in(this.hdvabtotali___in);
            result.setHdvabtotali___not___in(this.hdvabtotali___not___in);
            result.setHdvabtotali___lt(this.hdvabtotali___lt);
            result.setHdvabtotali___lte(this.hdvabtotali___lte);
            result.setHdvabtotali___gt(this.hdvabtotali___gt);
            result.setHdvabtotali___gte(this.hdvabtotali___gte);
            result.setInterruzioni___eq(this.interruzioni___eq);
            result.setInterruzioni___ne(this.interruzioni___ne);
            result.setInterruzioni___null(this.interruzioni___null);
            result.setInterruzioni___not___null(this.interruzioni___not___null);
            result.setMdw___eq(this.mdw___eq);
            result.setMdw___ne(this.mdw___ne);
            result.setMdw___null(this.mdw___null);
            result.setMdw___not___null(this.mdw___not___null);
            result.setMdw___in(this.mdw___in);
            result.setMdw___not___in(this.mdw___not___in);
            result.setMdw___lt(this.mdw___lt);
            result.setMdw___lte(this.mdw___lte);
            result.setMdw___gt(this.mdw___gt);
            result.setMdw___gte(this.mdw___gte);
            result.setMetodica_vitamina_D_2___eq(this.metodica_vitamina_D_2___eq);
            result.setMetodica_vitamina_D_2___ne(this.metodica_vitamina_D_2___ne);
            result.setMetodica_vitamina_D_2___null(this.metodica_vitamina_D_2___null);
            result.setMetodica_vitamina_D_2___not___null(this.metodica_vitamina_D_2___not___null);
            result.setMetodica_vitamina_D_2___in(this.metodica_vitamina_D_2___in);
            result.setMetodica_vitamina_D_2___not___in(this.metodica_vitamina_D_2___not___in);
            result.setMetodica_vitamina_D_2___lt(this.metodica_vitamina_D_2___lt);
            result.setMetodica_vitamina_D_2___lte(this.metodica_vitamina_D_2___lte);
            result.setMetodica_vitamina_D_2___gt(this.metodica_vitamina_D_2___gt);
            result.setMetodica_vitamina_D_2___gte(this.metodica_vitamina_D_2___gte);
            result.setMetodica_vitamina_D_2___contains(this.metodica_vitamina_D_2___contains);
            result.setMetodica_vitamina_D_2___not___contains(this.metodica_vitamina_D_2___not___contains);
            result.setMetodica_vitamina_D_2___starts_with(this.metodica_vitamina_D_2___starts_with);
            result.setMetodica_vitamina_D_2___not___starts_with(this.metodica_vitamina_D_2___not___starts_with);
            result.setMetodica_vitamina_D_2___ends_with(this.metodica_vitamina_D_2___ends_with);
            result.setMetodica_vitamina_D_2___not___ends_with(this.metodica_vitamina_D_2___not___ends_with);
            result.setMonociti___eq(this.monociti___eq);
            result.setMonociti___ne(this.monociti___ne);
            result.setMonociti___null(this.monociti___null);
            result.setMonociti___not___null(this.monociti___not___null);
            result.setMonociti___in(this.monociti___in);
            result.setMonociti___not___in(this.monociti___not___in);
            result.setMonociti___lt(this.monociti___lt);
            result.setMonociti___lte(this.monociti___lte);
            result.setMonociti___gt(this.monociti___gt);
            result.setMonociti___gte(this.monociti___gte);
            result.setNon_trepon___eq(this.non_trepon___eq);
            result.setNon_trepon___ne(this.non_trepon___ne);
            result.setNon_trepon___null(this.non_trepon___null);
            result.setNon_trepon___not___null(this.non_trepon___not___null);
            result.setNr_neutrofili___eq(this.nr_neutrofili___eq);
            result.setNr_neutrofili___ne(this.nr_neutrofili___ne);
            result.setNr_neutrofili___null(this.nr_neutrofili___null);
            result.setNr_neutrofili___not___null(this.nr_neutrofili___not___null);
            result.setNr_neutrofili___in(this.nr_neutrofili___in);
            result.setNr_neutrofili___not___in(this.nr_neutrofili___not___in);
            result.setNr_neutrofili___lt(this.nr_neutrofili___lt);
            result.setNr_neutrofili___lte(this.nr_neutrofili___lte);
            result.setNr_neutrofili___gt(this.nr_neutrofili___gt);
            result.setNr_neutrofili___gte(this.nr_neutrofili___gte);
            result.setOmissione___eq(this.omissione___eq);
            result.setOmissione___ne(this.omissione___ne);
            result.setOmissione___null(this.omissione___null);
            result.setOmissione___not___null(this.omissione___not___null);
            result.setPa_max___eq(this.pa_max___eq);
            result.setPa_max___ne(this.pa_max___ne);
            result.setPa_max___null(this.pa_max___null);
            result.setPa_max___not___null(this.pa_max___not___null);
            result.setPa_max___in(this.pa_max___in);
            result.setPa_max___not___in(this.pa_max___not___in);
            result.setPa_max___lt(this.pa_max___lt);
            result.setPa_max___lte(this.pa_max___lte);
            result.setPa_max___gt(this.pa_max___gt);
            result.setPa_max___gte(this.pa_max___gte);
            result.setPa_min___eq(this.pa_min___eq);
            result.setPa_min___ne(this.pa_min___ne);
            result.setPa_min___null(this.pa_min___null);
            result.setPa_min___not___null(this.pa_min___not___null);
            result.setPa_min___in(this.pa_min___in);
            result.setPa_min___not___in(this.pa_min___not___in);
            result.setPa_min___lt(this.pa_min___lt);
            result.setPa_min___lte(this.pa_min___lte);
            result.setPa_min___gt(this.pa_min___gt);
            result.setPa_min___gte(this.pa_min___gte);
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
            result.setPeso___eq(this.peso___eq);
            result.setPeso___ne(this.peso___ne);
            result.setPeso___null(this.peso___null);
            result.setPeso___not___null(this.peso___not___null);
            result.setPeso___in(this.peso___in);
            result.setPeso___not___in(this.peso___not___in);
            result.setPeso___lt(this.peso___lt);
            result.setPeso___lte(this.peso___lte);
            result.setPeso___gt(this.peso___gt);
            result.setPeso___gte(this.peso___gte);
            result.setPiastrine___eq(this.piastrine___eq);
            result.setPiastrine___ne(this.piastrine___ne);
            result.setPiastrine___null(this.piastrine___null);
            result.setPiastrine___not___null(this.piastrine___not___null);
            result.setPiastrine___in(this.piastrine___in);
            result.setPiastrine___not___in(this.piastrine___not___in);
            result.setPiastrine___lt(this.piastrine___lt);
            result.setPiastrine___lte(this.piastrine___lte);
            result.setPiastrine___gt(this.piastrine___gt);
            result.setPiastrine___gte(this.piastrine___gte);
            result.setProteinuria___eq(this.proteinuria___eq);
            result.setProteinuria___ne(this.proteinuria___ne);
            result.setProteinuria___null(this.proteinuria___null);
            result.setProteinuria___not___null(this.proteinuria___not___null);
            result.setProteinuria___in(this.proteinuria___in);
            result.setProteinuria___not___in(this.proteinuria___not___in);
            result.setProteinuria___lt(this.proteinuria___lt);
            result.setProteinuria___lte(this.proteinuria___lte);
            result.setProteinuria___gt(this.proteinuria___gt);
            result.setProteinuria___gte(this.proteinuria___gte);
            result.setQuestionario_str___eq(this.questionario_str___eq);
            result.setQuestionario_str___ne(this.questionario_str___ne);
            result.setQuestionario_str___null(this.questionario_str___null);
            result.setQuestionario_str___not___null(this.questionario_str___not___null);
            result.setSesso_ok___eq(this.sesso_ok___eq);
            result.setSesso_ok___ne(this.sesso_ok___ne);
            result.setSesso_ok___null(this.sesso_ok___null);
            result.setSesso_ok___not___null(this.sesso_ok___not___null);
            result.setSesso_ok___in(this.sesso_ok___in);
            result.setSesso_ok___not___in(this.sesso_ok___not___in);
            result.setSesso_ok___lt(this.sesso_ok___lt);
            result.setSesso_ok___lte(this.sesso_ok___lte);
            result.setSesso_ok___gt(this.sesso_ok___gt);
            result.setSesso_ok___gte(this.sesso_ok___gte);
            result.setSesso_ok___contains(this.sesso_ok___contains);
            result.setSesso_ok___not___contains(this.sesso_ok___not___contains);
            result.setSesso_ok___starts_with(this.sesso_ok___starts_with);
            result.setSesso_ok___not___starts_with(this.sesso_ok___not___starts_with);
            result.setSesso_ok___ends_with(this.sesso_ok___ends_with);
            result.setSesso_ok___not___ends_with(this.sesso_ok___not___ends_with);
            result.setSuperalcolici___eq(this.superalcolici___eq);
            result.setSuperalcolici___ne(this.superalcolici___ne);
            result.setSuperalcolici___null(this.superalcolici___null);
            result.setSuperalcolici___not___null(this.superalcolici___not___null);
            result.setSuperalcolici___in(this.superalcolici___in);
            result.setSuperalcolici___not___in(this.superalcolici___not___in);
            result.setSuperalcolici___lt(this.superalcolici___lt);
            result.setSuperalcolici___lte(this.superalcolici___lte);
            result.setSuperalcolici___gt(this.superalcolici___gt);
            result.setSuperalcolici___gte(this.superalcolici___gte);
            result.setTossicodip_attivo___eq(this.tossicodip_attivo___eq);
            result.setTossicodip_attivo___ne(this.tossicodip_attivo___ne);
            result.setTossicodip_attivo___null(this.tossicodip_attivo___null);
            result.setTossicodip_attivo___not___null(this.tossicodip_attivo___not___null);
            result.setToxoigg___eq(this.toxoigg___eq);
            result.setToxoigg___ne(this.toxoigg___ne);
            result.setToxoigg___null(this.toxoigg___null);
            result.setToxoigg___not___null(this.toxoigg___not___null);
            result.setTrepon___eq(this.trepon___eq);
            result.setTrepon___ne(this.trepon___ne);
            result.setTrepon___null(this.trepon___null);
            result.setTrepon___not___null(this.trepon___not___null);
            result.setTrigliceridi___eq(this.trigliceridi___eq);
            result.setTrigliceridi___ne(this.trigliceridi___ne);
            result.setTrigliceridi___null(this.trigliceridi___null);
            result.setTrigliceridi___not___null(this.trigliceridi___not___null);
            result.setTrigliceridi___in(this.trigliceridi___in);
            result.setTrigliceridi___not___in(this.trigliceridi___not___in);
            result.setTrigliceridi___lt(this.trigliceridi___lt);
            result.setTrigliceridi___lte(this.trigliceridi___lte);
            result.setTrigliceridi___gt(this.trigliceridi___gt);
            result.setTrigliceridi___gte(this.trigliceridi___gte);
            result.setUnita_vitamina_D___eq(this.unita_vitamina_D___eq);
            result.setUnita_vitamina_D___ne(this.unita_vitamina_D___ne);
            result.setUnita_vitamina_D___null(this.unita_vitamina_D___null);
            result.setUnita_vitamina_D___not___null(this.unita_vitamina_D___not___null);
            result.setUnita_vitamina_D___in(this.unita_vitamina_D___in);
            result.setUnita_vitamina_D___not___in(this.unita_vitamina_D___not___in);
            result.setUnita_vitamina_D___lt(this.unita_vitamina_D___lt);
            result.setUnita_vitamina_D___lte(this.unita_vitamina_D___lte);
            result.setUnita_vitamina_D___gt(this.unita_vitamina_D___gt);
            result.setUnita_vitamina_D___gte(this.unita_vitamina_D___gte);
            result.setUnita_vitamina_D___contains(this.unita_vitamina_D___contains);
            result.setUnita_vitamina_D___not___contains(this.unita_vitamina_D___not___contains);
            result.setUnita_vitamina_D___starts_with(this.unita_vitamina_D___starts_with);
            result.setUnita_vitamina_D___not___starts_with(this.unita_vitamina_D___not___starts_with);
            result.setUnita_vitamina_D___ends_with(this.unita_vitamina_D___ends_with);
            result.setUnita_vitamina_D___not___ends_with(this.unita_vitamina_D___not___ends_with);
            result.setVas___eq(this.vas___eq);
            result.setVas___ne(this.vas___ne);
            result.setVas___null(this.vas___null);
            result.setVas___not___null(this.vas___not___null);
            result.setVas___in(this.vas___in);
            result.setVas___not___in(this.vas___not___in);
            result.setVas___lt(this.vas___lt);
            result.setVas___lte(this.vas___lte);
            result.setVas___gt(this.vas___gt);
            result.setVas___gte(this.vas___gte);
            result.setVas_globale___eq(this.vas_globale___eq);
            result.setVas_globale___ne(this.vas_globale___ne);
            result.setVas_globale___null(this.vas_globale___null);
            result.setVas_globale___not___null(this.vas_globale___not___null);
            result.setVas_globale___in(this.vas_globale___in);
            result.setVas_globale___not___in(this.vas_globale___not___in);
            result.setVas_globale___lt(this.vas_globale___lt);
            result.setVas_globale___lte(this.vas_globale___lte);
            result.setVas_globale___gt(this.vas_globale___gt);
            result.setVas_globale___gte(this.vas_globale___gte);
            result.setVino___eq(this.vino___eq);
            result.setVino___ne(this.vino___ne);
            result.setVino___null(this.vino___null);
            result.setVino___not___null(this.vino___not___null);
            result.setVino___in(this.vino___in);
            result.setVino___not___in(this.vino___not___in);
            result.setVino___lt(this.vino___lt);
            result.setVino___lte(this.vino___lte);
            result.setVino___gt(this.vino___gt);
            result.setVino___gte(this.vino___gte);
            result.setVitamina_D___eq(this.vitamina_D___eq);
            result.setVitamina_D___ne(this.vitamina_D___ne);
            result.setVitamina_D___null(this.vitamina_D___null);
            result.setVitamina_D___not___null(this.vitamina_D___not___null);
            result.setVitamina_D___in(this.vitamina_D___in);
            result.setVitamina_D___not___in(this.vitamina_D___not___in);
            result.setVitamina_D___lt(this.vitamina_D___lt);
            result.setVitamina_D___lte(this.vitamina_D___lte);
            result.setVitamina_D___gt(this.vitamina_D___gt);
            result.setVitamina_D___gte(this.vitamina_D___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
