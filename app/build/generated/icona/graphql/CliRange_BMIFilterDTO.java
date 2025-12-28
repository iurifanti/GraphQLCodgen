package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Range_BMI.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRange_BMIFilterDTO implements java.io.Serializable {

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
    private String colore___eq;
    private String colore___ne;
    private Boolean colore___null;
    private Boolean colore___not___null;
    private java.util.List<String> colore___in;
    private java.util.List<String> colore___not___in;
    private String colore___lt;
    private String colore___lte;
    private String colore___gt;
    private String colore___gte;
    private String colore___contains;
    private String colore___not___contains;
    private String colore___starts_with;
    private String colore___not___starts_with;
    private String colore___ends_with;
    private String colore___not___ends_with;
    private String messaggio___eq;
    private String messaggio___ne;
    private Boolean messaggio___null;
    private Boolean messaggio___not___null;
    private java.util.List<String> messaggio___in;
    private java.util.List<String> messaggio___not___in;
    private String messaggio___lt;
    private String messaggio___lte;
    private String messaggio___gt;
    private String messaggio___gte;
    private String messaggio___contains;
    private String messaggio___not___contains;
    private String messaggio___starts_with;
    private String messaggio___not___starts_with;
    private String messaggio___ends_with;
    private String messaggio___not___ends_with;
    private String min___eq;
    private String min___ne;
    private Boolean min___null;
    private Boolean min___not___null;
    private java.util.List<String> min___in;
    private java.util.List<String> min___not___in;
    private String min___lt;
    private String min___lte;
    private String min___gt;
    private String min___gte;
    private java.util.List<CliRange_BMIFilterDTO> AND;
    private java.util.List<CliRange_BMIFilterDTO> OR;
    private CliRange_BMIFilterDTO NOT;

    public CliRange_BMIFilterDTO() {
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

    public String getColore___eq() {
        return colore___eq;
    }
    public void setColore___eq(String colore___eq) {
        this.colore___eq = colore___eq;
    }

    public String getColore___ne() {
        return colore___ne;
    }
    public void setColore___ne(String colore___ne) {
        this.colore___ne = colore___ne;
    }

    public Boolean getColore___null() {
        return colore___null;
    }
    public void setColore___null(Boolean colore___null) {
        this.colore___null = colore___null;
    }

    public Boolean getColore___not___null() {
        return colore___not___null;
    }
    public void setColore___not___null(Boolean colore___not___null) {
        this.colore___not___null = colore___not___null;
    }

    public java.util.List<String> getColore___in() {
        return colore___in;
    }
    public void setColore___in(java.util.List<String> colore___in) {
        this.colore___in = colore___in;
    }

    public java.util.List<String> getColore___not___in() {
        return colore___not___in;
    }
    public void setColore___not___in(java.util.List<String> colore___not___in) {
        this.colore___not___in = colore___not___in;
    }

    public String getColore___lt() {
        return colore___lt;
    }
    public void setColore___lt(String colore___lt) {
        this.colore___lt = colore___lt;
    }

    public String getColore___lte() {
        return colore___lte;
    }
    public void setColore___lte(String colore___lte) {
        this.colore___lte = colore___lte;
    }

    public String getColore___gt() {
        return colore___gt;
    }
    public void setColore___gt(String colore___gt) {
        this.colore___gt = colore___gt;
    }

    public String getColore___gte() {
        return colore___gte;
    }
    public void setColore___gte(String colore___gte) {
        this.colore___gte = colore___gte;
    }

    public String getColore___contains() {
        return colore___contains;
    }
    public void setColore___contains(String colore___contains) {
        this.colore___contains = colore___contains;
    }

    public String getColore___not___contains() {
        return colore___not___contains;
    }
    public void setColore___not___contains(String colore___not___contains) {
        this.colore___not___contains = colore___not___contains;
    }

    public String getColore___starts_with() {
        return colore___starts_with;
    }
    public void setColore___starts_with(String colore___starts_with) {
        this.colore___starts_with = colore___starts_with;
    }

    public String getColore___not___starts_with() {
        return colore___not___starts_with;
    }
    public void setColore___not___starts_with(String colore___not___starts_with) {
        this.colore___not___starts_with = colore___not___starts_with;
    }

    public String getColore___ends_with() {
        return colore___ends_with;
    }
    public void setColore___ends_with(String colore___ends_with) {
        this.colore___ends_with = colore___ends_with;
    }

    public String getColore___not___ends_with() {
        return colore___not___ends_with;
    }
    public void setColore___not___ends_with(String colore___not___ends_with) {
        this.colore___not___ends_with = colore___not___ends_with;
    }

    public String getMessaggio___eq() {
        return messaggio___eq;
    }
    public void setMessaggio___eq(String messaggio___eq) {
        this.messaggio___eq = messaggio___eq;
    }

    public String getMessaggio___ne() {
        return messaggio___ne;
    }
    public void setMessaggio___ne(String messaggio___ne) {
        this.messaggio___ne = messaggio___ne;
    }

    public Boolean getMessaggio___null() {
        return messaggio___null;
    }
    public void setMessaggio___null(Boolean messaggio___null) {
        this.messaggio___null = messaggio___null;
    }

    public Boolean getMessaggio___not___null() {
        return messaggio___not___null;
    }
    public void setMessaggio___not___null(Boolean messaggio___not___null) {
        this.messaggio___not___null = messaggio___not___null;
    }

    public java.util.List<String> getMessaggio___in() {
        return messaggio___in;
    }
    public void setMessaggio___in(java.util.List<String> messaggio___in) {
        this.messaggio___in = messaggio___in;
    }

    public java.util.List<String> getMessaggio___not___in() {
        return messaggio___not___in;
    }
    public void setMessaggio___not___in(java.util.List<String> messaggio___not___in) {
        this.messaggio___not___in = messaggio___not___in;
    }

    public String getMessaggio___lt() {
        return messaggio___lt;
    }
    public void setMessaggio___lt(String messaggio___lt) {
        this.messaggio___lt = messaggio___lt;
    }

    public String getMessaggio___lte() {
        return messaggio___lte;
    }
    public void setMessaggio___lte(String messaggio___lte) {
        this.messaggio___lte = messaggio___lte;
    }

    public String getMessaggio___gt() {
        return messaggio___gt;
    }
    public void setMessaggio___gt(String messaggio___gt) {
        this.messaggio___gt = messaggio___gt;
    }

    public String getMessaggio___gte() {
        return messaggio___gte;
    }
    public void setMessaggio___gte(String messaggio___gte) {
        this.messaggio___gte = messaggio___gte;
    }

    public String getMessaggio___contains() {
        return messaggio___contains;
    }
    public void setMessaggio___contains(String messaggio___contains) {
        this.messaggio___contains = messaggio___contains;
    }

    public String getMessaggio___not___contains() {
        return messaggio___not___contains;
    }
    public void setMessaggio___not___contains(String messaggio___not___contains) {
        this.messaggio___not___contains = messaggio___not___contains;
    }

    public String getMessaggio___starts_with() {
        return messaggio___starts_with;
    }
    public void setMessaggio___starts_with(String messaggio___starts_with) {
        this.messaggio___starts_with = messaggio___starts_with;
    }

    public String getMessaggio___not___starts_with() {
        return messaggio___not___starts_with;
    }
    public void setMessaggio___not___starts_with(String messaggio___not___starts_with) {
        this.messaggio___not___starts_with = messaggio___not___starts_with;
    }

    public String getMessaggio___ends_with() {
        return messaggio___ends_with;
    }
    public void setMessaggio___ends_with(String messaggio___ends_with) {
        this.messaggio___ends_with = messaggio___ends_with;
    }

    public String getMessaggio___not___ends_with() {
        return messaggio___not___ends_with;
    }
    public void setMessaggio___not___ends_with(String messaggio___not___ends_with) {
        this.messaggio___not___ends_with = messaggio___not___ends_with;
    }

    public String getMin___eq() {
        return min___eq;
    }
    public void setMin___eq(String min___eq) {
        this.min___eq = min___eq;
    }

    public String getMin___ne() {
        return min___ne;
    }
    public void setMin___ne(String min___ne) {
        this.min___ne = min___ne;
    }

    public Boolean getMin___null() {
        return min___null;
    }
    public void setMin___null(Boolean min___null) {
        this.min___null = min___null;
    }

    public Boolean getMin___not___null() {
        return min___not___null;
    }
    public void setMin___not___null(Boolean min___not___null) {
        this.min___not___null = min___not___null;
    }

    public java.util.List<String> getMin___in() {
        return min___in;
    }
    public void setMin___in(java.util.List<String> min___in) {
        this.min___in = min___in;
    }

    public java.util.List<String> getMin___not___in() {
        return min___not___in;
    }
    public void setMin___not___in(java.util.List<String> min___not___in) {
        this.min___not___in = min___not___in;
    }

    public String getMin___lt() {
        return min___lt;
    }
    public void setMin___lt(String min___lt) {
        this.min___lt = min___lt;
    }

    public String getMin___lte() {
        return min___lte;
    }
    public void setMin___lte(String min___lte) {
        this.min___lte = min___lte;
    }

    public String getMin___gt() {
        return min___gt;
    }
    public void setMin___gt(String min___gt) {
        this.min___gt = min___gt;
    }

    public String getMin___gte() {
        return min___gte;
    }
    public void setMin___gte(String min___gte) {
        this.min___gte = min___gte;
    }

    public java.util.List<CliRange_BMIFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliRange_BMIFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliRange_BMIFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliRange_BMIFilterDTO> OR) {
        this.OR = OR;
    }

    public CliRange_BMIFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliRange_BMIFilterDTO NOT) {
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
        if (colore___eq != null) {
            joiner.add("colore___eq: " + GraphQLRequestSerializer.getEntry(colore___eq));
        }
        if (colore___ne != null) {
            joiner.add("colore___ne: " + GraphQLRequestSerializer.getEntry(colore___ne));
        }
        if (colore___null != null) {
            joiner.add("colore___null: " + GraphQLRequestSerializer.getEntry(colore___null));
        }
        if (colore___not___null != null) {
            joiner.add("colore___not___null: " + GraphQLRequestSerializer.getEntry(colore___not___null));
        }
        if (colore___in != null) {
            joiner.add("colore___in: " + GraphQLRequestSerializer.getEntry(colore___in));
        }
        if (colore___not___in != null) {
            joiner.add("colore___not___in: " + GraphQLRequestSerializer.getEntry(colore___not___in));
        }
        if (colore___lt != null) {
            joiner.add("colore___lt: " + GraphQLRequestSerializer.getEntry(colore___lt));
        }
        if (colore___lte != null) {
            joiner.add("colore___lte: " + GraphQLRequestSerializer.getEntry(colore___lte));
        }
        if (colore___gt != null) {
            joiner.add("colore___gt: " + GraphQLRequestSerializer.getEntry(colore___gt));
        }
        if (colore___gte != null) {
            joiner.add("colore___gte: " + GraphQLRequestSerializer.getEntry(colore___gte));
        }
        if (colore___contains != null) {
            joiner.add("colore___contains: " + GraphQLRequestSerializer.getEntry(colore___contains));
        }
        if (colore___not___contains != null) {
            joiner.add("colore___not___contains: " + GraphQLRequestSerializer.getEntry(colore___not___contains));
        }
        if (colore___starts_with != null) {
            joiner.add("colore___starts_with: " + GraphQLRequestSerializer.getEntry(colore___starts_with));
        }
        if (colore___not___starts_with != null) {
            joiner.add("colore___not___starts_with: " + GraphQLRequestSerializer.getEntry(colore___not___starts_with));
        }
        if (colore___ends_with != null) {
            joiner.add("colore___ends_with: " + GraphQLRequestSerializer.getEntry(colore___ends_with));
        }
        if (colore___not___ends_with != null) {
            joiner.add("colore___not___ends_with: " + GraphQLRequestSerializer.getEntry(colore___not___ends_with));
        }
        if (messaggio___eq != null) {
            joiner.add("messaggio___eq: " + GraphQLRequestSerializer.getEntry(messaggio___eq));
        }
        if (messaggio___ne != null) {
            joiner.add("messaggio___ne: " + GraphQLRequestSerializer.getEntry(messaggio___ne));
        }
        if (messaggio___null != null) {
            joiner.add("messaggio___null: " + GraphQLRequestSerializer.getEntry(messaggio___null));
        }
        if (messaggio___not___null != null) {
            joiner.add("messaggio___not___null: " + GraphQLRequestSerializer.getEntry(messaggio___not___null));
        }
        if (messaggio___in != null) {
            joiner.add("messaggio___in: " + GraphQLRequestSerializer.getEntry(messaggio___in));
        }
        if (messaggio___not___in != null) {
            joiner.add("messaggio___not___in: " + GraphQLRequestSerializer.getEntry(messaggio___not___in));
        }
        if (messaggio___lt != null) {
            joiner.add("messaggio___lt: " + GraphQLRequestSerializer.getEntry(messaggio___lt));
        }
        if (messaggio___lte != null) {
            joiner.add("messaggio___lte: " + GraphQLRequestSerializer.getEntry(messaggio___lte));
        }
        if (messaggio___gt != null) {
            joiner.add("messaggio___gt: " + GraphQLRequestSerializer.getEntry(messaggio___gt));
        }
        if (messaggio___gte != null) {
            joiner.add("messaggio___gte: " + GraphQLRequestSerializer.getEntry(messaggio___gte));
        }
        if (messaggio___contains != null) {
            joiner.add("messaggio___contains: " + GraphQLRequestSerializer.getEntry(messaggio___contains));
        }
        if (messaggio___not___contains != null) {
            joiner.add("messaggio___not___contains: " + GraphQLRequestSerializer.getEntry(messaggio___not___contains));
        }
        if (messaggio___starts_with != null) {
            joiner.add("messaggio___starts_with: " + GraphQLRequestSerializer.getEntry(messaggio___starts_with));
        }
        if (messaggio___not___starts_with != null) {
            joiner.add("messaggio___not___starts_with: " + GraphQLRequestSerializer.getEntry(messaggio___not___starts_with));
        }
        if (messaggio___ends_with != null) {
            joiner.add("messaggio___ends_with: " + GraphQLRequestSerializer.getEntry(messaggio___ends_with));
        }
        if (messaggio___not___ends_with != null) {
            joiner.add("messaggio___not___ends_with: " + GraphQLRequestSerializer.getEntry(messaggio___not___ends_with));
        }
        if (min___eq != null) {
            joiner.add("min___eq: " + GraphQLRequestSerializer.getEntry(min___eq));
        }
        if (min___ne != null) {
            joiner.add("min___ne: " + GraphQLRequestSerializer.getEntry(min___ne));
        }
        if (min___null != null) {
            joiner.add("min___null: " + GraphQLRequestSerializer.getEntry(min___null));
        }
        if (min___not___null != null) {
            joiner.add("min___not___null: " + GraphQLRequestSerializer.getEntry(min___not___null));
        }
        if (min___in != null) {
            joiner.add("min___in: " + GraphQLRequestSerializer.getEntry(min___in));
        }
        if (min___not___in != null) {
            joiner.add("min___not___in: " + GraphQLRequestSerializer.getEntry(min___not___in));
        }
        if (min___lt != null) {
            joiner.add("min___lt: " + GraphQLRequestSerializer.getEntry(min___lt));
        }
        if (min___lte != null) {
            joiner.add("min___lte: " + GraphQLRequestSerializer.getEntry(min___lte));
        }
        if (min___gt != null) {
            joiner.add("min___gt: " + GraphQLRequestSerializer.getEntry(min___gt));
        }
        if (min___gte != null) {
            joiner.add("min___gte: " + GraphQLRequestSerializer.getEntry(min___gte));
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

    public static CliRange_BMIFilterDTO.Builder builder() {
        return new CliRange_BMIFilterDTO.Builder();
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
        private String colore___eq;
        private String colore___ne;
        private Boolean colore___null;
        private Boolean colore___not___null;
        private java.util.List<String> colore___in;
        private java.util.List<String> colore___not___in;
        private String colore___lt;
        private String colore___lte;
        private String colore___gt;
        private String colore___gte;
        private String colore___contains;
        private String colore___not___contains;
        private String colore___starts_with;
        private String colore___not___starts_with;
        private String colore___ends_with;
        private String colore___not___ends_with;
        private String messaggio___eq;
        private String messaggio___ne;
        private Boolean messaggio___null;
        private Boolean messaggio___not___null;
        private java.util.List<String> messaggio___in;
        private java.util.List<String> messaggio___not___in;
        private String messaggio___lt;
        private String messaggio___lte;
        private String messaggio___gt;
        private String messaggio___gte;
        private String messaggio___contains;
        private String messaggio___not___contains;
        private String messaggio___starts_with;
        private String messaggio___not___starts_with;
        private String messaggio___ends_with;
        private String messaggio___not___ends_with;
        private String min___eq;
        private String min___ne;
        private Boolean min___null;
        private Boolean min___not___null;
        private java.util.List<String> min___in;
        private java.util.List<String> min___not___in;
        private String min___lt;
        private String min___lte;
        private String min___gt;
        private String min___gte;
        private java.util.List<CliRange_BMIFilterDTO> AND;
        private java.util.List<CliRange_BMIFilterDTO> OR;
        private CliRange_BMIFilterDTO NOT;

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

        public Builder setColore___eq(String colore___eq) {
            this.colore___eq = colore___eq;
            return this;
        }

        public Builder setColore___ne(String colore___ne) {
            this.colore___ne = colore___ne;
            return this;
        }

        public Builder setColore___null(Boolean colore___null) {
            this.colore___null = colore___null;
            return this;
        }

        public Builder setColore___not___null(Boolean colore___not___null) {
            this.colore___not___null = colore___not___null;
            return this;
        }

        public Builder setColore___in(java.util.List<String> colore___in) {
            this.colore___in = colore___in;
            return this;
        }

        public Builder setColore___not___in(java.util.List<String> colore___not___in) {
            this.colore___not___in = colore___not___in;
            return this;
        }

        public Builder setColore___lt(String colore___lt) {
            this.colore___lt = colore___lt;
            return this;
        }

        public Builder setColore___lte(String colore___lte) {
            this.colore___lte = colore___lte;
            return this;
        }

        public Builder setColore___gt(String colore___gt) {
            this.colore___gt = colore___gt;
            return this;
        }

        public Builder setColore___gte(String colore___gte) {
            this.colore___gte = colore___gte;
            return this;
        }

        public Builder setColore___contains(String colore___contains) {
            this.colore___contains = colore___contains;
            return this;
        }

        public Builder setColore___not___contains(String colore___not___contains) {
            this.colore___not___contains = colore___not___contains;
            return this;
        }

        public Builder setColore___starts_with(String colore___starts_with) {
            this.colore___starts_with = colore___starts_with;
            return this;
        }

        public Builder setColore___not___starts_with(String colore___not___starts_with) {
            this.colore___not___starts_with = colore___not___starts_with;
            return this;
        }

        public Builder setColore___ends_with(String colore___ends_with) {
            this.colore___ends_with = colore___ends_with;
            return this;
        }

        public Builder setColore___not___ends_with(String colore___not___ends_with) {
            this.colore___not___ends_with = colore___not___ends_with;
            return this;
        }

        public Builder setMessaggio___eq(String messaggio___eq) {
            this.messaggio___eq = messaggio___eq;
            return this;
        }

        public Builder setMessaggio___ne(String messaggio___ne) {
            this.messaggio___ne = messaggio___ne;
            return this;
        }

        public Builder setMessaggio___null(Boolean messaggio___null) {
            this.messaggio___null = messaggio___null;
            return this;
        }

        public Builder setMessaggio___not___null(Boolean messaggio___not___null) {
            this.messaggio___not___null = messaggio___not___null;
            return this;
        }

        public Builder setMessaggio___in(java.util.List<String> messaggio___in) {
            this.messaggio___in = messaggio___in;
            return this;
        }

        public Builder setMessaggio___not___in(java.util.List<String> messaggio___not___in) {
            this.messaggio___not___in = messaggio___not___in;
            return this;
        }

        public Builder setMessaggio___lt(String messaggio___lt) {
            this.messaggio___lt = messaggio___lt;
            return this;
        }

        public Builder setMessaggio___lte(String messaggio___lte) {
            this.messaggio___lte = messaggio___lte;
            return this;
        }

        public Builder setMessaggio___gt(String messaggio___gt) {
            this.messaggio___gt = messaggio___gt;
            return this;
        }

        public Builder setMessaggio___gte(String messaggio___gte) {
            this.messaggio___gte = messaggio___gte;
            return this;
        }

        public Builder setMessaggio___contains(String messaggio___contains) {
            this.messaggio___contains = messaggio___contains;
            return this;
        }

        public Builder setMessaggio___not___contains(String messaggio___not___contains) {
            this.messaggio___not___contains = messaggio___not___contains;
            return this;
        }

        public Builder setMessaggio___starts_with(String messaggio___starts_with) {
            this.messaggio___starts_with = messaggio___starts_with;
            return this;
        }

        public Builder setMessaggio___not___starts_with(String messaggio___not___starts_with) {
            this.messaggio___not___starts_with = messaggio___not___starts_with;
            return this;
        }

        public Builder setMessaggio___ends_with(String messaggio___ends_with) {
            this.messaggio___ends_with = messaggio___ends_with;
            return this;
        }

        public Builder setMessaggio___not___ends_with(String messaggio___not___ends_with) {
            this.messaggio___not___ends_with = messaggio___not___ends_with;
            return this;
        }

        public Builder setMin___eq(String min___eq) {
            this.min___eq = min___eq;
            return this;
        }

        public Builder setMin___ne(String min___ne) {
            this.min___ne = min___ne;
            return this;
        }

        public Builder setMin___null(Boolean min___null) {
            this.min___null = min___null;
            return this;
        }

        public Builder setMin___not___null(Boolean min___not___null) {
            this.min___not___null = min___not___null;
            return this;
        }

        public Builder setMin___in(java.util.List<String> min___in) {
            this.min___in = min___in;
            return this;
        }

        public Builder setMin___not___in(java.util.List<String> min___not___in) {
            this.min___not___in = min___not___in;
            return this;
        }

        public Builder setMin___lt(String min___lt) {
            this.min___lt = min___lt;
            return this;
        }

        public Builder setMin___lte(String min___lte) {
            this.min___lte = min___lte;
            return this;
        }

        public Builder setMin___gt(String min___gt) {
            this.min___gt = min___gt;
            return this;
        }

        public Builder setMin___gte(String min___gte) {
            this.min___gte = min___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliRange_BMIFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliRange_BMIFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliRange_BMIFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliRange_BMIFilterDTO build() {
            CliRange_BMIFilterDTO result = new CliRange_BMIFilterDTO();
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
            result.setColore___eq(this.colore___eq);
            result.setColore___ne(this.colore___ne);
            result.setColore___null(this.colore___null);
            result.setColore___not___null(this.colore___not___null);
            result.setColore___in(this.colore___in);
            result.setColore___not___in(this.colore___not___in);
            result.setColore___lt(this.colore___lt);
            result.setColore___lte(this.colore___lte);
            result.setColore___gt(this.colore___gt);
            result.setColore___gte(this.colore___gte);
            result.setColore___contains(this.colore___contains);
            result.setColore___not___contains(this.colore___not___contains);
            result.setColore___starts_with(this.colore___starts_with);
            result.setColore___not___starts_with(this.colore___not___starts_with);
            result.setColore___ends_with(this.colore___ends_with);
            result.setColore___not___ends_with(this.colore___not___ends_with);
            result.setMessaggio___eq(this.messaggio___eq);
            result.setMessaggio___ne(this.messaggio___ne);
            result.setMessaggio___null(this.messaggio___null);
            result.setMessaggio___not___null(this.messaggio___not___null);
            result.setMessaggio___in(this.messaggio___in);
            result.setMessaggio___not___in(this.messaggio___not___in);
            result.setMessaggio___lt(this.messaggio___lt);
            result.setMessaggio___lte(this.messaggio___lte);
            result.setMessaggio___gt(this.messaggio___gt);
            result.setMessaggio___gte(this.messaggio___gte);
            result.setMessaggio___contains(this.messaggio___contains);
            result.setMessaggio___not___contains(this.messaggio___not___contains);
            result.setMessaggio___starts_with(this.messaggio___starts_with);
            result.setMessaggio___not___starts_with(this.messaggio___not___starts_with);
            result.setMessaggio___ends_with(this.messaggio___ends_with);
            result.setMessaggio___not___ends_with(this.messaggio___not___ends_with);
            result.setMin___eq(this.min___eq);
            result.setMin___ne(this.min___ne);
            result.setMin___null(this.min___null);
            result.setMin___not___null(this.min___not___null);
            result.setMin___in(this.min___in);
            result.setMin___not___in(this.min___not___in);
            result.setMin___lt(this.min___lt);
            result.setMin___lte(this.min___lte);
            result.setMin___gt(this.min___gt);
            result.setMin___gte(this.min___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
