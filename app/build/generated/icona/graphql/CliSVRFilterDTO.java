package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type SVR.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliSVRFilterDTO implements java.io.Serializable {

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
    private String altro_svr___eq;
    private String altro_svr___ne;
    private Boolean altro_svr___null;
    private Boolean altro_svr___not___null;
    private java.util.List<String> altro_svr___in;
    private java.util.List<String> altro_svr___not___in;
    private String altro_svr___lt;
    private String altro_svr___lte;
    private String altro_svr___gt;
    private String altro_svr___gte;
    private String altro_svr___contains;
    private String altro_svr___not___contains;
    private String altro_svr___starts_with;
    private String altro_svr___not___starts_with;
    private String altro_svr___ends_with;
    private String altro_svr___not___ends_with;
    private Boolean clearance_spontanea___eq;
    private Boolean clearance_spontanea___ne;
    private Boolean clearance_spontanea___null;
    private Boolean clearance_spontanea___not___null;
    private String data_valutazione___eq;
    private String data_valutazione___ne;
    private Boolean data_valutazione___null;
    private Boolean data_valutazione___not___null;
    private java.util.List<String> data_valutazione___in;
    private java.util.List<String> data_valutazione___not___in;
    private String data_valutazione___lt;
    private String data_valutazione___lte;
    private String data_valutazione___gt;
    private String data_valutazione___gte;
    private String svr___eq;
    private String svr___ne;
    private Boolean svr___null;
    private Boolean svr___not___null;
    private java.util.List<String> svr___in;
    private java.util.List<String> svr___not___in;
    private String svr___lt;
    private String svr___lte;
    private String svr___gt;
    private String svr___gte;
    private String svr___contains;
    private String svr___not___contains;
    private String svr___starts_with;
    private String svr___not___starts_with;
    private String svr___ends_with;
    private String svr___not___ends_with;
    private String terapia___eq;
    private String terapia___ne;
    private Boolean terapia___null;
    private Boolean terapia___not___null;
    private java.util.List<String> terapia___in;
    private java.util.List<String> terapia___not___in;
    private String terapia___lt;
    private String terapia___lte;
    private String terapia___gt;
    private String terapia___gte;
    private String terapia___contains;
    private String terapia___not___contains;
    private String terapia___starts_with;
    private String terapia___not___starts_with;
    private String terapia___ends_with;
    private String terapia___not___ends_with;
    private java.util.List<CliSVRFilterDTO> AND;
    private java.util.List<CliSVRFilterDTO> OR;
    private CliSVRFilterDTO NOT;

    public CliSVRFilterDTO() {
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

    public String getAltro_svr___eq() {
        return altro_svr___eq;
    }
    public void setAltro_svr___eq(String altro_svr___eq) {
        this.altro_svr___eq = altro_svr___eq;
    }

    public String getAltro_svr___ne() {
        return altro_svr___ne;
    }
    public void setAltro_svr___ne(String altro_svr___ne) {
        this.altro_svr___ne = altro_svr___ne;
    }

    public Boolean getAltro_svr___null() {
        return altro_svr___null;
    }
    public void setAltro_svr___null(Boolean altro_svr___null) {
        this.altro_svr___null = altro_svr___null;
    }

    public Boolean getAltro_svr___not___null() {
        return altro_svr___not___null;
    }
    public void setAltro_svr___not___null(Boolean altro_svr___not___null) {
        this.altro_svr___not___null = altro_svr___not___null;
    }

    public java.util.List<String> getAltro_svr___in() {
        return altro_svr___in;
    }
    public void setAltro_svr___in(java.util.List<String> altro_svr___in) {
        this.altro_svr___in = altro_svr___in;
    }

    public java.util.List<String> getAltro_svr___not___in() {
        return altro_svr___not___in;
    }
    public void setAltro_svr___not___in(java.util.List<String> altro_svr___not___in) {
        this.altro_svr___not___in = altro_svr___not___in;
    }

    public String getAltro_svr___lt() {
        return altro_svr___lt;
    }
    public void setAltro_svr___lt(String altro_svr___lt) {
        this.altro_svr___lt = altro_svr___lt;
    }

    public String getAltro_svr___lte() {
        return altro_svr___lte;
    }
    public void setAltro_svr___lte(String altro_svr___lte) {
        this.altro_svr___lte = altro_svr___lte;
    }

    public String getAltro_svr___gt() {
        return altro_svr___gt;
    }
    public void setAltro_svr___gt(String altro_svr___gt) {
        this.altro_svr___gt = altro_svr___gt;
    }

    public String getAltro_svr___gte() {
        return altro_svr___gte;
    }
    public void setAltro_svr___gte(String altro_svr___gte) {
        this.altro_svr___gte = altro_svr___gte;
    }

    public String getAltro_svr___contains() {
        return altro_svr___contains;
    }
    public void setAltro_svr___contains(String altro_svr___contains) {
        this.altro_svr___contains = altro_svr___contains;
    }

    public String getAltro_svr___not___contains() {
        return altro_svr___not___contains;
    }
    public void setAltro_svr___not___contains(String altro_svr___not___contains) {
        this.altro_svr___not___contains = altro_svr___not___contains;
    }

    public String getAltro_svr___starts_with() {
        return altro_svr___starts_with;
    }
    public void setAltro_svr___starts_with(String altro_svr___starts_with) {
        this.altro_svr___starts_with = altro_svr___starts_with;
    }

    public String getAltro_svr___not___starts_with() {
        return altro_svr___not___starts_with;
    }
    public void setAltro_svr___not___starts_with(String altro_svr___not___starts_with) {
        this.altro_svr___not___starts_with = altro_svr___not___starts_with;
    }

    public String getAltro_svr___ends_with() {
        return altro_svr___ends_with;
    }
    public void setAltro_svr___ends_with(String altro_svr___ends_with) {
        this.altro_svr___ends_with = altro_svr___ends_with;
    }

    public String getAltro_svr___not___ends_with() {
        return altro_svr___not___ends_with;
    }
    public void setAltro_svr___not___ends_with(String altro_svr___not___ends_with) {
        this.altro_svr___not___ends_with = altro_svr___not___ends_with;
    }

    public Boolean getClearance_spontanea___eq() {
        return clearance_spontanea___eq;
    }
    public void setClearance_spontanea___eq(Boolean clearance_spontanea___eq) {
        this.clearance_spontanea___eq = clearance_spontanea___eq;
    }

    public Boolean getClearance_spontanea___ne() {
        return clearance_spontanea___ne;
    }
    public void setClearance_spontanea___ne(Boolean clearance_spontanea___ne) {
        this.clearance_spontanea___ne = clearance_spontanea___ne;
    }

    public Boolean getClearance_spontanea___null() {
        return clearance_spontanea___null;
    }
    public void setClearance_spontanea___null(Boolean clearance_spontanea___null) {
        this.clearance_spontanea___null = clearance_spontanea___null;
    }

    public Boolean getClearance_spontanea___not___null() {
        return clearance_spontanea___not___null;
    }
    public void setClearance_spontanea___not___null(Boolean clearance_spontanea___not___null) {
        this.clearance_spontanea___not___null = clearance_spontanea___not___null;
    }

    public String getData_valutazione___eq() {
        return data_valutazione___eq;
    }
    public void setData_valutazione___eq(String data_valutazione___eq) {
        this.data_valutazione___eq = data_valutazione___eq;
    }

    public String getData_valutazione___ne() {
        return data_valutazione___ne;
    }
    public void setData_valutazione___ne(String data_valutazione___ne) {
        this.data_valutazione___ne = data_valutazione___ne;
    }

    public Boolean getData_valutazione___null() {
        return data_valutazione___null;
    }
    public void setData_valutazione___null(Boolean data_valutazione___null) {
        this.data_valutazione___null = data_valutazione___null;
    }

    public Boolean getData_valutazione___not___null() {
        return data_valutazione___not___null;
    }
    public void setData_valutazione___not___null(Boolean data_valutazione___not___null) {
        this.data_valutazione___not___null = data_valutazione___not___null;
    }

    public java.util.List<String> getData_valutazione___in() {
        return data_valutazione___in;
    }
    public void setData_valutazione___in(java.util.List<String> data_valutazione___in) {
        this.data_valutazione___in = data_valutazione___in;
    }

    public java.util.List<String> getData_valutazione___not___in() {
        return data_valutazione___not___in;
    }
    public void setData_valutazione___not___in(java.util.List<String> data_valutazione___not___in) {
        this.data_valutazione___not___in = data_valutazione___not___in;
    }

    public String getData_valutazione___lt() {
        return data_valutazione___lt;
    }
    public void setData_valutazione___lt(String data_valutazione___lt) {
        this.data_valutazione___lt = data_valutazione___lt;
    }

    public String getData_valutazione___lte() {
        return data_valutazione___lte;
    }
    public void setData_valutazione___lte(String data_valutazione___lte) {
        this.data_valutazione___lte = data_valutazione___lte;
    }

    public String getData_valutazione___gt() {
        return data_valutazione___gt;
    }
    public void setData_valutazione___gt(String data_valutazione___gt) {
        this.data_valutazione___gt = data_valutazione___gt;
    }

    public String getData_valutazione___gte() {
        return data_valutazione___gte;
    }
    public void setData_valutazione___gte(String data_valutazione___gte) {
        this.data_valutazione___gte = data_valutazione___gte;
    }

    public String getSvr___eq() {
        return svr___eq;
    }
    public void setSvr___eq(String svr___eq) {
        this.svr___eq = svr___eq;
    }

    public String getSvr___ne() {
        return svr___ne;
    }
    public void setSvr___ne(String svr___ne) {
        this.svr___ne = svr___ne;
    }

    public Boolean getSvr___null() {
        return svr___null;
    }
    public void setSvr___null(Boolean svr___null) {
        this.svr___null = svr___null;
    }

    public Boolean getSvr___not___null() {
        return svr___not___null;
    }
    public void setSvr___not___null(Boolean svr___not___null) {
        this.svr___not___null = svr___not___null;
    }

    public java.util.List<String> getSvr___in() {
        return svr___in;
    }
    public void setSvr___in(java.util.List<String> svr___in) {
        this.svr___in = svr___in;
    }

    public java.util.List<String> getSvr___not___in() {
        return svr___not___in;
    }
    public void setSvr___not___in(java.util.List<String> svr___not___in) {
        this.svr___not___in = svr___not___in;
    }

    public String getSvr___lt() {
        return svr___lt;
    }
    public void setSvr___lt(String svr___lt) {
        this.svr___lt = svr___lt;
    }

    public String getSvr___lte() {
        return svr___lte;
    }
    public void setSvr___lte(String svr___lte) {
        this.svr___lte = svr___lte;
    }

    public String getSvr___gt() {
        return svr___gt;
    }
    public void setSvr___gt(String svr___gt) {
        this.svr___gt = svr___gt;
    }

    public String getSvr___gte() {
        return svr___gte;
    }
    public void setSvr___gte(String svr___gte) {
        this.svr___gte = svr___gte;
    }

    public String getSvr___contains() {
        return svr___contains;
    }
    public void setSvr___contains(String svr___contains) {
        this.svr___contains = svr___contains;
    }

    public String getSvr___not___contains() {
        return svr___not___contains;
    }
    public void setSvr___not___contains(String svr___not___contains) {
        this.svr___not___contains = svr___not___contains;
    }

    public String getSvr___starts_with() {
        return svr___starts_with;
    }
    public void setSvr___starts_with(String svr___starts_with) {
        this.svr___starts_with = svr___starts_with;
    }

    public String getSvr___not___starts_with() {
        return svr___not___starts_with;
    }
    public void setSvr___not___starts_with(String svr___not___starts_with) {
        this.svr___not___starts_with = svr___not___starts_with;
    }

    public String getSvr___ends_with() {
        return svr___ends_with;
    }
    public void setSvr___ends_with(String svr___ends_with) {
        this.svr___ends_with = svr___ends_with;
    }

    public String getSvr___not___ends_with() {
        return svr___not___ends_with;
    }
    public void setSvr___not___ends_with(String svr___not___ends_with) {
        this.svr___not___ends_with = svr___not___ends_with;
    }

    public String getTerapia___eq() {
        return terapia___eq;
    }
    public void setTerapia___eq(String terapia___eq) {
        this.terapia___eq = terapia___eq;
    }

    public String getTerapia___ne() {
        return terapia___ne;
    }
    public void setTerapia___ne(String terapia___ne) {
        this.terapia___ne = terapia___ne;
    }

    public Boolean getTerapia___null() {
        return terapia___null;
    }
    public void setTerapia___null(Boolean terapia___null) {
        this.terapia___null = terapia___null;
    }

    public Boolean getTerapia___not___null() {
        return terapia___not___null;
    }
    public void setTerapia___not___null(Boolean terapia___not___null) {
        this.terapia___not___null = terapia___not___null;
    }

    public java.util.List<String> getTerapia___in() {
        return terapia___in;
    }
    public void setTerapia___in(java.util.List<String> terapia___in) {
        this.terapia___in = terapia___in;
    }

    public java.util.List<String> getTerapia___not___in() {
        return terapia___not___in;
    }
    public void setTerapia___not___in(java.util.List<String> terapia___not___in) {
        this.terapia___not___in = terapia___not___in;
    }

    public String getTerapia___lt() {
        return terapia___lt;
    }
    public void setTerapia___lt(String terapia___lt) {
        this.terapia___lt = terapia___lt;
    }

    public String getTerapia___lte() {
        return terapia___lte;
    }
    public void setTerapia___lte(String terapia___lte) {
        this.terapia___lte = terapia___lte;
    }

    public String getTerapia___gt() {
        return terapia___gt;
    }
    public void setTerapia___gt(String terapia___gt) {
        this.terapia___gt = terapia___gt;
    }

    public String getTerapia___gte() {
        return terapia___gte;
    }
    public void setTerapia___gte(String terapia___gte) {
        this.terapia___gte = terapia___gte;
    }

    public String getTerapia___contains() {
        return terapia___contains;
    }
    public void setTerapia___contains(String terapia___contains) {
        this.terapia___contains = terapia___contains;
    }

    public String getTerapia___not___contains() {
        return terapia___not___contains;
    }
    public void setTerapia___not___contains(String terapia___not___contains) {
        this.terapia___not___contains = terapia___not___contains;
    }

    public String getTerapia___starts_with() {
        return terapia___starts_with;
    }
    public void setTerapia___starts_with(String terapia___starts_with) {
        this.terapia___starts_with = terapia___starts_with;
    }

    public String getTerapia___not___starts_with() {
        return terapia___not___starts_with;
    }
    public void setTerapia___not___starts_with(String terapia___not___starts_with) {
        this.terapia___not___starts_with = terapia___not___starts_with;
    }

    public String getTerapia___ends_with() {
        return terapia___ends_with;
    }
    public void setTerapia___ends_with(String terapia___ends_with) {
        this.terapia___ends_with = terapia___ends_with;
    }

    public String getTerapia___not___ends_with() {
        return terapia___not___ends_with;
    }
    public void setTerapia___not___ends_with(String terapia___not___ends_with) {
        this.terapia___not___ends_with = terapia___not___ends_with;
    }

    public java.util.List<CliSVRFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliSVRFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliSVRFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliSVRFilterDTO> OR) {
        this.OR = OR;
    }

    public CliSVRFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliSVRFilterDTO NOT) {
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
        if (altro_svr___eq != null) {
            joiner.add("altro_svr___eq: " + GraphQLRequestSerializer.getEntry(altro_svr___eq));
        }
        if (altro_svr___ne != null) {
            joiner.add("altro_svr___ne: " + GraphQLRequestSerializer.getEntry(altro_svr___ne));
        }
        if (altro_svr___null != null) {
            joiner.add("altro_svr___null: " + GraphQLRequestSerializer.getEntry(altro_svr___null));
        }
        if (altro_svr___not___null != null) {
            joiner.add("altro_svr___not___null: " + GraphQLRequestSerializer.getEntry(altro_svr___not___null));
        }
        if (altro_svr___in != null) {
            joiner.add("altro_svr___in: " + GraphQLRequestSerializer.getEntry(altro_svr___in));
        }
        if (altro_svr___not___in != null) {
            joiner.add("altro_svr___not___in: " + GraphQLRequestSerializer.getEntry(altro_svr___not___in));
        }
        if (altro_svr___lt != null) {
            joiner.add("altro_svr___lt: " + GraphQLRequestSerializer.getEntry(altro_svr___lt));
        }
        if (altro_svr___lte != null) {
            joiner.add("altro_svr___lte: " + GraphQLRequestSerializer.getEntry(altro_svr___lte));
        }
        if (altro_svr___gt != null) {
            joiner.add("altro_svr___gt: " + GraphQLRequestSerializer.getEntry(altro_svr___gt));
        }
        if (altro_svr___gte != null) {
            joiner.add("altro_svr___gte: " + GraphQLRequestSerializer.getEntry(altro_svr___gte));
        }
        if (altro_svr___contains != null) {
            joiner.add("altro_svr___contains: " + GraphQLRequestSerializer.getEntry(altro_svr___contains));
        }
        if (altro_svr___not___contains != null) {
            joiner.add("altro_svr___not___contains: " + GraphQLRequestSerializer.getEntry(altro_svr___not___contains));
        }
        if (altro_svr___starts_with != null) {
            joiner.add("altro_svr___starts_with: " + GraphQLRequestSerializer.getEntry(altro_svr___starts_with));
        }
        if (altro_svr___not___starts_with != null) {
            joiner.add("altro_svr___not___starts_with: " + GraphQLRequestSerializer.getEntry(altro_svr___not___starts_with));
        }
        if (altro_svr___ends_with != null) {
            joiner.add("altro_svr___ends_with: " + GraphQLRequestSerializer.getEntry(altro_svr___ends_with));
        }
        if (altro_svr___not___ends_with != null) {
            joiner.add("altro_svr___not___ends_with: " + GraphQLRequestSerializer.getEntry(altro_svr___not___ends_with));
        }
        if (clearance_spontanea___eq != null) {
            joiner.add("clearance_spontanea___eq: " + GraphQLRequestSerializer.getEntry(clearance_spontanea___eq));
        }
        if (clearance_spontanea___ne != null) {
            joiner.add("clearance_spontanea___ne: " + GraphQLRequestSerializer.getEntry(clearance_spontanea___ne));
        }
        if (clearance_spontanea___null != null) {
            joiner.add("clearance_spontanea___null: " + GraphQLRequestSerializer.getEntry(clearance_spontanea___null));
        }
        if (clearance_spontanea___not___null != null) {
            joiner.add("clearance_spontanea___not___null: " + GraphQLRequestSerializer.getEntry(clearance_spontanea___not___null));
        }
        if (data_valutazione___eq != null) {
            joiner.add("data_valutazione___eq: " + GraphQLRequestSerializer.getEntry(data_valutazione___eq));
        }
        if (data_valutazione___ne != null) {
            joiner.add("data_valutazione___ne: " + GraphQLRequestSerializer.getEntry(data_valutazione___ne));
        }
        if (data_valutazione___null != null) {
            joiner.add("data_valutazione___null: " + GraphQLRequestSerializer.getEntry(data_valutazione___null));
        }
        if (data_valutazione___not___null != null) {
            joiner.add("data_valutazione___not___null: " + GraphQLRequestSerializer.getEntry(data_valutazione___not___null));
        }
        if (data_valutazione___in != null) {
            joiner.add("data_valutazione___in: " + GraphQLRequestSerializer.getEntry(data_valutazione___in));
        }
        if (data_valutazione___not___in != null) {
            joiner.add("data_valutazione___not___in: " + GraphQLRequestSerializer.getEntry(data_valutazione___not___in));
        }
        if (data_valutazione___lt != null) {
            joiner.add("data_valutazione___lt: " + GraphQLRequestSerializer.getEntry(data_valutazione___lt));
        }
        if (data_valutazione___lte != null) {
            joiner.add("data_valutazione___lte: " + GraphQLRequestSerializer.getEntry(data_valutazione___lte));
        }
        if (data_valutazione___gt != null) {
            joiner.add("data_valutazione___gt: " + GraphQLRequestSerializer.getEntry(data_valutazione___gt));
        }
        if (data_valutazione___gte != null) {
            joiner.add("data_valutazione___gte: " + GraphQLRequestSerializer.getEntry(data_valutazione___gte));
        }
        if (svr___eq != null) {
            joiner.add("svr___eq: " + GraphQLRequestSerializer.getEntry(svr___eq));
        }
        if (svr___ne != null) {
            joiner.add("svr___ne: " + GraphQLRequestSerializer.getEntry(svr___ne));
        }
        if (svr___null != null) {
            joiner.add("svr___null: " + GraphQLRequestSerializer.getEntry(svr___null));
        }
        if (svr___not___null != null) {
            joiner.add("svr___not___null: " + GraphQLRequestSerializer.getEntry(svr___not___null));
        }
        if (svr___in != null) {
            joiner.add("svr___in: " + GraphQLRequestSerializer.getEntry(svr___in));
        }
        if (svr___not___in != null) {
            joiner.add("svr___not___in: " + GraphQLRequestSerializer.getEntry(svr___not___in));
        }
        if (svr___lt != null) {
            joiner.add("svr___lt: " + GraphQLRequestSerializer.getEntry(svr___lt));
        }
        if (svr___lte != null) {
            joiner.add("svr___lte: " + GraphQLRequestSerializer.getEntry(svr___lte));
        }
        if (svr___gt != null) {
            joiner.add("svr___gt: " + GraphQLRequestSerializer.getEntry(svr___gt));
        }
        if (svr___gte != null) {
            joiner.add("svr___gte: " + GraphQLRequestSerializer.getEntry(svr___gte));
        }
        if (svr___contains != null) {
            joiner.add("svr___contains: " + GraphQLRequestSerializer.getEntry(svr___contains));
        }
        if (svr___not___contains != null) {
            joiner.add("svr___not___contains: " + GraphQLRequestSerializer.getEntry(svr___not___contains));
        }
        if (svr___starts_with != null) {
            joiner.add("svr___starts_with: " + GraphQLRequestSerializer.getEntry(svr___starts_with));
        }
        if (svr___not___starts_with != null) {
            joiner.add("svr___not___starts_with: " + GraphQLRequestSerializer.getEntry(svr___not___starts_with));
        }
        if (svr___ends_with != null) {
            joiner.add("svr___ends_with: " + GraphQLRequestSerializer.getEntry(svr___ends_with));
        }
        if (svr___not___ends_with != null) {
            joiner.add("svr___not___ends_with: " + GraphQLRequestSerializer.getEntry(svr___not___ends_with));
        }
        if (terapia___eq != null) {
            joiner.add("terapia___eq: " + GraphQLRequestSerializer.getEntry(terapia___eq));
        }
        if (terapia___ne != null) {
            joiner.add("terapia___ne: " + GraphQLRequestSerializer.getEntry(terapia___ne));
        }
        if (terapia___null != null) {
            joiner.add("terapia___null: " + GraphQLRequestSerializer.getEntry(terapia___null));
        }
        if (terapia___not___null != null) {
            joiner.add("terapia___not___null: " + GraphQLRequestSerializer.getEntry(terapia___not___null));
        }
        if (terapia___in != null) {
            joiner.add("terapia___in: " + GraphQLRequestSerializer.getEntry(terapia___in));
        }
        if (terapia___not___in != null) {
            joiner.add("terapia___not___in: " + GraphQLRequestSerializer.getEntry(terapia___not___in));
        }
        if (terapia___lt != null) {
            joiner.add("terapia___lt: " + GraphQLRequestSerializer.getEntry(terapia___lt));
        }
        if (terapia___lte != null) {
            joiner.add("terapia___lte: " + GraphQLRequestSerializer.getEntry(terapia___lte));
        }
        if (terapia___gt != null) {
            joiner.add("terapia___gt: " + GraphQLRequestSerializer.getEntry(terapia___gt));
        }
        if (terapia___gte != null) {
            joiner.add("terapia___gte: " + GraphQLRequestSerializer.getEntry(terapia___gte));
        }
        if (terapia___contains != null) {
            joiner.add("terapia___contains: " + GraphQLRequestSerializer.getEntry(terapia___contains));
        }
        if (terapia___not___contains != null) {
            joiner.add("terapia___not___contains: " + GraphQLRequestSerializer.getEntry(terapia___not___contains));
        }
        if (terapia___starts_with != null) {
            joiner.add("terapia___starts_with: " + GraphQLRequestSerializer.getEntry(terapia___starts_with));
        }
        if (terapia___not___starts_with != null) {
            joiner.add("terapia___not___starts_with: " + GraphQLRequestSerializer.getEntry(terapia___not___starts_with));
        }
        if (terapia___ends_with != null) {
            joiner.add("terapia___ends_with: " + GraphQLRequestSerializer.getEntry(terapia___ends_with));
        }
        if (terapia___not___ends_with != null) {
            joiner.add("terapia___not___ends_with: " + GraphQLRequestSerializer.getEntry(terapia___not___ends_with));
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

    public static CliSVRFilterDTO.Builder builder() {
        return new CliSVRFilterDTO.Builder();
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
        private String altro_svr___eq;
        private String altro_svr___ne;
        private Boolean altro_svr___null;
        private Boolean altro_svr___not___null;
        private java.util.List<String> altro_svr___in;
        private java.util.List<String> altro_svr___not___in;
        private String altro_svr___lt;
        private String altro_svr___lte;
        private String altro_svr___gt;
        private String altro_svr___gte;
        private String altro_svr___contains;
        private String altro_svr___not___contains;
        private String altro_svr___starts_with;
        private String altro_svr___not___starts_with;
        private String altro_svr___ends_with;
        private String altro_svr___not___ends_with;
        private Boolean clearance_spontanea___eq;
        private Boolean clearance_spontanea___ne;
        private Boolean clearance_spontanea___null;
        private Boolean clearance_spontanea___not___null;
        private String data_valutazione___eq;
        private String data_valutazione___ne;
        private Boolean data_valutazione___null;
        private Boolean data_valutazione___not___null;
        private java.util.List<String> data_valutazione___in;
        private java.util.List<String> data_valutazione___not___in;
        private String data_valutazione___lt;
        private String data_valutazione___lte;
        private String data_valutazione___gt;
        private String data_valutazione___gte;
        private String svr___eq;
        private String svr___ne;
        private Boolean svr___null;
        private Boolean svr___not___null;
        private java.util.List<String> svr___in;
        private java.util.List<String> svr___not___in;
        private String svr___lt;
        private String svr___lte;
        private String svr___gt;
        private String svr___gte;
        private String svr___contains;
        private String svr___not___contains;
        private String svr___starts_with;
        private String svr___not___starts_with;
        private String svr___ends_with;
        private String svr___not___ends_with;
        private String terapia___eq;
        private String terapia___ne;
        private Boolean terapia___null;
        private Boolean terapia___not___null;
        private java.util.List<String> terapia___in;
        private java.util.List<String> terapia___not___in;
        private String terapia___lt;
        private String terapia___lte;
        private String terapia___gt;
        private String terapia___gte;
        private String terapia___contains;
        private String terapia___not___contains;
        private String terapia___starts_with;
        private String terapia___not___starts_with;
        private String terapia___ends_with;
        private String terapia___not___ends_with;
        private java.util.List<CliSVRFilterDTO> AND;
        private java.util.List<CliSVRFilterDTO> OR;
        private CliSVRFilterDTO NOT;

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

        public Builder setAltro_svr___eq(String altro_svr___eq) {
            this.altro_svr___eq = altro_svr___eq;
            return this;
        }

        public Builder setAltro_svr___ne(String altro_svr___ne) {
            this.altro_svr___ne = altro_svr___ne;
            return this;
        }

        public Builder setAltro_svr___null(Boolean altro_svr___null) {
            this.altro_svr___null = altro_svr___null;
            return this;
        }

        public Builder setAltro_svr___not___null(Boolean altro_svr___not___null) {
            this.altro_svr___not___null = altro_svr___not___null;
            return this;
        }

        public Builder setAltro_svr___in(java.util.List<String> altro_svr___in) {
            this.altro_svr___in = altro_svr___in;
            return this;
        }

        public Builder setAltro_svr___not___in(java.util.List<String> altro_svr___not___in) {
            this.altro_svr___not___in = altro_svr___not___in;
            return this;
        }

        public Builder setAltro_svr___lt(String altro_svr___lt) {
            this.altro_svr___lt = altro_svr___lt;
            return this;
        }

        public Builder setAltro_svr___lte(String altro_svr___lte) {
            this.altro_svr___lte = altro_svr___lte;
            return this;
        }

        public Builder setAltro_svr___gt(String altro_svr___gt) {
            this.altro_svr___gt = altro_svr___gt;
            return this;
        }

        public Builder setAltro_svr___gte(String altro_svr___gte) {
            this.altro_svr___gte = altro_svr___gte;
            return this;
        }

        public Builder setAltro_svr___contains(String altro_svr___contains) {
            this.altro_svr___contains = altro_svr___contains;
            return this;
        }

        public Builder setAltro_svr___not___contains(String altro_svr___not___contains) {
            this.altro_svr___not___contains = altro_svr___not___contains;
            return this;
        }

        public Builder setAltro_svr___starts_with(String altro_svr___starts_with) {
            this.altro_svr___starts_with = altro_svr___starts_with;
            return this;
        }

        public Builder setAltro_svr___not___starts_with(String altro_svr___not___starts_with) {
            this.altro_svr___not___starts_with = altro_svr___not___starts_with;
            return this;
        }

        public Builder setAltro_svr___ends_with(String altro_svr___ends_with) {
            this.altro_svr___ends_with = altro_svr___ends_with;
            return this;
        }

        public Builder setAltro_svr___not___ends_with(String altro_svr___not___ends_with) {
            this.altro_svr___not___ends_with = altro_svr___not___ends_with;
            return this;
        }

        public Builder setClearance_spontanea___eq(Boolean clearance_spontanea___eq) {
            this.clearance_spontanea___eq = clearance_spontanea___eq;
            return this;
        }

        public Builder setClearance_spontanea___ne(Boolean clearance_spontanea___ne) {
            this.clearance_spontanea___ne = clearance_spontanea___ne;
            return this;
        }

        public Builder setClearance_spontanea___null(Boolean clearance_spontanea___null) {
            this.clearance_spontanea___null = clearance_spontanea___null;
            return this;
        }

        public Builder setClearance_spontanea___not___null(Boolean clearance_spontanea___not___null) {
            this.clearance_spontanea___not___null = clearance_spontanea___not___null;
            return this;
        }

        public Builder setData_valutazione___eq(String data_valutazione___eq) {
            this.data_valutazione___eq = data_valutazione___eq;
            return this;
        }

        public Builder setData_valutazione___ne(String data_valutazione___ne) {
            this.data_valutazione___ne = data_valutazione___ne;
            return this;
        }

        public Builder setData_valutazione___null(Boolean data_valutazione___null) {
            this.data_valutazione___null = data_valutazione___null;
            return this;
        }

        public Builder setData_valutazione___not___null(Boolean data_valutazione___not___null) {
            this.data_valutazione___not___null = data_valutazione___not___null;
            return this;
        }

        public Builder setData_valutazione___in(java.util.List<String> data_valutazione___in) {
            this.data_valutazione___in = data_valutazione___in;
            return this;
        }

        public Builder setData_valutazione___not___in(java.util.List<String> data_valutazione___not___in) {
            this.data_valutazione___not___in = data_valutazione___not___in;
            return this;
        }

        public Builder setData_valutazione___lt(String data_valutazione___lt) {
            this.data_valutazione___lt = data_valutazione___lt;
            return this;
        }

        public Builder setData_valutazione___lte(String data_valutazione___lte) {
            this.data_valutazione___lte = data_valutazione___lte;
            return this;
        }

        public Builder setData_valutazione___gt(String data_valutazione___gt) {
            this.data_valutazione___gt = data_valutazione___gt;
            return this;
        }

        public Builder setData_valutazione___gte(String data_valutazione___gte) {
            this.data_valutazione___gte = data_valutazione___gte;
            return this;
        }

        public Builder setSvr___eq(String svr___eq) {
            this.svr___eq = svr___eq;
            return this;
        }

        public Builder setSvr___ne(String svr___ne) {
            this.svr___ne = svr___ne;
            return this;
        }

        public Builder setSvr___null(Boolean svr___null) {
            this.svr___null = svr___null;
            return this;
        }

        public Builder setSvr___not___null(Boolean svr___not___null) {
            this.svr___not___null = svr___not___null;
            return this;
        }

        public Builder setSvr___in(java.util.List<String> svr___in) {
            this.svr___in = svr___in;
            return this;
        }

        public Builder setSvr___not___in(java.util.List<String> svr___not___in) {
            this.svr___not___in = svr___not___in;
            return this;
        }

        public Builder setSvr___lt(String svr___lt) {
            this.svr___lt = svr___lt;
            return this;
        }

        public Builder setSvr___lte(String svr___lte) {
            this.svr___lte = svr___lte;
            return this;
        }

        public Builder setSvr___gt(String svr___gt) {
            this.svr___gt = svr___gt;
            return this;
        }

        public Builder setSvr___gte(String svr___gte) {
            this.svr___gte = svr___gte;
            return this;
        }

        public Builder setSvr___contains(String svr___contains) {
            this.svr___contains = svr___contains;
            return this;
        }

        public Builder setSvr___not___contains(String svr___not___contains) {
            this.svr___not___contains = svr___not___contains;
            return this;
        }

        public Builder setSvr___starts_with(String svr___starts_with) {
            this.svr___starts_with = svr___starts_with;
            return this;
        }

        public Builder setSvr___not___starts_with(String svr___not___starts_with) {
            this.svr___not___starts_with = svr___not___starts_with;
            return this;
        }

        public Builder setSvr___ends_with(String svr___ends_with) {
            this.svr___ends_with = svr___ends_with;
            return this;
        }

        public Builder setSvr___not___ends_with(String svr___not___ends_with) {
            this.svr___not___ends_with = svr___not___ends_with;
            return this;
        }

        public Builder setTerapia___eq(String terapia___eq) {
            this.terapia___eq = terapia___eq;
            return this;
        }

        public Builder setTerapia___ne(String terapia___ne) {
            this.terapia___ne = terapia___ne;
            return this;
        }

        public Builder setTerapia___null(Boolean terapia___null) {
            this.terapia___null = terapia___null;
            return this;
        }

        public Builder setTerapia___not___null(Boolean terapia___not___null) {
            this.terapia___not___null = terapia___not___null;
            return this;
        }

        public Builder setTerapia___in(java.util.List<String> terapia___in) {
            this.terapia___in = terapia___in;
            return this;
        }

        public Builder setTerapia___not___in(java.util.List<String> terapia___not___in) {
            this.terapia___not___in = terapia___not___in;
            return this;
        }

        public Builder setTerapia___lt(String terapia___lt) {
            this.terapia___lt = terapia___lt;
            return this;
        }

        public Builder setTerapia___lte(String terapia___lte) {
            this.terapia___lte = terapia___lte;
            return this;
        }

        public Builder setTerapia___gt(String terapia___gt) {
            this.terapia___gt = terapia___gt;
            return this;
        }

        public Builder setTerapia___gte(String terapia___gte) {
            this.terapia___gte = terapia___gte;
            return this;
        }

        public Builder setTerapia___contains(String terapia___contains) {
            this.terapia___contains = terapia___contains;
            return this;
        }

        public Builder setTerapia___not___contains(String terapia___not___contains) {
            this.terapia___not___contains = terapia___not___contains;
            return this;
        }

        public Builder setTerapia___starts_with(String terapia___starts_with) {
            this.terapia___starts_with = terapia___starts_with;
            return this;
        }

        public Builder setTerapia___not___starts_with(String terapia___not___starts_with) {
            this.terapia___not___starts_with = terapia___not___starts_with;
            return this;
        }

        public Builder setTerapia___ends_with(String terapia___ends_with) {
            this.terapia___ends_with = terapia___ends_with;
            return this;
        }

        public Builder setTerapia___not___ends_with(String terapia___not___ends_with) {
            this.terapia___not___ends_with = terapia___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliSVRFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliSVRFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliSVRFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliSVRFilterDTO build() {
            CliSVRFilterDTO result = new CliSVRFilterDTO();
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
            result.setAltro_svr___eq(this.altro_svr___eq);
            result.setAltro_svr___ne(this.altro_svr___ne);
            result.setAltro_svr___null(this.altro_svr___null);
            result.setAltro_svr___not___null(this.altro_svr___not___null);
            result.setAltro_svr___in(this.altro_svr___in);
            result.setAltro_svr___not___in(this.altro_svr___not___in);
            result.setAltro_svr___lt(this.altro_svr___lt);
            result.setAltro_svr___lte(this.altro_svr___lte);
            result.setAltro_svr___gt(this.altro_svr___gt);
            result.setAltro_svr___gte(this.altro_svr___gte);
            result.setAltro_svr___contains(this.altro_svr___contains);
            result.setAltro_svr___not___contains(this.altro_svr___not___contains);
            result.setAltro_svr___starts_with(this.altro_svr___starts_with);
            result.setAltro_svr___not___starts_with(this.altro_svr___not___starts_with);
            result.setAltro_svr___ends_with(this.altro_svr___ends_with);
            result.setAltro_svr___not___ends_with(this.altro_svr___not___ends_with);
            result.setClearance_spontanea___eq(this.clearance_spontanea___eq);
            result.setClearance_spontanea___ne(this.clearance_spontanea___ne);
            result.setClearance_spontanea___null(this.clearance_spontanea___null);
            result.setClearance_spontanea___not___null(this.clearance_spontanea___not___null);
            result.setData_valutazione___eq(this.data_valutazione___eq);
            result.setData_valutazione___ne(this.data_valutazione___ne);
            result.setData_valutazione___null(this.data_valutazione___null);
            result.setData_valutazione___not___null(this.data_valutazione___not___null);
            result.setData_valutazione___in(this.data_valutazione___in);
            result.setData_valutazione___not___in(this.data_valutazione___not___in);
            result.setData_valutazione___lt(this.data_valutazione___lt);
            result.setData_valutazione___lte(this.data_valutazione___lte);
            result.setData_valutazione___gt(this.data_valutazione___gt);
            result.setData_valutazione___gte(this.data_valutazione___gte);
            result.setSvr___eq(this.svr___eq);
            result.setSvr___ne(this.svr___ne);
            result.setSvr___null(this.svr___null);
            result.setSvr___not___null(this.svr___not___null);
            result.setSvr___in(this.svr___in);
            result.setSvr___not___in(this.svr___not___in);
            result.setSvr___lt(this.svr___lt);
            result.setSvr___lte(this.svr___lte);
            result.setSvr___gt(this.svr___gt);
            result.setSvr___gte(this.svr___gte);
            result.setSvr___contains(this.svr___contains);
            result.setSvr___not___contains(this.svr___not___contains);
            result.setSvr___starts_with(this.svr___starts_with);
            result.setSvr___not___starts_with(this.svr___not___starts_with);
            result.setSvr___ends_with(this.svr___ends_with);
            result.setSvr___not___ends_with(this.svr___not___ends_with);
            result.setTerapia___eq(this.terapia___eq);
            result.setTerapia___ne(this.terapia___ne);
            result.setTerapia___null(this.terapia___null);
            result.setTerapia___not___null(this.terapia___not___null);
            result.setTerapia___in(this.terapia___in);
            result.setTerapia___not___in(this.terapia___not___in);
            result.setTerapia___lt(this.terapia___lt);
            result.setTerapia___lte(this.terapia___lte);
            result.setTerapia___gt(this.terapia___gt);
            result.setTerapia___gte(this.terapia___gte);
            result.setTerapia___contains(this.terapia___contains);
            result.setTerapia___not___contains(this.terapia___not___contains);
            result.setTerapia___starts_with(this.terapia___starts_with);
            result.setTerapia___not___starts_with(this.terapia___not___starts_with);
            result.setTerapia___ends_with(this.terapia___ends_with);
            result.setTerapia___not___ends_with(this.terapia___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
