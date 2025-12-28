package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Codici_gravidanza.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCodici_gravidanzaFilterDTO implements java.io.Serializable {

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
    private String campo___eq;
    private String campo___ne;
    private Boolean campo___null;
    private Boolean campo___not___null;
    private java.util.List<String> campo___in;
    private java.util.List<String> campo___not___in;
    private String campo___lt;
    private String campo___lte;
    private String campo___gt;
    private String campo___gte;
    private String campo___contains;
    private String campo___not___contains;
    private String campo___starts_with;
    private String campo___not___starts_with;
    private String campo___ends_with;
    private String campo___not___ends_with;
    private String codice_hicdep___eq;
    private String codice_hicdep___ne;
    private Boolean codice_hicdep___null;
    private Boolean codice_hicdep___not___null;
    private java.util.List<String> codice_hicdep___in;
    private java.util.List<String> codice_hicdep___not___in;
    private String codice_hicdep___lt;
    private String codice_hicdep___lte;
    private String codice_hicdep___gt;
    private String codice_hicdep___gte;
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
    private java.util.List<CliCodici_gravidanzaFilterDTO> AND;
    private java.util.List<CliCodici_gravidanzaFilterDTO> OR;
    private CliCodici_gravidanzaFilterDTO NOT;

    public CliCodici_gravidanzaFilterDTO() {
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

    public String getCampo___eq() {
        return campo___eq;
    }
    public void setCampo___eq(String campo___eq) {
        this.campo___eq = campo___eq;
    }

    public String getCampo___ne() {
        return campo___ne;
    }
    public void setCampo___ne(String campo___ne) {
        this.campo___ne = campo___ne;
    }

    public Boolean getCampo___null() {
        return campo___null;
    }
    public void setCampo___null(Boolean campo___null) {
        this.campo___null = campo___null;
    }

    public Boolean getCampo___not___null() {
        return campo___not___null;
    }
    public void setCampo___not___null(Boolean campo___not___null) {
        this.campo___not___null = campo___not___null;
    }

    public java.util.List<String> getCampo___in() {
        return campo___in;
    }
    public void setCampo___in(java.util.List<String> campo___in) {
        this.campo___in = campo___in;
    }

    public java.util.List<String> getCampo___not___in() {
        return campo___not___in;
    }
    public void setCampo___not___in(java.util.List<String> campo___not___in) {
        this.campo___not___in = campo___not___in;
    }

    public String getCampo___lt() {
        return campo___lt;
    }
    public void setCampo___lt(String campo___lt) {
        this.campo___lt = campo___lt;
    }

    public String getCampo___lte() {
        return campo___lte;
    }
    public void setCampo___lte(String campo___lte) {
        this.campo___lte = campo___lte;
    }

    public String getCampo___gt() {
        return campo___gt;
    }
    public void setCampo___gt(String campo___gt) {
        this.campo___gt = campo___gt;
    }

    public String getCampo___gte() {
        return campo___gte;
    }
    public void setCampo___gte(String campo___gte) {
        this.campo___gte = campo___gte;
    }

    public String getCampo___contains() {
        return campo___contains;
    }
    public void setCampo___contains(String campo___contains) {
        this.campo___contains = campo___contains;
    }

    public String getCampo___not___contains() {
        return campo___not___contains;
    }
    public void setCampo___not___contains(String campo___not___contains) {
        this.campo___not___contains = campo___not___contains;
    }

    public String getCampo___starts_with() {
        return campo___starts_with;
    }
    public void setCampo___starts_with(String campo___starts_with) {
        this.campo___starts_with = campo___starts_with;
    }

    public String getCampo___not___starts_with() {
        return campo___not___starts_with;
    }
    public void setCampo___not___starts_with(String campo___not___starts_with) {
        this.campo___not___starts_with = campo___not___starts_with;
    }

    public String getCampo___ends_with() {
        return campo___ends_with;
    }
    public void setCampo___ends_with(String campo___ends_with) {
        this.campo___ends_with = campo___ends_with;
    }

    public String getCampo___not___ends_with() {
        return campo___not___ends_with;
    }
    public void setCampo___not___ends_with(String campo___not___ends_with) {
        this.campo___not___ends_with = campo___not___ends_with;
    }

    public String getCodice_hicdep___eq() {
        return codice_hicdep___eq;
    }
    public void setCodice_hicdep___eq(String codice_hicdep___eq) {
        this.codice_hicdep___eq = codice_hicdep___eq;
    }

    public String getCodice_hicdep___ne() {
        return codice_hicdep___ne;
    }
    public void setCodice_hicdep___ne(String codice_hicdep___ne) {
        this.codice_hicdep___ne = codice_hicdep___ne;
    }

    public Boolean getCodice_hicdep___null() {
        return codice_hicdep___null;
    }
    public void setCodice_hicdep___null(Boolean codice_hicdep___null) {
        this.codice_hicdep___null = codice_hicdep___null;
    }

    public Boolean getCodice_hicdep___not___null() {
        return codice_hicdep___not___null;
    }
    public void setCodice_hicdep___not___null(Boolean codice_hicdep___not___null) {
        this.codice_hicdep___not___null = codice_hicdep___not___null;
    }

    public java.util.List<String> getCodice_hicdep___in() {
        return codice_hicdep___in;
    }
    public void setCodice_hicdep___in(java.util.List<String> codice_hicdep___in) {
        this.codice_hicdep___in = codice_hicdep___in;
    }

    public java.util.List<String> getCodice_hicdep___not___in() {
        return codice_hicdep___not___in;
    }
    public void setCodice_hicdep___not___in(java.util.List<String> codice_hicdep___not___in) {
        this.codice_hicdep___not___in = codice_hicdep___not___in;
    }

    public String getCodice_hicdep___lt() {
        return codice_hicdep___lt;
    }
    public void setCodice_hicdep___lt(String codice_hicdep___lt) {
        this.codice_hicdep___lt = codice_hicdep___lt;
    }

    public String getCodice_hicdep___lte() {
        return codice_hicdep___lte;
    }
    public void setCodice_hicdep___lte(String codice_hicdep___lte) {
        this.codice_hicdep___lte = codice_hicdep___lte;
    }

    public String getCodice_hicdep___gt() {
        return codice_hicdep___gt;
    }
    public void setCodice_hicdep___gt(String codice_hicdep___gt) {
        this.codice_hicdep___gt = codice_hicdep___gt;
    }

    public String getCodice_hicdep___gte() {
        return codice_hicdep___gte;
    }
    public void setCodice_hicdep___gte(String codice_hicdep___gte) {
        this.codice_hicdep___gte = codice_hicdep___gte;
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

    public java.util.List<CliCodici_gravidanzaFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliCodici_gravidanzaFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliCodici_gravidanzaFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliCodici_gravidanzaFilterDTO> OR) {
        this.OR = OR;
    }

    public CliCodici_gravidanzaFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliCodici_gravidanzaFilterDTO NOT) {
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
        if (campo___eq != null) {
            joiner.add("campo___eq: " + GraphQLRequestSerializer.getEntry(campo___eq));
        }
        if (campo___ne != null) {
            joiner.add("campo___ne: " + GraphQLRequestSerializer.getEntry(campo___ne));
        }
        if (campo___null != null) {
            joiner.add("campo___null: " + GraphQLRequestSerializer.getEntry(campo___null));
        }
        if (campo___not___null != null) {
            joiner.add("campo___not___null: " + GraphQLRequestSerializer.getEntry(campo___not___null));
        }
        if (campo___in != null) {
            joiner.add("campo___in: " + GraphQLRequestSerializer.getEntry(campo___in));
        }
        if (campo___not___in != null) {
            joiner.add("campo___not___in: " + GraphQLRequestSerializer.getEntry(campo___not___in));
        }
        if (campo___lt != null) {
            joiner.add("campo___lt: " + GraphQLRequestSerializer.getEntry(campo___lt));
        }
        if (campo___lte != null) {
            joiner.add("campo___lte: " + GraphQLRequestSerializer.getEntry(campo___lte));
        }
        if (campo___gt != null) {
            joiner.add("campo___gt: " + GraphQLRequestSerializer.getEntry(campo___gt));
        }
        if (campo___gte != null) {
            joiner.add("campo___gte: " + GraphQLRequestSerializer.getEntry(campo___gte));
        }
        if (campo___contains != null) {
            joiner.add("campo___contains: " + GraphQLRequestSerializer.getEntry(campo___contains));
        }
        if (campo___not___contains != null) {
            joiner.add("campo___not___contains: " + GraphQLRequestSerializer.getEntry(campo___not___contains));
        }
        if (campo___starts_with != null) {
            joiner.add("campo___starts_with: " + GraphQLRequestSerializer.getEntry(campo___starts_with));
        }
        if (campo___not___starts_with != null) {
            joiner.add("campo___not___starts_with: " + GraphQLRequestSerializer.getEntry(campo___not___starts_with));
        }
        if (campo___ends_with != null) {
            joiner.add("campo___ends_with: " + GraphQLRequestSerializer.getEntry(campo___ends_with));
        }
        if (campo___not___ends_with != null) {
            joiner.add("campo___not___ends_with: " + GraphQLRequestSerializer.getEntry(campo___not___ends_with));
        }
        if (codice_hicdep___eq != null) {
            joiner.add("codice_hicdep___eq: " + GraphQLRequestSerializer.getEntry(codice_hicdep___eq));
        }
        if (codice_hicdep___ne != null) {
            joiner.add("codice_hicdep___ne: " + GraphQLRequestSerializer.getEntry(codice_hicdep___ne));
        }
        if (codice_hicdep___null != null) {
            joiner.add("codice_hicdep___null: " + GraphQLRequestSerializer.getEntry(codice_hicdep___null));
        }
        if (codice_hicdep___not___null != null) {
            joiner.add("codice_hicdep___not___null: " + GraphQLRequestSerializer.getEntry(codice_hicdep___not___null));
        }
        if (codice_hicdep___in != null) {
            joiner.add("codice_hicdep___in: " + GraphQLRequestSerializer.getEntry(codice_hicdep___in));
        }
        if (codice_hicdep___not___in != null) {
            joiner.add("codice_hicdep___not___in: " + GraphQLRequestSerializer.getEntry(codice_hicdep___not___in));
        }
        if (codice_hicdep___lt != null) {
            joiner.add("codice_hicdep___lt: " + GraphQLRequestSerializer.getEntry(codice_hicdep___lt));
        }
        if (codice_hicdep___lte != null) {
            joiner.add("codice_hicdep___lte: " + GraphQLRequestSerializer.getEntry(codice_hicdep___lte));
        }
        if (codice_hicdep___gt != null) {
            joiner.add("codice_hicdep___gt: " + GraphQLRequestSerializer.getEntry(codice_hicdep___gt));
        }
        if (codice_hicdep___gte != null) {
            joiner.add("codice_hicdep___gte: " + GraphQLRequestSerializer.getEntry(codice_hicdep___gte));
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

    public static CliCodici_gravidanzaFilterDTO.Builder builder() {
        return new CliCodici_gravidanzaFilterDTO.Builder();
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
        private String campo___eq;
        private String campo___ne;
        private Boolean campo___null;
        private Boolean campo___not___null;
        private java.util.List<String> campo___in;
        private java.util.List<String> campo___not___in;
        private String campo___lt;
        private String campo___lte;
        private String campo___gt;
        private String campo___gte;
        private String campo___contains;
        private String campo___not___contains;
        private String campo___starts_with;
        private String campo___not___starts_with;
        private String campo___ends_with;
        private String campo___not___ends_with;
        private String codice_hicdep___eq;
        private String codice_hicdep___ne;
        private Boolean codice_hicdep___null;
        private Boolean codice_hicdep___not___null;
        private java.util.List<String> codice_hicdep___in;
        private java.util.List<String> codice_hicdep___not___in;
        private String codice_hicdep___lt;
        private String codice_hicdep___lte;
        private String codice_hicdep___gt;
        private String codice_hicdep___gte;
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
        private java.util.List<CliCodici_gravidanzaFilterDTO> AND;
        private java.util.List<CliCodici_gravidanzaFilterDTO> OR;
        private CliCodici_gravidanzaFilterDTO NOT;

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

        public Builder setCampo___eq(String campo___eq) {
            this.campo___eq = campo___eq;
            return this;
        }

        public Builder setCampo___ne(String campo___ne) {
            this.campo___ne = campo___ne;
            return this;
        }

        public Builder setCampo___null(Boolean campo___null) {
            this.campo___null = campo___null;
            return this;
        }

        public Builder setCampo___not___null(Boolean campo___not___null) {
            this.campo___not___null = campo___not___null;
            return this;
        }

        public Builder setCampo___in(java.util.List<String> campo___in) {
            this.campo___in = campo___in;
            return this;
        }

        public Builder setCampo___not___in(java.util.List<String> campo___not___in) {
            this.campo___not___in = campo___not___in;
            return this;
        }

        public Builder setCampo___lt(String campo___lt) {
            this.campo___lt = campo___lt;
            return this;
        }

        public Builder setCampo___lte(String campo___lte) {
            this.campo___lte = campo___lte;
            return this;
        }

        public Builder setCampo___gt(String campo___gt) {
            this.campo___gt = campo___gt;
            return this;
        }

        public Builder setCampo___gte(String campo___gte) {
            this.campo___gte = campo___gte;
            return this;
        }

        public Builder setCampo___contains(String campo___contains) {
            this.campo___contains = campo___contains;
            return this;
        }

        public Builder setCampo___not___contains(String campo___not___contains) {
            this.campo___not___contains = campo___not___contains;
            return this;
        }

        public Builder setCampo___starts_with(String campo___starts_with) {
            this.campo___starts_with = campo___starts_with;
            return this;
        }

        public Builder setCampo___not___starts_with(String campo___not___starts_with) {
            this.campo___not___starts_with = campo___not___starts_with;
            return this;
        }

        public Builder setCampo___ends_with(String campo___ends_with) {
            this.campo___ends_with = campo___ends_with;
            return this;
        }

        public Builder setCampo___not___ends_with(String campo___not___ends_with) {
            this.campo___not___ends_with = campo___not___ends_with;
            return this;
        }

        public Builder setCodice_hicdep___eq(String codice_hicdep___eq) {
            this.codice_hicdep___eq = codice_hicdep___eq;
            return this;
        }

        public Builder setCodice_hicdep___ne(String codice_hicdep___ne) {
            this.codice_hicdep___ne = codice_hicdep___ne;
            return this;
        }

        public Builder setCodice_hicdep___null(Boolean codice_hicdep___null) {
            this.codice_hicdep___null = codice_hicdep___null;
            return this;
        }

        public Builder setCodice_hicdep___not___null(Boolean codice_hicdep___not___null) {
            this.codice_hicdep___not___null = codice_hicdep___not___null;
            return this;
        }

        public Builder setCodice_hicdep___in(java.util.List<String> codice_hicdep___in) {
            this.codice_hicdep___in = codice_hicdep___in;
            return this;
        }

        public Builder setCodice_hicdep___not___in(java.util.List<String> codice_hicdep___not___in) {
            this.codice_hicdep___not___in = codice_hicdep___not___in;
            return this;
        }

        public Builder setCodice_hicdep___lt(String codice_hicdep___lt) {
            this.codice_hicdep___lt = codice_hicdep___lt;
            return this;
        }

        public Builder setCodice_hicdep___lte(String codice_hicdep___lte) {
            this.codice_hicdep___lte = codice_hicdep___lte;
            return this;
        }

        public Builder setCodice_hicdep___gt(String codice_hicdep___gt) {
            this.codice_hicdep___gt = codice_hicdep___gt;
            return this;
        }

        public Builder setCodice_hicdep___gte(String codice_hicdep___gte) {
            this.codice_hicdep___gte = codice_hicdep___gte;
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

        public Builder setAND(java.util.List<CliCodici_gravidanzaFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliCodici_gravidanzaFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliCodici_gravidanzaFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliCodici_gravidanzaFilterDTO build() {
            CliCodici_gravidanzaFilterDTO result = new CliCodici_gravidanzaFilterDTO();
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
            result.setCampo___eq(this.campo___eq);
            result.setCampo___ne(this.campo___ne);
            result.setCampo___null(this.campo___null);
            result.setCampo___not___null(this.campo___not___null);
            result.setCampo___in(this.campo___in);
            result.setCampo___not___in(this.campo___not___in);
            result.setCampo___lt(this.campo___lt);
            result.setCampo___lte(this.campo___lte);
            result.setCampo___gt(this.campo___gt);
            result.setCampo___gte(this.campo___gte);
            result.setCampo___contains(this.campo___contains);
            result.setCampo___not___contains(this.campo___not___contains);
            result.setCampo___starts_with(this.campo___starts_with);
            result.setCampo___not___starts_with(this.campo___not___starts_with);
            result.setCampo___ends_with(this.campo___ends_with);
            result.setCampo___not___ends_with(this.campo___not___ends_with);
            result.setCodice_hicdep___eq(this.codice_hicdep___eq);
            result.setCodice_hicdep___ne(this.codice_hicdep___ne);
            result.setCodice_hicdep___null(this.codice_hicdep___null);
            result.setCodice_hicdep___not___null(this.codice_hicdep___not___null);
            result.setCodice_hicdep___in(this.codice_hicdep___in);
            result.setCodice_hicdep___not___in(this.codice_hicdep___not___in);
            result.setCodice_hicdep___lt(this.codice_hicdep___lt);
            result.setCodice_hicdep___lte(this.codice_hicdep___lte);
            result.setCodice_hicdep___gt(this.codice_hicdep___gt);
            result.setCodice_hicdep___gte(this.codice_hicdep___gte);
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
