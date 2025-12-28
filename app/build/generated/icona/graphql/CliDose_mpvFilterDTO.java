package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Dose_mpv.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDose_mpvFilterDTO implements java.io.Serializable {

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
    private String ciclo___eq;
    private String ciclo___ne;
    private Boolean ciclo___null;
    private Boolean ciclo___not___null;
    private java.util.List<String> ciclo___in;
    private java.util.List<String> ciclo___not___in;
    private String ciclo___lt;
    private String ciclo___lte;
    private String ciclo___gt;
    private String ciclo___gte;
    private String ciclo___contains;
    private String ciclo___not___contains;
    private String ciclo___starts_with;
    private String ciclo___not___starts_with;
    private String ciclo___ends_with;
    private String ciclo___not___ends_with;
    private String modalita_somministrazione___eq;
    private String modalita_somministrazione___ne;
    private Boolean modalita_somministrazione___null;
    private Boolean modalita_somministrazione___not___null;
    private java.util.List<String> modalita_somministrazione___in;
    private java.util.List<String> modalita_somministrazione___not___in;
    private String modalita_somministrazione___lt;
    private String modalita_somministrazione___lte;
    private String modalita_somministrazione___gt;
    private String modalita_somministrazione___gte;
    private String modalita_somministrazione___contains;
    private String modalita_somministrazione___not___contains;
    private String modalita_somministrazione___starts_with;
    private String modalita_somministrazione___not___starts_with;
    private String modalita_somministrazione___ends_with;
    private String modalita_somministrazione___not___ends_with;
    private Integer numero_dose___eq;
    private Integer numero_dose___ne;
    private Boolean numero_dose___null;
    private Boolean numero_dose___not___null;
    private java.util.List<Integer> numero_dose___in;
    private java.util.List<Integer> numero_dose___not___in;
    private Integer numero_dose___lt;
    private Integer numero_dose___lte;
    private Integer numero_dose___gt;
    private Integer numero_dose___gte;
    private java.util.List<CliDose_mpvFilterDTO> AND;
    private java.util.List<CliDose_mpvFilterDTO> OR;
    private CliDose_mpvFilterDTO NOT;

    public CliDose_mpvFilterDTO() {
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

    public String getCiclo___eq() {
        return ciclo___eq;
    }
    public void setCiclo___eq(String ciclo___eq) {
        this.ciclo___eq = ciclo___eq;
    }

    public String getCiclo___ne() {
        return ciclo___ne;
    }
    public void setCiclo___ne(String ciclo___ne) {
        this.ciclo___ne = ciclo___ne;
    }

    public Boolean getCiclo___null() {
        return ciclo___null;
    }
    public void setCiclo___null(Boolean ciclo___null) {
        this.ciclo___null = ciclo___null;
    }

    public Boolean getCiclo___not___null() {
        return ciclo___not___null;
    }
    public void setCiclo___not___null(Boolean ciclo___not___null) {
        this.ciclo___not___null = ciclo___not___null;
    }

    public java.util.List<String> getCiclo___in() {
        return ciclo___in;
    }
    public void setCiclo___in(java.util.List<String> ciclo___in) {
        this.ciclo___in = ciclo___in;
    }

    public java.util.List<String> getCiclo___not___in() {
        return ciclo___not___in;
    }
    public void setCiclo___not___in(java.util.List<String> ciclo___not___in) {
        this.ciclo___not___in = ciclo___not___in;
    }

    public String getCiclo___lt() {
        return ciclo___lt;
    }
    public void setCiclo___lt(String ciclo___lt) {
        this.ciclo___lt = ciclo___lt;
    }

    public String getCiclo___lte() {
        return ciclo___lte;
    }
    public void setCiclo___lte(String ciclo___lte) {
        this.ciclo___lte = ciclo___lte;
    }

    public String getCiclo___gt() {
        return ciclo___gt;
    }
    public void setCiclo___gt(String ciclo___gt) {
        this.ciclo___gt = ciclo___gt;
    }

    public String getCiclo___gte() {
        return ciclo___gte;
    }
    public void setCiclo___gte(String ciclo___gte) {
        this.ciclo___gte = ciclo___gte;
    }

    public String getCiclo___contains() {
        return ciclo___contains;
    }
    public void setCiclo___contains(String ciclo___contains) {
        this.ciclo___contains = ciclo___contains;
    }

    public String getCiclo___not___contains() {
        return ciclo___not___contains;
    }
    public void setCiclo___not___contains(String ciclo___not___contains) {
        this.ciclo___not___contains = ciclo___not___contains;
    }

    public String getCiclo___starts_with() {
        return ciclo___starts_with;
    }
    public void setCiclo___starts_with(String ciclo___starts_with) {
        this.ciclo___starts_with = ciclo___starts_with;
    }

    public String getCiclo___not___starts_with() {
        return ciclo___not___starts_with;
    }
    public void setCiclo___not___starts_with(String ciclo___not___starts_with) {
        this.ciclo___not___starts_with = ciclo___not___starts_with;
    }

    public String getCiclo___ends_with() {
        return ciclo___ends_with;
    }
    public void setCiclo___ends_with(String ciclo___ends_with) {
        this.ciclo___ends_with = ciclo___ends_with;
    }

    public String getCiclo___not___ends_with() {
        return ciclo___not___ends_with;
    }
    public void setCiclo___not___ends_with(String ciclo___not___ends_with) {
        this.ciclo___not___ends_with = ciclo___not___ends_with;
    }

    public String getModalita_somministrazione___eq() {
        return modalita_somministrazione___eq;
    }
    public void setModalita_somministrazione___eq(String modalita_somministrazione___eq) {
        this.modalita_somministrazione___eq = modalita_somministrazione___eq;
    }

    public String getModalita_somministrazione___ne() {
        return modalita_somministrazione___ne;
    }
    public void setModalita_somministrazione___ne(String modalita_somministrazione___ne) {
        this.modalita_somministrazione___ne = modalita_somministrazione___ne;
    }

    public Boolean getModalita_somministrazione___null() {
        return modalita_somministrazione___null;
    }
    public void setModalita_somministrazione___null(Boolean modalita_somministrazione___null) {
        this.modalita_somministrazione___null = modalita_somministrazione___null;
    }

    public Boolean getModalita_somministrazione___not___null() {
        return modalita_somministrazione___not___null;
    }
    public void setModalita_somministrazione___not___null(Boolean modalita_somministrazione___not___null) {
        this.modalita_somministrazione___not___null = modalita_somministrazione___not___null;
    }

    public java.util.List<String> getModalita_somministrazione___in() {
        return modalita_somministrazione___in;
    }
    public void setModalita_somministrazione___in(java.util.List<String> modalita_somministrazione___in) {
        this.modalita_somministrazione___in = modalita_somministrazione___in;
    }

    public java.util.List<String> getModalita_somministrazione___not___in() {
        return modalita_somministrazione___not___in;
    }
    public void setModalita_somministrazione___not___in(java.util.List<String> modalita_somministrazione___not___in) {
        this.modalita_somministrazione___not___in = modalita_somministrazione___not___in;
    }

    public String getModalita_somministrazione___lt() {
        return modalita_somministrazione___lt;
    }
    public void setModalita_somministrazione___lt(String modalita_somministrazione___lt) {
        this.modalita_somministrazione___lt = modalita_somministrazione___lt;
    }

    public String getModalita_somministrazione___lte() {
        return modalita_somministrazione___lte;
    }
    public void setModalita_somministrazione___lte(String modalita_somministrazione___lte) {
        this.modalita_somministrazione___lte = modalita_somministrazione___lte;
    }

    public String getModalita_somministrazione___gt() {
        return modalita_somministrazione___gt;
    }
    public void setModalita_somministrazione___gt(String modalita_somministrazione___gt) {
        this.modalita_somministrazione___gt = modalita_somministrazione___gt;
    }

    public String getModalita_somministrazione___gte() {
        return modalita_somministrazione___gte;
    }
    public void setModalita_somministrazione___gte(String modalita_somministrazione___gte) {
        this.modalita_somministrazione___gte = modalita_somministrazione___gte;
    }

    public String getModalita_somministrazione___contains() {
        return modalita_somministrazione___contains;
    }
    public void setModalita_somministrazione___contains(String modalita_somministrazione___contains) {
        this.modalita_somministrazione___contains = modalita_somministrazione___contains;
    }

    public String getModalita_somministrazione___not___contains() {
        return modalita_somministrazione___not___contains;
    }
    public void setModalita_somministrazione___not___contains(String modalita_somministrazione___not___contains) {
        this.modalita_somministrazione___not___contains = modalita_somministrazione___not___contains;
    }

    public String getModalita_somministrazione___starts_with() {
        return modalita_somministrazione___starts_with;
    }
    public void setModalita_somministrazione___starts_with(String modalita_somministrazione___starts_with) {
        this.modalita_somministrazione___starts_with = modalita_somministrazione___starts_with;
    }

    public String getModalita_somministrazione___not___starts_with() {
        return modalita_somministrazione___not___starts_with;
    }
    public void setModalita_somministrazione___not___starts_with(String modalita_somministrazione___not___starts_with) {
        this.modalita_somministrazione___not___starts_with = modalita_somministrazione___not___starts_with;
    }

    public String getModalita_somministrazione___ends_with() {
        return modalita_somministrazione___ends_with;
    }
    public void setModalita_somministrazione___ends_with(String modalita_somministrazione___ends_with) {
        this.modalita_somministrazione___ends_with = modalita_somministrazione___ends_with;
    }

    public String getModalita_somministrazione___not___ends_with() {
        return modalita_somministrazione___not___ends_with;
    }
    public void setModalita_somministrazione___not___ends_with(String modalita_somministrazione___not___ends_with) {
        this.modalita_somministrazione___not___ends_with = modalita_somministrazione___not___ends_with;
    }

    public Integer getNumero_dose___eq() {
        return numero_dose___eq;
    }
    public void setNumero_dose___eq(Integer numero_dose___eq) {
        this.numero_dose___eq = numero_dose___eq;
    }

    public Integer getNumero_dose___ne() {
        return numero_dose___ne;
    }
    public void setNumero_dose___ne(Integer numero_dose___ne) {
        this.numero_dose___ne = numero_dose___ne;
    }

    public Boolean getNumero_dose___null() {
        return numero_dose___null;
    }
    public void setNumero_dose___null(Boolean numero_dose___null) {
        this.numero_dose___null = numero_dose___null;
    }

    public Boolean getNumero_dose___not___null() {
        return numero_dose___not___null;
    }
    public void setNumero_dose___not___null(Boolean numero_dose___not___null) {
        this.numero_dose___not___null = numero_dose___not___null;
    }

    public java.util.List<Integer> getNumero_dose___in() {
        return numero_dose___in;
    }
    public void setNumero_dose___in(java.util.List<Integer> numero_dose___in) {
        this.numero_dose___in = numero_dose___in;
    }

    public java.util.List<Integer> getNumero_dose___not___in() {
        return numero_dose___not___in;
    }
    public void setNumero_dose___not___in(java.util.List<Integer> numero_dose___not___in) {
        this.numero_dose___not___in = numero_dose___not___in;
    }

    public Integer getNumero_dose___lt() {
        return numero_dose___lt;
    }
    public void setNumero_dose___lt(Integer numero_dose___lt) {
        this.numero_dose___lt = numero_dose___lt;
    }

    public Integer getNumero_dose___lte() {
        return numero_dose___lte;
    }
    public void setNumero_dose___lte(Integer numero_dose___lte) {
        this.numero_dose___lte = numero_dose___lte;
    }

    public Integer getNumero_dose___gt() {
        return numero_dose___gt;
    }
    public void setNumero_dose___gt(Integer numero_dose___gt) {
        this.numero_dose___gt = numero_dose___gt;
    }

    public Integer getNumero_dose___gte() {
        return numero_dose___gte;
    }
    public void setNumero_dose___gte(Integer numero_dose___gte) {
        this.numero_dose___gte = numero_dose___gte;
    }

    public java.util.List<CliDose_mpvFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliDose_mpvFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliDose_mpvFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliDose_mpvFilterDTO> OR) {
        this.OR = OR;
    }

    public CliDose_mpvFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliDose_mpvFilterDTO NOT) {
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
        if (ciclo___eq != null) {
            joiner.add("ciclo___eq: " + GraphQLRequestSerializer.getEntry(ciclo___eq));
        }
        if (ciclo___ne != null) {
            joiner.add("ciclo___ne: " + GraphQLRequestSerializer.getEntry(ciclo___ne));
        }
        if (ciclo___null != null) {
            joiner.add("ciclo___null: " + GraphQLRequestSerializer.getEntry(ciclo___null));
        }
        if (ciclo___not___null != null) {
            joiner.add("ciclo___not___null: " + GraphQLRequestSerializer.getEntry(ciclo___not___null));
        }
        if (ciclo___in != null) {
            joiner.add("ciclo___in: " + GraphQLRequestSerializer.getEntry(ciclo___in));
        }
        if (ciclo___not___in != null) {
            joiner.add("ciclo___not___in: " + GraphQLRequestSerializer.getEntry(ciclo___not___in));
        }
        if (ciclo___lt != null) {
            joiner.add("ciclo___lt: " + GraphQLRequestSerializer.getEntry(ciclo___lt));
        }
        if (ciclo___lte != null) {
            joiner.add("ciclo___lte: " + GraphQLRequestSerializer.getEntry(ciclo___lte));
        }
        if (ciclo___gt != null) {
            joiner.add("ciclo___gt: " + GraphQLRequestSerializer.getEntry(ciclo___gt));
        }
        if (ciclo___gte != null) {
            joiner.add("ciclo___gte: " + GraphQLRequestSerializer.getEntry(ciclo___gte));
        }
        if (ciclo___contains != null) {
            joiner.add("ciclo___contains: " + GraphQLRequestSerializer.getEntry(ciclo___contains));
        }
        if (ciclo___not___contains != null) {
            joiner.add("ciclo___not___contains: " + GraphQLRequestSerializer.getEntry(ciclo___not___contains));
        }
        if (ciclo___starts_with != null) {
            joiner.add("ciclo___starts_with: " + GraphQLRequestSerializer.getEntry(ciclo___starts_with));
        }
        if (ciclo___not___starts_with != null) {
            joiner.add("ciclo___not___starts_with: " + GraphQLRequestSerializer.getEntry(ciclo___not___starts_with));
        }
        if (ciclo___ends_with != null) {
            joiner.add("ciclo___ends_with: " + GraphQLRequestSerializer.getEntry(ciclo___ends_with));
        }
        if (ciclo___not___ends_with != null) {
            joiner.add("ciclo___not___ends_with: " + GraphQLRequestSerializer.getEntry(ciclo___not___ends_with));
        }
        if (modalita_somministrazione___eq != null) {
            joiner.add("modalita_somministrazione___eq: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___eq));
        }
        if (modalita_somministrazione___ne != null) {
            joiner.add("modalita_somministrazione___ne: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___ne));
        }
        if (modalita_somministrazione___null != null) {
            joiner.add("modalita_somministrazione___null: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___null));
        }
        if (modalita_somministrazione___not___null != null) {
            joiner.add("modalita_somministrazione___not___null: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___not___null));
        }
        if (modalita_somministrazione___in != null) {
            joiner.add("modalita_somministrazione___in: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___in));
        }
        if (modalita_somministrazione___not___in != null) {
            joiner.add("modalita_somministrazione___not___in: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___not___in));
        }
        if (modalita_somministrazione___lt != null) {
            joiner.add("modalita_somministrazione___lt: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___lt));
        }
        if (modalita_somministrazione___lte != null) {
            joiner.add("modalita_somministrazione___lte: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___lte));
        }
        if (modalita_somministrazione___gt != null) {
            joiner.add("modalita_somministrazione___gt: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___gt));
        }
        if (modalita_somministrazione___gte != null) {
            joiner.add("modalita_somministrazione___gte: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___gte));
        }
        if (modalita_somministrazione___contains != null) {
            joiner.add("modalita_somministrazione___contains: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___contains));
        }
        if (modalita_somministrazione___not___contains != null) {
            joiner.add("modalita_somministrazione___not___contains: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___not___contains));
        }
        if (modalita_somministrazione___starts_with != null) {
            joiner.add("modalita_somministrazione___starts_with: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___starts_with));
        }
        if (modalita_somministrazione___not___starts_with != null) {
            joiner.add("modalita_somministrazione___not___starts_with: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___not___starts_with));
        }
        if (modalita_somministrazione___ends_with != null) {
            joiner.add("modalita_somministrazione___ends_with: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___ends_with));
        }
        if (modalita_somministrazione___not___ends_with != null) {
            joiner.add("modalita_somministrazione___not___ends_with: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione___not___ends_with));
        }
        if (numero_dose___eq != null) {
            joiner.add("numero_dose___eq: " + GraphQLRequestSerializer.getEntry(numero_dose___eq));
        }
        if (numero_dose___ne != null) {
            joiner.add("numero_dose___ne: " + GraphQLRequestSerializer.getEntry(numero_dose___ne));
        }
        if (numero_dose___null != null) {
            joiner.add("numero_dose___null: " + GraphQLRequestSerializer.getEntry(numero_dose___null));
        }
        if (numero_dose___not___null != null) {
            joiner.add("numero_dose___not___null: " + GraphQLRequestSerializer.getEntry(numero_dose___not___null));
        }
        if (numero_dose___in != null) {
            joiner.add("numero_dose___in: " + GraphQLRequestSerializer.getEntry(numero_dose___in));
        }
        if (numero_dose___not___in != null) {
            joiner.add("numero_dose___not___in: " + GraphQLRequestSerializer.getEntry(numero_dose___not___in));
        }
        if (numero_dose___lt != null) {
            joiner.add("numero_dose___lt: " + GraphQLRequestSerializer.getEntry(numero_dose___lt));
        }
        if (numero_dose___lte != null) {
            joiner.add("numero_dose___lte: " + GraphQLRequestSerializer.getEntry(numero_dose___lte));
        }
        if (numero_dose___gt != null) {
            joiner.add("numero_dose___gt: " + GraphQLRequestSerializer.getEntry(numero_dose___gt));
        }
        if (numero_dose___gte != null) {
            joiner.add("numero_dose___gte: " + GraphQLRequestSerializer.getEntry(numero_dose___gte));
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

    public static CliDose_mpvFilterDTO.Builder builder() {
        return new CliDose_mpvFilterDTO.Builder();
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
        private String ciclo___eq;
        private String ciclo___ne;
        private Boolean ciclo___null;
        private Boolean ciclo___not___null;
        private java.util.List<String> ciclo___in;
        private java.util.List<String> ciclo___not___in;
        private String ciclo___lt;
        private String ciclo___lte;
        private String ciclo___gt;
        private String ciclo___gte;
        private String ciclo___contains;
        private String ciclo___not___contains;
        private String ciclo___starts_with;
        private String ciclo___not___starts_with;
        private String ciclo___ends_with;
        private String ciclo___not___ends_with;
        private String modalita_somministrazione___eq;
        private String modalita_somministrazione___ne;
        private Boolean modalita_somministrazione___null;
        private Boolean modalita_somministrazione___not___null;
        private java.util.List<String> modalita_somministrazione___in;
        private java.util.List<String> modalita_somministrazione___not___in;
        private String modalita_somministrazione___lt;
        private String modalita_somministrazione___lte;
        private String modalita_somministrazione___gt;
        private String modalita_somministrazione___gte;
        private String modalita_somministrazione___contains;
        private String modalita_somministrazione___not___contains;
        private String modalita_somministrazione___starts_with;
        private String modalita_somministrazione___not___starts_with;
        private String modalita_somministrazione___ends_with;
        private String modalita_somministrazione___not___ends_with;
        private Integer numero_dose___eq;
        private Integer numero_dose___ne;
        private Boolean numero_dose___null;
        private Boolean numero_dose___not___null;
        private java.util.List<Integer> numero_dose___in;
        private java.util.List<Integer> numero_dose___not___in;
        private Integer numero_dose___lt;
        private Integer numero_dose___lte;
        private Integer numero_dose___gt;
        private Integer numero_dose___gte;
        private java.util.List<CliDose_mpvFilterDTO> AND;
        private java.util.List<CliDose_mpvFilterDTO> OR;
        private CliDose_mpvFilterDTO NOT;

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

        public Builder setCiclo___eq(String ciclo___eq) {
            this.ciclo___eq = ciclo___eq;
            return this;
        }

        public Builder setCiclo___ne(String ciclo___ne) {
            this.ciclo___ne = ciclo___ne;
            return this;
        }

        public Builder setCiclo___null(Boolean ciclo___null) {
            this.ciclo___null = ciclo___null;
            return this;
        }

        public Builder setCiclo___not___null(Boolean ciclo___not___null) {
            this.ciclo___not___null = ciclo___not___null;
            return this;
        }

        public Builder setCiclo___in(java.util.List<String> ciclo___in) {
            this.ciclo___in = ciclo___in;
            return this;
        }

        public Builder setCiclo___not___in(java.util.List<String> ciclo___not___in) {
            this.ciclo___not___in = ciclo___not___in;
            return this;
        }

        public Builder setCiclo___lt(String ciclo___lt) {
            this.ciclo___lt = ciclo___lt;
            return this;
        }

        public Builder setCiclo___lte(String ciclo___lte) {
            this.ciclo___lte = ciclo___lte;
            return this;
        }

        public Builder setCiclo___gt(String ciclo___gt) {
            this.ciclo___gt = ciclo___gt;
            return this;
        }

        public Builder setCiclo___gte(String ciclo___gte) {
            this.ciclo___gte = ciclo___gte;
            return this;
        }

        public Builder setCiclo___contains(String ciclo___contains) {
            this.ciclo___contains = ciclo___contains;
            return this;
        }

        public Builder setCiclo___not___contains(String ciclo___not___contains) {
            this.ciclo___not___contains = ciclo___not___contains;
            return this;
        }

        public Builder setCiclo___starts_with(String ciclo___starts_with) {
            this.ciclo___starts_with = ciclo___starts_with;
            return this;
        }

        public Builder setCiclo___not___starts_with(String ciclo___not___starts_with) {
            this.ciclo___not___starts_with = ciclo___not___starts_with;
            return this;
        }

        public Builder setCiclo___ends_with(String ciclo___ends_with) {
            this.ciclo___ends_with = ciclo___ends_with;
            return this;
        }

        public Builder setCiclo___not___ends_with(String ciclo___not___ends_with) {
            this.ciclo___not___ends_with = ciclo___not___ends_with;
            return this;
        }

        public Builder setModalita_somministrazione___eq(String modalita_somministrazione___eq) {
            this.modalita_somministrazione___eq = modalita_somministrazione___eq;
            return this;
        }

        public Builder setModalita_somministrazione___ne(String modalita_somministrazione___ne) {
            this.modalita_somministrazione___ne = modalita_somministrazione___ne;
            return this;
        }

        public Builder setModalita_somministrazione___null(Boolean modalita_somministrazione___null) {
            this.modalita_somministrazione___null = modalita_somministrazione___null;
            return this;
        }

        public Builder setModalita_somministrazione___not___null(Boolean modalita_somministrazione___not___null) {
            this.modalita_somministrazione___not___null = modalita_somministrazione___not___null;
            return this;
        }

        public Builder setModalita_somministrazione___in(java.util.List<String> modalita_somministrazione___in) {
            this.modalita_somministrazione___in = modalita_somministrazione___in;
            return this;
        }

        public Builder setModalita_somministrazione___not___in(java.util.List<String> modalita_somministrazione___not___in) {
            this.modalita_somministrazione___not___in = modalita_somministrazione___not___in;
            return this;
        }

        public Builder setModalita_somministrazione___lt(String modalita_somministrazione___lt) {
            this.modalita_somministrazione___lt = modalita_somministrazione___lt;
            return this;
        }

        public Builder setModalita_somministrazione___lte(String modalita_somministrazione___lte) {
            this.modalita_somministrazione___lte = modalita_somministrazione___lte;
            return this;
        }

        public Builder setModalita_somministrazione___gt(String modalita_somministrazione___gt) {
            this.modalita_somministrazione___gt = modalita_somministrazione___gt;
            return this;
        }

        public Builder setModalita_somministrazione___gte(String modalita_somministrazione___gte) {
            this.modalita_somministrazione___gte = modalita_somministrazione___gte;
            return this;
        }

        public Builder setModalita_somministrazione___contains(String modalita_somministrazione___contains) {
            this.modalita_somministrazione___contains = modalita_somministrazione___contains;
            return this;
        }

        public Builder setModalita_somministrazione___not___contains(String modalita_somministrazione___not___contains) {
            this.modalita_somministrazione___not___contains = modalita_somministrazione___not___contains;
            return this;
        }

        public Builder setModalita_somministrazione___starts_with(String modalita_somministrazione___starts_with) {
            this.modalita_somministrazione___starts_with = modalita_somministrazione___starts_with;
            return this;
        }

        public Builder setModalita_somministrazione___not___starts_with(String modalita_somministrazione___not___starts_with) {
            this.modalita_somministrazione___not___starts_with = modalita_somministrazione___not___starts_with;
            return this;
        }

        public Builder setModalita_somministrazione___ends_with(String modalita_somministrazione___ends_with) {
            this.modalita_somministrazione___ends_with = modalita_somministrazione___ends_with;
            return this;
        }

        public Builder setModalita_somministrazione___not___ends_with(String modalita_somministrazione___not___ends_with) {
            this.modalita_somministrazione___not___ends_with = modalita_somministrazione___not___ends_with;
            return this;
        }

        public Builder setNumero_dose___eq(Integer numero_dose___eq) {
            this.numero_dose___eq = numero_dose___eq;
            return this;
        }

        public Builder setNumero_dose___ne(Integer numero_dose___ne) {
            this.numero_dose___ne = numero_dose___ne;
            return this;
        }

        public Builder setNumero_dose___null(Boolean numero_dose___null) {
            this.numero_dose___null = numero_dose___null;
            return this;
        }

        public Builder setNumero_dose___not___null(Boolean numero_dose___not___null) {
            this.numero_dose___not___null = numero_dose___not___null;
            return this;
        }

        public Builder setNumero_dose___in(java.util.List<Integer> numero_dose___in) {
            this.numero_dose___in = numero_dose___in;
            return this;
        }

        public Builder setNumero_dose___not___in(java.util.List<Integer> numero_dose___not___in) {
            this.numero_dose___not___in = numero_dose___not___in;
            return this;
        }

        public Builder setNumero_dose___lt(Integer numero_dose___lt) {
            this.numero_dose___lt = numero_dose___lt;
            return this;
        }

        public Builder setNumero_dose___lte(Integer numero_dose___lte) {
            this.numero_dose___lte = numero_dose___lte;
            return this;
        }

        public Builder setNumero_dose___gt(Integer numero_dose___gt) {
            this.numero_dose___gt = numero_dose___gt;
            return this;
        }

        public Builder setNumero_dose___gte(Integer numero_dose___gte) {
            this.numero_dose___gte = numero_dose___gte;
            return this;
        }

        public Builder setAND(java.util.List<CliDose_mpvFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliDose_mpvFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliDose_mpvFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliDose_mpvFilterDTO build() {
            CliDose_mpvFilterDTO result = new CliDose_mpvFilterDTO();
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
            result.setCiclo___eq(this.ciclo___eq);
            result.setCiclo___ne(this.ciclo___ne);
            result.setCiclo___null(this.ciclo___null);
            result.setCiclo___not___null(this.ciclo___not___null);
            result.setCiclo___in(this.ciclo___in);
            result.setCiclo___not___in(this.ciclo___not___in);
            result.setCiclo___lt(this.ciclo___lt);
            result.setCiclo___lte(this.ciclo___lte);
            result.setCiclo___gt(this.ciclo___gt);
            result.setCiclo___gte(this.ciclo___gte);
            result.setCiclo___contains(this.ciclo___contains);
            result.setCiclo___not___contains(this.ciclo___not___contains);
            result.setCiclo___starts_with(this.ciclo___starts_with);
            result.setCiclo___not___starts_with(this.ciclo___not___starts_with);
            result.setCiclo___ends_with(this.ciclo___ends_with);
            result.setCiclo___not___ends_with(this.ciclo___not___ends_with);
            result.setModalita_somministrazione___eq(this.modalita_somministrazione___eq);
            result.setModalita_somministrazione___ne(this.modalita_somministrazione___ne);
            result.setModalita_somministrazione___null(this.modalita_somministrazione___null);
            result.setModalita_somministrazione___not___null(this.modalita_somministrazione___not___null);
            result.setModalita_somministrazione___in(this.modalita_somministrazione___in);
            result.setModalita_somministrazione___not___in(this.modalita_somministrazione___not___in);
            result.setModalita_somministrazione___lt(this.modalita_somministrazione___lt);
            result.setModalita_somministrazione___lte(this.modalita_somministrazione___lte);
            result.setModalita_somministrazione___gt(this.modalita_somministrazione___gt);
            result.setModalita_somministrazione___gte(this.modalita_somministrazione___gte);
            result.setModalita_somministrazione___contains(this.modalita_somministrazione___contains);
            result.setModalita_somministrazione___not___contains(this.modalita_somministrazione___not___contains);
            result.setModalita_somministrazione___starts_with(this.modalita_somministrazione___starts_with);
            result.setModalita_somministrazione___not___starts_with(this.modalita_somministrazione___not___starts_with);
            result.setModalita_somministrazione___ends_with(this.modalita_somministrazione___ends_with);
            result.setModalita_somministrazione___not___ends_with(this.modalita_somministrazione___not___ends_with);
            result.setNumero_dose___eq(this.numero_dose___eq);
            result.setNumero_dose___ne(this.numero_dose___ne);
            result.setNumero_dose___null(this.numero_dose___null);
            result.setNumero_dose___not___null(this.numero_dose___not___null);
            result.setNumero_dose___in(this.numero_dose___in);
            result.setNumero_dose___not___in(this.numero_dose___not___in);
            result.setNumero_dose___lt(this.numero_dose___lt);
            result.setNumero_dose___lte(this.numero_dose___lte);
            result.setNumero_dose___gt(this.numero_dose___gt);
            result.setNumero_dose___gte(this.numero_dose___gte);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
