package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Testo_intro.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTesto_introFilterDTO implements java.io.Serializable {

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
    private java.util.List<CliTesto_introFilterDTO> AND;
    private java.util.List<CliTesto_introFilterDTO> OR;
    private CliTesto_introFilterDTO NOT;

    public CliTesto_introFilterDTO() {
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

    public java.util.List<CliTesto_introFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliTesto_introFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliTesto_introFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliTesto_introFilterDTO> OR) {
        this.OR = OR;
    }

    public CliTesto_introFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliTesto_introFilterDTO NOT) {
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

    public static CliTesto_introFilterDTO.Builder builder() {
        return new CliTesto_introFilterDTO.Builder();
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
        private java.util.List<CliTesto_introFilterDTO> AND;
        private java.util.List<CliTesto_introFilterDTO> OR;
        private CliTesto_introFilterDTO NOT;

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

        public Builder setAND(java.util.List<CliTesto_introFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliTesto_introFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliTesto_introFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliTesto_introFilterDTO build() {
            CliTesto_introFilterDTO result = new CliTesto_introFilterDTO();
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
