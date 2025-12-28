package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Questionario_PRO.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliQuestionario_PROFilterDTO implements java.io.Serializable {

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
    private String data_compilazione___eq;
    private String data_compilazione___ne;
    private Boolean data_compilazione___null;
    private Boolean data_compilazione___not___null;
    private java.util.List<String> data_compilazione___in;
    private java.util.List<String> data_compilazione___not___in;
    private String data_compilazione___lt;
    private String data_compilazione___lte;
    private String data_compilazione___gt;
    private String data_compilazione___gte;
    private String mese___eq;
    private String mese___ne;
    private Boolean mese___null;
    private Boolean mese___not___null;
    private java.util.List<String> mese___in;
    private java.util.List<String> mese___not___in;
    private String mese___lt;
    private String mese___lte;
    private String mese___gt;
    private String mese___gte;
    private String mese___contains;
    private String mese___not___contains;
    private String mese___starts_with;
    private String mese___not___starts_with;
    private String mese___ends_with;
    private String mese___not___ends_with;
    private java.util.List<CliQuestionario_PROFilterDTO> AND;
    private java.util.List<CliQuestionario_PROFilterDTO> OR;
    private CliQuestionario_PROFilterDTO NOT;

    public CliQuestionario_PROFilterDTO() {
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

    public String getData_compilazione___eq() {
        return data_compilazione___eq;
    }
    public void setData_compilazione___eq(String data_compilazione___eq) {
        this.data_compilazione___eq = data_compilazione___eq;
    }

    public String getData_compilazione___ne() {
        return data_compilazione___ne;
    }
    public void setData_compilazione___ne(String data_compilazione___ne) {
        this.data_compilazione___ne = data_compilazione___ne;
    }

    public Boolean getData_compilazione___null() {
        return data_compilazione___null;
    }
    public void setData_compilazione___null(Boolean data_compilazione___null) {
        this.data_compilazione___null = data_compilazione___null;
    }

    public Boolean getData_compilazione___not___null() {
        return data_compilazione___not___null;
    }
    public void setData_compilazione___not___null(Boolean data_compilazione___not___null) {
        this.data_compilazione___not___null = data_compilazione___not___null;
    }

    public java.util.List<String> getData_compilazione___in() {
        return data_compilazione___in;
    }
    public void setData_compilazione___in(java.util.List<String> data_compilazione___in) {
        this.data_compilazione___in = data_compilazione___in;
    }

    public java.util.List<String> getData_compilazione___not___in() {
        return data_compilazione___not___in;
    }
    public void setData_compilazione___not___in(java.util.List<String> data_compilazione___not___in) {
        this.data_compilazione___not___in = data_compilazione___not___in;
    }

    public String getData_compilazione___lt() {
        return data_compilazione___lt;
    }
    public void setData_compilazione___lt(String data_compilazione___lt) {
        this.data_compilazione___lt = data_compilazione___lt;
    }

    public String getData_compilazione___lte() {
        return data_compilazione___lte;
    }
    public void setData_compilazione___lte(String data_compilazione___lte) {
        this.data_compilazione___lte = data_compilazione___lte;
    }

    public String getData_compilazione___gt() {
        return data_compilazione___gt;
    }
    public void setData_compilazione___gt(String data_compilazione___gt) {
        this.data_compilazione___gt = data_compilazione___gt;
    }

    public String getData_compilazione___gte() {
        return data_compilazione___gte;
    }
    public void setData_compilazione___gte(String data_compilazione___gte) {
        this.data_compilazione___gte = data_compilazione___gte;
    }

    public String getMese___eq() {
        return mese___eq;
    }
    public void setMese___eq(String mese___eq) {
        this.mese___eq = mese___eq;
    }

    public String getMese___ne() {
        return mese___ne;
    }
    public void setMese___ne(String mese___ne) {
        this.mese___ne = mese___ne;
    }

    public Boolean getMese___null() {
        return mese___null;
    }
    public void setMese___null(Boolean mese___null) {
        this.mese___null = mese___null;
    }

    public Boolean getMese___not___null() {
        return mese___not___null;
    }
    public void setMese___not___null(Boolean mese___not___null) {
        this.mese___not___null = mese___not___null;
    }

    public java.util.List<String> getMese___in() {
        return mese___in;
    }
    public void setMese___in(java.util.List<String> mese___in) {
        this.mese___in = mese___in;
    }

    public java.util.List<String> getMese___not___in() {
        return mese___not___in;
    }
    public void setMese___not___in(java.util.List<String> mese___not___in) {
        this.mese___not___in = mese___not___in;
    }

    public String getMese___lt() {
        return mese___lt;
    }
    public void setMese___lt(String mese___lt) {
        this.mese___lt = mese___lt;
    }

    public String getMese___lte() {
        return mese___lte;
    }
    public void setMese___lte(String mese___lte) {
        this.mese___lte = mese___lte;
    }

    public String getMese___gt() {
        return mese___gt;
    }
    public void setMese___gt(String mese___gt) {
        this.mese___gt = mese___gt;
    }

    public String getMese___gte() {
        return mese___gte;
    }
    public void setMese___gte(String mese___gte) {
        this.mese___gte = mese___gte;
    }

    public String getMese___contains() {
        return mese___contains;
    }
    public void setMese___contains(String mese___contains) {
        this.mese___contains = mese___contains;
    }

    public String getMese___not___contains() {
        return mese___not___contains;
    }
    public void setMese___not___contains(String mese___not___contains) {
        this.mese___not___contains = mese___not___contains;
    }

    public String getMese___starts_with() {
        return mese___starts_with;
    }
    public void setMese___starts_with(String mese___starts_with) {
        this.mese___starts_with = mese___starts_with;
    }

    public String getMese___not___starts_with() {
        return mese___not___starts_with;
    }
    public void setMese___not___starts_with(String mese___not___starts_with) {
        this.mese___not___starts_with = mese___not___starts_with;
    }

    public String getMese___ends_with() {
        return mese___ends_with;
    }
    public void setMese___ends_with(String mese___ends_with) {
        this.mese___ends_with = mese___ends_with;
    }

    public String getMese___not___ends_with() {
        return mese___not___ends_with;
    }
    public void setMese___not___ends_with(String mese___not___ends_with) {
        this.mese___not___ends_with = mese___not___ends_with;
    }

    public java.util.List<CliQuestionario_PROFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliQuestionario_PROFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliQuestionario_PROFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliQuestionario_PROFilterDTO> OR) {
        this.OR = OR;
    }

    public CliQuestionario_PROFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliQuestionario_PROFilterDTO NOT) {
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
        if (data_compilazione___eq != null) {
            joiner.add("data_compilazione___eq: " + GraphQLRequestSerializer.getEntry(data_compilazione___eq));
        }
        if (data_compilazione___ne != null) {
            joiner.add("data_compilazione___ne: " + GraphQLRequestSerializer.getEntry(data_compilazione___ne));
        }
        if (data_compilazione___null != null) {
            joiner.add("data_compilazione___null: " + GraphQLRequestSerializer.getEntry(data_compilazione___null));
        }
        if (data_compilazione___not___null != null) {
            joiner.add("data_compilazione___not___null: " + GraphQLRequestSerializer.getEntry(data_compilazione___not___null));
        }
        if (data_compilazione___in != null) {
            joiner.add("data_compilazione___in: " + GraphQLRequestSerializer.getEntry(data_compilazione___in));
        }
        if (data_compilazione___not___in != null) {
            joiner.add("data_compilazione___not___in: " + GraphQLRequestSerializer.getEntry(data_compilazione___not___in));
        }
        if (data_compilazione___lt != null) {
            joiner.add("data_compilazione___lt: " + GraphQLRequestSerializer.getEntry(data_compilazione___lt));
        }
        if (data_compilazione___lte != null) {
            joiner.add("data_compilazione___lte: " + GraphQLRequestSerializer.getEntry(data_compilazione___lte));
        }
        if (data_compilazione___gt != null) {
            joiner.add("data_compilazione___gt: " + GraphQLRequestSerializer.getEntry(data_compilazione___gt));
        }
        if (data_compilazione___gte != null) {
            joiner.add("data_compilazione___gte: " + GraphQLRequestSerializer.getEntry(data_compilazione___gte));
        }
        if (mese___eq != null) {
            joiner.add("mese___eq: " + GraphQLRequestSerializer.getEntry(mese___eq));
        }
        if (mese___ne != null) {
            joiner.add("mese___ne: " + GraphQLRequestSerializer.getEntry(mese___ne));
        }
        if (mese___null != null) {
            joiner.add("mese___null: " + GraphQLRequestSerializer.getEntry(mese___null));
        }
        if (mese___not___null != null) {
            joiner.add("mese___not___null: " + GraphQLRequestSerializer.getEntry(mese___not___null));
        }
        if (mese___in != null) {
            joiner.add("mese___in: " + GraphQLRequestSerializer.getEntry(mese___in));
        }
        if (mese___not___in != null) {
            joiner.add("mese___not___in: " + GraphQLRequestSerializer.getEntry(mese___not___in));
        }
        if (mese___lt != null) {
            joiner.add("mese___lt: " + GraphQLRequestSerializer.getEntry(mese___lt));
        }
        if (mese___lte != null) {
            joiner.add("mese___lte: " + GraphQLRequestSerializer.getEntry(mese___lte));
        }
        if (mese___gt != null) {
            joiner.add("mese___gt: " + GraphQLRequestSerializer.getEntry(mese___gt));
        }
        if (mese___gte != null) {
            joiner.add("mese___gte: " + GraphQLRequestSerializer.getEntry(mese___gte));
        }
        if (mese___contains != null) {
            joiner.add("mese___contains: " + GraphQLRequestSerializer.getEntry(mese___contains));
        }
        if (mese___not___contains != null) {
            joiner.add("mese___not___contains: " + GraphQLRequestSerializer.getEntry(mese___not___contains));
        }
        if (mese___starts_with != null) {
            joiner.add("mese___starts_with: " + GraphQLRequestSerializer.getEntry(mese___starts_with));
        }
        if (mese___not___starts_with != null) {
            joiner.add("mese___not___starts_with: " + GraphQLRequestSerializer.getEntry(mese___not___starts_with));
        }
        if (mese___ends_with != null) {
            joiner.add("mese___ends_with: " + GraphQLRequestSerializer.getEntry(mese___ends_with));
        }
        if (mese___not___ends_with != null) {
            joiner.add("mese___not___ends_with: " + GraphQLRequestSerializer.getEntry(mese___not___ends_with));
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

    public static CliQuestionario_PROFilterDTO.Builder builder() {
        return new CliQuestionario_PROFilterDTO.Builder();
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
        private String data_compilazione___eq;
        private String data_compilazione___ne;
        private Boolean data_compilazione___null;
        private Boolean data_compilazione___not___null;
        private java.util.List<String> data_compilazione___in;
        private java.util.List<String> data_compilazione___not___in;
        private String data_compilazione___lt;
        private String data_compilazione___lte;
        private String data_compilazione___gt;
        private String data_compilazione___gte;
        private String mese___eq;
        private String mese___ne;
        private Boolean mese___null;
        private Boolean mese___not___null;
        private java.util.List<String> mese___in;
        private java.util.List<String> mese___not___in;
        private String mese___lt;
        private String mese___lte;
        private String mese___gt;
        private String mese___gte;
        private String mese___contains;
        private String mese___not___contains;
        private String mese___starts_with;
        private String mese___not___starts_with;
        private String mese___ends_with;
        private String mese___not___ends_with;
        private java.util.List<CliQuestionario_PROFilterDTO> AND;
        private java.util.List<CliQuestionario_PROFilterDTO> OR;
        private CliQuestionario_PROFilterDTO NOT;

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

        public Builder setData_compilazione___eq(String data_compilazione___eq) {
            this.data_compilazione___eq = data_compilazione___eq;
            return this;
        }

        public Builder setData_compilazione___ne(String data_compilazione___ne) {
            this.data_compilazione___ne = data_compilazione___ne;
            return this;
        }

        public Builder setData_compilazione___null(Boolean data_compilazione___null) {
            this.data_compilazione___null = data_compilazione___null;
            return this;
        }

        public Builder setData_compilazione___not___null(Boolean data_compilazione___not___null) {
            this.data_compilazione___not___null = data_compilazione___not___null;
            return this;
        }

        public Builder setData_compilazione___in(java.util.List<String> data_compilazione___in) {
            this.data_compilazione___in = data_compilazione___in;
            return this;
        }

        public Builder setData_compilazione___not___in(java.util.List<String> data_compilazione___not___in) {
            this.data_compilazione___not___in = data_compilazione___not___in;
            return this;
        }

        public Builder setData_compilazione___lt(String data_compilazione___lt) {
            this.data_compilazione___lt = data_compilazione___lt;
            return this;
        }

        public Builder setData_compilazione___lte(String data_compilazione___lte) {
            this.data_compilazione___lte = data_compilazione___lte;
            return this;
        }

        public Builder setData_compilazione___gt(String data_compilazione___gt) {
            this.data_compilazione___gt = data_compilazione___gt;
            return this;
        }

        public Builder setData_compilazione___gte(String data_compilazione___gte) {
            this.data_compilazione___gte = data_compilazione___gte;
            return this;
        }

        public Builder setMese___eq(String mese___eq) {
            this.mese___eq = mese___eq;
            return this;
        }

        public Builder setMese___ne(String mese___ne) {
            this.mese___ne = mese___ne;
            return this;
        }

        public Builder setMese___null(Boolean mese___null) {
            this.mese___null = mese___null;
            return this;
        }

        public Builder setMese___not___null(Boolean mese___not___null) {
            this.mese___not___null = mese___not___null;
            return this;
        }

        public Builder setMese___in(java.util.List<String> mese___in) {
            this.mese___in = mese___in;
            return this;
        }

        public Builder setMese___not___in(java.util.List<String> mese___not___in) {
            this.mese___not___in = mese___not___in;
            return this;
        }

        public Builder setMese___lt(String mese___lt) {
            this.mese___lt = mese___lt;
            return this;
        }

        public Builder setMese___lte(String mese___lte) {
            this.mese___lte = mese___lte;
            return this;
        }

        public Builder setMese___gt(String mese___gt) {
            this.mese___gt = mese___gt;
            return this;
        }

        public Builder setMese___gte(String mese___gte) {
            this.mese___gte = mese___gte;
            return this;
        }

        public Builder setMese___contains(String mese___contains) {
            this.mese___contains = mese___contains;
            return this;
        }

        public Builder setMese___not___contains(String mese___not___contains) {
            this.mese___not___contains = mese___not___contains;
            return this;
        }

        public Builder setMese___starts_with(String mese___starts_with) {
            this.mese___starts_with = mese___starts_with;
            return this;
        }

        public Builder setMese___not___starts_with(String mese___not___starts_with) {
            this.mese___not___starts_with = mese___not___starts_with;
            return this;
        }

        public Builder setMese___ends_with(String mese___ends_with) {
            this.mese___ends_with = mese___ends_with;
            return this;
        }

        public Builder setMese___not___ends_with(String mese___not___ends_with) {
            this.mese___not___ends_with = mese___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliQuestionario_PROFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliQuestionario_PROFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliQuestionario_PROFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliQuestionario_PROFilterDTO build() {
            CliQuestionario_PROFilterDTO result = new CliQuestionario_PROFilterDTO();
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
            result.setData_compilazione___eq(this.data_compilazione___eq);
            result.setData_compilazione___ne(this.data_compilazione___ne);
            result.setData_compilazione___null(this.data_compilazione___null);
            result.setData_compilazione___not___null(this.data_compilazione___not___null);
            result.setData_compilazione___in(this.data_compilazione___in);
            result.setData_compilazione___not___in(this.data_compilazione___not___in);
            result.setData_compilazione___lt(this.data_compilazione___lt);
            result.setData_compilazione___lte(this.data_compilazione___lte);
            result.setData_compilazione___gt(this.data_compilazione___gt);
            result.setData_compilazione___gte(this.data_compilazione___gte);
            result.setMese___eq(this.mese___eq);
            result.setMese___ne(this.mese___ne);
            result.setMese___null(this.mese___null);
            result.setMese___not___null(this.mese___not___null);
            result.setMese___in(this.mese___in);
            result.setMese___not___in(this.mese___not___in);
            result.setMese___lt(this.mese___lt);
            result.setMese___lte(this.mese___lte);
            result.setMese___gt(this.mese___gt);
            result.setMese___gte(this.mese___gte);
            result.setMese___contains(this.mese___contains);
            result.setMese___not___contains(this.mese___not___contains);
            result.setMese___starts_with(this.mese___starts_with);
            result.setMese___not___starts_with(this.mese___not___starts_with);
            result.setMese___ends_with(this.mese___ends_with);
            result.setMese___not___ends_with(this.mese___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
