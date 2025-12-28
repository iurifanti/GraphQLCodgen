package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Terapia_covid.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTerapia_covidFilterDTO implements java.io.Serializable {

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
    private String altro_farmaco___eq;
    private String altro_farmaco___ne;
    private Boolean altro_farmaco___null;
    private Boolean altro_farmaco___not___null;
    private java.util.List<String> altro_farmaco___in;
    private java.util.List<String> altro_farmaco___not___in;
    private String altro_farmaco___lt;
    private String altro_farmaco___lte;
    private String altro_farmaco___gt;
    private String altro_farmaco___gte;
    private String altro_farmaco___contains;
    private String altro_farmaco___not___contains;
    private String altro_farmaco___starts_with;
    private String altro_farmaco___not___starts_with;
    private String altro_farmaco___ends_with;
    private String altro_farmaco___not___ends_with;
    private String data_fine___eq;
    private String data_fine___ne;
    private Boolean data_fine___null;
    private Boolean data_fine___not___null;
    private java.util.List<String> data_fine___in;
    private java.util.List<String> data_fine___not___in;
    private String data_fine___lt;
    private String data_fine___lte;
    private String data_fine___gt;
    private String data_fine___gte;
    private String data_inizio___eq;
    private String data_inizio___ne;
    private Boolean data_inizio___null;
    private Boolean data_inizio___not___null;
    private java.util.List<String> data_inizio___in;
    private java.util.List<String> data_inizio___not___in;
    private String data_inizio___lt;
    private String data_inizio___lte;
    private String data_inizio___gt;
    private String data_inizio___gte;
    private String farmaco_covid___eq;
    private String farmaco_covid___ne;
    private Boolean farmaco_covid___null;
    private Boolean farmaco_covid___not___null;
    private java.util.List<String> farmaco_covid___in;
    private java.util.List<String> farmaco_covid___not___in;
    private String farmaco_covid___lt;
    private String farmaco_covid___lte;
    private String farmaco_covid___gt;
    private String farmaco_covid___gte;
    private String farmaco_covid___contains;
    private String farmaco_covid___not___contains;
    private String farmaco_covid___starts_with;
    private String farmaco_covid___not___starts_with;
    private String farmaco_covid___ends_with;
    private String farmaco_covid___not___ends_with;
    private java.util.List<CliTerapia_covidFilterDTO> AND;
    private java.util.List<CliTerapia_covidFilterDTO> OR;
    private CliTerapia_covidFilterDTO NOT;

    public CliTerapia_covidFilterDTO() {
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

    public String getAltro_farmaco___eq() {
        return altro_farmaco___eq;
    }
    public void setAltro_farmaco___eq(String altro_farmaco___eq) {
        this.altro_farmaco___eq = altro_farmaco___eq;
    }

    public String getAltro_farmaco___ne() {
        return altro_farmaco___ne;
    }
    public void setAltro_farmaco___ne(String altro_farmaco___ne) {
        this.altro_farmaco___ne = altro_farmaco___ne;
    }

    public Boolean getAltro_farmaco___null() {
        return altro_farmaco___null;
    }
    public void setAltro_farmaco___null(Boolean altro_farmaco___null) {
        this.altro_farmaco___null = altro_farmaco___null;
    }

    public Boolean getAltro_farmaco___not___null() {
        return altro_farmaco___not___null;
    }
    public void setAltro_farmaco___not___null(Boolean altro_farmaco___not___null) {
        this.altro_farmaco___not___null = altro_farmaco___not___null;
    }

    public java.util.List<String> getAltro_farmaco___in() {
        return altro_farmaco___in;
    }
    public void setAltro_farmaco___in(java.util.List<String> altro_farmaco___in) {
        this.altro_farmaco___in = altro_farmaco___in;
    }

    public java.util.List<String> getAltro_farmaco___not___in() {
        return altro_farmaco___not___in;
    }
    public void setAltro_farmaco___not___in(java.util.List<String> altro_farmaco___not___in) {
        this.altro_farmaco___not___in = altro_farmaco___not___in;
    }

    public String getAltro_farmaco___lt() {
        return altro_farmaco___lt;
    }
    public void setAltro_farmaco___lt(String altro_farmaco___lt) {
        this.altro_farmaco___lt = altro_farmaco___lt;
    }

    public String getAltro_farmaco___lte() {
        return altro_farmaco___lte;
    }
    public void setAltro_farmaco___lte(String altro_farmaco___lte) {
        this.altro_farmaco___lte = altro_farmaco___lte;
    }

    public String getAltro_farmaco___gt() {
        return altro_farmaco___gt;
    }
    public void setAltro_farmaco___gt(String altro_farmaco___gt) {
        this.altro_farmaco___gt = altro_farmaco___gt;
    }

    public String getAltro_farmaco___gte() {
        return altro_farmaco___gte;
    }
    public void setAltro_farmaco___gte(String altro_farmaco___gte) {
        this.altro_farmaco___gte = altro_farmaco___gte;
    }

    public String getAltro_farmaco___contains() {
        return altro_farmaco___contains;
    }
    public void setAltro_farmaco___contains(String altro_farmaco___contains) {
        this.altro_farmaco___contains = altro_farmaco___contains;
    }

    public String getAltro_farmaco___not___contains() {
        return altro_farmaco___not___contains;
    }
    public void setAltro_farmaco___not___contains(String altro_farmaco___not___contains) {
        this.altro_farmaco___not___contains = altro_farmaco___not___contains;
    }

    public String getAltro_farmaco___starts_with() {
        return altro_farmaco___starts_with;
    }
    public void setAltro_farmaco___starts_with(String altro_farmaco___starts_with) {
        this.altro_farmaco___starts_with = altro_farmaco___starts_with;
    }

    public String getAltro_farmaco___not___starts_with() {
        return altro_farmaco___not___starts_with;
    }
    public void setAltro_farmaco___not___starts_with(String altro_farmaco___not___starts_with) {
        this.altro_farmaco___not___starts_with = altro_farmaco___not___starts_with;
    }

    public String getAltro_farmaco___ends_with() {
        return altro_farmaco___ends_with;
    }
    public void setAltro_farmaco___ends_with(String altro_farmaco___ends_with) {
        this.altro_farmaco___ends_with = altro_farmaco___ends_with;
    }

    public String getAltro_farmaco___not___ends_with() {
        return altro_farmaco___not___ends_with;
    }
    public void setAltro_farmaco___not___ends_with(String altro_farmaco___not___ends_with) {
        this.altro_farmaco___not___ends_with = altro_farmaco___not___ends_with;
    }

    public String getData_fine___eq() {
        return data_fine___eq;
    }
    public void setData_fine___eq(String data_fine___eq) {
        this.data_fine___eq = data_fine___eq;
    }

    public String getData_fine___ne() {
        return data_fine___ne;
    }
    public void setData_fine___ne(String data_fine___ne) {
        this.data_fine___ne = data_fine___ne;
    }

    public Boolean getData_fine___null() {
        return data_fine___null;
    }
    public void setData_fine___null(Boolean data_fine___null) {
        this.data_fine___null = data_fine___null;
    }

    public Boolean getData_fine___not___null() {
        return data_fine___not___null;
    }
    public void setData_fine___not___null(Boolean data_fine___not___null) {
        this.data_fine___not___null = data_fine___not___null;
    }

    public java.util.List<String> getData_fine___in() {
        return data_fine___in;
    }
    public void setData_fine___in(java.util.List<String> data_fine___in) {
        this.data_fine___in = data_fine___in;
    }

    public java.util.List<String> getData_fine___not___in() {
        return data_fine___not___in;
    }
    public void setData_fine___not___in(java.util.List<String> data_fine___not___in) {
        this.data_fine___not___in = data_fine___not___in;
    }

    public String getData_fine___lt() {
        return data_fine___lt;
    }
    public void setData_fine___lt(String data_fine___lt) {
        this.data_fine___lt = data_fine___lt;
    }

    public String getData_fine___lte() {
        return data_fine___lte;
    }
    public void setData_fine___lte(String data_fine___lte) {
        this.data_fine___lte = data_fine___lte;
    }

    public String getData_fine___gt() {
        return data_fine___gt;
    }
    public void setData_fine___gt(String data_fine___gt) {
        this.data_fine___gt = data_fine___gt;
    }

    public String getData_fine___gte() {
        return data_fine___gte;
    }
    public void setData_fine___gte(String data_fine___gte) {
        this.data_fine___gte = data_fine___gte;
    }

    public String getData_inizio___eq() {
        return data_inizio___eq;
    }
    public void setData_inizio___eq(String data_inizio___eq) {
        this.data_inizio___eq = data_inizio___eq;
    }

    public String getData_inizio___ne() {
        return data_inizio___ne;
    }
    public void setData_inizio___ne(String data_inizio___ne) {
        this.data_inizio___ne = data_inizio___ne;
    }

    public Boolean getData_inizio___null() {
        return data_inizio___null;
    }
    public void setData_inizio___null(Boolean data_inizio___null) {
        this.data_inizio___null = data_inizio___null;
    }

    public Boolean getData_inizio___not___null() {
        return data_inizio___not___null;
    }
    public void setData_inizio___not___null(Boolean data_inizio___not___null) {
        this.data_inizio___not___null = data_inizio___not___null;
    }

    public java.util.List<String> getData_inizio___in() {
        return data_inizio___in;
    }
    public void setData_inizio___in(java.util.List<String> data_inizio___in) {
        this.data_inizio___in = data_inizio___in;
    }

    public java.util.List<String> getData_inizio___not___in() {
        return data_inizio___not___in;
    }
    public void setData_inizio___not___in(java.util.List<String> data_inizio___not___in) {
        this.data_inizio___not___in = data_inizio___not___in;
    }

    public String getData_inizio___lt() {
        return data_inizio___lt;
    }
    public void setData_inizio___lt(String data_inizio___lt) {
        this.data_inizio___lt = data_inizio___lt;
    }

    public String getData_inizio___lte() {
        return data_inizio___lte;
    }
    public void setData_inizio___lte(String data_inizio___lte) {
        this.data_inizio___lte = data_inizio___lte;
    }

    public String getData_inizio___gt() {
        return data_inizio___gt;
    }
    public void setData_inizio___gt(String data_inizio___gt) {
        this.data_inizio___gt = data_inizio___gt;
    }

    public String getData_inizio___gte() {
        return data_inizio___gte;
    }
    public void setData_inizio___gte(String data_inizio___gte) {
        this.data_inizio___gte = data_inizio___gte;
    }

    public String getFarmaco_covid___eq() {
        return farmaco_covid___eq;
    }
    public void setFarmaco_covid___eq(String farmaco_covid___eq) {
        this.farmaco_covid___eq = farmaco_covid___eq;
    }

    public String getFarmaco_covid___ne() {
        return farmaco_covid___ne;
    }
    public void setFarmaco_covid___ne(String farmaco_covid___ne) {
        this.farmaco_covid___ne = farmaco_covid___ne;
    }

    public Boolean getFarmaco_covid___null() {
        return farmaco_covid___null;
    }
    public void setFarmaco_covid___null(Boolean farmaco_covid___null) {
        this.farmaco_covid___null = farmaco_covid___null;
    }

    public Boolean getFarmaco_covid___not___null() {
        return farmaco_covid___not___null;
    }
    public void setFarmaco_covid___not___null(Boolean farmaco_covid___not___null) {
        this.farmaco_covid___not___null = farmaco_covid___not___null;
    }

    public java.util.List<String> getFarmaco_covid___in() {
        return farmaco_covid___in;
    }
    public void setFarmaco_covid___in(java.util.List<String> farmaco_covid___in) {
        this.farmaco_covid___in = farmaco_covid___in;
    }

    public java.util.List<String> getFarmaco_covid___not___in() {
        return farmaco_covid___not___in;
    }
    public void setFarmaco_covid___not___in(java.util.List<String> farmaco_covid___not___in) {
        this.farmaco_covid___not___in = farmaco_covid___not___in;
    }

    public String getFarmaco_covid___lt() {
        return farmaco_covid___lt;
    }
    public void setFarmaco_covid___lt(String farmaco_covid___lt) {
        this.farmaco_covid___lt = farmaco_covid___lt;
    }

    public String getFarmaco_covid___lte() {
        return farmaco_covid___lte;
    }
    public void setFarmaco_covid___lte(String farmaco_covid___lte) {
        this.farmaco_covid___lte = farmaco_covid___lte;
    }

    public String getFarmaco_covid___gt() {
        return farmaco_covid___gt;
    }
    public void setFarmaco_covid___gt(String farmaco_covid___gt) {
        this.farmaco_covid___gt = farmaco_covid___gt;
    }

    public String getFarmaco_covid___gte() {
        return farmaco_covid___gte;
    }
    public void setFarmaco_covid___gte(String farmaco_covid___gte) {
        this.farmaco_covid___gte = farmaco_covid___gte;
    }

    public String getFarmaco_covid___contains() {
        return farmaco_covid___contains;
    }
    public void setFarmaco_covid___contains(String farmaco_covid___contains) {
        this.farmaco_covid___contains = farmaco_covid___contains;
    }

    public String getFarmaco_covid___not___contains() {
        return farmaco_covid___not___contains;
    }
    public void setFarmaco_covid___not___contains(String farmaco_covid___not___contains) {
        this.farmaco_covid___not___contains = farmaco_covid___not___contains;
    }

    public String getFarmaco_covid___starts_with() {
        return farmaco_covid___starts_with;
    }
    public void setFarmaco_covid___starts_with(String farmaco_covid___starts_with) {
        this.farmaco_covid___starts_with = farmaco_covid___starts_with;
    }

    public String getFarmaco_covid___not___starts_with() {
        return farmaco_covid___not___starts_with;
    }
    public void setFarmaco_covid___not___starts_with(String farmaco_covid___not___starts_with) {
        this.farmaco_covid___not___starts_with = farmaco_covid___not___starts_with;
    }

    public String getFarmaco_covid___ends_with() {
        return farmaco_covid___ends_with;
    }
    public void setFarmaco_covid___ends_with(String farmaco_covid___ends_with) {
        this.farmaco_covid___ends_with = farmaco_covid___ends_with;
    }

    public String getFarmaco_covid___not___ends_with() {
        return farmaco_covid___not___ends_with;
    }
    public void setFarmaco_covid___not___ends_with(String farmaco_covid___not___ends_with) {
        this.farmaco_covid___not___ends_with = farmaco_covid___not___ends_with;
    }

    public java.util.List<CliTerapia_covidFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliTerapia_covidFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliTerapia_covidFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliTerapia_covidFilterDTO> OR) {
        this.OR = OR;
    }

    public CliTerapia_covidFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliTerapia_covidFilterDTO NOT) {
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
        if (altro_farmaco___eq != null) {
            joiner.add("altro_farmaco___eq: " + GraphQLRequestSerializer.getEntry(altro_farmaco___eq));
        }
        if (altro_farmaco___ne != null) {
            joiner.add("altro_farmaco___ne: " + GraphQLRequestSerializer.getEntry(altro_farmaco___ne));
        }
        if (altro_farmaco___null != null) {
            joiner.add("altro_farmaco___null: " + GraphQLRequestSerializer.getEntry(altro_farmaco___null));
        }
        if (altro_farmaco___not___null != null) {
            joiner.add("altro_farmaco___not___null: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___null));
        }
        if (altro_farmaco___in != null) {
            joiner.add("altro_farmaco___in: " + GraphQLRequestSerializer.getEntry(altro_farmaco___in));
        }
        if (altro_farmaco___not___in != null) {
            joiner.add("altro_farmaco___not___in: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___in));
        }
        if (altro_farmaco___lt != null) {
            joiner.add("altro_farmaco___lt: " + GraphQLRequestSerializer.getEntry(altro_farmaco___lt));
        }
        if (altro_farmaco___lte != null) {
            joiner.add("altro_farmaco___lte: " + GraphQLRequestSerializer.getEntry(altro_farmaco___lte));
        }
        if (altro_farmaco___gt != null) {
            joiner.add("altro_farmaco___gt: " + GraphQLRequestSerializer.getEntry(altro_farmaco___gt));
        }
        if (altro_farmaco___gte != null) {
            joiner.add("altro_farmaco___gte: " + GraphQLRequestSerializer.getEntry(altro_farmaco___gte));
        }
        if (altro_farmaco___contains != null) {
            joiner.add("altro_farmaco___contains: " + GraphQLRequestSerializer.getEntry(altro_farmaco___contains));
        }
        if (altro_farmaco___not___contains != null) {
            joiner.add("altro_farmaco___not___contains: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___contains));
        }
        if (altro_farmaco___starts_with != null) {
            joiner.add("altro_farmaco___starts_with: " + GraphQLRequestSerializer.getEntry(altro_farmaco___starts_with));
        }
        if (altro_farmaco___not___starts_with != null) {
            joiner.add("altro_farmaco___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___starts_with));
        }
        if (altro_farmaco___ends_with != null) {
            joiner.add("altro_farmaco___ends_with: " + GraphQLRequestSerializer.getEntry(altro_farmaco___ends_with));
        }
        if (altro_farmaco___not___ends_with != null) {
            joiner.add("altro_farmaco___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_farmaco___not___ends_with));
        }
        if (data_fine___eq != null) {
            joiner.add("data_fine___eq: " + GraphQLRequestSerializer.getEntry(data_fine___eq));
        }
        if (data_fine___ne != null) {
            joiner.add("data_fine___ne: " + GraphQLRequestSerializer.getEntry(data_fine___ne));
        }
        if (data_fine___null != null) {
            joiner.add("data_fine___null: " + GraphQLRequestSerializer.getEntry(data_fine___null));
        }
        if (data_fine___not___null != null) {
            joiner.add("data_fine___not___null: " + GraphQLRequestSerializer.getEntry(data_fine___not___null));
        }
        if (data_fine___in != null) {
            joiner.add("data_fine___in: " + GraphQLRequestSerializer.getEntry(data_fine___in));
        }
        if (data_fine___not___in != null) {
            joiner.add("data_fine___not___in: " + GraphQLRequestSerializer.getEntry(data_fine___not___in));
        }
        if (data_fine___lt != null) {
            joiner.add("data_fine___lt: " + GraphQLRequestSerializer.getEntry(data_fine___lt));
        }
        if (data_fine___lte != null) {
            joiner.add("data_fine___lte: " + GraphQLRequestSerializer.getEntry(data_fine___lte));
        }
        if (data_fine___gt != null) {
            joiner.add("data_fine___gt: " + GraphQLRequestSerializer.getEntry(data_fine___gt));
        }
        if (data_fine___gte != null) {
            joiner.add("data_fine___gte: " + GraphQLRequestSerializer.getEntry(data_fine___gte));
        }
        if (data_inizio___eq != null) {
            joiner.add("data_inizio___eq: " + GraphQLRequestSerializer.getEntry(data_inizio___eq));
        }
        if (data_inizio___ne != null) {
            joiner.add("data_inizio___ne: " + GraphQLRequestSerializer.getEntry(data_inizio___ne));
        }
        if (data_inizio___null != null) {
            joiner.add("data_inizio___null: " + GraphQLRequestSerializer.getEntry(data_inizio___null));
        }
        if (data_inizio___not___null != null) {
            joiner.add("data_inizio___not___null: " + GraphQLRequestSerializer.getEntry(data_inizio___not___null));
        }
        if (data_inizio___in != null) {
            joiner.add("data_inizio___in: " + GraphQLRequestSerializer.getEntry(data_inizio___in));
        }
        if (data_inizio___not___in != null) {
            joiner.add("data_inizio___not___in: " + GraphQLRequestSerializer.getEntry(data_inizio___not___in));
        }
        if (data_inizio___lt != null) {
            joiner.add("data_inizio___lt: " + GraphQLRequestSerializer.getEntry(data_inizio___lt));
        }
        if (data_inizio___lte != null) {
            joiner.add("data_inizio___lte: " + GraphQLRequestSerializer.getEntry(data_inizio___lte));
        }
        if (data_inizio___gt != null) {
            joiner.add("data_inizio___gt: " + GraphQLRequestSerializer.getEntry(data_inizio___gt));
        }
        if (data_inizio___gte != null) {
            joiner.add("data_inizio___gte: " + GraphQLRequestSerializer.getEntry(data_inizio___gte));
        }
        if (farmaco_covid___eq != null) {
            joiner.add("farmaco_covid___eq: " + GraphQLRequestSerializer.getEntry(farmaco_covid___eq));
        }
        if (farmaco_covid___ne != null) {
            joiner.add("farmaco_covid___ne: " + GraphQLRequestSerializer.getEntry(farmaco_covid___ne));
        }
        if (farmaco_covid___null != null) {
            joiner.add("farmaco_covid___null: " + GraphQLRequestSerializer.getEntry(farmaco_covid___null));
        }
        if (farmaco_covid___not___null != null) {
            joiner.add("farmaco_covid___not___null: " + GraphQLRequestSerializer.getEntry(farmaco_covid___not___null));
        }
        if (farmaco_covid___in != null) {
            joiner.add("farmaco_covid___in: " + GraphQLRequestSerializer.getEntry(farmaco_covid___in));
        }
        if (farmaco_covid___not___in != null) {
            joiner.add("farmaco_covid___not___in: " + GraphQLRequestSerializer.getEntry(farmaco_covid___not___in));
        }
        if (farmaco_covid___lt != null) {
            joiner.add("farmaco_covid___lt: " + GraphQLRequestSerializer.getEntry(farmaco_covid___lt));
        }
        if (farmaco_covid___lte != null) {
            joiner.add("farmaco_covid___lte: " + GraphQLRequestSerializer.getEntry(farmaco_covid___lte));
        }
        if (farmaco_covid___gt != null) {
            joiner.add("farmaco_covid___gt: " + GraphQLRequestSerializer.getEntry(farmaco_covid___gt));
        }
        if (farmaco_covid___gte != null) {
            joiner.add("farmaco_covid___gte: " + GraphQLRequestSerializer.getEntry(farmaco_covid___gte));
        }
        if (farmaco_covid___contains != null) {
            joiner.add("farmaco_covid___contains: " + GraphQLRequestSerializer.getEntry(farmaco_covid___contains));
        }
        if (farmaco_covid___not___contains != null) {
            joiner.add("farmaco_covid___not___contains: " + GraphQLRequestSerializer.getEntry(farmaco_covid___not___contains));
        }
        if (farmaco_covid___starts_with != null) {
            joiner.add("farmaco_covid___starts_with: " + GraphQLRequestSerializer.getEntry(farmaco_covid___starts_with));
        }
        if (farmaco_covid___not___starts_with != null) {
            joiner.add("farmaco_covid___not___starts_with: " + GraphQLRequestSerializer.getEntry(farmaco_covid___not___starts_with));
        }
        if (farmaco_covid___ends_with != null) {
            joiner.add("farmaco_covid___ends_with: " + GraphQLRequestSerializer.getEntry(farmaco_covid___ends_with));
        }
        if (farmaco_covid___not___ends_with != null) {
            joiner.add("farmaco_covid___not___ends_with: " + GraphQLRequestSerializer.getEntry(farmaco_covid___not___ends_with));
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

    public static CliTerapia_covidFilterDTO.Builder builder() {
        return new CliTerapia_covidFilterDTO.Builder();
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
        private String altro_farmaco___eq;
        private String altro_farmaco___ne;
        private Boolean altro_farmaco___null;
        private Boolean altro_farmaco___not___null;
        private java.util.List<String> altro_farmaco___in;
        private java.util.List<String> altro_farmaco___not___in;
        private String altro_farmaco___lt;
        private String altro_farmaco___lte;
        private String altro_farmaco___gt;
        private String altro_farmaco___gte;
        private String altro_farmaco___contains;
        private String altro_farmaco___not___contains;
        private String altro_farmaco___starts_with;
        private String altro_farmaco___not___starts_with;
        private String altro_farmaco___ends_with;
        private String altro_farmaco___not___ends_with;
        private String data_fine___eq;
        private String data_fine___ne;
        private Boolean data_fine___null;
        private Boolean data_fine___not___null;
        private java.util.List<String> data_fine___in;
        private java.util.List<String> data_fine___not___in;
        private String data_fine___lt;
        private String data_fine___lte;
        private String data_fine___gt;
        private String data_fine___gte;
        private String data_inizio___eq;
        private String data_inizio___ne;
        private Boolean data_inizio___null;
        private Boolean data_inizio___not___null;
        private java.util.List<String> data_inizio___in;
        private java.util.List<String> data_inizio___not___in;
        private String data_inizio___lt;
        private String data_inizio___lte;
        private String data_inizio___gt;
        private String data_inizio___gte;
        private String farmaco_covid___eq;
        private String farmaco_covid___ne;
        private Boolean farmaco_covid___null;
        private Boolean farmaco_covid___not___null;
        private java.util.List<String> farmaco_covid___in;
        private java.util.List<String> farmaco_covid___not___in;
        private String farmaco_covid___lt;
        private String farmaco_covid___lte;
        private String farmaco_covid___gt;
        private String farmaco_covid___gte;
        private String farmaco_covid___contains;
        private String farmaco_covid___not___contains;
        private String farmaco_covid___starts_with;
        private String farmaco_covid___not___starts_with;
        private String farmaco_covid___ends_with;
        private String farmaco_covid___not___ends_with;
        private java.util.List<CliTerapia_covidFilterDTO> AND;
        private java.util.List<CliTerapia_covidFilterDTO> OR;
        private CliTerapia_covidFilterDTO NOT;

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

        public Builder setAltro_farmaco___eq(String altro_farmaco___eq) {
            this.altro_farmaco___eq = altro_farmaco___eq;
            return this;
        }

        public Builder setAltro_farmaco___ne(String altro_farmaco___ne) {
            this.altro_farmaco___ne = altro_farmaco___ne;
            return this;
        }

        public Builder setAltro_farmaco___null(Boolean altro_farmaco___null) {
            this.altro_farmaco___null = altro_farmaco___null;
            return this;
        }

        public Builder setAltro_farmaco___not___null(Boolean altro_farmaco___not___null) {
            this.altro_farmaco___not___null = altro_farmaco___not___null;
            return this;
        }

        public Builder setAltro_farmaco___in(java.util.List<String> altro_farmaco___in) {
            this.altro_farmaco___in = altro_farmaco___in;
            return this;
        }

        public Builder setAltro_farmaco___not___in(java.util.List<String> altro_farmaco___not___in) {
            this.altro_farmaco___not___in = altro_farmaco___not___in;
            return this;
        }

        public Builder setAltro_farmaco___lt(String altro_farmaco___lt) {
            this.altro_farmaco___lt = altro_farmaco___lt;
            return this;
        }

        public Builder setAltro_farmaco___lte(String altro_farmaco___lte) {
            this.altro_farmaco___lte = altro_farmaco___lte;
            return this;
        }

        public Builder setAltro_farmaco___gt(String altro_farmaco___gt) {
            this.altro_farmaco___gt = altro_farmaco___gt;
            return this;
        }

        public Builder setAltro_farmaco___gte(String altro_farmaco___gte) {
            this.altro_farmaco___gte = altro_farmaco___gte;
            return this;
        }

        public Builder setAltro_farmaco___contains(String altro_farmaco___contains) {
            this.altro_farmaco___contains = altro_farmaco___contains;
            return this;
        }

        public Builder setAltro_farmaco___not___contains(String altro_farmaco___not___contains) {
            this.altro_farmaco___not___contains = altro_farmaco___not___contains;
            return this;
        }

        public Builder setAltro_farmaco___starts_with(String altro_farmaco___starts_with) {
            this.altro_farmaco___starts_with = altro_farmaco___starts_with;
            return this;
        }

        public Builder setAltro_farmaco___not___starts_with(String altro_farmaco___not___starts_with) {
            this.altro_farmaco___not___starts_with = altro_farmaco___not___starts_with;
            return this;
        }

        public Builder setAltro_farmaco___ends_with(String altro_farmaco___ends_with) {
            this.altro_farmaco___ends_with = altro_farmaco___ends_with;
            return this;
        }

        public Builder setAltro_farmaco___not___ends_with(String altro_farmaco___not___ends_with) {
            this.altro_farmaco___not___ends_with = altro_farmaco___not___ends_with;
            return this;
        }

        public Builder setData_fine___eq(String data_fine___eq) {
            this.data_fine___eq = data_fine___eq;
            return this;
        }

        public Builder setData_fine___ne(String data_fine___ne) {
            this.data_fine___ne = data_fine___ne;
            return this;
        }

        public Builder setData_fine___null(Boolean data_fine___null) {
            this.data_fine___null = data_fine___null;
            return this;
        }

        public Builder setData_fine___not___null(Boolean data_fine___not___null) {
            this.data_fine___not___null = data_fine___not___null;
            return this;
        }

        public Builder setData_fine___in(java.util.List<String> data_fine___in) {
            this.data_fine___in = data_fine___in;
            return this;
        }

        public Builder setData_fine___not___in(java.util.List<String> data_fine___not___in) {
            this.data_fine___not___in = data_fine___not___in;
            return this;
        }

        public Builder setData_fine___lt(String data_fine___lt) {
            this.data_fine___lt = data_fine___lt;
            return this;
        }

        public Builder setData_fine___lte(String data_fine___lte) {
            this.data_fine___lte = data_fine___lte;
            return this;
        }

        public Builder setData_fine___gt(String data_fine___gt) {
            this.data_fine___gt = data_fine___gt;
            return this;
        }

        public Builder setData_fine___gte(String data_fine___gte) {
            this.data_fine___gte = data_fine___gte;
            return this;
        }

        public Builder setData_inizio___eq(String data_inizio___eq) {
            this.data_inizio___eq = data_inizio___eq;
            return this;
        }

        public Builder setData_inizio___ne(String data_inizio___ne) {
            this.data_inizio___ne = data_inizio___ne;
            return this;
        }

        public Builder setData_inizio___null(Boolean data_inizio___null) {
            this.data_inizio___null = data_inizio___null;
            return this;
        }

        public Builder setData_inizio___not___null(Boolean data_inizio___not___null) {
            this.data_inizio___not___null = data_inizio___not___null;
            return this;
        }

        public Builder setData_inizio___in(java.util.List<String> data_inizio___in) {
            this.data_inizio___in = data_inizio___in;
            return this;
        }

        public Builder setData_inizio___not___in(java.util.List<String> data_inizio___not___in) {
            this.data_inizio___not___in = data_inizio___not___in;
            return this;
        }

        public Builder setData_inizio___lt(String data_inizio___lt) {
            this.data_inizio___lt = data_inizio___lt;
            return this;
        }

        public Builder setData_inizio___lte(String data_inizio___lte) {
            this.data_inizio___lte = data_inizio___lte;
            return this;
        }

        public Builder setData_inizio___gt(String data_inizio___gt) {
            this.data_inizio___gt = data_inizio___gt;
            return this;
        }

        public Builder setData_inizio___gte(String data_inizio___gte) {
            this.data_inizio___gte = data_inizio___gte;
            return this;
        }

        public Builder setFarmaco_covid___eq(String farmaco_covid___eq) {
            this.farmaco_covid___eq = farmaco_covid___eq;
            return this;
        }

        public Builder setFarmaco_covid___ne(String farmaco_covid___ne) {
            this.farmaco_covid___ne = farmaco_covid___ne;
            return this;
        }

        public Builder setFarmaco_covid___null(Boolean farmaco_covid___null) {
            this.farmaco_covid___null = farmaco_covid___null;
            return this;
        }

        public Builder setFarmaco_covid___not___null(Boolean farmaco_covid___not___null) {
            this.farmaco_covid___not___null = farmaco_covid___not___null;
            return this;
        }

        public Builder setFarmaco_covid___in(java.util.List<String> farmaco_covid___in) {
            this.farmaco_covid___in = farmaco_covid___in;
            return this;
        }

        public Builder setFarmaco_covid___not___in(java.util.List<String> farmaco_covid___not___in) {
            this.farmaco_covid___not___in = farmaco_covid___not___in;
            return this;
        }

        public Builder setFarmaco_covid___lt(String farmaco_covid___lt) {
            this.farmaco_covid___lt = farmaco_covid___lt;
            return this;
        }

        public Builder setFarmaco_covid___lte(String farmaco_covid___lte) {
            this.farmaco_covid___lte = farmaco_covid___lte;
            return this;
        }

        public Builder setFarmaco_covid___gt(String farmaco_covid___gt) {
            this.farmaco_covid___gt = farmaco_covid___gt;
            return this;
        }

        public Builder setFarmaco_covid___gte(String farmaco_covid___gte) {
            this.farmaco_covid___gte = farmaco_covid___gte;
            return this;
        }

        public Builder setFarmaco_covid___contains(String farmaco_covid___contains) {
            this.farmaco_covid___contains = farmaco_covid___contains;
            return this;
        }

        public Builder setFarmaco_covid___not___contains(String farmaco_covid___not___contains) {
            this.farmaco_covid___not___contains = farmaco_covid___not___contains;
            return this;
        }

        public Builder setFarmaco_covid___starts_with(String farmaco_covid___starts_with) {
            this.farmaco_covid___starts_with = farmaco_covid___starts_with;
            return this;
        }

        public Builder setFarmaco_covid___not___starts_with(String farmaco_covid___not___starts_with) {
            this.farmaco_covid___not___starts_with = farmaco_covid___not___starts_with;
            return this;
        }

        public Builder setFarmaco_covid___ends_with(String farmaco_covid___ends_with) {
            this.farmaco_covid___ends_with = farmaco_covid___ends_with;
            return this;
        }

        public Builder setFarmaco_covid___not___ends_with(String farmaco_covid___not___ends_with) {
            this.farmaco_covid___not___ends_with = farmaco_covid___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliTerapia_covidFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliTerapia_covidFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliTerapia_covidFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliTerapia_covidFilterDTO build() {
            CliTerapia_covidFilterDTO result = new CliTerapia_covidFilterDTO();
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
            result.setAltro_farmaco___eq(this.altro_farmaco___eq);
            result.setAltro_farmaco___ne(this.altro_farmaco___ne);
            result.setAltro_farmaco___null(this.altro_farmaco___null);
            result.setAltro_farmaco___not___null(this.altro_farmaco___not___null);
            result.setAltro_farmaco___in(this.altro_farmaco___in);
            result.setAltro_farmaco___not___in(this.altro_farmaco___not___in);
            result.setAltro_farmaco___lt(this.altro_farmaco___lt);
            result.setAltro_farmaco___lte(this.altro_farmaco___lte);
            result.setAltro_farmaco___gt(this.altro_farmaco___gt);
            result.setAltro_farmaco___gte(this.altro_farmaco___gte);
            result.setAltro_farmaco___contains(this.altro_farmaco___contains);
            result.setAltro_farmaco___not___contains(this.altro_farmaco___not___contains);
            result.setAltro_farmaco___starts_with(this.altro_farmaco___starts_with);
            result.setAltro_farmaco___not___starts_with(this.altro_farmaco___not___starts_with);
            result.setAltro_farmaco___ends_with(this.altro_farmaco___ends_with);
            result.setAltro_farmaco___not___ends_with(this.altro_farmaco___not___ends_with);
            result.setData_fine___eq(this.data_fine___eq);
            result.setData_fine___ne(this.data_fine___ne);
            result.setData_fine___null(this.data_fine___null);
            result.setData_fine___not___null(this.data_fine___not___null);
            result.setData_fine___in(this.data_fine___in);
            result.setData_fine___not___in(this.data_fine___not___in);
            result.setData_fine___lt(this.data_fine___lt);
            result.setData_fine___lte(this.data_fine___lte);
            result.setData_fine___gt(this.data_fine___gt);
            result.setData_fine___gte(this.data_fine___gte);
            result.setData_inizio___eq(this.data_inizio___eq);
            result.setData_inizio___ne(this.data_inizio___ne);
            result.setData_inizio___null(this.data_inizio___null);
            result.setData_inizio___not___null(this.data_inizio___not___null);
            result.setData_inizio___in(this.data_inizio___in);
            result.setData_inizio___not___in(this.data_inizio___not___in);
            result.setData_inizio___lt(this.data_inizio___lt);
            result.setData_inizio___lte(this.data_inizio___lte);
            result.setData_inizio___gt(this.data_inizio___gt);
            result.setData_inizio___gte(this.data_inizio___gte);
            result.setFarmaco_covid___eq(this.farmaco_covid___eq);
            result.setFarmaco_covid___ne(this.farmaco_covid___ne);
            result.setFarmaco_covid___null(this.farmaco_covid___null);
            result.setFarmaco_covid___not___null(this.farmaco_covid___not___null);
            result.setFarmaco_covid___in(this.farmaco_covid___in);
            result.setFarmaco_covid___not___in(this.farmaco_covid___not___in);
            result.setFarmaco_covid___lt(this.farmaco_covid___lt);
            result.setFarmaco_covid___lte(this.farmaco_covid___lte);
            result.setFarmaco_covid___gt(this.farmaco_covid___gt);
            result.setFarmaco_covid___gte(this.farmaco_covid___gte);
            result.setFarmaco_covid___contains(this.farmaco_covid___contains);
            result.setFarmaco_covid___not___contains(this.farmaco_covid___not___contains);
            result.setFarmaco_covid___starts_with(this.farmaco_covid___starts_with);
            result.setFarmaco_covid___not___starts_with(this.farmaco_covid___not___starts_with);
            result.setFarmaco_covid___ends_with(this.farmaco_covid___ends_with);
            result.setFarmaco_covid___not___ends_with(this.farmaco_covid___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
