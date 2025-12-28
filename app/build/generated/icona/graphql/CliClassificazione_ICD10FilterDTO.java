package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Classificazione_ICD10.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliClassificazione_ICD10FilterDTO implements java.io.Serializable {

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
    private String codice___eq;
    private String codice___ne;
    private Boolean codice___null;
    private Boolean codice___not___null;
    private java.util.List<String> codice___in;
    private java.util.List<String> codice___not___in;
    private String codice___lt;
    private String codice___lte;
    private String codice___gt;
    private String codice___gte;
    private String codice___contains;
    private String codice___not___contains;
    private String codice___starts_with;
    private String codice___not___starts_with;
    private String codice___ends_with;
    private String codice___not___ends_with;
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
    private java.util.List<CliClassificazione_ICD10FilterDTO> AND;
    private java.util.List<CliClassificazione_ICD10FilterDTO> OR;
    private CliClassificazione_ICD10FilterDTO NOT;

    public CliClassificazione_ICD10FilterDTO() {
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

    public String getCodice___eq() {
        return codice___eq;
    }
    public void setCodice___eq(String codice___eq) {
        this.codice___eq = codice___eq;
    }

    public String getCodice___ne() {
        return codice___ne;
    }
    public void setCodice___ne(String codice___ne) {
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

    public java.util.List<String> getCodice___in() {
        return codice___in;
    }
    public void setCodice___in(java.util.List<String> codice___in) {
        this.codice___in = codice___in;
    }

    public java.util.List<String> getCodice___not___in() {
        return codice___not___in;
    }
    public void setCodice___not___in(java.util.List<String> codice___not___in) {
        this.codice___not___in = codice___not___in;
    }

    public String getCodice___lt() {
        return codice___lt;
    }
    public void setCodice___lt(String codice___lt) {
        this.codice___lt = codice___lt;
    }

    public String getCodice___lte() {
        return codice___lte;
    }
    public void setCodice___lte(String codice___lte) {
        this.codice___lte = codice___lte;
    }

    public String getCodice___gt() {
        return codice___gt;
    }
    public void setCodice___gt(String codice___gt) {
        this.codice___gt = codice___gt;
    }

    public String getCodice___gte() {
        return codice___gte;
    }
    public void setCodice___gte(String codice___gte) {
        this.codice___gte = codice___gte;
    }

    public String getCodice___contains() {
        return codice___contains;
    }
    public void setCodice___contains(String codice___contains) {
        this.codice___contains = codice___contains;
    }

    public String getCodice___not___contains() {
        return codice___not___contains;
    }
    public void setCodice___not___contains(String codice___not___contains) {
        this.codice___not___contains = codice___not___contains;
    }

    public String getCodice___starts_with() {
        return codice___starts_with;
    }
    public void setCodice___starts_with(String codice___starts_with) {
        this.codice___starts_with = codice___starts_with;
    }

    public String getCodice___not___starts_with() {
        return codice___not___starts_with;
    }
    public void setCodice___not___starts_with(String codice___not___starts_with) {
        this.codice___not___starts_with = codice___not___starts_with;
    }

    public String getCodice___ends_with() {
        return codice___ends_with;
    }
    public void setCodice___ends_with(String codice___ends_with) {
        this.codice___ends_with = codice___ends_with;
    }

    public String getCodice___not___ends_with() {
        return codice___not___ends_with;
    }
    public void setCodice___not___ends_with(String codice___not___ends_with) {
        this.codice___not___ends_with = codice___not___ends_with;
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

    public java.util.List<CliClassificazione_ICD10FilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliClassificazione_ICD10FilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliClassificazione_ICD10FilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliClassificazione_ICD10FilterDTO> OR) {
        this.OR = OR;
    }

    public CliClassificazione_ICD10FilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliClassificazione_ICD10FilterDTO NOT) {
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
        if (codice___contains != null) {
            joiner.add("codice___contains: " + GraphQLRequestSerializer.getEntry(codice___contains));
        }
        if (codice___not___contains != null) {
            joiner.add("codice___not___contains: " + GraphQLRequestSerializer.getEntry(codice___not___contains));
        }
        if (codice___starts_with != null) {
            joiner.add("codice___starts_with: " + GraphQLRequestSerializer.getEntry(codice___starts_with));
        }
        if (codice___not___starts_with != null) {
            joiner.add("codice___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice___not___starts_with));
        }
        if (codice___ends_with != null) {
            joiner.add("codice___ends_with: " + GraphQLRequestSerializer.getEntry(codice___ends_with));
        }
        if (codice___not___ends_with != null) {
            joiner.add("codice___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice___not___ends_with));
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

    public static CliClassificazione_ICD10FilterDTO.Builder builder() {
        return new CliClassificazione_ICD10FilterDTO.Builder();
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
        private String codice___eq;
        private String codice___ne;
        private Boolean codice___null;
        private Boolean codice___not___null;
        private java.util.List<String> codice___in;
        private java.util.List<String> codice___not___in;
        private String codice___lt;
        private String codice___lte;
        private String codice___gt;
        private String codice___gte;
        private String codice___contains;
        private String codice___not___contains;
        private String codice___starts_with;
        private String codice___not___starts_with;
        private String codice___ends_with;
        private String codice___not___ends_with;
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
        private java.util.List<CliClassificazione_ICD10FilterDTO> AND;
        private java.util.List<CliClassificazione_ICD10FilterDTO> OR;
        private CliClassificazione_ICD10FilterDTO NOT;

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

        public Builder setCodice___eq(String codice___eq) {
            this.codice___eq = codice___eq;
            return this;
        }

        public Builder setCodice___ne(String codice___ne) {
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

        public Builder setCodice___in(java.util.List<String> codice___in) {
            this.codice___in = codice___in;
            return this;
        }

        public Builder setCodice___not___in(java.util.List<String> codice___not___in) {
            this.codice___not___in = codice___not___in;
            return this;
        }

        public Builder setCodice___lt(String codice___lt) {
            this.codice___lt = codice___lt;
            return this;
        }

        public Builder setCodice___lte(String codice___lte) {
            this.codice___lte = codice___lte;
            return this;
        }

        public Builder setCodice___gt(String codice___gt) {
            this.codice___gt = codice___gt;
            return this;
        }

        public Builder setCodice___gte(String codice___gte) {
            this.codice___gte = codice___gte;
            return this;
        }

        public Builder setCodice___contains(String codice___contains) {
            this.codice___contains = codice___contains;
            return this;
        }

        public Builder setCodice___not___contains(String codice___not___contains) {
            this.codice___not___contains = codice___not___contains;
            return this;
        }

        public Builder setCodice___starts_with(String codice___starts_with) {
            this.codice___starts_with = codice___starts_with;
            return this;
        }

        public Builder setCodice___not___starts_with(String codice___not___starts_with) {
            this.codice___not___starts_with = codice___not___starts_with;
            return this;
        }

        public Builder setCodice___ends_with(String codice___ends_with) {
            this.codice___ends_with = codice___ends_with;
            return this;
        }

        public Builder setCodice___not___ends_with(String codice___not___ends_with) {
            this.codice___not___ends_with = codice___not___ends_with;
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

        public Builder setAND(java.util.List<CliClassificazione_ICD10FilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliClassificazione_ICD10FilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliClassificazione_ICD10FilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliClassificazione_ICD10FilterDTO build() {
            CliClassificazione_ICD10FilterDTO result = new CliClassificazione_ICD10FilterDTO();
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
            result.setCodice___contains(this.codice___contains);
            result.setCodice___not___contains(this.codice___not___contains);
            result.setCodice___starts_with(this.codice___starts_with);
            result.setCodice___not___starts_with(this.codice___not___starts_with);
            result.setCodice___ends_with(this.codice___ends_with);
            result.setCodice___not___ends_with(this.codice___not___ends_with);
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
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
