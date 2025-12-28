package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type H_Paziente.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliH_PazienteFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String IL28B___eq;
    private String IL28B___ne;
    private Boolean IL28B___null;
    private Boolean IL28B___not___null;
    private java.util.List<String> IL28B___in;
    private java.util.List<String> IL28B___not___in;
    private String IL28B___lt;
    private String IL28B___lte;
    private String IL28B___gt;
    private String IL28B___gte;
    private String IL28B___contains;
    private String IL28B___not___contains;
    private String IL28B___starts_with;
    private String IL28B___not___starts_with;
    private String IL28B___ends_with;
    private String IL28B___not___ends_with;
    private String USSL_di_residenza___eq;
    private String USSL_di_residenza___ne;
    private Boolean USSL_di_residenza___null;
    private Boolean USSL_di_residenza___not___null;
    private java.util.List<String> USSL_di_residenza___in;
    private java.util.List<String> USSL_di_residenza___not___in;
    private String USSL_di_residenza___lt;
    private String USSL_di_residenza___lte;
    private String USSL_di_residenza___gt;
    private String USSL_di_residenza___gte;
    private String USSL_di_residenza___contains;
    private String USSL_di_residenza___not___contains;
    private String USSL_di_residenza___starts_with;
    private String USSL_di_residenza___not___starts_with;
    private String USSL_di_residenza___ends_with;
    private String USSL_di_residenza___not___ends_with;
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
    private Integer altezza___eq;
    private Integer altezza___ne;
    private Boolean altezza___null;
    private Boolean altezza___not___null;
    private java.util.List<Integer> altezza___in;
    private java.util.List<Integer> altezza___not___in;
    private Integer altezza___lt;
    private Integer altezza___lte;
    private Integer altezza___gt;
    private Integer altezza___gte;
    private String altro_fattore_di_rischio___eq;
    private String altro_fattore_di_rischio___ne;
    private Boolean altro_fattore_di_rischio___null;
    private Boolean altro_fattore_di_rischio___not___null;
    private java.util.List<String> altro_fattore_di_rischio___in;
    private java.util.List<String> altro_fattore_di_rischio___not___in;
    private String altro_fattore_di_rischio___lt;
    private String altro_fattore_di_rischio___lte;
    private String altro_fattore_di_rischio___gt;
    private String altro_fattore_di_rischio___gte;
    private String altro_fattore_di_rischio___contains;
    private String altro_fattore_di_rischio___not___contains;
    private String altro_fattore_di_rischio___starts_with;
    private String altro_fattore_di_rischio___not___starts_with;
    private String altro_fattore_di_rischio___ends_with;
    private String altro_fattore_di_rischio___not___ends_with;
    private Integer anno_nascita___eq;
    private Integer anno_nascita___ne;
    private Boolean anno_nascita___null;
    private Boolean anno_nascita___not___null;
    private java.util.List<Integer> anno_nascita___in;
    private java.util.List<Integer> anno_nascita___not___in;
    private Integer anno_nascita___lt;
    private Integer anno_nascita___lte;
    private Integer anno_nascita___gt;
    private Integer anno_nascita___gte;
    private Boolean checks___eq;
    private Boolean checks___ne;
    private Boolean checks___null;
    private Boolean checks___not___null;
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
    private String codice_interno___eq;
    private String codice_interno___ne;
    private Boolean codice_interno___null;
    private Boolean codice_interno___not___null;
    private java.util.List<String> codice_interno___in;
    private java.util.List<String> codice_interno___not___in;
    private String codice_interno___lt;
    private String codice_interno___lte;
    private String codice_interno___gt;
    private String codice_interno___gte;
    private String codice_interno___contains;
    private String codice_interno___not___contains;
    private String codice_interno___starts_with;
    private String codice_interno___not___starts_with;
    private String codice_interno___ends_with;
    private String codice_interno___not___ends_with;
    private String codice_nazionale___eq;
    private String codice_nazionale___ne;
    private Boolean codice_nazionale___null;
    private Boolean codice_nazionale___not___null;
    private java.util.List<String> codice_nazionale___in;
    private java.util.List<String> codice_nazionale___not___in;
    private String codice_nazionale___lt;
    private String codice_nazionale___lte;
    private String codice_nazionale___gt;
    private String codice_nazionale___gte;
    private String codice_nazionale___contains;
    private String codice_nazionale___not___contains;
    private String codice_nazionale___starts_with;
    private String codice_nazionale___not___starts_with;
    private String codice_nazionale___ends_with;
    private String codice_nazionale___not___ends_with;
    private String cognome___eq;
    private String cognome___ne;
    private Boolean cognome___null;
    private Boolean cognome___not___null;
    private java.util.List<String> cognome___in;
    private java.util.List<String> cognome___not___in;
    private String cognome___lt;
    private String cognome___lte;
    private String cognome___gt;
    private String cognome___gte;
    private String cognome___contains;
    private String cognome___not___contains;
    private String cognome___starts_with;
    private String cognome___not___starts_with;
    private String cognome___ends_with;
    private String cognome___not___ends_with;
    private String comune_di_nascita___eq;
    private String comune_di_nascita___ne;
    private Boolean comune_di_nascita___null;
    private Boolean comune_di_nascita___not___null;
    private java.util.List<String> comune_di_nascita___in;
    private java.util.List<String> comune_di_nascita___not___in;
    private String comune_di_nascita___lt;
    private String comune_di_nascita___lte;
    private String comune_di_nascita___gt;
    private String comune_di_nascita___gte;
    private String comune_di_nascita___contains;
    private String comune_di_nascita___not___contains;
    private String comune_di_nascita___starts_with;
    private String comune_di_nascita___not___starts_with;
    private String comune_di_nascita___ends_with;
    private String comune_di_nascita___not___ends_with;
    private String data_consenso___eq;
    private String data_consenso___ne;
    private Boolean data_consenso___null;
    private Boolean data_consenso___not___null;
    private java.util.List<String> data_consenso___in;
    private java.util.List<String> data_consenso___not___in;
    private String data_consenso___lt;
    private String data_consenso___lte;
    private String data_consenso___gt;
    private String data_consenso___gte;
    private String data_consenso_pro___eq;
    private String data_consenso_pro___ne;
    private Boolean data_consenso_pro___null;
    private Boolean data_consenso_pro___not___null;
    private java.util.List<String> data_consenso_pro___in;
    private java.util.List<String> data_consenso_pro___not___in;
    private String data_consenso_pro___lt;
    private String data_consenso_pro___lte;
    private String data_consenso_pro___gt;
    private String data_consenso_pro___gte;
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
    private String data_fine_terapia_ormonale___eq;
    private String data_fine_terapia_ormonale___ne;
    private Boolean data_fine_terapia_ormonale___null;
    private Boolean data_fine_terapia_ormonale___not___null;
    private java.util.List<String> data_fine_terapia_ormonale___in;
    private java.util.List<String> data_fine_terapia_ormonale___not___in;
    private String data_fine_terapia_ormonale___lt;
    private String data_fine_terapia_ormonale___lte;
    private String data_fine_terapia_ormonale___gt;
    private String data_fine_terapia_ormonale___gte;
    private String data_gilbert___eq;
    private String data_gilbert___ne;
    private Boolean data_gilbert___null;
    private Boolean data_gilbert___not___null;
    private java.util.List<String> data_gilbert___in;
    private java.util.List<String> data_gilbert___not___in;
    private String data_gilbert___lt;
    private String data_gilbert___lte;
    private String data_gilbert___gt;
    private String data_gilbert___gte;
    private String data_hla___eq;
    private String data_hla___ne;
    private Boolean data_hla___null;
    private Boolean data_hla___not___null;
    private java.util.List<String> data_hla___in;
    private java.util.List<String> data_hla___not___in;
    private String data_hla___lt;
    private String data_hla___lte;
    private String data_hla___gt;
    private String data_hla___gte;
    private String data_il28___eq;
    private String data_il28___ne;
    private Boolean data_il28___null;
    private Boolean data_il28___not___null;
    private java.util.List<String> data_il28___in;
    private java.util.List<String> data_il28___not___in;
    private String data_il28___lt;
    private String data_il28___lte;
    private String data_il28___gt;
    private String data_il28___gte;
    private String data_inizio_terapia_ormonale___eq;
    private String data_inizio_terapia_ormonale___ne;
    private Boolean data_inizio_terapia_ormonale___null;
    private Boolean data_inizio_terapia_ormonale___not___null;
    private java.util.List<String> data_inizio_terapia_ormonale___in;
    private java.util.List<String> data_inizio_terapia_ormonale___not___in;
    private String data_inizio_terapia_ormonale___lt;
    private String data_inizio_terapia_ormonale___lte;
    private String data_inizio_terapia_ormonale___gt;
    private String data_inizio_terapia_ormonale___gte;
    private String data_menopausa___eq;
    private String data_menopausa___ne;
    private Boolean data_menopausa___null;
    private Boolean data_menopausa___not___null;
    private java.util.List<String> data_menopausa___in;
    private java.util.List<String> data_menopausa___not___in;
    private String data_menopausa___lt;
    private String data_menopausa___lte;
    private String data_menopausa___gt;
    private String data_menopausa___gte;
    private String data_prima_terapia_anti_hcv___eq;
    private String data_prima_terapia_anti_hcv___ne;
    private Boolean data_prima_terapia_anti_hcv___null;
    private Boolean data_prima_terapia_anti_hcv___not___null;
    private java.util.List<String> data_prima_terapia_anti_hcv___in;
    private java.util.List<String> data_prima_terapia_anti_hcv___not___in;
    private String data_prima_terapia_anti_hcv___lt;
    private String data_prima_terapia_anti_hcv___lte;
    private String data_prima_terapia_anti_hcv___gt;
    private String data_prima_terapia_anti_hcv___gte;
    private String data_prima_visita___eq;
    private String data_prima_visita___ne;
    private Boolean data_prima_visita___null;
    private Boolean data_prima_visita___not___null;
    private java.util.List<String> data_prima_visita___in;
    private java.util.List<String> data_prima_visita___not___in;
    private String data_prima_visita___lt;
    private String data_prima_visita___lte;
    private String data_prima_visita___gt;
    private String data_prima_visita___gte;
    private String data_primo_hcvab_pos___eq;
    private String data_primo_hcvab_pos___ne;
    private Boolean data_primo_hcvab_pos___null;
    private Boolean data_primo_hcvab_pos___not___null;
    private java.util.List<String> data_primo_hcvab_pos___in;
    private java.util.List<String> data_primo_hcvab_pos___not___in;
    private String data_primo_hcvab_pos___lt;
    private String data_primo_hcvab_pos___lte;
    private String data_primo_hcvab_pos___gt;
    private String data_primo_hcvab_pos___gte;
    private String data_ultima_visita___eq;
    private String data_ultima_visita___ne;
    private Boolean data_ultima_visita___null;
    private Boolean data_ultima_visita___not___null;
    private java.util.List<String> data_ultima_visita___in;
    private java.util.List<String> data_ultima_visita___not___in;
    private String data_ultima_visita___lt;
    private String data_ultima_visita___lte;
    private String data_ultima_visita___gt;
    private String data_ultima_visita___gte;
    private String data_ultimo_HCVAb_pre_arr___eq;
    private String data_ultimo_HCVAb_pre_arr___ne;
    private Boolean data_ultimo_HCVAb_pre_arr___null;
    private Boolean data_ultimo_HCVAb_pre_arr___not___null;
    private java.util.List<String> data_ultimo_HCVAb_pre_arr___in;
    private java.util.List<String> data_ultimo_HCVAb_pre_arr___not___in;
    private String data_ultimo_HCVAb_pre_arr___lt;
    private String data_ultimo_HCVAb_pre_arr___lte;
    private String data_ultimo_HCVAb_pre_arr___gt;
    private String data_ultimo_HCVAb_pre_arr___gte;
    private String data_ultimo_HbsAg_pre_arr___eq;
    private String data_ultimo_HbsAg_pre_arr___ne;
    private Boolean data_ultimo_HbsAg_pre_arr___null;
    private Boolean data_ultimo_HbsAg_pre_arr___not___null;
    private java.util.List<String> data_ultimo_HbsAg_pre_arr___in;
    private java.util.List<String> data_ultimo_HbsAg_pre_arr___not___in;
    private String data_ultimo_HbsAg_pre_arr___lt;
    private String data_ultimo_HbsAg_pre_arr___lte;
    private String data_ultimo_HbsAg_pre_arr___gt;
    private String data_ultimo_HbsAg_pre_arr___gte;
    private String data_ultimo_drop___eq;
    private String data_ultimo_drop___ne;
    private Boolean data_ultimo_drop___null;
    private Boolean data_ultimo_drop___not___null;
    private java.util.List<String> data_ultimo_drop___in;
    private java.util.List<String> data_ultimo_drop___not___in;
    private String data_ultimo_drop___lt;
    private String data_ultimo_drop___lte;
    private String data_ultimo_drop___gt;
    private String data_ultimo_drop___gte;
    private String date_longicona___eq;
    private String date_longicona___ne;
    private Boolean date_longicona___null;
    private Boolean date_longicona___not___null;
    private java.util.List<String> date_longicona___in;
    private java.util.List<String> date_longicona___not___in;
    private String date_longicona___lt;
    private String date_longicona___lte;
    private String date_longicona___gt;
    private String date_longicona___gte;
    private String date_longicona___contains;
    private String date_longicona___not___contains;
    private String date_longicona___starts_with;
    private String date_longicona___not___starts_with;
    private String date_longicona___ends_with;
    private String date_longicona___not___ends_with;
    private Boolean dtg___eq;
    private Boolean dtg___ne;
    private Boolean dtg___null;
    private Boolean dtg___not___null;
    private String esito_ultima_terapia___eq;
    private String esito_ultima_terapia___ne;
    private Boolean esito_ultima_terapia___null;
    private Boolean esito_ultima_terapia___not___null;
    private java.util.List<String> esito_ultima_terapia___in;
    private java.util.List<String> esito_ultima_terapia___not___in;
    private String esito_ultima_terapia___lt;
    private String esito_ultima_terapia___lte;
    private String esito_ultima_terapia___gt;
    private String esito_ultima_terapia___gte;
    private String esito_ultima_terapia___contains;
    private String esito_ultima_terapia___not___contains;
    private String esito_ultima_terapia___starts_with;
    private String esito_ultima_terapia___not___starts_with;
    private String esito_ultima_terapia___ends_with;
    private String esito_ultima_terapia___not___ends_with;
    private Integer eta_arruolamento___eq;
    private Integer eta_arruolamento___ne;
    private Boolean eta_arruolamento___null;
    private Boolean eta_arruolamento___not___null;
    private java.util.List<Integer> eta_arruolamento___in;
    private java.util.List<Integer> eta_arruolamento___not___in;
    private Integer eta_arruolamento___lt;
    private Integer eta_arruolamento___lte;
    private Integer eta_arruolamento___gt;
    private Integer eta_arruolamento___gte;
    private Integer eta_prima_visita___eq;
    private Integer eta_prima_visita___ne;
    private Boolean eta_prima_visita___null;
    private Boolean eta_prima_visita___not___null;
    private java.util.List<Integer> eta_prima_visita___in;
    private java.util.List<Integer> eta_prima_visita___not___in;
    private Integer eta_prima_visita___lt;
    private Integer eta_prima_visita___lte;
    private Integer eta_prima_visita___gt;
    private Integer eta_prima_visita___gte;
    private String etnia____eq;
    private String etnia____ne;
    private Boolean etnia____null;
    private Boolean etnia____not___null;
    private java.util.List<String> etnia____in;
    private java.util.List<String> etnia____not___in;
    private String etnia____lt;
    private String etnia____lte;
    private String etnia____gt;
    private String etnia____gte;
    private String etnia____contains;
    private String etnia____not___contains;
    private String etnia____starts_with;
    private String etnia____not___starts_with;
    private String etnia____ends_with;
    private String etnia____not___ends_with;
    private String fattore_di_rischio____eq;
    private String fattore_di_rischio____ne;
    private Boolean fattore_di_rischio____null;
    private Boolean fattore_di_rischio____not___null;
    private java.util.List<String> fattore_di_rischio____in;
    private java.util.List<String> fattore_di_rischio____not___in;
    private String fattore_di_rischio____lt;
    private String fattore_di_rischio____lte;
    private String fattore_di_rischio____gt;
    private String fattore_di_rischio____gte;
    private String fattore_di_rischio____contains;
    private String fattore_di_rischio____not___contains;
    private String fattore_di_rischio____starts_with;
    private String fattore_di_rischio____not___starts_with;
    private String fattore_di_rischio____ends_with;
    private String fattore_di_rischio____not___ends_with;
    private Boolean fibroscan___eq;
    private Boolean fibroscan___ne;
    private Boolean fibroscan___null;
    private Boolean fibroscan___not___null;
    private Boolean hbsag_pos___eq;
    private Boolean hbsag_pos___ne;
    private Boolean hbsag_pos___null;
    private Boolean hbsag_pos___not___null;
    private Boolean hcvab_pos___eq;
    private Boolean hcvab_pos___ne;
    private Boolean hcvab_pos___null;
    private Boolean hcvab_pos___not___null;
    private String hla_b5701___eq;
    private String hla_b5701___ne;
    private Boolean hla_b5701___null;
    private Boolean hla_b5701___not___null;
    private java.util.List<String> hla_b5701___in;
    private java.util.List<String> hla_b5701___not___in;
    private String hla_b5701___lt;
    private String hla_b5701___lte;
    private String hla_b5701___gt;
    private String hla_b5701___gte;
    private String hla_b5701___contains;
    private String hla_b5701___not___contains;
    private String hla_b5701___starts_with;
    private String hla_b5701___not___starts_with;
    private String hla_b5701___ends_with;
    private String hla_b5701___not___ends_with;
    private Boolean hla_b5701_bool___eq;
    private Boolean hla_b5701_bool___ne;
    private Boolean hla_b5701_bool___null;
    private Boolean hla_b5701_bool___not___null;
    private Integer id_paziente___eq;
    private Integer id_paziente___ne;
    private Boolean id_paziente___null;
    private Boolean id_paziente___not___null;
    private java.util.List<Integer> id_paziente___in;
    private java.util.List<Integer> id_paziente___not___in;
    private Integer id_paziente___lt;
    private Integer id_paziente___lte;
    private Integer id_paziente___gt;
    private Integer id_paziente___gte;
    private Boolean ifn___eq;
    private Boolean ifn___ne;
    private Boolean ifn___null;
    private Boolean ifn___not___null;
    private Integer in_italia_da_anni___eq;
    private Integer in_italia_da_anni___ne;
    private Boolean in_italia_da_anni___null;
    private Boolean in_italia_da_anni___not___null;
    private java.util.List<Integer> in_italia_da_anni___in;
    private java.util.List<Integer> in_italia_da_anni___not___in;
    private Integer in_italia_da_anni___lt;
    private Integer in_italia_da_anni___lte;
    private Integer in_italia_da_anni___gt;
    private Integer in_italia_da_anni___gte;
    private String nascita___eq;
    private String nascita___ne;
    private Boolean nascita___null;
    private Boolean nascita___not___null;
    private java.util.List<String> nascita___in;
    private java.util.List<String> nascita___not___in;
    private String nascita___lt;
    private String nascita___lte;
    private String nascita___gt;
    private String nascita___gte;
    private String nazionalita____eq;
    private String nazionalita____ne;
    private Boolean nazionalita____null;
    private Boolean nazionalita____not___null;
    private java.util.List<String> nazionalita____in;
    private java.util.List<String> nazionalita____not___in;
    private String nazionalita____lt;
    private String nazionalita____lte;
    private String nazionalita____gt;
    private String nazionalita____gte;
    private String nazionalita____contains;
    private String nazionalita____not___contains;
    private String nazionalita____starts_with;
    private String nazionalita____not___starts_with;
    private String nazionalita____ends_with;
    private String nazionalita____not___ends_with;
    private String nazione___eq;
    private String nazione___ne;
    private Boolean nazione___null;
    private Boolean nazione___not___null;
    private java.util.List<String> nazione___in;
    private java.util.List<String> nazione___not___in;
    private String nazione___lt;
    private String nazione___lte;
    private String nazione___gt;
    private String nazione___gte;
    private String nazione___contains;
    private String nazione___not___contains;
    private String nazione___starts_with;
    private String nazione___not___starts_with;
    private String nazione___ends_with;
    private String nazione___not___ends_with;
    private Boolean noco___eq;
    private Boolean noco___ne;
    private Boolean noco___null;
    private Boolean noco___not___null;
    private String nome___eq;
    private String nome___ne;
    private Boolean nome___null;
    private Boolean nome___not___null;
    private java.util.List<String> nome___in;
    private java.util.List<String> nome___not___in;
    private String nome___lt;
    private String nome___lte;
    private String nome___gt;
    private String nome___gte;
    private String nome___contains;
    private String nome___not___contains;
    private String nome___starts_with;
    private String nome___not___starts_with;
    private String nome___ends_with;
    private String nome___not___ends_with;
    private String note_terapia___eq;
    private String note_terapia___ne;
    private Boolean note_terapia___null;
    private Boolean note_terapia___not___null;
    private java.util.List<String> note_terapia___in;
    private java.util.List<String> note_terapia___not___in;
    private String note_terapia___lt;
    private String note_terapia___lte;
    private String note_terapia___gt;
    private String note_terapia___gte;
    private String note_terapia___contains;
    private String note_terapia___not___contains;
    private String note_terapia___starts_with;
    private String note_terapia___not___starts_with;
    private String note_terapia___ends_with;
    private String note_terapia___not___ends_with;
    private Boolean null_val___eq;
    private Boolean null_val___ne;
    private Boolean null_val___null;
    private Boolean null_val___not___null;
    private String password_pro___eq;
    private String password_pro___ne;
    private Boolean password_pro___null;
    private Boolean password_pro___not___null;
    private java.util.List<String> password_pro___in;
    private java.util.List<String> password_pro___not___in;
    private String password_pro___lt;
    private String password_pro___lte;
    private String password_pro___gt;
    private String password_pro___gte;
    private String password_pro___contains;
    private String password_pro___not___contains;
    private String password_pro___starts_with;
    private String password_pro___not___starts_with;
    private String password_pro___ends_with;
    private String password_pro___not___ends_with;
    private Boolean pegifn___eq;
    private Boolean pegifn___ne;
    private Boolean pegifn___null;
    private Boolean pegifn___not___null;
    private Boolean pregresse_terapie_anti_hcv___eq;
    private Boolean pregresse_terapie_anti_hcv___ne;
    private Boolean pregresse_terapie_anti_hcv___null;
    private Boolean pregresse_terapie_anti_hcv___not___null;
    private Boolean pro___eq;
    private Boolean pro___ne;
    private Boolean pro___null;
    private Boolean pro___not___null;
    private Boolean ribavirina___eq;
    private Boolean ribavirina___ne;
    private Boolean ribavirina___null;
    private Boolean ribavirina___not___null;
    private Boolean risk_F___eq;
    private Boolean risk_F___ne;
    private Boolean risk_F___null;
    private Boolean risk_F___not___null;
    private String sessione_pro___eq;
    private String sessione_pro___ne;
    private Boolean sessione_pro___null;
    private Boolean sessione_pro___not___null;
    private java.util.List<String> sessione_pro___in;
    private java.util.List<String> sessione_pro___not___in;
    private String sessione_pro___lt;
    private String sessione_pro___lte;
    private String sessione_pro___gt;
    private String sessione_pro___gte;
    private String sessione_pro___contains;
    private String sessione_pro___not___contains;
    private String sessione_pro___starts_with;
    private String sessione_pro___not___starts_with;
    private String sessione_pro___ends_with;
    private String sessione_pro___not___ends_with;
    private String sesso___eq;
    private String sesso___ne;
    private Boolean sesso___null;
    private Boolean sesso___not___null;
    private java.util.List<String> sesso___in;
    private java.util.List<String> sesso___not___in;
    private String sesso___lt;
    private String sesso___lte;
    private String sesso___gt;
    private String sesso___gte;
    private String sesso___contains;
    private String sesso___not___contains;
    private String sesso___starts_with;
    private String sesso___not___starts_with;
    private String sesso___ends_with;
    private String sesso___not___ends_with;
    private Boolean stribild___eq;
    private Boolean stribild___ne;
    private Boolean stribild___null;
    private Boolean stribild___not___null;
    private String studi_pro_abilitati___eq;
    private String studi_pro_abilitati___ne;
    private Boolean studi_pro_abilitati___null;
    private Boolean studi_pro_abilitati___not___null;
    private java.util.List<String> studi_pro_abilitati___in;
    private java.util.List<String> studi_pro_abilitati___not___in;
    private String studi_pro_abilitati___lt;
    private String studi_pro_abilitati___lte;
    private String studi_pro_abilitati___gt;
    private String studi_pro_abilitati___gte;
    private String studi_pro_abilitati___contains;
    private String studi_pro_abilitati___not___contains;
    private String studi_pro_abilitati___starts_with;
    private String studi_pro_abilitati___not___starts_with;
    private String studi_pro_abilitati___ends_with;
    private String studi_pro_abilitati___not___ends_with;
    private Boolean taf___eq;
    private Boolean taf___ne;
    private Boolean taf___null;
    private Boolean taf___not___null;
    private Boolean terapia_ormonale___eq;
    private Boolean terapia_ormonale___ne;
    private Boolean terapia_ormonale___null;
    private Boolean terapia_ormonale___not___null;
    private String token_notifiche_pro___eq;
    private String token_notifiche_pro___ne;
    private Boolean token_notifiche_pro___null;
    private Boolean token_notifiche_pro___not___null;
    private java.util.List<String> token_notifiche_pro___in;
    private java.util.List<String> token_notifiche_pro___not___in;
    private String token_notifiche_pro___lt;
    private String token_notifiche_pro___lte;
    private String token_notifiche_pro___gt;
    private String token_notifiche_pro___gte;
    private String token_notifiche_pro___contains;
    private String token_notifiche_pro___not___contains;
    private String token_notifiche_pro___starts_with;
    private String token_notifiche_pro___not___starts_with;
    private String token_notifiche_pro___ends_with;
    private String token_notifiche_pro___not___ends_with;
    private Boolean trasferito___eq;
    private Boolean trasferito___ne;
    private Boolean trasferito___null;
    private Boolean trasferito___not___null;
    private String username_pro___eq;
    private String username_pro___ne;
    private Boolean username_pro___null;
    private Boolean username_pro___not___null;
    private java.util.List<String> username_pro___in;
    private java.util.List<String> username_pro___not___in;
    private String username_pro___lt;
    private String username_pro___lte;
    private String username_pro___gt;
    private String username_pro___gte;
    private String username_pro___contains;
    private String username_pro___not___contains;
    private String username_pro___starts_with;
    private String username_pro___not___starts_with;
    private String username_pro___ends_with;
    private String username_pro___not___ends_with;
    private java.util.List<CliH_PazienteFilterDTO> AND;
    private java.util.List<CliH_PazienteFilterDTO> OR;
    private CliH_PazienteFilterDTO NOT;

    public CliH_PazienteFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String getIL28B___eq() {
        return IL28B___eq;
    }
    public void setIL28B___eq(String IL28B___eq) {
        this.IL28B___eq = IL28B___eq;
    }

    public String getIL28B___ne() {
        return IL28B___ne;
    }
    public void setIL28B___ne(String IL28B___ne) {
        this.IL28B___ne = IL28B___ne;
    }

    public Boolean getIL28B___null() {
        return IL28B___null;
    }
    public void setIL28B___null(Boolean IL28B___null) {
        this.IL28B___null = IL28B___null;
    }

    public Boolean getIL28B___not___null() {
        return IL28B___not___null;
    }
    public void setIL28B___not___null(Boolean IL28B___not___null) {
        this.IL28B___not___null = IL28B___not___null;
    }

    public java.util.List<String> getIL28B___in() {
        return IL28B___in;
    }
    public void setIL28B___in(java.util.List<String> IL28B___in) {
        this.IL28B___in = IL28B___in;
    }

    public java.util.List<String> getIL28B___not___in() {
        return IL28B___not___in;
    }
    public void setIL28B___not___in(java.util.List<String> IL28B___not___in) {
        this.IL28B___not___in = IL28B___not___in;
    }

    public String getIL28B___lt() {
        return IL28B___lt;
    }
    public void setIL28B___lt(String IL28B___lt) {
        this.IL28B___lt = IL28B___lt;
    }

    public String getIL28B___lte() {
        return IL28B___lte;
    }
    public void setIL28B___lte(String IL28B___lte) {
        this.IL28B___lte = IL28B___lte;
    }

    public String getIL28B___gt() {
        return IL28B___gt;
    }
    public void setIL28B___gt(String IL28B___gt) {
        this.IL28B___gt = IL28B___gt;
    }

    public String getIL28B___gte() {
        return IL28B___gte;
    }
    public void setIL28B___gte(String IL28B___gte) {
        this.IL28B___gte = IL28B___gte;
    }

    public String getIL28B___contains() {
        return IL28B___contains;
    }
    public void setIL28B___contains(String IL28B___contains) {
        this.IL28B___contains = IL28B___contains;
    }

    public String getIL28B___not___contains() {
        return IL28B___not___contains;
    }
    public void setIL28B___not___contains(String IL28B___not___contains) {
        this.IL28B___not___contains = IL28B___not___contains;
    }

    public String getIL28B___starts_with() {
        return IL28B___starts_with;
    }
    public void setIL28B___starts_with(String IL28B___starts_with) {
        this.IL28B___starts_with = IL28B___starts_with;
    }

    public String getIL28B___not___starts_with() {
        return IL28B___not___starts_with;
    }
    public void setIL28B___not___starts_with(String IL28B___not___starts_with) {
        this.IL28B___not___starts_with = IL28B___not___starts_with;
    }

    public String getIL28B___ends_with() {
        return IL28B___ends_with;
    }
    public void setIL28B___ends_with(String IL28B___ends_with) {
        this.IL28B___ends_with = IL28B___ends_with;
    }

    public String getIL28B___not___ends_with() {
        return IL28B___not___ends_with;
    }
    public void setIL28B___not___ends_with(String IL28B___not___ends_with) {
        this.IL28B___not___ends_with = IL28B___not___ends_with;
    }

    public String getUSSL_di_residenza___eq() {
        return USSL_di_residenza___eq;
    }
    public void setUSSL_di_residenza___eq(String USSL_di_residenza___eq) {
        this.USSL_di_residenza___eq = USSL_di_residenza___eq;
    }

    public String getUSSL_di_residenza___ne() {
        return USSL_di_residenza___ne;
    }
    public void setUSSL_di_residenza___ne(String USSL_di_residenza___ne) {
        this.USSL_di_residenza___ne = USSL_di_residenza___ne;
    }

    public Boolean getUSSL_di_residenza___null() {
        return USSL_di_residenza___null;
    }
    public void setUSSL_di_residenza___null(Boolean USSL_di_residenza___null) {
        this.USSL_di_residenza___null = USSL_di_residenza___null;
    }

    public Boolean getUSSL_di_residenza___not___null() {
        return USSL_di_residenza___not___null;
    }
    public void setUSSL_di_residenza___not___null(Boolean USSL_di_residenza___not___null) {
        this.USSL_di_residenza___not___null = USSL_di_residenza___not___null;
    }

    public java.util.List<String> getUSSL_di_residenza___in() {
        return USSL_di_residenza___in;
    }
    public void setUSSL_di_residenza___in(java.util.List<String> USSL_di_residenza___in) {
        this.USSL_di_residenza___in = USSL_di_residenza___in;
    }

    public java.util.List<String> getUSSL_di_residenza___not___in() {
        return USSL_di_residenza___not___in;
    }
    public void setUSSL_di_residenza___not___in(java.util.List<String> USSL_di_residenza___not___in) {
        this.USSL_di_residenza___not___in = USSL_di_residenza___not___in;
    }

    public String getUSSL_di_residenza___lt() {
        return USSL_di_residenza___lt;
    }
    public void setUSSL_di_residenza___lt(String USSL_di_residenza___lt) {
        this.USSL_di_residenza___lt = USSL_di_residenza___lt;
    }

    public String getUSSL_di_residenza___lte() {
        return USSL_di_residenza___lte;
    }
    public void setUSSL_di_residenza___lte(String USSL_di_residenza___lte) {
        this.USSL_di_residenza___lte = USSL_di_residenza___lte;
    }

    public String getUSSL_di_residenza___gt() {
        return USSL_di_residenza___gt;
    }
    public void setUSSL_di_residenza___gt(String USSL_di_residenza___gt) {
        this.USSL_di_residenza___gt = USSL_di_residenza___gt;
    }

    public String getUSSL_di_residenza___gte() {
        return USSL_di_residenza___gte;
    }
    public void setUSSL_di_residenza___gte(String USSL_di_residenza___gte) {
        this.USSL_di_residenza___gte = USSL_di_residenza___gte;
    }

    public String getUSSL_di_residenza___contains() {
        return USSL_di_residenza___contains;
    }
    public void setUSSL_di_residenza___contains(String USSL_di_residenza___contains) {
        this.USSL_di_residenza___contains = USSL_di_residenza___contains;
    }

    public String getUSSL_di_residenza___not___contains() {
        return USSL_di_residenza___not___contains;
    }
    public void setUSSL_di_residenza___not___contains(String USSL_di_residenza___not___contains) {
        this.USSL_di_residenza___not___contains = USSL_di_residenza___not___contains;
    }

    public String getUSSL_di_residenza___starts_with() {
        return USSL_di_residenza___starts_with;
    }
    public void setUSSL_di_residenza___starts_with(String USSL_di_residenza___starts_with) {
        this.USSL_di_residenza___starts_with = USSL_di_residenza___starts_with;
    }

    public String getUSSL_di_residenza___not___starts_with() {
        return USSL_di_residenza___not___starts_with;
    }
    public void setUSSL_di_residenza___not___starts_with(String USSL_di_residenza___not___starts_with) {
        this.USSL_di_residenza___not___starts_with = USSL_di_residenza___not___starts_with;
    }

    public String getUSSL_di_residenza___ends_with() {
        return USSL_di_residenza___ends_with;
    }
    public void setUSSL_di_residenza___ends_with(String USSL_di_residenza___ends_with) {
        this.USSL_di_residenza___ends_with = USSL_di_residenza___ends_with;
    }

    public String getUSSL_di_residenza___not___ends_with() {
        return USSL_di_residenza___not___ends_with;
    }
    public void setUSSL_di_residenza___not___ends_with(String USSL_di_residenza___not___ends_with) {
        this.USSL_di_residenza___not___ends_with = USSL_di_residenza___not___ends_with;
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

    public Integer getAltezza___eq() {
        return altezza___eq;
    }
    public void setAltezza___eq(Integer altezza___eq) {
        this.altezza___eq = altezza___eq;
    }

    public Integer getAltezza___ne() {
        return altezza___ne;
    }
    public void setAltezza___ne(Integer altezza___ne) {
        this.altezza___ne = altezza___ne;
    }

    public Boolean getAltezza___null() {
        return altezza___null;
    }
    public void setAltezza___null(Boolean altezza___null) {
        this.altezza___null = altezza___null;
    }

    public Boolean getAltezza___not___null() {
        return altezza___not___null;
    }
    public void setAltezza___not___null(Boolean altezza___not___null) {
        this.altezza___not___null = altezza___not___null;
    }

    public java.util.List<Integer> getAltezza___in() {
        return altezza___in;
    }
    public void setAltezza___in(java.util.List<Integer> altezza___in) {
        this.altezza___in = altezza___in;
    }

    public java.util.List<Integer> getAltezza___not___in() {
        return altezza___not___in;
    }
    public void setAltezza___not___in(java.util.List<Integer> altezza___not___in) {
        this.altezza___not___in = altezza___not___in;
    }

    public Integer getAltezza___lt() {
        return altezza___lt;
    }
    public void setAltezza___lt(Integer altezza___lt) {
        this.altezza___lt = altezza___lt;
    }

    public Integer getAltezza___lte() {
        return altezza___lte;
    }
    public void setAltezza___lte(Integer altezza___lte) {
        this.altezza___lte = altezza___lte;
    }

    public Integer getAltezza___gt() {
        return altezza___gt;
    }
    public void setAltezza___gt(Integer altezza___gt) {
        this.altezza___gt = altezza___gt;
    }

    public Integer getAltezza___gte() {
        return altezza___gte;
    }
    public void setAltezza___gte(Integer altezza___gte) {
        this.altezza___gte = altezza___gte;
    }

    public String getAltro_fattore_di_rischio___eq() {
        return altro_fattore_di_rischio___eq;
    }
    public void setAltro_fattore_di_rischio___eq(String altro_fattore_di_rischio___eq) {
        this.altro_fattore_di_rischio___eq = altro_fattore_di_rischio___eq;
    }

    public String getAltro_fattore_di_rischio___ne() {
        return altro_fattore_di_rischio___ne;
    }
    public void setAltro_fattore_di_rischio___ne(String altro_fattore_di_rischio___ne) {
        this.altro_fattore_di_rischio___ne = altro_fattore_di_rischio___ne;
    }

    public Boolean getAltro_fattore_di_rischio___null() {
        return altro_fattore_di_rischio___null;
    }
    public void setAltro_fattore_di_rischio___null(Boolean altro_fattore_di_rischio___null) {
        this.altro_fattore_di_rischio___null = altro_fattore_di_rischio___null;
    }

    public Boolean getAltro_fattore_di_rischio___not___null() {
        return altro_fattore_di_rischio___not___null;
    }
    public void setAltro_fattore_di_rischio___not___null(Boolean altro_fattore_di_rischio___not___null) {
        this.altro_fattore_di_rischio___not___null = altro_fattore_di_rischio___not___null;
    }

    public java.util.List<String> getAltro_fattore_di_rischio___in() {
        return altro_fattore_di_rischio___in;
    }
    public void setAltro_fattore_di_rischio___in(java.util.List<String> altro_fattore_di_rischio___in) {
        this.altro_fattore_di_rischio___in = altro_fattore_di_rischio___in;
    }

    public java.util.List<String> getAltro_fattore_di_rischio___not___in() {
        return altro_fattore_di_rischio___not___in;
    }
    public void setAltro_fattore_di_rischio___not___in(java.util.List<String> altro_fattore_di_rischio___not___in) {
        this.altro_fattore_di_rischio___not___in = altro_fattore_di_rischio___not___in;
    }

    public String getAltro_fattore_di_rischio___lt() {
        return altro_fattore_di_rischio___lt;
    }
    public void setAltro_fattore_di_rischio___lt(String altro_fattore_di_rischio___lt) {
        this.altro_fattore_di_rischio___lt = altro_fattore_di_rischio___lt;
    }

    public String getAltro_fattore_di_rischio___lte() {
        return altro_fattore_di_rischio___lte;
    }
    public void setAltro_fattore_di_rischio___lte(String altro_fattore_di_rischio___lte) {
        this.altro_fattore_di_rischio___lte = altro_fattore_di_rischio___lte;
    }

    public String getAltro_fattore_di_rischio___gt() {
        return altro_fattore_di_rischio___gt;
    }
    public void setAltro_fattore_di_rischio___gt(String altro_fattore_di_rischio___gt) {
        this.altro_fattore_di_rischio___gt = altro_fattore_di_rischio___gt;
    }

    public String getAltro_fattore_di_rischio___gte() {
        return altro_fattore_di_rischio___gte;
    }
    public void setAltro_fattore_di_rischio___gte(String altro_fattore_di_rischio___gte) {
        this.altro_fattore_di_rischio___gte = altro_fattore_di_rischio___gte;
    }

    public String getAltro_fattore_di_rischio___contains() {
        return altro_fattore_di_rischio___contains;
    }
    public void setAltro_fattore_di_rischio___contains(String altro_fattore_di_rischio___contains) {
        this.altro_fattore_di_rischio___contains = altro_fattore_di_rischio___contains;
    }

    public String getAltro_fattore_di_rischio___not___contains() {
        return altro_fattore_di_rischio___not___contains;
    }
    public void setAltro_fattore_di_rischio___not___contains(String altro_fattore_di_rischio___not___contains) {
        this.altro_fattore_di_rischio___not___contains = altro_fattore_di_rischio___not___contains;
    }

    public String getAltro_fattore_di_rischio___starts_with() {
        return altro_fattore_di_rischio___starts_with;
    }
    public void setAltro_fattore_di_rischio___starts_with(String altro_fattore_di_rischio___starts_with) {
        this.altro_fattore_di_rischio___starts_with = altro_fattore_di_rischio___starts_with;
    }

    public String getAltro_fattore_di_rischio___not___starts_with() {
        return altro_fattore_di_rischio___not___starts_with;
    }
    public void setAltro_fattore_di_rischio___not___starts_with(String altro_fattore_di_rischio___not___starts_with) {
        this.altro_fattore_di_rischio___not___starts_with = altro_fattore_di_rischio___not___starts_with;
    }

    public String getAltro_fattore_di_rischio___ends_with() {
        return altro_fattore_di_rischio___ends_with;
    }
    public void setAltro_fattore_di_rischio___ends_with(String altro_fattore_di_rischio___ends_with) {
        this.altro_fattore_di_rischio___ends_with = altro_fattore_di_rischio___ends_with;
    }

    public String getAltro_fattore_di_rischio___not___ends_with() {
        return altro_fattore_di_rischio___not___ends_with;
    }
    public void setAltro_fattore_di_rischio___not___ends_with(String altro_fattore_di_rischio___not___ends_with) {
        this.altro_fattore_di_rischio___not___ends_with = altro_fattore_di_rischio___not___ends_with;
    }

    public Integer getAnno_nascita___eq() {
        return anno_nascita___eq;
    }
    public void setAnno_nascita___eq(Integer anno_nascita___eq) {
        this.anno_nascita___eq = anno_nascita___eq;
    }

    public Integer getAnno_nascita___ne() {
        return anno_nascita___ne;
    }
    public void setAnno_nascita___ne(Integer anno_nascita___ne) {
        this.anno_nascita___ne = anno_nascita___ne;
    }

    public Boolean getAnno_nascita___null() {
        return anno_nascita___null;
    }
    public void setAnno_nascita___null(Boolean anno_nascita___null) {
        this.anno_nascita___null = anno_nascita___null;
    }

    public Boolean getAnno_nascita___not___null() {
        return anno_nascita___not___null;
    }
    public void setAnno_nascita___not___null(Boolean anno_nascita___not___null) {
        this.anno_nascita___not___null = anno_nascita___not___null;
    }

    public java.util.List<Integer> getAnno_nascita___in() {
        return anno_nascita___in;
    }
    public void setAnno_nascita___in(java.util.List<Integer> anno_nascita___in) {
        this.anno_nascita___in = anno_nascita___in;
    }

    public java.util.List<Integer> getAnno_nascita___not___in() {
        return anno_nascita___not___in;
    }
    public void setAnno_nascita___not___in(java.util.List<Integer> anno_nascita___not___in) {
        this.anno_nascita___not___in = anno_nascita___not___in;
    }

    public Integer getAnno_nascita___lt() {
        return anno_nascita___lt;
    }
    public void setAnno_nascita___lt(Integer anno_nascita___lt) {
        this.anno_nascita___lt = anno_nascita___lt;
    }

    public Integer getAnno_nascita___lte() {
        return anno_nascita___lte;
    }
    public void setAnno_nascita___lte(Integer anno_nascita___lte) {
        this.anno_nascita___lte = anno_nascita___lte;
    }

    public Integer getAnno_nascita___gt() {
        return anno_nascita___gt;
    }
    public void setAnno_nascita___gt(Integer anno_nascita___gt) {
        this.anno_nascita___gt = anno_nascita___gt;
    }

    public Integer getAnno_nascita___gte() {
        return anno_nascita___gte;
    }
    public void setAnno_nascita___gte(Integer anno_nascita___gte) {
        this.anno_nascita___gte = anno_nascita___gte;
    }

    public Boolean getChecks___eq() {
        return checks___eq;
    }
    public void setChecks___eq(Boolean checks___eq) {
        this.checks___eq = checks___eq;
    }

    public Boolean getChecks___ne() {
        return checks___ne;
    }
    public void setChecks___ne(Boolean checks___ne) {
        this.checks___ne = checks___ne;
    }

    public Boolean getChecks___null() {
        return checks___null;
    }
    public void setChecks___null(Boolean checks___null) {
        this.checks___null = checks___null;
    }

    public Boolean getChecks___not___null() {
        return checks___not___null;
    }
    public void setChecks___not___null(Boolean checks___not___null) {
        this.checks___not___null = checks___not___null;
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

    public String getCodice_interno___eq() {
        return codice_interno___eq;
    }
    public void setCodice_interno___eq(String codice_interno___eq) {
        this.codice_interno___eq = codice_interno___eq;
    }

    public String getCodice_interno___ne() {
        return codice_interno___ne;
    }
    public void setCodice_interno___ne(String codice_interno___ne) {
        this.codice_interno___ne = codice_interno___ne;
    }

    public Boolean getCodice_interno___null() {
        return codice_interno___null;
    }
    public void setCodice_interno___null(Boolean codice_interno___null) {
        this.codice_interno___null = codice_interno___null;
    }

    public Boolean getCodice_interno___not___null() {
        return codice_interno___not___null;
    }
    public void setCodice_interno___not___null(Boolean codice_interno___not___null) {
        this.codice_interno___not___null = codice_interno___not___null;
    }

    public java.util.List<String> getCodice_interno___in() {
        return codice_interno___in;
    }
    public void setCodice_interno___in(java.util.List<String> codice_interno___in) {
        this.codice_interno___in = codice_interno___in;
    }

    public java.util.List<String> getCodice_interno___not___in() {
        return codice_interno___not___in;
    }
    public void setCodice_interno___not___in(java.util.List<String> codice_interno___not___in) {
        this.codice_interno___not___in = codice_interno___not___in;
    }

    public String getCodice_interno___lt() {
        return codice_interno___lt;
    }
    public void setCodice_interno___lt(String codice_interno___lt) {
        this.codice_interno___lt = codice_interno___lt;
    }

    public String getCodice_interno___lte() {
        return codice_interno___lte;
    }
    public void setCodice_interno___lte(String codice_interno___lte) {
        this.codice_interno___lte = codice_interno___lte;
    }

    public String getCodice_interno___gt() {
        return codice_interno___gt;
    }
    public void setCodice_interno___gt(String codice_interno___gt) {
        this.codice_interno___gt = codice_interno___gt;
    }

    public String getCodice_interno___gte() {
        return codice_interno___gte;
    }
    public void setCodice_interno___gte(String codice_interno___gte) {
        this.codice_interno___gte = codice_interno___gte;
    }

    public String getCodice_interno___contains() {
        return codice_interno___contains;
    }
    public void setCodice_interno___contains(String codice_interno___contains) {
        this.codice_interno___contains = codice_interno___contains;
    }

    public String getCodice_interno___not___contains() {
        return codice_interno___not___contains;
    }
    public void setCodice_interno___not___contains(String codice_interno___not___contains) {
        this.codice_interno___not___contains = codice_interno___not___contains;
    }

    public String getCodice_interno___starts_with() {
        return codice_interno___starts_with;
    }
    public void setCodice_interno___starts_with(String codice_interno___starts_with) {
        this.codice_interno___starts_with = codice_interno___starts_with;
    }

    public String getCodice_interno___not___starts_with() {
        return codice_interno___not___starts_with;
    }
    public void setCodice_interno___not___starts_with(String codice_interno___not___starts_with) {
        this.codice_interno___not___starts_with = codice_interno___not___starts_with;
    }

    public String getCodice_interno___ends_with() {
        return codice_interno___ends_with;
    }
    public void setCodice_interno___ends_with(String codice_interno___ends_with) {
        this.codice_interno___ends_with = codice_interno___ends_with;
    }

    public String getCodice_interno___not___ends_with() {
        return codice_interno___not___ends_with;
    }
    public void setCodice_interno___not___ends_with(String codice_interno___not___ends_with) {
        this.codice_interno___not___ends_with = codice_interno___not___ends_with;
    }

    public String getCodice_nazionale___eq() {
        return codice_nazionale___eq;
    }
    public void setCodice_nazionale___eq(String codice_nazionale___eq) {
        this.codice_nazionale___eq = codice_nazionale___eq;
    }

    public String getCodice_nazionale___ne() {
        return codice_nazionale___ne;
    }
    public void setCodice_nazionale___ne(String codice_nazionale___ne) {
        this.codice_nazionale___ne = codice_nazionale___ne;
    }

    public Boolean getCodice_nazionale___null() {
        return codice_nazionale___null;
    }
    public void setCodice_nazionale___null(Boolean codice_nazionale___null) {
        this.codice_nazionale___null = codice_nazionale___null;
    }

    public Boolean getCodice_nazionale___not___null() {
        return codice_nazionale___not___null;
    }
    public void setCodice_nazionale___not___null(Boolean codice_nazionale___not___null) {
        this.codice_nazionale___not___null = codice_nazionale___not___null;
    }

    public java.util.List<String> getCodice_nazionale___in() {
        return codice_nazionale___in;
    }
    public void setCodice_nazionale___in(java.util.List<String> codice_nazionale___in) {
        this.codice_nazionale___in = codice_nazionale___in;
    }

    public java.util.List<String> getCodice_nazionale___not___in() {
        return codice_nazionale___not___in;
    }
    public void setCodice_nazionale___not___in(java.util.List<String> codice_nazionale___not___in) {
        this.codice_nazionale___not___in = codice_nazionale___not___in;
    }

    public String getCodice_nazionale___lt() {
        return codice_nazionale___lt;
    }
    public void setCodice_nazionale___lt(String codice_nazionale___lt) {
        this.codice_nazionale___lt = codice_nazionale___lt;
    }

    public String getCodice_nazionale___lte() {
        return codice_nazionale___lte;
    }
    public void setCodice_nazionale___lte(String codice_nazionale___lte) {
        this.codice_nazionale___lte = codice_nazionale___lte;
    }

    public String getCodice_nazionale___gt() {
        return codice_nazionale___gt;
    }
    public void setCodice_nazionale___gt(String codice_nazionale___gt) {
        this.codice_nazionale___gt = codice_nazionale___gt;
    }

    public String getCodice_nazionale___gte() {
        return codice_nazionale___gte;
    }
    public void setCodice_nazionale___gte(String codice_nazionale___gte) {
        this.codice_nazionale___gte = codice_nazionale___gte;
    }

    public String getCodice_nazionale___contains() {
        return codice_nazionale___contains;
    }
    public void setCodice_nazionale___contains(String codice_nazionale___contains) {
        this.codice_nazionale___contains = codice_nazionale___contains;
    }

    public String getCodice_nazionale___not___contains() {
        return codice_nazionale___not___contains;
    }
    public void setCodice_nazionale___not___contains(String codice_nazionale___not___contains) {
        this.codice_nazionale___not___contains = codice_nazionale___not___contains;
    }

    public String getCodice_nazionale___starts_with() {
        return codice_nazionale___starts_with;
    }
    public void setCodice_nazionale___starts_with(String codice_nazionale___starts_with) {
        this.codice_nazionale___starts_with = codice_nazionale___starts_with;
    }

    public String getCodice_nazionale___not___starts_with() {
        return codice_nazionale___not___starts_with;
    }
    public void setCodice_nazionale___not___starts_with(String codice_nazionale___not___starts_with) {
        this.codice_nazionale___not___starts_with = codice_nazionale___not___starts_with;
    }

    public String getCodice_nazionale___ends_with() {
        return codice_nazionale___ends_with;
    }
    public void setCodice_nazionale___ends_with(String codice_nazionale___ends_with) {
        this.codice_nazionale___ends_with = codice_nazionale___ends_with;
    }

    public String getCodice_nazionale___not___ends_with() {
        return codice_nazionale___not___ends_with;
    }
    public void setCodice_nazionale___not___ends_with(String codice_nazionale___not___ends_with) {
        this.codice_nazionale___not___ends_with = codice_nazionale___not___ends_with;
    }

    public String getCognome___eq() {
        return cognome___eq;
    }
    public void setCognome___eq(String cognome___eq) {
        this.cognome___eq = cognome___eq;
    }

    public String getCognome___ne() {
        return cognome___ne;
    }
    public void setCognome___ne(String cognome___ne) {
        this.cognome___ne = cognome___ne;
    }

    public Boolean getCognome___null() {
        return cognome___null;
    }
    public void setCognome___null(Boolean cognome___null) {
        this.cognome___null = cognome___null;
    }

    public Boolean getCognome___not___null() {
        return cognome___not___null;
    }
    public void setCognome___not___null(Boolean cognome___not___null) {
        this.cognome___not___null = cognome___not___null;
    }

    public java.util.List<String> getCognome___in() {
        return cognome___in;
    }
    public void setCognome___in(java.util.List<String> cognome___in) {
        this.cognome___in = cognome___in;
    }

    public java.util.List<String> getCognome___not___in() {
        return cognome___not___in;
    }
    public void setCognome___not___in(java.util.List<String> cognome___not___in) {
        this.cognome___not___in = cognome___not___in;
    }

    public String getCognome___lt() {
        return cognome___lt;
    }
    public void setCognome___lt(String cognome___lt) {
        this.cognome___lt = cognome___lt;
    }

    public String getCognome___lte() {
        return cognome___lte;
    }
    public void setCognome___lte(String cognome___lte) {
        this.cognome___lte = cognome___lte;
    }

    public String getCognome___gt() {
        return cognome___gt;
    }
    public void setCognome___gt(String cognome___gt) {
        this.cognome___gt = cognome___gt;
    }

    public String getCognome___gte() {
        return cognome___gte;
    }
    public void setCognome___gte(String cognome___gte) {
        this.cognome___gte = cognome___gte;
    }

    public String getCognome___contains() {
        return cognome___contains;
    }
    public void setCognome___contains(String cognome___contains) {
        this.cognome___contains = cognome___contains;
    }

    public String getCognome___not___contains() {
        return cognome___not___contains;
    }
    public void setCognome___not___contains(String cognome___not___contains) {
        this.cognome___not___contains = cognome___not___contains;
    }

    public String getCognome___starts_with() {
        return cognome___starts_with;
    }
    public void setCognome___starts_with(String cognome___starts_with) {
        this.cognome___starts_with = cognome___starts_with;
    }

    public String getCognome___not___starts_with() {
        return cognome___not___starts_with;
    }
    public void setCognome___not___starts_with(String cognome___not___starts_with) {
        this.cognome___not___starts_with = cognome___not___starts_with;
    }

    public String getCognome___ends_with() {
        return cognome___ends_with;
    }
    public void setCognome___ends_with(String cognome___ends_with) {
        this.cognome___ends_with = cognome___ends_with;
    }

    public String getCognome___not___ends_with() {
        return cognome___not___ends_with;
    }
    public void setCognome___not___ends_with(String cognome___not___ends_with) {
        this.cognome___not___ends_with = cognome___not___ends_with;
    }

    public String getComune_di_nascita___eq() {
        return comune_di_nascita___eq;
    }
    public void setComune_di_nascita___eq(String comune_di_nascita___eq) {
        this.comune_di_nascita___eq = comune_di_nascita___eq;
    }

    public String getComune_di_nascita___ne() {
        return comune_di_nascita___ne;
    }
    public void setComune_di_nascita___ne(String comune_di_nascita___ne) {
        this.comune_di_nascita___ne = comune_di_nascita___ne;
    }

    public Boolean getComune_di_nascita___null() {
        return comune_di_nascita___null;
    }
    public void setComune_di_nascita___null(Boolean comune_di_nascita___null) {
        this.comune_di_nascita___null = comune_di_nascita___null;
    }

    public Boolean getComune_di_nascita___not___null() {
        return comune_di_nascita___not___null;
    }
    public void setComune_di_nascita___not___null(Boolean comune_di_nascita___not___null) {
        this.comune_di_nascita___not___null = comune_di_nascita___not___null;
    }

    public java.util.List<String> getComune_di_nascita___in() {
        return comune_di_nascita___in;
    }
    public void setComune_di_nascita___in(java.util.List<String> comune_di_nascita___in) {
        this.comune_di_nascita___in = comune_di_nascita___in;
    }

    public java.util.List<String> getComune_di_nascita___not___in() {
        return comune_di_nascita___not___in;
    }
    public void setComune_di_nascita___not___in(java.util.List<String> comune_di_nascita___not___in) {
        this.comune_di_nascita___not___in = comune_di_nascita___not___in;
    }

    public String getComune_di_nascita___lt() {
        return comune_di_nascita___lt;
    }
    public void setComune_di_nascita___lt(String comune_di_nascita___lt) {
        this.comune_di_nascita___lt = comune_di_nascita___lt;
    }

    public String getComune_di_nascita___lte() {
        return comune_di_nascita___lte;
    }
    public void setComune_di_nascita___lte(String comune_di_nascita___lte) {
        this.comune_di_nascita___lte = comune_di_nascita___lte;
    }

    public String getComune_di_nascita___gt() {
        return comune_di_nascita___gt;
    }
    public void setComune_di_nascita___gt(String comune_di_nascita___gt) {
        this.comune_di_nascita___gt = comune_di_nascita___gt;
    }

    public String getComune_di_nascita___gte() {
        return comune_di_nascita___gte;
    }
    public void setComune_di_nascita___gte(String comune_di_nascita___gte) {
        this.comune_di_nascita___gte = comune_di_nascita___gte;
    }

    public String getComune_di_nascita___contains() {
        return comune_di_nascita___contains;
    }
    public void setComune_di_nascita___contains(String comune_di_nascita___contains) {
        this.comune_di_nascita___contains = comune_di_nascita___contains;
    }

    public String getComune_di_nascita___not___contains() {
        return comune_di_nascita___not___contains;
    }
    public void setComune_di_nascita___not___contains(String comune_di_nascita___not___contains) {
        this.comune_di_nascita___not___contains = comune_di_nascita___not___contains;
    }

    public String getComune_di_nascita___starts_with() {
        return comune_di_nascita___starts_with;
    }
    public void setComune_di_nascita___starts_with(String comune_di_nascita___starts_with) {
        this.comune_di_nascita___starts_with = comune_di_nascita___starts_with;
    }

    public String getComune_di_nascita___not___starts_with() {
        return comune_di_nascita___not___starts_with;
    }
    public void setComune_di_nascita___not___starts_with(String comune_di_nascita___not___starts_with) {
        this.comune_di_nascita___not___starts_with = comune_di_nascita___not___starts_with;
    }

    public String getComune_di_nascita___ends_with() {
        return comune_di_nascita___ends_with;
    }
    public void setComune_di_nascita___ends_with(String comune_di_nascita___ends_with) {
        this.comune_di_nascita___ends_with = comune_di_nascita___ends_with;
    }

    public String getComune_di_nascita___not___ends_with() {
        return comune_di_nascita___not___ends_with;
    }
    public void setComune_di_nascita___not___ends_with(String comune_di_nascita___not___ends_with) {
        this.comune_di_nascita___not___ends_with = comune_di_nascita___not___ends_with;
    }

    public String getData_consenso___eq() {
        return data_consenso___eq;
    }
    public void setData_consenso___eq(String data_consenso___eq) {
        this.data_consenso___eq = data_consenso___eq;
    }

    public String getData_consenso___ne() {
        return data_consenso___ne;
    }
    public void setData_consenso___ne(String data_consenso___ne) {
        this.data_consenso___ne = data_consenso___ne;
    }

    public Boolean getData_consenso___null() {
        return data_consenso___null;
    }
    public void setData_consenso___null(Boolean data_consenso___null) {
        this.data_consenso___null = data_consenso___null;
    }

    public Boolean getData_consenso___not___null() {
        return data_consenso___not___null;
    }
    public void setData_consenso___not___null(Boolean data_consenso___not___null) {
        this.data_consenso___not___null = data_consenso___not___null;
    }

    public java.util.List<String> getData_consenso___in() {
        return data_consenso___in;
    }
    public void setData_consenso___in(java.util.List<String> data_consenso___in) {
        this.data_consenso___in = data_consenso___in;
    }

    public java.util.List<String> getData_consenso___not___in() {
        return data_consenso___not___in;
    }
    public void setData_consenso___not___in(java.util.List<String> data_consenso___not___in) {
        this.data_consenso___not___in = data_consenso___not___in;
    }

    public String getData_consenso___lt() {
        return data_consenso___lt;
    }
    public void setData_consenso___lt(String data_consenso___lt) {
        this.data_consenso___lt = data_consenso___lt;
    }

    public String getData_consenso___lte() {
        return data_consenso___lte;
    }
    public void setData_consenso___lte(String data_consenso___lte) {
        this.data_consenso___lte = data_consenso___lte;
    }

    public String getData_consenso___gt() {
        return data_consenso___gt;
    }
    public void setData_consenso___gt(String data_consenso___gt) {
        this.data_consenso___gt = data_consenso___gt;
    }

    public String getData_consenso___gte() {
        return data_consenso___gte;
    }
    public void setData_consenso___gte(String data_consenso___gte) {
        this.data_consenso___gte = data_consenso___gte;
    }

    public String getData_consenso_pro___eq() {
        return data_consenso_pro___eq;
    }
    public void setData_consenso_pro___eq(String data_consenso_pro___eq) {
        this.data_consenso_pro___eq = data_consenso_pro___eq;
    }

    public String getData_consenso_pro___ne() {
        return data_consenso_pro___ne;
    }
    public void setData_consenso_pro___ne(String data_consenso_pro___ne) {
        this.data_consenso_pro___ne = data_consenso_pro___ne;
    }

    public Boolean getData_consenso_pro___null() {
        return data_consenso_pro___null;
    }
    public void setData_consenso_pro___null(Boolean data_consenso_pro___null) {
        this.data_consenso_pro___null = data_consenso_pro___null;
    }

    public Boolean getData_consenso_pro___not___null() {
        return data_consenso_pro___not___null;
    }
    public void setData_consenso_pro___not___null(Boolean data_consenso_pro___not___null) {
        this.data_consenso_pro___not___null = data_consenso_pro___not___null;
    }

    public java.util.List<String> getData_consenso_pro___in() {
        return data_consenso_pro___in;
    }
    public void setData_consenso_pro___in(java.util.List<String> data_consenso_pro___in) {
        this.data_consenso_pro___in = data_consenso_pro___in;
    }

    public java.util.List<String> getData_consenso_pro___not___in() {
        return data_consenso_pro___not___in;
    }
    public void setData_consenso_pro___not___in(java.util.List<String> data_consenso_pro___not___in) {
        this.data_consenso_pro___not___in = data_consenso_pro___not___in;
    }

    public String getData_consenso_pro___lt() {
        return data_consenso_pro___lt;
    }
    public void setData_consenso_pro___lt(String data_consenso_pro___lt) {
        this.data_consenso_pro___lt = data_consenso_pro___lt;
    }

    public String getData_consenso_pro___lte() {
        return data_consenso_pro___lte;
    }
    public void setData_consenso_pro___lte(String data_consenso_pro___lte) {
        this.data_consenso_pro___lte = data_consenso_pro___lte;
    }

    public String getData_consenso_pro___gt() {
        return data_consenso_pro___gt;
    }
    public void setData_consenso_pro___gt(String data_consenso_pro___gt) {
        this.data_consenso_pro___gt = data_consenso_pro___gt;
    }

    public String getData_consenso_pro___gte() {
        return data_consenso_pro___gte;
    }
    public void setData_consenso_pro___gte(String data_consenso_pro___gte) {
        this.data_consenso_pro___gte = data_consenso_pro___gte;
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

    public String getData_fine_terapia_ormonale___eq() {
        return data_fine_terapia_ormonale___eq;
    }
    public void setData_fine_terapia_ormonale___eq(String data_fine_terapia_ormonale___eq) {
        this.data_fine_terapia_ormonale___eq = data_fine_terapia_ormonale___eq;
    }

    public String getData_fine_terapia_ormonale___ne() {
        return data_fine_terapia_ormonale___ne;
    }
    public void setData_fine_terapia_ormonale___ne(String data_fine_terapia_ormonale___ne) {
        this.data_fine_terapia_ormonale___ne = data_fine_terapia_ormonale___ne;
    }

    public Boolean getData_fine_terapia_ormonale___null() {
        return data_fine_terapia_ormonale___null;
    }
    public void setData_fine_terapia_ormonale___null(Boolean data_fine_terapia_ormonale___null) {
        this.data_fine_terapia_ormonale___null = data_fine_terapia_ormonale___null;
    }

    public Boolean getData_fine_terapia_ormonale___not___null() {
        return data_fine_terapia_ormonale___not___null;
    }
    public void setData_fine_terapia_ormonale___not___null(Boolean data_fine_terapia_ormonale___not___null) {
        this.data_fine_terapia_ormonale___not___null = data_fine_terapia_ormonale___not___null;
    }

    public java.util.List<String> getData_fine_terapia_ormonale___in() {
        return data_fine_terapia_ormonale___in;
    }
    public void setData_fine_terapia_ormonale___in(java.util.List<String> data_fine_terapia_ormonale___in) {
        this.data_fine_terapia_ormonale___in = data_fine_terapia_ormonale___in;
    }

    public java.util.List<String> getData_fine_terapia_ormonale___not___in() {
        return data_fine_terapia_ormonale___not___in;
    }
    public void setData_fine_terapia_ormonale___not___in(java.util.List<String> data_fine_terapia_ormonale___not___in) {
        this.data_fine_terapia_ormonale___not___in = data_fine_terapia_ormonale___not___in;
    }

    public String getData_fine_terapia_ormonale___lt() {
        return data_fine_terapia_ormonale___lt;
    }
    public void setData_fine_terapia_ormonale___lt(String data_fine_terapia_ormonale___lt) {
        this.data_fine_terapia_ormonale___lt = data_fine_terapia_ormonale___lt;
    }

    public String getData_fine_terapia_ormonale___lte() {
        return data_fine_terapia_ormonale___lte;
    }
    public void setData_fine_terapia_ormonale___lte(String data_fine_terapia_ormonale___lte) {
        this.data_fine_terapia_ormonale___lte = data_fine_terapia_ormonale___lte;
    }

    public String getData_fine_terapia_ormonale___gt() {
        return data_fine_terapia_ormonale___gt;
    }
    public void setData_fine_terapia_ormonale___gt(String data_fine_terapia_ormonale___gt) {
        this.data_fine_terapia_ormonale___gt = data_fine_terapia_ormonale___gt;
    }

    public String getData_fine_terapia_ormonale___gte() {
        return data_fine_terapia_ormonale___gte;
    }
    public void setData_fine_terapia_ormonale___gte(String data_fine_terapia_ormonale___gte) {
        this.data_fine_terapia_ormonale___gte = data_fine_terapia_ormonale___gte;
    }

    public String getData_gilbert___eq() {
        return data_gilbert___eq;
    }
    public void setData_gilbert___eq(String data_gilbert___eq) {
        this.data_gilbert___eq = data_gilbert___eq;
    }

    public String getData_gilbert___ne() {
        return data_gilbert___ne;
    }
    public void setData_gilbert___ne(String data_gilbert___ne) {
        this.data_gilbert___ne = data_gilbert___ne;
    }

    public Boolean getData_gilbert___null() {
        return data_gilbert___null;
    }
    public void setData_gilbert___null(Boolean data_gilbert___null) {
        this.data_gilbert___null = data_gilbert___null;
    }

    public Boolean getData_gilbert___not___null() {
        return data_gilbert___not___null;
    }
    public void setData_gilbert___not___null(Boolean data_gilbert___not___null) {
        this.data_gilbert___not___null = data_gilbert___not___null;
    }

    public java.util.List<String> getData_gilbert___in() {
        return data_gilbert___in;
    }
    public void setData_gilbert___in(java.util.List<String> data_gilbert___in) {
        this.data_gilbert___in = data_gilbert___in;
    }

    public java.util.List<String> getData_gilbert___not___in() {
        return data_gilbert___not___in;
    }
    public void setData_gilbert___not___in(java.util.List<String> data_gilbert___not___in) {
        this.data_gilbert___not___in = data_gilbert___not___in;
    }

    public String getData_gilbert___lt() {
        return data_gilbert___lt;
    }
    public void setData_gilbert___lt(String data_gilbert___lt) {
        this.data_gilbert___lt = data_gilbert___lt;
    }

    public String getData_gilbert___lte() {
        return data_gilbert___lte;
    }
    public void setData_gilbert___lte(String data_gilbert___lte) {
        this.data_gilbert___lte = data_gilbert___lte;
    }

    public String getData_gilbert___gt() {
        return data_gilbert___gt;
    }
    public void setData_gilbert___gt(String data_gilbert___gt) {
        this.data_gilbert___gt = data_gilbert___gt;
    }

    public String getData_gilbert___gte() {
        return data_gilbert___gte;
    }
    public void setData_gilbert___gte(String data_gilbert___gte) {
        this.data_gilbert___gte = data_gilbert___gte;
    }

    public String getData_hla___eq() {
        return data_hla___eq;
    }
    public void setData_hla___eq(String data_hla___eq) {
        this.data_hla___eq = data_hla___eq;
    }

    public String getData_hla___ne() {
        return data_hla___ne;
    }
    public void setData_hla___ne(String data_hla___ne) {
        this.data_hla___ne = data_hla___ne;
    }

    public Boolean getData_hla___null() {
        return data_hla___null;
    }
    public void setData_hla___null(Boolean data_hla___null) {
        this.data_hla___null = data_hla___null;
    }

    public Boolean getData_hla___not___null() {
        return data_hla___not___null;
    }
    public void setData_hla___not___null(Boolean data_hla___not___null) {
        this.data_hla___not___null = data_hla___not___null;
    }

    public java.util.List<String> getData_hla___in() {
        return data_hla___in;
    }
    public void setData_hla___in(java.util.List<String> data_hla___in) {
        this.data_hla___in = data_hla___in;
    }

    public java.util.List<String> getData_hla___not___in() {
        return data_hla___not___in;
    }
    public void setData_hla___not___in(java.util.List<String> data_hla___not___in) {
        this.data_hla___not___in = data_hla___not___in;
    }

    public String getData_hla___lt() {
        return data_hla___lt;
    }
    public void setData_hla___lt(String data_hla___lt) {
        this.data_hla___lt = data_hla___lt;
    }

    public String getData_hla___lte() {
        return data_hla___lte;
    }
    public void setData_hla___lte(String data_hla___lte) {
        this.data_hla___lte = data_hla___lte;
    }

    public String getData_hla___gt() {
        return data_hla___gt;
    }
    public void setData_hla___gt(String data_hla___gt) {
        this.data_hla___gt = data_hla___gt;
    }

    public String getData_hla___gte() {
        return data_hla___gte;
    }
    public void setData_hla___gte(String data_hla___gte) {
        this.data_hla___gte = data_hla___gte;
    }

    public String getData_il28___eq() {
        return data_il28___eq;
    }
    public void setData_il28___eq(String data_il28___eq) {
        this.data_il28___eq = data_il28___eq;
    }

    public String getData_il28___ne() {
        return data_il28___ne;
    }
    public void setData_il28___ne(String data_il28___ne) {
        this.data_il28___ne = data_il28___ne;
    }

    public Boolean getData_il28___null() {
        return data_il28___null;
    }
    public void setData_il28___null(Boolean data_il28___null) {
        this.data_il28___null = data_il28___null;
    }

    public Boolean getData_il28___not___null() {
        return data_il28___not___null;
    }
    public void setData_il28___not___null(Boolean data_il28___not___null) {
        this.data_il28___not___null = data_il28___not___null;
    }

    public java.util.List<String> getData_il28___in() {
        return data_il28___in;
    }
    public void setData_il28___in(java.util.List<String> data_il28___in) {
        this.data_il28___in = data_il28___in;
    }

    public java.util.List<String> getData_il28___not___in() {
        return data_il28___not___in;
    }
    public void setData_il28___not___in(java.util.List<String> data_il28___not___in) {
        this.data_il28___not___in = data_il28___not___in;
    }

    public String getData_il28___lt() {
        return data_il28___lt;
    }
    public void setData_il28___lt(String data_il28___lt) {
        this.data_il28___lt = data_il28___lt;
    }

    public String getData_il28___lte() {
        return data_il28___lte;
    }
    public void setData_il28___lte(String data_il28___lte) {
        this.data_il28___lte = data_il28___lte;
    }

    public String getData_il28___gt() {
        return data_il28___gt;
    }
    public void setData_il28___gt(String data_il28___gt) {
        this.data_il28___gt = data_il28___gt;
    }

    public String getData_il28___gte() {
        return data_il28___gte;
    }
    public void setData_il28___gte(String data_il28___gte) {
        this.data_il28___gte = data_il28___gte;
    }

    public String getData_inizio_terapia_ormonale___eq() {
        return data_inizio_terapia_ormonale___eq;
    }
    public void setData_inizio_terapia_ormonale___eq(String data_inizio_terapia_ormonale___eq) {
        this.data_inizio_terapia_ormonale___eq = data_inizio_terapia_ormonale___eq;
    }

    public String getData_inizio_terapia_ormonale___ne() {
        return data_inizio_terapia_ormonale___ne;
    }
    public void setData_inizio_terapia_ormonale___ne(String data_inizio_terapia_ormonale___ne) {
        this.data_inizio_terapia_ormonale___ne = data_inizio_terapia_ormonale___ne;
    }

    public Boolean getData_inizio_terapia_ormonale___null() {
        return data_inizio_terapia_ormonale___null;
    }
    public void setData_inizio_terapia_ormonale___null(Boolean data_inizio_terapia_ormonale___null) {
        this.data_inizio_terapia_ormonale___null = data_inizio_terapia_ormonale___null;
    }

    public Boolean getData_inizio_terapia_ormonale___not___null() {
        return data_inizio_terapia_ormonale___not___null;
    }
    public void setData_inizio_terapia_ormonale___not___null(Boolean data_inizio_terapia_ormonale___not___null) {
        this.data_inizio_terapia_ormonale___not___null = data_inizio_terapia_ormonale___not___null;
    }

    public java.util.List<String> getData_inizio_terapia_ormonale___in() {
        return data_inizio_terapia_ormonale___in;
    }
    public void setData_inizio_terapia_ormonale___in(java.util.List<String> data_inizio_terapia_ormonale___in) {
        this.data_inizio_terapia_ormonale___in = data_inizio_terapia_ormonale___in;
    }

    public java.util.List<String> getData_inizio_terapia_ormonale___not___in() {
        return data_inizio_terapia_ormonale___not___in;
    }
    public void setData_inizio_terapia_ormonale___not___in(java.util.List<String> data_inizio_terapia_ormonale___not___in) {
        this.data_inizio_terapia_ormonale___not___in = data_inizio_terapia_ormonale___not___in;
    }

    public String getData_inizio_terapia_ormonale___lt() {
        return data_inizio_terapia_ormonale___lt;
    }
    public void setData_inizio_terapia_ormonale___lt(String data_inizio_terapia_ormonale___lt) {
        this.data_inizio_terapia_ormonale___lt = data_inizio_terapia_ormonale___lt;
    }

    public String getData_inizio_terapia_ormonale___lte() {
        return data_inizio_terapia_ormonale___lte;
    }
    public void setData_inizio_terapia_ormonale___lte(String data_inizio_terapia_ormonale___lte) {
        this.data_inizio_terapia_ormonale___lte = data_inizio_terapia_ormonale___lte;
    }

    public String getData_inizio_terapia_ormonale___gt() {
        return data_inizio_terapia_ormonale___gt;
    }
    public void setData_inizio_terapia_ormonale___gt(String data_inizio_terapia_ormonale___gt) {
        this.data_inizio_terapia_ormonale___gt = data_inizio_terapia_ormonale___gt;
    }

    public String getData_inizio_terapia_ormonale___gte() {
        return data_inizio_terapia_ormonale___gte;
    }
    public void setData_inizio_terapia_ormonale___gte(String data_inizio_terapia_ormonale___gte) {
        this.data_inizio_terapia_ormonale___gte = data_inizio_terapia_ormonale___gte;
    }

    public String getData_menopausa___eq() {
        return data_menopausa___eq;
    }
    public void setData_menopausa___eq(String data_menopausa___eq) {
        this.data_menopausa___eq = data_menopausa___eq;
    }

    public String getData_menopausa___ne() {
        return data_menopausa___ne;
    }
    public void setData_menopausa___ne(String data_menopausa___ne) {
        this.data_menopausa___ne = data_menopausa___ne;
    }

    public Boolean getData_menopausa___null() {
        return data_menopausa___null;
    }
    public void setData_menopausa___null(Boolean data_menopausa___null) {
        this.data_menopausa___null = data_menopausa___null;
    }

    public Boolean getData_menopausa___not___null() {
        return data_menopausa___not___null;
    }
    public void setData_menopausa___not___null(Boolean data_menopausa___not___null) {
        this.data_menopausa___not___null = data_menopausa___not___null;
    }

    public java.util.List<String> getData_menopausa___in() {
        return data_menopausa___in;
    }
    public void setData_menopausa___in(java.util.List<String> data_menopausa___in) {
        this.data_menopausa___in = data_menopausa___in;
    }

    public java.util.List<String> getData_menopausa___not___in() {
        return data_menopausa___not___in;
    }
    public void setData_menopausa___not___in(java.util.List<String> data_menopausa___not___in) {
        this.data_menopausa___not___in = data_menopausa___not___in;
    }

    public String getData_menopausa___lt() {
        return data_menopausa___lt;
    }
    public void setData_menopausa___lt(String data_menopausa___lt) {
        this.data_menopausa___lt = data_menopausa___lt;
    }

    public String getData_menopausa___lte() {
        return data_menopausa___lte;
    }
    public void setData_menopausa___lte(String data_menopausa___lte) {
        this.data_menopausa___lte = data_menopausa___lte;
    }

    public String getData_menopausa___gt() {
        return data_menopausa___gt;
    }
    public void setData_menopausa___gt(String data_menopausa___gt) {
        this.data_menopausa___gt = data_menopausa___gt;
    }

    public String getData_menopausa___gte() {
        return data_menopausa___gte;
    }
    public void setData_menopausa___gte(String data_menopausa___gte) {
        this.data_menopausa___gte = data_menopausa___gte;
    }

    public String getData_prima_terapia_anti_hcv___eq() {
        return data_prima_terapia_anti_hcv___eq;
    }
    public void setData_prima_terapia_anti_hcv___eq(String data_prima_terapia_anti_hcv___eq) {
        this.data_prima_terapia_anti_hcv___eq = data_prima_terapia_anti_hcv___eq;
    }

    public String getData_prima_terapia_anti_hcv___ne() {
        return data_prima_terapia_anti_hcv___ne;
    }
    public void setData_prima_terapia_anti_hcv___ne(String data_prima_terapia_anti_hcv___ne) {
        this.data_prima_terapia_anti_hcv___ne = data_prima_terapia_anti_hcv___ne;
    }

    public Boolean getData_prima_terapia_anti_hcv___null() {
        return data_prima_terapia_anti_hcv___null;
    }
    public void setData_prima_terapia_anti_hcv___null(Boolean data_prima_terapia_anti_hcv___null) {
        this.data_prima_terapia_anti_hcv___null = data_prima_terapia_anti_hcv___null;
    }

    public Boolean getData_prima_terapia_anti_hcv___not___null() {
        return data_prima_terapia_anti_hcv___not___null;
    }
    public void setData_prima_terapia_anti_hcv___not___null(Boolean data_prima_terapia_anti_hcv___not___null) {
        this.data_prima_terapia_anti_hcv___not___null = data_prima_terapia_anti_hcv___not___null;
    }

    public java.util.List<String> getData_prima_terapia_anti_hcv___in() {
        return data_prima_terapia_anti_hcv___in;
    }
    public void setData_prima_terapia_anti_hcv___in(java.util.List<String> data_prima_terapia_anti_hcv___in) {
        this.data_prima_terapia_anti_hcv___in = data_prima_terapia_anti_hcv___in;
    }

    public java.util.List<String> getData_prima_terapia_anti_hcv___not___in() {
        return data_prima_terapia_anti_hcv___not___in;
    }
    public void setData_prima_terapia_anti_hcv___not___in(java.util.List<String> data_prima_terapia_anti_hcv___not___in) {
        this.data_prima_terapia_anti_hcv___not___in = data_prima_terapia_anti_hcv___not___in;
    }

    public String getData_prima_terapia_anti_hcv___lt() {
        return data_prima_terapia_anti_hcv___lt;
    }
    public void setData_prima_terapia_anti_hcv___lt(String data_prima_terapia_anti_hcv___lt) {
        this.data_prima_terapia_anti_hcv___lt = data_prima_terapia_anti_hcv___lt;
    }

    public String getData_prima_terapia_anti_hcv___lte() {
        return data_prima_terapia_anti_hcv___lte;
    }
    public void setData_prima_terapia_anti_hcv___lte(String data_prima_terapia_anti_hcv___lte) {
        this.data_prima_terapia_anti_hcv___lte = data_prima_terapia_anti_hcv___lte;
    }

    public String getData_prima_terapia_anti_hcv___gt() {
        return data_prima_terapia_anti_hcv___gt;
    }
    public void setData_prima_terapia_anti_hcv___gt(String data_prima_terapia_anti_hcv___gt) {
        this.data_prima_terapia_anti_hcv___gt = data_prima_terapia_anti_hcv___gt;
    }

    public String getData_prima_terapia_anti_hcv___gte() {
        return data_prima_terapia_anti_hcv___gte;
    }
    public void setData_prima_terapia_anti_hcv___gte(String data_prima_terapia_anti_hcv___gte) {
        this.data_prima_terapia_anti_hcv___gte = data_prima_terapia_anti_hcv___gte;
    }

    public String getData_prima_visita___eq() {
        return data_prima_visita___eq;
    }
    public void setData_prima_visita___eq(String data_prima_visita___eq) {
        this.data_prima_visita___eq = data_prima_visita___eq;
    }

    public String getData_prima_visita___ne() {
        return data_prima_visita___ne;
    }
    public void setData_prima_visita___ne(String data_prima_visita___ne) {
        this.data_prima_visita___ne = data_prima_visita___ne;
    }

    public Boolean getData_prima_visita___null() {
        return data_prima_visita___null;
    }
    public void setData_prima_visita___null(Boolean data_prima_visita___null) {
        this.data_prima_visita___null = data_prima_visita___null;
    }

    public Boolean getData_prima_visita___not___null() {
        return data_prima_visita___not___null;
    }
    public void setData_prima_visita___not___null(Boolean data_prima_visita___not___null) {
        this.data_prima_visita___not___null = data_prima_visita___not___null;
    }

    public java.util.List<String> getData_prima_visita___in() {
        return data_prima_visita___in;
    }
    public void setData_prima_visita___in(java.util.List<String> data_prima_visita___in) {
        this.data_prima_visita___in = data_prima_visita___in;
    }

    public java.util.List<String> getData_prima_visita___not___in() {
        return data_prima_visita___not___in;
    }
    public void setData_prima_visita___not___in(java.util.List<String> data_prima_visita___not___in) {
        this.data_prima_visita___not___in = data_prima_visita___not___in;
    }

    public String getData_prima_visita___lt() {
        return data_prima_visita___lt;
    }
    public void setData_prima_visita___lt(String data_prima_visita___lt) {
        this.data_prima_visita___lt = data_prima_visita___lt;
    }

    public String getData_prima_visita___lte() {
        return data_prima_visita___lte;
    }
    public void setData_prima_visita___lte(String data_prima_visita___lte) {
        this.data_prima_visita___lte = data_prima_visita___lte;
    }

    public String getData_prima_visita___gt() {
        return data_prima_visita___gt;
    }
    public void setData_prima_visita___gt(String data_prima_visita___gt) {
        this.data_prima_visita___gt = data_prima_visita___gt;
    }

    public String getData_prima_visita___gte() {
        return data_prima_visita___gte;
    }
    public void setData_prima_visita___gte(String data_prima_visita___gte) {
        this.data_prima_visita___gte = data_prima_visita___gte;
    }

    public String getData_primo_hcvab_pos___eq() {
        return data_primo_hcvab_pos___eq;
    }
    public void setData_primo_hcvab_pos___eq(String data_primo_hcvab_pos___eq) {
        this.data_primo_hcvab_pos___eq = data_primo_hcvab_pos___eq;
    }

    public String getData_primo_hcvab_pos___ne() {
        return data_primo_hcvab_pos___ne;
    }
    public void setData_primo_hcvab_pos___ne(String data_primo_hcvab_pos___ne) {
        this.data_primo_hcvab_pos___ne = data_primo_hcvab_pos___ne;
    }

    public Boolean getData_primo_hcvab_pos___null() {
        return data_primo_hcvab_pos___null;
    }
    public void setData_primo_hcvab_pos___null(Boolean data_primo_hcvab_pos___null) {
        this.data_primo_hcvab_pos___null = data_primo_hcvab_pos___null;
    }

    public Boolean getData_primo_hcvab_pos___not___null() {
        return data_primo_hcvab_pos___not___null;
    }
    public void setData_primo_hcvab_pos___not___null(Boolean data_primo_hcvab_pos___not___null) {
        this.data_primo_hcvab_pos___not___null = data_primo_hcvab_pos___not___null;
    }

    public java.util.List<String> getData_primo_hcvab_pos___in() {
        return data_primo_hcvab_pos___in;
    }
    public void setData_primo_hcvab_pos___in(java.util.List<String> data_primo_hcvab_pos___in) {
        this.data_primo_hcvab_pos___in = data_primo_hcvab_pos___in;
    }

    public java.util.List<String> getData_primo_hcvab_pos___not___in() {
        return data_primo_hcvab_pos___not___in;
    }
    public void setData_primo_hcvab_pos___not___in(java.util.List<String> data_primo_hcvab_pos___not___in) {
        this.data_primo_hcvab_pos___not___in = data_primo_hcvab_pos___not___in;
    }

    public String getData_primo_hcvab_pos___lt() {
        return data_primo_hcvab_pos___lt;
    }
    public void setData_primo_hcvab_pos___lt(String data_primo_hcvab_pos___lt) {
        this.data_primo_hcvab_pos___lt = data_primo_hcvab_pos___lt;
    }

    public String getData_primo_hcvab_pos___lte() {
        return data_primo_hcvab_pos___lte;
    }
    public void setData_primo_hcvab_pos___lte(String data_primo_hcvab_pos___lte) {
        this.data_primo_hcvab_pos___lte = data_primo_hcvab_pos___lte;
    }

    public String getData_primo_hcvab_pos___gt() {
        return data_primo_hcvab_pos___gt;
    }
    public void setData_primo_hcvab_pos___gt(String data_primo_hcvab_pos___gt) {
        this.data_primo_hcvab_pos___gt = data_primo_hcvab_pos___gt;
    }

    public String getData_primo_hcvab_pos___gte() {
        return data_primo_hcvab_pos___gte;
    }
    public void setData_primo_hcvab_pos___gte(String data_primo_hcvab_pos___gte) {
        this.data_primo_hcvab_pos___gte = data_primo_hcvab_pos___gte;
    }

    public String getData_ultima_visita___eq() {
        return data_ultima_visita___eq;
    }
    public void setData_ultima_visita___eq(String data_ultima_visita___eq) {
        this.data_ultima_visita___eq = data_ultima_visita___eq;
    }

    public String getData_ultima_visita___ne() {
        return data_ultima_visita___ne;
    }
    public void setData_ultima_visita___ne(String data_ultima_visita___ne) {
        this.data_ultima_visita___ne = data_ultima_visita___ne;
    }

    public Boolean getData_ultima_visita___null() {
        return data_ultima_visita___null;
    }
    public void setData_ultima_visita___null(Boolean data_ultima_visita___null) {
        this.data_ultima_visita___null = data_ultima_visita___null;
    }

    public Boolean getData_ultima_visita___not___null() {
        return data_ultima_visita___not___null;
    }
    public void setData_ultima_visita___not___null(Boolean data_ultima_visita___not___null) {
        this.data_ultima_visita___not___null = data_ultima_visita___not___null;
    }

    public java.util.List<String> getData_ultima_visita___in() {
        return data_ultima_visita___in;
    }
    public void setData_ultima_visita___in(java.util.List<String> data_ultima_visita___in) {
        this.data_ultima_visita___in = data_ultima_visita___in;
    }

    public java.util.List<String> getData_ultima_visita___not___in() {
        return data_ultima_visita___not___in;
    }
    public void setData_ultima_visita___not___in(java.util.List<String> data_ultima_visita___not___in) {
        this.data_ultima_visita___not___in = data_ultima_visita___not___in;
    }

    public String getData_ultima_visita___lt() {
        return data_ultima_visita___lt;
    }
    public void setData_ultima_visita___lt(String data_ultima_visita___lt) {
        this.data_ultima_visita___lt = data_ultima_visita___lt;
    }

    public String getData_ultima_visita___lte() {
        return data_ultima_visita___lte;
    }
    public void setData_ultima_visita___lte(String data_ultima_visita___lte) {
        this.data_ultima_visita___lte = data_ultima_visita___lte;
    }

    public String getData_ultima_visita___gt() {
        return data_ultima_visita___gt;
    }
    public void setData_ultima_visita___gt(String data_ultima_visita___gt) {
        this.data_ultima_visita___gt = data_ultima_visita___gt;
    }

    public String getData_ultima_visita___gte() {
        return data_ultima_visita___gte;
    }
    public void setData_ultima_visita___gte(String data_ultima_visita___gte) {
        this.data_ultima_visita___gte = data_ultima_visita___gte;
    }

    public String getData_ultimo_HCVAb_pre_arr___eq() {
        return data_ultimo_HCVAb_pre_arr___eq;
    }
    public void setData_ultimo_HCVAb_pre_arr___eq(String data_ultimo_HCVAb_pre_arr___eq) {
        this.data_ultimo_HCVAb_pre_arr___eq = data_ultimo_HCVAb_pre_arr___eq;
    }

    public String getData_ultimo_HCVAb_pre_arr___ne() {
        return data_ultimo_HCVAb_pre_arr___ne;
    }
    public void setData_ultimo_HCVAb_pre_arr___ne(String data_ultimo_HCVAb_pre_arr___ne) {
        this.data_ultimo_HCVAb_pre_arr___ne = data_ultimo_HCVAb_pre_arr___ne;
    }

    public Boolean getData_ultimo_HCVAb_pre_arr___null() {
        return data_ultimo_HCVAb_pre_arr___null;
    }
    public void setData_ultimo_HCVAb_pre_arr___null(Boolean data_ultimo_HCVAb_pre_arr___null) {
        this.data_ultimo_HCVAb_pre_arr___null = data_ultimo_HCVAb_pre_arr___null;
    }

    public Boolean getData_ultimo_HCVAb_pre_arr___not___null() {
        return data_ultimo_HCVAb_pre_arr___not___null;
    }
    public void setData_ultimo_HCVAb_pre_arr___not___null(Boolean data_ultimo_HCVAb_pre_arr___not___null) {
        this.data_ultimo_HCVAb_pre_arr___not___null = data_ultimo_HCVAb_pre_arr___not___null;
    }

    public java.util.List<String> getData_ultimo_HCVAb_pre_arr___in() {
        return data_ultimo_HCVAb_pre_arr___in;
    }
    public void setData_ultimo_HCVAb_pre_arr___in(java.util.List<String> data_ultimo_HCVAb_pre_arr___in) {
        this.data_ultimo_HCVAb_pre_arr___in = data_ultimo_HCVAb_pre_arr___in;
    }

    public java.util.List<String> getData_ultimo_HCVAb_pre_arr___not___in() {
        return data_ultimo_HCVAb_pre_arr___not___in;
    }
    public void setData_ultimo_HCVAb_pre_arr___not___in(java.util.List<String> data_ultimo_HCVAb_pre_arr___not___in) {
        this.data_ultimo_HCVAb_pre_arr___not___in = data_ultimo_HCVAb_pre_arr___not___in;
    }

    public String getData_ultimo_HCVAb_pre_arr___lt() {
        return data_ultimo_HCVAb_pre_arr___lt;
    }
    public void setData_ultimo_HCVAb_pre_arr___lt(String data_ultimo_HCVAb_pre_arr___lt) {
        this.data_ultimo_HCVAb_pre_arr___lt = data_ultimo_HCVAb_pre_arr___lt;
    }

    public String getData_ultimo_HCVAb_pre_arr___lte() {
        return data_ultimo_HCVAb_pre_arr___lte;
    }
    public void setData_ultimo_HCVAb_pre_arr___lte(String data_ultimo_HCVAb_pre_arr___lte) {
        this.data_ultimo_HCVAb_pre_arr___lte = data_ultimo_HCVAb_pre_arr___lte;
    }

    public String getData_ultimo_HCVAb_pre_arr___gt() {
        return data_ultimo_HCVAb_pre_arr___gt;
    }
    public void setData_ultimo_HCVAb_pre_arr___gt(String data_ultimo_HCVAb_pre_arr___gt) {
        this.data_ultimo_HCVAb_pre_arr___gt = data_ultimo_HCVAb_pre_arr___gt;
    }

    public String getData_ultimo_HCVAb_pre_arr___gte() {
        return data_ultimo_HCVAb_pre_arr___gte;
    }
    public void setData_ultimo_HCVAb_pre_arr___gte(String data_ultimo_HCVAb_pre_arr___gte) {
        this.data_ultimo_HCVAb_pre_arr___gte = data_ultimo_HCVAb_pre_arr___gte;
    }

    public String getData_ultimo_HbsAg_pre_arr___eq() {
        return data_ultimo_HbsAg_pre_arr___eq;
    }
    public void setData_ultimo_HbsAg_pre_arr___eq(String data_ultimo_HbsAg_pre_arr___eq) {
        this.data_ultimo_HbsAg_pre_arr___eq = data_ultimo_HbsAg_pre_arr___eq;
    }

    public String getData_ultimo_HbsAg_pre_arr___ne() {
        return data_ultimo_HbsAg_pre_arr___ne;
    }
    public void setData_ultimo_HbsAg_pre_arr___ne(String data_ultimo_HbsAg_pre_arr___ne) {
        this.data_ultimo_HbsAg_pre_arr___ne = data_ultimo_HbsAg_pre_arr___ne;
    }

    public Boolean getData_ultimo_HbsAg_pre_arr___null() {
        return data_ultimo_HbsAg_pre_arr___null;
    }
    public void setData_ultimo_HbsAg_pre_arr___null(Boolean data_ultimo_HbsAg_pre_arr___null) {
        this.data_ultimo_HbsAg_pre_arr___null = data_ultimo_HbsAg_pre_arr___null;
    }

    public Boolean getData_ultimo_HbsAg_pre_arr___not___null() {
        return data_ultimo_HbsAg_pre_arr___not___null;
    }
    public void setData_ultimo_HbsAg_pre_arr___not___null(Boolean data_ultimo_HbsAg_pre_arr___not___null) {
        this.data_ultimo_HbsAg_pre_arr___not___null = data_ultimo_HbsAg_pre_arr___not___null;
    }

    public java.util.List<String> getData_ultimo_HbsAg_pre_arr___in() {
        return data_ultimo_HbsAg_pre_arr___in;
    }
    public void setData_ultimo_HbsAg_pre_arr___in(java.util.List<String> data_ultimo_HbsAg_pre_arr___in) {
        this.data_ultimo_HbsAg_pre_arr___in = data_ultimo_HbsAg_pre_arr___in;
    }

    public java.util.List<String> getData_ultimo_HbsAg_pre_arr___not___in() {
        return data_ultimo_HbsAg_pre_arr___not___in;
    }
    public void setData_ultimo_HbsAg_pre_arr___not___in(java.util.List<String> data_ultimo_HbsAg_pre_arr___not___in) {
        this.data_ultimo_HbsAg_pre_arr___not___in = data_ultimo_HbsAg_pre_arr___not___in;
    }

    public String getData_ultimo_HbsAg_pre_arr___lt() {
        return data_ultimo_HbsAg_pre_arr___lt;
    }
    public void setData_ultimo_HbsAg_pre_arr___lt(String data_ultimo_HbsAg_pre_arr___lt) {
        this.data_ultimo_HbsAg_pre_arr___lt = data_ultimo_HbsAg_pre_arr___lt;
    }

    public String getData_ultimo_HbsAg_pre_arr___lte() {
        return data_ultimo_HbsAg_pre_arr___lte;
    }
    public void setData_ultimo_HbsAg_pre_arr___lte(String data_ultimo_HbsAg_pre_arr___lte) {
        this.data_ultimo_HbsAg_pre_arr___lte = data_ultimo_HbsAg_pre_arr___lte;
    }

    public String getData_ultimo_HbsAg_pre_arr___gt() {
        return data_ultimo_HbsAg_pre_arr___gt;
    }
    public void setData_ultimo_HbsAg_pre_arr___gt(String data_ultimo_HbsAg_pre_arr___gt) {
        this.data_ultimo_HbsAg_pre_arr___gt = data_ultimo_HbsAg_pre_arr___gt;
    }

    public String getData_ultimo_HbsAg_pre_arr___gte() {
        return data_ultimo_HbsAg_pre_arr___gte;
    }
    public void setData_ultimo_HbsAg_pre_arr___gte(String data_ultimo_HbsAg_pre_arr___gte) {
        this.data_ultimo_HbsAg_pre_arr___gte = data_ultimo_HbsAg_pre_arr___gte;
    }

    public String getData_ultimo_drop___eq() {
        return data_ultimo_drop___eq;
    }
    public void setData_ultimo_drop___eq(String data_ultimo_drop___eq) {
        this.data_ultimo_drop___eq = data_ultimo_drop___eq;
    }

    public String getData_ultimo_drop___ne() {
        return data_ultimo_drop___ne;
    }
    public void setData_ultimo_drop___ne(String data_ultimo_drop___ne) {
        this.data_ultimo_drop___ne = data_ultimo_drop___ne;
    }

    public Boolean getData_ultimo_drop___null() {
        return data_ultimo_drop___null;
    }
    public void setData_ultimo_drop___null(Boolean data_ultimo_drop___null) {
        this.data_ultimo_drop___null = data_ultimo_drop___null;
    }

    public Boolean getData_ultimo_drop___not___null() {
        return data_ultimo_drop___not___null;
    }
    public void setData_ultimo_drop___not___null(Boolean data_ultimo_drop___not___null) {
        this.data_ultimo_drop___not___null = data_ultimo_drop___not___null;
    }

    public java.util.List<String> getData_ultimo_drop___in() {
        return data_ultimo_drop___in;
    }
    public void setData_ultimo_drop___in(java.util.List<String> data_ultimo_drop___in) {
        this.data_ultimo_drop___in = data_ultimo_drop___in;
    }

    public java.util.List<String> getData_ultimo_drop___not___in() {
        return data_ultimo_drop___not___in;
    }
    public void setData_ultimo_drop___not___in(java.util.List<String> data_ultimo_drop___not___in) {
        this.data_ultimo_drop___not___in = data_ultimo_drop___not___in;
    }

    public String getData_ultimo_drop___lt() {
        return data_ultimo_drop___lt;
    }
    public void setData_ultimo_drop___lt(String data_ultimo_drop___lt) {
        this.data_ultimo_drop___lt = data_ultimo_drop___lt;
    }

    public String getData_ultimo_drop___lte() {
        return data_ultimo_drop___lte;
    }
    public void setData_ultimo_drop___lte(String data_ultimo_drop___lte) {
        this.data_ultimo_drop___lte = data_ultimo_drop___lte;
    }

    public String getData_ultimo_drop___gt() {
        return data_ultimo_drop___gt;
    }
    public void setData_ultimo_drop___gt(String data_ultimo_drop___gt) {
        this.data_ultimo_drop___gt = data_ultimo_drop___gt;
    }

    public String getData_ultimo_drop___gte() {
        return data_ultimo_drop___gte;
    }
    public void setData_ultimo_drop___gte(String data_ultimo_drop___gte) {
        this.data_ultimo_drop___gte = data_ultimo_drop___gte;
    }

    public String getDate_longicona___eq() {
        return date_longicona___eq;
    }
    public void setDate_longicona___eq(String date_longicona___eq) {
        this.date_longicona___eq = date_longicona___eq;
    }

    public String getDate_longicona___ne() {
        return date_longicona___ne;
    }
    public void setDate_longicona___ne(String date_longicona___ne) {
        this.date_longicona___ne = date_longicona___ne;
    }

    public Boolean getDate_longicona___null() {
        return date_longicona___null;
    }
    public void setDate_longicona___null(Boolean date_longicona___null) {
        this.date_longicona___null = date_longicona___null;
    }

    public Boolean getDate_longicona___not___null() {
        return date_longicona___not___null;
    }
    public void setDate_longicona___not___null(Boolean date_longicona___not___null) {
        this.date_longicona___not___null = date_longicona___not___null;
    }

    public java.util.List<String> getDate_longicona___in() {
        return date_longicona___in;
    }
    public void setDate_longicona___in(java.util.List<String> date_longicona___in) {
        this.date_longicona___in = date_longicona___in;
    }

    public java.util.List<String> getDate_longicona___not___in() {
        return date_longicona___not___in;
    }
    public void setDate_longicona___not___in(java.util.List<String> date_longicona___not___in) {
        this.date_longicona___not___in = date_longicona___not___in;
    }

    public String getDate_longicona___lt() {
        return date_longicona___lt;
    }
    public void setDate_longicona___lt(String date_longicona___lt) {
        this.date_longicona___lt = date_longicona___lt;
    }

    public String getDate_longicona___lte() {
        return date_longicona___lte;
    }
    public void setDate_longicona___lte(String date_longicona___lte) {
        this.date_longicona___lte = date_longicona___lte;
    }

    public String getDate_longicona___gt() {
        return date_longicona___gt;
    }
    public void setDate_longicona___gt(String date_longicona___gt) {
        this.date_longicona___gt = date_longicona___gt;
    }

    public String getDate_longicona___gte() {
        return date_longicona___gte;
    }
    public void setDate_longicona___gte(String date_longicona___gte) {
        this.date_longicona___gte = date_longicona___gte;
    }

    public String getDate_longicona___contains() {
        return date_longicona___contains;
    }
    public void setDate_longicona___contains(String date_longicona___contains) {
        this.date_longicona___contains = date_longicona___contains;
    }

    public String getDate_longicona___not___contains() {
        return date_longicona___not___contains;
    }
    public void setDate_longicona___not___contains(String date_longicona___not___contains) {
        this.date_longicona___not___contains = date_longicona___not___contains;
    }

    public String getDate_longicona___starts_with() {
        return date_longicona___starts_with;
    }
    public void setDate_longicona___starts_with(String date_longicona___starts_with) {
        this.date_longicona___starts_with = date_longicona___starts_with;
    }

    public String getDate_longicona___not___starts_with() {
        return date_longicona___not___starts_with;
    }
    public void setDate_longicona___not___starts_with(String date_longicona___not___starts_with) {
        this.date_longicona___not___starts_with = date_longicona___not___starts_with;
    }

    public String getDate_longicona___ends_with() {
        return date_longicona___ends_with;
    }
    public void setDate_longicona___ends_with(String date_longicona___ends_with) {
        this.date_longicona___ends_with = date_longicona___ends_with;
    }

    public String getDate_longicona___not___ends_with() {
        return date_longicona___not___ends_with;
    }
    public void setDate_longicona___not___ends_with(String date_longicona___not___ends_with) {
        this.date_longicona___not___ends_with = date_longicona___not___ends_with;
    }

    public Boolean getDtg___eq() {
        return dtg___eq;
    }
    public void setDtg___eq(Boolean dtg___eq) {
        this.dtg___eq = dtg___eq;
    }

    public Boolean getDtg___ne() {
        return dtg___ne;
    }
    public void setDtg___ne(Boolean dtg___ne) {
        this.dtg___ne = dtg___ne;
    }

    public Boolean getDtg___null() {
        return dtg___null;
    }
    public void setDtg___null(Boolean dtg___null) {
        this.dtg___null = dtg___null;
    }

    public Boolean getDtg___not___null() {
        return dtg___not___null;
    }
    public void setDtg___not___null(Boolean dtg___not___null) {
        this.dtg___not___null = dtg___not___null;
    }

    public String getEsito_ultima_terapia___eq() {
        return esito_ultima_terapia___eq;
    }
    public void setEsito_ultima_terapia___eq(String esito_ultima_terapia___eq) {
        this.esito_ultima_terapia___eq = esito_ultima_terapia___eq;
    }

    public String getEsito_ultima_terapia___ne() {
        return esito_ultima_terapia___ne;
    }
    public void setEsito_ultima_terapia___ne(String esito_ultima_terapia___ne) {
        this.esito_ultima_terapia___ne = esito_ultima_terapia___ne;
    }

    public Boolean getEsito_ultima_terapia___null() {
        return esito_ultima_terapia___null;
    }
    public void setEsito_ultima_terapia___null(Boolean esito_ultima_terapia___null) {
        this.esito_ultima_terapia___null = esito_ultima_terapia___null;
    }

    public Boolean getEsito_ultima_terapia___not___null() {
        return esito_ultima_terapia___not___null;
    }
    public void setEsito_ultima_terapia___not___null(Boolean esito_ultima_terapia___not___null) {
        this.esito_ultima_terapia___not___null = esito_ultima_terapia___not___null;
    }

    public java.util.List<String> getEsito_ultima_terapia___in() {
        return esito_ultima_terapia___in;
    }
    public void setEsito_ultima_terapia___in(java.util.List<String> esito_ultima_terapia___in) {
        this.esito_ultima_terapia___in = esito_ultima_terapia___in;
    }

    public java.util.List<String> getEsito_ultima_terapia___not___in() {
        return esito_ultima_terapia___not___in;
    }
    public void setEsito_ultima_terapia___not___in(java.util.List<String> esito_ultima_terapia___not___in) {
        this.esito_ultima_terapia___not___in = esito_ultima_terapia___not___in;
    }

    public String getEsito_ultima_terapia___lt() {
        return esito_ultima_terapia___lt;
    }
    public void setEsito_ultima_terapia___lt(String esito_ultima_terapia___lt) {
        this.esito_ultima_terapia___lt = esito_ultima_terapia___lt;
    }

    public String getEsito_ultima_terapia___lte() {
        return esito_ultima_terapia___lte;
    }
    public void setEsito_ultima_terapia___lte(String esito_ultima_terapia___lte) {
        this.esito_ultima_terapia___lte = esito_ultima_terapia___lte;
    }

    public String getEsito_ultima_terapia___gt() {
        return esito_ultima_terapia___gt;
    }
    public void setEsito_ultima_terapia___gt(String esito_ultima_terapia___gt) {
        this.esito_ultima_terapia___gt = esito_ultima_terapia___gt;
    }

    public String getEsito_ultima_terapia___gte() {
        return esito_ultima_terapia___gte;
    }
    public void setEsito_ultima_terapia___gte(String esito_ultima_terapia___gte) {
        this.esito_ultima_terapia___gte = esito_ultima_terapia___gte;
    }

    public String getEsito_ultima_terapia___contains() {
        return esito_ultima_terapia___contains;
    }
    public void setEsito_ultima_terapia___contains(String esito_ultima_terapia___contains) {
        this.esito_ultima_terapia___contains = esito_ultima_terapia___contains;
    }

    public String getEsito_ultima_terapia___not___contains() {
        return esito_ultima_terapia___not___contains;
    }
    public void setEsito_ultima_terapia___not___contains(String esito_ultima_terapia___not___contains) {
        this.esito_ultima_terapia___not___contains = esito_ultima_terapia___not___contains;
    }

    public String getEsito_ultima_terapia___starts_with() {
        return esito_ultima_terapia___starts_with;
    }
    public void setEsito_ultima_terapia___starts_with(String esito_ultima_terapia___starts_with) {
        this.esito_ultima_terapia___starts_with = esito_ultima_terapia___starts_with;
    }

    public String getEsito_ultima_terapia___not___starts_with() {
        return esito_ultima_terapia___not___starts_with;
    }
    public void setEsito_ultima_terapia___not___starts_with(String esito_ultima_terapia___not___starts_with) {
        this.esito_ultima_terapia___not___starts_with = esito_ultima_terapia___not___starts_with;
    }

    public String getEsito_ultima_terapia___ends_with() {
        return esito_ultima_terapia___ends_with;
    }
    public void setEsito_ultima_terapia___ends_with(String esito_ultima_terapia___ends_with) {
        this.esito_ultima_terapia___ends_with = esito_ultima_terapia___ends_with;
    }

    public String getEsito_ultima_terapia___not___ends_with() {
        return esito_ultima_terapia___not___ends_with;
    }
    public void setEsito_ultima_terapia___not___ends_with(String esito_ultima_terapia___not___ends_with) {
        this.esito_ultima_terapia___not___ends_with = esito_ultima_terapia___not___ends_with;
    }

    public Integer getEta_arruolamento___eq() {
        return eta_arruolamento___eq;
    }
    public void setEta_arruolamento___eq(Integer eta_arruolamento___eq) {
        this.eta_arruolamento___eq = eta_arruolamento___eq;
    }

    public Integer getEta_arruolamento___ne() {
        return eta_arruolamento___ne;
    }
    public void setEta_arruolamento___ne(Integer eta_arruolamento___ne) {
        this.eta_arruolamento___ne = eta_arruolamento___ne;
    }

    public Boolean getEta_arruolamento___null() {
        return eta_arruolamento___null;
    }
    public void setEta_arruolamento___null(Boolean eta_arruolamento___null) {
        this.eta_arruolamento___null = eta_arruolamento___null;
    }

    public Boolean getEta_arruolamento___not___null() {
        return eta_arruolamento___not___null;
    }
    public void setEta_arruolamento___not___null(Boolean eta_arruolamento___not___null) {
        this.eta_arruolamento___not___null = eta_arruolamento___not___null;
    }

    public java.util.List<Integer> getEta_arruolamento___in() {
        return eta_arruolamento___in;
    }
    public void setEta_arruolamento___in(java.util.List<Integer> eta_arruolamento___in) {
        this.eta_arruolamento___in = eta_arruolamento___in;
    }

    public java.util.List<Integer> getEta_arruolamento___not___in() {
        return eta_arruolamento___not___in;
    }
    public void setEta_arruolamento___not___in(java.util.List<Integer> eta_arruolamento___not___in) {
        this.eta_arruolamento___not___in = eta_arruolamento___not___in;
    }

    public Integer getEta_arruolamento___lt() {
        return eta_arruolamento___lt;
    }
    public void setEta_arruolamento___lt(Integer eta_arruolamento___lt) {
        this.eta_arruolamento___lt = eta_arruolamento___lt;
    }

    public Integer getEta_arruolamento___lte() {
        return eta_arruolamento___lte;
    }
    public void setEta_arruolamento___lte(Integer eta_arruolamento___lte) {
        this.eta_arruolamento___lte = eta_arruolamento___lte;
    }

    public Integer getEta_arruolamento___gt() {
        return eta_arruolamento___gt;
    }
    public void setEta_arruolamento___gt(Integer eta_arruolamento___gt) {
        this.eta_arruolamento___gt = eta_arruolamento___gt;
    }

    public Integer getEta_arruolamento___gte() {
        return eta_arruolamento___gte;
    }
    public void setEta_arruolamento___gte(Integer eta_arruolamento___gte) {
        this.eta_arruolamento___gte = eta_arruolamento___gte;
    }

    public Integer getEta_prima_visita___eq() {
        return eta_prima_visita___eq;
    }
    public void setEta_prima_visita___eq(Integer eta_prima_visita___eq) {
        this.eta_prima_visita___eq = eta_prima_visita___eq;
    }

    public Integer getEta_prima_visita___ne() {
        return eta_prima_visita___ne;
    }
    public void setEta_prima_visita___ne(Integer eta_prima_visita___ne) {
        this.eta_prima_visita___ne = eta_prima_visita___ne;
    }

    public Boolean getEta_prima_visita___null() {
        return eta_prima_visita___null;
    }
    public void setEta_prima_visita___null(Boolean eta_prima_visita___null) {
        this.eta_prima_visita___null = eta_prima_visita___null;
    }

    public Boolean getEta_prima_visita___not___null() {
        return eta_prima_visita___not___null;
    }
    public void setEta_prima_visita___not___null(Boolean eta_prima_visita___not___null) {
        this.eta_prima_visita___not___null = eta_prima_visita___not___null;
    }

    public java.util.List<Integer> getEta_prima_visita___in() {
        return eta_prima_visita___in;
    }
    public void setEta_prima_visita___in(java.util.List<Integer> eta_prima_visita___in) {
        this.eta_prima_visita___in = eta_prima_visita___in;
    }

    public java.util.List<Integer> getEta_prima_visita___not___in() {
        return eta_prima_visita___not___in;
    }
    public void setEta_prima_visita___not___in(java.util.List<Integer> eta_prima_visita___not___in) {
        this.eta_prima_visita___not___in = eta_prima_visita___not___in;
    }

    public Integer getEta_prima_visita___lt() {
        return eta_prima_visita___lt;
    }
    public void setEta_prima_visita___lt(Integer eta_prima_visita___lt) {
        this.eta_prima_visita___lt = eta_prima_visita___lt;
    }

    public Integer getEta_prima_visita___lte() {
        return eta_prima_visita___lte;
    }
    public void setEta_prima_visita___lte(Integer eta_prima_visita___lte) {
        this.eta_prima_visita___lte = eta_prima_visita___lte;
    }

    public Integer getEta_prima_visita___gt() {
        return eta_prima_visita___gt;
    }
    public void setEta_prima_visita___gt(Integer eta_prima_visita___gt) {
        this.eta_prima_visita___gt = eta_prima_visita___gt;
    }

    public Integer getEta_prima_visita___gte() {
        return eta_prima_visita___gte;
    }
    public void setEta_prima_visita___gte(Integer eta_prima_visita___gte) {
        this.eta_prima_visita___gte = eta_prima_visita___gte;
    }

    public String getEtnia____eq() {
        return etnia____eq;
    }
    public void setEtnia____eq(String etnia____eq) {
        this.etnia____eq = etnia____eq;
    }

    public String getEtnia____ne() {
        return etnia____ne;
    }
    public void setEtnia____ne(String etnia____ne) {
        this.etnia____ne = etnia____ne;
    }

    public Boolean getEtnia____null() {
        return etnia____null;
    }
    public void setEtnia____null(Boolean etnia____null) {
        this.etnia____null = etnia____null;
    }

    public Boolean getEtnia____not___null() {
        return etnia____not___null;
    }
    public void setEtnia____not___null(Boolean etnia____not___null) {
        this.etnia____not___null = etnia____not___null;
    }

    public java.util.List<String> getEtnia____in() {
        return etnia____in;
    }
    public void setEtnia____in(java.util.List<String> etnia____in) {
        this.etnia____in = etnia____in;
    }

    public java.util.List<String> getEtnia____not___in() {
        return etnia____not___in;
    }
    public void setEtnia____not___in(java.util.List<String> etnia____not___in) {
        this.etnia____not___in = etnia____not___in;
    }

    public String getEtnia____lt() {
        return etnia____lt;
    }
    public void setEtnia____lt(String etnia____lt) {
        this.etnia____lt = etnia____lt;
    }

    public String getEtnia____lte() {
        return etnia____lte;
    }
    public void setEtnia____lte(String etnia____lte) {
        this.etnia____lte = etnia____lte;
    }

    public String getEtnia____gt() {
        return etnia____gt;
    }
    public void setEtnia____gt(String etnia____gt) {
        this.etnia____gt = etnia____gt;
    }

    public String getEtnia____gte() {
        return etnia____gte;
    }
    public void setEtnia____gte(String etnia____gte) {
        this.etnia____gte = etnia____gte;
    }

    public String getEtnia____contains() {
        return etnia____contains;
    }
    public void setEtnia____contains(String etnia____contains) {
        this.etnia____contains = etnia____contains;
    }

    public String getEtnia____not___contains() {
        return etnia____not___contains;
    }
    public void setEtnia____not___contains(String etnia____not___contains) {
        this.etnia____not___contains = etnia____not___contains;
    }

    public String getEtnia____starts_with() {
        return etnia____starts_with;
    }
    public void setEtnia____starts_with(String etnia____starts_with) {
        this.etnia____starts_with = etnia____starts_with;
    }

    public String getEtnia____not___starts_with() {
        return etnia____not___starts_with;
    }
    public void setEtnia____not___starts_with(String etnia____not___starts_with) {
        this.etnia____not___starts_with = etnia____not___starts_with;
    }

    public String getEtnia____ends_with() {
        return etnia____ends_with;
    }
    public void setEtnia____ends_with(String etnia____ends_with) {
        this.etnia____ends_with = etnia____ends_with;
    }

    public String getEtnia____not___ends_with() {
        return etnia____not___ends_with;
    }
    public void setEtnia____not___ends_with(String etnia____not___ends_with) {
        this.etnia____not___ends_with = etnia____not___ends_with;
    }

    public String getFattore_di_rischio____eq() {
        return fattore_di_rischio____eq;
    }
    public void setFattore_di_rischio____eq(String fattore_di_rischio____eq) {
        this.fattore_di_rischio____eq = fattore_di_rischio____eq;
    }

    public String getFattore_di_rischio____ne() {
        return fattore_di_rischio____ne;
    }
    public void setFattore_di_rischio____ne(String fattore_di_rischio____ne) {
        this.fattore_di_rischio____ne = fattore_di_rischio____ne;
    }

    public Boolean getFattore_di_rischio____null() {
        return fattore_di_rischio____null;
    }
    public void setFattore_di_rischio____null(Boolean fattore_di_rischio____null) {
        this.fattore_di_rischio____null = fattore_di_rischio____null;
    }

    public Boolean getFattore_di_rischio____not___null() {
        return fattore_di_rischio____not___null;
    }
    public void setFattore_di_rischio____not___null(Boolean fattore_di_rischio____not___null) {
        this.fattore_di_rischio____not___null = fattore_di_rischio____not___null;
    }

    public java.util.List<String> getFattore_di_rischio____in() {
        return fattore_di_rischio____in;
    }
    public void setFattore_di_rischio____in(java.util.List<String> fattore_di_rischio____in) {
        this.fattore_di_rischio____in = fattore_di_rischio____in;
    }

    public java.util.List<String> getFattore_di_rischio____not___in() {
        return fattore_di_rischio____not___in;
    }
    public void setFattore_di_rischio____not___in(java.util.List<String> fattore_di_rischio____not___in) {
        this.fattore_di_rischio____not___in = fattore_di_rischio____not___in;
    }

    public String getFattore_di_rischio____lt() {
        return fattore_di_rischio____lt;
    }
    public void setFattore_di_rischio____lt(String fattore_di_rischio____lt) {
        this.fattore_di_rischio____lt = fattore_di_rischio____lt;
    }

    public String getFattore_di_rischio____lte() {
        return fattore_di_rischio____lte;
    }
    public void setFattore_di_rischio____lte(String fattore_di_rischio____lte) {
        this.fattore_di_rischio____lte = fattore_di_rischio____lte;
    }

    public String getFattore_di_rischio____gt() {
        return fattore_di_rischio____gt;
    }
    public void setFattore_di_rischio____gt(String fattore_di_rischio____gt) {
        this.fattore_di_rischio____gt = fattore_di_rischio____gt;
    }

    public String getFattore_di_rischio____gte() {
        return fattore_di_rischio____gte;
    }
    public void setFattore_di_rischio____gte(String fattore_di_rischio____gte) {
        this.fattore_di_rischio____gte = fattore_di_rischio____gte;
    }

    public String getFattore_di_rischio____contains() {
        return fattore_di_rischio____contains;
    }
    public void setFattore_di_rischio____contains(String fattore_di_rischio____contains) {
        this.fattore_di_rischio____contains = fattore_di_rischio____contains;
    }

    public String getFattore_di_rischio____not___contains() {
        return fattore_di_rischio____not___contains;
    }
    public void setFattore_di_rischio____not___contains(String fattore_di_rischio____not___contains) {
        this.fattore_di_rischio____not___contains = fattore_di_rischio____not___contains;
    }

    public String getFattore_di_rischio____starts_with() {
        return fattore_di_rischio____starts_with;
    }
    public void setFattore_di_rischio____starts_with(String fattore_di_rischio____starts_with) {
        this.fattore_di_rischio____starts_with = fattore_di_rischio____starts_with;
    }

    public String getFattore_di_rischio____not___starts_with() {
        return fattore_di_rischio____not___starts_with;
    }
    public void setFattore_di_rischio____not___starts_with(String fattore_di_rischio____not___starts_with) {
        this.fattore_di_rischio____not___starts_with = fattore_di_rischio____not___starts_with;
    }

    public String getFattore_di_rischio____ends_with() {
        return fattore_di_rischio____ends_with;
    }
    public void setFattore_di_rischio____ends_with(String fattore_di_rischio____ends_with) {
        this.fattore_di_rischio____ends_with = fattore_di_rischio____ends_with;
    }

    public String getFattore_di_rischio____not___ends_with() {
        return fattore_di_rischio____not___ends_with;
    }
    public void setFattore_di_rischio____not___ends_with(String fattore_di_rischio____not___ends_with) {
        this.fattore_di_rischio____not___ends_with = fattore_di_rischio____not___ends_with;
    }

    public Boolean getFibroscan___eq() {
        return fibroscan___eq;
    }
    public void setFibroscan___eq(Boolean fibroscan___eq) {
        this.fibroscan___eq = fibroscan___eq;
    }

    public Boolean getFibroscan___ne() {
        return fibroscan___ne;
    }
    public void setFibroscan___ne(Boolean fibroscan___ne) {
        this.fibroscan___ne = fibroscan___ne;
    }

    public Boolean getFibroscan___null() {
        return fibroscan___null;
    }
    public void setFibroscan___null(Boolean fibroscan___null) {
        this.fibroscan___null = fibroscan___null;
    }

    public Boolean getFibroscan___not___null() {
        return fibroscan___not___null;
    }
    public void setFibroscan___not___null(Boolean fibroscan___not___null) {
        this.fibroscan___not___null = fibroscan___not___null;
    }

    public Boolean getHbsag_pos___eq() {
        return hbsag_pos___eq;
    }
    public void setHbsag_pos___eq(Boolean hbsag_pos___eq) {
        this.hbsag_pos___eq = hbsag_pos___eq;
    }

    public Boolean getHbsag_pos___ne() {
        return hbsag_pos___ne;
    }
    public void setHbsag_pos___ne(Boolean hbsag_pos___ne) {
        this.hbsag_pos___ne = hbsag_pos___ne;
    }

    public Boolean getHbsag_pos___null() {
        return hbsag_pos___null;
    }
    public void setHbsag_pos___null(Boolean hbsag_pos___null) {
        this.hbsag_pos___null = hbsag_pos___null;
    }

    public Boolean getHbsag_pos___not___null() {
        return hbsag_pos___not___null;
    }
    public void setHbsag_pos___not___null(Boolean hbsag_pos___not___null) {
        this.hbsag_pos___not___null = hbsag_pos___not___null;
    }

    public Boolean getHcvab_pos___eq() {
        return hcvab_pos___eq;
    }
    public void setHcvab_pos___eq(Boolean hcvab_pos___eq) {
        this.hcvab_pos___eq = hcvab_pos___eq;
    }

    public Boolean getHcvab_pos___ne() {
        return hcvab_pos___ne;
    }
    public void setHcvab_pos___ne(Boolean hcvab_pos___ne) {
        this.hcvab_pos___ne = hcvab_pos___ne;
    }

    public Boolean getHcvab_pos___null() {
        return hcvab_pos___null;
    }
    public void setHcvab_pos___null(Boolean hcvab_pos___null) {
        this.hcvab_pos___null = hcvab_pos___null;
    }

    public Boolean getHcvab_pos___not___null() {
        return hcvab_pos___not___null;
    }
    public void setHcvab_pos___not___null(Boolean hcvab_pos___not___null) {
        this.hcvab_pos___not___null = hcvab_pos___not___null;
    }

    public String getHla_b5701___eq() {
        return hla_b5701___eq;
    }
    public void setHla_b5701___eq(String hla_b5701___eq) {
        this.hla_b5701___eq = hla_b5701___eq;
    }

    public String getHla_b5701___ne() {
        return hla_b5701___ne;
    }
    public void setHla_b5701___ne(String hla_b5701___ne) {
        this.hla_b5701___ne = hla_b5701___ne;
    }

    public Boolean getHla_b5701___null() {
        return hla_b5701___null;
    }
    public void setHla_b5701___null(Boolean hla_b5701___null) {
        this.hla_b5701___null = hla_b5701___null;
    }

    public Boolean getHla_b5701___not___null() {
        return hla_b5701___not___null;
    }
    public void setHla_b5701___not___null(Boolean hla_b5701___not___null) {
        this.hla_b5701___not___null = hla_b5701___not___null;
    }

    public java.util.List<String> getHla_b5701___in() {
        return hla_b5701___in;
    }
    public void setHla_b5701___in(java.util.List<String> hla_b5701___in) {
        this.hla_b5701___in = hla_b5701___in;
    }

    public java.util.List<String> getHla_b5701___not___in() {
        return hla_b5701___not___in;
    }
    public void setHla_b5701___not___in(java.util.List<String> hla_b5701___not___in) {
        this.hla_b5701___not___in = hla_b5701___not___in;
    }

    public String getHla_b5701___lt() {
        return hla_b5701___lt;
    }
    public void setHla_b5701___lt(String hla_b5701___lt) {
        this.hla_b5701___lt = hla_b5701___lt;
    }

    public String getHla_b5701___lte() {
        return hla_b5701___lte;
    }
    public void setHla_b5701___lte(String hla_b5701___lte) {
        this.hla_b5701___lte = hla_b5701___lte;
    }

    public String getHla_b5701___gt() {
        return hla_b5701___gt;
    }
    public void setHla_b5701___gt(String hla_b5701___gt) {
        this.hla_b5701___gt = hla_b5701___gt;
    }

    public String getHla_b5701___gte() {
        return hla_b5701___gte;
    }
    public void setHla_b5701___gte(String hla_b5701___gte) {
        this.hla_b5701___gte = hla_b5701___gte;
    }

    public String getHla_b5701___contains() {
        return hla_b5701___contains;
    }
    public void setHla_b5701___contains(String hla_b5701___contains) {
        this.hla_b5701___contains = hla_b5701___contains;
    }

    public String getHla_b5701___not___contains() {
        return hla_b5701___not___contains;
    }
    public void setHla_b5701___not___contains(String hla_b5701___not___contains) {
        this.hla_b5701___not___contains = hla_b5701___not___contains;
    }

    public String getHla_b5701___starts_with() {
        return hla_b5701___starts_with;
    }
    public void setHla_b5701___starts_with(String hla_b5701___starts_with) {
        this.hla_b5701___starts_with = hla_b5701___starts_with;
    }

    public String getHla_b5701___not___starts_with() {
        return hla_b5701___not___starts_with;
    }
    public void setHla_b5701___not___starts_with(String hla_b5701___not___starts_with) {
        this.hla_b5701___not___starts_with = hla_b5701___not___starts_with;
    }

    public String getHla_b5701___ends_with() {
        return hla_b5701___ends_with;
    }
    public void setHla_b5701___ends_with(String hla_b5701___ends_with) {
        this.hla_b5701___ends_with = hla_b5701___ends_with;
    }

    public String getHla_b5701___not___ends_with() {
        return hla_b5701___not___ends_with;
    }
    public void setHla_b5701___not___ends_with(String hla_b5701___not___ends_with) {
        this.hla_b5701___not___ends_with = hla_b5701___not___ends_with;
    }

    public Boolean getHla_b5701_bool___eq() {
        return hla_b5701_bool___eq;
    }
    public void setHla_b5701_bool___eq(Boolean hla_b5701_bool___eq) {
        this.hla_b5701_bool___eq = hla_b5701_bool___eq;
    }

    public Boolean getHla_b5701_bool___ne() {
        return hla_b5701_bool___ne;
    }
    public void setHla_b5701_bool___ne(Boolean hla_b5701_bool___ne) {
        this.hla_b5701_bool___ne = hla_b5701_bool___ne;
    }

    public Boolean getHla_b5701_bool___null() {
        return hla_b5701_bool___null;
    }
    public void setHla_b5701_bool___null(Boolean hla_b5701_bool___null) {
        this.hla_b5701_bool___null = hla_b5701_bool___null;
    }

    public Boolean getHla_b5701_bool___not___null() {
        return hla_b5701_bool___not___null;
    }
    public void setHla_b5701_bool___not___null(Boolean hla_b5701_bool___not___null) {
        this.hla_b5701_bool___not___null = hla_b5701_bool___not___null;
    }

    public Integer getId_paziente___eq() {
        return id_paziente___eq;
    }
    public void setId_paziente___eq(Integer id_paziente___eq) {
        this.id_paziente___eq = id_paziente___eq;
    }

    public Integer getId_paziente___ne() {
        return id_paziente___ne;
    }
    public void setId_paziente___ne(Integer id_paziente___ne) {
        this.id_paziente___ne = id_paziente___ne;
    }

    public Boolean getId_paziente___null() {
        return id_paziente___null;
    }
    public void setId_paziente___null(Boolean id_paziente___null) {
        this.id_paziente___null = id_paziente___null;
    }

    public Boolean getId_paziente___not___null() {
        return id_paziente___not___null;
    }
    public void setId_paziente___not___null(Boolean id_paziente___not___null) {
        this.id_paziente___not___null = id_paziente___not___null;
    }

    public java.util.List<Integer> getId_paziente___in() {
        return id_paziente___in;
    }
    public void setId_paziente___in(java.util.List<Integer> id_paziente___in) {
        this.id_paziente___in = id_paziente___in;
    }

    public java.util.List<Integer> getId_paziente___not___in() {
        return id_paziente___not___in;
    }
    public void setId_paziente___not___in(java.util.List<Integer> id_paziente___not___in) {
        this.id_paziente___not___in = id_paziente___not___in;
    }

    public Integer getId_paziente___lt() {
        return id_paziente___lt;
    }
    public void setId_paziente___lt(Integer id_paziente___lt) {
        this.id_paziente___lt = id_paziente___lt;
    }

    public Integer getId_paziente___lte() {
        return id_paziente___lte;
    }
    public void setId_paziente___lte(Integer id_paziente___lte) {
        this.id_paziente___lte = id_paziente___lte;
    }

    public Integer getId_paziente___gt() {
        return id_paziente___gt;
    }
    public void setId_paziente___gt(Integer id_paziente___gt) {
        this.id_paziente___gt = id_paziente___gt;
    }

    public Integer getId_paziente___gte() {
        return id_paziente___gte;
    }
    public void setId_paziente___gte(Integer id_paziente___gte) {
        this.id_paziente___gte = id_paziente___gte;
    }

    public Boolean getIfn___eq() {
        return ifn___eq;
    }
    public void setIfn___eq(Boolean ifn___eq) {
        this.ifn___eq = ifn___eq;
    }

    public Boolean getIfn___ne() {
        return ifn___ne;
    }
    public void setIfn___ne(Boolean ifn___ne) {
        this.ifn___ne = ifn___ne;
    }

    public Boolean getIfn___null() {
        return ifn___null;
    }
    public void setIfn___null(Boolean ifn___null) {
        this.ifn___null = ifn___null;
    }

    public Boolean getIfn___not___null() {
        return ifn___not___null;
    }
    public void setIfn___not___null(Boolean ifn___not___null) {
        this.ifn___not___null = ifn___not___null;
    }

    public Integer getIn_italia_da_anni___eq() {
        return in_italia_da_anni___eq;
    }
    public void setIn_italia_da_anni___eq(Integer in_italia_da_anni___eq) {
        this.in_italia_da_anni___eq = in_italia_da_anni___eq;
    }

    public Integer getIn_italia_da_anni___ne() {
        return in_italia_da_anni___ne;
    }
    public void setIn_italia_da_anni___ne(Integer in_italia_da_anni___ne) {
        this.in_italia_da_anni___ne = in_italia_da_anni___ne;
    }

    public Boolean getIn_italia_da_anni___null() {
        return in_italia_da_anni___null;
    }
    public void setIn_italia_da_anni___null(Boolean in_italia_da_anni___null) {
        this.in_italia_da_anni___null = in_italia_da_anni___null;
    }

    public Boolean getIn_italia_da_anni___not___null() {
        return in_italia_da_anni___not___null;
    }
    public void setIn_italia_da_anni___not___null(Boolean in_italia_da_anni___not___null) {
        this.in_italia_da_anni___not___null = in_italia_da_anni___not___null;
    }

    public java.util.List<Integer> getIn_italia_da_anni___in() {
        return in_italia_da_anni___in;
    }
    public void setIn_italia_da_anni___in(java.util.List<Integer> in_italia_da_anni___in) {
        this.in_italia_da_anni___in = in_italia_da_anni___in;
    }

    public java.util.List<Integer> getIn_italia_da_anni___not___in() {
        return in_italia_da_anni___not___in;
    }
    public void setIn_italia_da_anni___not___in(java.util.List<Integer> in_italia_da_anni___not___in) {
        this.in_italia_da_anni___not___in = in_italia_da_anni___not___in;
    }

    public Integer getIn_italia_da_anni___lt() {
        return in_italia_da_anni___lt;
    }
    public void setIn_italia_da_anni___lt(Integer in_italia_da_anni___lt) {
        this.in_italia_da_anni___lt = in_italia_da_anni___lt;
    }

    public Integer getIn_italia_da_anni___lte() {
        return in_italia_da_anni___lte;
    }
    public void setIn_italia_da_anni___lte(Integer in_italia_da_anni___lte) {
        this.in_italia_da_anni___lte = in_italia_da_anni___lte;
    }

    public Integer getIn_italia_da_anni___gt() {
        return in_italia_da_anni___gt;
    }
    public void setIn_italia_da_anni___gt(Integer in_italia_da_anni___gt) {
        this.in_italia_da_anni___gt = in_italia_da_anni___gt;
    }

    public Integer getIn_italia_da_anni___gte() {
        return in_italia_da_anni___gte;
    }
    public void setIn_italia_da_anni___gte(Integer in_italia_da_anni___gte) {
        this.in_italia_da_anni___gte = in_italia_da_anni___gte;
    }

    public String getNascita___eq() {
        return nascita___eq;
    }
    public void setNascita___eq(String nascita___eq) {
        this.nascita___eq = nascita___eq;
    }

    public String getNascita___ne() {
        return nascita___ne;
    }
    public void setNascita___ne(String nascita___ne) {
        this.nascita___ne = nascita___ne;
    }

    public Boolean getNascita___null() {
        return nascita___null;
    }
    public void setNascita___null(Boolean nascita___null) {
        this.nascita___null = nascita___null;
    }

    public Boolean getNascita___not___null() {
        return nascita___not___null;
    }
    public void setNascita___not___null(Boolean nascita___not___null) {
        this.nascita___not___null = nascita___not___null;
    }

    public java.util.List<String> getNascita___in() {
        return nascita___in;
    }
    public void setNascita___in(java.util.List<String> nascita___in) {
        this.nascita___in = nascita___in;
    }

    public java.util.List<String> getNascita___not___in() {
        return nascita___not___in;
    }
    public void setNascita___not___in(java.util.List<String> nascita___not___in) {
        this.nascita___not___in = nascita___not___in;
    }

    public String getNascita___lt() {
        return nascita___lt;
    }
    public void setNascita___lt(String nascita___lt) {
        this.nascita___lt = nascita___lt;
    }

    public String getNascita___lte() {
        return nascita___lte;
    }
    public void setNascita___lte(String nascita___lte) {
        this.nascita___lte = nascita___lte;
    }

    public String getNascita___gt() {
        return nascita___gt;
    }
    public void setNascita___gt(String nascita___gt) {
        this.nascita___gt = nascita___gt;
    }

    public String getNascita___gte() {
        return nascita___gte;
    }
    public void setNascita___gte(String nascita___gte) {
        this.nascita___gte = nascita___gte;
    }

    public String getNazionalita____eq() {
        return nazionalita____eq;
    }
    public void setNazionalita____eq(String nazionalita____eq) {
        this.nazionalita____eq = nazionalita____eq;
    }

    public String getNazionalita____ne() {
        return nazionalita____ne;
    }
    public void setNazionalita____ne(String nazionalita____ne) {
        this.nazionalita____ne = nazionalita____ne;
    }

    public Boolean getNazionalita____null() {
        return nazionalita____null;
    }
    public void setNazionalita____null(Boolean nazionalita____null) {
        this.nazionalita____null = nazionalita____null;
    }

    public Boolean getNazionalita____not___null() {
        return nazionalita____not___null;
    }
    public void setNazionalita____not___null(Boolean nazionalita____not___null) {
        this.nazionalita____not___null = nazionalita____not___null;
    }

    public java.util.List<String> getNazionalita____in() {
        return nazionalita____in;
    }
    public void setNazionalita____in(java.util.List<String> nazionalita____in) {
        this.nazionalita____in = nazionalita____in;
    }

    public java.util.List<String> getNazionalita____not___in() {
        return nazionalita____not___in;
    }
    public void setNazionalita____not___in(java.util.List<String> nazionalita____not___in) {
        this.nazionalita____not___in = nazionalita____not___in;
    }

    public String getNazionalita____lt() {
        return nazionalita____lt;
    }
    public void setNazionalita____lt(String nazionalita____lt) {
        this.nazionalita____lt = nazionalita____lt;
    }

    public String getNazionalita____lte() {
        return nazionalita____lte;
    }
    public void setNazionalita____lte(String nazionalita____lte) {
        this.nazionalita____lte = nazionalita____lte;
    }

    public String getNazionalita____gt() {
        return nazionalita____gt;
    }
    public void setNazionalita____gt(String nazionalita____gt) {
        this.nazionalita____gt = nazionalita____gt;
    }

    public String getNazionalita____gte() {
        return nazionalita____gte;
    }
    public void setNazionalita____gte(String nazionalita____gte) {
        this.nazionalita____gte = nazionalita____gte;
    }

    public String getNazionalita____contains() {
        return nazionalita____contains;
    }
    public void setNazionalita____contains(String nazionalita____contains) {
        this.nazionalita____contains = nazionalita____contains;
    }

    public String getNazionalita____not___contains() {
        return nazionalita____not___contains;
    }
    public void setNazionalita____not___contains(String nazionalita____not___contains) {
        this.nazionalita____not___contains = nazionalita____not___contains;
    }

    public String getNazionalita____starts_with() {
        return nazionalita____starts_with;
    }
    public void setNazionalita____starts_with(String nazionalita____starts_with) {
        this.nazionalita____starts_with = nazionalita____starts_with;
    }

    public String getNazionalita____not___starts_with() {
        return nazionalita____not___starts_with;
    }
    public void setNazionalita____not___starts_with(String nazionalita____not___starts_with) {
        this.nazionalita____not___starts_with = nazionalita____not___starts_with;
    }

    public String getNazionalita____ends_with() {
        return nazionalita____ends_with;
    }
    public void setNazionalita____ends_with(String nazionalita____ends_with) {
        this.nazionalita____ends_with = nazionalita____ends_with;
    }

    public String getNazionalita____not___ends_with() {
        return nazionalita____not___ends_with;
    }
    public void setNazionalita____not___ends_with(String nazionalita____not___ends_with) {
        this.nazionalita____not___ends_with = nazionalita____not___ends_with;
    }

    public String getNazione___eq() {
        return nazione___eq;
    }
    public void setNazione___eq(String nazione___eq) {
        this.nazione___eq = nazione___eq;
    }

    public String getNazione___ne() {
        return nazione___ne;
    }
    public void setNazione___ne(String nazione___ne) {
        this.nazione___ne = nazione___ne;
    }

    public Boolean getNazione___null() {
        return nazione___null;
    }
    public void setNazione___null(Boolean nazione___null) {
        this.nazione___null = nazione___null;
    }

    public Boolean getNazione___not___null() {
        return nazione___not___null;
    }
    public void setNazione___not___null(Boolean nazione___not___null) {
        this.nazione___not___null = nazione___not___null;
    }

    public java.util.List<String> getNazione___in() {
        return nazione___in;
    }
    public void setNazione___in(java.util.List<String> nazione___in) {
        this.nazione___in = nazione___in;
    }

    public java.util.List<String> getNazione___not___in() {
        return nazione___not___in;
    }
    public void setNazione___not___in(java.util.List<String> nazione___not___in) {
        this.nazione___not___in = nazione___not___in;
    }

    public String getNazione___lt() {
        return nazione___lt;
    }
    public void setNazione___lt(String nazione___lt) {
        this.nazione___lt = nazione___lt;
    }

    public String getNazione___lte() {
        return nazione___lte;
    }
    public void setNazione___lte(String nazione___lte) {
        this.nazione___lte = nazione___lte;
    }

    public String getNazione___gt() {
        return nazione___gt;
    }
    public void setNazione___gt(String nazione___gt) {
        this.nazione___gt = nazione___gt;
    }

    public String getNazione___gte() {
        return nazione___gte;
    }
    public void setNazione___gte(String nazione___gte) {
        this.nazione___gte = nazione___gte;
    }

    public String getNazione___contains() {
        return nazione___contains;
    }
    public void setNazione___contains(String nazione___contains) {
        this.nazione___contains = nazione___contains;
    }

    public String getNazione___not___contains() {
        return nazione___not___contains;
    }
    public void setNazione___not___contains(String nazione___not___contains) {
        this.nazione___not___contains = nazione___not___contains;
    }

    public String getNazione___starts_with() {
        return nazione___starts_with;
    }
    public void setNazione___starts_with(String nazione___starts_with) {
        this.nazione___starts_with = nazione___starts_with;
    }

    public String getNazione___not___starts_with() {
        return nazione___not___starts_with;
    }
    public void setNazione___not___starts_with(String nazione___not___starts_with) {
        this.nazione___not___starts_with = nazione___not___starts_with;
    }

    public String getNazione___ends_with() {
        return nazione___ends_with;
    }
    public void setNazione___ends_with(String nazione___ends_with) {
        this.nazione___ends_with = nazione___ends_with;
    }

    public String getNazione___not___ends_with() {
        return nazione___not___ends_with;
    }
    public void setNazione___not___ends_with(String nazione___not___ends_with) {
        this.nazione___not___ends_with = nazione___not___ends_with;
    }

    public Boolean getNoco___eq() {
        return noco___eq;
    }
    public void setNoco___eq(Boolean noco___eq) {
        this.noco___eq = noco___eq;
    }

    public Boolean getNoco___ne() {
        return noco___ne;
    }
    public void setNoco___ne(Boolean noco___ne) {
        this.noco___ne = noco___ne;
    }

    public Boolean getNoco___null() {
        return noco___null;
    }
    public void setNoco___null(Boolean noco___null) {
        this.noco___null = noco___null;
    }

    public Boolean getNoco___not___null() {
        return noco___not___null;
    }
    public void setNoco___not___null(Boolean noco___not___null) {
        this.noco___not___null = noco___not___null;
    }

    public String getNome___eq() {
        return nome___eq;
    }
    public void setNome___eq(String nome___eq) {
        this.nome___eq = nome___eq;
    }

    public String getNome___ne() {
        return nome___ne;
    }
    public void setNome___ne(String nome___ne) {
        this.nome___ne = nome___ne;
    }

    public Boolean getNome___null() {
        return nome___null;
    }
    public void setNome___null(Boolean nome___null) {
        this.nome___null = nome___null;
    }

    public Boolean getNome___not___null() {
        return nome___not___null;
    }
    public void setNome___not___null(Boolean nome___not___null) {
        this.nome___not___null = nome___not___null;
    }

    public java.util.List<String> getNome___in() {
        return nome___in;
    }
    public void setNome___in(java.util.List<String> nome___in) {
        this.nome___in = nome___in;
    }

    public java.util.List<String> getNome___not___in() {
        return nome___not___in;
    }
    public void setNome___not___in(java.util.List<String> nome___not___in) {
        this.nome___not___in = nome___not___in;
    }

    public String getNome___lt() {
        return nome___lt;
    }
    public void setNome___lt(String nome___lt) {
        this.nome___lt = nome___lt;
    }

    public String getNome___lte() {
        return nome___lte;
    }
    public void setNome___lte(String nome___lte) {
        this.nome___lte = nome___lte;
    }

    public String getNome___gt() {
        return nome___gt;
    }
    public void setNome___gt(String nome___gt) {
        this.nome___gt = nome___gt;
    }

    public String getNome___gte() {
        return nome___gte;
    }
    public void setNome___gte(String nome___gte) {
        this.nome___gte = nome___gte;
    }

    public String getNome___contains() {
        return nome___contains;
    }
    public void setNome___contains(String nome___contains) {
        this.nome___contains = nome___contains;
    }

    public String getNome___not___contains() {
        return nome___not___contains;
    }
    public void setNome___not___contains(String nome___not___contains) {
        this.nome___not___contains = nome___not___contains;
    }

    public String getNome___starts_with() {
        return nome___starts_with;
    }
    public void setNome___starts_with(String nome___starts_with) {
        this.nome___starts_with = nome___starts_with;
    }

    public String getNome___not___starts_with() {
        return nome___not___starts_with;
    }
    public void setNome___not___starts_with(String nome___not___starts_with) {
        this.nome___not___starts_with = nome___not___starts_with;
    }

    public String getNome___ends_with() {
        return nome___ends_with;
    }
    public void setNome___ends_with(String nome___ends_with) {
        this.nome___ends_with = nome___ends_with;
    }

    public String getNome___not___ends_with() {
        return nome___not___ends_with;
    }
    public void setNome___not___ends_with(String nome___not___ends_with) {
        this.nome___not___ends_with = nome___not___ends_with;
    }

    public String getNote_terapia___eq() {
        return note_terapia___eq;
    }
    public void setNote_terapia___eq(String note_terapia___eq) {
        this.note_terapia___eq = note_terapia___eq;
    }

    public String getNote_terapia___ne() {
        return note_terapia___ne;
    }
    public void setNote_terapia___ne(String note_terapia___ne) {
        this.note_terapia___ne = note_terapia___ne;
    }

    public Boolean getNote_terapia___null() {
        return note_terapia___null;
    }
    public void setNote_terapia___null(Boolean note_terapia___null) {
        this.note_terapia___null = note_terapia___null;
    }

    public Boolean getNote_terapia___not___null() {
        return note_terapia___not___null;
    }
    public void setNote_terapia___not___null(Boolean note_terapia___not___null) {
        this.note_terapia___not___null = note_terapia___not___null;
    }

    public java.util.List<String> getNote_terapia___in() {
        return note_terapia___in;
    }
    public void setNote_terapia___in(java.util.List<String> note_terapia___in) {
        this.note_terapia___in = note_terapia___in;
    }

    public java.util.List<String> getNote_terapia___not___in() {
        return note_terapia___not___in;
    }
    public void setNote_terapia___not___in(java.util.List<String> note_terapia___not___in) {
        this.note_terapia___not___in = note_terapia___not___in;
    }

    public String getNote_terapia___lt() {
        return note_terapia___lt;
    }
    public void setNote_terapia___lt(String note_terapia___lt) {
        this.note_terapia___lt = note_terapia___lt;
    }

    public String getNote_terapia___lte() {
        return note_terapia___lte;
    }
    public void setNote_terapia___lte(String note_terapia___lte) {
        this.note_terapia___lte = note_terapia___lte;
    }

    public String getNote_terapia___gt() {
        return note_terapia___gt;
    }
    public void setNote_terapia___gt(String note_terapia___gt) {
        this.note_terapia___gt = note_terapia___gt;
    }

    public String getNote_terapia___gte() {
        return note_terapia___gte;
    }
    public void setNote_terapia___gte(String note_terapia___gte) {
        this.note_terapia___gte = note_terapia___gte;
    }

    public String getNote_terapia___contains() {
        return note_terapia___contains;
    }
    public void setNote_terapia___contains(String note_terapia___contains) {
        this.note_terapia___contains = note_terapia___contains;
    }

    public String getNote_terapia___not___contains() {
        return note_terapia___not___contains;
    }
    public void setNote_terapia___not___contains(String note_terapia___not___contains) {
        this.note_terapia___not___contains = note_terapia___not___contains;
    }

    public String getNote_terapia___starts_with() {
        return note_terapia___starts_with;
    }
    public void setNote_terapia___starts_with(String note_terapia___starts_with) {
        this.note_terapia___starts_with = note_terapia___starts_with;
    }

    public String getNote_terapia___not___starts_with() {
        return note_terapia___not___starts_with;
    }
    public void setNote_terapia___not___starts_with(String note_terapia___not___starts_with) {
        this.note_terapia___not___starts_with = note_terapia___not___starts_with;
    }

    public String getNote_terapia___ends_with() {
        return note_terapia___ends_with;
    }
    public void setNote_terapia___ends_with(String note_terapia___ends_with) {
        this.note_terapia___ends_with = note_terapia___ends_with;
    }

    public String getNote_terapia___not___ends_with() {
        return note_terapia___not___ends_with;
    }
    public void setNote_terapia___not___ends_with(String note_terapia___not___ends_with) {
        this.note_terapia___not___ends_with = note_terapia___not___ends_with;
    }

    public Boolean getNull_val___eq() {
        return null_val___eq;
    }
    public void setNull_val___eq(Boolean null_val___eq) {
        this.null_val___eq = null_val___eq;
    }

    public Boolean getNull_val___ne() {
        return null_val___ne;
    }
    public void setNull_val___ne(Boolean null_val___ne) {
        this.null_val___ne = null_val___ne;
    }

    public Boolean getNull_val___null() {
        return null_val___null;
    }
    public void setNull_val___null(Boolean null_val___null) {
        this.null_val___null = null_val___null;
    }

    public Boolean getNull_val___not___null() {
        return null_val___not___null;
    }
    public void setNull_val___not___null(Boolean null_val___not___null) {
        this.null_val___not___null = null_val___not___null;
    }

    public String getPassword_pro___eq() {
        return password_pro___eq;
    }
    public void setPassword_pro___eq(String password_pro___eq) {
        this.password_pro___eq = password_pro___eq;
    }

    public String getPassword_pro___ne() {
        return password_pro___ne;
    }
    public void setPassword_pro___ne(String password_pro___ne) {
        this.password_pro___ne = password_pro___ne;
    }

    public Boolean getPassword_pro___null() {
        return password_pro___null;
    }
    public void setPassword_pro___null(Boolean password_pro___null) {
        this.password_pro___null = password_pro___null;
    }

    public Boolean getPassword_pro___not___null() {
        return password_pro___not___null;
    }
    public void setPassword_pro___not___null(Boolean password_pro___not___null) {
        this.password_pro___not___null = password_pro___not___null;
    }

    public java.util.List<String> getPassword_pro___in() {
        return password_pro___in;
    }
    public void setPassword_pro___in(java.util.List<String> password_pro___in) {
        this.password_pro___in = password_pro___in;
    }

    public java.util.List<String> getPassword_pro___not___in() {
        return password_pro___not___in;
    }
    public void setPassword_pro___not___in(java.util.List<String> password_pro___not___in) {
        this.password_pro___not___in = password_pro___not___in;
    }

    public String getPassword_pro___lt() {
        return password_pro___lt;
    }
    public void setPassword_pro___lt(String password_pro___lt) {
        this.password_pro___lt = password_pro___lt;
    }

    public String getPassword_pro___lte() {
        return password_pro___lte;
    }
    public void setPassword_pro___lte(String password_pro___lte) {
        this.password_pro___lte = password_pro___lte;
    }

    public String getPassword_pro___gt() {
        return password_pro___gt;
    }
    public void setPassword_pro___gt(String password_pro___gt) {
        this.password_pro___gt = password_pro___gt;
    }

    public String getPassword_pro___gte() {
        return password_pro___gte;
    }
    public void setPassword_pro___gte(String password_pro___gte) {
        this.password_pro___gte = password_pro___gte;
    }

    public String getPassword_pro___contains() {
        return password_pro___contains;
    }
    public void setPassword_pro___contains(String password_pro___contains) {
        this.password_pro___contains = password_pro___contains;
    }

    public String getPassword_pro___not___contains() {
        return password_pro___not___contains;
    }
    public void setPassword_pro___not___contains(String password_pro___not___contains) {
        this.password_pro___not___contains = password_pro___not___contains;
    }

    public String getPassword_pro___starts_with() {
        return password_pro___starts_with;
    }
    public void setPassword_pro___starts_with(String password_pro___starts_with) {
        this.password_pro___starts_with = password_pro___starts_with;
    }

    public String getPassword_pro___not___starts_with() {
        return password_pro___not___starts_with;
    }
    public void setPassword_pro___not___starts_with(String password_pro___not___starts_with) {
        this.password_pro___not___starts_with = password_pro___not___starts_with;
    }

    public String getPassword_pro___ends_with() {
        return password_pro___ends_with;
    }
    public void setPassword_pro___ends_with(String password_pro___ends_with) {
        this.password_pro___ends_with = password_pro___ends_with;
    }

    public String getPassword_pro___not___ends_with() {
        return password_pro___not___ends_with;
    }
    public void setPassword_pro___not___ends_with(String password_pro___not___ends_with) {
        this.password_pro___not___ends_with = password_pro___not___ends_with;
    }

    public Boolean getPegifn___eq() {
        return pegifn___eq;
    }
    public void setPegifn___eq(Boolean pegifn___eq) {
        this.pegifn___eq = pegifn___eq;
    }

    public Boolean getPegifn___ne() {
        return pegifn___ne;
    }
    public void setPegifn___ne(Boolean pegifn___ne) {
        this.pegifn___ne = pegifn___ne;
    }

    public Boolean getPegifn___null() {
        return pegifn___null;
    }
    public void setPegifn___null(Boolean pegifn___null) {
        this.pegifn___null = pegifn___null;
    }

    public Boolean getPegifn___not___null() {
        return pegifn___not___null;
    }
    public void setPegifn___not___null(Boolean pegifn___not___null) {
        this.pegifn___not___null = pegifn___not___null;
    }

    public Boolean getPregresse_terapie_anti_hcv___eq() {
        return pregresse_terapie_anti_hcv___eq;
    }
    public void setPregresse_terapie_anti_hcv___eq(Boolean pregresse_terapie_anti_hcv___eq) {
        this.pregresse_terapie_anti_hcv___eq = pregresse_terapie_anti_hcv___eq;
    }

    public Boolean getPregresse_terapie_anti_hcv___ne() {
        return pregresse_terapie_anti_hcv___ne;
    }
    public void setPregresse_terapie_anti_hcv___ne(Boolean pregresse_terapie_anti_hcv___ne) {
        this.pregresse_terapie_anti_hcv___ne = pregresse_terapie_anti_hcv___ne;
    }

    public Boolean getPregresse_terapie_anti_hcv___null() {
        return pregresse_terapie_anti_hcv___null;
    }
    public void setPregresse_terapie_anti_hcv___null(Boolean pregresse_terapie_anti_hcv___null) {
        this.pregresse_terapie_anti_hcv___null = pregresse_terapie_anti_hcv___null;
    }

    public Boolean getPregresse_terapie_anti_hcv___not___null() {
        return pregresse_terapie_anti_hcv___not___null;
    }
    public void setPregresse_terapie_anti_hcv___not___null(Boolean pregresse_terapie_anti_hcv___not___null) {
        this.pregresse_terapie_anti_hcv___not___null = pregresse_terapie_anti_hcv___not___null;
    }

    public Boolean getPro___eq() {
        return pro___eq;
    }
    public void setPro___eq(Boolean pro___eq) {
        this.pro___eq = pro___eq;
    }

    public Boolean getPro___ne() {
        return pro___ne;
    }
    public void setPro___ne(Boolean pro___ne) {
        this.pro___ne = pro___ne;
    }

    public Boolean getPro___null() {
        return pro___null;
    }
    public void setPro___null(Boolean pro___null) {
        this.pro___null = pro___null;
    }

    public Boolean getPro___not___null() {
        return pro___not___null;
    }
    public void setPro___not___null(Boolean pro___not___null) {
        this.pro___not___null = pro___not___null;
    }

    public Boolean getRibavirina___eq() {
        return ribavirina___eq;
    }
    public void setRibavirina___eq(Boolean ribavirina___eq) {
        this.ribavirina___eq = ribavirina___eq;
    }

    public Boolean getRibavirina___ne() {
        return ribavirina___ne;
    }
    public void setRibavirina___ne(Boolean ribavirina___ne) {
        this.ribavirina___ne = ribavirina___ne;
    }

    public Boolean getRibavirina___null() {
        return ribavirina___null;
    }
    public void setRibavirina___null(Boolean ribavirina___null) {
        this.ribavirina___null = ribavirina___null;
    }

    public Boolean getRibavirina___not___null() {
        return ribavirina___not___null;
    }
    public void setRibavirina___not___null(Boolean ribavirina___not___null) {
        this.ribavirina___not___null = ribavirina___not___null;
    }

    public Boolean getRisk_F___eq() {
        return risk_F___eq;
    }
    public void setRisk_F___eq(Boolean risk_F___eq) {
        this.risk_F___eq = risk_F___eq;
    }

    public Boolean getRisk_F___ne() {
        return risk_F___ne;
    }
    public void setRisk_F___ne(Boolean risk_F___ne) {
        this.risk_F___ne = risk_F___ne;
    }

    public Boolean getRisk_F___null() {
        return risk_F___null;
    }
    public void setRisk_F___null(Boolean risk_F___null) {
        this.risk_F___null = risk_F___null;
    }

    public Boolean getRisk_F___not___null() {
        return risk_F___not___null;
    }
    public void setRisk_F___not___null(Boolean risk_F___not___null) {
        this.risk_F___not___null = risk_F___not___null;
    }

    public String getSessione_pro___eq() {
        return sessione_pro___eq;
    }
    public void setSessione_pro___eq(String sessione_pro___eq) {
        this.sessione_pro___eq = sessione_pro___eq;
    }

    public String getSessione_pro___ne() {
        return sessione_pro___ne;
    }
    public void setSessione_pro___ne(String sessione_pro___ne) {
        this.sessione_pro___ne = sessione_pro___ne;
    }

    public Boolean getSessione_pro___null() {
        return sessione_pro___null;
    }
    public void setSessione_pro___null(Boolean sessione_pro___null) {
        this.sessione_pro___null = sessione_pro___null;
    }

    public Boolean getSessione_pro___not___null() {
        return sessione_pro___not___null;
    }
    public void setSessione_pro___not___null(Boolean sessione_pro___not___null) {
        this.sessione_pro___not___null = sessione_pro___not___null;
    }

    public java.util.List<String> getSessione_pro___in() {
        return sessione_pro___in;
    }
    public void setSessione_pro___in(java.util.List<String> sessione_pro___in) {
        this.sessione_pro___in = sessione_pro___in;
    }

    public java.util.List<String> getSessione_pro___not___in() {
        return sessione_pro___not___in;
    }
    public void setSessione_pro___not___in(java.util.List<String> sessione_pro___not___in) {
        this.sessione_pro___not___in = sessione_pro___not___in;
    }

    public String getSessione_pro___lt() {
        return sessione_pro___lt;
    }
    public void setSessione_pro___lt(String sessione_pro___lt) {
        this.sessione_pro___lt = sessione_pro___lt;
    }

    public String getSessione_pro___lte() {
        return sessione_pro___lte;
    }
    public void setSessione_pro___lte(String sessione_pro___lte) {
        this.sessione_pro___lte = sessione_pro___lte;
    }

    public String getSessione_pro___gt() {
        return sessione_pro___gt;
    }
    public void setSessione_pro___gt(String sessione_pro___gt) {
        this.sessione_pro___gt = sessione_pro___gt;
    }

    public String getSessione_pro___gte() {
        return sessione_pro___gte;
    }
    public void setSessione_pro___gte(String sessione_pro___gte) {
        this.sessione_pro___gte = sessione_pro___gte;
    }

    public String getSessione_pro___contains() {
        return sessione_pro___contains;
    }
    public void setSessione_pro___contains(String sessione_pro___contains) {
        this.sessione_pro___contains = sessione_pro___contains;
    }

    public String getSessione_pro___not___contains() {
        return sessione_pro___not___contains;
    }
    public void setSessione_pro___not___contains(String sessione_pro___not___contains) {
        this.sessione_pro___not___contains = sessione_pro___not___contains;
    }

    public String getSessione_pro___starts_with() {
        return sessione_pro___starts_with;
    }
    public void setSessione_pro___starts_with(String sessione_pro___starts_with) {
        this.sessione_pro___starts_with = sessione_pro___starts_with;
    }

    public String getSessione_pro___not___starts_with() {
        return sessione_pro___not___starts_with;
    }
    public void setSessione_pro___not___starts_with(String sessione_pro___not___starts_with) {
        this.sessione_pro___not___starts_with = sessione_pro___not___starts_with;
    }

    public String getSessione_pro___ends_with() {
        return sessione_pro___ends_with;
    }
    public void setSessione_pro___ends_with(String sessione_pro___ends_with) {
        this.sessione_pro___ends_with = sessione_pro___ends_with;
    }

    public String getSessione_pro___not___ends_with() {
        return sessione_pro___not___ends_with;
    }
    public void setSessione_pro___not___ends_with(String sessione_pro___not___ends_with) {
        this.sessione_pro___not___ends_with = sessione_pro___not___ends_with;
    }

    public String getSesso___eq() {
        return sesso___eq;
    }
    public void setSesso___eq(String sesso___eq) {
        this.sesso___eq = sesso___eq;
    }

    public String getSesso___ne() {
        return sesso___ne;
    }
    public void setSesso___ne(String sesso___ne) {
        this.sesso___ne = sesso___ne;
    }

    public Boolean getSesso___null() {
        return sesso___null;
    }
    public void setSesso___null(Boolean sesso___null) {
        this.sesso___null = sesso___null;
    }

    public Boolean getSesso___not___null() {
        return sesso___not___null;
    }
    public void setSesso___not___null(Boolean sesso___not___null) {
        this.sesso___not___null = sesso___not___null;
    }

    public java.util.List<String> getSesso___in() {
        return sesso___in;
    }
    public void setSesso___in(java.util.List<String> sesso___in) {
        this.sesso___in = sesso___in;
    }

    public java.util.List<String> getSesso___not___in() {
        return sesso___not___in;
    }
    public void setSesso___not___in(java.util.List<String> sesso___not___in) {
        this.sesso___not___in = sesso___not___in;
    }

    public String getSesso___lt() {
        return sesso___lt;
    }
    public void setSesso___lt(String sesso___lt) {
        this.sesso___lt = sesso___lt;
    }

    public String getSesso___lte() {
        return sesso___lte;
    }
    public void setSesso___lte(String sesso___lte) {
        this.sesso___lte = sesso___lte;
    }

    public String getSesso___gt() {
        return sesso___gt;
    }
    public void setSesso___gt(String sesso___gt) {
        this.sesso___gt = sesso___gt;
    }

    public String getSesso___gte() {
        return sesso___gte;
    }
    public void setSesso___gte(String sesso___gte) {
        this.sesso___gte = sesso___gte;
    }

    public String getSesso___contains() {
        return sesso___contains;
    }
    public void setSesso___contains(String sesso___contains) {
        this.sesso___contains = sesso___contains;
    }

    public String getSesso___not___contains() {
        return sesso___not___contains;
    }
    public void setSesso___not___contains(String sesso___not___contains) {
        this.sesso___not___contains = sesso___not___contains;
    }

    public String getSesso___starts_with() {
        return sesso___starts_with;
    }
    public void setSesso___starts_with(String sesso___starts_with) {
        this.sesso___starts_with = sesso___starts_with;
    }

    public String getSesso___not___starts_with() {
        return sesso___not___starts_with;
    }
    public void setSesso___not___starts_with(String sesso___not___starts_with) {
        this.sesso___not___starts_with = sesso___not___starts_with;
    }

    public String getSesso___ends_with() {
        return sesso___ends_with;
    }
    public void setSesso___ends_with(String sesso___ends_with) {
        this.sesso___ends_with = sesso___ends_with;
    }

    public String getSesso___not___ends_with() {
        return sesso___not___ends_with;
    }
    public void setSesso___not___ends_with(String sesso___not___ends_with) {
        this.sesso___not___ends_with = sesso___not___ends_with;
    }

    public Boolean getStribild___eq() {
        return stribild___eq;
    }
    public void setStribild___eq(Boolean stribild___eq) {
        this.stribild___eq = stribild___eq;
    }

    public Boolean getStribild___ne() {
        return stribild___ne;
    }
    public void setStribild___ne(Boolean stribild___ne) {
        this.stribild___ne = stribild___ne;
    }

    public Boolean getStribild___null() {
        return stribild___null;
    }
    public void setStribild___null(Boolean stribild___null) {
        this.stribild___null = stribild___null;
    }

    public Boolean getStribild___not___null() {
        return stribild___not___null;
    }
    public void setStribild___not___null(Boolean stribild___not___null) {
        this.stribild___not___null = stribild___not___null;
    }

    public String getStudi_pro_abilitati___eq() {
        return studi_pro_abilitati___eq;
    }
    public void setStudi_pro_abilitati___eq(String studi_pro_abilitati___eq) {
        this.studi_pro_abilitati___eq = studi_pro_abilitati___eq;
    }

    public String getStudi_pro_abilitati___ne() {
        return studi_pro_abilitati___ne;
    }
    public void setStudi_pro_abilitati___ne(String studi_pro_abilitati___ne) {
        this.studi_pro_abilitati___ne = studi_pro_abilitati___ne;
    }

    public Boolean getStudi_pro_abilitati___null() {
        return studi_pro_abilitati___null;
    }
    public void setStudi_pro_abilitati___null(Boolean studi_pro_abilitati___null) {
        this.studi_pro_abilitati___null = studi_pro_abilitati___null;
    }

    public Boolean getStudi_pro_abilitati___not___null() {
        return studi_pro_abilitati___not___null;
    }
    public void setStudi_pro_abilitati___not___null(Boolean studi_pro_abilitati___not___null) {
        this.studi_pro_abilitati___not___null = studi_pro_abilitati___not___null;
    }

    public java.util.List<String> getStudi_pro_abilitati___in() {
        return studi_pro_abilitati___in;
    }
    public void setStudi_pro_abilitati___in(java.util.List<String> studi_pro_abilitati___in) {
        this.studi_pro_abilitati___in = studi_pro_abilitati___in;
    }

    public java.util.List<String> getStudi_pro_abilitati___not___in() {
        return studi_pro_abilitati___not___in;
    }
    public void setStudi_pro_abilitati___not___in(java.util.List<String> studi_pro_abilitati___not___in) {
        this.studi_pro_abilitati___not___in = studi_pro_abilitati___not___in;
    }

    public String getStudi_pro_abilitati___lt() {
        return studi_pro_abilitati___lt;
    }
    public void setStudi_pro_abilitati___lt(String studi_pro_abilitati___lt) {
        this.studi_pro_abilitati___lt = studi_pro_abilitati___lt;
    }

    public String getStudi_pro_abilitati___lte() {
        return studi_pro_abilitati___lte;
    }
    public void setStudi_pro_abilitati___lte(String studi_pro_abilitati___lte) {
        this.studi_pro_abilitati___lte = studi_pro_abilitati___lte;
    }

    public String getStudi_pro_abilitati___gt() {
        return studi_pro_abilitati___gt;
    }
    public void setStudi_pro_abilitati___gt(String studi_pro_abilitati___gt) {
        this.studi_pro_abilitati___gt = studi_pro_abilitati___gt;
    }

    public String getStudi_pro_abilitati___gte() {
        return studi_pro_abilitati___gte;
    }
    public void setStudi_pro_abilitati___gte(String studi_pro_abilitati___gte) {
        this.studi_pro_abilitati___gte = studi_pro_abilitati___gte;
    }

    public String getStudi_pro_abilitati___contains() {
        return studi_pro_abilitati___contains;
    }
    public void setStudi_pro_abilitati___contains(String studi_pro_abilitati___contains) {
        this.studi_pro_abilitati___contains = studi_pro_abilitati___contains;
    }

    public String getStudi_pro_abilitati___not___contains() {
        return studi_pro_abilitati___not___contains;
    }
    public void setStudi_pro_abilitati___not___contains(String studi_pro_abilitati___not___contains) {
        this.studi_pro_abilitati___not___contains = studi_pro_abilitati___not___contains;
    }

    public String getStudi_pro_abilitati___starts_with() {
        return studi_pro_abilitati___starts_with;
    }
    public void setStudi_pro_abilitati___starts_with(String studi_pro_abilitati___starts_with) {
        this.studi_pro_abilitati___starts_with = studi_pro_abilitati___starts_with;
    }

    public String getStudi_pro_abilitati___not___starts_with() {
        return studi_pro_abilitati___not___starts_with;
    }
    public void setStudi_pro_abilitati___not___starts_with(String studi_pro_abilitati___not___starts_with) {
        this.studi_pro_abilitati___not___starts_with = studi_pro_abilitati___not___starts_with;
    }

    public String getStudi_pro_abilitati___ends_with() {
        return studi_pro_abilitati___ends_with;
    }
    public void setStudi_pro_abilitati___ends_with(String studi_pro_abilitati___ends_with) {
        this.studi_pro_abilitati___ends_with = studi_pro_abilitati___ends_with;
    }

    public String getStudi_pro_abilitati___not___ends_with() {
        return studi_pro_abilitati___not___ends_with;
    }
    public void setStudi_pro_abilitati___not___ends_with(String studi_pro_abilitati___not___ends_with) {
        this.studi_pro_abilitati___not___ends_with = studi_pro_abilitati___not___ends_with;
    }

    public Boolean getTaf___eq() {
        return taf___eq;
    }
    public void setTaf___eq(Boolean taf___eq) {
        this.taf___eq = taf___eq;
    }

    public Boolean getTaf___ne() {
        return taf___ne;
    }
    public void setTaf___ne(Boolean taf___ne) {
        this.taf___ne = taf___ne;
    }

    public Boolean getTaf___null() {
        return taf___null;
    }
    public void setTaf___null(Boolean taf___null) {
        this.taf___null = taf___null;
    }

    public Boolean getTaf___not___null() {
        return taf___not___null;
    }
    public void setTaf___not___null(Boolean taf___not___null) {
        this.taf___not___null = taf___not___null;
    }

    public Boolean getTerapia_ormonale___eq() {
        return terapia_ormonale___eq;
    }
    public void setTerapia_ormonale___eq(Boolean terapia_ormonale___eq) {
        this.terapia_ormonale___eq = terapia_ormonale___eq;
    }

    public Boolean getTerapia_ormonale___ne() {
        return terapia_ormonale___ne;
    }
    public void setTerapia_ormonale___ne(Boolean terapia_ormonale___ne) {
        this.terapia_ormonale___ne = terapia_ormonale___ne;
    }

    public Boolean getTerapia_ormonale___null() {
        return terapia_ormonale___null;
    }
    public void setTerapia_ormonale___null(Boolean terapia_ormonale___null) {
        this.terapia_ormonale___null = terapia_ormonale___null;
    }

    public Boolean getTerapia_ormonale___not___null() {
        return terapia_ormonale___not___null;
    }
    public void setTerapia_ormonale___not___null(Boolean terapia_ormonale___not___null) {
        this.terapia_ormonale___not___null = terapia_ormonale___not___null;
    }

    public String getToken_notifiche_pro___eq() {
        return token_notifiche_pro___eq;
    }
    public void setToken_notifiche_pro___eq(String token_notifiche_pro___eq) {
        this.token_notifiche_pro___eq = token_notifiche_pro___eq;
    }

    public String getToken_notifiche_pro___ne() {
        return token_notifiche_pro___ne;
    }
    public void setToken_notifiche_pro___ne(String token_notifiche_pro___ne) {
        this.token_notifiche_pro___ne = token_notifiche_pro___ne;
    }

    public Boolean getToken_notifiche_pro___null() {
        return token_notifiche_pro___null;
    }
    public void setToken_notifiche_pro___null(Boolean token_notifiche_pro___null) {
        this.token_notifiche_pro___null = token_notifiche_pro___null;
    }

    public Boolean getToken_notifiche_pro___not___null() {
        return token_notifiche_pro___not___null;
    }
    public void setToken_notifiche_pro___not___null(Boolean token_notifiche_pro___not___null) {
        this.token_notifiche_pro___not___null = token_notifiche_pro___not___null;
    }

    public java.util.List<String> getToken_notifiche_pro___in() {
        return token_notifiche_pro___in;
    }
    public void setToken_notifiche_pro___in(java.util.List<String> token_notifiche_pro___in) {
        this.token_notifiche_pro___in = token_notifiche_pro___in;
    }

    public java.util.List<String> getToken_notifiche_pro___not___in() {
        return token_notifiche_pro___not___in;
    }
    public void setToken_notifiche_pro___not___in(java.util.List<String> token_notifiche_pro___not___in) {
        this.token_notifiche_pro___not___in = token_notifiche_pro___not___in;
    }

    public String getToken_notifiche_pro___lt() {
        return token_notifiche_pro___lt;
    }
    public void setToken_notifiche_pro___lt(String token_notifiche_pro___lt) {
        this.token_notifiche_pro___lt = token_notifiche_pro___lt;
    }

    public String getToken_notifiche_pro___lte() {
        return token_notifiche_pro___lte;
    }
    public void setToken_notifiche_pro___lte(String token_notifiche_pro___lte) {
        this.token_notifiche_pro___lte = token_notifiche_pro___lte;
    }

    public String getToken_notifiche_pro___gt() {
        return token_notifiche_pro___gt;
    }
    public void setToken_notifiche_pro___gt(String token_notifiche_pro___gt) {
        this.token_notifiche_pro___gt = token_notifiche_pro___gt;
    }

    public String getToken_notifiche_pro___gte() {
        return token_notifiche_pro___gte;
    }
    public void setToken_notifiche_pro___gte(String token_notifiche_pro___gte) {
        this.token_notifiche_pro___gte = token_notifiche_pro___gte;
    }

    public String getToken_notifiche_pro___contains() {
        return token_notifiche_pro___contains;
    }
    public void setToken_notifiche_pro___contains(String token_notifiche_pro___contains) {
        this.token_notifiche_pro___contains = token_notifiche_pro___contains;
    }

    public String getToken_notifiche_pro___not___contains() {
        return token_notifiche_pro___not___contains;
    }
    public void setToken_notifiche_pro___not___contains(String token_notifiche_pro___not___contains) {
        this.token_notifiche_pro___not___contains = token_notifiche_pro___not___contains;
    }

    public String getToken_notifiche_pro___starts_with() {
        return token_notifiche_pro___starts_with;
    }
    public void setToken_notifiche_pro___starts_with(String token_notifiche_pro___starts_with) {
        this.token_notifiche_pro___starts_with = token_notifiche_pro___starts_with;
    }

    public String getToken_notifiche_pro___not___starts_with() {
        return token_notifiche_pro___not___starts_with;
    }
    public void setToken_notifiche_pro___not___starts_with(String token_notifiche_pro___not___starts_with) {
        this.token_notifiche_pro___not___starts_with = token_notifiche_pro___not___starts_with;
    }

    public String getToken_notifiche_pro___ends_with() {
        return token_notifiche_pro___ends_with;
    }
    public void setToken_notifiche_pro___ends_with(String token_notifiche_pro___ends_with) {
        this.token_notifiche_pro___ends_with = token_notifiche_pro___ends_with;
    }

    public String getToken_notifiche_pro___not___ends_with() {
        return token_notifiche_pro___not___ends_with;
    }
    public void setToken_notifiche_pro___not___ends_with(String token_notifiche_pro___not___ends_with) {
        this.token_notifiche_pro___not___ends_with = token_notifiche_pro___not___ends_with;
    }

    public Boolean getTrasferito___eq() {
        return trasferito___eq;
    }
    public void setTrasferito___eq(Boolean trasferito___eq) {
        this.trasferito___eq = trasferito___eq;
    }

    public Boolean getTrasferito___ne() {
        return trasferito___ne;
    }
    public void setTrasferito___ne(Boolean trasferito___ne) {
        this.trasferito___ne = trasferito___ne;
    }

    public Boolean getTrasferito___null() {
        return trasferito___null;
    }
    public void setTrasferito___null(Boolean trasferito___null) {
        this.trasferito___null = trasferito___null;
    }

    public Boolean getTrasferito___not___null() {
        return trasferito___not___null;
    }
    public void setTrasferito___not___null(Boolean trasferito___not___null) {
        this.trasferito___not___null = trasferito___not___null;
    }

    public String getUsername_pro___eq() {
        return username_pro___eq;
    }
    public void setUsername_pro___eq(String username_pro___eq) {
        this.username_pro___eq = username_pro___eq;
    }

    public String getUsername_pro___ne() {
        return username_pro___ne;
    }
    public void setUsername_pro___ne(String username_pro___ne) {
        this.username_pro___ne = username_pro___ne;
    }

    public Boolean getUsername_pro___null() {
        return username_pro___null;
    }
    public void setUsername_pro___null(Boolean username_pro___null) {
        this.username_pro___null = username_pro___null;
    }

    public Boolean getUsername_pro___not___null() {
        return username_pro___not___null;
    }
    public void setUsername_pro___not___null(Boolean username_pro___not___null) {
        this.username_pro___not___null = username_pro___not___null;
    }

    public java.util.List<String> getUsername_pro___in() {
        return username_pro___in;
    }
    public void setUsername_pro___in(java.util.List<String> username_pro___in) {
        this.username_pro___in = username_pro___in;
    }

    public java.util.List<String> getUsername_pro___not___in() {
        return username_pro___not___in;
    }
    public void setUsername_pro___not___in(java.util.List<String> username_pro___not___in) {
        this.username_pro___not___in = username_pro___not___in;
    }

    public String getUsername_pro___lt() {
        return username_pro___lt;
    }
    public void setUsername_pro___lt(String username_pro___lt) {
        this.username_pro___lt = username_pro___lt;
    }

    public String getUsername_pro___lte() {
        return username_pro___lte;
    }
    public void setUsername_pro___lte(String username_pro___lte) {
        this.username_pro___lte = username_pro___lte;
    }

    public String getUsername_pro___gt() {
        return username_pro___gt;
    }
    public void setUsername_pro___gt(String username_pro___gt) {
        this.username_pro___gt = username_pro___gt;
    }

    public String getUsername_pro___gte() {
        return username_pro___gte;
    }
    public void setUsername_pro___gte(String username_pro___gte) {
        this.username_pro___gte = username_pro___gte;
    }

    public String getUsername_pro___contains() {
        return username_pro___contains;
    }
    public void setUsername_pro___contains(String username_pro___contains) {
        this.username_pro___contains = username_pro___contains;
    }

    public String getUsername_pro___not___contains() {
        return username_pro___not___contains;
    }
    public void setUsername_pro___not___contains(String username_pro___not___contains) {
        this.username_pro___not___contains = username_pro___not___contains;
    }

    public String getUsername_pro___starts_with() {
        return username_pro___starts_with;
    }
    public void setUsername_pro___starts_with(String username_pro___starts_with) {
        this.username_pro___starts_with = username_pro___starts_with;
    }

    public String getUsername_pro___not___starts_with() {
        return username_pro___not___starts_with;
    }
    public void setUsername_pro___not___starts_with(String username_pro___not___starts_with) {
        this.username_pro___not___starts_with = username_pro___not___starts_with;
    }

    public String getUsername_pro___ends_with() {
        return username_pro___ends_with;
    }
    public void setUsername_pro___ends_with(String username_pro___ends_with) {
        this.username_pro___ends_with = username_pro___ends_with;
    }

    public String getUsername_pro___not___ends_with() {
        return username_pro___not___ends_with;
    }
    public void setUsername_pro___not___ends_with(String username_pro___not___ends_with) {
        this.username_pro___not___ends_with = username_pro___not___ends_with;
    }

    public java.util.List<CliH_PazienteFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliH_PazienteFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliH_PazienteFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliH_PazienteFilterDTO> OR) {
        this.OR = OR;
    }

    public CliH_PazienteFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliH_PazienteFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (IL28B___eq != null) {
            joiner.add("IL28B___eq: " + GraphQLRequestSerializer.getEntry(IL28B___eq));
        }
        if (IL28B___ne != null) {
            joiner.add("IL28B___ne: " + GraphQLRequestSerializer.getEntry(IL28B___ne));
        }
        if (IL28B___null != null) {
            joiner.add("IL28B___null: " + GraphQLRequestSerializer.getEntry(IL28B___null));
        }
        if (IL28B___not___null != null) {
            joiner.add("IL28B___not___null: " + GraphQLRequestSerializer.getEntry(IL28B___not___null));
        }
        if (IL28B___in != null) {
            joiner.add("IL28B___in: " + GraphQLRequestSerializer.getEntry(IL28B___in));
        }
        if (IL28B___not___in != null) {
            joiner.add("IL28B___not___in: " + GraphQLRequestSerializer.getEntry(IL28B___not___in));
        }
        if (IL28B___lt != null) {
            joiner.add("IL28B___lt: " + GraphQLRequestSerializer.getEntry(IL28B___lt));
        }
        if (IL28B___lte != null) {
            joiner.add("IL28B___lte: " + GraphQLRequestSerializer.getEntry(IL28B___lte));
        }
        if (IL28B___gt != null) {
            joiner.add("IL28B___gt: " + GraphQLRequestSerializer.getEntry(IL28B___gt));
        }
        if (IL28B___gte != null) {
            joiner.add("IL28B___gte: " + GraphQLRequestSerializer.getEntry(IL28B___gte));
        }
        if (IL28B___contains != null) {
            joiner.add("IL28B___contains: " + GraphQLRequestSerializer.getEntry(IL28B___contains));
        }
        if (IL28B___not___contains != null) {
            joiner.add("IL28B___not___contains: " + GraphQLRequestSerializer.getEntry(IL28B___not___contains));
        }
        if (IL28B___starts_with != null) {
            joiner.add("IL28B___starts_with: " + GraphQLRequestSerializer.getEntry(IL28B___starts_with));
        }
        if (IL28B___not___starts_with != null) {
            joiner.add("IL28B___not___starts_with: " + GraphQLRequestSerializer.getEntry(IL28B___not___starts_with));
        }
        if (IL28B___ends_with != null) {
            joiner.add("IL28B___ends_with: " + GraphQLRequestSerializer.getEntry(IL28B___ends_with));
        }
        if (IL28B___not___ends_with != null) {
            joiner.add("IL28B___not___ends_with: " + GraphQLRequestSerializer.getEntry(IL28B___not___ends_with));
        }
        if (USSL_di_residenza___eq != null) {
            joiner.add("USSL_di_residenza___eq: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___eq));
        }
        if (USSL_di_residenza___ne != null) {
            joiner.add("USSL_di_residenza___ne: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___ne));
        }
        if (USSL_di_residenza___null != null) {
            joiner.add("USSL_di_residenza___null: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___null));
        }
        if (USSL_di_residenza___not___null != null) {
            joiner.add("USSL_di_residenza___not___null: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___not___null));
        }
        if (USSL_di_residenza___in != null) {
            joiner.add("USSL_di_residenza___in: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___in));
        }
        if (USSL_di_residenza___not___in != null) {
            joiner.add("USSL_di_residenza___not___in: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___not___in));
        }
        if (USSL_di_residenza___lt != null) {
            joiner.add("USSL_di_residenza___lt: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___lt));
        }
        if (USSL_di_residenza___lte != null) {
            joiner.add("USSL_di_residenza___lte: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___lte));
        }
        if (USSL_di_residenza___gt != null) {
            joiner.add("USSL_di_residenza___gt: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___gt));
        }
        if (USSL_di_residenza___gte != null) {
            joiner.add("USSL_di_residenza___gte: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___gte));
        }
        if (USSL_di_residenza___contains != null) {
            joiner.add("USSL_di_residenza___contains: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___contains));
        }
        if (USSL_di_residenza___not___contains != null) {
            joiner.add("USSL_di_residenza___not___contains: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___not___contains));
        }
        if (USSL_di_residenza___starts_with != null) {
            joiner.add("USSL_di_residenza___starts_with: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___starts_with));
        }
        if (USSL_di_residenza___not___starts_with != null) {
            joiner.add("USSL_di_residenza___not___starts_with: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___not___starts_with));
        }
        if (USSL_di_residenza___ends_with != null) {
            joiner.add("USSL_di_residenza___ends_with: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___ends_with));
        }
        if (USSL_di_residenza___not___ends_with != null) {
            joiner.add("USSL_di_residenza___not___ends_with: " + GraphQLRequestSerializer.getEntry(USSL_di_residenza___not___ends_with));
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
        if (altezza___eq != null) {
            joiner.add("altezza___eq: " + GraphQLRequestSerializer.getEntry(altezza___eq));
        }
        if (altezza___ne != null) {
            joiner.add("altezza___ne: " + GraphQLRequestSerializer.getEntry(altezza___ne));
        }
        if (altezza___null != null) {
            joiner.add("altezza___null: " + GraphQLRequestSerializer.getEntry(altezza___null));
        }
        if (altezza___not___null != null) {
            joiner.add("altezza___not___null: " + GraphQLRequestSerializer.getEntry(altezza___not___null));
        }
        if (altezza___in != null) {
            joiner.add("altezza___in: " + GraphQLRequestSerializer.getEntry(altezza___in));
        }
        if (altezza___not___in != null) {
            joiner.add("altezza___not___in: " + GraphQLRequestSerializer.getEntry(altezza___not___in));
        }
        if (altezza___lt != null) {
            joiner.add("altezza___lt: " + GraphQLRequestSerializer.getEntry(altezza___lt));
        }
        if (altezza___lte != null) {
            joiner.add("altezza___lte: " + GraphQLRequestSerializer.getEntry(altezza___lte));
        }
        if (altezza___gt != null) {
            joiner.add("altezza___gt: " + GraphQLRequestSerializer.getEntry(altezza___gt));
        }
        if (altezza___gte != null) {
            joiner.add("altezza___gte: " + GraphQLRequestSerializer.getEntry(altezza___gte));
        }
        if (altro_fattore_di_rischio___eq != null) {
            joiner.add("altro_fattore_di_rischio___eq: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___eq));
        }
        if (altro_fattore_di_rischio___ne != null) {
            joiner.add("altro_fattore_di_rischio___ne: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___ne));
        }
        if (altro_fattore_di_rischio___null != null) {
            joiner.add("altro_fattore_di_rischio___null: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___null));
        }
        if (altro_fattore_di_rischio___not___null != null) {
            joiner.add("altro_fattore_di_rischio___not___null: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___not___null));
        }
        if (altro_fattore_di_rischio___in != null) {
            joiner.add("altro_fattore_di_rischio___in: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___in));
        }
        if (altro_fattore_di_rischio___not___in != null) {
            joiner.add("altro_fattore_di_rischio___not___in: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___not___in));
        }
        if (altro_fattore_di_rischio___lt != null) {
            joiner.add("altro_fattore_di_rischio___lt: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___lt));
        }
        if (altro_fattore_di_rischio___lte != null) {
            joiner.add("altro_fattore_di_rischio___lte: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___lte));
        }
        if (altro_fattore_di_rischio___gt != null) {
            joiner.add("altro_fattore_di_rischio___gt: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___gt));
        }
        if (altro_fattore_di_rischio___gte != null) {
            joiner.add("altro_fattore_di_rischio___gte: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___gte));
        }
        if (altro_fattore_di_rischio___contains != null) {
            joiner.add("altro_fattore_di_rischio___contains: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___contains));
        }
        if (altro_fattore_di_rischio___not___contains != null) {
            joiner.add("altro_fattore_di_rischio___not___contains: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___not___contains));
        }
        if (altro_fattore_di_rischio___starts_with != null) {
            joiner.add("altro_fattore_di_rischio___starts_with: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___starts_with));
        }
        if (altro_fattore_di_rischio___not___starts_with != null) {
            joiner.add("altro_fattore_di_rischio___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___not___starts_with));
        }
        if (altro_fattore_di_rischio___ends_with != null) {
            joiner.add("altro_fattore_di_rischio___ends_with: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___ends_with));
        }
        if (altro_fattore_di_rischio___not___ends_with != null) {
            joiner.add("altro_fattore_di_rischio___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_fattore_di_rischio___not___ends_with));
        }
        if (anno_nascita___eq != null) {
            joiner.add("anno_nascita___eq: " + GraphQLRequestSerializer.getEntry(anno_nascita___eq));
        }
        if (anno_nascita___ne != null) {
            joiner.add("anno_nascita___ne: " + GraphQLRequestSerializer.getEntry(anno_nascita___ne));
        }
        if (anno_nascita___null != null) {
            joiner.add("anno_nascita___null: " + GraphQLRequestSerializer.getEntry(anno_nascita___null));
        }
        if (anno_nascita___not___null != null) {
            joiner.add("anno_nascita___not___null: " + GraphQLRequestSerializer.getEntry(anno_nascita___not___null));
        }
        if (anno_nascita___in != null) {
            joiner.add("anno_nascita___in: " + GraphQLRequestSerializer.getEntry(anno_nascita___in));
        }
        if (anno_nascita___not___in != null) {
            joiner.add("anno_nascita___not___in: " + GraphQLRequestSerializer.getEntry(anno_nascita___not___in));
        }
        if (anno_nascita___lt != null) {
            joiner.add("anno_nascita___lt: " + GraphQLRequestSerializer.getEntry(anno_nascita___lt));
        }
        if (anno_nascita___lte != null) {
            joiner.add("anno_nascita___lte: " + GraphQLRequestSerializer.getEntry(anno_nascita___lte));
        }
        if (anno_nascita___gt != null) {
            joiner.add("anno_nascita___gt: " + GraphQLRequestSerializer.getEntry(anno_nascita___gt));
        }
        if (anno_nascita___gte != null) {
            joiner.add("anno_nascita___gte: " + GraphQLRequestSerializer.getEntry(anno_nascita___gte));
        }
        if (checks___eq != null) {
            joiner.add("checks___eq: " + GraphQLRequestSerializer.getEntry(checks___eq));
        }
        if (checks___ne != null) {
            joiner.add("checks___ne: " + GraphQLRequestSerializer.getEntry(checks___ne));
        }
        if (checks___null != null) {
            joiner.add("checks___null: " + GraphQLRequestSerializer.getEntry(checks___null));
        }
        if (checks___not___null != null) {
            joiner.add("checks___not___null: " + GraphQLRequestSerializer.getEntry(checks___not___null));
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
        if (codice_interno___eq != null) {
            joiner.add("codice_interno___eq: " + GraphQLRequestSerializer.getEntry(codice_interno___eq));
        }
        if (codice_interno___ne != null) {
            joiner.add("codice_interno___ne: " + GraphQLRequestSerializer.getEntry(codice_interno___ne));
        }
        if (codice_interno___null != null) {
            joiner.add("codice_interno___null: " + GraphQLRequestSerializer.getEntry(codice_interno___null));
        }
        if (codice_interno___not___null != null) {
            joiner.add("codice_interno___not___null: " + GraphQLRequestSerializer.getEntry(codice_interno___not___null));
        }
        if (codice_interno___in != null) {
            joiner.add("codice_interno___in: " + GraphQLRequestSerializer.getEntry(codice_interno___in));
        }
        if (codice_interno___not___in != null) {
            joiner.add("codice_interno___not___in: " + GraphQLRequestSerializer.getEntry(codice_interno___not___in));
        }
        if (codice_interno___lt != null) {
            joiner.add("codice_interno___lt: " + GraphQLRequestSerializer.getEntry(codice_interno___lt));
        }
        if (codice_interno___lte != null) {
            joiner.add("codice_interno___lte: " + GraphQLRequestSerializer.getEntry(codice_interno___lte));
        }
        if (codice_interno___gt != null) {
            joiner.add("codice_interno___gt: " + GraphQLRequestSerializer.getEntry(codice_interno___gt));
        }
        if (codice_interno___gte != null) {
            joiner.add("codice_interno___gte: " + GraphQLRequestSerializer.getEntry(codice_interno___gte));
        }
        if (codice_interno___contains != null) {
            joiner.add("codice_interno___contains: " + GraphQLRequestSerializer.getEntry(codice_interno___contains));
        }
        if (codice_interno___not___contains != null) {
            joiner.add("codice_interno___not___contains: " + GraphQLRequestSerializer.getEntry(codice_interno___not___contains));
        }
        if (codice_interno___starts_with != null) {
            joiner.add("codice_interno___starts_with: " + GraphQLRequestSerializer.getEntry(codice_interno___starts_with));
        }
        if (codice_interno___not___starts_with != null) {
            joiner.add("codice_interno___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_interno___not___starts_with));
        }
        if (codice_interno___ends_with != null) {
            joiner.add("codice_interno___ends_with: " + GraphQLRequestSerializer.getEntry(codice_interno___ends_with));
        }
        if (codice_interno___not___ends_with != null) {
            joiner.add("codice_interno___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_interno___not___ends_with));
        }
        if (codice_nazionale___eq != null) {
            joiner.add("codice_nazionale___eq: " + GraphQLRequestSerializer.getEntry(codice_nazionale___eq));
        }
        if (codice_nazionale___ne != null) {
            joiner.add("codice_nazionale___ne: " + GraphQLRequestSerializer.getEntry(codice_nazionale___ne));
        }
        if (codice_nazionale___null != null) {
            joiner.add("codice_nazionale___null: " + GraphQLRequestSerializer.getEntry(codice_nazionale___null));
        }
        if (codice_nazionale___not___null != null) {
            joiner.add("codice_nazionale___not___null: " + GraphQLRequestSerializer.getEntry(codice_nazionale___not___null));
        }
        if (codice_nazionale___in != null) {
            joiner.add("codice_nazionale___in: " + GraphQLRequestSerializer.getEntry(codice_nazionale___in));
        }
        if (codice_nazionale___not___in != null) {
            joiner.add("codice_nazionale___not___in: " + GraphQLRequestSerializer.getEntry(codice_nazionale___not___in));
        }
        if (codice_nazionale___lt != null) {
            joiner.add("codice_nazionale___lt: " + GraphQLRequestSerializer.getEntry(codice_nazionale___lt));
        }
        if (codice_nazionale___lte != null) {
            joiner.add("codice_nazionale___lte: " + GraphQLRequestSerializer.getEntry(codice_nazionale___lte));
        }
        if (codice_nazionale___gt != null) {
            joiner.add("codice_nazionale___gt: " + GraphQLRequestSerializer.getEntry(codice_nazionale___gt));
        }
        if (codice_nazionale___gte != null) {
            joiner.add("codice_nazionale___gte: " + GraphQLRequestSerializer.getEntry(codice_nazionale___gte));
        }
        if (codice_nazionale___contains != null) {
            joiner.add("codice_nazionale___contains: " + GraphQLRequestSerializer.getEntry(codice_nazionale___contains));
        }
        if (codice_nazionale___not___contains != null) {
            joiner.add("codice_nazionale___not___contains: " + GraphQLRequestSerializer.getEntry(codice_nazionale___not___contains));
        }
        if (codice_nazionale___starts_with != null) {
            joiner.add("codice_nazionale___starts_with: " + GraphQLRequestSerializer.getEntry(codice_nazionale___starts_with));
        }
        if (codice_nazionale___not___starts_with != null) {
            joiner.add("codice_nazionale___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_nazionale___not___starts_with));
        }
        if (codice_nazionale___ends_with != null) {
            joiner.add("codice_nazionale___ends_with: " + GraphQLRequestSerializer.getEntry(codice_nazionale___ends_with));
        }
        if (codice_nazionale___not___ends_with != null) {
            joiner.add("codice_nazionale___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_nazionale___not___ends_with));
        }
        if (cognome___eq != null) {
            joiner.add("cognome___eq: " + GraphQLRequestSerializer.getEntry(cognome___eq));
        }
        if (cognome___ne != null) {
            joiner.add("cognome___ne: " + GraphQLRequestSerializer.getEntry(cognome___ne));
        }
        if (cognome___null != null) {
            joiner.add("cognome___null: " + GraphQLRequestSerializer.getEntry(cognome___null));
        }
        if (cognome___not___null != null) {
            joiner.add("cognome___not___null: " + GraphQLRequestSerializer.getEntry(cognome___not___null));
        }
        if (cognome___in != null) {
            joiner.add("cognome___in: " + GraphQLRequestSerializer.getEntry(cognome___in));
        }
        if (cognome___not___in != null) {
            joiner.add("cognome___not___in: " + GraphQLRequestSerializer.getEntry(cognome___not___in));
        }
        if (cognome___lt != null) {
            joiner.add("cognome___lt: " + GraphQLRequestSerializer.getEntry(cognome___lt));
        }
        if (cognome___lte != null) {
            joiner.add("cognome___lte: " + GraphQLRequestSerializer.getEntry(cognome___lte));
        }
        if (cognome___gt != null) {
            joiner.add("cognome___gt: " + GraphQLRequestSerializer.getEntry(cognome___gt));
        }
        if (cognome___gte != null) {
            joiner.add("cognome___gte: " + GraphQLRequestSerializer.getEntry(cognome___gte));
        }
        if (cognome___contains != null) {
            joiner.add("cognome___contains: " + GraphQLRequestSerializer.getEntry(cognome___contains));
        }
        if (cognome___not___contains != null) {
            joiner.add("cognome___not___contains: " + GraphQLRequestSerializer.getEntry(cognome___not___contains));
        }
        if (cognome___starts_with != null) {
            joiner.add("cognome___starts_with: " + GraphQLRequestSerializer.getEntry(cognome___starts_with));
        }
        if (cognome___not___starts_with != null) {
            joiner.add("cognome___not___starts_with: " + GraphQLRequestSerializer.getEntry(cognome___not___starts_with));
        }
        if (cognome___ends_with != null) {
            joiner.add("cognome___ends_with: " + GraphQLRequestSerializer.getEntry(cognome___ends_with));
        }
        if (cognome___not___ends_with != null) {
            joiner.add("cognome___not___ends_with: " + GraphQLRequestSerializer.getEntry(cognome___not___ends_with));
        }
        if (comune_di_nascita___eq != null) {
            joiner.add("comune_di_nascita___eq: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___eq));
        }
        if (comune_di_nascita___ne != null) {
            joiner.add("comune_di_nascita___ne: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___ne));
        }
        if (comune_di_nascita___null != null) {
            joiner.add("comune_di_nascita___null: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___null));
        }
        if (comune_di_nascita___not___null != null) {
            joiner.add("comune_di_nascita___not___null: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___not___null));
        }
        if (comune_di_nascita___in != null) {
            joiner.add("comune_di_nascita___in: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___in));
        }
        if (comune_di_nascita___not___in != null) {
            joiner.add("comune_di_nascita___not___in: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___not___in));
        }
        if (comune_di_nascita___lt != null) {
            joiner.add("comune_di_nascita___lt: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___lt));
        }
        if (comune_di_nascita___lte != null) {
            joiner.add("comune_di_nascita___lte: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___lte));
        }
        if (comune_di_nascita___gt != null) {
            joiner.add("comune_di_nascita___gt: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___gt));
        }
        if (comune_di_nascita___gte != null) {
            joiner.add("comune_di_nascita___gte: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___gte));
        }
        if (comune_di_nascita___contains != null) {
            joiner.add("comune_di_nascita___contains: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___contains));
        }
        if (comune_di_nascita___not___contains != null) {
            joiner.add("comune_di_nascita___not___contains: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___not___contains));
        }
        if (comune_di_nascita___starts_with != null) {
            joiner.add("comune_di_nascita___starts_with: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___starts_with));
        }
        if (comune_di_nascita___not___starts_with != null) {
            joiner.add("comune_di_nascita___not___starts_with: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___not___starts_with));
        }
        if (comune_di_nascita___ends_with != null) {
            joiner.add("comune_di_nascita___ends_with: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___ends_with));
        }
        if (comune_di_nascita___not___ends_with != null) {
            joiner.add("comune_di_nascita___not___ends_with: " + GraphQLRequestSerializer.getEntry(comune_di_nascita___not___ends_with));
        }
        if (data_consenso___eq != null) {
            joiner.add("data_consenso___eq: " + GraphQLRequestSerializer.getEntry(data_consenso___eq));
        }
        if (data_consenso___ne != null) {
            joiner.add("data_consenso___ne: " + GraphQLRequestSerializer.getEntry(data_consenso___ne));
        }
        if (data_consenso___null != null) {
            joiner.add("data_consenso___null: " + GraphQLRequestSerializer.getEntry(data_consenso___null));
        }
        if (data_consenso___not___null != null) {
            joiner.add("data_consenso___not___null: " + GraphQLRequestSerializer.getEntry(data_consenso___not___null));
        }
        if (data_consenso___in != null) {
            joiner.add("data_consenso___in: " + GraphQLRequestSerializer.getEntry(data_consenso___in));
        }
        if (data_consenso___not___in != null) {
            joiner.add("data_consenso___not___in: " + GraphQLRequestSerializer.getEntry(data_consenso___not___in));
        }
        if (data_consenso___lt != null) {
            joiner.add("data_consenso___lt: " + GraphQLRequestSerializer.getEntry(data_consenso___lt));
        }
        if (data_consenso___lte != null) {
            joiner.add("data_consenso___lte: " + GraphQLRequestSerializer.getEntry(data_consenso___lte));
        }
        if (data_consenso___gt != null) {
            joiner.add("data_consenso___gt: " + GraphQLRequestSerializer.getEntry(data_consenso___gt));
        }
        if (data_consenso___gte != null) {
            joiner.add("data_consenso___gte: " + GraphQLRequestSerializer.getEntry(data_consenso___gte));
        }
        if (data_consenso_pro___eq != null) {
            joiner.add("data_consenso_pro___eq: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___eq));
        }
        if (data_consenso_pro___ne != null) {
            joiner.add("data_consenso_pro___ne: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___ne));
        }
        if (data_consenso_pro___null != null) {
            joiner.add("data_consenso_pro___null: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___null));
        }
        if (data_consenso_pro___not___null != null) {
            joiner.add("data_consenso_pro___not___null: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___not___null));
        }
        if (data_consenso_pro___in != null) {
            joiner.add("data_consenso_pro___in: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___in));
        }
        if (data_consenso_pro___not___in != null) {
            joiner.add("data_consenso_pro___not___in: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___not___in));
        }
        if (data_consenso_pro___lt != null) {
            joiner.add("data_consenso_pro___lt: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___lt));
        }
        if (data_consenso_pro___lte != null) {
            joiner.add("data_consenso_pro___lte: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___lte));
        }
        if (data_consenso_pro___gt != null) {
            joiner.add("data_consenso_pro___gt: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___gt));
        }
        if (data_consenso_pro___gte != null) {
            joiner.add("data_consenso_pro___gte: " + GraphQLRequestSerializer.getEntry(data_consenso_pro___gte));
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
        if (data_fine_terapia_ormonale___eq != null) {
            joiner.add("data_fine_terapia_ormonale___eq: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___eq));
        }
        if (data_fine_terapia_ormonale___ne != null) {
            joiner.add("data_fine_terapia_ormonale___ne: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___ne));
        }
        if (data_fine_terapia_ormonale___null != null) {
            joiner.add("data_fine_terapia_ormonale___null: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___null));
        }
        if (data_fine_terapia_ormonale___not___null != null) {
            joiner.add("data_fine_terapia_ormonale___not___null: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___not___null));
        }
        if (data_fine_terapia_ormonale___in != null) {
            joiner.add("data_fine_terapia_ormonale___in: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___in));
        }
        if (data_fine_terapia_ormonale___not___in != null) {
            joiner.add("data_fine_terapia_ormonale___not___in: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___not___in));
        }
        if (data_fine_terapia_ormonale___lt != null) {
            joiner.add("data_fine_terapia_ormonale___lt: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___lt));
        }
        if (data_fine_terapia_ormonale___lte != null) {
            joiner.add("data_fine_terapia_ormonale___lte: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___lte));
        }
        if (data_fine_terapia_ormonale___gt != null) {
            joiner.add("data_fine_terapia_ormonale___gt: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___gt));
        }
        if (data_fine_terapia_ormonale___gte != null) {
            joiner.add("data_fine_terapia_ormonale___gte: " + GraphQLRequestSerializer.getEntry(data_fine_terapia_ormonale___gte));
        }
        if (data_gilbert___eq != null) {
            joiner.add("data_gilbert___eq: " + GraphQLRequestSerializer.getEntry(data_gilbert___eq));
        }
        if (data_gilbert___ne != null) {
            joiner.add("data_gilbert___ne: " + GraphQLRequestSerializer.getEntry(data_gilbert___ne));
        }
        if (data_gilbert___null != null) {
            joiner.add("data_gilbert___null: " + GraphQLRequestSerializer.getEntry(data_gilbert___null));
        }
        if (data_gilbert___not___null != null) {
            joiner.add("data_gilbert___not___null: " + GraphQLRequestSerializer.getEntry(data_gilbert___not___null));
        }
        if (data_gilbert___in != null) {
            joiner.add("data_gilbert___in: " + GraphQLRequestSerializer.getEntry(data_gilbert___in));
        }
        if (data_gilbert___not___in != null) {
            joiner.add("data_gilbert___not___in: " + GraphQLRequestSerializer.getEntry(data_gilbert___not___in));
        }
        if (data_gilbert___lt != null) {
            joiner.add("data_gilbert___lt: " + GraphQLRequestSerializer.getEntry(data_gilbert___lt));
        }
        if (data_gilbert___lte != null) {
            joiner.add("data_gilbert___lte: " + GraphQLRequestSerializer.getEntry(data_gilbert___lte));
        }
        if (data_gilbert___gt != null) {
            joiner.add("data_gilbert___gt: " + GraphQLRequestSerializer.getEntry(data_gilbert___gt));
        }
        if (data_gilbert___gte != null) {
            joiner.add("data_gilbert___gte: " + GraphQLRequestSerializer.getEntry(data_gilbert___gte));
        }
        if (data_hla___eq != null) {
            joiner.add("data_hla___eq: " + GraphQLRequestSerializer.getEntry(data_hla___eq));
        }
        if (data_hla___ne != null) {
            joiner.add("data_hla___ne: " + GraphQLRequestSerializer.getEntry(data_hla___ne));
        }
        if (data_hla___null != null) {
            joiner.add("data_hla___null: " + GraphQLRequestSerializer.getEntry(data_hla___null));
        }
        if (data_hla___not___null != null) {
            joiner.add("data_hla___not___null: " + GraphQLRequestSerializer.getEntry(data_hla___not___null));
        }
        if (data_hla___in != null) {
            joiner.add("data_hla___in: " + GraphQLRequestSerializer.getEntry(data_hla___in));
        }
        if (data_hla___not___in != null) {
            joiner.add("data_hla___not___in: " + GraphQLRequestSerializer.getEntry(data_hla___not___in));
        }
        if (data_hla___lt != null) {
            joiner.add("data_hla___lt: " + GraphQLRequestSerializer.getEntry(data_hla___lt));
        }
        if (data_hla___lte != null) {
            joiner.add("data_hla___lte: " + GraphQLRequestSerializer.getEntry(data_hla___lte));
        }
        if (data_hla___gt != null) {
            joiner.add("data_hla___gt: " + GraphQLRequestSerializer.getEntry(data_hla___gt));
        }
        if (data_hla___gte != null) {
            joiner.add("data_hla___gte: " + GraphQLRequestSerializer.getEntry(data_hla___gte));
        }
        if (data_il28___eq != null) {
            joiner.add("data_il28___eq: " + GraphQLRequestSerializer.getEntry(data_il28___eq));
        }
        if (data_il28___ne != null) {
            joiner.add("data_il28___ne: " + GraphQLRequestSerializer.getEntry(data_il28___ne));
        }
        if (data_il28___null != null) {
            joiner.add("data_il28___null: " + GraphQLRequestSerializer.getEntry(data_il28___null));
        }
        if (data_il28___not___null != null) {
            joiner.add("data_il28___not___null: " + GraphQLRequestSerializer.getEntry(data_il28___not___null));
        }
        if (data_il28___in != null) {
            joiner.add("data_il28___in: " + GraphQLRequestSerializer.getEntry(data_il28___in));
        }
        if (data_il28___not___in != null) {
            joiner.add("data_il28___not___in: " + GraphQLRequestSerializer.getEntry(data_il28___not___in));
        }
        if (data_il28___lt != null) {
            joiner.add("data_il28___lt: " + GraphQLRequestSerializer.getEntry(data_il28___lt));
        }
        if (data_il28___lte != null) {
            joiner.add("data_il28___lte: " + GraphQLRequestSerializer.getEntry(data_il28___lte));
        }
        if (data_il28___gt != null) {
            joiner.add("data_il28___gt: " + GraphQLRequestSerializer.getEntry(data_il28___gt));
        }
        if (data_il28___gte != null) {
            joiner.add("data_il28___gte: " + GraphQLRequestSerializer.getEntry(data_il28___gte));
        }
        if (data_inizio_terapia_ormonale___eq != null) {
            joiner.add("data_inizio_terapia_ormonale___eq: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___eq));
        }
        if (data_inizio_terapia_ormonale___ne != null) {
            joiner.add("data_inizio_terapia_ormonale___ne: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___ne));
        }
        if (data_inizio_terapia_ormonale___null != null) {
            joiner.add("data_inizio_terapia_ormonale___null: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___null));
        }
        if (data_inizio_terapia_ormonale___not___null != null) {
            joiner.add("data_inizio_terapia_ormonale___not___null: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___not___null));
        }
        if (data_inizio_terapia_ormonale___in != null) {
            joiner.add("data_inizio_terapia_ormonale___in: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___in));
        }
        if (data_inizio_terapia_ormonale___not___in != null) {
            joiner.add("data_inizio_terapia_ormonale___not___in: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___not___in));
        }
        if (data_inizio_terapia_ormonale___lt != null) {
            joiner.add("data_inizio_terapia_ormonale___lt: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___lt));
        }
        if (data_inizio_terapia_ormonale___lte != null) {
            joiner.add("data_inizio_terapia_ormonale___lte: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___lte));
        }
        if (data_inizio_terapia_ormonale___gt != null) {
            joiner.add("data_inizio_terapia_ormonale___gt: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___gt));
        }
        if (data_inizio_terapia_ormonale___gte != null) {
            joiner.add("data_inizio_terapia_ormonale___gte: " + GraphQLRequestSerializer.getEntry(data_inizio_terapia_ormonale___gte));
        }
        if (data_menopausa___eq != null) {
            joiner.add("data_menopausa___eq: " + GraphQLRequestSerializer.getEntry(data_menopausa___eq));
        }
        if (data_menopausa___ne != null) {
            joiner.add("data_menopausa___ne: " + GraphQLRequestSerializer.getEntry(data_menopausa___ne));
        }
        if (data_menopausa___null != null) {
            joiner.add("data_menopausa___null: " + GraphQLRequestSerializer.getEntry(data_menopausa___null));
        }
        if (data_menopausa___not___null != null) {
            joiner.add("data_menopausa___not___null: " + GraphQLRequestSerializer.getEntry(data_menopausa___not___null));
        }
        if (data_menopausa___in != null) {
            joiner.add("data_menopausa___in: " + GraphQLRequestSerializer.getEntry(data_menopausa___in));
        }
        if (data_menopausa___not___in != null) {
            joiner.add("data_menopausa___not___in: " + GraphQLRequestSerializer.getEntry(data_menopausa___not___in));
        }
        if (data_menopausa___lt != null) {
            joiner.add("data_menopausa___lt: " + GraphQLRequestSerializer.getEntry(data_menopausa___lt));
        }
        if (data_menopausa___lte != null) {
            joiner.add("data_menopausa___lte: " + GraphQLRequestSerializer.getEntry(data_menopausa___lte));
        }
        if (data_menopausa___gt != null) {
            joiner.add("data_menopausa___gt: " + GraphQLRequestSerializer.getEntry(data_menopausa___gt));
        }
        if (data_menopausa___gte != null) {
            joiner.add("data_menopausa___gte: " + GraphQLRequestSerializer.getEntry(data_menopausa___gte));
        }
        if (data_prima_terapia_anti_hcv___eq != null) {
            joiner.add("data_prima_terapia_anti_hcv___eq: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___eq));
        }
        if (data_prima_terapia_anti_hcv___ne != null) {
            joiner.add("data_prima_terapia_anti_hcv___ne: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___ne));
        }
        if (data_prima_terapia_anti_hcv___null != null) {
            joiner.add("data_prima_terapia_anti_hcv___null: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___null));
        }
        if (data_prima_terapia_anti_hcv___not___null != null) {
            joiner.add("data_prima_terapia_anti_hcv___not___null: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___not___null));
        }
        if (data_prima_terapia_anti_hcv___in != null) {
            joiner.add("data_prima_terapia_anti_hcv___in: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___in));
        }
        if (data_prima_terapia_anti_hcv___not___in != null) {
            joiner.add("data_prima_terapia_anti_hcv___not___in: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___not___in));
        }
        if (data_prima_terapia_anti_hcv___lt != null) {
            joiner.add("data_prima_terapia_anti_hcv___lt: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___lt));
        }
        if (data_prima_terapia_anti_hcv___lte != null) {
            joiner.add("data_prima_terapia_anti_hcv___lte: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___lte));
        }
        if (data_prima_terapia_anti_hcv___gt != null) {
            joiner.add("data_prima_terapia_anti_hcv___gt: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___gt));
        }
        if (data_prima_terapia_anti_hcv___gte != null) {
            joiner.add("data_prima_terapia_anti_hcv___gte: " + GraphQLRequestSerializer.getEntry(data_prima_terapia_anti_hcv___gte));
        }
        if (data_prima_visita___eq != null) {
            joiner.add("data_prima_visita___eq: " + GraphQLRequestSerializer.getEntry(data_prima_visita___eq));
        }
        if (data_prima_visita___ne != null) {
            joiner.add("data_prima_visita___ne: " + GraphQLRequestSerializer.getEntry(data_prima_visita___ne));
        }
        if (data_prima_visita___null != null) {
            joiner.add("data_prima_visita___null: " + GraphQLRequestSerializer.getEntry(data_prima_visita___null));
        }
        if (data_prima_visita___not___null != null) {
            joiner.add("data_prima_visita___not___null: " + GraphQLRequestSerializer.getEntry(data_prima_visita___not___null));
        }
        if (data_prima_visita___in != null) {
            joiner.add("data_prima_visita___in: " + GraphQLRequestSerializer.getEntry(data_prima_visita___in));
        }
        if (data_prima_visita___not___in != null) {
            joiner.add("data_prima_visita___not___in: " + GraphQLRequestSerializer.getEntry(data_prima_visita___not___in));
        }
        if (data_prima_visita___lt != null) {
            joiner.add("data_prima_visita___lt: " + GraphQLRequestSerializer.getEntry(data_prima_visita___lt));
        }
        if (data_prima_visita___lte != null) {
            joiner.add("data_prima_visita___lte: " + GraphQLRequestSerializer.getEntry(data_prima_visita___lte));
        }
        if (data_prima_visita___gt != null) {
            joiner.add("data_prima_visita___gt: " + GraphQLRequestSerializer.getEntry(data_prima_visita___gt));
        }
        if (data_prima_visita___gte != null) {
            joiner.add("data_prima_visita___gte: " + GraphQLRequestSerializer.getEntry(data_prima_visita___gte));
        }
        if (data_primo_hcvab_pos___eq != null) {
            joiner.add("data_primo_hcvab_pos___eq: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___eq));
        }
        if (data_primo_hcvab_pos___ne != null) {
            joiner.add("data_primo_hcvab_pos___ne: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___ne));
        }
        if (data_primo_hcvab_pos___null != null) {
            joiner.add("data_primo_hcvab_pos___null: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___null));
        }
        if (data_primo_hcvab_pos___not___null != null) {
            joiner.add("data_primo_hcvab_pos___not___null: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___not___null));
        }
        if (data_primo_hcvab_pos___in != null) {
            joiner.add("data_primo_hcvab_pos___in: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___in));
        }
        if (data_primo_hcvab_pos___not___in != null) {
            joiner.add("data_primo_hcvab_pos___not___in: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___not___in));
        }
        if (data_primo_hcvab_pos___lt != null) {
            joiner.add("data_primo_hcvab_pos___lt: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___lt));
        }
        if (data_primo_hcvab_pos___lte != null) {
            joiner.add("data_primo_hcvab_pos___lte: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___lte));
        }
        if (data_primo_hcvab_pos___gt != null) {
            joiner.add("data_primo_hcvab_pos___gt: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___gt));
        }
        if (data_primo_hcvab_pos___gte != null) {
            joiner.add("data_primo_hcvab_pos___gte: " + GraphQLRequestSerializer.getEntry(data_primo_hcvab_pos___gte));
        }
        if (data_ultima_visita___eq != null) {
            joiner.add("data_ultima_visita___eq: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___eq));
        }
        if (data_ultima_visita___ne != null) {
            joiner.add("data_ultima_visita___ne: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___ne));
        }
        if (data_ultima_visita___null != null) {
            joiner.add("data_ultima_visita___null: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___null));
        }
        if (data_ultima_visita___not___null != null) {
            joiner.add("data_ultima_visita___not___null: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___not___null));
        }
        if (data_ultima_visita___in != null) {
            joiner.add("data_ultima_visita___in: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___in));
        }
        if (data_ultima_visita___not___in != null) {
            joiner.add("data_ultima_visita___not___in: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___not___in));
        }
        if (data_ultima_visita___lt != null) {
            joiner.add("data_ultima_visita___lt: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___lt));
        }
        if (data_ultima_visita___lte != null) {
            joiner.add("data_ultima_visita___lte: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___lte));
        }
        if (data_ultima_visita___gt != null) {
            joiner.add("data_ultima_visita___gt: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___gt));
        }
        if (data_ultima_visita___gte != null) {
            joiner.add("data_ultima_visita___gte: " + GraphQLRequestSerializer.getEntry(data_ultima_visita___gte));
        }
        if (data_ultimo_HCVAb_pre_arr___eq != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___eq: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___eq));
        }
        if (data_ultimo_HCVAb_pre_arr___ne != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___ne: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___ne));
        }
        if (data_ultimo_HCVAb_pre_arr___null != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___null));
        }
        if (data_ultimo_HCVAb_pre_arr___not___null != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___not___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___not___null));
        }
        if (data_ultimo_HCVAb_pre_arr___in != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___in));
        }
        if (data_ultimo_HCVAb_pre_arr___not___in != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___not___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___not___in));
        }
        if (data_ultimo_HCVAb_pre_arr___lt != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___lt: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___lt));
        }
        if (data_ultimo_HCVAb_pre_arr___lte != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___lte: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___lte));
        }
        if (data_ultimo_HCVAb_pre_arr___gt != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___gt: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___gt));
        }
        if (data_ultimo_HCVAb_pre_arr___gte != null) {
            joiner.add("data_ultimo_HCVAb_pre_arr___gte: " + GraphQLRequestSerializer.getEntry(data_ultimo_HCVAb_pre_arr___gte));
        }
        if (data_ultimo_HbsAg_pre_arr___eq != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___eq: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___eq));
        }
        if (data_ultimo_HbsAg_pre_arr___ne != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___ne: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___ne));
        }
        if (data_ultimo_HbsAg_pre_arr___null != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___null));
        }
        if (data_ultimo_HbsAg_pre_arr___not___null != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___not___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___not___null));
        }
        if (data_ultimo_HbsAg_pre_arr___in != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___in));
        }
        if (data_ultimo_HbsAg_pre_arr___not___in != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___not___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___not___in));
        }
        if (data_ultimo_HbsAg_pre_arr___lt != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___lt: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___lt));
        }
        if (data_ultimo_HbsAg_pre_arr___lte != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___lte: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___lte));
        }
        if (data_ultimo_HbsAg_pre_arr___gt != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___gt: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___gt));
        }
        if (data_ultimo_HbsAg_pre_arr___gte != null) {
            joiner.add("data_ultimo_HbsAg_pre_arr___gte: " + GraphQLRequestSerializer.getEntry(data_ultimo_HbsAg_pre_arr___gte));
        }
        if (data_ultimo_drop___eq != null) {
            joiner.add("data_ultimo_drop___eq: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___eq));
        }
        if (data_ultimo_drop___ne != null) {
            joiner.add("data_ultimo_drop___ne: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___ne));
        }
        if (data_ultimo_drop___null != null) {
            joiner.add("data_ultimo_drop___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___null));
        }
        if (data_ultimo_drop___not___null != null) {
            joiner.add("data_ultimo_drop___not___null: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___not___null));
        }
        if (data_ultimo_drop___in != null) {
            joiner.add("data_ultimo_drop___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___in));
        }
        if (data_ultimo_drop___not___in != null) {
            joiner.add("data_ultimo_drop___not___in: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___not___in));
        }
        if (data_ultimo_drop___lt != null) {
            joiner.add("data_ultimo_drop___lt: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___lt));
        }
        if (data_ultimo_drop___lte != null) {
            joiner.add("data_ultimo_drop___lte: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___lte));
        }
        if (data_ultimo_drop___gt != null) {
            joiner.add("data_ultimo_drop___gt: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___gt));
        }
        if (data_ultimo_drop___gte != null) {
            joiner.add("data_ultimo_drop___gte: " + GraphQLRequestSerializer.getEntry(data_ultimo_drop___gte));
        }
        if (date_longicona___eq != null) {
            joiner.add("date_longicona___eq: " + GraphQLRequestSerializer.getEntry(date_longicona___eq));
        }
        if (date_longicona___ne != null) {
            joiner.add("date_longicona___ne: " + GraphQLRequestSerializer.getEntry(date_longicona___ne));
        }
        if (date_longicona___null != null) {
            joiner.add("date_longicona___null: " + GraphQLRequestSerializer.getEntry(date_longicona___null));
        }
        if (date_longicona___not___null != null) {
            joiner.add("date_longicona___not___null: " + GraphQLRequestSerializer.getEntry(date_longicona___not___null));
        }
        if (date_longicona___in != null) {
            joiner.add("date_longicona___in: " + GraphQLRequestSerializer.getEntry(date_longicona___in));
        }
        if (date_longicona___not___in != null) {
            joiner.add("date_longicona___not___in: " + GraphQLRequestSerializer.getEntry(date_longicona___not___in));
        }
        if (date_longicona___lt != null) {
            joiner.add("date_longicona___lt: " + GraphQLRequestSerializer.getEntry(date_longicona___lt));
        }
        if (date_longicona___lte != null) {
            joiner.add("date_longicona___lte: " + GraphQLRequestSerializer.getEntry(date_longicona___lte));
        }
        if (date_longicona___gt != null) {
            joiner.add("date_longicona___gt: " + GraphQLRequestSerializer.getEntry(date_longicona___gt));
        }
        if (date_longicona___gte != null) {
            joiner.add("date_longicona___gte: " + GraphQLRequestSerializer.getEntry(date_longicona___gte));
        }
        if (date_longicona___contains != null) {
            joiner.add("date_longicona___contains: " + GraphQLRequestSerializer.getEntry(date_longicona___contains));
        }
        if (date_longicona___not___contains != null) {
            joiner.add("date_longicona___not___contains: " + GraphQLRequestSerializer.getEntry(date_longicona___not___contains));
        }
        if (date_longicona___starts_with != null) {
            joiner.add("date_longicona___starts_with: " + GraphQLRequestSerializer.getEntry(date_longicona___starts_with));
        }
        if (date_longicona___not___starts_with != null) {
            joiner.add("date_longicona___not___starts_with: " + GraphQLRequestSerializer.getEntry(date_longicona___not___starts_with));
        }
        if (date_longicona___ends_with != null) {
            joiner.add("date_longicona___ends_with: " + GraphQLRequestSerializer.getEntry(date_longicona___ends_with));
        }
        if (date_longicona___not___ends_with != null) {
            joiner.add("date_longicona___not___ends_with: " + GraphQLRequestSerializer.getEntry(date_longicona___not___ends_with));
        }
        if (dtg___eq != null) {
            joiner.add("dtg___eq: " + GraphQLRequestSerializer.getEntry(dtg___eq));
        }
        if (dtg___ne != null) {
            joiner.add("dtg___ne: " + GraphQLRequestSerializer.getEntry(dtg___ne));
        }
        if (dtg___null != null) {
            joiner.add("dtg___null: " + GraphQLRequestSerializer.getEntry(dtg___null));
        }
        if (dtg___not___null != null) {
            joiner.add("dtg___not___null: " + GraphQLRequestSerializer.getEntry(dtg___not___null));
        }
        if (esito_ultima_terapia___eq != null) {
            joiner.add("esito_ultima_terapia___eq: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___eq));
        }
        if (esito_ultima_terapia___ne != null) {
            joiner.add("esito_ultima_terapia___ne: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___ne));
        }
        if (esito_ultima_terapia___null != null) {
            joiner.add("esito_ultima_terapia___null: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___null));
        }
        if (esito_ultima_terapia___not___null != null) {
            joiner.add("esito_ultima_terapia___not___null: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___not___null));
        }
        if (esito_ultima_terapia___in != null) {
            joiner.add("esito_ultima_terapia___in: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___in));
        }
        if (esito_ultima_terapia___not___in != null) {
            joiner.add("esito_ultima_terapia___not___in: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___not___in));
        }
        if (esito_ultima_terapia___lt != null) {
            joiner.add("esito_ultima_terapia___lt: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___lt));
        }
        if (esito_ultima_terapia___lte != null) {
            joiner.add("esito_ultima_terapia___lte: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___lte));
        }
        if (esito_ultima_terapia___gt != null) {
            joiner.add("esito_ultima_terapia___gt: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___gt));
        }
        if (esito_ultima_terapia___gte != null) {
            joiner.add("esito_ultima_terapia___gte: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___gte));
        }
        if (esito_ultima_terapia___contains != null) {
            joiner.add("esito_ultima_terapia___contains: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___contains));
        }
        if (esito_ultima_terapia___not___contains != null) {
            joiner.add("esito_ultima_terapia___not___contains: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___not___contains));
        }
        if (esito_ultima_terapia___starts_with != null) {
            joiner.add("esito_ultima_terapia___starts_with: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___starts_with));
        }
        if (esito_ultima_terapia___not___starts_with != null) {
            joiner.add("esito_ultima_terapia___not___starts_with: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___not___starts_with));
        }
        if (esito_ultima_terapia___ends_with != null) {
            joiner.add("esito_ultima_terapia___ends_with: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___ends_with));
        }
        if (esito_ultima_terapia___not___ends_with != null) {
            joiner.add("esito_ultima_terapia___not___ends_with: " + GraphQLRequestSerializer.getEntry(esito_ultima_terapia___not___ends_with));
        }
        if (eta_arruolamento___eq != null) {
            joiner.add("eta_arruolamento___eq: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___eq));
        }
        if (eta_arruolamento___ne != null) {
            joiner.add("eta_arruolamento___ne: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___ne));
        }
        if (eta_arruolamento___null != null) {
            joiner.add("eta_arruolamento___null: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___null));
        }
        if (eta_arruolamento___not___null != null) {
            joiner.add("eta_arruolamento___not___null: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___not___null));
        }
        if (eta_arruolamento___in != null) {
            joiner.add("eta_arruolamento___in: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___in));
        }
        if (eta_arruolamento___not___in != null) {
            joiner.add("eta_arruolamento___not___in: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___not___in));
        }
        if (eta_arruolamento___lt != null) {
            joiner.add("eta_arruolamento___lt: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___lt));
        }
        if (eta_arruolamento___lte != null) {
            joiner.add("eta_arruolamento___lte: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___lte));
        }
        if (eta_arruolamento___gt != null) {
            joiner.add("eta_arruolamento___gt: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___gt));
        }
        if (eta_arruolamento___gte != null) {
            joiner.add("eta_arruolamento___gte: " + GraphQLRequestSerializer.getEntry(eta_arruolamento___gte));
        }
        if (eta_prima_visita___eq != null) {
            joiner.add("eta_prima_visita___eq: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___eq));
        }
        if (eta_prima_visita___ne != null) {
            joiner.add("eta_prima_visita___ne: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___ne));
        }
        if (eta_prima_visita___null != null) {
            joiner.add("eta_prima_visita___null: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___null));
        }
        if (eta_prima_visita___not___null != null) {
            joiner.add("eta_prima_visita___not___null: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___not___null));
        }
        if (eta_prima_visita___in != null) {
            joiner.add("eta_prima_visita___in: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___in));
        }
        if (eta_prima_visita___not___in != null) {
            joiner.add("eta_prima_visita___not___in: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___not___in));
        }
        if (eta_prima_visita___lt != null) {
            joiner.add("eta_prima_visita___lt: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___lt));
        }
        if (eta_prima_visita___lte != null) {
            joiner.add("eta_prima_visita___lte: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___lte));
        }
        if (eta_prima_visita___gt != null) {
            joiner.add("eta_prima_visita___gt: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___gt));
        }
        if (eta_prima_visita___gte != null) {
            joiner.add("eta_prima_visita___gte: " + GraphQLRequestSerializer.getEntry(eta_prima_visita___gte));
        }
        if (etnia____eq != null) {
            joiner.add("etnia____eq: " + GraphQLRequestSerializer.getEntry(etnia____eq));
        }
        if (etnia____ne != null) {
            joiner.add("etnia____ne: " + GraphQLRequestSerializer.getEntry(etnia____ne));
        }
        if (etnia____null != null) {
            joiner.add("etnia____null: " + GraphQLRequestSerializer.getEntry(etnia____null));
        }
        if (etnia____not___null != null) {
            joiner.add("etnia____not___null: " + GraphQLRequestSerializer.getEntry(etnia____not___null));
        }
        if (etnia____in != null) {
            joiner.add("etnia____in: " + GraphQLRequestSerializer.getEntry(etnia____in));
        }
        if (etnia____not___in != null) {
            joiner.add("etnia____not___in: " + GraphQLRequestSerializer.getEntry(etnia____not___in));
        }
        if (etnia____lt != null) {
            joiner.add("etnia____lt: " + GraphQLRequestSerializer.getEntry(etnia____lt));
        }
        if (etnia____lte != null) {
            joiner.add("etnia____lte: " + GraphQLRequestSerializer.getEntry(etnia____lte));
        }
        if (etnia____gt != null) {
            joiner.add("etnia____gt: " + GraphQLRequestSerializer.getEntry(etnia____gt));
        }
        if (etnia____gte != null) {
            joiner.add("etnia____gte: " + GraphQLRequestSerializer.getEntry(etnia____gte));
        }
        if (etnia____contains != null) {
            joiner.add("etnia____contains: " + GraphQLRequestSerializer.getEntry(etnia____contains));
        }
        if (etnia____not___contains != null) {
            joiner.add("etnia____not___contains: " + GraphQLRequestSerializer.getEntry(etnia____not___contains));
        }
        if (etnia____starts_with != null) {
            joiner.add("etnia____starts_with: " + GraphQLRequestSerializer.getEntry(etnia____starts_with));
        }
        if (etnia____not___starts_with != null) {
            joiner.add("etnia____not___starts_with: " + GraphQLRequestSerializer.getEntry(etnia____not___starts_with));
        }
        if (etnia____ends_with != null) {
            joiner.add("etnia____ends_with: " + GraphQLRequestSerializer.getEntry(etnia____ends_with));
        }
        if (etnia____not___ends_with != null) {
            joiner.add("etnia____not___ends_with: " + GraphQLRequestSerializer.getEntry(etnia____not___ends_with));
        }
        if (fattore_di_rischio____eq != null) {
            joiner.add("fattore_di_rischio____eq: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____eq));
        }
        if (fattore_di_rischio____ne != null) {
            joiner.add("fattore_di_rischio____ne: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____ne));
        }
        if (fattore_di_rischio____null != null) {
            joiner.add("fattore_di_rischio____null: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____null));
        }
        if (fattore_di_rischio____not___null != null) {
            joiner.add("fattore_di_rischio____not___null: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____not___null));
        }
        if (fattore_di_rischio____in != null) {
            joiner.add("fattore_di_rischio____in: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____in));
        }
        if (fattore_di_rischio____not___in != null) {
            joiner.add("fattore_di_rischio____not___in: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____not___in));
        }
        if (fattore_di_rischio____lt != null) {
            joiner.add("fattore_di_rischio____lt: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____lt));
        }
        if (fattore_di_rischio____lte != null) {
            joiner.add("fattore_di_rischio____lte: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____lte));
        }
        if (fattore_di_rischio____gt != null) {
            joiner.add("fattore_di_rischio____gt: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____gt));
        }
        if (fattore_di_rischio____gte != null) {
            joiner.add("fattore_di_rischio____gte: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____gte));
        }
        if (fattore_di_rischio____contains != null) {
            joiner.add("fattore_di_rischio____contains: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____contains));
        }
        if (fattore_di_rischio____not___contains != null) {
            joiner.add("fattore_di_rischio____not___contains: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____not___contains));
        }
        if (fattore_di_rischio____starts_with != null) {
            joiner.add("fattore_di_rischio____starts_with: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____starts_with));
        }
        if (fattore_di_rischio____not___starts_with != null) {
            joiner.add("fattore_di_rischio____not___starts_with: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____not___starts_with));
        }
        if (fattore_di_rischio____ends_with != null) {
            joiner.add("fattore_di_rischio____ends_with: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____ends_with));
        }
        if (fattore_di_rischio____not___ends_with != null) {
            joiner.add("fattore_di_rischio____not___ends_with: " + GraphQLRequestSerializer.getEntry(fattore_di_rischio____not___ends_with));
        }
        if (fibroscan___eq != null) {
            joiner.add("fibroscan___eq: " + GraphQLRequestSerializer.getEntry(fibroscan___eq));
        }
        if (fibroscan___ne != null) {
            joiner.add("fibroscan___ne: " + GraphQLRequestSerializer.getEntry(fibroscan___ne));
        }
        if (fibroscan___null != null) {
            joiner.add("fibroscan___null: " + GraphQLRequestSerializer.getEntry(fibroscan___null));
        }
        if (fibroscan___not___null != null) {
            joiner.add("fibroscan___not___null: " + GraphQLRequestSerializer.getEntry(fibroscan___not___null));
        }
        if (hbsag_pos___eq != null) {
            joiner.add("hbsag_pos___eq: " + GraphQLRequestSerializer.getEntry(hbsag_pos___eq));
        }
        if (hbsag_pos___ne != null) {
            joiner.add("hbsag_pos___ne: " + GraphQLRequestSerializer.getEntry(hbsag_pos___ne));
        }
        if (hbsag_pos___null != null) {
            joiner.add("hbsag_pos___null: " + GraphQLRequestSerializer.getEntry(hbsag_pos___null));
        }
        if (hbsag_pos___not___null != null) {
            joiner.add("hbsag_pos___not___null: " + GraphQLRequestSerializer.getEntry(hbsag_pos___not___null));
        }
        if (hcvab_pos___eq != null) {
            joiner.add("hcvab_pos___eq: " + GraphQLRequestSerializer.getEntry(hcvab_pos___eq));
        }
        if (hcvab_pos___ne != null) {
            joiner.add("hcvab_pos___ne: " + GraphQLRequestSerializer.getEntry(hcvab_pos___ne));
        }
        if (hcvab_pos___null != null) {
            joiner.add("hcvab_pos___null: " + GraphQLRequestSerializer.getEntry(hcvab_pos___null));
        }
        if (hcvab_pos___not___null != null) {
            joiner.add("hcvab_pos___not___null: " + GraphQLRequestSerializer.getEntry(hcvab_pos___not___null));
        }
        if (hla_b5701___eq != null) {
            joiner.add("hla_b5701___eq: " + GraphQLRequestSerializer.getEntry(hla_b5701___eq));
        }
        if (hla_b5701___ne != null) {
            joiner.add("hla_b5701___ne: " + GraphQLRequestSerializer.getEntry(hla_b5701___ne));
        }
        if (hla_b5701___null != null) {
            joiner.add("hla_b5701___null: " + GraphQLRequestSerializer.getEntry(hla_b5701___null));
        }
        if (hla_b5701___not___null != null) {
            joiner.add("hla_b5701___not___null: " + GraphQLRequestSerializer.getEntry(hla_b5701___not___null));
        }
        if (hla_b5701___in != null) {
            joiner.add("hla_b5701___in: " + GraphQLRequestSerializer.getEntry(hla_b5701___in));
        }
        if (hla_b5701___not___in != null) {
            joiner.add("hla_b5701___not___in: " + GraphQLRequestSerializer.getEntry(hla_b5701___not___in));
        }
        if (hla_b5701___lt != null) {
            joiner.add("hla_b5701___lt: " + GraphQLRequestSerializer.getEntry(hla_b5701___lt));
        }
        if (hla_b5701___lte != null) {
            joiner.add("hla_b5701___lte: " + GraphQLRequestSerializer.getEntry(hla_b5701___lte));
        }
        if (hla_b5701___gt != null) {
            joiner.add("hla_b5701___gt: " + GraphQLRequestSerializer.getEntry(hla_b5701___gt));
        }
        if (hla_b5701___gte != null) {
            joiner.add("hla_b5701___gte: " + GraphQLRequestSerializer.getEntry(hla_b5701___gte));
        }
        if (hla_b5701___contains != null) {
            joiner.add("hla_b5701___contains: " + GraphQLRequestSerializer.getEntry(hla_b5701___contains));
        }
        if (hla_b5701___not___contains != null) {
            joiner.add("hla_b5701___not___contains: " + GraphQLRequestSerializer.getEntry(hla_b5701___not___contains));
        }
        if (hla_b5701___starts_with != null) {
            joiner.add("hla_b5701___starts_with: " + GraphQLRequestSerializer.getEntry(hla_b5701___starts_with));
        }
        if (hla_b5701___not___starts_with != null) {
            joiner.add("hla_b5701___not___starts_with: " + GraphQLRequestSerializer.getEntry(hla_b5701___not___starts_with));
        }
        if (hla_b5701___ends_with != null) {
            joiner.add("hla_b5701___ends_with: " + GraphQLRequestSerializer.getEntry(hla_b5701___ends_with));
        }
        if (hla_b5701___not___ends_with != null) {
            joiner.add("hla_b5701___not___ends_with: " + GraphQLRequestSerializer.getEntry(hla_b5701___not___ends_with));
        }
        if (hla_b5701_bool___eq != null) {
            joiner.add("hla_b5701_bool___eq: " + GraphQLRequestSerializer.getEntry(hla_b5701_bool___eq));
        }
        if (hla_b5701_bool___ne != null) {
            joiner.add("hla_b5701_bool___ne: " + GraphQLRequestSerializer.getEntry(hla_b5701_bool___ne));
        }
        if (hla_b5701_bool___null != null) {
            joiner.add("hla_b5701_bool___null: " + GraphQLRequestSerializer.getEntry(hla_b5701_bool___null));
        }
        if (hla_b5701_bool___not___null != null) {
            joiner.add("hla_b5701_bool___not___null: " + GraphQLRequestSerializer.getEntry(hla_b5701_bool___not___null));
        }
        if (id_paziente___eq != null) {
            joiner.add("id_paziente___eq: " + GraphQLRequestSerializer.getEntry(id_paziente___eq));
        }
        if (id_paziente___ne != null) {
            joiner.add("id_paziente___ne: " + GraphQLRequestSerializer.getEntry(id_paziente___ne));
        }
        if (id_paziente___null != null) {
            joiner.add("id_paziente___null: " + GraphQLRequestSerializer.getEntry(id_paziente___null));
        }
        if (id_paziente___not___null != null) {
            joiner.add("id_paziente___not___null: " + GraphQLRequestSerializer.getEntry(id_paziente___not___null));
        }
        if (id_paziente___in != null) {
            joiner.add("id_paziente___in: " + GraphQLRequestSerializer.getEntry(id_paziente___in));
        }
        if (id_paziente___not___in != null) {
            joiner.add("id_paziente___not___in: " + GraphQLRequestSerializer.getEntry(id_paziente___not___in));
        }
        if (id_paziente___lt != null) {
            joiner.add("id_paziente___lt: " + GraphQLRequestSerializer.getEntry(id_paziente___lt));
        }
        if (id_paziente___lte != null) {
            joiner.add("id_paziente___lte: " + GraphQLRequestSerializer.getEntry(id_paziente___lte));
        }
        if (id_paziente___gt != null) {
            joiner.add("id_paziente___gt: " + GraphQLRequestSerializer.getEntry(id_paziente___gt));
        }
        if (id_paziente___gte != null) {
            joiner.add("id_paziente___gte: " + GraphQLRequestSerializer.getEntry(id_paziente___gte));
        }
        if (ifn___eq != null) {
            joiner.add("ifn___eq: " + GraphQLRequestSerializer.getEntry(ifn___eq));
        }
        if (ifn___ne != null) {
            joiner.add("ifn___ne: " + GraphQLRequestSerializer.getEntry(ifn___ne));
        }
        if (ifn___null != null) {
            joiner.add("ifn___null: " + GraphQLRequestSerializer.getEntry(ifn___null));
        }
        if (ifn___not___null != null) {
            joiner.add("ifn___not___null: " + GraphQLRequestSerializer.getEntry(ifn___not___null));
        }
        if (in_italia_da_anni___eq != null) {
            joiner.add("in_italia_da_anni___eq: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___eq));
        }
        if (in_italia_da_anni___ne != null) {
            joiner.add("in_italia_da_anni___ne: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___ne));
        }
        if (in_italia_da_anni___null != null) {
            joiner.add("in_italia_da_anni___null: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___null));
        }
        if (in_italia_da_anni___not___null != null) {
            joiner.add("in_italia_da_anni___not___null: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___not___null));
        }
        if (in_italia_da_anni___in != null) {
            joiner.add("in_italia_da_anni___in: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___in));
        }
        if (in_italia_da_anni___not___in != null) {
            joiner.add("in_italia_da_anni___not___in: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___not___in));
        }
        if (in_italia_da_anni___lt != null) {
            joiner.add("in_italia_da_anni___lt: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___lt));
        }
        if (in_italia_da_anni___lte != null) {
            joiner.add("in_italia_da_anni___lte: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___lte));
        }
        if (in_italia_da_anni___gt != null) {
            joiner.add("in_italia_da_anni___gt: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___gt));
        }
        if (in_italia_da_anni___gte != null) {
            joiner.add("in_italia_da_anni___gte: " + GraphQLRequestSerializer.getEntry(in_italia_da_anni___gte));
        }
        if (nascita___eq != null) {
            joiner.add("nascita___eq: " + GraphQLRequestSerializer.getEntry(nascita___eq));
        }
        if (nascita___ne != null) {
            joiner.add("nascita___ne: " + GraphQLRequestSerializer.getEntry(nascita___ne));
        }
        if (nascita___null != null) {
            joiner.add("nascita___null: " + GraphQLRequestSerializer.getEntry(nascita___null));
        }
        if (nascita___not___null != null) {
            joiner.add("nascita___not___null: " + GraphQLRequestSerializer.getEntry(nascita___not___null));
        }
        if (nascita___in != null) {
            joiner.add("nascita___in: " + GraphQLRequestSerializer.getEntry(nascita___in));
        }
        if (nascita___not___in != null) {
            joiner.add("nascita___not___in: " + GraphQLRequestSerializer.getEntry(nascita___not___in));
        }
        if (nascita___lt != null) {
            joiner.add("nascita___lt: " + GraphQLRequestSerializer.getEntry(nascita___lt));
        }
        if (nascita___lte != null) {
            joiner.add("nascita___lte: " + GraphQLRequestSerializer.getEntry(nascita___lte));
        }
        if (nascita___gt != null) {
            joiner.add("nascita___gt: " + GraphQLRequestSerializer.getEntry(nascita___gt));
        }
        if (nascita___gte != null) {
            joiner.add("nascita___gte: " + GraphQLRequestSerializer.getEntry(nascita___gte));
        }
        if (nazionalita____eq != null) {
            joiner.add("nazionalita____eq: " + GraphQLRequestSerializer.getEntry(nazionalita____eq));
        }
        if (nazionalita____ne != null) {
            joiner.add("nazionalita____ne: " + GraphQLRequestSerializer.getEntry(nazionalita____ne));
        }
        if (nazionalita____null != null) {
            joiner.add("nazionalita____null: " + GraphQLRequestSerializer.getEntry(nazionalita____null));
        }
        if (nazionalita____not___null != null) {
            joiner.add("nazionalita____not___null: " + GraphQLRequestSerializer.getEntry(nazionalita____not___null));
        }
        if (nazionalita____in != null) {
            joiner.add("nazionalita____in: " + GraphQLRequestSerializer.getEntry(nazionalita____in));
        }
        if (nazionalita____not___in != null) {
            joiner.add("nazionalita____not___in: " + GraphQLRequestSerializer.getEntry(nazionalita____not___in));
        }
        if (nazionalita____lt != null) {
            joiner.add("nazionalita____lt: " + GraphQLRequestSerializer.getEntry(nazionalita____lt));
        }
        if (nazionalita____lte != null) {
            joiner.add("nazionalita____lte: " + GraphQLRequestSerializer.getEntry(nazionalita____lte));
        }
        if (nazionalita____gt != null) {
            joiner.add("nazionalita____gt: " + GraphQLRequestSerializer.getEntry(nazionalita____gt));
        }
        if (nazionalita____gte != null) {
            joiner.add("nazionalita____gte: " + GraphQLRequestSerializer.getEntry(nazionalita____gte));
        }
        if (nazionalita____contains != null) {
            joiner.add("nazionalita____contains: " + GraphQLRequestSerializer.getEntry(nazionalita____contains));
        }
        if (nazionalita____not___contains != null) {
            joiner.add("nazionalita____not___contains: " + GraphQLRequestSerializer.getEntry(nazionalita____not___contains));
        }
        if (nazionalita____starts_with != null) {
            joiner.add("nazionalita____starts_with: " + GraphQLRequestSerializer.getEntry(nazionalita____starts_with));
        }
        if (nazionalita____not___starts_with != null) {
            joiner.add("nazionalita____not___starts_with: " + GraphQLRequestSerializer.getEntry(nazionalita____not___starts_with));
        }
        if (nazionalita____ends_with != null) {
            joiner.add("nazionalita____ends_with: " + GraphQLRequestSerializer.getEntry(nazionalita____ends_with));
        }
        if (nazionalita____not___ends_with != null) {
            joiner.add("nazionalita____not___ends_with: " + GraphQLRequestSerializer.getEntry(nazionalita____not___ends_with));
        }
        if (nazione___eq != null) {
            joiner.add("nazione___eq: " + GraphQLRequestSerializer.getEntry(nazione___eq));
        }
        if (nazione___ne != null) {
            joiner.add("nazione___ne: " + GraphQLRequestSerializer.getEntry(nazione___ne));
        }
        if (nazione___null != null) {
            joiner.add("nazione___null: " + GraphQLRequestSerializer.getEntry(nazione___null));
        }
        if (nazione___not___null != null) {
            joiner.add("nazione___not___null: " + GraphQLRequestSerializer.getEntry(nazione___not___null));
        }
        if (nazione___in != null) {
            joiner.add("nazione___in: " + GraphQLRequestSerializer.getEntry(nazione___in));
        }
        if (nazione___not___in != null) {
            joiner.add("nazione___not___in: " + GraphQLRequestSerializer.getEntry(nazione___not___in));
        }
        if (nazione___lt != null) {
            joiner.add("nazione___lt: " + GraphQLRequestSerializer.getEntry(nazione___lt));
        }
        if (nazione___lte != null) {
            joiner.add("nazione___lte: " + GraphQLRequestSerializer.getEntry(nazione___lte));
        }
        if (nazione___gt != null) {
            joiner.add("nazione___gt: " + GraphQLRequestSerializer.getEntry(nazione___gt));
        }
        if (nazione___gte != null) {
            joiner.add("nazione___gte: " + GraphQLRequestSerializer.getEntry(nazione___gte));
        }
        if (nazione___contains != null) {
            joiner.add("nazione___contains: " + GraphQLRequestSerializer.getEntry(nazione___contains));
        }
        if (nazione___not___contains != null) {
            joiner.add("nazione___not___contains: " + GraphQLRequestSerializer.getEntry(nazione___not___contains));
        }
        if (nazione___starts_with != null) {
            joiner.add("nazione___starts_with: " + GraphQLRequestSerializer.getEntry(nazione___starts_with));
        }
        if (nazione___not___starts_with != null) {
            joiner.add("nazione___not___starts_with: " + GraphQLRequestSerializer.getEntry(nazione___not___starts_with));
        }
        if (nazione___ends_with != null) {
            joiner.add("nazione___ends_with: " + GraphQLRequestSerializer.getEntry(nazione___ends_with));
        }
        if (nazione___not___ends_with != null) {
            joiner.add("nazione___not___ends_with: " + GraphQLRequestSerializer.getEntry(nazione___not___ends_with));
        }
        if (noco___eq != null) {
            joiner.add("noco___eq: " + GraphQLRequestSerializer.getEntry(noco___eq));
        }
        if (noco___ne != null) {
            joiner.add("noco___ne: " + GraphQLRequestSerializer.getEntry(noco___ne));
        }
        if (noco___null != null) {
            joiner.add("noco___null: " + GraphQLRequestSerializer.getEntry(noco___null));
        }
        if (noco___not___null != null) {
            joiner.add("noco___not___null: " + GraphQLRequestSerializer.getEntry(noco___not___null));
        }
        if (nome___eq != null) {
            joiner.add("nome___eq: " + GraphQLRequestSerializer.getEntry(nome___eq));
        }
        if (nome___ne != null) {
            joiner.add("nome___ne: " + GraphQLRequestSerializer.getEntry(nome___ne));
        }
        if (nome___null != null) {
            joiner.add("nome___null: " + GraphQLRequestSerializer.getEntry(nome___null));
        }
        if (nome___not___null != null) {
            joiner.add("nome___not___null: " + GraphQLRequestSerializer.getEntry(nome___not___null));
        }
        if (nome___in != null) {
            joiner.add("nome___in: " + GraphQLRequestSerializer.getEntry(nome___in));
        }
        if (nome___not___in != null) {
            joiner.add("nome___not___in: " + GraphQLRequestSerializer.getEntry(nome___not___in));
        }
        if (nome___lt != null) {
            joiner.add("nome___lt: " + GraphQLRequestSerializer.getEntry(nome___lt));
        }
        if (nome___lte != null) {
            joiner.add("nome___lte: " + GraphQLRequestSerializer.getEntry(nome___lte));
        }
        if (nome___gt != null) {
            joiner.add("nome___gt: " + GraphQLRequestSerializer.getEntry(nome___gt));
        }
        if (nome___gte != null) {
            joiner.add("nome___gte: " + GraphQLRequestSerializer.getEntry(nome___gte));
        }
        if (nome___contains != null) {
            joiner.add("nome___contains: " + GraphQLRequestSerializer.getEntry(nome___contains));
        }
        if (nome___not___contains != null) {
            joiner.add("nome___not___contains: " + GraphQLRequestSerializer.getEntry(nome___not___contains));
        }
        if (nome___starts_with != null) {
            joiner.add("nome___starts_with: " + GraphQLRequestSerializer.getEntry(nome___starts_with));
        }
        if (nome___not___starts_with != null) {
            joiner.add("nome___not___starts_with: " + GraphQLRequestSerializer.getEntry(nome___not___starts_with));
        }
        if (nome___ends_with != null) {
            joiner.add("nome___ends_with: " + GraphQLRequestSerializer.getEntry(nome___ends_with));
        }
        if (nome___not___ends_with != null) {
            joiner.add("nome___not___ends_with: " + GraphQLRequestSerializer.getEntry(nome___not___ends_with));
        }
        if (note_terapia___eq != null) {
            joiner.add("note_terapia___eq: " + GraphQLRequestSerializer.getEntry(note_terapia___eq));
        }
        if (note_terapia___ne != null) {
            joiner.add("note_terapia___ne: " + GraphQLRequestSerializer.getEntry(note_terapia___ne));
        }
        if (note_terapia___null != null) {
            joiner.add("note_terapia___null: " + GraphQLRequestSerializer.getEntry(note_terapia___null));
        }
        if (note_terapia___not___null != null) {
            joiner.add("note_terapia___not___null: " + GraphQLRequestSerializer.getEntry(note_terapia___not___null));
        }
        if (note_terapia___in != null) {
            joiner.add("note_terapia___in: " + GraphQLRequestSerializer.getEntry(note_terapia___in));
        }
        if (note_terapia___not___in != null) {
            joiner.add("note_terapia___not___in: " + GraphQLRequestSerializer.getEntry(note_terapia___not___in));
        }
        if (note_terapia___lt != null) {
            joiner.add("note_terapia___lt: " + GraphQLRequestSerializer.getEntry(note_terapia___lt));
        }
        if (note_terapia___lte != null) {
            joiner.add("note_terapia___lte: " + GraphQLRequestSerializer.getEntry(note_terapia___lte));
        }
        if (note_terapia___gt != null) {
            joiner.add("note_terapia___gt: " + GraphQLRequestSerializer.getEntry(note_terapia___gt));
        }
        if (note_terapia___gte != null) {
            joiner.add("note_terapia___gte: " + GraphQLRequestSerializer.getEntry(note_terapia___gte));
        }
        if (note_terapia___contains != null) {
            joiner.add("note_terapia___contains: " + GraphQLRequestSerializer.getEntry(note_terapia___contains));
        }
        if (note_terapia___not___contains != null) {
            joiner.add("note_terapia___not___contains: " + GraphQLRequestSerializer.getEntry(note_terapia___not___contains));
        }
        if (note_terapia___starts_with != null) {
            joiner.add("note_terapia___starts_with: " + GraphQLRequestSerializer.getEntry(note_terapia___starts_with));
        }
        if (note_terapia___not___starts_with != null) {
            joiner.add("note_terapia___not___starts_with: " + GraphQLRequestSerializer.getEntry(note_terapia___not___starts_with));
        }
        if (note_terapia___ends_with != null) {
            joiner.add("note_terapia___ends_with: " + GraphQLRequestSerializer.getEntry(note_terapia___ends_with));
        }
        if (note_terapia___not___ends_with != null) {
            joiner.add("note_terapia___not___ends_with: " + GraphQLRequestSerializer.getEntry(note_terapia___not___ends_with));
        }
        if (null_val___eq != null) {
            joiner.add("null_val___eq: " + GraphQLRequestSerializer.getEntry(null_val___eq));
        }
        if (null_val___ne != null) {
            joiner.add("null_val___ne: " + GraphQLRequestSerializer.getEntry(null_val___ne));
        }
        if (null_val___null != null) {
            joiner.add("null_val___null: " + GraphQLRequestSerializer.getEntry(null_val___null));
        }
        if (null_val___not___null != null) {
            joiner.add("null_val___not___null: " + GraphQLRequestSerializer.getEntry(null_val___not___null));
        }
        if (password_pro___eq != null) {
            joiner.add("password_pro___eq: " + GraphQLRequestSerializer.getEntry(password_pro___eq));
        }
        if (password_pro___ne != null) {
            joiner.add("password_pro___ne: " + GraphQLRequestSerializer.getEntry(password_pro___ne));
        }
        if (password_pro___null != null) {
            joiner.add("password_pro___null: " + GraphQLRequestSerializer.getEntry(password_pro___null));
        }
        if (password_pro___not___null != null) {
            joiner.add("password_pro___not___null: " + GraphQLRequestSerializer.getEntry(password_pro___not___null));
        }
        if (password_pro___in != null) {
            joiner.add("password_pro___in: " + GraphQLRequestSerializer.getEntry(password_pro___in));
        }
        if (password_pro___not___in != null) {
            joiner.add("password_pro___not___in: " + GraphQLRequestSerializer.getEntry(password_pro___not___in));
        }
        if (password_pro___lt != null) {
            joiner.add("password_pro___lt: " + GraphQLRequestSerializer.getEntry(password_pro___lt));
        }
        if (password_pro___lte != null) {
            joiner.add("password_pro___lte: " + GraphQLRequestSerializer.getEntry(password_pro___lte));
        }
        if (password_pro___gt != null) {
            joiner.add("password_pro___gt: " + GraphQLRequestSerializer.getEntry(password_pro___gt));
        }
        if (password_pro___gte != null) {
            joiner.add("password_pro___gte: " + GraphQLRequestSerializer.getEntry(password_pro___gte));
        }
        if (password_pro___contains != null) {
            joiner.add("password_pro___contains: " + GraphQLRequestSerializer.getEntry(password_pro___contains));
        }
        if (password_pro___not___contains != null) {
            joiner.add("password_pro___not___contains: " + GraphQLRequestSerializer.getEntry(password_pro___not___contains));
        }
        if (password_pro___starts_with != null) {
            joiner.add("password_pro___starts_with: " + GraphQLRequestSerializer.getEntry(password_pro___starts_with));
        }
        if (password_pro___not___starts_with != null) {
            joiner.add("password_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(password_pro___not___starts_with));
        }
        if (password_pro___ends_with != null) {
            joiner.add("password_pro___ends_with: " + GraphQLRequestSerializer.getEntry(password_pro___ends_with));
        }
        if (password_pro___not___ends_with != null) {
            joiner.add("password_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(password_pro___not___ends_with));
        }
        if (pegifn___eq != null) {
            joiner.add("pegifn___eq: " + GraphQLRequestSerializer.getEntry(pegifn___eq));
        }
        if (pegifn___ne != null) {
            joiner.add("pegifn___ne: " + GraphQLRequestSerializer.getEntry(pegifn___ne));
        }
        if (pegifn___null != null) {
            joiner.add("pegifn___null: " + GraphQLRequestSerializer.getEntry(pegifn___null));
        }
        if (pegifn___not___null != null) {
            joiner.add("pegifn___not___null: " + GraphQLRequestSerializer.getEntry(pegifn___not___null));
        }
        if (pregresse_terapie_anti_hcv___eq != null) {
            joiner.add("pregresse_terapie_anti_hcv___eq: " + GraphQLRequestSerializer.getEntry(pregresse_terapie_anti_hcv___eq));
        }
        if (pregresse_terapie_anti_hcv___ne != null) {
            joiner.add("pregresse_terapie_anti_hcv___ne: " + GraphQLRequestSerializer.getEntry(pregresse_terapie_anti_hcv___ne));
        }
        if (pregresse_terapie_anti_hcv___null != null) {
            joiner.add("pregresse_terapie_anti_hcv___null: " + GraphQLRequestSerializer.getEntry(pregresse_terapie_anti_hcv___null));
        }
        if (pregresse_terapie_anti_hcv___not___null != null) {
            joiner.add("pregresse_terapie_anti_hcv___not___null: " + GraphQLRequestSerializer.getEntry(pregresse_terapie_anti_hcv___not___null));
        }
        if (pro___eq != null) {
            joiner.add("pro___eq: " + GraphQLRequestSerializer.getEntry(pro___eq));
        }
        if (pro___ne != null) {
            joiner.add("pro___ne: " + GraphQLRequestSerializer.getEntry(pro___ne));
        }
        if (pro___null != null) {
            joiner.add("pro___null: " + GraphQLRequestSerializer.getEntry(pro___null));
        }
        if (pro___not___null != null) {
            joiner.add("pro___not___null: " + GraphQLRequestSerializer.getEntry(pro___not___null));
        }
        if (ribavirina___eq != null) {
            joiner.add("ribavirina___eq: " + GraphQLRequestSerializer.getEntry(ribavirina___eq));
        }
        if (ribavirina___ne != null) {
            joiner.add("ribavirina___ne: " + GraphQLRequestSerializer.getEntry(ribavirina___ne));
        }
        if (ribavirina___null != null) {
            joiner.add("ribavirina___null: " + GraphQLRequestSerializer.getEntry(ribavirina___null));
        }
        if (ribavirina___not___null != null) {
            joiner.add("ribavirina___not___null: " + GraphQLRequestSerializer.getEntry(ribavirina___not___null));
        }
        if (risk_F___eq != null) {
            joiner.add("risk_F___eq: " + GraphQLRequestSerializer.getEntry(risk_F___eq));
        }
        if (risk_F___ne != null) {
            joiner.add("risk_F___ne: " + GraphQLRequestSerializer.getEntry(risk_F___ne));
        }
        if (risk_F___null != null) {
            joiner.add("risk_F___null: " + GraphQLRequestSerializer.getEntry(risk_F___null));
        }
        if (risk_F___not___null != null) {
            joiner.add("risk_F___not___null: " + GraphQLRequestSerializer.getEntry(risk_F___not___null));
        }
        if (sessione_pro___eq != null) {
            joiner.add("sessione_pro___eq: " + GraphQLRequestSerializer.getEntry(sessione_pro___eq));
        }
        if (sessione_pro___ne != null) {
            joiner.add("sessione_pro___ne: " + GraphQLRequestSerializer.getEntry(sessione_pro___ne));
        }
        if (sessione_pro___null != null) {
            joiner.add("sessione_pro___null: " + GraphQLRequestSerializer.getEntry(sessione_pro___null));
        }
        if (sessione_pro___not___null != null) {
            joiner.add("sessione_pro___not___null: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___null));
        }
        if (sessione_pro___in != null) {
            joiner.add("sessione_pro___in: " + GraphQLRequestSerializer.getEntry(sessione_pro___in));
        }
        if (sessione_pro___not___in != null) {
            joiner.add("sessione_pro___not___in: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___in));
        }
        if (sessione_pro___lt != null) {
            joiner.add("sessione_pro___lt: " + GraphQLRequestSerializer.getEntry(sessione_pro___lt));
        }
        if (sessione_pro___lte != null) {
            joiner.add("sessione_pro___lte: " + GraphQLRequestSerializer.getEntry(sessione_pro___lte));
        }
        if (sessione_pro___gt != null) {
            joiner.add("sessione_pro___gt: " + GraphQLRequestSerializer.getEntry(sessione_pro___gt));
        }
        if (sessione_pro___gte != null) {
            joiner.add("sessione_pro___gte: " + GraphQLRequestSerializer.getEntry(sessione_pro___gte));
        }
        if (sessione_pro___contains != null) {
            joiner.add("sessione_pro___contains: " + GraphQLRequestSerializer.getEntry(sessione_pro___contains));
        }
        if (sessione_pro___not___contains != null) {
            joiner.add("sessione_pro___not___contains: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___contains));
        }
        if (sessione_pro___starts_with != null) {
            joiner.add("sessione_pro___starts_with: " + GraphQLRequestSerializer.getEntry(sessione_pro___starts_with));
        }
        if (sessione_pro___not___starts_with != null) {
            joiner.add("sessione_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___starts_with));
        }
        if (sessione_pro___ends_with != null) {
            joiner.add("sessione_pro___ends_with: " + GraphQLRequestSerializer.getEntry(sessione_pro___ends_with));
        }
        if (sessione_pro___not___ends_with != null) {
            joiner.add("sessione_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(sessione_pro___not___ends_with));
        }
        if (sesso___eq != null) {
            joiner.add("sesso___eq: " + GraphQLRequestSerializer.getEntry(sesso___eq));
        }
        if (sesso___ne != null) {
            joiner.add("sesso___ne: " + GraphQLRequestSerializer.getEntry(sesso___ne));
        }
        if (sesso___null != null) {
            joiner.add("sesso___null: " + GraphQLRequestSerializer.getEntry(sesso___null));
        }
        if (sesso___not___null != null) {
            joiner.add("sesso___not___null: " + GraphQLRequestSerializer.getEntry(sesso___not___null));
        }
        if (sesso___in != null) {
            joiner.add("sesso___in: " + GraphQLRequestSerializer.getEntry(sesso___in));
        }
        if (sesso___not___in != null) {
            joiner.add("sesso___not___in: " + GraphQLRequestSerializer.getEntry(sesso___not___in));
        }
        if (sesso___lt != null) {
            joiner.add("sesso___lt: " + GraphQLRequestSerializer.getEntry(sesso___lt));
        }
        if (sesso___lte != null) {
            joiner.add("sesso___lte: " + GraphQLRequestSerializer.getEntry(sesso___lte));
        }
        if (sesso___gt != null) {
            joiner.add("sesso___gt: " + GraphQLRequestSerializer.getEntry(sesso___gt));
        }
        if (sesso___gte != null) {
            joiner.add("sesso___gte: " + GraphQLRequestSerializer.getEntry(sesso___gte));
        }
        if (sesso___contains != null) {
            joiner.add("sesso___contains: " + GraphQLRequestSerializer.getEntry(sesso___contains));
        }
        if (sesso___not___contains != null) {
            joiner.add("sesso___not___contains: " + GraphQLRequestSerializer.getEntry(sesso___not___contains));
        }
        if (sesso___starts_with != null) {
            joiner.add("sesso___starts_with: " + GraphQLRequestSerializer.getEntry(sesso___starts_with));
        }
        if (sesso___not___starts_with != null) {
            joiner.add("sesso___not___starts_with: " + GraphQLRequestSerializer.getEntry(sesso___not___starts_with));
        }
        if (sesso___ends_with != null) {
            joiner.add("sesso___ends_with: " + GraphQLRequestSerializer.getEntry(sesso___ends_with));
        }
        if (sesso___not___ends_with != null) {
            joiner.add("sesso___not___ends_with: " + GraphQLRequestSerializer.getEntry(sesso___not___ends_with));
        }
        if (stribild___eq != null) {
            joiner.add("stribild___eq: " + GraphQLRequestSerializer.getEntry(stribild___eq));
        }
        if (stribild___ne != null) {
            joiner.add("stribild___ne: " + GraphQLRequestSerializer.getEntry(stribild___ne));
        }
        if (stribild___null != null) {
            joiner.add("stribild___null: " + GraphQLRequestSerializer.getEntry(stribild___null));
        }
        if (stribild___not___null != null) {
            joiner.add("stribild___not___null: " + GraphQLRequestSerializer.getEntry(stribild___not___null));
        }
        if (studi_pro_abilitati___eq != null) {
            joiner.add("studi_pro_abilitati___eq: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___eq));
        }
        if (studi_pro_abilitati___ne != null) {
            joiner.add("studi_pro_abilitati___ne: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___ne));
        }
        if (studi_pro_abilitati___null != null) {
            joiner.add("studi_pro_abilitati___null: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___null));
        }
        if (studi_pro_abilitati___not___null != null) {
            joiner.add("studi_pro_abilitati___not___null: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___null));
        }
        if (studi_pro_abilitati___in != null) {
            joiner.add("studi_pro_abilitati___in: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___in));
        }
        if (studi_pro_abilitati___not___in != null) {
            joiner.add("studi_pro_abilitati___not___in: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___in));
        }
        if (studi_pro_abilitati___lt != null) {
            joiner.add("studi_pro_abilitati___lt: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___lt));
        }
        if (studi_pro_abilitati___lte != null) {
            joiner.add("studi_pro_abilitati___lte: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___lte));
        }
        if (studi_pro_abilitati___gt != null) {
            joiner.add("studi_pro_abilitati___gt: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___gt));
        }
        if (studi_pro_abilitati___gte != null) {
            joiner.add("studi_pro_abilitati___gte: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___gte));
        }
        if (studi_pro_abilitati___contains != null) {
            joiner.add("studi_pro_abilitati___contains: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___contains));
        }
        if (studi_pro_abilitati___not___contains != null) {
            joiner.add("studi_pro_abilitati___not___contains: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___contains));
        }
        if (studi_pro_abilitati___starts_with != null) {
            joiner.add("studi_pro_abilitati___starts_with: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___starts_with));
        }
        if (studi_pro_abilitati___not___starts_with != null) {
            joiner.add("studi_pro_abilitati___not___starts_with: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___starts_with));
        }
        if (studi_pro_abilitati___ends_with != null) {
            joiner.add("studi_pro_abilitati___ends_with: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___ends_with));
        }
        if (studi_pro_abilitati___not___ends_with != null) {
            joiner.add("studi_pro_abilitati___not___ends_with: " + GraphQLRequestSerializer.getEntry(studi_pro_abilitati___not___ends_with));
        }
        if (taf___eq != null) {
            joiner.add("taf___eq: " + GraphQLRequestSerializer.getEntry(taf___eq));
        }
        if (taf___ne != null) {
            joiner.add("taf___ne: " + GraphQLRequestSerializer.getEntry(taf___ne));
        }
        if (taf___null != null) {
            joiner.add("taf___null: " + GraphQLRequestSerializer.getEntry(taf___null));
        }
        if (taf___not___null != null) {
            joiner.add("taf___not___null: " + GraphQLRequestSerializer.getEntry(taf___not___null));
        }
        if (terapia_ormonale___eq != null) {
            joiner.add("terapia_ormonale___eq: " + GraphQLRequestSerializer.getEntry(terapia_ormonale___eq));
        }
        if (terapia_ormonale___ne != null) {
            joiner.add("terapia_ormonale___ne: " + GraphQLRequestSerializer.getEntry(terapia_ormonale___ne));
        }
        if (terapia_ormonale___null != null) {
            joiner.add("terapia_ormonale___null: " + GraphQLRequestSerializer.getEntry(terapia_ormonale___null));
        }
        if (terapia_ormonale___not___null != null) {
            joiner.add("terapia_ormonale___not___null: " + GraphQLRequestSerializer.getEntry(terapia_ormonale___not___null));
        }
        if (token_notifiche_pro___eq != null) {
            joiner.add("token_notifiche_pro___eq: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___eq));
        }
        if (token_notifiche_pro___ne != null) {
            joiner.add("token_notifiche_pro___ne: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___ne));
        }
        if (token_notifiche_pro___null != null) {
            joiner.add("token_notifiche_pro___null: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___null));
        }
        if (token_notifiche_pro___not___null != null) {
            joiner.add("token_notifiche_pro___not___null: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___null));
        }
        if (token_notifiche_pro___in != null) {
            joiner.add("token_notifiche_pro___in: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___in));
        }
        if (token_notifiche_pro___not___in != null) {
            joiner.add("token_notifiche_pro___not___in: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___in));
        }
        if (token_notifiche_pro___lt != null) {
            joiner.add("token_notifiche_pro___lt: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___lt));
        }
        if (token_notifiche_pro___lte != null) {
            joiner.add("token_notifiche_pro___lte: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___lte));
        }
        if (token_notifiche_pro___gt != null) {
            joiner.add("token_notifiche_pro___gt: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___gt));
        }
        if (token_notifiche_pro___gte != null) {
            joiner.add("token_notifiche_pro___gte: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___gte));
        }
        if (token_notifiche_pro___contains != null) {
            joiner.add("token_notifiche_pro___contains: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___contains));
        }
        if (token_notifiche_pro___not___contains != null) {
            joiner.add("token_notifiche_pro___not___contains: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___contains));
        }
        if (token_notifiche_pro___starts_with != null) {
            joiner.add("token_notifiche_pro___starts_with: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___starts_with));
        }
        if (token_notifiche_pro___not___starts_with != null) {
            joiner.add("token_notifiche_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___starts_with));
        }
        if (token_notifiche_pro___ends_with != null) {
            joiner.add("token_notifiche_pro___ends_with: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___ends_with));
        }
        if (token_notifiche_pro___not___ends_with != null) {
            joiner.add("token_notifiche_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(token_notifiche_pro___not___ends_with));
        }
        if (trasferito___eq != null) {
            joiner.add("trasferito___eq: " + GraphQLRequestSerializer.getEntry(trasferito___eq));
        }
        if (trasferito___ne != null) {
            joiner.add("trasferito___ne: " + GraphQLRequestSerializer.getEntry(trasferito___ne));
        }
        if (trasferito___null != null) {
            joiner.add("trasferito___null: " + GraphQLRequestSerializer.getEntry(trasferito___null));
        }
        if (trasferito___not___null != null) {
            joiner.add("trasferito___not___null: " + GraphQLRequestSerializer.getEntry(trasferito___not___null));
        }
        if (username_pro___eq != null) {
            joiner.add("username_pro___eq: " + GraphQLRequestSerializer.getEntry(username_pro___eq));
        }
        if (username_pro___ne != null) {
            joiner.add("username_pro___ne: " + GraphQLRequestSerializer.getEntry(username_pro___ne));
        }
        if (username_pro___null != null) {
            joiner.add("username_pro___null: " + GraphQLRequestSerializer.getEntry(username_pro___null));
        }
        if (username_pro___not___null != null) {
            joiner.add("username_pro___not___null: " + GraphQLRequestSerializer.getEntry(username_pro___not___null));
        }
        if (username_pro___in != null) {
            joiner.add("username_pro___in: " + GraphQLRequestSerializer.getEntry(username_pro___in));
        }
        if (username_pro___not___in != null) {
            joiner.add("username_pro___not___in: " + GraphQLRequestSerializer.getEntry(username_pro___not___in));
        }
        if (username_pro___lt != null) {
            joiner.add("username_pro___lt: " + GraphQLRequestSerializer.getEntry(username_pro___lt));
        }
        if (username_pro___lte != null) {
            joiner.add("username_pro___lte: " + GraphQLRequestSerializer.getEntry(username_pro___lte));
        }
        if (username_pro___gt != null) {
            joiner.add("username_pro___gt: " + GraphQLRequestSerializer.getEntry(username_pro___gt));
        }
        if (username_pro___gte != null) {
            joiner.add("username_pro___gte: " + GraphQLRequestSerializer.getEntry(username_pro___gte));
        }
        if (username_pro___contains != null) {
            joiner.add("username_pro___contains: " + GraphQLRequestSerializer.getEntry(username_pro___contains));
        }
        if (username_pro___not___contains != null) {
            joiner.add("username_pro___not___contains: " + GraphQLRequestSerializer.getEntry(username_pro___not___contains));
        }
        if (username_pro___starts_with != null) {
            joiner.add("username_pro___starts_with: " + GraphQLRequestSerializer.getEntry(username_pro___starts_with));
        }
        if (username_pro___not___starts_with != null) {
            joiner.add("username_pro___not___starts_with: " + GraphQLRequestSerializer.getEntry(username_pro___not___starts_with));
        }
        if (username_pro___ends_with != null) {
            joiner.add("username_pro___ends_with: " + GraphQLRequestSerializer.getEntry(username_pro___ends_with));
        }
        if (username_pro___not___ends_with != null) {
            joiner.add("username_pro___not___ends_with: " + GraphQLRequestSerializer.getEntry(username_pro___not___ends_with));
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

    public static CliH_PazienteFilterDTO.Builder builder() {
        return new CliH_PazienteFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String IL28B___eq;
        private String IL28B___ne;
        private Boolean IL28B___null;
        private Boolean IL28B___not___null;
        private java.util.List<String> IL28B___in;
        private java.util.List<String> IL28B___not___in;
        private String IL28B___lt;
        private String IL28B___lte;
        private String IL28B___gt;
        private String IL28B___gte;
        private String IL28B___contains;
        private String IL28B___not___contains;
        private String IL28B___starts_with;
        private String IL28B___not___starts_with;
        private String IL28B___ends_with;
        private String IL28B___not___ends_with;
        private String USSL_di_residenza___eq;
        private String USSL_di_residenza___ne;
        private Boolean USSL_di_residenza___null;
        private Boolean USSL_di_residenza___not___null;
        private java.util.List<String> USSL_di_residenza___in;
        private java.util.List<String> USSL_di_residenza___not___in;
        private String USSL_di_residenza___lt;
        private String USSL_di_residenza___lte;
        private String USSL_di_residenza___gt;
        private String USSL_di_residenza___gte;
        private String USSL_di_residenza___contains;
        private String USSL_di_residenza___not___contains;
        private String USSL_di_residenza___starts_with;
        private String USSL_di_residenza___not___starts_with;
        private String USSL_di_residenza___ends_with;
        private String USSL_di_residenza___not___ends_with;
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
        private Integer altezza___eq;
        private Integer altezza___ne;
        private Boolean altezza___null;
        private Boolean altezza___not___null;
        private java.util.List<Integer> altezza___in;
        private java.util.List<Integer> altezza___not___in;
        private Integer altezza___lt;
        private Integer altezza___lte;
        private Integer altezza___gt;
        private Integer altezza___gte;
        private String altro_fattore_di_rischio___eq;
        private String altro_fattore_di_rischio___ne;
        private Boolean altro_fattore_di_rischio___null;
        private Boolean altro_fattore_di_rischio___not___null;
        private java.util.List<String> altro_fattore_di_rischio___in;
        private java.util.List<String> altro_fattore_di_rischio___not___in;
        private String altro_fattore_di_rischio___lt;
        private String altro_fattore_di_rischio___lte;
        private String altro_fattore_di_rischio___gt;
        private String altro_fattore_di_rischio___gte;
        private String altro_fattore_di_rischio___contains;
        private String altro_fattore_di_rischio___not___contains;
        private String altro_fattore_di_rischio___starts_with;
        private String altro_fattore_di_rischio___not___starts_with;
        private String altro_fattore_di_rischio___ends_with;
        private String altro_fattore_di_rischio___not___ends_with;
        private Integer anno_nascita___eq;
        private Integer anno_nascita___ne;
        private Boolean anno_nascita___null;
        private Boolean anno_nascita___not___null;
        private java.util.List<Integer> anno_nascita___in;
        private java.util.List<Integer> anno_nascita___not___in;
        private Integer anno_nascita___lt;
        private Integer anno_nascita___lte;
        private Integer anno_nascita___gt;
        private Integer anno_nascita___gte;
        private Boolean checks___eq;
        private Boolean checks___ne;
        private Boolean checks___null;
        private Boolean checks___not___null;
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
        private String codice_interno___eq;
        private String codice_interno___ne;
        private Boolean codice_interno___null;
        private Boolean codice_interno___not___null;
        private java.util.List<String> codice_interno___in;
        private java.util.List<String> codice_interno___not___in;
        private String codice_interno___lt;
        private String codice_interno___lte;
        private String codice_interno___gt;
        private String codice_interno___gte;
        private String codice_interno___contains;
        private String codice_interno___not___contains;
        private String codice_interno___starts_with;
        private String codice_interno___not___starts_with;
        private String codice_interno___ends_with;
        private String codice_interno___not___ends_with;
        private String codice_nazionale___eq;
        private String codice_nazionale___ne;
        private Boolean codice_nazionale___null;
        private Boolean codice_nazionale___not___null;
        private java.util.List<String> codice_nazionale___in;
        private java.util.List<String> codice_nazionale___not___in;
        private String codice_nazionale___lt;
        private String codice_nazionale___lte;
        private String codice_nazionale___gt;
        private String codice_nazionale___gte;
        private String codice_nazionale___contains;
        private String codice_nazionale___not___contains;
        private String codice_nazionale___starts_with;
        private String codice_nazionale___not___starts_with;
        private String codice_nazionale___ends_with;
        private String codice_nazionale___not___ends_with;
        private String cognome___eq;
        private String cognome___ne;
        private Boolean cognome___null;
        private Boolean cognome___not___null;
        private java.util.List<String> cognome___in;
        private java.util.List<String> cognome___not___in;
        private String cognome___lt;
        private String cognome___lte;
        private String cognome___gt;
        private String cognome___gte;
        private String cognome___contains;
        private String cognome___not___contains;
        private String cognome___starts_with;
        private String cognome___not___starts_with;
        private String cognome___ends_with;
        private String cognome___not___ends_with;
        private String comune_di_nascita___eq;
        private String comune_di_nascita___ne;
        private Boolean comune_di_nascita___null;
        private Boolean comune_di_nascita___not___null;
        private java.util.List<String> comune_di_nascita___in;
        private java.util.List<String> comune_di_nascita___not___in;
        private String comune_di_nascita___lt;
        private String comune_di_nascita___lte;
        private String comune_di_nascita___gt;
        private String comune_di_nascita___gte;
        private String comune_di_nascita___contains;
        private String comune_di_nascita___not___contains;
        private String comune_di_nascita___starts_with;
        private String comune_di_nascita___not___starts_with;
        private String comune_di_nascita___ends_with;
        private String comune_di_nascita___not___ends_with;
        private String data_consenso___eq;
        private String data_consenso___ne;
        private Boolean data_consenso___null;
        private Boolean data_consenso___not___null;
        private java.util.List<String> data_consenso___in;
        private java.util.List<String> data_consenso___not___in;
        private String data_consenso___lt;
        private String data_consenso___lte;
        private String data_consenso___gt;
        private String data_consenso___gte;
        private String data_consenso_pro___eq;
        private String data_consenso_pro___ne;
        private Boolean data_consenso_pro___null;
        private Boolean data_consenso_pro___not___null;
        private java.util.List<String> data_consenso_pro___in;
        private java.util.List<String> data_consenso_pro___not___in;
        private String data_consenso_pro___lt;
        private String data_consenso_pro___lte;
        private String data_consenso_pro___gt;
        private String data_consenso_pro___gte;
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
        private String data_fine_terapia_ormonale___eq;
        private String data_fine_terapia_ormonale___ne;
        private Boolean data_fine_terapia_ormonale___null;
        private Boolean data_fine_terapia_ormonale___not___null;
        private java.util.List<String> data_fine_terapia_ormonale___in;
        private java.util.List<String> data_fine_terapia_ormonale___not___in;
        private String data_fine_terapia_ormonale___lt;
        private String data_fine_terapia_ormonale___lte;
        private String data_fine_terapia_ormonale___gt;
        private String data_fine_terapia_ormonale___gte;
        private String data_gilbert___eq;
        private String data_gilbert___ne;
        private Boolean data_gilbert___null;
        private Boolean data_gilbert___not___null;
        private java.util.List<String> data_gilbert___in;
        private java.util.List<String> data_gilbert___not___in;
        private String data_gilbert___lt;
        private String data_gilbert___lte;
        private String data_gilbert___gt;
        private String data_gilbert___gte;
        private String data_hla___eq;
        private String data_hla___ne;
        private Boolean data_hla___null;
        private Boolean data_hla___not___null;
        private java.util.List<String> data_hla___in;
        private java.util.List<String> data_hla___not___in;
        private String data_hla___lt;
        private String data_hla___lte;
        private String data_hla___gt;
        private String data_hla___gte;
        private String data_il28___eq;
        private String data_il28___ne;
        private Boolean data_il28___null;
        private Boolean data_il28___not___null;
        private java.util.List<String> data_il28___in;
        private java.util.List<String> data_il28___not___in;
        private String data_il28___lt;
        private String data_il28___lte;
        private String data_il28___gt;
        private String data_il28___gte;
        private String data_inizio_terapia_ormonale___eq;
        private String data_inizio_terapia_ormonale___ne;
        private Boolean data_inizio_terapia_ormonale___null;
        private Boolean data_inizio_terapia_ormonale___not___null;
        private java.util.List<String> data_inizio_terapia_ormonale___in;
        private java.util.List<String> data_inizio_terapia_ormonale___not___in;
        private String data_inizio_terapia_ormonale___lt;
        private String data_inizio_terapia_ormonale___lte;
        private String data_inizio_terapia_ormonale___gt;
        private String data_inizio_terapia_ormonale___gte;
        private String data_menopausa___eq;
        private String data_menopausa___ne;
        private Boolean data_menopausa___null;
        private Boolean data_menopausa___not___null;
        private java.util.List<String> data_menopausa___in;
        private java.util.List<String> data_menopausa___not___in;
        private String data_menopausa___lt;
        private String data_menopausa___lte;
        private String data_menopausa___gt;
        private String data_menopausa___gte;
        private String data_prima_terapia_anti_hcv___eq;
        private String data_prima_terapia_anti_hcv___ne;
        private Boolean data_prima_terapia_anti_hcv___null;
        private Boolean data_prima_terapia_anti_hcv___not___null;
        private java.util.List<String> data_prima_terapia_anti_hcv___in;
        private java.util.List<String> data_prima_terapia_anti_hcv___not___in;
        private String data_prima_terapia_anti_hcv___lt;
        private String data_prima_terapia_anti_hcv___lte;
        private String data_prima_terapia_anti_hcv___gt;
        private String data_prima_terapia_anti_hcv___gte;
        private String data_prima_visita___eq;
        private String data_prima_visita___ne;
        private Boolean data_prima_visita___null;
        private Boolean data_prima_visita___not___null;
        private java.util.List<String> data_prima_visita___in;
        private java.util.List<String> data_prima_visita___not___in;
        private String data_prima_visita___lt;
        private String data_prima_visita___lte;
        private String data_prima_visita___gt;
        private String data_prima_visita___gte;
        private String data_primo_hcvab_pos___eq;
        private String data_primo_hcvab_pos___ne;
        private Boolean data_primo_hcvab_pos___null;
        private Boolean data_primo_hcvab_pos___not___null;
        private java.util.List<String> data_primo_hcvab_pos___in;
        private java.util.List<String> data_primo_hcvab_pos___not___in;
        private String data_primo_hcvab_pos___lt;
        private String data_primo_hcvab_pos___lte;
        private String data_primo_hcvab_pos___gt;
        private String data_primo_hcvab_pos___gte;
        private String data_ultima_visita___eq;
        private String data_ultima_visita___ne;
        private Boolean data_ultima_visita___null;
        private Boolean data_ultima_visita___not___null;
        private java.util.List<String> data_ultima_visita___in;
        private java.util.List<String> data_ultima_visita___not___in;
        private String data_ultima_visita___lt;
        private String data_ultima_visita___lte;
        private String data_ultima_visita___gt;
        private String data_ultima_visita___gte;
        private String data_ultimo_HCVAb_pre_arr___eq;
        private String data_ultimo_HCVAb_pre_arr___ne;
        private Boolean data_ultimo_HCVAb_pre_arr___null;
        private Boolean data_ultimo_HCVAb_pre_arr___not___null;
        private java.util.List<String> data_ultimo_HCVAb_pre_arr___in;
        private java.util.List<String> data_ultimo_HCVAb_pre_arr___not___in;
        private String data_ultimo_HCVAb_pre_arr___lt;
        private String data_ultimo_HCVAb_pre_arr___lte;
        private String data_ultimo_HCVAb_pre_arr___gt;
        private String data_ultimo_HCVAb_pre_arr___gte;
        private String data_ultimo_HbsAg_pre_arr___eq;
        private String data_ultimo_HbsAg_pre_arr___ne;
        private Boolean data_ultimo_HbsAg_pre_arr___null;
        private Boolean data_ultimo_HbsAg_pre_arr___not___null;
        private java.util.List<String> data_ultimo_HbsAg_pre_arr___in;
        private java.util.List<String> data_ultimo_HbsAg_pre_arr___not___in;
        private String data_ultimo_HbsAg_pre_arr___lt;
        private String data_ultimo_HbsAg_pre_arr___lte;
        private String data_ultimo_HbsAg_pre_arr___gt;
        private String data_ultimo_HbsAg_pre_arr___gte;
        private String data_ultimo_drop___eq;
        private String data_ultimo_drop___ne;
        private Boolean data_ultimo_drop___null;
        private Boolean data_ultimo_drop___not___null;
        private java.util.List<String> data_ultimo_drop___in;
        private java.util.List<String> data_ultimo_drop___not___in;
        private String data_ultimo_drop___lt;
        private String data_ultimo_drop___lte;
        private String data_ultimo_drop___gt;
        private String data_ultimo_drop___gte;
        private String date_longicona___eq;
        private String date_longicona___ne;
        private Boolean date_longicona___null;
        private Boolean date_longicona___not___null;
        private java.util.List<String> date_longicona___in;
        private java.util.List<String> date_longicona___not___in;
        private String date_longicona___lt;
        private String date_longicona___lte;
        private String date_longicona___gt;
        private String date_longicona___gte;
        private String date_longicona___contains;
        private String date_longicona___not___contains;
        private String date_longicona___starts_with;
        private String date_longicona___not___starts_with;
        private String date_longicona___ends_with;
        private String date_longicona___not___ends_with;
        private Boolean dtg___eq;
        private Boolean dtg___ne;
        private Boolean dtg___null;
        private Boolean dtg___not___null;
        private String esito_ultima_terapia___eq;
        private String esito_ultima_terapia___ne;
        private Boolean esito_ultima_terapia___null;
        private Boolean esito_ultima_terapia___not___null;
        private java.util.List<String> esito_ultima_terapia___in;
        private java.util.List<String> esito_ultima_terapia___not___in;
        private String esito_ultima_terapia___lt;
        private String esito_ultima_terapia___lte;
        private String esito_ultima_terapia___gt;
        private String esito_ultima_terapia___gte;
        private String esito_ultima_terapia___contains;
        private String esito_ultima_terapia___not___contains;
        private String esito_ultima_terapia___starts_with;
        private String esito_ultima_terapia___not___starts_with;
        private String esito_ultima_terapia___ends_with;
        private String esito_ultima_terapia___not___ends_with;
        private Integer eta_arruolamento___eq;
        private Integer eta_arruolamento___ne;
        private Boolean eta_arruolamento___null;
        private Boolean eta_arruolamento___not___null;
        private java.util.List<Integer> eta_arruolamento___in;
        private java.util.List<Integer> eta_arruolamento___not___in;
        private Integer eta_arruolamento___lt;
        private Integer eta_arruolamento___lte;
        private Integer eta_arruolamento___gt;
        private Integer eta_arruolamento___gte;
        private Integer eta_prima_visita___eq;
        private Integer eta_prima_visita___ne;
        private Boolean eta_prima_visita___null;
        private Boolean eta_prima_visita___not___null;
        private java.util.List<Integer> eta_prima_visita___in;
        private java.util.List<Integer> eta_prima_visita___not___in;
        private Integer eta_prima_visita___lt;
        private Integer eta_prima_visita___lte;
        private Integer eta_prima_visita___gt;
        private Integer eta_prima_visita___gte;
        private String etnia____eq;
        private String etnia____ne;
        private Boolean etnia____null;
        private Boolean etnia____not___null;
        private java.util.List<String> etnia____in;
        private java.util.List<String> etnia____not___in;
        private String etnia____lt;
        private String etnia____lte;
        private String etnia____gt;
        private String etnia____gte;
        private String etnia____contains;
        private String etnia____not___contains;
        private String etnia____starts_with;
        private String etnia____not___starts_with;
        private String etnia____ends_with;
        private String etnia____not___ends_with;
        private String fattore_di_rischio____eq;
        private String fattore_di_rischio____ne;
        private Boolean fattore_di_rischio____null;
        private Boolean fattore_di_rischio____not___null;
        private java.util.List<String> fattore_di_rischio____in;
        private java.util.List<String> fattore_di_rischio____not___in;
        private String fattore_di_rischio____lt;
        private String fattore_di_rischio____lte;
        private String fattore_di_rischio____gt;
        private String fattore_di_rischio____gte;
        private String fattore_di_rischio____contains;
        private String fattore_di_rischio____not___contains;
        private String fattore_di_rischio____starts_with;
        private String fattore_di_rischio____not___starts_with;
        private String fattore_di_rischio____ends_with;
        private String fattore_di_rischio____not___ends_with;
        private Boolean fibroscan___eq;
        private Boolean fibroscan___ne;
        private Boolean fibroscan___null;
        private Boolean fibroscan___not___null;
        private Boolean hbsag_pos___eq;
        private Boolean hbsag_pos___ne;
        private Boolean hbsag_pos___null;
        private Boolean hbsag_pos___not___null;
        private Boolean hcvab_pos___eq;
        private Boolean hcvab_pos___ne;
        private Boolean hcvab_pos___null;
        private Boolean hcvab_pos___not___null;
        private String hla_b5701___eq;
        private String hla_b5701___ne;
        private Boolean hla_b5701___null;
        private Boolean hla_b5701___not___null;
        private java.util.List<String> hla_b5701___in;
        private java.util.List<String> hla_b5701___not___in;
        private String hla_b5701___lt;
        private String hla_b5701___lte;
        private String hla_b5701___gt;
        private String hla_b5701___gte;
        private String hla_b5701___contains;
        private String hla_b5701___not___contains;
        private String hla_b5701___starts_with;
        private String hla_b5701___not___starts_with;
        private String hla_b5701___ends_with;
        private String hla_b5701___not___ends_with;
        private Boolean hla_b5701_bool___eq;
        private Boolean hla_b5701_bool___ne;
        private Boolean hla_b5701_bool___null;
        private Boolean hla_b5701_bool___not___null;
        private Integer id_paziente___eq;
        private Integer id_paziente___ne;
        private Boolean id_paziente___null;
        private Boolean id_paziente___not___null;
        private java.util.List<Integer> id_paziente___in;
        private java.util.List<Integer> id_paziente___not___in;
        private Integer id_paziente___lt;
        private Integer id_paziente___lte;
        private Integer id_paziente___gt;
        private Integer id_paziente___gte;
        private Boolean ifn___eq;
        private Boolean ifn___ne;
        private Boolean ifn___null;
        private Boolean ifn___not___null;
        private Integer in_italia_da_anni___eq;
        private Integer in_italia_da_anni___ne;
        private Boolean in_italia_da_anni___null;
        private Boolean in_italia_da_anni___not___null;
        private java.util.List<Integer> in_italia_da_anni___in;
        private java.util.List<Integer> in_italia_da_anni___not___in;
        private Integer in_italia_da_anni___lt;
        private Integer in_italia_da_anni___lte;
        private Integer in_italia_da_anni___gt;
        private Integer in_italia_da_anni___gte;
        private String nascita___eq;
        private String nascita___ne;
        private Boolean nascita___null;
        private Boolean nascita___not___null;
        private java.util.List<String> nascita___in;
        private java.util.List<String> nascita___not___in;
        private String nascita___lt;
        private String nascita___lte;
        private String nascita___gt;
        private String nascita___gte;
        private String nazionalita____eq;
        private String nazionalita____ne;
        private Boolean nazionalita____null;
        private Boolean nazionalita____not___null;
        private java.util.List<String> nazionalita____in;
        private java.util.List<String> nazionalita____not___in;
        private String nazionalita____lt;
        private String nazionalita____lte;
        private String nazionalita____gt;
        private String nazionalita____gte;
        private String nazionalita____contains;
        private String nazionalita____not___contains;
        private String nazionalita____starts_with;
        private String nazionalita____not___starts_with;
        private String nazionalita____ends_with;
        private String nazionalita____not___ends_with;
        private String nazione___eq;
        private String nazione___ne;
        private Boolean nazione___null;
        private Boolean nazione___not___null;
        private java.util.List<String> nazione___in;
        private java.util.List<String> nazione___not___in;
        private String nazione___lt;
        private String nazione___lte;
        private String nazione___gt;
        private String nazione___gte;
        private String nazione___contains;
        private String nazione___not___contains;
        private String nazione___starts_with;
        private String nazione___not___starts_with;
        private String nazione___ends_with;
        private String nazione___not___ends_with;
        private Boolean noco___eq;
        private Boolean noco___ne;
        private Boolean noco___null;
        private Boolean noco___not___null;
        private String nome___eq;
        private String nome___ne;
        private Boolean nome___null;
        private Boolean nome___not___null;
        private java.util.List<String> nome___in;
        private java.util.List<String> nome___not___in;
        private String nome___lt;
        private String nome___lte;
        private String nome___gt;
        private String nome___gte;
        private String nome___contains;
        private String nome___not___contains;
        private String nome___starts_with;
        private String nome___not___starts_with;
        private String nome___ends_with;
        private String nome___not___ends_with;
        private String note_terapia___eq;
        private String note_terapia___ne;
        private Boolean note_terapia___null;
        private Boolean note_terapia___not___null;
        private java.util.List<String> note_terapia___in;
        private java.util.List<String> note_terapia___not___in;
        private String note_terapia___lt;
        private String note_terapia___lte;
        private String note_terapia___gt;
        private String note_terapia___gte;
        private String note_terapia___contains;
        private String note_terapia___not___contains;
        private String note_terapia___starts_with;
        private String note_terapia___not___starts_with;
        private String note_terapia___ends_with;
        private String note_terapia___not___ends_with;
        private Boolean null_val___eq;
        private Boolean null_val___ne;
        private Boolean null_val___null;
        private Boolean null_val___not___null;
        private String password_pro___eq;
        private String password_pro___ne;
        private Boolean password_pro___null;
        private Boolean password_pro___not___null;
        private java.util.List<String> password_pro___in;
        private java.util.List<String> password_pro___not___in;
        private String password_pro___lt;
        private String password_pro___lte;
        private String password_pro___gt;
        private String password_pro___gte;
        private String password_pro___contains;
        private String password_pro___not___contains;
        private String password_pro___starts_with;
        private String password_pro___not___starts_with;
        private String password_pro___ends_with;
        private String password_pro___not___ends_with;
        private Boolean pegifn___eq;
        private Boolean pegifn___ne;
        private Boolean pegifn___null;
        private Boolean pegifn___not___null;
        private Boolean pregresse_terapie_anti_hcv___eq;
        private Boolean pregresse_terapie_anti_hcv___ne;
        private Boolean pregresse_terapie_anti_hcv___null;
        private Boolean pregresse_terapie_anti_hcv___not___null;
        private Boolean pro___eq;
        private Boolean pro___ne;
        private Boolean pro___null;
        private Boolean pro___not___null;
        private Boolean ribavirina___eq;
        private Boolean ribavirina___ne;
        private Boolean ribavirina___null;
        private Boolean ribavirina___not___null;
        private Boolean risk_F___eq;
        private Boolean risk_F___ne;
        private Boolean risk_F___null;
        private Boolean risk_F___not___null;
        private String sessione_pro___eq;
        private String sessione_pro___ne;
        private Boolean sessione_pro___null;
        private Boolean sessione_pro___not___null;
        private java.util.List<String> sessione_pro___in;
        private java.util.List<String> sessione_pro___not___in;
        private String sessione_pro___lt;
        private String sessione_pro___lte;
        private String sessione_pro___gt;
        private String sessione_pro___gte;
        private String sessione_pro___contains;
        private String sessione_pro___not___contains;
        private String sessione_pro___starts_with;
        private String sessione_pro___not___starts_with;
        private String sessione_pro___ends_with;
        private String sessione_pro___not___ends_with;
        private String sesso___eq;
        private String sesso___ne;
        private Boolean sesso___null;
        private Boolean sesso___not___null;
        private java.util.List<String> sesso___in;
        private java.util.List<String> sesso___not___in;
        private String sesso___lt;
        private String sesso___lte;
        private String sesso___gt;
        private String sesso___gte;
        private String sesso___contains;
        private String sesso___not___contains;
        private String sesso___starts_with;
        private String sesso___not___starts_with;
        private String sesso___ends_with;
        private String sesso___not___ends_with;
        private Boolean stribild___eq;
        private Boolean stribild___ne;
        private Boolean stribild___null;
        private Boolean stribild___not___null;
        private String studi_pro_abilitati___eq;
        private String studi_pro_abilitati___ne;
        private Boolean studi_pro_abilitati___null;
        private Boolean studi_pro_abilitati___not___null;
        private java.util.List<String> studi_pro_abilitati___in;
        private java.util.List<String> studi_pro_abilitati___not___in;
        private String studi_pro_abilitati___lt;
        private String studi_pro_abilitati___lte;
        private String studi_pro_abilitati___gt;
        private String studi_pro_abilitati___gte;
        private String studi_pro_abilitati___contains;
        private String studi_pro_abilitati___not___contains;
        private String studi_pro_abilitati___starts_with;
        private String studi_pro_abilitati___not___starts_with;
        private String studi_pro_abilitati___ends_with;
        private String studi_pro_abilitati___not___ends_with;
        private Boolean taf___eq;
        private Boolean taf___ne;
        private Boolean taf___null;
        private Boolean taf___not___null;
        private Boolean terapia_ormonale___eq;
        private Boolean terapia_ormonale___ne;
        private Boolean terapia_ormonale___null;
        private Boolean terapia_ormonale___not___null;
        private String token_notifiche_pro___eq;
        private String token_notifiche_pro___ne;
        private Boolean token_notifiche_pro___null;
        private Boolean token_notifiche_pro___not___null;
        private java.util.List<String> token_notifiche_pro___in;
        private java.util.List<String> token_notifiche_pro___not___in;
        private String token_notifiche_pro___lt;
        private String token_notifiche_pro___lte;
        private String token_notifiche_pro___gt;
        private String token_notifiche_pro___gte;
        private String token_notifiche_pro___contains;
        private String token_notifiche_pro___not___contains;
        private String token_notifiche_pro___starts_with;
        private String token_notifiche_pro___not___starts_with;
        private String token_notifiche_pro___ends_with;
        private String token_notifiche_pro___not___ends_with;
        private Boolean trasferito___eq;
        private Boolean trasferito___ne;
        private Boolean trasferito___null;
        private Boolean trasferito___not___null;
        private String username_pro___eq;
        private String username_pro___ne;
        private Boolean username_pro___null;
        private Boolean username_pro___not___null;
        private java.util.List<String> username_pro___in;
        private java.util.List<String> username_pro___not___in;
        private String username_pro___lt;
        private String username_pro___lte;
        private String username_pro___gt;
        private String username_pro___gte;
        private String username_pro___contains;
        private String username_pro___not___contains;
        private String username_pro___starts_with;
        private String username_pro___not___starts_with;
        private String username_pro___ends_with;
        private String username_pro___not___ends_with;
        private java.util.List<CliH_PazienteFilterDTO> AND;
        private java.util.List<CliH_PazienteFilterDTO> OR;
        private CliH_PazienteFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder setIL28B___eq(String IL28B___eq) {
            this.IL28B___eq = IL28B___eq;
            return this;
        }

        public Builder setIL28B___ne(String IL28B___ne) {
            this.IL28B___ne = IL28B___ne;
            return this;
        }

        public Builder setIL28B___null(Boolean IL28B___null) {
            this.IL28B___null = IL28B___null;
            return this;
        }

        public Builder setIL28B___not___null(Boolean IL28B___not___null) {
            this.IL28B___not___null = IL28B___not___null;
            return this;
        }

        public Builder setIL28B___in(java.util.List<String> IL28B___in) {
            this.IL28B___in = IL28B___in;
            return this;
        }

        public Builder setIL28B___not___in(java.util.List<String> IL28B___not___in) {
            this.IL28B___not___in = IL28B___not___in;
            return this;
        }

        public Builder setIL28B___lt(String IL28B___lt) {
            this.IL28B___lt = IL28B___lt;
            return this;
        }

        public Builder setIL28B___lte(String IL28B___lte) {
            this.IL28B___lte = IL28B___lte;
            return this;
        }

        public Builder setIL28B___gt(String IL28B___gt) {
            this.IL28B___gt = IL28B___gt;
            return this;
        }

        public Builder setIL28B___gte(String IL28B___gte) {
            this.IL28B___gte = IL28B___gte;
            return this;
        }

        public Builder setIL28B___contains(String IL28B___contains) {
            this.IL28B___contains = IL28B___contains;
            return this;
        }

        public Builder setIL28B___not___contains(String IL28B___not___contains) {
            this.IL28B___not___contains = IL28B___not___contains;
            return this;
        }

        public Builder setIL28B___starts_with(String IL28B___starts_with) {
            this.IL28B___starts_with = IL28B___starts_with;
            return this;
        }

        public Builder setIL28B___not___starts_with(String IL28B___not___starts_with) {
            this.IL28B___not___starts_with = IL28B___not___starts_with;
            return this;
        }

        public Builder setIL28B___ends_with(String IL28B___ends_with) {
            this.IL28B___ends_with = IL28B___ends_with;
            return this;
        }

        public Builder setIL28B___not___ends_with(String IL28B___not___ends_with) {
            this.IL28B___not___ends_with = IL28B___not___ends_with;
            return this;
        }

        public Builder setUSSL_di_residenza___eq(String USSL_di_residenza___eq) {
            this.USSL_di_residenza___eq = USSL_di_residenza___eq;
            return this;
        }

        public Builder setUSSL_di_residenza___ne(String USSL_di_residenza___ne) {
            this.USSL_di_residenza___ne = USSL_di_residenza___ne;
            return this;
        }

        public Builder setUSSL_di_residenza___null(Boolean USSL_di_residenza___null) {
            this.USSL_di_residenza___null = USSL_di_residenza___null;
            return this;
        }

        public Builder setUSSL_di_residenza___not___null(Boolean USSL_di_residenza___not___null) {
            this.USSL_di_residenza___not___null = USSL_di_residenza___not___null;
            return this;
        }

        public Builder setUSSL_di_residenza___in(java.util.List<String> USSL_di_residenza___in) {
            this.USSL_di_residenza___in = USSL_di_residenza___in;
            return this;
        }

        public Builder setUSSL_di_residenza___not___in(java.util.List<String> USSL_di_residenza___not___in) {
            this.USSL_di_residenza___not___in = USSL_di_residenza___not___in;
            return this;
        }

        public Builder setUSSL_di_residenza___lt(String USSL_di_residenza___lt) {
            this.USSL_di_residenza___lt = USSL_di_residenza___lt;
            return this;
        }

        public Builder setUSSL_di_residenza___lte(String USSL_di_residenza___lte) {
            this.USSL_di_residenza___lte = USSL_di_residenza___lte;
            return this;
        }

        public Builder setUSSL_di_residenza___gt(String USSL_di_residenza___gt) {
            this.USSL_di_residenza___gt = USSL_di_residenza___gt;
            return this;
        }

        public Builder setUSSL_di_residenza___gte(String USSL_di_residenza___gte) {
            this.USSL_di_residenza___gte = USSL_di_residenza___gte;
            return this;
        }

        public Builder setUSSL_di_residenza___contains(String USSL_di_residenza___contains) {
            this.USSL_di_residenza___contains = USSL_di_residenza___contains;
            return this;
        }

        public Builder setUSSL_di_residenza___not___contains(String USSL_di_residenza___not___contains) {
            this.USSL_di_residenza___not___contains = USSL_di_residenza___not___contains;
            return this;
        }

        public Builder setUSSL_di_residenza___starts_with(String USSL_di_residenza___starts_with) {
            this.USSL_di_residenza___starts_with = USSL_di_residenza___starts_with;
            return this;
        }

        public Builder setUSSL_di_residenza___not___starts_with(String USSL_di_residenza___not___starts_with) {
            this.USSL_di_residenza___not___starts_with = USSL_di_residenza___not___starts_with;
            return this;
        }

        public Builder setUSSL_di_residenza___ends_with(String USSL_di_residenza___ends_with) {
            this.USSL_di_residenza___ends_with = USSL_di_residenza___ends_with;
            return this;
        }

        public Builder setUSSL_di_residenza___not___ends_with(String USSL_di_residenza___not___ends_with) {
            this.USSL_di_residenza___not___ends_with = USSL_di_residenza___not___ends_with;
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

        public Builder setAltezza___eq(Integer altezza___eq) {
            this.altezza___eq = altezza___eq;
            return this;
        }

        public Builder setAltezza___ne(Integer altezza___ne) {
            this.altezza___ne = altezza___ne;
            return this;
        }

        public Builder setAltezza___null(Boolean altezza___null) {
            this.altezza___null = altezza___null;
            return this;
        }

        public Builder setAltezza___not___null(Boolean altezza___not___null) {
            this.altezza___not___null = altezza___not___null;
            return this;
        }

        public Builder setAltezza___in(java.util.List<Integer> altezza___in) {
            this.altezza___in = altezza___in;
            return this;
        }

        public Builder setAltezza___not___in(java.util.List<Integer> altezza___not___in) {
            this.altezza___not___in = altezza___not___in;
            return this;
        }

        public Builder setAltezza___lt(Integer altezza___lt) {
            this.altezza___lt = altezza___lt;
            return this;
        }

        public Builder setAltezza___lte(Integer altezza___lte) {
            this.altezza___lte = altezza___lte;
            return this;
        }

        public Builder setAltezza___gt(Integer altezza___gt) {
            this.altezza___gt = altezza___gt;
            return this;
        }

        public Builder setAltezza___gte(Integer altezza___gte) {
            this.altezza___gte = altezza___gte;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___eq(String altro_fattore_di_rischio___eq) {
            this.altro_fattore_di_rischio___eq = altro_fattore_di_rischio___eq;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___ne(String altro_fattore_di_rischio___ne) {
            this.altro_fattore_di_rischio___ne = altro_fattore_di_rischio___ne;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___null(Boolean altro_fattore_di_rischio___null) {
            this.altro_fattore_di_rischio___null = altro_fattore_di_rischio___null;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___not___null(Boolean altro_fattore_di_rischio___not___null) {
            this.altro_fattore_di_rischio___not___null = altro_fattore_di_rischio___not___null;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___in(java.util.List<String> altro_fattore_di_rischio___in) {
            this.altro_fattore_di_rischio___in = altro_fattore_di_rischio___in;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___not___in(java.util.List<String> altro_fattore_di_rischio___not___in) {
            this.altro_fattore_di_rischio___not___in = altro_fattore_di_rischio___not___in;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___lt(String altro_fattore_di_rischio___lt) {
            this.altro_fattore_di_rischio___lt = altro_fattore_di_rischio___lt;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___lte(String altro_fattore_di_rischio___lte) {
            this.altro_fattore_di_rischio___lte = altro_fattore_di_rischio___lte;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___gt(String altro_fattore_di_rischio___gt) {
            this.altro_fattore_di_rischio___gt = altro_fattore_di_rischio___gt;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___gte(String altro_fattore_di_rischio___gte) {
            this.altro_fattore_di_rischio___gte = altro_fattore_di_rischio___gte;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___contains(String altro_fattore_di_rischio___contains) {
            this.altro_fattore_di_rischio___contains = altro_fattore_di_rischio___contains;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___not___contains(String altro_fattore_di_rischio___not___contains) {
            this.altro_fattore_di_rischio___not___contains = altro_fattore_di_rischio___not___contains;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___starts_with(String altro_fattore_di_rischio___starts_with) {
            this.altro_fattore_di_rischio___starts_with = altro_fattore_di_rischio___starts_with;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___not___starts_with(String altro_fattore_di_rischio___not___starts_with) {
            this.altro_fattore_di_rischio___not___starts_with = altro_fattore_di_rischio___not___starts_with;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___ends_with(String altro_fattore_di_rischio___ends_with) {
            this.altro_fattore_di_rischio___ends_with = altro_fattore_di_rischio___ends_with;
            return this;
        }

        public Builder setAltro_fattore_di_rischio___not___ends_with(String altro_fattore_di_rischio___not___ends_with) {
            this.altro_fattore_di_rischio___not___ends_with = altro_fattore_di_rischio___not___ends_with;
            return this;
        }

        public Builder setAnno_nascita___eq(Integer anno_nascita___eq) {
            this.anno_nascita___eq = anno_nascita___eq;
            return this;
        }

        public Builder setAnno_nascita___ne(Integer anno_nascita___ne) {
            this.anno_nascita___ne = anno_nascita___ne;
            return this;
        }

        public Builder setAnno_nascita___null(Boolean anno_nascita___null) {
            this.anno_nascita___null = anno_nascita___null;
            return this;
        }

        public Builder setAnno_nascita___not___null(Boolean anno_nascita___not___null) {
            this.anno_nascita___not___null = anno_nascita___not___null;
            return this;
        }

        public Builder setAnno_nascita___in(java.util.List<Integer> anno_nascita___in) {
            this.anno_nascita___in = anno_nascita___in;
            return this;
        }

        public Builder setAnno_nascita___not___in(java.util.List<Integer> anno_nascita___not___in) {
            this.anno_nascita___not___in = anno_nascita___not___in;
            return this;
        }

        public Builder setAnno_nascita___lt(Integer anno_nascita___lt) {
            this.anno_nascita___lt = anno_nascita___lt;
            return this;
        }

        public Builder setAnno_nascita___lte(Integer anno_nascita___lte) {
            this.anno_nascita___lte = anno_nascita___lte;
            return this;
        }

        public Builder setAnno_nascita___gt(Integer anno_nascita___gt) {
            this.anno_nascita___gt = anno_nascita___gt;
            return this;
        }

        public Builder setAnno_nascita___gte(Integer anno_nascita___gte) {
            this.anno_nascita___gte = anno_nascita___gte;
            return this;
        }

        public Builder setChecks___eq(Boolean checks___eq) {
            this.checks___eq = checks___eq;
            return this;
        }

        public Builder setChecks___ne(Boolean checks___ne) {
            this.checks___ne = checks___ne;
            return this;
        }

        public Builder setChecks___null(Boolean checks___null) {
            this.checks___null = checks___null;
            return this;
        }

        public Builder setChecks___not___null(Boolean checks___not___null) {
            this.checks___not___null = checks___not___null;
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

        public Builder setCodice_interno___eq(String codice_interno___eq) {
            this.codice_interno___eq = codice_interno___eq;
            return this;
        }

        public Builder setCodice_interno___ne(String codice_interno___ne) {
            this.codice_interno___ne = codice_interno___ne;
            return this;
        }

        public Builder setCodice_interno___null(Boolean codice_interno___null) {
            this.codice_interno___null = codice_interno___null;
            return this;
        }

        public Builder setCodice_interno___not___null(Boolean codice_interno___not___null) {
            this.codice_interno___not___null = codice_interno___not___null;
            return this;
        }

        public Builder setCodice_interno___in(java.util.List<String> codice_interno___in) {
            this.codice_interno___in = codice_interno___in;
            return this;
        }

        public Builder setCodice_interno___not___in(java.util.List<String> codice_interno___not___in) {
            this.codice_interno___not___in = codice_interno___not___in;
            return this;
        }

        public Builder setCodice_interno___lt(String codice_interno___lt) {
            this.codice_interno___lt = codice_interno___lt;
            return this;
        }

        public Builder setCodice_interno___lte(String codice_interno___lte) {
            this.codice_interno___lte = codice_interno___lte;
            return this;
        }

        public Builder setCodice_interno___gt(String codice_interno___gt) {
            this.codice_interno___gt = codice_interno___gt;
            return this;
        }

        public Builder setCodice_interno___gte(String codice_interno___gte) {
            this.codice_interno___gte = codice_interno___gte;
            return this;
        }

        public Builder setCodice_interno___contains(String codice_interno___contains) {
            this.codice_interno___contains = codice_interno___contains;
            return this;
        }

        public Builder setCodice_interno___not___contains(String codice_interno___not___contains) {
            this.codice_interno___not___contains = codice_interno___not___contains;
            return this;
        }

        public Builder setCodice_interno___starts_with(String codice_interno___starts_with) {
            this.codice_interno___starts_with = codice_interno___starts_with;
            return this;
        }

        public Builder setCodice_interno___not___starts_with(String codice_interno___not___starts_with) {
            this.codice_interno___not___starts_with = codice_interno___not___starts_with;
            return this;
        }

        public Builder setCodice_interno___ends_with(String codice_interno___ends_with) {
            this.codice_interno___ends_with = codice_interno___ends_with;
            return this;
        }

        public Builder setCodice_interno___not___ends_with(String codice_interno___not___ends_with) {
            this.codice_interno___not___ends_with = codice_interno___not___ends_with;
            return this;
        }

        public Builder setCodice_nazionale___eq(String codice_nazionale___eq) {
            this.codice_nazionale___eq = codice_nazionale___eq;
            return this;
        }

        public Builder setCodice_nazionale___ne(String codice_nazionale___ne) {
            this.codice_nazionale___ne = codice_nazionale___ne;
            return this;
        }

        public Builder setCodice_nazionale___null(Boolean codice_nazionale___null) {
            this.codice_nazionale___null = codice_nazionale___null;
            return this;
        }

        public Builder setCodice_nazionale___not___null(Boolean codice_nazionale___not___null) {
            this.codice_nazionale___not___null = codice_nazionale___not___null;
            return this;
        }

        public Builder setCodice_nazionale___in(java.util.List<String> codice_nazionale___in) {
            this.codice_nazionale___in = codice_nazionale___in;
            return this;
        }

        public Builder setCodice_nazionale___not___in(java.util.List<String> codice_nazionale___not___in) {
            this.codice_nazionale___not___in = codice_nazionale___not___in;
            return this;
        }

        public Builder setCodice_nazionale___lt(String codice_nazionale___lt) {
            this.codice_nazionale___lt = codice_nazionale___lt;
            return this;
        }

        public Builder setCodice_nazionale___lte(String codice_nazionale___lte) {
            this.codice_nazionale___lte = codice_nazionale___lte;
            return this;
        }

        public Builder setCodice_nazionale___gt(String codice_nazionale___gt) {
            this.codice_nazionale___gt = codice_nazionale___gt;
            return this;
        }

        public Builder setCodice_nazionale___gte(String codice_nazionale___gte) {
            this.codice_nazionale___gte = codice_nazionale___gte;
            return this;
        }

        public Builder setCodice_nazionale___contains(String codice_nazionale___contains) {
            this.codice_nazionale___contains = codice_nazionale___contains;
            return this;
        }

        public Builder setCodice_nazionale___not___contains(String codice_nazionale___not___contains) {
            this.codice_nazionale___not___contains = codice_nazionale___not___contains;
            return this;
        }

        public Builder setCodice_nazionale___starts_with(String codice_nazionale___starts_with) {
            this.codice_nazionale___starts_with = codice_nazionale___starts_with;
            return this;
        }

        public Builder setCodice_nazionale___not___starts_with(String codice_nazionale___not___starts_with) {
            this.codice_nazionale___not___starts_with = codice_nazionale___not___starts_with;
            return this;
        }

        public Builder setCodice_nazionale___ends_with(String codice_nazionale___ends_with) {
            this.codice_nazionale___ends_with = codice_nazionale___ends_with;
            return this;
        }

        public Builder setCodice_nazionale___not___ends_with(String codice_nazionale___not___ends_with) {
            this.codice_nazionale___not___ends_with = codice_nazionale___not___ends_with;
            return this;
        }

        public Builder setCognome___eq(String cognome___eq) {
            this.cognome___eq = cognome___eq;
            return this;
        }

        public Builder setCognome___ne(String cognome___ne) {
            this.cognome___ne = cognome___ne;
            return this;
        }

        public Builder setCognome___null(Boolean cognome___null) {
            this.cognome___null = cognome___null;
            return this;
        }

        public Builder setCognome___not___null(Boolean cognome___not___null) {
            this.cognome___not___null = cognome___not___null;
            return this;
        }

        public Builder setCognome___in(java.util.List<String> cognome___in) {
            this.cognome___in = cognome___in;
            return this;
        }

        public Builder setCognome___not___in(java.util.List<String> cognome___not___in) {
            this.cognome___not___in = cognome___not___in;
            return this;
        }

        public Builder setCognome___lt(String cognome___lt) {
            this.cognome___lt = cognome___lt;
            return this;
        }

        public Builder setCognome___lte(String cognome___lte) {
            this.cognome___lte = cognome___lte;
            return this;
        }

        public Builder setCognome___gt(String cognome___gt) {
            this.cognome___gt = cognome___gt;
            return this;
        }

        public Builder setCognome___gte(String cognome___gte) {
            this.cognome___gte = cognome___gte;
            return this;
        }

        public Builder setCognome___contains(String cognome___contains) {
            this.cognome___contains = cognome___contains;
            return this;
        }

        public Builder setCognome___not___contains(String cognome___not___contains) {
            this.cognome___not___contains = cognome___not___contains;
            return this;
        }

        public Builder setCognome___starts_with(String cognome___starts_with) {
            this.cognome___starts_with = cognome___starts_with;
            return this;
        }

        public Builder setCognome___not___starts_with(String cognome___not___starts_with) {
            this.cognome___not___starts_with = cognome___not___starts_with;
            return this;
        }

        public Builder setCognome___ends_with(String cognome___ends_with) {
            this.cognome___ends_with = cognome___ends_with;
            return this;
        }

        public Builder setCognome___not___ends_with(String cognome___not___ends_with) {
            this.cognome___not___ends_with = cognome___not___ends_with;
            return this;
        }

        public Builder setComune_di_nascita___eq(String comune_di_nascita___eq) {
            this.comune_di_nascita___eq = comune_di_nascita___eq;
            return this;
        }

        public Builder setComune_di_nascita___ne(String comune_di_nascita___ne) {
            this.comune_di_nascita___ne = comune_di_nascita___ne;
            return this;
        }

        public Builder setComune_di_nascita___null(Boolean comune_di_nascita___null) {
            this.comune_di_nascita___null = comune_di_nascita___null;
            return this;
        }

        public Builder setComune_di_nascita___not___null(Boolean comune_di_nascita___not___null) {
            this.comune_di_nascita___not___null = comune_di_nascita___not___null;
            return this;
        }

        public Builder setComune_di_nascita___in(java.util.List<String> comune_di_nascita___in) {
            this.comune_di_nascita___in = comune_di_nascita___in;
            return this;
        }

        public Builder setComune_di_nascita___not___in(java.util.List<String> comune_di_nascita___not___in) {
            this.comune_di_nascita___not___in = comune_di_nascita___not___in;
            return this;
        }

        public Builder setComune_di_nascita___lt(String comune_di_nascita___lt) {
            this.comune_di_nascita___lt = comune_di_nascita___lt;
            return this;
        }

        public Builder setComune_di_nascita___lte(String comune_di_nascita___lte) {
            this.comune_di_nascita___lte = comune_di_nascita___lte;
            return this;
        }

        public Builder setComune_di_nascita___gt(String comune_di_nascita___gt) {
            this.comune_di_nascita___gt = comune_di_nascita___gt;
            return this;
        }

        public Builder setComune_di_nascita___gte(String comune_di_nascita___gte) {
            this.comune_di_nascita___gte = comune_di_nascita___gte;
            return this;
        }

        public Builder setComune_di_nascita___contains(String comune_di_nascita___contains) {
            this.comune_di_nascita___contains = comune_di_nascita___contains;
            return this;
        }

        public Builder setComune_di_nascita___not___contains(String comune_di_nascita___not___contains) {
            this.comune_di_nascita___not___contains = comune_di_nascita___not___contains;
            return this;
        }

        public Builder setComune_di_nascita___starts_with(String comune_di_nascita___starts_with) {
            this.comune_di_nascita___starts_with = comune_di_nascita___starts_with;
            return this;
        }

        public Builder setComune_di_nascita___not___starts_with(String comune_di_nascita___not___starts_with) {
            this.comune_di_nascita___not___starts_with = comune_di_nascita___not___starts_with;
            return this;
        }

        public Builder setComune_di_nascita___ends_with(String comune_di_nascita___ends_with) {
            this.comune_di_nascita___ends_with = comune_di_nascita___ends_with;
            return this;
        }

        public Builder setComune_di_nascita___not___ends_with(String comune_di_nascita___not___ends_with) {
            this.comune_di_nascita___not___ends_with = comune_di_nascita___not___ends_with;
            return this;
        }

        public Builder setData_consenso___eq(String data_consenso___eq) {
            this.data_consenso___eq = data_consenso___eq;
            return this;
        }

        public Builder setData_consenso___ne(String data_consenso___ne) {
            this.data_consenso___ne = data_consenso___ne;
            return this;
        }

        public Builder setData_consenso___null(Boolean data_consenso___null) {
            this.data_consenso___null = data_consenso___null;
            return this;
        }

        public Builder setData_consenso___not___null(Boolean data_consenso___not___null) {
            this.data_consenso___not___null = data_consenso___not___null;
            return this;
        }

        public Builder setData_consenso___in(java.util.List<String> data_consenso___in) {
            this.data_consenso___in = data_consenso___in;
            return this;
        }

        public Builder setData_consenso___not___in(java.util.List<String> data_consenso___not___in) {
            this.data_consenso___not___in = data_consenso___not___in;
            return this;
        }

        public Builder setData_consenso___lt(String data_consenso___lt) {
            this.data_consenso___lt = data_consenso___lt;
            return this;
        }

        public Builder setData_consenso___lte(String data_consenso___lte) {
            this.data_consenso___lte = data_consenso___lte;
            return this;
        }

        public Builder setData_consenso___gt(String data_consenso___gt) {
            this.data_consenso___gt = data_consenso___gt;
            return this;
        }

        public Builder setData_consenso___gte(String data_consenso___gte) {
            this.data_consenso___gte = data_consenso___gte;
            return this;
        }

        public Builder setData_consenso_pro___eq(String data_consenso_pro___eq) {
            this.data_consenso_pro___eq = data_consenso_pro___eq;
            return this;
        }

        public Builder setData_consenso_pro___ne(String data_consenso_pro___ne) {
            this.data_consenso_pro___ne = data_consenso_pro___ne;
            return this;
        }

        public Builder setData_consenso_pro___null(Boolean data_consenso_pro___null) {
            this.data_consenso_pro___null = data_consenso_pro___null;
            return this;
        }

        public Builder setData_consenso_pro___not___null(Boolean data_consenso_pro___not___null) {
            this.data_consenso_pro___not___null = data_consenso_pro___not___null;
            return this;
        }

        public Builder setData_consenso_pro___in(java.util.List<String> data_consenso_pro___in) {
            this.data_consenso_pro___in = data_consenso_pro___in;
            return this;
        }

        public Builder setData_consenso_pro___not___in(java.util.List<String> data_consenso_pro___not___in) {
            this.data_consenso_pro___not___in = data_consenso_pro___not___in;
            return this;
        }

        public Builder setData_consenso_pro___lt(String data_consenso_pro___lt) {
            this.data_consenso_pro___lt = data_consenso_pro___lt;
            return this;
        }

        public Builder setData_consenso_pro___lte(String data_consenso_pro___lte) {
            this.data_consenso_pro___lte = data_consenso_pro___lte;
            return this;
        }

        public Builder setData_consenso_pro___gt(String data_consenso_pro___gt) {
            this.data_consenso_pro___gt = data_consenso_pro___gt;
            return this;
        }

        public Builder setData_consenso_pro___gte(String data_consenso_pro___gte) {
            this.data_consenso_pro___gte = data_consenso_pro___gte;
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

        public Builder setData_fine_terapia_ormonale___eq(String data_fine_terapia_ormonale___eq) {
            this.data_fine_terapia_ormonale___eq = data_fine_terapia_ormonale___eq;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___ne(String data_fine_terapia_ormonale___ne) {
            this.data_fine_terapia_ormonale___ne = data_fine_terapia_ormonale___ne;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___null(Boolean data_fine_terapia_ormonale___null) {
            this.data_fine_terapia_ormonale___null = data_fine_terapia_ormonale___null;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___not___null(Boolean data_fine_terapia_ormonale___not___null) {
            this.data_fine_terapia_ormonale___not___null = data_fine_terapia_ormonale___not___null;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___in(java.util.List<String> data_fine_terapia_ormonale___in) {
            this.data_fine_terapia_ormonale___in = data_fine_terapia_ormonale___in;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___not___in(java.util.List<String> data_fine_terapia_ormonale___not___in) {
            this.data_fine_terapia_ormonale___not___in = data_fine_terapia_ormonale___not___in;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___lt(String data_fine_terapia_ormonale___lt) {
            this.data_fine_terapia_ormonale___lt = data_fine_terapia_ormonale___lt;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___lte(String data_fine_terapia_ormonale___lte) {
            this.data_fine_terapia_ormonale___lte = data_fine_terapia_ormonale___lte;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___gt(String data_fine_terapia_ormonale___gt) {
            this.data_fine_terapia_ormonale___gt = data_fine_terapia_ormonale___gt;
            return this;
        }

        public Builder setData_fine_terapia_ormonale___gte(String data_fine_terapia_ormonale___gte) {
            this.data_fine_terapia_ormonale___gte = data_fine_terapia_ormonale___gte;
            return this;
        }

        public Builder setData_gilbert___eq(String data_gilbert___eq) {
            this.data_gilbert___eq = data_gilbert___eq;
            return this;
        }

        public Builder setData_gilbert___ne(String data_gilbert___ne) {
            this.data_gilbert___ne = data_gilbert___ne;
            return this;
        }

        public Builder setData_gilbert___null(Boolean data_gilbert___null) {
            this.data_gilbert___null = data_gilbert___null;
            return this;
        }

        public Builder setData_gilbert___not___null(Boolean data_gilbert___not___null) {
            this.data_gilbert___not___null = data_gilbert___not___null;
            return this;
        }

        public Builder setData_gilbert___in(java.util.List<String> data_gilbert___in) {
            this.data_gilbert___in = data_gilbert___in;
            return this;
        }

        public Builder setData_gilbert___not___in(java.util.List<String> data_gilbert___not___in) {
            this.data_gilbert___not___in = data_gilbert___not___in;
            return this;
        }

        public Builder setData_gilbert___lt(String data_gilbert___lt) {
            this.data_gilbert___lt = data_gilbert___lt;
            return this;
        }

        public Builder setData_gilbert___lte(String data_gilbert___lte) {
            this.data_gilbert___lte = data_gilbert___lte;
            return this;
        }

        public Builder setData_gilbert___gt(String data_gilbert___gt) {
            this.data_gilbert___gt = data_gilbert___gt;
            return this;
        }

        public Builder setData_gilbert___gte(String data_gilbert___gte) {
            this.data_gilbert___gte = data_gilbert___gte;
            return this;
        }

        public Builder setData_hla___eq(String data_hla___eq) {
            this.data_hla___eq = data_hla___eq;
            return this;
        }

        public Builder setData_hla___ne(String data_hla___ne) {
            this.data_hla___ne = data_hla___ne;
            return this;
        }

        public Builder setData_hla___null(Boolean data_hla___null) {
            this.data_hla___null = data_hla___null;
            return this;
        }

        public Builder setData_hla___not___null(Boolean data_hla___not___null) {
            this.data_hla___not___null = data_hla___not___null;
            return this;
        }

        public Builder setData_hla___in(java.util.List<String> data_hla___in) {
            this.data_hla___in = data_hla___in;
            return this;
        }

        public Builder setData_hla___not___in(java.util.List<String> data_hla___not___in) {
            this.data_hla___not___in = data_hla___not___in;
            return this;
        }

        public Builder setData_hla___lt(String data_hla___lt) {
            this.data_hla___lt = data_hla___lt;
            return this;
        }

        public Builder setData_hla___lte(String data_hla___lte) {
            this.data_hla___lte = data_hla___lte;
            return this;
        }

        public Builder setData_hla___gt(String data_hla___gt) {
            this.data_hla___gt = data_hla___gt;
            return this;
        }

        public Builder setData_hla___gte(String data_hla___gte) {
            this.data_hla___gte = data_hla___gte;
            return this;
        }

        public Builder setData_il28___eq(String data_il28___eq) {
            this.data_il28___eq = data_il28___eq;
            return this;
        }

        public Builder setData_il28___ne(String data_il28___ne) {
            this.data_il28___ne = data_il28___ne;
            return this;
        }

        public Builder setData_il28___null(Boolean data_il28___null) {
            this.data_il28___null = data_il28___null;
            return this;
        }

        public Builder setData_il28___not___null(Boolean data_il28___not___null) {
            this.data_il28___not___null = data_il28___not___null;
            return this;
        }

        public Builder setData_il28___in(java.util.List<String> data_il28___in) {
            this.data_il28___in = data_il28___in;
            return this;
        }

        public Builder setData_il28___not___in(java.util.List<String> data_il28___not___in) {
            this.data_il28___not___in = data_il28___not___in;
            return this;
        }

        public Builder setData_il28___lt(String data_il28___lt) {
            this.data_il28___lt = data_il28___lt;
            return this;
        }

        public Builder setData_il28___lte(String data_il28___lte) {
            this.data_il28___lte = data_il28___lte;
            return this;
        }

        public Builder setData_il28___gt(String data_il28___gt) {
            this.data_il28___gt = data_il28___gt;
            return this;
        }

        public Builder setData_il28___gte(String data_il28___gte) {
            this.data_il28___gte = data_il28___gte;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___eq(String data_inizio_terapia_ormonale___eq) {
            this.data_inizio_terapia_ormonale___eq = data_inizio_terapia_ormonale___eq;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___ne(String data_inizio_terapia_ormonale___ne) {
            this.data_inizio_terapia_ormonale___ne = data_inizio_terapia_ormonale___ne;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___null(Boolean data_inizio_terapia_ormonale___null) {
            this.data_inizio_terapia_ormonale___null = data_inizio_terapia_ormonale___null;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___not___null(Boolean data_inizio_terapia_ormonale___not___null) {
            this.data_inizio_terapia_ormonale___not___null = data_inizio_terapia_ormonale___not___null;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___in(java.util.List<String> data_inizio_terapia_ormonale___in) {
            this.data_inizio_terapia_ormonale___in = data_inizio_terapia_ormonale___in;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___not___in(java.util.List<String> data_inizio_terapia_ormonale___not___in) {
            this.data_inizio_terapia_ormonale___not___in = data_inizio_terapia_ormonale___not___in;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___lt(String data_inizio_terapia_ormonale___lt) {
            this.data_inizio_terapia_ormonale___lt = data_inizio_terapia_ormonale___lt;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___lte(String data_inizio_terapia_ormonale___lte) {
            this.data_inizio_terapia_ormonale___lte = data_inizio_terapia_ormonale___lte;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___gt(String data_inizio_terapia_ormonale___gt) {
            this.data_inizio_terapia_ormonale___gt = data_inizio_terapia_ormonale___gt;
            return this;
        }

        public Builder setData_inizio_terapia_ormonale___gte(String data_inizio_terapia_ormonale___gte) {
            this.data_inizio_terapia_ormonale___gte = data_inizio_terapia_ormonale___gte;
            return this;
        }

        public Builder setData_menopausa___eq(String data_menopausa___eq) {
            this.data_menopausa___eq = data_menopausa___eq;
            return this;
        }

        public Builder setData_menopausa___ne(String data_menopausa___ne) {
            this.data_menopausa___ne = data_menopausa___ne;
            return this;
        }

        public Builder setData_menopausa___null(Boolean data_menopausa___null) {
            this.data_menopausa___null = data_menopausa___null;
            return this;
        }

        public Builder setData_menopausa___not___null(Boolean data_menopausa___not___null) {
            this.data_menopausa___not___null = data_menopausa___not___null;
            return this;
        }

        public Builder setData_menopausa___in(java.util.List<String> data_menopausa___in) {
            this.data_menopausa___in = data_menopausa___in;
            return this;
        }

        public Builder setData_menopausa___not___in(java.util.List<String> data_menopausa___not___in) {
            this.data_menopausa___not___in = data_menopausa___not___in;
            return this;
        }

        public Builder setData_menopausa___lt(String data_menopausa___lt) {
            this.data_menopausa___lt = data_menopausa___lt;
            return this;
        }

        public Builder setData_menopausa___lte(String data_menopausa___lte) {
            this.data_menopausa___lte = data_menopausa___lte;
            return this;
        }

        public Builder setData_menopausa___gt(String data_menopausa___gt) {
            this.data_menopausa___gt = data_menopausa___gt;
            return this;
        }

        public Builder setData_menopausa___gte(String data_menopausa___gte) {
            this.data_menopausa___gte = data_menopausa___gte;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___eq(String data_prima_terapia_anti_hcv___eq) {
            this.data_prima_terapia_anti_hcv___eq = data_prima_terapia_anti_hcv___eq;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___ne(String data_prima_terapia_anti_hcv___ne) {
            this.data_prima_terapia_anti_hcv___ne = data_prima_terapia_anti_hcv___ne;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___null(Boolean data_prima_terapia_anti_hcv___null) {
            this.data_prima_terapia_anti_hcv___null = data_prima_terapia_anti_hcv___null;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___not___null(Boolean data_prima_terapia_anti_hcv___not___null) {
            this.data_prima_terapia_anti_hcv___not___null = data_prima_terapia_anti_hcv___not___null;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___in(java.util.List<String> data_prima_terapia_anti_hcv___in) {
            this.data_prima_terapia_anti_hcv___in = data_prima_terapia_anti_hcv___in;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___not___in(java.util.List<String> data_prima_terapia_anti_hcv___not___in) {
            this.data_prima_terapia_anti_hcv___not___in = data_prima_terapia_anti_hcv___not___in;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___lt(String data_prima_terapia_anti_hcv___lt) {
            this.data_prima_terapia_anti_hcv___lt = data_prima_terapia_anti_hcv___lt;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___lte(String data_prima_terapia_anti_hcv___lte) {
            this.data_prima_terapia_anti_hcv___lte = data_prima_terapia_anti_hcv___lte;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___gt(String data_prima_terapia_anti_hcv___gt) {
            this.data_prima_terapia_anti_hcv___gt = data_prima_terapia_anti_hcv___gt;
            return this;
        }

        public Builder setData_prima_terapia_anti_hcv___gte(String data_prima_terapia_anti_hcv___gte) {
            this.data_prima_terapia_anti_hcv___gte = data_prima_terapia_anti_hcv___gte;
            return this;
        }

        public Builder setData_prima_visita___eq(String data_prima_visita___eq) {
            this.data_prima_visita___eq = data_prima_visita___eq;
            return this;
        }

        public Builder setData_prima_visita___ne(String data_prima_visita___ne) {
            this.data_prima_visita___ne = data_prima_visita___ne;
            return this;
        }

        public Builder setData_prima_visita___null(Boolean data_prima_visita___null) {
            this.data_prima_visita___null = data_prima_visita___null;
            return this;
        }

        public Builder setData_prima_visita___not___null(Boolean data_prima_visita___not___null) {
            this.data_prima_visita___not___null = data_prima_visita___not___null;
            return this;
        }

        public Builder setData_prima_visita___in(java.util.List<String> data_prima_visita___in) {
            this.data_prima_visita___in = data_prima_visita___in;
            return this;
        }

        public Builder setData_prima_visita___not___in(java.util.List<String> data_prima_visita___not___in) {
            this.data_prima_visita___not___in = data_prima_visita___not___in;
            return this;
        }

        public Builder setData_prima_visita___lt(String data_prima_visita___lt) {
            this.data_prima_visita___lt = data_prima_visita___lt;
            return this;
        }

        public Builder setData_prima_visita___lte(String data_prima_visita___lte) {
            this.data_prima_visita___lte = data_prima_visita___lte;
            return this;
        }

        public Builder setData_prima_visita___gt(String data_prima_visita___gt) {
            this.data_prima_visita___gt = data_prima_visita___gt;
            return this;
        }

        public Builder setData_prima_visita___gte(String data_prima_visita___gte) {
            this.data_prima_visita___gte = data_prima_visita___gte;
            return this;
        }

        public Builder setData_primo_hcvab_pos___eq(String data_primo_hcvab_pos___eq) {
            this.data_primo_hcvab_pos___eq = data_primo_hcvab_pos___eq;
            return this;
        }

        public Builder setData_primo_hcvab_pos___ne(String data_primo_hcvab_pos___ne) {
            this.data_primo_hcvab_pos___ne = data_primo_hcvab_pos___ne;
            return this;
        }

        public Builder setData_primo_hcvab_pos___null(Boolean data_primo_hcvab_pos___null) {
            this.data_primo_hcvab_pos___null = data_primo_hcvab_pos___null;
            return this;
        }

        public Builder setData_primo_hcvab_pos___not___null(Boolean data_primo_hcvab_pos___not___null) {
            this.data_primo_hcvab_pos___not___null = data_primo_hcvab_pos___not___null;
            return this;
        }

        public Builder setData_primo_hcvab_pos___in(java.util.List<String> data_primo_hcvab_pos___in) {
            this.data_primo_hcvab_pos___in = data_primo_hcvab_pos___in;
            return this;
        }

        public Builder setData_primo_hcvab_pos___not___in(java.util.List<String> data_primo_hcvab_pos___not___in) {
            this.data_primo_hcvab_pos___not___in = data_primo_hcvab_pos___not___in;
            return this;
        }

        public Builder setData_primo_hcvab_pos___lt(String data_primo_hcvab_pos___lt) {
            this.data_primo_hcvab_pos___lt = data_primo_hcvab_pos___lt;
            return this;
        }

        public Builder setData_primo_hcvab_pos___lte(String data_primo_hcvab_pos___lte) {
            this.data_primo_hcvab_pos___lte = data_primo_hcvab_pos___lte;
            return this;
        }

        public Builder setData_primo_hcvab_pos___gt(String data_primo_hcvab_pos___gt) {
            this.data_primo_hcvab_pos___gt = data_primo_hcvab_pos___gt;
            return this;
        }

        public Builder setData_primo_hcvab_pos___gte(String data_primo_hcvab_pos___gte) {
            this.data_primo_hcvab_pos___gte = data_primo_hcvab_pos___gte;
            return this;
        }

        public Builder setData_ultima_visita___eq(String data_ultima_visita___eq) {
            this.data_ultima_visita___eq = data_ultima_visita___eq;
            return this;
        }

        public Builder setData_ultima_visita___ne(String data_ultima_visita___ne) {
            this.data_ultima_visita___ne = data_ultima_visita___ne;
            return this;
        }

        public Builder setData_ultima_visita___null(Boolean data_ultima_visita___null) {
            this.data_ultima_visita___null = data_ultima_visita___null;
            return this;
        }

        public Builder setData_ultima_visita___not___null(Boolean data_ultima_visita___not___null) {
            this.data_ultima_visita___not___null = data_ultima_visita___not___null;
            return this;
        }

        public Builder setData_ultima_visita___in(java.util.List<String> data_ultima_visita___in) {
            this.data_ultima_visita___in = data_ultima_visita___in;
            return this;
        }

        public Builder setData_ultima_visita___not___in(java.util.List<String> data_ultima_visita___not___in) {
            this.data_ultima_visita___not___in = data_ultima_visita___not___in;
            return this;
        }

        public Builder setData_ultima_visita___lt(String data_ultima_visita___lt) {
            this.data_ultima_visita___lt = data_ultima_visita___lt;
            return this;
        }

        public Builder setData_ultima_visita___lte(String data_ultima_visita___lte) {
            this.data_ultima_visita___lte = data_ultima_visita___lte;
            return this;
        }

        public Builder setData_ultima_visita___gt(String data_ultima_visita___gt) {
            this.data_ultima_visita___gt = data_ultima_visita___gt;
            return this;
        }

        public Builder setData_ultima_visita___gte(String data_ultima_visita___gte) {
            this.data_ultima_visita___gte = data_ultima_visita___gte;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___eq(String data_ultimo_HCVAb_pre_arr___eq) {
            this.data_ultimo_HCVAb_pre_arr___eq = data_ultimo_HCVAb_pre_arr___eq;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___ne(String data_ultimo_HCVAb_pre_arr___ne) {
            this.data_ultimo_HCVAb_pre_arr___ne = data_ultimo_HCVAb_pre_arr___ne;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___null(Boolean data_ultimo_HCVAb_pre_arr___null) {
            this.data_ultimo_HCVAb_pre_arr___null = data_ultimo_HCVAb_pre_arr___null;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___not___null(Boolean data_ultimo_HCVAb_pre_arr___not___null) {
            this.data_ultimo_HCVAb_pre_arr___not___null = data_ultimo_HCVAb_pre_arr___not___null;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___in(java.util.List<String> data_ultimo_HCVAb_pre_arr___in) {
            this.data_ultimo_HCVAb_pre_arr___in = data_ultimo_HCVAb_pre_arr___in;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___not___in(java.util.List<String> data_ultimo_HCVAb_pre_arr___not___in) {
            this.data_ultimo_HCVAb_pre_arr___not___in = data_ultimo_HCVAb_pre_arr___not___in;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___lt(String data_ultimo_HCVAb_pre_arr___lt) {
            this.data_ultimo_HCVAb_pre_arr___lt = data_ultimo_HCVAb_pre_arr___lt;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___lte(String data_ultimo_HCVAb_pre_arr___lte) {
            this.data_ultimo_HCVAb_pre_arr___lte = data_ultimo_HCVAb_pre_arr___lte;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___gt(String data_ultimo_HCVAb_pre_arr___gt) {
            this.data_ultimo_HCVAb_pre_arr___gt = data_ultimo_HCVAb_pre_arr___gt;
            return this;
        }

        public Builder setData_ultimo_HCVAb_pre_arr___gte(String data_ultimo_HCVAb_pre_arr___gte) {
            this.data_ultimo_HCVAb_pre_arr___gte = data_ultimo_HCVAb_pre_arr___gte;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___eq(String data_ultimo_HbsAg_pre_arr___eq) {
            this.data_ultimo_HbsAg_pre_arr___eq = data_ultimo_HbsAg_pre_arr___eq;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___ne(String data_ultimo_HbsAg_pre_arr___ne) {
            this.data_ultimo_HbsAg_pre_arr___ne = data_ultimo_HbsAg_pre_arr___ne;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___null(Boolean data_ultimo_HbsAg_pre_arr___null) {
            this.data_ultimo_HbsAg_pre_arr___null = data_ultimo_HbsAg_pre_arr___null;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___not___null(Boolean data_ultimo_HbsAg_pre_arr___not___null) {
            this.data_ultimo_HbsAg_pre_arr___not___null = data_ultimo_HbsAg_pre_arr___not___null;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___in(java.util.List<String> data_ultimo_HbsAg_pre_arr___in) {
            this.data_ultimo_HbsAg_pre_arr___in = data_ultimo_HbsAg_pre_arr___in;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___not___in(java.util.List<String> data_ultimo_HbsAg_pre_arr___not___in) {
            this.data_ultimo_HbsAg_pre_arr___not___in = data_ultimo_HbsAg_pre_arr___not___in;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___lt(String data_ultimo_HbsAg_pre_arr___lt) {
            this.data_ultimo_HbsAg_pre_arr___lt = data_ultimo_HbsAg_pre_arr___lt;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___lte(String data_ultimo_HbsAg_pre_arr___lte) {
            this.data_ultimo_HbsAg_pre_arr___lte = data_ultimo_HbsAg_pre_arr___lte;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___gt(String data_ultimo_HbsAg_pre_arr___gt) {
            this.data_ultimo_HbsAg_pre_arr___gt = data_ultimo_HbsAg_pre_arr___gt;
            return this;
        }

        public Builder setData_ultimo_HbsAg_pre_arr___gte(String data_ultimo_HbsAg_pre_arr___gte) {
            this.data_ultimo_HbsAg_pre_arr___gte = data_ultimo_HbsAg_pre_arr___gte;
            return this;
        }

        public Builder setData_ultimo_drop___eq(String data_ultimo_drop___eq) {
            this.data_ultimo_drop___eq = data_ultimo_drop___eq;
            return this;
        }

        public Builder setData_ultimo_drop___ne(String data_ultimo_drop___ne) {
            this.data_ultimo_drop___ne = data_ultimo_drop___ne;
            return this;
        }

        public Builder setData_ultimo_drop___null(Boolean data_ultimo_drop___null) {
            this.data_ultimo_drop___null = data_ultimo_drop___null;
            return this;
        }

        public Builder setData_ultimo_drop___not___null(Boolean data_ultimo_drop___not___null) {
            this.data_ultimo_drop___not___null = data_ultimo_drop___not___null;
            return this;
        }

        public Builder setData_ultimo_drop___in(java.util.List<String> data_ultimo_drop___in) {
            this.data_ultimo_drop___in = data_ultimo_drop___in;
            return this;
        }

        public Builder setData_ultimo_drop___not___in(java.util.List<String> data_ultimo_drop___not___in) {
            this.data_ultimo_drop___not___in = data_ultimo_drop___not___in;
            return this;
        }

        public Builder setData_ultimo_drop___lt(String data_ultimo_drop___lt) {
            this.data_ultimo_drop___lt = data_ultimo_drop___lt;
            return this;
        }

        public Builder setData_ultimo_drop___lte(String data_ultimo_drop___lte) {
            this.data_ultimo_drop___lte = data_ultimo_drop___lte;
            return this;
        }

        public Builder setData_ultimo_drop___gt(String data_ultimo_drop___gt) {
            this.data_ultimo_drop___gt = data_ultimo_drop___gt;
            return this;
        }

        public Builder setData_ultimo_drop___gte(String data_ultimo_drop___gte) {
            this.data_ultimo_drop___gte = data_ultimo_drop___gte;
            return this;
        }

        public Builder setDate_longicona___eq(String date_longicona___eq) {
            this.date_longicona___eq = date_longicona___eq;
            return this;
        }

        public Builder setDate_longicona___ne(String date_longicona___ne) {
            this.date_longicona___ne = date_longicona___ne;
            return this;
        }

        public Builder setDate_longicona___null(Boolean date_longicona___null) {
            this.date_longicona___null = date_longicona___null;
            return this;
        }

        public Builder setDate_longicona___not___null(Boolean date_longicona___not___null) {
            this.date_longicona___not___null = date_longicona___not___null;
            return this;
        }

        public Builder setDate_longicona___in(java.util.List<String> date_longicona___in) {
            this.date_longicona___in = date_longicona___in;
            return this;
        }

        public Builder setDate_longicona___not___in(java.util.List<String> date_longicona___not___in) {
            this.date_longicona___not___in = date_longicona___not___in;
            return this;
        }

        public Builder setDate_longicona___lt(String date_longicona___lt) {
            this.date_longicona___lt = date_longicona___lt;
            return this;
        }

        public Builder setDate_longicona___lte(String date_longicona___lte) {
            this.date_longicona___lte = date_longicona___lte;
            return this;
        }

        public Builder setDate_longicona___gt(String date_longicona___gt) {
            this.date_longicona___gt = date_longicona___gt;
            return this;
        }

        public Builder setDate_longicona___gte(String date_longicona___gte) {
            this.date_longicona___gte = date_longicona___gte;
            return this;
        }

        public Builder setDate_longicona___contains(String date_longicona___contains) {
            this.date_longicona___contains = date_longicona___contains;
            return this;
        }

        public Builder setDate_longicona___not___contains(String date_longicona___not___contains) {
            this.date_longicona___not___contains = date_longicona___not___contains;
            return this;
        }

        public Builder setDate_longicona___starts_with(String date_longicona___starts_with) {
            this.date_longicona___starts_with = date_longicona___starts_with;
            return this;
        }

        public Builder setDate_longicona___not___starts_with(String date_longicona___not___starts_with) {
            this.date_longicona___not___starts_with = date_longicona___not___starts_with;
            return this;
        }

        public Builder setDate_longicona___ends_with(String date_longicona___ends_with) {
            this.date_longicona___ends_with = date_longicona___ends_with;
            return this;
        }

        public Builder setDate_longicona___not___ends_with(String date_longicona___not___ends_with) {
            this.date_longicona___not___ends_with = date_longicona___not___ends_with;
            return this;
        }

        public Builder setDtg___eq(Boolean dtg___eq) {
            this.dtg___eq = dtg___eq;
            return this;
        }

        public Builder setDtg___ne(Boolean dtg___ne) {
            this.dtg___ne = dtg___ne;
            return this;
        }

        public Builder setDtg___null(Boolean dtg___null) {
            this.dtg___null = dtg___null;
            return this;
        }

        public Builder setDtg___not___null(Boolean dtg___not___null) {
            this.dtg___not___null = dtg___not___null;
            return this;
        }

        public Builder setEsito_ultima_terapia___eq(String esito_ultima_terapia___eq) {
            this.esito_ultima_terapia___eq = esito_ultima_terapia___eq;
            return this;
        }

        public Builder setEsito_ultima_terapia___ne(String esito_ultima_terapia___ne) {
            this.esito_ultima_terapia___ne = esito_ultima_terapia___ne;
            return this;
        }

        public Builder setEsito_ultima_terapia___null(Boolean esito_ultima_terapia___null) {
            this.esito_ultima_terapia___null = esito_ultima_terapia___null;
            return this;
        }

        public Builder setEsito_ultima_terapia___not___null(Boolean esito_ultima_terapia___not___null) {
            this.esito_ultima_terapia___not___null = esito_ultima_terapia___not___null;
            return this;
        }

        public Builder setEsito_ultima_terapia___in(java.util.List<String> esito_ultima_terapia___in) {
            this.esito_ultima_terapia___in = esito_ultima_terapia___in;
            return this;
        }

        public Builder setEsito_ultima_terapia___not___in(java.util.List<String> esito_ultima_terapia___not___in) {
            this.esito_ultima_terapia___not___in = esito_ultima_terapia___not___in;
            return this;
        }

        public Builder setEsito_ultima_terapia___lt(String esito_ultima_terapia___lt) {
            this.esito_ultima_terapia___lt = esito_ultima_terapia___lt;
            return this;
        }

        public Builder setEsito_ultima_terapia___lte(String esito_ultima_terapia___lte) {
            this.esito_ultima_terapia___lte = esito_ultima_terapia___lte;
            return this;
        }

        public Builder setEsito_ultima_terapia___gt(String esito_ultima_terapia___gt) {
            this.esito_ultima_terapia___gt = esito_ultima_terapia___gt;
            return this;
        }

        public Builder setEsito_ultima_terapia___gte(String esito_ultima_terapia___gte) {
            this.esito_ultima_terapia___gte = esito_ultima_terapia___gte;
            return this;
        }

        public Builder setEsito_ultima_terapia___contains(String esito_ultima_terapia___contains) {
            this.esito_ultima_terapia___contains = esito_ultima_terapia___contains;
            return this;
        }

        public Builder setEsito_ultima_terapia___not___contains(String esito_ultima_terapia___not___contains) {
            this.esito_ultima_terapia___not___contains = esito_ultima_terapia___not___contains;
            return this;
        }

        public Builder setEsito_ultima_terapia___starts_with(String esito_ultima_terapia___starts_with) {
            this.esito_ultima_terapia___starts_with = esito_ultima_terapia___starts_with;
            return this;
        }

        public Builder setEsito_ultima_terapia___not___starts_with(String esito_ultima_terapia___not___starts_with) {
            this.esito_ultima_terapia___not___starts_with = esito_ultima_terapia___not___starts_with;
            return this;
        }

        public Builder setEsito_ultima_terapia___ends_with(String esito_ultima_terapia___ends_with) {
            this.esito_ultima_terapia___ends_with = esito_ultima_terapia___ends_with;
            return this;
        }

        public Builder setEsito_ultima_terapia___not___ends_with(String esito_ultima_terapia___not___ends_with) {
            this.esito_ultima_terapia___not___ends_with = esito_ultima_terapia___not___ends_with;
            return this;
        }

        public Builder setEta_arruolamento___eq(Integer eta_arruolamento___eq) {
            this.eta_arruolamento___eq = eta_arruolamento___eq;
            return this;
        }

        public Builder setEta_arruolamento___ne(Integer eta_arruolamento___ne) {
            this.eta_arruolamento___ne = eta_arruolamento___ne;
            return this;
        }

        public Builder setEta_arruolamento___null(Boolean eta_arruolamento___null) {
            this.eta_arruolamento___null = eta_arruolamento___null;
            return this;
        }

        public Builder setEta_arruolamento___not___null(Boolean eta_arruolamento___not___null) {
            this.eta_arruolamento___not___null = eta_arruolamento___not___null;
            return this;
        }

        public Builder setEta_arruolamento___in(java.util.List<Integer> eta_arruolamento___in) {
            this.eta_arruolamento___in = eta_arruolamento___in;
            return this;
        }

        public Builder setEta_arruolamento___not___in(java.util.List<Integer> eta_arruolamento___not___in) {
            this.eta_arruolamento___not___in = eta_arruolamento___not___in;
            return this;
        }

        public Builder setEta_arruolamento___lt(Integer eta_arruolamento___lt) {
            this.eta_arruolamento___lt = eta_arruolamento___lt;
            return this;
        }

        public Builder setEta_arruolamento___lte(Integer eta_arruolamento___lte) {
            this.eta_arruolamento___lte = eta_arruolamento___lte;
            return this;
        }

        public Builder setEta_arruolamento___gt(Integer eta_arruolamento___gt) {
            this.eta_arruolamento___gt = eta_arruolamento___gt;
            return this;
        }

        public Builder setEta_arruolamento___gte(Integer eta_arruolamento___gte) {
            this.eta_arruolamento___gte = eta_arruolamento___gte;
            return this;
        }

        public Builder setEta_prima_visita___eq(Integer eta_prima_visita___eq) {
            this.eta_prima_visita___eq = eta_prima_visita___eq;
            return this;
        }

        public Builder setEta_prima_visita___ne(Integer eta_prima_visita___ne) {
            this.eta_prima_visita___ne = eta_prima_visita___ne;
            return this;
        }

        public Builder setEta_prima_visita___null(Boolean eta_prima_visita___null) {
            this.eta_prima_visita___null = eta_prima_visita___null;
            return this;
        }

        public Builder setEta_prima_visita___not___null(Boolean eta_prima_visita___not___null) {
            this.eta_prima_visita___not___null = eta_prima_visita___not___null;
            return this;
        }

        public Builder setEta_prima_visita___in(java.util.List<Integer> eta_prima_visita___in) {
            this.eta_prima_visita___in = eta_prima_visita___in;
            return this;
        }

        public Builder setEta_prima_visita___not___in(java.util.List<Integer> eta_prima_visita___not___in) {
            this.eta_prima_visita___not___in = eta_prima_visita___not___in;
            return this;
        }

        public Builder setEta_prima_visita___lt(Integer eta_prima_visita___lt) {
            this.eta_prima_visita___lt = eta_prima_visita___lt;
            return this;
        }

        public Builder setEta_prima_visita___lte(Integer eta_prima_visita___lte) {
            this.eta_prima_visita___lte = eta_prima_visita___lte;
            return this;
        }

        public Builder setEta_prima_visita___gt(Integer eta_prima_visita___gt) {
            this.eta_prima_visita___gt = eta_prima_visita___gt;
            return this;
        }

        public Builder setEta_prima_visita___gte(Integer eta_prima_visita___gte) {
            this.eta_prima_visita___gte = eta_prima_visita___gte;
            return this;
        }

        public Builder setEtnia____eq(String etnia____eq) {
            this.etnia____eq = etnia____eq;
            return this;
        }

        public Builder setEtnia____ne(String etnia____ne) {
            this.etnia____ne = etnia____ne;
            return this;
        }

        public Builder setEtnia____null(Boolean etnia____null) {
            this.etnia____null = etnia____null;
            return this;
        }

        public Builder setEtnia____not___null(Boolean etnia____not___null) {
            this.etnia____not___null = etnia____not___null;
            return this;
        }

        public Builder setEtnia____in(java.util.List<String> etnia____in) {
            this.etnia____in = etnia____in;
            return this;
        }

        public Builder setEtnia____not___in(java.util.List<String> etnia____not___in) {
            this.etnia____not___in = etnia____not___in;
            return this;
        }

        public Builder setEtnia____lt(String etnia____lt) {
            this.etnia____lt = etnia____lt;
            return this;
        }

        public Builder setEtnia____lte(String etnia____lte) {
            this.etnia____lte = etnia____lte;
            return this;
        }

        public Builder setEtnia____gt(String etnia____gt) {
            this.etnia____gt = etnia____gt;
            return this;
        }

        public Builder setEtnia____gte(String etnia____gte) {
            this.etnia____gte = etnia____gte;
            return this;
        }

        public Builder setEtnia____contains(String etnia____contains) {
            this.etnia____contains = etnia____contains;
            return this;
        }

        public Builder setEtnia____not___contains(String etnia____not___contains) {
            this.etnia____not___contains = etnia____not___contains;
            return this;
        }

        public Builder setEtnia____starts_with(String etnia____starts_with) {
            this.etnia____starts_with = etnia____starts_with;
            return this;
        }

        public Builder setEtnia____not___starts_with(String etnia____not___starts_with) {
            this.etnia____not___starts_with = etnia____not___starts_with;
            return this;
        }

        public Builder setEtnia____ends_with(String etnia____ends_with) {
            this.etnia____ends_with = etnia____ends_with;
            return this;
        }

        public Builder setEtnia____not___ends_with(String etnia____not___ends_with) {
            this.etnia____not___ends_with = etnia____not___ends_with;
            return this;
        }

        public Builder setFattore_di_rischio____eq(String fattore_di_rischio____eq) {
            this.fattore_di_rischio____eq = fattore_di_rischio____eq;
            return this;
        }

        public Builder setFattore_di_rischio____ne(String fattore_di_rischio____ne) {
            this.fattore_di_rischio____ne = fattore_di_rischio____ne;
            return this;
        }

        public Builder setFattore_di_rischio____null(Boolean fattore_di_rischio____null) {
            this.fattore_di_rischio____null = fattore_di_rischio____null;
            return this;
        }

        public Builder setFattore_di_rischio____not___null(Boolean fattore_di_rischio____not___null) {
            this.fattore_di_rischio____not___null = fattore_di_rischio____not___null;
            return this;
        }

        public Builder setFattore_di_rischio____in(java.util.List<String> fattore_di_rischio____in) {
            this.fattore_di_rischio____in = fattore_di_rischio____in;
            return this;
        }

        public Builder setFattore_di_rischio____not___in(java.util.List<String> fattore_di_rischio____not___in) {
            this.fattore_di_rischio____not___in = fattore_di_rischio____not___in;
            return this;
        }

        public Builder setFattore_di_rischio____lt(String fattore_di_rischio____lt) {
            this.fattore_di_rischio____lt = fattore_di_rischio____lt;
            return this;
        }

        public Builder setFattore_di_rischio____lte(String fattore_di_rischio____lte) {
            this.fattore_di_rischio____lte = fattore_di_rischio____lte;
            return this;
        }

        public Builder setFattore_di_rischio____gt(String fattore_di_rischio____gt) {
            this.fattore_di_rischio____gt = fattore_di_rischio____gt;
            return this;
        }

        public Builder setFattore_di_rischio____gte(String fattore_di_rischio____gte) {
            this.fattore_di_rischio____gte = fattore_di_rischio____gte;
            return this;
        }

        public Builder setFattore_di_rischio____contains(String fattore_di_rischio____contains) {
            this.fattore_di_rischio____contains = fattore_di_rischio____contains;
            return this;
        }

        public Builder setFattore_di_rischio____not___contains(String fattore_di_rischio____not___contains) {
            this.fattore_di_rischio____not___contains = fattore_di_rischio____not___contains;
            return this;
        }

        public Builder setFattore_di_rischio____starts_with(String fattore_di_rischio____starts_with) {
            this.fattore_di_rischio____starts_with = fattore_di_rischio____starts_with;
            return this;
        }

        public Builder setFattore_di_rischio____not___starts_with(String fattore_di_rischio____not___starts_with) {
            this.fattore_di_rischio____not___starts_with = fattore_di_rischio____not___starts_with;
            return this;
        }

        public Builder setFattore_di_rischio____ends_with(String fattore_di_rischio____ends_with) {
            this.fattore_di_rischio____ends_with = fattore_di_rischio____ends_with;
            return this;
        }

        public Builder setFattore_di_rischio____not___ends_with(String fattore_di_rischio____not___ends_with) {
            this.fattore_di_rischio____not___ends_with = fattore_di_rischio____not___ends_with;
            return this;
        }

        public Builder setFibroscan___eq(Boolean fibroscan___eq) {
            this.fibroscan___eq = fibroscan___eq;
            return this;
        }

        public Builder setFibroscan___ne(Boolean fibroscan___ne) {
            this.fibroscan___ne = fibroscan___ne;
            return this;
        }

        public Builder setFibroscan___null(Boolean fibroscan___null) {
            this.fibroscan___null = fibroscan___null;
            return this;
        }

        public Builder setFibroscan___not___null(Boolean fibroscan___not___null) {
            this.fibroscan___not___null = fibroscan___not___null;
            return this;
        }

        public Builder setHbsag_pos___eq(Boolean hbsag_pos___eq) {
            this.hbsag_pos___eq = hbsag_pos___eq;
            return this;
        }

        public Builder setHbsag_pos___ne(Boolean hbsag_pos___ne) {
            this.hbsag_pos___ne = hbsag_pos___ne;
            return this;
        }

        public Builder setHbsag_pos___null(Boolean hbsag_pos___null) {
            this.hbsag_pos___null = hbsag_pos___null;
            return this;
        }

        public Builder setHbsag_pos___not___null(Boolean hbsag_pos___not___null) {
            this.hbsag_pos___not___null = hbsag_pos___not___null;
            return this;
        }

        public Builder setHcvab_pos___eq(Boolean hcvab_pos___eq) {
            this.hcvab_pos___eq = hcvab_pos___eq;
            return this;
        }

        public Builder setHcvab_pos___ne(Boolean hcvab_pos___ne) {
            this.hcvab_pos___ne = hcvab_pos___ne;
            return this;
        }

        public Builder setHcvab_pos___null(Boolean hcvab_pos___null) {
            this.hcvab_pos___null = hcvab_pos___null;
            return this;
        }

        public Builder setHcvab_pos___not___null(Boolean hcvab_pos___not___null) {
            this.hcvab_pos___not___null = hcvab_pos___not___null;
            return this;
        }

        public Builder setHla_b5701___eq(String hla_b5701___eq) {
            this.hla_b5701___eq = hla_b5701___eq;
            return this;
        }

        public Builder setHla_b5701___ne(String hla_b5701___ne) {
            this.hla_b5701___ne = hla_b5701___ne;
            return this;
        }

        public Builder setHla_b5701___null(Boolean hla_b5701___null) {
            this.hla_b5701___null = hla_b5701___null;
            return this;
        }

        public Builder setHla_b5701___not___null(Boolean hla_b5701___not___null) {
            this.hla_b5701___not___null = hla_b5701___not___null;
            return this;
        }

        public Builder setHla_b5701___in(java.util.List<String> hla_b5701___in) {
            this.hla_b5701___in = hla_b5701___in;
            return this;
        }

        public Builder setHla_b5701___not___in(java.util.List<String> hla_b5701___not___in) {
            this.hla_b5701___not___in = hla_b5701___not___in;
            return this;
        }

        public Builder setHla_b5701___lt(String hla_b5701___lt) {
            this.hla_b5701___lt = hla_b5701___lt;
            return this;
        }

        public Builder setHla_b5701___lte(String hla_b5701___lte) {
            this.hla_b5701___lte = hla_b5701___lte;
            return this;
        }

        public Builder setHla_b5701___gt(String hla_b5701___gt) {
            this.hla_b5701___gt = hla_b5701___gt;
            return this;
        }

        public Builder setHla_b5701___gte(String hla_b5701___gte) {
            this.hla_b5701___gte = hla_b5701___gte;
            return this;
        }

        public Builder setHla_b5701___contains(String hla_b5701___contains) {
            this.hla_b5701___contains = hla_b5701___contains;
            return this;
        }

        public Builder setHla_b5701___not___contains(String hla_b5701___not___contains) {
            this.hla_b5701___not___contains = hla_b5701___not___contains;
            return this;
        }

        public Builder setHla_b5701___starts_with(String hla_b5701___starts_with) {
            this.hla_b5701___starts_with = hla_b5701___starts_with;
            return this;
        }

        public Builder setHla_b5701___not___starts_with(String hla_b5701___not___starts_with) {
            this.hla_b5701___not___starts_with = hla_b5701___not___starts_with;
            return this;
        }

        public Builder setHla_b5701___ends_with(String hla_b5701___ends_with) {
            this.hla_b5701___ends_with = hla_b5701___ends_with;
            return this;
        }

        public Builder setHla_b5701___not___ends_with(String hla_b5701___not___ends_with) {
            this.hla_b5701___not___ends_with = hla_b5701___not___ends_with;
            return this;
        }

        public Builder setHla_b5701_bool___eq(Boolean hla_b5701_bool___eq) {
            this.hla_b5701_bool___eq = hla_b5701_bool___eq;
            return this;
        }

        public Builder setHla_b5701_bool___ne(Boolean hla_b5701_bool___ne) {
            this.hla_b5701_bool___ne = hla_b5701_bool___ne;
            return this;
        }

        public Builder setHla_b5701_bool___null(Boolean hla_b5701_bool___null) {
            this.hla_b5701_bool___null = hla_b5701_bool___null;
            return this;
        }

        public Builder setHla_b5701_bool___not___null(Boolean hla_b5701_bool___not___null) {
            this.hla_b5701_bool___not___null = hla_b5701_bool___not___null;
            return this;
        }

        public Builder setId_paziente___eq(Integer id_paziente___eq) {
            this.id_paziente___eq = id_paziente___eq;
            return this;
        }

        public Builder setId_paziente___ne(Integer id_paziente___ne) {
            this.id_paziente___ne = id_paziente___ne;
            return this;
        }

        public Builder setId_paziente___null(Boolean id_paziente___null) {
            this.id_paziente___null = id_paziente___null;
            return this;
        }

        public Builder setId_paziente___not___null(Boolean id_paziente___not___null) {
            this.id_paziente___not___null = id_paziente___not___null;
            return this;
        }

        public Builder setId_paziente___in(java.util.List<Integer> id_paziente___in) {
            this.id_paziente___in = id_paziente___in;
            return this;
        }

        public Builder setId_paziente___not___in(java.util.List<Integer> id_paziente___not___in) {
            this.id_paziente___not___in = id_paziente___not___in;
            return this;
        }

        public Builder setId_paziente___lt(Integer id_paziente___lt) {
            this.id_paziente___lt = id_paziente___lt;
            return this;
        }

        public Builder setId_paziente___lte(Integer id_paziente___lte) {
            this.id_paziente___lte = id_paziente___lte;
            return this;
        }

        public Builder setId_paziente___gt(Integer id_paziente___gt) {
            this.id_paziente___gt = id_paziente___gt;
            return this;
        }

        public Builder setId_paziente___gte(Integer id_paziente___gte) {
            this.id_paziente___gte = id_paziente___gte;
            return this;
        }

        public Builder setIfn___eq(Boolean ifn___eq) {
            this.ifn___eq = ifn___eq;
            return this;
        }

        public Builder setIfn___ne(Boolean ifn___ne) {
            this.ifn___ne = ifn___ne;
            return this;
        }

        public Builder setIfn___null(Boolean ifn___null) {
            this.ifn___null = ifn___null;
            return this;
        }

        public Builder setIfn___not___null(Boolean ifn___not___null) {
            this.ifn___not___null = ifn___not___null;
            return this;
        }

        public Builder setIn_italia_da_anni___eq(Integer in_italia_da_anni___eq) {
            this.in_italia_da_anni___eq = in_italia_da_anni___eq;
            return this;
        }

        public Builder setIn_italia_da_anni___ne(Integer in_italia_da_anni___ne) {
            this.in_italia_da_anni___ne = in_italia_da_anni___ne;
            return this;
        }

        public Builder setIn_italia_da_anni___null(Boolean in_italia_da_anni___null) {
            this.in_italia_da_anni___null = in_italia_da_anni___null;
            return this;
        }

        public Builder setIn_italia_da_anni___not___null(Boolean in_italia_da_anni___not___null) {
            this.in_italia_da_anni___not___null = in_italia_da_anni___not___null;
            return this;
        }

        public Builder setIn_italia_da_anni___in(java.util.List<Integer> in_italia_da_anni___in) {
            this.in_italia_da_anni___in = in_italia_da_anni___in;
            return this;
        }

        public Builder setIn_italia_da_anni___not___in(java.util.List<Integer> in_italia_da_anni___not___in) {
            this.in_italia_da_anni___not___in = in_italia_da_anni___not___in;
            return this;
        }

        public Builder setIn_italia_da_anni___lt(Integer in_italia_da_anni___lt) {
            this.in_italia_da_anni___lt = in_italia_da_anni___lt;
            return this;
        }

        public Builder setIn_italia_da_anni___lte(Integer in_italia_da_anni___lte) {
            this.in_italia_da_anni___lte = in_italia_da_anni___lte;
            return this;
        }

        public Builder setIn_italia_da_anni___gt(Integer in_italia_da_anni___gt) {
            this.in_italia_da_anni___gt = in_italia_da_anni___gt;
            return this;
        }

        public Builder setIn_italia_da_anni___gte(Integer in_italia_da_anni___gte) {
            this.in_italia_da_anni___gte = in_italia_da_anni___gte;
            return this;
        }

        public Builder setNascita___eq(String nascita___eq) {
            this.nascita___eq = nascita___eq;
            return this;
        }

        public Builder setNascita___ne(String nascita___ne) {
            this.nascita___ne = nascita___ne;
            return this;
        }

        public Builder setNascita___null(Boolean nascita___null) {
            this.nascita___null = nascita___null;
            return this;
        }

        public Builder setNascita___not___null(Boolean nascita___not___null) {
            this.nascita___not___null = nascita___not___null;
            return this;
        }

        public Builder setNascita___in(java.util.List<String> nascita___in) {
            this.nascita___in = nascita___in;
            return this;
        }

        public Builder setNascita___not___in(java.util.List<String> nascita___not___in) {
            this.nascita___not___in = nascita___not___in;
            return this;
        }

        public Builder setNascita___lt(String nascita___lt) {
            this.nascita___lt = nascita___lt;
            return this;
        }

        public Builder setNascita___lte(String nascita___lte) {
            this.nascita___lte = nascita___lte;
            return this;
        }

        public Builder setNascita___gt(String nascita___gt) {
            this.nascita___gt = nascita___gt;
            return this;
        }

        public Builder setNascita___gte(String nascita___gte) {
            this.nascita___gte = nascita___gte;
            return this;
        }

        public Builder setNazionalita____eq(String nazionalita____eq) {
            this.nazionalita____eq = nazionalita____eq;
            return this;
        }

        public Builder setNazionalita____ne(String nazionalita____ne) {
            this.nazionalita____ne = nazionalita____ne;
            return this;
        }

        public Builder setNazionalita____null(Boolean nazionalita____null) {
            this.nazionalita____null = nazionalita____null;
            return this;
        }

        public Builder setNazionalita____not___null(Boolean nazionalita____not___null) {
            this.nazionalita____not___null = nazionalita____not___null;
            return this;
        }

        public Builder setNazionalita____in(java.util.List<String> nazionalita____in) {
            this.nazionalita____in = nazionalita____in;
            return this;
        }

        public Builder setNazionalita____not___in(java.util.List<String> nazionalita____not___in) {
            this.nazionalita____not___in = nazionalita____not___in;
            return this;
        }

        public Builder setNazionalita____lt(String nazionalita____lt) {
            this.nazionalita____lt = nazionalita____lt;
            return this;
        }

        public Builder setNazionalita____lte(String nazionalita____lte) {
            this.nazionalita____lte = nazionalita____lte;
            return this;
        }

        public Builder setNazionalita____gt(String nazionalita____gt) {
            this.nazionalita____gt = nazionalita____gt;
            return this;
        }

        public Builder setNazionalita____gte(String nazionalita____gte) {
            this.nazionalita____gte = nazionalita____gte;
            return this;
        }

        public Builder setNazionalita____contains(String nazionalita____contains) {
            this.nazionalita____contains = nazionalita____contains;
            return this;
        }

        public Builder setNazionalita____not___contains(String nazionalita____not___contains) {
            this.nazionalita____not___contains = nazionalita____not___contains;
            return this;
        }

        public Builder setNazionalita____starts_with(String nazionalita____starts_with) {
            this.nazionalita____starts_with = nazionalita____starts_with;
            return this;
        }

        public Builder setNazionalita____not___starts_with(String nazionalita____not___starts_with) {
            this.nazionalita____not___starts_with = nazionalita____not___starts_with;
            return this;
        }

        public Builder setNazionalita____ends_with(String nazionalita____ends_with) {
            this.nazionalita____ends_with = nazionalita____ends_with;
            return this;
        }

        public Builder setNazionalita____not___ends_with(String nazionalita____not___ends_with) {
            this.nazionalita____not___ends_with = nazionalita____not___ends_with;
            return this;
        }

        public Builder setNazione___eq(String nazione___eq) {
            this.nazione___eq = nazione___eq;
            return this;
        }

        public Builder setNazione___ne(String nazione___ne) {
            this.nazione___ne = nazione___ne;
            return this;
        }

        public Builder setNazione___null(Boolean nazione___null) {
            this.nazione___null = nazione___null;
            return this;
        }

        public Builder setNazione___not___null(Boolean nazione___not___null) {
            this.nazione___not___null = nazione___not___null;
            return this;
        }

        public Builder setNazione___in(java.util.List<String> nazione___in) {
            this.nazione___in = nazione___in;
            return this;
        }

        public Builder setNazione___not___in(java.util.List<String> nazione___not___in) {
            this.nazione___not___in = nazione___not___in;
            return this;
        }

        public Builder setNazione___lt(String nazione___lt) {
            this.nazione___lt = nazione___lt;
            return this;
        }

        public Builder setNazione___lte(String nazione___lte) {
            this.nazione___lte = nazione___lte;
            return this;
        }

        public Builder setNazione___gt(String nazione___gt) {
            this.nazione___gt = nazione___gt;
            return this;
        }

        public Builder setNazione___gte(String nazione___gte) {
            this.nazione___gte = nazione___gte;
            return this;
        }

        public Builder setNazione___contains(String nazione___contains) {
            this.nazione___contains = nazione___contains;
            return this;
        }

        public Builder setNazione___not___contains(String nazione___not___contains) {
            this.nazione___not___contains = nazione___not___contains;
            return this;
        }

        public Builder setNazione___starts_with(String nazione___starts_with) {
            this.nazione___starts_with = nazione___starts_with;
            return this;
        }

        public Builder setNazione___not___starts_with(String nazione___not___starts_with) {
            this.nazione___not___starts_with = nazione___not___starts_with;
            return this;
        }

        public Builder setNazione___ends_with(String nazione___ends_with) {
            this.nazione___ends_with = nazione___ends_with;
            return this;
        }

        public Builder setNazione___not___ends_with(String nazione___not___ends_with) {
            this.nazione___not___ends_with = nazione___not___ends_with;
            return this;
        }

        public Builder setNoco___eq(Boolean noco___eq) {
            this.noco___eq = noco___eq;
            return this;
        }

        public Builder setNoco___ne(Boolean noco___ne) {
            this.noco___ne = noco___ne;
            return this;
        }

        public Builder setNoco___null(Boolean noco___null) {
            this.noco___null = noco___null;
            return this;
        }

        public Builder setNoco___not___null(Boolean noco___not___null) {
            this.noco___not___null = noco___not___null;
            return this;
        }

        public Builder setNome___eq(String nome___eq) {
            this.nome___eq = nome___eq;
            return this;
        }

        public Builder setNome___ne(String nome___ne) {
            this.nome___ne = nome___ne;
            return this;
        }

        public Builder setNome___null(Boolean nome___null) {
            this.nome___null = nome___null;
            return this;
        }

        public Builder setNome___not___null(Boolean nome___not___null) {
            this.nome___not___null = nome___not___null;
            return this;
        }

        public Builder setNome___in(java.util.List<String> nome___in) {
            this.nome___in = nome___in;
            return this;
        }

        public Builder setNome___not___in(java.util.List<String> nome___not___in) {
            this.nome___not___in = nome___not___in;
            return this;
        }

        public Builder setNome___lt(String nome___lt) {
            this.nome___lt = nome___lt;
            return this;
        }

        public Builder setNome___lte(String nome___lte) {
            this.nome___lte = nome___lte;
            return this;
        }

        public Builder setNome___gt(String nome___gt) {
            this.nome___gt = nome___gt;
            return this;
        }

        public Builder setNome___gte(String nome___gte) {
            this.nome___gte = nome___gte;
            return this;
        }

        public Builder setNome___contains(String nome___contains) {
            this.nome___contains = nome___contains;
            return this;
        }

        public Builder setNome___not___contains(String nome___not___contains) {
            this.nome___not___contains = nome___not___contains;
            return this;
        }

        public Builder setNome___starts_with(String nome___starts_with) {
            this.nome___starts_with = nome___starts_with;
            return this;
        }

        public Builder setNome___not___starts_with(String nome___not___starts_with) {
            this.nome___not___starts_with = nome___not___starts_with;
            return this;
        }

        public Builder setNome___ends_with(String nome___ends_with) {
            this.nome___ends_with = nome___ends_with;
            return this;
        }

        public Builder setNome___not___ends_with(String nome___not___ends_with) {
            this.nome___not___ends_with = nome___not___ends_with;
            return this;
        }

        public Builder setNote_terapia___eq(String note_terapia___eq) {
            this.note_terapia___eq = note_terapia___eq;
            return this;
        }

        public Builder setNote_terapia___ne(String note_terapia___ne) {
            this.note_terapia___ne = note_terapia___ne;
            return this;
        }

        public Builder setNote_terapia___null(Boolean note_terapia___null) {
            this.note_terapia___null = note_terapia___null;
            return this;
        }

        public Builder setNote_terapia___not___null(Boolean note_terapia___not___null) {
            this.note_terapia___not___null = note_terapia___not___null;
            return this;
        }

        public Builder setNote_terapia___in(java.util.List<String> note_terapia___in) {
            this.note_terapia___in = note_terapia___in;
            return this;
        }

        public Builder setNote_terapia___not___in(java.util.List<String> note_terapia___not___in) {
            this.note_terapia___not___in = note_terapia___not___in;
            return this;
        }

        public Builder setNote_terapia___lt(String note_terapia___lt) {
            this.note_terapia___lt = note_terapia___lt;
            return this;
        }

        public Builder setNote_terapia___lte(String note_terapia___lte) {
            this.note_terapia___lte = note_terapia___lte;
            return this;
        }

        public Builder setNote_terapia___gt(String note_terapia___gt) {
            this.note_terapia___gt = note_terapia___gt;
            return this;
        }

        public Builder setNote_terapia___gte(String note_terapia___gte) {
            this.note_terapia___gte = note_terapia___gte;
            return this;
        }

        public Builder setNote_terapia___contains(String note_terapia___contains) {
            this.note_terapia___contains = note_terapia___contains;
            return this;
        }

        public Builder setNote_terapia___not___contains(String note_terapia___not___contains) {
            this.note_terapia___not___contains = note_terapia___not___contains;
            return this;
        }

        public Builder setNote_terapia___starts_with(String note_terapia___starts_with) {
            this.note_terapia___starts_with = note_terapia___starts_with;
            return this;
        }

        public Builder setNote_terapia___not___starts_with(String note_terapia___not___starts_with) {
            this.note_terapia___not___starts_with = note_terapia___not___starts_with;
            return this;
        }

        public Builder setNote_terapia___ends_with(String note_terapia___ends_with) {
            this.note_terapia___ends_with = note_terapia___ends_with;
            return this;
        }

        public Builder setNote_terapia___not___ends_with(String note_terapia___not___ends_with) {
            this.note_terapia___not___ends_with = note_terapia___not___ends_with;
            return this;
        }

        public Builder setNull_val___eq(Boolean null_val___eq) {
            this.null_val___eq = null_val___eq;
            return this;
        }

        public Builder setNull_val___ne(Boolean null_val___ne) {
            this.null_val___ne = null_val___ne;
            return this;
        }

        public Builder setNull_val___null(Boolean null_val___null) {
            this.null_val___null = null_val___null;
            return this;
        }

        public Builder setNull_val___not___null(Boolean null_val___not___null) {
            this.null_val___not___null = null_val___not___null;
            return this;
        }

        public Builder setPassword_pro___eq(String password_pro___eq) {
            this.password_pro___eq = password_pro___eq;
            return this;
        }

        public Builder setPassword_pro___ne(String password_pro___ne) {
            this.password_pro___ne = password_pro___ne;
            return this;
        }

        public Builder setPassword_pro___null(Boolean password_pro___null) {
            this.password_pro___null = password_pro___null;
            return this;
        }

        public Builder setPassword_pro___not___null(Boolean password_pro___not___null) {
            this.password_pro___not___null = password_pro___not___null;
            return this;
        }

        public Builder setPassword_pro___in(java.util.List<String> password_pro___in) {
            this.password_pro___in = password_pro___in;
            return this;
        }

        public Builder setPassword_pro___not___in(java.util.List<String> password_pro___not___in) {
            this.password_pro___not___in = password_pro___not___in;
            return this;
        }

        public Builder setPassword_pro___lt(String password_pro___lt) {
            this.password_pro___lt = password_pro___lt;
            return this;
        }

        public Builder setPassword_pro___lte(String password_pro___lte) {
            this.password_pro___lte = password_pro___lte;
            return this;
        }

        public Builder setPassword_pro___gt(String password_pro___gt) {
            this.password_pro___gt = password_pro___gt;
            return this;
        }

        public Builder setPassword_pro___gte(String password_pro___gte) {
            this.password_pro___gte = password_pro___gte;
            return this;
        }

        public Builder setPassword_pro___contains(String password_pro___contains) {
            this.password_pro___contains = password_pro___contains;
            return this;
        }

        public Builder setPassword_pro___not___contains(String password_pro___not___contains) {
            this.password_pro___not___contains = password_pro___not___contains;
            return this;
        }

        public Builder setPassword_pro___starts_with(String password_pro___starts_with) {
            this.password_pro___starts_with = password_pro___starts_with;
            return this;
        }

        public Builder setPassword_pro___not___starts_with(String password_pro___not___starts_with) {
            this.password_pro___not___starts_with = password_pro___not___starts_with;
            return this;
        }

        public Builder setPassword_pro___ends_with(String password_pro___ends_with) {
            this.password_pro___ends_with = password_pro___ends_with;
            return this;
        }

        public Builder setPassword_pro___not___ends_with(String password_pro___not___ends_with) {
            this.password_pro___not___ends_with = password_pro___not___ends_with;
            return this;
        }

        public Builder setPegifn___eq(Boolean pegifn___eq) {
            this.pegifn___eq = pegifn___eq;
            return this;
        }

        public Builder setPegifn___ne(Boolean pegifn___ne) {
            this.pegifn___ne = pegifn___ne;
            return this;
        }

        public Builder setPegifn___null(Boolean pegifn___null) {
            this.pegifn___null = pegifn___null;
            return this;
        }

        public Builder setPegifn___not___null(Boolean pegifn___not___null) {
            this.pegifn___not___null = pegifn___not___null;
            return this;
        }

        public Builder setPregresse_terapie_anti_hcv___eq(Boolean pregresse_terapie_anti_hcv___eq) {
            this.pregresse_terapie_anti_hcv___eq = pregresse_terapie_anti_hcv___eq;
            return this;
        }

        public Builder setPregresse_terapie_anti_hcv___ne(Boolean pregresse_terapie_anti_hcv___ne) {
            this.pregresse_terapie_anti_hcv___ne = pregresse_terapie_anti_hcv___ne;
            return this;
        }

        public Builder setPregresse_terapie_anti_hcv___null(Boolean pregresse_terapie_anti_hcv___null) {
            this.pregresse_terapie_anti_hcv___null = pregresse_terapie_anti_hcv___null;
            return this;
        }

        public Builder setPregresse_terapie_anti_hcv___not___null(Boolean pregresse_terapie_anti_hcv___not___null) {
            this.pregresse_terapie_anti_hcv___not___null = pregresse_terapie_anti_hcv___not___null;
            return this;
        }

        public Builder setPro___eq(Boolean pro___eq) {
            this.pro___eq = pro___eq;
            return this;
        }

        public Builder setPro___ne(Boolean pro___ne) {
            this.pro___ne = pro___ne;
            return this;
        }

        public Builder setPro___null(Boolean pro___null) {
            this.pro___null = pro___null;
            return this;
        }

        public Builder setPro___not___null(Boolean pro___not___null) {
            this.pro___not___null = pro___not___null;
            return this;
        }

        public Builder setRibavirina___eq(Boolean ribavirina___eq) {
            this.ribavirina___eq = ribavirina___eq;
            return this;
        }

        public Builder setRibavirina___ne(Boolean ribavirina___ne) {
            this.ribavirina___ne = ribavirina___ne;
            return this;
        }

        public Builder setRibavirina___null(Boolean ribavirina___null) {
            this.ribavirina___null = ribavirina___null;
            return this;
        }

        public Builder setRibavirina___not___null(Boolean ribavirina___not___null) {
            this.ribavirina___not___null = ribavirina___not___null;
            return this;
        }

        public Builder setRisk_F___eq(Boolean risk_F___eq) {
            this.risk_F___eq = risk_F___eq;
            return this;
        }

        public Builder setRisk_F___ne(Boolean risk_F___ne) {
            this.risk_F___ne = risk_F___ne;
            return this;
        }

        public Builder setRisk_F___null(Boolean risk_F___null) {
            this.risk_F___null = risk_F___null;
            return this;
        }

        public Builder setRisk_F___not___null(Boolean risk_F___not___null) {
            this.risk_F___not___null = risk_F___not___null;
            return this;
        }

        public Builder setSessione_pro___eq(String sessione_pro___eq) {
            this.sessione_pro___eq = sessione_pro___eq;
            return this;
        }

        public Builder setSessione_pro___ne(String sessione_pro___ne) {
            this.sessione_pro___ne = sessione_pro___ne;
            return this;
        }

        public Builder setSessione_pro___null(Boolean sessione_pro___null) {
            this.sessione_pro___null = sessione_pro___null;
            return this;
        }

        public Builder setSessione_pro___not___null(Boolean sessione_pro___not___null) {
            this.sessione_pro___not___null = sessione_pro___not___null;
            return this;
        }

        public Builder setSessione_pro___in(java.util.List<String> sessione_pro___in) {
            this.sessione_pro___in = sessione_pro___in;
            return this;
        }

        public Builder setSessione_pro___not___in(java.util.List<String> sessione_pro___not___in) {
            this.sessione_pro___not___in = sessione_pro___not___in;
            return this;
        }

        public Builder setSessione_pro___lt(String sessione_pro___lt) {
            this.sessione_pro___lt = sessione_pro___lt;
            return this;
        }

        public Builder setSessione_pro___lte(String sessione_pro___lte) {
            this.sessione_pro___lte = sessione_pro___lte;
            return this;
        }

        public Builder setSessione_pro___gt(String sessione_pro___gt) {
            this.sessione_pro___gt = sessione_pro___gt;
            return this;
        }

        public Builder setSessione_pro___gte(String sessione_pro___gte) {
            this.sessione_pro___gte = sessione_pro___gte;
            return this;
        }

        public Builder setSessione_pro___contains(String sessione_pro___contains) {
            this.sessione_pro___contains = sessione_pro___contains;
            return this;
        }

        public Builder setSessione_pro___not___contains(String sessione_pro___not___contains) {
            this.sessione_pro___not___contains = sessione_pro___not___contains;
            return this;
        }

        public Builder setSessione_pro___starts_with(String sessione_pro___starts_with) {
            this.sessione_pro___starts_with = sessione_pro___starts_with;
            return this;
        }

        public Builder setSessione_pro___not___starts_with(String sessione_pro___not___starts_with) {
            this.sessione_pro___not___starts_with = sessione_pro___not___starts_with;
            return this;
        }

        public Builder setSessione_pro___ends_with(String sessione_pro___ends_with) {
            this.sessione_pro___ends_with = sessione_pro___ends_with;
            return this;
        }

        public Builder setSessione_pro___not___ends_with(String sessione_pro___not___ends_with) {
            this.sessione_pro___not___ends_with = sessione_pro___not___ends_with;
            return this;
        }

        public Builder setSesso___eq(String sesso___eq) {
            this.sesso___eq = sesso___eq;
            return this;
        }

        public Builder setSesso___ne(String sesso___ne) {
            this.sesso___ne = sesso___ne;
            return this;
        }

        public Builder setSesso___null(Boolean sesso___null) {
            this.sesso___null = sesso___null;
            return this;
        }

        public Builder setSesso___not___null(Boolean sesso___not___null) {
            this.sesso___not___null = sesso___not___null;
            return this;
        }

        public Builder setSesso___in(java.util.List<String> sesso___in) {
            this.sesso___in = sesso___in;
            return this;
        }

        public Builder setSesso___not___in(java.util.List<String> sesso___not___in) {
            this.sesso___not___in = sesso___not___in;
            return this;
        }

        public Builder setSesso___lt(String sesso___lt) {
            this.sesso___lt = sesso___lt;
            return this;
        }

        public Builder setSesso___lte(String sesso___lte) {
            this.sesso___lte = sesso___lte;
            return this;
        }

        public Builder setSesso___gt(String sesso___gt) {
            this.sesso___gt = sesso___gt;
            return this;
        }

        public Builder setSesso___gte(String sesso___gte) {
            this.sesso___gte = sesso___gte;
            return this;
        }

        public Builder setSesso___contains(String sesso___contains) {
            this.sesso___contains = sesso___contains;
            return this;
        }

        public Builder setSesso___not___contains(String sesso___not___contains) {
            this.sesso___not___contains = sesso___not___contains;
            return this;
        }

        public Builder setSesso___starts_with(String sesso___starts_with) {
            this.sesso___starts_with = sesso___starts_with;
            return this;
        }

        public Builder setSesso___not___starts_with(String sesso___not___starts_with) {
            this.sesso___not___starts_with = sesso___not___starts_with;
            return this;
        }

        public Builder setSesso___ends_with(String sesso___ends_with) {
            this.sesso___ends_with = sesso___ends_with;
            return this;
        }

        public Builder setSesso___not___ends_with(String sesso___not___ends_with) {
            this.sesso___not___ends_with = sesso___not___ends_with;
            return this;
        }

        public Builder setStribild___eq(Boolean stribild___eq) {
            this.stribild___eq = stribild___eq;
            return this;
        }

        public Builder setStribild___ne(Boolean stribild___ne) {
            this.stribild___ne = stribild___ne;
            return this;
        }

        public Builder setStribild___null(Boolean stribild___null) {
            this.stribild___null = stribild___null;
            return this;
        }

        public Builder setStribild___not___null(Boolean stribild___not___null) {
            this.stribild___not___null = stribild___not___null;
            return this;
        }

        public Builder setStudi_pro_abilitati___eq(String studi_pro_abilitati___eq) {
            this.studi_pro_abilitati___eq = studi_pro_abilitati___eq;
            return this;
        }

        public Builder setStudi_pro_abilitati___ne(String studi_pro_abilitati___ne) {
            this.studi_pro_abilitati___ne = studi_pro_abilitati___ne;
            return this;
        }

        public Builder setStudi_pro_abilitati___null(Boolean studi_pro_abilitati___null) {
            this.studi_pro_abilitati___null = studi_pro_abilitati___null;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___null(Boolean studi_pro_abilitati___not___null) {
            this.studi_pro_abilitati___not___null = studi_pro_abilitati___not___null;
            return this;
        }

        public Builder setStudi_pro_abilitati___in(java.util.List<String> studi_pro_abilitati___in) {
            this.studi_pro_abilitati___in = studi_pro_abilitati___in;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___in(java.util.List<String> studi_pro_abilitati___not___in) {
            this.studi_pro_abilitati___not___in = studi_pro_abilitati___not___in;
            return this;
        }

        public Builder setStudi_pro_abilitati___lt(String studi_pro_abilitati___lt) {
            this.studi_pro_abilitati___lt = studi_pro_abilitati___lt;
            return this;
        }

        public Builder setStudi_pro_abilitati___lte(String studi_pro_abilitati___lte) {
            this.studi_pro_abilitati___lte = studi_pro_abilitati___lte;
            return this;
        }

        public Builder setStudi_pro_abilitati___gt(String studi_pro_abilitati___gt) {
            this.studi_pro_abilitati___gt = studi_pro_abilitati___gt;
            return this;
        }

        public Builder setStudi_pro_abilitati___gte(String studi_pro_abilitati___gte) {
            this.studi_pro_abilitati___gte = studi_pro_abilitati___gte;
            return this;
        }

        public Builder setStudi_pro_abilitati___contains(String studi_pro_abilitati___contains) {
            this.studi_pro_abilitati___contains = studi_pro_abilitati___contains;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___contains(String studi_pro_abilitati___not___contains) {
            this.studi_pro_abilitati___not___contains = studi_pro_abilitati___not___contains;
            return this;
        }

        public Builder setStudi_pro_abilitati___starts_with(String studi_pro_abilitati___starts_with) {
            this.studi_pro_abilitati___starts_with = studi_pro_abilitati___starts_with;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___starts_with(String studi_pro_abilitati___not___starts_with) {
            this.studi_pro_abilitati___not___starts_with = studi_pro_abilitati___not___starts_with;
            return this;
        }

        public Builder setStudi_pro_abilitati___ends_with(String studi_pro_abilitati___ends_with) {
            this.studi_pro_abilitati___ends_with = studi_pro_abilitati___ends_with;
            return this;
        }

        public Builder setStudi_pro_abilitati___not___ends_with(String studi_pro_abilitati___not___ends_with) {
            this.studi_pro_abilitati___not___ends_with = studi_pro_abilitati___not___ends_with;
            return this;
        }

        public Builder setTaf___eq(Boolean taf___eq) {
            this.taf___eq = taf___eq;
            return this;
        }

        public Builder setTaf___ne(Boolean taf___ne) {
            this.taf___ne = taf___ne;
            return this;
        }

        public Builder setTaf___null(Boolean taf___null) {
            this.taf___null = taf___null;
            return this;
        }

        public Builder setTaf___not___null(Boolean taf___not___null) {
            this.taf___not___null = taf___not___null;
            return this;
        }

        public Builder setTerapia_ormonale___eq(Boolean terapia_ormonale___eq) {
            this.terapia_ormonale___eq = terapia_ormonale___eq;
            return this;
        }

        public Builder setTerapia_ormonale___ne(Boolean terapia_ormonale___ne) {
            this.terapia_ormonale___ne = terapia_ormonale___ne;
            return this;
        }

        public Builder setTerapia_ormonale___null(Boolean terapia_ormonale___null) {
            this.terapia_ormonale___null = terapia_ormonale___null;
            return this;
        }

        public Builder setTerapia_ormonale___not___null(Boolean terapia_ormonale___not___null) {
            this.terapia_ormonale___not___null = terapia_ormonale___not___null;
            return this;
        }

        public Builder setToken_notifiche_pro___eq(String token_notifiche_pro___eq) {
            this.token_notifiche_pro___eq = token_notifiche_pro___eq;
            return this;
        }

        public Builder setToken_notifiche_pro___ne(String token_notifiche_pro___ne) {
            this.token_notifiche_pro___ne = token_notifiche_pro___ne;
            return this;
        }

        public Builder setToken_notifiche_pro___null(Boolean token_notifiche_pro___null) {
            this.token_notifiche_pro___null = token_notifiche_pro___null;
            return this;
        }

        public Builder setToken_notifiche_pro___not___null(Boolean token_notifiche_pro___not___null) {
            this.token_notifiche_pro___not___null = token_notifiche_pro___not___null;
            return this;
        }

        public Builder setToken_notifiche_pro___in(java.util.List<String> token_notifiche_pro___in) {
            this.token_notifiche_pro___in = token_notifiche_pro___in;
            return this;
        }

        public Builder setToken_notifiche_pro___not___in(java.util.List<String> token_notifiche_pro___not___in) {
            this.token_notifiche_pro___not___in = token_notifiche_pro___not___in;
            return this;
        }

        public Builder setToken_notifiche_pro___lt(String token_notifiche_pro___lt) {
            this.token_notifiche_pro___lt = token_notifiche_pro___lt;
            return this;
        }

        public Builder setToken_notifiche_pro___lte(String token_notifiche_pro___lte) {
            this.token_notifiche_pro___lte = token_notifiche_pro___lte;
            return this;
        }

        public Builder setToken_notifiche_pro___gt(String token_notifiche_pro___gt) {
            this.token_notifiche_pro___gt = token_notifiche_pro___gt;
            return this;
        }

        public Builder setToken_notifiche_pro___gte(String token_notifiche_pro___gte) {
            this.token_notifiche_pro___gte = token_notifiche_pro___gte;
            return this;
        }

        public Builder setToken_notifiche_pro___contains(String token_notifiche_pro___contains) {
            this.token_notifiche_pro___contains = token_notifiche_pro___contains;
            return this;
        }

        public Builder setToken_notifiche_pro___not___contains(String token_notifiche_pro___not___contains) {
            this.token_notifiche_pro___not___contains = token_notifiche_pro___not___contains;
            return this;
        }

        public Builder setToken_notifiche_pro___starts_with(String token_notifiche_pro___starts_with) {
            this.token_notifiche_pro___starts_with = token_notifiche_pro___starts_with;
            return this;
        }

        public Builder setToken_notifiche_pro___not___starts_with(String token_notifiche_pro___not___starts_with) {
            this.token_notifiche_pro___not___starts_with = token_notifiche_pro___not___starts_with;
            return this;
        }

        public Builder setToken_notifiche_pro___ends_with(String token_notifiche_pro___ends_with) {
            this.token_notifiche_pro___ends_with = token_notifiche_pro___ends_with;
            return this;
        }

        public Builder setToken_notifiche_pro___not___ends_with(String token_notifiche_pro___not___ends_with) {
            this.token_notifiche_pro___not___ends_with = token_notifiche_pro___not___ends_with;
            return this;
        }

        public Builder setTrasferito___eq(Boolean trasferito___eq) {
            this.trasferito___eq = trasferito___eq;
            return this;
        }

        public Builder setTrasferito___ne(Boolean trasferito___ne) {
            this.trasferito___ne = trasferito___ne;
            return this;
        }

        public Builder setTrasferito___null(Boolean trasferito___null) {
            this.trasferito___null = trasferito___null;
            return this;
        }

        public Builder setTrasferito___not___null(Boolean trasferito___not___null) {
            this.trasferito___not___null = trasferito___not___null;
            return this;
        }

        public Builder setUsername_pro___eq(String username_pro___eq) {
            this.username_pro___eq = username_pro___eq;
            return this;
        }

        public Builder setUsername_pro___ne(String username_pro___ne) {
            this.username_pro___ne = username_pro___ne;
            return this;
        }

        public Builder setUsername_pro___null(Boolean username_pro___null) {
            this.username_pro___null = username_pro___null;
            return this;
        }

        public Builder setUsername_pro___not___null(Boolean username_pro___not___null) {
            this.username_pro___not___null = username_pro___not___null;
            return this;
        }

        public Builder setUsername_pro___in(java.util.List<String> username_pro___in) {
            this.username_pro___in = username_pro___in;
            return this;
        }

        public Builder setUsername_pro___not___in(java.util.List<String> username_pro___not___in) {
            this.username_pro___not___in = username_pro___not___in;
            return this;
        }

        public Builder setUsername_pro___lt(String username_pro___lt) {
            this.username_pro___lt = username_pro___lt;
            return this;
        }

        public Builder setUsername_pro___lte(String username_pro___lte) {
            this.username_pro___lte = username_pro___lte;
            return this;
        }

        public Builder setUsername_pro___gt(String username_pro___gt) {
            this.username_pro___gt = username_pro___gt;
            return this;
        }

        public Builder setUsername_pro___gte(String username_pro___gte) {
            this.username_pro___gte = username_pro___gte;
            return this;
        }

        public Builder setUsername_pro___contains(String username_pro___contains) {
            this.username_pro___contains = username_pro___contains;
            return this;
        }

        public Builder setUsername_pro___not___contains(String username_pro___not___contains) {
            this.username_pro___not___contains = username_pro___not___contains;
            return this;
        }

        public Builder setUsername_pro___starts_with(String username_pro___starts_with) {
            this.username_pro___starts_with = username_pro___starts_with;
            return this;
        }

        public Builder setUsername_pro___not___starts_with(String username_pro___not___starts_with) {
            this.username_pro___not___starts_with = username_pro___not___starts_with;
            return this;
        }

        public Builder setUsername_pro___ends_with(String username_pro___ends_with) {
            this.username_pro___ends_with = username_pro___ends_with;
            return this;
        }

        public Builder setUsername_pro___not___ends_with(String username_pro___not___ends_with) {
            this.username_pro___not___ends_with = username_pro___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliH_PazienteFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliH_PazienteFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliH_PazienteFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliH_PazienteFilterDTO build() {
            CliH_PazienteFilterDTO result = new CliH_PazienteFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.setIL28B___eq(this.IL28B___eq);
            result.setIL28B___ne(this.IL28B___ne);
            result.setIL28B___null(this.IL28B___null);
            result.setIL28B___not___null(this.IL28B___not___null);
            result.setIL28B___in(this.IL28B___in);
            result.setIL28B___not___in(this.IL28B___not___in);
            result.setIL28B___lt(this.IL28B___lt);
            result.setIL28B___lte(this.IL28B___lte);
            result.setIL28B___gt(this.IL28B___gt);
            result.setIL28B___gte(this.IL28B___gte);
            result.setIL28B___contains(this.IL28B___contains);
            result.setIL28B___not___contains(this.IL28B___not___contains);
            result.setIL28B___starts_with(this.IL28B___starts_with);
            result.setIL28B___not___starts_with(this.IL28B___not___starts_with);
            result.setIL28B___ends_with(this.IL28B___ends_with);
            result.setIL28B___not___ends_with(this.IL28B___not___ends_with);
            result.setUSSL_di_residenza___eq(this.USSL_di_residenza___eq);
            result.setUSSL_di_residenza___ne(this.USSL_di_residenza___ne);
            result.setUSSL_di_residenza___null(this.USSL_di_residenza___null);
            result.setUSSL_di_residenza___not___null(this.USSL_di_residenza___not___null);
            result.setUSSL_di_residenza___in(this.USSL_di_residenza___in);
            result.setUSSL_di_residenza___not___in(this.USSL_di_residenza___not___in);
            result.setUSSL_di_residenza___lt(this.USSL_di_residenza___lt);
            result.setUSSL_di_residenza___lte(this.USSL_di_residenza___lte);
            result.setUSSL_di_residenza___gt(this.USSL_di_residenza___gt);
            result.setUSSL_di_residenza___gte(this.USSL_di_residenza___gte);
            result.setUSSL_di_residenza___contains(this.USSL_di_residenza___contains);
            result.setUSSL_di_residenza___not___contains(this.USSL_di_residenza___not___contains);
            result.setUSSL_di_residenza___starts_with(this.USSL_di_residenza___starts_with);
            result.setUSSL_di_residenza___not___starts_with(this.USSL_di_residenza___not___starts_with);
            result.setUSSL_di_residenza___ends_with(this.USSL_di_residenza___ends_with);
            result.setUSSL_di_residenza___not___ends_with(this.USSL_di_residenza___not___ends_with);
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
            result.setAltezza___eq(this.altezza___eq);
            result.setAltezza___ne(this.altezza___ne);
            result.setAltezza___null(this.altezza___null);
            result.setAltezza___not___null(this.altezza___not___null);
            result.setAltezza___in(this.altezza___in);
            result.setAltezza___not___in(this.altezza___not___in);
            result.setAltezza___lt(this.altezza___lt);
            result.setAltezza___lte(this.altezza___lte);
            result.setAltezza___gt(this.altezza___gt);
            result.setAltezza___gte(this.altezza___gte);
            result.setAltro_fattore_di_rischio___eq(this.altro_fattore_di_rischio___eq);
            result.setAltro_fattore_di_rischio___ne(this.altro_fattore_di_rischio___ne);
            result.setAltro_fattore_di_rischio___null(this.altro_fattore_di_rischio___null);
            result.setAltro_fattore_di_rischio___not___null(this.altro_fattore_di_rischio___not___null);
            result.setAltro_fattore_di_rischio___in(this.altro_fattore_di_rischio___in);
            result.setAltro_fattore_di_rischio___not___in(this.altro_fattore_di_rischio___not___in);
            result.setAltro_fattore_di_rischio___lt(this.altro_fattore_di_rischio___lt);
            result.setAltro_fattore_di_rischio___lte(this.altro_fattore_di_rischio___lte);
            result.setAltro_fattore_di_rischio___gt(this.altro_fattore_di_rischio___gt);
            result.setAltro_fattore_di_rischio___gte(this.altro_fattore_di_rischio___gte);
            result.setAltro_fattore_di_rischio___contains(this.altro_fattore_di_rischio___contains);
            result.setAltro_fattore_di_rischio___not___contains(this.altro_fattore_di_rischio___not___contains);
            result.setAltro_fattore_di_rischio___starts_with(this.altro_fattore_di_rischio___starts_with);
            result.setAltro_fattore_di_rischio___not___starts_with(this.altro_fattore_di_rischio___not___starts_with);
            result.setAltro_fattore_di_rischio___ends_with(this.altro_fattore_di_rischio___ends_with);
            result.setAltro_fattore_di_rischio___not___ends_with(this.altro_fattore_di_rischio___not___ends_with);
            result.setAnno_nascita___eq(this.anno_nascita___eq);
            result.setAnno_nascita___ne(this.anno_nascita___ne);
            result.setAnno_nascita___null(this.anno_nascita___null);
            result.setAnno_nascita___not___null(this.anno_nascita___not___null);
            result.setAnno_nascita___in(this.anno_nascita___in);
            result.setAnno_nascita___not___in(this.anno_nascita___not___in);
            result.setAnno_nascita___lt(this.anno_nascita___lt);
            result.setAnno_nascita___lte(this.anno_nascita___lte);
            result.setAnno_nascita___gt(this.anno_nascita___gt);
            result.setAnno_nascita___gte(this.anno_nascita___gte);
            result.setChecks___eq(this.checks___eq);
            result.setChecks___ne(this.checks___ne);
            result.setChecks___null(this.checks___null);
            result.setChecks___not___null(this.checks___not___null);
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
            result.setCodice_interno___eq(this.codice_interno___eq);
            result.setCodice_interno___ne(this.codice_interno___ne);
            result.setCodice_interno___null(this.codice_interno___null);
            result.setCodice_interno___not___null(this.codice_interno___not___null);
            result.setCodice_interno___in(this.codice_interno___in);
            result.setCodice_interno___not___in(this.codice_interno___not___in);
            result.setCodice_interno___lt(this.codice_interno___lt);
            result.setCodice_interno___lte(this.codice_interno___lte);
            result.setCodice_interno___gt(this.codice_interno___gt);
            result.setCodice_interno___gte(this.codice_interno___gte);
            result.setCodice_interno___contains(this.codice_interno___contains);
            result.setCodice_interno___not___contains(this.codice_interno___not___contains);
            result.setCodice_interno___starts_with(this.codice_interno___starts_with);
            result.setCodice_interno___not___starts_with(this.codice_interno___not___starts_with);
            result.setCodice_interno___ends_with(this.codice_interno___ends_with);
            result.setCodice_interno___not___ends_with(this.codice_interno___not___ends_with);
            result.setCodice_nazionale___eq(this.codice_nazionale___eq);
            result.setCodice_nazionale___ne(this.codice_nazionale___ne);
            result.setCodice_nazionale___null(this.codice_nazionale___null);
            result.setCodice_nazionale___not___null(this.codice_nazionale___not___null);
            result.setCodice_nazionale___in(this.codice_nazionale___in);
            result.setCodice_nazionale___not___in(this.codice_nazionale___not___in);
            result.setCodice_nazionale___lt(this.codice_nazionale___lt);
            result.setCodice_nazionale___lte(this.codice_nazionale___lte);
            result.setCodice_nazionale___gt(this.codice_nazionale___gt);
            result.setCodice_nazionale___gte(this.codice_nazionale___gte);
            result.setCodice_nazionale___contains(this.codice_nazionale___contains);
            result.setCodice_nazionale___not___contains(this.codice_nazionale___not___contains);
            result.setCodice_nazionale___starts_with(this.codice_nazionale___starts_with);
            result.setCodice_nazionale___not___starts_with(this.codice_nazionale___not___starts_with);
            result.setCodice_nazionale___ends_with(this.codice_nazionale___ends_with);
            result.setCodice_nazionale___not___ends_with(this.codice_nazionale___not___ends_with);
            result.setCognome___eq(this.cognome___eq);
            result.setCognome___ne(this.cognome___ne);
            result.setCognome___null(this.cognome___null);
            result.setCognome___not___null(this.cognome___not___null);
            result.setCognome___in(this.cognome___in);
            result.setCognome___not___in(this.cognome___not___in);
            result.setCognome___lt(this.cognome___lt);
            result.setCognome___lte(this.cognome___lte);
            result.setCognome___gt(this.cognome___gt);
            result.setCognome___gte(this.cognome___gte);
            result.setCognome___contains(this.cognome___contains);
            result.setCognome___not___contains(this.cognome___not___contains);
            result.setCognome___starts_with(this.cognome___starts_with);
            result.setCognome___not___starts_with(this.cognome___not___starts_with);
            result.setCognome___ends_with(this.cognome___ends_with);
            result.setCognome___not___ends_with(this.cognome___not___ends_with);
            result.setComune_di_nascita___eq(this.comune_di_nascita___eq);
            result.setComune_di_nascita___ne(this.comune_di_nascita___ne);
            result.setComune_di_nascita___null(this.comune_di_nascita___null);
            result.setComune_di_nascita___not___null(this.comune_di_nascita___not___null);
            result.setComune_di_nascita___in(this.comune_di_nascita___in);
            result.setComune_di_nascita___not___in(this.comune_di_nascita___not___in);
            result.setComune_di_nascita___lt(this.comune_di_nascita___lt);
            result.setComune_di_nascita___lte(this.comune_di_nascita___lte);
            result.setComune_di_nascita___gt(this.comune_di_nascita___gt);
            result.setComune_di_nascita___gte(this.comune_di_nascita___gte);
            result.setComune_di_nascita___contains(this.comune_di_nascita___contains);
            result.setComune_di_nascita___not___contains(this.comune_di_nascita___not___contains);
            result.setComune_di_nascita___starts_with(this.comune_di_nascita___starts_with);
            result.setComune_di_nascita___not___starts_with(this.comune_di_nascita___not___starts_with);
            result.setComune_di_nascita___ends_with(this.comune_di_nascita___ends_with);
            result.setComune_di_nascita___not___ends_with(this.comune_di_nascita___not___ends_with);
            result.setData_consenso___eq(this.data_consenso___eq);
            result.setData_consenso___ne(this.data_consenso___ne);
            result.setData_consenso___null(this.data_consenso___null);
            result.setData_consenso___not___null(this.data_consenso___not___null);
            result.setData_consenso___in(this.data_consenso___in);
            result.setData_consenso___not___in(this.data_consenso___not___in);
            result.setData_consenso___lt(this.data_consenso___lt);
            result.setData_consenso___lte(this.data_consenso___lte);
            result.setData_consenso___gt(this.data_consenso___gt);
            result.setData_consenso___gte(this.data_consenso___gte);
            result.setData_consenso_pro___eq(this.data_consenso_pro___eq);
            result.setData_consenso_pro___ne(this.data_consenso_pro___ne);
            result.setData_consenso_pro___null(this.data_consenso_pro___null);
            result.setData_consenso_pro___not___null(this.data_consenso_pro___not___null);
            result.setData_consenso_pro___in(this.data_consenso_pro___in);
            result.setData_consenso_pro___not___in(this.data_consenso_pro___not___in);
            result.setData_consenso_pro___lt(this.data_consenso_pro___lt);
            result.setData_consenso_pro___lte(this.data_consenso_pro___lte);
            result.setData_consenso_pro___gt(this.data_consenso_pro___gt);
            result.setData_consenso_pro___gte(this.data_consenso_pro___gte);
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
            result.setData_fine_terapia_ormonale___eq(this.data_fine_terapia_ormonale___eq);
            result.setData_fine_terapia_ormonale___ne(this.data_fine_terapia_ormonale___ne);
            result.setData_fine_terapia_ormonale___null(this.data_fine_terapia_ormonale___null);
            result.setData_fine_terapia_ormonale___not___null(this.data_fine_terapia_ormonale___not___null);
            result.setData_fine_terapia_ormonale___in(this.data_fine_terapia_ormonale___in);
            result.setData_fine_terapia_ormonale___not___in(this.data_fine_terapia_ormonale___not___in);
            result.setData_fine_terapia_ormonale___lt(this.data_fine_terapia_ormonale___lt);
            result.setData_fine_terapia_ormonale___lte(this.data_fine_terapia_ormonale___lte);
            result.setData_fine_terapia_ormonale___gt(this.data_fine_terapia_ormonale___gt);
            result.setData_fine_terapia_ormonale___gte(this.data_fine_terapia_ormonale___gte);
            result.setData_gilbert___eq(this.data_gilbert___eq);
            result.setData_gilbert___ne(this.data_gilbert___ne);
            result.setData_gilbert___null(this.data_gilbert___null);
            result.setData_gilbert___not___null(this.data_gilbert___not___null);
            result.setData_gilbert___in(this.data_gilbert___in);
            result.setData_gilbert___not___in(this.data_gilbert___not___in);
            result.setData_gilbert___lt(this.data_gilbert___lt);
            result.setData_gilbert___lte(this.data_gilbert___lte);
            result.setData_gilbert___gt(this.data_gilbert___gt);
            result.setData_gilbert___gte(this.data_gilbert___gte);
            result.setData_hla___eq(this.data_hla___eq);
            result.setData_hla___ne(this.data_hla___ne);
            result.setData_hla___null(this.data_hla___null);
            result.setData_hla___not___null(this.data_hla___not___null);
            result.setData_hla___in(this.data_hla___in);
            result.setData_hla___not___in(this.data_hla___not___in);
            result.setData_hla___lt(this.data_hla___lt);
            result.setData_hla___lte(this.data_hla___lte);
            result.setData_hla___gt(this.data_hla___gt);
            result.setData_hla___gte(this.data_hla___gte);
            result.setData_il28___eq(this.data_il28___eq);
            result.setData_il28___ne(this.data_il28___ne);
            result.setData_il28___null(this.data_il28___null);
            result.setData_il28___not___null(this.data_il28___not___null);
            result.setData_il28___in(this.data_il28___in);
            result.setData_il28___not___in(this.data_il28___not___in);
            result.setData_il28___lt(this.data_il28___lt);
            result.setData_il28___lte(this.data_il28___lte);
            result.setData_il28___gt(this.data_il28___gt);
            result.setData_il28___gte(this.data_il28___gte);
            result.setData_inizio_terapia_ormonale___eq(this.data_inizio_terapia_ormonale___eq);
            result.setData_inizio_terapia_ormonale___ne(this.data_inizio_terapia_ormonale___ne);
            result.setData_inizio_terapia_ormonale___null(this.data_inizio_terapia_ormonale___null);
            result.setData_inizio_terapia_ormonale___not___null(this.data_inizio_terapia_ormonale___not___null);
            result.setData_inizio_terapia_ormonale___in(this.data_inizio_terapia_ormonale___in);
            result.setData_inizio_terapia_ormonale___not___in(this.data_inizio_terapia_ormonale___not___in);
            result.setData_inizio_terapia_ormonale___lt(this.data_inizio_terapia_ormonale___lt);
            result.setData_inizio_terapia_ormonale___lte(this.data_inizio_terapia_ormonale___lte);
            result.setData_inizio_terapia_ormonale___gt(this.data_inizio_terapia_ormonale___gt);
            result.setData_inizio_terapia_ormonale___gte(this.data_inizio_terapia_ormonale___gte);
            result.setData_menopausa___eq(this.data_menopausa___eq);
            result.setData_menopausa___ne(this.data_menopausa___ne);
            result.setData_menopausa___null(this.data_menopausa___null);
            result.setData_menopausa___not___null(this.data_menopausa___not___null);
            result.setData_menopausa___in(this.data_menopausa___in);
            result.setData_menopausa___not___in(this.data_menopausa___not___in);
            result.setData_menopausa___lt(this.data_menopausa___lt);
            result.setData_menopausa___lte(this.data_menopausa___lte);
            result.setData_menopausa___gt(this.data_menopausa___gt);
            result.setData_menopausa___gte(this.data_menopausa___gte);
            result.setData_prima_terapia_anti_hcv___eq(this.data_prima_terapia_anti_hcv___eq);
            result.setData_prima_terapia_anti_hcv___ne(this.data_prima_terapia_anti_hcv___ne);
            result.setData_prima_terapia_anti_hcv___null(this.data_prima_terapia_anti_hcv___null);
            result.setData_prima_terapia_anti_hcv___not___null(this.data_prima_terapia_anti_hcv___not___null);
            result.setData_prima_terapia_anti_hcv___in(this.data_prima_terapia_anti_hcv___in);
            result.setData_prima_terapia_anti_hcv___not___in(this.data_prima_terapia_anti_hcv___not___in);
            result.setData_prima_terapia_anti_hcv___lt(this.data_prima_terapia_anti_hcv___lt);
            result.setData_prima_terapia_anti_hcv___lte(this.data_prima_terapia_anti_hcv___lte);
            result.setData_prima_terapia_anti_hcv___gt(this.data_prima_terapia_anti_hcv___gt);
            result.setData_prima_terapia_anti_hcv___gte(this.data_prima_terapia_anti_hcv___gte);
            result.setData_prima_visita___eq(this.data_prima_visita___eq);
            result.setData_prima_visita___ne(this.data_prima_visita___ne);
            result.setData_prima_visita___null(this.data_prima_visita___null);
            result.setData_prima_visita___not___null(this.data_prima_visita___not___null);
            result.setData_prima_visita___in(this.data_prima_visita___in);
            result.setData_prima_visita___not___in(this.data_prima_visita___not___in);
            result.setData_prima_visita___lt(this.data_prima_visita___lt);
            result.setData_prima_visita___lte(this.data_prima_visita___lte);
            result.setData_prima_visita___gt(this.data_prima_visita___gt);
            result.setData_prima_visita___gte(this.data_prima_visita___gte);
            result.setData_primo_hcvab_pos___eq(this.data_primo_hcvab_pos___eq);
            result.setData_primo_hcvab_pos___ne(this.data_primo_hcvab_pos___ne);
            result.setData_primo_hcvab_pos___null(this.data_primo_hcvab_pos___null);
            result.setData_primo_hcvab_pos___not___null(this.data_primo_hcvab_pos___not___null);
            result.setData_primo_hcvab_pos___in(this.data_primo_hcvab_pos___in);
            result.setData_primo_hcvab_pos___not___in(this.data_primo_hcvab_pos___not___in);
            result.setData_primo_hcvab_pos___lt(this.data_primo_hcvab_pos___lt);
            result.setData_primo_hcvab_pos___lte(this.data_primo_hcvab_pos___lte);
            result.setData_primo_hcvab_pos___gt(this.data_primo_hcvab_pos___gt);
            result.setData_primo_hcvab_pos___gte(this.data_primo_hcvab_pos___gte);
            result.setData_ultima_visita___eq(this.data_ultima_visita___eq);
            result.setData_ultima_visita___ne(this.data_ultima_visita___ne);
            result.setData_ultima_visita___null(this.data_ultima_visita___null);
            result.setData_ultima_visita___not___null(this.data_ultima_visita___not___null);
            result.setData_ultima_visita___in(this.data_ultima_visita___in);
            result.setData_ultima_visita___not___in(this.data_ultima_visita___not___in);
            result.setData_ultima_visita___lt(this.data_ultima_visita___lt);
            result.setData_ultima_visita___lte(this.data_ultima_visita___lte);
            result.setData_ultima_visita___gt(this.data_ultima_visita___gt);
            result.setData_ultima_visita___gte(this.data_ultima_visita___gte);
            result.setData_ultimo_HCVAb_pre_arr___eq(this.data_ultimo_HCVAb_pre_arr___eq);
            result.setData_ultimo_HCVAb_pre_arr___ne(this.data_ultimo_HCVAb_pre_arr___ne);
            result.setData_ultimo_HCVAb_pre_arr___null(this.data_ultimo_HCVAb_pre_arr___null);
            result.setData_ultimo_HCVAb_pre_arr___not___null(this.data_ultimo_HCVAb_pre_arr___not___null);
            result.setData_ultimo_HCVAb_pre_arr___in(this.data_ultimo_HCVAb_pre_arr___in);
            result.setData_ultimo_HCVAb_pre_arr___not___in(this.data_ultimo_HCVAb_pre_arr___not___in);
            result.setData_ultimo_HCVAb_pre_arr___lt(this.data_ultimo_HCVAb_pre_arr___lt);
            result.setData_ultimo_HCVAb_pre_arr___lte(this.data_ultimo_HCVAb_pre_arr___lte);
            result.setData_ultimo_HCVAb_pre_arr___gt(this.data_ultimo_HCVAb_pre_arr___gt);
            result.setData_ultimo_HCVAb_pre_arr___gte(this.data_ultimo_HCVAb_pre_arr___gte);
            result.setData_ultimo_HbsAg_pre_arr___eq(this.data_ultimo_HbsAg_pre_arr___eq);
            result.setData_ultimo_HbsAg_pre_arr___ne(this.data_ultimo_HbsAg_pre_arr___ne);
            result.setData_ultimo_HbsAg_pre_arr___null(this.data_ultimo_HbsAg_pre_arr___null);
            result.setData_ultimo_HbsAg_pre_arr___not___null(this.data_ultimo_HbsAg_pre_arr___not___null);
            result.setData_ultimo_HbsAg_pre_arr___in(this.data_ultimo_HbsAg_pre_arr___in);
            result.setData_ultimo_HbsAg_pre_arr___not___in(this.data_ultimo_HbsAg_pre_arr___not___in);
            result.setData_ultimo_HbsAg_pre_arr___lt(this.data_ultimo_HbsAg_pre_arr___lt);
            result.setData_ultimo_HbsAg_pre_arr___lte(this.data_ultimo_HbsAg_pre_arr___lte);
            result.setData_ultimo_HbsAg_pre_arr___gt(this.data_ultimo_HbsAg_pre_arr___gt);
            result.setData_ultimo_HbsAg_pre_arr___gte(this.data_ultimo_HbsAg_pre_arr___gte);
            result.setData_ultimo_drop___eq(this.data_ultimo_drop___eq);
            result.setData_ultimo_drop___ne(this.data_ultimo_drop___ne);
            result.setData_ultimo_drop___null(this.data_ultimo_drop___null);
            result.setData_ultimo_drop___not___null(this.data_ultimo_drop___not___null);
            result.setData_ultimo_drop___in(this.data_ultimo_drop___in);
            result.setData_ultimo_drop___not___in(this.data_ultimo_drop___not___in);
            result.setData_ultimo_drop___lt(this.data_ultimo_drop___lt);
            result.setData_ultimo_drop___lte(this.data_ultimo_drop___lte);
            result.setData_ultimo_drop___gt(this.data_ultimo_drop___gt);
            result.setData_ultimo_drop___gte(this.data_ultimo_drop___gte);
            result.setDate_longicona___eq(this.date_longicona___eq);
            result.setDate_longicona___ne(this.date_longicona___ne);
            result.setDate_longicona___null(this.date_longicona___null);
            result.setDate_longicona___not___null(this.date_longicona___not___null);
            result.setDate_longicona___in(this.date_longicona___in);
            result.setDate_longicona___not___in(this.date_longicona___not___in);
            result.setDate_longicona___lt(this.date_longicona___lt);
            result.setDate_longicona___lte(this.date_longicona___lte);
            result.setDate_longicona___gt(this.date_longicona___gt);
            result.setDate_longicona___gte(this.date_longicona___gte);
            result.setDate_longicona___contains(this.date_longicona___contains);
            result.setDate_longicona___not___contains(this.date_longicona___not___contains);
            result.setDate_longicona___starts_with(this.date_longicona___starts_with);
            result.setDate_longicona___not___starts_with(this.date_longicona___not___starts_with);
            result.setDate_longicona___ends_with(this.date_longicona___ends_with);
            result.setDate_longicona___not___ends_with(this.date_longicona___not___ends_with);
            result.setDtg___eq(this.dtg___eq);
            result.setDtg___ne(this.dtg___ne);
            result.setDtg___null(this.dtg___null);
            result.setDtg___not___null(this.dtg___not___null);
            result.setEsito_ultima_terapia___eq(this.esito_ultima_terapia___eq);
            result.setEsito_ultima_terapia___ne(this.esito_ultima_terapia___ne);
            result.setEsito_ultima_terapia___null(this.esito_ultima_terapia___null);
            result.setEsito_ultima_terapia___not___null(this.esito_ultima_terapia___not___null);
            result.setEsito_ultima_terapia___in(this.esito_ultima_terapia___in);
            result.setEsito_ultima_terapia___not___in(this.esito_ultima_terapia___not___in);
            result.setEsito_ultima_terapia___lt(this.esito_ultima_terapia___lt);
            result.setEsito_ultima_terapia___lte(this.esito_ultima_terapia___lte);
            result.setEsito_ultima_terapia___gt(this.esito_ultima_terapia___gt);
            result.setEsito_ultima_terapia___gte(this.esito_ultima_terapia___gte);
            result.setEsito_ultima_terapia___contains(this.esito_ultima_terapia___contains);
            result.setEsito_ultima_terapia___not___contains(this.esito_ultima_terapia___not___contains);
            result.setEsito_ultima_terapia___starts_with(this.esito_ultima_terapia___starts_with);
            result.setEsito_ultima_terapia___not___starts_with(this.esito_ultima_terapia___not___starts_with);
            result.setEsito_ultima_terapia___ends_with(this.esito_ultima_terapia___ends_with);
            result.setEsito_ultima_terapia___not___ends_with(this.esito_ultima_terapia___not___ends_with);
            result.setEta_arruolamento___eq(this.eta_arruolamento___eq);
            result.setEta_arruolamento___ne(this.eta_arruolamento___ne);
            result.setEta_arruolamento___null(this.eta_arruolamento___null);
            result.setEta_arruolamento___not___null(this.eta_arruolamento___not___null);
            result.setEta_arruolamento___in(this.eta_arruolamento___in);
            result.setEta_arruolamento___not___in(this.eta_arruolamento___not___in);
            result.setEta_arruolamento___lt(this.eta_arruolamento___lt);
            result.setEta_arruolamento___lte(this.eta_arruolamento___lte);
            result.setEta_arruolamento___gt(this.eta_arruolamento___gt);
            result.setEta_arruolamento___gte(this.eta_arruolamento___gte);
            result.setEta_prima_visita___eq(this.eta_prima_visita___eq);
            result.setEta_prima_visita___ne(this.eta_prima_visita___ne);
            result.setEta_prima_visita___null(this.eta_prima_visita___null);
            result.setEta_prima_visita___not___null(this.eta_prima_visita___not___null);
            result.setEta_prima_visita___in(this.eta_prima_visita___in);
            result.setEta_prima_visita___not___in(this.eta_prima_visita___not___in);
            result.setEta_prima_visita___lt(this.eta_prima_visita___lt);
            result.setEta_prima_visita___lte(this.eta_prima_visita___lte);
            result.setEta_prima_visita___gt(this.eta_prima_visita___gt);
            result.setEta_prima_visita___gte(this.eta_prima_visita___gte);
            result.setEtnia____eq(this.etnia____eq);
            result.setEtnia____ne(this.etnia____ne);
            result.setEtnia____null(this.etnia____null);
            result.setEtnia____not___null(this.etnia____not___null);
            result.setEtnia____in(this.etnia____in);
            result.setEtnia____not___in(this.etnia____not___in);
            result.setEtnia____lt(this.etnia____lt);
            result.setEtnia____lte(this.etnia____lte);
            result.setEtnia____gt(this.etnia____gt);
            result.setEtnia____gte(this.etnia____gte);
            result.setEtnia____contains(this.etnia____contains);
            result.setEtnia____not___contains(this.etnia____not___contains);
            result.setEtnia____starts_with(this.etnia____starts_with);
            result.setEtnia____not___starts_with(this.etnia____not___starts_with);
            result.setEtnia____ends_with(this.etnia____ends_with);
            result.setEtnia____not___ends_with(this.etnia____not___ends_with);
            result.setFattore_di_rischio____eq(this.fattore_di_rischio____eq);
            result.setFattore_di_rischio____ne(this.fattore_di_rischio____ne);
            result.setFattore_di_rischio____null(this.fattore_di_rischio____null);
            result.setFattore_di_rischio____not___null(this.fattore_di_rischio____not___null);
            result.setFattore_di_rischio____in(this.fattore_di_rischio____in);
            result.setFattore_di_rischio____not___in(this.fattore_di_rischio____not___in);
            result.setFattore_di_rischio____lt(this.fattore_di_rischio____lt);
            result.setFattore_di_rischio____lte(this.fattore_di_rischio____lte);
            result.setFattore_di_rischio____gt(this.fattore_di_rischio____gt);
            result.setFattore_di_rischio____gte(this.fattore_di_rischio____gte);
            result.setFattore_di_rischio____contains(this.fattore_di_rischio____contains);
            result.setFattore_di_rischio____not___contains(this.fattore_di_rischio____not___contains);
            result.setFattore_di_rischio____starts_with(this.fattore_di_rischio____starts_with);
            result.setFattore_di_rischio____not___starts_with(this.fattore_di_rischio____not___starts_with);
            result.setFattore_di_rischio____ends_with(this.fattore_di_rischio____ends_with);
            result.setFattore_di_rischio____not___ends_with(this.fattore_di_rischio____not___ends_with);
            result.setFibroscan___eq(this.fibroscan___eq);
            result.setFibroscan___ne(this.fibroscan___ne);
            result.setFibroscan___null(this.fibroscan___null);
            result.setFibroscan___not___null(this.fibroscan___not___null);
            result.setHbsag_pos___eq(this.hbsag_pos___eq);
            result.setHbsag_pos___ne(this.hbsag_pos___ne);
            result.setHbsag_pos___null(this.hbsag_pos___null);
            result.setHbsag_pos___not___null(this.hbsag_pos___not___null);
            result.setHcvab_pos___eq(this.hcvab_pos___eq);
            result.setHcvab_pos___ne(this.hcvab_pos___ne);
            result.setHcvab_pos___null(this.hcvab_pos___null);
            result.setHcvab_pos___not___null(this.hcvab_pos___not___null);
            result.setHla_b5701___eq(this.hla_b5701___eq);
            result.setHla_b5701___ne(this.hla_b5701___ne);
            result.setHla_b5701___null(this.hla_b5701___null);
            result.setHla_b5701___not___null(this.hla_b5701___not___null);
            result.setHla_b5701___in(this.hla_b5701___in);
            result.setHla_b5701___not___in(this.hla_b5701___not___in);
            result.setHla_b5701___lt(this.hla_b5701___lt);
            result.setHla_b5701___lte(this.hla_b5701___lte);
            result.setHla_b5701___gt(this.hla_b5701___gt);
            result.setHla_b5701___gte(this.hla_b5701___gte);
            result.setHla_b5701___contains(this.hla_b5701___contains);
            result.setHla_b5701___not___contains(this.hla_b5701___not___contains);
            result.setHla_b5701___starts_with(this.hla_b5701___starts_with);
            result.setHla_b5701___not___starts_with(this.hla_b5701___not___starts_with);
            result.setHla_b5701___ends_with(this.hla_b5701___ends_with);
            result.setHla_b5701___not___ends_with(this.hla_b5701___not___ends_with);
            result.setHla_b5701_bool___eq(this.hla_b5701_bool___eq);
            result.setHla_b5701_bool___ne(this.hla_b5701_bool___ne);
            result.setHla_b5701_bool___null(this.hla_b5701_bool___null);
            result.setHla_b5701_bool___not___null(this.hla_b5701_bool___not___null);
            result.setId_paziente___eq(this.id_paziente___eq);
            result.setId_paziente___ne(this.id_paziente___ne);
            result.setId_paziente___null(this.id_paziente___null);
            result.setId_paziente___not___null(this.id_paziente___not___null);
            result.setId_paziente___in(this.id_paziente___in);
            result.setId_paziente___not___in(this.id_paziente___not___in);
            result.setId_paziente___lt(this.id_paziente___lt);
            result.setId_paziente___lte(this.id_paziente___lte);
            result.setId_paziente___gt(this.id_paziente___gt);
            result.setId_paziente___gte(this.id_paziente___gte);
            result.setIfn___eq(this.ifn___eq);
            result.setIfn___ne(this.ifn___ne);
            result.setIfn___null(this.ifn___null);
            result.setIfn___not___null(this.ifn___not___null);
            result.setIn_italia_da_anni___eq(this.in_italia_da_anni___eq);
            result.setIn_italia_da_anni___ne(this.in_italia_da_anni___ne);
            result.setIn_italia_da_anni___null(this.in_italia_da_anni___null);
            result.setIn_italia_da_anni___not___null(this.in_italia_da_anni___not___null);
            result.setIn_italia_da_anni___in(this.in_italia_da_anni___in);
            result.setIn_italia_da_anni___not___in(this.in_italia_da_anni___not___in);
            result.setIn_italia_da_anni___lt(this.in_italia_da_anni___lt);
            result.setIn_italia_da_anni___lte(this.in_italia_da_anni___lte);
            result.setIn_italia_da_anni___gt(this.in_italia_da_anni___gt);
            result.setIn_italia_da_anni___gte(this.in_italia_da_anni___gte);
            result.setNascita___eq(this.nascita___eq);
            result.setNascita___ne(this.nascita___ne);
            result.setNascita___null(this.nascita___null);
            result.setNascita___not___null(this.nascita___not___null);
            result.setNascita___in(this.nascita___in);
            result.setNascita___not___in(this.nascita___not___in);
            result.setNascita___lt(this.nascita___lt);
            result.setNascita___lte(this.nascita___lte);
            result.setNascita___gt(this.nascita___gt);
            result.setNascita___gte(this.nascita___gte);
            result.setNazionalita____eq(this.nazionalita____eq);
            result.setNazionalita____ne(this.nazionalita____ne);
            result.setNazionalita____null(this.nazionalita____null);
            result.setNazionalita____not___null(this.nazionalita____not___null);
            result.setNazionalita____in(this.nazionalita____in);
            result.setNazionalita____not___in(this.nazionalita____not___in);
            result.setNazionalita____lt(this.nazionalita____lt);
            result.setNazionalita____lte(this.nazionalita____lte);
            result.setNazionalita____gt(this.nazionalita____gt);
            result.setNazionalita____gte(this.nazionalita____gte);
            result.setNazionalita____contains(this.nazionalita____contains);
            result.setNazionalita____not___contains(this.nazionalita____not___contains);
            result.setNazionalita____starts_with(this.nazionalita____starts_with);
            result.setNazionalita____not___starts_with(this.nazionalita____not___starts_with);
            result.setNazionalita____ends_with(this.nazionalita____ends_with);
            result.setNazionalita____not___ends_with(this.nazionalita____not___ends_with);
            result.setNazione___eq(this.nazione___eq);
            result.setNazione___ne(this.nazione___ne);
            result.setNazione___null(this.nazione___null);
            result.setNazione___not___null(this.nazione___not___null);
            result.setNazione___in(this.nazione___in);
            result.setNazione___not___in(this.nazione___not___in);
            result.setNazione___lt(this.nazione___lt);
            result.setNazione___lte(this.nazione___lte);
            result.setNazione___gt(this.nazione___gt);
            result.setNazione___gte(this.nazione___gte);
            result.setNazione___contains(this.nazione___contains);
            result.setNazione___not___contains(this.nazione___not___contains);
            result.setNazione___starts_with(this.nazione___starts_with);
            result.setNazione___not___starts_with(this.nazione___not___starts_with);
            result.setNazione___ends_with(this.nazione___ends_with);
            result.setNazione___not___ends_with(this.nazione___not___ends_with);
            result.setNoco___eq(this.noco___eq);
            result.setNoco___ne(this.noco___ne);
            result.setNoco___null(this.noco___null);
            result.setNoco___not___null(this.noco___not___null);
            result.setNome___eq(this.nome___eq);
            result.setNome___ne(this.nome___ne);
            result.setNome___null(this.nome___null);
            result.setNome___not___null(this.nome___not___null);
            result.setNome___in(this.nome___in);
            result.setNome___not___in(this.nome___not___in);
            result.setNome___lt(this.nome___lt);
            result.setNome___lte(this.nome___lte);
            result.setNome___gt(this.nome___gt);
            result.setNome___gte(this.nome___gte);
            result.setNome___contains(this.nome___contains);
            result.setNome___not___contains(this.nome___not___contains);
            result.setNome___starts_with(this.nome___starts_with);
            result.setNome___not___starts_with(this.nome___not___starts_with);
            result.setNome___ends_with(this.nome___ends_with);
            result.setNome___not___ends_with(this.nome___not___ends_with);
            result.setNote_terapia___eq(this.note_terapia___eq);
            result.setNote_terapia___ne(this.note_terapia___ne);
            result.setNote_terapia___null(this.note_terapia___null);
            result.setNote_terapia___not___null(this.note_terapia___not___null);
            result.setNote_terapia___in(this.note_terapia___in);
            result.setNote_terapia___not___in(this.note_terapia___not___in);
            result.setNote_terapia___lt(this.note_terapia___lt);
            result.setNote_terapia___lte(this.note_terapia___lte);
            result.setNote_terapia___gt(this.note_terapia___gt);
            result.setNote_terapia___gte(this.note_terapia___gte);
            result.setNote_terapia___contains(this.note_terapia___contains);
            result.setNote_terapia___not___contains(this.note_terapia___not___contains);
            result.setNote_terapia___starts_with(this.note_terapia___starts_with);
            result.setNote_terapia___not___starts_with(this.note_terapia___not___starts_with);
            result.setNote_terapia___ends_with(this.note_terapia___ends_with);
            result.setNote_terapia___not___ends_with(this.note_terapia___not___ends_with);
            result.setNull_val___eq(this.null_val___eq);
            result.setNull_val___ne(this.null_val___ne);
            result.setNull_val___null(this.null_val___null);
            result.setNull_val___not___null(this.null_val___not___null);
            result.setPassword_pro___eq(this.password_pro___eq);
            result.setPassword_pro___ne(this.password_pro___ne);
            result.setPassword_pro___null(this.password_pro___null);
            result.setPassword_pro___not___null(this.password_pro___not___null);
            result.setPassword_pro___in(this.password_pro___in);
            result.setPassword_pro___not___in(this.password_pro___not___in);
            result.setPassword_pro___lt(this.password_pro___lt);
            result.setPassword_pro___lte(this.password_pro___lte);
            result.setPassword_pro___gt(this.password_pro___gt);
            result.setPassword_pro___gte(this.password_pro___gte);
            result.setPassword_pro___contains(this.password_pro___contains);
            result.setPassword_pro___not___contains(this.password_pro___not___contains);
            result.setPassword_pro___starts_with(this.password_pro___starts_with);
            result.setPassword_pro___not___starts_with(this.password_pro___not___starts_with);
            result.setPassword_pro___ends_with(this.password_pro___ends_with);
            result.setPassword_pro___not___ends_with(this.password_pro___not___ends_with);
            result.setPegifn___eq(this.pegifn___eq);
            result.setPegifn___ne(this.pegifn___ne);
            result.setPegifn___null(this.pegifn___null);
            result.setPegifn___not___null(this.pegifn___not___null);
            result.setPregresse_terapie_anti_hcv___eq(this.pregresse_terapie_anti_hcv___eq);
            result.setPregresse_terapie_anti_hcv___ne(this.pregresse_terapie_anti_hcv___ne);
            result.setPregresse_terapie_anti_hcv___null(this.pregresse_terapie_anti_hcv___null);
            result.setPregresse_terapie_anti_hcv___not___null(this.pregresse_terapie_anti_hcv___not___null);
            result.setPro___eq(this.pro___eq);
            result.setPro___ne(this.pro___ne);
            result.setPro___null(this.pro___null);
            result.setPro___not___null(this.pro___not___null);
            result.setRibavirina___eq(this.ribavirina___eq);
            result.setRibavirina___ne(this.ribavirina___ne);
            result.setRibavirina___null(this.ribavirina___null);
            result.setRibavirina___not___null(this.ribavirina___not___null);
            result.setRisk_F___eq(this.risk_F___eq);
            result.setRisk_F___ne(this.risk_F___ne);
            result.setRisk_F___null(this.risk_F___null);
            result.setRisk_F___not___null(this.risk_F___not___null);
            result.setSessione_pro___eq(this.sessione_pro___eq);
            result.setSessione_pro___ne(this.sessione_pro___ne);
            result.setSessione_pro___null(this.sessione_pro___null);
            result.setSessione_pro___not___null(this.sessione_pro___not___null);
            result.setSessione_pro___in(this.sessione_pro___in);
            result.setSessione_pro___not___in(this.sessione_pro___not___in);
            result.setSessione_pro___lt(this.sessione_pro___lt);
            result.setSessione_pro___lte(this.sessione_pro___lte);
            result.setSessione_pro___gt(this.sessione_pro___gt);
            result.setSessione_pro___gte(this.sessione_pro___gte);
            result.setSessione_pro___contains(this.sessione_pro___contains);
            result.setSessione_pro___not___contains(this.sessione_pro___not___contains);
            result.setSessione_pro___starts_with(this.sessione_pro___starts_with);
            result.setSessione_pro___not___starts_with(this.sessione_pro___not___starts_with);
            result.setSessione_pro___ends_with(this.sessione_pro___ends_with);
            result.setSessione_pro___not___ends_with(this.sessione_pro___not___ends_with);
            result.setSesso___eq(this.sesso___eq);
            result.setSesso___ne(this.sesso___ne);
            result.setSesso___null(this.sesso___null);
            result.setSesso___not___null(this.sesso___not___null);
            result.setSesso___in(this.sesso___in);
            result.setSesso___not___in(this.sesso___not___in);
            result.setSesso___lt(this.sesso___lt);
            result.setSesso___lte(this.sesso___lte);
            result.setSesso___gt(this.sesso___gt);
            result.setSesso___gte(this.sesso___gte);
            result.setSesso___contains(this.sesso___contains);
            result.setSesso___not___contains(this.sesso___not___contains);
            result.setSesso___starts_with(this.sesso___starts_with);
            result.setSesso___not___starts_with(this.sesso___not___starts_with);
            result.setSesso___ends_with(this.sesso___ends_with);
            result.setSesso___not___ends_with(this.sesso___not___ends_with);
            result.setStribild___eq(this.stribild___eq);
            result.setStribild___ne(this.stribild___ne);
            result.setStribild___null(this.stribild___null);
            result.setStribild___not___null(this.stribild___not___null);
            result.setStudi_pro_abilitati___eq(this.studi_pro_abilitati___eq);
            result.setStudi_pro_abilitati___ne(this.studi_pro_abilitati___ne);
            result.setStudi_pro_abilitati___null(this.studi_pro_abilitati___null);
            result.setStudi_pro_abilitati___not___null(this.studi_pro_abilitati___not___null);
            result.setStudi_pro_abilitati___in(this.studi_pro_abilitati___in);
            result.setStudi_pro_abilitati___not___in(this.studi_pro_abilitati___not___in);
            result.setStudi_pro_abilitati___lt(this.studi_pro_abilitati___lt);
            result.setStudi_pro_abilitati___lte(this.studi_pro_abilitati___lte);
            result.setStudi_pro_abilitati___gt(this.studi_pro_abilitati___gt);
            result.setStudi_pro_abilitati___gte(this.studi_pro_abilitati___gte);
            result.setStudi_pro_abilitati___contains(this.studi_pro_abilitati___contains);
            result.setStudi_pro_abilitati___not___contains(this.studi_pro_abilitati___not___contains);
            result.setStudi_pro_abilitati___starts_with(this.studi_pro_abilitati___starts_with);
            result.setStudi_pro_abilitati___not___starts_with(this.studi_pro_abilitati___not___starts_with);
            result.setStudi_pro_abilitati___ends_with(this.studi_pro_abilitati___ends_with);
            result.setStudi_pro_abilitati___not___ends_with(this.studi_pro_abilitati___not___ends_with);
            result.setTaf___eq(this.taf___eq);
            result.setTaf___ne(this.taf___ne);
            result.setTaf___null(this.taf___null);
            result.setTaf___not___null(this.taf___not___null);
            result.setTerapia_ormonale___eq(this.terapia_ormonale___eq);
            result.setTerapia_ormonale___ne(this.terapia_ormonale___ne);
            result.setTerapia_ormonale___null(this.terapia_ormonale___null);
            result.setTerapia_ormonale___not___null(this.terapia_ormonale___not___null);
            result.setToken_notifiche_pro___eq(this.token_notifiche_pro___eq);
            result.setToken_notifiche_pro___ne(this.token_notifiche_pro___ne);
            result.setToken_notifiche_pro___null(this.token_notifiche_pro___null);
            result.setToken_notifiche_pro___not___null(this.token_notifiche_pro___not___null);
            result.setToken_notifiche_pro___in(this.token_notifiche_pro___in);
            result.setToken_notifiche_pro___not___in(this.token_notifiche_pro___not___in);
            result.setToken_notifiche_pro___lt(this.token_notifiche_pro___lt);
            result.setToken_notifiche_pro___lte(this.token_notifiche_pro___lte);
            result.setToken_notifiche_pro___gt(this.token_notifiche_pro___gt);
            result.setToken_notifiche_pro___gte(this.token_notifiche_pro___gte);
            result.setToken_notifiche_pro___contains(this.token_notifiche_pro___contains);
            result.setToken_notifiche_pro___not___contains(this.token_notifiche_pro___not___contains);
            result.setToken_notifiche_pro___starts_with(this.token_notifiche_pro___starts_with);
            result.setToken_notifiche_pro___not___starts_with(this.token_notifiche_pro___not___starts_with);
            result.setToken_notifiche_pro___ends_with(this.token_notifiche_pro___ends_with);
            result.setToken_notifiche_pro___not___ends_with(this.token_notifiche_pro___not___ends_with);
            result.setTrasferito___eq(this.trasferito___eq);
            result.setTrasferito___ne(this.trasferito___ne);
            result.setTrasferito___null(this.trasferito___null);
            result.setTrasferito___not___null(this.trasferito___not___null);
            result.setUsername_pro___eq(this.username_pro___eq);
            result.setUsername_pro___ne(this.username_pro___ne);
            result.setUsername_pro___null(this.username_pro___null);
            result.setUsername_pro___not___null(this.username_pro___not___null);
            result.setUsername_pro___in(this.username_pro___in);
            result.setUsername_pro___not___in(this.username_pro___not___in);
            result.setUsername_pro___lt(this.username_pro___lt);
            result.setUsername_pro___lte(this.username_pro___lte);
            result.setUsername_pro___gt(this.username_pro___gt);
            result.setUsername_pro___gte(this.username_pro___gte);
            result.setUsername_pro___contains(this.username_pro___contains);
            result.setUsername_pro___not___contains(this.username_pro___not___contains);
            result.setUsername_pro___starts_with(this.username_pro___starts_with);
            result.setUsername_pro___not___starts_with(this.username_pro___not___starts_with);
            result.setUsername_pro___ends_with(this.username_pro___ends_with);
            result.setUsername_pro___not___ends_with(this.username_pro___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
