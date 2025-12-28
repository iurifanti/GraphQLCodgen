package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Questionario.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliQuestionarioFilterDTO implements java.io.Serializable {

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
    private Integer domande___eq;
    private Integer domande___ne;
    private Boolean domande___null;
    private Boolean domande___not___null;
    private java.util.List<Integer> domande___in;
    private java.util.List<Integer> domande___not___in;
    private Integer domande___lt;
    private Integer domande___lte;
    private Integer domande___gt;
    private Integer domande___gte;
    private Integer intervallo_compil_mesi___eq;
    private Integer intervallo_compil_mesi___ne;
    private Boolean intervallo_compil_mesi___null;
    private Boolean intervallo_compil_mesi___not___null;
    private java.util.List<Integer> intervallo_compil_mesi___in;
    private java.util.List<Integer> intervallo_compil_mesi___not___in;
    private Integer intervallo_compil_mesi___lt;
    private Integer intervallo_compil_mesi___lte;
    private Integer intervallo_compil_mesi___gt;
    private Integer intervallo_compil_mesi___gte;
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
    private Boolean parametri_personali___eq;
    private Boolean parametri_personali___ne;
    private Boolean parametri_personali___null;
    private Boolean parametri_personali___not___null;
    private String studi_appartenenza___eq;
    private String studi_appartenenza___ne;
    private Boolean studi_appartenenza___null;
    private Boolean studi_appartenenza___not___null;
    private java.util.List<String> studi_appartenenza___in;
    private java.util.List<String> studi_appartenenza___not___in;
    private String studi_appartenenza___lt;
    private String studi_appartenenza___lte;
    private String studi_appartenenza___gt;
    private String studi_appartenenza___gte;
    private String studi_appartenenza___contains;
    private String studi_appartenenza___not___contains;
    private String studi_appartenenza___starts_with;
    private String studi_appartenenza___not___starts_with;
    private String studi_appartenenza___ends_with;
    private String studi_appartenenza___not___ends_with;
    private String titolo___eq;
    private String titolo___ne;
    private Boolean titolo___null;
    private Boolean titolo___not___null;
    private java.util.List<String> titolo___in;
    private java.util.List<String> titolo___not___in;
    private String titolo___lt;
    private String titolo___lte;
    private String titolo___gt;
    private String titolo___gte;
    private String titolo___contains;
    private String titolo___not___contains;
    private String titolo___starts_with;
    private String titolo___not___starts_with;
    private String titolo___ends_with;
    private String titolo___not___ends_with;
    private java.util.List<CliQuestionarioFilterDTO> AND;
    private java.util.List<CliQuestionarioFilterDTO> OR;
    private CliQuestionarioFilterDTO NOT;

    public CliQuestionarioFilterDTO() {
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

    public Integer getDomande___eq() {
        return domande___eq;
    }
    public void setDomande___eq(Integer domande___eq) {
        this.domande___eq = domande___eq;
    }

    public Integer getDomande___ne() {
        return domande___ne;
    }
    public void setDomande___ne(Integer domande___ne) {
        this.domande___ne = domande___ne;
    }

    public Boolean getDomande___null() {
        return domande___null;
    }
    public void setDomande___null(Boolean domande___null) {
        this.domande___null = domande___null;
    }

    public Boolean getDomande___not___null() {
        return domande___not___null;
    }
    public void setDomande___not___null(Boolean domande___not___null) {
        this.domande___not___null = domande___not___null;
    }

    public java.util.List<Integer> getDomande___in() {
        return domande___in;
    }
    public void setDomande___in(java.util.List<Integer> domande___in) {
        this.domande___in = domande___in;
    }

    public java.util.List<Integer> getDomande___not___in() {
        return domande___not___in;
    }
    public void setDomande___not___in(java.util.List<Integer> domande___not___in) {
        this.domande___not___in = domande___not___in;
    }

    public Integer getDomande___lt() {
        return domande___lt;
    }
    public void setDomande___lt(Integer domande___lt) {
        this.domande___lt = domande___lt;
    }

    public Integer getDomande___lte() {
        return domande___lte;
    }
    public void setDomande___lte(Integer domande___lte) {
        this.domande___lte = domande___lte;
    }

    public Integer getDomande___gt() {
        return domande___gt;
    }
    public void setDomande___gt(Integer domande___gt) {
        this.domande___gt = domande___gt;
    }

    public Integer getDomande___gte() {
        return domande___gte;
    }
    public void setDomande___gte(Integer domande___gte) {
        this.domande___gte = domande___gte;
    }

    public Integer getIntervallo_compil_mesi___eq() {
        return intervallo_compil_mesi___eq;
    }
    public void setIntervallo_compil_mesi___eq(Integer intervallo_compil_mesi___eq) {
        this.intervallo_compil_mesi___eq = intervallo_compil_mesi___eq;
    }

    public Integer getIntervallo_compil_mesi___ne() {
        return intervallo_compil_mesi___ne;
    }
    public void setIntervallo_compil_mesi___ne(Integer intervallo_compil_mesi___ne) {
        this.intervallo_compil_mesi___ne = intervallo_compil_mesi___ne;
    }

    public Boolean getIntervallo_compil_mesi___null() {
        return intervallo_compil_mesi___null;
    }
    public void setIntervallo_compil_mesi___null(Boolean intervallo_compil_mesi___null) {
        this.intervallo_compil_mesi___null = intervallo_compil_mesi___null;
    }

    public Boolean getIntervallo_compil_mesi___not___null() {
        return intervallo_compil_mesi___not___null;
    }
    public void setIntervallo_compil_mesi___not___null(Boolean intervallo_compil_mesi___not___null) {
        this.intervallo_compil_mesi___not___null = intervallo_compil_mesi___not___null;
    }

    public java.util.List<Integer> getIntervallo_compil_mesi___in() {
        return intervallo_compil_mesi___in;
    }
    public void setIntervallo_compil_mesi___in(java.util.List<Integer> intervallo_compil_mesi___in) {
        this.intervallo_compil_mesi___in = intervallo_compil_mesi___in;
    }

    public java.util.List<Integer> getIntervallo_compil_mesi___not___in() {
        return intervallo_compil_mesi___not___in;
    }
    public void setIntervallo_compil_mesi___not___in(java.util.List<Integer> intervallo_compil_mesi___not___in) {
        this.intervallo_compil_mesi___not___in = intervallo_compil_mesi___not___in;
    }

    public Integer getIntervallo_compil_mesi___lt() {
        return intervallo_compil_mesi___lt;
    }
    public void setIntervallo_compil_mesi___lt(Integer intervallo_compil_mesi___lt) {
        this.intervallo_compil_mesi___lt = intervallo_compil_mesi___lt;
    }

    public Integer getIntervallo_compil_mesi___lte() {
        return intervallo_compil_mesi___lte;
    }
    public void setIntervallo_compil_mesi___lte(Integer intervallo_compil_mesi___lte) {
        this.intervallo_compil_mesi___lte = intervallo_compil_mesi___lte;
    }

    public Integer getIntervallo_compil_mesi___gt() {
        return intervallo_compil_mesi___gt;
    }
    public void setIntervallo_compil_mesi___gt(Integer intervallo_compil_mesi___gt) {
        this.intervallo_compil_mesi___gt = intervallo_compil_mesi___gt;
    }

    public Integer getIntervallo_compil_mesi___gte() {
        return intervallo_compil_mesi___gte;
    }
    public void setIntervallo_compil_mesi___gte(Integer intervallo_compil_mesi___gte) {
        this.intervallo_compil_mesi___gte = intervallo_compil_mesi___gte;
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

    public Boolean getParametri_personali___eq() {
        return parametri_personali___eq;
    }
    public void setParametri_personali___eq(Boolean parametri_personali___eq) {
        this.parametri_personali___eq = parametri_personali___eq;
    }

    public Boolean getParametri_personali___ne() {
        return parametri_personali___ne;
    }
    public void setParametri_personali___ne(Boolean parametri_personali___ne) {
        this.parametri_personali___ne = parametri_personali___ne;
    }

    public Boolean getParametri_personali___null() {
        return parametri_personali___null;
    }
    public void setParametri_personali___null(Boolean parametri_personali___null) {
        this.parametri_personali___null = parametri_personali___null;
    }

    public Boolean getParametri_personali___not___null() {
        return parametri_personali___not___null;
    }
    public void setParametri_personali___not___null(Boolean parametri_personali___not___null) {
        this.parametri_personali___not___null = parametri_personali___not___null;
    }

    public String getStudi_appartenenza___eq() {
        return studi_appartenenza___eq;
    }
    public void setStudi_appartenenza___eq(String studi_appartenenza___eq) {
        this.studi_appartenenza___eq = studi_appartenenza___eq;
    }

    public String getStudi_appartenenza___ne() {
        return studi_appartenenza___ne;
    }
    public void setStudi_appartenenza___ne(String studi_appartenenza___ne) {
        this.studi_appartenenza___ne = studi_appartenenza___ne;
    }

    public Boolean getStudi_appartenenza___null() {
        return studi_appartenenza___null;
    }
    public void setStudi_appartenenza___null(Boolean studi_appartenenza___null) {
        this.studi_appartenenza___null = studi_appartenenza___null;
    }

    public Boolean getStudi_appartenenza___not___null() {
        return studi_appartenenza___not___null;
    }
    public void setStudi_appartenenza___not___null(Boolean studi_appartenenza___not___null) {
        this.studi_appartenenza___not___null = studi_appartenenza___not___null;
    }

    public java.util.List<String> getStudi_appartenenza___in() {
        return studi_appartenenza___in;
    }
    public void setStudi_appartenenza___in(java.util.List<String> studi_appartenenza___in) {
        this.studi_appartenenza___in = studi_appartenenza___in;
    }

    public java.util.List<String> getStudi_appartenenza___not___in() {
        return studi_appartenenza___not___in;
    }
    public void setStudi_appartenenza___not___in(java.util.List<String> studi_appartenenza___not___in) {
        this.studi_appartenenza___not___in = studi_appartenenza___not___in;
    }

    public String getStudi_appartenenza___lt() {
        return studi_appartenenza___lt;
    }
    public void setStudi_appartenenza___lt(String studi_appartenenza___lt) {
        this.studi_appartenenza___lt = studi_appartenenza___lt;
    }

    public String getStudi_appartenenza___lte() {
        return studi_appartenenza___lte;
    }
    public void setStudi_appartenenza___lte(String studi_appartenenza___lte) {
        this.studi_appartenenza___lte = studi_appartenenza___lte;
    }

    public String getStudi_appartenenza___gt() {
        return studi_appartenenza___gt;
    }
    public void setStudi_appartenenza___gt(String studi_appartenenza___gt) {
        this.studi_appartenenza___gt = studi_appartenenza___gt;
    }

    public String getStudi_appartenenza___gte() {
        return studi_appartenenza___gte;
    }
    public void setStudi_appartenenza___gte(String studi_appartenenza___gte) {
        this.studi_appartenenza___gte = studi_appartenenza___gte;
    }

    public String getStudi_appartenenza___contains() {
        return studi_appartenenza___contains;
    }
    public void setStudi_appartenenza___contains(String studi_appartenenza___contains) {
        this.studi_appartenenza___contains = studi_appartenenza___contains;
    }

    public String getStudi_appartenenza___not___contains() {
        return studi_appartenenza___not___contains;
    }
    public void setStudi_appartenenza___not___contains(String studi_appartenenza___not___contains) {
        this.studi_appartenenza___not___contains = studi_appartenenza___not___contains;
    }

    public String getStudi_appartenenza___starts_with() {
        return studi_appartenenza___starts_with;
    }
    public void setStudi_appartenenza___starts_with(String studi_appartenenza___starts_with) {
        this.studi_appartenenza___starts_with = studi_appartenenza___starts_with;
    }

    public String getStudi_appartenenza___not___starts_with() {
        return studi_appartenenza___not___starts_with;
    }
    public void setStudi_appartenenza___not___starts_with(String studi_appartenenza___not___starts_with) {
        this.studi_appartenenza___not___starts_with = studi_appartenenza___not___starts_with;
    }

    public String getStudi_appartenenza___ends_with() {
        return studi_appartenenza___ends_with;
    }
    public void setStudi_appartenenza___ends_with(String studi_appartenenza___ends_with) {
        this.studi_appartenenza___ends_with = studi_appartenenza___ends_with;
    }

    public String getStudi_appartenenza___not___ends_with() {
        return studi_appartenenza___not___ends_with;
    }
    public void setStudi_appartenenza___not___ends_with(String studi_appartenenza___not___ends_with) {
        this.studi_appartenenza___not___ends_with = studi_appartenenza___not___ends_with;
    }

    public String getTitolo___eq() {
        return titolo___eq;
    }
    public void setTitolo___eq(String titolo___eq) {
        this.titolo___eq = titolo___eq;
    }

    public String getTitolo___ne() {
        return titolo___ne;
    }
    public void setTitolo___ne(String titolo___ne) {
        this.titolo___ne = titolo___ne;
    }

    public Boolean getTitolo___null() {
        return titolo___null;
    }
    public void setTitolo___null(Boolean titolo___null) {
        this.titolo___null = titolo___null;
    }

    public Boolean getTitolo___not___null() {
        return titolo___not___null;
    }
    public void setTitolo___not___null(Boolean titolo___not___null) {
        this.titolo___not___null = titolo___not___null;
    }

    public java.util.List<String> getTitolo___in() {
        return titolo___in;
    }
    public void setTitolo___in(java.util.List<String> titolo___in) {
        this.titolo___in = titolo___in;
    }

    public java.util.List<String> getTitolo___not___in() {
        return titolo___not___in;
    }
    public void setTitolo___not___in(java.util.List<String> titolo___not___in) {
        this.titolo___not___in = titolo___not___in;
    }

    public String getTitolo___lt() {
        return titolo___lt;
    }
    public void setTitolo___lt(String titolo___lt) {
        this.titolo___lt = titolo___lt;
    }

    public String getTitolo___lte() {
        return titolo___lte;
    }
    public void setTitolo___lte(String titolo___lte) {
        this.titolo___lte = titolo___lte;
    }

    public String getTitolo___gt() {
        return titolo___gt;
    }
    public void setTitolo___gt(String titolo___gt) {
        this.titolo___gt = titolo___gt;
    }

    public String getTitolo___gte() {
        return titolo___gte;
    }
    public void setTitolo___gte(String titolo___gte) {
        this.titolo___gte = titolo___gte;
    }

    public String getTitolo___contains() {
        return titolo___contains;
    }
    public void setTitolo___contains(String titolo___contains) {
        this.titolo___contains = titolo___contains;
    }

    public String getTitolo___not___contains() {
        return titolo___not___contains;
    }
    public void setTitolo___not___contains(String titolo___not___contains) {
        this.titolo___not___contains = titolo___not___contains;
    }

    public String getTitolo___starts_with() {
        return titolo___starts_with;
    }
    public void setTitolo___starts_with(String titolo___starts_with) {
        this.titolo___starts_with = titolo___starts_with;
    }

    public String getTitolo___not___starts_with() {
        return titolo___not___starts_with;
    }
    public void setTitolo___not___starts_with(String titolo___not___starts_with) {
        this.titolo___not___starts_with = titolo___not___starts_with;
    }

    public String getTitolo___ends_with() {
        return titolo___ends_with;
    }
    public void setTitolo___ends_with(String titolo___ends_with) {
        this.titolo___ends_with = titolo___ends_with;
    }

    public String getTitolo___not___ends_with() {
        return titolo___not___ends_with;
    }
    public void setTitolo___not___ends_with(String titolo___not___ends_with) {
        this.titolo___not___ends_with = titolo___not___ends_with;
    }

    public java.util.List<CliQuestionarioFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliQuestionarioFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliQuestionarioFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliQuestionarioFilterDTO> OR) {
        this.OR = OR;
    }

    public CliQuestionarioFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliQuestionarioFilterDTO NOT) {
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
        if (domande___eq != null) {
            joiner.add("domande___eq: " + GraphQLRequestSerializer.getEntry(domande___eq));
        }
        if (domande___ne != null) {
            joiner.add("domande___ne: " + GraphQLRequestSerializer.getEntry(domande___ne));
        }
        if (domande___null != null) {
            joiner.add("domande___null: " + GraphQLRequestSerializer.getEntry(domande___null));
        }
        if (domande___not___null != null) {
            joiner.add("domande___not___null: " + GraphQLRequestSerializer.getEntry(domande___not___null));
        }
        if (domande___in != null) {
            joiner.add("domande___in: " + GraphQLRequestSerializer.getEntry(domande___in));
        }
        if (domande___not___in != null) {
            joiner.add("domande___not___in: " + GraphQLRequestSerializer.getEntry(domande___not___in));
        }
        if (domande___lt != null) {
            joiner.add("domande___lt: " + GraphQLRequestSerializer.getEntry(domande___lt));
        }
        if (domande___lte != null) {
            joiner.add("domande___lte: " + GraphQLRequestSerializer.getEntry(domande___lte));
        }
        if (domande___gt != null) {
            joiner.add("domande___gt: " + GraphQLRequestSerializer.getEntry(domande___gt));
        }
        if (domande___gte != null) {
            joiner.add("domande___gte: " + GraphQLRequestSerializer.getEntry(domande___gte));
        }
        if (intervallo_compil_mesi___eq != null) {
            joiner.add("intervallo_compil_mesi___eq: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___eq));
        }
        if (intervallo_compil_mesi___ne != null) {
            joiner.add("intervallo_compil_mesi___ne: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___ne));
        }
        if (intervallo_compil_mesi___null != null) {
            joiner.add("intervallo_compil_mesi___null: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___null));
        }
        if (intervallo_compil_mesi___not___null != null) {
            joiner.add("intervallo_compil_mesi___not___null: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___not___null));
        }
        if (intervallo_compil_mesi___in != null) {
            joiner.add("intervallo_compil_mesi___in: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___in));
        }
        if (intervallo_compil_mesi___not___in != null) {
            joiner.add("intervallo_compil_mesi___not___in: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___not___in));
        }
        if (intervallo_compil_mesi___lt != null) {
            joiner.add("intervallo_compil_mesi___lt: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___lt));
        }
        if (intervallo_compil_mesi___lte != null) {
            joiner.add("intervallo_compil_mesi___lte: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___lte));
        }
        if (intervallo_compil_mesi___gt != null) {
            joiner.add("intervallo_compil_mesi___gt: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___gt));
        }
        if (intervallo_compil_mesi___gte != null) {
            joiner.add("intervallo_compil_mesi___gte: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi___gte));
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
        if (parametri_personali___eq != null) {
            joiner.add("parametri_personali___eq: " + GraphQLRequestSerializer.getEntry(parametri_personali___eq));
        }
        if (parametri_personali___ne != null) {
            joiner.add("parametri_personali___ne: " + GraphQLRequestSerializer.getEntry(parametri_personali___ne));
        }
        if (parametri_personali___null != null) {
            joiner.add("parametri_personali___null: " + GraphQLRequestSerializer.getEntry(parametri_personali___null));
        }
        if (parametri_personali___not___null != null) {
            joiner.add("parametri_personali___not___null: " + GraphQLRequestSerializer.getEntry(parametri_personali___not___null));
        }
        if (studi_appartenenza___eq != null) {
            joiner.add("studi_appartenenza___eq: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___eq));
        }
        if (studi_appartenenza___ne != null) {
            joiner.add("studi_appartenenza___ne: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___ne));
        }
        if (studi_appartenenza___null != null) {
            joiner.add("studi_appartenenza___null: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___null));
        }
        if (studi_appartenenza___not___null != null) {
            joiner.add("studi_appartenenza___not___null: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___not___null));
        }
        if (studi_appartenenza___in != null) {
            joiner.add("studi_appartenenza___in: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___in));
        }
        if (studi_appartenenza___not___in != null) {
            joiner.add("studi_appartenenza___not___in: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___not___in));
        }
        if (studi_appartenenza___lt != null) {
            joiner.add("studi_appartenenza___lt: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___lt));
        }
        if (studi_appartenenza___lte != null) {
            joiner.add("studi_appartenenza___lte: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___lte));
        }
        if (studi_appartenenza___gt != null) {
            joiner.add("studi_appartenenza___gt: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___gt));
        }
        if (studi_appartenenza___gte != null) {
            joiner.add("studi_appartenenza___gte: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___gte));
        }
        if (studi_appartenenza___contains != null) {
            joiner.add("studi_appartenenza___contains: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___contains));
        }
        if (studi_appartenenza___not___contains != null) {
            joiner.add("studi_appartenenza___not___contains: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___not___contains));
        }
        if (studi_appartenenza___starts_with != null) {
            joiner.add("studi_appartenenza___starts_with: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___starts_with));
        }
        if (studi_appartenenza___not___starts_with != null) {
            joiner.add("studi_appartenenza___not___starts_with: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___not___starts_with));
        }
        if (studi_appartenenza___ends_with != null) {
            joiner.add("studi_appartenenza___ends_with: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___ends_with));
        }
        if (studi_appartenenza___not___ends_with != null) {
            joiner.add("studi_appartenenza___not___ends_with: " + GraphQLRequestSerializer.getEntry(studi_appartenenza___not___ends_with));
        }
        if (titolo___eq != null) {
            joiner.add("titolo___eq: " + GraphQLRequestSerializer.getEntry(titolo___eq));
        }
        if (titolo___ne != null) {
            joiner.add("titolo___ne: " + GraphQLRequestSerializer.getEntry(titolo___ne));
        }
        if (titolo___null != null) {
            joiner.add("titolo___null: " + GraphQLRequestSerializer.getEntry(titolo___null));
        }
        if (titolo___not___null != null) {
            joiner.add("titolo___not___null: " + GraphQLRequestSerializer.getEntry(titolo___not___null));
        }
        if (titolo___in != null) {
            joiner.add("titolo___in: " + GraphQLRequestSerializer.getEntry(titolo___in));
        }
        if (titolo___not___in != null) {
            joiner.add("titolo___not___in: " + GraphQLRequestSerializer.getEntry(titolo___not___in));
        }
        if (titolo___lt != null) {
            joiner.add("titolo___lt: " + GraphQLRequestSerializer.getEntry(titolo___lt));
        }
        if (titolo___lte != null) {
            joiner.add("titolo___lte: " + GraphQLRequestSerializer.getEntry(titolo___lte));
        }
        if (titolo___gt != null) {
            joiner.add("titolo___gt: " + GraphQLRequestSerializer.getEntry(titolo___gt));
        }
        if (titolo___gte != null) {
            joiner.add("titolo___gte: " + GraphQLRequestSerializer.getEntry(titolo___gte));
        }
        if (titolo___contains != null) {
            joiner.add("titolo___contains: " + GraphQLRequestSerializer.getEntry(titolo___contains));
        }
        if (titolo___not___contains != null) {
            joiner.add("titolo___not___contains: " + GraphQLRequestSerializer.getEntry(titolo___not___contains));
        }
        if (titolo___starts_with != null) {
            joiner.add("titolo___starts_with: " + GraphQLRequestSerializer.getEntry(titolo___starts_with));
        }
        if (titolo___not___starts_with != null) {
            joiner.add("titolo___not___starts_with: " + GraphQLRequestSerializer.getEntry(titolo___not___starts_with));
        }
        if (titolo___ends_with != null) {
            joiner.add("titolo___ends_with: " + GraphQLRequestSerializer.getEntry(titolo___ends_with));
        }
        if (titolo___not___ends_with != null) {
            joiner.add("titolo___not___ends_with: " + GraphQLRequestSerializer.getEntry(titolo___not___ends_with));
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

    public static CliQuestionarioFilterDTO.Builder builder() {
        return new CliQuestionarioFilterDTO.Builder();
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
        private Integer domande___eq;
        private Integer domande___ne;
        private Boolean domande___null;
        private Boolean domande___not___null;
        private java.util.List<Integer> domande___in;
        private java.util.List<Integer> domande___not___in;
        private Integer domande___lt;
        private Integer domande___lte;
        private Integer domande___gt;
        private Integer domande___gte;
        private Integer intervallo_compil_mesi___eq;
        private Integer intervallo_compil_mesi___ne;
        private Boolean intervallo_compil_mesi___null;
        private Boolean intervallo_compil_mesi___not___null;
        private java.util.List<Integer> intervallo_compil_mesi___in;
        private java.util.List<Integer> intervallo_compil_mesi___not___in;
        private Integer intervallo_compil_mesi___lt;
        private Integer intervallo_compil_mesi___lte;
        private Integer intervallo_compil_mesi___gt;
        private Integer intervallo_compil_mesi___gte;
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
        private Boolean parametri_personali___eq;
        private Boolean parametri_personali___ne;
        private Boolean parametri_personali___null;
        private Boolean parametri_personali___not___null;
        private String studi_appartenenza___eq;
        private String studi_appartenenza___ne;
        private Boolean studi_appartenenza___null;
        private Boolean studi_appartenenza___not___null;
        private java.util.List<String> studi_appartenenza___in;
        private java.util.List<String> studi_appartenenza___not___in;
        private String studi_appartenenza___lt;
        private String studi_appartenenza___lte;
        private String studi_appartenenza___gt;
        private String studi_appartenenza___gte;
        private String studi_appartenenza___contains;
        private String studi_appartenenza___not___contains;
        private String studi_appartenenza___starts_with;
        private String studi_appartenenza___not___starts_with;
        private String studi_appartenenza___ends_with;
        private String studi_appartenenza___not___ends_with;
        private String titolo___eq;
        private String titolo___ne;
        private Boolean titolo___null;
        private Boolean titolo___not___null;
        private java.util.List<String> titolo___in;
        private java.util.List<String> titolo___not___in;
        private String titolo___lt;
        private String titolo___lte;
        private String titolo___gt;
        private String titolo___gte;
        private String titolo___contains;
        private String titolo___not___contains;
        private String titolo___starts_with;
        private String titolo___not___starts_with;
        private String titolo___ends_with;
        private String titolo___not___ends_with;
        private java.util.List<CliQuestionarioFilterDTO> AND;
        private java.util.List<CliQuestionarioFilterDTO> OR;
        private CliQuestionarioFilterDTO NOT;

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

        public Builder setDomande___eq(Integer domande___eq) {
            this.domande___eq = domande___eq;
            return this;
        }

        public Builder setDomande___ne(Integer domande___ne) {
            this.domande___ne = domande___ne;
            return this;
        }

        public Builder setDomande___null(Boolean domande___null) {
            this.domande___null = domande___null;
            return this;
        }

        public Builder setDomande___not___null(Boolean domande___not___null) {
            this.domande___not___null = domande___not___null;
            return this;
        }

        public Builder setDomande___in(java.util.List<Integer> domande___in) {
            this.domande___in = domande___in;
            return this;
        }

        public Builder setDomande___not___in(java.util.List<Integer> domande___not___in) {
            this.domande___not___in = domande___not___in;
            return this;
        }

        public Builder setDomande___lt(Integer domande___lt) {
            this.domande___lt = domande___lt;
            return this;
        }

        public Builder setDomande___lte(Integer domande___lte) {
            this.domande___lte = domande___lte;
            return this;
        }

        public Builder setDomande___gt(Integer domande___gt) {
            this.domande___gt = domande___gt;
            return this;
        }

        public Builder setDomande___gte(Integer domande___gte) {
            this.domande___gte = domande___gte;
            return this;
        }

        public Builder setIntervallo_compil_mesi___eq(Integer intervallo_compil_mesi___eq) {
            this.intervallo_compil_mesi___eq = intervallo_compil_mesi___eq;
            return this;
        }

        public Builder setIntervallo_compil_mesi___ne(Integer intervallo_compil_mesi___ne) {
            this.intervallo_compil_mesi___ne = intervallo_compil_mesi___ne;
            return this;
        }

        public Builder setIntervallo_compil_mesi___null(Boolean intervallo_compil_mesi___null) {
            this.intervallo_compil_mesi___null = intervallo_compil_mesi___null;
            return this;
        }

        public Builder setIntervallo_compil_mesi___not___null(Boolean intervallo_compil_mesi___not___null) {
            this.intervallo_compil_mesi___not___null = intervallo_compil_mesi___not___null;
            return this;
        }

        public Builder setIntervallo_compil_mesi___in(java.util.List<Integer> intervallo_compil_mesi___in) {
            this.intervallo_compil_mesi___in = intervallo_compil_mesi___in;
            return this;
        }

        public Builder setIntervallo_compil_mesi___not___in(java.util.List<Integer> intervallo_compil_mesi___not___in) {
            this.intervallo_compil_mesi___not___in = intervallo_compil_mesi___not___in;
            return this;
        }

        public Builder setIntervallo_compil_mesi___lt(Integer intervallo_compil_mesi___lt) {
            this.intervallo_compil_mesi___lt = intervallo_compil_mesi___lt;
            return this;
        }

        public Builder setIntervallo_compil_mesi___lte(Integer intervallo_compil_mesi___lte) {
            this.intervallo_compil_mesi___lte = intervallo_compil_mesi___lte;
            return this;
        }

        public Builder setIntervallo_compil_mesi___gt(Integer intervallo_compil_mesi___gt) {
            this.intervallo_compil_mesi___gt = intervallo_compil_mesi___gt;
            return this;
        }

        public Builder setIntervallo_compil_mesi___gte(Integer intervallo_compil_mesi___gte) {
            this.intervallo_compil_mesi___gte = intervallo_compil_mesi___gte;
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

        public Builder setParametri_personali___eq(Boolean parametri_personali___eq) {
            this.parametri_personali___eq = parametri_personali___eq;
            return this;
        }

        public Builder setParametri_personali___ne(Boolean parametri_personali___ne) {
            this.parametri_personali___ne = parametri_personali___ne;
            return this;
        }

        public Builder setParametri_personali___null(Boolean parametri_personali___null) {
            this.parametri_personali___null = parametri_personali___null;
            return this;
        }

        public Builder setParametri_personali___not___null(Boolean parametri_personali___not___null) {
            this.parametri_personali___not___null = parametri_personali___not___null;
            return this;
        }

        public Builder setStudi_appartenenza___eq(String studi_appartenenza___eq) {
            this.studi_appartenenza___eq = studi_appartenenza___eq;
            return this;
        }

        public Builder setStudi_appartenenza___ne(String studi_appartenenza___ne) {
            this.studi_appartenenza___ne = studi_appartenenza___ne;
            return this;
        }

        public Builder setStudi_appartenenza___null(Boolean studi_appartenenza___null) {
            this.studi_appartenenza___null = studi_appartenenza___null;
            return this;
        }

        public Builder setStudi_appartenenza___not___null(Boolean studi_appartenenza___not___null) {
            this.studi_appartenenza___not___null = studi_appartenenza___not___null;
            return this;
        }

        public Builder setStudi_appartenenza___in(java.util.List<String> studi_appartenenza___in) {
            this.studi_appartenenza___in = studi_appartenenza___in;
            return this;
        }

        public Builder setStudi_appartenenza___not___in(java.util.List<String> studi_appartenenza___not___in) {
            this.studi_appartenenza___not___in = studi_appartenenza___not___in;
            return this;
        }

        public Builder setStudi_appartenenza___lt(String studi_appartenenza___lt) {
            this.studi_appartenenza___lt = studi_appartenenza___lt;
            return this;
        }

        public Builder setStudi_appartenenza___lte(String studi_appartenenza___lte) {
            this.studi_appartenenza___lte = studi_appartenenza___lte;
            return this;
        }

        public Builder setStudi_appartenenza___gt(String studi_appartenenza___gt) {
            this.studi_appartenenza___gt = studi_appartenenza___gt;
            return this;
        }

        public Builder setStudi_appartenenza___gte(String studi_appartenenza___gte) {
            this.studi_appartenenza___gte = studi_appartenenza___gte;
            return this;
        }

        public Builder setStudi_appartenenza___contains(String studi_appartenenza___contains) {
            this.studi_appartenenza___contains = studi_appartenenza___contains;
            return this;
        }

        public Builder setStudi_appartenenza___not___contains(String studi_appartenenza___not___contains) {
            this.studi_appartenenza___not___contains = studi_appartenenza___not___contains;
            return this;
        }

        public Builder setStudi_appartenenza___starts_with(String studi_appartenenza___starts_with) {
            this.studi_appartenenza___starts_with = studi_appartenenza___starts_with;
            return this;
        }

        public Builder setStudi_appartenenza___not___starts_with(String studi_appartenenza___not___starts_with) {
            this.studi_appartenenza___not___starts_with = studi_appartenenza___not___starts_with;
            return this;
        }

        public Builder setStudi_appartenenza___ends_with(String studi_appartenenza___ends_with) {
            this.studi_appartenenza___ends_with = studi_appartenenza___ends_with;
            return this;
        }

        public Builder setStudi_appartenenza___not___ends_with(String studi_appartenenza___not___ends_with) {
            this.studi_appartenenza___not___ends_with = studi_appartenenza___not___ends_with;
            return this;
        }

        public Builder setTitolo___eq(String titolo___eq) {
            this.titolo___eq = titolo___eq;
            return this;
        }

        public Builder setTitolo___ne(String titolo___ne) {
            this.titolo___ne = titolo___ne;
            return this;
        }

        public Builder setTitolo___null(Boolean titolo___null) {
            this.titolo___null = titolo___null;
            return this;
        }

        public Builder setTitolo___not___null(Boolean titolo___not___null) {
            this.titolo___not___null = titolo___not___null;
            return this;
        }

        public Builder setTitolo___in(java.util.List<String> titolo___in) {
            this.titolo___in = titolo___in;
            return this;
        }

        public Builder setTitolo___not___in(java.util.List<String> titolo___not___in) {
            this.titolo___not___in = titolo___not___in;
            return this;
        }

        public Builder setTitolo___lt(String titolo___lt) {
            this.titolo___lt = titolo___lt;
            return this;
        }

        public Builder setTitolo___lte(String titolo___lte) {
            this.titolo___lte = titolo___lte;
            return this;
        }

        public Builder setTitolo___gt(String titolo___gt) {
            this.titolo___gt = titolo___gt;
            return this;
        }

        public Builder setTitolo___gte(String titolo___gte) {
            this.titolo___gte = titolo___gte;
            return this;
        }

        public Builder setTitolo___contains(String titolo___contains) {
            this.titolo___contains = titolo___contains;
            return this;
        }

        public Builder setTitolo___not___contains(String titolo___not___contains) {
            this.titolo___not___contains = titolo___not___contains;
            return this;
        }

        public Builder setTitolo___starts_with(String titolo___starts_with) {
            this.titolo___starts_with = titolo___starts_with;
            return this;
        }

        public Builder setTitolo___not___starts_with(String titolo___not___starts_with) {
            this.titolo___not___starts_with = titolo___not___starts_with;
            return this;
        }

        public Builder setTitolo___ends_with(String titolo___ends_with) {
            this.titolo___ends_with = titolo___ends_with;
            return this;
        }

        public Builder setTitolo___not___ends_with(String titolo___not___ends_with) {
            this.titolo___not___ends_with = titolo___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliQuestionarioFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliQuestionarioFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliQuestionarioFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliQuestionarioFilterDTO build() {
            CliQuestionarioFilterDTO result = new CliQuestionarioFilterDTO();
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
            result.setDomande___eq(this.domande___eq);
            result.setDomande___ne(this.domande___ne);
            result.setDomande___null(this.domande___null);
            result.setDomande___not___null(this.domande___not___null);
            result.setDomande___in(this.domande___in);
            result.setDomande___not___in(this.domande___not___in);
            result.setDomande___lt(this.domande___lt);
            result.setDomande___lte(this.domande___lte);
            result.setDomande___gt(this.domande___gt);
            result.setDomande___gte(this.domande___gte);
            result.setIntervallo_compil_mesi___eq(this.intervallo_compil_mesi___eq);
            result.setIntervallo_compil_mesi___ne(this.intervallo_compil_mesi___ne);
            result.setIntervallo_compil_mesi___null(this.intervallo_compil_mesi___null);
            result.setIntervallo_compil_mesi___not___null(this.intervallo_compil_mesi___not___null);
            result.setIntervallo_compil_mesi___in(this.intervallo_compil_mesi___in);
            result.setIntervallo_compil_mesi___not___in(this.intervallo_compil_mesi___not___in);
            result.setIntervallo_compil_mesi___lt(this.intervallo_compil_mesi___lt);
            result.setIntervallo_compil_mesi___lte(this.intervallo_compil_mesi___lte);
            result.setIntervallo_compil_mesi___gt(this.intervallo_compil_mesi___gt);
            result.setIntervallo_compil_mesi___gte(this.intervallo_compil_mesi___gte);
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
            result.setParametri_personali___eq(this.parametri_personali___eq);
            result.setParametri_personali___ne(this.parametri_personali___ne);
            result.setParametri_personali___null(this.parametri_personali___null);
            result.setParametri_personali___not___null(this.parametri_personali___not___null);
            result.setStudi_appartenenza___eq(this.studi_appartenenza___eq);
            result.setStudi_appartenenza___ne(this.studi_appartenenza___ne);
            result.setStudi_appartenenza___null(this.studi_appartenenza___null);
            result.setStudi_appartenenza___not___null(this.studi_appartenenza___not___null);
            result.setStudi_appartenenza___in(this.studi_appartenenza___in);
            result.setStudi_appartenenza___not___in(this.studi_appartenenza___not___in);
            result.setStudi_appartenenza___lt(this.studi_appartenenza___lt);
            result.setStudi_appartenenza___lte(this.studi_appartenenza___lte);
            result.setStudi_appartenenza___gt(this.studi_appartenenza___gt);
            result.setStudi_appartenenza___gte(this.studi_appartenenza___gte);
            result.setStudi_appartenenza___contains(this.studi_appartenenza___contains);
            result.setStudi_appartenenza___not___contains(this.studi_appartenenza___not___contains);
            result.setStudi_appartenenza___starts_with(this.studi_appartenenza___starts_with);
            result.setStudi_appartenenza___not___starts_with(this.studi_appartenenza___not___starts_with);
            result.setStudi_appartenenza___ends_with(this.studi_appartenenza___ends_with);
            result.setStudi_appartenenza___not___ends_with(this.studi_appartenenza___not___ends_with);
            result.setTitolo___eq(this.titolo___eq);
            result.setTitolo___ne(this.titolo___ne);
            result.setTitolo___null(this.titolo___null);
            result.setTitolo___not___null(this.titolo___not___null);
            result.setTitolo___in(this.titolo___in);
            result.setTitolo___not___in(this.titolo___not___in);
            result.setTitolo___lt(this.titolo___lt);
            result.setTitolo___lte(this.titolo___lte);
            result.setTitolo___gt(this.titolo___gt);
            result.setTitolo___gte(this.titolo___gte);
            result.setTitolo___contains(this.titolo___contains);
            result.setTitolo___not___contains(this.titolo___not___contains);
            result.setTitolo___starts_with(this.titolo___starts_with);
            result.setTitolo___not___starts_with(this.titolo___not___starts_with);
            result.setTitolo___ends_with(this.titolo___ends_with);
            result.setTitolo___not___ends_with(this.titolo___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
