package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Codice_studio.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCodice_studioFilterDTO implements java.io.Serializable {

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
    private String data_arruolamento___eq;
    private String data_arruolamento___ne;
    private Boolean data_arruolamento___null;
    private Boolean data_arruolamento___not___null;
    private java.util.List<String> data_arruolamento___in;
    private java.util.List<String> data_arruolamento___not___in;
    private String data_arruolamento___lt;
    private String data_arruolamento___lte;
    private String data_arruolamento___gt;
    private String data_arruolamento___gte;
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
    private String studio___eq;
    private String studio___ne;
    private Boolean studio___null;
    private Boolean studio___not___null;
    private java.util.List<String> studio___in;
    private java.util.List<String> studio___not___in;
    private String studio___lt;
    private String studio___lte;
    private String studio___gt;
    private String studio___gte;
    private String studio___contains;
    private String studio___not___contains;
    private String studio___starts_with;
    private String studio___not___starts_with;
    private String studio___ends_with;
    private String studio___not___ends_with;
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
    private java.util.List<CliCodice_studioFilterDTO> AND;
    private java.util.List<CliCodice_studioFilterDTO> OR;
    private CliCodice_studioFilterDTO NOT;

    public CliCodice_studioFilterDTO() {
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

    public String getData_arruolamento___eq() {
        return data_arruolamento___eq;
    }
    public void setData_arruolamento___eq(String data_arruolamento___eq) {
        this.data_arruolamento___eq = data_arruolamento___eq;
    }

    public String getData_arruolamento___ne() {
        return data_arruolamento___ne;
    }
    public void setData_arruolamento___ne(String data_arruolamento___ne) {
        this.data_arruolamento___ne = data_arruolamento___ne;
    }

    public Boolean getData_arruolamento___null() {
        return data_arruolamento___null;
    }
    public void setData_arruolamento___null(Boolean data_arruolamento___null) {
        this.data_arruolamento___null = data_arruolamento___null;
    }

    public Boolean getData_arruolamento___not___null() {
        return data_arruolamento___not___null;
    }
    public void setData_arruolamento___not___null(Boolean data_arruolamento___not___null) {
        this.data_arruolamento___not___null = data_arruolamento___not___null;
    }

    public java.util.List<String> getData_arruolamento___in() {
        return data_arruolamento___in;
    }
    public void setData_arruolamento___in(java.util.List<String> data_arruolamento___in) {
        this.data_arruolamento___in = data_arruolamento___in;
    }

    public java.util.List<String> getData_arruolamento___not___in() {
        return data_arruolamento___not___in;
    }
    public void setData_arruolamento___not___in(java.util.List<String> data_arruolamento___not___in) {
        this.data_arruolamento___not___in = data_arruolamento___not___in;
    }

    public String getData_arruolamento___lt() {
        return data_arruolamento___lt;
    }
    public void setData_arruolamento___lt(String data_arruolamento___lt) {
        this.data_arruolamento___lt = data_arruolamento___lt;
    }

    public String getData_arruolamento___lte() {
        return data_arruolamento___lte;
    }
    public void setData_arruolamento___lte(String data_arruolamento___lte) {
        this.data_arruolamento___lte = data_arruolamento___lte;
    }

    public String getData_arruolamento___gt() {
        return data_arruolamento___gt;
    }
    public void setData_arruolamento___gt(String data_arruolamento___gt) {
        this.data_arruolamento___gt = data_arruolamento___gt;
    }

    public String getData_arruolamento___gte() {
        return data_arruolamento___gte;
    }
    public void setData_arruolamento___gte(String data_arruolamento___gte) {
        this.data_arruolamento___gte = data_arruolamento___gte;
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

    public String getStudio___eq() {
        return studio___eq;
    }
    public void setStudio___eq(String studio___eq) {
        this.studio___eq = studio___eq;
    }

    public String getStudio___ne() {
        return studio___ne;
    }
    public void setStudio___ne(String studio___ne) {
        this.studio___ne = studio___ne;
    }

    public Boolean getStudio___null() {
        return studio___null;
    }
    public void setStudio___null(Boolean studio___null) {
        this.studio___null = studio___null;
    }

    public Boolean getStudio___not___null() {
        return studio___not___null;
    }
    public void setStudio___not___null(Boolean studio___not___null) {
        this.studio___not___null = studio___not___null;
    }

    public java.util.List<String> getStudio___in() {
        return studio___in;
    }
    public void setStudio___in(java.util.List<String> studio___in) {
        this.studio___in = studio___in;
    }

    public java.util.List<String> getStudio___not___in() {
        return studio___not___in;
    }
    public void setStudio___not___in(java.util.List<String> studio___not___in) {
        this.studio___not___in = studio___not___in;
    }

    public String getStudio___lt() {
        return studio___lt;
    }
    public void setStudio___lt(String studio___lt) {
        this.studio___lt = studio___lt;
    }

    public String getStudio___lte() {
        return studio___lte;
    }
    public void setStudio___lte(String studio___lte) {
        this.studio___lte = studio___lte;
    }

    public String getStudio___gt() {
        return studio___gt;
    }
    public void setStudio___gt(String studio___gt) {
        this.studio___gt = studio___gt;
    }

    public String getStudio___gte() {
        return studio___gte;
    }
    public void setStudio___gte(String studio___gte) {
        this.studio___gte = studio___gte;
    }

    public String getStudio___contains() {
        return studio___contains;
    }
    public void setStudio___contains(String studio___contains) {
        this.studio___contains = studio___contains;
    }

    public String getStudio___not___contains() {
        return studio___not___contains;
    }
    public void setStudio___not___contains(String studio___not___contains) {
        this.studio___not___contains = studio___not___contains;
    }

    public String getStudio___starts_with() {
        return studio___starts_with;
    }
    public void setStudio___starts_with(String studio___starts_with) {
        this.studio___starts_with = studio___starts_with;
    }

    public String getStudio___not___starts_with() {
        return studio___not___starts_with;
    }
    public void setStudio___not___starts_with(String studio___not___starts_with) {
        this.studio___not___starts_with = studio___not___starts_with;
    }

    public String getStudio___ends_with() {
        return studio___ends_with;
    }
    public void setStudio___ends_with(String studio___ends_with) {
        this.studio___ends_with = studio___ends_with;
    }

    public String getStudio___not___ends_with() {
        return studio___not___ends_with;
    }
    public void setStudio___not___ends_with(String studio___not___ends_with) {
        this.studio___not___ends_with = studio___not___ends_with;
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

    public java.util.List<CliCodice_studioFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliCodice_studioFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliCodice_studioFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliCodice_studioFilterDTO> OR) {
        this.OR = OR;
    }

    public CliCodice_studioFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliCodice_studioFilterDTO NOT) {
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
        if (data_arruolamento___eq != null) {
            joiner.add("data_arruolamento___eq: " + GraphQLRequestSerializer.getEntry(data_arruolamento___eq));
        }
        if (data_arruolamento___ne != null) {
            joiner.add("data_arruolamento___ne: " + GraphQLRequestSerializer.getEntry(data_arruolamento___ne));
        }
        if (data_arruolamento___null != null) {
            joiner.add("data_arruolamento___null: " + GraphQLRequestSerializer.getEntry(data_arruolamento___null));
        }
        if (data_arruolamento___not___null != null) {
            joiner.add("data_arruolamento___not___null: " + GraphQLRequestSerializer.getEntry(data_arruolamento___not___null));
        }
        if (data_arruolamento___in != null) {
            joiner.add("data_arruolamento___in: " + GraphQLRequestSerializer.getEntry(data_arruolamento___in));
        }
        if (data_arruolamento___not___in != null) {
            joiner.add("data_arruolamento___not___in: " + GraphQLRequestSerializer.getEntry(data_arruolamento___not___in));
        }
        if (data_arruolamento___lt != null) {
            joiner.add("data_arruolamento___lt: " + GraphQLRequestSerializer.getEntry(data_arruolamento___lt));
        }
        if (data_arruolamento___lte != null) {
            joiner.add("data_arruolamento___lte: " + GraphQLRequestSerializer.getEntry(data_arruolamento___lte));
        }
        if (data_arruolamento___gt != null) {
            joiner.add("data_arruolamento___gt: " + GraphQLRequestSerializer.getEntry(data_arruolamento___gt));
        }
        if (data_arruolamento___gte != null) {
            joiner.add("data_arruolamento___gte: " + GraphQLRequestSerializer.getEntry(data_arruolamento___gte));
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
        if (studio___eq != null) {
            joiner.add("studio___eq: " + GraphQLRequestSerializer.getEntry(studio___eq));
        }
        if (studio___ne != null) {
            joiner.add("studio___ne: " + GraphQLRequestSerializer.getEntry(studio___ne));
        }
        if (studio___null != null) {
            joiner.add("studio___null: " + GraphQLRequestSerializer.getEntry(studio___null));
        }
        if (studio___not___null != null) {
            joiner.add("studio___not___null: " + GraphQLRequestSerializer.getEntry(studio___not___null));
        }
        if (studio___in != null) {
            joiner.add("studio___in: " + GraphQLRequestSerializer.getEntry(studio___in));
        }
        if (studio___not___in != null) {
            joiner.add("studio___not___in: " + GraphQLRequestSerializer.getEntry(studio___not___in));
        }
        if (studio___lt != null) {
            joiner.add("studio___lt: " + GraphQLRequestSerializer.getEntry(studio___lt));
        }
        if (studio___lte != null) {
            joiner.add("studio___lte: " + GraphQLRequestSerializer.getEntry(studio___lte));
        }
        if (studio___gt != null) {
            joiner.add("studio___gt: " + GraphQLRequestSerializer.getEntry(studio___gt));
        }
        if (studio___gte != null) {
            joiner.add("studio___gte: " + GraphQLRequestSerializer.getEntry(studio___gte));
        }
        if (studio___contains != null) {
            joiner.add("studio___contains: " + GraphQLRequestSerializer.getEntry(studio___contains));
        }
        if (studio___not___contains != null) {
            joiner.add("studio___not___contains: " + GraphQLRequestSerializer.getEntry(studio___not___contains));
        }
        if (studio___starts_with != null) {
            joiner.add("studio___starts_with: " + GraphQLRequestSerializer.getEntry(studio___starts_with));
        }
        if (studio___not___starts_with != null) {
            joiner.add("studio___not___starts_with: " + GraphQLRequestSerializer.getEntry(studio___not___starts_with));
        }
        if (studio___ends_with != null) {
            joiner.add("studio___ends_with: " + GraphQLRequestSerializer.getEntry(studio___ends_with));
        }
        if (studio___not___ends_with != null) {
            joiner.add("studio___not___ends_with: " + GraphQLRequestSerializer.getEntry(studio___not___ends_with));
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

    public static CliCodice_studioFilterDTO.Builder builder() {
        return new CliCodice_studioFilterDTO.Builder();
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
        private String data_arruolamento___eq;
        private String data_arruolamento___ne;
        private Boolean data_arruolamento___null;
        private Boolean data_arruolamento___not___null;
        private java.util.List<String> data_arruolamento___in;
        private java.util.List<String> data_arruolamento___not___in;
        private String data_arruolamento___lt;
        private String data_arruolamento___lte;
        private String data_arruolamento___gt;
        private String data_arruolamento___gte;
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
        private String studio___eq;
        private String studio___ne;
        private Boolean studio___null;
        private Boolean studio___not___null;
        private java.util.List<String> studio___in;
        private java.util.List<String> studio___not___in;
        private String studio___lt;
        private String studio___lte;
        private String studio___gt;
        private String studio___gte;
        private String studio___contains;
        private String studio___not___contains;
        private String studio___starts_with;
        private String studio___not___starts_with;
        private String studio___ends_with;
        private String studio___not___ends_with;
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
        private java.util.List<CliCodice_studioFilterDTO> AND;
        private java.util.List<CliCodice_studioFilterDTO> OR;
        private CliCodice_studioFilterDTO NOT;

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

        public Builder setData_arruolamento___eq(String data_arruolamento___eq) {
            this.data_arruolamento___eq = data_arruolamento___eq;
            return this;
        }

        public Builder setData_arruolamento___ne(String data_arruolamento___ne) {
            this.data_arruolamento___ne = data_arruolamento___ne;
            return this;
        }

        public Builder setData_arruolamento___null(Boolean data_arruolamento___null) {
            this.data_arruolamento___null = data_arruolamento___null;
            return this;
        }

        public Builder setData_arruolamento___not___null(Boolean data_arruolamento___not___null) {
            this.data_arruolamento___not___null = data_arruolamento___not___null;
            return this;
        }

        public Builder setData_arruolamento___in(java.util.List<String> data_arruolamento___in) {
            this.data_arruolamento___in = data_arruolamento___in;
            return this;
        }

        public Builder setData_arruolamento___not___in(java.util.List<String> data_arruolamento___not___in) {
            this.data_arruolamento___not___in = data_arruolamento___not___in;
            return this;
        }

        public Builder setData_arruolamento___lt(String data_arruolamento___lt) {
            this.data_arruolamento___lt = data_arruolamento___lt;
            return this;
        }

        public Builder setData_arruolamento___lte(String data_arruolamento___lte) {
            this.data_arruolamento___lte = data_arruolamento___lte;
            return this;
        }

        public Builder setData_arruolamento___gt(String data_arruolamento___gt) {
            this.data_arruolamento___gt = data_arruolamento___gt;
            return this;
        }

        public Builder setData_arruolamento___gte(String data_arruolamento___gte) {
            this.data_arruolamento___gte = data_arruolamento___gte;
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

        public Builder setStudio___eq(String studio___eq) {
            this.studio___eq = studio___eq;
            return this;
        }

        public Builder setStudio___ne(String studio___ne) {
            this.studio___ne = studio___ne;
            return this;
        }

        public Builder setStudio___null(Boolean studio___null) {
            this.studio___null = studio___null;
            return this;
        }

        public Builder setStudio___not___null(Boolean studio___not___null) {
            this.studio___not___null = studio___not___null;
            return this;
        }

        public Builder setStudio___in(java.util.List<String> studio___in) {
            this.studio___in = studio___in;
            return this;
        }

        public Builder setStudio___not___in(java.util.List<String> studio___not___in) {
            this.studio___not___in = studio___not___in;
            return this;
        }

        public Builder setStudio___lt(String studio___lt) {
            this.studio___lt = studio___lt;
            return this;
        }

        public Builder setStudio___lte(String studio___lte) {
            this.studio___lte = studio___lte;
            return this;
        }

        public Builder setStudio___gt(String studio___gt) {
            this.studio___gt = studio___gt;
            return this;
        }

        public Builder setStudio___gte(String studio___gte) {
            this.studio___gte = studio___gte;
            return this;
        }

        public Builder setStudio___contains(String studio___contains) {
            this.studio___contains = studio___contains;
            return this;
        }

        public Builder setStudio___not___contains(String studio___not___contains) {
            this.studio___not___contains = studio___not___contains;
            return this;
        }

        public Builder setStudio___starts_with(String studio___starts_with) {
            this.studio___starts_with = studio___starts_with;
            return this;
        }

        public Builder setStudio___not___starts_with(String studio___not___starts_with) {
            this.studio___not___starts_with = studio___not___starts_with;
            return this;
        }

        public Builder setStudio___ends_with(String studio___ends_with) {
            this.studio___ends_with = studio___ends_with;
            return this;
        }

        public Builder setStudio___not___ends_with(String studio___not___ends_with) {
            this.studio___not___ends_with = studio___not___ends_with;
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

        public Builder setAND(java.util.List<CliCodice_studioFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliCodice_studioFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliCodice_studioFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliCodice_studioFilterDTO build() {
            CliCodice_studioFilterDTO result = new CliCodice_studioFilterDTO();
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
            result.setData_arruolamento___eq(this.data_arruolamento___eq);
            result.setData_arruolamento___ne(this.data_arruolamento___ne);
            result.setData_arruolamento___null(this.data_arruolamento___null);
            result.setData_arruolamento___not___null(this.data_arruolamento___not___null);
            result.setData_arruolamento___in(this.data_arruolamento___in);
            result.setData_arruolamento___not___in(this.data_arruolamento___not___in);
            result.setData_arruolamento___lt(this.data_arruolamento___lt);
            result.setData_arruolamento___lte(this.data_arruolamento___lte);
            result.setData_arruolamento___gt(this.data_arruolamento___gt);
            result.setData_arruolamento___gte(this.data_arruolamento___gte);
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
            result.setStudio___eq(this.studio___eq);
            result.setStudio___ne(this.studio___ne);
            result.setStudio___null(this.studio___null);
            result.setStudio___not___null(this.studio___not___null);
            result.setStudio___in(this.studio___in);
            result.setStudio___not___in(this.studio___not___in);
            result.setStudio___lt(this.studio___lt);
            result.setStudio___lte(this.studio___lte);
            result.setStudio___gt(this.studio___gt);
            result.setStudio___gte(this.studio___gte);
            result.setStudio___contains(this.studio___contains);
            result.setStudio___not___contains(this.studio___not___contains);
            result.setStudio___starts_with(this.studio___starts_with);
            result.setStudio___not___starts_with(this.studio___not___starts_with);
            result.setStudio___ends_with(this.studio___ends_with);
            result.setStudio___not___ends_with(this.studio___not___ends_with);
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
