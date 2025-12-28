package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type ExcelImporter.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliExcelImporterFilterDTO implements java.io.Serializable {

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
    private CliPendingFileReferenceDTO file___eq;
    private CliPendingFileReferenceDTO file___ne;
    private Boolean file___null;
    private Boolean file___not___null;
    private String log___eq;
    private String log___ne;
    private Boolean log___null;
    private Boolean log___not___null;
    private java.util.List<String> log___in;
    private java.util.List<String> log___not___in;
    private String log___lt;
    private String log___lte;
    private String log___gt;
    private String log___gte;
    private String log___contains;
    private String log___not___contains;
    private String log___starts_with;
    private String log___not___starts_with;
    private String log___ends_with;
    private String log___not___ends_with;
    private java.util.List<CliExcelImporterFilterDTO> AND;
    private java.util.List<CliExcelImporterFilterDTO> OR;
    private CliExcelImporterFilterDTO NOT;

    public CliExcelImporterFilterDTO() {
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

    public CliPendingFileReferenceDTO getFile___eq() {
        return file___eq;
    }
    public void setFile___eq(CliPendingFileReferenceDTO file___eq) {
        this.file___eq = file___eq;
    }

    public CliPendingFileReferenceDTO getFile___ne() {
        return file___ne;
    }
    public void setFile___ne(CliPendingFileReferenceDTO file___ne) {
        this.file___ne = file___ne;
    }

    public Boolean getFile___null() {
        return file___null;
    }
    public void setFile___null(Boolean file___null) {
        this.file___null = file___null;
    }

    public Boolean getFile___not___null() {
        return file___not___null;
    }
    public void setFile___not___null(Boolean file___not___null) {
        this.file___not___null = file___not___null;
    }

    public String getLog___eq() {
        return log___eq;
    }
    public void setLog___eq(String log___eq) {
        this.log___eq = log___eq;
    }

    public String getLog___ne() {
        return log___ne;
    }
    public void setLog___ne(String log___ne) {
        this.log___ne = log___ne;
    }

    public Boolean getLog___null() {
        return log___null;
    }
    public void setLog___null(Boolean log___null) {
        this.log___null = log___null;
    }

    public Boolean getLog___not___null() {
        return log___not___null;
    }
    public void setLog___not___null(Boolean log___not___null) {
        this.log___not___null = log___not___null;
    }

    public java.util.List<String> getLog___in() {
        return log___in;
    }
    public void setLog___in(java.util.List<String> log___in) {
        this.log___in = log___in;
    }

    public java.util.List<String> getLog___not___in() {
        return log___not___in;
    }
    public void setLog___not___in(java.util.List<String> log___not___in) {
        this.log___not___in = log___not___in;
    }

    public String getLog___lt() {
        return log___lt;
    }
    public void setLog___lt(String log___lt) {
        this.log___lt = log___lt;
    }

    public String getLog___lte() {
        return log___lte;
    }
    public void setLog___lte(String log___lte) {
        this.log___lte = log___lte;
    }

    public String getLog___gt() {
        return log___gt;
    }
    public void setLog___gt(String log___gt) {
        this.log___gt = log___gt;
    }

    public String getLog___gte() {
        return log___gte;
    }
    public void setLog___gte(String log___gte) {
        this.log___gte = log___gte;
    }

    public String getLog___contains() {
        return log___contains;
    }
    public void setLog___contains(String log___contains) {
        this.log___contains = log___contains;
    }

    public String getLog___not___contains() {
        return log___not___contains;
    }
    public void setLog___not___contains(String log___not___contains) {
        this.log___not___contains = log___not___contains;
    }

    public String getLog___starts_with() {
        return log___starts_with;
    }
    public void setLog___starts_with(String log___starts_with) {
        this.log___starts_with = log___starts_with;
    }

    public String getLog___not___starts_with() {
        return log___not___starts_with;
    }
    public void setLog___not___starts_with(String log___not___starts_with) {
        this.log___not___starts_with = log___not___starts_with;
    }

    public String getLog___ends_with() {
        return log___ends_with;
    }
    public void setLog___ends_with(String log___ends_with) {
        this.log___ends_with = log___ends_with;
    }

    public String getLog___not___ends_with() {
        return log___not___ends_with;
    }
    public void setLog___not___ends_with(String log___not___ends_with) {
        this.log___not___ends_with = log___not___ends_with;
    }

    public java.util.List<CliExcelImporterFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliExcelImporterFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliExcelImporterFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliExcelImporterFilterDTO> OR) {
        this.OR = OR;
    }

    public CliExcelImporterFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliExcelImporterFilterDTO NOT) {
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
        if (file___eq != null) {
            joiner.add("file___eq: " + GraphQLRequestSerializer.getEntry(file___eq));
        }
        if (file___ne != null) {
            joiner.add("file___ne: " + GraphQLRequestSerializer.getEntry(file___ne));
        }
        if (file___null != null) {
            joiner.add("file___null: " + GraphQLRequestSerializer.getEntry(file___null));
        }
        if (file___not___null != null) {
            joiner.add("file___not___null: " + GraphQLRequestSerializer.getEntry(file___not___null));
        }
        if (log___eq != null) {
            joiner.add("log___eq: " + GraphQLRequestSerializer.getEntry(log___eq));
        }
        if (log___ne != null) {
            joiner.add("log___ne: " + GraphQLRequestSerializer.getEntry(log___ne));
        }
        if (log___null != null) {
            joiner.add("log___null: " + GraphQLRequestSerializer.getEntry(log___null));
        }
        if (log___not___null != null) {
            joiner.add("log___not___null: " + GraphQLRequestSerializer.getEntry(log___not___null));
        }
        if (log___in != null) {
            joiner.add("log___in: " + GraphQLRequestSerializer.getEntry(log___in));
        }
        if (log___not___in != null) {
            joiner.add("log___not___in: " + GraphQLRequestSerializer.getEntry(log___not___in));
        }
        if (log___lt != null) {
            joiner.add("log___lt: " + GraphQLRequestSerializer.getEntry(log___lt));
        }
        if (log___lte != null) {
            joiner.add("log___lte: " + GraphQLRequestSerializer.getEntry(log___lte));
        }
        if (log___gt != null) {
            joiner.add("log___gt: " + GraphQLRequestSerializer.getEntry(log___gt));
        }
        if (log___gte != null) {
            joiner.add("log___gte: " + GraphQLRequestSerializer.getEntry(log___gte));
        }
        if (log___contains != null) {
            joiner.add("log___contains: " + GraphQLRequestSerializer.getEntry(log___contains));
        }
        if (log___not___contains != null) {
            joiner.add("log___not___contains: " + GraphQLRequestSerializer.getEntry(log___not___contains));
        }
        if (log___starts_with != null) {
            joiner.add("log___starts_with: " + GraphQLRequestSerializer.getEntry(log___starts_with));
        }
        if (log___not___starts_with != null) {
            joiner.add("log___not___starts_with: " + GraphQLRequestSerializer.getEntry(log___not___starts_with));
        }
        if (log___ends_with != null) {
            joiner.add("log___ends_with: " + GraphQLRequestSerializer.getEntry(log___ends_with));
        }
        if (log___not___ends_with != null) {
            joiner.add("log___not___ends_with: " + GraphQLRequestSerializer.getEntry(log___not___ends_with));
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

    public static CliExcelImporterFilterDTO.Builder builder() {
        return new CliExcelImporterFilterDTO.Builder();
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
        private CliPendingFileReferenceDTO file___eq;
        private CliPendingFileReferenceDTO file___ne;
        private Boolean file___null;
        private Boolean file___not___null;
        private String log___eq;
        private String log___ne;
        private Boolean log___null;
        private Boolean log___not___null;
        private java.util.List<String> log___in;
        private java.util.List<String> log___not___in;
        private String log___lt;
        private String log___lte;
        private String log___gt;
        private String log___gte;
        private String log___contains;
        private String log___not___contains;
        private String log___starts_with;
        private String log___not___starts_with;
        private String log___ends_with;
        private String log___not___ends_with;
        private java.util.List<CliExcelImporterFilterDTO> AND;
        private java.util.List<CliExcelImporterFilterDTO> OR;
        private CliExcelImporterFilterDTO NOT;

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

        public Builder setFile___eq(CliPendingFileReferenceDTO file___eq) {
            this.file___eq = file___eq;
            return this;
        }

        public Builder setFile___ne(CliPendingFileReferenceDTO file___ne) {
            this.file___ne = file___ne;
            return this;
        }

        public Builder setFile___null(Boolean file___null) {
            this.file___null = file___null;
            return this;
        }

        public Builder setFile___not___null(Boolean file___not___null) {
            this.file___not___null = file___not___null;
            return this;
        }

        public Builder setLog___eq(String log___eq) {
            this.log___eq = log___eq;
            return this;
        }

        public Builder setLog___ne(String log___ne) {
            this.log___ne = log___ne;
            return this;
        }

        public Builder setLog___null(Boolean log___null) {
            this.log___null = log___null;
            return this;
        }

        public Builder setLog___not___null(Boolean log___not___null) {
            this.log___not___null = log___not___null;
            return this;
        }

        public Builder setLog___in(java.util.List<String> log___in) {
            this.log___in = log___in;
            return this;
        }

        public Builder setLog___not___in(java.util.List<String> log___not___in) {
            this.log___not___in = log___not___in;
            return this;
        }

        public Builder setLog___lt(String log___lt) {
            this.log___lt = log___lt;
            return this;
        }

        public Builder setLog___lte(String log___lte) {
            this.log___lte = log___lte;
            return this;
        }

        public Builder setLog___gt(String log___gt) {
            this.log___gt = log___gt;
            return this;
        }

        public Builder setLog___gte(String log___gte) {
            this.log___gte = log___gte;
            return this;
        }

        public Builder setLog___contains(String log___contains) {
            this.log___contains = log___contains;
            return this;
        }

        public Builder setLog___not___contains(String log___not___contains) {
            this.log___not___contains = log___not___contains;
            return this;
        }

        public Builder setLog___starts_with(String log___starts_with) {
            this.log___starts_with = log___starts_with;
            return this;
        }

        public Builder setLog___not___starts_with(String log___not___starts_with) {
            this.log___not___starts_with = log___not___starts_with;
            return this;
        }

        public Builder setLog___ends_with(String log___ends_with) {
            this.log___ends_with = log___ends_with;
            return this;
        }

        public Builder setLog___not___ends_with(String log___not___ends_with) {
            this.log___not___ends_with = log___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliExcelImporterFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliExcelImporterFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliExcelImporterFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliExcelImporterFilterDTO build() {
            CliExcelImporterFilterDTO result = new CliExcelImporterFilterDTO();
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
            result.setFile___eq(this.file___eq);
            result.setFile___ne(this.file___ne);
            result.setFile___null(this.file___null);
            result.setFile___not___null(this.file___not___null);
            result.setLog___eq(this.log___eq);
            result.setLog___ne(this.log___ne);
            result.setLog___null(this.log___null);
            result.setLog___not___null(this.log___not___null);
            result.setLog___in(this.log___in);
            result.setLog___not___in(this.log___not___in);
            result.setLog___lt(this.log___lt);
            result.setLog___lte(this.log___lte);
            result.setLog___gt(this.log___gt);
            result.setLog___gte(this.log___gte);
            result.setLog___contains(this.log___contains);
            result.setLog___not___contains(this.log___not___contains);
            result.setLog___starts_with(this.log___starts_with);
            result.setLog___not___starts_with(this.log___not___starts_with);
            result.setLog___ends_with(this.log___ends_with);
            result.setLog___not___ends_with(this.log___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
