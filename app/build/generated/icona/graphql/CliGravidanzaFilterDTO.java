package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Gravidanza.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliGravidanzaFilterDTO implements java.io.Serializable {

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
    private String allattamento_seno1___eq;
    private String allattamento_seno1___ne;
    private Boolean allattamento_seno1___null;
    private Boolean allattamento_seno1___not___null;
    private java.util.List<String> allattamento_seno1___in;
    private java.util.List<String> allattamento_seno1___not___in;
    private String allattamento_seno1___lt;
    private String allattamento_seno1___lte;
    private String allattamento_seno1___gt;
    private String allattamento_seno1___gte;
    private String allattamento_seno1___contains;
    private String allattamento_seno1___not___contains;
    private String allattamento_seno1___starts_with;
    private String allattamento_seno1___not___starts_with;
    private String allattamento_seno1___ends_with;
    private String allattamento_seno1___not___ends_with;
    private String allattamento_seno2___eq;
    private String allattamento_seno2___ne;
    private Boolean allattamento_seno2___null;
    private Boolean allattamento_seno2___not___null;
    private java.util.List<String> allattamento_seno2___in;
    private java.util.List<String> allattamento_seno2___not___in;
    private String allattamento_seno2___lt;
    private String allattamento_seno2___lte;
    private String allattamento_seno2___gt;
    private String allattamento_seno2___gte;
    private String allattamento_seno2___contains;
    private String allattamento_seno2___not___contains;
    private String allattamento_seno2___starts_with;
    private String allattamento_seno2___not___starts_with;
    private String allattamento_seno2___ends_with;
    private String allattamento_seno2___not___ends_with;
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
    private String data_esito___eq;
    private String data_esito___ne;
    private Boolean data_esito___null;
    private Boolean data_esito___not___null;
    private java.util.List<String> data_esito___in;
    private java.util.List<String> data_esito___not___in;
    private String data_esito___lt;
    private String data_esito___lte;
    private String data_esito___gt;
    private String data_esito___gte;
    private Integer eta_gestazionale___eq;
    private Integer eta_gestazionale___ne;
    private Boolean eta_gestazionale___null;
    private Boolean eta_gestazionale___not___null;
    private java.util.List<Integer> eta_gestazionale___in;
    private java.util.List<Integer> eta_gestazionale___not___in;
    private Integer eta_gestazionale___lt;
    private Integer eta_gestazionale___lte;
    private Integer eta_gestazionale___gt;
    private Integer eta_gestazionale___gte;
    private Integer neonati___eq;
    private Integer neonati___ne;
    private Boolean neonati___null;
    private Boolean neonati___not___null;
    private java.util.List<Integer> neonati___in;
    private java.util.List<Integer> neonati___not___in;
    private Integer neonati___lt;
    private Integer neonati___lte;
    private Integer neonati___gt;
    private Integer neonati___gte;
    private String note___eq;
    private String note___ne;
    private Boolean note___null;
    private Boolean note___not___null;
    private java.util.List<String> note___in;
    private java.util.List<String> note___not___in;
    private String note___lt;
    private String note___lte;
    private String note___gt;
    private String note___gte;
    private String note___contains;
    private String note___not___contains;
    private String note___starts_with;
    private String note___not___starts_with;
    private String note___ends_with;
    private String note___not___ends_with;
    private String padre_hiv___eq;
    private String padre_hiv___ne;
    private Boolean padre_hiv___null;
    private Boolean padre_hiv___not___null;
    private java.util.List<String> padre_hiv___in;
    private java.util.List<String> padre_hiv___not___in;
    private String padre_hiv___lt;
    private String padre_hiv___lte;
    private String padre_hiv___gt;
    private String padre_hiv___gte;
    private String padre_hiv___contains;
    private String padre_hiv___not___contains;
    private String padre_hiv___starts_with;
    private String padre_hiv___not___starts_with;
    private String padre_hiv___ends_with;
    private String padre_hiv___not___ends_with;
    private Integer peso1___eq;
    private Integer peso1___ne;
    private Boolean peso1___null;
    private Boolean peso1___not___null;
    private java.util.List<Integer> peso1___in;
    private java.util.List<Integer> peso1___not___in;
    private Integer peso1___lt;
    private Integer peso1___lte;
    private Integer peso1___gt;
    private Integer peso1___gte;
    private Integer peso2___eq;
    private Integer peso2___ne;
    private Boolean peso2___null;
    private Boolean peso2___not___null;
    private java.util.List<Integer> peso2___in;
    private java.util.List<Integer> peso2___not___in;
    private Integer peso2___lt;
    private Integer peso2___lte;
    private Integer peso2___gt;
    private Integer peso2___gte;
    private String probelma_ostetrico_specificare___eq;
    private String probelma_ostetrico_specificare___ne;
    private Boolean probelma_ostetrico_specificare___null;
    private Boolean probelma_ostetrico_specificare___not___null;
    private java.util.List<String> probelma_ostetrico_specificare___in;
    private java.util.List<String> probelma_ostetrico_specificare___not___in;
    private String probelma_ostetrico_specificare___lt;
    private String probelma_ostetrico_specificare___lte;
    private String probelma_ostetrico_specificare___gt;
    private String probelma_ostetrico_specificare___gte;
    private String probelma_ostetrico_specificare___contains;
    private String probelma_ostetrico_specificare___not___contains;
    private String probelma_ostetrico_specificare___starts_with;
    private String probelma_ostetrico_specificare___not___starts_with;
    private String probelma_ostetrico_specificare___ends_with;
    private String probelma_ostetrico_specificare___not___ends_with;
    private String problema_ostetrico_nome___eq;
    private String problema_ostetrico_nome___ne;
    private Boolean problema_ostetrico_nome___null;
    private Boolean problema_ostetrico_nome___not___null;
    private java.util.List<String> problema_ostetrico_nome___in;
    private java.util.List<String> problema_ostetrico_nome___not___in;
    private String problema_ostetrico_nome___lt;
    private String problema_ostetrico_nome___lte;
    private String problema_ostetrico_nome___gt;
    private String problema_ostetrico_nome___gte;
    private String problema_ostetrico_nome___contains;
    private String problema_ostetrico_nome___not___contains;
    private String problema_ostetrico_nome___starts_with;
    private String problema_ostetrico_nome___not___starts_with;
    private String problema_ostetrico_nome___ends_with;
    private String problema_ostetrico_nome___not___ends_with;
    private String sesso1___eq;
    private String sesso1___ne;
    private Boolean sesso1___null;
    private Boolean sesso1___not___null;
    private java.util.List<String> sesso1___in;
    private java.util.List<String> sesso1___not___in;
    private String sesso1___lt;
    private String sesso1___lte;
    private String sesso1___gt;
    private String sesso1___gte;
    private String sesso1___contains;
    private String sesso1___not___contains;
    private String sesso1___starts_with;
    private String sesso1___not___starts_with;
    private String sesso1___ends_with;
    private String sesso1___not___ends_with;
    private String sesso2___eq;
    private String sesso2___ne;
    private Boolean sesso2___null;
    private Boolean sesso2___not___null;
    private java.util.List<String> sesso2___in;
    private java.util.List<String> sesso2___not___in;
    private String sesso2___lt;
    private String sesso2___lte;
    private String sesso2___gt;
    private String sesso2___gte;
    private String sesso2___contains;
    private String sesso2___not___contains;
    private String sesso2___starts_with;
    private String sesso2___not___starts_with;
    private String sesso2___ends_with;
    private String sesso2___not___ends_with;
    private String ultima_mestruazione___eq;
    private String ultima_mestruazione___ne;
    private Boolean ultima_mestruazione___null;
    private Boolean ultima_mestruazione___not___null;
    private java.util.List<String> ultima_mestruazione___in;
    private java.util.List<String> ultima_mestruazione___not___in;
    private String ultima_mestruazione___lt;
    private String ultima_mestruazione___lte;
    private String ultima_mestruazione___gt;
    private String ultima_mestruazione___gte;
    private java.util.List<CliGravidanzaFilterDTO> AND;
    private java.util.List<CliGravidanzaFilterDTO> OR;
    private CliGravidanzaFilterDTO NOT;

    public CliGravidanzaFilterDTO() {
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

    public String getAllattamento_seno1___eq() {
        return allattamento_seno1___eq;
    }
    public void setAllattamento_seno1___eq(String allattamento_seno1___eq) {
        this.allattamento_seno1___eq = allattamento_seno1___eq;
    }

    public String getAllattamento_seno1___ne() {
        return allattamento_seno1___ne;
    }
    public void setAllattamento_seno1___ne(String allattamento_seno1___ne) {
        this.allattamento_seno1___ne = allattamento_seno1___ne;
    }

    public Boolean getAllattamento_seno1___null() {
        return allattamento_seno1___null;
    }
    public void setAllattamento_seno1___null(Boolean allattamento_seno1___null) {
        this.allattamento_seno1___null = allattamento_seno1___null;
    }

    public Boolean getAllattamento_seno1___not___null() {
        return allattamento_seno1___not___null;
    }
    public void setAllattamento_seno1___not___null(Boolean allattamento_seno1___not___null) {
        this.allattamento_seno1___not___null = allattamento_seno1___not___null;
    }

    public java.util.List<String> getAllattamento_seno1___in() {
        return allattamento_seno1___in;
    }
    public void setAllattamento_seno1___in(java.util.List<String> allattamento_seno1___in) {
        this.allattamento_seno1___in = allattamento_seno1___in;
    }

    public java.util.List<String> getAllattamento_seno1___not___in() {
        return allattamento_seno1___not___in;
    }
    public void setAllattamento_seno1___not___in(java.util.List<String> allattamento_seno1___not___in) {
        this.allattamento_seno1___not___in = allattamento_seno1___not___in;
    }

    public String getAllattamento_seno1___lt() {
        return allattamento_seno1___lt;
    }
    public void setAllattamento_seno1___lt(String allattamento_seno1___lt) {
        this.allattamento_seno1___lt = allattamento_seno1___lt;
    }

    public String getAllattamento_seno1___lte() {
        return allattamento_seno1___lte;
    }
    public void setAllattamento_seno1___lte(String allattamento_seno1___lte) {
        this.allattamento_seno1___lte = allattamento_seno1___lte;
    }

    public String getAllattamento_seno1___gt() {
        return allattamento_seno1___gt;
    }
    public void setAllattamento_seno1___gt(String allattamento_seno1___gt) {
        this.allattamento_seno1___gt = allattamento_seno1___gt;
    }

    public String getAllattamento_seno1___gte() {
        return allattamento_seno1___gte;
    }
    public void setAllattamento_seno1___gte(String allattamento_seno1___gte) {
        this.allattamento_seno1___gte = allattamento_seno1___gte;
    }

    public String getAllattamento_seno1___contains() {
        return allattamento_seno1___contains;
    }
    public void setAllattamento_seno1___contains(String allattamento_seno1___contains) {
        this.allattamento_seno1___contains = allattamento_seno1___contains;
    }

    public String getAllattamento_seno1___not___contains() {
        return allattamento_seno1___not___contains;
    }
    public void setAllattamento_seno1___not___contains(String allattamento_seno1___not___contains) {
        this.allattamento_seno1___not___contains = allattamento_seno1___not___contains;
    }

    public String getAllattamento_seno1___starts_with() {
        return allattamento_seno1___starts_with;
    }
    public void setAllattamento_seno1___starts_with(String allattamento_seno1___starts_with) {
        this.allattamento_seno1___starts_with = allattamento_seno1___starts_with;
    }

    public String getAllattamento_seno1___not___starts_with() {
        return allattamento_seno1___not___starts_with;
    }
    public void setAllattamento_seno1___not___starts_with(String allattamento_seno1___not___starts_with) {
        this.allattamento_seno1___not___starts_with = allattamento_seno1___not___starts_with;
    }

    public String getAllattamento_seno1___ends_with() {
        return allattamento_seno1___ends_with;
    }
    public void setAllattamento_seno1___ends_with(String allattamento_seno1___ends_with) {
        this.allattamento_seno1___ends_with = allattamento_seno1___ends_with;
    }

    public String getAllattamento_seno1___not___ends_with() {
        return allattamento_seno1___not___ends_with;
    }
    public void setAllattamento_seno1___not___ends_with(String allattamento_seno1___not___ends_with) {
        this.allattamento_seno1___not___ends_with = allattamento_seno1___not___ends_with;
    }

    public String getAllattamento_seno2___eq() {
        return allattamento_seno2___eq;
    }
    public void setAllattamento_seno2___eq(String allattamento_seno2___eq) {
        this.allattamento_seno2___eq = allattamento_seno2___eq;
    }

    public String getAllattamento_seno2___ne() {
        return allattamento_seno2___ne;
    }
    public void setAllattamento_seno2___ne(String allattamento_seno2___ne) {
        this.allattamento_seno2___ne = allattamento_seno2___ne;
    }

    public Boolean getAllattamento_seno2___null() {
        return allattamento_seno2___null;
    }
    public void setAllattamento_seno2___null(Boolean allattamento_seno2___null) {
        this.allattamento_seno2___null = allattamento_seno2___null;
    }

    public Boolean getAllattamento_seno2___not___null() {
        return allattamento_seno2___not___null;
    }
    public void setAllattamento_seno2___not___null(Boolean allattamento_seno2___not___null) {
        this.allattamento_seno2___not___null = allattamento_seno2___not___null;
    }

    public java.util.List<String> getAllattamento_seno2___in() {
        return allattamento_seno2___in;
    }
    public void setAllattamento_seno2___in(java.util.List<String> allattamento_seno2___in) {
        this.allattamento_seno2___in = allattamento_seno2___in;
    }

    public java.util.List<String> getAllattamento_seno2___not___in() {
        return allattamento_seno2___not___in;
    }
    public void setAllattamento_seno2___not___in(java.util.List<String> allattamento_seno2___not___in) {
        this.allattamento_seno2___not___in = allattamento_seno2___not___in;
    }

    public String getAllattamento_seno2___lt() {
        return allattamento_seno2___lt;
    }
    public void setAllattamento_seno2___lt(String allattamento_seno2___lt) {
        this.allattamento_seno2___lt = allattamento_seno2___lt;
    }

    public String getAllattamento_seno2___lte() {
        return allattamento_seno2___lte;
    }
    public void setAllattamento_seno2___lte(String allattamento_seno2___lte) {
        this.allattamento_seno2___lte = allattamento_seno2___lte;
    }

    public String getAllattamento_seno2___gt() {
        return allattamento_seno2___gt;
    }
    public void setAllattamento_seno2___gt(String allattamento_seno2___gt) {
        this.allattamento_seno2___gt = allattamento_seno2___gt;
    }

    public String getAllattamento_seno2___gte() {
        return allattamento_seno2___gte;
    }
    public void setAllattamento_seno2___gte(String allattamento_seno2___gte) {
        this.allattamento_seno2___gte = allattamento_seno2___gte;
    }

    public String getAllattamento_seno2___contains() {
        return allattamento_seno2___contains;
    }
    public void setAllattamento_seno2___contains(String allattamento_seno2___contains) {
        this.allattamento_seno2___contains = allattamento_seno2___contains;
    }

    public String getAllattamento_seno2___not___contains() {
        return allattamento_seno2___not___contains;
    }
    public void setAllattamento_seno2___not___contains(String allattamento_seno2___not___contains) {
        this.allattamento_seno2___not___contains = allattamento_seno2___not___contains;
    }

    public String getAllattamento_seno2___starts_with() {
        return allattamento_seno2___starts_with;
    }
    public void setAllattamento_seno2___starts_with(String allattamento_seno2___starts_with) {
        this.allattamento_seno2___starts_with = allattamento_seno2___starts_with;
    }

    public String getAllattamento_seno2___not___starts_with() {
        return allattamento_seno2___not___starts_with;
    }
    public void setAllattamento_seno2___not___starts_with(String allattamento_seno2___not___starts_with) {
        this.allattamento_seno2___not___starts_with = allattamento_seno2___not___starts_with;
    }

    public String getAllattamento_seno2___ends_with() {
        return allattamento_seno2___ends_with;
    }
    public void setAllattamento_seno2___ends_with(String allattamento_seno2___ends_with) {
        this.allattamento_seno2___ends_with = allattamento_seno2___ends_with;
    }

    public String getAllattamento_seno2___not___ends_with() {
        return allattamento_seno2___not___ends_with;
    }
    public void setAllattamento_seno2___not___ends_with(String allattamento_seno2___not___ends_with) {
        this.allattamento_seno2___not___ends_with = allattamento_seno2___not___ends_with;
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

    public String getData_esito___eq() {
        return data_esito___eq;
    }
    public void setData_esito___eq(String data_esito___eq) {
        this.data_esito___eq = data_esito___eq;
    }

    public String getData_esito___ne() {
        return data_esito___ne;
    }
    public void setData_esito___ne(String data_esito___ne) {
        this.data_esito___ne = data_esito___ne;
    }

    public Boolean getData_esito___null() {
        return data_esito___null;
    }
    public void setData_esito___null(Boolean data_esito___null) {
        this.data_esito___null = data_esito___null;
    }

    public Boolean getData_esito___not___null() {
        return data_esito___not___null;
    }
    public void setData_esito___not___null(Boolean data_esito___not___null) {
        this.data_esito___not___null = data_esito___not___null;
    }

    public java.util.List<String> getData_esito___in() {
        return data_esito___in;
    }
    public void setData_esito___in(java.util.List<String> data_esito___in) {
        this.data_esito___in = data_esito___in;
    }

    public java.util.List<String> getData_esito___not___in() {
        return data_esito___not___in;
    }
    public void setData_esito___not___in(java.util.List<String> data_esito___not___in) {
        this.data_esito___not___in = data_esito___not___in;
    }

    public String getData_esito___lt() {
        return data_esito___lt;
    }
    public void setData_esito___lt(String data_esito___lt) {
        this.data_esito___lt = data_esito___lt;
    }

    public String getData_esito___lte() {
        return data_esito___lte;
    }
    public void setData_esito___lte(String data_esito___lte) {
        this.data_esito___lte = data_esito___lte;
    }

    public String getData_esito___gt() {
        return data_esito___gt;
    }
    public void setData_esito___gt(String data_esito___gt) {
        this.data_esito___gt = data_esito___gt;
    }

    public String getData_esito___gte() {
        return data_esito___gte;
    }
    public void setData_esito___gte(String data_esito___gte) {
        this.data_esito___gte = data_esito___gte;
    }

    public Integer getEta_gestazionale___eq() {
        return eta_gestazionale___eq;
    }
    public void setEta_gestazionale___eq(Integer eta_gestazionale___eq) {
        this.eta_gestazionale___eq = eta_gestazionale___eq;
    }

    public Integer getEta_gestazionale___ne() {
        return eta_gestazionale___ne;
    }
    public void setEta_gestazionale___ne(Integer eta_gestazionale___ne) {
        this.eta_gestazionale___ne = eta_gestazionale___ne;
    }

    public Boolean getEta_gestazionale___null() {
        return eta_gestazionale___null;
    }
    public void setEta_gestazionale___null(Boolean eta_gestazionale___null) {
        this.eta_gestazionale___null = eta_gestazionale___null;
    }

    public Boolean getEta_gestazionale___not___null() {
        return eta_gestazionale___not___null;
    }
    public void setEta_gestazionale___not___null(Boolean eta_gestazionale___not___null) {
        this.eta_gestazionale___not___null = eta_gestazionale___not___null;
    }

    public java.util.List<Integer> getEta_gestazionale___in() {
        return eta_gestazionale___in;
    }
    public void setEta_gestazionale___in(java.util.List<Integer> eta_gestazionale___in) {
        this.eta_gestazionale___in = eta_gestazionale___in;
    }

    public java.util.List<Integer> getEta_gestazionale___not___in() {
        return eta_gestazionale___not___in;
    }
    public void setEta_gestazionale___not___in(java.util.List<Integer> eta_gestazionale___not___in) {
        this.eta_gestazionale___not___in = eta_gestazionale___not___in;
    }

    public Integer getEta_gestazionale___lt() {
        return eta_gestazionale___lt;
    }
    public void setEta_gestazionale___lt(Integer eta_gestazionale___lt) {
        this.eta_gestazionale___lt = eta_gestazionale___lt;
    }

    public Integer getEta_gestazionale___lte() {
        return eta_gestazionale___lte;
    }
    public void setEta_gestazionale___lte(Integer eta_gestazionale___lte) {
        this.eta_gestazionale___lte = eta_gestazionale___lte;
    }

    public Integer getEta_gestazionale___gt() {
        return eta_gestazionale___gt;
    }
    public void setEta_gestazionale___gt(Integer eta_gestazionale___gt) {
        this.eta_gestazionale___gt = eta_gestazionale___gt;
    }

    public Integer getEta_gestazionale___gte() {
        return eta_gestazionale___gte;
    }
    public void setEta_gestazionale___gte(Integer eta_gestazionale___gte) {
        this.eta_gestazionale___gte = eta_gestazionale___gte;
    }

    public Integer getNeonati___eq() {
        return neonati___eq;
    }
    public void setNeonati___eq(Integer neonati___eq) {
        this.neonati___eq = neonati___eq;
    }

    public Integer getNeonati___ne() {
        return neonati___ne;
    }
    public void setNeonati___ne(Integer neonati___ne) {
        this.neonati___ne = neonati___ne;
    }

    public Boolean getNeonati___null() {
        return neonati___null;
    }
    public void setNeonati___null(Boolean neonati___null) {
        this.neonati___null = neonati___null;
    }

    public Boolean getNeonati___not___null() {
        return neonati___not___null;
    }
    public void setNeonati___not___null(Boolean neonati___not___null) {
        this.neonati___not___null = neonati___not___null;
    }

    public java.util.List<Integer> getNeonati___in() {
        return neonati___in;
    }
    public void setNeonati___in(java.util.List<Integer> neonati___in) {
        this.neonati___in = neonati___in;
    }

    public java.util.List<Integer> getNeonati___not___in() {
        return neonati___not___in;
    }
    public void setNeonati___not___in(java.util.List<Integer> neonati___not___in) {
        this.neonati___not___in = neonati___not___in;
    }

    public Integer getNeonati___lt() {
        return neonati___lt;
    }
    public void setNeonati___lt(Integer neonati___lt) {
        this.neonati___lt = neonati___lt;
    }

    public Integer getNeonati___lte() {
        return neonati___lte;
    }
    public void setNeonati___lte(Integer neonati___lte) {
        this.neonati___lte = neonati___lte;
    }

    public Integer getNeonati___gt() {
        return neonati___gt;
    }
    public void setNeonati___gt(Integer neonati___gt) {
        this.neonati___gt = neonati___gt;
    }

    public Integer getNeonati___gte() {
        return neonati___gte;
    }
    public void setNeonati___gte(Integer neonati___gte) {
        this.neonati___gte = neonati___gte;
    }

    public String getNote___eq() {
        return note___eq;
    }
    public void setNote___eq(String note___eq) {
        this.note___eq = note___eq;
    }

    public String getNote___ne() {
        return note___ne;
    }
    public void setNote___ne(String note___ne) {
        this.note___ne = note___ne;
    }

    public Boolean getNote___null() {
        return note___null;
    }
    public void setNote___null(Boolean note___null) {
        this.note___null = note___null;
    }

    public Boolean getNote___not___null() {
        return note___not___null;
    }
    public void setNote___not___null(Boolean note___not___null) {
        this.note___not___null = note___not___null;
    }

    public java.util.List<String> getNote___in() {
        return note___in;
    }
    public void setNote___in(java.util.List<String> note___in) {
        this.note___in = note___in;
    }

    public java.util.List<String> getNote___not___in() {
        return note___not___in;
    }
    public void setNote___not___in(java.util.List<String> note___not___in) {
        this.note___not___in = note___not___in;
    }

    public String getNote___lt() {
        return note___lt;
    }
    public void setNote___lt(String note___lt) {
        this.note___lt = note___lt;
    }

    public String getNote___lte() {
        return note___lte;
    }
    public void setNote___lte(String note___lte) {
        this.note___lte = note___lte;
    }

    public String getNote___gt() {
        return note___gt;
    }
    public void setNote___gt(String note___gt) {
        this.note___gt = note___gt;
    }

    public String getNote___gte() {
        return note___gte;
    }
    public void setNote___gte(String note___gte) {
        this.note___gte = note___gte;
    }

    public String getNote___contains() {
        return note___contains;
    }
    public void setNote___contains(String note___contains) {
        this.note___contains = note___contains;
    }

    public String getNote___not___contains() {
        return note___not___contains;
    }
    public void setNote___not___contains(String note___not___contains) {
        this.note___not___contains = note___not___contains;
    }

    public String getNote___starts_with() {
        return note___starts_with;
    }
    public void setNote___starts_with(String note___starts_with) {
        this.note___starts_with = note___starts_with;
    }

    public String getNote___not___starts_with() {
        return note___not___starts_with;
    }
    public void setNote___not___starts_with(String note___not___starts_with) {
        this.note___not___starts_with = note___not___starts_with;
    }

    public String getNote___ends_with() {
        return note___ends_with;
    }
    public void setNote___ends_with(String note___ends_with) {
        this.note___ends_with = note___ends_with;
    }

    public String getNote___not___ends_with() {
        return note___not___ends_with;
    }
    public void setNote___not___ends_with(String note___not___ends_with) {
        this.note___not___ends_with = note___not___ends_with;
    }

    public String getPadre_hiv___eq() {
        return padre_hiv___eq;
    }
    public void setPadre_hiv___eq(String padre_hiv___eq) {
        this.padre_hiv___eq = padre_hiv___eq;
    }

    public String getPadre_hiv___ne() {
        return padre_hiv___ne;
    }
    public void setPadre_hiv___ne(String padre_hiv___ne) {
        this.padre_hiv___ne = padre_hiv___ne;
    }

    public Boolean getPadre_hiv___null() {
        return padre_hiv___null;
    }
    public void setPadre_hiv___null(Boolean padre_hiv___null) {
        this.padre_hiv___null = padre_hiv___null;
    }

    public Boolean getPadre_hiv___not___null() {
        return padre_hiv___not___null;
    }
    public void setPadre_hiv___not___null(Boolean padre_hiv___not___null) {
        this.padre_hiv___not___null = padre_hiv___not___null;
    }

    public java.util.List<String> getPadre_hiv___in() {
        return padre_hiv___in;
    }
    public void setPadre_hiv___in(java.util.List<String> padre_hiv___in) {
        this.padre_hiv___in = padre_hiv___in;
    }

    public java.util.List<String> getPadre_hiv___not___in() {
        return padre_hiv___not___in;
    }
    public void setPadre_hiv___not___in(java.util.List<String> padre_hiv___not___in) {
        this.padre_hiv___not___in = padre_hiv___not___in;
    }

    public String getPadre_hiv___lt() {
        return padre_hiv___lt;
    }
    public void setPadre_hiv___lt(String padre_hiv___lt) {
        this.padre_hiv___lt = padre_hiv___lt;
    }

    public String getPadre_hiv___lte() {
        return padre_hiv___lte;
    }
    public void setPadre_hiv___lte(String padre_hiv___lte) {
        this.padre_hiv___lte = padre_hiv___lte;
    }

    public String getPadre_hiv___gt() {
        return padre_hiv___gt;
    }
    public void setPadre_hiv___gt(String padre_hiv___gt) {
        this.padre_hiv___gt = padre_hiv___gt;
    }

    public String getPadre_hiv___gte() {
        return padre_hiv___gte;
    }
    public void setPadre_hiv___gte(String padre_hiv___gte) {
        this.padre_hiv___gte = padre_hiv___gte;
    }

    public String getPadre_hiv___contains() {
        return padre_hiv___contains;
    }
    public void setPadre_hiv___contains(String padre_hiv___contains) {
        this.padre_hiv___contains = padre_hiv___contains;
    }

    public String getPadre_hiv___not___contains() {
        return padre_hiv___not___contains;
    }
    public void setPadre_hiv___not___contains(String padre_hiv___not___contains) {
        this.padre_hiv___not___contains = padre_hiv___not___contains;
    }

    public String getPadre_hiv___starts_with() {
        return padre_hiv___starts_with;
    }
    public void setPadre_hiv___starts_with(String padre_hiv___starts_with) {
        this.padre_hiv___starts_with = padre_hiv___starts_with;
    }

    public String getPadre_hiv___not___starts_with() {
        return padre_hiv___not___starts_with;
    }
    public void setPadre_hiv___not___starts_with(String padre_hiv___not___starts_with) {
        this.padre_hiv___not___starts_with = padre_hiv___not___starts_with;
    }

    public String getPadre_hiv___ends_with() {
        return padre_hiv___ends_with;
    }
    public void setPadre_hiv___ends_with(String padre_hiv___ends_with) {
        this.padre_hiv___ends_with = padre_hiv___ends_with;
    }

    public String getPadre_hiv___not___ends_with() {
        return padre_hiv___not___ends_with;
    }
    public void setPadre_hiv___not___ends_with(String padre_hiv___not___ends_with) {
        this.padre_hiv___not___ends_with = padre_hiv___not___ends_with;
    }

    public Integer getPeso1___eq() {
        return peso1___eq;
    }
    public void setPeso1___eq(Integer peso1___eq) {
        this.peso1___eq = peso1___eq;
    }

    public Integer getPeso1___ne() {
        return peso1___ne;
    }
    public void setPeso1___ne(Integer peso1___ne) {
        this.peso1___ne = peso1___ne;
    }

    public Boolean getPeso1___null() {
        return peso1___null;
    }
    public void setPeso1___null(Boolean peso1___null) {
        this.peso1___null = peso1___null;
    }

    public Boolean getPeso1___not___null() {
        return peso1___not___null;
    }
    public void setPeso1___not___null(Boolean peso1___not___null) {
        this.peso1___not___null = peso1___not___null;
    }

    public java.util.List<Integer> getPeso1___in() {
        return peso1___in;
    }
    public void setPeso1___in(java.util.List<Integer> peso1___in) {
        this.peso1___in = peso1___in;
    }

    public java.util.List<Integer> getPeso1___not___in() {
        return peso1___not___in;
    }
    public void setPeso1___not___in(java.util.List<Integer> peso1___not___in) {
        this.peso1___not___in = peso1___not___in;
    }

    public Integer getPeso1___lt() {
        return peso1___lt;
    }
    public void setPeso1___lt(Integer peso1___lt) {
        this.peso1___lt = peso1___lt;
    }

    public Integer getPeso1___lte() {
        return peso1___lte;
    }
    public void setPeso1___lte(Integer peso1___lte) {
        this.peso1___lte = peso1___lte;
    }

    public Integer getPeso1___gt() {
        return peso1___gt;
    }
    public void setPeso1___gt(Integer peso1___gt) {
        this.peso1___gt = peso1___gt;
    }

    public Integer getPeso1___gte() {
        return peso1___gte;
    }
    public void setPeso1___gte(Integer peso1___gte) {
        this.peso1___gte = peso1___gte;
    }

    public Integer getPeso2___eq() {
        return peso2___eq;
    }
    public void setPeso2___eq(Integer peso2___eq) {
        this.peso2___eq = peso2___eq;
    }

    public Integer getPeso2___ne() {
        return peso2___ne;
    }
    public void setPeso2___ne(Integer peso2___ne) {
        this.peso2___ne = peso2___ne;
    }

    public Boolean getPeso2___null() {
        return peso2___null;
    }
    public void setPeso2___null(Boolean peso2___null) {
        this.peso2___null = peso2___null;
    }

    public Boolean getPeso2___not___null() {
        return peso2___not___null;
    }
    public void setPeso2___not___null(Boolean peso2___not___null) {
        this.peso2___not___null = peso2___not___null;
    }

    public java.util.List<Integer> getPeso2___in() {
        return peso2___in;
    }
    public void setPeso2___in(java.util.List<Integer> peso2___in) {
        this.peso2___in = peso2___in;
    }

    public java.util.List<Integer> getPeso2___not___in() {
        return peso2___not___in;
    }
    public void setPeso2___not___in(java.util.List<Integer> peso2___not___in) {
        this.peso2___not___in = peso2___not___in;
    }

    public Integer getPeso2___lt() {
        return peso2___lt;
    }
    public void setPeso2___lt(Integer peso2___lt) {
        this.peso2___lt = peso2___lt;
    }

    public Integer getPeso2___lte() {
        return peso2___lte;
    }
    public void setPeso2___lte(Integer peso2___lte) {
        this.peso2___lte = peso2___lte;
    }

    public Integer getPeso2___gt() {
        return peso2___gt;
    }
    public void setPeso2___gt(Integer peso2___gt) {
        this.peso2___gt = peso2___gt;
    }

    public Integer getPeso2___gte() {
        return peso2___gte;
    }
    public void setPeso2___gte(Integer peso2___gte) {
        this.peso2___gte = peso2___gte;
    }

    public String getProbelma_ostetrico_specificare___eq() {
        return probelma_ostetrico_specificare___eq;
    }
    public void setProbelma_ostetrico_specificare___eq(String probelma_ostetrico_specificare___eq) {
        this.probelma_ostetrico_specificare___eq = probelma_ostetrico_specificare___eq;
    }

    public String getProbelma_ostetrico_specificare___ne() {
        return probelma_ostetrico_specificare___ne;
    }
    public void setProbelma_ostetrico_specificare___ne(String probelma_ostetrico_specificare___ne) {
        this.probelma_ostetrico_specificare___ne = probelma_ostetrico_specificare___ne;
    }

    public Boolean getProbelma_ostetrico_specificare___null() {
        return probelma_ostetrico_specificare___null;
    }
    public void setProbelma_ostetrico_specificare___null(Boolean probelma_ostetrico_specificare___null) {
        this.probelma_ostetrico_specificare___null = probelma_ostetrico_specificare___null;
    }

    public Boolean getProbelma_ostetrico_specificare___not___null() {
        return probelma_ostetrico_specificare___not___null;
    }
    public void setProbelma_ostetrico_specificare___not___null(Boolean probelma_ostetrico_specificare___not___null) {
        this.probelma_ostetrico_specificare___not___null = probelma_ostetrico_specificare___not___null;
    }

    public java.util.List<String> getProbelma_ostetrico_specificare___in() {
        return probelma_ostetrico_specificare___in;
    }
    public void setProbelma_ostetrico_specificare___in(java.util.List<String> probelma_ostetrico_specificare___in) {
        this.probelma_ostetrico_specificare___in = probelma_ostetrico_specificare___in;
    }

    public java.util.List<String> getProbelma_ostetrico_specificare___not___in() {
        return probelma_ostetrico_specificare___not___in;
    }
    public void setProbelma_ostetrico_specificare___not___in(java.util.List<String> probelma_ostetrico_specificare___not___in) {
        this.probelma_ostetrico_specificare___not___in = probelma_ostetrico_specificare___not___in;
    }

    public String getProbelma_ostetrico_specificare___lt() {
        return probelma_ostetrico_specificare___lt;
    }
    public void setProbelma_ostetrico_specificare___lt(String probelma_ostetrico_specificare___lt) {
        this.probelma_ostetrico_specificare___lt = probelma_ostetrico_specificare___lt;
    }

    public String getProbelma_ostetrico_specificare___lte() {
        return probelma_ostetrico_specificare___lte;
    }
    public void setProbelma_ostetrico_specificare___lte(String probelma_ostetrico_specificare___lte) {
        this.probelma_ostetrico_specificare___lte = probelma_ostetrico_specificare___lte;
    }

    public String getProbelma_ostetrico_specificare___gt() {
        return probelma_ostetrico_specificare___gt;
    }
    public void setProbelma_ostetrico_specificare___gt(String probelma_ostetrico_specificare___gt) {
        this.probelma_ostetrico_specificare___gt = probelma_ostetrico_specificare___gt;
    }

    public String getProbelma_ostetrico_specificare___gte() {
        return probelma_ostetrico_specificare___gte;
    }
    public void setProbelma_ostetrico_specificare___gte(String probelma_ostetrico_specificare___gte) {
        this.probelma_ostetrico_specificare___gte = probelma_ostetrico_specificare___gte;
    }

    public String getProbelma_ostetrico_specificare___contains() {
        return probelma_ostetrico_specificare___contains;
    }
    public void setProbelma_ostetrico_specificare___contains(String probelma_ostetrico_specificare___contains) {
        this.probelma_ostetrico_specificare___contains = probelma_ostetrico_specificare___contains;
    }

    public String getProbelma_ostetrico_specificare___not___contains() {
        return probelma_ostetrico_specificare___not___contains;
    }
    public void setProbelma_ostetrico_specificare___not___contains(String probelma_ostetrico_specificare___not___contains) {
        this.probelma_ostetrico_specificare___not___contains = probelma_ostetrico_specificare___not___contains;
    }

    public String getProbelma_ostetrico_specificare___starts_with() {
        return probelma_ostetrico_specificare___starts_with;
    }
    public void setProbelma_ostetrico_specificare___starts_with(String probelma_ostetrico_specificare___starts_with) {
        this.probelma_ostetrico_specificare___starts_with = probelma_ostetrico_specificare___starts_with;
    }

    public String getProbelma_ostetrico_specificare___not___starts_with() {
        return probelma_ostetrico_specificare___not___starts_with;
    }
    public void setProbelma_ostetrico_specificare___not___starts_with(String probelma_ostetrico_specificare___not___starts_with) {
        this.probelma_ostetrico_specificare___not___starts_with = probelma_ostetrico_specificare___not___starts_with;
    }

    public String getProbelma_ostetrico_specificare___ends_with() {
        return probelma_ostetrico_specificare___ends_with;
    }
    public void setProbelma_ostetrico_specificare___ends_with(String probelma_ostetrico_specificare___ends_with) {
        this.probelma_ostetrico_specificare___ends_with = probelma_ostetrico_specificare___ends_with;
    }

    public String getProbelma_ostetrico_specificare___not___ends_with() {
        return probelma_ostetrico_specificare___not___ends_with;
    }
    public void setProbelma_ostetrico_specificare___not___ends_with(String probelma_ostetrico_specificare___not___ends_with) {
        this.probelma_ostetrico_specificare___not___ends_with = probelma_ostetrico_specificare___not___ends_with;
    }

    public String getProblema_ostetrico_nome___eq() {
        return problema_ostetrico_nome___eq;
    }
    public void setProblema_ostetrico_nome___eq(String problema_ostetrico_nome___eq) {
        this.problema_ostetrico_nome___eq = problema_ostetrico_nome___eq;
    }

    public String getProblema_ostetrico_nome___ne() {
        return problema_ostetrico_nome___ne;
    }
    public void setProblema_ostetrico_nome___ne(String problema_ostetrico_nome___ne) {
        this.problema_ostetrico_nome___ne = problema_ostetrico_nome___ne;
    }

    public Boolean getProblema_ostetrico_nome___null() {
        return problema_ostetrico_nome___null;
    }
    public void setProblema_ostetrico_nome___null(Boolean problema_ostetrico_nome___null) {
        this.problema_ostetrico_nome___null = problema_ostetrico_nome___null;
    }

    public Boolean getProblema_ostetrico_nome___not___null() {
        return problema_ostetrico_nome___not___null;
    }
    public void setProblema_ostetrico_nome___not___null(Boolean problema_ostetrico_nome___not___null) {
        this.problema_ostetrico_nome___not___null = problema_ostetrico_nome___not___null;
    }

    public java.util.List<String> getProblema_ostetrico_nome___in() {
        return problema_ostetrico_nome___in;
    }
    public void setProblema_ostetrico_nome___in(java.util.List<String> problema_ostetrico_nome___in) {
        this.problema_ostetrico_nome___in = problema_ostetrico_nome___in;
    }

    public java.util.List<String> getProblema_ostetrico_nome___not___in() {
        return problema_ostetrico_nome___not___in;
    }
    public void setProblema_ostetrico_nome___not___in(java.util.List<String> problema_ostetrico_nome___not___in) {
        this.problema_ostetrico_nome___not___in = problema_ostetrico_nome___not___in;
    }

    public String getProblema_ostetrico_nome___lt() {
        return problema_ostetrico_nome___lt;
    }
    public void setProblema_ostetrico_nome___lt(String problema_ostetrico_nome___lt) {
        this.problema_ostetrico_nome___lt = problema_ostetrico_nome___lt;
    }

    public String getProblema_ostetrico_nome___lte() {
        return problema_ostetrico_nome___lte;
    }
    public void setProblema_ostetrico_nome___lte(String problema_ostetrico_nome___lte) {
        this.problema_ostetrico_nome___lte = problema_ostetrico_nome___lte;
    }

    public String getProblema_ostetrico_nome___gt() {
        return problema_ostetrico_nome___gt;
    }
    public void setProblema_ostetrico_nome___gt(String problema_ostetrico_nome___gt) {
        this.problema_ostetrico_nome___gt = problema_ostetrico_nome___gt;
    }

    public String getProblema_ostetrico_nome___gte() {
        return problema_ostetrico_nome___gte;
    }
    public void setProblema_ostetrico_nome___gte(String problema_ostetrico_nome___gte) {
        this.problema_ostetrico_nome___gte = problema_ostetrico_nome___gte;
    }

    public String getProblema_ostetrico_nome___contains() {
        return problema_ostetrico_nome___contains;
    }
    public void setProblema_ostetrico_nome___contains(String problema_ostetrico_nome___contains) {
        this.problema_ostetrico_nome___contains = problema_ostetrico_nome___contains;
    }

    public String getProblema_ostetrico_nome___not___contains() {
        return problema_ostetrico_nome___not___contains;
    }
    public void setProblema_ostetrico_nome___not___contains(String problema_ostetrico_nome___not___contains) {
        this.problema_ostetrico_nome___not___contains = problema_ostetrico_nome___not___contains;
    }

    public String getProblema_ostetrico_nome___starts_with() {
        return problema_ostetrico_nome___starts_with;
    }
    public void setProblema_ostetrico_nome___starts_with(String problema_ostetrico_nome___starts_with) {
        this.problema_ostetrico_nome___starts_with = problema_ostetrico_nome___starts_with;
    }

    public String getProblema_ostetrico_nome___not___starts_with() {
        return problema_ostetrico_nome___not___starts_with;
    }
    public void setProblema_ostetrico_nome___not___starts_with(String problema_ostetrico_nome___not___starts_with) {
        this.problema_ostetrico_nome___not___starts_with = problema_ostetrico_nome___not___starts_with;
    }

    public String getProblema_ostetrico_nome___ends_with() {
        return problema_ostetrico_nome___ends_with;
    }
    public void setProblema_ostetrico_nome___ends_with(String problema_ostetrico_nome___ends_with) {
        this.problema_ostetrico_nome___ends_with = problema_ostetrico_nome___ends_with;
    }

    public String getProblema_ostetrico_nome___not___ends_with() {
        return problema_ostetrico_nome___not___ends_with;
    }
    public void setProblema_ostetrico_nome___not___ends_with(String problema_ostetrico_nome___not___ends_with) {
        this.problema_ostetrico_nome___not___ends_with = problema_ostetrico_nome___not___ends_with;
    }

    public String getSesso1___eq() {
        return sesso1___eq;
    }
    public void setSesso1___eq(String sesso1___eq) {
        this.sesso1___eq = sesso1___eq;
    }

    public String getSesso1___ne() {
        return sesso1___ne;
    }
    public void setSesso1___ne(String sesso1___ne) {
        this.sesso1___ne = sesso1___ne;
    }

    public Boolean getSesso1___null() {
        return sesso1___null;
    }
    public void setSesso1___null(Boolean sesso1___null) {
        this.sesso1___null = sesso1___null;
    }

    public Boolean getSesso1___not___null() {
        return sesso1___not___null;
    }
    public void setSesso1___not___null(Boolean sesso1___not___null) {
        this.sesso1___not___null = sesso1___not___null;
    }

    public java.util.List<String> getSesso1___in() {
        return sesso1___in;
    }
    public void setSesso1___in(java.util.List<String> sesso1___in) {
        this.sesso1___in = sesso1___in;
    }

    public java.util.List<String> getSesso1___not___in() {
        return sesso1___not___in;
    }
    public void setSesso1___not___in(java.util.List<String> sesso1___not___in) {
        this.sesso1___not___in = sesso1___not___in;
    }

    public String getSesso1___lt() {
        return sesso1___lt;
    }
    public void setSesso1___lt(String sesso1___lt) {
        this.sesso1___lt = sesso1___lt;
    }

    public String getSesso1___lte() {
        return sesso1___lte;
    }
    public void setSesso1___lte(String sesso1___lte) {
        this.sesso1___lte = sesso1___lte;
    }

    public String getSesso1___gt() {
        return sesso1___gt;
    }
    public void setSesso1___gt(String sesso1___gt) {
        this.sesso1___gt = sesso1___gt;
    }

    public String getSesso1___gte() {
        return sesso1___gte;
    }
    public void setSesso1___gte(String sesso1___gte) {
        this.sesso1___gte = sesso1___gte;
    }

    public String getSesso1___contains() {
        return sesso1___contains;
    }
    public void setSesso1___contains(String sesso1___contains) {
        this.sesso1___contains = sesso1___contains;
    }

    public String getSesso1___not___contains() {
        return sesso1___not___contains;
    }
    public void setSesso1___not___contains(String sesso1___not___contains) {
        this.sesso1___not___contains = sesso1___not___contains;
    }

    public String getSesso1___starts_with() {
        return sesso1___starts_with;
    }
    public void setSesso1___starts_with(String sesso1___starts_with) {
        this.sesso1___starts_with = sesso1___starts_with;
    }

    public String getSesso1___not___starts_with() {
        return sesso1___not___starts_with;
    }
    public void setSesso1___not___starts_with(String sesso1___not___starts_with) {
        this.sesso1___not___starts_with = sesso1___not___starts_with;
    }

    public String getSesso1___ends_with() {
        return sesso1___ends_with;
    }
    public void setSesso1___ends_with(String sesso1___ends_with) {
        this.sesso1___ends_with = sesso1___ends_with;
    }

    public String getSesso1___not___ends_with() {
        return sesso1___not___ends_with;
    }
    public void setSesso1___not___ends_with(String sesso1___not___ends_with) {
        this.sesso1___not___ends_with = sesso1___not___ends_with;
    }

    public String getSesso2___eq() {
        return sesso2___eq;
    }
    public void setSesso2___eq(String sesso2___eq) {
        this.sesso2___eq = sesso2___eq;
    }

    public String getSesso2___ne() {
        return sesso2___ne;
    }
    public void setSesso2___ne(String sesso2___ne) {
        this.sesso2___ne = sesso2___ne;
    }

    public Boolean getSesso2___null() {
        return sesso2___null;
    }
    public void setSesso2___null(Boolean sesso2___null) {
        this.sesso2___null = sesso2___null;
    }

    public Boolean getSesso2___not___null() {
        return sesso2___not___null;
    }
    public void setSesso2___not___null(Boolean sesso2___not___null) {
        this.sesso2___not___null = sesso2___not___null;
    }

    public java.util.List<String> getSesso2___in() {
        return sesso2___in;
    }
    public void setSesso2___in(java.util.List<String> sesso2___in) {
        this.sesso2___in = sesso2___in;
    }

    public java.util.List<String> getSesso2___not___in() {
        return sesso2___not___in;
    }
    public void setSesso2___not___in(java.util.List<String> sesso2___not___in) {
        this.sesso2___not___in = sesso2___not___in;
    }

    public String getSesso2___lt() {
        return sesso2___lt;
    }
    public void setSesso2___lt(String sesso2___lt) {
        this.sesso2___lt = sesso2___lt;
    }

    public String getSesso2___lte() {
        return sesso2___lte;
    }
    public void setSesso2___lte(String sesso2___lte) {
        this.sesso2___lte = sesso2___lte;
    }

    public String getSesso2___gt() {
        return sesso2___gt;
    }
    public void setSesso2___gt(String sesso2___gt) {
        this.sesso2___gt = sesso2___gt;
    }

    public String getSesso2___gte() {
        return sesso2___gte;
    }
    public void setSesso2___gte(String sesso2___gte) {
        this.sesso2___gte = sesso2___gte;
    }

    public String getSesso2___contains() {
        return sesso2___contains;
    }
    public void setSesso2___contains(String sesso2___contains) {
        this.sesso2___contains = sesso2___contains;
    }

    public String getSesso2___not___contains() {
        return sesso2___not___contains;
    }
    public void setSesso2___not___contains(String sesso2___not___contains) {
        this.sesso2___not___contains = sesso2___not___contains;
    }

    public String getSesso2___starts_with() {
        return sesso2___starts_with;
    }
    public void setSesso2___starts_with(String sesso2___starts_with) {
        this.sesso2___starts_with = sesso2___starts_with;
    }

    public String getSesso2___not___starts_with() {
        return sesso2___not___starts_with;
    }
    public void setSesso2___not___starts_with(String sesso2___not___starts_with) {
        this.sesso2___not___starts_with = sesso2___not___starts_with;
    }

    public String getSesso2___ends_with() {
        return sesso2___ends_with;
    }
    public void setSesso2___ends_with(String sesso2___ends_with) {
        this.sesso2___ends_with = sesso2___ends_with;
    }

    public String getSesso2___not___ends_with() {
        return sesso2___not___ends_with;
    }
    public void setSesso2___not___ends_with(String sesso2___not___ends_with) {
        this.sesso2___not___ends_with = sesso2___not___ends_with;
    }

    public String getUltima_mestruazione___eq() {
        return ultima_mestruazione___eq;
    }
    public void setUltima_mestruazione___eq(String ultima_mestruazione___eq) {
        this.ultima_mestruazione___eq = ultima_mestruazione___eq;
    }

    public String getUltima_mestruazione___ne() {
        return ultima_mestruazione___ne;
    }
    public void setUltima_mestruazione___ne(String ultima_mestruazione___ne) {
        this.ultima_mestruazione___ne = ultima_mestruazione___ne;
    }

    public Boolean getUltima_mestruazione___null() {
        return ultima_mestruazione___null;
    }
    public void setUltima_mestruazione___null(Boolean ultima_mestruazione___null) {
        this.ultima_mestruazione___null = ultima_mestruazione___null;
    }

    public Boolean getUltima_mestruazione___not___null() {
        return ultima_mestruazione___not___null;
    }
    public void setUltima_mestruazione___not___null(Boolean ultima_mestruazione___not___null) {
        this.ultima_mestruazione___not___null = ultima_mestruazione___not___null;
    }

    public java.util.List<String> getUltima_mestruazione___in() {
        return ultima_mestruazione___in;
    }
    public void setUltima_mestruazione___in(java.util.List<String> ultima_mestruazione___in) {
        this.ultima_mestruazione___in = ultima_mestruazione___in;
    }

    public java.util.List<String> getUltima_mestruazione___not___in() {
        return ultima_mestruazione___not___in;
    }
    public void setUltima_mestruazione___not___in(java.util.List<String> ultima_mestruazione___not___in) {
        this.ultima_mestruazione___not___in = ultima_mestruazione___not___in;
    }

    public String getUltima_mestruazione___lt() {
        return ultima_mestruazione___lt;
    }
    public void setUltima_mestruazione___lt(String ultima_mestruazione___lt) {
        this.ultima_mestruazione___lt = ultima_mestruazione___lt;
    }

    public String getUltima_mestruazione___lte() {
        return ultima_mestruazione___lte;
    }
    public void setUltima_mestruazione___lte(String ultima_mestruazione___lte) {
        this.ultima_mestruazione___lte = ultima_mestruazione___lte;
    }

    public String getUltima_mestruazione___gt() {
        return ultima_mestruazione___gt;
    }
    public void setUltima_mestruazione___gt(String ultima_mestruazione___gt) {
        this.ultima_mestruazione___gt = ultima_mestruazione___gt;
    }

    public String getUltima_mestruazione___gte() {
        return ultima_mestruazione___gte;
    }
    public void setUltima_mestruazione___gte(String ultima_mestruazione___gte) {
        this.ultima_mestruazione___gte = ultima_mestruazione___gte;
    }

    public java.util.List<CliGravidanzaFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliGravidanzaFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliGravidanzaFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliGravidanzaFilterDTO> OR) {
        this.OR = OR;
    }

    public CliGravidanzaFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliGravidanzaFilterDTO NOT) {
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
        if (allattamento_seno1___eq != null) {
            joiner.add("allattamento_seno1___eq: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___eq));
        }
        if (allattamento_seno1___ne != null) {
            joiner.add("allattamento_seno1___ne: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___ne));
        }
        if (allattamento_seno1___null != null) {
            joiner.add("allattamento_seno1___null: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___null));
        }
        if (allattamento_seno1___not___null != null) {
            joiner.add("allattamento_seno1___not___null: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___not___null));
        }
        if (allattamento_seno1___in != null) {
            joiner.add("allattamento_seno1___in: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___in));
        }
        if (allattamento_seno1___not___in != null) {
            joiner.add("allattamento_seno1___not___in: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___not___in));
        }
        if (allattamento_seno1___lt != null) {
            joiner.add("allattamento_seno1___lt: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___lt));
        }
        if (allattamento_seno1___lte != null) {
            joiner.add("allattamento_seno1___lte: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___lte));
        }
        if (allattamento_seno1___gt != null) {
            joiner.add("allattamento_seno1___gt: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___gt));
        }
        if (allattamento_seno1___gte != null) {
            joiner.add("allattamento_seno1___gte: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___gte));
        }
        if (allattamento_seno1___contains != null) {
            joiner.add("allattamento_seno1___contains: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___contains));
        }
        if (allattamento_seno1___not___contains != null) {
            joiner.add("allattamento_seno1___not___contains: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___not___contains));
        }
        if (allattamento_seno1___starts_with != null) {
            joiner.add("allattamento_seno1___starts_with: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___starts_with));
        }
        if (allattamento_seno1___not___starts_with != null) {
            joiner.add("allattamento_seno1___not___starts_with: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___not___starts_with));
        }
        if (allattamento_seno1___ends_with != null) {
            joiner.add("allattamento_seno1___ends_with: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___ends_with));
        }
        if (allattamento_seno1___not___ends_with != null) {
            joiner.add("allattamento_seno1___not___ends_with: " + GraphQLRequestSerializer.getEntry(allattamento_seno1___not___ends_with));
        }
        if (allattamento_seno2___eq != null) {
            joiner.add("allattamento_seno2___eq: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___eq));
        }
        if (allattamento_seno2___ne != null) {
            joiner.add("allattamento_seno2___ne: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___ne));
        }
        if (allattamento_seno2___null != null) {
            joiner.add("allattamento_seno2___null: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___null));
        }
        if (allattamento_seno2___not___null != null) {
            joiner.add("allattamento_seno2___not___null: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___not___null));
        }
        if (allattamento_seno2___in != null) {
            joiner.add("allattamento_seno2___in: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___in));
        }
        if (allattamento_seno2___not___in != null) {
            joiner.add("allattamento_seno2___not___in: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___not___in));
        }
        if (allattamento_seno2___lt != null) {
            joiner.add("allattamento_seno2___lt: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___lt));
        }
        if (allattamento_seno2___lte != null) {
            joiner.add("allattamento_seno2___lte: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___lte));
        }
        if (allattamento_seno2___gt != null) {
            joiner.add("allattamento_seno2___gt: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___gt));
        }
        if (allattamento_seno2___gte != null) {
            joiner.add("allattamento_seno2___gte: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___gte));
        }
        if (allattamento_seno2___contains != null) {
            joiner.add("allattamento_seno2___contains: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___contains));
        }
        if (allattamento_seno2___not___contains != null) {
            joiner.add("allattamento_seno2___not___contains: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___not___contains));
        }
        if (allattamento_seno2___starts_with != null) {
            joiner.add("allattamento_seno2___starts_with: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___starts_with));
        }
        if (allattamento_seno2___not___starts_with != null) {
            joiner.add("allattamento_seno2___not___starts_with: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___not___starts_with));
        }
        if (allattamento_seno2___ends_with != null) {
            joiner.add("allattamento_seno2___ends_with: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___ends_with));
        }
        if (allattamento_seno2___not___ends_with != null) {
            joiner.add("allattamento_seno2___not___ends_with: " + GraphQLRequestSerializer.getEntry(allattamento_seno2___not___ends_with));
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
        if (data_esito___eq != null) {
            joiner.add("data_esito___eq: " + GraphQLRequestSerializer.getEntry(data_esito___eq));
        }
        if (data_esito___ne != null) {
            joiner.add("data_esito___ne: " + GraphQLRequestSerializer.getEntry(data_esito___ne));
        }
        if (data_esito___null != null) {
            joiner.add("data_esito___null: " + GraphQLRequestSerializer.getEntry(data_esito___null));
        }
        if (data_esito___not___null != null) {
            joiner.add("data_esito___not___null: " + GraphQLRequestSerializer.getEntry(data_esito___not___null));
        }
        if (data_esito___in != null) {
            joiner.add("data_esito___in: " + GraphQLRequestSerializer.getEntry(data_esito___in));
        }
        if (data_esito___not___in != null) {
            joiner.add("data_esito___not___in: " + GraphQLRequestSerializer.getEntry(data_esito___not___in));
        }
        if (data_esito___lt != null) {
            joiner.add("data_esito___lt: " + GraphQLRequestSerializer.getEntry(data_esito___lt));
        }
        if (data_esito___lte != null) {
            joiner.add("data_esito___lte: " + GraphQLRequestSerializer.getEntry(data_esito___lte));
        }
        if (data_esito___gt != null) {
            joiner.add("data_esito___gt: " + GraphQLRequestSerializer.getEntry(data_esito___gt));
        }
        if (data_esito___gte != null) {
            joiner.add("data_esito___gte: " + GraphQLRequestSerializer.getEntry(data_esito___gte));
        }
        if (eta_gestazionale___eq != null) {
            joiner.add("eta_gestazionale___eq: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___eq));
        }
        if (eta_gestazionale___ne != null) {
            joiner.add("eta_gestazionale___ne: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___ne));
        }
        if (eta_gestazionale___null != null) {
            joiner.add("eta_gestazionale___null: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___null));
        }
        if (eta_gestazionale___not___null != null) {
            joiner.add("eta_gestazionale___not___null: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___not___null));
        }
        if (eta_gestazionale___in != null) {
            joiner.add("eta_gestazionale___in: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___in));
        }
        if (eta_gestazionale___not___in != null) {
            joiner.add("eta_gestazionale___not___in: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___not___in));
        }
        if (eta_gestazionale___lt != null) {
            joiner.add("eta_gestazionale___lt: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___lt));
        }
        if (eta_gestazionale___lte != null) {
            joiner.add("eta_gestazionale___lte: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___lte));
        }
        if (eta_gestazionale___gt != null) {
            joiner.add("eta_gestazionale___gt: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___gt));
        }
        if (eta_gestazionale___gte != null) {
            joiner.add("eta_gestazionale___gte: " + GraphQLRequestSerializer.getEntry(eta_gestazionale___gte));
        }
        if (neonati___eq != null) {
            joiner.add("neonati___eq: " + GraphQLRequestSerializer.getEntry(neonati___eq));
        }
        if (neonati___ne != null) {
            joiner.add("neonati___ne: " + GraphQLRequestSerializer.getEntry(neonati___ne));
        }
        if (neonati___null != null) {
            joiner.add("neonati___null: " + GraphQLRequestSerializer.getEntry(neonati___null));
        }
        if (neonati___not___null != null) {
            joiner.add("neonati___not___null: " + GraphQLRequestSerializer.getEntry(neonati___not___null));
        }
        if (neonati___in != null) {
            joiner.add("neonati___in: " + GraphQLRequestSerializer.getEntry(neonati___in));
        }
        if (neonati___not___in != null) {
            joiner.add("neonati___not___in: " + GraphQLRequestSerializer.getEntry(neonati___not___in));
        }
        if (neonati___lt != null) {
            joiner.add("neonati___lt: " + GraphQLRequestSerializer.getEntry(neonati___lt));
        }
        if (neonati___lte != null) {
            joiner.add("neonati___lte: " + GraphQLRequestSerializer.getEntry(neonati___lte));
        }
        if (neonati___gt != null) {
            joiner.add("neonati___gt: " + GraphQLRequestSerializer.getEntry(neonati___gt));
        }
        if (neonati___gte != null) {
            joiner.add("neonati___gte: " + GraphQLRequestSerializer.getEntry(neonati___gte));
        }
        if (note___eq != null) {
            joiner.add("note___eq: " + GraphQLRequestSerializer.getEntry(note___eq));
        }
        if (note___ne != null) {
            joiner.add("note___ne: " + GraphQLRequestSerializer.getEntry(note___ne));
        }
        if (note___null != null) {
            joiner.add("note___null: " + GraphQLRequestSerializer.getEntry(note___null));
        }
        if (note___not___null != null) {
            joiner.add("note___not___null: " + GraphQLRequestSerializer.getEntry(note___not___null));
        }
        if (note___in != null) {
            joiner.add("note___in: " + GraphQLRequestSerializer.getEntry(note___in));
        }
        if (note___not___in != null) {
            joiner.add("note___not___in: " + GraphQLRequestSerializer.getEntry(note___not___in));
        }
        if (note___lt != null) {
            joiner.add("note___lt: " + GraphQLRequestSerializer.getEntry(note___lt));
        }
        if (note___lte != null) {
            joiner.add("note___lte: " + GraphQLRequestSerializer.getEntry(note___lte));
        }
        if (note___gt != null) {
            joiner.add("note___gt: " + GraphQLRequestSerializer.getEntry(note___gt));
        }
        if (note___gte != null) {
            joiner.add("note___gte: " + GraphQLRequestSerializer.getEntry(note___gte));
        }
        if (note___contains != null) {
            joiner.add("note___contains: " + GraphQLRequestSerializer.getEntry(note___contains));
        }
        if (note___not___contains != null) {
            joiner.add("note___not___contains: " + GraphQLRequestSerializer.getEntry(note___not___contains));
        }
        if (note___starts_with != null) {
            joiner.add("note___starts_with: " + GraphQLRequestSerializer.getEntry(note___starts_with));
        }
        if (note___not___starts_with != null) {
            joiner.add("note___not___starts_with: " + GraphQLRequestSerializer.getEntry(note___not___starts_with));
        }
        if (note___ends_with != null) {
            joiner.add("note___ends_with: " + GraphQLRequestSerializer.getEntry(note___ends_with));
        }
        if (note___not___ends_with != null) {
            joiner.add("note___not___ends_with: " + GraphQLRequestSerializer.getEntry(note___not___ends_with));
        }
        if (padre_hiv___eq != null) {
            joiner.add("padre_hiv___eq: " + GraphQLRequestSerializer.getEntry(padre_hiv___eq));
        }
        if (padre_hiv___ne != null) {
            joiner.add("padre_hiv___ne: " + GraphQLRequestSerializer.getEntry(padre_hiv___ne));
        }
        if (padre_hiv___null != null) {
            joiner.add("padre_hiv___null: " + GraphQLRequestSerializer.getEntry(padre_hiv___null));
        }
        if (padre_hiv___not___null != null) {
            joiner.add("padre_hiv___not___null: " + GraphQLRequestSerializer.getEntry(padre_hiv___not___null));
        }
        if (padre_hiv___in != null) {
            joiner.add("padre_hiv___in: " + GraphQLRequestSerializer.getEntry(padre_hiv___in));
        }
        if (padre_hiv___not___in != null) {
            joiner.add("padre_hiv___not___in: " + GraphQLRequestSerializer.getEntry(padre_hiv___not___in));
        }
        if (padre_hiv___lt != null) {
            joiner.add("padre_hiv___lt: " + GraphQLRequestSerializer.getEntry(padre_hiv___lt));
        }
        if (padre_hiv___lte != null) {
            joiner.add("padre_hiv___lte: " + GraphQLRequestSerializer.getEntry(padre_hiv___lte));
        }
        if (padre_hiv___gt != null) {
            joiner.add("padre_hiv___gt: " + GraphQLRequestSerializer.getEntry(padre_hiv___gt));
        }
        if (padre_hiv___gte != null) {
            joiner.add("padre_hiv___gte: " + GraphQLRequestSerializer.getEntry(padre_hiv___gte));
        }
        if (padre_hiv___contains != null) {
            joiner.add("padre_hiv___contains: " + GraphQLRequestSerializer.getEntry(padre_hiv___contains));
        }
        if (padre_hiv___not___contains != null) {
            joiner.add("padre_hiv___not___contains: " + GraphQLRequestSerializer.getEntry(padre_hiv___not___contains));
        }
        if (padre_hiv___starts_with != null) {
            joiner.add("padre_hiv___starts_with: " + GraphQLRequestSerializer.getEntry(padre_hiv___starts_with));
        }
        if (padre_hiv___not___starts_with != null) {
            joiner.add("padre_hiv___not___starts_with: " + GraphQLRequestSerializer.getEntry(padre_hiv___not___starts_with));
        }
        if (padre_hiv___ends_with != null) {
            joiner.add("padre_hiv___ends_with: " + GraphQLRequestSerializer.getEntry(padre_hiv___ends_with));
        }
        if (padre_hiv___not___ends_with != null) {
            joiner.add("padre_hiv___not___ends_with: " + GraphQLRequestSerializer.getEntry(padre_hiv___not___ends_with));
        }
        if (peso1___eq != null) {
            joiner.add("peso1___eq: " + GraphQLRequestSerializer.getEntry(peso1___eq));
        }
        if (peso1___ne != null) {
            joiner.add("peso1___ne: " + GraphQLRequestSerializer.getEntry(peso1___ne));
        }
        if (peso1___null != null) {
            joiner.add("peso1___null: " + GraphQLRequestSerializer.getEntry(peso1___null));
        }
        if (peso1___not___null != null) {
            joiner.add("peso1___not___null: " + GraphQLRequestSerializer.getEntry(peso1___not___null));
        }
        if (peso1___in != null) {
            joiner.add("peso1___in: " + GraphQLRequestSerializer.getEntry(peso1___in));
        }
        if (peso1___not___in != null) {
            joiner.add("peso1___not___in: " + GraphQLRequestSerializer.getEntry(peso1___not___in));
        }
        if (peso1___lt != null) {
            joiner.add("peso1___lt: " + GraphQLRequestSerializer.getEntry(peso1___lt));
        }
        if (peso1___lte != null) {
            joiner.add("peso1___lte: " + GraphQLRequestSerializer.getEntry(peso1___lte));
        }
        if (peso1___gt != null) {
            joiner.add("peso1___gt: " + GraphQLRequestSerializer.getEntry(peso1___gt));
        }
        if (peso1___gte != null) {
            joiner.add("peso1___gte: " + GraphQLRequestSerializer.getEntry(peso1___gte));
        }
        if (peso2___eq != null) {
            joiner.add("peso2___eq: " + GraphQLRequestSerializer.getEntry(peso2___eq));
        }
        if (peso2___ne != null) {
            joiner.add("peso2___ne: " + GraphQLRequestSerializer.getEntry(peso2___ne));
        }
        if (peso2___null != null) {
            joiner.add("peso2___null: " + GraphQLRequestSerializer.getEntry(peso2___null));
        }
        if (peso2___not___null != null) {
            joiner.add("peso2___not___null: " + GraphQLRequestSerializer.getEntry(peso2___not___null));
        }
        if (peso2___in != null) {
            joiner.add("peso2___in: " + GraphQLRequestSerializer.getEntry(peso2___in));
        }
        if (peso2___not___in != null) {
            joiner.add("peso2___not___in: " + GraphQLRequestSerializer.getEntry(peso2___not___in));
        }
        if (peso2___lt != null) {
            joiner.add("peso2___lt: " + GraphQLRequestSerializer.getEntry(peso2___lt));
        }
        if (peso2___lte != null) {
            joiner.add("peso2___lte: " + GraphQLRequestSerializer.getEntry(peso2___lte));
        }
        if (peso2___gt != null) {
            joiner.add("peso2___gt: " + GraphQLRequestSerializer.getEntry(peso2___gt));
        }
        if (peso2___gte != null) {
            joiner.add("peso2___gte: " + GraphQLRequestSerializer.getEntry(peso2___gte));
        }
        if (probelma_ostetrico_specificare___eq != null) {
            joiner.add("probelma_ostetrico_specificare___eq: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___eq));
        }
        if (probelma_ostetrico_specificare___ne != null) {
            joiner.add("probelma_ostetrico_specificare___ne: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___ne));
        }
        if (probelma_ostetrico_specificare___null != null) {
            joiner.add("probelma_ostetrico_specificare___null: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___null));
        }
        if (probelma_ostetrico_specificare___not___null != null) {
            joiner.add("probelma_ostetrico_specificare___not___null: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___not___null));
        }
        if (probelma_ostetrico_specificare___in != null) {
            joiner.add("probelma_ostetrico_specificare___in: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___in));
        }
        if (probelma_ostetrico_specificare___not___in != null) {
            joiner.add("probelma_ostetrico_specificare___not___in: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___not___in));
        }
        if (probelma_ostetrico_specificare___lt != null) {
            joiner.add("probelma_ostetrico_specificare___lt: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___lt));
        }
        if (probelma_ostetrico_specificare___lte != null) {
            joiner.add("probelma_ostetrico_specificare___lte: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___lte));
        }
        if (probelma_ostetrico_specificare___gt != null) {
            joiner.add("probelma_ostetrico_specificare___gt: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___gt));
        }
        if (probelma_ostetrico_specificare___gte != null) {
            joiner.add("probelma_ostetrico_specificare___gte: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___gte));
        }
        if (probelma_ostetrico_specificare___contains != null) {
            joiner.add("probelma_ostetrico_specificare___contains: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___contains));
        }
        if (probelma_ostetrico_specificare___not___contains != null) {
            joiner.add("probelma_ostetrico_specificare___not___contains: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___not___contains));
        }
        if (probelma_ostetrico_specificare___starts_with != null) {
            joiner.add("probelma_ostetrico_specificare___starts_with: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___starts_with));
        }
        if (probelma_ostetrico_specificare___not___starts_with != null) {
            joiner.add("probelma_ostetrico_specificare___not___starts_with: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___not___starts_with));
        }
        if (probelma_ostetrico_specificare___ends_with != null) {
            joiner.add("probelma_ostetrico_specificare___ends_with: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___ends_with));
        }
        if (probelma_ostetrico_specificare___not___ends_with != null) {
            joiner.add("probelma_ostetrico_specificare___not___ends_with: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare___not___ends_with));
        }
        if (problema_ostetrico_nome___eq != null) {
            joiner.add("problema_ostetrico_nome___eq: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___eq));
        }
        if (problema_ostetrico_nome___ne != null) {
            joiner.add("problema_ostetrico_nome___ne: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___ne));
        }
        if (problema_ostetrico_nome___null != null) {
            joiner.add("problema_ostetrico_nome___null: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___null));
        }
        if (problema_ostetrico_nome___not___null != null) {
            joiner.add("problema_ostetrico_nome___not___null: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___not___null));
        }
        if (problema_ostetrico_nome___in != null) {
            joiner.add("problema_ostetrico_nome___in: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___in));
        }
        if (problema_ostetrico_nome___not___in != null) {
            joiner.add("problema_ostetrico_nome___not___in: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___not___in));
        }
        if (problema_ostetrico_nome___lt != null) {
            joiner.add("problema_ostetrico_nome___lt: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___lt));
        }
        if (problema_ostetrico_nome___lte != null) {
            joiner.add("problema_ostetrico_nome___lte: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___lte));
        }
        if (problema_ostetrico_nome___gt != null) {
            joiner.add("problema_ostetrico_nome___gt: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___gt));
        }
        if (problema_ostetrico_nome___gte != null) {
            joiner.add("problema_ostetrico_nome___gte: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___gte));
        }
        if (problema_ostetrico_nome___contains != null) {
            joiner.add("problema_ostetrico_nome___contains: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___contains));
        }
        if (problema_ostetrico_nome___not___contains != null) {
            joiner.add("problema_ostetrico_nome___not___contains: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___not___contains));
        }
        if (problema_ostetrico_nome___starts_with != null) {
            joiner.add("problema_ostetrico_nome___starts_with: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___starts_with));
        }
        if (problema_ostetrico_nome___not___starts_with != null) {
            joiner.add("problema_ostetrico_nome___not___starts_with: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___not___starts_with));
        }
        if (problema_ostetrico_nome___ends_with != null) {
            joiner.add("problema_ostetrico_nome___ends_with: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___ends_with));
        }
        if (problema_ostetrico_nome___not___ends_with != null) {
            joiner.add("problema_ostetrico_nome___not___ends_with: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome___not___ends_with));
        }
        if (sesso1___eq != null) {
            joiner.add("sesso1___eq: " + GraphQLRequestSerializer.getEntry(sesso1___eq));
        }
        if (sesso1___ne != null) {
            joiner.add("sesso1___ne: " + GraphQLRequestSerializer.getEntry(sesso1___ne));
        }
        if (sesso1___null != null) {
            joiner.add("sesso1___null: " + GraphQLRequestSerializer.getEntry(sesso1___null));
        }
        if (sesso1___not___null != null) {
            joiner.add("sesso1___not___null: " + GraphQLRequestSerializer.getEntry(sesso1___not___null));
        }
        if (sesso1___in != null) {
            joiner.add("sesso1___in: " + GraphQLRequestSerializer.getEntry(sesso1___in));
        }
        if (sesso1___not___in != null) {
            joiner.add("sesso1___not___in: " + GraphQLRequestSerializer.getEntry(sesso1___not___in));
        }
        if (sesso1___lt != null) {
            joiner.add("sesso1___lt: " + GraphQLRequestSerializer.getEntry(sesso1___lt));
        }
        if (sesso1___lte != null) {
            joiner.add("sesso1___lte: " + GraphQLRequestSerializer.getEntry(sesso1___lte));
        }
        if (sesso1___gt != null) {
            joiner.add("sesso1___gt: " + GraphQLRequestSerializer.getEntry(sesso1___gt));
        }
        if (sesso1___gte != null) {
            joiner.add("sesso1___gte: " + GraphQLRequestSerializer.getEntry(sesso1___gte));
        }
        if (sesso1___contains != null) {
            joiner.add("sesso1___contains: " + GraphQLRequestSerializer.getEntry(sesso1___contains));
        }
        if (sesso1___not___contains != null) {
            joiner.add("sesso1___not___contains: " + GraphQLRequestSerializer.getEntry(sesso1___not___contains));
        }
        if (sesso1___starts_with != null) {
            joiner.add("sesso1___starts_with: " + GraphQLRequestSerializer.getEntry(sesso1___starts_with));
        }
        if (sesso1___not___starts_with != null) {
            joiner.add("sesso1___not___starts_with: " + GraphQLRequestSerializer.getEntry(sesso1___not___starts_with));
        }
        if (sesso1___ends_with != null) {
            joiner.add("sesso1___ends_with: " + GraphQLRequestSerializer.getEntry(sesso1___ends_with));
        }
        if (sesso1___not___ends_with != null) {
            joiner.add("sesso1___not___ends_with: " + GraphQLRequestSerializer.getEntry(sesso1___not___ends_with));
        }
        if (sesso2___eq != null) {
            joiner.add("sesso2___eq: " + GraphQLRequestSerializer.getEntry(sesso2___eq));
        }
        if (sesso2___ne != null) {
            joiner.add("sesso2___ne: " + GraphQLRequestSerializer.getEntry(sesso2___ne));
        }
        if (sesso2___null != null) {
            joiner.add("sesso2___null: " + GraphQLRequestSerializer.getEntry(sesso2___null));
        }
        if (sesso2___not___null != null) {
            joiner.add("sesso2___not___null: " + GraphQLRequestSerializer.getEntry(sesso2___not___null));
        }
        if (sesso2___in != null) {
            joiner.add("sesso2___in: " + GraphQLRequestSerializer.getEntry(sesso2___in));
        }
        if (sesso2___not___in != null) {
            joiner.add("sesso2___not___in: " + GraphQLRequestSerializer.getEntry(sesso2___not___in));
        }
        if (sesso2___lt != null) {
            joiner.add("sesso2___lt: " + GraphQLRequestSerializer.getEntry(sesso2___lt));
        }
        if (sesso2___lte != null) {
            joiner.add("sesso2___lte: " + GraphQLRequestSerializer.getEntry(sesso2___lte));
        }
        if (sesso2___gt != null) {
            joiner.add("sesso2___gt: " + GraphQLRequestSerializer.getEntry(sesso2___gt));
        }
        if (sesso2___gte != null) {
            joiner.add("sesso2___gte: " + GraphQLRequestSerializer.getEntry(sesso2___gte));
        }
        if (sesso2___contains != null) {
            joiner.add("sesso2___contains: " + GraphQLRequestSerializer.getEntry(sesso2___contains));
        }
        if (sesso2___not___contains != null) {
            joiner.add("sesso2___not___contains: " + GraphQLRequestSerializer.getEntry(sesso2___not___contains));
        }
        if (sesso2___starts_with != null) {
            joiner.add("sesso2___starts_with: " + GraphQLRequestSerializer.getEntry(sesso2___starts_with));
        }
        if (sesso2___not___starts_with != null) {
            joiner.add("sesso2___not___starts_with: " + GraphQLRequestSerializer.getEntry(sesso2___not___starts_with));
        }
        if (sesso2___ends_with != null) {
            joiner.add("sesso2___ends_with: " + GraphQLRequestSerializer.getEntry(sesso2___ends_with));
        }
        if (sesso2___not___ends_with != null) {
            joiner.add("sesso2___not___ends_with: " + GraphQLRequestSerializer.getEntry(sesso2___not___ends_with));
        }
        if (ultima_mestruazione___eq != null) {
            joiner.add("ultima_mestruazione___eq: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___eq));
        }
        if (ultima_mestruazione___ne != null) {
            joiner.add("ultima_mestruazione___ne: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___ne));
        }
        if (ultima_mestruazione___null != null) {
            joiner.add("ultima_mestruazione___null: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___null));
        }
        if (ultima_mestruazione___not___null != null) {
            joiner.add("ultima_mestruazione___not___null: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___not___null));
        }
        if (ultima_mestruazione___in != null) {
            joiner.add("ultima_mestruazione___in: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___in));
        }
        if (ultima_mestruazione___not___in != null) {
            joiner.add("ultima_mestruazione___not___in: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___not___in));
        }
        if (ultima_mestruazione___lt != null) {
            joiner.add("ultima_mestruazione___lt: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___lt));
        }
        if (ultima_mestruazione___lte != null) {
            joiner.add("ultima_mestruazione___lte: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___lte));
        }
        if (ultima_mestruazione___gt != null) {
            joiner.add("ultima_mestruazione___gt: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___gt));
        }
        if (ultima_mestruazione___gte != null) {
            joiner.add("ultima_mestruazione___gte: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione___gte));
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

    public static CliGravidanzaFilterDTO.Builder builder() {
        return new CliGravidanzaFilterDTO.Builder();
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
        private String allattamento_seno1___eq;
        private String allattamento_seno1___ne;
        private Boolean allattamento_seno1___null;
        private Boolean allattamento_seno1___not___null;
        private java.util.List<String> allattamento_seno1___in;
        private java.util.List<String> allattamento_seno1___not___in;
        private String allattamento_seno1___lt;
        private String allattamento_seno1___lte;
        private String allattamento_seno1___gt;
        private String allattamento_seno1___gte;
        private String allattamento_seno1___contains;
        private String allattamento_seno1___not___contains;
        private String allattamento_seno1___starts_with;
        private String allattamento_seno1___not___starts_with;
        private String allattamento_seno1___ends_with;
        private String allattamento_seno1___not___ends_with;
        private String allattamento_seno2___eq;
        private String allattamento_seno2___ne;
        private Boolean allattamento_seno2___null;
        private Boolean allattamento_seno2___not___null;
        private java.util.List<String> allattamento_seno2___in;
        private java.util.List<String> allattamento_seno2___not___in;
        private String allattamento_seno2___lt;
        private String allattamento_seno2___lte;
        private String allattamento_seno2___gt;
        private String allattamento_seno2___gte;
        private String allattamento_seno2___contains;
        private String allattamento_seno2___not___contains;
        private String allattamento_seno2___starts_with;
        private String allattamento_seno2___not___starts_with;
        private String allattamento_seno2___ends_with;
        private String allattamento_seno2___not___ends_with;
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
        private String data_esito___eq;
        private String data_esito___ne;
        private Boolean data_esito___null;
        private Boolean data_esito___not___null;
        private java.util.List<String> data_esito___in;
        private java.util.List<String> data_esito___not___in;
        private String data_esito___lt;
        private String data_esito___lte;
        private String data_esito___gt;
        private String data_esito___gte;
        private Integer eta_gestazionale___eq;
        private Integer eta_gestazionale___ne;
        private Boolean eta_gestazionale___null;
        private Boolean eta_gestazionale___not___null;
        private java.util.List<Integer> eta_gestazionale___in;
        private java.util.List<Integer> eta_gestazionale___not___in;
        private Integer eta_gestazionale___lt;
        private Integer eta_gestazionale___lte;
        private Integer eta_gestazionale___gt;
        private Integer eta_gestazionale___gte;
        private Integer neonati___eq;
        private Integer neonati___ne;
        private Boolean neonati___null;
        private Boolean neonati___not___null;
        private java.util.List<Integer> neonati___in;
        private java.util.List<Integer> neonati___not___in;
        private Integer neonati___lt;
        private Integer neonati___lte;
        private Integer neonati___gt;
        private Integer neonati___gte;
        private String note___eq;
        private String note___ne;
        private Boolean note___null;
        private Boolean note___not___null;
        private java.util.List<String> note___in;
        private java.util.List<String> note___not___in;
        private String note___lt;
        private String note___lte;
        private String note___gt;
        private String note___gte;
        private String note___contains;
        private String note___not___contains;
        private String note___starts_with;
        private String note___not___starts_with;
        private String note___ends_with;
        private String note___not___ends_with;
        private String padre_hiv___eq;
        private String padre_hiv___ne;
        private Boolean padre_hiv___null;
        private Boolean padre_hiv___not___null;
        private java.util.List<String> padre_hiv___in;
        private java.util.List<String> padre_hiv___not___in;
        private String padre_hiv___lt;
        private String padre_hiv___lte;
        private String padre_hiv___gt;
        private String padre_hiv___gte;
        private String padre_hiv___contains;
        private String padre_hiv___not___contains;
        private String padre_hiv___starts_with;
        private String padre_hiv___not___starts_with;
        private String padre_hiv___ends_with;
        private String padre_hiv___not___ends_with;
        private Integer peso1___eq;
        private Integer peso1___ne;
        private Boolean peso1___null;
        private Boolean peso1___not___null;
        private java.util.List<Integer> peso1___in;
        private java.util.List<Integer> peso1___not___in;
        private Integer peso1___lt;
        private Integer peso1___lte;
        private Integer peso1___gt;
        private Integer peso1___gte;
        private Integer peso2___eq;
        private Integer peso2___ne;
        private Boolean peso2___null;
        private Boolean peso2___not___null;
        private java.util.List<Integer> peso2___in;
        private java.util.List<Integer> peso2___not___in;
        private Integer peso2___lt;
        private Integer peso2___lte;
        private Integer peso2___gt;
        private Integer peso2___gte;
        private String probelma_ostetrico_specificare___eq;
        private String probelma_ostetrico_specificare___ne;
        private Boolean probelma_ostetrico_specificare___null;
        private Boolean probelma_ostetrico_specificare___not___null;
        private java.util.List<String> probelma_ostetrico_specificare___in;
        private java.util.List<String> probelma_ostetrico_specificare___not___in;
        private String probelma_ostetrico_specificare___lt;
        private String probelma_ostetrico_specificare___lte;
        private String probelma_ostetrico_specificare___gt;
        private String probelma_ostetrico_specificare___gte;
        private String probelma_ostetrico_specificare___contains;
        private String probelma_ostetrico_specificare___not___contains;
        private String probelma_ostetrico_specificare___starts_with;
        private String probelma_ostetrico_specificare___not___starts_with;
        private String probelma_ostetrico_specificare___ends_with;
        private String probelma_ostetrico_specificare___not___ends_with;
        private String problema_ostetrico_nome___eq;
        private String problema_ostetrico_nome___ne;
        private Boolean problema_ostetrico_nome___null;
        private Boolean problema_ostetrico_nome___not___null;
        private java.util.List<String> problema_ostetrico_nome___in;
        private java.util.List<String> problema_ostetrico_nome___not___in;
        private String problema_ostetrico_nome___lt;
        private String problema_ostetrico_nome___lte;
        private String problema_ostetrico_nome___gt;
        private String problema_ostetrico_nome___gte;
        private String problema_ostetrico_nome___contains;
        private String problema_ostetrico_nome___not___contains;
        private String problema_ostetrico_nome___starts_with;
        private String problema_ostetrico_nome___not___starts_with;
        private String problema_ostetrico_nome___ends_with;
        private String problema_ostetrico_nome___not___ends_with;
        private String sesso1___eq;
        private String sesso1___ne;
        private Boolean sesso1___null;
        private Boolean sesso1___not___null;
        private java.util.List<String> sesso1___in;
        private java.util.List<String> sesso1___not___in;
        private String sesso1___lt;
        private String sesso1___lte;
        private String sesso1___gt;
        private String sesso1___gte;
        private String sesso1___contains;
        private String sesso1___not___contains;
        private String sesso1___starts_with;
        private String sesso1___not___starts_with;
        private String sesso1___ends_with;
        private String sesso1___not___ends_with;
        private String sesso2___eq;
        private String sesso2___ne;
        private Boolean sesso2___null;
        private Boolean sesso2___not___null;
        private java.util.List<String> sesso2___in;
        private java.util.List<String> sesso2___not___in;
        private String sesso2___lt;
        private String sesso2___lte;
        private String sesso2___gt;
        private String sesso2___gte;
        private String sesso2___contains;
        private String sesso2___not___contains;
        private String sesso2___starts_with;
        private String sesso2___not___starts_with;
        private String sesso2___ends_with;
        private String sesso2___not___ends_with;
        private String ultima_mestruazione___eq;
        private String ultima_mestruazione___ne;
        private Boolean ultima_mestruazione___null;
        private Boolean ultima_mestruazione___not___null;
        private java.util.List<String> ultima_mestruazione___in;
        private java.util.List<String> ultima_mestruazione___not___in;
        private String ultima_mestruazione___lt;
        private String ultima_mestruazione___lte;
        private String ultima_mestruazione___gt;
        private String ultima_mestruazione___gte;
        private java.util.List<CliGravidanzaFilterDTO> AND;
        private java.util.List<CliGravidanzaFilterDTO> OR;
        private CliGravidanzaFilterDTO NOT;

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

        public Builder setAllattamento_seno1___eq(String allattamento_seno1___eq) {
            this.allattamento_seno1___eq = allattamento_seno1___eq;
            return this;
        }

        public Builder setAllattamento_seno1___ne(String allattamento_seno1___ne) {
            this.allattamento_seno1___ne = allattamento_seno1___ne;
            return this;
        }

        public Builder setAllattamento_seno1___null(Boolean allattamento_seno1___null) {
            this.allattamento_seno1___null = allattamento_seno1___null;
            return this;
        }

        public Builder setAllattamento_seno1___not___null(Boolean allattamento_seno1___not___null) {
            this.allattamento_seno1___not___null = allattamento_seno1___not___null;
            return this;
        }

        public Builder setAllattamento_seno1___in(java.util.List<String> allattamento_seno1___in) {
            this.allattamento_seno1___in = allattamento_seno1___in;
            return this;
        }

        public Builder setAllattamento_seno1___not___in(java.util.List<String> allattamento_seno1___not___in) {
            this.allattamento_seno1___not___in = allattamento_seno1___not___in;
            return this;
        }

        public Builder setAllattamento_seno1___lt(String allattamento_seno1___lt) {
            this.allattamento_seno1___lt = allattamento_seno1___lt;
            return this;
        }

        public Builder setAllattamento_seno1___lte(String allattamento_seno1___lte) {
            this.allattamento_seno1___lte = allattamento_seno1___lte;
            return this;
        }

        public Builder setAllattamento_seno1___gt(String allattamento_seno1___gt) {
            this.allattamento_seno1___gt = allattamento_seno1___gt;
            return this;
        }

        public Builder setAllattamento_seno1___gte(String allattamento_seno1___gte) {
            this.allattamento_seno1___gte = allattamento_seno1___gte;
            return this;
        }

        public Builder setAllattamento_seno1___contains(String allattamento_seno1___contains) {
            this.allattamento_seno1___contains = allattamento_seno1___contains;
            return this;
        }

        public Builder setAllattamento_seno1___not___contains(String allattamento_seno1___not___contains) {
            this.allattamento_seno1___not___contains = allattamento_seno1___not___contains;
            return this;
        }

        public Builder setAllattamento_seno1___starts_with(String allattamento_seno1___starts_with) {
            this.allattamento_seno1___starts_with = allattamento_seno1___starts_with;
            return this;
        }

        public Builder setAllattamento_seno1___not___starts_with(String allattamento_seno1___not___starts_with) {
            this.allattamento_seno1___not___starts_with = allattamento_seno1___not___starts_with;
            return this;
        }

        public Builder setAllattamento_seno1___ends_with(String allattamento_seno1___ends_with) {
            this.allattamento_seno1___ends_with = allattamento_seno1___ends_with;
            return this;
        }

        public Builder setAllattamento_seno1___not___ends_with(String allattamento_seno1___not___ends_with) {
            this.allattamento_seno1___not___ends_with = allattamento_seno1___not___ends_with;
            return this;
        }

        public Builder setAllattamento_seno2___eq(String allattamento_seno2___eq) {
            this.allattamento_seno2___eq = allattamento_seno2___eq;
            return this;
        }

        public Builder setAllattamento_seno2___ne(String allattamento_seno2___ne) {
            this.allattamento_seno2___ne = allattamento_seno2___ne;
            return this;
        }

        public Builder setAllattamento_seno2___null(Boolean allattamento_seno2___null) {
            this.allattamento_seno2___null = allattamento_seno2___null;
            return this;
        }

        public Builder setAllattamento_seno2___not___null(Boolean allattamento_seno2___not___null) {
            this.allattamento_seno2___not___null = allattamento_seno2___not___null;
            return this;
        }

        public Builder setAllattamento_seno2___in(java.util.List<String> allattamento_seno2___in) {
            this.allattamento_seno2___in = allattamento_seno2___in;
            return this;
        }

        public Builder setAllattamento_seno2___not___in(java.util.List<String> allattamento_seno2___not___in) {
            this.allattamento_seno2___not___in = allattamento_seno2___not___in;
            return this;
        }

        public Builder setAllattamento_seno2___lt(String allattamento_seno2___lt) {
            this.allattamento_seno2___lt = allattamento_seno2___lt;
            return this;
        }

        public Builder setAllattamento_seno2___lte(String allattamento_seno2___lte) {
            this.allattamento_seno2___lte = allattamento_seno2___lte;
            return this;
        }

        public Builder setAllattamento_seno2___gt(String allattamento_seno2___gt) {
            this.allattamento_seno2___gt = allattamento_seno2___gt;
            return this;
        }

        public Builder setAllattamento_seno2___gte(String allattamento_seno2___gte) {
            this.allattamento_seno2___gte = allattamento_seno2___gte;
            return this;
        }

        public Builder setAllattamento_seno2___contains(String allattamento_seno2___contains) {
            this.allattamento_seno2___contains = allattamento_seno2___contains;
            return this;
        }

        public Builder setAllattamento_seno2___not___contains(String allattamento_seno2___not___contains) {
            this.allattamento_seno2___not___contains = allattamento_seno2___not___contains;
            return this;
        }

        public Builder setAllattamento_seno2___starts_with(String allattamento_seno2___starts_with) {
            this.allattamento_seno2___starts_with = allattamento_seno2___starts_with;
            return this;
        }

        public Builder setAllattamento_seno2___not___starts_with(String allattamento_seno2___not___starts_with) {
            this.allattamento_seno2___not___starts_with = allattamento_seno2___not___starts_with;
            return this;
        }

        public Builder setAllattamento_seno2___ends_with(String allattamento_seno2___ends_with) {
            this.allattamento_seno2___ends_with = allattamento_seno2___ends_with;
            return this;
        }

        public Builder setAllattamento_seno2___not___ends_with(String allattamento_seno2___not___ends_with) {
            this.allattamento_seno2___not___ends_with = allattamento_seno2___not___ends_with;
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

        public Builder setData_esito___eq(String data_esito___eq) {
            this.data_esito___eq = data_esito___eq;
            return this;
        }

        public Builder setData_esito___ne(String data_esito___ne) {
            this.data_esito___ne = data_esito___ne;
            return this;
        }

        public Builder setData_esito___null(Boolean data_esito___null) {
            this.data_esito___null = data_esito___null;
            return this;
        }

        public Builder setData_esito___not___null(Boolean data_esito___not___null) {
            this.data_esito___not___null = data_esito___not___null;
            return this;
        }

        public Builder setData_esito___in(java.util.List<String> data_esito___in) {
            this.data_esito___in = data_esito___in;
            return this;
        }

        public Builder setData_esito___not___in(java.util.List<String> data_esito___not___in) {
            this.data_esito___not___in = data_esito___not___in;
            return this;
        }

        public Builder setData_esito___lt(String data_esito___lt) {
            this.data_esito___lt = data_esito___lt;
            return this;
        }

        public Builder setData_esito___lte(String data_esito___lte) {
            this.data_esito___lte = data_esito___lte;
            return this;
        }

        public Builder setData_esito___gt(String data_esito___gt) {
            this.data_esito___gt = data_esito___gt;
            return this;
        }

        public Builder setData_esito___gte(String data_esito___gte) {
            this.data_esito___gte = data_esito___gte;
            return this;
        }

        public Builder setEta_gestazionale___eq(Integer eta_gestazionale___eq) {
            this.eta_gestazionale___eq = eta_gestazionale___eq;
            return this;
        }

        public Builder setEta_gestazionale___ne(Integer eta_gestazionale___ne) {
            this.eta_gestazionale___ne = eta_gestazionale___ne;
            return this;
        }

        public Builder setEta_gestazionale___null(Boolean eta_gestazionale___null) {
            this.eta_gestazionale___null = eta_gestazionale___null;
            return this;
        }

        public Builder setEta_gestazionale___not___null(Boolean eta_gestazionale___not___null) {
            this.eta_gestazionale___not___null = eta_gestazionale___not___null;
            return this;
        }

        public Builder setEta_gestazionale___in(java.util.List<Integer> eta_gestazionale___in) {
            this.eta_gestazionale___in = eta_gestazionale___in;
            return this;
        }

        public Builder setEta_gestazionale___not___in(java.util.List<Integer> eta_gestazionale___not___in) {
            this.eta_gestazionale___not___in = eta_gestazionale___not___in;
            return this;
        }

        public Builder setEta_gestazionale___lt(Integer eta_gestazionale___lt) {
            this.eta_gestazionale___lt = eta_gestazionale___lt;
            return this;
        }

        public Builder setEta_gestazionale___lte(Integer eta_gestazionale___lte) {
            this.eta_gestazionale___lte = eta_gestazionale___lte;
            return this;
        }

        public Builder setEta_gestazionale___gt(Integer eta_gestazionale___gt) {
            this.eta_gestazionale___gt = eta_gestazionale___gt;
            return this;
        }

        public Builder setEta_gestazionale___gte(Integer eta_gestazionale___gte) {
            this.eta_gestazionale___gte = eta_gestazionale___gte;
            return this;
        }

        public Builder setNeonati___eq(Integer neonati___eq) {
            this.neonati___eq = neonati___eq;
            return this;
        }

        public Builder setNeonati___ne(Integer neonati___ne) {
            this.neonati___ne = neonati___ne;
            return this;
        }

        public Builder setNeonati___null(Boolean neonati___null) {
            this.neonati___null = neonati___null;
            return this;
        }

        public Builder setNeonati___not___null(Boolean neonati___not___null) {
            this.neonati___not___null = neonati___not___null;
            return this;
        }

        public Builder setNeonati___in(java.util.List<Integer> neonati___in) {
            this.neonati___in = neonati___in;
            return this;
        }

        public Builder setNeonati___not___in(java.util.List<Integer> neonati___not___in) {
            this.neonati___not___in = neonati___not___in;
            return this;
        }

        public Builder setNeonati___lt(Integer neonati___lt) {
            this.neonati___lt = neonati___lt;
            return this;
        }

        public Builder setNeonati___lte(Integer neonati___lte) {
            this.neonati___lte = neonati___lte;
            return this;
        }

        public Builder setNeonati___gt(Integer neonati___gt) {
            this.neonati___gt = neonati___gt;
            return this;
        }

        public Builder setNeonati___gte(Integer neonati___gte) {
            this.neonati___gte = neonati___gte;
            return this;
        }

        public Builder setNote___eq(String note___eq) {
            this.note___eq = note___eq;
            return this;
        }

        public Builder setNote___ne(String note___ne) {
            this.note___ne = note___ne;
            return this;
        }

        public Builder setNote___null(Boolean note___null) {
            this.note___null = note___null;
            return this;
        }

        public Builder setNote___not___null(Boolean note___not___null) {
            this.note___not___null = note___not___null;
            return this;
        }

        public Builder setNote___in(java.util.List<String> note___in) {
            this.note___in = note___in;
            return this;
        }

        public Builder setNote___not___in(java.util.List<String> note___not___in) {
            this.note___not___in = note___not___in;
            return this;
        }

        public Builder setNote___lt(String note___lt) {
            this.note___lt = note___lt;
            return this;
        }

        public Builder setNote___lte(String note___lte) {
            this.note___lte = note___lte;
            return this;
        }

        public Builder setNote___gt(String note___gt) {
            this.note___gt = note___gt;
            return this;
        }

        public Builder setNote___gte(String note___gte) {
            this.note___gte = note___gte;
            return this;
        }

        public Builder setNote___contains(String note___contains) {
            this.note___contains = note___contains;
            return this;
        }

        public Builder setNote___not___contains(String note___not___contains) {
            this.note___not___contains = note___not___contains;
            return this;
        }

        public Builder setNote___starts_with(String note___starts_with) {
            this.note___starts_with = note___starts_with;
            return this;
        }

        public Builder setNote___not___starts_with(String note___not___starts_with) {
            this.note___not___starts_with = note___not___starts_with;
            return this;
        }

        public Builder setNote___ends_with(String note___ends_with) {
            this.note___ends_with = note___ends_with;
            return this;
        }

        public Builder setNote___not___ends_with(String note___not___ends_with) {
            this.note___not___ends_with = note___not___ends_with;
            return this;
        }

        public Builder setPadre_hiv___eq(String padre_hiv___eq) {
            this.padre_hiv___eq = padre_hiv___eq;
            return this;
        }

        public Builder setPadre_hiv___ne(String padre_hiv___ne) {
            this.padre_hiv___ne = padre_hiv___ne;
            return this;
        }

        public Builder setPadre_hiv___null(Boolean padre_hiv___null) {
            this.padre_hiv___null = padre_hiv___null;
            return this;
        }

        public Builder setPadre_hiv___not___null(Boolean padre_hiv___not___null) {
            this.padre_hiv___not___null = padre_hiv___not___null;
            return this;
        }

        public Builder setPadre_hiv___in(java.util.List<String> padre_hiv___in) {
            this.padre_hiv___in = padre_hiv___in;
            return this;
        }

        public Builder setPadre_hiv___not___in(java.util.List<String> padre_hiv___not___in) {
            this.padre_hiv___not___in = padre_hiv___not___in;
            return this;
        }

        public Builder setPadre_hiv___lt(String padre_hiv___lt) {
            this.padre_hiv___lt = padre_hiv___lt;
            return this;
        }

        public Builder setPadre_hiv___lte(String padre_hiv___lte) {
            this.padre_hiv___lte = padre_hiv___lte;
            return this;
        }

        public Builder setPadre_hiv___gt(String padre_hiv___gt) {
            this.padre_hiv___gt = padre_hiv___gt;
            return this;
        }

        public Builder setPadre_hiv___gte(String padre_hiv___gte) {
            this.padre_hiv___gte = padre_hiv___gte;
            return this;
        }

        public Builder setPadre_hiv___contains(String padre_hiv___contains) {
            this.padre_hiv___contains = padre_hiv___contains;
            return this;
        }

        public Builder setPadre_hiv___not___contains(String padre_hiv___not___contains) {
            this.padre_hiv___not___contains = padre_hiv___not___contains;
            return this;
        }

        public Builder setPadre_hiv___starts_with(String padre_hiv___starts_with) {
            this.padre_hiv___starts_with = padre_hiv___starts_with;
            return this;
        }

        public Builder setPadre_hiv___not___starts_with(String padre_hiv___not___starts_with) {
            this.padre_hiv___not___starts_with = padre_hiv___not___starts_with;
            return this;
        }

        public Builder setPadre_hiv___ends_with(String padre_hiv___ends_with) {
            this.padre_hiv___ends_with = padre_hiv___ends_with;
            return this;
        }

        public Builder setPadre_hiv___not___ends_with(String padre_hiv___not___ends_with) {
            this.padre_hiv___not___ends_with = padre_hiv___not___ends_with;
            return this;
        }

        public Builder setPeso1___eq(Integer peso1___eq) {
            this.peso1___eq = peso1___eq;
            return this;
        }

        public Builder setPeso1___ne(Integer peso1___ne) {
            this.peso1___ne = peso1___ne;
            return this;
        }

        public Builder setPeso1___null(Boolean peso1___null) {
            this.peso1___null = peso1___null;
            return this;
        }

        public Builder setPeso1___not___null(Boolean peso1___not___null) {
            this.peso1___not___null = peso1___not___null;
            return this;
        }

        public Builder setPeso1___in(java.util.List<Integer> peso1___in) {
            this.peso1___in = peso1___in;
            return this;
        }

        public Builder setPeso1___not___in(java.util.List<Integer> peso1___not___in) {
            this.peso1___not___in = peso1___not___in;
            return this;
        }

        public Builder setPeso1___lt(Integer peso1___lt) {
            this.peso1___lt = peso1___lt;
            return this;
        }

        public Builder setPeso1___lte(Integer peso1___lte) {
            this.peso1___lte = peso1___lte;
            return this;
        }

        public Builder setPeso1___gt(Integer peso1___gt) {
            this.peso1___gt = peso1___gt;
            return this;
        }

        public Builder setPeso1___gte(Integer peso1___gte) {
            this.peso1___gte = peso1___gte;
            return this;
        }

        public Builder setPeso2___eq(Integer peso2___eq) {
            this.peso2___eq = peso2___eq;
            return this;
        }

        public Builder setPeso2___ne(Integer peso2___ne) {
            this.peso2___ne = peso2___ne;
            return this;
        }

        public Builder setPeso2___null(Boolean peso2___null) {
            this.peso2___null = peso2___null;
            return this;
        }

        public Builder setPeso2___not___null(Boolean peso2___not___null) {
            this.peso2___not___null = peso2___not___null;
            return this;
        }

        public Builder setPeso2___in(java.util.List<Integer> peso2___in) {
            this.peso2___in = peso2___in;
            return this;
        }

        public Builder setPeso2___not___in(java.util.List<Integer> peso2___not___in) {
            this.peso2___not___in = peso2___not___in;
            return this;
        }

        public Builder setPeso2___lt(Integer peso2___lt) {
            this.peso2___lt = peso2___lt;
            return this;
        }

        public Builder setPeso2___lte(Integer peso2___lte) {
            this.peso2___lte = peso2___lte;
            return this;
        }

        public Builder setPeso2___gt(Integer peso2___gt) {
            this.peso2___gt = peso2___gt;
            return this;
        }

        public Builder setPeso2___gte(Integer peso2___gte) {
            this.peso2___gte = peso2___gte;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___eq(String probelma_ostetrico_specificare___eq) {
            this.probelma_ostetrico_specificare___eq = probelma_ostetrico_specificare___eq;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___ne(String probelma_ostetrico_specificare___ne) {
            this.probelma_ostetrico_specificare___ne = probelma_ostetrico_specificare___ne;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___null(Boolean probelma_ostetrico_specificare___null) {
            this.probelma_ostetrico_specificare___null = probelma_ostetrico_specificare___null;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___not___null(Boolean probelma_ostetrico_specificare___not___null) {
            this.probelma_ostetrico_specificare___not___null = probelma_ostetrico_specificare___not___null;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___in(java.util.List<String> probelma_ostetrico_specificare___in) {
            this.probelma_ostetrico_specificare___in = probelma_ostetrico_specificare___in;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___not___in(java.util.List<String> probelma_ostetrico_specificare___not___in) {
            this.probelma_ostetrico_specificare___not___in = probelma_ostetrico_specificare___not___in;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___lt(String probelma_ostetrico_specificare___lt) {
            this.probelma_ostetrico_specificare___lt = probelma_ostetrico_specificare___lt;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___lte(String probelma_ostetrico_specificare___lte) {
            this.probelma_ostetrico_specificare___lte = probelma_ostetrico_specificare___lte;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___gt(String probelma_ostetrico_specificare___gt) {
            this.probelma_ostetrico_specificare___gt = probelma_ostetrico_specificare___gt;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___gte(String probelma_ostetrico_specificare___gte) {
            this.probelma_ostetrico_specificare___gte = probelma_ostetrico_specificare___gte;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___contains(String probelma_ostetrico_specificare___contains) {
            this.probelma_ostetrico_specificare___contains = probelma_ostetrico_specificare___contains;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___not___contains(String probelma_ostetrico_specificare___not___contains) {
            this.probelma_ostetrico_specificare___not___contains = probelma_ostetrico_specificare___not___contains;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___starts_with(String probelma_ostetrico_specificare___starts_with) {
            this.probelma_ostetrico_specificare___starts_with = probelma_ostetrico_specificare___starts_with;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___not___starts_with(String probelma_ostetrico_specificare___not___starts_with) {
            this.probelma_ostetrico_specificare___not___starts_with = probelma_ostetrico_specificare___not___starts_with;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___ends_with(String probelma_ostetrico_specificare___ends_with) {
            this.probelma_ostetrico_specificare___ends_with = probelma_ostetrico_specificare___ends_with;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare___not___ends_with(String probelma_ostetrico_specificare___not___ends_with) {
            this.probelma_ostetrico_specificare___not___ends_with = probelma_ostetrico_specificare___not___ends_with;
            return this;
        }

        public Builder setProblema_ostetrico_nome___eq(String problema_ostetrico_nome___eq) {
            this.problema_ostetrico_nome___eq = problema_ostetrico_nome___eq;
            return this;
        }

        public Builder setProblema_ostetrico_nome___ne(String problema_ostetrico_nome___ne) {
            this.problema_ostetrico_nome___ne = problema_ostetrico_nome___ne;
            return this;
        }

        public Builder setProblema_ostetrico_nome___null(Boolean problema_ostetrico_nome___null) {
            this.problema_ostetrico_nome___null = problema_ostetrico_nome___null;
            return this;
        }

        public Builder setProblema_ostetrico_nome___not___null(Boolean problema_ostetrico_nome___not___null) {
            this.problema_ostetrico_nome___not___null = problema_ostetrico_nome___not___null;
            return this;
        }

        public Builder setProblema_ostetrico_nome___in(java.util.List<String> problema_ostetrico_nome___in) {
            this.problema_ostetrico_nome___in = problema_ostetrico_nome___in;
            return this;
        }

        public Builder setProblema_ostetrico_nome___not___in(java.util.List<String> problema_ostetrico_nome___not___in) {
            this.problema_ostetrico_nome___not___in = problema_ostetrico_nome___not___in;
            return this;
        }

        public Builder setProblema_ostetrico_nome___lt(String problema_ostetrico_nome___lt) {
            this.problema_ostetrico_nome___lt = problema_ostetrico_nome___lt;
            return this;
        }

        public Builder setProblema_ostetrico_nome___lte(String problema_ostetrico_nome___lte) {
            this.problema_ostetrico_nome___lte = problema_ostetrico_nome___lte;
            return this;
        }

        public Builder setProblema_ostetrico_nome___gt(String problema_ostetrico_nome___gt) {
            this.problema_ostetrico_nome___gt = problema_ostetrico_nome___gt;
            return this;
        }

        public Builder setProblema_ostetrico_nome___gte(String problema_ostetrico_nome___gte) {
            this.problema_ostetrico_nome___gte = problema_ostetrico_nome___gte;
            return this;
        }

        public Builder setProblema_ostetrico_nome___contains(String problema_ostetrico_nome___contains) {
            this.problema_ostetrico_nome___contains = problema_ostetrico_nome___contains;
            return this;
        }

        public Builder setProblema_ostetrico_nome___not___contains(String problema_ostetrico_nome___not___contains) {
            this.problema_ostetrico_nome___not___contains = problema_ostetrico_nome___not___contains;
            return this;
        }

        public Builder setProblema_ostetrico_nome___starts_with(String problema_ostetrico_nome___starts_with) {
            this.problema_ostetrico_nome___starts_with = problema_ostetrico_nome___starts_with;
            return this;
        }

        public Builder setProblema_ostetrico_nome___not___starts_with(String problema_ostetrico_nome___not___starts_with) {
            this.problema_ostetrico_nome___not___starts_with = problema_ostetrico_nome___not___starts_with;
            return this;
        }

        public Builder setProblema_ostetrico_nome___ends_with(String problema_ostetrico_nome___ends_with) {
            this.problema_ostetrico_nome___ends_with = problema_ostetrico_nome___ends_with;
            return this;
        }

        public Builder setProblema_ostetrico_nome___not___ends_with(String problema_ostetrico_nome___not___ends_with) {
            this.problema_ostetrico_nome___not___ends_with = problema_ostetrico_nome___not___ends_with;
            return this;
        }

        public Builder setSesso1___eq(String sesso1___eq) {
            this.sesso1___eq = sesso1___eq;
            return this;
        }

        public Builder setSesso1___ne(String sesso1___ne) {
            this.sesso1___ne = sesso1___ne;
            return this;
        }

        public Builder setSesso1___null(Boolean sesso1___null) {
            this.sesso1___null = sesso1___null;
            return this;
        }

        public Builder setSesso1___not___null(Boolean sesso1___not___null) {
            this.sesso1___not___null = sesso1___not___null;
            return this;
        }

        public Builder setSesso1___in(java.util.List<String> sesso1___in) {
            this.sesso1___in = sesso1___in;
            return this;
        }

        public Builder setSesso1___not___in(java.util.List<String> sesso1___not___in) {
            this.sesso1___not___in = sesso1___not___in;
            return this;
        }

        public Builder setSesso1___lt(String sesso1___lt) {
            this.sesso1___lt = sesso1___lt;
            return this;
        }

        public Builder setSesso1___lte(String sesso1___lte) {
            this.sesso1___lte = sesso1___lte;
            return this;
        }

        public Builder setSesso1___gt(String sesso1___gt) {
            this.sesso1___gt = sesso1___gt;
            return this;
        }

        public Builder setSesso1___gte(String sesso1___gte) {
            this.sesso1___gte = sesso1___gte;
            return this;
        }

        public Builder setSesso1___contains(String sesso1___contains) {
            this.sesso1___contains = sesso1___contains;
            return this;
        }

        public Builder setSesso1___not___contains(String sesso1___not___contains) {
            this.sesso1___not___contains = sesso1___not___contains;
            return this;
        }

        public Builder setSesso1___starts_with(String sesso1___starts_with) {
            this.sesso1___starts_with = sesso1___starts_with;
            return this;
        }

        public Builder setSesso1___not___starts_with(String sesso1___not___starts_with) {
            this.sesso1___not___starts_with = sesso1___not___starts_with;
            return this;
        }

        public Builder setSesso1___ends_with(String sesso1___ends_with) {
            this.sesso1___ends_with = sesso1___ends_with;
            return this;
        }

        public Builder setSesso1___not___ends_with(String sesso1___not___ends_with) {
            this.sesso1___not___ends_with = sesso1___not___ends_with;
            return this;
        }

        public Builder setSesso2___eq(String sesso2___eq) {
            this.sesso2___eq = sesso2___eq;
            return this;
        }

        public Builder setSesso2___ne(String sesso2___ne) {
            this.sesso2___ne = sesso2___ne;
            return this;
        }

        public Builder setSesso2___null(Boolean sesso2___null) {
            this.sesso2___null = sesso2___null;
            return this;
        }

        public Builder setSesso2___not___null(Boolean sesso2___not___null) {
            this.sesso2___not___null = sesso2___not___null;
            return this;
        }

        public Builder setSesso2___in(java.util.List<String> sesso2___in) {
            this.sesso2___in = sesso2___in;
            return this;
        }

        public Builder setSesso2___not___in(java.util.List<String> sesso2___not___in) {
            this.sesso2___not___in = sesso2___not___in;
            return this;
        }

        public Builder setSesso2___lt(String sesso2___lt) {
            this.sesso2___lt = sesso2___lt;
            return this;
        }

        public Builder setSesso2___lte(String sesso2___lte) {
            this.sesso2___lte = sesso2___lte;
            return this;
        }

        public Builder setSesso2___gt(String sesso2___gt) {
            this.sesso2___gt = sesso2___gt;
            return this;
        }

        public Builder setSesso2___gte(String sesso2___gte) {
            this.sesso2___gte = sesso2___gte;
            return this;
        }

        public Builder setSesso2___contains(String sesso2___contains) {
            this.sesso2___contains = sesso2___contains;
            return this;
        }

        public Builder setSesso2___not___contains(String sesso2___not___contains) {
            this.sesso2___not___contains = sesso2___not___contains;
            return this;
        }

        public Builder setSesso2___starts_with(String sesso2___starts_with) {
            this.sesso2___starts_with = sesso2___starts_with;
            return this;
        }

        public Builder setSesso2___not___starts_with(String sesso2___not___starts_with) {
            this.sesso2___not___starts_with = sesso2___not___starts_with;
            return this;
        }

        public Builder setSesso2___ends_with(String sesso2___ends_with) {
            this.sesso2___ends_with = sesso2___ends_with;
            return this;
        }

        public Builder setSesso2___not___ends_with(String sesso2___not___ends_with) {
            this.sesso2___not___ends_with = sesso2___not___ends_with;
            return this;
        }

        public Builder setUltima_mestruazione___eq(String ultima_mestruazione___eq) {
            this.ultima_mestruazione___eq = ultima_mestruazione___eq;
            return this;
        }

        public Builder setUltima_mestruazione___ne(String ultima_mestruazione___ne) {
            this.ultima_mestruazione___ne = ultima_mestruazione___ne;
            return this;
        }

        public Builder setUltima_mestruazione___null(Boolean ultima_mestruazione___null) {
            this.ultima_mestruazione___null = ultima_mestruazione___null;
            return this;
        }

        public Builder setUltima_mestruazione___not___null(Boolean ultima_mestruazione___not___null) {
            this.ultima_mestruazione___not___null = ultima_mestruazione___not___null;
            return this;
        }

        public Builder setUltima_mestruazione___in(java.util.List<String> ultima_mestruazione___in) {
            this.ultima_mestruazione___in = ultima_mestruazione___in;
            return this;
        }

        public Builder setUltima_mestruazione___not___in(java.util.List<String> ultima_mestruazione___not___in) {
            this.ultima_mestruazione___not___in = ultima_mestruazione___not___in;
            return this;
        }

        public Builder setUltima_mestruazione___lt(String ultima_mestruazione___lt) {
            this.ultima_mestruazione___lt = ultima_mestruazione___lt;
            return this;
        }

        public Builder setUltima_mestruazione___lte(String ultima_mestruazione___lte) {
            this.ultima_mestruazione___lte = ultima_mestruazione___lte;
            return this;
        }

        public Builder setUltima_mestruazione___gt(String ultima_mestruazione___gt) {
            this.ultima_mestruazione___gt = ultima_mestruazione___gt;
            return this;
        }

        public Builder setUltima_mestruazione___gte(String ultima_mestruazione___gte) {
            this.ultima_mestruazione___gte = ultima_mestruazione___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliGravidanzaFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliGravidanzaFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliGravidanzaFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliGravidanzaFilterDTO build() {
            CliGravidanzaFilterDTO result = new CliGravidanzaFilterDTO();
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
            result.setAllattamento_seno1___eq(this.allattamento_seno1___eq);
            result.setAllattamento_seno1___ne(this.allattamento_seno1___ne);
            result.setAllattamento_seno1___null(this.allattamento_seno1___null);
            result.setAllattamento_seno1___not___null(this.allattamento_seno1___not___null);
            result.setAllattamento_seno1___in(this.allattamento_seno1___in);
            result.setAllattamento_seno1___not___in(this.allattamento_seno1___not___in);
            result.setAllattamento_seno1___lt(this.allattamento_seno1___lt);
            result.setAllattamento_seno1___lte(this.allattamento_seno1___lte);
            result.setAllattamento_seno1___gt(this.allattamento_seno1___gt);
            result.setAllattamento_seno1___gte(this.allattamento_seno1___gte);
            result.setAllattamento_seno1___contains(this.allattamento_seno1___contains);
            result.setAllattamento_seno1___not___contains(this.allattamento_seno1___not___contains);
            result.setAllattamento_seno1___starts_with(this.allattamento_seno1___starts_with);
            result.setAllattamento_seno1___not___starts_with(this.allattamento_seno1___not___starts_with);
            result.setAllattamento_seno1___ends_with(this.allattamento_seno1___ends_with);
            result.setAllattamento_seno1___not___ends_with(this.allattamento_seno1___not___ends_with);
            result.setAllattamento_seno2___eq(this.allattamento_seno2___eq);
            result.setAllattamento_seno2___ne(this.allattamento_seno2___ne);
            result.setAllattamento_seno2___null(this.allattamento_seno2___null);
            result.setAllattamento_seno2___not___null(this.allattamento_seno2___not___null);
            result.setAllattamento_seno2___in(this.allattamento_seno2___in);
            result.setAllattamento_seno2___not___in(this.allattamento_seno2___not___in);
            result.setAllattamento_seno2___lt(this.allattamento_seno2___lt);
            result.setAllattamento_seno2___lte(this.allattamento_seno2___lte);
            result.setAllattamento_seno2___gt(this.allattamento_seno2___gt);
            result.setAllattamento_seno2___gte(this.allattamento_seno2___gte);
            result.setAllattamento_seno2___contains(this.allattamento_seno2___contains);
            result.setAllattamento_seno2___not___contains(this.allattamento_seno2___not___contains);
            result.setAllattamento_seno2___starts_with(this.allattamento_seno2___starts_with);
            result.setAllattamento_seno2___not___starts_with(this.allattamento_seno2___not___starts_with);
            result.setAllattamento_seno2___ends_with(this.allattamento_seno2___ends_with);
            result.setAllattamento_seno2___not___ends_with(this.allattamento_seno2___not___ends_with);
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
            result.setData_esito___eq(this.data_esito___eq);
            result.setData_esito___ne(this.data_esito___ne);
            result.setData_esito___null(this.data_esito___null);
            result.setData_esito___not___null(this.data_esito___not___null);
            result.setData_esito___in(this.data_esito___in);
            result.setData_esito___not___in(this.data_esito___not___in);
            result.setData_esito___lt(this.data_esito___lt);
            result.setData_esito___lte(this.data_esito___lte);
            result.setData_esito___gt(this.data_esito___gt);
            result.setData_esito___gte(this.data_esito___gte);
            result.setEta_gestazionale___eq(this.eta_gestazionale___eq);
            result.setEta_gestazionale___ne(this.eta_gestazionale___ne);
            result.setEta_gestazionale___null(this.eta_gestazionale___null);
            result.setEta_gestazionale___not___null(this.eta_gestazionale___not___null);
            result.setEta_gestazionale___in(this.eta_gestazionale___in);
            result.setEta_gestazionale___not___in(this.eta_gestazionale___not___in);
            result.setEta_gestazionale___lt(this.eta_gestazionale___lt);
            result.setEta_gestazionale___lte(this.eta_gestazionale___lte);
            result.setEta_gestazionale___gt(this.eta_gestazionale___gt);
            result.setEta_gestazionale___gte(this.eta_gestazionale___gte);
            result.setNeonati___eq(this.neonati___eq);
            result.setNeonati___ne(this.neonati___ne);
            result.setNeonati___null(this.neonati___null);
            result.setNeonati___not___null(this.neonati___not___null);
            result.setNeonati___in(this.neonati___in);
            result.setNeonati___not___in(this.neonati___not___in);
            result.setNeonati___lt(this.neonati___lt);
            result.setNeonati___lte(this.neonati___lte);
            result.setNeonati___gt(this.neonati___gt);
            result.setNeonati___gte(this.neonati___gte);
            result.setNote___eq(this.note___eq);
            result.setNote___ne(this.note___ne);
            result.setNote___null(this.note___null);
            result.setNote___not___null(this.note___not___null);
            result.setNote___in(this.note___in);
            result.setNote___not___in(this.note___not___in);
            result.setNote___lt(this.note___lt);
            result.setNote___lte(this.note___lte);
            result.setNote___gt(this.note___gt);
            result.setNote___gte(this.note___gte);
            result.setNote___contains(this.note___contains);
            result.setNote___not___contains(this.note___not___contains);
            result.setNote___starts_with(this.note___starts_with);
            result.setNote___not___starts_with(this.note___not___starts_with);
            result.setNote___ends_with(this.note___ends_with);
            result.setNote___not___ends_with(this.note___not___ends_with);
            result.setPadre_hiv___eq(this.padre_hiv___eq);
            result.setPadre_hiv___ne(this.padre_hiv___ne);
            result.setPadre_hiv___null(this.padre_hiv___null);
            result.setPadre_hiv___not___null(this.padre_hiv___not___null);
            result.setPadre_hiv___in(this.padre_hiv___in);
            result.setPadre_hiv___not___in(this.padre_hiv___not___in);
            result.setPadre_hiv___lt(this.padre_hiv___lt);
            result.setPadre_hiv___lte(this.padre_hiv___lte);
            result.setPadre_hiv___gt(this.padre_hiv___gt);
            result.setPadre_hiv___gte(this.padre_hiv___gte);
            result.setPadre_hiv___contains(this.padre_hiv___contains);
            result.setPadre_hiv___not___contains(this.padre_hiv___not___contains);
            result.setPadre_hiv___starts_with(this.padre_hiv___starts_with);
            result.setPadre_hiv___not___starts_with(this.padre_hiv___not___starts_with);
            result.setPadre_hiv___ends_with(this.padre_hiv___ends_with);
            result.setPadre_hiv___not___ends_with(this.padre_hiv___not___ends_with);
            result.setPeso1___eq(this.peso1___eq);
            result.setPeso1___ne(this.peso1___ne);
            result.setPeso1___null(this.peso1___null);
            result.setPeso1___not___null(this.peso1___not___null);
            result.setPeso1___in(this.peso1___in);
            result.setPeso1___not___in(this.peso1___not___in);
            result.setPeso1___lt(this.peso1___lt);
            result.setPeso1___lte(this.peso1___lte);
            result.setPeso1___gt(this.peso1___gt);
            result.setPeso1___gte(this.peso1___gte);
            result.setPeso2___eq(this.peso2___eq);
            result.setPeso2___ne(this.peso2___ne);
            result.setPeso2___null(this.peso2___null);
            result.setPeso2___not___null(this.peso2___not___null);
            result.setPeso2___in(this.peso2___in);
            result.setPeso2___not___in(this.peso2___not___in);
            result.setPeso2___lt(this.peso2___lt);
            result.setPeso2___lte(this.peso2___lte);
            result.setPeso2___gt(this.peso2___gt);
            result.setPeso2___gte(this.peso2___gte);
            result.setProbelma_ostetrico_specificare___eq(this.probelma_ostetrico_specificare___eq);
            result.setProbelma_ostetrico_specificare___ne(this.probelma_ostetrico_specificare___ne);
            result.setProbelma_ostetrico_specificare___null(this.probelma_ostetrico_specificare___null);
            result.setProbelma_ostetrico_specificare___not___null(this.probelma_ostetrico_specificare___not___null);
            result.setProbelma_ostetrico_specificare___in(this.probelma_ostetrico_specificare___in);
            result.setProbelma_ostetrico_specificare___not___in(this.probelma_ostetrico_specificare___not___in);
            result.setProbelma_ostetrico_specificare___lt(this.probelma_ostetrico_specificare___lt);
            result.setProbelma_ostetrico_specificare___lte(this.probelma_ostetrico_specificare___lte);
            result.setProbelma_ostetrico_specificare___gt(this.probelma_ostetrico_specificare___gt);
            result.setProbelma_ostetrico_specificare___gte(this.probelma_ostetrico_specificare___gte);
            result.setProbelma_ostetrico_specificare___contains(this.probelma_ostetrico_specificare___contains);
            result.setProbelma_ostetrico_specificare___not___contains(this.probelma_ostetrico_specificare___not___contains);
            result.setProbelma_ostetrico_specificare___starts_with(this.probelma_ostetrico_specificare___starts_with);
            result.setProbelma_ostetrico_specificare___not___starts_with(this.probelma_ostetrico_specificare___not___starts_with);
            result.setProbelma_ostetrico_specificare___ends_with(this.probelma_ostetrico_specificare___ends_with);
            result.setProbelma_ostetrico_specificare___not___ends_with(this.probelma_ostetrico_specificare___not___ends_with);
            result.setProblema_ostetrico_nome___eq(this.problema_ostetrico_nome___eq);
            result.setProblema_ostetrico_nome___ne(this.problema_ostetrico_nome___ne);
            result.setProblema_ostetrico_nome___null(this.problema_ostetrico_nome___null);
            result.setProblema_ostetrico_nome___not___null(this.problema_ostetrico_nome___not___null);
            result.setProblema_ostetrico_nome___in(this.problema_ostetrico_nome___in);
            result.setProblema_ostetrico_nome___not___in(this.problema_ostetrico_nome___not___in);
            result.setProblema_ostetrico_nome___lt(this.problema_ostetrico_nome___lt);
            result.setProblema_ostetrico_nome___lte(this.problema_ostetrico_nome___lte);
            result.setProblema_ostetrico_nome___gt(this.problema_ostetrico_nome___gt);
            result.setProblema_ostetrico_nome___gte(this.problema_ostetrico_nome___gte);
            result.setProblema_ostetrico_nome___contains(this.problema_ostetrico_nome___contains);
            result.setProblema_ostetrico_nome___not___contains(this.problema_ostetrico_nome___not___contains);
            result.setProblema_ostetrico_nome___starts_with(this.problema_ostetrico_nome___starts_with);
            result.setProblema_ostetrico_nome___not___starts_with(this.problema_ostetrico_nome___not___starts_with);
            result.setProblema_ostetrico_nome___ends_with(this.problema_ostetrico_nome___ends_with);
            result.setProblema_ostetrico_nome___not___ends_with(this.problema_ostetrico_nome___not___ends_with);
            result.setSesso1___eq(this.sesso1___eq);
            result.setSesso1___ne(this.sesso1___ne);
            result.setSesso1___null(this.sesso1___null);
            result.setSesso1___not___null(this.sesso1___not___null);
            result.setSesso1___in(this.sesso1___in);
            result.setSesso1___not___in(this.sesso1___not___in);
            result.setSesso1___lt(this.sesso1___lt);
            result.setSesso1___lte(this.sesso1___lte);
            result.setSesso1___gt(this.sesso1___gt);
            result.setSesso1___gte(this.sesso1___gte);
            result.setSesso1___contains(this.sesso1___contains);
            result.setSesso1___not___contains(this.sesso1___not___contains);
            result.setSesso1___starts_with(this.sesso1___starts_with);
            result.setSesso1___not___starts_with(this.sesso1___not___starts_with);
            result.setSesso1___ends_with(this.sesso1___ends_with);
            result.setSesso1___not___ends_with(this.sesso1___not___ends_with);
            result.setSesso2___eq(this.sesso2___eq);
            result.setSesso2___ne(this.sesso2___ne);
            result.setSesso2___null(this.sesso2___null);
            result.setSesso2___not___null(this.sesso2___not___null);
            result.setSesso2___in(this.sesso2___in);
            result.setSesso2___not___in(this.sesso2___not___in);
            result.setSesso2___lt(this.sesso2___lt);
            result.setSesso2___lte(this.sesso2___lte);
            result.setSesso2___gt(this.sesso2___gt);
            result.setSesso2___gte(this.sesso2___gte);
            result.setSesso2___contains(this.sesso2___contains);
            result.setSesso2___not___contains(this.sesso2___not___contains);
            result.setSesso2___starts_with(this.sesso2___starts_with);
            result.setSesso2___not___starts_with(this.sesso2___not___starts_with);
            result.setSesso2___ends_with(this.sesso2___ends_with);
            result.setSesso2___not___ends_with(this.sesso2___not___ends_with);
            result.setUltima_mestruazione___eq(this.ultima_mestruazione___eq);
            result.setUltima_mestruazione___ne(this.ultima_mestruazione___ne);
            result.setUltima_mestruazione___null(this.ultima_mestruazione___null);
            result.setUltima_mestruazione___not___null(this.ultima_mestruazione___not___null);
            result.setUltima_mestruazione___in(this.ultima_mestruazione___in);
            result.setUltima_mestruazione___not___in(this.ultima_mestruazione___not___in);
            result.setUltima_mestruazione___lt(this.ultima_mestruazione___lt);
            result.setUltima_mestruazione___lte(this.ultima_mestruazione___lte);
            result.setUltima_mestruazione___gt(this.ultima_mestruazione___gt);
            result.setUltima_mestruazione___gte(this.ultima_mestruazione___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
