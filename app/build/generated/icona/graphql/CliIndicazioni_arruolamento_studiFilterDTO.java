package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Indicazioni_arruolamento_studi.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliIndicazioni_arruolamento_studiFilterDTO implements java.io.Serializable {

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
    private CliPendingFileReferenceDTO documento___eq;
    private CliPendingFileReferenceDTO documento___ne;
    private Boolean documento___null;
    private Boolean documento___not___null;
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
    private java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> AND;
    private java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> OR;
    private CliIndicazioni_arruolamento_studiFilterDTO NOT;

    public CliIndicazioni_arruolamento_studiFilterDTO() {
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

    public CliPendingFileReferenceDTO getDocumento___eq() {
        return documento___eq;
    }
    public void setDocumento___eq(CliPendingFileReferenceDTO documento___eq) {
        this.documento___eq = documento___eq;
    }

    public CliPendingFileReferenceDTO getDocumento___ne() {
        return documento___ne;
    }
    public void setDocumento___ne(CliPendingFileReferenceDTO documento___ne) {
        this.documento___ne = documento___ne;
    }

    public Boolean getDocumento___null() {
        return documento___null;
    }
    public void setDocumento___null(Boolean documento___null) {
        this.documento___null = documento___null;
    }

    public Boolean getDocumento___not___null() {
        return documento___not___null;
    }
    public void setDocumento___not___null(Boolean documento___not___null) {
        this.documento___not___null = documento___not___null;
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

    public java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> OR) {
        this.OR = OR;
    }

    public CliIndicazioni_arruolamento_studiFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliIndicazioni_arruolamento_studiFilterDTO NOT) {
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
        if (documento___eq != null) {
            joiner.add("documento___eq: " + GraphQLRequestSerializer.getEntry(documento___eq));
        }
        if (documento___ne != null) {
            joiner.add("documento___ne: " + GraphQLRequestSerializer.getEntry(documento___ne));
        }
        if (documento___null != null) {
            joiner.add("documento___null: " + GraphQLRequestSerializer.getEntry(documento___null));
        }
        if (documento___not___null != null) {
            joiner.add("documento___not___null: " + GraphQLRequestSerializer.getEntry(documento___not___null));
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

    public static CliIndicazioni_arruolamento_studiFilterDTO.Builder builder() {
        return new CliIndicazioni_arruolamento_studiFilterDTO.Builder();
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
        private CliPendingFileReferenceDTO documento___eq;
        private CliPendingFileReferenceDTO documento___ne;
        private Boolean documento___null;
        private Boolean documento___not___null;
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
        private java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> AND;
        private java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> OR;
        private CliIndicazioni_arruolamento_studiFilterDTO NOT;

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

        public Builder setDocumento___eq(CliPendingFileReferenceDTO documento___eq) {
            this.documento___eq = documento___eq;
            return this;
        }

        public Builder setDocumento___ne(CliPendingFileReferenceDTO documento___ne) {
            this.documento___ne = documento___ne;
            return this;
        }

        public Builder setDocumento___null(Boolean documento___null) {
            this.documento___null = documento___null;
            return this;
        }

        public Builder setDocumento___not___null(Boolean documento___not___null) {
            this.documento___not___null = documento___not___null;
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

        public Builder setAND(java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliIndicazioni_arruolamento_studiFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliIndicazioni_arruolamento_studiFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliIndicazioni_arruolamento_studiFilterDTO build() {
            CliIndicazioni_arruolamento_studiFilterDTO result = new CliIndicazioni_arruolamento_studiFilterDTO();
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
            result.setDocumento___eq(this.documento___eq);
            result.setDocumento___ne(this.documento___ne);
            result.setDocumento___null(this.documento___null);
            result.setDocumento___not___null(this.documento___not___null);
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
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
