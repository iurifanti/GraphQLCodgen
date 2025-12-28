package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Patologia.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliPatologiaFilterDTO implements java.io.Serializable {

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
    private Integer cdc___eq;
    private Integer cdc___ne;
    private Boolean cdc___null;
    private Boolean cdc___not___null;
    private java.util.List<Integer> cdc___in;
    private java.util.List<Integer> cdc___not___in;
    private Integer cdc___lt;
    private Integer cdc___lte;
    private Integer cdc___gt;
    private Integer cdc___gte;
    private String codice_dad___eq;
    private String codice_dad___ne;
    private Boolean codice_dad___null;
    private Boolean codice_dad___not___null;
    private java.util.List<String> codice_dad___in;
    private java.util.List<String> codice_dad___not___in;
    private String codice_dad___lt;
    private String codice_dad___lte;
    private String codice_dad___gt;
    private String codice_dad___gte;
    private String codice_dad___contains;
    private String codice_dad___not___contains;
    private String codice_dad___starts_with;
    private String codice_dad___not___starts_with;
    private String codice_dad___ends_with;
    private String codice_dad___not___ends_with;
    private String codice_hicdep___eq;
    private String codice_hicdep___ne;
    private Boolean codice_hicdep___null;
    private Boolean codice_hicdep___not___null;
    private java.util.List<String> codice_hicdep___in;
    private java.util.List<String> codice_hicdep___not___in;
    private String codice_hicdep___lt;
    private String codice_hicdep___lte;
    private String codice_hicdep___gt;
    private String codice_hicdep___gte;
    private String codice_hicdep___contains;
    private String codice_hicdep___not___contains;
    private String codice_hicdep___starts_with;
    private String codice_hicdep___not___starts_with;
    private String codice_hicdep___ends_with;
    private String codice_hicdep___not___ends_with;
    private Boolean comorbidita_covid___eq;
    private Boolean comorbidita_covid___ne;
    private Boolean comorbidita_covid___null;
    private Boolean comorbidita_covid___not___null;
    private Boolean comorbidita_vax___eq;
    private Boolean comorbidita_vax___ne;
    private Boolean comorbidita_vax___null;
    private Boolean comorbidita_vax___not___null;
    private String descrizione___eq;
    private String descrizione___ne;
    private Boolean descrizione___null;
    private Boolean descrizione___not___null;
    private java.util.List<String> descrizione___in;
    private java.util.List<String> descrizione___not___in;
    private String descrizione___lt;
    private String descrizione___lte;
    private String descrizione___gt;
    private String descrizione___gte;
    private String descrizione___contains;
    private String descrizione___not___contains;
    private String descrizione___starts_with;
    private String descrizione___not___starts_with;
    private String descrizione___ends_with;
    private String descrizione___not___ends_with;
    private Boolean documentazione___eq;
    private Boolean documentazione___ne;
    private Boolean documentazione___null;
    private Boolean documentazione___not___null;
    private Boolean evento_covid___eq;
    private Boolean evento_covid___ne;
    private Boolean evento_covid___null;
    private Boolean evento_covid___not___null;
    private Boolean evento_vaccino_covid___eq;
    private Boolean evento_vaccino_covid___ne;
    private Boolean evento_vaccino_covid___null;
    private Boolean evento_vaccino_covid___not___null;
    private String gruppo___eq;
    private String gruppo___ne;
    private Boolean gruppo___null;
    private Boolean gruppo___not___null;
    private java.util.List<String> gruppo___in;
    private java.util.List<String> gruppo___not___in;
    private String gruppo___lt;
    private String gruppo___lte;
    private String gruppo___gt;
    private String gruppo___gte;
    private String gruppo___contains;
    private String gruppo___not___contains;
    private String gruppo___starts_with;
    private String gruppo___not___starts_with;
    private String gruppo___ends_with;
    private String gruppo___not___ends_with;
    private String label_epatiche___eq;
    private String label_epatiche___ne;
    private Boolean label_epatiche___null;
    private Boolean label_epatiche___not___null;
    private java.util.List<String> label_epatiche___in;
    private java.util.List<String> label_epatiche___not___in;
    private String label_epatiche___lt;
    private String label_epatiche___lte;
    private String label_epatiche___gt;
    private String label_epatiche___gte;
    private String label_epatiche___contains;
    private String label_epatiche___not___contains;
    private String label_epatiche___starts_with;
    private String label_epatiche___not___starts_with;
    private String label_epatiche___ends_with;
    private String label_epatiche___not___ends_with;
    private Boolean mostra_specifica_tumori___eq;
    private Boolean mostra_specifica_tumori___ne;
    private Boolean mostra_specifica_tumori___null;
    private Boolean mostra_specifica_tumori___not___null;
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
    private Boolean pride___eq;
    private Boolean pride___ne;
    private Boolean pride___null;
    private Boolean pride___not___null;
    private Boolean ricovero___eq;
    private Boolean ricovero___ne;
    private Boolean ricovero___null;
    private Boolean ricovero___not___null;
    private Boolean solo_F___eq;
    private Boolean solo_F___ne;
    private Boolean solo_F___null;
    private Boolean solo_F___not___null;
    private Boolean solo_M___eq;
    private Boolean solo_M___ne;
    private Boolean solo_M___null;
    private Boolean solo_M___not___null;
    private String sottogruppo___eq;
    private String sottogruppo___ne;
    private Boolean sottogruppo___null;
    private Boolean sottogruppo___not___null;
    private java.util.List<String> sottogruppo___in;
    private java.util.List<String> sottogruppo___not___in;
    private String sottogruppo___lt;
    private String sottogruppo___lte;
    private String sottogruppo___gt;
    private String sottogruppo___gte;
    private String sottogruppo___contains;
    private String sottogruppo___not___contains;
    private String sottogruppo___starts_with;
    private String sottogruppo___not___starts_with;
    private String sottogruppo___ends_with;
    private String sottogruppo___not___ends_with;
    private Integer tipo___eq;
    private Integer tipo___ne;
    private Boolean tipo___null;
    private Boolean tipo___not___null;
    private java.util.List<Integer> tipo___in;
    private java.util.List<Integer> tipo___not___in;
    private Integer tipo___lt;
    private Integer tipo___lte;
    private Integer tipo___gt;
    private Integer tipo___gte;
    private Boolean visibile___eq;
    private Boolean visibile___ne;
    private Boolean visibile___null;
    private Boolean visibile___not___null;
    private Boolean warning_respond___eq;
    private Boolean warning_respond___ne;
    private Boolean warning_respond___null;
    private Boolean warning_respond___not___null;
    private java.util.List<CliPatologiaFilterDTO> AND;
    private java.util.List<CliPatologiaFilterDTO> OR;
    private CliPatologiaFilterDTO NOT;

    public CliPatologiaFilterDTO() {
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

    public Integer getCdc___eq() {
        return cdc___eq;
    }
    public void setCdc___eq(Integer cdc___eq) {
        this.cdc___eq = cdc___eq;
    }

    public Integer getCdc___ne() {
        return cdc___ne;
    }
    public void setCdc___ne(Integer cdc___ne) {
        this.cdc___ne = cdc___ne;
    }

    public Boolean getCdc___null() {
        return cdc___null;
    }
    public void setCdc___null(Boolean cdc___null) {
        this.cdc___null = cdc___null;
    }

    public Boolean getCdc___not___null() {
        return cdc___not___null;
    }
    public void setCdc___not___null(Boolean cdc___not___null) {
        this.cdc___not___null = cdc___not___null;
    }

    public java.util.List<Integer> getCdc___in() {
        return cdc___in;
    }
    public void setCdc___in(java.util.List<Integer> cdc___in) {
        this.cdc___in = cdc___in;
    }

    public java.util.List<Integer> getCdc___not___in() {
        return cdc___not___in;
    }
    public void setCdc___not___in(java.util.List<Integer> cdc___not___in) {
        this.cdc___not___in = cdc___not___in;
    }

    public Integer getCdc___lt() {
        return cdc___lt;
    }
    public void setCdc___lt(Integer cdc___lt) {
        this.cdc___lt = cdc___lt;
    }

    public Integer getCdc___lte() {
        return cdc___lte;
    }
    public void setCdc___lte(Integer cdc___lte) {
        this.cdc___lte = cdc___lte;
    }

    public Integer getCdc___gt() {
        return cdc___gt;
    }
    public void setCdc___gt(Integer cdc___gt) {
        this.cdc___gt = cdc___gt;
    }

    public Integer getCdc___gte() {
        return cdc___gte;
    }
    public void setCdc___gte(Integer cdc___gte) {
        this.cdc___gte = cdc___gte;
    }

    public String getCodice_dad___eq() {
        return codice_dad___eq;
    }
    public void setCodice_dad___eq(String codice_dad___eq) {
        this.codice_dad___eq = codice_dad___eq;
    }

    public String getCodice_dad___ne() {
        return codice_dad___ne;
    }
    public void setCodice_dad___ne(String codice_dad___ne) {
        this.codice_dad___ne = codice_dad___ne;
    }

    public Boolean getCodice_dad___null() {
        return codice_dad___null;
    }
    public void setCodice_dad___null(Boolean codice_dad___null) {
        this.codice_dad___null = codice_dad___null;
    }

    public Boolean getCodice_dad___not___null() {
        return codice_dad___not___null;
    }
    public void setCodice_dad___not___null(Boolean codice_dad___not___null) {
        this.codice_dad___not___null = codice_dad___not___null;
    }

    public java.util.List<String> getCodice_dad___in() {
        return codice_dad___in;
    }
    public void setCodice_dad___in(java.util.List<String> codice_dad___in) {
        this.codice_dad___in = codice_dad___in;
    }

    public java.util.List<String> getCodice_dad___not___in() {
        return codice_dad___not___in;
    }
    public void setCodice_dad___not___in(java.util.List<String> codice_dad___not___in) {
        this.codice_dad___not___in = codice_dad___not___in;
    }

    public String getCodice_dad___lt() {
        return codice_dad___lt;
    }
    public void setCodice_dad___lt(String codice_dad___lt) {
        this.codice_dad___lt = codice_dad___lt;
    }

    public String getCodice_dad___lte() {
        return codice_dad___lte;
    }
    public void setCodice_dad___lte(String codice_dad___lte) {
        this.codice_dad___lte = codice_dad___lte;
    }

    public String getCodice_dad___gt() {
        return codice_dad___gt;
    }
    public void setCodice_dad___gt(String codice_dad___gt) {
        this.codice_dad___gt = codice_dad___gt;
    }

    public String getCodice_dad___gte() {
        return codice_dad___gte;
    }
    public void setCodice_dad___gte(String codice_dad___gte) {
        this.codice_dad___gte = codice_dad___gte;
    }

    public String getCodice_dad___contains() {
        return codice_dad___contains;
    }
    public void setCodice_dad___contains(String codice_dad___contains) {
        this.codice_dad___contains = codice_dad___contains;
    }

    public String getCodice_dad___not___contains() {
        return codice_dad___not___contains;
    }
    public void setCodice_dad___not___contains(String codice_dad___not___contains) {
        this.codice_dad___not___contains = codice_dad___not___contains;
    }

    public String getCodice_dad___starts_with() {
        return codice_dad___starts_with;
    }
    public void setCodice_dad___starts_with(String codice_dad___starts_with) {
        this.codice_dad___starts_with = codice_dad___starts_with;
    }

    public String getCodice_dad___not___starts_with() {
        return codice_dad___not___starts_with;
    }
    public void setCodice_dad___not___starts_with(String codice_dad___not___starts_with) {
        this.codice_dad___not___starts_with = codice_dad___not___starts_with;
    }

    public String getCodice_dad___ends_with() {
        return codice_dad___ends_with;
    }
    public void setCodice_dad___ends_with(String codice_dad___ends_with) {
        this.codice_dad___ends_with = codice_dad___ends_with;
    }

    public String getCodice_dad___not___ends_with() {
        return codice_dad___not___ends_with;
    }
    public void setCodice_dad___not___ends_with(String codice_dad___not___ends_with) {
        this.codice_dad___not___ends_with = codice_dad___not___ends_with;
    }

    public String getCodice_hicdep___eq() {
        return codice_hicdep___eq;
    }
    public void setCodice_hicdep___eq(String codice_hicdep___eq) {
        this.codice_hicdep___eq = codice_hicdep___eq;
    }

    public String getCodice_hicdep___ne() {
        return codice_hicdep___ne;
    }
    public void setCodice_hicdep___ne(String codice_hicdep___ne) {
        this.codice_hicdep___ne = codice_hicdep___ne;
    }

    public Boolean getCodice_hicdep___null() {
        return codice_hicdep___null;
    }
    public void setCodice_hicdep___null(Boolean codice_hicdep___null) {
        this.codice_hicdep___null = codice_hicdep___null;
    }

    public Boolean getCodice_hicdep___not___null() {
        return codice_hicdep___not___null;
    }
    public void setCodice_hicdep___not___null(Boolean codice_hicdep___not___null) {
        this.codice_hicdep___not___null = codice_hicdep___not___null;
    }

    public java.util.List<String> getCodice_hicdep___in() {
        return codice_hicdep___in;
    }
    public void setCodice_hicdep___in(java.util.List<String> codice_hicdep___in) {
        this.codice_hicdep___in = codice_hicdep___in;
    }

    public java.util.List<String> getCodice_hicdep___not___in() {
        return codice_hicdep___not___in;
    }
    public void setCodice_hicdep___not___in(java.util.List<String> codice_hicdep___not___in) {
        this.codice_hicdep___not___in = codice_hicdep___not___in;
    }

    public String getCodice_hicdep___lt() {
        return codice_hicdep___lt;
    }
    public void setCodice_hicdep___lt(String codice_hicdep___lt) {
        this.codice_hicdep___lt = codice_hicdep___lt;
    }

    public String getCodice_hicdep___lte() {
        return codice_hicdep___lte;
    }
    public void setCodice_hicdep___lte(String codice_hicdep___lte) {
        this.codice_hicdep___lte = codice_hicdep___lte;
    }

    public String getCodice_hicdep___gt() {
        return codice_hicdep___gt;
    }
    public void setCodice_hicdep___gt(String codice_hicdep___gt) {
        this.codice_hicdep___gt = codice_hicdep___gt;
    }

    public String getCodice_hicdep___gte() {
        return codice_hicdep___gte;
    }
    public void setCodice_hicdep___gte(String codice_hicdep___gte) {
        this.codice_hicdep___gte = codice_hicdep___gte;
    }

    public String getCodice_hicdep___contains() {
        return codice_hicdep___contains;
    }
    public void setCodice_hicdep___contains(String codice_hicdep___contains) {
        this.codice_hicdep___contains = codice_hicdep___contains;
    }

    public String getCodice_hicdep___not___contains() {
        return codice_hicdep___not___contains;
    }
    public void setCodice_hicdep___not___contains(String codice_hicdep___not___contains) {
        this.codice_hicdep___not___contains = codice_hicdep___not___contains;
    }

    public String getCodice_hicdep___starts_with() {
        return codice_hicdep___starts_with;
    }
    public void setCodice_hicdep___starts_with(String codice_hicdep___starts_with) {
        this.codice_hicdep___starts_with = codice_hicdep___starts_with;
    }

    public String getCodice_hicdep___not___starts_with() {
        return codice_hicdep___not___starts_with;
    }
    public void setCodice_hicdep___not___starts_with(String codice_hicdep___not___starts_with) {
        this.codice_hicdep___not___starts_with = codice_hicdep___not___starts_with;
    }

    public String getCodice_hicdep___ends_with() {
        return codice_hicdep___ends_with;
    }
    public void setCodice_hicdep___ends_with(String codice_hicdep___ends_with) {
        this.codice_hicdep___ends_with = codice_hicdep___ends_with;
    }

    public String getCodice_hicdep___not___ends_with() {
        return codice_hicdep___not___ends_with;
    }
    public void setCodice_hicdep___not___ends_with(String codice_hicdep___not___ends_with) {
        this.codice_hicdep___not___ends_with = codice_hicdep___not___ends_with;
    }

    public Boolean getComorbidita_covid___eq() {
        return comorbidita_covid___eq;
    }
    public void setComorbidita_covid___eq(Boolean comorbidita_covid___eq) {
        this.comorbidita_covid___eq = comorbidita_covid___eq;
    }

    public Boolean getComorbidita_covid___ne() {
        return comorbidita_covid___ne;
    }
    public void setComorbidita_covid___ne(Boolean comorbidita_covid___ne) {
        this.comorbidita_covid___ne = comorbidita_covid___ne;
    }

    public Boolean getComorbidita_covid___null() {
        return comorbidita_covid___null;
    }
    public void setComorbidita_covid___null(Boolean comorbidita_covid___null) {
        this.comorbidita_covid___null = comorbidita_covid___null;
    }

    public Boolean getComorbidita_covid___not___null() {
        return comorbidita_covid___not___null;
    }
    public void setComorbidita_covid___not___null(Boolean comorbidita_covid___not___null) {
        this.comorbidita_covid___not___null = comorbidita_covid___not___null;
    }

    public Boolean getComorbidita_vax___eq() {
        return comorbidita_vax___eq;
    }
    public void setComorbidita_vax___eq(Boolean comorbidita_vax___eq) {
        this.comorbidita_vax___eq = comorbidita_vax___eq;
    }

    public Boolean getComorbidita_vax___ne() {
        return comorbidita_vax___ne;
    }
    public void setComorbidita_vax___ne(Boolean comorbidita_vax___ne) {
        this.comorbidita_vax___ne = comorbidita_vax___ne;
    }

    public Boolean getComorbidita_vax___null() {
        return comorbidita_vax___null;
    }
    public void setComorbidita_vax___null(Boolean comorbidita_vax___null) {
        this.comorbidita_vax___null = comorbidita_vax___null;
    }

    public Boolean getComorbidita_vax___not___null() {
        return comorbidita_vax___not___null;
    }
    public void setComorbidita_vax___not___null(Boolean comorbidita_vax___not___null) {
        this.comorbidita_vax___not___null = comorbidita_vax___not___null;
    }

    public String getDescrizione___eq() {
        return descrizione___eq;
    }
    public void setDescrizione___eq(String descrizione___eq) {
        this.descrizione___eq = descrizione___eq;
    }

    public String getDescrizione___ne() {
        return descrizione___ne;
    }
    public void setDescrizione___ne(String descrizione___ne) {
        this.descrizione___ne = descrizione___ne;
    }

    public Boolean getDescrizione___null() {
        return descrizione___null;
    }
    public void setDescrizione___null(Boolean descrizione___null) {
        this.descrizione___null = descrizione___null;
    }

    public Boolean getDescrizione___not___null() {
        return descrizione___not___null;
    }
    public void setDescrizione___not___null(Boolean descrizione___not___null) {
        this.descrizione___not___null = descrizione___not___null;
    }

    public java.util.List<String> getDescrizione___in() {
        return descrizione___in;
    }
    public void setDescrizione___in(java.util.List<String> descrizione___in) {
        this.descrizione___in = descrizione___in;
    }

    public java.util.List<String> getDescrizione___not___in() {
        return descrizione___not___in;
    }
    public void setDescrizione___not___in(java.util.List<String> descrizione___not___in) {
        this.descrizione___not___in = descrizione___not___in;
    }

    public String getDescrizione___lt() {
        return descrizione___lt;
    }
    public void setDescrizione___lt(String descrizione___lt) {
        this.descrizione___lt = descrizione___lt;
    }

    public String getDescrizione___lte() {
        return descrizione___lte;
    }
    public void setDescrizione___lte(String descrizione___lte) {
        this.descrizione___lte = descrizione___lte;
    }

    public String getDescrizione___gt() {
        return descrizione___gt;
    }
    public void setDescrizione___gt(String descrizione___gt) {
        this.descrizione___gt = descrizione___gt;
    }

    public String getDescrizione___gte() {
        return descrizione___gte;
    }
    public void setDescrizione___gte(String descrizione___gte) {
        this.descrizione___gte = descrizione___gte;
    }

    public String getDescrizione___contains() {
        return descrizione___contains;
    }
    public void setDescrizione___contains(String descrizione___contains) {
        this.descrizione___contains = descrizione___contains;
    }

    public String getDescrizione___not___contains() {
        return descrizione___not___contains;
    }
    public void setDescrizione___not___contains(String descrizione___not___contains) {
        this.descrizione___not___contains = descrizione___not___contains;
    }

    public String getDescrizione___starts_with() {
        return descrizione___starts_with;
    }
    public void setDescrizione___starts_with(String descrizione___starts_with) {
        this.descrizione___starts_with = descrizione___starts_with;
    }

    public String getDescrizione___not___starts_with() {
        return descrizione___not___starts_with;
    }
    public void setDescrizione___not___starts_with(String descrizione___not___starts_with) {
        this.descrizione___not___starts_with = descrizione___not___starts_with;
    }

    public String getDescrizione___ends_with() {
        return descrizione___ends_with;
    }
    public void setDescrizione___ends_with(String descrizione___ends_with) {
        this.descrizione___ends_with = descrizione___ends_with;
    }

    public String getDescrizione___not___ends_with() {
        return descrizione___not___ends_with;
    }
    public void setDescrizione___not___ends_with(String descrizione___not___ends_with) {
        this.descrizione___not___ends_with = descrizione___not___ends_with;
    }

    public Boolean getDocumentazione___eq() {
        return documentazione___eq;
    }
    public void setDocumentazione___eq(Boolean documentazione___eq) {
        this.documentazione___eq = documentazione___eq;
    }

    public Boolean getDocumentazione___ne() {
        return documentazione___ne;
    }
    public void setDocumentazione___ne(Boolean documentazione___ne) {
        this.documentazione___ne = documentazione___ne;
    }

    public Boolean getDocumentazione___null() {
        return documentazione___null;
    }
    public void setDocumentazione___null(Boolean documentazione___null) {
        this.documentazione___null = documentazione___null;
    }

    public Boolean getDocumentazione___not___null() {
        return documentazione___not___null;
    }
    public void setDocumentazione___not___null(Boolean documentazione___not___null) {
        this.documentazione___not___null = documentazione___not___null;
    }

    public Boolean getEvento_covid___eq() {
        return evento_covid___eq;
    }
    public void setEvento_covid___eq(Boolean evento_covid___eq) {
        this.evento_covid___eq = evento_covid___eq;
    }

    public Boolean getEvento_covid___ne() {
        return evento_covid___ne;
    }
    public void setEvento_covid___ne(Boolean evento_covid___ne) {
        this.evento_covid___ne = evento_covid___ne;
    }

    public Boolean getEvento_covid___null() {
        return evento_covid___null;
    }
    public void setEvento_covid___null(Boolean evento_covid___null) {
        this.evento_covid___null = evento_covid___null;
    }

    public Boolean getEvento_covid___not___null() {
        return evento_covid___not___null;
    }
    public void setEvento_covid___not___null(Boolean evento_covid___not___null) {
        this.evento_covid___not___null = evento_covid___not___null;
    }

    public Boolean getEvento_vaccino_covid___eq() {
        return evento_vaccino_covid___eq;
    }
    public void setEvento_vaccino_covid___eq(Boolean evento_vaccino_covid___eq) {
        this.evento_vaccino_covid___eq = evento_vaccino_covid___eq;
    }

    public Boolean getEvento_vaccino_covid___ne() {
        return evento_vaccino_covid___ne;
    }
    public void setEvento_vaccino_covid___ne(Boolean evento_vaccino_covid___ne) {
        this.evento_vaccino_covid___ne = evento_vaccino_covid___ne;
    }

    public Boolean getEvento_vaccino_covid___null() {
        return evento_vaccino_covid___null;
    }
    public void setEvento_vaccino_covid___null(Boolean evento_vaccino_covid___null) {
        this.evento_vaccino_covid___null = evento_vaccino_covid___null;
    }

    public Boolean getEvento_vaccino_covid___not___null() {
        return evento_vaccino_covid___not___null;
    }
    public void setEvento_vaccino_covid___not___null(Boolean evento_vaccino_covid___not___null) {
        this.evento_vaccino_covid___not___null = evento_vaccino_covid___not___null;
    }

    public String getGruppo___eq() {
        return gruppo___eq;
    }
    public void setGruppo___eq(String gruppo___eq) {
        this.gruppo___eq = gruppo___eq;
    }

    public String getGruppo___ne() {
        return gruppo___ne;
    }
    public void setGruppo___ne(String gruppo___ne) {
        this.gruppo___ne = gruppo___ne;
    }

    public Boolean getGruppo___null() {
        return gruppo___null;
    }
    public void setGruppo___null(Boolean gruppo___null) {
        this.gruppo___null = gruppo___null;
    }

    public Boolean getGruppo___not___null() {
        return gruppo___not___null;
    }
    public void setGruppo___not___null(Boolean gruppo___not___null) {
        this.gruppo___not___null = gruppo___not___null;
    }

    public java.util.List<String> getGruppo___in() {
        return gruppo___in;
    }
    public void setGruppo___in(java.util.List<String> gruppo___in) {
        this.gruppo___in = gruppo___in;
    }

    public java.util.List<String> getGruppo___not___in() {
        return gruppo___not___in;
    }
    public void setGruppo___not___in(java.util.List<String> gruppo___not___in) {
        this.gruppo___not___in = gruppo___not___in;
    }

    public String getGruppo___lt() {
        return gruppo___lt;
    }
    public void setGruppo___lt(String gruppo___lt) {
        this.gruppo___lt = gruppo___lt;
    }

    public String getGruppo___lte() {
        return gruppo___lte;
    }
    public void setGruppo___lte(String gruppo___lte) {
        this.gruppo___lte = gruppo___lte;
    }

    public String getGruppo___gt() {
        return gruppo___gt;
    }
    public void setGruppo___gt(String gruppo___gt) {
        this.gruppo___gt = gruppo___gt;
    }

    public String getGruppo___gte() {
        return gruppo___gte;
    }
    public void setGruppo___gte(String gruppo___gte) {
        this.gruppo___gte = gruppo___gte;
    }

    public String getGruppo___contains() {
        return gruppo___contains;
    }
    public void setGruppo___contains(String gruppo___contains) {
        this.gruppo___contains = gruppo___contains;
    }

    public String getGruppo___not___contains() {
        return gruppo___not___contains;
    }
    public void setGruppo___not___contains(String gruppo___not___contains) {
        this.gruppo___not___contains = gruppo___not___contains;
    }

    public String getGruppo___starts_with() {
        return gruppo___starts_with;
    }
    public void setGruppo___starts_with(String gruppo___starts_with) {
        this.gruppo___starts_with = gruppo___starts_with;
    }

    public String getGruppo___not___starts_with() {
        return gruppo___not___starts_with;
    }
    public void setGruppo___not___starts_with(String gruppo___not___starts_with) {
        this.gruppo___not___starts_with = gruppo___not___starts_with;
    }

    public String getGruppo___ends_with() {
        return gruppo___ends_with;
    }
    public void setGruppo___ends_with(String gruppo___ends_with) {
        this.gruppo___ends_with = gruppo___ends_with;
    }

    public String getGruppo___not___ends_with() {
        return gruppo___not___ends_with;
    }
    public void setGruppo___not___ends_with(String gruppo___not___ends_with) {
        this.gruppo___not___ends_with = gruppo___not___ends_with;
    }

    public String getLabel_epatiche___eq() {
        return label_epatiche___eq;
    }
    public void setLabel_epatiche___eq(String label_epatiche___eq) {
        this.label_epatiche___eq = label_epatiche___eq;
    }

    public String getLabel_epatiche___ne() {
        return label_epatiche___ne;
    }
    public void setLabel_epatiche___ne(String label_epatiche___ne) {
        this.label_epatiche___ne = label_epatiche___ne;
    }

    public Boolean getLabel_epatiche___null() {
        return label_epatiche___null;
    }
    public void setLabel_epatiche___null(Boolean label_epatiche___null) {
        this.label_epatiche___null = label_epatiche___null;
    }

    public Boolean getLabel_epatiche___not___null() {
        return label_epatiche___not___null;
    }
    public void setLabel_epatiche___not___null(Boolean label_epatiche___not___null) {
        this.label_epatiche___not___null = label_epatiche___not___null;
    }

    public java.util.List<String> getLabel_epatiche___in() {
        return label_epatiche___in;
    }
    public void setLabel_epatiche___in(java.util.List<String> label_epatiche___in) {
        this.label_epatiche___in = label_epatiche___in;
    }

    public java.util.List<String> getLabel_epatiche___not___in() {
        return label_epatiche___not___in;
    }
    public void setLabel_epatiche___not___in(java.util.List<String> label_epatiche___not___in) {
        this.label_epatiche___not___in = label_epatiche___not___in;
    }

    public String getLabel_epatiche___lt() {
        return label_epatiche___lt;
    }
    public void setLabel_epatiche___lt(String label_epatiche___lt) {
        this.label_epatiche___lt = label_epatiche___lt;
    }

    public String getLabel_epatiche___lte() {
        return label_epatiche___lte;
    }
    public void setLabel_epatiche___lte(String label_epatiche___lte) {
        this.label_epatiche___lte = label_epatiche___lte;
    }

    public String getLabel_epatiche___gt() {
        return label_epatiche___gt;
    }
    public void setLabel_epatiche___gt(String label_epatiche___gt) {
        this.label_epatiche___gt = label_epatiche___gt;
    }

    public String getLabel_epatiche___gte() {
        return label_epatiche___gte;
    }
    public void setLabel_epatiche___gte(String label_epatiche___gte) {
        this.label_epatiche___gte = label_epatiche___gte;
    }

    public String getLabel_epatiche___contains() {
        return label_epatiche___contains;
    }
    public void setLabel_epatiche___contains(String label_epatiche___contains) {
        this.label_epatiche___contains = label_epatiche___contains;
    }

    public String getLabel_epatiche___not___contains() {
        return label_epatiche___not___contains;
    }
    public void setLabel_epatiche___not___contains(String label_epatiche___not___contains) {
        this.label_epatiche___not___contains = label_epatiche___not___contains;
    }

    public String getLabel_epatiche___starts_with() {
        return label_epatiche___starts_with;
    }
    public void setLabel_epatiche___starts_with(String label_epatiche___starts_with) {
        this.label_epatiche___starts_with = label_epatiche___starts_with;
    }

    public String getLabel_epatiche___not___starts_with() {
        return label_epatiche___not___starts_with;
    }
    public void setLabel_epatiche___not___starts_with(String label_epatiche___not___starts_with) {
        this.label_epatiche___not___starts_with = label_epatiche___not___starts_with;
    }

    public String getLabel_epatiche___ends_with() {
        return label_epatiche___ends_with;
    }
    public void setLabel_epatiche___ends_with(String label_epatiche___ends_with) {
        this.label_epatiche___ends_with = label_epatiche___ends_with;
    }

    public String getLabel_epatiche___not___ends_with() {
        return label_epatiche___not___ends_with;
    }
    public void setLabel_epatiche___not___ends_with(String label_epatiche___not___ends_with) {
        this.label_epatiche___not___ends_with = label_epatiche___not___ends_with;
    }

    public Boolean getMostra_specifica_tumori___eq() {
        return mostra_specifica_tumori___eq;
    }
    public void setMostra_specifica_tumori___eq(Boolean mostra_specifica_tumori___eq) {
        this.mostra_specifica_tumori___eq = mostra_specifica_tumori___eq;
    }

    public Boolean getMostra_specifica_tumori___ne() {
        return mostra_specifica_tumori___ne;
    }
    public void setMostra_specifica_tumori___ne(Boolean mostra_specifica_tumori___ne) {
        this.mostra_specifica_tumori___ne = mostra_specifica_tumori___ne;
    }

    public Boolean getMostra_specifica_tumori___null() {
        return mostra_specifica_tumori___null;
    }
    public void setMostra_specifica_tumori___null(Boolean mostra_specifica_tumori___null) {
        this.mostra_specifica_tumori___null = mostra_specifica_tumori___null;
    }

    public Boolean getMostra_specifica_tumori___not___null() {
        return mostra_specifica_tumori___not___null;
    }
    public void setMostra_specifica_tumori___not___null(Boolean mostra_specifica_tumori___not___null) {
        this.mostra_specifica_tumori___not___null = mostra_specifica_tumori___not___null;
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

    public Boolean getPride___eq() {
        return pride___eq;
    }
    public void setPride___eq(Boolean pride___eq) {
        this.pride___eq = pride___eq;
    }

    public Boolean getPride___ne() {
        return pride___ne;
    }
    public void setPride___ne(Boolean pride___ne) {
        this.pride___ne = pride___ne;
    }

    public Boolean getPride___null() {
        return pride___null;
    }
    public void setPride___null(Boolean pride___null) {
        this.pride___null = pride___null;
    }

    public Boolean getPride___not___null() {
        return pride___not___null;
    }
    public void setPride___not___null(Boolean pride___not___null) {
        this.pride___not___null = pride___not___null;
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

    public Boolean getSolo_F___eq() {
        return solo_F___eq;
    }
    public void setSolo_F___eq(Boolean solo_F___eq) {
        this.solo_F___eq = solo_F___eq;
    }

    public Boolean getSolo_F___ne() {
        return solo_F___ne;
    }
    public void setSolo_F___ne(Boolean solo_F___ne) {
        this.solo_F___ne = solo_F___ne;
    }

    public Boolean getSolo_F___null() {
        return solo_F___null;
    }
    public void setSolo_F___null(Boolean solo_F___null) {
        this.solo_F___null = solo_F___null;
    }

    public Boolean getSolo_F___not___null() {
        return solo_F___not___null;
    }
    public void setSolo_F___not___null(Boolean solo_F___not___null) {
        this.solo_F___not___null = solo_F___not___null;
    }

    public Boolean getSolo_M___eq() {
        return solo_M___eq;
    }
    public void setSolo_M___eq(Boolean solo_M___eq) {
        this.solo_M___eq = solo_M___eq;
    }

    public Boolean getSolo_M___ne() {
        return solo_M___ne;
    }
    public void setSolo_M___ne(Boolean solo_M___ne) {
        this.solo_M___ne = solo_M___ne;
    }

    public Boolean getSolo_M___null() {
        return solo_M___null;
    }
    public void setSolo_M___null(Boolean solo_M___null) {
        this.solo_M___null = solo_M___null;
    }

    public Boolean getSolo_M___not___null() {
        return solo_M___not___null;
    }
    public void setSolo_M___not___null(Boolean solo_M___not___null) {
        this.solo_M___not___null = solo_M___not___null;
    }

    public String getSottogruppo___eq() {
        return sottogruppo___eq;
    }
    public void setSottogruppo___eq(String sottogruppo___eq) {
        this.sottogruppo___eq = sottogruppo___eq;
    }

    public String getSottogruppo___ne() {
        return sottogruppo___ne;
    }
    public void setSottogruppo___ne(String sottogruppo___ne) {
        this.sottogruppo___ne = sottogruppo___ne;
    }

    public Boolean getSottogruppo___null() {
        return sottogruppo___null;
    }
    public void setSottogruppo___null(Boolean sottogruppo___null) {
        this.sottogruppo___null = sottogruppo___null;
    }

    public Boolean getSottogruppo___not___null() {
        return sottogruppo___not___null;
    }
    public void setSottogruppo___not___null(Boolean sottogruppo___not___null) {
        this.sottogruppo___not___null = sottogruppo___not___null;
    }

    public java.util.List<String> getSottogruppo___in() {
        return sottogruppo___in;
    }
    public void setSottogruppo___in(java.util.List<String> sottogruppo___in) {
        this.sottogruppo___in = sottogruppo___in;
    }

    public java.util.List<String> getSottogruppo___not___in() {
        return sottogruppo___not___in;
    }
    public void setSottogruppo___not___in(java.util.List<String> sottogruppo___not___in) {
        this.sottogruppo___not___in = sottogruppo___not___in;
    }

    public String getSottogruppo___lt() {
        return sottogruppo___lt;
    }
    public void setSottogruppo___lt(String sottogruppo___lt) {
        this.sottogruppo___lt = sottogruppo___lt;
    }

    public String getSottogruppo___lte() {
        return sottogruppo___lte;
    }
    public void setSottogruppo___lte(String sottogruppo___lte) {
        this.sottogruppo___lte = sottogruppo___lte;
    }

    public String getSottogruppo___gt() {
        return sottogruppo___gt;
    }
    public void setSottogruppo___gt(String sottogruppo___gt) {
        this.sottogruppo___gt = sottogruppo___gt;
    }

    public String getSottogruppo___gte() {
        return sottogruppo___gte;
    }
    public void setSottogruppo___gte(String sottogruppo___gte) {
        this.sottogruppo___gte = sottogruppo___gte;
    }

    public String getSottogruppo___contains() {
        return sottogruppo___contains;
    }
    public void setSottogruppo___contains(String sottogruppo___contains) {
        this.sottogruppo___contains = sottogruppo___contains;
    }

    public String getSottogruppo___not___contains() {
        return sottogruppo___not___contains;
    }
    public void setSottogruppo___not___contains(String sottogruppo___not___contains) {
        this.sottogruppo___not___contains = sottogruppo___not___contains;
    }

    public String getSottogruppo___starts_with() {
        return sottogruppo___starts_with;
    }
    public void setSottogruppo___starts_with(String sottogruppo___starts_with) {
        this.sottogruppo___starts_with = sottogruppo___starts_with;
    }

    public String getSottogruppo___not___starts_with() {
        return sottogruppo___not___starts_with;
    }
    public void setSottogruppo___not___starts_with(String sottogruppo___not___starts_with) {
        this.sottogruppo___not___starts_with = sottogruppo___not___starts_with;
    }

    public String getSottogruppo___ends_with() {
        return sottogruppo___ends_with;
    }
    public void setSottogruppo___ends_with(String sottogruppo___ends_with) {
        this.sottogruppo___ends_with = sottogruppo___ends_with;
    }

    public String getSottogruppo___not___ends_with() {
        return sottogruppo___not___ends_with;
    }
    public void setSottogruppo___not___ends_with(String sottogruppo___not___ends_with) {
        this.sottogruppo___not___ends_with = sottogruppo___not___ends_with;
    }

    public Integer getTipo___eq() {
        return tipo___eq;
    }
    public void setTipo___eq(Integer tipo___eq) {
        this.tipo___eq = tipo___eq;
    }

    public Integer getTipo___ne() {
        return tipo___ne;
    }
    public void setTipo___ne(Integer tipo___ne) {
        this.tipo___ne = tipo___ne;
    }

    public Boolean getTipo___null() {
        return tipo___null;
    }
    public void setTipo___null(Boolean tipo___null) {
        this.tipo___null = tipo___null;
    }

    public Boolean getTipo___not___null() {
        return tipo___not___null;
    }
    public void setTipo___not___null(Boolean tipo___not___null) {
        this.tipo___not___null = tipo___not___null;
    }

    public java.util.List<Integer> getTipo___in() {
        return tipo___in;
    }
    public void setTipo___in(java.util.List<Integer> tipo___in) {
        this.tipo___in = tipo___in;
    }

    public java.util.List<Integer> getTipo___not___in() {
        return tipo___not___in;
    }
    public void setTipo___not___in(java.util.List<Integer> tipo___not___in) {
        this.tipo___not___in = tipo___not___in;
    }

    public Integer getTipo___lt() {
        return tipo___lt;
    }
    public void setTipo___lt(Integer tipo___lt) {
        this.tipo___lt = tipo___lt;
    }

    public Integer getTipo___lte() {
        return tipo___lte;
    }
    public void setTipo___lte(Integer tipo___lte) {
        this.tipo___lte = tipo___lte;
    }

    public Integer getTipo___gt() {
        return tipo___gt;
    }
    public void setTipo___gt(Integer tipo___gt) {
        this.tipo___gt = tipo___gt;
    }

    public Integer getTipo___gte() {
        return tipo___gte;
    }
    public void setTipo___gte(Integer tipo___gte) {
        this.tipo___gte = tipo___gte;
    }

    public Boolean getVisibile___eq() {
        return visibile___eq;
    }
    public void setVisibile___eq(Boolean visibile___eq) {
        this.visibile___eq = visibile___eq;
    }

    public Boolean getVisibile___ne() {
        return visibile___ne;
    }
    public void setVisibile___ne(Boolean visibile___ne) {
        this.visibile___ne = visibile___ne;
    }

    public Boolean getVisibile___null() {
        return visibile___null;
    }
    public void setVisibile___null(Boolean visibile___null) {
        this.visibile___null = visibile___null;
    }

    public Boolean getVisibile___not___null() {
        return visibile___not___null;
    }
    public void setVisibile___not___null(Boolean visibile___not___null) {
        this.visibile___not___null = visibile___not___null;
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

    public java.util.List<CliPatologiaFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliPatologiaFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliPatologiaFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliPatologiaFilterDTO> OR) {
        this.OR = OR;
    }

    public CliPatologiaFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliPatologiaFilterDTO NOT) {
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
        if (cdc___eq != null) {
            joiner.add("cdc___eq: " + GraphQLRequestSerializer.getEntry(cdc___eq));
        }
        if (cdc___ne != null) {
            joiner.add("cdc___ne: " + GraphQLRequestSerializer.getEntry(cdc___ne));
        }
        if (cdc___null != null) {
            joiner.add("cdc___null: " + GraphQLRequestSerializer.getEntry(cdc___null));
        }
        if (cdc___not___null != null) {
            joiner.add("cdc___not___null: " + GraphQLRequestSerializer.getEntry(cdc___not___null));
        }
        if (cdc___in != null) {
            joiner.add("cdc___in: " + GraphQLRequestSerializer.getEntry(cdc___in));
        }
        if (cdc___not___in != null) {
            joiner.add("cdc___not___in: " + GraphQLRequestSerializer.getEntry(cdc___not___in));
        }
        if (cdc___lt != null) {
            joiner.add("cdc___lt: " + GraphQLRequestSerializer.getEntry(cdc___lt));
        }
        if (cdc___lte != null) {
            joiner.add("cdc___lte: " + GraphQLRequestSerializer.getEntry(cdc___lte));
        }
        if (cdc___gt != null) {
            joiner.add("cdc___gt: " + GraphQLRequestSerializer.getEntry(cdc___gt));
        }
        if (cdc___gte != null) {
            joiner.add("cdc___gte: " + GraphQLRequestSerializer.getEntry(cdc___gte));
        }
        if (codice_dad___eq != null) {
            joiner.add("codice_dad___eq: " + GraphQLRequestSerializer.getEntry(codice_dad___eq));
        }
        if (codice_dad___ne != null) {
            joiner.add("codice_dad___ne: " + GraphQLRequestSerializer.getEntry(codice_dad___ne));
        }
        if (codice_dad___null != null) {
            joiner.add("codice_dad___null: " + GraphQLRequestSerializer.getEntry(codice_dad___null));
        }
        if (codice_dad___not___null != null) {
            joiner.add("codice_dad___not___null: " + GraphQLRequestSerializer.getEntry(codice_dad___not___null));
        }
        if (codice_dad___in != null) {
            joiner.add("codice_dad___in: " + GraphQLRequestSerializer.getEntry(codice_dad___in));
        }
        if (codice_dad___not___in != null) {
            joiner.add("codice_dad___not___in: " + GraphQLRequestSerializer.getEntry(codice_dad___not___in));
        }
        if (codice_dad___lt != null) {
            joiner.add("codice_dad___lt: " + GraphQLRequestSerializer.getEntry(codice_dad___lt));
        }
        if (codice_dad___lte != null) {
            joiner.add("codice_dad___lte: " + GraphQLRequestSerializer.getEntry(codice_dad___lte));
        }
        if (codice_dad___gt != null) {
            joiner.add("codice_dad___gt: " + GraphQLRequestSerializer.getEntry(codice_dad___gt));
        }
        if (codice_dad___gte != null) {
            joiner.add("codice_dad___gte: " + GraphQLRequestSerializer.getEntry(codice_dad___gte));
        }
        if (codice_dad___contains != null) {
            joiner.add("codice_dad___contains: " + GraphQLRequestSerializer.getEntry(codice_dad___contains));
        }
        if (codice_dad___not___contains != null) {
            joiner.add("codice_dad___not___contains: " + GraphQLRequestSerializer.getEntry(codice_dad___not___contains));
        }
        if (codice_dad___starts_with != null) {
            joiner.add("codice_dad___starts_with: " + GraphQLRequestSerializer.getEntry(codice_dad___starts_with));
        }
        if (codice_dad___not___starts_with != null) {
            joiner.add("codice_dad___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_dad___not___starts_with));
        }
        if (codice_dad___ends_with != null) {
            joiner.add("codice_dad___ends_with: " + GraphQLRequestSerializer.getEntry(codice_dad___ends_with));
        }
        if (codice_dad___not___ends_with != null) {
            joiner.add("codice_dad___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_dad___not___ends_with));
        }
        if (codice_hicdep___eq != null) {
            joiner.add("codice_hicdep___eq: " + GraphQLRequestSerializer.getEntry(codice_hicdep___eq));
        }
        if (codice_hicdep___ne != null) {
            joiner.add("codice_hicdep___ne: " + GraphQLRequestSerializer.getEntry(codice_hicdep___ne));
        }
        if (codice_hicdep___null != null) {
            joiner.add("codice_hicdep___null: " + GraphQLRequestSerializer.getEntry(codice_hicdep___null));
        }
        if (codice_hicdep___not___null != null) {
            joiner.add("codice_hicdep___not___null: " + GraphQLRequestSerializer.getEntry(codice_hicdep___not___null));
        }
        if (codice_hicdep___in != null) {
            joiner.add("codice_hicdep___in: " + GraphQLRequestSerializer.getEntry(codice_hicdep___in));
        }
        if (codice_hicdep___not___in != null) {
            joiner.add("codice_hicdep___not___in: " + GraphQLRequestSerializer.getEntry(codice_hicdep___not___in));
        }
        if (codice_hicdep___lt != null) {
            joiner.add("codice_hicdep___lt: " + GraphQLRequestSerializer.getEntry(codice_hicdep___lt));
        }
        if (codice_hicdep___lte != null) {
            joiner.add("codice_hicdep___lte: " + GraphQLRequestSerializer.getEntry(codice_hicdep___lte));
        }
        if (codice_hicdep___gt != null) {
            joiner.add("codice_hicdep___gt: " + GraphQLRequestSerializer.getEntry(codice_hicdep___gt));
        }
        if (codice_hicdep___gte != null) {
            joiner.add("codice_hicdep___gte: " + GraphQLRequestSerializer.getEntry(codice_hicdep___gte));
        }
        if (codice_hicdep___contains != null) {
            joiner.add("codice_hicdep___contains: " + GraphQLRequestSerializer.getEntry(codice_hicdep___contains));
        }
        if (codice_hicdep___not___contains != null) {
            joiner.add("codice_hicdep___not___contains: " + GraphQLRequestSerializer.getEntry(codice_hicdep___not___contains));
        }
        if (codice_hicdep___starts_with != null) {
            joiner.add("codice_hicdep___starts_with: " + GraphQLRequestSerializer.getEntry(codice_hicdep___starts_with));
        }
        if (codice_hicdep___not___starts_with != null) {
            joiner.add("codice_hicdep___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_hicdep___not___starts_with));
        }
        if (codice_hicdep___ends_with != null) {
            joiner.add("codice_hicdep___ends_with: " + GraphQLRequestSerializer.getEntry(codice_hicdep___ends_with));
        }
        if (codice_hicdep___not___ends_with != null) {
            joiner.add("codice_hicdep___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_hicdep___not___ends_with));
        }
        if (comorbidita_covid___eq != null) {
            joiner.add("comorbidita_covid___eq: " + GraphQLRequestSerializer.getEntry(comorbidita_covid___eq));
        }
        if (comorbidita_covid___ne != null) {
            joiner.add("comorbidita_covid___ne: " + GraphQLRequestSerializer.getEntry(comorbidita_covid___ne));
        }
        if (comorbidita_covid___null != null) {
            joiner.add("comorbidita_covid___null: " + GraphQLRequestSerializer.getEntry(comorbidita_covid___null));
        }
        if (comorbidita_covid___not___null != null) {
            joiner.add("comorbidita_covid___not___null: " + GraphQLRequestSerializer.getEntry(comorbidita_covid___not___null));
        }
        if (comorbidita_vax___eq != null) {
            joiner.add("comorbidita_vax___eq: " + GraphQLRequestSerializer.getEntry(comorbidita_vax___eq));
        }
        if (comorbidita_vax___ne != null) {
            joiner.add("comorbidita_vax___ne: " + GraphQLRequestSerializer.getEntry(comorbidita_vax___ne));
        }
        if (comorbidita_vax___null != null) {
            joiner.add("comorbidita_vax___null: " + GraphQLRequestSerializer.getEntry(comorbidita_vax___null));
        }
        if (comorbidita_vax___not___null != null) {
            joiner.add("comorbidita_vax___not___null: " + GraphQLRequestSerializer.getEntry(comorbidita_vax___not___null));
        }
        if (descrizione___eq != null) {
            joiner.add("descrizione___eq: " + GraphQLRequestSerializer.getEntry(descrizione___eq));
        }
        if (descrizione___ne != null) {
            joiner.add("descrizione___ne: " + GraphQLRequestSerializer.getEntry(descrizione___ne));
        }
        if (descrizione___null != null) {
            joiner.add("descrizione___null: " + GraphQLRequestSerializer.getEntry(descrizione___null));
        }
        if (descrizione___not___null != null) {
            joiner.add("descrizione___not___null: " + GraphQLRequestSerializer.getEntry(descrizione___not___null));
        }
        if (descrizione___in != null) {
            joiner.add("descrizione___in: " + GraphQLRequestSerializer.getEntry(descrizione___in));
        }
        if (descrizione___not___in != null) {
            joiner.add("descrizione___not___in: " + GraphQLRequestSerializer.getEntry(descrizione___not___in));
        }
        if (descrizione___lt != null) {
            joiner.add("descrizione___lt: " + GraphQLRequestSerializer.getEntry(descrizione___lt));
        }
        if (descrizione___lte != null) {
            joiner.add("descrizione___lte: " + GraphQLRequestSerializer.getEntry(descrizione___lte));
        }
        if (descrizione___gt != null) {
            joiner.add("descrizione___gt: " + GraphQLRequestSerializer.getEntry(descrizione___gt));
        }
        if (descrizione___gte != null) {
            joiner.add("descrizione___gte: " + GraphQLRequestSerializer.getEntry(descrizione___gte));
        }
        if (descrizione___contains != null) {
            joiner.add("descrizione___contains: " + GraphQLRequestSerializer.getEntry(descrizione___contains));
        }
        if (descrizione___not___contains != null) {
            joiner.add("descrizione___not___contains: " + GraphQLRequestSerializer.getEntry(descrizione___not___contains));
        }
        if (descrizione___starts_with != null) {
            joiner.add("descrizione___starts_with: " + GraphQLRequestSerializer.getEntry(descrizione___starts_with));
        }
        if (descrizione___not___starts_with != null) {
            joiner.add("descrizione___not___starts_with: " + GraphQLRequestSerializer.getEntry(descrizione___not___starts_with));
        }
        if (descrizione___ends_with != null) {
            joiner.add("descrizione___ends_with: " + GraphQLRequestSerializer.getEntry(descrizione___ends_with));
        }
        if (descrizione___not___ends_with != null) {
            joiner.add("descrizione___not___ends_with: " + GraphQLRequestSerializer.getEntry(descrizione___not___ends_with));
        }
        if (documentazione___eq != null) {
            joiner.add("documentazione___eq: " + GraphQLRequestSerializer.getEntry(documentazione___eq));
        }
        if (documentazione___ne != null) {
            joiner.add("documentazione___ne: " + GraphQLRequestSerializer.getEntry(documentazione___ne));
        }
        if (documentazione___null != null) {
            joiner.add("documentazione___null: " + GraphQLRequestSerializer.getEntry(documentazione___null));
        }
        if (documentazione___not___null != null) {
            joiner.add("documentazione___not___null: " + GraphQLRequestSerializer.getEntry(documentazione___not___null));
        }
        if (evento_covid___eq != null) {
            joiner.add("evento_covid___eq: " + GraphQLRequestSerializer.getEntry(evento_covid___eq));
        }
        if (evento_covid___ne != null) {
            joiner.add("evento_covid___ne: " + GraphQLRequestSerializer.getEntry(evento_covid___ne));
        }
        if (evento_covid___null != null) {
            joiner.add("evento_covid___null: " + GraphQLRequestSerializer.getEntry(evento_covid___null));
        }
        if (evento_covid___not___null != null) {
            joiner.add("evento_covid___not___null: " + GraphQLRequestSerializer.getEntry(evento_covid___not___null));
        }
        if (evento_vaccino_covid___eq != null) {
            joiner.add("evento_vaccino_covid___eq: " + GraphQLRequestSerializer.getEntry(evento_vaccino_covid___eq));
        }
        if (evento_vaccino_covid___ne != null) {
            joiner.add("evento_vaccino_covid___ne: " + GraphQLRequestSerializer.getEntry(evento_vaccino_covid___ne));
        }
        if (evento_vaccino_covid___null != null) {
            joiner.add("evento_vaccino_covid___null: " + GraphQLRequestSerializer.getEntry(evento_vaccino_covid___null));
        }
        if (evento_vaccino_covid___not___null != null) {
            joiner.add("evento_vaccino_covid___not___null: " + GraphQLRequestSerializer.getEntry(evento_vaccino_covid___not___null));
        }
        if (gruppo___eq != null) {
            joiner.add("gruppo___eq: " + GraphQLRequestSerializer.getEntry(gruppo___eq));
        }
        if (gruppo___ne != null) {
            joiner.add("gruppo___ne: " + GraphQLRequestSerializer.getEntry(gruppo___ne));
        }
        if (gruppo___null != null) {
            joiner.add("gruppo___null: " + GraphQLRequestSerializer.getEntry(gruppo___null));
        }
        if (gruppo___not___null != null) {
            joiner.add("gruppo___not___null: " + GraphQLRequestSerializer.getEntry(gruppo___not___null));
        }
        if (gruppo___in != null) {
            joiner.add("gruppo___in: " + GraphQLRequestSerializer.getEntry(gruppo___in));
        }
        if (gruppo___not___in != null) {
            joiner.add("gruppo___not___in: " + GraphQLRequestSerializer.getEntry(gruppo___not___in));
        }
        if (gruppo___lt != null) {
            joiner.add("gruppo___lt: " + GraphQLRequestSerializer.getEntry(gruppo___lt));
        }
        if (gruppo___lte != null) {
            joiner.add("gruppo___lte: " + GraphQLRequestSerializer.getEntry(gruppo___lte));
        }
        if (gruppo___gt != null) {
            joiner.add("gruppo___gt: " + GraphQLRequestSerializer.getEntry(gruppo___gt));
        }
        if (gruppo___gte != null) {
            joiner.add("gruppo___gte: " + GraphQLRequestSerializer.getEntry(gruppo___gte));
        }
        if (gruppo___contains != null) {
            joiner.add("gruppo___contains: " + GraphQLRequestSerializer.getEntry(gruppo___contains));
        }
        if (gruppo___not___contains != null) {
            joiner.add("gruppo___not___contains: " + GraphQLRequestSerializer.getEntry(gruppo___not___contains));
        }
        if (gruppo___starts_with != null) {
            joiner.add("gruppo___starts_with: " + GraphQLRequestSerializer.getEntry(gruppo___starts_with));
        }
        if (gruppo___not___starts_with != null) {
            joiner.add("gruppo___not___starts_with: " + GraphQLRequestSerializer.getEntry(gruppo___not___starts_with));
        }
        if (gruppo___ends_with != null) {
            joiner.add("gruppo___ends_with: " + GraphQLRequestSerializer.getEntry(gruppo___ends_with));
        }
        if (gruppo___not___ends_with != null) {
            joiner.add("gruppo___not___ends_with: " + GraphQLRequestSerializer.getEntry(gruppo___not___ends_with));
        }
        if (label_epatiche___eq != null) {
            joiner.add("label_epatiche___eq: " + GraphQLRequestSerializer.getEntry(label_epatiche___eq));
        }
        if (label_epatiche___ne != null) {
            joiner.add("label_epatiche___ne: " + GraphQLRequestSerializer.getEntry(label_epatiche___ne));
        }
        if (label_epatiche___null != null) {
            joiner.add("label_epatiche___null: " + GraphQLRequestSerializer.getEntry(label_epatiche___null));
        }
        if (label_epatiche___not___null != null) {
            joiner.add("label_epatiche___not___null: " + GraphQLRequestSerializer.getEntry(label_epatiche___not___null));
        }
        if (label_epatiche___in != null) {
            joiner.add("label_epatiche___in: " + GraphQLRequestSerializer.getEntry(label_epatiche___in));
        }
        if (label_epatiche___not___in != null) {
            joiner.add("label_epatiche___not___in: " + GraphQLRequestSerializer.getEntry(label_epatiche___not___in));
        }
        if (label_epatiche___lt != null) {
            joiner.add("label_epatiche___lt: " + GraphQLRequestSerializer.getEntry(label_epatiche___lt));
        }
        if (label_epatiche___lte != null) {
            joiner.add("label_epatiche___lte: " + GraphQLRequestSerializer.getEntry(label_epatiche___lte));
        }
        if (label_epatiche___gt != null) {
            joiner.add("label_epatiche___gt: " + GraphQLRequestSerializer.getEntry(label_epatiche___gt));
        }
        if (label_epatiche___gte != null) {
            joiner.add("label_epatiche___gte: " + GraphQLRequestSerializer.getEntry(label_epatiche___gte));
        }
        if (label_epatiche___contains != null) {
            joiner.add("label_epatiche___contains: " + GraphQLRequestSerializer.getEntry(label_epatiche___contains));
        }
        if (label_epatiche___not___contains != null) {
            joiner.add("label_epatiche___not___contains: " + GraphQLRequestSerializer.getEntry(label_epatiche___not___contains));
        }
        if (label_epatiche___starts_with != null) {
            joiner.add("label_epatiche___starts_with: " + GraphQLRequestSerializer.getEntry(label_epatiche___starts_with));
        }
        if (label_epatiche___not___starts_with != null) {
            joiner.add("label_epatiche___not___starts_with: " + GraphQLRequestSerializer.getEntry(label_epatiche___not___starts_with));
        }
        if (label_epatiche___ends_with != null) {
            joiner.add("label_epatiche___ends_with: " + GraphQLRequestSerializer.getEntry(label_epatiche___ends_with));
        }
        if (label_epatiche___not___ends_with != null) {
            joiner.add("label_epatiche___not___ends_with: " + GraphQLRequestSerializer.getEntry(label_epatiche___not___ends_with));
        }
        if (mostra_specifica_tumori___eq != null) {
            joiner.add("mostra_specifica_tumori___eq: " + GraphQLRequestSerializer.getEntry(mostra_specifica_tumori___eq));
        }
        if (mostra_specifica_tumori___ne != null) {
            joiner.add("mostra_specifica_tumori___ne: " + GraphQLRequestSerializer.getEntry(mostra_specifica_tumori___ne));
        }
        if (mostra_specifica_tumori___null != null) {
            joiner.add("mostra_specifica_tumori___null: " + GraphQLRequestSerializer.getEntry(mostra_specifica_tumori___null));
        }
        if (mostra_specifica_tumori___not___null != null) {
            joiner.add("mostra_specifica_tumori___not___null: " + GraphQLRequestSerializer.getEntry(mostra_specifica_tumori___not___null));
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
        if (pride___eq != null) {
            joiner.add("pride___eq: " + GraphQLRequestSerializer.getEntry(pride___eq));
        }
        if (pride___ne != null) {
            joiner.add("pride___ne: " + GraphQLRequestSerializer.getEntry(pride___ne));
        }
        if (pride___null != null) {
            joiner.add("pride___null: " + GraphQLRequestSerializer.getEntry(pride___null));
        }
        if (pride___not___null != null) {
            joiner.add("pride___not___null: " + GraphQLRequestSerializer.getEntry(pride___not___null));
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
        if (solo_F___eq != null) {
            joiner.add("solo_F___eq: " + GraphQLRequestSerializer.getEntry(solo_F___eq));
        }
        if (solo_F___ne != null) {
            joiner.add("solo_F___ne: " + GraphQLRequestSerializer.getEntry(solo_F___ne));
        }
        if (solo_F___null != null) {
            joiner.add("solo_F___null: " + GraphQLRequestSerializer.getEntry(solo_F___null));
        }
        if (solo_F___not___null != null) {
            joiner.add("solo_F___not___null: " + GraphQLRequestSerializer.getEntry(solo_F___not___null));
        }
        if (solo_M___eq != null) {
            joiner.add("solo_M___eq: " + GraphQLRequestSerializer.getEntry(solo_M___eq));
        }
        if (solo_M___ne != null) {
            joiner.add("solo_M___ne: " + GraphQLRequestSerializer.getEntry(solo_M___ne));
        }
        if (solo_M___null != null) {
            joiner.add("solo_M___null: " + GraphQLRequestSerializer.getEntry(solo_M___null));
        }
        if (solo_M___not___null != null) {
            joiner.add("solo_M___not___null: " + GraphQLRequestSerializer.getEntry(solo_M___not___null));
        }
        if (sottogruppo___eq != null) {
            joiner.add("sottogruppo___eq: " + GraphQLRequestSerializer.getEntry(sottogruppo___eq));
        }
        if (sottogruppo___ne != null) {
            joiner.add("sottogruppo___ne: " + GraphQLRequestSerializer.getEntry(sottogruppo___ne));
        }
        if (sottogruppo___null != null) {
            joiner.add("sottogruppo___null: " + GraphQLRequestSerializer.getEntry(sottogruppo___null));
        }
        if (sottogruppo___not___null != null) {
            joiner.add("sottogruppo___not___null: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___null));
        }
        if (sottogruppo___in != null) {
            joiner.add("sottogruppo___in: " + GraphQLRequestSerializer.getEntry(sottogruppo___in));
        }
        if (sottogruppo___not___in != null) {
            joiner.add("sottogruppo___not___in: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___in));
        }
        if (sottogruppo___lt != null) {
            joiner.add("sottogruppo___lt: " + GraphQLRequestSerializer.getEntry(sottogruppo___lt));
        }
        if (sottogruppo___lte != null) {
            joiner.add("sottogruppo___lte: " + GraphQLRequestSerializer.getEntry(sottogruppo___lte));
        }
        if (sottogruppo___gt != null) {
            joiner.add("sottogruppo___gt: " + GraphQLRequestSerializer.getEntry(sottogruppo___gt));
        }
        if (sottogruppo___gte != null) {
            joiner.add("sottogruppo___gte: " + GraphQLRequestSerializer.getEntry(sottogruppo___gte));
        }
        if (sottogruppo___contains != null) {
            joiner.add("sottogruppo___contains: " + GraphQLRequestSerializer.getEntry(sottogruppo___contains));
        }
        if (sottogruppo___not___contains != null) {
            joiner.add("sottogruppo___not___contains: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___contains));
        }
        if (sottogruppo___starts_with != null) {
            joiner.add("sottogruppo___starts_with: " + GraphQLRequestSerializer.getEntry(sottogruppo___starts_with));
        }
        if (sottogruppo___not___starts_with != null) {
            joiner.add("sottogruppo___not___starts_with: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___starts_with));
        }
        if (sottogruppo___ends_with != null) {
            joiner.add("sottogruppo___ends_with: " + GraphQLRequestSerializer.getEntry(sottogruppo___ends_with));
        }
        if (sottogruppo___not___ends_with != null) {
            joiner.add("sottogruppo___not___ends_with: " + GraphQLRequestSerializer.getEntry(sottogruppo___not___ends_with));
        }
        if (tipo___eq != null) {
            joiner.add("tipo___eq: " + GraphQLRequestSerializer.getEntry(tipo___eq));
        }
        if (tipo___ne != null) {
            joiner.add("tipo___ne: " + GraphQLRequestSerializer.getEntry(tipo___ne));
        }
        if (tipo___null != null) {
            joiner.add("tipo___null: " + GraphQLRequestSerializer.getEntry(tipo___null));
        }
        if (tipo___not___null != null) {
            joiner.add("tipo___not___null: " + GraphQLRequestSerializer.getEntry(tipo___not___null));
        }
        if (tipo___in != null) {
            joiner.add("tipo___in: " + GraphQLRequestSerializer.getEntry(tipo___in));
        }
        if (tipo___not___in != null) {
            joiner.add("tipo___not___in: " + GraphQLRequestSerializer.getEntry(tipo___not___in));
        }
        if (tipo___lt != null) {
            joiner.add("tipo___lt: " + GraphQLRequestSerializer.getEntry(tipo___lt));
        }
        if (tipo___lte != null) {
            joiner.add("tipo___lte: " + GraphQLRequestSerializer.getEntry(tipo___lte));
        }
        if (tipo___gt != null) {
            joiner.add("tipo___gt: " + GraphQLRequestSerializer.getEntry(tipo___gt));
        }
        if (tipo___gte != null) {
            joiner.add("tipo___gte: " + GraphQLRequestSerializer.getEntry(tipo___gte));
        }
        if (visibile___eq != null) {
            joiner.add("visibile___eq: " + GraphQLRequestSerializer.getEntry(visibile___eq));
        }
        if (visibile___ne != null) {
            joiner.add("visibile___ne: " + GraphQLRequestSerializer.getEntry(visibile___ne));
        }
        if (visibile___null != null) {
            joiner.add("visibile___null: " + GraphQLRequestSerializer.getEntry(visibile___null));
        }
        if (visibile___not___null != null) {
            joiner.add("visibile___not___null: " + GraphQLRequestSerializer.getEntry(visibile___not___null));
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

    public static CliPatologiaFilterDTO.Builder builder() {
        return new CliPatologiaFilterDTO.Builder();
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
        private Integer cdc___eq;
        private Integer cdc___ne;
        private Boolean cdc___null;
        private Boolean cdc___not___null;
        private java.util.List<Integer> cdc___in;
        private java.util.List<Integer> cdc___not___in;
        private Integer cdc___lt;
        private Integer cdc___lte;
        private Integer cdc___gt;
        private Integer cdc___gte;
        private String codice_dad___eq;
        private String codice_dad___ne;
        private Boolean codice_dad___null;
        private Boolean codice_dad___not___null;
        private java.util.List<String> codice_dad___in;
        private java.util.List<String> codice_dad___not___in;
        private String codice_dad___lt;
        private String codice_dad___lte;
        private String codice_dad___gt;
        private String codice_dad___gte;
        private String codice_dad___contains;
        private String codice_dad___not___contains;
        private String codice_dad___starts_with;
        private String codice_dad___not___starts_with;
        private String codice_dad___ends_with;
        private String codice_dad___not___ends_with;
        private String codice_hicdep___eq;
        private String codice_hicdep___ne;
        private Boolean codice_hicdep___null;
        private Boolean codice_hicdep___not___null;
        private java.util.List<String> codice_hicdep___in;
        private java.util.List<String> codice_hicdep___not___in;
        private String codice_hicdep___lt;
        private String codice_hicdep___lte;
        private String codice_hicdep___gt;
        private String codice_hicdep___gte;
        private String codice_hicdep___contains;
        private String codice_hicdep___not___contains;
        private String codice_hicdep___starts_with;
        private String codice_hicdep___not___starts_with;
        private String codice_hicdep___ends_with;
        private String codice_hicdep___not___ends_with;
        private Boolean comorbidita_covid___eq;
        private Boolean comorbidita_covid___ne;
        private Boolean comorbidita_covid___null;
        private Boolean comorbidita_covid___not___null;
        private Boolean comorbidita_vax___eq;
        private Boolean comorbidita_vax___ne;
        private Boolean comorbidita_vax___null;
        private Boolean comorbidita_vax___not___null;
        private String descrizione___eq;
        private String descrizione___ne;
        private Boolean descrizione___null;
        private Boolean descrizione___not___null;
        private java.util.List<String> descrizione___in;
        private java.util.List<String> descrizione___not___in;
        private String descrizione___lt;
        private String descrizione___lte;
        private String descrizione___gt;
        private String descrizione___gte;
        private String descrizione___contains;
        private String descrizione___not___contains;
        private String descrizione___starts_with;
        private String descrizione___not___starts_with;
        private String descrizione___ends_with;
        private String descrizione___not___ends_with;
        private Boolean documentazione___eq;
        private Boolean documentazione___ne;
        private Boolean documentazione___null;
        private Boolean documentazione___not___null;
        private Boolean evento_covid___eq;
        private Boolean evento_covid___ne;
        private Boolean evento_covid___null;
        private Boolean evento_covid___not___null;
        private Boolean evento_vaccino_covid___eq;
        private Boolean evento_vaccino_covid___ne;
        private Boolean evento_vaccino_covid___null;
        private Boolean evento_vaccino_covid___not___null;
        private String gruppo___eq;
        private String gruppo___ne;
        private Boolean gruppo___null;
        private Boolean gruppo___not___null;
        private java.util.List<String> gruppo___in;
        private java.util.List<String> gruppo___not___in;
        private String gruppo___lt;
        private String gruppo___lte;
        private String gruppo___gt;
        private String gruppo___gte;
        private String gruppo___contains;
        private String gruppo___not___contains;
        private String gruppo___starts_with;
        private String gruppo___not___starts_with;
        private String gruppo___ends_with;
        private String gruppo___not___ends_with;
        private String label_epatiche___eq;
        private String label_epatiche___ne;
        private Boolean label_epatiche___null;
        private Boolean label_epatiche___not___null;
        private java.util.List<String> label_epatiche___in;
        private java.util.List<String> label_epatiche___not___in;
        private String label_epatiche___lt;
        private String label_epatiche___lte;
        private String label_epatiche___gt;
        private String label_epatiche___gte;
        private String label_epatiche___contains;
        private String label_epatiche___not___contains;
        private String label_epatiche___starts_with;
        private String label_epatiche___not___starts_with;
        private String label_epatiche___ends_with;
        private String label_epatiche___not___ends_with;
        private Boolean mostra_specifica_tumori___eq;
        private Boolean mostra_specifica_tumori___ne;
        private Boolean mostra_specifica_tumori___null;
        private Boolean mostra_specifica_tumori___not___null;
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
        private Boolean pride___eq;
        private Boolean pride___ne;
        private Boolean pride___null;
        private Boolean pride___not___null;
        private Boolean ricovero___eq;
        private Boolean ricovero___ne;
        private Boolean ricovero___null;
        private Boolean ricovero___not___null;
        private Boolean solo_F___eq;
        private Boolean solo_F___ne;
        private Boolean solo_F___null;
        private Boolean solo_F___not___null;
        private Boolean solo_M___eq;
        private Boolean solo_M___ne;
        private Boolean solo_M___null;
        private Boolean solo_M___not___null;
        private String sottogruppo___eq;
        private String sottogruppo___ne;
        private Boolean sottogruppo___null;
        private Boolean sottogruppo___not___null;
        private java.util.List<String> sottogruppo___in;
        private java.util.List<String> sottogruppo___not___in;
        private String sottogruppo___lt;
        private String sottogruppo___lte;
        private String sottogruppo___gt;
        private String sottogruppo___gte;
        private String sottogruppo___contains;
        private String sottogruppo___not___contains;
        private String sottogruppo___starts_with;
        private String sottogruppo___not___starts_with;
        private String sottogruppo___ends_with;
        private String sottogruppo___not___ends_with;
        private Integer tipo___eq;
        private Integer tipo___ne;
        private Boolean tipo___null;
        private Boolean tipo___not___null;
        private java.util.List<Integer> tipo___in;
        private java.util.List<Integer> tipo___not___in;
        private Integer tipo___lt;
        private Integer tipo___lte;
        private Integer tipo___gt;
        private Integer tipo___gte;
        private Boolean visibile___eq;
        private Boolean visibile___ne;
        private Boolean visibile___null;
        private Boolean visibile___not___null;
        private Boolean warning_respond___eq;
        private Boolean warning_respond___ne;
        private Boolean warning_respond___null;
        private Boolean warning_respond___not___null;
        private java.util.List<CliPatologiaFilterDTO> AND;
        private java.util.List<CliPatologiaFilterDTO> OR;
        private CliPatologiaFilterDTO NOT;

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

        public Builder setCdc___eq(Integer cdc___eq) {
            this.cdc___eq = cdc___eq;
            return this;
        }

        public Builder setCdc___ne(Integer cdc___ne) {
            this.cdc___ne = cdc___ne;
            return this;
        }

        public Builder setCdc___null(Boolean cdc___null) {
            this.cdc___null = cdc___null;
            return this;
        }

        public Builder setCdc___not___null(Boolean cdc___not___null) {
            this.cdc___not___null = cdc___not___null;
            return this;
        }

        public Builder setCdc___in(java.util.List<Integer> cdc___in) {
            this.cdc___in = cdc___in;
            return this;
        }

        public Builder setCdc___not___in(java.util.List<Integer> cdc___not___in) {
            this.cdc___not___in = cdc___not___in;
            return this;
        }

        public Builder setCdc___lt(Integer cdc___lt) {
            this.cdc___lt = cdc___lt;
            return this;
        }

        public Builder setCdc___lte(Integer cdc___lte) {
            this.cdc___lte = cdc___lte;
            return this;
        }

        public Builder setCdc___gt(Integer cdc___gt) {
            this.cdc___gt = cdc___gt;
            return this;
        }

        public Builder setCdc___gte(Integer cdc___gte) {
            this.cdc___gte = cdc___gte;
            return this;
        }

        public Builder setCodice_dad___eq(String codice_dad___eq) {
            this.codice_dad___eq = codice_dad___eq;
            return this;
        }

        public Builder setCodice_dad___ne(String codice_dad___ne) {
            this.codice_dad___ne = codice_dad___ne;
            return this;
        }

        public Builder setCodice_dad___null(Boolean codice_dad___null) {
            this.codice_dad___null = codice_dad___null;
            return this;
        }

        public Builder setCodice_dad___not___null(Boolean codice_dad___not___null) {
            this.codice_dad___not___null = codice_dad___not___null;
            return this;
        }

        public Builder setCodice_dad___in(java.util.List<String> codice_dad___in) {
            this.codice_dad___in = codice_dad___in;
            return this;
        }

        public Builder setCodice_dad___not___in(java.util.List<String> codice_dad___not___in) {
            this.codice_dad___not___in = codice_dad___not___in;
            return this;
        }

        public Builder setCodice_dad___lt(String codice_dad___lt) {
            this.codice_dad___lt = codice_dad___lt;
            return this;
        }

        public Builder setCodice_dad___lte(String codice_dad___lte) {
            this.codice_dad___lte = codice_dad___lte;
            return this;
        }

        public Builder setCodice_dad___gt(String codice_dad___gt) {
            this.codice_dad___gt = codice_dad___gt;
            return this;
        }

        public Builder setCodice_dad___gte(String codice_dad___gte) {
            this.codice_dad___gte = codice_dad___gte;
            return this;
        }

        public Builder setCodice_dad___contains(String codice_dad___contains) {
            this.codice_dad___contains = codice_dad___contains;
            return this;
        }

        public Builder setCodice_dad___not___contains(String codice_dad___not___contains) {
            this.codice_dad___not___contains = codice_dad___not___contains;
            return this;
        }

        public Builder setCodice_dad___starts_with(String codice_dad___starts_with) {
            this.codice_dad___starts_with = codice_dad___starts_with;
            return this;
        }

        public Builder setCodice_dad___not___starts_with(String codice_dad___not___starts_with) {
            this.codice_dad___not___starts_with = codice_dad___not___starts_with;
            return this;
        }

        public Builder setCodice_dad___ends_with(String codice_dad___ends_with) {
            this.codice_dad___ends_with = codice_dad___ends_with;
            return this;
        }

        public Builder setCodice_dad___not___ends_with(String codice_dad___not___ends_with) {
            this.codice_dad___not___ends_with = codice_dad___not___ends_with;
            return this;
        }

        public Builder setCodice_hicdep___eq(String codice_hicdep___eq) {
            this.codice_hicdep___eq = codice_hicdep___eq;
            return this;
        }

        public Builder setCodice_hicdep___ne(String codice_hicdep___ne) {
            this.codice_hicdep___ne = codice_hicdep___ne;
            return this;
        }

        public Builder setCodice_hicdep___null(Boolean codice_hicdep___null) {
            this.codice_hicdep___null = codice_hicdep___null;
            return this;
        }

        public Builder setCodice_hicdep___not___null(Boolean codice_hicdep___not___null) {
            this.codice_hicdep___not___null = codice_hicdep___not___null;
            return this;
        }

        public Builder setCodice_hicdep___in(java.util.List<String> codice_hicdep___in) {
            this.codice_hicdep___in = codice_hicdep___in;
            return this;
        }

        public Builder setCodice_hicdep___not___in(java.util.List<String> codice_hicdep___not___in) {
            this.codice_hicdep___not___in = codice_hicdep___not___in;
            return this;
        }

        public Builder setCodice_hicdep___lt(String codice_hicdep___lt) {
            this.codice_hicdep___lt = codice_hicdep___lt;
            return this;
        }

        public Builder setCodice_hicdep___lte(String codice_hicdep___lte) {
            this.codice_hicdep___lte = codice_hicdep___lte;
            return this;
        }

        public Builder setCodice_hicdep___gt(String codice_hicdep___gt) {
            this.codice_hicdep___gt = codice_hicdep___gt;
            return this;
        }

        public Builder setCodice_hicdep___gte(String codice_hicdep___gte) {
            this.codice_hicdep___gte = codice_hicdep___gte;
            return this;
        }

        public Builder setCodice_hicdep___contains(String codice_hicdep___contains) {
            this.codice_hicdep___contains = codice_hicdep___contains;
            return this;
        }

        public Builder setCodice_hicdep___not___contains(String codice_hicdep___not___contains) {
            this.codice_hicdep___not___contains = codice_hicdep___not___contains;
            return this;
        }

        public Builder setCodice_hicdep___starts_with(String codice_hicdep___starts_with) {
            this.codice_hicdep___starts_with = codice_hicdep___starts_with;
            return this;
        }

        public Builder setCodice_hicdep___not___starts_with(String codice_hicdep___not___starts_with) {
            this.codice_hicdep___not___starts_with = codice_hicdep___not___starts_with;
            return this;
        }

        public Builder setCodice_hicdep___ends_with(String codice_hicdep___ends_with) {
            this.codice_hicdep___ends_with = codice_hicdep___ends_with;
            return this;
        }

        public Builder setCodice_hicdep___not___ends_with(String codice_hicdep___not___ends_with) {
            this.codice_hicdep___not___ends_with = codice_hicdep___not___ends_with;
            return this;
        }

        public Builder setComorbidita_covid___eq(Boolean comorbidita_covid___eq) {
            this.comorbidita_covid___eq = comorbidita_covid___eq;
            return this;
        }

        public Builder setComorbidita_covid___ne(Boolean comorbidita_covid___ne) {
            this.comorbidita_covid___ne = comorbidita_covid___ne;
            return this;
        }

        public Builder setComorbidita_covid___null(Boolean comorbidita_covid___null) {
            this.comorbidita_covid___null = comorbidita_covid___null;
            return this;
        }

        public Builder setComorbidita_covid___not___null(Boolean comorbidita_covid___not___null) {
            this.comorbidita_covid___not___null = comorbidita_covid___not___null;
            return this;
        }

        public Builder setComorbidita_vax___eq(Boolean comorbidita_vax___eq) {
            this.comorbidita_vax___eq = comorbidita_vax___eq;
            return this;
        }

        public Builder setComorbidita_vax___ne(Boolean comorbidita_vax___ne) {
            this.comorbidita_vax___ne = comorbidita_vax___ne;
            return this;
        }

        public Builder setComorbidita_vax___null(Boolean comorbidita_vax___null) {
            this.comorbidita_vax___null = comorbidita_vax___null;
            return this;
        }

        public Builder setComorbidita_vax___not___null(Boolean comorbidita_vax___not___null) {
            this.comorbidita_vax___not___null = comorbidita_vax___not___null;
            return this;
        }

        public Builder setDescrizione___eq(String descrizione___eq) {
            this.descrizione___eq = descrizione___eq;
            return this;
        }

        public Builder setDescrizione___ne(String descrizione___ne) {
            this.descrizione___ne = descrizione___ne;
            return this;
        }

        public Builder setDescrizione___null(Boolean descrizione___null) {
            this.descrizione___null = descrizione___null;
            return this;
        }

        public Builder setDescrizione___not___null(Boolean descrizione___not___null) {
            this.descrizione___not___null = descrizione___not___null;
            return this;
        }

        public Builder setDescrizione___in(java.util.List<String> descrizione___in) {
            this.descrizione___in = descrizione___in;
            return this;
        }

        public Builder setDescrizione___not___in(java.util.List<String> descrizione___not___in) {
            this.descrizione___not___in = descrizione___not___in;
            return this;
        }

        public Builder setDescrizione___lt(String descrizione___lt) {
            this.descrizione___lt = descrizione___lt;
            return this;
        }

        public Builder setDescrizione___lte(String descrizione___lte) {
            this.descrizione___lte = descrizione___lte;
            return this;
        }

        public Builder setDescrizione___gt(String descrizione___gt) {
            this.descrizione___gt = descrizione___gt;
            return this;
        }

        public Builder setDescrizione___gte(String descrizione___gte) {
            this.descrizione___gte = descrizione___gte;
            return this;
        }

        public Builder setDescrizione___contains(String descrizione___contains) {
            this.descrizione___contains = descrizione___contains;
            return this;
        }

        public Builder setDescrizione___not___contains(String descrizione___not___contains) {
            this.descrizione___not___contains = descrizione___not___contains;
            return this;
        }

        public Builder setDescrizione___starts_with(String descrizione___starts_with) {
            this.descrizione___starts_with = descrizione___starts_with;
            return this;
        }

        public Builder setDescrizione___not___starts_with(String descrizione___not___starts_with) {
            this.descrizione___not___starts_with = descrizione___not___starts_with;
            return this;
        }

        public Builder setDescrizione___ends_with(String descrizione___ends_with) {
            this.descrizione___ends_with = descrizione___ends_with;
            return this;
        }

        public Builder setDescrizione___not___ends_with(String descrizione___not___ends_with) {
            this.descrizione___not___ends_with = descrizione___not___ends_with;
            return this;
        }

        public Builder setDocumentazione___eq(Boolean documentazione___eq) {
            this.documentazione___eq = documentazione___eq;
            return this;
        }

        public Builder setDocumentazione___ne(Boolean documentazione___ne) {
            this.documentazione___ne = documentazione___ne;
            return this;
        }

        public Builder setDocumentazione___null(Boolean documentazione___null) {
            this.documentazione___null = documentazione___null;
            return this;
        }

        public Builder setDocumentazione___not___null(Boolean documentazione___not___null) {
            this.documentazione___not___null = documentazione___not___null;
            return this;
        }

        public Builder setEvento_covid___eq(Boolean evento_covid___eq) {
            this.evento_covid___eq = evento_covid___eq;
            return this;
        }

        public Builder setEvento_covid___ne(Boolean evento_covid___ne) {
            this.evento_covid___ne = evento_covid___ne;
            return this;
        }

        public Builder setEvento_covid___null(Boolean evento_covid___null) {
            this.evento_covid___null = evento_covid___null;
            return this;
        }

        public Builder setEvento_covid___not___null(Boolean evento_covid___not___null) {
            this.evento_covid___not___null = evento_covid___not___null;
            return this;
        }

        public Builder setEvento_vaccino_covid___eq(Boolean evento_vaccino_covid___eq) {
            this.evento_vaccino_covid___eq = evento_vaccino_covid___eq;
            return this;
        }

        public Builder setEvento_vaccino_covid___ne(Boolean evento_vaccino_covid___ne) {
            this.evento_vaccino_covid___ne = evento_vaccino_covid___ne;
            return this;
        }

        public Builder setEvento_vaccino_covid___null(Boolean evento_vaccino_covid___null) {
            this.evento_vaccino_covid___null = evento_vaccino_covid___null;
            return this;
        }

        public Builder setEvento_vaccino_covid___not___null(Boolean evento_vaccino_covid___not___null) {
            this.evento_vaccino_covid___not___null = evento_vaccino_covid___not___null;
            return this;
        }

        public Builder setGruppo___eq(String gruppo___eq) {
            this.gruppo___eq = gruppo___eq;
            return this;
        }

        public Builder setGruppo___ne(String gruppo___ne) {
            this.gruppo___ne = gruppo___ne;
            return this;
        }

        public Builder setGruppo___null(Boolean gruppo___null) {
            this.gruppo___null = gruppo___null;
            return this;
        }

        public Builder setGruppo___not___null(Boolean gruppo___not___null) {
            this.gruppo___not___null = gruppo___not___null;
            return this;
        }

        public Builder setGruppo___in(java.util.List<String> gruppo___in) {
            this.gruppo___in = gruppo___in;
            return this;
        }

        public Builder setGruppo___not___in(java.util.List<String> gruppo___not___in) {
            this.gruppo___not___in = gruppo___not___in;
            return this;
        }

        public Builder setGruppo___lt(String gruppo___lt) {
            this.gruppo___lt = gruppo___lt;
            return this;
        }

        public Builder setGruppo___lte(String gruppo___lte) {
            this.gruppo___lte = gruppo___lte;
            return this;
        }

        public Builder setGruppo___gt(String gruppo___gt) {
            this.gruppo___gt = gruppo___gt;
            return this;
        }

        public Builder setGruppo___gte(String gruppo___gte) {
            this.gruppo___gte = gruppo___gte;
            return this;
        }

        public Builder setGruppo___contains(String gruppo___contains) {
            this.gruppo___contains = gruppo___contains;
            return this;
        }

        public Builder setGruppo___not___contains(String gruppo___not___contains) {
            this.gruppo___not___contains = gruppo___not___contains;
            return this;
        }

        public Builder setGruppo___starts_with(String gruppo___starts_with) {
            this.gruppo___starts_with = gruppo___starts_with;
            return this;
        }

        public Builder setGruppo___not___starts_with(String gruppo___not___starts_with) {
            this.gruppo___not___starts_with = gruppo___not___starts_with;
            return this;
        }

        public Builder setGruppo___ends_with(String gruppo___ends_with) {
            this.gruppo___ends_with = gruppo___ends_with;
            return this;
        }

        public Builder setGruppo___not___ends_with(String gruppo___not___ends_with) {
            this.gruppo___not___ends_with = gruppo___not___ends_with;
            return this;
        }

        public Builder setLabel_epatiche___eq(String label_epatiche___eq) {
            this.label_epatiche___eq = label_epatiche___eq;
            return this;
        }

        public Builder setLabel_epatiche___ne(String label_epatiche___ne) {
            this.label_epatiche___ne = label_epatiche___ne;
            return this;
        }

        public Builder setLabel_epatiche___null(Boolean label_epatiche___null) {
            this.label_epatiche___null = label_epatiche___null;
            return this;
        }

        public Builder setLabel_epatiche___not___null(Boolean label_epatiche___not___null) {
            this.label_epatiche___not___null = label_epatiche___not___null;
            return this;
        }

        public Builder setLabel_epatiche___in(java.util.List<String> label_epatiche___in) {
            this.label_epatiche___in = label_epatiche___in;
            return this;
        }

        public Builder setLabel_epatiche___not___in(java.util.List<String> label_epatiche___not___in) {
            this.label_epatiche___not___in = label_epatiche___not___in;
            return this;
        }

        public Builder setLabel_epatiche___lt(String label_epatiche___lt) {
            this.label_epatiche___lt = label_epatiche___lt;
            return this;
        }

        public Builder setLabel_epatiche___lte(String label_epatiche___lte) {
            this.label_epatiche___lte = label_epatiche___lte;
            return this;
        }

        public Builder setLabel_epatiche___gt(String label_epatiche___gt) {
            this.label_epatiche___gt = label_epatiche___gt;
            return this;
        }

        public Builder setLabel_epatiche___gte(String label_epatiche___gte) {
            this.label_epatiche___gte = label_epatiche___gte;
            return this;
        }

        public Builder setLabel_epatiche___contains(String label_epatiche___contains) {
            this.label_epatiche___contains = label_epatiche___contains;
            return this;
        }

        public Builder setLabel_epatiche___not___contains(String label_epatiche___not___contains) {
            this.label_epatiche___not___contains = label_epatiche___not___contains;
            return this;
        }

        public Builder setLabel_epatiche___starts_with(String label_epatiche___starts_with) {
            this.label_epatiche___starts_with = label_epatiche___starts_with;
            return this;
        }

        public Builder setLabel_epatiche___not___starts_with(String label_epatiche___not___starts_with) {
            this.label_epatiche___not___starts_with = label_epatiche___not___starts_with;
            return this;
        }

        public Builder setLabel_epatiche___ends_with(String label_epatiche___ends_with) {
            this.label_epatiche___ends_with = label_epatiche___ends_with;
            return this;
        }

        public Builder setLabel_epatiche___not___ends_with(String label_epatiche___not___ends_with) {
            this.label_epatiche___not___ends_with = label_epatiche___not___ends_with;
            return this;
        }

        public Builder setMostra_specifica_tumori___eq(Boolean mostra_specifica_tumori___eq) {
            this.mostra_specifica_tumori___eq = mostra_specifica_tumori___eq;
            return this;
        }

        public Builder setMostra_specifica_tumori___ne(Boolean mostra_specifica_tumori___ne) {
            this.mostra_specifica_tumori___ne = mostra_specifica_tumori___ne;
            return this;
        }

        public Builder setMostra_specifica_tumori___null(Boolean mostra_specifica_tumori___null) {
            this.mostra_specifica_tumori___null = mostra_specifica_tumori___null;
            return this;
        }

        public Builder setMostra_specifica_tumori___not___null(Boolean mostra_specifica_tumori___not___null) {
            this.mostra_specifica_tumori___not___null = mostra_specifica_tumori___not___null;
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

        public Builder setPride___eq(Boolean pride___eq) {
            this.pride___eq = pride___eq;
            return this;
        }

        public Builder setPride___ne(Boolean pride___ne) {
            this.pride___ne = pride___ne;
            return this;
        }

        public Builder setPride___null(Boolean pride___null) {
            this.pride___null = pride___null;
            return this;
        }

        public Builder setPride___not___null(Boolean pride___not___null) {
            this.pride___not___null = pride___not___null;
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

        public Builder setSolo_F___eq(Boolean solo_F___eq) {
            this.solo_F___eq = solo_F___eq;
            return this;
        }

        public Builder setSolo_F___ne(Boolean solo_F___ne) {
            this.solo_F___ne = solo_F___ne;
            return this;
        }

        public Builder setSolo_F___null(Boolean solo_F___null) {
            this.solo_F___null = solo_F___null;
            return this;
        }

        public Builder setSolo_F___not___null(Boolean solo_F___not___null) {
            this.solo_F___not___null = solo_F___not___null;
            return this;
        }

        public Builder setSolo_M___eq(Boolean solo_M___eq) {
            this.solo_M___eq = solo_M___eq;
            return this;
        }

        public Builder setSolo_M___ne(Boolean solo_M___ne) {
            this.solo_M___ne = solo_M___ne;
            return this;
        }

        public Builder setSolo_M___null(Boolean solo_M___null) {
            this.solo_M___null = solo_M___null;
            return this;
        }

        public Builder setSolo_M___not___null(Boolean solo_M___not___null) {
            this.solo_M___not___null = solo_M___not___null;
            return this;
        }

        public Builder setSottogruppo___eq(String sottogruppo___eq) {
            this.sottogruppo___eq = sottogruppo___eq;
            return this;
        }

        public Builder setSottogruppo___ne(String sottogruppo___ne) {
            this.sottogruppo___ne = sottogruppo___ne;
            return this;
        }

        public Builder setSottogruppo___null(Boolean sottogruppo___null) {
            this.sottogruppo___null = sottogruppo___null;
            return this;
        }

        public Builder setSottogruppo___not___null(Boolean sottogruppo___not___null) {
            this.sottogruppo___not___null = sottogruppo___not___null;
            return this;
        }

        public Builder setSottogruppo___in(java.util.List<String> sottogruppo___in) {
            this.sottogruppo___in = sottogruppo___in;
            return this;
        }

        public Builder setSottogruppo___not___in(java.util.List<String> sottogruppo___not___in) {
            this.sottogruppo___not___in = sottogruppo___not___in;
            return this;
        }

        public Builder setSottogruppo___lt(String sottogruppo___lt) {
            this.sottogruppo___lt = sottogruppo___lt;
            return this;
        }

        public Builder setSottogruppo___lte(String sottogruppo___lte) {
            this.sottogruppo___lte = sottogruppo___lte;
            return this;
        }

        public Builder setSottogruppo___gt(String sottogruppo___gt) {
            this.sottogruppo___gt = sottogruppo___gt;
            return this;
        }

        public Builder setSottogruppo___gte(String sottogruppo___gte) {
            this.sottogruppo___gte = sottogruppo___gte;
            return this;
        }

        public Builder setSottogruppo___contains(String sottogruppo___contains) {
            this.sottogruppo___contains = sottogruppo___contains;
            return this;
        }

        public Builder setSottogruppo___not___contains(String sottogruppo___not___contains) {
            this.sottogruppo___not___contains = sottogruppo___not___contains;
            return this;
        }

        public Builder setSottogruppo___starts_with(String sottogruppo___starts_with) {
            this.sottogruppo___starts_with = sottogruppo___starts_with;
            return this;
        }

        public Builder setSottogruppo___not___starts_with(String sottogruppo___not___starts_with) {
            this.sottogruppo___not___starts_with = sottogruppo___not___starts_with;
            return this;
        }

        public Builder setSottogruppo___ends_with(String sottogruppo___ends_with) {
            this.sottogruppo___ends_with = sottogruppo___ends_with;
            return this;
        }

        public Builder setSottogruppo___not___ends_with(String sottogruppo___not___ends_with) {
            this.sottogruppo___not___ends_with = sottogruppo___not___ends_with;
            return this;
        }

        public Builder setTipo___eq(Integer tipo___eq) {
            this.tipo___eq = tipo___eq;
            return this;
        }

        public Builder setTipo___ne(Integer tipo___ne) {
            this.tipo___ne = tipo___ne;
            return this;
        }

        public Builder setTipo___null(Boolean tipo___null) {
            this.tipo___null = tipo___null;
            return this;
        }

        public Builder setTipo___not___null(Boolean tipo___not___null) {
            this.tipo___not___null = tipo___not___null;
            return this;
        }

        public Builder setTipo___in(java.util.List<Integer> tipo___in) {
            this.tipo___in = tipo___in;
            return this;
        }

        public Builder setTipo___not___in(java.util.List<Integer> tipo___not___in) {
            this.tipo___not___in = tipo___not___in;
            return this;
        }

        public Builder setTipo___lt(Integer tipo___lt) {
            this.tipo___lt = tipo___lt;
            return this;
        }

        public Builder setTipo___lte(Integer tipo___lte) {
            this.tipo___lte = tipo___lte;
            return this;
        }

        public Builder setTipo___gt(Integer tipo___gt) {
            this.tipo___gt = tipo___gt;
            return this;
        }

        public Builder setTipo___gte(Integer tipo___gte) {
            this.tipo___gte = tipo___gte;
            return this;
        }

        public Builder setVisibile___eq(Boolean visibile___eq) {
            this.visibile___eq = visibile___eq;
            return this;
        }

        public Builder setVisibile___ne(Boolean visibile___ne) {
            this.visibile___ne = visibile___ne;
            return this;
        }

        public Builder setVisibile___null(Boolean visibile___null) {
            this.visibile___null = visibile___null;
            return this;
        }

        public Builder setVisibile___not___null(Boolean visibile___not___null) {
            this.visibile___not___null = visibile___not___null;
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

        public Builder setAND(java.util.List<CliPatologiaFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliPatologiaFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliPatologiaFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliPatologiaFilterDTO build() {
            CliPatologiaFilterDTO result = new CliPatologiaFilterDTO();
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
            result.setCdc___eq(this.cdc___eq);
            result.setCdc___ne(this.cdc___ne);
            result.setCdc___null(this.cdc___null);
            result.setCdc___not___null(this.cdc___not___null);
            result.setCdc___in(this.cdc___in);
            result.setCdc___not___in(this.cdc___not___in);
            result.setCdc___lt(this.cdc___lt);
            result.setCdc___lte(this.cdc___lte);
            result.setCdc___gt(this.cdc___gt);
            result.setCdc___gte(this.cdc___gte);
            result.setCodice_dad___eq(this.codice_dad___eq);
            result.setCodice_dad___ne(this.codice_dad___ne);
            result.setCodice_dad___null(this.codice_dad___null);
            result.setCodice_dad___not___null(this.codice_dad___not___null);
            result.setCodice_dad___in(this.codice_dad___in);
            result.setCodice_dad___not___in(this.codice_dad___not___in);
            result.setCodice_dad___lt(this.codice_dad___lt);
            result.setCodice_dad___lte(this.codice_dad___lte);
            result.setCodice_dad___gt(this.codice_dad___gt);
            result.setCodice_dad___gte(this.codice_dad___gte);
            result.setCodice_dad___contains(this.codice_dad___contains);
            result.setCodice_dad___not___contains(this.codice_dad___not___contains);
            result.setCodice_dad___starts_with(this.codice_dad___starts_with);
            result.setCodice_dad___not___starts_with(this.codice_dad___not___starts_with);
            result.setCodice_dad___ends_with(this.codice_dad___ends_with);
            result.setCodice_dad___not___ends_with(this.codice_dad___not___ends_with);
            result.setCodice_hicdep___eq(this.codice_hicdep___eq);
            result.setCodice_hicdep___ne(this.codice_hicdep___ne);
            result.setCodice_hicdep___null(this.codice_hicdep___null);
            result.setCodice_hicdep___not___null(this.codice_hicdep___not___null);
            result.setCodice_hicdep___in(this.codice_hicdep___in);
            result.setCodice_hicdep___not___in(this.codice_hicdep___not___in);
            result.setCodice_hicdep___lt(this.codice_hicdep___lt);
            result.setCodice_hicdep___lte(this.codice_hicdep___lte);
            result.setCodice_hicdep___gt(this.codice_hicdep___gt);
            result.setCodice_hicdep___gte(this.codice_hicdep___gte);
            result.setCodice_hicdep___contains(this.codice_hicdep___contains);
            result.setCodice_hicdep___not___contains(this.codice_hicdep___not___contains);
            result.setCodice_hicdep___starts_with(this.codice_hicdep___starts_with);
            result.setCodice_hicdep___not___starts_with(this.codice_hicdep___not___starts_with);
            result.setCodice_hicdep___ends_with(this.codice_hicdep___ends_with);
            result.setCodice_hicdep___not___ends_with(this.codice_hicdep___not___ends_with);
            result.setComorbidita_covid___eq(this.comorbidita_covid___eq);
            result.setComorbidita_covid___ne(this.comorbidita_covid___ne);
            result.setComorbidita_covid___null(this.comorbidita_covid___null);
            result.setComorbidita_covid___not___null(this.comorbidita_covid___not___null);
            result.setComorbidita_vax___eq(this.comorbidita_vax___eq);
            result.setComorbidita_vax___ne(this.comorbidita_vax___ne);
            result.setComorbidita_vax___null(this.comorbidita_vax___null);
            result.setComorbidita_vax___not___null(this.comorbidita_vax___not___null);
            result.setDescrizione___eq(this.descrizione___eq);
            result.setDescrizione___ne(this.descrizione___ne);
            result.setDescrizione___null(this.descrizione___null);
            result.setDescrizione___not___null(this.descrizione___not___null);
            result.setDescrizione___in(this.descrizione___in);
            result.setDescrizione___not___in(this.descrizione___not___in);
            result.setDescrizione___lt(this.descrizione___lt);
            result.setDescrizione___lte(this.descrizione___lte);
            result.setDescrizione___gt(this.descrizione___gt);
            result.setDescrizione___gte(this.descrizione___gte);
            result.setDescrizione___contains(this.descrizione___contains);
            result.setDescrizione___not___contains(this.descrizione___not___contains);
            result.setDescrizione___starts_with(this.descrizione___starts_with);
            result.setDescrizione___not___starts_with(this.descrizione___not___starts_with);
            result.setDescrizione___ends_with(this.descrizione___ends_with);
            result.setDescrizione___not___ends_with(this.descrizione___not___ends_with);
            result.setDocumentazione___eq(this.documentazione___eq);
            result.setDocumentazione___ne(this.documentazione___ne);
            result.setDocumentazione___null(this.documentazione___null);
            result.setDocumentazione___not___null(this.documentazione___not___null);
            result.setEvento_covid___eq(this.evento_covid___eq);
            result.setEvento_covid___ne(this.evento_covid___ne);
            result.setEvento_covid___null(this.evento_covid___null);
            result.setEvento_covid___not___null(this.evento_covid___not___null);
            result.setEvento_vaccino_covid___eq(this.evento_vaccino_covid___eq);
            result.setEvento_vaccino_covid___ne(this.evento_vaccino_covid___ne);
            result.setEvento_vaccino_covid___null(this.evento_vaccino_covid___null);
            result.setEvento_vaccino_covid___not___null(this.evento_vaccino_covid___not___null);
            result.setGruppo___eq(this.gruppo___eq);
            result.setGruppo___ne(this.gruppo___ne);
            result.setGruppo___null(this.gruppo___null);
            result.setGruppo___not___null(this.gruppo___not___null);
            result.setGruppo___in(this.gruppo___in);
            result.setGruppo___not___in(this.gruppo___not___in);
            result.setGruppo___lt(this.gruppo___lt);
            result.setGruppo___lte(this.gruppo___lte);
            result.setGruppo___gt(this.gruppo___gt);
            result.setGruppo___gte(this.gruppo___gte);
            result.setGruppo___contains(this.gruppo___contains);
            result.setGruppo___not___contains(this.gruppo___not___contains);
            result.setGruppo___starts_with(this.gruppo___starts_with);
            result.setGruppo___not___starts_with(this.gruppo___not___starts_with);
            result.setGruppo___ends_with(this.gruppo___ends_with);
            result.setGruppo___not___ends_with(this.gruppo___not___ends_with);
            result.setLabel_epatiche___eq(this.label_epatiche___eq);
            result.setLabel_epatiche___ne(this.label_epatiche___ne);
            result.setLabel_epatiche___null(this.label_epatiche___null);
            result.setLabel_epatiche___not___null(this.label_epatiche___not___null);
            result.setLabel_epatiche___in(this.label_epatiche___in);
            result.setLabel_epatiche___not___in(this.label_epatiche___not___in);
            result.setLabel_epatiche___lt(this.label_epatiche___lt);
            result.setLabel_epatiche___lte(this.label_epatiche___lte);
            result.setLabel_epatiche___gt(this.label_epatiche___gt);
            result.setLabel_epatiche___gte(this.label_epatiche___gte);
            result.setLabel_epatiche___contains(this.label_epatiche___contains);
            result.setLabel_epatiche___not___contains(this.label_epatiche___not___contains);
            result.setLabel_epatiche___starts_with(this.label_epatiche___starts_with);
            result.setLabel_epatiche___not___starts_with(this.label_epatiche___not___starts_with);
            result.setLabel_epatiche___ends_with(this.label_epatiche___ends_with);
            result.setLabel_epatiche___not___ends_with(this.label_epatiche___not___ends_with);
            result.setMostra_specifica_tumori___eq(this.mostra_specifica_tumori___eq);
            result.setMostra_specifica_tumori___ne(this.mostra_specifica_tumori___ne);
            result.setMostra_specifica_tumori___null(this.mostra_specifica_tumori___null);
            result.setMostra_specifica_tumori___not___null(this.mostra_specifica_tumori___not___null);
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
            result.setPride___eq(this.pride___eq);
            result.setPride___ne(this.pride___ne);
            result.setPride___null(this.pride___null);
            result.setPride___not___null(this.pride___not___null);
            result.setRicovero___eq(this.ricovero___eq);
            result.setRicovero___ne(this.ricovero___ne);
            result.setRicovero___null(this.ricovero___null);
            result.setRicovero___not___null(this.ricovero___not___null);
            result.setSolo_F___eq(this.solo_F___eq);
            result.setSolo_F___ne(this.solo_F___ne);
            result.setSolo_F___null(this.solo_F___null);
            result.setSolo_F___not___null(this.solo_F___not___null);
            result.setSolo_M___eq(this.solo_M___eq);
            result.setSolo_M___ne(this.solo_M___ne);
            result.setSolo_M___null(this.solo_M___null);
            result.setSolo_M___not___null(this.solo_M___not___null);
            result.setSottogruppo___eq(this.sottogruppo___eq);
            result.setSottogruppo___ne(this.sottogruppo___ne);
            result.setSottogruppo___null(this.sottogruppo___null);
            result.setSottogruppo___not___null(this.sottogruppo___not___null);
            result.setSottogruppo___in(this.sottogruppo___in);
            result.setSottogruppo___not___in(this.sottogruppo___not___in);
            result.setSottogruppo___lt(this.sottogruppo___lt);
            result.setSottogruppo___lte(this.sottogruppo___lte);
            result.setSottogruppo___gt(this.sottogruppo___gt);
            result.setSottogruppo___gte(this.sottogruppo___gte);
            result.setSottogruppo___contains(this.sottogruppo___contains);
            result.setSottogruppo___not___contains(this.sottogruppo___not___contains);
            result.setSottogruppo___starts_with(this.sottogruppo___starts_with);
            result.setSottogruppo___not___starts_with(this.sottogruppo___not___starts_with);
            result.setSottogruppo___ends_with(this.sottogruppo___ends_with);
            result.setSottogruppo___not___ends_with(this.sottogruppo___not___ends_with);
            result.setTipo___eq(this.tipo___eq);
            result.setTipo___ne(this.tipo___ne);
            result.setTipo___null(this.tipo___null);
            result.setTipo___not___null(this.tipo___not___null);
            result.setTipo___in(this.tipo___in);
            result.setTipo___not___in(this.tipo___not___in);
            result.setTipo___lt(this.tipo___lt);
            result.setTipo___lte(this.tipo___lte);
            result.setTipo___gt(this.tipo___gt);
            result.setTipo___gte(this.tipo___gte);
            result.setVisibile___eq(this.visibile___eq);
            result.setVisibile___ne(this.visibile___ne);
            result.setVisibile___null(this.visibile___null);
            result.setVisibile___not___null(this.visibile___not___null);
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
