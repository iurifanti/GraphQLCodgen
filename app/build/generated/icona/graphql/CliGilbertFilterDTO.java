package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Gilbert.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliGilbertFilterDTO implements java.io.Serializable {

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
    private String risultato___eq;
    private String risultato___ne;
    private Boolean risultato___null;
    private Boolean risultato___not___null;
    private java.util.List<String> risultato___in;
    private java.util.List<String> risultato___not___in;
    private String risultato___lt;
    private String risultato___lte;
    private String risultato___gt;
    private String risultato___gte;
    private String risultato___contains;
    private String risultato___not___contains;
    private String risultato___starts_with;
    private String risultato___not___starts_with;
    private String risultato___ends_with;
    private String risultato___not___ends_with;
    private java.util.List<CliGilbertFilterDTO> AND;
    private java.util.List<CliGilbertFilterDTO> OR;
    private CliGilbertFilterDTO NOT;

    public CliGilbertFilterDTO() {
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

    public String getRisultato___eq() {
        return risultato___eq;
    }
    public void setRisultato___eq(String risultato___eq) {
        this.risultato___eq = risultato___eq;
    }

    public String getRisultato___ne() {
        return risultato___ne;
    }
    public void setRisultato___ne(String risultato___ne) {
        this.risultato___ne = risultato___ne;
    }

    public Boolean getRisultato___null() {
        return risultato___null;
    }
    public void setRisultato___null(Boolean risultato___null) {
        this.risultato___null = risultato___null;
    }

    public Boolean getRisultato___not___null() {
        return risultato___not___null;
    }
    public void setRisultato___not___null(Boolean risultato___not___null) {
        this.risultato___not___null = risultato___not___null;
    }

    public java.util.List<String> getRisultato___in() {
        return risultato___in;
    }
    public void setRisultato___in(java.util.List<String> risultato___in) {
        this.risultato___in = risultato___in;
    }

    public java.util.List<String> getRisultato___not___in() {
        return risultato___not___in;
    }
    public void setRisultato___not___in(java.util.List<String> risultato___not___in) {
        this.risultato___not___in = risultato___not___in;
    }

    public String getRisultato___lt() {
        return risultato___lt;
    }
    public void setRisultato___lt(String risultato___lt) {
        this.risultato___lt = risultato___lt;
    }

    public String getRisultato___lte() {
        return risultato___lte;
    }
    public void setRisultato___lte(String risultato___lte) {
        this.risultato___lte = risultato___lte;
    }

    public String getRisultato___gt() {
        return risultato___gt;
    }
    public void setRisultato___gt(String risultato___gt) {
        this.risultato___gt = risultato___gt;
    }

    public String getRisultato___gte() {
        return risultato___gte;
    }
    public void setRisultato___gte(String risultato___gte) {
        this.risultato___gte = risultato___gte;
    }

    public String getRisultato___contains() {
        return risultato___contains;
    }
    public void setRisultato___contains(String risultato___contains) {
        this.risultato___contains = risultato___contains;
    }

    public String getRisultato___not___contains() {
        return risultato___not___contains;
    }
    public void setRisultato___not___contains(String risultato___not___contains) {
        this.risultato___not___contains = risultato___not___contains;
    }

    public String getRisultato___starts_with() {
        return risultato___starts_with;
    }
    public void setRisultato___starts_with(String risultato___starts_with) {
        this.risultato___starts_with = risultato___starts_with;
    }

    public String getRisultato___not___starts_with() {
        return risultato___not___starts_with;
    }
    public void setRisultato___not___starts_with(String risultato___not___starts_with) {
        this.risultato___not___starts_with = risultato___not___starts_with;
    }

    public String getRisultato___ends_with() {
        return risultato___ends_with;
    }
    public void setRisultato___ends_with(String risultato___ends_with) {
        this.risultato___ends_with = risultato___ends_with;
    }

    public String getRisultato___not___ends_with() {
        return risultato___not___ends_with;
    }
    public void setRisultato___not___ends_with(String risultato___not___ends_with) {
        this.risultato___not___ends_with = risultato___not___ends_with;
    }

    public java.util.List<CliGilbertFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliGilbertFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliGilbertFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliGilbertFilterDTO> OR) {
        this.OR = OR;
    }

    public CliGilbertFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliGilbertFilterDTO NOT) {
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
        if (risultato___eq != null) {
            joiner.add("risultato___eq: " + GraphQLRequestSerializer.getEntry(risultato___eq));
        }
        if (risultato___ne != null) {
            joiner.add("risultato___ne: " + GraphQLRequestSerializer.getEntry(risultato___ne));
        }
        if (risultato___null != null) {
            joiner.add("risultato___null: " + GraphQLRequestSerializer.getEntry(risultato___null));
        }
        if (risultato___not___null != null) {
            joiner.add("risultato___not___null: " + GraphQLRequestSerializer.getEntry(risultato___not___null));
        }
        if (risultato___in != null) {
            joiner.add("risultato___in: " + GraphQLRequestSerializer.getEntry(risultato___in));
        }
        if (risultato___not___in != null) {
            joiner.add("risultato___not___in: " + GraphQLRequestSerializer.getEntry(risultato___not___in));
        }
        if (risultato___lt != null) {
            joiner.add("risultato___lt: " + GraphQLRequestSerializer.getEntry(risultato___lt));
        }
        if (risultato___lte != null) {
            joiner.add("risultato___lte: " + GraphQLRequestSerializer.getEntry(risultato___lte));
        }
        if (risultato___gt != null) {
            joiner.add("risultato___gt: " + GraphQLRequestSerializer.getEntry(risultato___gt));
        }
        if (risultato___gte != null) {
            joiner.add("risultato___gte: " + GraphQLRequestSerializer.getEntry(risultato___gte));
        }
        if (risultato___contains != null) {
            joiner.add("risultato___contains: " + GraphQLRequestSerializer.getEntry(risultato___contains));
        }
        if (risultato___not___contains != null) {
            joiner.add("risultato___not___contains: " + GraphQLRequestSerializer.getEntry(risultato___not___contains));
        }
        if (risultato___starts_with != null) {
            joiner.add("risultato___starts_with: " + GraphQLRequestSerializer.getEntry(risultato___starts_with));
        }
        if (risultato___not___starts_with != null) {
            joiner.add("risultato___not___starts_with: " + GraphQLRequestSerializer.getEntry(risultato___not___starts_with));
        }
        if (risultato___ends_with != null) {
            joiner.add("risultato___ends_with: " + GraphQLRequestSerializer.getEntry(risultato___ends_with));
        }
        if (risultato___not___ends_with != null) {
            joiner.add("risultato___not___ends_with: " + GraphQLRequestSerializer.getEntry(risultato___not___ends_with));
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

    public static CliGilbertFilterDTO.Builder builder() {
        return new CliGilbertFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
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
        private String risultato___eq;
        private String risultato___ne;
        private Boolean risultato___null;
        private Boolean risultato___not___null;
        private java.util.List<String> risultato___in;
        private java.util.List<String> risultato___not___in;
        private String risultato___lt;
        private String risultato___lte;
        private String risultato___gt;
        private String risultato___gte;
        private String risultato___contains;
        private String risultato___not___contains;
        private String risultato___starts_with;
        private String risultato___not___starts_with;
        private String risultato___ends_with;
        private String risultato___not___ends_with;
        private java.util.List<CliGilbertFilterDTO> AND;
        private java.util.List<CliGilbertFilterDTO> OR;
        private CliGilbertFilterDTO NOT;

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

        public Builder setRisultato___eq(String risultato___eq) {
            this.risultato___eq = risultato___eq;
            return this;
        }

        public Builder setRisultato___ne(String risultato___ne) {
            this.risultato___ne = risultato___ne;
            return this;
        }

        public Builder setRisultato___null(Boolean risultato___null) {
            this.risultato___null = risultato___null;
            return this;
        }

        public Builder setRisultato___not___null(Boolean risultato___not___null) {
            this.risultato___not___null = risultato___not___null;
            return this;
        }

        public Builder setRisultato___in(java.util.List<String> risultato___in) {
            this.risultato___in = risultato___in;
            return this;
        }

        public Builder setRisultato___not___in(java.util.List<String> risultato___not___in) {
            this.risultato___not___in = risultato___not___in;
            return this;
        }

        public Builder setRisultato___lt(String risultato___lt) {
            this.risultato___lt = risultato___lt;
            return this;
        }

        public Builder setRisultato___lte(String risultato___lte) {
            this.risultato___lte = risultato___lte;
            return this;
        }

        public Builder setRisultato___gt(String risultato___gt) {
            this.risultato___gt = risultato___gt;
            return this;
        }

        public Builder setRisultato___gte(String risultato___gte) {
            this.risultato___gte = risultato___gte;
            return this;
        }

        public Builder setRisultato___contains(String risultato___contains) {
            this.risultato___contains = risultato___contains;
            return this;
        }

        public Builder setRisultato___not___contains(String risultato___not___contains) {
            this.risultato___not___contains = risultato___not___contains;
            return this;
        }

        public Builder setRisultato___starts_with(String risultato___starts_with) {
            this.risultato___starts_with = risultato___starts_with;
            return this;
        }

        public Builder setRisultato___not___starts_with(String risultato___not___starts_with) {
            this.risultato___not___starts_with = risultato___not___starts_with;
            return this;
        }

        public Builder setRisultato___ends_with(String risultato___ends_with) {
            this.risultato___ends_with = risultato___ends_with;
            return this;
        }

        public Builder setRisultato___not___ends_with(String risultato___not___ends_with) {
            this.risultato___not___ends_with = risultato___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliGilbertFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliGilbertFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliGilbertFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliGilbertFilterDTO build() {
            CliGilbertFilterDTO result = new CliGilbertFilterDTO();
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
            result.setRisultato___eq(this.risultato___eq);
            result.setRisultato___ne(this.risultato___ne);
            result.setRisultato___null(this.risultato___null);
            result.setRisultato___not___null(this.risultato___not___null);
            result.setRisultato___in(this.risultato___in);
            result.setRisultato___not___in(this.risultato___not___in);
            result.setRisultato___lt(this.risultato___lt);
            result.setRisultato___lte(this.risultato___lte);
            result.setRisultato___gt(this.risultato___gt);
            result.setRisultato___gte(this.risultato___gte);
            result.setRisultato___contains(this.risultato___contains);
            result.setRisultato___not___contains(this.risultato___not___contains);
            result.setRisultato___starts_with(this.risultato___starts_with);
            result.setRisultato___not___starts_with(this.risultato___not___starts_with);
            result.setRisultato___ends_with(this.risultato___ends_with);
            result.setRisultato___not___ends_with(this.risultato___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
