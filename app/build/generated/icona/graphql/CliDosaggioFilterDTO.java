package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type dosaggio.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDosaggioFilterDTO implements java.io.Serializable {

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
    private Integer farmaco_altro_id___eq;
    private Integer farmaco_altro_id___ne;
    private Boolean farmaco_altro_id___null;
    private Boolean farmaco_altro_id___not___null;
    private java.util.List<Integer> farmaco_altro_id___in;
    private java.util.List<Integer> farmaco_altro_id___not___in;
    private Integer farmaco_altro_id___lt;
    private Integer farmaco_altro_id___lte;
    private Integer farmaco_altro_id___gt;
    private Integer farmaco_altro_id___gte;
    private Integer farmaco_arv_id___eq;
    private Integer farmaco_arv_id___ne;
    private Boolean farmaco_arv_id___null;
    private Boolean farmaco_arv_id___not___null;
    private java.util.List<Integer> farmaco_arv_id___in;
    private java.util.List<Integer> farmaco_arv_id___not___in;
    private Integer farmaco_arv_id___lt;
    private Integer farmaco_arv_id___lte;
    private Integer farmaco_arv_id___gt;
    private Integer farmaco_arv_id___gte;
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
    private java.util.List<CliDosaggioFilterDTO> AND;
    private java.util.List<CliDosaggioFilterDTO> OR;
    private CliDosaggioFilterDTO NOT;

    public CliDosaggioFilterDTO() {
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

    public Integer getFarmaco_altro_id___eq() {
        return farmaco_altro_id___eq;
    }
    public void setFarmaco_altro_id___eq(Integer farmaco_altro_id___eq) {
        this.farmaco_altro_id___eq = farmaco_altro_id___eq;
    }

    public Integer getFarmaco_altro_id___ne() {
        return farmaco_altro_id___ne;
    }
    public void setFarmaco_altro_id___ne(Integer farmaco_altro_id___ne) {
        this.farmaco_altro_id___ne = farmaco_altro_id___ne;
    }

    public Boolean getFarmaco_altro_id___null() {
        return farmaco_altro_id___null;
    }
    public void setFarmaco_altro_id___null(Boolean farmaco_altro_id___null) {
        this.farmaco_altro_id___null = farmaco_altro_id___null;
    }

    public Boolean getFarmaco_altro_id___not___null() {
        return farmaco_altro_id___not___null;
    }
    public void setFarmaco_altro_id___not___null(Boolean farmaco_altro_id___not___null) {
        this.farmaco_altro_id___not___null = farmaco_altro_id___not___null;
    }

    public java.util.List<Integer> getFarmaco_altro_id___in() {
        return farmaco_altro_id___in;
    }
    public void setFarmaco_altro_id___in(java.util.List<Integer> farmaco_altro_id___in) {
        this.farmaco_altro_id___in = farmaco_altro_id___in;
    }

    public java.util.List<Integer> getFarmaco_altro_id___not___in() {
        return farmaco_altro_id___not___in;
    }
    public void setFarmaco_altro_id___not___in(java.util.List<Integer> farmaco_altro_id___not___in) {
        this.farmaco_altro_id___not___in = farmaco_altro_id___not___in;
    }

    public Integer getFarmaco_altro_id___lt() {
        return farmaco_altro_id___lt;
    }
    public void setFarmaco_altro_id___lt(Integer farmaco_altro_id___lt) {
        this.farmaco_altro_id___lt = farmaco_altro_id___lt;
    }

    public Integer getFarmaco_altro_id___lte() {
        return farmaco_altro_id___lte;
    }
    public void setFarmaco_altro_id___lte(Integer farmaco_altro_id___lte) {
        this.farmaco_altro_id___lte = farmaco_altro_id___lte;
    }

    public Integer getFarmaco_altro_id___gt() {
        return farmaco_altro_id___gt;
    }
    public void setFarmaco_altro_id___gt(Integer farmaco_altro_id___gt) {
        this.farmaco_altro_id___gt = farmaco_altro_id___gt;
    }

    public Integer getFarmaco_altro_id___gte() {
        return farmaco_altro_id___gte;
    }
    public void setFarmaco_altro_id___gte(Integer farmaco_altro_id___gte) {
        this.farmaco_altro_id___gte = farmaco_altro_id___gte;
    }

    public Integer getFarmaco_arv_id___eq() {
        return farmaco_arv_id___eq;
    }
    public void setFarmaco_arv_id___eq(Integer farmaco_arv_id___eq) {
        this.farmaco_arv_id___eq = farmaco_arv_id___eq;
    }

    public Integer getFarmaco_arv_id___ne() {
        return farmaco_arv_id___ne;
    }
    public void setFarmaco_arv_id___ne(Integer farmaco_arv_id___ne) {
        this.farmaco_arv_id___ne = farmaco_arv_id___ne;
    }

    public Boolean getFarmaco_arv_id___null() {
        return farmaco_arv_id___null;
    }
    public void setFarmaco_arv_id___null(Boolean farmaco_arv_id___null) {
        this.farmaco_arv_id___null = farmaco_arv_id___null;
    }

    public Boolean getFarmaco_arv_id___not___null() {
        return farmaco_arv_id___not___null;
    }
    public void setFarmaco_arv_id___not___null(Boolean farmaco_arv_id___not___null) {
        this.farmaco_arv_id___not___null = farmaco_arv_id___not___null;
    }

    public java.util.List<Integer> getFarmaco_arv_id___in() {
        return farmaco_arv_id___in;
    }
    public void setFarmaco_arv_id___in(java.util.List<Integer> farmaco_arv_id___in) {
        this.farmaco_arv_id___in = farmaco_arv_id___in;
    }

    public java.util.List<Integer> getFarmaco_arv_id___not___in() {
        return farmaco_arv_id___not___in;
    }
    public void setFarmaco_arv_id___not___in(java.util.List<Integer> farmaco_arv_id___not___in) {
        this.farmaco_arv_id___not___in = farmaco_arv_id___not___in;
    }

    public Integer getFarmaco_arv_id___lt() {
        return farmaco_arv_id___lt;
    }
    public void setFarmaco_arv_id___lt(Integer farmaco_arv_id___lt) {
        this.farmaco_arv_id___lt = farmaco_arv_id___lt;
    }

    public Integer getFarmaco_arv_id___lte() {
        return farmaco_arv_id___lte;
    }
    public void setFarmaco_arv_id___lte(Integer farmaco_arv_id___lte) {
        this.farmaco_arv_id___lte = farmaco_arv_id___lte;
    }

    public Integer getFarmaco_arv_id___gt() {
        return farmaco_arv_id___gt;
    }
    public void setFarmaco_arv_id___gt(Integer farmaco_arv_id___gt) {
        this.farmaco_arv_id___gt = farmaco_arv_id___gt;
    }

    public Integer getFarmaco_arv_id___gte() {
        return farmaco_arv_id___gte;
    }
    public void setFarmaco_arv_id___gte(Integer farmaco_arv_id___gte) {
        this.farmaco_arv_id___gte = farmaco_arv_id___gte;
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

    public java.util.List<CliDosaggioFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliDosaggioFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliDosaggioFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliDosaggioFilterDTO> OR) {
        this.OR = OR;
    }

    public CliDosaggioFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliDosaggioFilterDTO NOT) {
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
        if (farmaco_altro_id___eq != null) {
            joiner.add("farmaco_altro_id___eq: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___eq));
        }
        if (farmaco_altro_id___ne != null) {
            joiner.add("farmaco_altro_id___ne: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___ne));
        }
        if (farmaco_altro_id___null != null) {
            joiner.add("farmaco_altro_id___null: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___null));
        }
        if (farmaco_altro_id___not___null != null) {
            joiner.add("farmaco_altro_id___not___null: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___not___null));
        }
        if (farmaco_altro_id___in != null) {
            joiner.add("farmaco_altro_id___in: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___in));
        }
        if (farmaco_altro_id___not___in != null) {
            joiner.add("farmaco_altro_id___not___in: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___not___in));
        }
        if (farmaco_altro_id___lt != null) {
            joiner.add("farmaco_altro_id___lt: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___lt));
        }
        if (farmaco_altro_id___lte != null) {
            joiner.add("farmaco_altro_id___lte: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___lte));
        }
        if (farmaco_altro_id___gt != null) {
            joiner.add("farmaco_altro_id___gt: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___gt));
        }
        if (farmaco_altro_id___gte != null) {
            joiner.add("farmaco_altro_id___gte: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id___gte));
        }
        if (farmaco_arv_id___eq != null) {
            joiner.add("farmaco_arv_id___eq: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___eq));
        }
        if (farmaco_arv_id___ne != null) {
            joiner.add("farmaco_arv_id___ne: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___ne));
        }
        if (farmaco_arv_id___null != null) {
            joiner.add("farmaco_arv_id___null: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___null));
        }
        if (farmaco_arv_id___not___null != null) {
            joiner.add("farmaco_arv_id___not___null: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___not___null));
        }
        if (farmaco_arv_id___in != null) {
            joiner.add("farmaco_arv_id___in: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___in));
        }
        if (farmaco_arv_id___not___in != null) {
            joiner.add("farmaco_arv_id___not___in: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___not___in));
        }
        if (farmaco_arv_id___lt != null) {
            joiner.add("farmaco_arv_id___lt: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___lt));
        }
        if (farmaco_arv_id___lte != null) {
            joiner.add("farmaco_arv_id___lte: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___lte));
        }
        if (farmaco_arv_id___gt != null) {
            joiner.add("farmaco_arv_id___gt: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___gt));
        }
        if (farmaco_arv_id___gte != null) {
            joiner.add("farmaco_arv_id___gte: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id___gte));
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

    public static CliDosaggioFilterDTO.Builder builder() {
        return new CliDosaggioFilterDTO.Builder();
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
        private Integer farmaco_altro_id___eq;
        private Integer farmaco_altro_id___ne;
        private Boolean farmaco_altro_id___null;
        private Boolean farmaco_altro_id___not___null;
        private java.util.List<Integer> farmaco_altro_id___in;
        private java.util.List<Integer> farmaco_altro_id___not___in;
        private Integer farmaco_altro_id___lt;
        private Integer farmaco_altro_id___lte;
        private Integer farmaco_altro_id___gt;
        private Integer farmaco_altro_id___gte;
        private Integer farmaco_arv_id___eq;
        private Integer farmaco_arv_id___ne;
        private Boolean farmaco_arv_id___null;
        private Boolean farmaco_arv_id___not___null;
        private java.util.List<Integer> farmaco_arv_id___in;
        private java.util.List<Integer> farmaco_arv_id___not___in;
        private Integer farmaco_arv_id___lt;
        private Integer farmaco_arv_id___lte;
        private Integer farmaco_arv_id___gt;
        private Integer farmaco_arv_id___gte;
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
        private java.util.List<CliDosaggioFilterDTO> AND;
        private java.util.List<CliDosaggioFilterDTO> OR;
        private CliDosaggioFilterDTO NOT;

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

        public Builder setFarmaco_altro_id___eq(Integer farmaco_altro_id___eq) {
            this.farmaco_altro_id___eq = farmaco_altro_id___eq;
            return this;
        }

        public Builder setFarmaco_altro_id___ne(Integer farmaco_altro_id___ne) {
            this.farmaco_altro_id___ne = farmaco_altro_id___ne;
            return this;
        }

        public Builder setFarmaco_altro_id___null(Boolean farmaco_altro_id___null) {
            this.farmaco_altro_id___null = farmaco_altro_id___null;
            return this;
        }

        public Builder setFarmaco_altro_id___not___null(Boolean farmaco_altro_id___not___null) {
            this.farmaco_altro_id___not___null = farmaco_altro_id___not___null;
            return this;
        }

        public Builder setFarmaco_altro_id___in(java.util.List<Integer> farmaco_altro_id___in) {
            this.farmaco_altro_id___in = farmaco_altro_id___in;
            return this;
        }

        public Builder setFarmaco_altro_id___not___in(java.util.List<Integer> farmaco_altro_id___not___in) {
            this.farmaco_altro_id___not___in = farmaco_altro_id___not___in;
            return this;
        }

        public Builder setFarmaco_altro_id___lt(Integer farmaco_altro_id___lt) {
            this.farmaco_altro_id___lt = farmaco_altro_id___lt;
            return this;
        }

        public Builder setFarmaco_altro_id___lte(Integer farmaco_altro_id___lte) {
            this.farmaco_altro_id___lte = farmaco_altro_id___lte;
            return this;
        }

        public Builder setFarmaco_altro_id___gt(Integer farmaco_altro_id___gt) {
            this.farmaco_altro_id___gt = farmaco_altro_id___gt;
            return this;
        }

        public Builder setFarmaco_altro_id___gte(Integer farmaco_altro_id___gte) {
            this.farmaco_altro_id___gte = farmaco_altro_id___gte;
            return this;
        }

        public Builder setFarmaco_arv_id___eq(Integer farmaco_arv_id___eq) {
            this.farmaco_arv_id___eq = farmaco_arv_id___eq;
            return this;
        }

        public Builder setFarmaco_arv_id___ne(Integer farmaco_arv_id___ne) {
            this.farmaco_arv_id___ne = farmaco_arv_id___ne;
            return this;
        }

        public Builder setFarmaco_arv_id___null(Boolean farmaco_arv_id___null) {
            this.farmaco_arv_id___null = farmaco_arv_id___null;
            return this;
        }

        public Builder setFarmaco_arv_id___not___null(Boolean farmaco_arv_id___not___null) {
            this.farmaco_arv_id___not___null = farmaco_arv_id___not___null;
            return this;
        }

        public Builder setFarmaco_arv_id___in(java.util.List<Integer> farmaco_arv_id___in) {
            this.farmaco_arv_id___in = farmaco_arv_id___in;
            return this;
        }

        public Builder setFarmaco_arv_id___not___in(java.util.List<Integer> farmaco_arv_id___not___in) {
            this.farmaco_arv_id___not___in = farmaco_arv_id___not___in;
            return this;
        }

        public Builder setFarmaco_arv_id___lt(Integer farmaco_arv_id___lt) {
            this.farmaco_arv_id___lt = farmaco_arv_id___lt;
            return this;
        }

        public Builder setFarmaco_arv_id___lte(Integer farmaco_arv_id___lte) {
            this.farmaco_arv_id___lte = farmaco_arv_id___lte;
            return this;
        }

        public Builder setFarmaco_arv_id___gt(Integer farmaco_arv_id___gt) {
            this.farmaco_arv_id___gt = farmaco_arv_id___gt;
            return this;
        }

        public Builder setFarmaco_arv_id___gte(Integer farmaco_arv_id___gte) {
            this.farmaco_arv_id___gte = farmaco_arv_id___gte;
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

        public Builder setAND(java.util.List<CliDosaggioFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliDosaggioFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliDosaggioFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliDosaggioFilterDTO build() {
            CliDosaggioFilterDTO result = new CliDosaggioFilterDTO();
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
            result.setFarmaco_altro_id___eq(this.farmaco_altro_id___eq);
            result.setFarmaco_altro_id___ne(this.farmaco_altro_id___ne);
            result.setFarmaco_altro_id___null(this.farmaco_altro_id___null);
            result.setFarmaco_altro_id___not___null(this.farmaco_altro_id___not___null);
            result.setFarmaco_altro_id___in(this.farmaco_altro_id___in);
            result.setFarmaco_altro_id___not___in(this.farmaco_altro_id___not___in);
            result.setFarmaco_altro_id___lt(this.farmaco_altro_id___lt);
            result.setFarmaco_altro_id___lte(this.farmaco_altro_id___lte);
            result.setFarmaco_altro_id___gt(this.farmaco_altro_id___gt);
            result.setFarmaco_altro_id___gte(this.farmaco_altro_id___gte);
            result.setFarmaco_arv_id___eq(this.farmaco_arv_id___eq);
            result.setFarmaco_arv_id___ne(this.farmaco_arv_id___ne);
            result.setFarmaco_arv_id___null(this.farmaco_arv_id___null);
            result.setFarmaco_arv_id___not___null(this.farmaco_arv_id___not___null);
            result.setFarmaco_arv_id___in(this.farmaco_arv_id___in);
            result.setFarmaco_arv_id___not___in(this.farmaco_arv_id___not___in);
            result.setFarmaco_arv_id___lt(this.farmaco_arv_id___lt);
            result.setFarmaco_arv_id___lte(this.farmaco_arv_id___lte);
            result.setFarmaco_arv_id___gt(this.farmaco_arv_id___gt);
            result.setFarmaco_arv_id___gte(this.farmaco_arv_id___gte);
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
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
