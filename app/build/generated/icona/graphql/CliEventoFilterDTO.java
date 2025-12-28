package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Evento.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEventoFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String IPI___eq;
    private String IPI___ne;
    private Boolean IPI___null;
    private Boolean IPI___not___null;
    private java.util.List<String> IPI___in;
    private java.util.List<String> IPI___not___in;
    private String IPI___lt;
    private String IPI___lte;
    private String IPI___gt;
    private String IPI___gte;
    private String IPI___contains;
    private String IPI___not___contains;
    private String IPI___starts_with;
    private String IPI___not___starts_with;
    private String IPI___ends_with;
    private String IPI___not___ends_with;
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
    private String aaIPI___eq;
    private String aaIPI___ne;
    private Boolean aaIPI___null;
    private Boolean aaIPI___not___null;
    private java.util.List<String> aaIPI___in;
    private java.util.List<String> aaIPI___not___in;
    private String aaIPI___lt;
    private String aaIPI___lte;
    private String aaIPI___gt;
    private String aaIPI___gte;
    private String aaIPI___contains;
    private String aaIPI___not___contains;
    private String aaIPI___starts_with;
    private String aaIPI___not___starts_with;
    private String aaIPI___ends_with;
    private String aaIPI___not___ends_with;
    private String altro___eq;
    private String altro___ne;
    private Boolean altro___null;
    private Boolean altro___not___null;
    private java.util.List<String> altro___in;
    private java.util.List<String> altro___not___in;
    private String altro___lt;
    private String altro___lte;
    private String altro___gt;
    private String altro___gte;
    private String altro___contains;
    private String altro___not___contains;
    private String altro___starts_with;
    private String altro___not___starts_with;
    private String altro___ends_with;
    private String altro___not___ends_with;
    private Boolean anamnesi___eq;
    private Boolean anamnesi___ne;
    private Boolean anamnesi___null;
    private Boolean anamnesi___not___null;
    private Integer c_dettaglio_id___eq;
    private Integer c_dettaglio_id___ne;
    private Boolean c_dettaglio_id___null;
    private Boolean c_dettaglio_id___not___null;
    private java.util.List<Integer> c_dettaglio_id___in;
    private java.util.List<Integer> c_dettaglio_id___not___in;
    private Integer c_dettaglio_id___lt;
    private Integer c_dettaglio_id___lte;
    private Integer c_dettaglio_id___gt;
    private Integer c_dettaglio_id___gte;
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
    private Boolean documentazione_necessaria___eq;
    private Boolean documentazione_necessaria___ne;
    private Boolean documentazione_necessaria___null;
    private Boolean documentazione_necessaria___not___null;
    private String episodio___eq;
    private String episodio___ne;
    private Boolean episodio___null;
    private Boolean episodio___not___null;
    private java.util.List<String> episodio___in;
    private java.util.List<String> episodio___not___in;
    private String episodio___lt;
    private String episodio___lte;
    private String episodio___gt;
    private String episodio___gte;
    private String episodio___contains;
    private String episodio___not___contains;
    private String episodio___starts_with;
    private String episodio___not___starts_with;
    private String episodio___ends_with;
    private String episodio___not___ends_with;
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
    private String metodo_diagnosi_tumore___eq;
    private String metodo_diagnosi_tumore___ne;
    private Boolean metodo_diagnosi_tumore___null;
    private Boolean metodo_diagnosi_tumore___not___null;
    private java.util.List<String> metodo_diagnosi_tumore___in;
    private java.util.List<String> metodo_diagnosi_tumore___not___in;
    private String metodo_diagnosi_tumore___lt;
    private String metodo_diagnosi_tumore___lte;
    private String metodo_diagnosi_tumore___gt;
    private String metodo_diagnosi_tumore___gte;
    private String metodo_diagnosi_tumore___contains;
    private String metodo_diagnosi_tumore___not___contains;
    private String metodo_diagnosi_tumore___starts_with;
    private String metodo_diagnosi_tumore___not___starts_with;
    private String metodo_diagnosi_tumore___ends_with;
    private String metodo_diagnosi_tumore___not___ends_with;
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
    private String nome_patologia___eq;
    private String nome_patologia___ne;
    private Boolean nome_patologia___null;
    private Boolean nome_patologia___not___null;
    private java.util.List<String> nome_patologia___in;
    private java.util.List<String> nome_patologia___not___in;
    private String nome_patologia___lt;
    private String nome_patologia___lte;
    private String nome_patologia___gt;
    private String nome_patologia___gte;
    private String nome_patologia___contains;
    private String nome_patologia___not___contains;
    private String nome_patologia___starts_with;
    private String nome_patologia___not___starts_with;
    private String nome_patologia___ends_with;
    private String nome_patologia___not___ends_with;
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
    private Integer paziente_o___eq;
    private Integer paziente_o___ne;
    private Boolean paziente_o___null;
    private Boolean paziente_o___not___null;
    private java.util.List<Integer> paziente_o___in;
    private java.util.List<Integer> paziente_o___not___in;
    private Integer paziente_o___lt;
    private Integer paziente_o___lte;
    private Integer paziente_o___gt;
    private Integer paziente_o___gte;
    private String performance_status___eq;
    private String performance_status___ne;
    private Boolean performance_status___null;
    private Boolean performance_status___not___null;
    private java.util.List<String> performance_status___in;
    private java.util.List<String> performance_status___not___in;
    private String performance_status___lt;
    private String performance_status___lte;
    private String performance_status___gt;
    private String performance_status___gte;
    private String performance_status___contains;
    private String performance_status___not___contains;
    private String performance_status___starts_with;
    private String performance_status___not___starts_with;
    private String performance_status___ends_with;
    private String performance_status___not___ends_with;
    private String siti_coinvolti_M___eq;
    private String siti_coinvolti_M___ne;
    private Boolean siti_coinvolti_M___null;
    private Boolean siti_coinvolti_M___not___null;
    private java.util.List<String> siti_coinvolti_M___in;
    private java.util.List<String> siti_coinvolti_M___not___in;
    private String siti_coinvolti_M___lt;
    private String siti_coinvolti_M___lte;
    private String siti_coinvolti_M___gt;
    private String siti_coinvolti_M___gte;
    private String siti_coinvolti_M___contains;
    private String siti_coinvolti_M___not___contains;
    private String siti_coinvolti_M___starts_with;
    private String siti_coinvolti_M___not___starts_with;
    private String siti_coinvolti_M___ends_with;
    private String siti_coinvolti_M___not___ends_with;
    private String siti_coinvolti_N___eq;
    private String siti_coinvolti_N___ne;
    private Boolean siti_coinvolti_N___null;
    private Boolean siti_coinvolti_N___not___null;
    private java.util.List<String> siti_coinvolti_N___in;
    private java.util.List<String> siti_coinvolti_N___not___in;
    private String siti_coinvolti_N___lt;
    private String siti_coinvolti_N___lte;
    private String siti_coinvolti_N___gt;
    private String siti_coinvolti_N___gte;
    private String siti_coinvolti_N___contains;
    private String siti_coinvolti_N___not___contains;
    private String siti_coinvolti_N___starts_with;
    private String siti_coinvolti_N___not___starts_with;
    private String siti_coinvolti_N___ends_with;
    private String siti_coinvolti_N___not___ends_with;
    private String siti_coinvolti_T___eq;
    private String siti_coinvolti_T___ne;
    private Boolean siti_coinvolti_T___null;
    private Boolean siti_coinvolti_T___not___null;
    private java.util.List<String> siti_coinvolti_T___in;
    private java.util.List<String> siti_coinvolti_T___not___in;
    private String siti_coinvolti_T___lt;
    private String siti_coinvolti_T___lte;
    private String siti_coinvolti_T___gt;
    private String siti_coinvolti_T___gte;
    private String siti_coinvolti_T___contains;
    private String siti_coinvolti_T___not___contains;
    private String siti_coinvolti_T___starts_with;
    private String siti_coinvolti_T___not___starts_with;
    private String siti_coinvolti_T___ends_with;
    private String siti_coinvolti_T___not___ends_with;
    private Boolean specifica_tumori___eq;
    private Boolean specifica_tumori___ne;
    private Boolean specifica_tumori___null;
    private Boolean specifica_tumori___not___null;
    private String stadio_tumore___eq;
    private String stadio_tumore___ne;
    private Boolean stadio_tumore___null;
    private Boolean stadio_tumore___not___null;
    private java.util.List<String> stadio_tumore___in;
    private java.util.List<String> stadio_tumore___not___in;
    private String stadio_tumore___lt;
    private String stadio_tumore___lte;
    private String stadio_tumore___gt;
    private String stadio_tumore___gte;
    private String stadio_tumore___contains;
    private String stadio_tumore___not___contains;
    private String stadio_tumore___starts_with;
    private String stadio_tumore___not___starts_with;
    private String stadio_tumore___ends_with;
    private String stadio_tumore___not___ends_with;
    private String stato_accertamento___eq;
    private String stato_accertamento___ne;
    private Boolean stato_accertamento___null;
    private Boolean stato_accertamento___not___null;
    private java.util.List<String> stato_accertamento___in;
    private java.util.List<String> stato_accertamento___not___in;
    private String stato_accertamento___lt;
    private String stato_accertamento___lte;
    private String stato_accertamento___gt;
    private String stato_accertamento___gte;
    private String stato_accertamento___contains;
    private String stato_accertamento___not___contains;
    private String stato_accertamento___starts_with;
    private String stato_accertamento___not___starts_with;
    private String stato_accertamento___ends_with;
    private String stato_accertamento___not___ends_with;
    private String tipo_imaging___eq;
    private String tipo_imaging___ne;
    private Boolean tipo_imaging___null;
    private Boolean tipo_imaging___not___null;
    private java.util.List<String> tipo_imaging___in;
    private java.util.List<String> tipo_imaging___not___in;
    private String tipo_imaging___lt;
    private String tipo_imaging___lte;
    private String tipo_imaging___gt;
    private String tipo_imaging___gte;
    private String tipo_imaging___contains;
    private String tipo_imaging___not___contains;
    private String tipo_imaging___starts_with;
    private String tipo_imaging___not___starts_with;
    private String tipo_imaging___ends_with;
    private String tipo_imaging___not___ends_with;
    private Boolean warning_respond___eq;
    private Boolean warning_respond___ne;
    private Boolean warning_respond___null;
    private Boolean warning_respond___not___null;
    private java.util.List<CliEventoFilterDTO> AND;
    private java.util.List<CliEventoFilterDTO> OR;
    private CliEventoFilterDTO NOT;

    public CliEventoFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String getIPI___eq() {
        return IPI___eq;
    }
    public void setIPI___eq(String IPI___eq) {
        this.IPI___eq = IPI___eq;
    }

    public String getIPI___ne() {
        return IPI___ne;
    }
    public void setIPI___ne(String IPI___ne) {
        this.IPI___ne = IPI___ne;
    }

    public Boolean getIPI___null() {
        return IPI___null;
    }
    public void setIPI___null(Boolean IPI___null) {
        this.IPI___null = IPI___null;
    }

    public Boolean getIPI___not___null() {
        return IPI___not___null;
    }
    public void setIPI___not___null(Boolean IPI___not___null) {
        this.IPI___not___null = IPI___not___null;
    }

    public java.util.List<String> getIPI___in() {
        return IPI___in;
    }
    public void setIPI___in(java.util.List<String> IPI___in) {
        this.IPI___in = IPI___in;
    }

    public java.util.List<String> getIPI___not___in() {
        return IPI___not___in;
    }
    public void setIPI___not___in(java.util.List<String> IPI___not___in) {
        this.IPI___not___in = IPI___not___in;
    }

    public String getIPI___lt() {
        return IPI___lt;
    }
    public void setIPI___lt(String IPI___lt) {
        this.IPI___lt = IPI___lt;
    }

    public String getIPI___lte() {
        return IPI___lte;
    }
    public void setIPI___lte(String IPI___lte) {
        this.IPI___lte = IPI___lte;
    }

    public String getIPI___gt() {
        return IPI___gt;
    }
    public void setIPI___gt(String IPI___gt) {
        this.IPI___gt = IPI___gt;
    }

    public String getIPI___gte() {
        return IPI___gte;
    }
    public void setIPI___gte(String IPI___gte) {
        this.IPI___gte = IPI___gte;
    }

    public String getIPI___contains() {
        return IPI___contains;
    }
    public void setIPI___contains(String IPI___contains) {
        this.IPI___contains = IPI___contains;
    }

    public String getIPI___not___contains() {
        return IPI___not___contains;
    }
    public void setIPI___not___contains(String IPI___not___contains) {
        this.IPI___not___contains = IPI___not___contains;
    }

    public String getIPI___starts_with() {
        return IPI___starts_with;
    }
    public void setIPI___starts_with(String IPI___starts_with) {
        this.IPI___starts_with = IPI___starts_with;
    }

    public String getIPI___not___starts_with() {
        return IPI___not___starts_with;
    }
    public void setIPI___not___starts_with(String IPI___not___starts_with) {
        this.IPI___not___starts_with = IPI___not___starts_with;
    }

    public String getIPI___ends_with() {
        return IPI___ends_with;
    }
    public void setIPI___ends_with(String IPI___ends_with) {
        this.IPI___ends_with = IPI___ends_with;
    }

    public String getIPI___not___ends_with() {
        return IPI___not___ends_with;
    }
    public void setIPI___not___ends_with(String IPI___not___ends_with) {
        this.IPI___not___ends_with = IPI___not___ends_with;
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

    public String getAaIPI___eq() {
        return aaIPI___eq;
    }
    public void setAaIPI___eq(String aaIPI___eq) {
        this.aaIPI___eq = aaIPI___eq;
    }

    public String getAaIPI___ne() {
        return aaIPI___ne;
    }
    public void setAaIPI___ne(String aaIPI___ne) {
        this.aaIPI___ne = aaIPI___ne;
    }

    public Boolean getAaIPI___null() {
        return aaIPI___null;
    }
    public void setAaIPI___null(Boolean aaIPI___null) {
        this.aaIPI___null = aaIPI___null;
    }

    public Boolean getAaIPI___not___null() {
        return aaIPI___not___null;
    }
    public void setAaIPI___not___null(Boolean aaIPI___not___null) {
        this.aaIPI___not___null = aaIPI___not___null;
    }

    public java.util.List<String> getAaIPI___in() {
        return aaIPI___in;
    }
    public void setAaIPI___in(java.util.List<String> aaIPI___in) {
        this.aaIPI___in = aaIPI___in;
    }

    public java.util.List<String> getAaIPI___not___in() {
        return aaIPI___not___in;
    }
    public void setAaIPI___not___in(java.util.List<String> aaIPI___not___in) {
        this.aaIPI___not___in = aaIPI___not___in;
    }

    public String getAaIPI___lt() {
        return aaIPI___lt;
    }
    public void setAaIPI___lt(String aaIPI___lt) {
        this.aaIPI___lt = aaIPI___lt;
    }

    public String getAaIPI___lte() {
        return aaIPI___lte;
    }
    public void setAaIPI___lte(String aaIPI___lte) {
        this.aaIPI___lte = aaIPI___lte;
    }

    public String getAaIPI___gt() {
        return aaIPI___gt;
    }
    public void setAaIPI___gt(String aaIPI___gt) {
        this.aaIPI___gt = aaIPI___gt;
    }

    public String getAaIPI___gte() {
        return aaIPI___gte;
    }
    public void setAaIPI___gte(String aaIPI___gte) {
        this.aaIPI___gte = aaIPI___gte;
    }

    public String getAaIPI___contains() {
        return aaIPI___contains;
    }
    public void setAaIPI___contains(String aaIPI___contains) {
        this.aaIPI___contains = aaIPI___contains;
    }

    public String getAaIPI___not___contains() {
        return aaIPI___not___contains;
    }
    public void setAaIPI___not___contains(String aaIPI___not___contains) {
        this.aaIPI___not___contains = aaIPI___not___contains;
    }

    public String getAaIPI___starts_with() {
        return aaIPI___starts_with;
    }
    public void setAaIPI___starts_with(String aaIPI___starts_with) {
        this.aaIPI___starts_with = aaIPI___starts_with;
    }

    public String getAaIPI___not___starts_with() {
        return aaIPI___not___starts_with;
    }
    public void setAaIPI___not___starts_with(String aaIPI___not___starts_with) {
        this.aaIPI___not___starts_with = aaIPI___not___starts_with;
    }

    public String getAaIPI___ends_with() {
        return aaIPI___ends_with;
    }
    public void setAaIPI___ends_with(String aaIPI___ends_with) {
        this.aaIPI___ends_with = aaIPI___ends_with;
    }

    public String getAaIPI___not___ends_with() {
        return aaIPI___not___ends_with;
    }
    public void setAaIPI___not___ends_with(String aaIPI___not___ends_with) {
        this.aaIPI___not___ends_with = aaIPI___not___ends_with;
    }

    public String getAltro___eq() {
        return altro___eq;
    }
    public void setAltro___eq(String altro___eq) {
        this.altro___eq = altro___eq;
    }

    public String getAltro___ne() {
        return altro___ne;
    }
    public void setAltro___ne(String altro___ne) {
        this.altro___ne = altro___ne;
    }

    public Boolean getAltro___null() {
        return altro___null;
    }
    public void setAltro___null(Boolean altro___null) {
        this.altro___null = altro___null;
    }

    public Boolean getAltro___not___null() {
        return altro___not___null;
    }
    public void setAltro___not___null(Boolean altro___not___null) {
        this.altro___not___null = altro___not___null;
    }

    public java.util.List<String> getAltro___in() {
        return altro___in;
    }
    public void setAltro___in(java.util.List<String> altro___in) {
        this.altro___in = altro___in;
    }

    public java.util.List<String> getAltro___not___in() {
        return altro___not___in;
    }
    public void setAltro___not___in(java.util.List<String> altro___not___in) {
        this.altro___not___in = altro___not___in;
    }

    public String getAltro___lt() {
        return altro___lt;
    }
    public void setAltro___lt(String altro___lt) {
        this.altro___lt = altro___lt;
    }

    public String getAltro___lte() {
        return altro___lte;
    }
    public void setAltro___lte(String altro___lte) {
        this.altro___lte = altro___lte;
    }

    public String getAltro___gt() {
        return altro___gt;
    }
    public void setAltro___gt(String altro___gt) {
        this.altro___gt = altro___gt;
    }

    public String getAltro___gte() {
        return altro___gte;
    }
    public void setAltro___gte(String altro___gte) {
        this.altro___gte = altro___gte;
    }

    public String getAltro___contains() {
        return altro___contains;
    }
    public void setAltro___contains(String altro___contains) {
        this.altro___contains = altro___contains;
    }

    public String getAltro___not___contains() {
        return altro___not___contains;
    }
    public void setAltro___not___contains(String altro___not___contains) {
        this.altro___not___contains = altro___not___contains;
    }

    public String getAltro___starts_with() {
        return altro___starts_with;
    }
    public void setAltro___starts_with(String altro___starts_with) {
        this.altro___starts_with = altro___starts_with;
    }

    public String getAltro___not___starts_with() {
        return altro___not___starts_with;
    }
    public void setAltro___not___starts_with(String altro___not___starts_with) {
        this.altro___not___starts_with = altro___not___starts_with;
    }

    public String getAltro___ends_with() {
        return altro___ends_with;
    }
    public void setAltro___ends_with(String altro___ends_with) {
        this.altro___ends_with = altro___ends_with;
    }

    public String getAltro___not___ends_with() {
        return altro___not___ends_with;
    }
    public void setAltro___not___ends_with(String altro___not___ends_with) {
        this.altro___not___ends_with = altro___not___ends_with;
    }

    public Boolean getAnamnesi___eq() {
        return anamnesi___eq;
    }
    public void setAnamnesi___eq(Boolean anamnesi___eq) {
        this.anamnesi___eq = anamnesi___eq;
    }

    public Boolean getAnamnesi___ne() {
        return anamnesi___ne;
    }
    public void setAnamnesi___ne(Boolean anamnesi___ne) {
        this.anamnesi___ne = anamnesi___ne;
    }

    public Boolean getAnamnesi___null() {
        return anamnesi___null;
    }
    public void setAnamnesi___null(Boolean anamnesi___null) {
        this.anamnesi___null = anamnesi___null;
    }

    public Boolean getAnamnesi___not___null() {
        return anamnesi___not___null;
    }
    public void setAnamnesi___not___null(Boolean anamnesi___not___null) {
        this.anamnesi___not___null = anamnesi___not___null;
    }

    public Integer getC_dettaglio_id___eq() {
        return c_dettaglio_id___eq;
    }
    public void setC_dettaglio_id___eq(Integer c_dettaglio_id___eq) {
        this.c_dettaglio_id___eq = c_dettaglio_id___eq;
    }

    public Integer getC_dettaglio_id___ne() {
        return c_dettaglio_id___ne;
    }
    public void setC_dettaglio_id___ne(Integer c_dettaglio_id___ne) {
        this.c_dettaglio_id___ne = c_dettaglio_id___ne;
    }

    public Boolean getC_dettaglio_id___null() {
        return c_dettaglio_id___null;
    }
    public void setC_dettaglio_id___null(Boolean c_dettaglio_id___null) {
        this.c_dettaglio_id___null = c_dettaglio_id___null;
    }

    public Boolean getC_dettaglio_id___not___null() {
        return c_dettaglio_id___not___null;
    }
    public void setC_dettaglio_id___not___null(Boolean c_dettaglio_id___not___null) {
        this.c_dettaglio_id___not___null = c_dettaglio_id___not___null;
    }

    public java.util.List<Integer> getC_dettaglio_id___in() {
        return c_dettaglio_id___in;
    }
    public void setC_dettaglio_id___in(java.util.List<Integer> c_dettaglio_id___in) {
        this.c_dettaglio_id___in = c_dettaglio_id___in;
    }

    public java.util.List<Integer> getC_dettaglio_id___not___in() {
        return c_dettaglio_id___not___in;
    }
    public void setC_dettaglio_id___not___in(java.util.List<Integer> c_dettaglio_id___not___in) {
        this.c_dettaglio_id___not___in = c_dettaglio_id___not___in;
    }

    public Integer getC_dettaglio_id___lt() {
        return c_dettaglio_id___lt;
    }
    public void setC_dettaglio_id___lt(Integer c_dettaglio_id___lt) {
        this.c_dettaglio_id___lt = c_dettaglio_id___lt;
    }

    public Integer getC_dettaglio_id___lte() {
        return c_dettaglio_id___lte;
    }
    public void setC_dettaglio_id___lte(Integer c_dettaglio_id___lte) {
        this.c_dettaglio_id___lte = c_dettaglio_id___lte;
    }

    public Integer getC_dettaglio_id___gt() {
        return c_dettaglio_id___gt;
    }
    public void setC_dettaglio_id___gt(Integer c_dettaglio_id___gt) {
        this.c_dettaglio_id___gt = c_dettaglio_id___gt;
    }

    public Integer getC_dettaglio_id___gte() {
        return c_dettaglio_id___gte;
    }
    public void setC_dettaglio_id___gte(Integer c_dettaglio_id___gte) {
        this.c_dettaglio_id___gte = c_dettaglio_id___gte;
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

    public Boolean getDocumentazione_necessaria___eq() {
        return documentazione_necessaria___eq;
    }
    public void setDocumentazione_necessaria___eq(Boolean documentazione_necessaria___eq) {
        this.documentazione_necessaria___eq = documentazione_necessaria___eq;
    }

    public Boolean getDocumentazione_necessaria___ne() {
        return documentazione_necessaria___ne;
    }
    public void setDocumentazione_necessaria___ne(Boolean documentazione_necessaria___ne) {
        this.documentazione_necessaria___ne = documentazione_necessaria___ne;
    }

    public Boolean getDocumentazione_necessaria___null() {
        return documentazione_necessaria___null;
    }
    public void setDocumentazione_necessaria___null(Boolean documentazione_necessaria___null) {
        this.documentazione_necessaria___null = documentazione_necessaria___null;
    }

    public Boolean getDocumentazione_necessaria___not___null() {
        return documentazione_necessaria___not___null;
    }
    public void setDocumentazione_necessaria___not___null(Boolean documentazione_necessaria___not___null) {
        this.documentazione_necessaria___not___null = documentazione_necessaria___not___null;
    }

    public String getEpisodio___eq() {
        return episodio___eq;
    }
    public void setEpisodio___eq(String episodio___eq) {
        this.episodio___eq = episodio___eq;
    }

    public String getEpisodio___ne() {
        return episodio___ne;
    }
    public void setEpisodio___ne(String episodio___ne) {
        this.episodio___ne = episodio___ne;
    }

    public Boolean getEpisodio___null() {
        return episodio___null;
    }
    public void setEpisodio___null(Boolean episodio___null) {
        this.episodio___null = episodio___null;
    }

    public Boolean getEpisodio___not___null() {
        return episodio___not___null;
    }
    public void setEpisodio___not___null(Boolean episodio___not___null) {
        this.episodio___not___null = episodio___not___null;
    }

    public java.util.List<String> getEpisodio___in() {
        return episodio___in;
    }
    public void setEpisodio___in(java.util.List<String> episodio___in) {
        this.episodio___in = episodio___in;
    }

    public java.util.List<String> getEpisodio___not___in() {
        return episodio___not___in;
    }
    public void setEpisodio___not___in(java.util.List<String> episodio___not___in) {
        this.episodio___not___in = episodio___not___in;
    }

    public String getEpisodio___lt() {
        return episodio___lt;
    }
    public void setEpisodio___lt(String episodio___lt) {
        this.episodio___lt = episodio___lt;
    }

    public String getEpisodio___lte() {
        return episodio___lte;
    }
    public void setEpisodio___lte(String episodio___lte) {
        this.episodio___lte = episodio___lte;
    }

    public String getEpisodio___gt() {
        return episodio___gt;
    }
    public void setEpisodio___gt(String episodio___gt) {
        this.episodio___gt = episodio___gt;
    }

    public String getEpisodio___gte() {
        return episodio___gte;
    }
    public void setEpisodio___gte(String episodio___gte) {
        this.episodio___gte = episodio___gte;
    }

    public String getEpisodio___contains() {
        return episodio___contains;
    }
    public void setEpisodio___contains(String episodio___contains) {
        this.episodio___contains = episodio___contains;
    }

    public String getEpisodio___not___contains() {
        return episodio___not___contains;
    }
    public void setEpisodio___not___contains(String episodio___not___contains) {
        this.episodio___not___contains = episodio___not___contains;
    }

    public String getEpisodio___starts_with() {
        return episodio___starts_with;
    }
    public void setEpisodio___starts_with(String episodio___starts_with) {
        this.episodio___starts_with = episodio___starts_with;
    }

    public String getEpisodio___not___starts_with() {
        return episodio___not___starts_with;
    }
    public void setEpisodio___not___starts_with(String episodio___not___starts_with) {
        this.episodio___not___starts_with = episodio___not___starts_with;
    }

    public String getEpisodio___ends_with() {
        return episodio___ends_with;
    }
    public void setEpisodio___ends_with(String episodio___ends_with) {
        this.episodio___ends_with = episodio___ends_with;
    }

    public String getEpisodio___not___ends_with() {
        return episodio___not___ends_with;
    }
    public void setEpisodio___not___ends_with(String episodio___not___ends_with) {
        this.episodio___not___ends_with = episodio___not___ends_with;
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

    public String getMetodo_diagnosi_tumore___eq() {
        return metodo_diagnosi_tumore___eq;
    }
    public void setMetodo_diagnosi_tumore___eq(String metodo_diagnosi_tumore___eq) {
        this.metodo_diagnosi_tumore___eq = metodo_diagnosi_tumore___eq;
    }

    public String getMetodo_diagnosi_tumore___ne() {
        return metodo_diagnosi_tumore___ne;
    }
    public void setMetodo_diagnosi_tumore___ne(String metodo_diagnosi_tumore___ne) {
        this.metodo_diagnosi_tumore___ne = metodo_diagnosi_tumore___ne;
    }

    public Boolean getMetodo_diagnosi_tumore___null() {
        return metodo_diagnosi_tumore___null;
    }
    public void setMetodo_diagnosi_tumore___null(Boolean metodo_diagnosi_tumore___null) {
        this.metodo_diagnosi_tumore___null = metodo_diagnosi_tumore___null;
    }

    public Boolean getMetodo_diagnosi_tumore___not___null() {
        return metodo_diagnosi_tumore___not___null;
    }
    public void setMetodo_diagnosi_tumore___not___null(Boolean metodo_diagnosi_tumore___not___null) {
        this.metodo_diagnosi_tumore___not___null = metodo_diagnosi_tumore___not___null;
    }

    public java.util.List<String> getMetodo_diagnosi_tumore___in() {
        return metodo_diagnosi_tumore___in;
    }
    public void setMetodo_diagnosi_tumore___in(java.util.List<String> metodo_diagnosi_tumore___in) {
        this.metodo_diagnosi_tumore___in = metodo_diagnosi_tumore___in;
    }

    public java.util.List<String> getMetodo_diagnosi_tumore___not___in() {
        return metodo_diagnosi_tumore___not___in;
    }
    public void setMetodo_diagnosi_tumore___not___in(java.util.List<String> metodo_diagnosi_tumore___not___in) {
        this.metodo_diagnosi_tumore___not___in = metodo_diagnosi_tumore___not___in;
    }

    public String getMetodo_diagnosi_tumore___lt() {
        return metodo_diagnosi_tumore___lt;
    }
    public void setMetodo_diagnosi_tumore___lt(String metodo_diagnosi_tumore___lt) {
        this.metodo_diagnosi_tumore___lt = metodo_diagnosi_tumore___lt;
    }

    public String getMetodo_diagnosi_tumore___lte() {
        return metodo_diagnosi_tumore___lte;
    }
    public void setMetodo_diagnosi_tumore___lte(String metodo_diagnosi_tumore___lte) {
        this.metodo_diagnosi_tumore___lte = metodo_diagnosi_tumore___lte;
    }

    public String getMetodo_diagnosi_tumore___gt() {
        return metodo_diagnosi_tumore___gt;
    }
    public void setMetodo_diagnosi_tumore___gt(String metodo_diagnosi_tumore___gt) {
        this.metodo_diagnosi_tumore___gt = metodo_diagnosi_tumore___gt;
    }

    public String getMetodo_diagnosi_tumore___gte() {
        return metodo_diagnosi_tumore___gte;
    }
    public void setMetodo_diagnosi_tumore___gte(String metodo_diagnosi_tumore___gte) {
        this.metodo_diagnosi_tumore___gte = metodo_diagnosi_tumore___gte;
    }

    public String getMetodo_diagnosi_tumore___contains() {
        return metodo_diagnosi_tumore___contains;
    }
    public void setMetodo_diagnosi_tumore___contains(String metodo_diagnosi_tumore___contains) {
        this.metodo_diagnosi_tumore___contains = metodo_diagnosi_tumore___contains;
    }

    public String getMetodo_diagnosi_tumore___not___contains() {
        return metodo_diagnosi_tumore___not___contains;
    }
    public void setMetodo_diagnosi_tumore___not___contains(String metodo_diagnosi_tumore___not___contains) {
        this.metodo_diagnosi_tumore___not___contains = metodo_diagnosi_tumore___not___contains;
    }

    public String getMetodo_diagnosi_tumore___starts_with() {
        return metodo_diagnosi_tumore___starts_with;
    }
    public void setMetodo_diagnosi_tumore___starts_with(String metodo_diagnosi_tumore___starts_with) {
        this.metodo_diagnosi_tumore___starts_with = metodo_diagnosi_tumore___starts_with;
    }

    public String getMetodo_diagnosi_tumore___not___starts_with() {
        return metodo_diagnosi_tumore___not___starts_with;
    }
    public void setMetodo_diagnosi_tumore___not___starts_with(String metodo_diagnosi_tumore___not___starts_with) {
        this.metodo_diagnosi_tumore___not___starts_with = metodo_diagnosi_tumore___not___starts_with;
    }

    public String getMetodo_diagnosi_tumore___ends_with() {
        return metodo_diagnosi_tumore___ends_with;
    }
    public void setMetodo_diagnosi_tumore___ends_with(String metodo_diagnosi_tumore___ends_with) {
        this.metodo_diagnosi_tumore___ends_with = metodo_diagnosi_tumore___ends_with;
    }

    public String getMetodo_diagnosi_tumore___not___ends_with() {
        return metodo_diagnosi_tumore___not___ends_with;
    }
    public void setMetodo_diagnosi_tumore___not___ends_with(String metodo_diagnosi_tumore___not___ends_with) {
        this.metodo_diagnosi_tumore___not___ends_with = metodo_diagnosi_tumore___not___ends_with;
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

    public String getNome_patologia___eq() {
        return nome_patologia___eq;
    }
    public void setNome_patologia___eq(String nome_patologia___eq) {
        this.nome_patologia___eq = nome_patologia___eq;
    }

    public String getNome_patologia___ne() {
        return nome_patologia___ne;
    }
    public void setNome_patologia___ne(String nome_patologia___ne) {
        this.nome_patologia___ne = nome_patologia___ne;
    }

    public Boolean getNome_patologia___null() {
        return nome_patologia___null;
    }
    public void setNome_patologia___null(Boolean nome_patologia___null) {
        this.nome_patologia___null = nome_patologia___null;
    }

    public Boolean getNome_patologia___not___null() {
        return nome_patologia___not___null;
    }
    public void setNome_patologia___not___null(Boolean nome_patologia___not___null) {
        this.nome_patologia___not___null = nome_patologia___not___null;
    }

    public java.util.List<String> getNome_patologia___in() {
        return nome_patologia___in;
    }
    public void setNome_patologia___in(java.util.List<String> nome_patologia___in) {
        this.nome_patologia___in = nome_patologia___in;
    }

    public java.util.List<String> getNome_patologia___not___in() {
        return nome_patologia___not___in;
    }
    public void setNome_patologia___not___in(java.util.List<String> nome_patologia___not___in) {
        this.nome_patologia___not___in = nome_patologia___not___in;
    }

    public String getNome_patologia___lt() {
        return nome_patologia___lt;
    }
    public void setNome_patologia___lt(String nome_patologia___lt) {
        this.nome_patologia___lt = nome_patologia___lt;
    }

    public String getNome_patologia___lte() {
        return nome_patologia___lte;
    }
    public void setNome_patologia___lte(String nome_patologia___lte) {
        this.nome_patologia___lte = nome_patologia___lte;
    }

    public String getNome_patologia___gt() {
        return nome_patologia___gt;
    }
    public void setNome_patologia___gt(String nome_patologia___gt) {
        this.nome_patologia___gt = nome_patologia___gt;
    }

    public String getNome_patologia___gte() {
        return nome_patologia___gte;
    }
    public void setNome_patologia___gte(String nome_patologia___gte) {
        this.nome_patologia___gte = nome_patologia___gte;
    }

    public String getNome_patologia___contains() {
        return nome_patologia___contains;
    }
    public void setNome_patologia___contains(String nome_patologia___contains) {
        this.nome_patologia___contains = nome_patologia___contains;
    }

    public String getNome_patologia___not___contains() {
        return nome_patologia___not___contains;
    }
    public void setNome_patologia___not___contains(String nome_patologia___not___contains) {
        this.nome_patologia___not___contains = nome_patologia___not___contains;
    }

    public String getNome_patologia___starts_with() {
        return nome_patologia___starts_with;
    }
    public void setNome_patologia___starts_with(String nome_patologia___starts_with) {
        this.nome_patologia___starts_with = nome_patologia___starts_with;
    }

    public String getNome_patologia___not___starts_with() {
        return nome_patologia___not___starts_with;
    }
    public void setNome_patologia___not___starts_with(String nome_patologia___not___starts_with) {
        this.nome_patologia___not___starts_with = nome_patologia___not___starts_with;
    }

    public String getNome_patologia___ends_with() {
        return nome_patologia___ends_with;
    }
    public void setNome_patologia___ends_with(String nome_patologia___ends_with) {
        this.nome_patologia___ends_with = nome_patologia___ends_with;
    }

    public String getNome_patologia___not___ends_with() {
        return nome_patologia___not___ends_with;
    }
    public void setNome_patologia___not___ends_with(String nome_patologia___not___ends_with) {
        this.nome_patologia___not___ends_with = nome_patologia___not___ends_with;
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

    public Integer getPaziente_o___eq() {
        return paziente_o___eq;
    }
    public void setPaziente_o___eq(Integer paziente_o___eq) {
        this.paziente_o___eq = paziente_o___eq;
    }

    public Integer getPaziente_o___ne() {
        return paziente_o___ne;
    }
    public void setPaziente_o___ne(Integer paziente_o___ne) {
        this.paziente_o___ne = paziente_o___ne;
    }

    public Boolean getPaziente_o___null() {
        return paziente_o___null;
    }
    public void setPaziente_o___null(Boolean paziente_o___null) {
        this.paziente_o___null = paziente_o___null;
    }

    public Boolean getPaziente_o___not___null() {
        return paziente_o___not___null;
    }
    public void setPaziente_o___not___null(Boolean paziente_o___not___null) {
        this.paziente_o___not___null = paziente_o___not___null;
    }

    public java.util.List<Integer> getPaziente_o___in() {
        return paziente_o___in;
    }
    public void setPaziente_o___in(java.util.List<Integer> paziente_o___in) {
        this.paziente_o___in = paziente_o___in;
    }

    public java.util.List<Integer> getPaziente_o___not___in() {
        return paziente_o___not___in;
    }
    public void setPaziente_o___not___in(java.util.List<Integer> paziente_o___not___in) {
        this.paziente_o___not___in = paziente_o___not___in;
    }

    public Integer getPaziente_o___lt() {
        return paziente_o___lt;
    }
    public void setPaziente_o___lt(Integer paziente_o___lt) {
        this.paziente_o___lt = paziente_o___lt;
    }

    public Integer getPaziente_o___lte() {
        return paziente_o___lte;
    }
    public void setPaziente_o___lte(Integer paziente_o___lte) {
        this.paziente_o___lte = paziente_o___lte;
    }

    public Integer getPaziente_o___gt() {
        return paziente_o___gt;
    }
    public void setPaziente_o___gt(Integer paziente_o___gt) {
        this.paziente_o___gt = paziente_o___gt;
    }

    public Integer getPaziente_o___gte() {
        return paziente_o___gte;
    }
    public void setPaziente_o___gte(Integer paziente_o___gte) {
        this.paziente_o___gte = paziente_o___gte;
    }

    public String getPerformance_status___eq() {
        return performance_status___eq;
    }
    public void setPerformance_status___eq(String performance_status___eq) {
        this.performance_status___eq = performance_status___eq;
    }

    public String getPerformance_status___ne() {
        return performance_status___ne;
    }
    public void setPerformance_status___ne(String performance_status___ne) {
        this.performance_status___ne = performance_status___ne;
    }

    public Boolean getPerformance_status___null() {
        return performance_status___null;
    }
    public void setPerformance_status___null(Boolean performance_status___null) {
        this.performance_status___null = performance_status___null;
    }

    public Boolean getPerformance_status___not___null() {
        return performance_status___not___null;
    }
    public void setPerformance_status___not___null(Boolean performance_status___not___null) {
        this.performance_status___not___null = performance_status___not___null;
    }

    public java.util.List<String> getPerformance_status___in() {
        return performance_status___in;
    }
    public void setPerformance_status___in(java.util.List<String> performance_status___in) {
        this.performance_status___in = performance_status___in;
    }

    public java.util.List<String> getPerformance_status___not___in() {
        return performance_status___not___in;
    }
    public void setPerformance_status___not___in(java.util.List<String> performance_status___not___in) {
        this.performance_status___not___in = performance_status___not___in;
    }

    public String getPerformance_status___lt() {
        return performance_status___lt;
    }
    public void setPerformance_status___lt(String performance_status___lt) {
        this.performance_status___lt = performance_status___lt;
    }

    public String getPerformance_status___lte() {
        return performance_status___lte;
    }
    public void setPerformance_status___lte(String performance_status___lte) {
        this.performance_status___lte = performance_status___lte;
    }

    public String getPerformance_status___gt() {
        return performance_status___gt;
    }
    public void setPerformance_status___gt(String performance_status___gt) {
        this.performance_status___gt = performance_status___gt;
    }

    public String getPerformance_status___gte() {
        return performance_status___gte;
    }
    public void setPerformance_status___gte(String performance_status___gte) {
        this.performance_status___gte = performance_status___gte;
    }

    public String getPerformance_status___contains() {
        return performance_status___contains;
    }
    public void setPerformance_status___contains(String performance_status___contains) {
        this.performance_status___contains = performance_status___contains;
    }

    public String getPerformance_status___not___contains() {
        return performance_status___not___contains;
    }
    public void setPerformance_status___not___contains(String performance_status___not___contains) {
        this.performance_status___not___contains = performance_status___not___contains;
    }

    public String getPerformance_status___starts_with() {
        return performance_status___starts_with;
    }
    public void setPerformance_status___starts_with(String performance_status___starts_with) {
        this.performance_status___starts_with = performance_status___starts_with;
    }

    public String getPerformance_status___not___starts_with() {
        return performance_status___not___starts_with;
    }
    public void setPerformance_status___not___starts_with(String performance_status___not___starts_with) {
        this.performance_status___not___starts_with = performance_status___not___starts_with;
    }

    public String getPerformance_status___ends_with() {
        return performance_status___ends_with;
    }
    public void setPerformance_status___ends_with(String performance_status___ends_with) {
        this.performance_status___ends_with = performance_status___ends_with;
    }

    public String getPerformance_status___not___ends_with() {
        return performance_status___not___ends_with;
    }
    public void setPerformance_status___not___ends_with(String performance_status___not___ends_with) {
        this.performance_status___not___ends_with = performance_status___not___ends_with;
    }

    public String getSiti_coinvolti_M___eq() {
        return siti_coinvolti_M___eq;
    }
    public void setSiti_coinvolti_M___eq(String siti_coinvolti_M___eq) {
        this.siti_coinvolti_M___eq = siti_coinvolti_M___eq;
    }

    public String getSiti_coinvolti_M___ne() {
        return siti_coinvolti_M___ne;
    }
    public void setSiti_coinvolti_M___ne(String siti_coinvolti_M___ne) {
        this.siti_coinvolti_M___ne = siti_coinvolti_M___ne;
    }

    public Boolean getSiti_coinvolti_M___null() {
        return siti_coinvolti_M___null;
    }
    public void setSiti_coinvolti_M___null(Boolean siti_coinvolti_M___null) {
        this.siti_coinvolti_M___null = siti_coinvolti_M___null;
    }

    public Boolean getSiti_coinvolti_M___not___null() {
        return siti_coinvolti_M___not___null;
    }
    public void setSiti_coinvolti_M___not___null(Boolean siti_coinvolti_M___not___null) {
        this.siti_coinvolti_M___not___null = siti_coinvolti_M___not___null;
    }

    public java.util.List<String> getSiti_coinvolti_M___in() {
        return siti_coinvolti_M___in;
    }
    public void setSiti_coinvolti_M___in(java.util.List<String> siti_coinvolti_M___in) {
        this.siti_coinvolti_M___in = siti_coinvolti_M___in;
    }

    public java.util.List<String> getSiti_coinvolti_M___not___in() {
        return siti_coinvolti_M___not___in;
    }
    public void setSiti_coinvolti_M___not___in(java.util.List<String> siti_coinvolti_M___not___in) {
        this.siti_coinvolti_M___not___in = siti_coinvolti_M___not___in;
    }

    public String getSiti_coinvolti_M___lt() {
        return siti_coinvolti_M___lt;
    }
    public void setSiti_coinvolti_M___lt(String siti_coinvolti_M___lt) {
        this.siti_coinvolti_M___lt = siti_coinvolti_M___lt;
    }

    public String getSiti_coinvolti_M___lte() {
        return siti_coinvolti_M___lte;
    }
    public void setSiti_coinvolti_M___lte(String siti_coinvolti_M___lte) {
        this.siti_coinvolti_M___lte = siti_coinvolti_M___lte;
    }

    public String getSiti_coinvolti_M___gt() {
        return siti_coinvolti_M___gt;
    }
    public void setSiti_coinvolti_M___gt(String siti_coinvolti_M___gt) {
        this.siti_coinvolti_M___gt = siti_coinvolti_M___gt;
    }

    public String getSiti_coinvolti_M___gte() {
        return siti_coinvolti_M___gte;
    }
    public void setSiti_coinvolti_M___gte(String siti_coinvolti_M___gte) {
        this.siti_coinvolti_M___gte = siti_coinvolti_M___gte;
    }

    public String getSiti_coinvolti_M___contains() {
        return siti_coinvolti_M___contains;
    }
    public void setSiti_coinvolti_M___contains(String siti_coinvolti_M___contains) {
        this.siti_coinvolti_M___contains = siti_coinvolti_M___contains;
    }

    public String getSiti_coinvolti_M___not___contains() {
        return siti_coinvolti_M___not___contains;
    }
    public void setSiti_coinvolti_M___not___contains(String siti_coinvolti_M___not___contains) {
        this.siti_coinvolti_M___not___contains = siti_coinvolti_M___not___contains;
    }

    public String getSiti_coinvolti_M___starts_with() {
        return siti_coinvolti_M___starts_with;
    }
    public void setSiti_coinvolti_M___starts_with(String siti_coinvolti_M___starts_with) {
        this.siti_coinvolti_M___starts_with = siti_coinvolti_M___starts_with;
    }

    public String getSiti_coinvolti_M___not___starts_with() {
        return siti_coinvolti_M___not___starts_with;
    }
    public void setSiti_coinvolti_M___not___starts_with(String siti_coinvolti_M___not___starts_with) {
        this.siti_coinvolti_M___not___starts_with = siti_coinvolti_M___not___starts_with;
    }

    public String getSiti_coinvolti_M___ends_with() {
        return siti_coinvolti_M___ends_with;
    }
    public void setSiti_coinvolti_M___ends_with(String siti_coinvolti_M___ends_with) {
        this.siti_coinvolti_M___ends_with = siti_coinvolti_M___ends_with;
    }

    public String getSiti_coinvolti_M___not___ends_with() {
        return siti_coinvolti_M___not___ends_with;
    }
    public void setSiti_coinvolti_M___not___ends_with(String siti_coinvolti_M___not___ends_with) {
        this.siti_coinvolti_M___not___ends_with = siti_coinvolti_M___not___ends_with;
    }

    public String getSiti_coinvolti_N___eq() {
        return siti_coinvolti_N___eq;
    }
    public void setSiti_coinvolti_N___eq(String siti_coinvolti_N___eq) {
        this.siti_coinvolti_N___eq = siti_coinvolti_N___eq;
    }

    public String getSiti_coinvolti_N___ne() {
        return siti_coinvolti_N___ne;
    }
    public void setSiti_coinvolti_N___ne(String siti_coinvolti_N___ne) {
        this.siti_coinvolti_N___ne = siti_coinvolti_N___ne;
    }

    public Boolean getSiti_coinvolti_N___null() {
        return siti_coinvolti_N___null;
    }
    public void setSiti_coinvolti_N___null(Boolean siti_coinvolti_N___null) {
        this.siti_coinvolti_N___null = siti_coinvolti_N___null;
    }

    public Boolean getSiti_coinvolti_N___not___null() {
        return siti_coinvolti_N___not___null;
    }
    public void setSiti_coinvolti_N___not___null(Boolean siti_coinvolti_N___not___null) {
        this.siti_coinvolti_N___not___null = siti_coinvolti_N___not___null;
    }

    public java.util.List<String> getSiti_coinvolti_N___in() {
        return siti_coinvolti_N___in;
    }
    public void setSiti_coinvolti_N___in(java.util.List<String> siti_coinvolti_N___in) {
        this.siti_coinvolti_N___in = siti_coinvolti_N___in;
    }

    public java.util.List<String> getSiti_coinvolti_N___not___in() {
        return siti_coinvolti_N___not___in;
    }
    public void setSiti_coinvolti_N___not___in(java.util.List<String> siti_coinvolti_N___not___in) {
        this.siti_coinvolti_N___not___in = siti_coinvolti_N___not___in;
    }

    public String getSiti_coinvolti_N___lt() {
        return siti_coinvolti_N___lt;
    }
    public void setSiti_coinvolti_N___lt(String siti_coinvolti_N___lt) {
        this.siti_coinvolti_N___lt = siti_coinvolti_N___lt;
    }

    public String getSiti_coinvolti_N___lte() {
        return siti_coinvolti_N___lte;
    }
    public void setSiti_coinvolti_N___lte(String siti_coinvolti_N___lte) {
        this.siti_coinvolti_N___lte = siti_coinvolti_N___lte;
    }

    public String getSiti_coinvolti_N___gt() {
        return siti_coinvolti_N___gt;
    }
    public void setSiti_coinvolti_N___gt(String siti_coinvolti_N___gt) {
        this.siti_coinvolti_N___gt = siti_coinvolti_N___gt;
    }

    public String getSiti_coinvolti_N___gte() {
        return siti_coinvolti_N___gte;
    }
    public void setSiti_coinvolti_N___gte(String siti_coinvolti_N___gte) {
        this.siti_coinvolti_N___gte = siti_coinvolti_N___gte;
    }

    public String getSiti_coinvolti_N___contains() {
        return siti_coinvolti_N___contains;
    }
    public void setSiti_coinvolti_N___contains(String siti_coinvolti_N___contains) {
        this.siti_coinvolti_N___contains = siti_coinvolti_N___contains;
    }

    public String getSiti_coinvolti_N___not___contains() {
        return siti_coinvolti_N___not___contains;
    }
    public void setSiti_coinvolti_N___not___contains(String siti_coinvolti_N___not___contains) {
        this.siti_coinvolti_N___not___contains = siti_coinvolti_N___not___contains;
    }

    public String getSiti_coinvolti_N___starts_with() {
        return siti_coinvolti_N___starts_with;
    }
    public void setSiti_coinvolti_N___starts_with(String siti_coinvolti_N___starts_with) {
        this.siti_coinvolti_N___starts_with = siti_coinvolti_N___starts_with;
    }

    public String getSiti_coinvolti_N___not___starts_with() {
        return siti_coinvolti_N___not___starts_with;
    }
    public void setSiti_coinvolti_N___not___starts_with(String siti_coinvolti_N___not___starts_with) {
        this.siti_coinvolti_N___not___starts_with = siti_coinvolti_N___not___starts_with;
    }

    public String getSiti_coinvolti_N___ends_with() {
        return siti_coinvolti_N___ends_with;
    }
    public void setSiti_coinvolti_N___ends_with(String siti_coinvolti_N___ends_with) {
        this.siti_coinvolti_N___ends_with = siti_coinvolti_N___ends_with;
    }

    public String getSiti_coinvolti_N___not___ends_with() {
        return siti_coinvolti_N___not___ends_with;
    }
    public void setSiti_coinvolti_N___not___ends_with(String siti_coinvolti_N___not___ends_with) {
        this.siti_coinvolti_N___not___ends_with = siti_coinvolti_N___not___ends_with;
    }

    public String getSiti_coinvolti_T___eq() {
        return siti_coinvolti_T___eq;
    }
    public void setSiti_coinvolti_T___eq(String siti_coinvolti_T___eq) {
        this.siti_coinvolti_T___eq = siti_coinvolti_T___eq;
    }

    public String getSiti_coinvolti_T___ne() {
        return siti_coinvolti_T___ne;
    }
    public void setSiti_coinvolti_T___ne(String siti_coinvolti_T___ne) {
        this.siti_coinvolti_T___ne = siti_coinvolti_T___ne;
    }

    public Boolean getSiti_coinvolti_T___null() {
        return siti_coinvolti_T___null;
    }
    public void setSiti_coinvolti_T___null(Boolean siti_coinvolti_T___null) {
        this.siti_coinvolti_T___null = siti_coinvolti_T___null;
    }

    public Boolean getSiti_coinvolti_T___not___null() {
        return siti_coinvolti_T___not___null;
    }
    public void setSiti_coinvolti_T___not___null(Boolean siti_coinvolti_T___not___null) {
        this.siti_coinvolti_T___not___null = siti_coinvolti_T___not___null;
    }

    public java.util.List<String> getSiti_coinvolti_T___in() {
        return siti_coinvolti_T___in;
    }
    public void setSiti_coinvolti_T___in(java.util.List<String> siti_coinvolti_T___in) {
        this.siti_coinvolti_T___in = siti_coinvolti_T___in;
    }

    public java.util.List<String> getSiti_coinvolti_T___not___in() {
        return siti_coinvolti_T___not___in;
    }
    public void setSiti_coinvolti_T___not___in(java.util.List<String> siti_coinvolti_T___not___in) {
        this.siti_coinvolti_T___not___in = siti_coinvolti_T___not___in;
    }

    public String getSiti_coinvolti_T___lt() {
        return siti_coinvolti_T___lt;
    }
    public void setSiti_coinvolti_T___lt(String siti_coinvolti_T___lt) {
        this.siti_coinvolti_T___lt = siti_coinvolti_T___lt;
    }

    public String getSiti_coinvolti_T___lte() {
        return siti_coinvolti_T___lte;
    }
    public void setSiti_coinvolti_T___lte(String siti_coinvolti_T___lte) {
        this.siti_coinvolti_T___lte = siti_coinvolti_T___lte;
    }

    public String getSiti_coinvolti_T___gt() {
        return siti_coinvolti_T___gt;
    }
    public void setSiti_coinvolti_T___gt(String siti_coinvolti_T___gt) {
        this.siti_coinvolti_T___gt = siti_coinvolti_T___gt;
    }

    public String getSiti_coinvolti_T___gte() {
        return siti_coinvolti_T___gte;
    }
    public void setSiti_coinvolti_T___gte(String siti_coinvolti_T___gte) {
        this.siti_coinvolti_T___gte = siti_coinvolti_T___gte;
    }

    public String getSiti_coinvolti_T___contains() {
        return siti_coinvolti_T___contains;
    }
    public void setSiti_coinvolti_T___contains(String siti_coinvolti_T___contains) {
        this.siti_coinvolti_T___contains = siti_coinvolti_T___contains;
    }

    public String getSiti_coinvolti_T___not___contains() {
        return siti_coinvolti_T___not___contains;
    }
    public void setSiti_coinvolti_T___not___contains(String siti_coinvolti_T___not___contains) {
        this.siti_coinvolti_T___not___contains = siti_coinvolti_T___not___contains;
    }

    public String getSiti_coinvolti_T___starts_with() {
        return siti_coinvolti_T___starts_with;
    }
    public void setSiti_coinvolti_T___starts_with(String siti_coinvolti_T___starts_with) {
        this.siti_coinvolti_T___starts_with = siti_coinvolti_T___starts_with;
    }

    public String getSiti_coinvolti_T___not___starts_with() {
        return siti_coinvolti_T___not___starts_with;
    }
    public void setSiti_coinvolti_T___not___starts_with(String siti_coinvolti_T___not___starts_with) {
        this.siti_coinvolti_T___not___starts_with = siti_coinvolti_T___not___starts_with;
    }

    public String getSiti_coinvolti_T___ends_with() {
        return siti_coinvolti_T___ends_with;
    }
    public void setSiti_coinvolti_T___ends_with(String siti_coinvolti_T___ends_with) {
        this.siti_coinvolti_T___ends_with = siti_coinvolti_T___ends_with;
    }

    public String getSiti_coinvolti_T___not___ends_with() {
        return siti_coinvolti_T___not___ends_with;
    }
    public void setSiti_coinvolti_T___not___ends_with(String siti_coinvolti_T___not___ends_with) {
        this.siti_coinvolti_T___not___ends_with = siti_coinvolti_T___not___ends_with;
    }

    public Boolean getSpecifica_tumori___eq() {
        return specifica_tumori___eq;
    }
    public void setSpecifica_tumori___eq(Boolean specifica_tumori___eq) {
        this.specifica_tumori___eq = specifica_tumori___eq;
    }

    public Boolean getSpecifica_tumori___ne() {
        return specifica_tumori___ne;
    }
    public void setSpecifica_tumori___ne(Boolean specifica_tumori___ne) {
        this.specifica_tumori___ne = specifica_tumori___ne;
    }

    public Boolean getSpecifica_tumori___null() {
        return specifica_tumori___null;
    }
    public void setSpecifica_tumori___null(Boolean specifica_tumori___null) {
        this.specifica_tumori___null = specifica_tumori___null;
    }

    public Boolean getSpecifica_tumori___not___null() {
        return specifica_tumori___not___null;
    }
    public void setSpecifica_tumori___not___null(Boolean specifica_tumori___not___null) {
        this.specifica_tumori___not___null = specifica_tumori___not___null;
    }

    public String getStadio_tumore___eq() {
        return stadio_tumore___eq;
    }
    public void setStadio_tumore___eq(String stadio_tumore___eq) {
        this.stadio_tumore___eq = stadio_tumore___eq;
    }

    public String getStadio_tumore___ne() {
        return stadio_tumore___ne;
    }
    public void setStadio_tumore___ne(String stadio_tumore___ne) {
        this.stadio_tumore___ne = stadio_tumore___ne;
    }

    public Boolean getStadio_tumore___null() {
        return stadio_tumore___null;
    }
    public void setStadio_tumore___null(Boolean stadio_tumore___null) {
        this.stadio_tumore___null = stadio_tumore___null;
    }

    public Boolean getStadio_tumore___not___null() {
        return stadio_tumore___not___null;
    }
    public void setStadio_tumore___not___null(Boolean stadio_tumore___not___null) {
        this.stadio_tumore___not___null = stadio_tumore___not___null;
    }

    public java.util.List<String> getStadio_tumore___in() {
        return stadio_tumore___in;
    }
    public void setStadio_tumore___in(java.util.List<String> stadio_tumore___in) {
        this.stadio_tumore___in = stadio_tumore___in;
    }

    public java.util.List<String> getStadio_tumore___not___in() {
        return stadio_tumore___not___in;
    }
    public void setStadio_tumore___not___in(java.util.List<String> stadio_tumore___not___in) {
        this.stadio_tumore___not___in = stadio_tumore___not___in;
    }

    public String getStadio_tumore___lt() {
        return stadio_tumore___lt;
    }
    public void setStadio_tumore___lt(String stadio_tumore___lt) {
        this.stadio_tumore___lt = stadio_tumore___lt;
    }

    public String getStadio_tumore___lte() {
        return stadio_tumore___lte;
    }
    public void setStadio_tumore___lte(String stadio_tumore___lte) {
        this.stadio_tumore___lte = stadio_tumore___lte;
    }

    public String getStadio_tumore___gt() {
        return stadio_tumore___gt;
    }
    public void setStadio_tumore___gt(String stadio_tumore___gt) {
        this.stadio_tumore___gt = stadio_tumore___gt;
    }

    public String getStadio_tumore___gte() {
        return stadio_tumore___gte;
    }
    public void setStadio_tumore___gte(String stadio_tumore___gte) {
        this.stadio_tumore___gte = stadio_tumore___gte;
    }

    public String getStadio_tumore___contains() {
        return stadio_tumore___contains;
    }
    public void setStadio_tumore___contains(String stadio_tumore___contains) {
        this.stadio_tumore___contains = stadio_tumore___contains;
    }

    public String getStadio_tumore___not___contains() {
        return stadio_tumore___not___contains;
    }
    public void setStadio_tumore___not___contains(String stadio_tumore___not___contains) {
        this.stadio_tumore___not___contains = stadio_tumore___not___contains;
    }

    public String getStadio_tumore___starts_with() {
        return stadio_tumore___starts_with;
    }
    public void setStadio_tumore___starts_with(String stadio_tumore___starts_with) {
        this.stadio_tumore___starts_with = stadio_tumore___starts_with;
    }

    public String getStadio_tumore___not___starts_with() {
        return stadio_tumore___not___starts_with;
    }
    public void setStadio_tumore___not___starts_with(String stadio_tumore___not___starts_with) {
        this.stadio_tumore___not___starts_with = stadio_tumore___not___starts_with;
    }

    public String getStadio_tumore___ends_with() {
        return stadio_tumore___ends_with;
    }
    public void setStadio_tumore___ends_with(String stadio_tumore___ends_with) {
        this.stadio_tumore___ends_with = stadio_tumore___ends_with;
    }

    public String getStadio_tumore___not___ends_with() {
        return stadio_tumore___not___ends_with;
    }
    public void setStadio_tumore___not___ends_with(String stadio_tumore___not___ends_with) {
        this.stadio_tumore___not___ends_with = stadio_tumore___not___ends_with;
    }

    public String getStato_accertamento___eq() {
        return stato_accertamento___eq;
    }
    public void setStato_accertamento___eq(String stato_accertamento___eq) {
        this.stato_accertamento___eq = stato_accertamento___eq;
    }

    public String getStato_accertamento___ne() {
        return stato_accertamento___ne;
    }
    public void setStato_accertamento___ne(String stato_accertamento___ne) {
        this.stato_accertamento___ne = stato_accertamento___ne;
    }

    public Boolean getStato_accertamento___null() {
        return stato_accertamento___null;
    }
    public void setStato_accertamento___null(Boolean stato_accertamento___null) {
        this.stato_accertamento___null = stato_accertamento___null;
    }

    public Boolean getStato_accertamento___not___null() {
        return stato_accertamento___not___null;
    }
    public void setStato_accertamento___not___null(Boolean stato_accertamento___not___null) {
        this.stato_accertamento___not___null = stato_accertamento___not___null;
    }

    public java.util.List<String> getStato_accertamento___in() {
        return stato_accertamento___in;
    }
    public void setStato_accertamento___in(java.util.List<String> stato_accertamento___in) {
        this.stato_accertamento___in = stato_accertamento___in;
    }

    public java.util.List<String> getStato_accertamento___not___in() {
        return stato_accertamento___not___in;
    }
    public void setStato_accertamento___not___in(java.util.List<String> stato_accertamento___not___in) {
        this.stato_accertamento___not___in = stato_accertamento___not___in;
    }

    public String getStato_accertamento___lt() {
        return stato_accertamento___lt;
    }
    public void setStato_accertamento___lt(String stato_accertamento___lt) {
        this.stato_accertamento___lt = stato_accertamento___lt;
    }

    public String getStato_accertamento___lte() {
        return stato_accertamento___lte;
    }
    public void setStato_accertamento___lte(String stato_accertamento___lte) {
        this.stato_accertamento___lte = stato_accertamento___lte;
    }

    public String getStato_accertamento___gt() {
        return stato_accertamento___gt;
    }
    public void setStato_accertamento___gt(String stato_accertamento___gt) {
        this.stato_accertamento___gt = stato_accertamento___gt;
    }

    public String getStato_accertamento___gte() {
        return stato_accertamento___gte;
    }
    public void setStato_accertamento___gte(String stato_accertamento___gte) {
        this.stato_accertamento___gte = stato_accertamento___gte;
    }

    public String getStato_accertamento___contains() {
        return stato_accertamento___contains;
    }
    public void setStato_accertamento___contains(String stato_accertamento___contains) {
        this.stato_accertamento___contains = stato_accertamento___contains;
    }

    public String getStato_accertamento___not___contains() {
        return stato_accertamento___not___contains;
    }
    public void setStato_accertamento___not___contains(String stato_accertamento___not___contains) {
        this.stato_accertamento___not___contains = stato_accertamento___not___contains;
    }

    public String getStato_accertamento___starts_with() {
        return stato_accertamento___starts_with;
    }
    public void setStato_accertamento___starts_with(String stato_accertamento___starts_with) {
        this.stato_accertamento___starts_with = stato_accertamento___starts_with;
    }

    public String getStato_accertamento___not___starts_with() {
        return stato_accertamento___not___starts_with;
    }
    public void setStato_accertamento___not___starts_with(String stato_accertamento___not___starts_with) {
        this.stato_accertamento___not___starts_with = stato_accertamento___not___starts_with;
    }

    public String getStato_accertamento___ends_with() {
        return stato_accertamento___ends_with;
    }
    public void setStato_accertamento___ends_with(String stato_accertamento___ends_with) {
        this.stato_accertamento___ends_with = stato_accertamento___ends_with;
    }

    public String getStato_accertamento___not___ends_with() {
        return stato_accertamento___not___ends_with;
    }
    public void setStato_accertamento___not___ends_with(String stato_accertamento___not___ends_with) {
        this.stato_accertamento___not___ends_with = stato_accertamento___not___ends_with;
    }

    public String getTipo_imaging___eq() {
        return tipo_imaging___eq;
    }
    public void setTipo_imaging___eq(String tipo_imaging___eq) {
        this.tipo_imaging___eq = tipo_imaging___eq;
    }

    public String getTipo_imaging___ne() {
        return tipo_imaging___ne;
    }
    public void setTipo_imaging___ne(String tipo_imaging___ne) {
        this.tipo_imaging___ne = tipo_imaging___ne;
    }

    public Boolean getTipo_imaging___null() {
        return tipo_imaging___null;
    }
    public void setTipo_imaging___null(Boolean tipo_imaging___null) {
        this.tipo_imaging___null = tipo_imaging___null;
    }

    public Boolean getTipo_imaging___not___null() {
        return tipo_imaging___not___null;
    }
    public void setTipo_imaging___not___null(Boolean tipo_imaging___not___null) {
        this.tipo_imaging___not___null = tipo_imaging___not___null;
    }

    public java.util.List<String> getTipo_imaging___in() {
        return tipo_imaging___in;
    }
    public void setTipo_imaging___in(java.util.List<String> tipo_imaging___in) {
        this.tipo_imaging___in = tipo_imaging___in;
    }

    public java.util.List<String> getTipo_imaging___not___in() {
        return tipo_imaging___not___in;
    }
    public void setTipo_imaging___not___in(java.util.List<String> tipo_imaging___not___in) {
        this.tipo_imaging___not___in = tipo_imaging___not___in;
    }

    public String getTipo_imaging___lt() {
        return tipo_imaging___lt;
    }
    public void setTipo_imaging___lt(String tipo_imaging___lt) {
        this.tipo_imaging___lt = tipo_imaging___lt;
    }

    public String getTipo_imaging___lte() {
        return tipo_imaging___lte;
    }
    public void setTipo_imaging___lte(String tipo_imaging___lte) {
        this.tipo_imaging___lte = tipo_imaging___lte;
    }

    public String getTipo_imaging___gt() {
        return tipo_imaging___gt;
    }
    public void setTipo_imaging___gt(String tipo_imaging___gt) {
        this.tipo_imaging___gt = tipo_imaging___gt;
    }

    public String getTipo_imaging___gte() {
        return tipo_imaging___gte;
    }
    public void setTipo_imaging___gte(String tipo_imaging___gte) {
        this.tipo_imaging___gte = tipo_imaging___gte;
    }

    public String getTipo_imaging___contains() {
        return tipo_imaging___contains;
    }
    public void setTipo_imaging___contains(String tipo_imaging___contains) {
        this.tipo_imaging___contains = tipo_imaging___contains;
    }

    public String getTipo_imaging___not___contains() {
        return tipo_imaging___not___contains;
    }
    public void setTipo_imaging___not___contains(String tipo_imaging___not___contains) {
        this.tipo_imaging___not___contains = tipo_imaging___not___contains;
    }

    public String getTipo_imaging___starts_with() {
        return tipo_imaging___starts_with;
    }
    public void setTipo_imaging___starts_with(String tipo_imaging___starts_with) {
        this.tipo_imaging___starts_with = tipo_imaging___starts_with;
    }

    public String getTipo_imaging___not___starts_with() {
        return tipo_imaging___not___starts_with;
    }
    public void setTipo_imaging___not___starts_with(String tipo_imaging___not___starts_with) {
        this.tipo_imaging___not___starts_with = tipo_imaging___not___starts_with;
    }

    public String getTipo_imaging___ends_with() {
        return tipo_imaging___ends_with;
    }
    public void setTipo_imaging___ends_with(String tipo_imaging___ends_with) {
        this.tipo_imaging___ends_with = tipo_imaging___ends_with;
    }

    public String getTipo_imaging___not___ends_with() {
        return tipo_imaging___not___ends_with;
    }
    public void setTipo_imaging___not___ends_with(String tipo_imaging___not___ends_with) {
        this.tipo_imaging___not___ends_with = tipo_imaging___not___ends_with;
    }

    public Boolean getWarning_respond___eq() {
        return warning_respond___eq;
    }
    public void setWarning_respond___eq(Boolean warning_respond___eq) {
        this.warning_respond___eq = warning_respond___eq;
    }

    public Boolean getWarning_respond___ne() {
        return warning_respond___ne;
    }
    public void setWarning_respond___ne(Boolean warning_respond___ne) {
        this.warning_respond___ne = warning_respond___ne;
    }

    public Boolean getWarning_respond___null() {
        return warning_respond___null;
    }
    public void setWarning_respond___null(Boolean warning_respond___null) {
        this.warning_respond___null = warning_respond___null;
    }

    public Boolean getWarning_respond___not___null() {
        return warning_respond___not___null;
    }
    public void setWarning_respond___not___null(Boolean warning_respond___not___null) {
        this.warning_respond___not___null = warning_respond___not___null;
    }

    public java.util.List<CliEventoFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliEventoFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliEventoFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliEventoFilterDTO> OR) {
        this.OR = OR;
    }

    public CliEventoFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliEventoFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (IPI___eq != null) {
            joiner.add("IPI___eq: " + GraphQLRequestSerializer.getEntry(IPI___eq));
        }
        if (IPI___ne != null) {
            joiner.add("IPI___ne: " + GraphQLRequestSerializer.getEntry(IPI___ne));
        }
        if (IPI___null != null) {
            joiner.add("IPI___null: " + GraphQLRequestSerializer.getEntry(IPI___null));
        }
        if (IPI___not___null != null) {
            joiner.add("IPI___not___null: " + GraphQLRequestSerializer.getEntry(IPI___not___null));
        }
        if (IPI___in != null) {
            joiner.add("IPI___in: " + GraphQLRequestSerializer.getEntry(IPI___in));
        }
        if (IPI___not___in != null) {
            joiner.add("IPI___not___in: " + GraphQLRequestSerializer.getEntry(IPI___not___in));
        }
        if (IPI___lt != null) {
            joiner.add("IPI___lt: " + GraphQLRequestSerializer.getEntry(IPI___lt));
        }
        if (IPI___lte != null) {
            joiner.add("IPI___lte: " + GraphQLRequestSerializer.getEntry(IPI___lte));
        }
        if (IPI___gt != null) {
            joiner.add("IPI___gt: " + GraphQLRequestSerializer.getEntry(IPI___gt));
        }
        if (IPI___gte != null) {
            joiner.add("IPI___gte: " + GraphQLRequestSerializer.getEntry(IPI___gte));
        }
        if (IPI___contains != null) {
            joiner.add("IPI___contains: " + GraphQLRequestSerializer.getEntry(IPI___contains));
        }
        if (IPI___not___contains != null) {
            joiner.add("IPI___not___contains: " + GraphQLRequestSerializer.getEntry(IPI___not___contains));
        }
        if (IPI___starts_with != null) {
            joiner.add("IPI___starts_with: " + GraphQLRequestSerializer.getEntry(IPI___starts_with));
        }
        if (IPI___not___starts_with != null) {
            joiner.add("IPI___not___starts_with: " + GraphQLRequestSerializer.getEntry(IPI___not___starts_with));
        }
        if (IPI___ends_with != null) {
            joiner.add("IPI___ends_with: " + GraphQLRequestSerializer.getEntry(IPI___ends_with));
        }
        if (IPI___not___ends_with != null) {
            joiner.add("IPI___not___ends_with: " + GraphQLRequestSerializer.getEntry(IPI___not___ends_with));
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
        if (aaIPI___eq != null) {
            joiner.add("aaIPI___eq: " + GraphQLRequestSerializer.getEntry(aaIPI___eq));
        }
        if (aaIPI___ne != null) {
            joiner.add("aaIPI___ne: " + GraphQLRequestSerializer.getEntry(aaIPI___ne));
        }
        if (aaIPI___null != null) {
            joiner.add("aaIPI___null: " + GraphQLRequestSerializer.getEntry(aaIPI___null));
        }
        if (aaIPI___not___null != null) {
            joiner.add("aaIPI___not___null: " + GraphQLRequestSerializer.getEntry(aaIPI___not___null));
        }
        if (aaIPI___in != null) {
            joiner.add("aaIPI___in: " + GraphQLRequestSerializer.getEntry(aaIPI___in));
        }
        if (aaIPI___not___in != null) {
            joiner.add("aaIPI___not___in: " + GraphQLRequestSerializer.getEntry(aaIPI___not___in));
        }
        if (aaIPI___lt != null) {
            joiner.add("aaIPI___lt: " + GraphQLRequestSerializer.getEntry(aaIPI___lt));
        }
        if (aaIPI___lte != null) {
            joiner.add("aaIPI___lte: " + GraphQLRequestSerializer.getEntry(aaIPI___lte));
        }
        if (aaIPI___gt != null) {
            joiner.add("aaIPI___gt: " + GraphQLRequestSerializer.getEntry(aaIPI___gt));
        }
        if (aaIPI___gte != null) {
            joiner.add("aaIPI___gte: " + GraphQLRequestSerializer.getEntry(aaIPI___gte));
        }
        if (aaIPI___contains != null) {
            joiner.add("aaIPI___contains: " + GraphQLRequestSerializer.getEntry(aaIPI___contains));
        }
        if (aaIPI___not___contains != null) {
            joiner.add("aaIPI___not___contains: " + GraphQLRequestSerializer.getEntry(aaIPI___not___contains));
        }
        if (aaIPI___starts_with != null) {
            joiner.add("aaIPI___starts_with: " + GraphQLRequestSerializer.getEntry(aaIPI___starts_with));
        }
        if (aaIPI___not___starts_with != null) {
            joiner.add("aaIPI___not___starts_with: " + GraphQLRequestSerializer.getEntry(aaIPI___not___starts_with));
        }
        if (aaIPI___ends_with != null) {
            joiner.add("aaIPI___ends_with: " + GraphQLRequestSerializer.getEntry(aaIPI___ends_with));
        }
        if (aaIPI___not___ends_with != null) {
            joiner.add("aaIPI___not___ends_with: " + GraphQLRequestSerializer.getEntry(aaIPI___not___ends_with));
        }
        if (altro___eq != null) {
            joiner.add("altro___eq: " + GraphQLRequestSerializer.getEntry(altro___eq));
        }
        if (altro___ne != null) {
            joiner.add("altro___ne: " + GraphQLRequestSerializer.getEntry(altro___ne));
        }
        if (altro___null != null) {
            joiner.add("altro___null: " + GraphQLRequestSerializer.getEntry(altro___null));
        }
        if (altro___not___null != null) {
            joiner.add("altro___not___null: " + GraphQLRequestSerializer.getEntry(altro___not___null));
        }
        if (altro___in != null) {
            joiner.add("altro___in: " + GraphQLRequestSerializer.getEntry(altro___in));
        }
        if (altro___not___in != null) {
            joiner.add("altro___not___in: " + GraphQLRequestSerializer.getEntry(altro___not___in));
        }
        if (altro___lt != null) {
            joiner.add("altro___lt: " + GraphQLRequestSerializer.getEntry(altro___lt));
        }
        if (altro___lte != null) {
            joiner.add("altro___lte: " + GraphQLRequestSerializer.getEntry(altro___lte));
        }
        if (altro___gt != null) {
            joiner.add("altro___gt: " + GraphQLRequestSerializer.getEntry(altro___gt));
        }
        if (altro___gte != null) {
            joiner.add("altro___gte: " + GraphQLRequestSerializer.getEntry(altro___gte));
        }
        if (altro___contains != null) {
            joiner.add("altro___contains: " + GraphQLRequestSerializer.getEntry(altro___contains));
        }
        if (altro___not___contains != null) {
            joiner.add("altro___not___contains: " + GraphQLRequestSerializer.getEntry(altro___not___contains));
        }
        if (altro___starts_with != null) {
            joiner.add("altro___starts_with: " + GraphQLRequestSerializer.getEntry(altro___starts_with));
        }
        if (altro___not___starts_with != null) {
            joiner.add("altro___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro___not___starts_with));
        }
        if (altro___ends_with != null) {
            joiner.add("altro___ends_with: " + GraphQLRequestSerializer.getEntry(altro___ends_with));
        }
        if (altro___not___ends_with != null) {
            joiner.add("altro___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro___not___ends_with));
        }
        if (anamnesi___eq != null) {
            joiner.add("anamnesi___eq: " + GraphQLRequestSerializer.getEntry(anamnesi___eq));
        }
        if (anamnesi___ne != null) {
            joiner.add("anamnesi___ne: " + GraphQLRequestSerializer.getEntry(anamnesi___ne));
        }
        if (anamnesi___null != null) {
            joiner.add("anamnesi___null: " + GraphQLRequestSerializer.getEntry(anamnesi___null));
        }
        if (anamnesi___not___null != null) {
            joiner.add("anamnesi___not___null: " + GraphQLRequestSerializer.getEntry(anamnesi___not___null));
        }
        if (c_dettaglio_id___eq != null) {
            joiner.add("c_dettaglio_id___eq: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___eq));
        }
        if (c_dettaglio_id___ne != null) {
            joiner.add("c_dettaglio_id___ne: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___ne));
        }
        if (c_dettaglio_id___null != null) {
            joiner.add("c_dettaglio_id___null: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___null));
        }
        if (c_dettaglio_id___not___null != null) {
            joiner.add("c_dettaglio_id___not___null: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___not___null));
        }
        if (c_dettaglio_id___in != null) {
            joiner.add("c_dettaglio_id___in: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___in));
        }
        if (c_dettaglio_id___not___in != null) {
            joiner.add("c_dettaglio_id___not___in: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___not___in));
        }
        if (c_dettaglio_id___lt != null) {
            joiner.add("c_dettaglio_id___lt: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___lt));
        }
        if (c_dettaglio_id___lte != null) {
            joiner.add("c_dettaglio_id___lte: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___lte));
        }
        if (c_dettaglio_id___gt != null) {
            joiner.add("c_dettaglio_id___gt: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___gt));
        }
        if (c_dettaglio_id___gte != null) {
            joiner.add("c_dettaglio_id___gte: " + GraphQLRequestSerializer.getEntry(c_dettaglio_id___gte));
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
        if (documentazione_necessaria___eq != null) {
            joiner.add("documentazione_necessaria___eq: " + GraphQLRequestSerializer.getEntry(documentazione_necessaria___eq));
        }
        if (documentazione_necessaria___ne != null) {
            joiner.add("documentazione_necessaria___ne: " + GraphQLRequestSerializer.getEntry(documentazione_necessaria___ne));
        }
        if (documentazione_necessaria___null != null) {
            joiner.add("documentazione_necessaria___null: " + GraphQLRequestSerializer.getEntry(documentazione_necessaria___null));
        }
        if (documentazione_necessaria___not___null != null) {
            joiner.add("documentazione_necessaria___not___null: " + GraphQLRequestSerializer.getEntry(documentazione_necessaria___not___null));
        }
        if (episodio___eq != null) {
            joiner.add("episodio___eq: " + GraphQLRequestSerializer.getEntry(episodio___eq));
        }
        if (episodio___ne != null) {
            joiner.add("episodio___ne: " + GraphQLRequestSerializer.getEntry(episodio___ne));
        }
        if (episodio___null != null) {
            joiner.add("episodio___null: " + GraphQLRequestSerializer.getEntry(episodio___null));
        }
        if (episodio___not___null != null) {
            joiner.add("episodio___not___null: " + GraphQLRequestSerializer.getEntry(episodio___not___null));
        }
        if (episodio___in != null) {
            joiner.add("episodio___in: " + GraphQLRequestSerializer.getEntry(episodio___in));
        }
        if (episodio___not___in != null) {
            joiner.add("episodio___not___in: " + GraphQLRequestSerializer.getEntry(episodio___not___in));
        }
        if (episodio___lt != null) {
            joiner.add("episodio___lt: " + GraphQLRequestSerializer.getEntry(episodio___lt));
        }
        if (episodio___lte != null) {
            joiner.add("episodio___lte: " + GraphQLRequestSerializer.getEntry(episodio___lte));
        }
        if (episodio___gt != null) {
            joiner.add("episodio___gt: " + GraphQLRequestSerializer.getEntry(episodio___gt));
        }
        if (episodio___gte != null) {
            joiner.add("episodio___gte: " + GraphQLRequestSerializer.getEntry(episodio___gte));
        }
        if (episodio___contains != null) {
            joiner.add("episodio___contains: " + GraphQLRequestSerializer.getEntry(episodio___contains));
        }
        if (episodio___not___contains != null) {
            joiner.add("episodio___not___contains: " + GraphQLRequestSerializer.getEntry(episodio___not___contains));
        }
        if (episodio___starts_with != null) {
            joiner.add("episodio___starts_with: " + GraphQLRequestSerializer.getEntry(episodio___starts_with));
        }
        if (episodio___not___starts_with != null) {
            joiner.add("episodio___not___starts_with: " + GraphQLRequestSerializer.getEntry(episodio___not___starts_with));
        }
        if (episodio___ends_with != null) {
            joiner.add("episodio___ends_with: " + GraphQLRequestSerializer.getEntry(episodio___ends_with));
        }
        if (episodio___not___ends_with != null) {
            joiner.add("episodio___not___ends_with: " + GraphQLRequestSerializer.getEntry(episodio___not___ends_with));
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
        if (metodo_diagnosi_tumore___eq != null) {
            joiner.add("metodo_diagnosi_tumore___eq: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___eq));
        }
        if (metodo_diagnosi_tumore___ne != null) {
            joiner.add("metodo_diagnosi_tumore___ne: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___ne));
        }
        if (metodo_diagnosi_tumore___null != null) {
            joiner.add("metodo_diagnosi_tumore___null: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___null));
        }
        if (metodo_diagnosi_tumore___not___null != null) {
            joiner.add("metodo_diagnosi_tumore___not___null: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___not___null));
        }
        if (metodo_diagnosi_tumore___in != null) {
            joiner.add("metodo_diagnosi_tumore___in: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___in));
        }
        if (metodo_diagnosi_tumore___not___in != null) {
            joiner.add("metodo_diagnosi_tumore___not___in: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___not___in));
        }
        if (metodo_diagnosi_tumore___lt != null) {
            joiner.add("metodo_diagnosi_tumore___lt: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___lt));
        }
        if (metodo_diagnosi_tumore___lte != null) {
            joiner.add("metodo_diagnosi_tumore___lte: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___lte));
        }
        if (metodo_diagnosi_tumore___gt != null) {
            joiner.add("metodo_diagnosi_tumore___gt: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___gt));
        }
        if (metodo_diagnosi_tumore___gte != null) {
            joiner.add("metodo_diagnosi_tumore___gte: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___gte));
        }
        if (metodo_diagnosi_tumore___contains != null) {
            joiner.add("metodo_diagnosi_tumore___contains: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___contains));
        }
        if (metodo_diagnosi_tumore___not___contains != null) {
            joiner.add("metodo_diagnosi_tumore___not___contains: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___not___contains));
        }
        if (metodo_diagnosi_tumore___starts_with != null) {
            joiner.add("metodo_diagnosi_tumore___starts_with: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___starts_with));
        }
        if (metodo_diagnosi_tumore___not___starts_with != null) {
            joiner.add("metodo_diagnosi_tumore___not___starts_with: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___not___starts_with));
        }
        if (metodo_diagnosi_tumore___ends_with != null) {
            joiner.add("metodo_diagnosi_tumore___ends_with: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___ends_with));
        }
        if (metodo_diagnosi_tumore___not___ends_with != null) {
            joiner.add("metodo_diagnosi_tumore___not___ends_with: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore___not___ends_with));
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
        if (nome_patologia___eq != null) {
            joiner.add("nome_patologia___eq: " + GraphQLRequestSerializer.getEntry(nome_patologia___eq));
        }
        if (nome_patologia___ne != null) {
            joiner.add("nome_patologia___ne: " + GraphQLRequestSerializer.getEntry(nome_patologia___ne));
        }
        if (nome_patologia___null != null) {
            joiner.add("nome_patologia___null: " + GraphQLRequestSerializer.getEntry(nome_patologia___null));
        }
        if (nome_patologia___not___null != null) {
            joiner.add("nome_patologia___not___null: " + GraphQLRequestSerializer.getEntry(nome_patologia___not___null));
        }
        if (nome_patologia___in != null) {
            joiner.add("nome_patologia___in: " + GraphQLRequestSerializer.getEntry(nome_patologia___in));
        }
        if (nome_patologia___not___in != null) {
            joiner.add("nome_patologia___not___in: " + GraphQLRequestSerializer.getEntry(nome_patologia___not___in));
        }
        if (nome_patologia___lt != null) {
            joiner.add("nome_patologia___lt: " + GraphQLRequestSerializer.getEntry(nome_patologia___lt));
        }
        if (nome_patologia___lte != null) {
            joiner.add("nome_patologia___lte: " + GraphQLRequestSerializer.getEntry(nome_patologia___lte));
        }
        if (nome_patologia___gt != null) {
            joiner.add("nome_patologia___gt: " + GraphQLRequestSerializer.getEntry(nome_patologia___gt));
        }
        if (nome_patologia___gte != null) {
            joiner.add("nome_patologia___gte: " + GraphQLRequestSerializer.getEntry(nome_patologia___gte));
        }
        if (nome_patologia___contains != null) {
            joiner.add("nome_patologia___contains: " + GraphQLRequestSerializer.getEntry(nome_patologia___contains));
        }
        if (nome_patologia___not___contains != null) {
            joiner.add("nome_patologia___not___contains: " + GraphQLRequestSerializer.getEntry(nome_patologia___not___contains));
        }
        if (nome_patologia___starts_with != null) {
            joiner.add("nome_patologia___starts_with: " + GraphQLRequestSerializer.getEntry(nome_patologia___starts_with));
        }
        if (nome_patologia___not___starts_with != null) {
            joiner.add("nome_patologia___not___starts_with: " + GraphQLRequestSerializer.getEntry(nome_patologia___not___starts_with));
        }
        if (nome_patologia___ends_with != null) {
            joiner.add("nome_patologia___ends_with: " + GraphQLRequestSerializer.getEntry(nome_patologia___ends_with));
        }
        if (nome_patologia___not___ends_with != null) {
            joiner.add("nome_patologia___not___ends_with: " + GraphQLRequestSerializer.getEntry(nome_patologia___not___ends_with));
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
        if (paziente_o___eq != null) {
            joiner.add("paziente_o___eq: " + GraphQLRequestSerializer.getEntry(paziente_o___eq));
        }
        if (paziente_o___ne != null) {
            joiner.add("paziente_o___ne: " + GraphQLRequestSerializer.getEntry(paziente_o___ne));
        }
        if (paziente_o___null != null) {
            joiner.add("paziente_o___null: " + GraphQLRequestSerializer.getEntry(paziente_o___null));
        }
        if (paziente_o___not___null != null) {
            joiner.add("paziente_o___not___null: " + GraphQLRequestSerializer.getEntry(paziente_o___not___null));
        }
        if (paziente_o___in != null) {
            joiner.add("paziente_o___in: " + GraphQLRequestSerializer.getEntry(paziente_o___in));
        }
        if (paziente_o___not___in != null) {
            joiner.add("paziente_o___not___in: " + GraphQLRequestSerializer.getEntry(paziente_o___not___in));
        }
        if (paziente_o___lt != null) {
            joiner.add("paziente_o___lt: " + GraphQLRequestSerializer.getEntry(paziente_o___lt));
        }
        if (paziente_o___lte != null) {
            joiner.add("paziente_o___lte: " + GraphQLRequestSerializer.getEntry(paziente_o___lte));
        }
        if (paziente_o___gt != null) {
            joiner.add("paziente_o___gt: " + GraphQLRequestSerializer.getEntry(paziente_o___gt));
        }
        if (paziente_o___gte != null) {
            joiner.add("paziente_o___gte: " + GraphQLRequestSerializer.getEntry(paziente_o___gte));
        }
        if (performance_status___eq != null) {
            joiner.add("performance_status___eq: " + GraphQLRequestSerializer.getEntry(performance_status___eq));
        }
        if (performance_status___ne != null) {
            joiner.add("performance_status___ne: " + GraphQLRequestSerializer.getEntry(performance_status___ne));
        }
        if (performance_status___null != null) {
            joiner.add("performance_status___null: " + GraphQLRequestSerializer.getEntry(performance_status___null));
        }
        if (performance_status___not___null != null) {
            joiner.add("performance_status___not___null: " + GraphQLRequestSerializer.getEntry(performance_status___not___null));
        }
        if (performance_status___in != null) {
            joiner.add("performance_status___in: " + GraphQLRequestSerializer.getEntry(performance_status___in));
        }
        if (performance_status___not___in != null) {
            joiner.add("performance_status___not___in: " + GraphQLRequestSerializer.getEntry(performance_status___not___in));
        }
        if (performance_status___lt != null) {
            joiner.add("performance_status___lt: " + GraphQLRequestSerializer.getEntry(performance_status___lt));
        }
        if (performance_status___lte != null) {
            joiner.add("performance_status___lte: " + GraphQLRequestSerializer.getEntry(performance_status___lte));
        }
        if (performance_status___gt != null) {
            joiner.add("performance_status___gt: " + GraphQLRequestSerializer.getEntry(performance_status___gt));
        }
        if (performance_status___gte != null) {
            joiner.add("performance_status___gte: " + GraphQLRequestSerializer.getEntry(performance_status___gte));
        }
        if (performance_status___contains != null) {
            joiner.add("performance_status___contains: " + GraphQLRequestSerializer.getEntry(performance_status___contains));
        }
        if (performance_status___not___contains != null) {
            joiner.add("performance_status___not___contains: " + GraphQLRequestSerializer.getEntry(performance_status___not___contains));
        }
        if (performance_status___starts_with != null) {
            joiner.add("performance_status___starts_with: " + GraphQLRequestSerializer.getEntry(performance_status___starts_with));
        }
        if (performance_status___not___starts_with != null) {
            joiner.add("performance_status___not___starts_with: " + GraphQLRequestSerializer.getEntry(performance_status___not___starts_with));
        }
        if (performance_status___ends_with != null) {
            joiner.add("performance_status___ends_with: " + GraphQLRequestSerializer.getEntry(performance_status___ends_with));
        }
        if (performance_status___not___ends_with != null) {
            joiner.add("performance_status___not___ends_with: " + GraphQLRequestSerializer.getEntry(performance_status___not___ends_with));
        }
        if (siti_coinvolti_M___eq != null) {
            joiner.add("siti_coinvolti_M___eq: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___eq));
        }
        if (siti_coinvolti_M___ne != null) {
            joiner.add("siti_coinvolti_M___ne: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___ne));
        }
        if (siti_coinvolti_M___null != null) {
            joiner.add("siti_coinvolti_M___null: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___null));
        }
        if (siti_coinvolti_M___not___null != null) {
            joiner.add("siti_coinvolti_M___not___null: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___not___null));
        }
        if (siti_coinvolti_M___in != null) {
            joiner.add("siti_coinvolti_M___in: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___in));
        }
        if (siti_coinvolti_M___not___in != null) {
            joiner.add("siti_coinvolti_M___not___in: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___not___in));
        }
        if (siti_coinvolti_M___lt != null) {
            joiner.add("siti_coinvolti_M___lt: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___lt));
        }
        if (siti_coinvolti_M___lte != null) {
            joiner.add("siti_coinvolti_M___lte: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___lte));
        }
        if (siti_coinvolti_M___gt != null) {
            joiner.add("siti_coinvolti_M___gt: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___gt));
        }
        if (siti_coinvolti_M___gte != null) {
            joiner.add("siti_coinvolti_M___gte: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___gte));
        }
        if (siti_coinvolti_M___contains != null) {
            joiner.add("siti_coinvolti_M___contains: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___contains));
        }
        if (siti_coinvolti_M___not___contains != null) {
            joiner.add("siti_coinvolti_M___not___contains: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___not___contains));
        }
        if (siti_coinvolti_M___starts_with != null) {
            joiner.add("siti_coinvolti_M___starts_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___starts_with));
        }
        if (siti_coinvolti_M___not___starts_with != null) {
            joiner.add("siti_coinvolti_M___not___starts_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___not___starts_with));
        }
        if (siti_coinvolti_M___ends_with != null) {
            joiner.add("siti_coinvolti_M___ends_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___ends_with));
        }
        if (siti_coinvolti_M___not___ends_with != null) {
            joiner.add("siti_coinvolti_M___not___ends_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M___not___ends_with));
        }
        if (siti_coinvolti_N___eq != null) {
            joiner.add("siti_coinvolti_N___eq: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___eq));
        }
        if (siti_coinvolti_N___ne != null) {
            joiner.add("siti_coinvolti_N___ne: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___ne));
        }
        if (siti_coinvolti_N___null != null) {
            joiner.add("siti_coinvolti_N___null: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___null));
        }
        if (siti_coinvolti_N___not___null != null) {
            joiner.add("siti_coinvolti_N___not___null: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___not___null));
        }
        if (siti_coinvolti_N___in != null) {
            joiner.add("siti_coinvolti_N___in: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___in));
        }
        if (siti_coinvolti_N___not___in != null) {
            joiner.add("siti_coinvolti_N___not___in: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___not___in));
        }
        if (siti_coinvolti_N___lt != null) {
            joiner.add("siti_coinvolti_N___lt: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___lt));
        }
        if (siti_coinvolti_N___lte != null) {
            joiner.add("siti_coinvolti_N___lte: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___lte));
        }
        if (siti_coinvolti_N___gt != null) {
            joiner.add("siti_coinvolti_N___gt: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___gt));
        }
        if (siti_coinvolti_N___gte != null) {
            joiner.add("siti_coinvolti_N___gte: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___gte));
        }
        if (siti_coinvolti_N___contains != null) {
            joiner.add("siti_coinvolti_N___contains: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___contains));
        }
        if (siti_coinvolti_N___not___contains != null) {
            joiner.add("siti_coinvolti_N___not___contains: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___not___contains));
        }
        if (siti_coinvolti_N___starts_with != null) {
            joiner.add("siti_coinvolti_N___starts_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___starts_with));
        }
        if (siti_coinvolti_N___not___starts_with != null) {
            joiner.add("siti_coinvolti_N___not___starts_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___not___starts_with));
        }
        if (siti_coinvolti_N___ends_with != null) {
            joiner.add("siti_coinvolti_N___ends_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___ends_with));
        }
        if (siti_coinvolti_N___not___ends_with != null) {
            joiner.add("siti_coinvolti_N___not___ends_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N___not___ends_with));
        }
        if (siti_coinvolti_T___eq != null) {
            joiner.add("siti_coinvolti_T___eq: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___eq));
        }
        if (siti_coinvolti_T___ne != null) {
            joiner.add("siti_coinvolti_T___ne: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___ne));
        }
        if (siti_coinvolti_T___null != null) {
            joiner.add("siti_coinvolti_T___null: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___null));
        }
        if (siti_coinvolti_T___not___null != null) {
            joiner.add("siti_coinvolti_T___not___null: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___not___null));
        }
        if (siti_coinvolti_T___in != null) {
            joiner.add("siti_coinvolti_T___in: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___in));
        }
        if (siti_coinvolti_T___not___in != null) {
            joiner.add("siti_coinvolti_T___not___in: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___not___in));
        }
        if (siti_coinvolti_T___lt != null) {
            joiner.add("siti_coinvolti_T___lt: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___lt));
        }
        if (siti_coinvolti_T___lte != null) {
            joiner.add("siti_coinvolti_T___lte: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___lte));
        }
        if (siti_coinvolti_T___gt != null) {
            joiner.add("siti_coinvolti_T___gt: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___gt));
        }
        if (siti_coinvolti_T___gte != null) {
            joiner.add("siti_coinvolti_T___gte: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___gte));
        }
        if (siti_coinvolti_T___contains != null) {
            joiner.add("siti_coinvolti_T___contains: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___contains));
        }
        if (siti_coinvolti_T___not___contains != null) {
            joiner.add("siti_coinvolti_T___not___contains: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___not___contains));
        }
        if (siti_coinvolti_T___starts_with != null) {
            joiner.add("siti_coinvolti_T___starts_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___starts_with));
        }
        if (siti_coinvolti_T___not___starts_with != null) {
            joiner.add("siti_coinvolti_T___not___starts_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___not___starts_with));
        }
        if (siti_coinvolti_T___ends_with != null) {
            joiner.add("siti_coinvolti_T___ends_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___ends_with));
        }
        if (siti_coinvolti_T___not___ends_with != null) {
            joiner.add("siti_coinvolti_T___not___ends_with: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T___not___ends_with));
        }
        if (specifica_tumori___eq != null) {
            joiner.add("specifica_tumori___eq: " + GraphQLRequestSerializer.getEntry(specifica_tumori___eq));
        }
        if (specifica_tumori___ne != null) {
            joiner.add("specifica_tumori___ne: " + GraphQLRequestSerializer.getEntry(specifica_tumori___ne));
        }
        if (specifica_tumori___null != null) {
            joiner.add("specifica_tumori___null: " + GraphQLRequestSerializer.getEntry(specifica_tumori___null));
        }
        if (specifica_tumori___not___null != null) {
            joiner.add("specifica_tumori___not___null: " + GraphQLRequestSerializer.getEntry(specifica_tumori___not___null));
        }
        if (stadio_tumore___eq != null) {
            joiner.add("stadio_tumore___eq: " + GraphQLRequestSerializer.getEntry(stadio_tumore___eq));
        }
        if (stadio_tumore___ne != null) {
            joiner.add("stadio_tumore___ne: " + GraphQLRequestSerializer.getEntry(stadio_tumore___ne));
        }
        if (stadio_tumore___null != null) {
            joiner.add("stadio_tumore___null: " + GraphQLRequestSerializer.getEntry(stadio_tumore___null));
        }
        if (stadio_tumore___not___null != null) {
            joiner.add("stadio_tumore___not___null: " + GraphQLRequestSerializer.getEntry(stadio_tumore___not___null));
        }
        if (stadio_tumore___in != null) {
            joiner.add("stadio_tumore___in: " + GraphQLRequestSerializer.getEntry(stadio_tumore___in));
        }
        if (stadio_tumore___not___in != null) {
            joiner.add("stadio_tumore___not___in: " + GraphQLRequestSerializer.getEntry(stadio_tumore___not___in));
        }
        if (stadio_tumore___lt != null) {
            joiner.add("stadio_tumore___lt: " + GraphQLRequestSerializer.getEntry(stadio_tumore___lt));
        }
        if (stadio_tumore___lte != null) {
            joiner.add("stadio_tumore___lte: " + GraphQLRequestSerializer.getEntry(stadio_tumore___lte));
        }
        if (stadio_tumore___gt != null) {
            joiner.add("stadio_tumore___gt: " + GraphQLRequestSerializer.getEntry(stadio_tumore___gt));
        }
        if (stadio_tumore___gte != null) {
            joiner.add("stadio_tumore___gte: " + GraphQLRequestSerializer.getEntry(stadio_tumore___gte));
        }
        if (stadio_tumore___contains != null) {
            joiner.add("stadio_tumore___contains: " + GraphQLRequestSerializer.getEntry(stadio_tumore___contains));
        }
        if (stadio_tumore___not___contains != null) {
            joiner.add("stadio_tumore___not___contains: " + GraphQLRequestSerializer.getEntry(stadio_tumore___not___contains));
        }
        if (stadio_tumore___starts_with != null) {
            joiner.add("stadio_tumore___starts_with: " + GraphQLRequestSerializer.getEntry(stadio_tumore___starts_with));
        }
        if (stadio_tumore___not___starts_with != null) {
            joiner.add("stadio_tumore___not___starts_with: " + GraphQLRequestSerializer.getEntry(stadio_tumore___not___starts_with));
        }
        if (stadio_tumore___ends_with != null) {
            joiner.add("stadio_tumore___ends_with: " + GraphQLRequestSerializer.getEntry(stadio_tumore___ends_with));
        }
        if (stadio_tumore___not___ends_with != null) {
            joiner.add("stadio_tumore___not___ends_with: " + GraphQLRequestSerializer.getEntry(stadio_tumore___not___ends_with));
        }
        if (stato_accertamento___eq != null) {
            joiner.add("stato_accertamento___eq: " + GraphQLRequestSerializer.getEntry(stato_accertamento___eq));
        }
        if (stato_accertamento___ne != null) {
            joiner.add("stato_accertamento___ne: " + GraphQLRequestSerializer.getEntry(stato_accertamento___ne));
        }
        if (stato_accertamento___null != null) {
            joiner.add("stato_accertamento___null: " + GraphQLRequestSerializer.getEntry(stato_accertamento___null));
        }
        if (stato_accertamento___not___null != null) {
            joiner.add("stato_accertamento___not___null: " + GraphQLRequestSerializer.getEntry(stato_accertamento___not___null));
        }
        if (stato_accertamento___in != null) {
            joiner.add("stato_accertamento___in: " + GraphQLRequestSerializer.getEntry(stato_accertamento___in));
        }
        if (stato_accertamento___not___in != null) {
            joiner.add("stato_accertamento___not___in: " + GraphQLRequestSerializer.getEntry(stato_accertamento___not___in));
        }
        if (stato_accertamento___lt != null) {
            joiner.add("stato_accertamento___lt: " + GraphQLRequestSerializer.getEntry(stato_accertamento___lt));
        }
        if (stato_accertamento___lte != null) {
            joiner.add("stato_accertamento___lte: " + GraphQLRequestSerializer.getEntry(stato_accertamento___lte));
        }
        if (stato_accertamento___gt != null) {
            joiner.add("stato_accertamento___gt: " + GraphQLRequestSerializer.getEntry(stato_accertamento___gt));
        }
        if (stato_accertamento___gte != null) {
            joiner.add("stato_accertamento___gte: " + GraphQLRequestSerializer.getEntry(stato_accertamento___gte));
        }
        if (stato_accertamento___contains != null) {
            joiner.add("stato_accertamento___contains: " + GraphQLRequestSerializer.getEntry(stato_accertamento___contains));
        }
        if (stato_accertamento___not___contains != null) {
            joiner.add("stato_accertamento___not___contains: " + GraphQLRequestSerializer.getEntry(stato_accertamento___not___contains));
        }
        if (stato_accertamento___starts_with != null) {
            joiner.add("stato_accertamento___starts_with: " + GraphQLRequestSerializer.getEntry(stato_accertamento___starts_with));
        }
        if (stato_accertamento___not___starts_with != null) {
            joiner.add("stato_accertamento___not___starts_with: " + GraphQLRequestSerializer.getEntry(stato_accertamento___not___starts_with));
        }
        if (stato_accertamento___ends_with != null) {
            joiner.add("stato_accertamento___ends_with: " + GraphQLRequestSerializer.getEntry(stato_accertamento___ends_with));
        }
        if (stato_accertamento___not___ends_with != null) {
            joiner.add("stato_accertamento___not___ends_with: " + GraphQLRequestSerializer.getEntry(stato_accertamento___not___ends_with));
        }
        if (tipo_imaging___eq != null) {
            joiner.add("tipo_imaging___eq: " + GraphQLRequestSerializer.getEntry(tipo_imaging___eq));
        }
        if (tipo_imaging___ne != null) {
            joiner.add("tipo_imaging___ne: " + GraphQLRequestSerializer.getEntry(tipo_imaging___ne));
        }
        if (tipo_imaging___null != null) {
            joiner.add("tipo_imaging___null: " + GraphQLRequestSerializer.getEntry(tipo_imaging___null));
        }
        if (tipo_imaging___not___null != null) {
            joiner.add("tipo_imaging___not___null: " + GraphQLRequestSerializer.getEntry(tipo_imaging___not___null));
        }
        if (tipo_imaging___in != null) {
            joiner.add("tipo_imaging___in: " + GraphQLRequestSerializer.getEntry(tipo_imaging___in));
        }
        if (tipo_imaging___not___in != null) {
            joiner.add("tipo_imaging___not___in: " + GraphQLRequestSerializer.getEntry(tipo_imaging___not___in));
        }
        if (tipo_imaging___lt != null) {
            joiner.add("tipo_imaging___lt: " + GraphQLRequestSerializer.getEntry(tipo_imaging___lt));
        }
        if (tipo_imaging___lte != null) {
            joiner.add("tipo_imaging___lte: " + GraphQLRequestSerializer.getEntry(tipo_imaging___lte));
        }
        if (tipo_imaging___gt != null) {
            joiner.add("tipo_imaging___gt: " + GraphQLRequestSerializer.getEntry(tipo_imaging___gt));
        }
        if (tipo_imaging___gte != null) {
            joiner.add("tipo_imaging___gte: " + GraphQLRequestSerializer.getEntry(tipo_imaging___gte));
        }
        if (tipo_imaging___contains != null) {
            joiner.add("tipo_imaging___contains: " + GraphQLRequestSerializer.getEntry(tipo_imaging___contains));
        }
        if (tipo_imaging___not___contains != null) {
            joiner.add("tipo_imaging___not___contains: " + GraphQLRequestSerializer.getEntry(tipo_imaging___not___contains));
        }
        if (tipo_imaging___starts_with != null) {
            joiner.add("tipo_imaging___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_imaging___starts_with));
        }
        if (tipo_imaging___not___starts_with != null) {
            joiner.add("tipo_imaging___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_imaging___not___starts_with));
        }
        if (tipo_imaging___ends_with != null) {
            joiner.add("tipo_imaging___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_imaging___ends_with));
        }
        if (tipo_imaging___not___ends_with != null) {
            joiner.add("tipo_imaging___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_imaging___not___ends_with));
        }
        if (warning_respond___eq != null) {
            joiner.add("warning_respond___eq: " + GraphQLRequestSerializer.getEntry(warning_respond___eq));
        }
        if (warning_respond___ne != null) {
            joiner.add("warning_respond___ne: " + GraphQLRequestSerializer.getEntry(warning_respond___ne));
        }
        if (warning_respond___null != null) {
            joiner.add("warning_respond___null: " + GraphQLRequestSerializer.getEntry(warning_respond___null));
        }
        if (warning_respond___not___null != null) {
            joiner.add("warning_respond___not___null: " + GraphQLRequestSerializer.getEntry(warning_respond___not___null));
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

    public static CliEventoFilterDTO.Builder builder() {
        return new CliEventoFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String IPI___eq;
        private String IPI___ne;
        private Boolean IPI___null;
        private Boolean IPI___not___null;
        private java.util.List<String> IPI___in;
        private java.util.List<String> IPI___not___in;
        private String IPI___lt;
        private String IPI___lte;
        private String IPI___gt;
        private String IPI___gte;
        private String IPI___contains;
        private String IPI___not___contains;
        private String IPI___starts_with;
        private String IPI___not___starts_with;
        private String IPI___ends_with;
        private String IPI___not___ends_with;
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
        private String aaIPI___eq;
        private String aaIPI___ne;
        private Boolean aaIPI___null;
        private Boolean aaIPI___not___null;
        private java.util.List<String> aaIPI___in;
        private java.util.List<String> aaIPI___not___in;
        private String aaIPI___lt;
        private String aaIPI___lte;
        private String aaIPI___gt;
        private String aaIPI___gte;
        private String aaIPI___contains;
        private String aaIPI___not___contains;
        private String aaIPI___starts_with;
        private String aaIPI___not___starts_with;
        private String aaIPI___ends_with;
        private String aaIPI___not___ends_with;
        private String altro___eq;
        private String altro___ne;
        private Boolean altro___null;
        private Boolean altro___not___null;
        private java.util.List<String> altro___in;
        private java.util.List<String> altro___not___in;
        private String altro___lt;
        private String altro___lte;
        private String altro___gt;
        private String altro___gte;
        private String altro___contains;
        private String altro___not___contains;
        private String altro___starts_with;
        private String altro___not___starts_with;
        private String altro___ends_with;
        private String altro___not___ends_with;
        private Boolean anamnesi___eq;
        private Boolean anamnesi___ne;
        private Boolean anamnesi___null;
        private Boolean anamnesi___not___null;
        private Integer c_dettaglio_id___eq;
        private Integer c_dettaglio_id___ne;
        private Boolean c_dettaglio_id___null;
        private Boolean c_dettaglio_id___not___null;
        private java.util.List<Integer> c_dettaglio_id___in;
        private java.util.List<Integer> c_dettaglio_id___not___in;
        private Integer c_dettaglio_id___lt;
        private Integer c_dettaglio_id___lte;
        private Integer c_dettaglio_id___gt;
        private Integer c_dettaglio_id___gte;
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
        private Boolean documentazione_necessaria___eq;
        private Boolean documentazione_necessaria___ne;
        private Boolean documentazione_necessaria___null;
        private Boolean documentazione_necessaria___not___null;
        private String episodio___eq;
        private String episodio___ne;
        private Boolean episodio___null;
        private Boolean episodio___not___null;
        private java.util.List<String> episodio___in;
        private java.util.List<String> episodio___not___in;
        private String episodio___lt;
        private String episodio___lte;
        private String episodio___gt;
        private String episodio___gte;
        private String episodio___contains;
        private String episodio___not___contains;
        private String episodio___starts_with;
        private String episodio___not___starts_with;
        private String episodio___ends_with;
        private String episodio___not___ends_with;
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
        private String metodo_diagnosi_tumore___eq;
        private String metodo_diagnosi_tumore___ne;
        private Boolean metodo_diagnosi_tumore___null;
        private Boolean metodo_diagnosi_tumore___not___null;
        private java.util.List<String> metodo_diagnosi_tumore___in;
        private java.util.List<String> metodo_diagnosi_tumore___not___in;
        private String metodo_diagnosi_tumore___lt;
        private String metodo_diagnosi_tumore___lte;
        private String metodo_diagnosi_tumore___gt;
        private String metodo_diagnosi_tumore___gte;
        private String metodo_diagnosi_tumore___contains;
        private String metodo_diagnosi_tumore___not___contains;
        private String metodo_diagnosi_tumore___starts_with;
        private String metodo_diagnosi_tumore___not___starts_with;
        private String metodo_diagnosi_tumore___ends_with;
        private String metodo_diagnosi_tumore___not___ends_with;
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
        private String nome_patologia___eq;
        private String nome_patologia___ne;
        private Boolean nome_patologia___null;
        private Boolean nome_patologia___not___null;
        private java.util.List<String> nome_patologia___in;
        private java.util.List<String> nome_patologia___not___in;
        private String nome_patologia___lt;
        private String nome_patologia___lte;
        private String nome_patologia___gt;
        private String nome_patologia___gte;
        private String nome_patologia___contains;
        private String nome_patologia___not___contains;
        private String nome_patologia___starts_with;
        private String nome_patologia___not___starts_with;
        private String nome_patologia___ends_with;
        private String nome_patologia___not___ends_with;
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
        private Integer paziente_o___eq;
        private Integer paziente_o___ne;
        private Boolean paziente_o___null;
        private Boolean paziente_o___not___null;
        private java.util.List<Integer> paziente_o___in;
        private java.util.List<Integer> paziente_o___not___in;
        private Integer paziente_o___lt;
        private Integer paziente_o___lte;
        private Integer paziente_o___gt;
        private Integer paziente_o___gte;
        private String performance_status___eq;
        private String performance_status___ne;
        private Boolean performance_status___null;
        private Boolean performance_status___not___null;
        private java.util.List<String> performance_status___in;
        private java.util.List<String> performance_status___not___in;
        private String performance_status___lt;
        private String performance_status___lte;
        private String performance_status___gt;
        private String performance_status___gte;
        private String performance_status___contains;
        private String performance_status___not___contains;
        private String performance_status___starts_with;
        private String performance_status___not___starts_with;
        private String performance_status___ends_with;
        private String performance_status___not___ends_with;
        private String siti_coinvolti_M___eq;
        private String siti_coinvolti_M___ne;
        private Boolean siti_coinvolti_M___null;
        private Boolean siti_coinvolti_M___not___null;
        private java.util.List<String> siti_coinvolti_M___in;
        private java.util.List<String> siti_coinvolti_M___not___in;
        private String siti_coinvolti_M___lt;
        private String siti_coinvolti_M___lte;
        private String siti_coinvolti_M___gt;
        private String siti_coinvolti_M___gte;
        private String siti_coinvolti_M___contains;
        private String siti_coinvolti_M___not___contains;
        private String siti_coinvolti_M___starts_with;
        private String siti_coinvolti_M___not___starts_with;
        private String siti_coinvolti_M___ends_with;
        private String siti_coinvolti_M___not___ends_with;
        private String siti_coinvolti_N___eq;
        private String siti_coinvolti_N___ne;
        private Boolean siti_coinvolti_N___null;
        private Boolean siti_coinvolti_N___not___null;
        private java.util.List<String> siti_coinvolti_N___in;
        private java.util.List<String> siti_coinvolti_N___not___in;
        private String siti_coinvolti_N___lt;
        private String siti_coinvolti_N___lte;
        private String siti_coinvolti_N___gt;
        private String siti_coinvolti_N___gte;
        private String siti_coinvolti_N___contains;
        private String siti_coinvolti_N___not___contains;
        private String siti_coinvolti_N___starts_with;
        private String siti_coinvolti_N___not___starts_with;
        private String siti_coinvolti_N___ends_with;
        private String siti_coinvolti_N___not___ends_with;
        private String siti_coinvolti_T___eq;
        private String siti_coinvolti_T___ne;
        private Boolean siti_coinvolti_T___null;
        private Boolean siti_coinvolti_T___not___null;
        private java.util.List<String> siti_coinvolti_T___in;
        private java.util.List<String> siti_coinvolti_T___not___in;
        private String siti_coinvolti_T___lt;
        private String siti_coinvolti_T___lte;
        private String siti_coinvolti_T___gt;
        private String siti_coinvolti_T___gte;
        private String siti_coinvolti_T___contains;
        private String siti_coinvolti_T___not___contains;
        private String siti_coinvolti_T___starts_with;
        private String siti_coinvolti_T___not___starts_with;
        private String siti_coinvolti_T___ends_with;
        private String siti_coinvolti_T___not___ends_with;
        private Boolean specifica_tumori___eq;
        private Boolean specifica_tumori___ne;
        private Boolean specifica_tumori___null;
        private Boolean specifica_tumori___not___null;
        private String stadio_tumore___eq;
        private String stadio_tumore___ne;
        private Boolean stadio_tumore___null;
        private Boolean stadio_tumore___not___null;
        private java.util.List<String> stadio_tumore___in;
        private java.util.List<String> stadio_tumore___not___in;
        private String stadio_tumore___lt;
        private String stadio_tumore___lte;
        private String stadio_tumore___gt;
        private String stadio_tumore___gte;
        private String stadio_tumore___contains;
        private String stadio_tumore___not___contains;
        private String stadio_tumore___starts_with;
        private String stadio_tumore___not___starts_with;
        private String stadio_tumore___ends_with;
        private String stadio_tumore___not___ends_with;
        private String stato_accertamento___eq;
        private String stato_accertamento___ne;
        private Boolean stato_accertamento___null;
        private Boolean stato_accertamento___not___null;
        private java.util.List<String> stato_accertamento___in;
        private java.util.List<String> stato_accertamento___not___in;
        private String stato_accertamento___lt;
        private String stato_accertamento___lte;
        private String stato_accertamento___gt;
        private String stato_accertamento___gte;
        private String stato_accertamento___contains;
        private String stato_accertamento___not___contains;
        private String stato_accertamento___starts_with;
        private String stato_accertamento___not___starts_with;
        private String stato_accertamento___ends_with;
        private String stato_accertamento___not___ends_with;
        private String tipo_imaging___eq;
        private String tipo_imaging___ne;
        private Boolean tipo_imaging___null;
        private Boolean tipo_imaging___not___null;
        private java.util.List<String> tipo_imaging___in;
        private java.util.List<String> tipo_imaging___not___in;
        private String tipo_imaging___lt;
        private String tipo_imaging___lte;
        private String tipo_imaging___gt;
        private String tipo_imaging___gte;
        private String tipo_imaging___contains;
        private String tipo_imaging___not___contains;
        private String tipo_imaging___starts_with;
        private String tipo_imaging___not___starts_with;
        private String tipo_imaging___ends_with;
        private String tipo_imaging___not___ends_with;
        private Boolean warning_respond___eq;
        private Boolean warning_respond___ne;
        private Boolean warning_respond___null;
        private Boolean warning_respond___not___null;
        private java.util.List<CliEventoFilterDTO> AND;
        private java.util.List<CliEventoFilterDTO> OR;
        private CliEventoFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder setIPI___eq(String IPI___eq) {
            this.IPI___eq = IPI___eq;
            return this;
        }

        public Builder setIPI___ne(String IPI___ne) {
            this.IPI___ne = IPI___ne;
            return this;
        }

        public Builder setIPI___null(Boolean IPI___null) {
            this.IPI___null = IPI___null;
            return this;
        }

        public Builder setIPI___not___null(Boolean IPI___not___null) {
            this.IPI___not___null = IPI___not___null;
            return this;
        }

        public Builder setIPI___in(java.util.List<String> IPI___in) {
            this.IPI___in = IPI___in;
            return this;
        }

        public Builder setIPI___not___in(java.util.List<String> IPI___not___in) {
            this.IPI___not___in = IPI___not___in;
            return this;
        }

        public Builder setIPI___lt(String IPI___lt) {
            this.IPI___lt = IPI___lt;
            return this;
        }

        public Builder setIPI___lte(String IPI___lte) {
            this.IPI___lte = IPI___lte;
            return this;
        }

        public Builder setIPI___gt(String IPI___gt) {
            this.IPI___gt = IPI___gt;
            return this;
        }

        public Builder setIPI___gte(String IPI___gte) {
            this.IPI___gte = IPI___gte;
            return this;
        }

        public Builder setIPI___contains(String IPI___contains) {
            this.IPI___contains = IPI___contains;
            return this;
        }

        public Builder setIPI___not___contains(String IPI___not___contains) {
            this.IPI___not___contains = IPI___not___contains;
            return this;
        }

        public Builder setIPI___starts_with(String IPI___starts_with) {
            this.IPI___starts_with = IPI___starts_with;
            return this;
        }

        public Builder setIPI___not___starts_with(String IPI___not___starts_with) {
            this.IPI___not___starts_with = IPI___not___starts_with;
            return this;
        }

        public Builder setIPI___ends_with(String IPI___ends_with) {
            this.IPI___ends_with = IPI___ends_with;
            return this;
        }

        public Builder setIPI___not___ends_with(String IPI___not___ends_with) {
            this.IPI___not___ends_with = IPI___not___ends_with;
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

        public Builder setAaIPI___eq(String aaIPI___eq) {
            this.aaIPI___eq = aaIPI___eq;
            return this;
        }

        public Builder setAaIPI___ne(String aaIPI___ne) {
            this.aaIPI___ne = aaIPI___ne;
            return this;
        }

        public Builder setAaIPI___null(Boolean aaIPI___null) {
            this.aaIPI___null = aaIPI___null;
            return this;
        }

        public Builder setAaIPI___not___null(Boolean aaIPI___not___null) {
            this.aaIPI___not___null = aaIPI___not___null;
            return this;
        }

        public Builder setAaIPI___in(java.util.List<String> aaIPI___in) {
            this.aaIPI___in = aaIPI___in;
            return this;
        }

        public Builder setAaIPI___not___in(java.util.List<String> aaIPI___not___in) {
            this.aaIPI___not___in = aaIPI___not___in;
            return this;
        }

        public Builder setAaIPI___lt(String aaIPI___lt) {
            this.aaIPI___lt = aaIPI___lt;
            return this;
        }

        public Builder setAaIPI___lte(String aaIPI___lte) {
            this.aaIPI___lte = aaIPI___lte;
            return this;
        }

        public Builder setAaIPI___gt(String aaIPI___gt) {
            this.aaIPI___gt = aaIPI___gt;
            return this;
        }

        public Builder setAaIPI___gte(String aaIPI___gte) {
            this.aaIPI___gte = aaIPI___gte;
            return this;
        }

        public Builder setAaIPI___contains(String aaIPI___contains) {
            this.aaIPI___contains = aaIPI___contains;
            return this;
        }

        public Builder setAaIPI___not___contains(String aaIPI___not___contains) {
            this.aaIPI___not___contains = aaIPI___not___contains;
            return this;
        }

        public Builder setAaIPI___starts_with(String aaIPI___starts_with) {
            this.aaIPI___starts_with = aaIPI___starts_with;
            return this;
        }

        public Builder setAaIPI___not___starts_with(String aaIPI___not___starts_with) {
            this.aaIPI___not___starts_with = aaIPI___not___starts_with;
            return this;
        }

        public Builder setAaIPI___ends_with(String aaIPI___ends_with) {
            this.aaIPI___ends_with = aaIPI___ends_with;
            return this;
        }

        public Builder setAaIPI___not___ends_with(String aaIPI___not___ends_with) {
            this.aaIPI___not___ends_with = aaIPI___not___ends_with;
            return this;
        }

        public Builder setAltro___eq(String altro___eq) {
            this.altro___eq = altro___eq;
            return this;
        }

        public Builder setAltro___ne(String altro___ne) {
            this.altro___ne = altro___ne;
            return this;
        }

        public Builder setAltro___null(Boolean altro___null) {
            this.altro___null = altro___null;
            return this;
        }

        public Builder setAltro___not___null(Boolean altro___not___null) {
            this.altro___not___null = altro___not___null;
            return this;
        }

        public Builder setAltro___in(java.util.List<String> altro___in) {
            this.altro___in = altro___in;
            return this;
        }

        public Builder setAltro___not___in(java.util.List<String> altro___not___in) {
            this.altro___not___in = altro___not___in;
            return this;
        }

        public Builder setAltro___lt(String altro___lt) {
            this.altro___lt = altro___lt;
            return this;
        }

        public Builder setAltro___lte(String altro___lte) {
            this.altro___lte = altro___lte;
            return this;
        }

        public Builder setAltro___gt(String altro___gt) {
            this.altro___gt = altro___gt;
            return this;
        }

        public Builder setAltro___gte(String altro___gte) {
            this.altro___gte = altro___gte;
            return this;
        }

        public Builder setAltro___contains(String altro___contains) {
            this.altro___contains = altro___contains;
            return this;
        }

        public Builder setAltro___not___contains(String altro___not___contains) {
            this.altro___not___contains = altro___not___contains;
            return this;
        }

        public Builder setAltro___starts_with(String altro___starts_with) {
            this.altro___starts_with = altro___starts_with;
            return this;
        }

        public Builder setAltro___not___starts_with(String altro___not___starts_with) {
            this.altro___not___starts_with = altro___not___starts_with;
            return this;
        }

        public Builder setAltro___ends_with(String altro___ends_with) {
            this.altro___ends_with = altro___ends_with;
            return this;
        }

        public Builder setAltro___not___ends_with(String altro___not___ends_with) {
            this.altro___not___ends_with = altro___not___ends_with;
            return this;
        }

        public Builder setAnamnesi___eq(Boolean anamnesi___eq) {
            this.anamnesi___eq = anamnesi___eq;
            return this;
        }

        public Builder setAnamnesi___ne(Boolean anamnesi___ne) {
            this.anamnesi___ne = anamnesi___ne;
            return this;
        }

        public Builder setAnamnesi___null(Boolean anamnesi___null) {
            this.anamnesi___null = anamnesi___null;
            return this;
        }

        public Builder setAnamnesi___not___null(Boolean anamnesi___not___null) {
            this.anamnesi___not___null = anamnesi___not___null;
            return this;
        }

        public Builder setC_dettaglio_id___eq(Integer c_dettaglio_id___eq) {
            this.c_dettaglio_id___eq = c_dettaglio_id___eq;
            return this;
        }

        public Builder setC_dettaglio_id___ne(Integer c_dettaglio_id___ne) {
            this.c_dettaglio_id___ne = c_dettaglio_id___ne;
            return this;
        }

        public Builder setC_dettaglio_id___null(Boolean c_dettaglio_id___null) {
            this.c_dettaglio_id___null = c_dettaglio_id___null;
            return this;
        }

        public Builder setC_dettaglio_id___not___null(Boolean c_dettaglio_id___not___null) {
            this.c_dettaglio_id___not___null = c_dettaglio_id___not___null;
            return this;
        }

        public Builder setC_dettaglio_id___in(java.util.List<Integer> c_dettaglio_id___in) {
            this.c_dettaglio_id___in = c_dettaglio_id___in;
            return this;
        }

        public Builder setC_dettaglio_id___not___in(java.util.List<Integer> c_dettaglio_id___not___in) {
            this.c_dettaglio_id___not___in = c_dettaglio_id___not___in;
            return this;
        }

        public Builder setC_dettaglio_id___lt(Integer c_dettaglio_id___lt) {
            this.c_dettaglio_id___lt = c_dettaglio_id___lt;
            return this;
        }

        public Builder setC_dettaglio_id___lte(Integer c_dettaglio_id___lte) {
            this.c_dettaglio_id___lte = c_dettaglio_id___lte;
            return this;
        }

        public Builder setC_dettaglio_id___gt(Integer c_dettaglio_id___gt) {
            this.c_dettaglio_id___gt = c_dettaglio_id___gt;
            return this;
        }

        public Builder setC_dettaglio_id___gte(Integer c_dettaglio_id___gte) {
            this.c_dettaglio_id___gte = c_dettaglio_id___gte;
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

        public Builder setDocumentazione_necessaria___eq(Boolean documentazione_necessaria___eq) {
            this.documentazione_necessaria___eq = documentazione_necessaria___eq;
            return this;
        }

        public Builder setDocumentazione_necessaria___ne(Boolean documentazione_necessaria___ne) {
            this.documentazione_necessaria___ne = documentazione_necessaria___ne;
            return this;
        }

        public Builder setDocumentazione_necessaria___null(Boolean documentazione_necessaria___null) {
            this.documentazione_necessaria___null = documentazione_necessaria___null;
            return this;
        }

        public Builder setDocumentazione_necessaria___not___null(Boolean documentazione_necessaria___not___null) {
            this.documentazione_necessaria___not___null = documentazione_necessaria___not___null;
            return this;
        }

        public Builder setEpisodio___eq(String episodio___eq) {
            this.episodio___eq = episodio___eq;
            return this;
        }

        public Builder setEpisodio___ne(String episodio___ne) {
            this.episodio___ne = episodio___ne;
            return this;
        }

        public Builder setEpisodio___null(Boolean episodio___null) {
            this.episodio___null = episodio___null;
            return this;
        }

        public Builder setEpisodio___not___null(Boolean episodio___not___null) {
            this.episodio___not___null = episodio___not___null;
            return this;
        }

        public Builder setEpisodio___in(java.util.List<String> episodio___in) {
            this.episodio___in = episodio___in;
            return this;
        }

        public Builder setEpisodio___not___in(java.util.List<String> episodio___not___in) {
            this.episodio___not___in = episodio___not___in;
            return this;
        }

        public Builder setEpisodio___lt(String episodio___lt) {
            this.episodio___lt = episodio___lt;
            return this;
        }

        public Builder setEpisodio___lte(String episodio___lte) {
            this.episodio___lte = episodio___lte;
            return this;
        }

        public Builder setEpisodio___gt(String episodio___gt) {
            this.episodio___gt = episodio___gt;
            return this;
        }

        public Builder setEpisodio___gte(String episodio___gte) {
            this.episodio___gte = episodio___gte;
            return this;
        }

        public Builder setEpisodio___contains(String episodio___contains) {
            this.episodio___contains = episodio___contains;
            return this;
        }

        public Builder setEpisodio___not___contains(String episodio___not___contains) {
            this.episodio___not___contains = episodio___not___contains;
            return this;
        }

        public Builder setEpisodio___starts_with(String episodio___starts_with) {
            this.episodio___starts_with = episodio___starts_with;
            return this;
        }

        public Builder setEpisodio___not___starts_with(String episodio___not___starts_with) {
            this.episodio___not___starts_with = episodio___not___starts_with;
            return this;
        }

        public Builder setEpisodio___ends_with(String episodio___ends_with) {
            this.episodio___ends_with = episodio___ends_with;
            return this;
        }

        public Builder setEpisodio___not___ends_with(String episodio___not___ends_with) {
            this.episodio___not___ends_with = episodio___not___ends_with;
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

        public Builder setMetodo_diagnosi_tumore___eq(String metodo_diagnosi_tumore___eq) {
            this.metodo_diagnosi_tumore___eq = metodo_diagnosi_tumore___eq;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___ne(String metodo_diagnosi_tumore___ne) {
            this.metodo_diagnosi_tumore___ne = metodo_diagnosi_tumore___ne;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___null(Boolean metodo_diagnosi_tumore___null) {
            this.metodo_diagnosi_tumore___null = metodo_diagnosi_tumore___null;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___not___null(Boolean metodo_diagnosi_tumore___not___null) {
            this.metodo_diagnosi_tumore___not___null = metodo_diagnosi_tumore___not___null;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___in(java.util.List<String> metodo_diagnosi_tumore___in) {
            this.metodo_diagnosi_tumore___in = metodo_diagnosi_tumore___in;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___not___in(java.util.List<String> metodo_diagnosi_tumore___not___in) {
            this.metodo_diagnosi_tumore___not___in = metodo_diagnosi_tumore___not___in;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___lt(String metodo_diagnosi_tumore___lt) {
            this.metodo_diagnosi_tumore___lt = metodo_diagnosi_tumore___lt;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___lte(String metodo_diagnosi_tumore___lte) {
            this.metodo_diagnosi_tumore___lte = metodo_diagnosi_tumore___lte;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___gt(String metodo_diagnosi_tumore___gt) {
            this.metodo_diagnosi_tumore___gt = metodo_diagnosi_tumore___gt;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___gte(String metodo_diagnosi_tumore___gte) {
            this.metodo_diagnosi_tumore___gte = metodo_diagnosi_tumore___gte;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___contains(String metodo_diagnosi_tumore___contains) {
            this.metodo_diagnosi_tumore___contains = metodo_diagnosi_tumore___contains;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___not___contains(String metodo_diagnosi_tumore___not___contains) {
            this.metodo_diagnosi_tumore___not___contains = metodo_diagnosi_tumore___not___contains;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___starts_with(String metodo_diagnosi_tumore___starts_with) {
            this.metodo_diagnosi_tumore___starts_with = metodo_diagnosi_tumore___starts_with;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___not___starts_with(String metodo_diagnosi_tumore___not___starts_with) {
            this.metodo_diagnosi_tumore___not___starts_with = metodo_diagnosi_tumore___not___starts_with;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___ends_with(String metodo_diagnosi_tumore___ends_with) {
            this.metodo_diagnosi_tumore___ends_with = metodo_diagnosi_tumore___ends_with;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore___not___ends_with(String metodo_diagnosi_tumore___not___ends_with) {
            this.metodo_diagnosi_tumore___not___ends_with = metodo_diagnosi_tumore___not___ends_with;
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

        public Builder setNome_patologia___eq(String nome_patologia___eq) {
            this.nome_patologia___eq = nome_patologia___eq;
            return this;
        }

        public Builder setNome_patologia___ne(String nome_patologia___ne) {
            this.nome_patologia___ne = nome_patologia___ne;
            return this;
        }

        public Builder setNome_patologia___null(Boolean nome_patologia___null) {
            this.nome_patologia___null = nome_patologia___null;
            return this;
        }

        public Builder setNome_patologia___not___null(Boolean nome_patologia___not___null) {
            this.nome_patologia___not___null = nome_patologia___not___null;
            return this;
        }

        public Builder setNome_patologia___in(java.util.List<String> nome_patologia___in) {
            this.nome_patologia___in = nome_patologia___in;
            return this;
        }

        public Builder setNome_patologia___not___in(java.util.List<String> nome_patologia___not___in) {
            this.nome_patologia___not___in = nome_patologia___not___in;
            return this;
        }

        public Builder setNome_patologia___lt(String nome_patologia___lt) {
            this.nome_patologia___lt = nome_patologia___lt;
            return this;
        }

        public Builder setNome_patologia___lte(String nome_patologia___lte) {
            this.nome_patologia___lte = nome_patologia___lte;
            return this;
        }

        public Builder setNome_patologia___gt(String nome_patologia___gt) {
            this.nome_patologia___gt = nome_patologia___gt;
            return this;
        }

        public Builder setNome_patologia___gte(String nome_patologia___gte) {
            this.nome_patologia___gte = nome_patologia___gte;
            return this;
        }

        public Builder setNome_patologia___contains(String nome_patologia___contains) {
            this.nome_patologia___contains = nome_patologia___contains;
            return this;
        }

        public Builder setNome_patologia___not___contains(String nome_patologia___not___contains) {
            this.nome_patologia___not___contains = nome_patologia___not___contains;
            return this;
        }

        public Builder setNome_patologia___starts_with(String nome_patologia___starts_with) {
            this.nome_patologia___starts_with = nome_patologia___starts_with;
            return this;
        }

        public Builder setNome_patologia___not___starts_with(String nome_patologia___not___starts_with) {
            this.nome_patologia___not___starts_with = nome_patologia___not___starts_with;
            return this;
        }

        public Builder setNome_patologia___ends_with(String nome_patologia___ends_with) {
            this.nome_patologia___ends_with = nome_patologia___ends_with;
            return this;
        }

        public Builder setNome_patologia___not___ends_with(String nome_patologia___not___ends_with) {
            this.nome_patologia___not___ends_with = nome_patologia___not___ends_with;
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

        public Builder setPaziente_o___eq(Integer paziente_o___eq) {
            this.paziente_o___eq = paziente_o___eq;
            return this;
        }

        public Builder setPaziente_o___ne(Integer paziente_o___ne) {
            this.paziente_o___ne = paziente_o___ne;
            return this;
        }

        public Builder setPaziente_o___null(Boolean paziente_o___null) {
            this.paziente_o___null = paziente_o___null;
            return this;
        }

        public Builder setPaziente_o___not___null(Boolean paziente_o___not___null) {
            this.paziente_o___not___null = paziente_o___not___null;
            return this;
        }

        public Builder setPaziente_o___in(java.util.List<Integer> paziente_o___in) {
            this.paziente_o___in = paziente_o___in;
            return this;
        }

        public Builder setPaziente_o___not___in(java.util.List<Integer> paziente_o___not___in) {
            this.paziente_o___not___in = paziente_o___not___in;
            return this;
        }

        public Builder setPaziente_o___lt(Integer paziente_o___lt) {
            this.paziente_o___lt = paziente_o___lt;
            return this;
        }

        public Builder setPaziente_o___lte(Integer paziente_o___lte) {
            this.paziente_o___lte = paziente_o___lte;
            return this;
        }

        public Builder setPaziente_o___gt(Integer paziente_o___gt) {
            this.paziente_o___gt = paziente_o___gt;
            return this;
        }

        public Builder setPaziente_o___gte(Integer paziente_o___gte) {
            this.paziente_o___gte = paziente_o___gte;
            return this;
        }

        public Builder setPerformance_status___eq(String performance_status___eq) {
            this.performance_status___eq = performance_status___eq;
            return this;
        }

        public Builder setPerformance_status___ne(String performance_status___ne) {
            this.performance_status___ne = performance_status___ne;
            return this;
        }

        public Builder setPerformance_status___null(Boolean performance_status___null) {
            this.performance_status___null = performance_status___null;
            return this;
        }

        public Builder setPerformance_status___not___null(Boolean performance_status___not___null) {
            this.performance_status___not___null = performance_status___not___null;
            return this;
        }

        public Builder setPerformance_status___in(java.util.List<String> performance_status___in) {
            this.performance_status___in = performance_status___in;
            return this;
        }

        public Builder setPerformance_status___not___in(java.util.List<String> performance_status___not___in) {
            this.performance_status___not___in = performance_status___not___in;
            return this;
        }

        public Builder setPerformance_status___lt(String performance_status___lt) {
            this.performance_status___lt = performance_status___lt;
            return this;
        }

        public Builder setPerformance_status___lte(String performance_status___lte) {
            this.performance_status___lte = performance_status___lte;
            return this;
        }

        public Builder setPerformance_status___gt(String performance_status___gt) {
            this.performance_status___gt = performance_status___gt;
            return this;
        }

        public Builder setPerformance_status___gte(String performance_status___gte) {
            this.performance_status___gte = performance_status___gte;
            return this;
        }

        public Builder setPerformance_status___contains(String performance_status___contains) {
            this.performance_status___contains = performance_status___contains;
            return this;
        }

        public Builder setPerformance_status___not___contains(String performance_status___not___contains) {
            this.performance_status___not___contains = performance_status___not___contains;
            return this;
        }

        public Builder setPerformance_status___starts_with(String performance_status___starts_with) {
            this.performance_status___starts_with = performance_status___starts_with;
            return this;
        }

        public Builder setPerformance_status___not___starts_with(String performance_status___not___starts_with) {
            this.performance_status___not___starts_with = performance_status___not___starts_with;
            return this;
        }

        public Builder setPerformance_status___ends_with(String performance_status___ends_with) {
            this.performance_status___ends_with = performance_status___ends_with;
            return this;
        }

        public Builder setPerformance_status___not___ends_with(String performance_status___not___ends_with) {
            this.performance_status___not___ends_with = performance_status___not___ends_with;
            return this;
        }

        public Builder setSiti_coinvolti_M___eq(String siti_coinvolti_M___eq) {
            this.siti_coinvolti_M___eq = siti_coinvolti_M___eq;
            return this;
        }

        public Builder setSiti_coinvolti_M___ne(String siti_coinvolti_M___ne) {
            this.siti_coinvolti_M___ne = siti_coinvolti_M___ne;
            return this;
        }

        public Builder setSiti_coinvolti_M___null(Boolean siti_coinvolti_M___null) {
            this.siti_coinvolti_M___null = siti_coinvolti_M___null;
            return this;
        }

        public Builder setSiti_coinvolti_M___not___null(Boolean siti_coinvolti_M___not___null) {
            this.siti_coinvolti_M___not___null = siti_coinvolti_M___not___null;
            return this;
        }

        public Builder setSiti_coinvolti_M___in(java.util.List<String> siti_coinvolti_M___in) {
            this.siti_coinvolti_M___in = siti_coinvolti_M___in;
            return this;
        }

        public Builder setSiti_coinvolti_M___not___in(java.util.List<String> siti_coinvolti_M___not___in) {
            this.siti_coinvolti_M___not___in = siti_coinvolti_M___not___in;
            return this;
        }

        public Builder setSiti_coinvolti_M___lt(String siti_coinvolti_M___lt) {
            this.siti_coinvolti_M___lt = siti_coinvolti_M___lt;
            return this;
        }

        public Builder setSiti_coinvolti_M___lte(String siti_coinvolti_M___lte) {
            this.siti_coinvolti_M___lte = siti_coinvolti_M___lte;
            return this;
        }

        public Builder setSiti_coinvolti_M___gt(String siti_coinvolti_M___gt) {
            this.siti_coinvolti_M___gt = siti_coinvolti_M___gt;
            return this;
        }

        public Builder setSiti_coinvolti_M___gte(String siti_coinvolti_M___gte) {
            this.siti_coinvolti_M___gte = siti_coinvolti_M___gte;
            return this;
        }

        public Builder setSiti_coinvolti_M___contains(String siti_coinvolti_M___contains) {
            this.siti_coinvolti_M___contains = siti_coinvolti_M___contains;
            return this;
        }

        public Builder setSiti_coinvolti_M___not___contains(String siti_coinvolti_M___not___contains) {
            this.siti_coinvolti_M___not___contains = siti_coinvolti_M___not___contains;
            return this;
        }

        public Builder setSiti_coinvolti_M___starts_with(String siti_coinvolti_M___starts_with) {
            this.siti_coinvolti_M___starts_with = siti_coinvolti_M___starts_with;
            return this;
        }

        public Builder setSiti_coinvolti_M___not___starts_with(String siti_coinvolti_M___not___starts_with) {
            this.siti_coinvolti_M___not___starts_with = siti_coinvolti_M___not___starts_with;
            return this;
        }

        public Builder setSiti_coinvolti_M___ends_with(String siti_coinvolti_M___ends_with) {
            this.siti_coinvolti_M___ends_with = siti_coinvolti_M___ends_with;
            return this;
        }

        public Builder setSiti_coinvolti_M___not___ends_with(String siti_coinvolti_M___not___ends_with) {
            this.siti_coinvolti_M___not___ends_with = siti_coinvolti_M___not___ends_with;
            return this;
        }

        public Builder setSiti_coinvolti_N___eq(String siti_coinvolti_N___eq) {
            this.siti_coinvolti_N___eq = siti_coinvolti_N___eq;
            return this;
        }

        public Builder setSiti_coinvolti_N___ne(String siti_coinvolti_N___ne) {
            this.siti_coinvolti_N___ne = siti_coinvolti_N___ne;
            return this;
        }

        public Builder setSiti_coinvolti_N___null(Boolean siti_coinvolti_N___null) {
            this.siti_coinvolti_N___null = siti_coinvolti_N___null;
            return this;
        }

        public Builder setSiti_coinvolti_N___not___null(Boolean siti_coinvolti_N___not___null) {
            this.siti_coinvolti_N___not___null = siti_coinvolti_N___not___null;
            return this;
        }

        public Builder setSiti_coinvolti_N___in(java.util.List<String> siti_coinvolti_N___in) {
            this.siti_coinvolti_N___in = siti_coinvolti_N___in;
            return this;
        }

        public Builder setSiti_coinvolti_N___not___in(java.util.List<String> siti_coinvolti_N___not___in) {
            this.siti_coinvolti_N___not___in = siti_coinvolti_N___not___in;
            return this;
        }

        public Builder setSiti_coinvolti_N___lt(String siti_coinvolti_N___lt) {
            this.siti_coinvolti_N___lt = siti_coinvolti_N___lt;
            return this;
        }

        public Builder setSiti_coinvolti_N___lte(String siti_coinvolti_N___lte) {
            this.siti_coinvolti_N___lte = siti_coinvolti_N___lte;
            return this;
        }

        public Builder setSiti_coinvolti_N___gt(String siti_coinvolti_N___gt) {
            this.siti_coinvolti_N___gt = siti_coinvolti_N___gt;
            return this;
        }

        public Builder setSiti_coinvolti_N___gte(String siti_coinvolti_N___gte) {
            this.siti_coinvolti_N___gte = siti_coinvolti_N___gte;
            return this;
        }

        public Builder setSiti_coinvolti_N___contains(String siti_coinvolti_N___contains) {
            this.siti_coinvolti_N___contains = siti_coinvolti_N___contains;
            return this;
        }

        public Builder setSiti_coinvolti_N___not___contains(String siti_coinvolti_N___not___contains) {
            this.siti_coinvolti_N___not___contains = siti_coinvolti_N___not___contains;
            return this;
        }

        public Builder setSiti_coinvolti_N___starts_with(String siti_coinvolti_N___starts_with) {
            this.siti_coinvolti_N___starts_with = siti_coinvolti_N___starts_with;
            return this;
        }

        public Builder setSiti_coinvolti_N___not___starts_with(String siti_coinvolti_N___not___starts_with) {
            this.siti_coinvolti_N___not___starts_with = siti_coinvolti_N___not___starts_with;
            return this;
        }

        public Builder setSiti_coinvolti_N___ends_with(String siti_coinvolti_N___ends_with) {
            this.siti_coinvolti_N___ends_with = siti_coinvolti_N___ends_with;
            return this;
        }

        public Builder setSiti_coinvolti_N___not___ends_with(String siti_coinvolti_N___not___ends_with) {
            this.siti_coinvolti_N___not___ends_with = siti_coinvolti_N___not___ends_with;
            return this;
        }

        public Builder setSiti_coinvolti_T___eq(String siti_coinvolti_T___eq) {
            this.siti_coinvolti_T___eq = siti_coinvolti_T___eq;
            return this;
        }

        public Builder setSiti_coinvolti_T___ne(String siti_coinvolti_T___ne) {
            this.siti_coinvolti_T___ne = siti_coinvolti_T___ne;
            return this;
        }

        public Builder setSiti_coinvolti_T___null(Boolean siti_coinvolti_T___null) {
            this.siti_coinvolti_T___null = siti_coinvolti_T___null;
            return this;
        }

        public Builder setSiti_coinvolti_T___not___null(Boolean siti_coinvolti_T___not___null) {
            this.siti_coinvolti_T___not___null = siti_coinvolti_T___not___null;
            return this;
        }

        public Builder setSiti_coinvolti_T___in(java.util.List<String> siti_coinvolti_T___in) {
            this.siti_coinvolti_T___in = siti_coinvolti_T___in;
            return this;
        }

        public Builder setSiti_coinvolti_T___not___in(java.util.List<String> siti_coinvolti_T___not___in) {
            this.siti_coinvolti_T___not___in = siti_coinvolti_T___not___in;
            return this;
        }

        public Builder setSiti_coinvolti_T___lt(String siti_coinvolti_T___lt) {
            this.siti_coinvolti_T___lt = siti_coinvolti_T___lt;
            return this;
        }

        public Builder setSiti_coinvolti_T___lte(String siti_coinvolti_T___lte) {
            this.siti_coinvolti_T___lte = siti_coinvolti_T___lte;
            return this;
        }

        public Builder setSiti_coinvolti_T___gt(String siti_coinvolti_T___gt) {
            this.siti_coinvolti_T___gt = siti_coinvolti_T___gt;
            return this;
        }

        public Builder setSiti_coinvolti_T___gte(String siti_coinvolti_T___gte) {
            this.siti_coinvolti_T___gte = siti_coinvolti_T___gte;
            return this;
        }

        public Builder setSiti_coinvolti_T___contains(String siti_coinvolti_T___contains) {
            this.siti_coinvolti_T___contains = siti_coinvolti_T___contains;
            return this;
        }

        public Builder setSiti_coinvolti_T___not___contains(String siti_coinvolti_T___not___contains) {
            this.siti_coinvolti_T___not___contains = siti_coinvolti_T___not___contains;
            return this;
        }

        public Builder setSiti_coinvolti_T___starts_with(String siti_coinvolti_T___starts_with) {
            this.siti_coinvolti_T___starts_with = siti_coinvolti_T___starts_with;
            return this;
        }

        public Builder setSiti_coinvolti_T___not___starts_with(String siti_coinvolti_T___not___starts_with) {
            this.siti_coinvolti_T___not___starts_with = siti_coinvolti_T___not___starts_with;
            return this;
        }

        public Builder setSiti_coinvolti_T___ends_with(String siti_coinvolti_T___ends_with) {
            this.siti_coinvolti_T___ends_with = siti_coinvolti_T___ends_with;
            return this;
        }

        public Builder setSiti_coinvolti_T___not___ends_with(String siti_coinvolti_T___not___ends_with) {
            this.siti_coinvolti_T___not___ends_with = siti_coinvolti_T___not___ends_with;
            return this;
        }

        public Builder setSpecifica_tumori___eq(Boolean specifica_tumori___eq) {
            this.specifica_tumori___eq = specifica_tumori___eq;
            return this;
        }

        public Builder setSpecifica_tumori___ne(Boolean specifica_tumori___ne) {
            this.specifica_tumori___ne = specifica_tumori___ne;
            return this;
        }

        public Builder setSpecifica_tumori___null(Boolean specifica_tumori___null) {
            this.specifica_tumori___null = specifica_tumori___null;
            return this;
        }

        public Builder setSpecifica_tumori___not___null(Boolean specifica_tumori___not___null) {
            this.specifica_tumori___not___null = specifica_tumori___not___null;
            return this;
        }

        public Builder setStadio_tumore___eq(String stadio_tumore___eq) {
            this.stadio_tumore___eq = stadio_tumore___eq;
            return this;
        }

        public Builder setStadio_tumore___ne(String stadio_tumore___ne) {
            this.stadio_tumore___ne = stadio_tumore___ne;
            return this;
        }

        public Builder setStadio_tumore___null(Boolean stadio_tumore___null) {
            this.stadio_tumore___null = stadio_tumore___null;
            return this;
        }

        public Builder setStadio_tumore___not___null(Boolean stadio_tumore___not___null) {
            this.stadio_tumore___not___null = stadio_tumore___not___null;
            return this;
        }

        public Builder setStadio_tumore___in(java.util.List<String> stadio_tumore___in) {
            this.stadio_tumore___in = stadio_tumore___in;
            return this;
        }

        public Builder setStadio_tumore___not___in(java.util.List<String> stadio_tumore___not___in) {
            this.stadio_tumore___not___in = stadio_tumore___not___in;
            return this;
        }

        public Builder setStadio_tumore___lt(String stadio_tumore___lt) {
            this.stadio_tumore___lt = stadio_tumore___lt;
            return this;
        }

        public Builder setStadio_tumore___lte(String stadio_tumore___lte) {
            this.stadio_tumore___lte = stadio_tumore___lte;
            return this;
        }

        public Builder setStadio_tumore___gt(String stadio_tumore___gt) {
            this.stadio_tumore___gt = stadio_tumore___gt;
            return this;
        }

        public Builder setStadio_tumore___gte(String stadio_tumore___gte) {
            this.stadio_tumore___gte = stadio_tumore___gte;
            return this;
        }

        public Builder setStadio_tumore___contains(String stadio_tumore___contains) {
            this.stadio_tumore___contains = stadio_tumore___contains;
            return this;
        }

        public Builder setStadio_tumore___not___contains(String stadio_tumore___not___contains) {
            this.stadio_tumore___not___contains = stadio_tumore___not___contains;
            return this;
        }

        public Builder setStadio_tumore___starts_with(String stadio_tumore___starts_with) {
            this.stadio_tumore___starts_with = stadio_tumore___starts_with;
            return this;
        }

        public Builder setStadio_tumore___not___starts_with(String stadio_tumore___not___starts_with) {
            this.stadio_tumore___not___starts_with = stadio_tumore___not___starts_with;
            return this;
        }

        public Builder setStadio_tumore___ends_with(String stadio_tumore___ends_with) {
            this.stadio_tumore___ends_with = stadio_tumore___ends_with;
            return this;
        }

        public Builder setStadio_tumore___not___ends_with(String stadio_tumore___not___ends_with) {
            this.stadio_tumore___not___ends_with = stadio_tumore___not___ends_with;
            return this;
        }

        public Builder setStato_accertamento___eq(String stato_accertamento___eq) {
            this.stato_accertamento___eq = stato_accertamento___eq;
            return this;
        }

        public Builder setStato_accertamento___ne(String stato_accertamento___ne) {
            this.stato_accertamento___ne = stato_accertamento___ne;
            return this;
        }

        public Builder setStato_accertamento___null(Boolean stato_accertamento___null) {
            this.stato_accertamento___null = stato_accertamento___null;
            return this;
        }

        public Builder setStato_accertamento___not___null(Boolean stato_accertamento___not___null) {
            this.stato_accertamento___not___null = stato_accertamento___not___null;
            return this;
        }

        public Builder setStato_accertamento___in(java.util.List<String> stato_accertamento___in) {
            this.stato_accertamento___in = stato_accertamento___in;
            return this;
        }

        public Builder setStato_accertamento___not___in(java.util.List<String> stato_accertamento___not___in) {
            this.stato_accertamento___not___in = stato_accertamento___not___in;
            return this;
        }

        public Builder setStato_accertamento___lt(String stato_accertamento___lt) {
            this.stato_accertamento___lt = stato_accertamento___lt;
            return this;
        }

        public Builder setStato_accertamento___lte(String stato_accertamento___lte) {
            this.stato_accertamento___lte = stato_accertamento___lte;
            return this;
        }

        public Builder setStato_accertamento___gt(String stato_accertamento___gt) {
            this.stato_accertamento___gt = stato_accertamento___gt;
            return this;
        }

        public Builder setStato_accertamento___gte(String stato_accertamento___gte) {
            this.stato_accertamento___gte = stato_accertamento___gte;
            return this;
        }

        public Builder setStato_accertamento___contains(String stato_accertamento___contains) {
            this.stato_accertamento___contains = stato_accertamento___contains;
            return this;
        }

        public Builder setStato_accertamento___not___contains(String stato_accertamento___not___contains) {
            this.stato_accertamento___not___contains = stato_accertamento___not___contains;
            return this;
        }

        public Builder setStato_accertamento___starts_with(String stato_accertamento___starts_with) {
            this.stato_accertamento___starts_with = stato_accertamento___starts_with;
            return this;
        }

        public Builder setStato_accertamento___not___starts_with(String stato_accertamento___not___starts_with) {
            this.stato_accertamento___not___starts_with = stato_accertamento___not___starts_with;
            return this;
        }

        public Builder setStato_accertamento___ends_with(String stato_accertamento___ends_with) {
            this.stato_accertamento___ends_with = stato_accertamento___ends_with;
            return this;
        }

        public Builder setStato_accertamento___not___ends_with(String stato_accertamento___not___ends_with) {
            this.stato_accertamento___not___ends_with = stato_accertamento___not___ends_with;
            return this;
        }

        public Builder setTipo_imaging___eq(String tipo_imaging___eq) {
            this.tipo_imaging___eq = tipo_imaging___eq;
            return this;
        }

        public Builder setTipo_imaging___ne(String tipo_imaging___ne) {
            this.tipo_imaging___ne = tipo_imaging___ne;
            return this;
        }

        public Builder setTipo_imaging___null(Boolean tipo_imaging___null) {
            this.tipo_imaging___null = tipo_imaging___null;
            return this;
        }

        public Builder setTipo_imaging___not___null(Boolean tipo_imaging___not___null) {
            this.tipo_imaging___not___null = tipo_imaging___not___null;
            return this;
        }

        public Builder setTipo_imaging___in(java.util.List<String> tipo_imaging___in) {
            this.tipo_imaging___in = tipo_imaging___in;
            return this;
        }

        public Builder setTipo_imaging___not___in(java.util.List<String> tipo_imaging___not___in) {
            this.tipo_imaging___not___in = tipo_imaging___not___in;
            return this;
        }

        public Builder setTipo_imaging___lt(String tipo_imaging___lt) {
            this.tipo_imaging___lt = tipo_imaging___lt;
            return this;
        }

        public Builder setTipo_imaging___lte(String tipo_imaging___lte) {
            this.tipo_imaging___lte = tipo_imaging___lte;
            return this;
        }

        public Builder setTipo_imaging___gt(String tipo_imaging___gt) {
            this.tipo_imaging___gt = tipo_imaging___gt;
            return this;
        }

        public Builder setTipo_imaging___gte(String tipo_imaging___gte) {
            this.tipo_imaging___gte = tipo_imaging___gte;
            return this;
        }

        public Builder setTipo_imaging___contains(String tipo_imaging___contains) {
            this.tipo_imaging___contains = tipo_imaging___contains;
            return this;
        }

        public Builder setTipo_imaging___not___contains(String tipo_imaging___not___contains) {
            this.tipo_imaging___not___contains = tipo_imaging___not___contains;
            return this;
        }

        public Builder setTipo_imaging___starts_with(String tipo_imaging___starts_with) {
            this.tipo_imaging___starts_with = tipo_imaging___starts_with;
            return this;
        }

        public Builder setTipo_imaging___not___starts_with(String tipo_imaging___not___starts_with) {
            this.tipo_imaging___not___starts_with = tipo_imaging___not___starts_with;
            return this;
        }

        public Builder setTipo_imaging___ends_with(String tipo_imaging___ends_with) {
            this.tipo_imaging___ends_with = tipo_imaging___ends_with;
            return this;
        }

        public Builder setTipo_imaging___not___ends_with(String tipo_imaging___not___ends_with) {
            this.tipo_imaging___not___ends_with = tipo_imaging___not___ends_with;
            return this;
        }

        public Builder setWarning_respond___eq(Boolean warning_respond___eq) {
            this.warning_respond___eq = warning_respond___eq;
            return this;
        }

        public Builder setWarning_respond___ne(Boolean warning_respond___ne) {
            this.warning_respond___ne = warning_respond___ne;
            return this;
        }

        public Builder setWarning_respond___null(Boolean warning_respond___null) {
            this.warning_respond___null = warning_respond___null;
            return this;
        }

        public Builder setWarning_respond___not___null(Boolean warning_respond___not___null) {
            this.warning_respond___not___null = warning_respond___not___null;
            return this;
        }

        public Builder setAND(java.util.List<CliEventoFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliEventoFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliEventoFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliEventoFilterDTO build() {
            CliEventoFilterDTO result = new CliEventoFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.setIPI___eq(this.IPI___eq);
            result.setIPI___ne(this.IPI___ne);
            result.setIPI___null(this.IPI___null);
            result.setIPI___not___null(this.IPI___not___null);
            result.setIPI___in(this.IPI___in);
            result.setIPI___not___in(this.IPI___not___in);
            result.setIPI___lt(this.IPI___lt);
            result.setIPI___lte(this.IPI___lte);
            result.setIPI___gt(this.IPI___gt);
            result.setIPI___gte(this.IPI___gte);
            result.setIPI___contains(this.IPI___contains);
            result.setIPI___not___contains(this.IPI___not___contains);
            result.setIPI___starts_with(this.IPI___starts_with);
            result.setIPI___not___starts_with(this.IPI___not___starts_with);
            result.setIPI___ends_with(this.IPI___ends_with);
            result.setIPI___not___ends_with(this.IPI___not___ends_with);
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
            result.setAaIPI___eq(this.aaIPI___eq);
            result.setAaIPI___ne(this.aaIPI___ne);
            result.setAaIPI___null(this.aaIPI___null);
            result.setAaIPI___not___null(this.aaIPI___not___null);
            result.setAaIPI___in(this.aaIPI___in);
            result.setAaIPI___not___in(this.aaIPI___not___in);
            result.setAaIPI___lt(this.aaIPI___lt);
            result.setAaIPI___lte(this.aaIPI___lte);
            result.setAaIPI___gt(this.aaIPI___gt);
            result.setAaIPI___gte(this.aaIPI___gte);
            result.setAaIPI___contains(this.aaIPI___contains);
            result.setAaIPI___not___contains(this.aaIPI___not___contains);
            result.setAaIPI___starts_with(this.aaIPI___starts_with);
            result.setAaIPI___not___starts_with(this.aaIPI___not___starts_with);
            result.setAaIPI___ends_with(this.aaIPI___ends_with);
            result.setAaIPI___not___ends_with(this.aaIPI___not___ends_with);
            result.setAltro___eq(this.altro___eq);
            result.setAltro___ne(this.altro___ne);
            result.setAltro___null(this.altro___null);
            result.setAltro___not___null(this.altro___not___null);
            result.setAltro___in(this.altro___in);
            result.setAltro___not___in(this.altro___not___in);
            result.setAltro___lt(this.altro___lt);
            result.setAltro___lte(this.altro___lte);
            result.setAltro___gt(this.altro___gt);
            result.setAltro___gte(this.altro___gte);
            result.setAltro___contains(this.altro___contains);
            result.setAltro___not___contains(this.altro___not___contains);
            result.setAltro___starts_with(this.altro___starts_with);
            result.setAltro___not___starts_with(this.altro___not___starts_with);
            result.setAltro___ends_with(this.altro___ends_with);
            result.setAltro___not___ends_with(this.altro___not___ends_with);
            result.setAnamnesi___eq(this.anamnesi___eq);
            result.setAnamnesi___ne(this.anamnesi___ne);
            result.setAnamnesi___null(this.anamnesi___null);
            result.setAnamnesi___not___null(this.anamnesi___not___null);
            result.setC_dettaglio_id___eq(this.c_dettaglio_id___eq);
            result.setC_dettaglio_id___ne(this.c_dettaglio_id___ne);
            result.setC_dettaglio_id___null(this.c_dettaglio_id___null);
            result.setC_dettaglio_id___not___null(this.c_dettaglio_id___not___null);
            result.setC_dettaglio_id___in(this.c_dettaglio_id___in);
            result.setC_dettaglio_id___not___in(this.c_dettaglio_id___not___in);
            result.setC_dettaglio_id___lt(this.c_dettaglio_id___lt);
            result.setC_dettaglio_id___lte(this.c_dettaglio_id___lte);
            result.setC_dettaglio_id___gt(this.c_dettaglio_id___gt);
            result.setC_dettaglio_id___gte(this.c_dettaglio_id___gte);
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
            result.setDocumentazione_necessaria___eq(this.documentazione_necessaria___eq);
            result.setDocumentazione_necessaria___ne(this.documentazione_necessaria___ne);
            result.setDocumentazione_necessaria___null(this.documentazione_necessaria___null);
            result.setDocumentazione_necessaria___not___null(this.documentazione_necessaria___not___null);
            result.setEpisodio___eq(this.episodio___eq);
            result.setEpisodio___ne(this.episodio___ne);
            result.setEpisodio___null(this.episodio___null);
            result.setEpisodio___not___null(this.episodio___not___null);
            result.setEpisodio___in(this.episodio___in);
            result.setEpisodio___not___in(this.episodio___not___in);
            result.setEpisodio___lt(this.episodio___lt);
            result.setEpisodio___lte(this.episodio___lte);
            result.setEpisodio___gt(this.episodio___gt);
            result.setEpisodio___gte(this.episodio___gte);
            result.setEpisodio___contains(this.episodio___contains);
            result.setEpisodio___not___contains(this.episodio___not___contains);
            result.setEpisodio___starts_with(this.episodio___starts_with);
            result.setEpisodio___not___starts_with(this.episodio___not___starts_with);
            result.setEpisodio___ends_with(this.episodio___ends_with);
            result.setEpisodio___not___ends_with(this.episodio___not___ends_with);
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
            result.setMetodo_diagnosi_tumore___eq(this.metodo_diagnosi_tumore___eq);
            result.setMetodo_diagnosi_tumore___ne(this.metodo_diagnosi_tumore___ne);
            result.setMetodo_diagnosi_tumore___null(this.metodo_diagnosi_tumore___null);
            result.setMetodo_diagnosi_tumore___not___null(this.metodo_diagnosi_tumore___not___null);
            result.setMetodo_diagnosi_tumore___in(this.metodo_diagnosi_tumore___in);
            result.setMetodo_diagnosi_tumore___not___in(this.metodo_diagnosi_tumore___not___in);
            result.setMetodo_diagnosi_tumore___lt(this.metodo_diagnosi_tumore___lt);
            result.setMetodo_diagnosi_tumore___lte(this.metodo_diagnosi_tumore___lte);
            result.setMetodo_diagnosi_tumore___gt(this.metodo_diagnosi_tumore___gt);
            result.setMetodo_diagnosi_tumore___gte(this.metodo_diagnosi_tumore___gte);
            result.setMetodo_diagnosi_tumore___contains(this.metodo_diagnosi_tumore___contains);
            result.setMetodo_diagnosi_tumore___not___contains(this.metodo_diagnosi_tumore___not___contains);
            result.setMetodo_diagnosi_tumore___starts_with(this.metodo_diagnosi_tumore___starts_with);
            result.setMetodo_diagnosi_tumore___not___starts_with(this.metodo_diagnosi_tumore___not___starts_with);
            result.setMetodo_diagnosi_tumore___ends_with(this.metodo_diagnosi_tumore___ends_with);
            result.setMetodo_diagnosi_tumore___not___ends_with(this.metodo_diagnosi_tumore___not___ends_with);
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
            result.setNome_patologia___eq(this.nome_patologia___eq);
            result.setNome_patologia___ne(this.nome_patologia___ne);
            result.setNome_patologia___null(this.nome_patologia___null);
            result.setNome_patologia___not___null(this.nome_patologia___not___null);
            result.setNome_patologia___in(this.nome_patologia___in);
            result.setNome_patologia___not___in(this.nome_patologia___not___in);
            result.setNome_patologia___lt(this.nome_patologia___lt);
            result.setNome_patologia___lte(this.nome_patologia___lte);
            result.setNome_patologia___gt(this.nome_patologia___gt);
            result.setNome_patologia___gte(this.nome_patologia___gte);
            result.setNome_patologia___contains(this.nome_patologia___contains);
            result.setNome_patologia___not___contains(this.nome_patologia___not___contains);
            result.setNome_patologia___starts_with(this.nome_patologia___starts_with);
            result.setNome_patologia___not___starts_with(this.nome_patologia___not___starts_with);
            result.setNome_patologia___ends_with(this.nome_patologia___ends_with);
            result.setNome_patologia___not___ends_with(this.nome_patologia___not___ends_with);
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
            result.setPaziente_o___eq(this.paziente_o___eq);
            result.setPaziente_o___ne(this.paziente_o___ne);
            result.setPaziente_o___null(this.paziente_o___null);
            result.setPaziente_o___not___null(this.paziente_o___not___null);
            result.setPaziente_o___in(this.paziente_o___in);
            result.setPaziente_o___not___in(this.paziente_o___not___in);
            result.setPaziente_o___lt(this.paziente_o___lt);
            result.setPaziente_o___lte(this.paziente_o___lte);
            result.setPaziente_o___gt(this.paziente_o___gt);
            result.setPaziente_o___gte(this.paziente_o___gte);
            result.setPerformance_status___eq(this.performance_status___eq);
            result.setPerformance_status___ne(this.performance_status___ne);
            result.setPerformance_status___null(this.performance_status___null);
            result.setPerformance_status___not___null(this.performance_status___not___null);
            result.setPerformance_status___in(this.performance_status___in);
            result.setPerformance_status___not___in(this.performance_status___not___in);
            result.setPerformance_status___lt(this.performance_status___lt);
            result.setPerformance_status___lte(this.performance_status___lte);
            result.setPerformance_status___gt(this.performance_status___gt);
            result.setPerformance_status___gte(this.performance_status___gte);
            result.setPerformance_status___contains(this.performance_status___contains);
            result.setPerformance_status___not___contains(this.performance_status___not___contains);
            result.setPerformance_status___starts_with(this.performance_status___starts_with);
            result.setPerformance_status___not___starts_with(this.performance_status___not___starts_with);
            result.setPerformance_status___ends_with(this.performance_status___ends_with);
            result.setPerformance_status___not___ends_with(this.performance_status___not___ends_with);
            result.setSiti_coinvolti_M___eq(this.siti_coinvolti_M___eq);
            result.setSiti_coinvolti_M___ne(this.siti_coinvolti_M___ne);
            result.setSiti_coinvolti_M___null(this.siti_coinvolti_M___null);
            result.setSiti_coinvolti_M___not___null(this.siti_coinvolti_M___not___null);
            result.setSiti_coinvolti_M___in(this.siti_coinvolti_M___in);
            result.setSiti_coinvolti_M___not___in(this.siti_coinvolti_M___not___in);
            result.setSiti_coinvolti_M___lt(this.siti_coinvolti_M___lt);
            result.setSiti_coinvolti_M___lte(this.siti_coinvolti_M___lte);
            result.setSiti_coinvolti_M___gt(this.siti_coinvolti_M___gt);
            result.setSiti_coinvolti_M___gte(this.siti_coinvolti_M___gte);
            result.setSiti_coinvolti_M___contains(this.siti_coinvolti_M___contains);
            result.setSiti_coinvolti_M___not___contains(this.siti_coinvolti_M___not___contains);
            result.setSiti_coinvolti_M___starts_with(this.siti_coinvolti_M___starts_with);
            result.setSiti_coinvolti_M___not___starts_with(this.siti_coinvolti_M___not___starts_with);
            result.setSiti_coinvolti_M___ends_with(this.siti_coinvolti_M___ends_with);
            result.setSiti_coinvolti_M___not___ends_with(this.siti_coinvolti_M___not___ends_with);
            result.setSiti_coinvolti_N___eq(this.siti_coinvolti_N___eq);
            result.setSiti_coinvolti_N___ne(this.siti_coinvolti_N___ne);
            result.setSiti_coinvolti_N___null(this.siti_coinvolti_N___null);
            result.setSiti_coinvolti_N___not___null(this.siti_coinvolti_N___not___null);
            result.setSiti_coinvolti_N___in(this.siti_coinvolti_N___in);
            result.setSiti_coinvolti_N___not___in(this.siti_coinvolti_N___not___in);
            result.setSiti_coinvolti_N___lt(this.siti_coinvolti_N___lt);
            result.setSiti_coinvolti_N___lte(this.siti_coinvolti_N___lte);
            result.setSiti_coinvolti_N___gt(this.siti_coinvolti_N___gt);
            result.setSiti_coinvolti_N___gte(this.siti_coinvolti_N___gte);
            result.setSiti_coinvolti_N___contains(this.siti_coinvolti_N___contains);
            result.setSiti_coinvolti_N___not___contains(this.siti_coinvolti_N___not___contains);
            result.setSiti_coinvolti_N___starts_with(this.siti_coinvolti_N___starts_with);
            result.setSiti_coinvolti_N___not___starts_with(this.siti_coinvolti_N___not___starts_with);
            result.setSiti_coinvolti_N___ends_with(this.siti_coinvolti_N___ends_with);
            result.setSiti_coinvolti_N___not___ends_with(this.siti_coinvolti_N___not___ends_with);
            result.setSiti_coinvolti_T___eq(this.siti_coinvolti_T___eq);
            result.setSiti_coinvolti_T___ne(this.siti_coinvolti_T___ne);
            result.setSiti_coinvolti_T___null(this.siti_coinvolti_T___null);
            result.setSiti_coinvolti_T___not___null(this.siti_coinvolti_T___not___null);
            result.setSiti_coinvolti_T___in(this.siti_coinvolti_T___in);
            result.setSiti_coinvolti_T___not___in(this.siti_coinvolti_T___not___in);
            result.setSiti_coinvolti_T___lt(this.siti_coinvolti_T___lt);
            result.setSiti_coinvolti_T___lte(this.siti_coinvolti_T___lte);
            result.setSiti_coinvolti_T___gt(this.siti_coinvolti_T___gt);
            result.setSiti_coinvolti_T___gte(this.siti_coinvolti_T___gte);
            result.setSiti_coinvolti_T___contains(this.siti_coinvolti_T___contains);
            result.setSiti_coinvolti_T___not___contains(this.siti_coinvolti_T___not___contains);
            result.setSiti_coinvolti_T___starts_with(this.siti_coinvolti_T___starts_with);
            result.setSiti_coinvolti_T___not___starts_with(this.siti_coinvolti_T___not___starts_with);
            result.setSiti_coinvolti_T___ends_with(this.siti_coinvolti_T___ends_with);
            result.setSiti_coinvolti_T___not___ends_with(this.siti_coinvolti_T___not___ends_with);
            result.setSpecifica_tumori___eq(this.specifica_tumori___eq);
            result.setSpecifica_tumori___ne(this.specifica_tumori___ne);
            result.setSpecifica_tumori___null(this.specifica_tumori___null);
            result.setSpecifica_tumori___not___null(this.specifica_tumori___not___null);
            result.setStadio_tumore___eq(this.stadio_tumore___eq);
            result.setStadio_tumore___ne(this.stadio_tumore___ne);
            result.setStadio_tumore___null(this.stadio_tumore___null);
            result.setStadio_tumore___not___null(this.stadio_tumore___not___null);
            result.setStadio_tumore___in(this.stadio_tumore___in);
            result.setStadio_tumore___not___in(this.stadio_tumore___not___in);
            result.setStadio_tumore___lt(this.stadio_tumore___lt);
            result.setStadio_tumore___lte(this.stadio_tumore___lte);
            result.setStadio_tumore___gt(this.stadio_tumore___gt);
            result.setStadio_tumore___gte(this.stadio_tumore___gte);
            result.setStadio_tumore___contains(this.stadio_tumore___contains);
            result.setStadio_tumore___not___contains(this.stadio_tumore___not___contains);
            result.setStadio_tumore___starts_with(this.stadio_tumore___starts_with);
            result.setStadio_tumore___not___starts_with(this.stadio_tumore___not___starts_with);
            result.setStadio_tumore___ends_with(this.stadio_tumore___ends_with);
            result.setStadio_tumore___not___ends_with(this.stadio_tumore___not___ends_with);
            result.setStato_accertamento___eq(this.stato_accertamento___eq);
            result.setStato_accertamento___ne(this.stato_accertamento___ne);
            result.setStato_accertamento___null(this.stato_accertamento___null);
            result.setStato_accertamento___not___null(this.stato_accertamento___not___null);
            result.setStato_accertamento___in(this.stato_accertamento___in);
            result.setStato_accertamento___not___in(this.stato_accertamento___not___in);
            result.setStato_accertamento___lt(this.stato_accertamento___lt);
            result.setStato_accertamento___lte(this.stato_accertamento___lte);
            result.setStato_accertamento___gt(this.stato_accertamento___gt);
            result.setStato_accertamento___gte(this.stato_accertamento___gte);
            result.setStato_accertamento___contains(this.stato_accertamento___contains);
            result.setStato_accertamento___not___contains(this.stato_accertamento___not___contains);
            result.setStato_accertamento___starts_with(this.stato_accertamento___starts_with);
            result.setStato_accertamento___not___starts_with(this.stato_accertamento___not___starts_with);
            result.setStato_accertamento___ends_with(this.stato_accertamento___ends_with);
            result.setStato_accertamento___not___ends_with(this.stato_accertamento___not___ends_with);
            result.setTipo_imaging___eq(this.tipo_imaging___eq);
            result.setTipo_imaging___ne(this.tipo_imaging___ne);
            result.setTipo_imaging___null(this.tipo_imaging___null);
            result.setTipo_imaging___not___null(this.tipo_imaging___not___null);
            result.setTipo_imaging___in(this.tipo_imaging___in);
            result.setTipo_imaging___not___in(this.tipo_imaging___not___in);
            result.setTipo_imaging___lt(this.tipo_imaging___lt);
            result.setTipo_imaging___lte(this.tipo_imaging___lte);
            result.setTipo_imaging___gt(this.tipo_imaging___gt);
            result.setTipo_imaging___gte(this.tipo_imaging___gte);
            result.setTipo_imaging___contains(this.tipo_imaging___contains);
            result.setTipo_imaging___not___contains(this.tipo_imaging___not___contains);
            result.setTipo_imaging___starts_with(this.tipo_imaging___starts_with);
            result.setTipo_imaging___not___starts_with(this.tipo_imaging___not___starts_with);
            result.setTipo_imaging___ends_with(this.tipo_imaging___ends_with);
            result.setTipo_imaging___not___ends_with(this.tipo_imaging___not___ends_with);
            result.setWarning_respond___eq(this.warning_respond___eq);
            result.setWarning_respond___ne(this.warning_respond___ne);
            result.setWarning_respond___null(this.warning_respond___null);
            result.setWarning_respond___not___null(this.warning_respond___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
