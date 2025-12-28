package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Combinazioni_accettate_non_ARV.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCombinazioni_accettate_non_ARVFilterDTO implements java.io.Serializable {

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
    private String farmaci___eq;
    private String farmaci___ne;
    private Boolean farmaci___null;
    private Boolean farmaci___not___null;
    private java.util.List<String> farmaci___in;
    private java.util.List<String> farmaci___not___in;
    private String farmaci___lt;
    private String farmaci___lte;
    private String farmaci___gt;
    private String farmaci___gte;
    private String farmaci___contains;
    private String farmaci___not___contains;
    private String farmaci___starts_with;
    private String farmaci___not___starts_with;
    private String farmaci___ends_with;
    private String farmaci___not___ends_with;
    private java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> AND;
    private java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> OR;
    private CliCombinazioni_accettate_non_ARVFilterDTO NOT;

    public CliCombinazioni_accettate_non_ARVFilterDTO() {
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

    public String getFarmaci___eq() {
        return farmaci___eq;
    }
    public void setFarmaci___eq(String farmaci___eq) {
        this.farmaci___eq = farmaci___eq;
    }

    public String getFarmaci___ne() {
        return farmaci___ne;
    }
    public void setFarmaci___ne(String farmaci___ne) {
        this.farmaci___ne = farmaci___ne;
    }

    public Boolean getFarmaci___null() {
        return farmaci___null;
    }
    public void setFarmaci___null(Boolean farmaci___null) {
        this.farmaci___null = farmaci___null;
    }

    public Boolean getFarmaci___not___null() {
        return farmaci___not___null;
    }
    public void setFarmaci___not___null(Boolean farmaci___not___null) {
        this.farmaci___not___null = farmaci___not___null;
    }

    public java.util.List<String> getFarmaci___in() {
        return farmaci___in;
    }
    public void setFarmaci___in(java.util.List<String> farmaci___in) {
        this.farmaci___in = farmaci___in;
    }

    public java.util.List<String> getFarmaci___not___in() {
        return farmaci___not___in;
    }
    public void setFarmaci___not___in(java.util.List<String> farmaci___not___in) {
        this.farmaci___not___in = farmaci___not___in;
    }

    public String getFarmaci___lt() {
        return farmaci___lt;
    }
    public void setFarmaci___lt(String farmaci___lt) {
        this.farmaci___lt = farmaci___lt;
    }

    public String getFarmaci___lte() {
        return farmaci___lte;
    }
    public void setFarmaci___lte(String farmaci___lte) {
        this.farmaci___lte = farmaci___lte;
    }

    public String getFarmaci___gt() {
        return farmaci___gt;
    }
    public void setFarmaci___gt(String farmaci___gt) {
        this.farmaci___gt = farmaci___gt;
    }

    public String getFarmaci___gte() {
        return farmaci___gte;
    }
    public void setFarmaci___gte(String farmaci___gte) {
        this.farmaci___gte = farmaci___gte;
    }

    public String getFarmaci___contains() {
        return farmaci___contains;
    }
    public void setFarmaci___contains(String farmaci___contains) {
        this.farmaci___contains = farmaci___contains;
    }

    public String getFarmaci___not___contains() {
        return farmaci___not___contains;
    }
    public void setFarmaci___not___contains(String farmaci___not___contains) {
        this.farmaci___not___contains = farmaci___not___contains;
    }

    public String getFarmaci___starts_with() {
        return farmaci___starts_with;
    }
    public void setFarmaci___starts_with(String farmaci___starts_with) {
        this.farmaci___starts_with = farmaci___starts_with;
    }

    public String getFarmaci___not___starts_with() {
        return farmaci___not___starts_with;
    }
    public void setFarmaci___not___starts_with(String farmaci___not___starts_with) {
        this.farmaci___not___starts_with = farmaci___not___starts_with;
    }

    public String getFarmaci___ends_with() {
        return farmaci___ends_with;
    }
    public void setFarmaci___ends_with(String farmaci___ends_with) {
        this.farmaci___ends_with = farmaci___ends_with;
    }

    public String getFarmaci___not___ends_with() {
        return farmaci___not___ends_with;
    }
    public void setFarmaci___not___ends_with(String farmaci___not___ends_with) {
        this.farmaci___not___ends_with = farmaci___not___ends_with;
    }

    public java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> OR) {
        this.OR = OR;
    }

    public CliCombinazioni_accettate_non_ARVFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliCombinazioni_accettate_non_ARVFilterDTO NOT) {
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
        if (farmaci___eq != null) {
            joiner.add("farmaci___eq: " + GraphQLRequestSerializer.getEntry(farmaci___eq));
        }
        if (farmaci___ne != null) {
            joiner.add("farmaci___ne: " + GraphQLRequestSerializer.getEntry(farmaci___ne));
        }
        if (farmaci___null != null) {
            joiner.add("farmaci___null: " + GraphQLRequestSerializer.getEntry(farmaci___null));
        }
        if (farmaci___not___null != null) {
            joiner.add("farmaci___not___null: " + GraphQLRequestSerializer.getEntry(farmaci___not___null));
        }
        if (farmaci___in != null) {
            joiner.add("farmaci___in: " + GraphQLRequestSerializer.getEntry(farmaci___in));
        }
        if (farmaci___not___in != null) {
            joiner.add("farmaci___not___in: " + GraphQLRequestSerializer.getEntry(farmaci___not___in));
        }
        if (farmaci___lt != null) {
            joiner.add("farmaci___lt: " + GraphQLRequestSerializer.getEntry(farmaci___lt));
        }
        if (farmaci___lte != null) {
            joiner.add("farmaci___lte: " + GraphQLRequestSerializer.getEntry(farmaci___lte));
        }
        if (farmaci___gt != null) {
            joiner.add("farmaci___gt: " + GraphQLRequestSerializer.getEntry(farmaci___gt));
        }
        if (farmaci___gte != null) {
            joiner.add("farmaci___gte: " + GraphQLRequestSerializer.getEntry(farmaci___gte));
        }
        if (farmaci___contains != null) {
            joiner.add("farmaci___contains: " + GraphQLRequestSerializer.getEntry(farmaci___contains));
        }
        if (farmaci___not___contains != null) {
            joiner.add("farmaci___not___contains: " + GraphQLRequestSerializer.getEntry(farmaci___not___contains));
        }
        if (farmaci___starts_with != null) {
            joiner.add("farmaci___starts_with: " + GraphQLRequestSerializer.getEntry(farmaci___starts_with));
        }
        if (farmaci___not___starts_with != null) {
            joiner.add("farmaci___not___starts_with: " + GraphQLRequestSerializer.getEntry(farmaci___not___starts_with));
        }
        if (farmaci___ends_with != null) {
            joiner.add("farmaci___ends_with: " + GraphQLRequestSerializer.getEntry(farmaci___ends_with));
        }
        if (farmaci___not___ends_with != null) {
            joiner.add("farmaci___not___ends_with: " + GraphQLRequestSerializer.getEntry(farmaci___not___ends_with));
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

    public static CliCombinazioni_accettate_non_ARVFilterDTO.Builder builder() {
        return new CliCombinazioni_accettate_non_ARVFilterDTO.Builder();
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
        private String farmaci___eq;
        private String farmaci___ne;
        private Boolean farmaci___null;
        private Boolean farmaci___not___null;
        private java.util.List<String> farmaci___in;
        private java.util.List<String> farmaci___not___in;
        private String farmaci___lt;
        private String farmaci___lte;
        private String farmaci___gt;
        private String farmaci___gte;
        private String farmaci___contains;
        private String farmaci___not___contains;
        private String farmaci___starts_with;
        private String farmaci___not___starts_with;
        private String farmaci___ends_with;
        private String farmaci___not___ends_with;
        private java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> AND;
        private java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> OR;
        private CliCombinazioni_accettate_non_ARVFilterDTO NOT;

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

        public Builder setFarmaci___eq(String farmaci___eq) {
            this.farmaci___eq = farmaci___eq;
            return this;
        }

        public Builder setFarmaci___ne(String farmaci___ne) {
            this.farmaci___ne = farmaci___ne;
            return this;
        }

        public Builder setFarmaci___null(Boolean farmaci___null) {
            this.farmaci___null = farmaci___null;
            return this;
        }

        public Builder setFarmaci___not___null(Boolean farmaci___not___null) {
            this.farmaci___not___null = farmaci___not___null;
            return this;
        }

        public Builder setFarmaci___in(java.util.List<String> farmaci___in) {
            this.farmaci___in = farmaci___in;
            return this;
        }

        public Builder setFarmaci___not___in(java.util.List<String> farmaci___not___in) {
            this.farmaci___not___in = farmaci___not___in;
            return this;
        }

        public Builder setFarmaci___lt(String farmaci___lt) {
            this.farmaci___lt = farmaci___lt;
            return this;
        }

        public Builder setFarmaci___lte(String farmaci___lte) {
            this.farmaci___lte = farmaci___lte;
            return this;
        }

        public Builder setFarmaci___gt(String farmaci___gt) {
            this.farmaci___gt = farmaci___gt;
            return this;
        }

        public Builder setFarmaci___gte(String farmaci___gte) {
            this.farmaci___gte = farmaci___gte;
            return this;
        }

        public Builder setFarmaci___contains(String farmaci___contains) {
            this.farmaci___contains = farmaci___contains;
            return this;
        }

        public Builder setFarmaci___not___contains(String farmaci___not___contains) {
            this.farmaci___not___contains = farmaci___not___contains;
            return this;
        }

        public Builder setFarmaci___starts_with(String farmaci___starts_with) {
            this.farmaci___starts_with = farmaci___starts_with;
            return this;
        }

        public Builder setFarmaci___not___starts_with(String farmaci___not___starts_with) {
            this.farmaci___not___starts_with = farmaci___not___starts_with;
            return this;
        }

        public Builder setFarmaci___ends_with(String farmaci___ends_with) {
            this.farmaci___ends_with = farmaci___ends_with;
            return this;
        }

        public Builder setFarmaci___not___ends_with(String farmaci___not___ends_with) {
            this.farmaci___not___ends_with = farmaci___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliCombinazioni_accettate_non_ARVFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliCombinazioni_accettate_non_ARVFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliCombinazioni_accettate_non_ARVFilterDTO build() {
            CliCombinazioni_accettate_non_ARVFilterDTO result = new CliCombinazioni_accettate_non_ARVFilterDTO();
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
            result.setFarmaci___eq(this.farmaci___eq);
            result.setFarmaci___ne(this.farmaci___ne);
            result.setFarmaci___null(this.farmaci___null);
            result.setFarmaci___not___null(this.farmaci___not___null);
            result.setFarmaci___in(this.farmaci___in);
            result.setFarmaci___not___in(this.farmaci___not___in);
            result.setFarmaci___lt(this.farmaci___lt);
            result.setFarmaci___lte(this.farmaci___lte);
            result.setFarmaci___gt(this.farmaci___gt);
            result.setFarmaci___gte(this.farmaci___gte);
            result.setFarmaci___contains(this.farmaci___contains);
            result.setFarmaci___not___contains(this.farmaci___not___contains);
            result.setFarmaci___starts_with(this.farmaci___starts_with);
            result.setFarmaci___not___starts_with(this.farmaci___not___starts_with);
            result.setFarmaci___ends_with(this.farmaci___ends_with);
            result.setFarmaci___not___ends_with(this.farmaci___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
