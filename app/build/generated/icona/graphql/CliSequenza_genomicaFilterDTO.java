package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Sequenza_genomica.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliSequenza_genomicaFilterDTO implements java.io.Serializable {

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
    private String altro_centro___eq;
    private String altro_centro___ne;
    private Boolean altro_centro___null;
    private Boolean altro_centro___not___null;
    private java.util.List<String> altro_centro___in;
    private java.util.List<String> altro_centro___not___in;
    private String altro_centro___lt;
    private String altro_centro___lte;
    private String altro_centro___gt;
    private String altro_centro___gte;
    private String altro_centro___contains;
    private String altro_centro___not___contains;
    private String altro_centro___starts_with;
    private String altro_centro___not___starts_with;
    private String altro_centro___ends_with;
    private String altro_centro___not___ends_with;
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
    private String codice_paziente___eq;
    private String codice_paziente___ne;
    private Boolean codice_paziente___null;
    private Boolean codice_paziente___not___null;
    private java.util.List<String> codice_paziente___in;
    private java.util.List<String> codice_paziente___not___in;
    private String codice_paziente___lt;
    private String codice_paziente___lte;
    private String codice_paziente___gt;
    private String codice_paziente___gte;
    private String codice_paziente___contains;
    private String codice_paziente___not___contains;
    private String codice_paziente___starts_with;
    private String codice_paziente___not___starts_with;
    private String codice_paziente___ends_with;
    private String codice_paziente___not___ends_with;
    private String data_analisi___eq;
    private String data_analisi___ne;
    private Boolean data_analisi___null;
    private Boolean data_analisi___not___null;
    private java.util.List<String> data_analisi___in;
    private java.util.List<String> data_analisi___not___in;
    private String data_analisi___lt;
    private String data_analisi___lte;
    private String data_analisi___gt;
    private String data_analisi___gte;
    private String data_prelievo___eq;
    private String data_prelievo___ne;
    private Boolean data_prelievo___null;
    private Boolean data_prelievo___not___null;
    private java.util.List<String> data_prelievo___in;
    private java.util.List<String> data_prelievo___not___in;
    private String data_prelievo___lt;
    private String data_prelievo___lte;
    private String data_prelievo___gt;
    private String data_prelievo___gte;
    private String effettuato_su___eq;
    private String effettuato_su___ne;
    private Boolean effettuato_su___null;
    private Boolean effettuato_su___not___null;
    private java.util.List<String> effettuato_su___in;
    private java.util.List<String> effettuato_su___not___in;
    private String effettuato_su___lt;
    private String effettuato_su___lte;
    private String effettuato_su___gt;
    private String effettuato_su___gte;
    private String effettuato_su___contains;
    private String effettuato_su___not___contains;
    private String effettuato_su___starts_with;
    private String effettuato_su___not___starts_with;
    private String effettuato_su___ends_with;
    private String effettuato_su___not___ends_with;
    private String elenco_mutazioni_ENV___eq;
    private String elenco_mutazioni_ENV___ne;
    private Boolean elenco_mutazioni_ENV___null;
    private Boolean elenco_mutazioni_ENV___not___null;
    private java.util.List<String> elenco_mutazioni_ENV___in;
    private java.util.List<String> elenco_mutazioni_ENV___not___in;
    private String elenco_mutazioni_ENV___lt;
    private String elenco_mutazioni_ENV___lte;
    private String elenco_mutazioni_ENV___gt;
    private String elenco_mutazioni_ENV___gte;
    private String elenco_mutazioni_ENV___contains;
    private String elenco_mutazioni_ENV___not___contains;
    private String elenco_mutazioni_ENV___starts_with;
    private String elenco_mutazioni_ENV___not___starts_with;
    private String elenco_mutazioni_ENV___ends_with;
    private String elenco_mutazioni_ENV___not___ends_with;
    private String elenco_mutazioni_INT___eq;
    private String elenco_mutazioni_INT___ne;
    private Boolean elenco_mutazioni_INT___null;
    private Boolean elenco_mutazioni_INT___not___null;
    private java.util.List<String> elenco_mutazioni_INT___in;
    private java.util.List<String> elenco_mutazioni_INT___not___in;
    private String elenco_mutazioni_INT___lt;
    private String elenco_mutazioni_INT___lte;
    private String elenco_mutazioni_INT___gt;
    private String elenco_mutazioni_INT___gte;
    private String elenco_mutazioni_INT___contains;
    private String elenco_mutazioni_INT___not___contains;
    private String elenco_mutazioni_INT___starts_with;
    private String elenco_mutazioni_INT___not___starts_with;
    private String elenco_mutazioni_INT___ends_with;
    private String elenco_mutazioni_INT___not___ends_with;
    private String elenco_mutazioni_PR___eq;
    private String elenco_mutazioni_PR___ne;
    private Boolean elenco_mutazioni_PR___null;
    private Boolean elenco_mutazioni_PR___not___null;
    private java.util.List<String> elenco_mutazioni_PR___in;
    private java.util.List<String> elenco_mutazioni_PR___not___in;
    private String elenco_mutazioni_PR___lt;
    private String elenco_mutazioni_PR___lte;
    private String elenco_mutazioni_PR___gt;
    private String elenco_mutazioni_PR___gte;
    private String elenco_mutazioni_PR___contains;
    private String elenco_mutazioni_PR___not___contains;
    private String elenco_mutazioni_PR___starts_with;
    private String elenco_mutazioni_PR___not___starts_with;
    private String elenco_mutazioni_PR___ends_with;
    private String elenco_mutazioni_PR___not___ends_with;
    private String elenco_mutazioni_RT___eq;
    private String elenco_mutazioni_RT___ne;
    private Boolean elenco_mutazioni_RT___null;
    private Boolean elenco_mutazioni_RT___not___null;
    private java.util.List<String> elenco_mutazioni_RT___in;
    private java.util.List<String> elenco_mutazioni_RT___not___in;
    private String elenco_mutazioni_RT___lt;
    private String elenco_mutazioni_RT___lte;
    private String elenco_mutazioni_RT___gt;
    private String elenco_mutazioni_RT___gte;
    private String elenco_mutazioni_RT___contains;
    private String elenco_mutazioni_RT___not___contains;
    private String elenco_mutazioni_RT___starts_with;
    private String elenco_mutazioni_RT___not___starts_with;
    private String elenco_mutazioni_RT___ends_with;
    private String elenco_mutazioni_RT___not___ends_with;
    private String elenco_mutazioni_V3___eq;
    private String elenco_mutazioni_V3___ne;
    private Boolean elenco_mutazioni_V3___null;
    private Boolean elenco_mutazioni_V3___not___null;
    private java.util.List<String> elenco_mutazioni_V3___in;
    private java.util.List<String> elenco_mutazioni_V3___not___in;
    private String elenco_mutazioni_V3___lt;
    private String elenco_mutazioni_V3___lte;
    private String elenco_mutazioni_V3___gt;
    private String elenco_mutazioni_V3___gte;
    private String elenco_mutazioni_V3___contains;
    private String elenco_mutazioni_V3___not___contains;
    private String elenco_mutazioni_V3___starts_with;
    private String elenco_mutazioni_V3___not___starts_with;
    private String elenco_mutazioni_V3___ends_with;
    private String elenco_mutazioni_V3___not___ends_with;
    private String etichetta___eq;
    private String etichetta___ne;
    private Boolean etichetta___null;
    private Boolean etichetta___not___null;
    private java.util.List<String> etichetta___in;
    private java.util.List<String> etichetta___not___in;
    private String etichetta___lt;
    private String etichetta___lte;
    private String etichetta___gt;
    private String etichetta___gte;
    private String etichetta___contains;
    private String etichetta___not___contains;
    private String etichetta___starts_with;
    private String etichetta___not___starts_with;
    private String etichetta___ends_with;
    private String etichetta___not___ends_with;
    private String filtro_codice_paziente___eq;
    private String filtro_codice_paziente___ne;
    private Boolean filtro_codice_paziente___null;
    private Boolean filtro_codice_paziente___not___null;
    private java.util.List<String> filtro_codice_paziente___in;
    private java.util.List<String> filtro_codice_paziente___not___in;
    private String filtro_codice_paziente___lt;
    private String filtro_codice_paziente___lte;
    private String filtro_codice_paziente___gt;
    private String filtro_codice_paziente___gte;
    private String filtro_codice_paziente___contains;
    private String filtro_codice_paziente___not___contains;
    private String filtro_codice_paziente___starts_with;
    private String filtro_codice_paziente___not___starts_with;
    private String filtro_codice_paziente___ends_with;
    private String filtro_codice_paziente___not___ends_with;
    private Integer mutazioni___eq;
    private Integer mutazioni___ne;
    private Boolean mutazioni___null;
    private Boolean mutazioni___not___null;
    private java.util.List<Integer> mutazioni___in;
    private java.util.List<Integer> mutazioni___not___in;
    private Integer mutazioni___lt;
    private Integer mutazioni___lte;
    private Integer mutazioni___gt;
    private Integer mutazioni___gte;
    private String mutazioni_no_farmaco___eq;
    private String mutazioni_no_farmaco___ne;
    private Boolean mutazioni_no_farmaco___null;
    private Boolean mutazioni_no_farmaco___not___null;
    private java.util.List<String> mutazioni_no_farmaco___in;
    private java.util.List<String> mutazioni_no_farmaco___not___in;
    private String mutazioni_no_farmaco___lt;
    private String mutazioni_no_farmaco___lte;
    private String mutazioni_no_farmaco___gt;
    private String mutazioni_no_farmaco___gte;
    private String mutazioni_no_farmaco___contains;
    private String mutazioni_no_farmaco___not___contains;
    private String mutazioni_no_farmaco___starts_with;
    private String mutazioni_no_farmaco___not___starts_with;
    private String mutazioni_no_farmaco___ends_with;
    private String mutazioni_no_farmaco___not___ends_with;
    private Boolean nessuna_mutazione_ENV___eq;
    private Boolean nessuna_mutazione_ENV___ne;
    private Boolean nessuna_mutazione_ENV___null;
    private Boolean nessuna_mutazione_ENV___not___null;
    private Boolean nessuna_mutazione_INT___eq;
    private Boolean nessuna_mutazione_INT___ne;
    private Boolean nessuna_mutazione_INT___null;
    private Boolean nessuna_mutazione_INT___not___null;
    private Boolean nessuna_mutazione_PR___eq;
    private Boolean nessuna_mutazione_PR___ne;
    private Boolean nessuna_mutazione_PR___null;
    private Boolean nessuna_mutazione_PR___not___null;
    private Boolean nessuna_mutazione_RT___eq;
    private Boolean nessuna_mutazione_RT___ne;
    private Boolean nessuna_mutazione_RT___null;
    private Boolean nessuna_mutazione_RT___not___null;
    private Boolean nessuna_mutazione_V3___eq;
    private Boolean nessuna_mutazione_V3___ne;
    private Boolean nessuna_mutazione_V3___null;
    private Boolean nessuna_mutazione_V3___not___null;
    private String nucleotidi___eq;
    private String nucleotidi___ne;
    private Boolean nucleotidi___null;
    private Boolean nucleotidi___not___null;
    private java.util.List<String> nucleotidi___in;
    private java.util.List<String> nucleotidi___not___in;
    private String nucleotidi___lt;
    private String nucleotidi___lte;
    private String nucleotidi___gt;
    private String nucleotidi___gte;
    private String nucleotidi___contains;
    private String nucleotidi___not___contains;
    private String nucleotidi___starts_with;
    private String nucleotidi___not___starts_with;
    private String nucleotidi___ends_with;
    private String nucleotidi___not___ends_with;
    private String regione___eq;
    private String regione___ne;
    private Boolean regione___null;
    private Boolean regione___not___null;
    private java.util.List<String> regione___in;
    private java.util.List<String> regione___not___in;
    private String regione___lt;
    private String regione___lte;
    private String regione___gt;
    private String regione___gte;
    private String regione___contains;
    private String regione___not___contains;
    private String regione___starts_with;
    private String regione___not___starts_with;
    private String regione___ends_with;
    private String regione___not___ends_with;
    private String sottotipo___eq;
    private String sottotipo___ne;
    private Boolean sottotipo___null;
    private Boolean sottotipo___not___null;
    private java.util.List<String> sottotipo___in;
    private java.util.List<String> sottotipo___not___in;
    private String sottotipo___lt;
    private String sottotipo___lte;
    private String sottotipo___gt;
    private String sottotipo___gte;
    private String sottotipo___contains;
    private String sottotipo___not___contains;
    private String sottotipo___starts_with;
    private String sottotipo___not___starts_with;
    private String sottotipo___ends_with;
    private String sottotipo___not___ends_with;
    private String tipo_sequenza___eq;
    private String tipo_sequenza___ne;
    private Boolean tipo_sequenza___null;
    private Boolean tipo_sequenza___not___null;
    private java.util.List<String> tipo_sequenza___in;
    private java.util.List<String> tipo_sequenza___not___in;
    private String tipo_sequenza___lt;
    private String tipo_sequenza___lte;
    private String tipo_sequenza___gt;
    private String tipo_sequenza___gte;
    private String tipo_sequenza___contains;
    private String tipo_sequenza___not___contains;
    private String tipo_sequenza___starts_with;
    private String tipo_sequenza___not___starts_with;
    private String tipo_sequenza___ends_with;
    private String tipo_sequenza___not___ends_with;
    private java.util.List<CliSequenza_genomicaFilterDTO> AND;
    private java.util.List<CliSequenza_genomicaFilterDTO> OR;
    private CliSequenza_genomicaFilterDTO NOT;

    public CliSequenza_genomicaFilterDTO() {
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

    public String getAltro_centro___eq() {
        return altro_centro___eq;
    }
    public void setAltro_centro___eq(String altro_centro___eq) {
        this.altro_centro___eq = altro_centro___eq;
    }

    public String getAltro_centro___ne() {
        return altro_centro___ne;
    }
    public void setAltro_centro___ne(String altro_centro___ne) {
        this.altro_centro___ne = altro_centro___ne;
    }

    public Boolean getAltro_centro___null() {
        return altro_centro___null;
    }
    public void setAltro_centro___null(Boolean altro_centro___null) {
        this.altro_centro___null = altro_centro___null;
    }

    public Boolean getAltro_centro___not___null() {
        return altro_centro___not___null;
    }
    public void setAltro_centro___not___null(Boolean altro_centro___not___null) {
        this.altro_centro___not___null = altro_centro___not___null;
    }

    public java.util.List<String> getAltro_centro___in() {
        return altro_centro___in;
    }
    public void setAltro_centro___in(java.util.List<String> altro_centro___in) {
        this.altro_centro___in = altro_centro___in;
    }

    public java.util.List<String> getAltro_centro___not___in() {
        return altro_centro___not___in;
    }
    public void setAltro_centro___not___in(java.util.List<String> altro_centro___not___in) {
        this.altro_centro___not___in = altro_centro___not___in;
    }

    public String getAltro_centro___lt() {
        return altro_centro___lt;
    }
    public void setAltro_centro___lt(String altro_centro___lt) {
        this.altro_centro___lt = altro_centro___lt;
    }

    public String getAltro_centro___lte() {
        return altro_centro___lte;
    }
    public void setAltro_centro___lte(String altro_centro___lte) {
        this.altro_centro___lte = altro_centro___lte;
    }

    public String getAltro_centro___gt() {
        return altro_centro___gt;
    }
    public void setAltro_centro___gt(String altro_centro___gt) {
        this.altro_centro___gt = altro_centro___gt;
    }

    public String getAltro_centro___gte() {
        return altro_centro___gte;
    }
    public void setAltro_centro___gte(String altro_centro___gte) {
        this.altro_centro___gte = altro_centro___gte;
    }

    public String getAltro_centro___contains() {
        return altro_centro___contains;
    }
    public void setAltro_centro___contains(String altro_centro___contains) {
        this.altro_centro___contains = altro_centro___contains;
    }

    public String getAltro_centro___not___contains() {
        return altro_centro___not___contains;
    }
    public void setAltro_centro___not___contains(String altro_centro___not___contains) {
        this.altro_centro___not___contains = altro_centro___not___contains;
    }

    public String getAltro_centro___starts_with() {
        return altro_centro___starts_with;
    }
    public void setAltro_centro___starts_with(String altro_centro___starts_with) {
        this.altro_centro___starts_with = altro_centro___starts_with;
    }

    public String getAltro_centro___not___starts_with() {
        return altro_centro___not___starts_with;
    }
    public void setAltro_centro___not___starts_with(String altro_centro___not___starts_with) {
        this.altro_centro___not___starts_with = altro_centro___not___starts_with;
    }

    public String getAltro_centro___ends_with() {
        return altro_centro___ends_with;
    }
    public void setAltro_centro___ends_with(String altro_centro___ends_with) {
        this.altro_centro___ends_with = altro_centro___ends_with;
    }

    public String getAltro_centro___not___ends_with() {
        return altro_centro___not___ends_with;
    }
    public void setAltro_centro___not___ends_with(String altro_centro___not___ends_with) {
        this.altro_centro___not___ends_with = altro_centro___not___ends_with;
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

    public String getCodice_paziente___eq() {
        return codice_paziente___eq;
    }
    public void setCodice_paziente___eq(String codice_paziente___eq) {
        this.codice_paziente___eq = codice_paziente___eq;
    }

    public String getCodice_paziente___ne() {
        return codice_paziente___ne;
    }
    public void setCodice_paziente___ne(String codice_paziente___ne) {
        this.codice_paziente___ne = codice_paziente___ne;
    }

    public Boolean getCodice_paziente___null() {
        return codice_paziente___null;
    }
    public void setCodice_paziente___null(Boolean codice_paziente___null) {
        this.codice_paziente___null = codice_paziente___null;
    }

    public Boolean getCodice_paziente___not___null() {
        return codice_paziente___not___null;
    }
    public void setCodice_paziente___not___null(Boolean codice_paziente___not___null) {
        this.codice_paziente___not___null = codice_paziente___not___null;
    }

    public java.util.List<String> getCodice_paziente___in() {
        return codice_paziente___in;
    }
    public void setCodice_paziente___in(java.util.List<String> codice_paziente___in) {
        this.codice_paziente___in = codice_paziente___in;
    }

    public java.util.List<String> getCodice_paziente___not___in() {
        return codice_paziente___not___in;
    }
    public void setCodice_paziente___not___in(java.util.List<String> codice_paziente___not___in) {
        this.codice_paziente___not___in = codice_paziente___not___in;
    }

    public String getCodice_paziente___lt() {
        return codice_paziente___lt;
    }
    public void setCodice_paziente___lt(String codice_paziente___lt) {
        this.codice_paziente___lt = codice_paziente___lt;
    }

    public String getCodice_paziente___lte() {
        return codice_paziente___lte;
    }
    public void setCodice_paziente___lte(String codice_paziente___lte) {
        this.codice_paziente___lte = codice_paziente___lte;
    }

    public String getCodice_paziente___gt() {
        return codice_paziente___gt;
    }
    public void setCodice_paziente___gt(String codice_paziente___gt) {
        this.codice_paziente___gt = codice_paziente___gt;
    }

    public String getCodice_paziente___gte() {
        return codice_paziente___gte;
    }
    public void setCodice_paziente___gte(String codice_paziente___gte) {
        this.codice_paziente___gte = codice_paziente___gte;
    }

    public String getCodice_paziente___contains() {
        return codice_paziente___contains;
    }
    public void setCodice_paziente___contains(String codice_paziente___contains) {
        this.codice_paziente___contains = codice_paziente___contains;
    }

    public String getCodice_paziente___not___contains() {
        return codice_paziente___not___contains;
    }
    public void setCodice_paziente___not___contains(String codice_paziente___not___contains) {
        this.codice_paziente___not___contains = codice_paziente___not___contains;
    }

    public String getCodice_paziente___starts_with() {
        return codice_paziente___starts_with;
    }
    public void setCodice_paziente___starts_with(String codice_paziente___starts_with) {
        this.codice_paziente___starts_with = codice_paziente___starts_with;
    }

    public String getCodice_paziente___not___starts_with() {
        return codice_paziente___not___starts_with;
    }
    public void setCodice_paziente___not___starts_with(String codice_paziente___not___starts_with) {
        this.codice_paziente___not___starts_with = codice_paziente___not___starts_with;
    }

    public String getCodice_paziente___ends_with() {
        return codice_paziente___ends_with;
    }
    public void setCodice_paziente___ends_with(String codice_paziente___ends_with) {
        this.codice_paziente___ends_with = codice_paziente___ends_with;
    }

    public String getCodice_paziente___not___ends_with() {
        return codice_paziente___not___ends_with;
    }
    public void setCodice_paziente___not___ends_with(String codice_paziente___not___ends_with) {
        this.codice_paziente___not___ends_with = codice_paziente___not___ends_with;
    }

    public String getData_analisi___eq() {
        return data_analisi___eq;
    }
    public void setData_analisi___eq(String data_analisi___eq) {
        this.data_analisi___eq = data_analisi___eq;
    }

    public String getData_analisi___ne() {
        return data_analisi___ne;
    }
    public void setData_analisi___ne(String data_analisi___ne) {
        this.data_analisi___ne = data_analisi___ne;
    }

    public Boolean getData_analisi___null() {
        return data_analisi___null;
    }
    public void setData_analisi___null(Boolean data_analisi___null) {
        this.data_analisi___null = data_analisi___null;
    }

    public Boolean getData_analisi___not___null() {
        return data_analisi___not___null;
    }
    public void setData_analisi___not___null(Boolean data_analisi___not___null) {
        this.data_analisi___not___null = data_analisi___not___null;
    }

    public java.util.List<String> getData_analisi___in() {
        return data_analisi___in;
    }
    public void setData_analisi___in(java.util.List<String> data_analisi___in) {
        this.data_analisi___in = data_analisi___in;
    }

    public java.util.List<String> getData_analisi___not___in() {
        return data_analisi___not___in;
    }
    public void setData_analisi___not___in(java.util.List<String> data_analisi___not___in) {
        this.data_analisi___not___in = data_analisi___not___in;
    }

    public String getData_analisi___lt() {
        return data_analisi___lt;
    }
    public void setData_analisi___lt(String data_analisi___lt) {
        this.data_analisi___lt = data_analisi___lt;
    }

    public String getData_analisi___lte() {
        return data_analisi___lte;
    }
    public void setData_analisi___lte(String data_analisi___lte) {
        this.data_analisi___lte = data_analisi___lte;
    }

    public String getData_analisi___gt() {
        return data_analisi___gt;
    }
    public void setData_analisi___gt(String data_analisi___gt) {
        this.data_analisi___gt = data_analisi___gt;
    }

    public String getData_analisi___gte() {
        return data_analisi___gte;
    }
    public void setData_analisi___gte(String data_analisi___gte) {
        this.data_analisi___gte = data_analisi___gte;
    }

    public String getData_prelievo___eq() {
        return data_prelievo___eq;
    }
    public void setData_prelievo___eq(String data_prelievo___eq) {
        this.data_prelievo___eq = data_prelievo___eq;
    }

    public String getData_prelievo___ne() {
        return data_prelievo___ne;
    }
    public void setData_prelievo___ne(String data_prelievo___ne) {
        this.data_prelievo___ne = data_prelievo___ne;
    }

    public Boolean getData_prelievo___null() {
        return data_prelievo___null;
    }
    public void setData_prelievo___null(Boolean data_prelievo___null) {
        this.data_prelievo___null = data_prelievo___null;
    }

    public Boolean getData_prelievo___not___null() {
        return data_prelievo___not___null;
    }
    public void setData_prelievo___not___null(Boolean data_prelievo___not___null) {
        this.data_prelievo___not___null = data_prelievo___not___null;
    }

    public java.util.List<String> getData_prelievo___in() {
        return data_prelievo___in;
    }
    public void setData_prelievo___in(java.util.List<String> data_prelievo___in) {
        this.data_prelievo___in = data_prelievo___in;
    }

    public java.util.List<String> getData_prelievo___not___in() {
        return data_prelievo___not___in;
    }
    public void setData_prelievo___not___in(java.util.List<String> data_prelievo___not___in) {
        this.data_prelievo___not___in = data_prelievo___not___in;
    }

    public String getData_prelievo___lt() {
        return data_prelievo___lt;
    }
    public void setData_prelievo___lt(String data_prelievo___lt) {
        this.data_prelievo___lt = data_prelievo___lt;
    }

    public String getData_prelievo___lte() {
        return data_prelievo___lte;
    }
    public void setData_prelievo___lte(String data_prelievo___lte) {
        this.data_prelievo___lte = data_prelievo___lte;
    }

    public String getData_prelievo___gt() {
        return data_prelievo___gt;
    }
    public void setData_prelievo___gt(String data_prelievo___gt) {
        this.data_prelievo___gt = data_prelievo___gt;
    }

    public String getData_prelievo___gte() {
        return data_prelievo___gte;
    }
    public void setData_prelievo___gte(String data_prelievo___gte) {
        this.data_prelievo___gte = data_prelievo___gte;
    }

    public String getEffettuato_su___eq() {
        return effettuato_su___eq;
    }
    public void setEffettuato_su___eq(String effettuato_su___eq) {
        this.effettuato_su___eq = effettuato_su___eq;
    }

    public String getEffettuato_su___ne() {
        return effettuato_su___ne;
    }
    public void setEffettuato_su___ne(String effettuato_su___ne) {
        this.effettuato_su___ne = effettuato_su___ne;
    }

    public Boolean getEffettuato_su___null() {
        return effettuato_su___null;
    }
    public void setEffettuato_su___null(Boolean effettuato_su___null) {
        this.effettuato_su___null = effettuato_su___null;
    }

    public Boolean getEffettuato_su___not___null() {
        return effettuato_su___not___null;
    }
    public void setEffettuato_su___not___null(Boolean effettuato_su___not___null) {
        this.effettuato_su___not___null = effettuato_su___not___null;
    }

    public java.util.List<String> getEffettuato_su___in() {
        return effettuato_su___in;
    }
    public void setEffettuato_su___in(java.util.List<String> effettuato_su___in) {
        this.effettuato_su___in = effettuato_su___in;
    }

    public java.util.List<String> getEffettuato_su___not___in() {
        return effettuato_su___not___in;
    }
    public void setEffettuato_su___not___in(java.util.List<String> effettuato_su___not___in) {
        this.effettuato_su___not___in = effettuato_su___not___in;
    }

    public String getEffettuato_su___lt() {
        return effettuato_su___lt;
    }
    public void setEffettuato_su___lt(String effettuato_su___lt) {
        this.effettuato_su___lt = effettuato_su___lt;
    }

    public String getEffettuato_su___lte() {
        return effettuato_su___lte;
    }
    public void setEffettuato_su___lte(String effettuato_su___lte) {
        this.effettuato_su___lte = effettuato_su___lte;
    }

    public String getEffettuato_su___gt() {
        return effettuato_su___gt;
    }
    public void setEffettuato_su___gt(String effettuato_su___gt) {
        this.effettuato_su___gt = effettuato_su___gt;
    }

    public String getEffettuato_su___gte() {
        return effettuato_su___gte;
    }
    public void setEffettuato_su___gte(String effettuato_su___gte) {
        this.effettuato_su___gte = effettuato_su___gte;
    }

    public String getEffettuato_su___contains() {
        return effettuato_su___contains;
    }
    public void setEffettuato_su___contains(String effettuato_su___contains) {
        this.effettuato_su___contains = effettuato_su___contains;
    }

    public String getEffettuato_su___not___contains() {
        return effettuato_su___not___contains;
    }
    public void setEffettuato_su___not___contains(String effettuato_su___not___contains) {
        this.effettuato_su___not___contains = effettuato_su___not___contains;
    }

    public String getEffettuato_su___starts_with() {
        return effettuato_su___starts_with;
    }
    public void setEffettuato_su___starts_with(String effettuato_su___starts_with) {
        this.effettuato_su___starts_with = effettuato_su___starts_with;
    }

    public String getEffettuato_su___not___starts_with() {
        return effettuato_su___not___starts_with;
    }
    public void setEffettuato_su___not___starts_with(String effettuato_su___not___starts_with) {
        this.effettuato_su___not___starts_with = effettuato_su___not___starts_with;
    }

    public String getEffettuato_su___ends_with() {
        return effettuato_su___ends_with;
    }
    public void setEffettuato_su___ends_with(String effettuato_su___ends_with) {
        this.effettuato_su___ends_with = effettuato_su___ends_with;
    }

    public String getEffettuato_su___not___ends_with() {
        return effettuato_su___not___ends_with;
    }
    public void setEffettuato_su___not___ends_with(String effettuato_su___not___ends_with) {
        this.effettuato_su___not___ends_with = effettuato_su___not___ends_with;
    }

    public String getElenco_mutazioni_ENV___eq() {
        return elenco_mutazioni_ENV___eq;
    }
    public void setElenco_mutazioni_ENV___eq(String elenco_mutazioni_ENV___eq) {
        this.elenco_mutazioni_ENV___eq = elenco_mutazioni_ENV___eq;
    }

    public String getElenco_mutazioni_ENV___ne() {
        return elenco_mutazioni_ENV___ne;
    }
    public void setElenco_mutazioni_ENV___ne(String elenco_mutazioni_ENV___ne) {
        this.elenco_mutazioni_ENV___ne = elenco_mutazioni_ENV___ne;
    }

    public Boolean getElenco_mutazioni_ENV___null() {
        return elenco_mutazioni_ENV___null;
    }
    public void setElenco_mutazioni_ENV___null(Boolean elenco_mutazioni_ENV___null) {
        this.elenco_mutazioni_ENV___null = elenco_mutazioni_ENV___null;
    }

    public Boolean getElenco_mutazioni_ENV___not___null() {
        return elenco_mutazioni_ENV___not___null;
    }
    public void setElenco_mutazioni_ENV___not___null(Boolean elenco_mutazioni_ENV___not___null) {
        this.elenco_mutazioni_ENV___not___null = elenco_mutazioni_ENV___not___null;
    }

    public java.util.List<String> getElenco_mutazioni_ENV___in() {
        return elenco_mutazioni_ENV___in;
    }
    public void setElenco_mutazioni_ENV___in(java.util.List<String> elenco_mutazioni_ENV___in) {
        this.elenco_mutazioni_ENV___in = elenco_mutazioni_ENV___in;
    }

    public java.util.List<String> getElenco_mutazioni_ENV___not___in() {
        return elenco_mutazioni_ENV___not___in;
    }
    public void setElenco_mutazioni_ENV___not___in(java.util.List<String> elenco_mutazioni_ENV___not___in) {
        this.elenco_mutazioni_ENV___not___in = elenco_mutazioni_ENV___not___in;
    }

    public String getElenco_mutazioni_ENV___lt() {
        return elenco_mutazioni_ENV___lt;
    }
    public void setElenco_mutazioni_ENV___lt(String elenco_mutazioni_ENV___lt) {
        this.elenco_mutazioni_ENV___lt = elenco_mutazioni_ENV___lt;
    }

    public String getElenco_mutazioni_ENV___lte() {
        return elenco_mutazioni_ENV___lte;
    }
    public void setElenco_mutazioni_ENV___lte(String elenco_mutazioni_ENV___lte) {
        this.elenco_mutazioni_ENV___lte = elenco_mutazioni_ENV___lte;
    }

    public String getElenco_mutazioni_ENV___gt() {
        return elenco_mutazioni_ENV___gt;
    }
    public void setElenco_mutazioni_ENV___gt(String elenco_mutazioni_ENV___gt) {
        this.elenco_mutazioni_ENV___gt = elenco_mutazioni_ENV___gt;
    }

    public String getElenco_mutazioni_ENV___gte() {
        return elenco_mutazioni_ENV___gte;
    }
    public void setElenco_mutazioni_ENV___gte(String elenco_mutazioni_ENV___gte) {
        this.elenco_mutazioni_ENV___gte = elenco_mutazioni_ENV___gte;
    }

    public String getElenco_mutazioni_ENV___contains() {
        return elenco_mutazioni_ENV___contains;
    }
    public void setElenco_mutazioni_ENV___contains(String elenco_mutazioni_ENV___contains) {
        this.elenco_mutazioni_ENV___contains = elenco_mutazioni_ENV___contains;
    }

    public String getElenco_mutazioni_ENV___not___contains() {
        return elenco_mutazioni_ENV___not___contains;
    }
    public void setElenco_mutazioni_ENV___not___contains(String elenco_mutazioni_ENV___not___contains) {
        this.elenco_mutazioni_ENV___not___contains = elenco_mutazioni_ENV___not___contains;
    }

    public String getElenco_mutazioni_ENV___starts_with() {
        return elenco_mutazioni_ENV___starts_with;
    }
    public void setElenco_mutazioni_ENV___starts_with(String elenco_mutazioni_ENV___starts_with) {
        this.elenco_mutazioni_ENV___starts_with = elenco_mutazioni_ENV___starts_with;
    }

    public String getElenco_mutazioni_ENV___not___starts_with() {
        return elenco_mutazioni_ENV___not___starts_with;
    }
    public void setElenco_mutazioni_ENV___not___starts_with(String elenco_mutazioni_ENV___not___starts_with) {
        this.elenco_mutazioni_ENV___not___starts_with = elenco_mutazioni_ENV___not___starts_with;
    }

    public String getElenco_mutazioni_ENV___ends_with() {
        return elenco_mutazioni_ENV___ends_with;
    }
    public void setElenco_mutazioni_ENV___ends_with(String elenco_mutazioni_ENV___ends_with) {
        this.elenco_mutazioni_ENV___ends_with = elenco_mutazioni_ENV___ends_with;
    }

    public String getElenco_mutazioni_ENV___not___ends_with() {
        return elenco_mutazioni_ENV___not___ends_with;
    }
    public void setElenco_mutazioni_ENV___not___ends_with(String elenco_mutazioni_ENV___not___ends_with) {
        this.elenco_mutazioni_ENV___not___ends_with = elenco_mutazioni_ENV___not___ends_with;
    }

    public String getElenco_mutazioni_INT___eq() {
        return elenco_mutazioni_INT___eq;
    }
    public void setElenco_mutazioni_INT___eq(String elenco_mutazioni_INT___eq) {
        this.elenco_mutazioni_INT___eq = elenco_mutazioni_INT___eq;
    }

    public String getElenco_mutazioni_INT___ne() {
        return elenco_mutazioni_INT___ne;
    }
    public void setElenco_mutazioni_INT___ne(String elenco_mutazioni_INT___ne) {
        this.elenco_mutazioni_INT___ne = elenco_mutazioni_INT___ne;
    }

    public Boolean getElenco_mutazioni_INT___null() {
        return elenco_mutazioni_INT___null;
    }
    public void setElenco_mutazioni_INT___null(Boolean elenco_mutazioni_INT___null) {
        this.elenco_mutazioni_INT___null = elenco_mutazioni_INT___null;
    }

    public Boolean getElenco_mutazioni_INT___not___null() {
        return elenco_mutazioni_INT___not___null;
    }
    public void setElenco_mutazioni_INT___not___null(Boolean elenco_mutazioni_INT___not___null) {
        this.elenco_mutazioni_INT___not___null = elenco_mutazioni_INT___not___null;
    }

    public java.util.List<String> getElenco_mutazioni_INT___in() {
        return elenco_mutazioni_INT___in;
    }
    public void setElenco_mutazioni_INT___in(java.util.List<String> elenco_mutazioni_INT___in) {
        this.elenco_mutazioni_INT___in = elenco_mutazioni_INT___in;
    }

    public java.util.List<String> getElenco_mutazioni_INT___not___in() {
        return elenco_mutazioni_INT___not___in;
    }
    public void setElenco_mutazioni_INT___not___in(java.util.List<String> elenco_mutazioni_INT___not___in) {
        this.elenco_mutazioni_INT___not___in = elenco_mutazioni_INT___not___in;
    }

    public String getElenco_mutazioni_INT___lt() {
        return elenco_mutazioni_INT___lt;
    }
    public void setElenco_mutazioni_INT___lt(String elenco_mutazioni_INT___lt) {
        this.elenco_mutazioni_INT___lt = elenco_mutazioni_INT___lt;
    }

    public String getElenco_mutazioni_INT___lte() {
        return elenco_mutazioni_INT___lte;
    }
    public void setElenco_mutazioni_INT___lte(String elenco_mutazioni_INT___lte) {
        this.elenco_mutazioni_INT___lte = elenco_mutazioni_INT___lte;
    }

    public String getElenco_mutazioni_INT___gt() {
        return elenco_mutazioni_INT___gt;
    }
    public void setElenco_mutazioni_INT___gt(String elenco_mutazioni_INT___gt) {
        this.elenco_mutazioni_INT___gt = elenco_mutazioni_INT___gt;
    }

    public String getElenco_mutazioni_INT___gte() {
        return elenco_mutazioni_INT___gte;
    }
    public void setElenco_mutazioni_INT___gte(String elenco_mutazioni_INT___gte) {
        this.elenco_mutazioni_INT___gte = elenco_mutazioni_INT___gte;
    }

    public String getElenco_mutazioni_INT___contains() {
        return elenco_mutazioni_INT___contains;
    }
    public void setElenco_mutazioni_INT___contains(String elenco_mutazioni_INT___contains) {
        this.elenco_mutazioni_INT___contains = elenco_mutazioni_INT___contains;
    }

    public String getElenco_mutazioni_INT___not___contains() {
        return elenco_mutazioni_INT___not___contains;
    }
    public void setElenco_mutazioni_INT___not___contains(String elenco_mutazioni_INT___not___contains) {
        this.elenco_mutazioni_INT___not___contains = elenco_mutazioni_INT___not___contains;
    }

    public String getElenco_mutazioni_INT___starts_with() {
        return elenco_mutazioni_INT___starts_with;
    }
    public void setElenco_mutazioni_INT___starts_with(String elenco_mutazioni_INT___starts_with) {
        this.elenco_mutazioni_INT___starts_with = elenco_mutazioni_INT___starts_with;
    }

    public String getElenco_mutazioni_INT___not___starts_with() {
        return elenco_mutazioni_INT___not___starts_with;
    }
    public void setElenco_mutazioni_INT___not___starts_with(String elenco_mutazioni_INT___not___starts_with) {
        this.elenco_mutazioni_INT___not___starts_with = elenco_mutazioni_INT___not___starts_with;
    }

    public String getElenco_mutazioni_INT___ends_with() {
        return elenco_mutazioni_INT___ends_with;
    }
    public void setElenco_mutazioni_INT___ends_with(String elenco_mutazioni_INT___ends_with) {
        this.elenco_mutazioni_INT___ends_with = elenco_mutazioni_INT___ends_with;
    }

    public String getElenco_mutazioni_INT___not___ends_with() {
        return elenco_mutazioni_INT___not___ends_with;
    }
    public void setElenco_mutazioni_INT___not___ends_with(String elenco_mutazioni_INT___not___ends_with) {
        this.elenco_mutazioni_INT___not___ends_with = elenco_mutazioni_INT___not___ends_with;
    }

    public String getElenco_mutazioni_PR___eq() {
        return elenco_mutazioni_PR___eq;
    }
    public void setElenco_mutazioni_PR___eq(String elenco_mutazioni_PR___eq) {
        this.elenco_mutazioni_PR___eq = elenco_mutazioni_PR___eq;
    }

    public String getElenco_mutazioni_PR___ne() {
        return elenco_mutazioni_PR___ne;
    }
    public void setElenco_mutazioni_PR___ne(String elenco_mutazioni_PR___ne) {
        this.elenco_mutazioni_PR___ne = elenco_mutazioni_PR___ne;
    }

    public Boolean getElenco_mutazioni_PR___null() {
        return elenco_mutazioni_PR___null;
    }
    public void setElenco_mutazioni_PR___null(Boolean elenco_mutazioni_PR___null) {
        this.elenco_mutazioni_PR___null = elenco_mutazioni_PR___null;
    }

    public Boolean getElenco_mutazioni_PR___not___null() {
        return elenco_mutazioni_PR___not___null;
    }
    public void setElenco_mutazioni_PR___not___null(Boolean elenco_mutazioni_PR___not___null) {
        this.elenco_mutazioni_PR___not___null = elenco_mutazioni_PR___not___null;
    }

    public java.util.List<String> getElenco_mutazioni_PR___in() {
        return elenco_mutazioni_PR___in;
    }
    public void setElenco_mutazioni_PR___in(java.util.List<String> elenco_mutazioni_PR___in) {
        this.elenco_mutazioni_PR___in = elenco_mutazioni_PR___in;
    }

    public java.util.List<String> getElenco_mutazioni_PR___not___in() {
        return elenco_mutazioni_PR___not___in;
    }
    public void setElenco_mutazioni_PR___not___in(java.util.List<String> elenco_mutazioni_PR___not___in) {
        this.elenco_mutazioni_PR___not___in = elenco_mutazioni_PR___not___in;
    }

    public String getElenco_mutazioni_PR___lt() {
        return elenco_mutazioni_PR___lt;
    }
    public void setElenco_mutazioni_PR___lt(String elenco_mutazioni_PR___lt) {
        this.elenco_mutazioni_PR___lt = elenco_mutazioni_PR___lt;
    }

    public String getElenco_mutazioni_PR___lte() {
        return elenco_mutazioni_PR___lte;
    }
    public void setElenco_mutazioni_PR___lte(String elenco_mutazioni_PR___lte) {
        this.elenco_mutazioni_PR___lte = elenco_mutazioni_PR___lte;
    }

    public String getElenco_mutazioni_PR___gt() {
        return elenco_mutazioni_PR___gt;
    }
    public void setElenco_mutazioni_PR___gt(String elenco_mutazioni_PR___gt) {
        this.elenco_mutazioni_PR___gt = elenco_mutazioni_PR___gt;
    }

    public String getElenco_mutazioni_PR___gte() {
        return elenco_mutazioni_PR___gte;
    }
    public void setElenco_mutazioni_PR___gte(String elenco_mutazioni_PR___gte) {
        this.elenco_mutazioni_PR___gte = elenco_mutazioni_PR___gte;
    }

    public String getElenco_mutazioni_PR___contains() {
        return elenco_mutazioni_PR___contains;
    }
    public void setElenco_mutazioni_PR___contains(String elenco_mutazioni_PR___contains) {
        this.elenco_mutazioni_PR___contains = elenco_mutazioni_PR___contains;
    }

    public String getElenco_mutazioni_PR___not___contains() {
        return elenco_mutazioni_PR___not___contains;
    }
    public void setElenco_mutazioni_PR___not___contains(String elenco_mutazioni_PR___not___contains) {
        this.elenco_mutazioni_PR___not___contains = elenco_mutazioni_PR___not___contains;
    }

    public String getElenco_mutazioni_PR___starts_with() {
        return elenco_mutazioni_PR___starts_with;
    }
    public void setElenco_mutazioni_PR___starts_with(String elenco_mutazioni_PR___starts_with) {
        this.elenco_mutazioni_PR___starts_with = elenco_mutazioni_PR___starts_with;
    }

    public String getElenco_mutazioni_PR___not___starts_with() {
        return elenco_mutazioni_PR___not___starts_with;
    }
    public void setElenco_mutazioni_PR___not___starts_with(String elenco_mutazioni_PR___not___starts_with) {
        this.elenco_mutazioni_PR___not___starts_with = elenco_mutazioni_PR___not___starts_with;
    }

    public String getElenco_mutazioni_PR___ends_with() {
        return elenco_mutazioni_PR___ends_with;
    }
    public void setElenco_mutazioni_PR___ends_with(String elenco_mutazioni_PR___ends_with) {
        this.elenco_mutazioni_PR___ends_with = elenco_mutazioni_PR___ends_with;
    }

    public String getElenco_mutazioni_PR___not___ends_with() {
        return elenco_mutazioni_PR___not___ends_with;
    }
    public void setElenco_mutazioni_PR___not___ends_with(String elenco_mutazioni_PR___not___ends_with) {
        this.elenco_mutazioni_PR___not___ends_with = elenco_mutazioni_PR___not___ends_with;
    }

    public String getElenco_mutazioni_RT___eq() {
        return elenco_mutazioni_RT___eq;
    }
    public void setElenco_mutazioni_RT___eq(String elenco_mutazioni_RT___eq) {
        this.elenco_mutazioni_RT___eq = elenco_mutazioni_RT___eq;
    }

    public String getElenco_mutazioni_RT___ne() {
        return elenco_mutazioni_RT___ne;
    }
    public void setElenco_mutazioni_RT___ne(String elenco_mutazioni_RT___ne) {
        this.elenco_mutazioni_RT___ne = elenco_mutazioni_RT___ne;
    }

    public Boolean getElenco_mutazioni_RT___null() {
        return elenco_mutazioni_RT___null;
    }
    public void setElenco_mutazioni_RT___null(Boolean elenco_mutazioni_RT___null) {
        this.elenco_mutazioni_RT___null = elenco_mutazioni_RT___null;
    }

    public Boolean getElenco_mutazioni_RT___not___null() {
        return elenco_mutazioni_RT___not___null;
    }
    public void setElenco_mutazioni_RT___not___null(Boolean elenco_mutazioni_RT___not___null) {
        this.elenco_mutazioni_RT___not___null = elenco_mutazioni_RT___not___null;
    }

    public java.util.List<String> getElenco_mutazioni_RT___in() {
        return elenco_mutazioni_RT___in;
    }
    public void setElenco_mutazioni_RT___in(java.util.List<String> elenco_mutazioni_RT___in) {
        this.elenco_mutazioni_RT___in = elenco_mutazioni_RT___in;
    }

    public java.util.List<String> getElenco_mutazioni_RT___not___in() {
        return elenco_mutazioni_RT___not___in;
    }
    public void setElenco_mutazioni_RT___not___in(java.util.List<String> elenco_mutazioni_RT___not___in) {
        this.elenco_mutazioni_RT___not___in = elenco_mutazioni_RT___not___in;
    }

    public String getElenco_mutazioni_RT___lt() {
        return elenco_mutazioni_RT___lt;
    }
    public void setElenco_mutazioni_RT___lt(String elenco_mutazioni_RT___lt) {
        this.elenco_mutazioni_RT___lt = elenco_mutazioni_RT___lt;
    }

    public String getElenco_mutazioni_RT___lte() {
        return elenco_mutazioni_RT___lte;
    }
    public void setElenco_mutazioni_RT___lte(String elenco_mutazioni_RT___lte) {
        this.elenco_mutazioni_RT___lte = elenco_mutazioni_RT___lte;
    }

    public String getElenco_mutazioni_RT___gt() {
        return elenco_mutazioni_RT___gt;
    }
    public void setElenco_mutazioni_RT___gt(String elenco_mutazioni_RT___gt) {
        this.elenco_mutazioni_RT___gt = elenco_mutazioni_RT___gt;
    }

    public String getElenco_mutazioni_RT___gte() {
        return elenco_mutazioni_RT___gte;
    }
    public void setElenco_mutazioni_RT___gte(String elenco_mutazioni_RT___gte) {
        this.elenco_mutazioni_RT___gte = elenco_mutazioni_RT___gte;
    }

    public String getElenco_mutazioni_RT___contains() {
        return elenco_mutazioni_RT___contains;
    }
    public void setElenco_mutazioni_RT___contains(String elenco_mutazioni_RT___contains) {
        this.elenco_mutazioni_RT___contains = elenco_mutazioni_RT___contains;
    }

    public String getElenco_mutazioni_RT___not___contains() {
        return elenco_mutazioni_RT___not___contains;
    }
    public void setElenco_mutazioni_RT___not___contains(String elenco_mutazioni_RT___not___contains) {
        this.elenco_mutazioni_RT___not___contains = elenco_mutazioni_RT___not___contains;
    }

    public String getElenco_mutazioni_RT___starts_with() {
        return elenco_mutazioni_RT___starts_with;
    }
    public void setElenco_mutazioni_RT___starts_with(String elenco_mutazioni_RT___starts_with) {
        this.elenco_mutazioni_RT___starts_with = elenco_mutazioni_RT___starts_with;
    }

    public String getElenco_mutazioni_RT___not___starts_with() {
        return elenco_mutazioni_RT___not___starts_with;
    }
    public void setElenco_mutazioni_RT___not___starts_with(String elenco_mutazioni_RT___not___starts_with) {
        this.elenco_mutazioni_RT___not___starts_with = elenco_mutazioni_RT___not___starts_with;
    }

    public String getElenco_mutazioni_RT___ends_with() {
        return elenco_mutazioni_RT___ends_with;
    }
    public void setElenco_mutazioni_RT___ends_with(String elenco_mutazioni_RT___ends_with) {
        this.elenco_mutazioni_RT___ends_with = elenco_mutazioni_RT___ends_with;
    }

    public String getElenco_mutazioni_RT___not___ends_with() {
        return elenco_mutazioni_RT___not___ends_with;
    }
    public void setElenco_mutazioni_RT___not___ends_with(String elenco_mutazioni_RT___not___ends_with) {
        this.elenco_mutazioni_RT___not___ends_with = elenco_mutazioni_RT___not___ends_with;
    }

    public String getElenco_mutazioni_V3___eq() {
        return elenco_mutazioni_V3___eq;
    }
    public void setElenco_mutazioni_V3___eq(String elenco_mutazioni_V3___eq) {
        this.elenco_mutazioni_V3___eq = elenco_mutazioni_V3___eq;
    }

    public String getElenco_mutazioni_V3___ne() {
        return elenco_mutazioni_V3___ne;
    }
    public void setElenco_mutazioni_V3___ne(String elenco_mutazioni_V3___ne) {
        this.elenco_mutazioni_V3___ne = elenco_mutazioni_V3___ne;
    }

    public Boolean getElenco_mutazioni_V3___null() {
        return elenco_mutazioni_V3___null;
    }
    public void setElenco_mutazioni_V3___null(Boolean elenco_mutazioni_V3___null) {
        this.elenco_mutazioni_V3___null = elenco_mutazioni_V3___null;
    }

    public Boolean getElenco_mutazioni_V3___not___null() {
        return elenco_mutazioni_V3___not___null;
    }
    public void setElenco_mutazioni_V3___not___null(Boolean elenco_mutazioni_V3___not___null) {
        this.elenco_mutazioni_V3___not___null = elenco_mutazioni_V3___not___null;
    }

    public java.util.List<String> getElenco_mutazioni_V3___in() {
        return elenco_mutazioni_V3___in;
    }
    public void setElenco_mutazioni_V3___in(java.util.List<String> elenco_mutazioni_V3___in) {
        this.elenco_mutazioni_V3___in = elenco_mutazioni_V3___in;
    }

    public java.util.List<String> getElenco_mutazioni_V3___not___in() {
        return elenco_mutazioni_V3___not___in;
    }
    public void setElenco_mutazioni_V3___not___in(java.util.List<String> elenco_mutazioni_V3___not___in) {
        this.elenco_mutazioni_V3___not___in = elenco_mutazioni_V3___not___in;
    }

    public String getElenco_mutazioni_V3___lt() {
        return elenco_mutazioni_V3___lt;
    }
    public void setElenco_mutazioni_V3___lt(String elenco_mutazioni_V3___lt) {
        this.elenco_mutazioni_V3___lt = elenco_mutazioni_V3___lt;
    }

    public String getElenco_mutazioni_V3___lte() {
        return elenco_mutazioni_V3___lte;
    }
    public void setElenco_mutazioni_V3___lte(String elenco_mutazioni_V3___lte) {
        this.elenco_mutazioni_V3___lte = elenco_mutazioni_V3___lte;
    }

    public String getElenco_mutazioni_V3___gt() {
        return elenco_mutazioni_V3___gt;
    }
    public void setElenco_mutazioni_V3___gt(String elenco_mutazioni_V3___gt) {
        this.elenco_mutazioni_V3___gt = elenco_mutazioni_V3___gt;
    }

    public String getElenco_mutazioni_V3___gte() {
        return elenco_mutazioni_V3___gte;
    }
    public void setElenco_mutazioni_V3___gte(String elenco_mutazioni_V3___gte) {
        this.elenco_mutazioni_V3___gte = elenco_mutazioni_V3___gte;
    }

    public String getElenco_mutazioni_V3___contains() {
        return elenco_mutazioni_V3___contains;
    }
    public void setElenco_mutazioni_V3___contains(String elenco_mutazioni_V3___contains) {
        this.elenco_mutazioni_V3___contains = elenco_mutazioni_V3___contains;
    }

    public String getElenco_mutazioni_V3___not___contains() {
        return elenco_mutazioni_V3___not___contains;
    }
    public void setElenco_mutazioni_V3___not___contains(String elenco_mutazioni_V3___not___contains) {
        this.elenco_mutazioni_V3___not___contains = elenco_mutazioni_V3___not___contains;
    }

    public String getElenco_mutazioni_V3___starts_with() {
        return elenco_mutazioni_V3___starts_with;
    }
    public void setElenco_mutazioni_V3___starts_with(String elenco_mutazioni_V3___starts_with) {
        this.elenco_mutazioni_V3___starts_with = elenco_mutazioni_V3___starts_with;
    }

    public String getElenco_mutazioni_V3___not___starts_with() {
        return elenco_mutazioni_V3___not___starts_with;
    }
    public void setElenco_mutazioni_V3___not___starts_with(String elenco_mutazioni_V3___not___starts_with) {
        this.elenco_mutazioni_V3___not___starts_with = elenco_mutazioni_V3___not___starts_with;
    }

    public String getElenco_mutazioni_V3___ends_with() {
        return elenco_mutazioni_V3___ends_with;
    }
    public void setElenco_mutazioni_V3___ends_with(String elenco_mutazioni_V3___ends_with) {
        this.elenco_mutazioni_V3___ends_with = elenco_mutazioni_V3___ends_with;
    }

    public String getElenco_mutazioni_V3___not___ends_with() {
        return elenco_mutazioni_V3___not___ends_with;
    }
    public void setElenco_mutazioni_V3___not___ends_with(String elenco_mutazioni_V3___not___ends_with) {
        this.elenco_mutazioni_V3___not___ends_with = elenco_mutazioni_V3___not___ends_with;
    }

    public String getEtichetta___eq() {
        return etichetta___eq;
    }
    public void setEtichetta___eq(String etichetta___eq) {
        this.etichetta___eq = etichetta___eq;
    }

    public String getEtichetta___ne() {
        return etichetta___ne;
    }
    public void setEtichetta___ne(String etichetta___ne) {
        this.etichetta___ne = etichetta___ne;
    }

    public Boolean getEtichetta___null() {
        return etichetta___null;
    }
    public void setEtichetta___null(Boolean etichetta___null) {
        this.etichetta___null = etichetta___null;
    }

    public Boolean getEtichetta___not___null() {
        return etichetta___not___null;
    }
    public void setEtichetta___not___null(Boolean etichetta___not___null) {
        this.etichetta___not___null = etichetta___not___null;
    }

    public java.util.List<String> getEtichetta___in() {
        return etichetta___in;
    }
    public void setEtichetta___in(java.util.List<String> etichetta___in) {
        this.etichetta___in = etichetta___in;
    }

    public java.util.List<String> getEtichetta___not___in() {
        return etichetta___not___in;
    }
    public void setEtichetta___not___in(java.util.List<String> etichetta___not___in) {
        this.etichetta___not___in = etichetta___not___in;
    }

    public String getEtichetta___lt() {
        return etichetta___lt;
    }
    public void setEtichetta___lt(String etichetta___lt) {
        this.etichetta___lt = etichetta___lt;
    }

    public String getEtichetta___lte() {
        return etichetta___lte;
    }
    public void setEtichetta___lte(String etichetta___lte) {
        this.etichetta___lte = etichetta___lte;
    }

    public String getEtichetta___gt() {
        return etichetta___gt;
    }
    public void setEtichetta___gt(String etichetta___gt) {
        this.etichetta___gt = etichetta___gt;
    }

    public String getEtichetta___gte() {
        return etichetta___gte;
    }
    public void setEtichetta___gte(String etichetta___gte) {
        this.etichetta___gte = etichetta___gte;
    }

    public String getEtichetta___contains() {
        return etichetta___contains;
    }
    public void setEtichetta___contains(String etichetta___contains) {
        this.etichetta___contains = etichetta___contains;
    }

    public String getEtichetta___not___contains() {
        return etichetta___not___contains;
    }
    public void setEtichetta___not___contains(String etichetta___not___contains) {
        this.etichetta___not___contains = etichetta___not___contains;
    }

    public String getEtichetta___starts_with() {
        return etichetta___starts_with;
    }
    public void setEtichetta___starts_with(String etichetta___starts_with) {
        this.etichetta___starts_with = etichetta___starts_with;
    }

    public String getEtichetta___not___starts_with() {
        return etichetta___not___starts_with;
    }
    public void setEtichetta___not___starts_with(String etichetta___not___starts_with) {
        this.etichetta___not___starts_with = etichetta___not___starts_with;
    }

    public String getEtichetta___ends_with() {
        return etichetta___ends_with;
    }
    public void setEtichetta___ends_with(String etichetta___ends_with) {
        this.etichetta___ends_with = etichetta___ends_with;
    }

    public String getEtichetta___not___ends_with() {
        return etichetta___not___ends_with;
    }
    public void setEtichetta___not___ends_with(String etichetta___not___ends_with) {
        this.etichetta___not___ends_with = etichetta___not___ends_with;
    }

    public String getFiltro_codice_paziente___eq() {
        return filtro_codice_paziente___eq;
    }
    public void setFiltro_codice_paziente___eq(String filtro_codice_paziente___eq) {
        this.filtro_codice_paziente___eq = filtro_codice_paziente___eq;
    }

    public String getFiltro_codice_paziente___ne() {
        return filtro_codice_paziente___ne;
    }
    public void setFiltro_codice_paziente___ne(String filtro_codice_paziente___ne) {
        this.filtro_codice_paziente___ne = filtro_codice_paziente___ne;
    }

    public Boolean getFiltro_codice_paziente___null() {
        return filtro_codice_paziente___null;
    }
    public void setFiltro_codice_paziente___null(Boolean filtro_codice_paziente___null) {
        this.filtro_codice_paziente___null = filtro_codice_paziente___null;
    }

    public Boolean getFiltro_codice_paziente___not___null() {
        return filtro_codice_paziente___not___null;
    }
    public void setFiltro_codice_paziente___not___null(Boolean filtro_codice_paziente___not___null) {
        this.filtro_codice_paziente___not___null = filtro_codice_paziente___not___null;
    }

    public java.util.List<String> getFiltro_codice_paziente___in() {
        return filtro_codice_paziente___in;
    }
    public void setFiltro_codice_paziente___in(java.util.List<String> filtro_codice_paziente___in) {
        this.filtro_codice_paziente___in = filtro_codice_paziente___in;
    }

    public java.util.List<String> getFiltro_codice_paziente___not___in() {
        return filtro_codice_paziente___not___in;
    }
    public void setFiltro_codice_paziente___not___in(java.util.List<String> filtro_codice_paziente___not___in) {
        this.filtro_codice_paziente___not___in = filtro_codice_paziente___not___in;
    }

    public String getFiltro_codice_paziente___lt() {
        return filtro_codice_paziente___lt;
    }
    public void setFiltro_codice_paziente___lt(String filtro_codice_paziente___lt) {
        this.filtro_codice_paziente___lt = filtro_codice_paziente___lt;
    }

    public String getFiltro_codice_paziente___lte() {
        return filtro_codice_paziente___lte;
    }
    public void setFiltro_codice_paziente___lte(String filtro_codice_paziente___lte) {
        this.filtro_codice_paziente___lte = filtro_codice_paziente___lte;
    }

    public String getFiltro_codice_paziente___gt() {
        return filtro_codice_paziente___gt;
    }
    public void setFiltro_codice_paziente___gt(String filtro_codice_paziente___gt) {
        this.filtro_codice_paziente___gt = filtro_codice_paziente___gt;
    }

    public String getFiltro_codice_paziente___gte() {
        return filtro_codice_paziente___gte;
    }
    public void setFiltro_codice_paziente___gte(String filtro_codice_paziente___gte) {
        this.filtro_codice_paziente___gte = filtro_codice_paziente___gte;
    }

    public String getFiltro_codice_paziente___contains() {
        return filtro_codice_paziente___contains;
    }
    public void setFiltro_codice_paziente___contains(String filtro_codice_paziente___contains) {
        this.filtro_codice_paziente___contains = filtro_codice_paziente___contains;
    }

    public String getFiltro_codice_paziente___not___contains() {
        return filtro_codice_paziente___not___contains;
    }
    public void setFiltro_codice_paziente___not___contains(String filtro_codice_paziente___not___contains) {
        this.filtro_codice_paziente___not___contains = filtro_codice_paziente___not___contains;
    }

    public String getFiltro_codice_paziente___starts_with() {
        return filtro_codice_paziente___starts_with;
    }
    public void setFiltro_codice_paziente___starts_with(String filtro_codice_paziente___starts_with) {
        this.filtro_codice_paziente___starts_with = filtro_codice_paziente___starts_with;
    }

    public String getFiltro_codice_paziente___not___starts_with() {
        return filtro_codice_paziente___not___starts_with;
    }
    public void setFiltro_codice_paziente___not___starts_with(String filtro_codice_paziente___not___starts_with) {
        this.filtro_codice_paziente___not___starts_with = filtro_codice_paziente___not___starts_with;
    }

    public String getFiltro_codice_paziente___ends_with() {
        return filtro_codice_paziente___ends_with;
    }
    public void setFiltro_codice_paziente___ends_with(String filtro_codice_paziente___ends_with) {
        this.filtro_codice_paziente___ends_with = filtro_codice_paziente___ends_with;
    }

    public String getFiltro_codice_paziente___not___ends_with() {
        return filtro_codice_paziente___not___ends_with;
    }
    public void setFiltro_codice_paziente___not___ends_with(String filtro_codice_paziente___not___ends_with) {
        this.filtro_codice_paziente___not___ends_with = filtro_codice_paziente___not___ends_with;
    }

    public Integer getMutazioni___eq() {
        return mutazioni___eq;
    }
    public void setMutazioni___eq(Integer mutazioni___eq) {
        this.mutazioni___eq = mutazioni___eq;
    }

    public Integer getMutazioni___ne() {
        return mutazioni___ne;
    }
    public void setMutazioni___ne(Integer mutazioni___ne) {
        this.mutazioni___ne = mutazioni___ne;
    }

    public Boolean getMutazioni___null() {
        return mutazioni___null;
    }
    public void setMutazioni___null(Boolean mutazioni___null) {
        this.mutazioni___null = mutazioni___null;
    }

    public Boolean getMutazioni___not___null() {
        return mutazioni___not___null;
    }
    public void setMutazioni___not___null(Boolean mutazioni___not___null) {
        this.mutazioni___not___null = mutazioni___not___null;
    }

    public java.util.List<Integer> getMutazioni___in() {
        return mutazioni___in;
    }
    public void setMutazioni___in(java.util.List<Integer> mutazioni___in) {
        this.mutazioni___in = mutazioni___in;
    }

    public java.util.List<Integer> getMutazioni___not___in() {
        return mutazioni___not___in;
    }
    public void setMutazioni___not___in(java.util.List<Integer> mutazioni___not___in) {
        this.mutazioni___not___in = mutazioni___not___in;
    }

    public Integer getMutazioni___lt() {
        return mutazioni___lt;
    }
    public void setMutazioni___lt(Integer mutazioni___lt) {
        this.mutazioni___lt = mutazioni___lt;
    }

    public Integer getMutazioni___lte() {
        return mutazioni___lte;
    }
    public void setMutazioni___lte(Integer mutazioni___lte) {
        this.mutazioni___lte = mutazioni___lte;
    }

    public Integer getMutazioni___gt() {
        return mutazioni___gt;
    }
    public void setMutazioni___gt(Integer mutazioni___gt) {
        this.mutazioni___gt = mutazioni___gt;
    }

    public Integer getMutazioni___gte() {
        return mutazioni___gte;
    }
    public void setMutazioni___gte(Integer mutazioni___gte) {
        this.mutazioni___gte = mutazioni___gte;
    }

    public String getMutazioni_no_farmaco___eq() {
        return mutazioni_no_farmaco___eq;
    }
    public void setMutazioni_no_farmaco___eq(String mutazioni_no_farmaco___eq) {
        this.mutazioni_no_farmaco___eq = mutazioni_no_farmaco___eq;
    }

    public String getMutazioni_no_farmaco___ne() {
        return mutazioni_no_farmaco___ne;
    }
    public void setMutazioni_no_farmaco___ne(String mutazioni_no_farmaco___ne) {
        this.mutazioni_no_farmaco___ne = mutazioni_no_farmaco___ne;
    }

    public Boolean getMutazioni_no_farmaco___null() {
        return mutazioni_no_farmaco___null;
    }
    public void setMutazioni_no_farmaco___null(Boolean mutazioni_no_farmaco___null) {
        this.mutazioni_no_farmaco___null = mutazioni_no_farmaco___null;
    }

    public Boolean getMutazioni_no_farmaco___not___null() {
        return mutazioni_no_farmaco___not___null;
    }
    public void setMutazioni_no_farmaco___not___null(Boolean mutazioni_no_farmaco___not___null) {
        this.mutazioni_no_farmaco___not___null = mutazioni_no_farmaco___not___null;
    }

    public java.util.List<String> getMutazioni_no_farmaco___in() {
        return mutazioni_no_farmaco___in;
    }
    public void setMutazioni_no_farmaco___in(java.util.List<String> mutazioni_no_farmaco___in) {
        this.mutazioni_no_farmaco___in = mutazioni_no_farmaco___in;
    }

    public java.util.List<String> getMutazioni_no_farmaco___not___in() {
        return mutazioni_no_farmaco___not___in;
    }
    public void setMutazioni_no_farmaco___not___in(java.util.List<String> mutazioni_no_farmaco___not___in) {
        this.mutazioni_no_farmaco___not___in = mutazioni_no_farmaco___not___in;
    }

    public String getMutazioni_no_farmaco___lt() {
        return mutazioni_no_farmaco___lt;
    }
    public void setMutazioni_no_farmaco___lt(String mutazioni_no_farmaco___lt) {
        this.mutazioni_no_farmaco___lt = mutazioni_no_farmaco___lt;
    }

    public String getMutazioni_no_farmaco___lte() {
        return mutazioni_no_farmaco___lte;
    }
    public void setMutazioni_no_farmaco___lte(String mutazioni_no_farmaco___lte) {
        this.mutazioni_no_farmaco___lte = mutazioni_no_farmaco___lte;
    }

    public String getMutazioni_no_farmaco___gt() {
        return mutazioni_no_farmaco___gt;
    }
    public void setMutazioni_no_farmaco___gt(String mutazioni_no_farmaco___gt) {
        this.mutazioni_no_farmaco___gt = mutazioni_no_farmaco___gt;
    }

    public String getMutazioni_no_farmaco___gte() {
        return mutazioni_no_farmaco___gte;
    }
    public void setMutazioni_no_farmaco___gte(String mutazioni_no_farmaco___gte) {
        this.mutazioni_no_farmaco___gte = mutazioni_no_farmaco___gte;
    }

    public String getMutazioni_no_farmaco___contains() {
        return mutazioni_no_farmaco___contains;
    }
    public void setMutazioni_no_farmaco___contains(String mutazioni_no_farmaco___contains) {
        this.mutazioni_no_farmaco___contains = mutazioni_no_farmaco___contains;
    }

    public String getMutazioni_no_farmaco___not___contains() {
        return mutazioni_no_farmaco___not___contains;
    }
    public void setMutazioni_no_farmaco___not___contains(String mutazioni_no_farmaco___not___contains) {
        this.mutazioni_no_farmaco___not___contains = mutazioni_no_farmaco___not___contains;
    }

    public String getMutazioni_no_farmaco___starts_with() {
        return mutazioni_no_farmaco___starts_with;
    }
    public void setMutazioni_no_farmaco___starts_with(String mutazioni_no_farmaco___starts_with) {
        this.mutazioni_no_farmaco___starts_with = mutazioni_no_farmaco___starts_with;
    }

    public String getMutazioni_no_farmaco___not___starts_with() {
        return mutazioni_no_farmaco___not___starts_with;
    }
    public void setMutazioni_no_farmaco___not___starts_with(String mutazioni_no_farmaco___not___starts_with) {
        this.mutazioni_no_farmaco___not___starts_with = mutazioni_no_farmaco___not___starts_with;
    }

    public String getMutazioni_no_farmaco___ends_with() {
        return mutazioni_no_farmaco___ends_with;
    }
    public void setMutazioni_no_farmaco___ends_with(String mutazioni_no_farmaco___ends_with) {
        this.mutazioni_no_farmaco___ends_with = mutazioni_no_farmaco___ends_with;
    }

    public String getMutazioni_no_farmaco___not___ends_with() {
        return mutazioni_no_farmaco___not___ends_with;
    }
    public void setMutazioni_no_farmaco___not___ends_with(String mutazioni_no_farmaco___not___ends_with) {
        this.mutazioni_no_farmaco___not___ends_with = mutazioni_no_farmaco___not___ends_with;
    }

    public Boolean getNessuna_mutazione_ENV___eq() {
        return nessuna_mutazione_ENV___eq;
    }
    public void setNessuna_mutazione_ENV___eq(Boolean nessuna_mutazione_ENV___eq) {
        this.nessuna_mutazione_ENV___eq = nessuna_mutazione_ENV___eq;
    }

    public Boolean getNessuna_mutazione_ENV___ne() {
        return nessuna_mutazione_ENV___ne;
    }
    public void setNessuna_mutazione_ENV___ne(Boolean nessuna_mutazione_ENV___ne) {
        this.nessuna_mutazione_ENV___ne = nessuna_mutazione_ENV___ne;
    }

    public Boolean getNessuna_mutazione_ENV___null() {
        return nessuna_mutazione_ENV___null;
    }
    public void setNessuna_mutazione_ENV___null(Boolean nessuna_mutazione_ENV___null) {
        this.nessuna_mutazione_ENV___null = nessuna_mutazione_ENV___null;
    }

    public Boolean getNessuna_mutazione_ENV___not___null() {
        return nessuna_mutazione_ENV___not___null;
    }
    public void setNessuna_mutazione_ENV___not___null(Boolean nessuna_mutazione_ENV___not___null) {
        this.nessuna_mutazione_ENV___not___null = nessuna_mutazione_ENV___not___null;
    }

    public Boolean getNessuna_mutazione_INT___eq() {
        return nessuna_mutazione_INT___eq;
    }
    public void setNessuna_mutazione_INT___eq(Boolean nessuna_mutazione_INT___eq) {
        this.nessuna_mutazione_INT___eq = nessuna_mutazione_INT___eq;
    }

    public Boolean getNessuna_mutazione_INT___ne() {
        return nessuna_mutazione_INT___ne;
    }
    public void setNessuna_mutazione_INT___ne(Boolean nessuna_mutazione_INT___ne) {
        this.nessuna_mutazione_INT___ne = nessuna_mutazione_INT___ne;
    }

    public Boolean getNessuna_mutazione_INT___null() {
        return nessuna_mutazione_INT___null;
    }
    public void setNessuna_mutazione_INT___null(Boolean nessuna_mutazione_INT___null) {
        this.nessuna_mutazione_INT___null = nessuna_mutazione_INT___null;
    }

    public Boolean getNessuna_mutazione_INT___not___null() {
        return nessuna_mutazione_INT___not___null;
    }
    public void setNessuna_mutazione_INT___not___null(Boolean nessuna_mutazione_INT___not___null) {
        this.nessuna_mutazione_INT___not___null = nessuna_mutazione_INT___not___null;
    }

    public Boolean getNessuna_mutazione_PR___eq() {
        return nessuna_mutazione_PR___eq;
    }
    public void setNessuna_mutazione_PR___eq(Boolean nessuna_mutazione_PR___eq) {
        this.nessuna_mutazione_PR___eq = nessuna_mutazione_PR___eq;
    }

    public Boolean getNessuna_mutazione_PR___ne() {
        return nessuna_mutazione_PR___ne;
    }
    public void setNessuna_mutazione_PR___ne(Boolean nessuna_mutazione_PR___ne) {
        this.nessuna_mutazione_PR___ne = nessuna_mutazione_PR___ne;
    }

    public Boolean getNessuna_mutazione_PR___null() {
        return nessuna_mutazione_PR___null;
    }
    public void setNessuna_mutazione_PR___null(Boolean nessuna_mutazione_PR___null) {
        this.nessuna_mutazione_PR___null = nessuna_mutazione_PR___null;
    }

    public Boolean getNessuna_mutazione_PR___not___null() {
        return nessuna_mutazione_PR___not___null;
    }
    public void setNessuna_mutazione_PR___not___null(Boolean nessuna_mutazione_PR___not___null) {
        this.nessuna_mutazione_PR___not___null = nessuna_mutazione_PR___not___null;
    }

    public Boolean getNessuna_mutazione_RT___eq() {
        return nessuna_mutazione_RT___eq;
    }
    public void setNessuna_mutazione_RT___eq(Boolean nessuna_mutazione_RT___eq) {
        this.nessuna_mutazione_RT___eq = nessuna_mutazione_RT___eq;
    }

    public Boolean getNessuna_mutazione_RT___ne() {
        return nessuna_mutazione_RT___ne;
    }
    public void setNessuna_mutazione_RT___ne(Boolean nessuna_mutazione_RT___ne) {
        this.nessuna_mutazione_RT___ne = nessuna_mutazione_RT___ne;
    }

    public Boolean getNessuna_mutazione_RT___null() {
        return nessuna_mutazione_RT___null;
    }
    public void setNessuna_mutazione_RT___null(Boolean nessuna_mutazione_RT___null) {
        this.nessuna_mutazione_RT___null = nessuna_mutazione_RT___null;
    }

    public Boolean getNessuna_mutazione_RT___not___null() {
        return nessuna_mutazione_RT___not___null;
    }
    public void setNessuna_mutazione_RT___not___null(Boolean nessuna_mutazione_RT___not___null) {
        this.nessuna_mutazione_RT___not___null = nessuna_mutazione_RT___not___null;
    }

    public Boolean getNessuna_mutazione_V3___eq() {
        return nessuna_mutazione_V3___eq;
    }
    public void setNessuna_mutazione_V3___eq(Boolean nessuna_mutazione_V3___eq) {
        this.nessuna_mutazione_V3___eq = nessuna_mutazione_V3___eq;
    }

    public Boolean getNessuna_mutazione_V3___ne() {
        return nessuna_mutazione_V3___ne;
    }
    public void setNessuna_mutazione_V3___ne(Boolean nessuna_mutazione_V3___ne) {
        this.nessuna_mutazione_V3___ne = nessuna_mutazione_V3___ne;
    }

    public Boolean getNessuna_mutazione_V3___null() {
        return nessuna_mutazione_V3___null;
    }
    public void setNessuna_mutazione_V3___null(Boolean nessuna_mutazione_V3___null) {
        this.nessuna_mutazione_V3___null = nessuna_mutazione_V3___null;
    }

    public Boolean getNessuna_mutazione_V3___not___null() {
        return nessuna_mutazione_V3___not___null;
    }
    public void setNessuna_mutazione_V3___not___null(Boolean nessuna_mutazione_V3___not___null) {
        this.nessuna_mutazione_V3___not___null = nessuna_mutazione_V3___not___null;
    }

    public String getNucleotidi___eq() {
        return nucleotidi___eq;
    }
    public void setNucleotidi___eq(String nucleotidi___eq) {
        this.nucleotidi___eq = nucleotidi___eq;
    }

    public String getNucleotidi___ne() {
        return nucleotidi___ne;
    }
    public void setNucleotidi___ne(String nucleotidi___ne) {
        this.nucleotidi___ne = nucleotidi___ne;
    }

    public Boolean getNucleotidi___null() {
        return nucleotidi___null;
    }
    public void setNucleotidi___null(Boolean nucleotidi___null) {
        this.nucleotidi___null = nucleotidi___null;
    }

    public Boolean getNucleotidi___not___null() {
        return nucleotidi___not___null;
    }
    public void setNucleotidi___not___null(Boolean nucleotidi___not___null) {
        this.nucleotidi___not___null = nucleotidi___not___null;
    }

    public java.util.List<String> getNucleotidi___in() {
        return nucleotidi___in;
    }
    public void setNucleotidi___in(java.util.List<String> nucleotidi___in) {
        this.nucleotidi___in = nucleotidi___in;
    }

    public java.util.List<String> getNucleotidi___not___in() {
        return nucleotidi___not___in;
    }
    public void setNucleotidi___not___in(java.util.List<String> nucleotidi___not___in) {
        this.nucleotidi___not___in = nucleotidi___not___in;
    }

    public String getNucleotidi___lt() {
        return nucleotidi___lt;
    }
    public void setNucleotidi___lt(String nucleotidi___lt) {
        this.nucleotidi___lt = nucleotidi___lt;
    }

    public String getNucleotidi___lte() {
        return nucleotidi___lte;
    }
    public void setNucleotidi___lte(String nucleotidi___lte) {
        this.nucleotidi___lte = nucleotidi___lte;
    }

    public String getNucleotidi___gt() {
        return nucleotidi___gt;
    }
    public void setNucleotidi___gt(String nucleotidi___gt) {
        this.nucleotidi___gt = nucleotidi___gt;
    }

    public String getNucleotidi___gte() {
        return nucleotidi___gte;
    }
    public void setNucleotidi___gte(String nucleotidi___gte) {
        this.nucleotidi___gte = nucleotidi___gte;
    }

    public String getNucleotidi___contains() {
        return nucleotidi___contains;
    }
    public void setNucleotidi___contains(String nucleotidi___contains) {
        this.nucleotidi___contains = nucleotidi___contains;
    }

    public String getNucleotidi___not___contains() {
        return nucleotidi___not___contains;
    }
    public void setNucleotidi___not___contains(String nucleotidi___not___contains) {
        this.nucleotidi___not___contains = nucleotidi___not___contains;
    }

    public String getNucleotidi___starts_with() {
        return nucleotidi___starts_with;
    }
    public void setNucleotidi___starts_with(String nucleotidi___starts_with) {
        this.nucleotidi___starts_with = nucleotidi___starts_with;
    }

    public String getNucleotidi___not___starts_with() {
        return nucleotidi___not___starts_with;
    }
    public void setNucleotidi___not___starts_with(String nucleotidi___not___starts_with) {
        this.nucleotidi___not___starts_with = nucleotidi___not___starts_with;
    }

    public String getNucleotidi___ends_with() {
        return nucleotidi___ends_with;
    }
    public void setNucleotidi___ends_with(String nucleotidi___ends_with) {
        this.nucleotidi___ends_with = nucleotidi___ends_with;
    }

    public String getNucleotidi___not___ends_with() {
        return nucleotidi___not___ends_with;
    }
    public void setNucleotidi___not___ends_with(String nucleotidi___not___ends_with) {
        this.nucleotidi___not___ends_with = nucleotidi___not___ends_with;
    }

    public String getRegione___eq() {
        return regione___eq;
    }
    public void setRegione___eq(String regione___eq) {
        this.regione___eq = regione___eq;
    }

    public String getRegione___ne() {
        return regione___ne;
    }
    public void setRegione___ne(String regione___ne) {
        this.regione___ne = regione___ne;
    }

    public Boolean getRegione___null() {
        return regione___null;
    }
    public void setRegione___null(Boolean regione___null) {
        this.regione___null = regione___null;
    }

    public Boolean getRegione___not___null() {
        return regione___not___null;
    }
    public void setRegione___not___null(Boolean regione___not___null) {
        this.regione___not___null = regione___not___null;
    }

    public java.util.List<String> getRegione___in() {
        return regione___in;
    }
    public void setRegione___in(java.util.List<String> regione___in) {
        this.regione___in = regione___in;
    }

    public java.util.List<String> getRegione___not___in() {
        return regione___not___in;
    }
    public void setRegione___not___in(java.util.List<String> regione___not___in) {
        this.regione___not___in = regione___not___in;
    }

    public String getRegione___lt() {
        return regione___lt;
    }
    public void setRegione___lt(String regione___lt) {
        this.regione___lt = regione___lt;
    }

    public String getRegione___lte() {
        return regione___lte;
    }
    public void setRegione___lte(String regione___lte) {
        this.regione___lte = regione___lte;
    }

    public String getRegione___gt() {
        return regione___gt;
    }
    public void setRegione___gt(String regione___gt) {
        this.regione___gt = regione___gt;
    }

    public String getRegione___gte() {
        return regione___gte;
    }
    public void setRegione___gte(String regione___gte) {
        this.regione___gte = regione___gte;
    }

    public String getRegione___contains() {
        return regione___contains;
    }
    public void setRegione___contains(String regione___contains) {
        this.regione___contains = regione___contains;
    }

    public String getRegione___not___contains() {
        return regione___not___contains;
    }
    public void setRegione___not___contains(String regione___not___contains) {
        this.regione___not___contains = regione___not___contains;
    }

    public String getRegione___starts_with() {
        return regione___starts_with;
    }
    public void setRegione___starts_with(String regione___starts_with) {
        this.regione___starts_with = regione___starts_with;
    }

    public String getRegione___not___starts_with() {
        return regione___not___starts_with;
    }
    public void setRegione___not___starts_with(String regione___not___starts_with) {
        this.regione___not___starts_with = regione___not___starts_with;
    }

    public String getRegione___ends_with() {
        return regione___ends_with;
    }
    public void setRegione___ends_with(String regione___ends_with) {
        this.regione___ends_with = regione___ends_with;
    }

    public String getRegione___not___ends_with() {
        return regione___not___ends_with;
    }
    public void setRegione___not___ends_with(String regione___not___ends_with) {
        this.regione___not___ends_with = regione___not___ends_with;
    }

    public String getSottotipo___eq() {
        return sottotipo___eq;
    }
    public void setSottotipo___eq(String sottotipo___eq) {
        this.sottotipo___eq = sottotipo___eq;
    }

    public String getSottotipo___ne() {
        return sottotipo___ne;
    }
    public void setSottotipo___ne(String sottotipo___ne) {
        this.sottotipo___ne = sottotipo___ne;
    }

    public Boolean getSottotipo___null() {
        return sottotipo___null;
    }
    public void setSottotipo___null(Boolean sottotipo___null) {
        this.sottotipo___null = sottotipo___null;
    }

    public Boolean getSottotipo___not___null() {
        return sottotipo___not___null;
    }
    public void setSottotipo___not___null(Boolean sottotipo___not___null) {
        this.sottotipo___not___null = sottotipo___not___null;
    }

    public java.util.List<String> getSottotipo___in() {
        return sottotipo___in;
    }
    public void setSottotipo___in(java.util.List<String> sottotipo___in) {
        this.sottotipo___in = sottotipo___in;
    }

    public java.util.List<String> getSottotipo___not___in() {
        return sottotipo___not___in;
    }
    public void setSottotipo___not___in(java.util.List<String> sottotipo___not___in) {
        this.sottotipo___not___in = sottotipo___not___in;
    }

    public String getSottotipo___lt() {
        return sottotipo___lt;
    }
    public void setSottotipo___lt(String sottotipo___lt) {
        this.sottotipo___lt = sottotipo___lt;
    }

    public String getSottotipo___lte() {
        return sottotipo___lte;
    }
    public void setSottotipo___lte(String sottotipo___lte) {
        this.sottotipo___lte = sottotipo___lte;
    }

    public String getSottotipo___gt() {
        return sottotipo___gt;
    }
    public void setSottotipo___gt(String sottotipo___gt) {
        this.sottotipo___gt = sottotipo___gt;
    }

    public String getSottotipo___gte() {
        return sottotipo___gte;
    }
    public void setSottotipo___gte(String sottotipo___gte) {
        this.sottotipo___gte = sottotipo___gte;
    }

    public String getSottotipo___contains() {
        return sottotipo___contains;
    }
    public void setSottotipo___contains(String sottotipo___contains) {
        this.sottotipo___contains = sottotipo___contains;
    }

    public String getSottotipo___not___contains() {
        return sottotipo___not___contains;
    }
    public void setSottotipo___not___contains(String sottotipo___not___contains) {
        this.sottotipo___not___contains = sottotipo___not___contains;
    }

    public String getSottotipo___starts_with() {
        return sottotipo___starts_with;
    }
    public void setSottotipo___starts_with(String sottotipo___starts_with) {
        this.sottotipo___starts_with = sottotipo___starts_with;
    }

    public String getSottotipo___not___starts_with() {
        return sottotipo___not___starts_with;
    }
    public void setSottotipo___not___starts_with(String sottotipo___not___starts_with) {
        this.sottotipo___not___starts_with = sottotipo___not___starts_with;
    }

    public String getSottotipo___ends_with() {
        return sottotipo___ends_with;
    }
    public void setSottotipo___ends_with(String sottotipo___ends_with) {
        this.sottotipo___ends_with = sottotipo___ends_with;
    }

    public String getSottotipo___not___ends_with() {
        return sottotipo___not___ends_with;
    }
    public void setSottotipo___not___ends_with(String sottotipo___not___ends_with) {
        this.sottotipo___not___ends_with = sottotipo___not___ends_with;
    }

    public String getTipo_sequenza___eq() {
        return tipo_sequenza___eq;
    }
    public void setTipo_sequenza___eq(String tipo_sequenza___eq) {
        this.tipo_sequenza___eq = tipo_sequenza___eq;
    }

    public String getTipo_sequenza___ne() {
        return tipo_sequenza___ne;
    }
    public void setTipo_sequenza___ne(String tipo_sequenza___ne) {
        this.tipo_sequenza___ne = tipo_sequenza___ne;
    }

    public Boolean getTipo_sequenza___null() {
        return tipo_sequenza___null;
    }
    public void setTipo_sequenza___null(Boolean tipo_sequenza___null) {
        this.tipo_sequenza___null = tipo_sequenza___null;
    }

    public Boolean getTipo_sequenza___not___null() {
        return tipo_sequenza___not___null;
    }
    public void setTipo_sequenza___not___null(Boolean tipo_sequenza___not___null) {
        this.tipo_sequenza___not___null = tipo_sequenza___not___null;
    }

    public java.util.List<String> getTipo_sequenza___in() {
        return tipo_sequenza___in;
    }
    public void setTipo_sequenza___in(java.util.List<String> tipo_sequenza___in) {
        this.tipo_sequenza___in = tipo_sequenza___in;
    }

    public java.util.List<String> getTipo_sequenza___not___in() {
        return tipo_sequenza___not___in;
    }
    public void setTipo_sequenza___not___in(java.util.List<String> tipo_sequenza___not___in) {
        this.tipo_sequenza___not___in = tipo_sequenza___not___in;
    }

    public String getTipo_sequenza___lt() {
        return tipo_sequenza___lt;
    }
    public void setTipo_sequenza___lt(String tipo_sequenza___lt) {
        this.tipo_sequenza___lt = tipo_sequenza___lt;
    }

    public String getTipo_sequenza___lte() {
        return tipo_sequenza___lte;
    }
    public void setTipo_sequenza___lte(String tipo_sequenza___lte) {
        this.tipo_sequenza___lte = tipo_sequenza___lte;
    }

    public String getTipo_sequenza___gt() {
        return tipo_sequenza___gt;
    }
    public void setTipo_sequenza___gt(String tipo_sequenza___gt) {
        this.tipo_sequenza___gt = tipo_sequenza___gt;
    }

    public String getTipo_sequenza___gte() {
        return tipo_sequenza___gte;
    }
    public void setTipo_sequenza___gte(String tipo_sequenza___gte) {
        this.tipo_sequenza___gte = tipo_sequenza___gte;
    }

    public String getTipo_sequenza___contains() {
        return tipo_sequenza___contains;
    }
    public void setTipo_sequenza___contains(String tipo_sequenza___contains) {
        this.tipo_sequenza___contains = tipo_sequenza___contains;
    }

    public String getTipo_sequenza___not___contains() {
        return tipo_sequenza___not___contains;
    }
    public void setTipo_sequenza___not___contains(String tipo_sequenza___not___contains) {
        this.tipo_sequenza___not___contains = tipo_sequenza___not___contains;
    }

    public String getTipo_sequenza___starts_with() {
        return tipo_sequenza___starts_with;
    }
    public void setTipo_sequenza___starts_with(String tipo_sequenza___starts_with) {
        this.tipo_sequenza___starts_with = tipo_sequenza___starts_with;
    }

    public String getTipo_sequenza___not___starts_with() {
        return tipo_sequenza___not___starts_with;
    }
    public void setTipo_sequenza___not___starts_with(String tipo_sequenza___not___starts_with) {
        this.tipo_sequenza___not___starts_with = tipo_sequenza___not___starts_with;
    }

    public String getTipo_sequenza___ends_with() {
        return tipo_sequenza___ends_with;
    }
    public void setTipo_sequenza___ends_with(String tipo_sequenza___ends_with) {
        this.tipo_sequenza___ends_with = tipo_sequenza___ends_with;
    }

    public String getTipo_sequenza___not___ends_with() {
        return tipo_sequenza___not___ends_with;
    }
    public void setTipo_sequenza___not___ends_with(String tipo_sequenza___not___ends_with) {
        this.tipo_sequenza___not___ends_with = tipo_sequenza___not___ends_with;
    }

    public java.util.List<CliSequenza_genomicaFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliSequenza_genomicaFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliSequenza_genomicaFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliSequenza_genomicaFilterDTO> OR) {
        this.OR = OR;
    }

    public CliSequenza_genomicaFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliSequenza_genomicaFilterDTO NOT) {
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
        if (altro_centro___eq != null) {
            joiner.add("altro_centro___eq: " + GraphQLRequestSerializer.getEntry(altro_centro___eq));
        }
        if (altro_centro___ne != null) {
            joiner.add("altro_centro___ne: " + GraphQLRequestSerializer.getEntry(altro_centro___ne));
        }
        if (altro_centro___null != null) {
            joiner.add("altro_centro___null: " + GraphQLRequestSerializer.getEntry(altro_centro___null));
        }
        if (altro_centro___not___null != null) {
            joiner.add("altro_centro___not___null: " + GraphQLRequestSerializer.getEntry(altro_centro___not___null));
        }
        if (altro_centro___in != null) {
            joiner.add("altro_centro___in: " + GraphQLRequestSerializer.getEntry(altro_centro___in));
        }
        if (altro_centro___not___in != null) {
            joiner.add("altro_centro___not___in: " + GraphQLRequestSerializer.getEntry(altro_centro___not___in));
        }
        if (altro_centro___lt != null) {
            joiner.add("altro_centro___lt: " + GraphQLRequestSerializer.getEntry(altro_centro___lt));
        }
        if (altro_centro___lte != null) {
            joiner.add("altro_centro___lte: " + GraphQLRequestSerializer.getEntry(altro_centro___lte));
        }
        if (altro_centro___gt != null) {
            joiner.add("altro_centro___gt: " + GraphQLRequestSerializer.getEntry(altro_centro___gt));
        }
        if (altro_centro___gte != null) {
            joiner.add("altro_centro___gte: " + GraphQLRequestSerializer.getEntry(altro_centro___gte));
        }
        if (altro_centro___contains != null) {
            joiner.add("altro_centro___contains: " + GraphQLRequestSerializer.getEntry(altro_centro___contains));
        }
        if (altro_centro___not___contains != null) {
            joiner.add("altro_centro___not___contains: " + GraphQLRequestSerializer.getEntry(altro_centro___not___contains));
        }
        if (altro_centro___starts_with != null) {
            joiner.add("altro_centro___starts_with: " + GraphQLRequestSerializer.getEntry(altro_centro___starts_with));
        }
        if (altro_centro___not___starts_with != null) {
            joiner.add("altro_centro___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_centro___not___starts_with));
        }
        if (altro_centro___ends_with != null) {
            joiner.add("altro_centro___ends_with: " + GraphQLRequestSerializer.getEntry(altro_centro___ends_with));
        }
        if (altro_centro___not___ends_with != null) {
            joiner.add("altro_centro___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_centro___not___ends_with));
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
        if (codice_paziente___eq != null) {
            joiner.add("codice_paziente___eq: " + GraphQLRequestSerializer.getEntry(codice_paziente___eq));
        }
        if (codice_paziente___ne != null) {
            joiner.add("codice_paziente___ne: " + GraphQLRequestSerializer.getEntry(codice_paziente___ne));
        }
        if (codice_paziente___null != null) {
            joiner.add("codice_paziente___null: " + GraphQLRequestSerializer.getEntry(codice_paziente___null));
        }
        if (codice_paziente___not___null != null) {
            joiner.add("codice_paziente___not___null: " + GraphQLRequestSerializer.getEntry(codice_paziente___not___null));
        }
        if (codice_paziente___in != null) {
            joiner.add("codice_paziente___in: " + GraphQLRequestSerializer.getEntry(codice_paziente___in));
        }
        if (codice_paziente___not___in != null) {
            joiner.add("codice_paziente___not___in: " + GraphQLRequestSerializer.getEntry(codice_paziente___not___in));
        }
        if (codice_paziente___lt != null) {
            joiner.add("codice_paziente___lt: " + GraphQLRequestSerializer.getEntry(codice_paziente___lt));
        }
        if (codice_paziente___lte != null) {
            joiner.add("codice_paziente___lte: " + GraphQLRequestSerializer.getEntry(codice_paziente___lte));
        }
        if (codice_paziente___gt != null) {
            joiner.add("codice_paziente___gt: " + GraphQLRequestSerializer.getEntry(codice_paziente___gt));
        }
        if (codice_paziente___gte != null) {
            joiner.add("codice_paziente___gte: " + GraphQLRequestSerializer.getEntry(codice_paziente___gte));
        }
        if (codice_paziente___contains != null) {
            joiner.add("codice_paziente___contains: " + GraphQLRequestSerializer.getEntry(codice_paziente___contains));
        }
        if (codice_paziente___not___contains != null) {
            joiner.add("codice_paziente___not___contains: " + GraphQLRequestSerializer.getEntry(codice_paziente___not___contains));
        }
        if (codice_paziente___starts_with != null) {
            joiner.add("codice_paziente___starts_with: " + GraphQLRequestSerializer.getEntry(codice_paziente___starts_with));
        }
        if (codice_paziente___not___starts_with != null) {
            joiner.add("codice_paziente___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_paziente___not___starts_with));
        }
        if (codice_paziente___ends_with != null) {
            joiner.add("codice_paziente___ends_with: " + GraphQLRequestSerializer.getEntry(codice_paziente___ends_with));
        }
        if (codice_paziente___not___ends_with != null) {
            joiner.add("codice_paziente___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_paziente___not___ends_with));
        }
        if (data_analisi___eq != null) {
            joiner.add("data_analisi___eq: " + GraphQLRequestSerializer.getEntry(data_analisi___eq));
        }
        if (data_analisi___ne != null) {
            joiner.add("data_analisi___ne: " + GraphQLRequestSerializer.getEntry(data_analisi___ne));
        }
        if (data_analisi___null != null) {
            joiner.add("data_analisi___null: " + GraphQLRequestSerializer.getEntry(data_analisi___null));
        }
        if (data_analisi___not___null != null) {
            joiner.add("data_analisi___not___null: " + GraphQLRequestSerializer.getEntry(data_analisi___not___null));
        }
        if (data_analisi___in != null) {
            joiner.add("data_analisi___in: " + GraphQLRequestSerializer.getEntry(data_analisi___in));
        }
        if (data_analisi___not___in != null) {
            joiner.add("data_analisi___not___in: " + GraphQLRequestSerializer.getEntry(data_analisi___not___in));
        }
        if (data_analisi___lt != null) {
            joiner.add("data_analisi___lt: " + GraphQLRequestSerializer.getEntry(data_analisi___lt));
        }
        if (data_analisi___lte != null) {
            joiner.add("data_analisi___lte: " + GraphQLRequestSerializer.getEntry(data_analisi___lte));
        }
        if (data_analisi___gt != null) {
            joiner.add("data_analisi___gt: " + GraphQLRequestSerializer.getEntry(data_analisi___gt));
        }
        if (data_analisi___gte != null) {
            joiner.add("data_analisi___gte: " + GraphQLRequestSerializer.getEntry(data_analisi___gte));
        }
        if (data_prelievo___eq != null) {
            joiner.add("data_prelievo___eq: " + GraphQLRequestSerializer.getEntry(data_prelievo___eq));
        }
        if (data_prelievo___ne != null) {
            joiner.add("data_prelievo___ne: " + GraphQLRequestSerializer.getEntry(data_prelievo___ne));
        }
        if (data_prelievo___null != null) {
            joiner.add("data_prelievo___null: " + GraphQLRequestSerializer.getEntry(data_prelievo___null));
        }
        if (data_prelievo___not___null != null) {
            joiner.add("data_prelievo___not___null: " + GraphQLRequestSerializer.getEntry(data_prelievo___not___null));
        }
        if (data_prelievo___in != null) {
            joiner.add("data_prelievo___in: " + GraphQLRequestSerializer.getEntry(data_prelievo___in));
        }
        if (data_prelievo___not___in != null) {
            joiner.add("data_prelievo___not___in: " + GraphQLRequestSerializer.getEntry(data_prelievo___not___in));
        }
        if (data_prelievo___lt != null) {
            joiner.add("data_prelievo___lt: " + GraphQLRequestSerializer.getEntry(data_prelievo___lt));
        }
        if (data_prelievo___lte != null) {
            joiner.add("data_prelievo___lte: " + GraphQLRequestSerializer.getEntry(data_prelievo___lte));
        }
        if (data_prelievo___gt != null) {
            joiner.add("data_prelievo___gt: " + GraphQLRequestSerializer.getEntry(data_prelievo___gt));
        }
        if (data_prelievo___gte != null) {
            joiner.add("data_prelievo___gte: " + GraphQLRequestSerializer.getEntry(data_prelievo___gte));
        }
        if (effettuato_su___eq != null) {
            joiner.add("effettuato_su___eq: " + GraphQLRequestSerializer.getEntry(effettuato_su___eq));
        }
        if (effettuato_su___ne != null) {
            joiner.add("effettuato_su___ne: " + GraphQLRequestSerializer.getEntry(effettuato_su___ne));
        }
        if (effettuato_su___null != null) {
            joiner.add("effettuato_su___null: " + GraphQLRequestSerializer.getEntry(effettuato_su___null));
        }
        if (effettuato_su___not___null != null) {
            joiner.add("effettuato_su___not___null: " + GraphQLRequestSerializer.getEntry(effettuato_su___not___null));
        }
        if (effettuato_su___in != null) {
            joiner.add("effettuato_su___in: " + GraphQLRequestSerializer.getEntry(effettuato_su___in));
        }
        if (effettuato_su___not___in != null) {
            joiner.add("effettuato_su___not___in: " + GraphQLRequestSerializer.getEntry(effettuato_su___not___in));
        }
        if (effettuato_su___lt != null) {
            joiner.add("effettuato_su___lt: " + GraphQLRequestSerializer.getEntry(effettuato_su___lt));
        }
        if (effettuato_su___lte != null) {
            joiner.add("effettuato_su___lte: " + GraphQLRequestSerializer.getEntry(effettuato_su___lte));
        }
        if (effettuato_su___gt != null) {
            joiner.add("effettuato_su___gt: " + GraphQLRequestSerializer.getEntry(effettuato_su___gt));
        }
        if (effettuato_su___gte != null) {
            joiner.add("effettuato_su___gte: " + GraphQLRequestSerializer.getEntry(effettuato_su___gte));
        }
        if (effettuato_su___contains != null) {
            joiner.add("effettuato_su___contains: " + GraphQLRequestSerializer.getEntry(effettuato_su___contains));
        }
        if (effettuato_su___not___contains != null) {
            joiner.add("effettuato_su___not___contains: " + GraphQLRequestSerializer.getEntry(effettuato_su___not___contains));
        }
        if (effettuato_su___starts_with != null) {
            joiner.add("effettuato_su___starts_with: " + GraphQLRequestSerializer.getEntry(effettuato_su___starts_with));
        }
        if (effettuato_su___not___starts_with != null) {
            joiner.add("effettuato_su___not___starts_with: " + GraphQLRequestSerializer.getEntry(effettuato_su___not___starts_with));
        }
        if (effettuato_su___ends_with != null) {
            joiner.add("effettuato_su___ends_with: " + GraphQLRequestSerializer.getEntry(effettuato_su___ends_with));
        }
        if (effettuato_su___not___ends_with != null) {
            joiner.add("effettuato_su___not___ends_with: " + GraphQLRequestSerializer.getEntry(effettuato_su___not___ends_with));
        }
        if (elenco_mutazioni_ENV___eq != null) {
            joiner.add("elenco_mutazioni_ENV___eq: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___eq));
        }
        if (elenco_mutazioni_ENV___ne != null) {
            joiner.add("elenco_mutazioni_ENV___ne: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___ne));
        }
        if (elenco_mutazioni_ENV___null != null) {
            joiner.add("elenco_mutazioni_ENV___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___null));
        }
        if (elenco_mutazioni_ENV___not___null != null) {
            joiner.add("elenco_mutazioni_ENV___not___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___not___null));
        }
        if (elenco_mutazioni_ENV___in != null) {
            joiner.add("elenco_mutazioni_ENV___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___in));
        }
        if (elenco_mutazioni_ENV___not___in != null) {
            joiner.add("elenco_mutazioni_ENV___not___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___not___in));
        }
        if (elenco_mutazioni_ENV___lt != null) {
            joiner.add("elenco_mutazioni_ENV___lt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___lt));
        }
        if (elenco_mutazioni_ENV___lte != null) {
            joiner.add("elenco_mutazioni_ENV___lte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___lte));
        }
        if (elenco_mutazioni_ENV___gt != null) {
            joiner.add("elenco_mutazioni_ENV___gt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___gt));
        }
        if (elenco_mutazioni_ENV___gte != null) {
            joiner.add("elenco_mutazioni_ENV___gte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___gte));
        }
        if (elenco_mutazioni_ENV___contains != null) {
            joiner.add("elenco_mutazioni_ENV___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___contains));
        }
        if (elenco_mutazioni_ENV___not___contains != null) {
            joiner.add("elenco_mutazioni_ENV___not___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___not___contains));
        }
        if (elenco_mutazioni_ENV___starts_with != null) {
            joiner.add("elenco_mutazioni_ENV___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___starts_with));
        }
        if (elenco_mutazioni_ENV___not___starts_with != null) {
            joiner.add("elenco_mutazioni_ENV___not___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___not___starts_with));
        }
        if (elenco_mutazioni_ENV___ends_with != null) {
            joiner.add("elenco_mutazioni_ENV___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___ends_with));
        }
        if (elenco_mutazioni_ENV___not___ends_with != null) {
            joiner.add("elenco_mutazioni_ENV___not___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_ENV___not___ends_with));
        }
        if (elenco_mutazioni_INT___eq != null) {
            joiner.add("elenco_mutazioni_INT___eq: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___eq));
        }
        if (elenco_mutazioni_INT___ne != null) {
            joiner.add("elenco_mutazioni_INT___ne: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___ne));
        }
        if (elenco_mutazioni_INT___null != null) {
            joiner.add("elenco_mutazioni_INT___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___null));
        }
        if (elenco_mutazioni_INT___not___null != null) {
            joiner.add("elenco_mutazioni_INT___not___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___not___null));
        }
        if (elenco_mutazioni_INT___in != null) {
            joiner.add("elenco_mutazioni_INT___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___in));
        }
        if (elenco_mutazioni_INT___not___in != null) {
            joiner.add("elenco_mutazioni_INT___not___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___not___in));
        }
        if (elenco_mutazioni_INT___lt != null) {
            joiner.add("elenco_mutazioni_INT___lt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___lt));
        }
        if (elenco_mutazioni_INT___lte != null) {
            joiner.add("elenco_mutazioni_INT___lte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___lte));
        }
        if (elenco_mutazioni_INT___gt != null) {
            joiner.add("elenco_mutazioni_INT___gt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___gt));
        }
        if (elenco_mutazioni_INT___gte != null) {
            joiner.add("elenco_mutazioni_INT___gte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___gte));
        }
        if (elenco_mutazioni_INT___contains != null) {
            joiner.add("elenco_mutazioni_INT___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___contains));
        }
        if (elenco_mutazioni_INT___not___contains != null) {
            joiner.add("elenco_mutazioni_INT___not___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___not___contains));
        }
        if (elenco_mutazioni_INT___starts_with != null) {
            joiner.add("elenco_mutazioni_INT___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___starts_with));
        }
        if (elenco_mutazioni_INT___not___starts_with != null) {
            joiner.add("elenco_mutazioni_INT___not___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___not___starts_with));
        }
        if (elenco_mutazioni_INT___ends_with != null) {
            joiner.add("elenco_mutazioni_INT___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___ends_with));
        }
        if (elenco_mutazioni_INT___not___ends_with != null) {
            joiner.add("elenco_mutazioni_INT___not___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_INT___not___ends_with));
        }
        if (elenco_mutazioni_PR___eq != null) {
            joiner.add("elenco_mutazioni_PR___eq: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___eq));
        }
        if (elenco_mutazioni_PR___ne != null) {
            joiner.add("elenco_mutazioni_PR___ne: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___ne));
        }
        if (elenco_mutazioni_PR___null != null) {
            joiner.add("elenco_mutazioni_PR___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___null));
        }
        if (elenco_mutazioni_PR___not___null != null) {
            joiner.add("elenco_mutazioni_PR___not___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___not___null));
        }
        if (elenco_mutazioni_PR___in != null) {
            joiner.add("elenco_mutazioni_PR___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___in));
        }
        if (elenco_mutazioni_PR___not___in != null) {
            joiner.add("elenco_mutazioni_PR___not___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___not___in));
        }
        if (elenco_mutazioni_PR___lt != null) {
            joiner.add("elenco_mutazioni_PR___lt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___lt));
        }
        if (elenco_mutazioni_PR___lte != null) {
            joiner.add("elenco_mutazioni_PR___lte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___lte));
        }
        if (elenco_mutazioni_PR___gt != null) {
            joiner.add("elenco_mutazioni_PR___gt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___gt));
        }
        if (elenco_mutazioni_PR___gte != null) {
            joiner.add("elenco_mutazioni_PR___gte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___gte));
        }
        if (elenco_mutazioni_PR___contains != null) {
            joiner.add("elenco_mutazioni_PR___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___contains));
        }
        if (elenco_mutazioni_PR___not___contains != null) {
            joiner.add("elenco_mutazioni_PR___not___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___not___contains));
        }
        if (elenco_mutazioni_PR___starts_with != null) {
            joiner.add("elenco_mutazioni_PR___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___starts_with));
        }
        if (elenco_mutazioni_PR___not___starts_with != null) {
            joiner.add("elenco_mutazioni_PR___not___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___not___starts_with));
        }
        if (elenco_mutazioni_PR___ends_with != null) {
            joiner.add("elenco_mutazioni_PR___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___ends_with));
        }
        if (elenco_mutazioni_PR___not___ends_with != null) {
            joiner.add("elenco_mutazioni_PR___not___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_PR___not___ends_with));
        }
        if (elenco_mutazioni_RT___eq != null) {
            joiner.add("elenco_mutazioni_RT___eq: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___eq));
        }
        if (elenco_mutazioni_RT___ne != null) {
            joiner.add("elenco_mutazioni_RT___ne: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___ne));
        }
        if (elenco_mutazioni_RT___null != null) {
            joiner.add("elenco_mutazioni_RT___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___null));
        }
        if (elenco_mutazioni_RT___not___null != null) {
            joiner.add("elenco_mutazioni_RT___not___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___not___null));
        }
        if (elenco_mutazioni_RT___in != null) {
            joiner.add("elenco_mutazioni_RT___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___in));
        }
        if (elenco_mutazioni_RT___not___in != null) {
            joiner.add("elenco_mutazioni_RT___not___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___not___in));
        }
        if (elenco_mutazioni_RT___lt != null) {
            joiner.add("elenco_mutazioni_RT___lt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___lt));
        }
        if (elenco_mutazioni_RT___lte != null) {
            joiner.add("elenco_mutazioni_RT___lte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___lte));
        }
        if (elenco_mutazioni_RT___gt != null) {
            joiner.add("elenco_mutazioni_RT___gt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___gt));
        }
        if (elenco_mutazioni_RT___gte != null) {
            joiner.add("elenco_mutazioni_RT___gte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___gte));
        }
        if (elenco_mutazioni_RT___contains != null) {
            joiner.add("elenco_mutazioni_RT___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___contains));
        }
        if (elenco_mutazioni_RT___not___contains != null) {
            joiner.add("elenco_mutazioni_RT___not___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___not___contains));
        }
        if (elenco_mutazioni_RT___starts_with != null) {
            joiner.add("elenco_mutazioni_RT___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___starts_with));
        }
        if (elenco_mutazioni_RT___not___starts_with != null) {
            joiner.add("elenco_mutazioni_RT___not___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___not___starts_with));
        }
        if (elenco_mutazioni_RT___ends_with != null) {
            joiner.add("elenco_mutazioni_RT___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___ends_with));
        }
        if (elenco_mutazioni_RT___not___ends_with != null) {
            joiner.add("elenco_mutazioni_RT___not___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_RT___not___ends_with));
        }
        if (elenco_mutazioni_V3___eq != null) {
            joiner.add("elenco_mutazioni_V3___eq: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___eq));
        }
        if (elenco_mutazioni_V3___ne != null) {
            joiner.add("elenco_mutazioni_V3___ne: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___ne));
        }
        if (elenco_mutazioni_V3___null != null) {
            joiner.add("elenco_mutazioni_V3___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___null));
        }
        if (elenco_mutazioni_V3___not___null != null) {
            joiner.add("elenco_mutazioni_V3___not___null: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___not___null));
        }
        if (elenco_mutazioni_V3___in != null) {
            joiner.add("elenco_mutazioni_V3___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___in));
        }
        if (elenco_mutazioni_V3___not___in != null) {
            joiner.add("elenco_mutazioni_V3___not___in: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___not___in));
        }
        if (elenco_mutazioni_V3___lt != null) {
            joiner.add("elenco_mutazioni_V3___lt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___lt));
        }
        if (elenco_mutazioni_V3___lte != null) {
            joiner.add("elenco_mutazioni_V3___lte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___lte));
        }
        if (elenco_mutazioni_V3___gt != null) {
            joiner.add("elenco_mutazioni_V3___gt: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___gt));
        }
        if (elenco_mutazioni_V3___gte != null) {
            joiner.add("elenco_mutazioni_V3___gte: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___gte));
        }
        if (elenco_mutazioni_V3___contains != null) {
            joiner.add("elenco_mutazioni_V3___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___contains));
        }
        if (elenco_mutazioni_V3___not___contains != null) {
            joiner.add("elenco_mutazioni_V3___not___contains: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___not___contains));
        }
        if (elenco_mutazioni_V3___starts_with != null) {
            joiner.add("elenco_mutazioni_V3___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___starts_with));
        }
        if (elenco_mutazioni_V3___not___starts_with != null) {
            joiner.add("elenco_mutazioni_V3___not___starts_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___not___starts_with));
        }
        if (elenco_mutazioni_V3___ends_with != null) {
            joiner.add("elenco_mutazioni_V3___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___ends_with));
        }
        if (elenco_mutazioni_V3___not___ends_with != null) {
            joiner.add("elenco_mutazioni_V3___not___ends_with: " + GraphQLRequestSerializer.getEntry(elenco_mutazioni_V3___not___ends_with));
        }
        if (etichetta___eq != null) {
            joiner.add("etichetta___eq: " + GraphQLRequestSerializer.getEntry(etichetta___eq));
        }
        if (etichetta___ne != null) {
            joiner.add("etichetta___ne: " + GraphQLRequestSerializer.getEntry(etichetta___ne));
        }
        if (etichetta___null != null) {
            joiner.add("etichetta___null: " + GraphQLRequestSerializer.getEntry(etichetta___null));
        }
        if (etichetta___not___null != null) {
            joiner.add("etichetta___not___null: " + GraphQLRequestSerializer.getEntry(etichetta___not___null));
        }
        if (etichetta___in != null) {
            joiner.add("etichetta___in: " + GraphQLRequestSerializer.getEntry(etichetta___in));
        }
        if (etichetta___not___in != null) {
            joiner.add("etichetta___not___in: " + GraphQLRequestSerializer.getEntry(etichetta___not___in));
        }
        if (etichetta___lt != null) {
            joiner.add("etichetta___lt: " + GraphQLRequestSerializer.getEntry(etichetta___lt));
        }
        if (etichetta___lte != null) {
            joiner.add("etichetta___lte: " + GraphQLRequestSerializer.getEntry(etichetta___lte));
        }
        if (etichetta___gt != null) {
            joiner.add("etichetta___gt: " + GraphQLRequestSerializer.getEntry(etichetta___gt));
        }
        if (etichetta___gte != null) {
            joiner.add("etichetta___gte: " + GraphQLRequestSerializer.getEntry(etichetta___gte));
        }
        if (etichetta___contains != null) {
            joiner.add("etichetta___contains: " + GraphQLRequestSerializer.getEntry(etichetta___contains));
        }
        if (etichetta___not___contains != null) {
            joiner.add("etichetta___not___contains: " + GraphQLRequestSerializer.getEntry(etichetta___not___contains));
        }
        if (etichetta___starts_with != null) {
            joiner.add("etichetta___starts_with: " + GraphQLRequestSerializer.getEntry(etichetta___starts_with));
        }
        if (etichetta___not___starts_with != null) {
            joiner.add("etichetta___not___starts_with: " + GraphQLRequestSerializer.getEntry(etichetta___not___starts_with));
        }
        if (etichetta___ends_with != null) {
            joiner.add("etichetta___ends_with: " + GraphQLRequestSerializer.getEntry(etichetta___ends_with));
        }
        if (etichetta___not___ends_with != null) {
            joiner.add("etichetta___not___ends_with: " + GraphQLRequestSerializer.getEntry(etichetta___not___ends_with));
        }
        if (filtro_codice_paziente___eq != null) {
            joiner.add("filtro_codice_paziente___eq: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___eq));
        }
        if (filtro_codice_paziente___ne != null) {
            joiner.add("filtro_codice_paziente___ne: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___ne));
        }
        if (filtro_codice_paziente___null != null) {
            joiner.add("filtro_codice_paziente___null: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___null));
        }
        if (filtro_codice_paziente___not___null != null) {
            joiner.add("filtro_codice_paziente___not___null: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___not___null));
        }
        if (filtro_codice_paziente___in != null) {
            joiner.add("filtro_codice_paziente___in: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___in));
        }
        if (filtro_codice_paziente___not___in != null) {
            joiner.add("filtro_codice_paziente___not___in: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___not___in));
        }
        if (filtro_codice_paziente___lt != null) {
            joiner.add("filtro_codice_paziente___lt: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___lt));
        }
        if (filtro_codice_paziente___lte != null) {
            joiner.add("filtro_codice_paziente___lte: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___lte));
        }
        if (filtro_codice_paziente___gt != null) {
            joiner.add("filtro_codice_paziente___gt: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___gt));
        }
        if (filtro_codice_paziente___gte != null) {
            joiner.add("filtro_codice_paziente___gte: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___gte));
        }
        if (filtro_codice_paziente___contains != null) {
            joiner.add("filtro_codice_paziente___contains: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___contains));
        }
        if (filtro_codice_paziente___not___contains != null) {
            joiner.add("filtro_codice_paziente___not___contains: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___not___contains));
        }
        if (filtro_codice_paziente___starts_with != null) {
            joiner.add("filtro_codice_paziente___starts_with: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___starts_with));
        }
        if (filtro_codice_paziente___not___starts_with != null) {
            joiner.add("filtro_codice_paziente___not___starts_with: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___not___starts_with));
        }
        if (filtro_codice_paziente___ends_with != null) {
            joiner.add("filtro_codice_paziente___ends_with: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___ends_with));
        }
        if (filtro_codice_paziente___not___ends_with != null) {
            joiner.add("filtro_codice_paziente___not___ends_with: " + GraphQLRequestSerializer.getEntry(filtro_codice_paziente___not___ends_with));
        }
        if (mutazioni___eq != null) {
            joiner.add("mutazioni___eq: " + GraphQLRequestSerializer.getEntry(mutazioni___eq));
        }
        if (mutazioni___ne != null) {
            joiner.add("mutazioni___ne: " + GraphQLRequestSerializer.getEntry(mutazioni___ne));
        }
        if (mutazioni___null != null) {
            joiner.add("mutazioni___null: " + GraphQLRequestSerializer.getEntry(mutazioni___null));
        }
        if (mutazioni___not___null != null) {
            joiner.add("mutazioni___not___null: " + GraphQLRequestSerializer.getEntry(mutazioni___not___null));
        }
        if (mutazioni___in != null) {
            joiner.add("mutazioni___in: " + GraphQLRequestSerializer.getEntry(mutazioni___in));
        }
        if (mutazioni___not___in != null) {
            joiner.add("mutazioni___not___in: " + GraphQLRequestSerializer.getEntry(mutazioni___not___in));
        }
        if (mutazioni___lt != null) {
            joiner.add("mutazioni___lt: " + GraphQLRequestSerializer.getEntry(mutazioni___lt));
        }
        if (mutazioni___lte != null) {
            joiner.add("mutazioni___lte: " + GraphQLRequestSerializer.getEntry(mutazioni___lte));
        }
        if (mutazioni___gt != null) {
            joiner.add("mutazioni___gt: " + GraphQLRequestSerializer.getEntry(mutazioni___gt));
        }
        if (mutazioni___gte != null) {
            joiner.add("mutazioni___gte: " + GraphQLRequestSerializer.getEntry(mutazioni___gte));
        }
        if (mutazioni_no_farmaco___eq != null) {
            joiner.add("mutazioni_no_farmaco___eq: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___eq));
        }
        if (mutazioni_no_farmaco___ne != null) {
            joiner.add("mutazioni_no_farmaco___ne: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___ne));
        }
        if (mutazioni_no_farmaco___null != null) {
            joiner.add("mutazioni_no_farmaco___null: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___null));
        }
        if (mutazioni_no_farmaco___not___null != null) {
            joiner.add("mutazioni_no_farmaco___not___null: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___not___null));
        }
        if (mutazioni_no_farmaco___in != null) {
            joiner.add("mutazioni_no_farmaco___in: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___in));
        }
        if (mutazioni_no_farmaco___not___in != null) {
            joiner.add("mutazioni_no_farmaco___not___in: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___not___in));
        }
        if (mutazioni_no_farmaco___lt != null) {
            joiner.add("mutazioni_no_farmaco___lt: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___lt));
        }
        if (mutazioni_no_farmaco___lte != null) {
            joiner.add("mutazioni_no_farmaco___lte: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___lte));
        }
        if (mutazioni_no_farmaco___gt != null) {
            joiner.add("mutazioni_no_farmaco___gt: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___gt));
        }
        if (mutazioni_no_farmaco___gte != null) {
            joiner.add("mutazioni_no_farmaco___gte: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___gte));
        }
        if (mutazioni_no_farmaco___contains != null) {
            joiner.add("mutazioni_no_farmaco___contains: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___contains));
        }
        if (mutazioni_no_farmaco___not___contains != null) {
            joiner.add("mutazioni_no_farmaco___not___contains: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___not___contains));
        }
        if (mutazioni_no_farmaco___starts_with != null) {
            joiner.add("mutazioni_no_farmaco___starts_with: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___starts_with));
        }
        if (mutazioni_no_farmaco___not___starts_with != null) {
            joiner.add("mutazioni_no_farmaco___not___starts_with: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___not___starts_with));
        }
        if (mutazioni_no_farmaco___ends_with != null) {
            joiner.add("mutazioni_no_farmaco___ends_with: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___ends_with));
        }
        if (mutazioni_no_farmaco___not___ends_with != null) {
            joiner.add("mutazioni_no_farmaco___not___ends_with: " + GraphQLRequestSerializer.getEntry(mutazioni_no_farmaco___not___ends_with));
        }
        if (nessuna_mutazione_ENV___eq != null) {
            joiner.add("nessuna_mutazione_ENV___eq: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_ENV___eq));
        }
        if (nessuna_mutazione_ENV___ne != null) {
            joiner.add("nessuna_mutazione_ENV___ne: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_ENV___ne));
        }
        if (nessuna_mutazione_ENV___null != null) {
            joiner.add("nessuna_mutazione_ENV___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_ENV___null));
        }
        if (nessuna_mutazione_ENV___not___null != null) {
            joiner.add("nessuna_mutazione_ENV___not___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_ENV___not___null));
        }
        if (nessuna_mutazione_INT___eq != null) {
            joiner.add("nessuna_mutazione_INT___eq: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_INT___eq));
        }
        if (nessuna_mutazione_INT___ne != null) {
            joiner.add("nessuna_mutazione_INT___ne: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_INT___ne));
        }
        if (nessuna_mutazione_INT___null != null) {
            joiner.add("nessuna_mutazione_INT___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_INT___null));
        }
        if (nessuna_mutazione_INT___not___null != null) {
            joiner.add("nessuna_mutazione_INT___not___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_INT___not___null));
        }
        if (nessuna_mutazione_PR___eq != null) {
            joiner.add("nessuna_mutazione_PR___eq: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_PR___eq));
        }
        if (nessuna_mutazione_PR___ne != null) {
            joiner.add("nessuna_mutazione_PR___ne: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_PR___ne));
        }
        if (nessuna_mutazione_PR___null != null) {
            joiner.add("nessuna_mutazione_PR___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_PR___null));
        }
        if (nessuna_mutazione_PR___not___null != null) {
            joiner.add("nessuna_mutazione_PR___not___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_PR___not___null));
        }
        if (nessuna_mutazione_RT___eq != null) {
            joiner.add("nessuna_mutazione_RT___eq: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_RT___eq));
        }
        if (nessuna_mutazione_RT___ne != null) {
            joiner.add("nessuna_mutazione_RT___ne: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_RT___ne));
        }
        if (nessuna_mutazione_RT___null != null) {
            joiner.add("nessuna_mutazione_RT___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_RT___null));
        }
        if (nessuna_mutazione_RT___not___null != null) {
            joiner.add("nessuna_mutazione_RT___not___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_RT___not___null));
        }
        if (nessuna_mutazione_V3___eq != null) {
            joiner.add("nessuna_mutazione_V3___eq: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_V3___eq));
        }
        if (nessuna_mutazione_V3___ne != null) {
            joiner.add("nessuna_mutazione_V3___ne: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_V3___ne));
        }
        if (nessuna_mutazione_V3___null != null) {
            joiner.add("nessuna_mutazione_V3___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_V3___null));
        }
        if (nessuna_mutazione_V3___not___null != null) {
            joiner.add("nessuna_mutazione_V3___not___null: " + GraphQLRequestSerializer.getEntry(nessuna_mutazione_V3___not___null));
        }
        if (nucleotidi___eq != null) {
            joiner.add("nucleotidi___eq: " + GraphQLRequestSerializer.getEntry(nucleotidi___eq));
        }
        if (nucleotidi___ne != null) {
            joiner.add("nucleotidi___ne: " + GraphQLRequestSerializer.getEntry(nucleotidi___ne));
        }
        if (nucleotidi___null != null) {
            joiner.add("nucleotidi___null: " + GraphQLRequestSerializer.getEntry(nucleotidi___null));
        }
        if (nucleotidi___not___null != null) {
            joiner.add("nucleotidi___not___null: " + GraphQLRequestSerializer.getEntry(nucleotidi___not___null));
        }
        if (nucleotidi___in != null) {
            joiner.add("nucleotidi___in: " + GraphQLRequestSerializer.getEntry(nucleotidi___in));
        }
        if (nucleotidi___not___in != null) {
            joiner.add("nucleotidi___not___in: " + GraphQLRequestSerializer.getEntry(nucleotidi___not___in));
        }
        if (nucleotidi___lt != null) {
            joiner.add("nucleotidi___lt: " + GraphQLRequestSerializer.getEntry(nucleotidi___lt));
        }
        if (nucleotidi___lte != null) {
            joiner.add("nucleotidi___lte: " + GraphQLRequestSerializer.getEntry(nucleotidi___lte));
        }
        if (nucleotidi___gt != null) {
            joiner.add("nucleotidi___gt: " + GraphQLRequestSerializer.getEntry(nucleotidi___gt));
        }
        if (nucleotidi___gte != null) {
            joiner.add("nucleotidi___gte: " + GraphQLRequestSerializer.getEntry(nucleotidi___gte));
        }
        if (nucleotidi___contains != null) {
            joiner.add("nucleotidi___contains: " + GraphQLRequestSerializer.getEntry(nucleotidi___contains));
        }
        if (nucleotidi___not___contains != null) {
            joiner.add("nucleotidi___not___contains: " + GraphQLRequestSerializer.getEntry(nucleotidi___not___contains));
        }
        if (nucleotidi___starts_with != null) {
            joiner.add("nucleotidi___starts_with: " + GraphQLRequestSerializer.getEntry(nucleotidi___starts_with));
        }
        if (nucleotidi___not___starts_with != null) {
            joiner.add("nucleotidi___not___starts_with: " + GraphQLRequestSerializer.getEntry(nucleotidi___not___starts_with));
        }
        if (nucleotidi___ends_with != null) {
            joiner.add("nucleotidi___ends_with: " + GraphQLRequestSerializer.getEntry(nucleotidi___ends_with));
        }
        if (nucleotidi___not___ends_with != null) {
            joiner.add("nucleotidi___not___ends_with: " + GraphQLRequestSerializer.getEntry(nucleotidi___not___ends_with));
        }
        if (regione___eq != null) {
            joiner.add("regione___eq: " + GraphQLRequestSerializer.getEntry(regione___eq));
        }
        if (regione___ne != null) {
            joiner.add("regione___ne: " + GraphQLRequestSerializer.getEntry(regione___ne));
        }
        if (regione___null != null) {
            joiner.add("regione___null: " + GraphQLRequestSerializer.getEntry(regione___null));
        }
        if (regione___not___null != null) {
            joiner.add("regione___not___null: " + GraphQLRequestSerializer.getEntry(regione___not___null));
        }
        if (regione___in != null) {
            joiner.add("regione___in: " + GraphQLRequestSerializer.getEntry(regione___in));
        }
        if (regione___not___in != null) {
            joiner.add("regione___not___in: " + GraphQLRequestSerializer.getEntry(regione___not___in));
        }
        if (regione___lt != null) {
            joiner.add("regione___lt: " + GraphQLRequestSerializer.getEntry(regione___lt));
        }
        if (regione___lte != null) {
            joiner.add("regione___lte: " + GraphQLRequestSerializer.getEntry(regione___lte));
        }
        if (regione___gt != null) {
            joiner.add("regione___gt: " + GraphQLRequestSerializer.getEntry(regione___gt));
        }
        if (regione___gte != null) {
            joiner.add("regione___gte: " + GraphQLRequestSerializer.getEntry(regione___gte));
        }
        if (regione___contains != null) {
            joiner.add("regione___contains: " + GraphQLRequestSerializer.getEntry(regione___contains));
        }
        if (regione___not___contains != null) {
            joiner.add("regione___not___contains: " + GraphQLRequestSerializer.getEntry(regione___not___contains));
        }
        if (regione___starts_with != null) {
            joiner.add("regione___starts_with: " + GraphQLRequestSerializer.getEntry(regione___starts_with));
        }
        if (regione___not___starts_with != null) {
            joiner.add("regione___not___starts_with: " + GraphQLRequestSerializer.getEntry(regione___not___starts_with));
        }
        if (regione___ends_with != null) {
            joiner.add("regione___ends_with: " + GraphQLRequestSerializer.getEntry(regione___ends_with));
        }
        if (regione___not___ends_with != null) {
            joiner.add("regione___not___ends_with: " + GraphQLRequestSerializer.getEntry(regione___not___ends_with));
        }
        if (sottotipo___eq != null) {
            joiner.add("sottotipo___eq: " + GraphQLRequestSerializer.getEntry(sottotipo___eq));
        }
        if (sottotipo___ne != null) {
            joiner.add("sottotipo___ne: " + GraphQLRequestSerializer.getEntry(sottotipo___ne));
        }
        if (sottotipo___null != null) {
            joiner.add("sottotipo___null: " + GraphQLRequestSerializer.getEntry(sottotipo___null));
        }
        if (sottotipo___not___null != null) {
            joiner.add("sottotipo___not___null: " + GraphQLRequestSerializer.getEntry(sottotipo___not___null));
        }
        if (sottotipo___in != null) {
            joiner.add("sottotipo___in: " + GraphQLRequestSerializer.getEntry(sottotipo___in));
        }
        if (sottotipo___not___in != null) {
            joiner.add("sottotipo___not___in: " + GraphQLRequestSerializer.getEntry(sottotipo___not___in));
        }
        if (sottotipo___lt != null) {
            joiner.add("sottotipo___lt: " + GraphQLRequestSerializer.getEntry(sottotipo___lt));
        }
        if (sottotipo___lte != null) {
            joiner.add("sottotipo___lte: " + GraphQLRequestSerializer.getEntry(sottotipo___lte));
        }
        if (sottotipo___gt != null) {
            joiner.add("sottotipo___gt: " + GraphQLRequestSerializer.getEntry(sottotipo___gt));
        }
        if (sottotipo___gte != null) {
            joiner.add("sottotipo___gte: " + GraphQLRequestSerializer.getEntry(sottotipo___gte));
        }
        if (sottotipo___contains != null) {
            joiner.add("sottotipo___contains: " + GraphQLRequestSerializer.getEntry(sottotipo___contains));
        }
        if (sottotipo___not___contains != null) {
            joiner.add("sottotipo___not___contains: " + GraphQLRequestSerializer.getEntry(sottotipo___not___contains));
        }
        if (sottotipo___starts_with != null) {
            joiner.add("sottotipo___starts_with: " + GraphQLRequestSerializer.getEntry(sottotipo___starts_with));
        }
        if (sottotipo___not___starts_with != null) {
            joiner.add("sottotipo___not___starts_with: " + GraphQLRequestSerializer.getEntry(sottotipo___not___starts_with));
        }
        if (sottotipo___ends_with != null) {
            joiner.add("sottotipo___ends_with: " + GraphQLRequestSerializer.getEntry(sottotipo___ends_with));
        }
        if (sottotipo___not___ends_with != null) {
            joiner.add("sottotipo___not___ends_with: " + GraphQLRequestSerializer.getEntry(sottotipo___not___ends_with));
        }
        if (tipo_sequenza___eq != null) {
            joiner.add("tipo_sequenza___eq: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___eq));
        }
        if (tipo_sequenza___ne != null) {
            joiner.add("tipo_sequenza___ne: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___ne));
        }
        if (tipo_sequenza___null != null) {
            joiner.add("tipo_sequenza___null: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___null));
        }
        if (tipo_sequenza___not___null != null) {
            joiner.add("tipo_sequenza___not___null: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___not___null));
        }
        if (tipo_sequenza___in != null) {
            joiner.add("tipo_sequenza___in: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___in));
        }
        if (tipo_sequenza___not___in != null) {
            joiner.add("tipo_sequenza___not___in: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___not___in));
        }
        if (tipo_sequenza___lt != null) {
            joiner.add("tipo_sequenza___lt: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___lt));
        }
        if (tipo_sequenza___lte != null) {
            joiner.add("tipo_sequenza___lte: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___lte));
        }
        if (tipo_sequenza___gt != null) {
            joiner.add("tipo_sequenza___gt: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___gt));
        }
        if (tipo_sequenza___gte != null) {
            joiner.add("tipo_sequenza___gte: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___gte));
        }
        if (tipo_sequenza___contains != null) {
            joiner.add("tipo_sequenza___contains: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___contains));
        }
        if (tipo_sequenza___not___contains != null) {
            joiner.add("tipo_sequenza___not___contains: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___not___contains));
        }
        if (tipo_sequenza___starts_with != null) {
            joiner.add("tipo_sequenza___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___starts_with));
        }
        if (tipo_sequenza___not___starts_with != null) {
            joiner.add("tipo_sequenza___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___not___starts_with));
        }
        if (tipo_sequenza___ends_with != null) {
            joiner.add("tipo_sequenza___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___ends_with));
        }
        if (tipo_sequenza___not___ends_with != null) {
            joiner.add("tipo_sequenza___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_sequenza___not___ends_with));
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

    public static CliSequenza_genomicaFilterDTO.Builder builder() {
        return new CliSequenza_genomicaFilterDTO.Builder();
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
        private String altro_centro___eq;
        private String altro_centro___ne;
        private Boolean altro_centro___null;
        private Boolean altro_centro___not___null;
        private java.util.List<String> altro_centro___in;
        private java.util.List<String> altro_centro___not___in;
        private String altro_centro___lt;
        private String altro_centro___lte;
        private String altro_centro___gt;
        private String altro_centro___gte;
        private String altro_centro___contains;
        private String altro_centro___not___contains;
        private String altro_centro___starts_with;
        private String altro_centro___not___starts_with;
        private String altro_centro___ends_with;
        private String altro_centro___not___ends_with;
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
        private String codice_paziente___eq;
        private String codice_paziente___ne;
        private Boolean codice_paziente___null;
        private Boolean codice_paziente___not___null;
        private java.util.List<String> codice_paziente___in;
        private java.util.List<String> codice_paziente___not___in;
        private String codice_paziente___lt;
        private String codice_paziente___lte;
        private String codice_paziente___gt;
        private String codice_paziente___gte;
        private String codice_paziente___contains;
        private String codice_paziente___not___contains;
        private String codice_paziente___starts_with;
        private String codice_paziente___not___starts_with;
        private String codice_paziente___ends_with;
        private String codice_paziente___not___ends_with;
        private String data_analisi___eq;
        private String data_analisi___ne;
        private Boolean data_analisi___null;
        private Boolean data_analisi___not___null;
        private java.util.List<String> data_analisi___in;
        private java.util.List<String> data_analisi___not___in;
        private String data_analisi___lt;
        private String data_analisi___lte;
        private String data_analisi___gt;
        private String data_analisi___gte;
        private String data_prelievo___eq;
        private String data_prelievo___ne;
        private Boolean data_prelievo___null;
        private Boolean data_prelievo___not___null;
        private java.util.List<String> data_prelievo___in;
        private java.util.List<String> data_prelievo___not___in;
        private String data_prelievo___lt;
        private String data_prelievo___lte;
        private String data_prelievo___gt;
        private String data_prelievo___gte;
        private String effettuato_su___eq;
        private String effettuato_su___ne;
        private Boolean effettuato_su___null;
        private Boolean effettuato_su___not___null;
        private java.util.List<String> effettuato_su___in;
        private java.util.List<String> effettuato_su___not___in;
        private String effettuato_su___lt;
        private String effettuato_su___lte;
        private String effettuato_su___gt;
        private String effettuato_su___gte;
        private String effettuato_su___contains;
        private String effettuato_su___not___contains;
        private String effettuato_su___starts_with;
        private String effettuato_su___not___starts_with;
        private String effettuato_su___ends_with;
        private String effettuato_su___not___ends_with;
        private String elenco_mutazioni_ENV___eq;
        private String elenco_mutazioni_ENV___ne;
        private Boolean elenco_mutazioni_ENV___null;
        private Boolean elenco_mutazioni_ENV___not___null;
        private java.util.List<String> elenco_mutazioni_ENV___in;
        private java.util.List<String> elenco_mutazioni_ENV___not___in;
        private String elenco_mutazioni_ENV___lt;
        private String elenco_mutazioni_ENV___lte;
        private String elenco_mutazioni_ENV___gt;
        private String elenco_mutazioni_ENV___gte;
        private String elenco_mutazioni_ENV___contains;
        private String elenco_mutazioni_ENV___not___contains;
        private String elenco_mutazioni_ENV___starts_with;
        private String elenco_mutazioni_ENV___not___starts_with;
        private String elenco_mutazioni_ENV___ends_with;
        private String elenco_mutazioni_ENV___not___ends_with;
        private String elenco_mutazioni_INT___eq;
        private String elenco_mutazioni_INT___ne;
        private Boolean elenco_mutazioni_INT___null;
        private Boolean elenco_mutazioni_INT___not___null;
        private java.util.List<String> elenco_mutazioni_INT___in;
        private java.util.List<String> elenco_mutazioni_INT___not___in;
        private String elenco_mutazioni_INT___lt;
        private String elenco_mutazioni_INT___lte;
        private String elenco_mutazioni_INT___gt;
        private String elenco_mutazioni_INT___gte;
        private String elenco_mutazioni_INT___contains;
        private String elenco_mutazioni_INT___not___contains;
        private String elenco_mutazioni_INT___starts_with;
        private String elenco_mutazioni_INT___not___starts_with;
        private String elenco_mutazioni_INT___ends_with;
        private String elenco_mutazioni_INT___not___ends_with;
        private String elenco_mutazioni_PR___eq;
        private String elenco_mutazioni_PR___ne;
        private Boolean elenco_mutazioni_PR___null;
        private Boolean elenco_mutazioni_PR___not___null;
        private java.util.List<String> elenco_mutazioni_PR___in;
        private java.util.List<String> elenco_mutazioni_PR___not___in;
        private String elenco_mutazioni_PR___lt;
        private String elenco_mutazioni_PR___lte;
        private String elenco_mutazioni_PR___gt;
        private String elenco_mutazioni_PR___gte;
        private String elenco_mutazioni_PR___contains;
        private String elenco_mutazioni_PR___not___contains;
        private String elenco_mutazioni_PR___starts_with;
        private String elenco_mutazioni_PR___not___starts_with;
        private String elenco_mutazioni_PR___ends_with;
        private String elenco_mutazioni_PR___not___ends_with;
        private String elenco_mutazioni_RT___eq;
        private String elenco_mutazioni_RT___ne;
        private Boolean elenco_mutazioni_RT___null;
        private Boolean elenco_mutazioni_RT___not___null;
        private java.util.List<String> elenco_mutazioni_RT___in;
        private java.util.List<String> elenco_mutazioni_RT___not___in;
        private String elenco_mutazioni_RT___lt;
        private String elenco_mutazioni_RT___lte;
        private String elenco_mutazioni_RT___gt;
        private String elenco_mutazioni_RT___gte;
        private String elenco_mutazioni_RT___contains;
        private String elenco_mutazioni_RT___not___contains;
        private String elenco_mutazioni_RT___starts_with;
        private String elenco_mutazioni_RT___not___starts_with;
        private String elenco_mutazioni_RT___ends_with;
        private String elenco_mutazioni_RT___not___ends_with;
        private String elenco_mutazioni_V3___eq;
        private String elenco_mutazioni_V3___ne;
        private Boolean elenco_mutazioni_V3___null;
        private Boolean elenco_mutazioni_V3___not___null;
        private java.util.List<String> elenco_mutazioni_V3___in;
        private java.util.List<String> elenco_mutazioni_V3___not___in;
        private String elenco_mutazioni_V3___lt;
        private String elenco_mutazioni_V3___lte;
        private String elenco_mutazioni_V3___gt;
        private String elenco_mutazioni_V3___gte;
        private String elenco_mutazioni_V3___contains;
        private String elenco_mutazioni_V3___not___contains;
        private String elenco_mutazioni_V3___starts_with;
        private String elenco_mutazioni_V3___not___starts_with;
        private String elenco_mutazioni_V3___ends_with;
        private String elenco_mutazioni_V3___not___ends_with;
        private String etichetta___eq;
        private String etichetta___ne;
        private Boolean etichetta___null;
        private Boolean etichetta___not___null;
        private java.util.List<String> etichetta___in;
        private java.util.List<String> etichetta___not___in;
        private String etichetta___lt;
        private String etichetta___lte;
        private String etichetta___gt;
        private String etichetta___gte;
        private String etichetta___contains;
        private String etichetta___not___contains;
        private String etichetta___starts_with;
        private String etichetta___not___starts_with;
        private String etichetta___ends_with;
        private String etichetta___not___ends_with;
        private String filtro_codice_paziente___eq;
        private String filtro_codice_paziente___ne;
        private Boolean filtro_codice_paziente___null;
        private Boolean filtro_codice_paziente___not___null;
        private java.util.List<String> filtro_codice_paziente___in;
        private java.util.List<String> filtro_codice_paziente___not___in;
        private String filtro_codice_paziente___lt;
        private String filtro_codice_paziente___lte;
        private String filtro_codice_paziente___gt;
        private String filtro_codice_paziente___gte;
        private String filtro_codice_paziente___contains;
        private String filtro_codice_paziente___not___contains;
        private String filtro_codice_paziente___starts_with;
        private String filtro_codice_paziente___not___starts_with;
        private String filtro_codice_paziente___ends_with;
        private String filtro_codice_paziente___not___ends_with;
        private Integer mutazioni___eq;
        private Integer mutazioni___ne;
        private Boolean mutazioni___null;
        private Boolean mutazioni___not___null;
        private java.util.List<Integer> mutazioni___in;
        private java.util.List<Integer> mutazioni___not___in;
        private Integer mutazioni___lt;
        private Integer mutazioni___lte;
        private Integer mutazioni___gt;
        private Integer mutazioni___gte;
        private String mutazioni_no_farmaco___eq;
        private String mutazioni_no_farmaco___ne;
        private Boolean mutazioni_no_farmaco___null;
        private Boolean mutazioni_no_farmaco___not___null;
        private java.util.List<String> mutazioni_no_farmaco___in;
        private java.util.List<String> mutazioni_no_farmaco___not___in;
        private String mutazioni_no_farmaco___lt;
        private String mutazioni_no_farmaco___lte;
        private String mutazioni_no_farmaco___gt;
        private String mutazioni_no_farmaco___gte;
        private String mutazioni_no_farmaco___contains;
        private String mutazioni_no_farmaco___not___contains;
        private String mutazioni_no_farmaco___starts_with;
        private String mutazioni_no_farmaco___not___starts_with;
        private String mutazioni_no_farmaco___ends_with;
        private String mutazioni_no_farmaco___not___ends_with;
        private Boolean nessuna_mutazione_ENV___eq;
        private Boolean nessuna_mutazione_ENV___ne;
        private Boolean nessuna_mutazione_ENV___null;
        private Boolean nessuna_mutazione_ENV___not___null;
        private Boolean nessuna_mutazione_INT___eq;
        private Boolean nessuna_mutazione_INT___ne;
        private Boolean nessuna_mutazione_INT___null;
        private Boolean nessuna_mutazione_INT___not___null;
        private Boolean nessuna_mutazione_PR___eq;
        private Boolean nessuna_mutazione_PR___ne;
        private Boolean nessuna_mutazione_PR___null;
        private Boolean nessuna_mutazione_PR___not___null;
        private Boolean nessuna_mutazione_RT___eq;
        private Boolean nessuna_mutazione_RT___ne;
        private Boolean nessuna_mutazione_RT___null;
        private Boolean nessuna_mutazione_RT___not___null;
        private Boolean nessuna_mutazione_V3___eq;
        private Boolean nessuna_mutazione_V3___ne;
        private Boolean nessuna_mutazione_V3___null;
        private Boolean nessuna_mutazione_V3___not___null;
        private String nucleotidi___eq;
        private String nucleotidi___ne;
        private Boolean nucleotidi___null;
        private Boolean nucleotidi___not___null;
        private java.util.List<String> nucleotidi___in;
        private java.util.List<String> nucleotidi___not___in;
        private String nucleotidi___lt;
        private String nucleotidi___lte;
        private String nucleotidi___gt;
        private String nucleotidi___gte;
        private String nucleotidi___contains;
        private String nucleotidi___not___contains;
        private String nucleotidi___starts_with;
        private String nucleotidi___not___starts_with;
        private String nucleotidi___ends_with;
        private String nucleotidi___not___ends_with;
        private String regione___eq;
        private String regione___ne;
        private Boolean regione___null;
        private Boolean regione___not___null;
        private java.util.List<String> regione___in;
        private java.util.List<String> regione___not___in;
        private String regione___lt;
        private String regione___lte;
        private String regione___gt;
        private String regione___gte;
        private String regione___contains;
        private String regione___not___contains;
        private String regione___starts_with;
        private String regione___not___starts_with;
        private String regione___ends_with;
        private String regione___not___ends_with;
        private String sottotipo___eq;
        private String sottotipo___ne;
        private Boolean sottotipo___null;
        private Boolean sottotipo___not___null;
        private java.util.List<String> sottotipo___in;
        private java.util.List<String> sottotipo___not___in;
        private String sottotipo___lt;
        private String sottotipo___lte;
        private String sottotipo___gt;
        private String sottotipo___gte;
        private String sottotipo___contains;
        private String sottotipo___not___contains;
        private String sottotipo___starts_with;
        private String sottotipo___not___starts_with;
        private String sottotipo___ends_with;
        private String sottotipo___not___ends_with;
        private String tipo_sequenza___eq;
        private String tipo_sequenza___ne;
        private Boolean tipo_sequenza___null;
        private Boolean tipo_sequenza___not___null;
        private java.util.List<String> tipo_sequenza___in;
        private java.util.List<String> tipo_sequenza___not___in;
        private String tipo_sequenza___lt;
        private String tipo_sequenza___lte;
        private String tipo_sequenza___gt;
        private String tipo_sequenza___gte;
        private String tipo_sequenza___contains;
        private String tipo_sequenza___not___contains;
        private String tipo_sequenza___starts_with;
        private String tipo_sequenza___not___starts_with;
        private String tipo_sequenza___ends_with;
        private String tipo_sequenza___not___ends_with;
        private java.util.List<CliSequenza_genomicaFilterDTO> AND;
        private java.util.List<CliSequenza_genomicaFilterDTO> OR;
        private CliSequenza_genomicaFilterDTO NOT;

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

        public Builder setAltro_centro___eq(String altro_centro___eq) {
            this.altro_centro___eq = altro_centro___eq;
            return this;
        }

        public Builder setAltro_centro___ne(String altro_centro___ne) {
            this.altro_centro___ne = altro_centro___ne;
            return this;
        }

        public Builder setAltro_centro___null(Boolean altro_centro___null) {
            this.altro_centro___null = altro_centro___null;
            return this;
        }

        public Builder setAltro_centro___not___null(Boolean altro_centro___not___null) {
            this.altro_centro___not___null = altro_centro___not___null;
            return this;
        }

        public Builder setAltro_centro___in(java.util.List<String> altro_centro___in) {
            this.altro_centro___in = altro_centro___in;
            return this;
        }

        public Builder setAltro_centro___not___in(java.util.List<String> altro_centro___not___in) {
            this.altro_centro___not___in = altro_centro___not___in;
            return this;
        }

        public Builder setAltro_centro___lt(String altro_centro___lt) {
            this.altro_centro___lt = altro_centro___lt;
            return this;
        }

        public Builder setAltro_centro___lte(String altro_centro___lte) {
            this.altro_centro___lte = altro_centro___lte;
            return this;
        }

        public Builder setAltro_centro___gt(String altro_centro___gt) {
            this.altro_centro___gt = altro_centro___gt;
            return this;
        }

        public Builder setAltro_centro___gte(String altro_centro___gte) {
            this.altro_centro___gte = altro_centro___gte;
            return this;
        }

        public Builder setAltro_centro___contains(String altro_centro___contains) {
            this.altro_centro___contains = altro_centro___contains;
            return this;
        }

        public Builder setAltro_centro___not___contains(String altro_centro___not___contains) {
            this.altro_centro___not___contains = altro_centro___not___contains;
            return this;
        }

        public Builder setAltro_centro___starts_with(String altro_centro___starts_with) {
            this.altro_centro___starts_with = altro_centro___starts_with;
            return this;
        }

        public Builder setAltro_centro___not___starts_with(String altro_centro___not___starts_with) {
            this.altro_centro___not___starts_with = altro_centro___not___starts_with;
            return this;
        }

        public Builder setAltro_centro___ends_with(String altro_centro___ends_with) {
            this.altro_centro___ends_with = altro_centro___ends_with;
            return this;
        }

        public Builder setAltro_centro___not___ends_with(String altro_centro___not___ends_with) {
            this.altro_centro___not___ends_with = altro_centro___not___ends_with;
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

        public Builder setCodice_paziente___eq(String codice_paziente___eq) {
            this.codice_paziente___eq = codice_paziente___eq;
            return this;
        }

        public Builder setCodice_paziente___ne(String codice_paziente___ne) {
            this.codice_paziente___ne = codice_paziente___ne;
            return this;
        }

        public Builder setCodice_paziente___null(Boolean codice_paziente___null) {
            this.codice_paziente___null = codice_paziente___null;
            return this;
        }

        public Builder setCodice_paziente___not___null(Boolean codice_paziente___not___null) {
            this.codice_paziente___not___null = codice_paziente___not___null;
            return this;
        }

        public Builder setCodice_paziente___in(java.util.List<String> codice_paziente___in) {
            this.codice_paziente___in = codice_paziente___in;
            return this;
        }

        public Builder setCodice_paziente___not___in(java.util.List<String> codice_paziente___not___in) {
            this.codice_paziente___not___in = codice_paziente___not___in;
            return this;
        }

        public Builder setCodice_paziente___lt(String codice_paziente___lt) {
            this.codice_paziente___lt = codice_paziente___lt;
            return this;
        }

        public Builder setCodice_paziente___lte(String codice_paziente___lte) {
            this.codice_paziente___lte = codice_paziente___lte;
            return this;
        }

        public Builder setCodice_paziente___gt(String codice_paziente___gt) {
            this.codice_paziente___gt = codice_paziente___gt;
            return this;
        }

        public Builder setCodice_paziente___gte(String codice_paziente___gte) {
            this.codice_paziente___gte = codice_paziente___gte;
            return this;
        }

        public Builder setCodice_paziente___contains(String codice_paziente___contains) {
            this.codice_paziente___contains = codice_paziente___contains;
            return this;
        }

        public Builder setCodice_paziente___not___contains(String codice_paziente___not___contains) {
            this.codice_paziente___not___contains = codice_paziente___not___contains;
            return this;
        }

        public Builder setCodice_paziente___starts_with(String codice_paziente___starts_with) {
            this.codice_paziente___starts_with = codice_paziente___starts_with;
            return this;
        }

        public Builder setCodice_paziente___not___starts_with(String codice_paziente___not___starts_with) {
            this.codice_paziente___not___starts_with = codice_paziente___not___starts_with;
            return this;
        }

        public Builder setCodice_paziente___ends_with(String codice_paziente___ends_with) {
            this.codice_paziente___ends_with = codice_paziente___ends_with;
            return this;
        }

        public Builder setCodice_paziente___not___ends_with(String codice_paziente___not___ends_with) {
            this.codice_paziente___not___ends_with = codice_paziente___not___ends_with;
            return this;
        }

        public Builder setData_analisi___eq(String data_analisi___eq) {
            this.data_analisi___eq = data_analisi___eq;
            return this;
        }

        public Builder setData_analisi___ne(String data_analisi___ne) {
            this.data_analisi___ne = data_analisi___ne;
            return this;
        }

        public Builder setData_analisi___null(Boolean data_analisi___null) {
            this.data_analisi___null = data_analisi___null;
            return this;
        }

        public Builder setData_analisi___not___null(Boolean data_analisi___not___null) {
            this.data_analisi___not___null = data_analisi___not___null;
            return this;
        }

        public Builder setData_analisi___in(java.util.List<String> data_analisi___in) {
            this.data_analisi___in = data_analisi___in;
            return this;
        }

        public Builder setData_analisi___not___in(java.util.List<String> data_analisi___not___in) {
            this.data_analisi___not___in = data_analisi___not___in;
            return this;
        }

        public Builder setData_analisi___lt(String data_analisi___lt) {
            this.data_analisi___lt = data_analisi___lt;
            return this;
        }

        public Builder setData_analisi___lte(String data_analisi___lte) {
            this.data_analisi___lte = data_analisi___lte;
            return this;
        }

        public Builder setData_analisi___gt(String data_analisi___gt) {
            this.data_analisi___gt = data_analisi___gt;
            return this;
        }

        public Builder setData_analisi___gte(String data_analisi___gte) {
            this.data_analisi___gte = data_analisi___gte;
            return this;
        }

        public Builder setData_prelievo___eq(String data_prelievo___eq) {
            this.data_prelievo___eq = data_prelievo___eq;
            return this;
        }

        public Builder setData_prelievo___ne(String data_prelievo___ne) {
            this.data_prelievo___ne = data_prelievo___ne;
            return this;
        }

        public Builder setData_prelievo___null(Boolean data_prelievo___null) {
            this.data_prelievo___null = data_prelievo___null;
            return this;
        }

        public Builder setData_prelievo___not___null(Boolean data_prelievo___not___null) {
            this.data_prelievo___not___null = data_prelievo___not___null;
            return this;
        }

        public Builder setData_prelievo___in(java.util.List<String> data_prelievo___in) {
            this.data_prelievo___in = data_prelievo___in;
            return this;
        }

        public Builder setData_prelievo___not___in(java.util.List<String> data_prelievo___not___in) {
            this.data_prelievo___not___in = data_prelievo___not___in;
            return this;
        }

        public Builder setData_prelievo___lt(String data_prelievo___lt) {
            this.data_prelievo___lt = data_prelievo___lt;
            return this;
        }

        public Builder setData_prelievo___lte(String data_prelievo___lte) {
            this.data_prelievo___lte = data_prelievo___lte;
            return this;
        }

        public Builder setData_prelievo___gt(String data_prelievo___gt) {
            this.data_prelievo___gt = data_prelievo___gt;
            return this;
        }

        public Builder setData_prelievo___gte(String data_prelievo___gte) {
            this.data_prelievo___gte = data_prelievo___gte;
            return this;
        }

        public Builder setEffettuato_su___eq(String effettuato_su___eq) {
            this.effettuato_su___eq = effettuato_su___eq;
            return this;
        }

        public Builder setEffettuato_su___ne(String effettuato_su___ne) {
            this.effettuato_su___ne = effettuato_su___ne;
            return this;
        }

        public Builder setEffettuato_su___null(Boolean effettuato_su___null) {
            this.effettuato_su___null = effettuato_su___null;
            return this;
        }

        public Builder setEffettuato_su___not___null(Boolean effettuato_su___not___null) {
            this.effettuato_su___not___null = effettuato_su___not___null;
            return this;
        }

        public Builder setEffettuato_su___in(java.util.List<String> effettuato_su___in) {
            this.effettuato_su___in = effettuato_su___in;
            return this;
        }

        public Builder setEffettuato_su___not___in(java.util.List<String> effettuato_su___not___in) {
            this.effettuato_su___not___in = effettuato_su___not___in;
            return this;
        }

        public Builder setEffettuato_su___lt(String effettuato_su___lt) {
            this.effettuato_su___lt = effettuato_su___lt;
            return this;
        }

        public Builder setEffettuato_su___lte(String effettuato_su___lte) {
            this.effettuato_su___lte = effettuato_su___lte;
            return this;
        }

        public Builder setEffettuato_su___gt(String effettuato_su___gt) {
            this.effettuato_su___gt = effettuato_su___gt;
            return this;
        }

        public Builder setEffettuato_su___gte(String effettuato_su___gte) {
            this.effettuato_su___gte = effettuato_su___gte;
            return this;
        }

        public Builder setEffettuato_su___contains(String effettuato_su___contains) {
            this.effettuato_su___contains = effettuato_su___contains;
            return this;
        }

        public Builder setEffettuato_su___not___contains(String effettuato_su___not___contains) {
            this.effettuato_su___not___contains = effettuato_su___not___contains;
            return this;
        }

        public Builder setEffettuato_su___starts_with(String effettuato_su___starts_with) {
            this.effettuato_su___starts_with = effettuato_su___starts_with;
            return this;
        }

        public Builder setEffettuato_su___not___starts_with(String effettuato_su___not___starts_with) {
            this.effettuato_su___not___starts_with = effettuato_su___not___starts_with;
            return this;
        }

        public Builder setEffettuato_su___ends_with(String effettuato_su___ends_with) {
            this.effettuato_su___ends_with = effettuato_su___ends_with;
            return this;
        }

        public Builder setEffettuato_su___not___ends_with(String effettuato_su___not___ends_with) {
            this.effettuato_su___not___ends_with = effettuato_su___not___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___eq(String elenco_mutazioni_ENV___eq) {
            this.elenco_mutazioni_ENV___eq = elenco_mutazioni_ENV___eq;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___ne(String elenco_mutazioni_ENV___ne) {
            this.elenco_mutazioni_ENV___ne = elenco_mutazioni_ENV___ne;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___null(Boolean elenco_mutazioni_ENV___null) {
            this.elenco_mutazioni_ENV___null = elenco_mutazioni_ENV___null;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___not___null(Boolean elenco_mutazioni_ENV___not___null) {
            this.elenco_mutazioni_ENV___not___null = elenco_mutazioni_ENV___not___null;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___in(java.util.List<String> elenco_mutazioni_ENV___in) {
            this.elenco_mutazioni_ENV___in = elenco_mutazioni_ENV___in;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___not___in(java.util.List<String> elenco_mutazioni_ENV___not___in) {
            this.elenco_mutazioni_ENV___not___in = elenco_mutazioni_ENV___not___in;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___lt(String elenco_mutazioni_ENV___lt) {
            this.elenco_mutazioni_ENV___lt = elenco_mutazioni_ENV___lt;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___lte(String elenco_mutazioni_ENV___lte) {
            this.elenco_mutazioni_ENV___lte = elenco_mutazioni_ENV___lte;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___gt(String elenco_mutazioni_ENV___gt) {
            this.elenco_mutazioni_ENV___gt = elenco_mutazioni_ENV___gt;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___gte(String elenco_mutazioni_ENV___gte) {
            this.elenco_mutazioni_ENV___gte = elenco_mutazioni_ENV___gte;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___contains(String elenco_mutazioni_ENV___contains) {
            this.elenco_mutazioni_ENV___contains = elenco_mutazioni_ENV___contains;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___not___contains(String elenco_mutazioni_ENV___not___contains) {
            this.elenco_mutazioni_ENV___not___contains = elenco_mutazioni_ENV___not___contains;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___starts_with(String elenco_mutazioni_ENV___starts_with) {
            this.elenco_mutazioni_ENV___starts_with = elenco_mutazioni_ENV___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___not___starts_with(String elenco_mutazioni_ENV___not___starts_with) {
            this.elenco_mutazioni_ENV___not___starts_with = elenco_mutazioni_ENV___not___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___ends_with(String elenco_mutazioni_ENV___ends_with) {
            this.elenco_mutazioni_ENV___ends_with = elenco_mutazioni_ENV___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_ENV___not___ends_with(String elenco_mutazioni_ENV___not___ends_with) {
            this.elenco_mutazioni_ENV___not___ends_with = elenco_mutazioni_ENV___not___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_INT___eq(String elenco_mutazioni_INT___eq) {
            this.elenco_mutazioni_INT___eq = elenco_mutazioni_INT___eq;
            return this;
        }

        public Builder setElenco_mutazioni_INT___ne(String elenco_mutazioni_INT___ne) {
            this.elenco_mutazioni_INT___ne = elenco_mutazioni_INT___ne;
            return this;
        }

        public Builder setElenco_mutazioni_INT___null(Boolean elenco_mutazioni_INT___null) {
            this.elenco_mutazioni_INT___null = elenco_mutazioni_INT___null;
            return this;
        }

        public Builder setElenco_mutazioni_INT___not___null(Boolean elenco_mutazioni_INT___not___null) {
            this.elenco_mutazioni_INT___not___null = elenco_mutazioni_INT___not___null;
            return this;
        }

        public Builder setElenco_mutazioni_INT___in(java.util.List<String> elenco_mutazioni_INT___in) {
            this.elenco_mutazioni_INT___in = elenco_mutazioni_INT___in;
            return this;
        }

        public Builder setElenco_mutazioni_INT___not___in(java.util.List<String> elenco_mutazioni_INT___not___in) {
            this.elenco_mutazioni_INT___not___in = elenco_mutazioni_INT___not___in;
            return this;
        }

        public Builder setElenco_mutazioni_INT___lt(String elenco_mutazioni_INT___lt) {
            this.elenco_mutazioni_INT___lt = elenco_mutazioni_INT___lt;
            return this;
        }

        public Builder setElenco_mutazioni_INT___lte(String elenco_mutazioni_INT___lte) {
            this.elenco_mutazioni_INT___lte = elenco_mutazioni_INT___lte;
            return this;
        }

        public Builder setElenco_mutazioni_INT___gt(String elenco_mutazioni_INT___gt) {
            this.elenco_mutazioni_INT___gt = elenco_mutazioni_INT___gt;
            return this;
        }

        public Builder setElenco_mutazioni_INT___gte(String elenco_mutazioni_INT___gte) {
            this.elenco_mutazioni_INT___gte = elenco_mutazioni_INT___gte;
            return this;
        }

        public Builder setElenco_mutazioni_INT___contains(String elenco_mutazioni_INT___contains) {
            this.elenco_mutazioni_INT___contains = elenco_mutazioni_INT___contains;
            return this;
        }

        public Builder setElenco_mutazioni_INT___not___contains(String elenco_mutazioni_INT___not___contains) {
            this.elenco_mutazioni_INT___not___contains = elenco_mutazioni_INT___not___contains;
            return this;
        }

        public Builder setElenco_mutazioni_INT___starts_with(String elenco_mutazioni_INT___starts_with) {
            this.elenco_mutazioni_INT___starts_with = elenco_mutazioni_INT___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_INT___not___starts_with(String elenco_mutazioni_INT___not___starts_with) {
            this.elenco_mutazioni_INT___not___starts_with = elenco_mutazioni_INT___not___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_INT___ends_with(String elenco_mutazioni_INT___ends_with) {
            this.elenco_mutazioni_INT___ends_with = elenco_mutazioni_INT___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_INT___not___ends_with(String elenco_mutazioni_INT___not___ends_with) {
            this.elenco_mutazioni_INT___not___ends_with = elenco_mutazioni_INT___not___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_PR___eq(String elenco_mutazioni_PR___eq) {
            this.elenco_mutazioni_PR___eq = elenco_mutazioni_PR___eq;
            return this;
        }

        public Builder setElenco_mutazioni_PR___ne(String elenco_mutazioni_PR___ne) {
            this.elenco_mutazioni_PR___ne = elenco_mutazioni_PR___ne;
            return this;
        }

        public Builder setElenco_mutazioni_PR___null(Boolean elenco_mutazioni_PR___null) {
            this.elenco_mutazioni_PR___null = elenco_mutazioni_PR___null;
            return this;
        }

        public Builder setElenco_mutazioni_PR___not___null(Boolean elenco_mutazioni_PR___not___null) {
            this.elenco_mutazioni_PR___not___null = elenco_mutazioni_PR___not___null;
            return this;
        }

        public Builder setElenco_mutazioni_PR___in(java.util.List<String> elenco_mutazioni_PR___in) {
            this.elenco_mutazioni_PR___in = elenco_mutazioni_PR___in;
            return this;
        }

        public Builder setElenco_mutazioni_PR___not___in(java.util.List<String> elenco_mutazioni_PR___not___in) {
            this.elenco_mutazioni_PR___not___in = elenco_mutazioni_PR___not___in;
            return this;
        }

        public Builder setElenco_mutazioni_PR___lt(String elenco_mutazioni_PR___lt) {
            this.elenco_mutazioni_PR___lt = elenco_mutazioni_PR___lt;
            return this;
        }

        public Builder setElenco_mutazioni_PR___lte(String elenco_mutazioni_PR___lte) {
            this.elenco_mutazioni_PR___lte = elenco_mutazioni_PR___lte;
            return this;
        }

        public Builder setElenco_mutazioni_PR___gt(String elenco_mutazioni_PR___gt) {
            this.elenco_mutazioni_PR___gt = elenco_mutazioni_PR___gt;
            return this;
        }

        public Builder setElenco_mutazioni_PR___gte(String elenco_mutazioni_PR___gte) {
            this.elenco_mutazioni_PR___gte = elenco_mutazioni_PR___gte;
            return this;
        }

        public Builder setElenco_mutazioni_PR___contains(String elenco_mutazioni_PR___contains) {
            this.elenco_mutazioni_PR___contains = elenco_mutazioni_PR___contains;
            return this;
        }

        public Builder setElenco_mutazioni_PR___not___contains(String elenco_mutazioni_PR___not___contains) {
            this.elenco_mutazioni_PR___not___contains = elenco_mutazioni_PR___not___contains;
            return this;
        }

        public Builder setElenco_mutazioni_PR___starts_with(String elenco_mutazioni_PR___starts_with) {
            this.elenco_mutazioni_PR___starts_with = elenco_mutazioni_PR___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_PR___not___starts_with(String elenco_mutazioni_PR___not___starts_with) {
            this.elenco_mutazioni_PR___not___starts_with = elenco_mutazioni_PR___not___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_PR___ends_with(String elenco_mutazioni_PR___ends_with) {
            this.elenco_mutazioni_PR___ends_with = elenco_mutazioni_PR___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_PR___not___ends_with(String elenco_mutazioni_PR___not___ends_with) {
            this.elenco_mutazioni_PR___not___ends_with = elenco_mutazioni_PR___not___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_RT___eq(String elenco_mutazioni_RT___eq) {
            this.elenco_mutazioni_RT___eq = elenco_mutazioni_RT___eq;
            return this;
        }

        public Builder setElenco_mutazioni_RT___ne(String elenco_mutazioni_RT___ne) {
            this.elenco_mutazioni_RT___ne = elenco_mutazioni_RT___ne;
            return this;
        }

        public Builder setElenco_mutazioni_RT___null(Boolean elenco_mutazioni_RT___null) {
            this.elenco_mutazioni_RT___null = elenco_mutazioni_RT___null;
            return this;
        }

        public Builder setElenco_mutazioni_RT___not___null(Boolean elenco_mutazioni_RT___not___null) {
            this.elenco_mutazioni_RT___not___null = elenco_mutazioni_RT___not___null;
            return this;
        }

        public Builder setElenco_mutazioni_RT___in(java.util.List<String> elenco_mutazioni_RT___in) {
            this.elenco_mutazioni_RT___in = elenco_mutazioni_RT___in;
            return this;
        }

        public Builder setElenco_mutazioni_RT___not___in(java.util.List<String> elenco_mutazioni_RT___not___in) {
            this.elenco_mutazioni_RT___not___in = elenco_mutazioni_RT___not___in;
            return this;
        }

        public Builder setElenco_mutazioni_RT___lt(String elenco_mutazioni_RT___lt) {
            this.elenco_mutazioni_RT___lt = elenco_mutazioni_RT___lt;
            return this;
        }

        public Builder setElenco_mutazioni_RT___lte(String elenco_mutazioni_RT___lte) {
            this.elenco_mutazioni_RT___lte = elenco_mutazioni_RT___lte;
            return this;
        }

        public Builder setElenco_mutazioni_RT___gt(String elenco_mutazioni_RT___gt) {
            this.elenco_mutazioni_RT___gt = elenco_mutazioni_RT___gt;
            return this;
        }

        public Builder setElenco_mutazioni_RT___gte(String elenco_mutazioni_RT___gte) {
            this.elenco_mutazioni_RT___gte = elenco_mutazioni_RT___gte;
            return this;
        }

        public Builder setElenco_mutazioni_RT___contains(String elenco_mutazioni_RT___contains) {
            this.elenco_mutazioni_RT___contains = elenco_mutazioni_RT___contains;
            return this;
        }

        public Builder setElenco_mutazioni_RT___not___contains(String elenco_mutazioni_RT___not___contains) {
            this.elenco_mutazioni_RT___not___contains = elenco_mutazioni_RT___not___contains;
            return this;
        }

        public Builder setElenco_mutazioni_RT___starts_with(String elenco_mutazioni_RT___starts_with) {
            this.elenco_mutazioni_RT___starts_with = elenco_mutazioni_RT___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_RT___not___starts_with(String elenco_mutazioni_RT___not___starts_with) {
            this.elenco_mutazioni_RT___not___starts_with = elenco_mutazioni_RT___not___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_RT___ends_with(String elenco_mutazioni_RT___ends_with) {
            this.elenco_mutazioni_RT___ends_with = elenco_mutazioni_RT___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_RT___not___ends_with(String elenco_mutazioni_RT___not___ends_with) {
            this.elenco_mutazioni_RT___not___ends_with = elenco_mutazioni_RT___not___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_V3___eq(String elenco_mutazioni_V3___eq) {
            this.elenco_mutazioni_V3___eq = elenco_mutazioni_V3___eq;
            return this;
        }

        public Builder setElenco_mutazioni_V3___ne(String elenco_mutazioni_V3___ne) {
            this.elenco_mutazioni_V3___ne = elenco_mutazioni_V3___ne;
            return this;
        }

        public Builder setElenco_mutazioni_V3___null(Boolean elenco_mutazioni_V3___null) {
            this.elenco_mutazioni_V3___null = elenco_mutazioni_V3___null;
            return this;
        }

        public Builder setElenco_mutazioni_V3___not___null(Boolean elenco_mutazioni_V3___not___null) {
            this.elenco_mutazioni_V3___not___null = elenco_mutazioni_V3___not___null;
            return this;
        }

        public Builder setElenco_mutazioni_V3___in(java.util.List<String> elenco_mutazioni_V3___in) {
            this.elenco_mutazioni_V3___in = elenco_mutazioni_V3___in;
            return this;
        }

        public Builder setElenco_mutazioni_V3___not___in(java.util.List<String> elenco_mutazioni_V3___not___in) {
            this.elenco_mutazioni_V3___not___in = elenco_mutazioni_V3___not___in;
            return this;
        }

        public Builder setElenco_mutazioni_V3___lt(String elenco_mutazioni_V3___lt) {
            this.elenco_mutazioni_V3___lt = elenco_mutazioni_V3___lt;
            return this;
        }

        public Builder setElenco_mutazioni_V3___lte(String elenco_mutazioni_V3___lte) {
            this.elenco_mutazioni_V3___lte = elenco_mutazioni_V3___lte;
            return this;
        }

        public Builder setElenco_mutazioni_V3___gt(String elenco_mutazioni_V3___gt) {
            this.elenco_mutazioni_V3___gt = elenco_mutazioni_V3___gt;
            return this;
        }

        public Builder setElenco_mutazioni_V3___gte(String elenco_mutazioni_V3___gte) {
            this.elenco_mutazioni_V3___gte = elenco_mutazioni_V3___gte;
            return this;
        }

        public Builder setElenco_mutazioni_V3___contains(String elenco_mutazioni_V3___contains) {
            this.elenco_mutazioni_V3___contains = elenco_mutazioni_V3___contains;
            return this;
        }

        public Builder setElenco_mutazioni_V3___not___contains(String elenco_mutazioni_V3___not___contains) {
            this.elenco_mutazioni_V3___not___contains = elenco_mutazioni_V3___not___contains;
            return this;
        }

        public Builder setElenco_mutazioni_V3___starts_with(String elenco_mutazioni_V3___starts_with) {
            this.elenco_mutazioni_V3___starts_with = elenco_mutazioni_V3___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_V3___not___starts_with(String elenco_mutazioni_V3___not___starts_with) {
            this.elenco_mutazioni_V3___not___starts_with = elenco_mutazioni_V3___not___starts_with;
            return this;
        }

        public Builder setElenco_mutazioni_V3___ends_with(String elenco_mutazioni_V3___ends_with) {
            this.elenco_mutazioni_V3___ends_with = elenco_mutazioni_V3___ends_with;
            return this;
        }

        public Builder setElenco_mutazioni_V3___not___ends_with(String elenco_mutazioni_V3___not___ends_with) {
            this.elenco_mutazioni_V3___not___ends_with = elenco_mutazioni_V3___not___ends_with;
            return this;
        }

        public Builder setEtichetta___eq(String etichetta___eq) {
            this.etichetta___eq = etichetta___eq;
            return this;
        }

        public Builder setEtichetta___ne(String etichetta___ne) {
            this.etichetta___ne = etichetta___ne;
            return this;
        }

        public Builder setEtichetta___null(Boolean etichetta___null) {
            this.etichetta___null = etichetta___null;
            return this;
        }

        public Builder setEtichetta___not___null(Boolean etichetta___not___null) {
            this.etichetta___not___null = etichetta___not___null;
            return this;
        }

        public Builder setEtichetta___in(java.util.List<String> etichetta___in) {
            this.etichetta___in = etichetta___in;
            return this;
        }

        public Builder setEtichetta___not___in(java.util.List<String> etichetta___not___in) {
            this.etichetta___not___in = etichetta___not___in;
            return this;
        }

        public Builder setEtichetta___lt(String etichetta___lt) {
            this.etichetta___lt = etichetta___lt;
            return this;
        }

        public Builder setEtichetta___lte(String etichetta___lte) {
            this.etichetta___lte = etichetta___lte;
            return this;
        }

        public Builder setEtichetta___gt(String etichetta___gt) {
            this.etichetta___gt = etichetta___gt;
            return this;
        }

        public Builder setEtichetta___gte(String etichetta___gte) {
            this.etichetta___gte = etichetta___gte;
            return this;
        }

        public Builder setEtichetta___contains(String etichetta___contains) {
            this.etichetta___contains = etichetta___contains;
            return this;
        }

        public Builder setEtichetta___not___contains(String etichetta___not___contains) {
            this.etichetta___not___contains = etichetta___not___contains;
            return this;
        }

        public Builder setEtichetta___starts_with(String etichetta___starts_with) {
            this.etichetta___starts_with = etichetta___starts_with;
            return this;
        }

        public Builder setEtichetta___not___starts_with(String etichetta___not___starts_with) {
            this.etichetta___not___starts_with = etichetta___not___starts_with;
            return this;
        }

        public Builder setEtichetta___ends_with(String etichetta___ends_with) {
            this.etichetta___ends_with = etichetta___ends_with;
            return this;
        }

        public Builder setEtichetta___not___ends_with(String etichetta___not___ends_with) {
            this.etichetta___not___ends_with = etichetta___not___ends_with;
            return this;
        }

        public Builder setFiltro_codice_paziente___eq(String filtro_codice_paziente___eq) {
            this.filtro_codice_paziente___eq = filtro_codice_paziente___eq;
            return this;
        }

        public Builder setFiltro_codice_paziente___ne(String filtro_codice_paziente___ne) {
            this.filtro_codice_paziente___ne = filtro_codice_paziente___ne;
            return this;
        }

        public Builder setFiltro_codice_paziente___null(Boolean filtro_codice_paziente___null) {
            this.filtro_codice_paziente___null = filtro_codice_paziente___null;
            return this;
        }

        public Builder setFiltro_codice_paziente___not___null(Boolean filtro_codice_paziente___not___null) {
            this.filtro_codice_paziente___not___null = filtro_codice_paziente___not___null;
            return this;
        }

        public Builder setFiltro_codice_paziente___in(java.util.List<String> filtro_codice_paziente___in) {
            this.filtro_codice_paziente___in = filtro_codice_paziente___in;
            return this;
        }

        public Builder setFiltro_codice_paziente___not___in(java.util.List<String> filtro_codice_paziente___not___in) {
            this.filtro_codice_paziente___not___in = filtro_codice_paziente___not___in;
            return this;
        }

        public Builder setFiltro_codice_paziente___lt(String filtro_codice_paziente___lt) {
            this.filtro_codice_paziente___lt = filtro_codice_paziente___lt;
            return this;
        }

        public Builder setFiltro_codice_paziente___lte(String filtro_codice_paziente___lte) {
            this.filtro_codice_paziente___lte = filtro_codice_paziente___lte;
            return this;
        }

        public Builder setFiltro_codice_paziente___gt(String filtro_codice_paziente___gt) {
            this.filtro_codice_paziente___gt = filtro_codice_paziente___gt;
            return this;
        }

        public Builder setFiltro_codice_paziente___gte(String filtro_codice_paziente___gte) {
            this.filtro_codice_paziente___gte = filtro_codice_paziente___gte;
            return this;
        }

        public Builder setFiltro_codice_paziente___contains(String filtro_codice_paziente___contains) {
            this.filtro_codice_paziente___contains = filtro_codice_paziente___contains;
            return this;
        }

        public Builder setFiltro_codice_paziente___not___contains(String filtro_codice_paziente___not___contains) {
            this.filtro_codice_paziente___not___contains = filtro_codice_paziente___not___contains;
            return this;
        }

        public Builder setFiltro_codice_paziente___starts_with(String filtro_codice_paziente___starts_with) {
            this.filtro_codice_paziente___starts_with = filtro_codice_paziente___starts_with;
            return this;
        }

        public Builder setFiltro_codice_paziente___not___starts_with(String filtro_codice_paziente___not___starts_with) {
            this.filtro_codice_paziente___not___starts_with = filtro_codice_paziente___not___starts_with;
            return this;
        }

        public Builder setFiltro_codice_paziente___ends_with(String filtro_codice_paziente___ends_with) {
            this.filtro_codice_paziente___ends_with = filtro_codice_paziente___ends_with;
            return this;
        }

        public Builder setFiltro_codice_paziente___not___ends_with(String filtro_codice_paziente___not___ends_with) {
            this.filtro_codice_paziente___not___ends_with = filtro_codice_paziente___not___ends_with;
            return this;
        }

        public Builder setMutazioni___eq(Integer mutazioni___eq) {
            this.mutazioni___eq = mutazioni___eq;
            return this;
        }

        public Builder setMutazioni___ne(Integer mutazioni___ne) {
            this.mutazioni___ne = mutazioni___ne;
            return this;
        }

        public Builder setMutazioni___null(Boolean mutazioni___null) {
            this.mutazioni___null = mutazioni___null;
            return this;
        }

        public Builder setMutazioni___not___null(Boolean mutazioni___not___null) {
            this.mutazioni___not___null = mutazioni___not___null;
            return this;
        }

        public Builder setMutazioni___in(java.util.List<Integer> mutazioni___in) {
            this.mutazioni___in = mutazioni___in;
            return this;
        }

        public Builder setMutazioni___not___in(java.util.List<Integer> mutazioni___not___in) {
            this.mutazioni___not___in = mutazioni___not___in;
            return this;
        }

        public Builder setMutazioni___lt(Integer mutazioni___lt) {
            this.mutazioni___lt = mutazioni___lt;
            return this;
        }

        public Builder setMutazioni___lte(Integer mutazioni___lte) {
            this.mutazioni___lte = mutazioni___lte;
            return this;
        }

        public Builder setMutazioni___gt(Integer mutazioni___gt) {
            this.mutazioni___gt = mutazioni___gt;
            return this;
        }

        public Builder setMutazioni___gte(Integer mutazioni___gte) {
            this.mutazioni___gte = mutazioni___gte;
            return this;
        }

        public Builder setMutazioni_no_farmaco___eq(String mutazioni_no_farmaco___eq) {
            this.mutazioni_no_farmaco___eq = mutazioni_no_farmaco___eq;
            return this;
        }

        public Builder setMutazioni_no_farmaco___ne(String mutazioni_no_farmaco___ne) {
            this.mutazioni_no_farmaco___ne = mutazioni_no_farmaco___ne;
            return this;
        }

        public Builder setMutazioni_no_farmaco___null(Boolean mutazioni_no_farmaco___null) {
            this.mutazioni_no_farmaco___null = mutazioni_no_farmaco___null;
            return this;
        }

        public Builder setMutazioni_no_farmaco___not___null(Boolean mutazioni_no_farmaco___not___null) {
            this.mutazioni_no_farmaco___not___null = mutazioni_no_farmaco___not___null;
            return this;
        }

        public Builder setMutazioni_no_farmaco___in(java.util.List<String> mutazioni_no_farmaco___in) {
            this.mutazioni_no_farmaco___in = mutazioni_no_farmaco___in;
            return this;
        }

        public Builder setMutazioni_no_farmaco___not___in(java.util.List<String> mutazioni_no_farmaco___not___in) {
            this.mutazioni_no_farmaco___not___in = mutazioni_no_farmaco___not___in;
            return this;
        }

        public Builder setMutazioni_no_farmaco___lt(String mutazioni_no_farmaco___lt) {
            this.mutazioni_no_farmaco___lt = mutazioni_no_farmaco___lt;
            return this;
        }

        public Builder setMutazioni_no_farmaco___lte(String mutazioni_no_farmaco___lte) {
            this.mutazioni_no_farmaco___lte = mutazioni_no_farmaco___lte;
            return this;
        }

        public Builder setMutazioni_no_farmaco___gt(String mutazioni_no_farmaco___gt) {
            this.mutazioni_no_farmaco___gt = mutazioni_no_farmaco___gt;
            return this;
        }

        public Builder setMutazioni_no_farmaco___gte(String mutazioni_no_farmaco___gte) {
            this.mutazioni_no_farmaco___gte = mutazioni_no_farmaco___gte;
            return this;
        }

        public Builder setMutazioni_no_farmaco___contains(String mutazioni_no_farmaco___contains) {
            this.mutazioni_no_farmaco___contains = mutazioni_no_farmaco___contains;
            return this;
        }

        public Builder setMutazioni_no_farmaco___not___contains(String mutazioni_no_farmaco___not___contains) {
            this.mutazioni_no_farmaco___not___contains = mutazioni_no_farmaco___not___contains;
            return this;
        }

        public Builder setMutazioni_no_farmaco___starts_with(String mutazioni_no_farmaco___starts_with) {
            this.mutazioni_no_farmaco___starts_with = mutazioni_no_farmaco___starts_with;
            return this;
        }

        public Builder setMutazioni_no_farmaco___not___starts_with(String mutazioni_no_farmaco___not___starts_with) {
            this.mutazioni_no_farmaco___not___starts_with = mutazioni_no_farmaco___not___starts_with;
            return this;
        }

        public Builder setMutazioni_no_farmaco___ends_with(String mutazioni_no_farmaco___ends_with) {
            this.mutazioni_no_farmaco___ends_with = mutazioni_no_farmaco___ends_with;
            return this;
        }

        public Builder setMutazioni_no_farmaco___not___ends_with(String mutazioni_no_farmaco___not___ends_with) {
            this.mutazioni_no_farmaco___not___ends_with = mutazioni_no_farmaco___not___ends_with;
            return this;
        }

        public Builder setNessuna_mutazione_ENV___eq(Boolean nessuna_mutazione_ENV___eq) {
            this.nessuna_mutazione_ENV___eq = nessuna_mutazione_ENV___eq;
            return this;
        }

        public Builder setNessuna_mutazione_ENV___ne(Boolean nessuna_mutazione_ENV___ne) {
            this.nessuna_mutazione_ENV___ne = nessuna_mutazione_ENV___ne;
            return this;
        }

        public Builder setNessuna_mutazione_ENV___null(Boolean nessuna_mutazione_ENV___null) {
            this.nessuna_mutazione_ENV___null = nessuna_mutazione_ENV___null;
            return this;
        }

        public Builder setNessuna_mutazione_ENV___not___null(Boolean nessuna_mutazione_ENV___not___null) {
            this.nessuna_mutazione_ENV___not___null = nessuna_mutazione_ENV___not___null;
            return this;
        }

        public Builder setNessuna_mutazione_INT___eq(Boolean nessuna_mutazione_INT___eq) {
            this.nessuna_mutazione_INT___eq = nessuna_mutazione_INT___eq;
            return this;
        }

        public Builder setNessuna_mutazione_INT___ne(Boolean nessuna_mutazione_INT___ne) {
            this.nessuna_mutazione_INT___ne = nessuna_mutazione_INT___ne;
            return this;
        }

        public Builder setNessuna_mutazione_INT___null(Boolean nessuna_mutazione_INT___null) {
            this.nessuna_mutazione_INT___null = nessuna_mutazione_INT___null;
            return this;
        }

        public Builder setNessuna_mutazione_INT___not___null(Boolean nessuna_mutazione_INT___not___null) {
            this.nessuna_mutazione_INT___not___null = nessuna_mutazione_INT___not___null;
            return this;
        }

        public Builder setNessuna_mutazione_PR___eq(Boolean nessuna_mutazione_PR___eq) {
            this.nessuna_mutazione_PR___eq = nessuna_mutazione_PR___eq;
            return this;
        }

        public Builder setNessuna_mutazione_PR___ne(Boolean nessuna_mutazione_PR___ne) {
            this.nessuna_mutazione_PR___ne = nessuna_mutazione_PR___ne;
            return this;
        }

        public Builder setNessuna_mutazione_PR___null(Boolean nessuna_mutazione_PR___null) {
            this.nessuna_mutazione_PR___null = nessuna_mutazione_PR___null;
            return this;
        }

        public Builder setNessuna_mutazione_PR___not___null(Boolean nessuna_mutazione_PR___not___null) {
            this.nessuna_mutazione_PR___not___null = nessuna_mutazione_PR___not___null;
            return this;
        }

        public Builder setNessuna_mutazione_RT___eq(Boolean nessuna_mutazione_RT___eq) {
            this.nessuna_mutazione_RT___eq = nessuna_mutazione_RT___eq;
            return this;
        }

        public Builder setNessuna_mutazione_RT___ne(Boolean nessuna_mutazione_RT___ne) {
            this.nessuna_mutazione_RT___ne = nessuna_mutazione_RT___ne;
            return this;
        }

        public Builder setNessuna_mutazione_RT___null(Boolean nessuna_mutazione_RT___null) {
            this.nessuna_mutazione_RT___null = nessuna_mutazione_RT___null;
            return this;
        }

        public Builder setNessuna_mutazione_RT___not___null(Boolean nessuna_mutazione_RT___not___null) {
            this.nessuna_mutazione_RT___not___null = nessuna_mutazione_RT___not___null;
            return this;
        }

        public Builder setNessuna_mutazione_V3___eq(Boolean nessuna_mutazione_V3___eq) {
            this.nessuna_mutazione_V3___eq = nessuna_mutazione_V3___eq;
            return this;
        }

        public Builder setNessuna_mutazione_V3___ne(Boolean nessuna_mutazione_V3___ne) {
            this.nessuna_mutazione_V3___ne = nessuna_mutazione_V3___ne;
            return this;
        }

        public Builder setNessuna_mutazione_V3___null(Boolean nessuna_mutazione_V3___null) {
            this.nessuna_mutazione_V3___null = nessuna_mutazione_V3___null;
            return this;
        }

        public Builder setNessuna_mutazione_V3___not___null(Boolean nessuna_mutazione_V3___not___null) {
            this.nessuna_mutazione_V3___not___null = nessuna_mutazione_V3___not___null;
            return this;
        }

        public Builder setNucleotidi___eq(String nucleotidi___eq) {
            this.nucleotidi___eq = nucleotidi___eq;
            return this;
        }

        public Builder setNucleotidi___ne(String nucleotidi___ne) {
            this.nucleotidi___ne = nucleotidi___ne;
            return this;
        }

        public Builder setNucleotidi___null(Boolean nucleotidi___null) {
            this.nucleotidi___null = nucleotidi___null;
            return this;
        }

        public Builder setNucleotidi___not___null(Boolean nucleotidi___not___null) {
            this.nucleotidi___not___null = nucleotidi___not___null;
            return this;
        }

        public Builder setNucleotidi___in(java.util.List<String> nucleotidi___in) {
            this.nucleotidi___in = nucleotidi___in;
            return this;
        }

        public Builder setNucleotidi___not___in(java.util.List<String> nucleotidi___not___in) {
            this.nucleotidi___not___in = nucleotidi___not___in;
            return this;
        }

        public Builder setNucleotidi___lt(String nucleotidi___lt) {
            this.nucleotidi___lt = nucleotidi___lt;
            return this;
        }

        public Builder setNucleotidi___lte(String nucleotidi___lte) {
            this.nucleotidi___lte = nucleotidi___lte;
            return this;
        }

        public Builder setNucleotidi___gt(String nucleotidi___gt) {
            this.nucleotidi___gt = nucleotidi___gt;
            return this;
        }

        public Builder setNucleotidi___gte(String nucleotidi___gte) {
            this.nucleotidi___gte = nucleotidi___gte;
            return this;
        }

        public Builder setNucleotidi___contains(String nucleotidi___contains) {
            this.nucleotidi___contains = nucleotidi___contains;
            return this;
        }

        public Builder setNucleotidi___not___contains(String nucleotidi___not___contains) {
            this.nucleotidi___not___contains = nucleotidi___not___contains;
            return this;
        }

        public Builder setNucleotidi___starts_with(String nucleotidi___starts_with) {
            this.nucleotidi___starts_with = nucleotidi___starts_with;
            return this;
        }

        public Builder setNucleotidi___not___starts_with(String nucleotidi___not___starts_with) {
            this.nucleotidi___not___starts_with = nucleotidi___not___starts_with;
            return this;
        }

        public Builder setNucleotidi___ends_with(String nucleotidi___ends_with) {
            this.nucleotidi___ends_with = nucleotidi___ends_with;
            return this;
        }

        public Builder setNucleotidi___not___ends_with(String nucleotidi___not___ends_with) {
            this.nucleotidi___not___ends_with = nucleotidi___not___ends_with;
            return this;
        }

        public Builder setRegione___eq(String regione___eq) {
            this.regione___eq = regione___eq;
            return this;
        }

        public Builder setRegione___ne(String regione___ne) {
            this.regione___ne = regione___ne;
            return this;
        }

        public Builder setRegione___null(Boolean regione___null) {
            this.regione___null = regione___null;
            return this;
        }

        public Builder setRegione___not___null(Boolean regione___not___null) {
            this.regione___not___null = regione___not___null;
            return this;
        }

        public Builder setRegione___in(java.util.List<String> regione___in) {
            this.regione___in = regione___in;
            return this;
        }

        public Builder setRegione___not___in(java.util.List<String> regione___not___in) {
            this.regione___not___in = regione___not___in;
            return this;
        }

        public Builder setRegione___lt(String regione___lt) {
            this.regione___lt = regione___lt;
            return this;
        }

        public Builder setRegione___lte(String regione___lte) {
            this.regione___lte = regione___lte;
            return this;
        }

        public Builder setRegione___gt(String regione___gt) {
            this.regione___gt = regione___gt;
            return this;
        }

        public Builder setRegione___gte(String regione___gte) {
            this.regione___gte = regione___gte;
            return this;
        }

        public Builder setRegione___contains(String regione___contains) {
            this.regione___contains = regione___contains;
            return this;
        }

        public Builder setRegione___not___contains(String regione___not___contains) {
            this.regione___not___contains = regione___not___contains;
            return this;
        }

        public Builder setRegione___starts_with(String regione___starts_with) {
            this.regione___starts_with = regione___starts_with;
            return this;
        }

        public Builder setRegione___not___starts_with(String regione___not___starts_with) {
            this.regione___not___starts_with = regione___not___starts_with;
            return this;
        }

        public Builder setRegione___ends_with(String regione___ends_with) {
            this.regione___ends_with = regione___ends_with;
            return this;
        }

        public Builder setRegione___not___ends_with(String regione___not___ends_with) {
            this.regione___not___ends_with = regione___not___ends_with;
            return this;
        }

        public Builder setSottotipo___eq(String sottotipo___eq) {
            this.sottotipo___eq = sottotipo___eq;
            return this;
        }

        public Builder setSottotipo___ne(String sottotipo___ne) {
            this.sottotipo___ne = sottotipo___ne;
            return this;
        }

        public Builder setSottotipo___null(Boolean sottotipo___null) {
            this.sottotipo___null = sottotipo___null;
            return this;
        }

        public Builder setSottotipo___not___null(Boolean sottotipo___not___null) {
            this.sottotipo___not___null = sottotipo___not___null;
            return this;
        }

        public Builder setSottotipo___in(java.util.List<String> sottotipo___in) {
            this.sottotipo___in = sottotipo___in;
            return this;
        }

        public Builder setSottotipo___not___in(java.util.List<String> sottotipo___not___in) {
            this.sottotipo___not___in = sottotipo___not___in;
            return this;
        }

        public Builder setSottotipo___lt(String sottotipo___lt) {
            this.sottotipo___lt = sottotipo___lt;
            return this;
        }

        public Builder setSottotipo___lte(String sottotipo___lte) {
            this.sottotipo___lte = sottotipo___lte;
            return this;
        }

        public Builder setSottotipo___gt(String sottotipo___gt) {
            this.sottotipo___gt = sottotipo___gt;
            return this;
        }

        public Builder setSottotipo___gte(String sottotipo___gte) {
            this.sottotipo___gte = sottotipo___gte;
            return this;
        }

        public Builder setSottotipo___contains(String sottotipo___contains) {
            this.sottotipo___contains = sottotipo___contains;
            return this;
        }

        public Builder setSottotipo___not___contains(String sottotipo___not___contains) {
            this.sottotipo___not___contains = sottotipo___not___contains;
            return this;
        }

        public Builder setSottotipo___starts_with(String sottotipo___starts_with) {
            this.sottotipo___starts_with = sottotipo___starts_with;
            return this;
        }

        public Builder setSottotipo___not___starts_with(String sottotipo___not___starts_with) {
            this.sottotipo___not___starts_with = sottotipo___not___starts_with;
            return this;
        }

        public Builder setSottotipo___ends_with(String sottotipo___ends_with) {
            this.sottotipo___ends_with = sottotipo___ends_with;
            return this;
        }

        public Builder setSottotipo___not___ends_with(String sottotipo___not___ends_with) {
            this.sottotipo___not___ends_with = sottotipo___not___ends_with;
            return this;
        }

        public Builder setTipo_sequenza___eq(String tipo_sequenza___eq) {
            this.tipo_sequenza___eq = tipo_sequenza___eq;
            return this;
        }

        public Builder setTipo_sequenza___ne(String tipo_sequenza___ne) {
            this.tipo_sequenza___ne = tipo_sequenza___ne;
            return this;
        }

        public Builder setTipo_sequenza___null(Boolean tipo_sequenza___null) {
            this.tipo_sequenza___null = tipo_sequenza___null;
            return this;
        }

        public Builder setTipo_sequenza___not___null(Boolean tipo_sequenza___not___null) {
            this.tipo_sequenza___not___null = tipo_sequenza___not___null;
            return this;
        }

        public Builder setTipo_sequenza___in(java.util.List<String> tipo_sequenza___in) {
            this.tipo_sequenza___in = tipo_sequenza___in;
            return this;
        }

        public Builder setTipo_sequenza___not___in(java.util.List<String> tipo_sequenza___not___in) {
            this.tipo_sequenza___not___in = tipo_sequenza___not___in;
            return this;
        }

        public Builder setTipo_sequenza___lt(String tipo_sequenza___lt) {
            this.tipo_sequenza___lt = tipo_sequenza___lt;
            return this;
        }

        public Builder setTipo_sequenza___lte(String tipo_sequenza___lte) {
            this.tipo_sequenza___lte = tipo_sequenza___lte;
            return this;
        }

        public Builder setTipo_sequenza___gt(String tipo_sequenza___gt) {
            this.tipo_sequenza___gt = tipo_sequenza___gt;
            return this;
        }

        public Builder setTipo_sequenza___gte(String tipo_sequenza___gte) {
            this.tipo_sequenza___gte = tipo_sequenza___gte;
            return this;
        }

        public Builder setTipo_sequenza___contains(String tipo_sequenza___contains) {
            this.tipo_sequenza___contains = tipo_sequenza___contains;
            return this;
        }

        public Builder setTipo_sequenza___not___contains(String tipo_sequenza___not___contains) {
            this.tipo_sequenza___not___contains = tipo_sequenza___not___contains;
            return this;
        }

        public Builder setTipo_sequenza___starts_with(String tipo_sequenza___starts_with) {
            this.tipo_sequenza___starts_with = tipo_sequenza___starts_with;
            return this;
        }

        public Builder setTipo_sequenza___not___starts_with(String tipo_sequenza___not___starts_with) {
            this.tipo_sequenza___not___starts_with = tipo_sequenza___not___starts_with;
            return this;
        }

        public Builder setTipo_sequenza___ends_with(String tipo_sequenza___ends_with) {
            this.tipo_sequenza___ends_with = tipo_sequenza___ends_with;
            return this;
        }

        public Builder setTipo_sequenza___not___ends_with(String tipo_sequenza___not___ends_with) {
            this.tipo_sequenza___not___ends_with = tipo_sequenza___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliSequenza_genomicaFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliSequenza_genomicaFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliSequenza_genomicaFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliSequenza_genomicaFilterDTO build() {
            CliSequenza_genomicaFilterDTO result = new CliSequenza_genomicaFilterDTO();
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
            result.setAltro_centro___eq(this.altro_centro___eq);
            result.setAltro_centro___ne(this.altro_centro___ne);
            result.setAltro_centro___null(this.altro_centro___null);
            result.setAltro_centro___not___null(this.altro_centro___not___null);
            result.setAltro_centro___in(this.altro_centro___in);
            result.setAltro_centro___not___in(this.altro_centro___not___in);
            result.setAltro_centro___lt(this.altro_centro___lt);
            result.setAltro_centro___lte(this.altro_centro___lte);
            result.setAltro_centro___gt(this.altro_centro___gt);
            result.setAltro_centro___gte(this.altro_centro___gte);
            result.setAltro_centro___contains(this.altro_centro___contains);
            result.setAltro_centro___not___contains(this.altro_centro___not___contains);
            result.setAltro_centro___starts_with(this.altro_centro___starts_with);
            result.setAltro_centro___not___starts_with(this.altro_centro___not___starts_with);
            result.setAltro_centro___ends_with(this.altro_centro___ends_with);
            result.setAltro_centro___not___ends_with(this.altro_centro___not___ends_with);
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
            result.setCodice_paziente___eq(this.codice_paziente___eq);
            result.setCodice_paziente___ne(this.codice_paziente___ne);
            result.setCodice_paziente___null(this.codice_paziente___null);
            result.setCodice_paziente___not___null(this.codice_paziente___not___null);
            result.setCodice_paziente___in(this.codice_paziente___in);
            result.setCodice_paziente___not___in(this.codice_paziente___not___in);
            result.setCodice_paziente___lt(this.codice_paziente___lt);
            result.setCodice_paziente___lte(this.codice_paziente___lte);
            result.setCodice_paziente___gt(this.codice_paziente___gt);
            result.setCodice_paziente___gte(this.codice_paziente___gte);
            result.setCodice_paziente___contains(this.codice_paziente___contains);
            result.setCodice_paziente___not___contains(this.codice_paziente___not___contains);
            result.setCodice_paziente___starts_with(this.codice_paziente___starts_with);
            result.setCodice_paziente___not___starts_with(this.codice_paziente___not___starts_with);
            result.setCodice_paziente___ends_with(this.codice_paziente___ends_with);
            result.setCodice_paziente___not___ends_with(this.codice_paziente___not___ends_with);
            result.setData_analisi___eq(this.data_analisi___eq);
            result.setData_analisi___ne(this.data_analisi___ne);
            result.setData_analisi___null(this.data_analisi___null);
            result.setData_analisi___not___null(this.data_analisi___not___null);
            result.setData_analisi___in(this.data_analisi___in);
            result.setData_analisi___not___in(this.data_analisi___not___in);
            result.setData_analisi___lt(this.data_analisi___lt);
            result.setData_analisi___lte(this.data_analisi___lte);
            result.setData_analisi___gt(this.data_analisi___gt);
            result.setData_analisi___gte(this.data_analisi___gte);
            result.setData_prelievo___eq(this.data_prelievo___eq);
            result.setData_prelievo___ne(this.data_prelievo___ne);
            result.setData_prelievo___null(this.data_prelievo___null);
            result.setData_prelievo___not___null(this.data_prelievo___not___null);
            result.setData_prelievo___in(this.data_prelievo___in);
            result.setData_prelievo___not___in(this.data_prelievo___not___in);
            result.setData_prelievo___lt(this.data_prelievo___lt);
            result.setData_prelievo___lte(this.data_prelievo___lte);
            result.setData_prelievo___gt(this.data_prelievo___gt);
            result.setData_prelievo___gte(this.data_prelievo___gte);
            result.setEffettuato_su___eq(this.effettuato_su___eq);
            result.setEffettuato_su___ne(this.effettuato_su___ne);
            result.setEffettuato_su___null(this.effettuato_su___null);
            result.setEffettuato_su___not___null(this.effettuato_su___not___null);
            result.setEffettuato_su___in(this.effettuato_su___in);
            result.setEffettuato_su___not___in(this.effettuato_su___not___in);
            result.setEffettuato_su___lt(this.effettuato_su___lt);
            result.setEffettuato_su___lte(this.effettuato_su___lte);
            result.setEffettuato_su___gt(this.effettuato_su___gt);
            result.setEffettuato_su___gte(this.effettuato_su___gte);
            result.setEffettuato_su___contains(this.effettuato_su___contains);
            result.setEffettuato_su___not___contains(this.effettuato_su___not___contains);
            result.setEffettuato_su___starts_with(this.effettuato_su___starts_with);
            result.setEffettuato_su___not___starts_with(this.effettuato_su___not___starts_with);
            result.setEffettuato_su___ends_with(this.effettuato_su___ends_with);
            result.setEffettuato_su___not___ends_with(this.effettuato_su___not___ends_with);
            result.setElenco_mutazioni_ENV___eq(this.elenco_mutazioni_ENV___eq);
            result.setElenco_mutazioni_ENV___ne(this.elenco_mutazioni_ENV___ne);
            result.setElenco_mutazioni_ENV___null(this.elenco_mutazioni_ENV___null);
            result.setElenco_mutazioni_ENV___not___null(this.elenco_mutazioni_ENV___not___null);
            result.setElenco_mutazioni_ENV___in(this.elenco_mutazioni_ENV___in);
            result.setElenco_mutazioni_ENV___not___in(this.elenco_mutazioni_ENV___not___in);
            result.setElenco_mutazioni_ENV___lt(this.elenco_mutazioni_ENV___lt);
            result.setElenco_mutazioni_ENV___lte(this.elenco_mutazioni_ENV___lte);
            result.setElenco_mutazioni_ENV___gt(this.elenco_mutazioni_ENV___gt);
            result.setElenco_mutazioni_ENV___gte(this.elenco_mutazioni_ENV___gte);
            result.setElenco_mutazioni_ENV___contains(this.elenco_mutazioni_ENV___contains);
            result.setElenco_mutazioni_ENV___not___contains(this.elenco_mutazioni_ENV___not___contains);
            result.setElenco_mutazioni_ENV___starts_with(this.elenco_mutazioni_ENV___starts_with);
            result.setElenco_mutazioni_ENV___not___starts_with(this.elenco_mutazioni_ENV___not___starts_with);
            result.setElenco_mutazioni_ENV___ends_with(this.elenco_mutazioni_ENV___ends_with);
            result.setElenco_mutazioni_ENV___not___ends_with(this.elenco_mutazioni_ENV___not___ends_with);
            result.setElenco_mutazioni_INT___eq(this.elenco_mutazioni_INT___eq);
            result.setElenco_mutazioni_INT___ne(this.elenco_mutazioni_INT___ne);
            result.setElenco_mutazioni_INT___null(this.elenco_mutazioni_INT___null);
            result.setElenco_mutazioni_INT___not___null(this.elenco_mutazioni_INT___not___null);
            result.setElenco_mutazioni_INT___in(this.elenco_mutazioni_INT___in);
            result.setElenco_mutazioni_INT___not___in(this.elenco_mutazioni_INT___not___in);
            result.setElenco_mutazioni_INT___lt(this.elenco_mutazioni_INT___lt);
            result.setElenco_mutazioni_INT___lte(this.elenco_mutazioni_INT___lte);
            result.setElenco_mutazioni_INT___gt(this.elenco_mutazioni_INT___gt);
            result.setElenco_mutazioni_INT___gte(this.elenco_mutazioni_INT___gte);
            result.setElenco_mutazioni_INT___contains(this.elenco_mutazioni_INT___contains);
            result.setElenco_mutazioni_INT___not___contains(this.elenco_mutazioni_INT___not___contains);
            result.setElenco_mutazioni_INT___starts_with(this.elenco_mutazioni_INT___starts_with);
            result.setElenco_mutazioni_INT___not___starts_with(this.elenco_mutazioni_INT___not___starts_with);
            result.setElenco_mutazioni_INT___ends_with(this.elenco_mutazioni_INT___ends_with);
            result.setElenco_mutazioni_INT___not___ends_with(this.elenco_mutazioni_INT___not___ends_with);
            result.setElenco_mutazioni_PR___eq(this.elenco_mutazioni_PR___eq);
            result.setElenco_mutazioni_PR___ne(this.elenco_mutazioni_PR___ne);
            result.setElenco_mutazioni_PR___null(this.elenco_mutazioni_PR___null);
            result.setElenco_mutazioni_PR___not___null(this.elenco_mutazioni_PR___not___null);
            result.setElenco_mutazioni_PR___in(this.elenco_mutazioni_PR___in);
            result.setElenco_mutazioni_PR___not___in(this.elenco_mutazioni_PR___not___in);
            result.setElenco_mutazioni_PR___lt(this.elenco_mutazioni_PR___lt);
            result.setElenco_mutazioni_PR___lte(this.elenco_mutazioni_PR___lte);
            result.setElenco_mutazioni_PR___gt(this.elenco_mutazioni_PR___gt);
            result.setElenco_mutazioni_PR___gte(this.elenco_mutazioni_PR___gte);
            result.setElenco_mutazioni_PR___contains(this.elenco_mutazioni_PR___contains);
            result.setElenco_mutazioni_PR___not___contains(this.elenco_mutazioni_PR___not___contains);
            result.setElenco_mutazioni_PR___starts_with(this.elenco_mutazioni_PR___starts_with);
            result.setElenco_mutazioni_PR___not___starts_with(this.elenco_mutazioni_PR___not___starts_with);
            result.setElenco_mutazioni_PR___ends_with(this.elenco_mutazioni_PR___ends_with);
            result.setElenco_mutazioni_PR___not___ends_with(this.elenco_mutazioni_PR___not___ends_with);
            result.setElenco_mutazioni_RT___eq(this.elenco_mutazioni_RT___eq);
            result.setElenco_mutazioni_RT___ne(this.elenco_mutazioni_RT___ne);
            result.setElenco_mutazioni_RT___null(this.elenco_mutazioni_RT___null);
            result.setElenco_mutazioni_RT___not___null(this.elenco_mutazioni_RT___not___null);
            result.setElenco_mutazioni_RT___in(this.elenco_mutazioni_RT___in);
            result.setElenco_mutazioni_RT___not___in(this.elenco_mutazioni_RT___not___in);
            result.setElenco_mutazioni_RT___lt(this.elenco_mutazioni_RT___lt);
            result.setElenco_mutazioni_RT___lte(this.elenco_mutazioni_RT___lte);
            result.setElenco_mutazioni_RT___gt(this.elenco_mutazioni_RT___gt);
            result.setElenco_mutazioni_RT___gte(this.elenco_mutazioni_RT___gte);
            result.setElenco_mutazioni_RT___contains(this.elenco_mutazioni_RT___contains);
            result.setElenco_mutazioni_RT___not___contains(this.elenco_mutazioni_RT___not___contains);
            result.setElenco_mutazioni_RT___starts_with(this.elenco_mutazioni_RT___starts_with);
            result.setElenco_mutazioni_RT___not___starts_with(this.elenco_mutazioni_RT___not___starts_with);
            result.setElenco_mutazioni_RT___ends_with(this.elenco_mutazioni_RT___ends_with);
            result.setElenco_mutazioni_RT___not___ends_with(this.elenco_mutazioni_RT___not___ends_with);
            result.setElenco_mutazioni_V3___eq(this.elenco_mutazioni_V3___eq);
            result.setElenco_mutazioni_V3___ne(this.elenco_mutazioni_V3___ne);
            result.setElenco_mutazioni_V3___null(this.elenco_mutazioni_V3___null);
            result.setElenco_mutazioni_V3___not___null(this.elenco_mutazioni_V3___not___null);
            result.setElenco_mutazioni_V3___in(this.elenco_mutazioni_V3___in);
            result.setElenco_mutazioni_V3___not___in(this.elenco_mutazioni_V3___not___in);
            result.setElenco_mutazioni_V3___lt(this.elenco_mutazioni_V3___lt);
            result.setElenco_mutazioni_V3___lte(this.elenco_mutazioni_V3___lte);
            result.setElenco_mutazioni_V3___gt(this.elenco_mutazioni_V3___gt);
            result.setElenco_mutazioni_V3___gte(this.elenco_mutazioni_V3___gte);
            result.setElenco_mutazioni_V3___contains(this.elenco_mutazioni_V3___contains);
            result.setElenco_mutazioni_V3___not___contains(this.elenco_mutazioni_V3___not___contains);
            result.setElenco_mutazioni_V3___starts_with(this.elenco_mutazioni_V3___starts_with);
            result.setElenco_mutazioni_V3___not___starts_with(this.elenco_mutazioni_V3___not___starts_with);
            result.setElenco_mutazioni_V3___ends_with(this.elenco_mutazioni_V3___ends_with);
            result.setElenco_mutazioni_V3___not___ends_with(this.elenco_mutazioni_V3___not___ends_with);
            result.setEtichetta___eq(this.etichetta___eq);
            result.setEtichetta___ne(this.etichetta___ne);
            result.setEtichetta___null(this.etichetta___null);
            result.setEtichetta___not___null(this.etichetta___not___null);
            result.setEtichetta___in(this.etichetta___in);
            result.setEtichetta___not___in(this.etichetta___not___in);
            result.setEtichetta___lt(this.etichetta___lt);
            result.setEtichetta___lte(this.etichetta___lte);
            result.setEtichetta___gt(this.etichetta___gt);
            result.setEtichetta___gte(this.etichetta___gte);
            result.setEtichetta___contains(this.etichetta___contains);
            result.setEtichetta___not___contains(this.etichetta___not___contains);
            result.setEtichetta___starts_with(this.etichetta___starts_with);
            result.setEtichetta___not___starts_with(this.etichetta___not___starts_with);
            result.setEtichetta___ends_with(this.etichetta___ends_with);
            result.setEtichetta___not___ends_with(this.etichetta___not___ends_with);
            result.setFiltro_codice_paziente___eq(this.filtro_codice_paziente___eq);
            result.setFiltro_codice_paziente___ne(this.filtro_codice_paziente___ne);
            result.setFiltro_codice_paziente___null(this.filtro_codice_paziente___null);
            result.setFiltro_codice_paziente___not___null(this.filtro_codice_paziente___not___null);
            result.setFiltro_codice_paziente___in(this.filtro_codice_paziente___in);
            result.setFiltro_codice_paziente___not___in(this.filtro_codice_paziente___not___in);
            result.setFiltro_codice_paziente___lt(this.filtro_codice_paziente___lt);
            result.setFiltro_codice_paziente___lte(this.filtro_codice_paziente___lte);
            result.setFiltro_codice_paziente___gt(this.filtro_codice_paziente___gt);
            result.setFiltro_codice_paziente___gte(this.filtro_codice_paziente___gte);
            result.setFiltro_codice_paziente___contains(this.filtro_codice_paziente___contains);
            result.setFiltro_codice_paziente___not___contains(this.filtro_codice_paziente___not___contains);
            result.setFiltro_codice_paziente___starts_with(this.filtro_codice_paziente___starts_with);
            result.setFiltro_codice_paziente___not___starts_with(this.filtro_codice_paziente___not___starts_with);
            result.setFiltro_codice_paziente___ends_with(this.filtro_codice_paziente___ends_with);
            result.setFiltro_codice_paziente___not___ends_with(this.filtro_codice_paziente___not___ends_with);
            result.setMutazioni___eq(this.mutazioni___eq);
            result.setMutazioni___ne(this.mutazioni___ne);
            result.setMutazioni___null(this.mutazioni___null);
            result.setMutazioni___not___null(this.mutazioni___not___null);
            result.setMutazioni___in(this.mutazioni___in);
            result.setMutazioni___not___in(this.mutazioni___not___in);
            result.setMutazioni___lt(this.mutazioni___lt);
            result.setMutazioni___lte(this.mutazioni___lte);
            result.setMutazioni___gt(this.mutazioni___gt);
            result.setMutazioni___gte(this.mutazioni___gte);
            result.setMutazioni_no_farmaco___eq(this.mutazioni_no_farmaco___eq);
            result.setMutazioni_no_farmaco___ne(this.mutazioni_no_farmaco___ne);
            result.setMutazioni_no_farmaco___null(this.mutazioni_no_farmaco___null);
            result.setMutazioni_no_farmaco___not___null(this.mutazioni_no_farmaco___not___null);
            result.setMutazioni_no_farmaco___in(this.mutazioni_no_farmaco___in);
            result.setMutazioni_no_farmaco___not___in(this.mutazioni_no_farmaco___not___in);
            result.setMutazioni_no_farmaco___lt(this.mutazioni_no_farmaco___lt);
            result.setMutazioni_no_farmaco___lte(this.mutazioni_no_farmaco___lte);
            result.setMutazioni_no_farmaco___gt(this.mutazioni_no_farmaco___gt);
            result.setMutazioni_no_farmaco___gte(this.mutazioni_no_farmaco___gte);
            result.setMutazioni_no_farmaco___contains(this.mutazioni_no_farmaco___contains);
            result.setMutazioni_no_farmaco___not___contains(this.mutazioni_no_farmaco___not___contains);
            result.setMutazioni_no_farmaco___starts_with(this.mutazioni_no_farmaco___starts_with);
            result.setMutazioni_no_farmaco___not___starts_with(this.mutazioni_no_farmaco___not___starts_with);
            result.setMutazioni_no_farmaco___ends_with(this.mutazioni_no_farmaco___ends_with);
            result.setMutazioni_no_farmaco___not___ends_with(this.mutazioni_no_farmaco___not___ends_with);
            result.setNessuna_mutazione_ENV___eq(this.nessuna_mutazione_ENV___eq);
            result.setNessuna_mutazione_ENV___ne(this.nessuna_mutazione_ENV___ne);
            result.setNessuna_mutazione_ENV___null(this.nessuna_mutazione_ENV___null);
            result.setNessuna_mutazione_ENV___not___null(this.nessuna_mutazione_ENV___not___null);
            result.setNessuna_mutazione_INT___eq(this.nessuna_mutazione_INT___eq);
            result.setNessuna_mutazione_INT___ne(this.nessuna_mutazione_INT___ne);
            result.setNessuna_mutazione_INT___null(this.nessuna_mutazione_INT___null);
            result.setNessuna_mutazione_INT___not___null(this.nessuna_mutazione_INT___not___null);
            result.setNessuna_mutazione_PR___eq(this.nessuna_mutazione_PR___eq);
            result.setNessuna_mutazione_PR___ne(this.nessuna_mutazione_PR___ne);
            result.setNessuna_mutazione_PR___null(this.nessuna_mutazione_PR___null);
            result.setNessuna_mutazione_PR___not___null(this.nessuna_mutazione_PR___not___null);
            result.setNessuna_mutazione_RT___eq(this.nessuna_mutazione_RT___eq);
            result.setNessuna_mutazione_RT___ne(this.nessuna_mutazione_RT___ne);
            result.setNessuna_mutazione_RT___null(this.nessuna_mutazione_RT___null);
            result.setNessuna_mutazione_RT___not___null(this.nessuna_mutazione_RT___not___null);
            result.setNessuna_mutazione_V3___eq(this.nessuna_mutazione_V3___eq);
            result.setNessuna_mutazione_V3___ne(this.nessuna_mutazione_V3___ne);
            result.setNessuna_mutazione_V3___null(this.nessuna_mutazione_V3___null);
            result.setNessuna_mutazione_V3___not___null(this.nessuna_mutazione_V3___not___null);
            result.setNucleotidi___eq(this.nucleotidi___eq);
            result.setNucleotidi___ne(this.nucleotidi___ne);
            result.setNucleotidi___null(this.nucleotidi___null);
            result.setNucleotidi___not___null(this.nucleotidi___not___null);
            result.setNucleotidi___in(this.nucleotidi___in);
            result.setNucleotidi___not___in(this.nucleotidi___not___in);
            result.setNucleotidi___lt(this.nucleotidi___lt);
            result.setNucleotidi___lte(this.nucleotidi___lte);
            result.setNucleotidi___gt(this.nucleotidi___gt);
            result.setNucleotidi___gte(this.nucleotidi___gte);
            result.setNucleotidi___contains(this.nucleotidi___contains);
            result.setNucleotidi___not___contains(this.nucleotidi___not___contains);
            result.setNucleotidi___starts_with(this.nucleotidi___starts_with);
            result.setNucleotidi___not___starts_with(this.nucleotidi___not___starts_with);
            result.setNucleotidi___ends_with(this.nucleotidi___ends_with);
            result.setNucleotidi___not___ends_with(this.nucleotidi___not___ends_with);
            result.setRegione___eq(this.regione___eq);
            result.setRegione___ne(this.regione___ne);
            result.setRegione___null(this.regione___null);
            result.setRegione___not___null(this.regione___not___null);
            result.setRegione___in(this.regione___in);
            result.setRegione___not___in(this.regione___not___in);
            result.setRegione___lt(this.regione___lt);
            result.setRegione___lte(this.regione___lte);
            result.setRegione___gt(this.regione___gt);
            result.setRegione___gte(this.regione___gte);
            result.setRegione___contains(this.regione___contains);
            result.setRegione___not___contains(this.regione___not___contains);
            result.setRegione___starts_with(this.regione___starts_with);
            result.setRegione___not___starts_with(this.regione___not___starts_with);
            result.setRegione___ends_with(this.regione___ends_with);
            result.setRegione___not___ends_with(this.regione___not___ends_with);
            result.setSottotipo___eq(this.sottotipo___eq);
            result.setSottotipo___ne(this.sottotipo___ne);
            result.setSottotipo___null(this.sottotipo___null);
            result.setSottotipo___not___null(this.sottotipo___not___null);
            result.setSottotipo___in(this.sottotipo___in);
            result.setSottotipo___not___in(this.sottotipo___not___in);
            result.setSottotipo___lt(this.sottotipo___lt);
            result.setSottotipo___lte(this.sottotipo___lte);
            result.setSottotipo___gt(this.sottotipo___gt);
            result.setSottotipo___gte(this.sottotipo___gte);
            result.setSottotipo___contains(this.sottotipo___contains);
            result.setSottotipo___not___contains(this.sottotipo___not___contains);
            result.setSottotipo___starts_with(this.sottotipo___starts_with);
            result.setSottotipo___not___starts_with(this.sottotipo___not___starts_with);
            result.setSottotipo___ends_with(this.sottotipo___ends_with);
            result.setSottotipo___not___ends_with(this.sottotipo___not___ends_with);
            result.setTipo_sequenza___eq(this.tipo_sequenza___eq);
            result.setTipo_sequenza___ne(this.tipo_sequenza___ne);
            result.setTipo_sequenza___null(this.tipo_sequenza___null);
            result.setTipo_sequenza___not___null(this.tipo_sequenza___not___null);
            result.setTipo_sequenza___in(this.tipo_sequenza___in);
            result.setTipo_sequenza___not___in(this.tipo_sequenza___not___in);
            result.setTipo_sequenza___lt(this.tipo_sequenza___lt);
            result.setTipo_sequenza___lte(this.tipo_sequenza___lte);
            result.setTipo_sequenza___gt(this.tipo_sequenza___gt);
            result.setTipo_sequenza___gte(this.tipo_sequenza___gte);
            result.setTipo_sequenza___contains(this.tipo_sequenza___contains);
            result.setTipo_sequenza___not___contains(this.tipo_sequenza___not___contains);
            result.setTipo_sequenza___starts_with(this.tipo_sequenza___starts_with);
            result.setTipo_sequenza___not___starts_with(this.tipo_sequenza___not___starts_with);
            result.setTipo_sequenza___ends_with(this.tipo_sequenza___ends_with);
            result.setTipo_sequenza___not___ends_with(this.tipo_sequenza___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
