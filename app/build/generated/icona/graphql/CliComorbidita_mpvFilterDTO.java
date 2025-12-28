package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Comorbidita_mpv.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliComorbidita_mpvFilterDTO implements java.io.Serializable {

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
    private String name___eq;
    private String name___ne;
    private Boolean name___null;
    private Boolean name___not___null;
    private java.util.List<String> name___in;
    private java.util.List<String> name___not___in;
    private String name___lt;
    private String name___lte;
    private String name___gt;
    private String name___gte;
    private String name___contains;
    private String name___not___contains;
    private String name___starts_with;
    private String name___not___starts_with;
    private String name___ends_with;
    private String name___not___ends_with;
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
    private java.util.List<CliComorbidita_mpvFilterDTO> AND;
    private java.util.List<CliComorbidita_mpvFilterDTO> OR;
    private CliComorbidita_mpvFilterDTO NOT;

    public CliComorbidita_mpvFilterDTO() {
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

    public String getName___eq() {
        return name___eq;
    }
    public void setName___eq(String name___eq) {
        this.name___eq = name___eq;
    }

    public String getName___ne() {
        return name___ne;
    }
    public void setName___ne(String name___ne) {
        this.name___ne = name___ne;
    }

    public Boolean getName___null() {
        return name___null;
    }
    public void setName___null(Boolean name___null) {
        this.name___null = name___null;
    }

    public Boolean getName___not___null() {
        return name___not___null;
    }
    public void setName___not___null(Boolean name___not___null) {
        this.name___not___null = name___not___null;
    }

    public java.util.List<String> getName___in() {
        return name___in;
    }
    public void setName___in(java.util.List<String> name___in) {
        this.name___in = name___in;
    }

    public java.util.List<String> getName___not___in() {
        return name___not___in;
    }
    public void setName___not___in(java.util.List<String> name___not___in) {
        this.name___not___in = name___not___in;
    }

    public String getName___lt() {
        return name___lt;
    }
    public void setName___lt(String name___lt) {
        this.name___lt = name___lt;
    }

    public String getName___lte() {
        return name___lte;
    }
    public void setName___lte(String name___lte) {
        this.name___lte = name___lte;
    }

    public String getName___gt() {
        return name___gt;
    }
    public void setName___gt(String name___gt) {
        this.name___gt = name___gt;
    }

    public String getName___gte() {
        return name___gte;
    }
    public void setName___gte(String name___gte) {
        this.name___gte = name___gte;
    }

    public String getName___contains() {
        return name___contains;
    }
    public void setName___contains(String name___contains) {
        this.name___contains = name___contains;
    }

    public String getName___not___contains() {
        return name___not___contains;
    }
    public void setName___not___contains(String name___not___contains) {
        this.name___not___contains = name___not___contains;
    }

    public String getName___starts_with() {
        return name___starts_with;
    }
    public void setName___starts_with(String name___starts_with) {
        this.name___starts_with = name___starts_with;
    }

    public String getName___not___starts_with() {
        return name___not___starts_with;
    }
    public void setName___not___starts_with(String name___not___starts_with) {
        this.name___not___starts_with = name___not___starts_with;
    }

    public String getName___ends_with() {
        return name___ends_with;
    }
    public void setName___ends_with(String name___ends_with) {
        this.name___ends_with = name___ends_with;
    }

    public String getName___not___ends_with() {
        return name___not___ends_with;
    }
    public void setName___not___ends_with(String name___not___ends_with) {
        this.name___not___ends_with = name___not___ends_with;
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

    public java.util.List<CliComorbidita_mpvFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliComorbidita_mpvFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliComorbidita_mpvFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliComorbidita_mpvFilterDTO> OR) {
        this.OR = OR;
    }

    public CliComorbidita_mpvFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliComorbidita_mpvFilterDTO NOT) {
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
        if (name___eq != null) {
            joiner.add("name___eq: " + GraphQLRequestSerializer.getEntry(name___eq));
        }
        if (name___ne != null) {
            joiner.add("name___ne: " + GraphQLRequestSerializer.getEntry(name___ne));
        }
        if (name___null != null) {
            joiner.add("name___null: " + GraphQLRequestSerializer.getEntry(name___null));
        }
        if (name___not___null != null) {
            joiner.add("name___not___null: " + GraphQLRequestSerializer.getEntry(name___not___null));
        }
        if (name___in != null) {
            joiner.add("name___in: " + GraphQLRequestSerializer.getEntry(name___in));
        }
        if (name___not___in != null) {
            joiner.add("name___not___in: " + GraphQLRequestSerializer.getEntry(name___not___in));
        }
        if (name___lt != null) {
            joiner.add("name___lt: " + GraphQLRequestSerializer.getEntry(name___lt));
        }
        if (name___lte != null) {
            joiner.add("name___lte: " + GraphQLRequestSerializer.getEntry(name___lte));
        }
        if (name___gt != null) {
            joiner.add("name___gt: " + GraphQLRequestSerializer.getEntry(name___gt));
        }
        if (name___gte != null) {
            joiner.add("name___gte: " + GraphQLRequestSerializer.getEntry(name___gte));
        }
        if (name___contains != null) {
            joiner.add("name___contains: " + GraphQLRequestSerializer.getEntry(name___contains));
        }
        if (name___not___contains != null) {
            joiner.add("name___not___contains: " + GraphQLRequestSerializer.getEntry(name___not___contains));
        }
        if (name___starts_with != null) {
            joiner.add("name___starts_with: " + GraphQLRequestSerializer.getEntry(name___starts_with));
        }
        if (name___not___starts_with != null) {
            joiner.add("name___not___starts_with: " + GraphQLRequestSerializer.getEntry(name___not___starts_with));
        }
        if (name___ends_with != null) {
            joiner.add("name___ends_with: " + GraphQLRequestSerializer.getEntry(name___ends_with));
        }
        if (name___not___ends_with != null) {
            joiner.add("name___not___ends_with: " + GraphQLRequestSerializer.getEntry(name___not___ends_with));
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

    public static CliComorbidita_mpvFilterDTO.Builder builder() {
        return new CliComorbidita_mpvFilterDTO.Builder();
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
        private String name___eq;
        private String name___ne;
        private Boolean name___null;
        private Boolean name___not___null;
        private java.util.List<String> name___in;
        private java.util.List<String> name___not___in;
        private String name___lt;
        private String name___lte;
        private String name___gt;
        private String name___gte;
        private String name___contains;
        private String name___not___contains;
        private String name___starts_with;
        private String name___not___starts_with;
        private String name___ends_with;
        private String name___not___ends_with;
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
        private java.util.List<CliComorbidita_mpvFilterDTO> AND;
        private java.util.List<CliComorbidita_mpvFilterDTO> OR;
        private CliComorbidita_mpvFilterDTO NOT;

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

        public Builder setName___eq(String name___eq) {
            this.name___eq = name___eq;
            return this;
        }

        public Builder setName___ne(String name___ne) {
            this.name___ne = name___ne;
            return this;
        }

        public Builder setName___null(Boolean name___null) {
            this.name___null = name___null;
            return this;
        }

        public Builder setName___not___null(Boolean name___not___null) {
            this.name___not___null = name___not___null;
            return this;
        }

        public Builder setName___in(java.util.List<String> name___in) {
            this.name___in = name___in;
            return this;
        }

        public Builder setName___not___in(java.util.List<String> name___not___in) {
            this.name___not___in = name___not___in;
            return this;
        }

        public Builder setName___lt(String name___lt) {
            this.name___lt = name___lt;
            return this;
        }

        public Builder setName___lte(String name___lte) {
            this.name___lte = name___lte;
            return this;
        }

        public Builder setName___gt(String name___gt) {
            this.name___gt = name___gt;
            return this;
        }

        public Builder setName___gte(String name___gte) {
            this.name___gte = name___gte;
            return this;
        }

        public Builder setName___contains(String name___contains) {
            this.name___contains = name___contains;
            return this;
        }

        public Builder setName___not___contains(String name___not___contains) {
            this.name___not___contains = name___not___contains;
            return this;
        }

        public Builder setName___starts_with(String name___starts_with) {
            this.name___starts_with = name___starts_with;
            return this;
        }

        public Builder setName___not___starts_with(String name___not___starts_with) {
            this.name___not___starts_with = name___not___starts_with;
            return this;
        }

        public Builder setName___ends_with(String name___ends_with) {
            this.name___ends_with = name___ends_with;
            return this;
        }

        public Builder setName___not___ends_with(String name___not___ends_with) {
            this.name___not___ends_with = name___not___ends_with;
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

        public Builder setAND(java.util.List<CliComorbidita_mpvFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliComorbidita_mpvFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliComorbidita_mpvFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliComorbidita_mpvFilterDTO build() {
            CliComorbidita_mpvFilterDTO result = new CliComorbidita_mpvFilterDTO();
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
            result.setName___eq(this.name___eq);
            result.setName___ne(this.name___ne);
            result.setName___null(this.name___null);
            result.setName___not___null(this.name___not___null);
            result.setName___in(this.name___in);
            result.setName___not___in(this.name___not___in);
            result.setName___lt(this.name___lt);
            result.setName___lte(this.name___lte);
            result.setName___gt(this.name___gt);
            result.setName___gte(this.name___gte);
            result.setName___contains(this.name___contains);
            result.setName___not___contains(this.name___not___contains);
            result.setName___starts_with(this.name___starts_with);
            result.setName___not___starts_with(this.name___not___starts_with);
            result.setName___ends_with(this.name___ends_with);
            result.setName___not___ends_with(this.name___not___ends_with);
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
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
