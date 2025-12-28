package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Domanda.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDomandaFilterDTO implements java.io.Serializable {

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
    private String condizioni_abilitazione_associate___eq;
    private String condizioni_abilitazione_associate___ne;
    private Boolean condizioni_abilitazione_associate___null;
    private Boolean condizioni_abilitazione_associate___not___null;
    private java.util.List<String> condizioni_abilitazione_associate___in;
    private java.util.List<String> condizioni_abilitazione_associate___not___in;
    private String condizioni_abilitazione_associate___lt;
    private String condizioni_abilitazione_associate___lte;
    private String condizioni_abilitazione_associate___gt;
    private String condizioni_abilitazione_associate___gte;
    private String condizioni_abilitazione_associate___contains;
    private String condizioni_abilitazione_associate___not___contains;
    private String condizioni_abilitazione_associate___starts_with;
    private String condizioni_abilitazione_associate___not___starts_with;
    private String condizioni_abilitazione_associate___ends_with;
    private String condizioni_abilitazione_associate___not___ends_with;
    private Integer ordine___eq;
    private Integer ordine___ne;
    private Boolean ordine___null;
    private Boolean ordine___not___null;
    private java.util.List<Integer> ordine___in;
    private java.util.List<Integer> ordine___not___in;
    private Integer ordine___lt;
    private Integer ordine___lte;
    private Integer ordine___gt;
    private Integer ordine___gte;
    private Boolean parametri_personali___eq;
    private Boolean parametri_personali___ne;
    private Boolean parametri_personali___null;
    private Boolean parametri_personali___not___null;
    private Boolean peso___eq;
    private Boolean peso___ne;
    private Boolean peso___null;
    private Boolean peso___not___null;
    private String testo___eq;
    private String testo___ne;
    private Boolean testo___null;
    private Boolean testo___not___null;
    private java.util.List<String> testo___in;
    private java.util.List<String> testo___not___in;
    private String testo___lt;
    private String testo___lte;
    private String testo___gt;
    private String testo___gte;
    private String testo___contains;
    private String testo___not___contains;
    private String testo___starts_with;
    private String testo___not___starts_with;
    private String testo___ends_with;
    private String testo___not___ends_with;
    private java.util.List<CliDomandaFilterDTO> AND;
    private java.util.List<CliDomandaFilterDTO> OR;
    private CliDomandaFilterDTO NOT;

    public CliDomandaFilterDTO() {
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

    public String getCondizioni_abilitazione_associate___eq() {
        return condizioni_abilitazione_associate___eq;
    }
    public void setCondizioni_abilitazione_associate___eq(String condizioni_abilitazione_associate___eq) {
        this.condizioni_abilitazione_associate___eq = condizioni_abilitazione_associate___eq;
    }

    public String getCondizioni_abilitazione_associate___ne() {
        return condizioni_abilitazione_associate___ne;
    }
    public void setCondizioni_abilitazione_associate___ne(String condizioni_abilitazione_associate___ne) {
        this.condizioni_abilitazione_associate___ne = condizioni_abilitazione_associate___ne;
    }

    public Boolean getCondizioni_abilitazione_associate___null() {
        return condizioni_abilitazione_associate___null;
    }
    public void setCondizioni_abilitazione_associate___null(Boolean condizioni_abilitazione_associate___null) {
        this.condizioni_abilitazione_associate___null = condizioni_abilitazione_associate___null;
    }

    public Boolean getCondizioni_abilitazione_associate___not___null() {
        return condizioni_abilitazione_associate___not___null;
    }
    public void setCondizioni_abilitazione_associate___not___null(Boolean condizioni_abilitazione_associate___not___null) {
        this.condizioni_abilitazione_associate___not___null = condizioni_abilitazione_associate___not___null;
    }

    public java.util.List<String> getCondizioni_abilitazione_associate___in() {
        return condizioni_abilitazione_associate___in;
    }
    public void setCondizioni_abilitazione_associate___in(java.util.List<String> condizioni_abilitazione_associate___in) {
        this.condizioni_abilitazione_associate___in = condizioni_abilitazione_associate___in;
    }

    public java.util.List<String> getCondizioni_abilitazione_associate___not___in() {
        return condizioni_abilitazione_associate___not___in;
    }
    public void setCondizioni_abilitazione_associate___not___in(java.util.List<String> condizioni_abilitazione_associate___not___in) {
        this.condizioni_abilitazione_associate___not___in = condizioni_abilitazione_associate___not___in;
    }

    public String getCondizioni_abilitazione_associate___lt() {
        return condizioni_abilitazione_associate___lt;
    }
    public void setCondizioni_abilitazione_associate___lt(String condizioni_abilitazione_associate___lt) {
        this.condizioni_abilitazione_associate___lt = condizioni_abilitazione_associate___lt;
    }

    public String getCondizioni_abilitazione_associate___lte() {
        return condizioni_abilitazione_associate___lte;
    }
    public void setCondizioni_abilitazione_associate___lte(String condizioni_abilitazione_associate___lte) {
        this.condizioni_abilitazione_associate___lte = condizioni_abilitazione_associate___lte;
    }

    public String getCondizioni_abilitazione_associate___gt() {
        return condizioni_abilitazione_associate___gt;
    }
    public void setCondizioni_abilitazione_associate___gt(String condizioni_abilitazione_associate___gt) {
        this.condizioni_abilitazione_associate___gt = condizioni_abilitazione_associate___gt;
    }

    public String getCondizioni_abilitazione_associate___gte() {
        return condizioni_abilitazione_associate___gte;
    }
    public void setCondizioni_abilitazione_associate___gte(String condizioni_abilitazione_associate___gte) {
        this.condizioni_abilitazione_associate___gte = condizioni_abilitazione_associate___gte;
    }

    public String getCondizioni_abilitazione_associate___contains() {
        return condizioni_abilitazione_associate___contains;
    }
    public void setCondizioni_abilitazione_associate___contains(String condizioni_abilitazione_associate___contains) {
        this.condizioni_abilitazione_associate___contains = condizioni_abilitazione_associate___contains;
    }

    public String getCondizioni_abilitazione_associate___not___contains() {
        return condizioni_abilitazione_associate___not___contains;
    }
    public void setCondizioni_abilitazione_associate___not___contains(String condizioni_abilitazione_associate___not___contains) {
        this.condizioni_abilitazione_associate___not___contains = condizioni_abilitazione_associate___not___contains;
    }

    public String getCondizioni_abilitazione_associate___starts_with() {
        return condizioni_abilitazione_associate___starts_with;
    }
    public void setCondizioni_abilitazione_associate___starts_with(String condizioni_abilitazione_associate___starts_with) {
        this.condizioni_abilitazione_associate___starts_with = condizioni_abilitazione_associate___starts_with;
    }

    public String getCondizioni_abilitazione_associate___not___starts_with() {
        return condizioni_abilitazione_associate___not___starts_with;
    }
    public void setCondizioni_abilitazione_associate___not___starts_with(String condizioni_abilitazione_associate___not___starts_with) {
        this.condizioni_abilitazione_associate___not___starts_with = condizioni_abilitazione_associate___not___starts_with;
    }

    public String getCondizioni_abilitazione_associate___ends_with() {
        return condizioni_abilitazione_associate___ends_with;
    }
    public void setCondizioni_abilitazione_associate___ends_with(String condizioni_abilitazione_associate___ends_with) {
        this.condizioni_abilitazione_associate___ends_with = condizioni_abilitazione_associate___ends_with;
    }

    public String getCondizioni_abilitazione_associate___not___ends_with() {
        return condizioni_abilitazione_associate___not___ends_with;
    }
    public void setCondizioni_abilitazione_associate___not___ends_with(String condizioni_abilitazione_associate___not___ends_with) {
        this.condizioni_abilitazione_associate___not___ends_with = condizioni_abilitazione_associate___not___ends_with;
    }

    public Integer getOrdine___eq() {
        return ordine___eq;
    }
    public void setOrdine___eq(Integer ordine___eq) {
        this.ordine___eq = ordine___eq;
    }

    public Integer getOrdine___ne() {
        return ordine___ne;
    }
    public void setOrdine___ne(Integer ordine___ne) {
        this.ordine___ne = ordine___ne;
    }

    public Boolean getOrdine___null() {
        return ordine___null;
    }
    public void setOrdine___null(Boolean ordine___null) {
        this.ordine___null = ordine___null;
    }

    public Boolean getOrdine___not___null() {
        return ordine___not___null;
    }
    public void setOrdine___not___null(Boolean ordine___not___null) {
        this.ordine___not___null = ordine___not___null;
    }

    public java.util.List<Integer> getOrdine___in() {
        return ordine___in;
    }
    public void setOrdine___in(java.util.List<Integer> ordine___in) {
        this.ordine___in = ordine___in;
    }

    public java.util.List<Integer> getOrdine___not___in() {
        return ordine___not___in;
    }
    public void setOrdine___not___in(java.util.List<Integer> ordine___not___in) {
        this.ordine___not___in = ordine___not___in;
    }

    public Integer getOrdine___lt() {
        return ordine___lt;
    }
    public void setOrdine___lt(Integer ordine___lt) {
        this.ordine___lt = ordine___lt;
    }

    public Integer getOrdine___lte() {
        return ordine___lte;
    }
    public void setOrdine___lte(Integer ordine___lte) {
        this.ordine___lte = ordine___lte;
    }

    public Integer getOrdine___gt() {
        return ordine___gt;
    }
    public void setOrdine___gt(Integer ordine___gt) {
        this.ordine___gt = ordine___gt;
    }

    public Integer getOrdine___gte() {
        return ordine___gte;
    }
    public void setOrdine___gte(Integer ordine___gte) {
        this.ordine___gte = ordine___gte;
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

    public Boolean getPeso___eq() {
        return peso___eq;
    }
    public void setPeso___eq(Boolean peso___eq) {
        this.peso___eq = peso___eq;
    }

    public Boolean getPeso___ne() {
        return peso___ne;
    }
    public void setPeso___ne(Boolean peso___ne) {
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

    public String getTesto___eq() {
        return testo___eq;
    }
    public void setTesto___eq(String testo___eq) {
        this.testo___eq = testo___eq;
    }

    public String getTesto___ne() {
        return testo___ne;
    }
    public void setTesto___ne(String testo___ne) {
        this.testo___ne = testo___ne;
    }

    public Boolean getTesto___null() {
        return testo___null;
    }
    public void setTesto___null(Boolean testo___null) {
        this.testo___null = testo___null;
    }

    public Boolean getTesto___not___null() {
        return testo___not___null;
    }
    public void setTesto___not___null(Boolean testo___not___null) {
        this.testo___not___null = testo___not___null;
    }

    public java.util.List<String> getTesto___in() {
        return testo___in;
    }
    public void setTesto___in(java.util.List<String> testo___in) {
        this.testo___in = testo___in;
    }

    public java.util.List<String> getTesto___not___in() {
        return testo___not___in;
    }
    public void setTesto___not___in(java.util.List<String> testo___not___in) {
        this.testo___not___in = testo___not___in;
    }

    public String getTesto___lt() {
        return testo___lt;
    }
    public void setTesto___lt(String testo___lt) {
        this.testo___lt = testo___lt;
    }

    public String getTesto___lte() {
        return testo___lte;
    }
    public void setTesto___lte(String testo___lte) {
        this.testo___lte = testo___lte;
    }

    public String getTesto___gt() {
        return testo___gt;
    }
    public void setTesto___gt(String testo___gt) {
        this.testo___gt = testo___gt;
    }

    public String getTesto___gte() {
        return testo___gte;
    }
    public void setTesto___gte(String testo___gte) {
        this.testo___gte = testo___gte;
    }

    public String getTesto___contains() {
        return testo___contains;
    }
    public void setTesto___contains(String testo___contains) {
        this.testo___contains = testo___contains;
    }

    public String getTesto___not___contains() {
        return testo___not___contains;
    }
    public void setTesto___not___contains(String testo___not___contains) {
        this.testo___not___contains = testo___not___contains;
    }

    public String getTesto___starts_with() {
        return testo___starts_with;
    }
    public void setTesto___starts_with(String testo___starts_with) {
        this.testo___starts_with = testo___starts_with;
    }

    public String getTesto___not___starts_with() {
        return testo___not___starts_with;
    }
    public void setTesto___not___starts_with(String testo___not___starts_with) {
        this.testo___not___starts_with = testo___not___starts_with;
    }

    public String getTesto___ends_with() {
        return testo___ends_with;
    }
    public void setTesto___ends_with(String testo___ends_with) {
        this.testo___ends_with = testo___ends_with;
    }

    public String getTesto___not___ends_with() {
        return testo___not___ends_with;
    }
    public void setTesto___not___ends_with(String testo___not___ends_with) {
        this.testo___not___ends_with = testo___not___ends_with;
    }

    public java.util.List<CliDomandaFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliDomandaFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliDomandaFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliDomandaFilterDTO> OR) {
        this.OR = OR;
    }

    public CliDomandaFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliDomandaFilterDTO NOT) {
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
        if (condizioni_abilitazione_associate___eq != null) {
            joiner.add("condizioni_abilitazione_associate___eq: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___eq));
        }
        if (condizioni_abilitazione_associate___ne != null) {
            joiner.add("condizioni_abilitazione_associate___ne: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___ne));
        }
        if (condizioni_abilitazione_associate___null != null) {
            joiner.add("condizioni_abilitazione_associate___null: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___null));
        }
        if (condizioni_abilitazione_associate___not___null != null) {
            joiner.add("condizioni_abilitazione_associate___not___null: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___not___null));
        }
        if (condizioni_abilitazione_associate___in != null) {
            joiner.add("condizioni_abilitazione_associate___in: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___in));
        }
        if (condizioni_abilitazione_associate___not___in != null) {
            joiner.add("condizioni_abilitazione_associate___not___in: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___not___in));
        }
        if (condizioni_abilitazione_associate___lt != null) {
            joiner.add("condizioni_abilitazione_associate___lt: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___lt));
        }
        if (condizioni_abilitazione_associate___lte != null) {
            joiner.add("condizioni_abilitazione_associate___lte: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___lte));
        }
        if (condizioni_abilitazione_associate___gt != null) {
            joiner.add("condizioni_abilitazione_associate___gt: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___gt));
        }
        if (condizioni_abilitazione_associate___gte != null) {
            joiner.add("condizioni_abilitazione_associate___gte: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___gte));
        }
        if (condizioni_abilitazione_associate___contains != null) {
            joiner.add("condizioni_abilitazione_associate___contains: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___contains));
        }
        if (condizioni_abilitazione_associate___not___contains != null) {
            joiner.add("condizioni_abilitazione_associate___not___contains: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___not___contains));
        }
        if (condizioni_abilitazione_associate___starts_with != null) {
            joiner.add("condizioni_abilitazione_associate___starts_with: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___starts_with));
        }
        if (condizioni_abilitazione_associate___not___starts_with != null) {
            joiner.add("condizioni_abilitazione_associate___not___starts_with: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___not___starts_with));
        }
        if (condizioni_abilitazione_associate___ends_with != null) {
            joiner.add("condizioni_abilitazione_associate___ends_with: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___ends_with));
        }
        if (condizioni_abilitazione_associate___not___ends_with != null) {
            joiner.add("condizioni_abilitazione_associate___not___ends_with: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate___not___ends_with));
        }
        if (ordine___eq != null) {
            joiner.add("ordine___eq: " + GraphQLRequestSerializer.getEntry(ordine___eq));
        }
        if (ordine___ne != null) {
            joiner.add("ordine___ne: " + GraphQLRequestSerializer.getEntry(ordine___ne));
        }
        if (ordine___null != null) {
            joiner.add("ordine___null: " + GraphQLRequestSerializer.getEntry(ordine___null));
        }
        if (ordine___not___null != null) {
            joiner.add("ordine___not___null: " + GraphQLRequestSerializer.getEntry(ordine___not___null));
        }
        if (ordine___in != null) {
            joiner.add("ordine___in: " + GraphQLRequestSerializer.getEntry(ordine___in));
        }
        if (ordine___not___in != null) {
            joiner.add("ordine___not___in: " + GraphQLRequestSerializer.getEntry(ordine___not___in));
        }
        if (ordine___lt != null) {
            joiner.add("ordine___lt: " + GraphQLRequestSerializer.getEntry(ordine___lt));
        }
        if (ordine___lte != null) {
            joiner.add("ordine___lte: " + GraphQLRequestSerializer.getEntry(ordine___lte));
        }
        if (ordine___gt != null) {
            joiner.add("ordine___gt: " + GraphQLRequestSerializer.getEntry(ordine___gt));
        }
        if (ordine___gte != null) {
            joiner.add("ordine___gte: " + GraphQLRequestSerializer.getEntry(ordine___gte));
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
        if (testo___eq != null) {
            joiner.add("testo___eq: " + GraphQLRequestSerializer.getEntry(testo___eq));
        }
        if (testo___ne != null) {
            joiner.add("testo___ne: " + GraphQLRequestSerializer.getEntry(testo___ne));
        }
        if (testo___null != null) {
            joiner.add("testo___null: " + GraphQLRequestSerializer.getEntry(testo___null));
        }
        if (testo___not___null != null) {
            joiner.add("testo___not___null: " + GraphQLRequestSerializer.getEntry(testo___not___null));
        }
        if (testo___in != null) {
            joiner.add("testo___in: " + GraphQLRequestSerializer.getEntry(testo___in));
        }
        if (testo___not___in != null) {
            joiner.add("testo___not___in: " + GraphQLRequestSerializer.getEntry(testo___not___in));
        }
        if (testo___lt != null) {
            joiner.add("testo___lt: " + GraphQLRequestSerializer.getEntry(testo___lt));
        }
        if (testo___lte != null) {
            joiner.add("testo___lte: " + GraphQLRequestSerializer.getEntry(testo___lte));
        }
        if (testo___gt != null) {
            joiner.add("testo___gt: " + GraphQLRequestSerializer.getEntry(testo___gt));
        }
        if (testo___gte != null) {
            joiner.add("testo___gte: " + GraphQLRequestSerializer.getEntry(testo___gte));
        }
        if (testo___contains != null) {
            joiner.add("testo___contains: " + GraphQLRequestSerializer.getEntry(testo___contains));
        }
        if (testo___not___contains != null) {
            joiner.add("testo___not___contains: " + GraphQLRequestSerializer.getEntry(testo___not___contains));
        }
        if (testo___starts_with != null) {
            joiner.add("testo___starts_with: " + GraphQLRequestSerializer.getEntry(testo___starts_with));
        }
        if (testo___not___starts_with != null) {
            joiner.add("testo___not___starts_with: " + GraphQLRequestSerializer.getEntry(testo___not___starts_with));
        }
        if (testo___ends_with != null) {
            joiner.add("testo___ends_with: " + GraphQLRequestSerializer.getEntry(testo___ends_with));
        }
        if (testo___not___ends_with != null) {
            joiner.add("testo___not___ends_with: " + GraphQLRequestSerializer.getEntry(testo___not___ends_with));
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

    public static CliDomandaFilterDTO.Builder builder() {
        return new CliDomandaFilterDTO.Builder();
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
        private String condizioni_abilitazione_associate___eq;
        private String condizioni_abilitazione_associate___ne;
        private Boolean condizioni_abilitazione_associate___null;
        private Boolean condizioni_abilitazione_associate___not___null;
        private java.util.List<String> condizioni_abilitazione_associate___in;
        private java.util.List<String> condizioni_abilitazione_associate___not___in;
        private String condizioni_abilitazione_associate___lt;
        private String condizioni_abilitazione_associate___lte;
        private String condizioni_abilitazione_associate___gt;
        private String condizioni_abilitazione_associate___gte;
        private String condizioni_abilitazione_associate___contains;
        private String condizioni_abilitazione_associate___not___contains;
        private String condizioni_abilitazione_associate___starts_with;
        private String condizioni_abilitazione_associate___not___starts_with;
        private String condizioni_abilitazione_associate___ends_with;
        private String condizioni_abilitazione_associate___not___ends_with;
        private Integer ordine___eq;
        private Integer ordine___ne;
        private Boolean ordine___null;
        private Boolean ordine___not___null;
        private java.util.List<Integer> ordine___in;
        private java.util.List<Integer> ordine___not___in;
        private Integer ordine___lt;
        private Integer ordine___lte;
        private Integer ordine___gt;
        private Integer ordine___gte;
        private Boolean parametri_personali___eq;
        private Boolean parametri_personali___ne;
        private Boolean parametri_personali___null;
        private Boolean parametri_personali___not___null;
        private Boolean peso___eq;
        private Boolean peso___ne;
        private Boolean peso___null;
        private Boolean peso___not___null;
        private String testo___eq;
        private String testo___ne;
        private Boolean testo___null;
        private Boolean testo___not___null;
        private java.util.List<String> testo___in;
        private java.util.List<String> testo___not___in;
        private String testo___lt;
        private String testo___lte;
        private String testo___gt;
        private String testo___gte;
        private String testo___contains;
        private String testo___not___contains;
        private String testo___starts_with;
        private String testo___not___starts_with;
        private String testo___ends_with;
        private String testo___not___ends_with;
        private java.util.List<CliDomandaFilterDTO> AND;
        private java.util.List<CliDomandaFilterDTO> OR;
        private CliDomandaFilterDTO NOT;

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

        public Builder setCondizioni_abilitazione_associate___eq(String condizioni_abilitazione_associate___eq) {
            this.condizioni_abilitazione_associate___eq = condizioni_abilitazione_associate___eq;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___ne(String condizioni_abilitazione_associate___ne) {
            this.condizioni_abilitazione_associate___ne = condizioni_abilitazione_associate___ne;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___null(Boolean condizioni_abilitazione_associate___null) {
            this.condizioni_abilitazione_associate___null = condizioni_abilitazione_associate___null;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___not___null(Boolean condizioni_abilitazione_associate___not___null) {
            this.condizioni_abilitazione_associate___not___null = condizioni_abilitazione_associate___not___null;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___in(java.util.List<String> condizioni_abilitazione_associate___in) {
            this.condizioni_abilitazione_associate___in = condizioni_abilitazione_associate___in;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___not___in(java.util.List<String> condizioni_abilitazione_associate___not___in) {
            this.condizioni_abilitazione_associate___not___in = condizioni_abilitazione_associate___not___in;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___lt(String condizioni_abilitazione_associate___lt) {
            this.condizioni_abilitazione_associate___lt = condizioni_abilitazione_associate___lt;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___lte(String condizioni_abilitazione_associate___lte) {
            this.condizioni_abilitazione_associate___lte = condizioni_abilitazione_associate___lte;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___gt(String condizioni_abilitazione_associate___gt) {
            this.condizioni_abilitazione_associate___gt = condizioni_abilitazione_associate___gt;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___gte(String condizioni_abilitazione_associate___gte) {
            this.condizioni_abilitazione_associate___gte = condizioni_abilitazione_associate___gte;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___contains(String condizioni_abilitazione_associate___contains) {
            this.condizioni_abilitazione_associate___contains = condizioni_abilitazione_associate___contains;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___not___contains(String condizioni_abilitazione_associate___not___contains) {
            this.condizioni_abilitazione_associate___not___contains = condizioni_abilitazione_associate___not___contains;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___starts_with(String condizioni_abilitazione_associate___starts_with) {
            this.condizioni_abilitazione_associate___starts_with = condizioni_abilitazione_associate___starts_with;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___not___starts_with(String condizioni_abilitazione_associate___not___starts_with) {
            this.condizioni_abilitazione_associate___not___starts_with = condizioni_abilitazione_associate___not___starts_with;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___ends_with(String condizioni_abilitazione_associate___ends_with) {
            this.condizioni_abilitazione_associate___ends_with = condizioni_abilitazione_associate___ends_with;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate___not___ends_with(String condizioni_abilitazione_associate___not___ends_with) {
            this.condizioni_abilitazione_associate___not___ends_with = condizioni_abilitazione_associate___not___ends_with;
            return this;
        }

        public Builder setOrdine___eq(Integer ordine___eq) {
            this.ordine___eq = ordine___eq;
            return this;
        }

        public Builder setOrdine___ne(Integer ordine___ne) {
            this.ordine___ne = ordine___ne;
            return this;
        }

        public Builder setOrdine___null(Boolean ordine___null) {
            this.ordine___null = ordine___null;
            return this;
        }

        public Builder setOrdine___not___null(Boolean ordine___not___null) {
            this.ordine___not___null = ordine___not___null;
            return this;
        }

        public Builder setOrdine___in(java.util.List<Integer> ordine___in) {
            this.ordine___in = ordine___in;
            return this;
        }

        public Builder setOrdine___not___in(java.util.List<Integer> ordine___not___in) {
            this.ordine___not___in = ordine___not___in;
            return this;
        }

        public Builder setOrdine___lt(Integer ordine___lt) {
            this.ordine___lt = ordine___lt;
            return this;
        }

        public Builder setOrdine___lte(Integer ordine___lte) {
            this.ordine___lte = ordine___lte;
            return this;
        }

        public Builder setOrdine___gt(Integer ordine___gt) {
            this.ordine___gt = ordine___gt;
            return this;
        }

        public Builder setOrdine___gte(Integer ordine___gte) {
            this.ordine___gte = ordine___gte;
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

        public Builder setPeso___eq(Boolean peso___eq) {
            this.peso___eq = peso___eq;
            return this;
        }

        public Builder setPeso___ne(Boolean peso___ne) {
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

        public Builder setTesto___eq(String testo___eq) {
            this.testo___eq = testo___eq;
            return this;
        }

        public Builder setTesto___ne(String testo___ne) {
            this.testo___ne = testo___ne;
            return this;
        }

        public Builder setTesto___null(Boolean testo___null) {
            this.testo___null = testo___null;
            return this;
        }

        public Builder setTesto___not___null(Boolean testo___not___null) {
            this.testo___not___null = testo___not___null;
            return this;
        }

        public Builder setTesto___in(java.util.List<String> testo___in) {
            this.testo___in = testo___in;
            return this;
        }

        public Builder setTesto___not___in(java.util.List<String> testo___not___in) {
            this.testo___not___in = testo___not___in;
            return this;
        }

        public Builder setTesto___lt(String testo___lt) {
            this.testo___lt = testo___lt;
            return this;
        }

        public Builder setTesto___lte(String testo___lte) {
            this.testo___lte = testo___lte;
            return this;
        }

        public Builder setTesto___gt(String testo___gt) {
            this.testo___gt = testo___gt;
            return this;
        }

        public Builder setTesto___gte(String testo___gte) {
            this.testo___gte = testo___gte;
            return this;
        }

        public Builder setTesto___contains(String testo___contains) {
            this.testo___contains = testo___contains;
            return this;
        }

        public Builder setTesto___not___contains(String testo___not___contains) {
            this.testo___not___contains = testo___not___contains;
            return this;
        }

        public Builder setTesto___starts_with(String testo___starts_with) {
            this.testo___starts_with = testo___starts_with;
            return this;
        }

        public Builder setTesto___not___starts_with(String testo___not___starts_with) {
            this.testo___not___starts_with = testo___not___starts_with;
            return this;
        }

        public Builder setTesto___ends_with(String testo___ends_with) {
            this.testo___ends_with = testo___ends_with;
            return this;
        }

        public Builder setTesto___not___ends_with(String testo___not___ends_with) {
            this.testo___not___ends_with = testo___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliDomandaFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliDomandaFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliDomandaFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliDomandaFilterDTO build() {
            CliDomandaFilterDTO result = new CliDomandaFilterDTO();
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
            result.setCondizioni_abilitazione_associate___eq(this.condizioni_abilitazione_associate___eq);
            result.setCondizioni_abilitazione_associate___ne(this.condizioni_abilitazione_associate___ne);
            result.setCondizioni_abilitazione_associate___null(this.condizioni_abilitazione_associate___null);
            result.setCondizioni_abilitazione_associate___not___null(this.condizioni_abilitazione_associate___not___null);
            result.setCondizioni_abilitazione_associate___in(this.condizioni_abilitazione_associate___in);
            result.setCondizioni_abilitazione_associate___not___in(this.condizioni_abilitazione_associate___not___in);
            result.setCondizioni_abilitazione_associate___lt(this.condizioni_abilitazione_associate___lt);
            result.setCondizioni_abilitazione_associate___lte(this.condizioni_abilitazione_associate___lte);
            result.setCondizioni_abilitazione_associate___gt(this.condizioni_abilitazione_associate___gt);
            result.setCondizioni_abilitazione_associate___gte(this.condizioni_abilitazione_associate___gte);
            result.setCondizioni_abilitazione_associate___contains(this.condizioni_abilitazione_associate___contains);
            result.setCondizioni_abilitazione_associate___not___contains(this.condizioni_abilitazione_associate___not___contains);
            result.setCondizioni_abilitazione_associate___starts_with(this.condizioni_abilitazione_associate___starts_with);
            result.setCondizioni_abilitazione_associate___not___starts_with(this.condizioni_abilitazione_associate___not___starts_with);
            result.setCondizioni_abilitazione_associate___ends_with(this.condizioni_abilitazione_associate___ends_with);
            result.setCondizioni_abilitazione_associate___not___ends_with(this.condizioni_abilitazione_associate___not___ends_with);
            result.setOrdine___eq(this.ordine___eq);
            result.setOrdine___ne(this.ordine___ne);
            result.setOrdine___null(this.ordine___null);
            result.setOrdine___not___null(this.ordine___not___null);
            result.setOrdine___in(this.ordine___in);
            result.setOrdine___not___in(this.ordine___not___in);
            result.setOrdine___lt(this.ordine___lt);
            result.setOrdine___lte(this.ordine___lte);
            result.setOrdine___gt(this.ordine___gt);
            result.setOrdine___gte(this.ordine___gte);
            result.setParametri_personali___eq(this.parametri_personali___eq);
            result.setParametri_personali___ne(this.parametri_personali___ne);
            result.setParametri_personali___null(this.parametri_personali___null);
            result.setParametri_personali___not___null(this.parametri_personali___not___null);
            result.setPeso___eq(this.peso___eq);
            result.setPeso___ne(this.peso___ne);
            result.setPeso___null(this.peso___null);
            result.setPeso___not___null(this.peso___not___null);
            result.setTesto___eq(this.testo___eq);
            result.setTesto___ne(this.testo___ne);
            result.setTesto___null(this.testo___null);
            result.setTesto___not___null(this.testo___not___null);
            result.setTesto___in(this.testo___in);
            result.setTesto___not___in(this.testo___not___in);
            result.setTesto___lt(this.testo___lt);
            result.setTesto___lte(this.testo___lte);
            result.setTesto___gt(this.testo___gt);
            result.setTesto___gte(this.testo___gte);
            result.setTesto___contains(this.testo___contains);
            result.setTesto___not___contains(this.testo___not___contains);
            result.setTesto___starts_with(this.testo___starts_with);
            result.setTesto___not___starts_with(this.testo___not___starts_with);
            result.setTesto___ends_with(this.testo___ends_with);
            result.setTesto___not___ends_with(this.testo___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
