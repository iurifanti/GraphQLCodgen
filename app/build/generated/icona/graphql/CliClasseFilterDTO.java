package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Classe.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliClasseFilterDTO implements java.io.Serializable {

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
    private Integer codice___eq;
    private Integer codice___ne;
    private Boolean codice___null;
    private Boolean codice___not___null;
    private java.util.List<Integer> codice___in;
    private java.util.List<Integer> codice___not___in;
    private Integer codice___lt;
    private Integer codice___lte;
    private Integer codice___gt;
    private Integer codice___gte;
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
    private java.util.List<CliClasseFilterDTO> AND;
    private java.util.List<CliClasseFilterDTO> OR;
    private CliClasseFilterDTO NOT;

    public CliClasseFilterDTO() {
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

    public Integer getCodice___eq() {
        return codice___eq;
    }
    public void setCodice___eq(Integer codice___eq) {
        this.codice___eq = codice___eq;
    }

    public Integer getCodice___ne() {
        return codice___ne;
    }
    public void setCodice___ne(Integer codice___ne) {
        this.codice___ne = codice___ne;
    }

    public Boolean getCodice___null() {
        return codice___null;
    }
    public void setCodice___null(Boolean codice___null) {
        this.codice___null = codice___null;
    }

    public Boolean getCodice___not___null() {
        return codice___not___null;
    }
    public void setCodice___not___null(Boolean codice___not___null) {
        this.codice___not___null = codice___not___null;
    }

    public java.util.List<Integer> getCodice___in() {
        return codice___in;
    }
    public void setCodice___in(java.util.List<Integer> codice___in) {
        this.codice___in = codice___in;
    }

    public java.util.List<Integer> getCodice___not___in() {
        return codice___not___in;
    }
    public void setCodice___not___in(java.util.List<Integer> codice___not___in) {
        this.codice___not___in = codice___not___in;
    }

    public Integer getCodice___lt() {
        return codice___lt;
    }
    public void setCodice___lt(Integer codice___lt) {
        this.codice___lt = codice___lt;
    }

    public Integer getCodice___lte() {
        return codice___lte;
    }
    public void setCodice___lte(Integer codice___lte) {
        this.codice___lte = codice___lte;
    }

    public Integer getCodice___gt() {
        return codice___gt;
    }
    public void setCodice___gt(Integer codice___gt) {
        this.codice___gt = codice___gt;
    }

    public Integer getCodice___gte() {
        return codice___gte;
    }
    public void setCodice___gte(Integer codice___gte) {
        this.codice___gte = codice___gte;
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

    public java.util.List<CliClasseFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliClasseFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliClasseFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliClasseFilterDTO> OR) {
        this.OR = OR;
    }

    public CliClasseFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliClasseFilterDTO NOT) {
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
        if (codice___eq != null) {
            joiner.add("codice___eq: " + GraphQLRequestSerializer.getEntry(codice___eq));
        }
        if (codice___ne != null) {
            joiner.add("codice___ne: " + GraphQLRequestSerializer.getEntry(codice___ne));
        }
        if (codice___null != null) {
            joiner.add("codice___null: " + GraphQLRequestSerializer.getEntry(codice___null));
        }
        if (codice___not___null != null) {
            joiner.add("codice___not___null: " + GraphQLRequestSerializer.getEntry(codice___not___null));
        }
        if (codice___in != null) {
            joiner.add("codice___in: " + GraphQLRequestSerializer.getEntry(codice___in));
        }
        if (codice___not___in != null) {
            joiner.add("codice___not___in: " + GraphQLRequestSerializer.getEntry(codice___not___in));
        }
        if (codice___lt != null) {
            joiner.add("codice___lt: " + GraphQLRequestSerializer.getEntry(codice___lt));
        }
        if (codice___lte != null) {
            joiner.add("codice___lte: " + GraphQLRequestSerializer.getEntry(codice___lte));
        }
        if (codice___gt != null) {
            joiner.add("codice___gt: " + GraphQLRequestSerializer.getEntry(codice___gt));
        }
        if (codice___gte != null) {
            joiner.add("codice___gte: " + GraphQLRequestSerializer.getEntry(codice___gte));
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

    public static CliClasseFilterDTO.Builder builder() {
        return new CliClasseFilterDTO.Builder();
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
        private Integer codice___eq;
        private Integer codice___ne;
        private Boolean codice___null;
        private Boolean codice___not___null;
        private java.util.List<Integer> codice___in;
        private java.util.List<Integer> codice___not___in;
        private Integer codice___lt;
        private Integer codice___lte;
        private Integer codice___gt;
        private Integer codice___gte;
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
        private java.util.List<CliClasseFilterDTO> AND;
        private java.util.List<CliClasseFilterDTO> OR;
        private CliClasseFilterDTO NOT;

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

        public Builder setCodice___eq(Integer codice___eq) {
            this.codice___eq = codice___eq;
            return this;
        }

        public Builder setCodice___ne(Integer codice___ne) {
            this.codice___ne = codice___ne;
            return this;
        }

        public Builder setCodice___null(Boolean codice___null) {
            this.codice___null = codice___null;
            return this;
        }

        public Builder setCodice___not___null(Boolean codice___not___null) {
            this.codice___not___null = codice___not___null;
            return this;
        }

        public Builder setCodice___in(java.util.List<Integer> codice___in) {
            this.codice___in = codice___in;
            return this;
        }

        public Builder setCodice___not___in(java.util.List<Integer> codice___not___in) {
            this.codice___not___in = codice___not___in;
            return this;
        }

        public Builder setCodice___lt(Integer codice___lt) {
            this.codice___lt = codice___lt;
            return this;
        }

        public Builder setCodice___lte(Integer codice___lte) {
            this.codice___lte = codice___lte;
            return this;
        }

        public Builder setCodice___gt(Integer codice___gt) {
            this.codice___gt = codice___gt;
            return this;
        }

        public Builder setCodice___gte(Integer codice___gte) {
            this.codice___gte = codice___gte;
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

        public Builder setAND(java.util.List<CliClasseFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliClasseFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliClasseFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliClasseFilterDTO build() {
            CliClasseFilterDTO result = new CliClasseFilterDTO();
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
            result.setCodice___eq(this.codice___eq);
            result.setCodice___ne(this.codice___ne);
            result.setCodice___null(this.codice___null);
            result.setCodice___not___null(this.codice___not___null);
            result.setCodice___in(this.codice___in);
            result.setCodice___not___in(this.codice___not___in);
            result.setCodice___lt(this.codice___lt);
            result.setCodice___lte(this.codice___lte);
            result.setCodice___gt(this.codice___gt);
            result.setCodice___gte(this.codice___gte);
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
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
