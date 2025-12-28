package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Farmaco_altro.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliFarmaco_altroFilterDTO implements java.io.Serializable {

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
    private Boolean anche_da_solo___eq;
    private Boolean anche_da_solo___ne;
    private Boolean anche_da_solo___null;
    private Boolean anche_da_solo___not___null;
    private String codice_DAD___eq;
    private String codice_DAD___ne;
    private Boolean codice_DAD___null;
    private Boolean codice_DAD___not___null;
    private java.util.List<String> codice_DAD___in;
    private java.util.List<String> codice_DAD___not___in;
    private String codice_DAD___lt;
    private String codice_DAD___lte;
    private String codice_DAD___gt;
    private String codice_DAD___gte;
    private String codice_DAD___contains;
    private String codice_DAD___not___contains;
    private String codice_DAD___starts_with;
    private String codice_DAD___not___starts_with;
    private String codice_DAD___ends_with;
    private String codice_DAD___not___ends_with;
    private String combinazioni_accettate___eq;
    private String combinazioni_accettate___ne;
    private Boolean combinazioni_accettate___null;
    private Boolean combinazioni_accettate___not___null;
    private java.util.List<String> combinazioni_accettate___in;
    private java.util.List<String> combinazioni_accettate___not___in;
    private String combinazioni_accettate___lt;
    private String combinazioni_accettate___lte;
    private String combinazioni_accettate___gt;
    private String combinazioni_accettate___gte;
    private String combinazioni_accettate___contains;
    private String combinazioni_accettate___not___contains;
    private String combinazioni_accettate___starts_with;
    private String combinazioni_accettate___not___starts_with;
    private String combinazioni_accettate___ends_with;
    private String combinazioni_accettate___not___ends_with;
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
    private String tag___eq;
    private String tag___ne;
    private Boolean tag___null;
    private Boolean tag___not___null;
    private java.util.List<String> tag___in;
    private java.util.List<String> tag___not___in;
    private String tag___lt;
    private String tag___lte;
    private String tag___gt;
    private String tag___gte;
    private String tag___contains;
    private String tag___not___contains;
    private String tag___starts_with;
    private String tag___not___starts_with;
    private String tag___ends_with;
    private String tag___not___ends_with;
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
    private Boolean vaccino_covid___eq;
    private Boolean vaccino_covid___ne;
    private Boolean vaccino_covid___null;
    private Boolean vaccino_covid___not___null;
    private Boolean vaccino_non_covid___eq;
    private Boolean vaccino_non_covid___ne;
    private Boolean vaccino_non_covid___null;
    private Boolean vaccino_non_covid___not___null;
    private java.util.List<CliFarmaco_altroFilterDTO> AND;
    private java.util.List<CliFarmaco_altroFilterDTO> OR;
    private CliFarmaco_altroFilterDTO NOT;

    public CliFarmaco_altroFilterDTO() {
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

    public Boolean getAnche_da_solo___eq() {
        return anche_da_solo___eq;
    }
    public void setAnche_da_solo___eq(Boolean anche_da_solo___eq) {
        this.anche_da_solo___eq = anche_da_solo___eq;
    }

    public Boolean getAnche_da_solo___ne() {
        return anche_da_solo___ne;
    }
    public void setAnche_da_solo___ne(Boolean anche_da_solo___ne) {
        this.anche_da_solo___ne = anche_da_solo___ne;
    }

    public Boolean getAnche_da_solo___null() {
        return anche_da_solo___null;
    }
    public void setAnche_da_solo___null(Boolean anche_da_solo___null) {
        this.anche_da_solo___null = anche_da_solo___null;
    }

    public Boolean getAnche_da_solo___not___null() {
        return anche_da_solo___not___null;
    }
    public void setAnche_da_solo___not___null(Boolean anche_da_solo___not___null) {
        this.anche_da_solo___not___null = anche_da_solo___not___null;
    }

    public String getCodice_DAD___eq() {
        return codice_DAD___eq;
    }
    public void setCodice_DAD___eq(String codice_DAD___eq) {
        this.codice_DAD___eq = codice_DAD___eq;
    }

    public String getCodice_DAD___ne() {
        return codice_DAD___ne;
    }
    public void setCodice_DAD___ne(String codice_DAD___ne) {
        this.codice_DAD___ne = codice_DAD___ne;
    }

    public Boolean getCodice_DAD___null() {
        return codice_DAD___null;
    }
    public void setCodice_DAD___null(Boolean codice_DAD___null) {
        this.codice_DAD___null = codice_DAD___null;
    }

    public Boolean getCodice_DAD___not___null() {
        return codice_DAD___not___null;
    }
    public void setCodice_DAD___not___null(Boolean codice_DAD___not___null) {
        this.codice_DAD___not___null = codice_DAD___not___null;
    }

    public java.util.List<String> getCodice_DAD___in() {
        return codice_DAD___in;
    }
    public void setCodice_DAD___in(java.util.List<String> codice_DAD___in) {
        this.codice_DAD___in = codice_DAD___in;
    }

    public java.util.List<String> getCodice_DAD___not___in() {
        return codice_DAD___not___in;
    }
    public void setCodice_DAD___not___in(java.util.List<String> codice_DAD___not___in) {
        this.codice_DAD___not___in = codice_DAD___not___in;
    }

    public String getCodice_DAD___lt() {
        return codice_DAD___lt;
    }
    public void setCodice_DAD___lt(String codice_DAD___lt) {
        this.codice_DAD___lt = codice_DAD___lt;
    }

    public String getCodice_DAD___lte() {
        return codice_DAD___lte;
    }
    public void setCodice_DAD___lte(String codice_DAD___lte) {
        this.codice_DAD___lte = codice_DAD___lte;
    }

    public String getCodice_DAD___gt() {
        return codice_DAD___gt;
    }
    public void setCodice_DAD___gt(String codice_DAD___gt) {
        this.codice_DAD___gt = codice_DAD___gt;
    }

    public String getCodice_DAD___gte() {
        return codice_DAD___gte;
    }
    public void setCodice_DAD___gte(String codice_DAD___gte) {
        this.codice_DAD___gte = codice_DAD___gte;
    }

    public String getCodice_DAD___contains() {
        return codice_DAD___contains;
    }
    public void setCodice_DAD___contains(String codice_DAD___contains) {
        this.codice_DAD___contains = codice_DAD___contains;
    }

    public String getCodice_DAD___not___contains() {
        return codice_DAD___not___contains;
    }
    public void setCodice_DAD___not___contains(String codice_DAD___not___contains) {
        this.codice_DAD___not___contains = codice_DAD___not___contains;
    }

    public String getCodice_DAD___starts_with() {
        return codice_DAD___starts_with;
    }
    public void setCodice_DAD___starts_with(String codice_DAD___starts_with) {
        this.codice_DAD___starts_with = codice_DAD___starts_with;
    }

    public String getCodice_DAD___not___starts_with() {
        return codice_DAD___not___starts_with;
    }
    public void setCodice_DAD___not___starts_with(String codice_DAD___not___starts_with) {
        this.codice_DAD___not___starts_with = codice_DAD___not___starts_with;
    }

    public String getCodice_DAD___ends_with() {
        return codice_DAD___ends_with;
    }
    public void setCodice_DAD___ends_with(String codice_DAD___ends_with) {
        this.codice_DAD___ends_with = codice_DAD___ends_with;
    }

    public String getCodice_DAD___not___ends_with() {
        return codice_DAD___not___ends_with;
    }
    public void setCodice_DAD___not___ends_with(String codice_DAD___not___ends_with) {
        this.codice_DAD___not___ends_with = codice_DAD___not___ends_with;
    }

    public String getCombinazioni_accettate___eq() {
        return combinazioni_accettate___eq;
    }
    public void setCombinazioni_accettate___eq(String combinazioni_accettate___eq) {
        this.combinazioni_accettate___eq = combinazioni_accettate___eq;
    }

    public String getCombinazioni_accettate___ne() {
        return combinazioni_accettate___ne;
    }
    public void setCombinazioni_accettate___ne(String combinazioni_accettate___ne) {
        this.combinazioni_accettate___ne = combinazioni_accettate___ne;
    }

    public Boolean getCombinazioni_accettate___null() {
        return combinazioni_accettate___null;
    }
    public void setCombinazioni_accettate___null(Boolean combinazioni_accettate___null) {
        this.combinazioni_accettate___null = combinazioni_accettate___null;
    }

    public Boolean getCombinazioni_accettate___not___null() {
        return combinazioni_accettate___not___null;
    }
    public void setCombinazioni_accettate___not___null(Boolean combinazioni_accettate___not___null) {
        this.combinazioni_accettate___not___null = combinazioni_accettate___not___null;
    }

    public java.util.List<String> getCombinazioni_accettate___in() {
        return combinazioni_accettate___in;
    }
    public void setCombinazioni_accettate___in(java.util.List<String> combinazioni_accettate___in) {
        this.combinazioni_accettate___in = combinazioni_accettate___in;
    }

    public java.util.List<String> getCombinazioni_accettate___not___in() {
        return combinazioni_accettate___not___in;
    }
    public void setCombinazioni_accettate___not___in(java.util.List<String> combinazioni_accettate___not___in) {
        this.combinazioni_accettate___not___in = combinazioni_accettate___not___in;
    }

    public String getCombinazioni_accettate___lt() {
        return combinazioni_accettate___lt;
    }
    public void setCombinazioni_accettate___lt(String combinazioni_accettate___lt) {
        this.combinazioni_accettate___lt = combinazioni_accettate___lt;
    }

    public String getCombinazioni_accettate___lte() {
        return combinazioni_accettate___lte;
    }
    public void setCombinazioni_accettate___lte(String combinazioni_accettate___lte) {
        this.combinazioni_accettate___lte = combinazioni_accettate___lte;
    }

    public String getCombinazioni_accettate___gt() {
        return combinazioni_accettate___gt;
    }
    public void setCombinazioni_accettate___gt(String combinazioni_accettate___gt) {
        this.combinazioni_accettate___gt = combinazioni_accettate___gt;
    }

    public String getCombinazioni_accettate___gte() {
        return combinazioni_accettate___gte;
    }
    public void setCombinazioni_accettate___gte(String combinazioni_accettate___gte) {
        this.combinazioni_accettate___gte = combinazioni_accettate___gte;
    }

    public String getCombinazioni_accettate___contains() {
        return combinazioni_accettate___contains;
    }
    public void setCombinazioni_accettate___contains(String combinazioni_accettate___contains) {
        this.combinazioni_accettate___contains = combinazioni_accettate___contains;
    }

    public String getCombinazioni_accettate___not___contains() {
        return combinazioni_accettate___not___contains;
    }
    public void setCombinazioni_accettate___not___contains(String combinazioni_accettate___not___contains) {
        this.combinazioni_accettate___not___contains = combinazioni_accettate___not___contains;
    }

    public String getCombinazioni_accettate___starts_with() {
        return combinazioni_accettate___starts_with;
    }
    public void setCombinazioni_accettate___starts_with(String combinazioni_accettate___starts_with) {
        this.combinazioni_accettate___starts_with = combinazioni_accettate___starts_with;
    }

    public String getCombinazioni_accettate___not___starts_with() {
        return combinazioni_accettate___not___starts_with;
    }
    public void setCombinazioni_accettate___not___starts_with(String combinazioni_accettate___not___starts_with) {
        this.combinazioni_accettate___not___starts_with = combinazioni_accettate___not___starts_with;
    }

    public String getCombinazioni_accettate___ends_with() {
        return combinazioni_accettate___ends_with;
    }
    public void setCombinazioni_accettate___ends_with(String combinazioni_accettate___ends_with) {
        this.combinazioni_accettate___ends_with = combinazioni_accettate___ends_with;
    }

    public String getCombinazioni_accettate___not___ends_with() {
        return combinazioni_accettate___not___ends_with;
    }
    public void setCombinazioni_accettate___not___ends_with(String combinazioni_accettate___not___ends_with) {
        this.combinazioni_accettate___not___ends_with = combinazioni_accettate___not___ends_with;
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

    public String getTag___eq() {
        return tag___eq;
    }
    public void setTag___eq(String tag___eq) {
        this.tag___eq = tag___eq;
    }

    public String getTag___ne() {
        return tag___ne;
    }
    public void setTag___ne(String tag___ne) {
        this.tag___ne = tag___ne;
    }

    public Boolean getTag___null() {
        return tag___null;
    }
    public void setTag___null(Boolean tag___null) {
        this.tag___null = tag___null;
    }

    public Boolean getTag___not___null() {
        return tag___not___null;
    }
    public void setTag___not___null(Boolean tag___not___null) {
        this.tag___not___null = tag___not___null;
    }

    public java.util.List<String> getTag___in() {
        return tag___in;
    }
    public void setTag___in(java.util.List<String> tag___in) {
        this.tag___in = tag___in;
    }

    public java.util.List<String> getTag___not___in() {
        return tag___not___in;
    }
    public void setTag___not___in(java.util.List<String> tag___not___in) {
        this.tag___not___in = tag___not___in;
    }

    public String getTag___lt() {
        return tag___lt;
    }
    public void setTag___lt(String tag___lt) {
        this.tag___lt = tag___lt;
    }

    public String getTag___lte() {
        return tag___lte;
    }
    public void setTag___lte(String tag___lte) {
        this.tag___lte = tag___lte;
    }

    public String getTag___gt() {
        return tag___gt;
    }
    public void setTag___gt(String tag___gt) {
        this.tag___gt = tag___gt;
    }

    public String getTag___gte() {
        return tag___gte;
    }
    public void setTag___gte(String tag___gte) {
        this.tag___gte = tag___gte;
    }

    public String getTag___contains() {
        return tag___contains;
    }
    public void setTag___contains(String tag___contains) {
        this.tag___contains = tag___contains;
    }

    public String getTag___not___contains() {
        return tag___not___contains;
    }
    public void setTag___not___contains(String tag___not___contains) {
        this.tag___not___contains = tag___not___contains;
    }

    public String getTag___starts_with() {
        return tag___starts_with;
    }
    public void setTag___starts_with(String tag___starts_with) {
        this.tag___starts_with = tag___starts_with;
    }

    public String getTag___not___starts_with() {
        return tag___not___starts_with;
    }
    public void setTag___not___starts_with(String tag___not___starts_with) {
        this.tag___not___starts_with = tag___not___starts_with;
    }

    public String getTag___ends_with() {
        return tag___ends_with;
    }
    public void setTag___ends_with(String tag___ends_with) {
        this.tag___ends_with = tag___ends_with;
    }

    public String getTag___not___ends_with() {
        return tag___not___ends_with;
    }
    public void setTag___not___ends_with(String tag___not___ends_with) {
        this.tag___not___ends_with = tag___not___ends_with;
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

    public Boolean getVaccino_covid___eq() {
        return vaccino_covid___eq;
    }
    public void setVaccino_covid___eq(Boolean vaccino_covid___eq) {
        this.vaccino_covid___eq = vaccino_covid___eq;
    }

    public Boolean getVaccino_covid___ne() {
        return vaccino_covid___ne;
    }
    public void setVaccino_covid___ne(Boolean vaccino_covid___ne) {
        this.vaccino_covid___ne = vaccino_covid___ne;
    }

    public Boolean getVaccino_covid___null() {
        return vaccino_covid___null;
    }
    public void setVaccino_covid___null(Boolean vaccino_covid___null) {
        this.vaccino_covid___null = vaccino_covid___null;
    }

    public Boolean getVaccino_covid___not___null() {
        return vaccino_covid___not___null;
    }
    public void setVaccino_covid___not___null(Boolean vaccino_covid___not___null) {
        this.vaccino_covid___not___null = vaccino_covid___not___null;
    }

    public Boolean getVaccino_non_covid___eq() {
        return vaccino_non_covid___eq;
    }
    public void setVaccino_non_covid___eq(Boolean vaccino_non_covid___eq) {
        this.vaccino_non_covid___eq = vaccino_non_covid___eq;
    }

    public Boolean getVaccino_non_covid___ne() {
        return vaccino_non_covid___ne;
    }
    public void setVaccino_non_covid___ne(Boolean vaccino_non_covid___ne) {
        this.vaccino_non_covid___ne = vaccino_non_covid___ne;
    }

    public Boolean getVaccino_non_covid___null() {
        return vaccino_non_covid___null;
    }
    public void setVaccino_non_covid___null(Boolean vaccino_non_covid___null) {
        this.vaccino_non_covid___null = vaccino_non_covid___null;
    }

    public Boolean getVaccino_non_covid___not___null() {
        return vaccino_non_covid___not___null;
    }
    public void setVaccino_non_covid___not___null(Boolean vaccino_non_covid___not___null) {
        this.vaccino_non_covid___not___null = vaccino_non_covid___not___null;
    }

    public java.util.List<CliFarmaco_altroFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliFarmaco_altroFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliFarmaco_altroFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliFarmaco_altroFilterDTO> OR) {
        this.OR = OR;
    }

    public CliFarmaco_altroFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliFarmaco_altroFilterDTO NOT) {
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
        if (anche_da_solo___eq != null) {
            joiner.add("anche_da_solo___eq: " + GraphQLRequestSerializer.getEntry(anche_da_solo___eq));
        }
        if (anche_da_solo___ne != null) {
            joiner.add("anche_da_solo___ne: " + GraphQLRequestSerializer.getEntry(anche_da_solo___ne));
        }
        if (anche_da_solo___null != null) {
            joiner.add("anche_da_solo___null: " + GraphQLRequestSerializer.getEntry(anche_da_solo___null));
        }
        if (anche_da_solo___not___null != null) {
            joiner.add("anche_da_solo___not___null: " + GraphQLRequestSerializer.getEntry(anche_da_solo___not___null));
        }
        if (codice_DAD___eq != null) {
            joiner.add("codice_DAD___eq: " + GraphQLRequestSerializer.getEntry(codice_DAD___eq));
        }
        if (codice_DAD___ne != null) {
            joiner.add("codice_DAD___ne: " + GraphQLRequestSerializer.getEntry(codice_DAD___ne));
        }
        if (codice_DAD___null != null) {
            joiner.add("codice_DAD___null: " + GraphQLRequestSerializer.getEntry(codice_DAD___null));
        }
        if (codice_DAD___not___null != null) {
            joiner.add("codice_DAD___not___null: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___null));
        }
        if (codice_DAD___in != null) {
            joiner.add("codice_DAD___in: " + GraphQLRequestSerializer.getEntry(codice_DAD___in));
        }
        if (codice_DAD___not___in != null) {
            joiner.add("codice_DAD___not___in: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___in));
        }
        if (codice_DAD___lt != null) {
            joiner.add("codice_DAD___lt: " + GraphQLRequestSerializer.getEntry(codice_DAD___lt));
        }
        if (codice_DAD___lte != null) {
            joiner.add("codice_DAD___lte: " + GraphQLRequestSerializer.getEntry(codice_DAD___lte));
        }
        if (codice_DAD___gt != null) {
            joiner.add("codice_DAD___gt: " + GraphQLRequestSerializer.getEntry(codice_DAD___gt));
        }
        if (codice_DAD___gte != null) {
            joiner.add("codice_DAD___gte: " + GraphQLRequestSerializer.getEntry(codice_DAD___gte));
        }
        if (codice_DAD___contains != null) {
            joiner.add("codice_DAD___contains: " + GraphQLRequestSerializer.getEntry(codice_DAD___contains));
        }
        if (codice_DAD___not___contains != null) {
            joiner.add("codice_DAD___not___contains: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___contains));
        }
        if (codice_DAD___starts_with != null) {
            joiner.add("codice_DAD___starts_with: " + GraphQLRequestSerializer.getEntry(codice_DAD___starts_with));
        }
        if (codice_DAD___not___starts_with != null) {
            joiner.add("codice_DAD___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___starts_with));
        }
        if (codice_DAD___ends_with != null) {
            joiner.add("codice_DAD___ends_with: " + GraphQLRequestSerializer.getEntry(codice_DAD___ends_with));
        }
        if (codice_DAD___not___ends_with != null) {
            joiner.add("codice_DAD___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_DAD___not___ends_with));
        }
        if (combinazioni_accettate___eq != null) {
            joiner.add("combinazioni_accettate___eq: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___eq));
        }
        if (combinazioni_accettate___ne != null) {
            joiner.add("combinazioni_accettate___ne: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___ne));
        }
        if (combinazioni_accettate___null != null) {
            joiner.add("combinazioni_accettate___null: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___null));
        }
        if (combinazioni_accettate___not___null != null) {
            joiner.add("combinazioni_accettate___not___null: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___not___null));
        }
        if (combinazioni_accettate___in != null) {
            joiner.add("combinazioni_accettate___in: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___in));
        }
        if (combinazioni_accettate___not___in != null) {
            joiner.add("combinazioni_accettate___not___in: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___not___in));
        }
        if (combinazioni_accettate___lt != null) {
            joiner.add("combinazioni_accettate___lt: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___lt));
        }
        if (combinazioni_accettate___lte != null) {
            joiner.add("combinazioni_accettate___lte: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___lte));
        }
        if (combinazioni_accettate___gt != null) {
            joiner.add("combinazioni_accettate___gt: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___gt));
        }
        if (combinazioni_accettate___gte != null) {
            joiner.add("combinazioni_accettate___gte: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___gte));
        }
        if (combinazioni_accettate___contains != null) {
            joiner.add("combinazioni_accettate___contains: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___contains));
        }
        if (combinazioni_accettate___not___contains != null) {
            joiner.add("combinazioni_accettate___not___contains: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___not___contains));
        }
        if (combinazioni_accettate___starts_with != null) {
            joiner.add("combinazioni_accettate___starts_with: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___starts_with));
        }
        if (combinazioni_accettate___not___starts_with != null) {
            joiner.add("combinazioni_accettate___not___starts_with: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___not___starts_with));
        }
        if (combinazioni_accettate___ends_with != null) {
            joiner.add("combinazioni_accettate___ends_with: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___ends_with));
        }
        if (combinazioni_accettate___not___ends_with != null) {
            joiner.add("combinazioni_accettate___not___ends_with: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate___not___ends_with));
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
        if (tag___eq != null) {
            joiner.add("tag___eq: " + GraphQLRequestSerializer.getEntry(tag___eq));
        }
        if (tag___ne != null) {
            joiner.add("tag___ne: " + GraphQLRequestSerializer.getEntry(tag___ne));
        }
        if (tag___null != null) {
            joiner.add("tag___null: " + GraphQLRequestSerializer.getEntry(tag___null));
        }
        if (tag___not___null != null) {
            joiner.add("tag___not___null: " + GraphQLRequestSerializer.getEntry(tag___not___null));
        }
        if (tag___in != null) {
            joiner.add("tag___in: " + GraphQLRequestSerializer.getEntry(tag___in));
        }
        if (tag___not___in != null) {
            joiner.add("tag___not___in: " + GraphQLRequestSerializer.getEntry(tag___not___in));
        }
        if (tag___lt != null) {
            joiner.add("tag___lt: " + GraphQLRequestSerializer.getEntry(tag___lt));
        }
        if (tag___lte != null) {
            joiner.add("tag___lte: " + GraphQLRequestSerializer.getEntry(tag___lte));
        }
        if (tag___gt != null) {
            joiner.add("tag___gt: " + GraphQLRequestSerializer.getEntry(tag___gt));
        }
        if (tag___gte != null) {
            joiner.add("tag___gte: " + GraphQLRequestSerializer.getEntry(tag___gte));
        }
        if (tag___contains != null) {
            joiner.add("tag___contains: " + GraphQLRequestSerializer.getEntry(tag___contains));
        }
        if (tag___not___contains != null) {
            joiner.add("tag___not___contains: " + GraphQLRequestSerializer.getEntry(tag___not___contains));
        }
        if (tag___starts_with != null) {
            joiner.add("tag___starts_with: " + GraphQLRequestSerializer.getEntry(tag___starts_with));
        }
        if (tag___not___starts_with != null) {
            joiner.add("tag___not___starts_with: " + GraphQLRequestSerializer.getEntry(tag___not___starts_with));
        }
        if (tag___ends_with != null) {
            joiner.add("tag___ends_with: " + GraphQLRequestSerializer.getEntry(tag___ends_with));
        }
        if (tag___not___ends_with != null) {
            joiner.add("tag___not___ends_with: " + GraphQLRequestSerializer.getEntry(tag___not___ends_with));
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
        if (vaccino_covid___eq != null) {
            joiner.add("vaccino_covid___eq: " + GraphQLRequestSerializer.getEntry(vaccino_covid___eq));
        }
        if (vaccino_covid___ne != null) {
            joiner.add("vaccino_covid___ne: " + GraphQLRequestSerializer.getEntry(vaccino_covid___ne));
        }
        if (vaccino_covid___null != null) {
            joiner.add("vaccino_covid___null: " + GraphQLRequestSerializer.getEntry(vaccino_covid___null));
        }
        if (vaccino_covid___not___null != null) {
            joiner.add("vaccino_covid___not___null: " + GraphQLRequestSerializer.getEntry(vaccino_covid___not___null));
        }
        if (vaccino_non_covid___eq != null) {
            joiner.add("vaccino_non_covid___eq: " + GraphQLRequestSerializer.getEntry(vaccino_non_covid___eq));
        }
        if (vaccino_non_covid___ne != null) {
            joiner.add("vaccino_non_covid___ne: " + GraphQLRequestSerializer.getEntry(vaccino_non_covid___ne));
        }
        if (vaccino_non_covid___null != null) {
            joiner.add("vaccino_non_covid___null: " + GraphQLRequestSerializer.getEntry(vaccino_non_covid___null));
        }
        if (vaccino_non_covid___not___null != null) {
            joiner.add("vaccino_non_covid___not___null: " + GraphQLRequestSerializer.getEntry(vaccino_non_covid___not___null));
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

    public static CliFarmaco_altroFilterDTO.Builder builder() {
        return new CliFarmaco_altroFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
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
        private Boolean anche_da_solo___eq;
        private Boolean anche_da_solo___ne;
        private Boolean anche_da_solo___null;
        private Boolean anche_da_solo___not___null;
        private String codice_DAD___eq;
        private String codice_DAD___ne;
        private Boolean codice_DAD___null;
        private Boolean codice_DAD___not___null;
        private java.util.List<String> codice_DAD___in;
        private java.util.List<String> codice_DAD___not___in;
        private String codice_DAD___lt;
        private String codice_DAD___lte;
        private String codice_DAD___gt;
        private String codice_DAD___gte;
        private String codice_DAD___contains;
        private String codice_DAD___not___contains;
        private String codice_DAD___starts_with;
        private String codice_DAD___not___starts_with;
        private String codice_DAD___ends_with;
        private String codice_DAD___not___ends_with;
        private String combinazioni_accettate___eq;
        private String combinazioni_accettate___ne;
        private Boolean combinazioni_accettate___null;
        private Boolean combinazioni_accettate___not___null;
        private java.util.List<String> combinazioni_accettate___in;
        private java.util.List<String> combinazioni_accettate___not___in;
        private String combinazioni_accettate___lt;
        private String combinazioni_accettate___lte;
        private String combinazioni_accettate___gt;
        private String combinazioni_accettate___gte;
        private String combinazioni_accettate___contains;
        private String combinazioni_accettate___not___contains;
        private String combinazioni_accettate___starts_with;
        private String combinazioni_accettate___not___starts_with;
        private String combinazioni_accettate___ends_with;
        private String combinazioni_accettate___not___ends_with;
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
        private String tag___eq;
        private String tag___ne;
        private Boolean tag___null;
        private Boolean tag___not___null;
        private java.util.List<String> tag___in;
        private java.util.List<String> tag___not___in;
        private String tag___lt;
        private String tag___lte;
        private String tag___gt;
        private String tag___gte;
        private String tag___contains;
        private String tag___not___contains;
        private String tag___starts_with;
        private String tag___not___starts_with;
        private String tag___ends_with;
        private String tag___not___ends_with;
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
        private Boolean vaccino_covid___eq;
        private Boolean vaccino_covid___ne;
        private Boolean vaccino_covid___null;
        private Boolean vaccino_covid___not___null;
        private Boolean vaccino_non_covid___eq;
        private Boolean vaccino_non_covid___ne;
        private Boolean vaccino_non_covid___null;
        private Boolean vaccino_non_covid___not___null;
        private java.util.List<CliFarmaco_altroFilterDTO> AND;
        private java.util.List<CliFarmaco_altroFilterDTO> OR;
        private CliFarmaco_altroFilterDTO NOT;

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

        public Builder setAnche_da_solo___eq(Boolean anche_da_solo___eq) {
            this.anche_da_solo___eq = anche_da_solo___eq;
            return this;
        }

        public Builder setAnche_da_solo___ne(Boolean anche_da_solo___ne) {
            this.anche_da_solo___ne = anche_da_solo___ne;
            return this;
        }

        public Builder setAnche_da_solo___null(Boolean anche_da_solo___null) {
            this.anche_da_solo___null = anche_da_solo___null;
            return this;
        }

        public Builder setAnche_da_solo___not___null(Boolean anche_da_solo___not___null) {
            this.anche_da_solo___not___null = anche_da_solo___not___null;
            return this;
        }

        public Builder setCodice_DAD___eq(String codice_DAD___eq) {
            this.codice_DAD___eq = codice_DAD___eq;
            return this;
        }

        public Builder setCodice_DAD___ne(String codice_DAD___ne) {
            this.codice_DAD___ne = codice_DAD___ne;
            return this;
        }

        public Builder setCodice_DAD___null(Boolean codice_DAD___null) {
            this.codice_DAD___null = codice_DAD___null;
            return this;
        }

        public Builder setCodice_DAD___not___null(Boolean codice_DAD___not___null) {
            this.codice_DAD___not___null = codice_DAD___not___null;
            return this;
        }

        public Builder setCodice_DAD___in(java.util.List<String> codice_DAD___in) {
            this.codice_DAD___in = codice_DAD___in;
            return this;
        }

        public Builder setCodice_DAD___not___in(java.util.List<String> codice_DAD___not___in) {
            this.codice_DAD___not___in = codice_DAD___not___in;
            return this;
        }

        public Builder setCodice_DAD___lt(String codice_DAD___lt) {
            this.codice_DAD___lt = codice_DAD___lt;
            return this;
        }

        public Builder setCodice_DAD___lte(String codice_DAD___lte) {
            this.codice_DAD___lte = codice_DAD___lte;
            return this;
        }

        public Builder setCodice_DAD___gt(String codice_DAD___gt) {
            this.codice_DAD___gt = codice_DAD___gt;
            return this;
        }

        public Builder setCodice_DAD___gte(String codice_DAD___gte) {
            this.codice_DAD___gte = codice_DAD___gte;
            return this;
        }

        public Builder setCodice_DAD___contains(String codice_DAD___contains) {
            this.codice_DAD___contains = codice_DAD___contains;
            return this;
        }

        public Builder setCodice_DAD___not___contains(String codice_DAD___not___contains) {
            this.codice_DAD___not___contains = codice_DAD___not___contains;
            return this;
        }

        public Builder setCodice_DAD___starts_with(String codice_DAD___starts_with) {
            this.codice_DAD___starts_with = codice_DAD___starts_with;
            return this;
        }

        public Builder setCodice_DAD___not___starts_with(String codice_DAD___not___starts_with) {
            this.codice_DAD___not___starts_with = codice_DAD___not___starts_with;
            return this;
        }

        public Builder setCodice_DAD___ends_with(String codice_DAD___ends_with) {
            this.codice_DAD___ends_with = codice_DAD___ends_with;
            return this;
        }

        public Builder setCodice_DAD___not___ends_with(String codice_DAD___not___ends_with) {
            this.codice_DAD___not___ends_with = codice_DAD___not___ends_with;
            return this;
        }

        public Builder setCombinazioni_accettate___eq(String combinazioni_accettate___eq) {
            this.combinazioni_accettate___eq = combinazioni_accettate___eq;
            return this;
        }

        public Builder setCombinazioni_accettate___ne(String combinazioni_accettate___ne) {
            this.combinazioni_accettate___ne = combinazioni_accettate___ne;
            return this;
        }

        public Builder setCombinazioni_accettate___null(Boolean combinazioni_accettate___null) {
            this.combinazioni_accettate___null = combinazioni_accettate___null;
            return this;
        }

        public Builder setCombinazioni_accettate___not___null(Boolean combinazioni_accettate___not___null) {
            this.combinazioni_accettate___not___null = combinazioni_accettate___not___null;
            return this;
        }

        public Builder setCombinazioni_accettate___in(java.util.List<String> combinazioni_accettate___in) {
            this.combinazioni_accettate___in = combinazioni_accettate___in;
            return this;
        }

        public Builder setCombinazioni_accettate___not___in(java.util.List<String> combinazioni_accettate___not___in) {
            this.combinazioni_accettate___not___in = combinazioni_accettate___not___in;
            return this;
        }

        public Builder setCombinazioni_accettate___lt(String combinazioni_accettate___lt) {
            this.combinazioni_accettate___lt = combinazioni_accettate___lt;
            return this;
        }

        public Builder setCombinazioni_accettate___lte(String combinazioni_accettate___lte) {
            this.combinazioni_accettate___lte = combinazioni_accettate___lte;
            return this;
        }

        public Builder setCombinazioni_accettate___gt(String combinazioni_accettate___gt) {
            this.combinazioni_accettate___gt = combinazioni_accettate___gt;
            return this;
        }

        public Builder setCombinazioni_accettate___gte(String combinazioni_accettate___gte) {
            this.combinazioni_accettate___gte = combinazioni_accettate___gte;
            return this;
        }

        public Builder setCombinazioni_accettate___contains(String combinazioni_accettate___contains) {
            this.combinazioni_accettate___contains = combinazioni_accettate___contains;
            return this;
        }

        public Builder setCombinazioni_accettate___not___contains(String combinazioni_accettate___not___contains) {
            this.combinazioni_accettate___not___contains = combinazioni_accettate___not___contains;
            return this;
        }

        public Builder setCombinazioni_accettate___starts_with(String combinazioni_accettate___starts_with) {
            this.combinazioni_accettate___starts_with = combinazioni_accettate___starts_with;
            return this;
        }

        public Builder setCombinazioni_accettate___not___starts_with(String combinazioni_accettate___not___starts_with) {
            this.combinazioni_accettate___not___starts_with = combinazioni_accettate___not___starts_with;
            return this;
        }

        public Builder setCombinazioni_accettate___ends_with(String combinazioni_accettate___ends_with) {
            this.combinazioni_accettate___ends_with = combinazioni_accettate___ends_with;
            return this;
        }

        public Builder setCombinazioni_accettate___not___ends_with(String combinazioni_accettate___not___ends_with) {
            this.combinazioni_accettate___not___ends_with = combinazioni_accettate___not___ends_with;
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

        public Builder setTag___eq(String tag___eq) {
            this.tag___eq = tag___eq;
            return this;
        }

        public Builder setTag___ne(String tag___ne) {
            this.tag___ne = tag___ne;
            return this;
        }

        public Builder setTag___null(Boolean tag___null) {
            this.tag___null = tag___null;
            return this;
        }

        public Builder setTag___not___null(Boolean tag___not___null) {
            this.tag___not___null = tag___not___null;
            return this;
        }

        public Builder setTag___in(java.util.List<String> tag___in) {
            this.tag___in = tag___in;
            return this;
        }

        public Builder setTag___not___in(java.util.List<String> tag___not___in) {
            this.tag___not___in = tag___not___in;
            return this;
        }

        public Builder setTag___lt(String tag___lt) {
            this.tag___lt = tag___lt;
            return this;
        }

        public Builder setTag___lte(String tag___lte) {
            this.tag___lte = tag___lte;
            return this;
        }

        public Builder setTag___gt(String tag___gt) {
            this.tag___gt = tag___gt;
            return this;
        }

        public Builder setTag___gte(String tag___gte) {
            this.tag___gte = tag___gte;
            return this;
        }

        public Builder setTag___contains(String tag___contains) {
            this.tag___contains = tag___contains;
            return this;
        }

        public Builder setTag___not___contains(String tag___not___contains) {
            this.tag___not___contains = tag___not___contains;
            return this;
        }

        public Builder setTag___starts_with(String tag___starts_with) {
            this.tag___starts_with = tag___starts_with;
            return this;
        }

        public Builder setTag___not___starts_with(String tag___not___starts_with) {
            this.tag___not___starts_with = tag___not___starts_with;
            return this;
        }

        public Builder setTag___ends_with(String tag___ends_with) {
            this.tag___ends_with = tag___ends_with;
            return this;
        }

        public Builder setTag___not___ends_with(String tag___not___ends_with) {
            this.tag___not___ends_with = tag___not___ends_with;
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

        public Builder setVaccino_covid___eq(Boolean vaccino_covid___eq) {
            this.vaccino_covid___eq = vaccino_covid___eq;
            return this;
        }

        public Builder setVaccino_covid___ne(Boolean vaccino_covid___ne) {
            this.vaccino_covid___ne = vaccino_covid___ne;
            return this;
        }

        public Builder setVaccino_covid___null(Boolean vaccino_covid___null) {
            this.vaccino_covid___null = vaccino_covid___null;
            return this;
        }

        public Builder setVaccino_covid___not___null(Boolean vaccino_covid___not___null) {
            this.vaccino_covid___not___null = vaccino_covid___not___null;
            return this;
        }

        public Builder setVaccino_non_covid___eq(Boolean vaccino_non_covid___eq) {
            this.vaccino_non_covid___eq = vaccino_non_covid___eq;
            return this;
        }

        public Builder setVaccino_non_covid___ne(Boolean vaccino_non_covid___ne) {
            this.vaccino_non_covid___ne = vaccino_non_covid___ne;
            return this;
        }

        public Builder setVaccino_non_covid___null(Boolean vaccino_non_covid___null) {
            this.vaccino_non_covid___null = vaccino_non_covid___null;
            return this;
        }

        public Builder setVaccino_non_covid___not___null(Boolean vaccino_non_covid___not___null) {
            this.vaccino_non_covid___not___null = vaccino_non_covid___not___null;
            return this;
        }

        public Builder setAND(java.util.List<CliFarmaco_altroFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliFarmaco_altroFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliFarmaco_altroFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliFarmaco_altroFilterDTO build() {
            CliFarmaco_altroFilterDTO result = new CliFarmaco_altroFilterDTO();
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
            result.setAnche_da_solo___eq(this.anche_da_solo___eq);
            result.setAnche_da_solo___ne(this.anche_da_solo___ne);
            result.setAnche_da_solo___null(this.anche_da_solo___null);
            result.setAnche_da_solo___not___null(this.anche_da_solo___not___null);
            result.setCodice_DAD___eq(this.codice_DAD___eq);
            result.setCodice_DAD___ne(this.codice_DAD___ne);
            result.setCodice_DAD___null(this.codice_DAD___null);
            result.setCodice_DAD___not___null(this.codice_DAD___not___null);
            result.setCodice_DAD___in(this.codice_DAD___in);
            result.setCodice_DAD___not___in(this.codice_DAD___not___in);
            result.setCodice_DAD___lt(this.codice_DAD___lt);
            result.setCodice_DAD___lte(this.codice_DAD___lte);
            result.setCodice_DAD___gt(this.codice_DAD___gt);
            result.setCodice_DAD___gte(this.codice_DAD___gte);
            result.setCodice_DAD___contains(this.codice_DAD___contains);
            result.setCodice_DAD___not___contains(this.codice_DAD___not___contains);
            result.setCodice_DAD___starts_with(this.codice_DAD___starts_with);
            result.setCodice_DAD___not___starts_with(this.codice_DAD___not___starts_with);
            result.setCodice_DAD___ends_with(this.codice_DAD___ends_with);
            result.setCodice_DAD___not___ends_with(this.codice_DAD___not___ends_with);
            result.setCombinazioni_accettate___eq(this.combinazioni_accettate___eq);
            result.setCombinazioni_accettate___ne(this.combinazioni_accettate___ne);
            result.setCombinazioni_accettate___null(this.combinazioni_accettate___null);
            result.setCombinazioni_accettate___not___null(this.combinazioni_accettate___not___null);
            result.setCombinazioni_accettate___in(this.combinazioni_accettate___in);
            result.setCombinazioni_accettate___not___in(this.combinazioni_accettate___not___in);
            result.setCombinazioni_accettate___lt(this.combinazioni_accettate___lt);
            result.setCombinazioni_accettate___lte(this.combinazioni_accettate___lte);
            result.setCombinazioni_accettate___gt(this.combinazioni_accettate___gt);
            result.setCombinazioni_accettate___gte(this.combinazioni_accettate___gte);
            result.setCombinazioni_accettate___contains(this.combinazioni_accettate___contains);
            result.setCombinazioni_accettate___not___contains(this.combinazioni_accettate___not___contains);
            result.setCombinazioni_accettate___starts_with(this.combinazioni_accettate___starts_with);
            result.setCombinazioni_accettate___not___starts_with(this.combinazioni_accettate___not___starts_with);
            result.setCombinazioni_accettate___ends_with(this.combinazioni_accettate___ends_with);
            result.setCombinazioni_accettate___not___ends_with(this.combinazioni_accettate___not___ends_with);
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
            result.setTag___eq(this.tag___eq);
            result.setTag___ne(this.tag___ne);
            result.setTag___null(this.tag___null);
            result.setTag___not___null(this.tag___not___null);
            result.setTag___in(this.tag___in);
            result.setTag___not___in(this.tag___not___in);
            result.setTag___lt(this.tag___lt);
            result.setTag___lte(this.tag___lte);
            result.setTag___gt(this.tag___gt);
            result.setTag___gte(this.tag___gte);
            result.setTag___contains(this.tag___contains);
            result.setTag___not___contains(this.tag___not___contains);
            result.setTag___starts_with(this.tag___starts_with);
            result.setTag___not___starts_with(this.tag___not___starts_with);
            result.setTag___ends_with(this.tag___ends_with);
            result.setTag___not___ends_with(this.tag___not___ends_with);
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
            result.setVaccino_covid___eq(this.vaccino_covid___eq);
            result.setVaccino_covid___ne(this.vaccino_covid___ne);
            result.setVaccino_covid___null(this.vaccino_covid___null);
            result.setVaccino_covid___not___null(this.vaccino_covid___not___null);
            result.setVaccino_non_covid___eq(this.vaccino_non_covid___eq);
            result.setVaccino_non_covid___ne(this.vaccino_non_covid___ne);
            result.setVaccino_non_covid___null(this.vaccino_non_covid___null);
            result.setVaccino_non_covid___not___null(this.vaccino_non_covid___not___null);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
