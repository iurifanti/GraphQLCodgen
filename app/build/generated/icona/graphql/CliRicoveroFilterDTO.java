package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Ricovero.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRicoveroFilterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId___eq;
    private String ICD9_1___eq;
    private String ICD9_1___ne;
    private Boolean ICD9_1___null;
    private Boolean ICD9_1___not___null;
    private java.util.List<String> ICD9_1___in;
    private java.util.List<String> ICD9_1___not___in;
    private String ICD9_1___lt;
    private String ICD9_1___lte;
    private String ICD9_1___gt;
    private String ICD9_1___gte;
    private String ICD9_1___contains;
    private String ICD9_1___not___contains;
    private String ICD9_1___starts_with;
    private String ICD9_1___not___starts_with;
    private String ICD9_1___ends_with;
    private String ICD9_1___not___ends_with;
    private String ICD9_10___eq;
    private String ICD9_10___ne;
    private Boolean ICD9_10___null;
    private Boolean ICD9_10___not___null;
    private java.util.List<String> ICD9_10___in;
    private java.util.List<String> ICD9_10___not___in;
    private String ICD9_10___lt;
    private String ICD9_10___lte;
    private String ICD9_10___gt;
    private String ICD9_10___gte;
    private String ICD9_10___contains;
    private String ICD9_10___not___contains;
    private String ICD9_10___starts_with;
    private String ICD9_10___not___starts_with;
    private String ICD9_10___ends_with;
    private String ICD9_10___not___ends_with;
    private String ICD9_2___eq;
    private String ICD9_2___ne;
    private Boolean ICD9_2___null;
    private Boolean ICD9_2___not___null;
    private java.util.List<String> ICD9_2___in;
    private java.util.List<String> ICD9_2___not___in;
    private String ICD9_2___lt;
    private String ICD9_2___lte;
    private String ICD9_2___gt;
    private String ICD9_2___gte;
    private String ICD9_2___contains;
    private String ICD9_2___not___contains;
    private String ICD9_2___starts_with;
    private String ICD9_2___not___starts_with;
    private String ICD9_2___ends_with;
    private String ICD9_2___not___ends_with;
    private String ICD9_3___eq;
    private String ICD9_3___ne;
    private Boolean ICD9_3___null;
    private Boolean ICD9_3___not___null;
    private java.util.List<String> ICD9_3___in;
    private java.util.List<String> ICD9_3___not___in;
    private String ICD9_3___lt;
    private String ICD9_3___lte;
    private String ICD9_3___gt;
    private String ICD9_3___gte;
    private String ICD9_3___contains;
    private String ICD9_3___not___contains;
    private String ICD9_3___starts_with;
    private String ICD9_3___not___starts_with;
    private String ICD9_3___ends_with;
    private String ICD9_3___not___ends_with;
    private String ICD9_4___eq;
    private String ICD9_4___ne;
    private Boolean ICD9_4___null;
    private Boolean ICD9_4___not___null;
    private java.util.List<String> ICD9_4___in;
    private java.util.List<String> ICD9_4___not___in;
    private String ICD9_4___lt;
    private String ICD9_4___lte;
    private String ICD9_4___gt;
    private String ICD9_4___gte;
    private String ICD9_4___contains;
    private String ICD9_4___not___contains;
    private String ICD9_4___starts_with;
    private String ICD9_4___not___starts_with;
    private String ICD9_4___ends_with;
    private String ICD9_4___not___ends_with;
    private String ICD9_5___eq;
    private String ICD9_5___ne;
    private Boolean ICD9_5___null;
    private Boolean ICD9_5___not___null;
    private java.util.List<String> ICD9_5___in;
    private java.util.List<String> ICD9_5___not___in;
    private String ICD9_5___lt;
    private String ICD9_5___lte;
    private String ICD9_5___gt;
    private String ICD9_5___gte;
    private String ICD9_5___contains;
    private String ICD9_5___not___contains;
    private String ICD9_5___starts_with;
    private String ICD9_5___not___starts_with;
    private String ICD9_5___ends_with;
    private String ICD9_5___not___ends_with;
    private String ICD9_6___eq;
    private String ICD9_6___ne;
    private Boolean ICD9_6___null;
    private Boolean ICD9_6___not___null;
    private java.util.List<String> ICD9_6___in;
    private java.util.List<String> ICD9_6___not___in;
    private String ICD9_6___lt;
    private String ICD9_6___lte;
    private String ICD9_6___gt;
    private String ICD9_6___gte;
    private String ICD9_6___contains;
    private String ICD9_6___not___contains;
    private String ICD9_6___starts_with;
    private String ICD9_6___not___starts_with;
    private String ICD9_6___ends_with;
    private String ICD9_6___not___ends_with;
    private String ICD9_7___eq;
    private String ICD9_7___ne;
    private Boolean ICD9_7___null;
    private Boolean ICD9_7___not___null;
    private java.util.List<String> ICD9_7___in;
    private java.util.List<String> ICD9_7___not___in;
    private String ICD9_7___lt;
    private String ICD9_7___lte;
    private String ICD9_7___gt;
    private String ICD9_7___gte;
    private String ICD9_7___contains;
    private String ICD9_7___not___contains;
    private String ICD9_7___starts_with;
    private String ICD9_7___not___starts_with;
    private String ICD9_7___ends_with;
    private String ICD9_7___not___ends_with;
    private String ICD9_8___eq;
    private String ICD9_8___ne;
    private Boolean ICD9_8___null;
    private Boolean ICD9_8___not___null;
    private java.util.List<String> ICD9_8___in;
    private java.util.List<String> ICD9_8___not___in;
    private String ICD9_8___lt;
    private String ICD9_8___lte;
    private String ICD9_8___gt;
    private String ICD9_8___gte;
    private String ICD9_8___contains;
    private String ICD9_8___not___contains;
    private String ICD9_8___starts_with;
    private String ICD9_8___not___starts_with;
    private String ICD9_8___ends_with;
    private String ICD9_8___not___ends_with;
    private String ICD9_9___eq;
    private String ICD9_9___ne;
    private Boolean ICD9_9___null;
    private Boolean ICD9_9___not___null;
    private java.util.List<String> ICD9_9___in;
    private java.util.List<String> ICD9_9___not___in;
    private String ICD9_9___lt;
    private String ICD9_9___lte;
    private String ICD9_9___gt;
    private String ICD9_9___gte;
    private String ICD9_9___contains;
    private String ICD9_9___not___contains;
    private String ICD9_9___starts_with;
    private String ICD9_9___not___starts_with;
    private String ICD9_9___ends_with;
    private String ICD9_9___not___ends_with;
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
    private String codice_centro___eq;
    private String codice_centro___ne;
    private Boolean codice_centro___null;
    private Boolean codice_centro___not___null;
    private java.util.List<String> codice_centro___in;
    private java.util.List<String> codice_centro___not___in;
    private String codice_centro___lt;
    private String codice_centro___lte;
    private String codice_centro___gt;
    private String codice_centro___gte;
    private String codice_centro___contains;
    private String codice_centro___not___contains;
    private String codice_centro___starts_with;
    private String codice_centro___not___starts_with;
    private String codice_centro___ends_with;
    private String codice_centro___not___ends_with;
    private Boolean data_approssimata___eq;
    private Boolean data_approssimata___ne;
    private Boolean data_approssimata___null;
    private Boolean data_approssimata___not___null;
    private String data_dimissione___eq;
    private String data_dimissione___ne;
    private Boolean data_dimissione___null;
    private Boolean data_dimissione___not___null;
    private java.util.List<String> data_dimissione___in;
    private java.util.List<String> data_dimissione___not___in;
    private String data_dimissione___lt;
    private String data_dimissione___lte;
    private String data_dimissione___gt;
    private String data_dimissione___gte;
    private String data_ricovero___eq;
    private String data_ricovero___ne;
    private Boolean data_ricovero___null;
    private Boolean data_ricovero___not___null;
    private java.util.List<String> data_ricovero___in;
    private java.util.List<String> data_ricovero___not___in;
    private String data_ricovero___lt;
    private String data_ricovero___lte;
    private String data_ricovero___gt;
    private String data_ricovero___gte;
    private String diagnosi___eq;
    private String diagnosi___ne;
    private Boolean diagnosi___null;
    private Boolean diagnosi___not___null;
    private java.util.List<String> diagnosi___in;
    private java.util.List<String> diagnosi___not___in;
    private String diagnosi___lt;
    private String diagnosi___lte;
    private String diagnosi___gt;
    private String diagnosi___gte;
    private String diagnosi___contains;
    private String diagnosi___not___contains;
    private String diagnosi___starts_with;
    private String diagnosi___not___starts_with;
    private String diagnosi___ends_with;
    private String diagnosi___not___ends_with;
    private java.util.List<CliRicoveroFilterDTO> AND;
    private java.util.List<CliRicoveroFilterDTO> OR;
    private CliRicoveroFilterDTO NOT;

    public CliRicoveroFilterDTO() {
    }


    public String get_clientId___eq() {
        return _clientId___eq;
    }
    public void set_clientId___eq(String _clientId___eq) {
        this._clientId___eq = _clientId___eq;
    }

    public String getICD9_1___eq() {
        return ICD9_1___eq;
    }
    public void setICD9_1___eq(String ICD9_1___eq) {
        this.ICD9_1___eq = ICD9_1___eq;
    }

    public String getICD9_1___ne() {
        return ICD9_1___ne;
    }
    public void setICD9_1___ne(String ICD9_1___ne) {
        this.ICD9_1___ne = ICD9_1___ne;
    }

    public Boolean getICD9_1___null() {
        return ICD9_1___null;
    }
    public void setICD9_1___null(Boolean ICD9_1___null) {
        this.ICD9_1___null = ICD9_1___null;
    }

    public Boolean getICD9_1___not___null() {
        return ICD9_1___not___null;
    }
    public void setICD9_1___not___null(Boolean ICD9_1___not___null) {
        this.ICD9_1___not___null = ICD9_1___not___null;
    }

    public java.util.List<String> getICD9_1___in() {
        return ICD9_1___in;
    }
    public void setICD9_1___in(java.util.List<String> ICD9_1___in) {
        this.ICD9_1___in = ICD9_1___in;
    }

    public java.util.List<String> getICD9_1___not___in() {
        return ICD9_1___not___in;
    }
    public void setICD9_1___not___in(java.util.List<String> ICD9_1___not___in) {
        this.ICD9_1___not___in = ICD9_1___not___in;
    }

    public String getICD9_1___lt() {
        return ICD9_1___lt;
    }
    public void setICD9_1___lt(String ICD9_1___lt) {
        this.ICD9_1___lt = ICD9_1___lt;
    }

    public String getICD9_1___lte() {
        return ICD9_1___lte;
    }
    public void setICD9_1___lte(String ICD9_1___lte) {
        this.ICD9_1___lte = ICD9_1___lte;
    }

    public String getICD9_1___gt() {
        return ICD9_1___gt;
    }
    public void setICD9_1___gt(String ICD9_1___gt) {
        this.ICD9_1___gt = ICD9_1___gt;
    }

    public String getICD9_1___gte() {
        return ICD9_1___gte;
    }
    public void setICD9_1___gte(String ICD9_1___gte) {
        this.ICD9_1___gte = ICD9_1___gte;
    }

    public String getICD9_1___contains() {
        return ICD9_1___contains;
    }
    public void setICD9_1___contains(String ICD9_1___contains) {
        this.ICD9_1___contains = ICD9_1___contains;
    }

    public String getICD9_1___not___contains() {
        return ICD9_1___not___contains;
    }
    public void setICD9_1___not___contains(String ICD9_1___not___contains) {
        this.ICD9_1___not___contains = ICD9_1___not___contains;
    }

    public String getICD9_1___starts_with() {
        return ICD9_1___starts_with;
    }
    public void setICD9_1___starts_with(String ICD9_1___starts_with) {
        this.ICD9_1___starts_with = ICD9_1___starts_with;
    }

    public String getICD9_1___not___starts_with() {
        return ICD9_1___not___starts_with;
    }
    public void setICD9_1___not___starts_with(String ICD9_1___not___starts_with) {
        this.ICD9_1___not___starts_with = ICD9_1___not___starts_with;
    }

    public String getICD9_1___ends_with() {
        return ICD9_1___ends_with;
    }
    public void setICD9_1___ends_with(String ICD9_1___ends_with) {
        this.ICD9_1___ends_with = ICD9_1___ends_with;
    }

    public String getICD9_1___not___ends_with() {
        return ICD9_1___not___ends_with;
    }
    public void setICD9_1___not___ends_with(String ICD9_1___not___ends_with) {
        this.ICD9_1___not___ends_with = ICD9_1___not___ends_with;
    }

    public String getICD9_10___eq() {
        return ICD9_10___eq;
    }
    public void setICD9_10___eq(String ICD9_10___eq) {
        this.ICD9_10___eq = ICD9_10___eq;
    }

    public String getICD9_10___ne() {
        return ICD9_10___ne;
    }
    public void setICD9_10___ne(String ICD9_10___ne) {
        this.ICD9_10___ne = ICD9_10___ne;
    }

    public Boolean getICD9_10___null() {
        return ICD9_10___null;
    }
    public void setICD9_10___null(Boolean ICD9_10___null) {
        this.ICD9_10___null = ICD9_10___null;
    }

    public Boolean getICD9_10___not___null() {
        return ICD9_10___not___null;
    }
    public void setICD9_10___not___null(Boolean ICD9_10___not___null) {
        this.ICD9_10___not___null = ICD9_10___not___null;
    }

    public java.util.List<String> getICD9_10___in() {
        return ICD9_10___in;
    }
    public void setICD9_10___in(java.util.List<String> ICD9_10___in) {
        this.ICD9_10___in = ICD9_10___in;
    }

    public java.util.List<String> getICD9_10___not___in() {
        return ICD9_10___not___in;
    }
    public void setICD9_10___not___in(java.util.List<String> ICD9_10___not___in) {
        this.ICD9_10___not___in = ICD9_10___not___in;
    }

    public String getICD9_10___lt() {
        return ICD9_10___lt;
    }
    public void setICD9_10___lt(String ICD9_10___lt) {
        this.ICD9_10___lt = ICD9_10___lt;
    }

    public String getICD9_10___lte() {
        return ICD9_10___lte;
    }
    public void setICD9_10___lte(String ICD9_10___lte) {
        this.ICD9_10___lte = ICD9_10___lte;
    }

    public String getICD9_10___gt() {
        return ICD9_10___gt;
    }
    public void setICD9_10___gt(String ICD9_10___gt) {
        this.ICD9_10___gt = ICD9_10___gt;
    }

    public String getICD9_10___gte() {
        return ICD9_10___gte;
    }
    public void setICD9_10___gte(String ICD9_10___gte) {
        this.ICD9_10___gte = ICD9_10___gte;
    }

    public String getICD9_10___contains() {
        return ICD9_10___contains;
    }
    public void setICD9_10___contains(String ICD9_10___contains) {
        this.ICD9_10___contains = ICD9_10___contains;
    }

    public String getICD9_10___not___contains() {
        return ICD9_10___not___contains;
    }
    public void setICD9_10___not___contains(String ICD9_10___not___contains) {
        this.ICD9_10___not___contains = ICD9_10___not___contains;
    }

    public String getICD9_10___starts_with() {
        return ICD9_10___starts_with;
    }
    public void setICD9_10___starts_with(String ICD9_10___starts_with) {
        this.ICD9_10___starts_with = ICD9_10___starts_with;
    }

    public String getICD9_10___not___starts_with() {
        return ICD9_10___not___starts_with;
    }
    public void setICD9_10___not___starts_with(String ICD9_10___not___starts_with) {
        this.ICD9_10___not___starts_with = ICD9_10___not___starts_with;
    }

    public String getICD9_10___ends_with() {
        return ICD9_10___ends_with;
    }
    public void setICD9_10___ends_with(String ICD9_10___ends_with) {
        this.ICD9_10___ends_with = ICD9_10___ends_with;
    }

    public String getICD9_10___not___ends_with() {
        return ICD9_10___not___ends_with;
    }
    public void setICD9_10___not___ends_with(String ICD9_10___not___ends_with) {
        this.ICD9_10___not___ends_with = ICD9_10___not___ends_with;
    }

    public String getICD9_2___eq() {
        return ICD9_2___eq;
    }
    public void setICD9_2___eq(String ICD9_2___eq) {
        this.ICD9_2___eq = ICD9_2___eq;
    }

    public String getICD9_2___ne() {
        return ICD9_2___ne;
    }
    public void setICD9_2___ne(String ICD9_2___ne) {
        this.ICD9_2___ne = ICD9_2___ne;
    }

    public Boolean getICD9_2___null() {
        return ICD9_2___null;
    }
    public void setICD9_2___null(Boolean ICD9_2___null) {
        this.ICD9_2___null = ICD9_2___null;
    }

    public Boolean getICD9_2___not___null() {
        return ICD9_2___not___null;
    }
    public void setICD9_2___not___null(Boolean ICD9_2___not___null) {
        this.ICD9_2___not___null = ICD9_2___not___null;
    }

    public java.util.List<String> getICD9_2___in() {
        return ICD9_2___in;
    }
    public void setICD9_2___in(java.util.List<String> ICD9_2___in) {
        this.ICD9_2___in = ICD9_2___in;
    }

    public java.util.List<String> getICD9_2___not___in() {
        return ICD9_2___not___in;
    }
    public void setICD9_2___not___in(java.util.List<String> ICD9_2___not___in) {
        this.ICD9_2___not___in = ICD9_2___not___in;
    }

    public String getICD9_2___lt() {
        return ICD9_2___lt;
    }
    public void setICD9_2___lt(String ICD9_2___lt) {
        this.ICD9_2___lt = ICD9_2___lt;
    }

    public String getICD9_2___lte() {
        return ICD9_2___lte;
    }
    public void setICD9_2___lte(String ICD9_2___lte) {
        this.ICD9_2___lte = ICD9_2___lte;
    }

    public String getICD9_2___gt() {
        return ICD9_2___gt;
    }
    public void setICD9_2___gt(String ICD9_2___gt) {
        this.ICD9_2___gt = ICD9_2___gt;
    }

    public String getICD9_2___gte() {
        return ICD9_2___gte;
    }
    public void setICD9_2___gte(String ICD9_2___gte) {
        this.ICD9_2___gte = ICD9_2___gte;
    }

    public String getICD9_2___contains() {
        return ICD9_2___contains;
    }
    public void setICD9_2___contains(String ICD9_2___contains) {
        this.ICD9_2___contains = ICD9_2___contains;
    }

    public String getICD9_2___not___contains() {
        return ICD9_2___not___contains;
    }
    public void setICD9_2___not___contains(String ICD9_2___not___contains) {
        this.ICD9_2___not___contains = ICD9_2___not___contains;
    }

    public String getICD9_2___starts_with() {
        return ICD9_2___starts_with;
    }
    public void setICD9_2___starts_with(String ICD9_2___starts_with) {
        this.ICD9_2___starts_with = ICD9_2___starts_with;
    }

    public String getICD9_2___not___starts_with() {
        return ICD9_2___not___starts_with;
    }
    public void setICD9_2___not___starts_with(String ICD9_2___not___starts_with) {
        this.ICD9_2___not___starts_with = ICD9_2___not___starts_with;
    }

    public String getICD9_2___ends_with() {
        return ICD9_2___ends_with;
    }
    public void setICD9_2___ends_with(String ICD9_2___ends_with) {
        this.ICD9_2___ends_with = ICD9_2___ends_with;
    }

    public String getICD9_2___not___ends_with() {
        return ICD9_2___not___ends_with;
    }
    public void setICD9_2___not___ends_with(String ICD9_2___not___ends_with) {
        this.ICD9_2___not___ends_with = ICD9_2___not___ends_with;
    }

    public String getICD9_3___eq() {
        return ICD9_3___eq;
    }
    public void setICD9_3___eq(String ICD9_3___eq) {
        this.ICD9_3___eq = ICD9_3___eq;
    }

    public String getICD9_3___ne() {
        return ICD9_3___ne;
    }
    public void setICD9_3___ne(String ICD9_3___ne) {
        this.ICD9_3___ne = ICD9_3___ne;
    }

    public Boolean getICD9_3___null() {
        return ICD9_3___null;
    }
    public void setICD9_3___null(Boolean ICD9_3___null) {
        this.ICD9_3___null = ICD9_3___null;
    }

    public Boolean getICD9_3___not___null() {
        return ICD9_3___not___null;
    }
    public void setICD9_3___not___null(Boolean ICD9_3___not___null) {
        this.ICD9_3___not___null = ICD9_3___not___null;
    }

    public java.util.List<String> getICD9_3___in() {
        return ICD9_3___in;
    }
    public void setICD9_3___in(java.util.List<String> ICD9_3___in) {
        this.ICD9_3___in = ICD9_3___in;
    }

    public java.util.List<String> getICD9_3___not___in() {
        return ICD9_3___not___in;
    }
    public void setICD9_3___not___in(java.util.List<String> ICD9_3___not___in) {
        this.ICD9_3___not___in = ICD9_3___not___in;
    }

    public String getICD9_3___lt() {
        return ICD9_3___lt;
    }
    public void setICD9_3___lt(String ICD9_3___lt) {
        this.ICD9_3___lt = ICD9_3___lt;
    }

    public String getICD9_3___lte() {
        return ICD9_3___lte;
    }
    public void setICD9_3___lte(String ICD9_3___lte) {
        this.ICD9_3___lte = ICD9_3___lte;
    }

    public String getICD9_3___gt() {
        return ICD9_3___gt;
    }
    public void setICD9_3___gt(String ICD9_3___gt) {
        this.ICD9_3___gt = ICD9_3___gt;
    }

    public String getICD9_3___gte() {
        return ICD9_3___gte;
    }
    public void setICD9_3___gte(String ICD9_3___gte) {
        this.ICD9_3___gte = ICD9_3___gte;
    }

    public String getICD9_3___contains() {
        return ICD9_3___contains;
    }
    public void setICD9_3___contains(String ICD9_3___contains) {
        this.ICD9_3___contains = ICD9_3___contains;
    }

    public String getICD9_3___not___contains() {
        return ICD9_3___not___contains;
    }
    public void setICD9_3___not___contains(String ICD9_3___not___contains) {
        this.ICD9_3___not___contains = ICD9_3___not___contains;
    }

    public String getICD9_3___starts_with() {
        return ICD9_3___starts_with;
    }
    public void setICD9_3___starts_with(String ICD9_3___starts_with) {
        this.ICD9_3___starts_with = ICD9_3___starts_with;
    }

    public String getICD9_3___not___starts_with() {
        return ICD9_3___not___starts_with;
    }
    public void setICD9_3___not___starts_with(String ICD9_3___not___starts_with) {
        this.ICD9_3___not___starts_with = ICD9_3___not___starts_with;
    }

    public String getICD9_3___ends_with() {
        return ICD9_3___ends_with;
    }
    public void setICD9_3___ends_with(String ICD9_3___ends_with) {
        this.ICD9_3___ends_with = ICD9_3___ends_with;
    }

    public String getICD9_3___not___ends_with() {
        return ICD9_3___not___ends_with;
    }
    public void setICD9_3___not___ends_with(String ICD9_3___not___ends_with) {
        this.ICD9_3___not___ends_with = ICD9_3___not___ends_with;
    }

    public String getICD9_4___eq() {
        return ICD9_4___eq;
    }
    public void setICD9_4___eq(String ICD9_4___eq) {
        this.ICD9_4___eq = ICD9_4___eq;
    }

    public String getICD9_4___ne() {
        return ICD9_4___ne;
    }
    public void setICD9_4___ne(String ICD9_4___ne) {
        this.ICD9_4___ne = ICD9_4___ne;
    }

    public Boolean getICD9_4___null() {
        return ICD9_4___null;
    }
    public void setICD9_4___null(Boolean ICD9_4___null) {
        this.ICD9_4___null = ICD9_4___null;
    }

    public Boolean getICD9_4___not___null() {
        return ICD9_4___not___null;
    }
    public void setICD9_4___not___null(Boolean ICD9_4___not___null) {
        this.ICD9_4___not___null = ICD9_4___not___null;
    }

    public java.util.List<String> getICD9_4___in() {
        return ICD9_4___in;
    }
    public void setICD9_4___in(java.util.List<String> ICD9_4___in) {
        this.ICD9_4___in = ICD9_4___in;
    }

    public java.util.List<String> getICD9_4___not___in() {
        return ICD9_4___not___in;
    }
    public void setICD9_4___not___in(java.util.List<String> ICD9_4___not___in) {
        this.ICD9_4___not___in = ICD9_4___not___in;
    }

    public String getICD9_4___lt() {
        return ICD9_4___lt;
    }
    public void setICD9_4___lt(String ICD9_4___lt) {
        this.ICD9_4___lt = ICD9_4___lt;
    }

    public String getICD9_4___lte() {
        return ICD9_4___lte;
    }
    public void setICD9_4___lte(String ICD9_4___lte) {
        this.ICD9_4___lte = ICD9_4___lte;
    }

    public String getICD9_4___gt() {
        return ICD9_4___gt;
    }
    public void setICD9_4___gt(String ICD9_4___gt) {
        this.ICD9_4___gt = ICD9_4___gt;
    }

    public String getICD9_4___gte() {
        return ICD9_4___gte;
    }
    public void setICD9_4___gte(String ICD9_4___gte) {
        this.ICD9_4___gte = ICD9_4___gte;
    }

    public String getICD9_4___contains() {
        return ICD9_4___contains;
    }
    public void setICD9_4___contains(String ICD9_4___contains) {
        this.ICD9_4___contains = ICD9_4___contains;
    }

    public String getICD9_4___not___contains() {
        return ICD9_4___not___contains;
    }
    public void setICD9_4___not___contains(String ICD9_4___not___contains) {
        this.ICD9_4___not___contains = ICD9_4___not___contains;
    }

    public String getICD9_4___starts_with() {
        return ICD9_4___starts_with;
    }
    public void setICD9_4___starts_with(String ICD9_4___starts_with) {
        this.ICD9_4___starts_with = ICD9_4___starts_with;
    }

    public String getICD9_4___not___starts_with() {
        return ICD9_4___not___starts_with;
    }
    public void setICD9_4___not___starts_with(String ICD9_4___not___starts_with) {
        this.ICD9_4___not___starts_with = ICD9_4___not___starts_with;
    }

    public String getICD9_4___ends_with() {
        return ICD9_4___ends_with;
    }
    public void setICD9_4___ends_with(String ICD9_4___ends_with) {
        this.ICD9_4___ends_with = ICD9_4___ends_with;
    }

    public String getICD9_4___not___ends_with() {
        return ICD9_4___not___ends_with;
    }
    public void setICD9_4___not___ends_with(String ICD9_4___not___ends_with) {
        this.ICD9_4___not___ends_with = ICD9_4___not___ends_with;
    }

    public String getICD9_5___eq() {
        return ICD9_5___eq;
    }
    public void setICD9_5___eq(String ICD9_5___eq) {
        this.ICD9_5___eq = ICD9_5___eq;
    }

    public String getICD9_5___ne() {
        return ICD9_5___ne;
    }
    public void setICD9_5___ne(String ICD9_5___ne) {
        this.ICD9_5___ne = ICD9_5___ne;
    }

    public Boolean getICD9_5___null() {
        return ICD9_5___null;
    }
    public void setICD9_5___null(Boolean ICD9_5___null) {
        this.ICD9_5___null = ICD9_5___null;
    }

    public Boolean getICD9_5___not___null() {
        return ICD9_5___not___null;
    }
    public void setICD9_5___not___null(Boolean ICD9_5___not___null) {
        this.ICD9_5___not___null = ICD9_5___not___null;
    }

    public java.util.List<String> getICD9_5___in() {
        return ICD9_5___in;
    }
    public void setICD9_5___in(java.util.List<String> ICD9_5___in) {
        this.ICD9_5___in = ICD9_5___in;
    }

    public java.util.List<String> getICD9_5___not___in() {
        return ICD9_5___not___in;
    }
    public void setICD9_5___not___in(java.util.List<String> ICD9_5___not___in) {
        this.ICD9_5___not___in = ICD9_5___not___in;
    }

    public String getICD9_5___lt() {
        return ICD9_5___lt;
    }
    public void setICD9_5___lt(String ICD9_5___lt) {
        this.ICD9_5___lt = ICD9_5___lt;
    }

    public String getICD9_5___lte() {
        return ICD9_5___lte;
    }
    public void setICD9_5___lte(String ICD9_5___lte) {
        this.ICD9_5___lte = ICD9_5___lte;
    }

    public String getICD9_5___gt() {
        return ICD9_5___gt;
    }
    public void setICD9_5___gt(String ICD9_5___gt) {
        this.ICD9_5___gt = ICD9_5___gt;
    }

    public String getICD9_5___gte() {
        return ICD9_5___gte;
    }
    public void setICD9_5___gte(String ICD9_5___gte) {
        this.ICD9_5___gte = ICD9_5___gte;
    }

    public String getICD9_5___contains() {
        return ICD9_5___contains;
    }
    public void setICD9_5___contains(String ICD9_5___contains) {
        this.ICD9_5___contains = ICD9_5___contains;
    }

    public String getICD9_5___not___contains() {
        return ICD9_5___not___contains;
    }
    public void setICD9_5___not___contains(String ICD9_5___not___contains) {
        this.ICD9_5___not___contains = ICD9_5___not___contains;
    }

    public String getICD9_5___starts_with() {
        return ICD9_5___starts_with;
    }
    public void setICD9_5___starts_with(String ICD9_5___starts_with) {
        this.ICD9_5___starts_with = ICD9_5___starts_with;
    }

    public String getICD9_5___not___starts_with() {
        return ICD9_5___not___starts_with;
    }
    public void setICD9_5___not___starts_with(String ICD9_5___not___starts_with) {
        this.ICD9_5___not___starts_with = ICD9_5___not___starts_with;
    }

    public String getICD9_5___ends_with() {
        return ICD9_5___ends_with;
    }
    public void setICD9_5___ends_with(String ICD9_5___ends_with) {
        this.ICD9_5___ends_with = ICD9_5___ends_with;
    }

    public String getICD9_5___not___ends_with() {
        return ICD9_5___not___ends_with;
    }
    public void setICD9_5___not___ends_with(String ICD9_5___not___ends_with) {
        this.ICD9_5___not___ends_with = ICD9_5___not___ends_with;
    }

    public String getICD9_6___eq() {
        return ICD9_6___eq;
    }
    public void setICD9_6___eq(String ICD9_6___eq) {
        this.ICD9_6___eq = ICD9_6___eq;
    }

    public String getICD9_6___ne() {
        return ICD9_6___ne;
    }
    public void setICD9_6___ne(String ICD9_6___ne) {
        this.ICD9_6___ne = ICD9_6___ne;
    }

    public Boolean getICD9_6___null() {
        return ICD9_6___null;
    }
    public void setICD9_6___null(Boolean ICD9_6___null) {
        this.ICD9_6___null = ICD9_6___null;
    }

    public Boolean getICD9_6___not___null() {
        return ICD9_6___not___null;
    }
    public void setICD9_6___not___null(Boolean ICD9_6___not___null) {
        this.ICD9_6___not___null = ICD9_6___not___null;
    }

    public java.util.List<String> getICD9_6___in() {
        return ICD9_6___in;
    }
    public void setICD9_6___in(java.util.List<String> ICD9_6___in) {
        this.ICD9_6___in = ICD9_6___in;
    }

    public java.util.List<String> getICD9_6___not___in() {
        return ICD9_6___not___in;
    }
    public void setICD9_6___not___in(java.util.List<String> ICD9_6___not___in) {
        this.ICD9_6___not___in = ICD9_6___not___in;
    }

    public String getICD9_6___lt() {
        return ICD9_6___lt;
    }
    public void setICD9_6___lt(String ICD9_6___lt) {
        this.ICD9_6___lt = ICD9_6___lt;
    }

    public String getICD9_6___lte() {
        return ICD9_6___lte;
    }
    public void setICD9_6___lte(String ICD9_6___lte) {
        this.ICD9_6___lte = ICD9_6___lte;
    }

    public String getICD9_6___gt() {
        return ICD9_6___gt;
    }
    public void setICD9_6___gt(String ICD9_6___gt) {
        this.ICD9_6___gt = ICD9_6___gt;
    }

    public String getICD9_6___gte() {
        return ICD9_6___gte;
    }
    public void setICD9_6___gte(String ICD9_6___gte) {
        this.ICD9_6___gte = ICD9_6___gte;
    }

    public String getICD9_6___contains() {
        return ICD9_6___contains;
    }
    public void setICD9_6___contains(String ICD9_6___contains) {
        this.ICD9_6___contains = ICD9_6___contains;
    }

    public String getICD9_6___not___contains() {
        return ICD9_6___not___contains;
    }
    public void setICD9_6___not___contains(String ICD9_6___not___contains) {
        this.ICD9_6___not___contains = ICD9_6___not___contains;
    }

    public String getICD9_6___starts_with() {
        return ICD9_6___starts_with;
    }
    public void setICD9_6___starts_with(String ICD9_6___starts_with) {
        this.ICD9_6___starts_with = ICD9_6___starts_with;
    }

    public String getICD9_6___not___starts_with() {
        return ICD9_6___not___starts_with;
    }
    public void setICD9_6___not___starts_with(String ICD9_6___not___starts_with) {
        this.ICD9_6___not___starts_with = ICD9_6___not___starts_with;
    }

    public String getICD9_6___ends_with() {
        return ICD9_6___ends_with;
    }
    public void setICD9_6___ends_with(String ICD9_6___ends_with) {
        this.ICD9_6___ends_with = ICD9_6___ends_with;
    }

    public String getICD9_6___not___ends_with() {
        return ICD9_6___not___ends_with;
    }
    public void setICD9_6___not___ends_with(String ICD9_6___not___ends_with) {
        this.ICD9_6___not___ends_with = ICD9_6___not___ends_with;
    }

    public String getICD9_7___eq() {
        return ICD9_7___eq;
    }
    public void setICD9_7___eq(String ICD9_7___eq) {
        this.ICD9_7___eq = ICD9_7___eq;
    }

    public String getICD9_7___ne() {
        return ICD9_7___ne;
    }
    public void setICD9_7___ne(String ICD9_7___ne) {
        this.ICD9_7___ne = ICD9_7___ne;
    }

    public Boolean getICD9_7___null() {
        return ICD9_7___null;
    }
    public void setICD9_7___null(Boolean ICD9_7___null) {
        this.ICD9_7___null = ICD9_7___null;
    }

    public Boolean getICD9_7___not___null() {
        return ICD9_7___not___null;
    }
    public void setICD9_7___not___null(Boolean ICD9_7___not___null) {
        this.ICD9_7___not___null = ICD9_7___not___null;
    }

    public java.util.List<String> getICD9_7___in() {
        return ICD9_7___in;
    }
    public void setICD9_7___in(java.util.List<String> ICD9_7___in) {
        this.ICD9_7___in = ICD9_7___in;
    }

    public java.util.List<String> getICD9_7___not___in() {
        return ICD9_7___not___in;
    }
    public void setICD9_7___not___in(java.util.List<String> ICD9_7___not___in) {
        this.ICD9_7___not___in = ICD9_7___not___in;
    }

    public String getICD9_7___lt() {
        return ICD9_7___lt;
    }
    public void setICD9_7___lt(String ICD9_7___lt) {
        this.ICD9_7___lt = ICD9_7___lt;
    }

    public String getICD9_7___lte() {
        return ICD9_7___lte;
    }
    public void setICD9_7___lte(String ICD9_7___lte) {
        this.ICD9_7___lte = ICD9_7___lte;
    }

    public String getICD9_7___gt() {
        return ICD9_7___gt;
    }
    public void setICD9_7___gt(String ICD9_7___gt) {
        this.ICD9_7___gt = ICD9_7___gt;
    }

    public String getICD9_7___gte() {
        return ICD9_7___gte;
    }
    public void setICD9_7___gte(String ICD9_7___gte) {
        this.ICD9_7___gte = ICD9_7___gte;
    }

    public String getICD9_7___contains() {
        return ICD9_7___contains;
    }
    public void setICD9_7___contains(String ICD9_7___contains) {
        this.ICD9_7___contains = ICD9_7___contains;
    }

    public String getICD9_7___not___contains() {
        return ICD9_7___not___contains;
    }
    public void setICD9_7___not___contains(String ICD9_7___not___contains) {
        this.ICD9_7___not___contains = ICD9_7___not___contains;
    }

    public String getICD9_7___starts_with() {
        return ICD9_7___starts_with;
    }
    public void setICD9_7___starts_with(String ICD9_7___starts_with) {
        this.ICD9_7___starts_with = ICD9_7___starts_with;
    }

    public String getICD9_7___not___starts_with() {
        return ICD9_7___not___starts_with;
    }
    public void setICD9_7___not___starts_with(String ICD9_7___not___starts_with) {
        this.ICD9_7___not___starts_with = ICD9_7___not___starts_with;
    }

    public String getICD9_7___ends_with() {
        return ICD9_7___ends_with;
    }
    public void setICD9_7___ends_with(String ICD9_7___ends_with) {
        this.ICD9_7___ends_with = ICD9_7___ends_with;
    }

    public String getICD9_7___not___ends_with() {
        return ICD9_7___not___ends_with;
    }
    public void setICD9_7___not___ends_with(String ICD9_7___not___ends_with) {
        this.ICD9_7___not___ends_with = ICD9_7___not___ends_with;
    }

    public String getICD9_8___eq() {
        return ICD9_8___eq;
    }
    public void setICD9_8___eq(String ICD9_8___eq) {
        this.ICD9_8___eq = ICD9_8___eq;
    }

    public String getICD9_8___ne() {
        return ICD9_8___ne;
    }
    public void setICD9_8___ne(String ICD9_8___ne) {
        this.ICD9_8___ne = ICD9_8___ne;
    }

    public Boolean getICD9_8___null() {
        return ICD9_8___null;
    }
    public void setICD9_8___null(Boolean ICD9_8___null) {
        this.ICD9_8___null = ICD9_8___null;
    }

    public Boolean getICD9_8___not___null() {
        return ICD9_8___not___null;
    }
    public void setICD9_8___not___null(Boolean ICD9_8___not___null) {
        this.ICD9_8___not___null = ICD9_8___not___null;
    }

    public java.util.List<String> getICD9_8___in() {
        return ICD9_8___in;
    }
    public void setICD9_8___in(java.util.List<String> ICD9_8___in) {
        this.ICD9_8___in = ICD9_8___in;
    }

    public java.util.List<String> getICD9_8___not___in() {
        return ICD9_8___not___in;
    }
    public void setICD9_8___not___in(java.util.List<String> ICD9_8___not___in) {
        this.ICD9_8___not___in = ICD9_8___not___in;
    }

    public String getICD9_8___lt() {
        return ICD9_8___lt;
    }
    public void setICD9_8___lt(String ICD9_8___lt) {
        this.ICD9_8___lt = ICD9_8___lt;
    }

    public String getICD9_8___lte() {
        return ICD9_8___lte;
    }
    public void setICD9_8___lte(String ICD9_8___lte) {
        this.ICD9_8___lte = ICD9_8___lte;
    }

    public String getICD9_8___gt() {
        return ICD9_8___gt;
    }
    public void setICD9_8___gt(String ICD9_8___gt) {
        this.ICD9_8___gt = ICD9_8___gt;
    }

    public String getICD9_8___gte() {
        return ICD9_8___gte;
    }
    public void setICD9_8___gte(String ICD9_8___gte) {
        this.ICD9_8___gte = ICD9_8___gte;
    }

    public String getICD9_8___contains() {
        return ICD9_8___contains;
    }
    public void setICD9_8___contains(String ICD9_8___contains) {
        this.ICD9_8___contains = ICD9_8___contains;
    }

    public String getICD9_8___not___contains() {
        return ICD9_8___not___contains;
    }
    public void setICD9_8___not___contains(String ICD9_8___not___contains) {
        this.ICD9_8___not___contains = ICD9_8___not___contains;
    }

    public String getICD9_8___starts_with() {
        return ICD9_8___starts_with;
    }
    public void setICD9_8___starts_with(String ICD9_8___starts_with) {
        this.ICD9_8___starts_with = ICD9_8___starts_with;
    }

    public String getICD9_8___not___starts_with() {
        return ICD9_8___not___starts_with;
    }
    public void setICD9_8___not___starts_with(String ICD9_8___not___starts_with) {
        this.ICD9_8___not___starts_with = ICD9_8___not___starts_with;
    }

    public String getICD9_8___ends_with() {
        return ICD9_8___ends_with;
    }
    public void setICD9_8___ends_with(String ICD9_8___ends_with) {
        this.ICD9_8___ends_with = ICD9_8___ends_with;
    }

    public String getICD9_8___not___ends_with() {
        return ICD9_8___not___ends_with;
    }
    public void setICD9_8___not___ends_with(String ICD9_8___not___ends_with) {
        this.ICD9_8___not___ends_with = ICD9_8___not___ends_with;
    }

    public String getICD9_9___eq() {
        return ICD9_9___eq;
    }
    public void setICD9_9___eq(String ICD9_9___eq) {
        this.ICD9_9___eq = ICD9_9___eq;
    }

    public String getICD9_9___ne() {
        return ICD9_9___ne;
    }
    public void setICD9_9___ne(String ICD9_9___ne) {
        this.ICD9_9___ne = ICD9_9___ne;
    }

    public Boolean getICD9_9___null() {
        return ICD9_9___null;
    }
    public void setICD9_9___null(Boolean ICD9_9___null) {
        this.ICD9_9___null = ICD9_9___null;
    }

    public Boolean getICD9_9___not___null() {
        return ICD9_9___not___null;
    }
    public void setICD9_9___not___null(Boolean ICD9_9___not___null) {
        this.ICD9_9___not___null = ICD9_9___not___null;
    }

    public java.util.List<String> getICD9_9___in() {
        return ICD9_9___in;
    }
    public void setICD9_9___in(java.util.List<String> ICD9_9___in) {
        this.ICD9_9___in = ICD9_9___in;
    }

    public java.util.List<String> getICD9_9___not___in() {
        return ICD9_9___not___in;
    }
    public void setICD9_9___not___in(java.util.List<String> ICD9_9___not___in) {
        this.ICD9_9___not___in = ICD9_9___not___in;
    }

    public String getICD9_9___lt() {
        return ICD9_9___lt;
    }
    public void setICD9_9___lt(String ICD9_9___lt) {
        this.ICD9_9___lt = ICD9_9___lt;
    }

    public String getICD9_9___lte() {
        return ICD9_9___lte;
    }
    public void setICD9_9___lte(String ICD9_9___lte) {
        this.ICD9_9___lte = ICD9_9___lte;
    }

    public String getICD9_9___gt() {
        return ICD9_9___gt;
    }
    public void setICD9_9___gt(String ICD9_9___gt) {
        this.ICD9_9___gt = ICD9_9___gt;
    }

    public String getICD9_9___gte() {
        return ICD9_9___gte;
    }
    public void setICD9_9___gte(String ICD9_9___gte) {
        this.ICD9_9___gte = ICD9_9___gte;
    }

    public String getICD9_9___contains() {
        return ICD9_9___contains;
    }
    public void setICD9_9___contains(String ICD9_9___contains) {
        this.ICD9_9___contains = ICD9_9___contains;
    }

    public String getICD9_9___not___contains() {
        return ICD9_9___not___contains;
    }
    public void setICD9_9___not___contains(String ICD9_9___not___contains) {
        this.ICD9_9___not___contains = ICD9_9___not___contains;
    }

    public String getICD9_9___starts_with() {
        return ICD9_9___starts_with;
    }
    public void setICD9_9___starts_with(String ICD9_9___starts_with) {
        this.ICD9_9___starts_with = ICD9_9___starts_with;
    }

    public String getICD9_9___not___starts_with() {
        return ICD9_9___not___starts_with;
    }
    public void setICD9_9___not___starts_with(String ICD9_9___not___starts_with) {
        this.ICD9_9___not___starts_with = ICD9_9___not___starts_with;
    }

    public String getICD9_9___ends_with() {
        return ICD9_9___ends_with;
    }
    public void setICD9_9___ends_with(String ICD9_9___ends_with) {
        this.ICD9_9___ends_with = ICD9_9___ends_with;
    }

    public String getICD9_9___not___ends_with() {
        return ICD9_9___not___ends_with;
    }
    public void setICD9_9___not___ends_with(String ICD9_9___not___ends_with) {
        this.ICD9_9___not___ends_with = ICD9_9___not___ends_with;
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

    public String getCodice_centro___eq() {
        return codice_centro___eq;
    }
    public void setCodice_centro___eq(String codice_centro___eq) {
        this.codice_centro___eq = codice_centro___eq;
    }

    public String getCodice_centro___ne() {
        return codice_centro___ne;
    }
    public void setCodice_centro___ne(String codice_centro___ne) {
        this.codice_centro___ne = codice_centro___ne;
    }

    public Boolean getCodice_centro___null() {
        return codice_centro___null;
    }
    public void setCodice_centro___null(Boolean codice_centro___null) {
        this.codice_centro___null = codice_centro___null;
    }

    public Boolean getCodice_centro___not___null() {
        return codice_centro___not___null;
    }
    public void setCodice_centro___not___null(Boolean codice_centro___not___null) {
        this.codice_centro___not___null = codice_centro___not___null;
    }

    public java.util.List<String> getCodice_centro___in() {
        return codice_centro___in;
    }
    public void setCodice_centro___in(java.util.List<String> codice_centro___in) {
        this.codice_centro___in = codice_centro___in;
    }

    public java.util.List<String> getCodice_centro___not___in() {
        return codice_centro___not___in;
    }
    public void setCodice_centro___not___in(java.util.List<String> codice_centro___not___in) {
        this.codice_centro___not___in = codice_centro___not___in;
    }

    public String getCodice_centro___lt() {
        return codice_centro___lt;
    }
    public void setCodice_centro___lt(String codice_centro___lt) {
        this.codice_centro___lt = codice_centro___lt;
    }

    public String getCodice_centro___lte() {
        return codice_centro___lte;
    }
    public void setCodice_centro___lte(String codice_centro___lte) {
        this.codice_centro___lte = codice_centro___lte;
    }

    public String getCodice_centro___gt() {
        return codice_centro___gt;
    }
    public void setCodice_centro___gt(String codice_centro___gt) {
        this.codice_centro___gt = codice_centro___gt;
    }

    public String getCodice_centro___gte() {
        return codice_centro___gte;
    }
    public void setCodice_centro___gte(String codice_centro___gte) {
        this.codice_centro___gte = codice_centro___gte;
    }

    public String getCodice_centro___contains() {
        return codice_centro___contains;
    }
    public void setCodice_centro___contains(String codice_centro___contains) {
        this.codice_centro___contains = codice_centro___contains;
    }

    public String getCodice_centro___not___contains() {
        return codice_centro___not___contains;
    }
    public void setCodice_centro___not___contains(String codice_centro___not___contains) {
        this.codice_centro___not___contains = codice_centro___not___contains;
    }

    public String getCodice_centro___starts_with() {
        return codice_centro___starts_with;
    }
    public void setCodice_centro___starts_with(String codice_centro___starts_with) {
        this.codice_centro___starts_with = codice_centro___starts_with;
    }

    public String getCodice_centro___not___starts_with() {
        return codice_centro___not___starts_with;
    }
    public void setCodice_centro___not___starts_with(String codice_centro___not___starts_with) {
        this.codice_centro___not___starts_with = codice_centro___not___starts_with;
    }

    public String getCodice_centro___ends_with() {
        return codice_centro___ends_with;
    }
    public void setCodice_centro___ends_with(String codice_centro___ends_with) {
        this.codice_centro___ends_with = codice_centro___ends_with;
    }

    public String getCodice_centro___not___ends_with() {
        return codice_centro___not___ends_with;
    }
    public void setCodice_centro___not___ends_with(String codice_centro___not___ends_with) {
        this.codice_centro___not___ends_with = codice_centro___not___ends_with;
    }

    public Boolean getData_approssimata___eq() {
        return data_approssimata___eq;
    }
    public void setData_approssimata___eq(Boolean data_approssimata___eq) {
        this.data_approssimata___eq = data_approssimata___eq;
    }

    public Boolean getData_approssimata___ne() {
        return data_approssimata___ne;
    }
    public void setData_approssimata___ne(Boolean data_approssimata___ne) {
        this.data_approssimata___ne = data_approssimata___ne;
    }

    public Boolean getData_approssimata___null() {
        return data_approssimata___null;
    }
    public void setData_approssimata___null(Boolean data_approssimata___null) {
        this.data_approssimata___null = data_approssimata___null;
    }

    public Boolean getData_approssimata___not___null() {
        return data_approssimata___not___null;
    }
    public void setData_approssimata___not___null(Boolean data_approssimata___not___null) {
        this.data_approssimata___not___null = data_approssimata___not___null;
    }

    public String getData_dimissione___eq() {
        return data_dimissione___eq;
    }
    public void setData_dimissione___eq(String data_dimissione___eq) {
        this.data_dimissione___eq = data_dimissione___eq;
    }

    public String getData_dimissione___ne() {
        return data_dimissione___ne;
    }
    public void setData_dimissione___ne(String data_dimissione___ne) {
        this.data_dimissione___ne = data_dimissione___ne;
    }

    public Boolean getData_dimissione___null() {
        return data_dimissione___null;
    }
    public void setData_dimissione___null(Boolean data_dimissione___null) {
        this.data_dimissione___null = data_dimissione___null;
    }

    public Boolean getData_dimissione___not___null() {
        return data_dimissione___not___null;
    }
    public void setData_dimissione___not___null(Boolean data_dimissione___not___null) {
        this.data_dimissione___not___null = data_dimissione___not___null;
    }

    public java.util.List<String> getData_dimissione___in() {
        return data_dimissione___in;
    }
    public void setData_dimissione___in(java.util.List<String> data_dimissione___in) {
        this.data_dimissione___in = data_dimissione___in;
    }

    public java.util.List<String> getData_dimissione___not___in() {
        return data_dimissione___not___in;
    }
    public void setData_dimissione___not___in(java.util.List<String> data_dimissione___not___in) {
        this.data_dimissione___not___in = data_dimissione___not___in;
    }

    public String getData_dimissione___lt() {
        return data_dimissione___lt;
    }
    public void setData_dimissione___lt(String data_dimissione___lt) {
        this.data_dimissione___lt = data_dimissione___lt;
    }

    public String getData_dimissione___lte() {
        return data_dimissione___lte;
    }
    public void setData_dimissione___lte(String data_dimissione___lte) {
        this.data_dimissione___lte = data_dimissione___lte;
    }

    public String getData_dimissione___gt() {
        return data_dimissione___gt;
    }
    public void setData_dimissione___gt(String data_dimissione___gt) {
        this.data_dimissione___gt = data_dimissione___gt;
    }

    public String getData_dimissione___gte() {
        return data_dimissione___gte;
    }
    public void setData_dimissione___gte(String data_dimissione___gte) {
        this.data_dimissione___gte = data_dimissione___gte;
    }

    public String getData_ricovero___eq() {
        return data_ricovero___eq;
    }
    public void setData_ricovero___eq(String data_ricovero___eq) {
        this.data_ricovero___eq = data_ricovero___eq;
    }

    public String getData_ricovero___ne() {
        return data_ricovero___ne;
    }
    public void setData_ricovero___ne(String data_ricovero___ne) {
        this.data_ricovero___ne = data_ricovero___ne;
    }

    public Boolean getData_ricovero___null() {
        return data_ricovero___null;
    }
    public void setData_ricovero___null(Boolean data_ricovero___null) {
        this.data_ricovero___null = data_ricovero___null;
    }

    public Boolean getData_ricovero___not___null() {
        return data_ricovero___not___null;
    }
    public void setData_ricovero___not___null(Boolean data_ricovero___not___null) {
        this.data_ricovero___not___null = data_ricovero___not___null;
    }

    public java.util.List<String> getData_ricovero___in() {
        return data_ricovero___in;
    }
    public void setData_ricovero___in(java.util.List<String> data_ricovero___in) {
        this.data_ricovero___in = data_ricovero___in;
    }

    public java.util.List<String> getData_ricovero___not___in() {
        return data_ricovero___not___in;
    }
    public void setData_ricovero___not___in(java.util.List<String> data_ricovero___not___in) {
        this.data_ricovero___not___in = data_ricovero___not___in;
    }

    public String getData_ricovero___lt() {
        return data_ricovero___lt;
    }
    public void setData_ricovero___lt(String data_ricovero___lt) {
        this.data_ricovero___lt = data_ricovero___lt;
    }

    public String getData_ricovero___lte() {
        return data_ricovero___lte;
    }
    public void setData_ricovero___lte(String data_ricovero___lte) {
        this.data_ricovero___lte = data_ricovero___lte;
    }

    public String getData_ricovero___gt() {
        return data_ricovero___gt;
    }
    public void setData_ricovero___gt(String data_ricovero___gt) {
        this.data_ricovero___gt = data_ricovero___gt;
    }

    public String getData_ricovero___gte() {
        return data_ricovero___gte;
    }
    public void setData_ricovero___gte(String data_ricovero___gte) {
        this.data_ricovero___gte = data_ricovero___gte;
    }

    public String getDiagnosi___eq() {
        return diagnosi___eq;
    }
    public void setDiagnosi___eq(String diagnosi___eq) {
        this.diagnosi___eq = diagnosi___eq;
    }

    public String getDiagnosi___ne() {
        return diagnosi___ne;
    }
    public void setDiagnosi___ne(String diagnosi___ne) {
        this.diagnosi___ne = diagnosi___ne;
    }

    public Boolean getDiagnosi___null() {
        return diagnosi___null;
    }
    public void setDiagnosi___null(Boolean diagnosi___null) {
        this.diagnosi___null = diagnosi___null;
    }

    public Boolean getDiagnosi___not___null() {
        return diagnosi___not___null;
    }
    public void setDiagnosi___not___null(Boolean diagnosi___not___null) {
        this.diagnosi___not___null = diagnosi___not___null;
    }

    public java.util.List<String> getDiagnosi___in() {
        return diagnosi___in;
    }
    public void setDiagnosi___in(java.util.List<String> diagnosi___in) {
        this.diagnosi___in = diagnosi___in;
    }

    public java.util.List<String> getDiagnosi___not___in() {
        return diagnosi___not___in;
    }
    public void setDiagnosi___not___in(java.util.List<String> diagnosi___not___in) {
        this.diagnosi___not___in = diagnosi___not___in;
    }

    public String getDiagnosi___lt() {
        return diagnosi___lt;
    }
    public void setDiagnosi___lt(String diagnosi___lt) {
        this.diagnosi___lt = diagnosi___lt;
    }

    public String getDiagnosi___lte() {
        return diagnosi___lte;
    }
    public void setDiagnosi___lte(String diagnosi___lte) {
        this.diagnosi___lte = diagnosi___lte;
    }

    public String getDiagnosi___gt() {
        return diagnosi___gt;
    }
    public void setDiagnosi___gt(String diagnosi___gt) {
        this.diagnosi___gt = diagnosi___gt;
    }

    public String getDiagnosi___gte() {
        return diagnosi___gte;
    }
    public void setDiagnosi___gte(String diagnosi___gte) {
        this.diagnosi___gte = diagnosi___gte;
    }

    public String getDiagnosi___contains() {
        return diagnosi___contains;
    }
    public void setDiagnosi___contains(String diagnosi___contains) {
        this.diagnosi___contains = diagnosi___contains;
    }

    public String getDiagnosi___not___contains() {
        return diagnosi___not___contains;
    }
    public void setDiagnosi___not___contains(String diagnosi___not___contains) {
        this.diagnosi___not___contains = diagnosi___not___contains;
    }

    public String getDiagnosi___starts_with() {
        return diagnosi___starts_with;
    }
    public void setDiagnosi___starts_with(String diagnosi___starts_with) {
        this.diagnosi___starts_with = diagnosi___starts_with;
    }

    public String getDiagnosi___not___starts_with() {
        return diagnosi___not___starts_with;
    }
    public void setDiagnosi___not___starts_with(String diagnosi___not___starts_with) {
        this.diagnosi___not___starts_with = diagnosi___not___starts_with;
    }

    public String getDiagnosi___ends_with() {
        return diagnosi___ends_with;
    }
    public void setDiagnosi___ends_with(String diagnosi___ends_with) {
        this.diagnosi___ends_with = diagnosi___ends_with;
    }

    public String getDiagnosi___not___ends_with() {
        return diagnosi___not___ends_with;
    }
    public void setDiagnosi___not___ends_with(String diagnosi___not___ends_with) {
        this.diagnosi___not___ends_with = diagnosi___not___ends_with;
    }

    public java.util.List<CliRicoveroFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliRicoveroFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliRicoveroFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliRicoveroFilterDTO> OR) {
        this.OR = OR;
    }

    public CliRicoveroFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliRicoveroFilterDTO NOT) {
        this.NOT = NOT;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId___eq != null) {
            joiner.add("_clientId___eq: " + GraphQLRequestSerializer.getEntry(_clientId___eq));
        }
        if (ICD9_1___eq != null) {
            joiner.add("ICD9_1___eq: " + GraphQLRequestSerializer.getEntry(ICD9_1___eq));
        }
        if (ICD9_1___ne != null) {
            joiner.add("ICD9_1___ne: " + GraphQLRequestSerializer.getEntry(ICD9_1___ne));
        }
        if (ICD9_1___null != null) {
            joiner.add("ICD9_1___null: " + GraphQLRequestSerializer.getEntry(ICD9_1___null));
        }
        if (ICD9_1___not___null != null) {
            joiner.add("ICD9_1___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_1___not___null));
        }
        if (ICD9_1___in != null) {
            joiner.add("ICD9_1___in: " + GraphQLRequestSerializer.getEntry(ICD9_1___in));
        }
        if (ICD9_1___not___in != null) {
            joiner.add("ICD9_1___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_1___not___in));
        }
        if (ICD9_1___lt != null) {
            joiner.add("ICD9_1___lt: " + GraphQLRequestSerializer.getEntry(ICD9_1___lt));
        }
        if (ICD9_1___lte != null) {
            joiner.add("ICD9_1___lte: " + GraphQLRequestSerializer.getEntry(ICD9_1___lte));
        }
        if (ICD9_1___gt != null) {
            joiner.add("ICD9_1___gt: " + GraphQLRequestSerializer.getEntry(ICD9_1___gt));
        }
        if (ICD9_1___gte != null) {
            joiner.add("ICD9_1___gte: " + GraphQLRequestSerializer.getEntry(ICD9_1___gte));
        }
        if (ICD9_1___contains != null) {
            joiner.add("ICD9_1___contains: " + GraphQLRequestSerializer.getEntry(ICD9_1___contains));
        }
        if (ICD9_1___not___contains != null) {
            joiner.add("ICD9_1___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_1___not___contains));
        }
        if (ICD9_1___starts_with != null) {
            joiner.add("ICD9_1___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_1___starts_with));
        }
        if (ICD9_1___not___starts_with != null) {
            joiner.add("ICD9_1___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_1___not___starts_with));
        }
        if (ICD9_1___ends_with != null) {
            joiner.add("ICD9_1___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_1___ends_with));
        }
        if (ICD9_1___not___ends_with != null) {
            joiner.add("ICD9_1___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_1___not___ends_with));
        }
        if (ICD9_10___eq != null) {
            joiner.add("ICD9_10___eq: " + GraphQLRequestSerializer.getEntry(ICD9_10___eq));
        }
        if (ICD9_10___ne != null) {
            joiner.add("ICD9_10___ne: " + GraphQLRequestSerializer.getEntry(ICD9_10___ne));
        }
        if (ICD9_10___null != null) {
            joiner.add("ICD9_10___null: " + GraphQLRequestSerializer.getEntry(ICD9_10___null));
        }
        if (ICD9_10___not___null != null) {
            joiner.add("ICD9_10___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_10___not___null));
        }
        if (ICD9_10___in != null) {
            joiner.add("ICD9_10___in: " + GraphQLRequestSerializer.getEntry(ICD9_10___in));
        }
        if (ICD9_10___not___in != null) {
            joiner.add("ICD9_10___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_10___not___in));
        }
        if (ICD9_10___lt != null) {
            joiner.add("ICD9_10___lt: " + GraphQLRequestSerializer.getEntry(ICD9_10___lt));
        }
        if (ICD9_10___lte != null) {
            joiner.add("ICD9_10___lte: " + GraphQLRequestSerializer.getEntry(ICD9_10___lte));
        }
        if (ICD9_10___gt != null) {
            joiner.add("ICD9_10___gt: " + GraphQLRequestSerializer.getEntry(ICD9_10___gt));
        }
        if (ICD9_10___gte != null) {
            joiner.add("ICD9_10___gte: " + GraphQLRequestSerializer.getEntry(ICD9_10___gte));
        }
        if (ICD9_10___contains != null) {
            joiner.add("ICD9_10___contains: " + GraphQLRequestSerializer.getEntry(ICD9_10___contains));
        }
        if (ICD9_10___not___contains != null) {
            joiner.add("ICD9_10___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_10___not___contains));
        }
        if (ICD9_10___starts_with != null) {
            joiner.add("ICD9_10___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_10___starts_with));
        }
        if (ICD9_10___not___starts_with != null) {
            joiner.add("ICD9_10___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_10___not___starts_with));
        }
        if (ICD9_10___ends_with != null) {
            joiner.add("ICD9_10___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_10___ends_with));
        }
        if (ICD9_10___not___ends_with != null) {
            joiner.add("ICD9_10___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_10___not___ends_with));
        }
        if (ICD9_2___eq != null) {
            joiner.add("ICD9_2___eq: " + GraphQLRequestSerializer.getEntry(ICD9_2___eq));
        }
        if (ICD9_2___ne != null) {
            joiner.add("ICD9_2___ne: " + GraphQLRequestSerializer.getEntry(ICD9_2___ne));
        }
        if (ICD9_2___null != null) {
            joiner.add("ICD9_2___null: " + GraphQLRequestSerializer.getEntry(ICD9_2___null));
        }
        if (ICD9_2___not___null != null) {
            joiner.add("ICD9_2___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_2___not___null));
        }
        if (ICD9_2___in != null) {
            joiner.add("ICD9_2___in: " + GraphQLRequestSerializer.getEntry(ICD9_2___in));
        }
        if (ICD9_2___not___in != null) {
            joiner.add("ICD9_2___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_2___not___in));
        }
        if (ICD9_2___lt != null) {
            joiner.add("ICD9_2___lt: " + GraphQLRequestSerializer.getEntry(ICD9_2___lt));
        }
        if (ICD9_2___lte != null) {
            joiner.add("ICD9_2___lte: " + GraphQLRequestSerializer.getEntry(ICD9_2___lte));
        }
        if (ICD9_2___gt != null) {
            joiner.add("ICD9_2___gt: " + GraphQLRequestSerializer.getEntry(ICD9_2___gt));
        }
        if (ICD9_2___gte != null) {
            joiner.add("ICD9_2___gte: " + GraphQLRequestSerializer.getEntry(ICD9_2___gte));
        }
        if (ICD9_2___contains != null) {
            joiner.add("ICD9_2___contains: " + GraphQLRequestSerializer.getEntry(ICD9_2___contains));
        }
        if (ICD9_2___not___contains != null) {
            joiner.add("ICD9_2___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_2___not___contains));
        }
        if (ICD9_2___starts_with != null) {
            joiner.add("ICD9_2___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_2___starts_with));
        }
        if (ICD9_2___not___starts_with != null) {
            joiner.add("ICD9_2___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_2___not___starts_with));
        }
        if (ICD9_2___ends_with != null) {
            joiner.add("ICD9_2___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_2___ends_with));
        }
        if (ICD9_2___not___ends_with != null) {
            joiner.add("ICD9_2___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_2___not___ends_with));
        }
        if (ICD9_3___eq != null) {
            joiner.add("ICD9_3___eq: " + GraphQLRequestSerializer.getEntry(ICD9_3___eq));
        }
        if (ICD9_3___ne != null) {
            joiner.add("ICD9_3___ne: " + GraphQLRequestSerializer.getEntry(ICD9_3___ne));
        }
        if (ICD9_3___null != null) {
            joiner.add("ICD9_3___null: " + GraphQLRequestSerializer.getEntry(ICD9_3___null));
        }
        if (ICD9_3___not___null != null) {
            joiner.add("ICD9_3___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_3___not___null));
        }
        if (ICD9_3___in != null) {
            joiner.add("ICD9_3___in: " + GraphQLRequestSerializer.getEntry(ICD9_3___in));
        }
        if (ICD9_3___not___in != null) {
            joiner.add("ICD9_3___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_3___not___in));
        }
        if (ICD9_3___lt != null) {
            joiner.add("ICD9_3___lt: " + GraphQLRequestSerializer.getEntry(ICD9_3___lt));
        }
        if (ICD9_3___lte != null) {
            joiner.add("ICD9_3___lte: " + GraphQLRequestSerializer.getEntry(ICD9_3___lte));
        }
        if (ICD9_3___gt != null) {
            joiner.add("ICD9_3___gt: " + GraphQLRequestSerializer.getEntry(ICD9_3___gt));
        }
        if (ICD9_3___gte != null) {
            joiner.add("ICD9_3___gte: " + GraphQLRequestSerializer.getEntry(ICD9_3___gte));
        }
        if (ICD9_3___contains != null) {
            joiner.add("ICD9_3___contains: " + GraphQLRequestSerializer.getEntry(ICD9_3___contains));
        }
        if (ICD9_3___not___contains != null) {
            joiner.add("ICD9_3___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_3___not___contains));
        }
        if (ICD9_3___starts_with != null) {
            joiner.add("ICD9_3___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_3___starts_with));
        }
        if (ICD9_3___not___starts_with != null) {
            joiner.add("ICD9_3___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_3___not___starts_with));
        }
        if (ICD9_3___ends_with != null) {
            joiner.add("ICD9_3___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_3___ends_with));
        }
        if (ICD9_3___not___ends_with != null) {
            joiner.add("ICD9_3___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_3___not___ends_with));
        }
        if (ICD9_4___eq != null) {
            joiner.add("ICD9_4___eq: " + GraphQLRequestSerializer.getEntry(ICD9_4___eq));
        }
        if (ICD9_4___ne != null) {
            joiner.add("ICD9_4___ne: " + GraphQLRequestSerializer.getEntry(ICD9_4___ne));
        }
        if (ICD9_4___null != null) {
            joiner.add("ICD9_4___null: " + GraphQLRequestSerializer.getEntry(ICD9_4___null));
        }
        if (ICD9_4___not___null != null) {
            joiner.add("ICD9_4___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_4___not___null));
        }
        if (ICD9_4___in != null) {
            joiner.add("ICD9_4___in: " + GraphQLRequestSerializer.getEntry(ICD9_4___in));
        }
        if (ICD9_4___not___in != null) {
            joiner.add("ICD9_4___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_4___not___in));
        }
        if (ICD9_4___lt != null) {
            joiner.add("ICD9_4___lt: " + GraphQLRequestSerializer.getEntry(ICD9_4___lt));
        }
        if (ICD9_4___lte != null) {
            joiner.add("ICD9_4___lte: " + GraphQLRequestSerializer.getEntry(ICD9_4___lte));
        }
        if (ICD9_4___gt != null) {
            joiner.add("ICD9_4___gt: " + GraphQLRequestSerializer.getEntry(ICD9_4___gt));
        }
        if (ICD9_4___gte != null) {
            joiner.add("ICD9_4___gte: " + GraphQLRequestSerializer.getEntry(ICD9_4___gte));
        }
        if (ICD9_4___contains != null) {
            joiner.add("ICD9_4___contains: " + GraphQLRequestSerializer.getEntry(ICD9_4___contains));
        }
        if (ICD9_4___not___contains != null) {
            joiner.add("ICD9_4___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_4___not___contains));
        }
        if (ICD9_4___starts_with != null) {
            joiner.add("ICD9_4___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_4___starts_with));
        }
        if (ICD9_4___not___starts_with != null) {
            joiner.add("ICD9_4___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_4___not___starts_with));
        }
        if (ICD9_4___ends_with != null) {
            joiner.add("ICD9_4___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_4___ends_with));
        }
        if (ICD9_4___not___ends_with != null) {
            joiner.add("ICD9_4___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_4___not___ends_with));
        }
        if (ICD9_5___eq != null) {
            joiner.add("ICD9_5___eq: " + GraphQLRequestSerializer.getEntry(ICD9_5___eq));
        }
        if (ICD9_5___ne != null) {
            joiner.add("ICD9_5___ne: " + GraphQLRequestSerializer.getEntry(ICD9_5___ne));
        }
        if (ICD9_5___null != null) {
            joiner.add("ICD9_5___null: " + GraphQLRequestSerializer.getEntry(ICD9_5___null));
        }
        if (ICD9_5___not___null != null) {
            joiner.add("ICD9_5___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_5___not___null));
        }
        if (ICD9_5___in != null) {
            joiner.add("ICD9_5___in: " + GraphQLRequestSerializer.getEntry(ICD9_5___in));
        }
        if (ICD9_5___not___in != null) {
            joiner.add("ICD9_5___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_5___not___in));
        }
        if (ICD9_5___lt != null) {
            joiner.add("ICD9_5___lt: " + GraphQLRequestSerializer.getEntry(ICD9_5___lt));
        }
        if (ICD9_5___lte != null) {
            joiner.add("ICD9_5___lte: " + GraphQLRequestSerializer.getEntry(ICD9_5___lte));
        }
        if (ICD9_5___gt != null) {
            joiner.add("ICD9_5___gt: " + GraphQLRequestSerializer.getEntry(ICD9_5___gt));
        }
        if (ICD9_5___gte != null) {
            joiner.add("ICD9_5___gte: " + GraphQLRequestSerializer.getEntry(ICD9_5___gte));
        }
        if (ICD9_5___contains != null) {
            joiner.add("ICD9_5___contains: " + GraphQLRequestSerializer.getEntry(ICD9_5___contains));
        }
        if (ICD9_5___not___contains != null) {
            joiner.add("ICD9_5___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_5___not___contains));
        }
        if (ICD9_5___starts_with != null) {
            joiner.add("ICD9_5___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_5___starts_with));
        }
        if (ICD9_5___not___starts_with != null) {
            joiner.add("ICD9_5___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_5___not___starts_with));
        }
        if (ICD9_5___ends_with != null) {
            joiner.add("ICD9_5___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_5___ends_with));
        }
        if (ICD9_5___not___ends_with != null) {
            joiner.add("ICD9_5___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_5___not___ends_with));
        }
        if (ICD9_6___eq != null) {
            joiner.add("ICD9_6___eq: " + GraphQLRequestSerializer.getEntry(ICD9_6___eq));
        }
        if (ICD9_6___ne != null) {
            joiner.add("ICD9_6___ne: " + GraphQLRequestSerializer.getEntry(ICD9_6___ne));
        }
        if (ICD9_6___null != null) {
            joiner.add("ICD9_6___null: " + GraphQLRequestSerializer.getEntry(ICD9_6___null));
        }
        if (ICD9_6___not___null != null) {
            joiner.add("ICD9_6___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_6___not___null));
        }
        if (ICD9_6___in != null) {
            joiner.add("ICD9_6___in: " + GraphQLRequestSerializer.getEntry(ICD9_6___in));
        }
        if (ICD9_6___not___in != null) {
            joiner.add("ICD9_6___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_6___not___in));
        }
        if (ICD9_6___lt != null) {
            joiner.add("ICD9_6___lt: " + GraphQLRequestSerializer.getEntry(ICD9_6___lt));
        }
        if (ICD9_6___lte != null) {
            joiner.add("ICD9_6___lte: " + GraphQLRequestSerializer.getEntry(ICD9_6___lte));
        }
        if (ICD9_6___gt != null) {
            joiner.add("ICD9_6___gt: " + GraphQLRequestSerializer.getEntry(ICD9_6___gt));
        }
        if (ICD9_6___gte != null) {
            joiner.add("ICD9_6___gte: " + GraphQLRequestSerializer.getEntry(ICD9_6___gte));
        }
        if (ICD9_6___contains != null) {
            joiner.add("ICD9_6___contains: " + GraphQLRequestSerializer.getEntry(ICD9_6___contains));
        }
        if (ICD9_6___not___contains != null) {
            joiner.add("ICD9_6___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_6___not___contains));
        }
        if (ICD9_6___starts_with != null) {
            joiner.add("ICD9_6___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_6___starts_with));
        }
        if (ICD9_6___not___starts_with != null) {
            joiner.add("ICD9_6___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_6___not___starts_with));
        }
        if (ICD9_6___ends_with != null) {
            joiner.add("ICD9_6___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_6___ends_with));
        }
        if (ICD9_6___not___ends_with != null) {
            joiner.add("ICD9_6___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_6___not___ends_with));
        }
        if (ICD9_7___eq != null) {
            joiner.add("ICD9_7___eq: " + GraphQLRequestSerializer.getEntry(ICD9_7___eq));
        }
        if (ICD9_7___ne != null) {
            joiner.add("ICD9_7___ne: " + GraphQLRequestSerializer.getEntry(ICD9_7___ne));
        }
        if (ICD9_7___null != null) {
            joiner.add("ICD9_7___null: " + GraphQLRequestSerializer.getEntry(ICD9_7___null));
        }
        if (ICD9_7___not___null != null) {
            joiner.add("ICD9_7___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_7___not___null));
        }
        if (ICD9_7___in != null) {
            joiner.add("ICD9_7___in: " + GraphQLRequestSerializer.getEntry(ICD9_7___in));
        }
        if (ICD9_7___not___in != null) {
            joiner.add("ICD9_7___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_7___not___in));
        }
        if (ICD9_7___lt != null) {
            joiner.add("ICD9_7___lt: " + GraphQLRequestSerializer.getEntry(ICD9_7___lt));
        }
        if (ICD9_7___lte != null) {
            joiner.add("ICD9_7___lte: " + GraphQLRequestSerializer.getEntry(ICD9_7___lte));
        }
        if (ICD9_7___gt != null) {
            joiner.add("ICD9_7___gt: " + GraphQLRequestSerializer.getEntry(ICD9_7___gt));
        }
        if (ICD9_7___gte != null) {
            joiner.add("ICD9_7___gte: " + GraphQLRequestSerializer.getEntry(ICD9_7___gte));
        }
        if (ICD9_7___contains != null) {
            joiner.add("ICD9_7___contains: " + GraphQLRequestSerializer.getEntry(ICD9_7___contains));
        }
        if (ICD9_7___not___contains != null) {
            joiner.add("ICD9_7___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_7___not___contains));
        }
        if (ICD9_7___starts_with != null) {
            joiner.add("ICD9_7___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_7___starts_with));
        }
        if (ICD9_7___not___starts_with != null) {
            joiner.add("ICD9_7___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_7___not___starts_with));
        }
        if (ICD9_7___ends_with != null) {
            joiner.add("ICD9_7___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_7___ends_with));
        }
        if (ICD9_7___not___ends_with != null) {
            joiner.add("ICD9_7___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_7___not___ends_with));
        }
        if (ICD9_8___eq != null) {
            joiner.add("ICD9_8___eq: " + GraphQLRequestSerializer.getEntry(ICD9_8___eq));
        }
        if (ICD9_8___ne != null) {
            joiner.add("ICD9_8___ne: " + GraphQLRequestSerializer.getEntry(ICD9_8___ne));
        }
        if (ICD9_8___null != null) {
            joiner.add("ICD9_8___null: " + GraphQLRequestSerializer.getEntry(ICD9_8___null));
        }
        if (ICD9_8___not___null != null) {
            joiner.add("ICD9_8___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_8___not___null));
        }
        if (ICD9_8___in != null) {
            joiner.add("ICD9_8___in: " + GraphQLRequestSerializer.getEntry(ICD9_8___in));
        }
        if (ICD9_8___not___in != null) {
            joiner.add("ICD9_8___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_8___not___in));
        }
        if (ICD9_8___lt != null) {
            joiner.add("ICD9_8___lt: " + GraphQLRequestSerializer.getEntry(ICD9_8___lt));
        }
        if (ICD9_8___lte != null) {
            joiner.add("ICD9_8___lte: " + GraphQLRequestSerializer.getEntry(ICD9_8___lte));
        }
        if (ICD9_8___gt != null) {
            joiner.add("ICD9_8___gt: " + GraphQLRequestSerializer.getEntry(ICD9_8___gt));
        }
        if (ICD9_8___gte != null) {
            joiner.add("ICD9_8___gte: " + GraphQLRequestSerializer.getEntry(ICD9_8___gte));
        }
        if (ICD9_8___contains != null) {
            joiner.add("ICD9_8___contains: " + GraphQLRequestSerializer.getEntry(ICD9_8___contains));
        }
        if (ICD9_8___not___contains != null) {
            joiner.add("ICD9_8___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_8___not___contains));
        }
        if (ICD9_8___starts_with != null) {
            joiner.add("ICD9_8___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_8___starts_with));
        }
        if (ICD9_8___not___starts_with != null) {
            joiner.add("ICD9_8___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_8___not___starts_with));
        }
        if (ICD9_8___ends_with != null) {
            joiner.add("ICD9_8___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_8___ends_with));
        }
        if (ICD9_8___not___ends_with != null) {
            joiner.add("ICD9_8___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_8___not___ends_with));
        }
        if (ICD9_9___eq != null) {
            joiner.add("ICD9_9___eq: " + GraphQLRequestSerializer.getEntry(ICD9_9___eq));
        }
        if (ICD9_9___ne != null) {
            joiner.add("ICD9_9___ne: " + GraphQLRequestSerializer.getEntry(ICD9_9___ne));
        }
        if (ICD9_9___null != null) {
            joiner.add("ICD9_9___null: " + GraphQLRequestSerializer.getEntry(ICD9_9___null));
        }
        if (ICD9_9___not___null != null) {
            joiner.add("ICD9_9___not___null: " + GraphQLRequestSerializer.getEntry(ICD9_9___not___null));
        }
        if (ICD9_9___in != null) {
            joiner.add("ICD9_9___in: " + GraphQLRequestSerializer.getEntry(ICD9_9___in));
        }
        if (ICD9_9___not___in != null) {
            joiner.add("ICD9_9___not___in: " + GraphQLRequestSerializer.getEntry(ICD9_9___not___in));
        }
        if (ICD9_9___lt != null) {
            joiner.add("ICD9_9___lt: " + GraphQLRequestSerializer.getEntry(ICD9_9___lt));
        }
        if (ICD9_9___lte != null) {
            joiner.add("ICD9_9___lte: " + GraphQLRequestSerializer.getEntry(ICD9_9___lte));
        }
        if (ICD9_9___gt != null) {
            joiner.add("ICD9_9___gt: " + GraphQLRequestSerializer.getEntry(ICD9_9___gt));
        }
        if (ICD9_9___gte != null) {
            joiner.add("ICD9_9___gte: " + GraphQLRequestSerializer.getEntry(ICD9_9___gte));
        }
        if (ICD9_9___contains != null) {
            joiner.add("ICD9_9___contains: " + GraphQLRequestSerializer.getEntry(ICD9_9___contains));
        }
        if (ICD9_9___not___contains != null) {
            joiner.add("ICD9_9___not___contains: " + GraphQLRequestSerializer.getEntry(ICD9_9___not___contains));
        }
        if (ICD9_9___starts_with != null) {
            joiner.add("ICD9_9___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_9___starts_with));
        }
        if (ICD9_9___not___starts_with != null) {
            joiner.add("ICD9_9___not___starts_with: " + GraphQLRequestSerializer.getEntry(ICD9_9___not___starts_with));
        }
        if (ICD9_9___ends_with != null) {
            joiner.add("ICD9_9___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_9___ends_with));
        }
        if (ICD9_9___not___ends_with != null) {
            joiner.add("ICD9_9___not___ends_with: " + GraphQLRequestSerializer.getEntry(ICD9_9___not___ends_with));
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
        if (codice_centro___eq != null) {
            joiner.add("codice_centro___eq: " + GraphQLRequestSerializer.getEntry(codice_centro___eq));
        }
        if (codice_centro___ne != null) {
            joiner.add("codice_centro___ne: " + GraphQLRequestSerializer.getEntry(codice_centro___ne));
        }
        if (codice_centro___null != null) {
            joiner.add("codice_centro___null: " + GraphQLRequestSerializer.getEntry(codice_centro___null));
        }
        if (codice_centro___not___null != null) {
            joiner.add("codice_centro___not___null: " + GraphQLRequestSerializer.getEntry(codice_centro___not___null));
        }
        if (codice_centro___in != null) {
            joiner.add("codice_centro___in: " + GraphQLRequestSerializer.getEntry(codice_centro___in));
        }
        if (codice_centro___not___in != null) {
            joiner.add("codice_centro___not___in: " + GraphQLRequestSerializer.getEntry(codice_centro___not___in));
        }
        if (codice_centro___lt != null) {
            joiner.add("codice_centro___lt: " + GraphQLRequestSerializer.getEntry(codice_centro___lt));
        }
        if (codice_centro___lte != null) {
            joiner.add("codice_centro___lte: " + GraphQLRequestSerializer.getEntry(codice_centro___lte));
        }
        if (codice_centro___gt != null) {
            joiner.add("codice_centro___gt: " + GraphQLRequestSerializer.getEntry(codice_centro___gt));
        }
        if (codice_centro___gte != null) {
            joiner.add("codice_centro___gte: " + GraphQLRequestSerializer.getEntry(codice_centro___gte));
        }
        if (codice_centro___contains != null) {
            joiner.add("codice_centro___contains: " + GraphQLRequestSerializer.getEntry(codice_centro___contains));
        }
        if (codice_centro___not___contains != null) {
            joiner.add("codice_centro___not___contains: " + GraphQLRequestSerializer.getEntry(codice_centro___not___contains));
        }
        if (codice_centro___starts_with != null) {
            joiner.add("codice_centro___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro___starts_with));
        }
        if (codice_centro___not___starts_with != null) {
            joiner.add("codice_centro___not___starts_with: " + GraphQLRequestSerializer.getEntry(codice_centro___not___starts_with));
        }
        if (codice_centro___ends_with != null) {
            joiner.add("codice_centro___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro___ends_with));
        }
        if (codice_centro___not___ends_with != null) {
            joiner.add("codice_centro___not___ends_with: " + GraphQLRequestSerializer.getEntry(codice_centro___not___ends_with));
        }
        if (data_approssimata___eq != null) {
            joiner.add("data_approssimata___eq: " + GraphQLRequestSerializer.getEntry(data_approssimata___eq));
        }
        if (data_approssimata___ne != null) {
            joiner.add("data_approssimata___ne: " + GraphQLRequestSerializer.getEntry(data_approssimata___ne));
        }
        if (data_approssimata___null != null) {
            joiner.add("data_approssimata___null: " + GraphQLRequestSerializer.getEntry(data_approssimata___null));
        }
        if (data_approssimata___not___null != null) {
            joiner.add("data_approssimata___not___null: " + GraphQLRequestSerializer.getEntry(data_approssimata___not___null));
        }
        if (data_dimissione___eq != null) {
            joiner.add("data_dimissione___eq: " + GraphQLRequestSerializer.getEntry(data_dimissione___eq));
        }
        if (data_dimissione___ne != null) {
            joiner.add("data_dimissione___ne: " + GraphQLRequestSerializer.getEntry(data_dimissione___ne));
        }
        if (data_dimissione___null != null) {
            joiner.add("data_dimissione___null: " + GraphQLRequestSerializer.getEntry(data_dimissione___null));
        }
        if (data_dimissione___not___null != null) {
            joiner.add("data_dimissione___not___null: " + GraphQLRequestSerializer.getEntry(data_dimissione___not___null));
        }
        if (data_dimissione___in != null) {
            joiner.add("data_dimissione___in: " + GraphQLRequestSerializer.getEntry(data_dimissione___in));
        }
        if (data_dimissione___not___in != null) {
            joiner.add("data_dimissione___not___in: " + GraphQLRequestSerializer.getEntry(data_dimissione___not___in));
        }
        if (data_dimissione___lt != null) {
            joiner.add("data_dimissione___lt: " + GraphQLRequestSerializer.getEntry(data_dimissione___lt));
        }
        if (data_dimissione___lte != null) {
            joiner.add("data_dimissione___lte: " + GraphQLRequestSerializer.getEntry(data_dimissione___lte));
        }
        if (data_dimissione___gt != null) {
            joiner.add("data_dimissione___gt: " + GraphQLRequestSerializer.getEntry(data_dimissione___gt));
        }
        if (data_dimissione___gte != null) {
            joiner.add("data_dimissione___gte: " + GraphQLRequestSerializer.getEntry(data_dimissione___gte));
        }
        if (data_ricovero___eq != null) {
            joiner.add("data_ricovero___eq: " + GraphQLRequestSerializer.getEntry(data_ricovero___eq));
        }
        if (data_ricovero___ne != null) {
            joiner.add("data_ricovero___ne: " + GraphQLRequestSerializer.getEntry(data_ricovero___ne));
        }
        if (data_ricovero___null != null) {
            joiner.add("data_ricovero___null: " + GraphQLRequestSerializer.getEntry(data_ricovero___null));
        }
        if (data_ricovero___not___null != null) {
            joiner.add("data_ricovero___not___null: " + GraphQLRequestSerializer.getEntry(data_ricovero___not___null));
        }
        if (data_ricovero___in != null) {
            joiner.add("data_ricovero___in: " + GraphQLRequestSerializer.getEntry(data_ricovero___in));
        }
        if (data_ricovero___not___in != null) {
            joiner.add("data_ricovero___not___in: " + GraphQLRequestSerializer.getEntry(data_ricovero___not___in));
        }
        if (data_ricovero___lt != null) {
            joiner.add("data_ricovero___lt: " + GraphQLRequestSerializer.getEntry(data_ricovero___lt));
        }
        if (data_ricovero___lte != null) {
            joiner.add("data_ricovero___lte: " + GraphQLRequestSerializer.getEntry(data_ricovero___lte));
        }
        if (data_ricovero___gt != null) {
            joiner.add("data_ricovero___gt: " + GraphQLRequestSerializer.getEntry(data_ricovero___gt));
        }
        if (data_ricovero___gte != null) {
            joiner.add("data_ricovero___gte: " + GraphQLRequestSerializer.getEntry(data_ricovero___gte));
        }
        if (diagnosi___eq != null) {
            joiner.add("diagnosi___eq: " + GraphQLRequestSerializer.getEntry(diagnosi___eq));
        }
        if (diagnosi___ne != null) {
            joiner.add("diagnosi___ne: " + GraphQLRequestSerializer.getEntry(diagnosi___ne));
        }
        if (diagnosi___null != null) {
            joiner.add("diagnosi___null: " + GraphQLRequestSerializer.getEntry(diagnosi___null));
        }
        if (diagnosi___not___null != null) {
            joiner.add("diagnosi___not___null: " + GraphQLRequestSerializer.getEntry(diagnosi___not___null));
        }
        if (diagnosi___in != null) {
            joiner.add("diagnosi___in: " + GraphQLRequestSerializer.getEntry(diagnosi___in));
        }
        if (diagnosi___not___in != null) {
            joiner.add("diagnosi___not___in: " + GraphQLRequestSerializer.getEntry(diagnosi___not___in));
        }
        if (diagnosi___lt != null) {
            joiner.add("diagnosi___lt: " + GraphQLRequestSerializer.getEntry(diagnosi___lt));
        }
        if (diagnosi___lte != null) {
            joiner.add("diagnosi___lte: " + GraphQLRequestSerializer.getEntry(diagnosi___lte));
        }
        if (diagnosi___gt != null) {
            joiner.add("diagnosi___gt: " + GraphQLRequestSerializer.getEntry(diagnosi___gt));
        }
        if (diagnosi___gte != null) {
            joiner.add("diagnosi___gte: " + GraphQLRequestSerializer.getEntry(diagnosi___gte));
        }
        if (diagnosi___contains != null) {
            joiner.add("diagnosi___contains: " + GraphQLRequestSerializer.getEntry(diagnosi___contains));
        }
        if (diagnosi___not___contains != null) {
            joiner.add("diagnosi___not___contains: " + GraphQLRequestSerializer.getEntry(diagnosi___not___contains));
        }
        if (diagnosi___starts_with != null) {
            joiner.add("diagnosi___starts_with: " + GraphQLRequestSerializer.getEntry(diagnosi___starts_with));
        }
        if (diagnosi___not___starts_with != null) {
            joiner.add("diagnosi___not___starts_with: " + GraphQLRequestSerializer.getEntry(diagnosi___not___starts_with));
        }
        if (diagnosi___ends_with != null) {
            joiner.add("diagnosi___ends_with: " + GraphQLRequestSerializer.getEntry(diagnosi___ends_with));
        }
        if (diagnosi___not___ends_with != null) {
            joiner.add("diagnosi___not___ends_with: " + GraphQLRequestSerializer.getEntry(diagnosi___not___ends_with));
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

    public static CliRicoveroFilterDTO.Builder builder() {
        return new CliRicoveroFilterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId___eq;
        private String ICD9_1___eq;
        private String ICD9_1___ne;
        private Boolean ICD9_1___null;
        private Boolean ICD9_1___not___null;
        private java.util.List<String> ICD9_1___in;
        private java.util.List<String> ICD9_1___not___in;
        private String ICD9_1___lt;
        private String ICD9_1___lte;
        private String ICD9_1___gt;
        private String ICD9_1___gte;
        private String ICD9_1___contains;
        private String ICD9_1___not___contains;
        private String ICD9_1___starts_with;
        private String ICD9_1___not___starts_with;
        private String ICD9_1___ends_with;
        private String ICD9_1___not___ends_with;
        private String ICD9_10___eq;
        private String ICD9_10___ne;
        private Boolean ICD9_10___null;
        private Boolean ICD9_10___not___null;
        private java.util.List<String> ICD9_10___in;
        private java.util.List<String> ICD9_10___not___in;
        private String ICD9_10___lt;
        private String ICD9_10___lte;
        private String ICD9_10___gt;
        private String ICD9_10___gte;
        private String ICD9_10___contains;
        private String ICD9_10___not___contains;
        private String ICD9_10___starts_with;
        private String ICD9_10___not___starts_with;
        private String ICD9_10___ends_with;
        private String ICD9_10___not___ends_with;
        private String ICD9_2___eq;
        private String ICD9_2___ne;
        private Boolean ICD9_2___null;
        private Boolean ICD9_2___not___null;
        private java.util.List<String> ICD9_2___in;
        private java.util.List<String> ICD9_2___not___in;
        private String ICD9_2___lt;
        private String ICD9_2___lte;
        private String ICD9_2___gt;
        private String ICD9_2___gte;
        private String ICD9_2___contains;
        private String ICD9_2___not___contains;
        private String ICD9_2___starts_with;
        private String ICD9_2___not___starts_with;
        private String ICD9_2___ends_with;
        private String ICD9_2___not___ends_with;
        private String ICD9_3___eq;
        private String ICD9_3___ne;
        private Boolean ICD9_3___null;
        private Boolean ICD9_3___not___null;
        private java.util.List<String> ICD9_3___in;
        private java.util.List<String> ICD9_3___not___in;
        private String ICD9_3___lt;
        private String ICD9_3___lte;
        private String ICD9_3___gt;
        private String ICD9_3___gte;
        private String ICD9_3___contains;
        private String ICD9_3___not___contains;
        private String ICD9_3___starts_with;
        private String ICD9_3___not___starts_with;
        private String ICD9_3___ends_with;
        private String ICD9_3___not___ends_with;
        private String ICD9_4___eq;
        private String ICD9_4___ne;
        private Boolean ICD9_4___null;
        private Boolean ICD9_4___not___null;
        private java.util.List<String> ICD9_4___in;
        private java.util.List<String> ICD9_4___not___in;
        private String ICD9_4___lt;
        private String ICD9_4___lte;
        private String ICD9_4___gt;
        private String ICD9_4___gte;
        private String ICD9_4___contains;
        private String ICD9_4___not___contains;
        private String ICD9_4___starts_with;
        private String ICD9_4___not___starts_with;
        private String ICD9_4___ends_with;
        private String ICD9_4___not___ends_with;
        private String ICD9_5___eq;
        private String ICD9_5___ne;
        private Boolean ICD9_5___null;
        private Boolean ICD9_5___not___null;
        private java.util.List<String> ICD9_5___in;
        private java.util.List<String> ICD9_5___not___in;
        private String ICD9_5___lt;
        private String ICD9_5___lte;
        private String ICD9_5___gt;
        private String ICD9_5___gte;
        private String ICD9_5___contains;
        private String ICD9_5___not___contains;
        private String ICD9_5___starts_with;
        private String ICD9_5___not___starts_with;
        private String ICD9_5___ends_with;
        private String ICD9_5___not___ends_with;
        private String ICD9_6___eq;
        private String ICD9_6___ne;
        private Boolean ICD9_6___null;
        private Boolean ICD9_6___not___null;
        private java.util.List<String> ICD9_6___in;
        private java.util.List<String> ICD9_6___not___in;
        private String ICD9_6___lt;
        private String ICD9_6___lte;
        private String ICD9_6___gt;
        private String ICD9_6___gte;
        private String ICD9_6___contains;
        private String ICD9_6___not___contains;
        private String ICD9_6___starts_with;
        private String ICD9_6___not___starts_with;
        private String ICD9_6___ends_with;
        private String ICD9_6___not___ends_with;
        private String ICD9_7___eq;
        private String ICD9_7___ne;
        private Boolean ICD9_7___null;
        private Boolean ICD9_7___not___null;
        private java.util.List<String> ICD9_7___in;
        private java.util.List<String> ICD9_7___not___in;
        private String ICD9_7___lt;
        private String ICD9_7___lte;
        private String ICD9_7___gt;
        private String ICD9_7___gte;
        private String ICD9_7___contains;
        private String ICD9_7___not___contains;
        private String ICD9_7___starts_with;
        private String ICD9_7___not___starts_with;
        private String ICD9_7___ends_with;
        private String ICD9_7___not___ends_with;
        private String ICD9_8___eq;
        private String ICD9_8___ne;
        private Boolean ICD9_8___null;
        private Boolean ICD9_8___not___null;
        private java.util.List<String> ICD9_8___in;
        private java.util.List<String> ICD9_8___not___in;
        private String ICD9_8___lt;
        private String ICD9_8___lte;
        private String ICD9_8___gt;
        private String ICD9_8___gte;
        private String ICD9_8___contains;
        private String ICD9_8___not___contains;
        private String ICD9_8___starts_with;
        private String ICD9_8___not___starts_with;
        private String ICD9_8___ends_with;
        private String ICD9_8___not___ends_with;
        private String ICD9_9___eq;
        private String ICD9_9___ne;
        private Boolean ICD9_9___null;
        private Boolean ICD9_9___not___null;
        private java.util.List<String> ICD9_9___in;
        private java.util.List<String> ICD9_9___not___in;
        private String ICD9_9___lt;
        private String ICD9_9___lte;
        private String ICD9_9___gt;
        private String ICD9_9___gte;
        private String ICD9_9___contains;
        private String ICD9_9___not___contains;
        private String ICD9_9___starts_with;
        private String ICD9_9___not___starts_with;
        private String ICD9_9___ends_with;
        private String ICD9_9___not___ends_with;
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
        private String codice_centro___eq;
        private String codice_centro___ne;
        private Boolean codice_centro___null;
        private Boolean codice_centro___not___null;
        private java.util.List<String> codice_centro___in;
        private java.util.List<String> codice_centro___not___in;
        private String codice_centro___lt;
        private String codice_centro___lte;
        private String codice_centro___gt;
        private String codice_centro___gte;
        private String codice_centro___contains;
        private String codice_centro___not___contains;
        private String codice_centro___starts_with;
        private String codice_centro___not___starts_with;
        private String codice_centro___ends_with;
        private String codice_centro___not___ends_with;
        private Boolean data_approssimata___eq;
        private Boolean data_approssimata___ne;
        private Boolean data_approssimata___null;
        private Boolean data_approssimata___not___null;
        private String data_dimissione___eq;
        private String data_dimissione___ne;
        private Boolean data_dimissione___null;
        private Boolean data_dimissione___not___null;
        private java.util.List<String> data_dimissione___in;
        private java.util.List<String> data_dimissione___not___in;
        private String data_dimissione___lt;
        private String data_dimissione___lte;
        private String data_dimissione___gt;
        private String data_dimissione___gte;
        private String data_ricovero___eq;
        private String data_ricovero___ne;
        private Boolean data_ricovero___null;
        private Boolean data_ricovero___not___null;
        private java.util.List<String> data_ricovero___in;
        private java.util.List<String> data_ricovero___not___in;
        private String data_ricovero___lt;
        private String data_ricovero___lte;
        private String data_ricovero___gt;
        private String data_ricovero___gte;
        private String diagnosi___eq;
        private String diagnosi___ne;
        private Boolean diagnosi___null;
        private Boolean diagnosi___not___null;
        private java.util.List<String> diagnosi___in;
        private java.util.List<String> diagnosi___not___in;
        private String diagnosi___lt;
        private String diagnosi___lte;
        private String diagnosi___gt;
        private String diagnosi___gte;
        private String diagnosi___contains;
        private String diagnosi___not___contains;
        private String diagnosi___starts_with;
        private String diagnosi___not___starts_with;
        private String diagnosi___ends_with;
        private String diagnosi___not___ends_with;
        private java.util.List<CliRicoveroFilterDTO> AND;
        private java.util.List<CliRicoveroFilterDTO> OR;
        private CliRicoveroFilterDTO NOT;

        public Builder() {
        }

        public Builder set_clientId___eq(String _clientId___eq) {
            this._clientId___eq = _clientId___eq;
            return this;
        }

        public Builder setICD9_1___eq(String ICD9_1___eq) {
            this.ICD9_1___eq = ICD9_1___eq;
            return this;
        }

        public Builder setICD9_1___ne(String ICD9_1___ne) {
            this.ICD9_1___ne = ICD9_1___ne;
            return this;
        }

        public Builder setICD9_1___null(Boolean ICD9_1___null) {
            this.ICD9_1___null = ICD9_1___null;
            return this;
        }

        public Builder setICD9_1___not___null(Boolean ICD9_1___not___null) {
            this.ICD9_1___not___null = ICD9_1___not___null;
            return this;
        }

        public Builder setICD9_1___in(java.util.List<String> ICD9_1___in) {
            this.ICD9_1___in = ICD9_1___in;
            return this;
        }

        public Builder setICD9_1___not___in(java.util.List<String> ICD9_1___not___in) {
            this.ICD9_1___not___in = ICD9_1___not___in;
            return this;
        }

        public Builder setICD9_1___lt(String ICD9_1___lt) {
            this.ICD9_1___lt = ICD9_1___lt;
            return this;
        }

        public Builder setICD9_1___lte(String ICD9_1___lte) {
            this.ICD9_1___lte = ICD9_1___lte;
            return this;
        }

        public Builder setICD9_1___gt(String ICD9_1___gt) {
            this.ICD9_1___gt = ICD9_1___gt;
            return this;
        }

        public Builder setICD9_1___gte(String ICD9_1___gte) {
            this.ICD9_1___gte = ICD9_1___gte;
            return this;
        }

        public Builder setICD9_1___contains(String ICD9_1___contains) {
            this.ICD9_1___contains = ICD9_1___contains;
            return this;
        }

        public Builder setICD9_1___not___contains(String ICD9_1___not___contains) {
            this.ICD9_1___not___contains = ICD9_1___not___contains;
            return this;
        }

        public Builder setICD9_1___starts_with(String ICD9_1___starts_with) {
            this.ICD9_1___starts_with = ICD9_1___starts_with;
            return this;
        }

        public Builder setICD9_1___not___starts_with(String ICD9_1___not___starts_with) {
            this.ICD9_1___not___starts_with = ICD9_1___not___starts_with;
            return this;
        }

        public Builder setICD9_1___ends_with(String ICD9_1___ends_with) {
            this.ICD9_1___ends_with = ICD9_1___ends_with;
            return this;
        }

        public Builder setICD9_1___not___ends_with(String ICD9_1___not___ends_with) {
            this.ICD9_1___not___ends_with = ICD9_1___not___ends_with;
            return this;
        }

        public Builder setICD9_10___eq(String ICD9_10___eq) {
            this.ICD9_10___eq = ICD9_10___eq;
            return this;
        }

        public Builder setICD9_10___ne(String ICD9_10___ne) {
            this.ICD9_10___ne = ICD9_10___ne;
            return this;
        }

        public Builder setICD9_10___null(Boolean ICD9_10___null) {
            this.ICD9_10___null = ICD9_10___null;
            return this;
        }

        public Builder setICD9_10___not___null(Boolean ICD9_10___not___null) {
            this.ICD9_10___not___null = ICD9_10___not___null;
            return this;
        }

        public Builder setICD9_10___in(java.util.List<String> ICD9_10___in) {
            this.ICD9_10___in = ICD9_10___in;
            return this;
        }

        public Builder setICD9_10___not___in(java.util.List<String> ICD9_10___not___in) {
            this.ICD9_10___not___in = ICD9_10___not___in;
            return this;
        }

        public Builder setICD9_10___lt(String ICD9_10___lt) {
            this.ICD9_10___lt = ICD9_10___lt;
            return this;
        }

        public Builder setICD9_10___lte(String ICD9_10___lte) {
            this.ICD9_10___lte = ICD9_10___lte;
            return this;
        }

        public Builder setICD9_10___gt(String ICD9_10___gt) {
            this.ICD9_10___gt = ICD9_10___gt;
            return this;
        }

        public Builder setICD9_10___gte(String ICD9_10___gte) {
            this.ICD9_10___gte = ICD9_10___gte;
            return this;
        }

        public Builder setICD9_10___contains(String ICD9_10___contains) {
            this.ICD9_10___contains = ICD9_10___contains;
            return this;
        }

        public Builder setICD9_10___not___contains(String ICD9_10___not___contains) {
            this.ICD9_10___not___contains = ICD9_10___not___contains;
            return this;
        }

        public Builder setICD9_10___starts_with(String ICD9_10___starts_with) {
            this.ICD9_10___starts_with = ICD9_10___starts_with;
            return this;
        }

        public Builder setICD9_10___not___starts_with(String ICD9_10___not___starts_with) {
            this.ICD9_10___not___starts_with = ICD9_10___not___starts_with;
            return this;
        }

        public Builder setICD9_10___ends_with(String ICD9_10___ends_with) {
            this.ICD9_10___ends_with = ICD9_10___ends_with;
            return this;
        }

        public Builder setICD9_10___not___ends_with(String ICD9_10___not___ends_with) {
            this.ICD9_10___not___ends_with = ICD9_10___not___ends_with;
            return this;
        }

        public Builder setICD9_2___eq(String ICD9_2___eq) {
            this.ICD9_2___eq = ICD9_2___eq;
            return this;
        }

        public Builder setICD9_2___ne(String ICD9_2___ne) {
            this.ICD9_2___ne = ICD9_2___ne;
            return this;
        }

        public Builder setICD9_2___null(Boolean ICD9_2___null) {
            this.ICD9_2___null = ICD9_2___null;
            return this;
        }

        public Builder setICD9_2___not___null(Boolean ICD9_2___not___null) {
            this.ICD9_2___not___null = ICD9_2___not___null;
            return this;
        }

        public Builder setICD9_2___in(java.util.List<String> ICD9_2___in) {
            this.ICD9_2___in = ICD9_2___in;
            return this;
        }

        public Builder setICD9_2___not___in(java.util.List<String> ICD9_2___not___in) {
            this.ICD9_2___not___in = ICD9_2___not___in;
            return this;
        }

        public Builder setICD9_2___lt(String ICD9_2___lt) {
            this.ICD9_2___lt = ICD9_2___lt;
            return this;
        }

        public Builder setICD9_2___lte(String ICD9_2___lte) {
            this.ICD9_2___lte = ICD9_2___lte;
            return this;
        }

        public Builder setICD9_2___gt(String ICD9_2___gt) {
            this.ICD9_2___gt = ICD9_2___gt;
            return this;
        }

        public Builder setICD9_2___gte(String ICD9_2___gte) {
            this.ICD9_2___gte = ICD9_2___gte;
            return this;
        }

        public Builder setICD9_2___contains(String ICD9_2___contains) {
            this.ICD9_2___contains = ICD9_2___contains;
            return this;
        }

        public Builder setICD9_2___not___contains(String ICD9_2___not___contains) {
            this.ICD9_2___not___contains = ICD9_2___not___contains;
            return this;
        }

        public Builder setICD9_2___starts_with(String ICD9_2___starts_with) {
            this.ICD9_2___starts_with = ICD9_2___starts_with;
            return this;
        }

        public Builder setICD9_2___not___starts_with(String ICD9_2___not___starts_with) {
            this.ICD9_2___not___starts_with = ICD9_2___not___starts_with;
            return this;
        }

        public Builder setICD9_2___ends_with(String ICD9_2___ends_with) {
            this.ICD9_2___ends_with = ICD9_2___ends_with;
            return this;
        }

        public Builder setICD9_2___not___ends_with(String ICD9_2___not___ends_with) {
            this.ICD9_2___not___ends_with = ICD9_2___not___ends_with;
            return this;
        }

        public Builder setICD9_3___eq(String ICD9_3___eq) {
            this.ICD9_3___eq = ICD9_3___eq;
            return this;
        }

        public Builder setICD9_3___ne(String ICD9_3___ne) {
            this.ICD9_3___ne = ICD9_3___ne;
            return this;
        }

        public Builder setICD9_3___null(Boolean ICD9_3___null) {
            this.ICD9_3___null = ICD9_3___null;
            return this;
        }

        public Builder setICD9_3___not___null(Boolean ICD9_3___not___null) {
            this.ICD9_3___not___null = ICD9_3___not___null;
            return this;
        }

        public Builder setICD9_3___in(java.util.List<String> ICD9_3___in) {
            this.ICD9_3___in = ICD9_3___in;
            return this;
        }

        public Builder setICD9_3___not___in(java.util.List<String> ICD9_3___not___in) {
            this.ICD9_3___not___in = ICD9_3___not___in;
            return this;
        }

        public Builder setICD9_3___lt(String ICD9_3___lt) {
            this.ICD9_3___lt = ICD9_3___lt;
            return this;
        }

        public Builder setICD9_3___lte(String ICD9_3___lte) {
            this.ICD9_3___lte = ICD9_3___lte;
            return this;
        }

        public Builder setICD9_3___gt(String ICD9_3___gt) {
            this.ICD9_3___gt = ICD9_3___gt;
            return this;
        }

        public Builder setICD9_3___gte(String ICD9_3___gte) {
            this.ICD9_3___gte = ICD9_3___gte;
            return this;
        }

        public Builder setICD9_3___contains(String ICD9_3___contains) {
            this.ICD9_3___contains = ICD9_3___contains;
            return this;
        }

        public Builder setICD9_3___not___contains(String ICD9_3___not___contains) {
            this.ICD9_3___not___contains = ICD9_3___not___contains;
            return this;
        }

        public Builder setICD9_3___starts_with(String ICD9_3___starts_with) {
            this.ICD9_3___starts_with = ICD9_3___starts_with;
            return this;
        }

        public Builder setICD9_3___not___starts_with(String ICD9_3___not___starts_with) {
            this.ICD9_3___not___starts_with = ICD9_3___not___starts_with;
            return this;
        }

        public Builder setICD9_3___ends_with(String ICD9_3___ends_with) {
            this.ICD9_3___ends_with = ICD9_3___ends_with;
            return this;
        }

        public Builder setICD9_3___not___ends_with(String ICD9_3___not___ends_with) {
            this.ICD9_3___not___ends_with = ICD9_3___not___ends_with;
            return this;
        }

        public Builder setICD9_4___eq(String ICD9_4___eq) {
            this.ICD9_4___eq = ICD9_4___eq;
            return this;
        }

        public Builder setICD9_4___ne(String ICD9_4___ne) {
            this.ICD9_4___ne = ICD9_4___ne;
            return this;
        }

        public Builder setICD9_4___null(Boolean ICD9_4___null) {
            this.ICD9_4___null = ICD9_4___null;
            return this;
        }

        public Builder setICD9_4___not___null(Boolean ICD9_4___not___null) {
            this.ICD9_4___not___null = ICD9_4___not___null;
            return this;
        }

        public Builder setICD9_4___in(java.util.List<String> ICD9_4___in) {
            this.ICD9_4___in = ICD9_4___in;
            return this;
        }

        public Builder setICD9_4___not___in(java.util.List<String> ICD9_4___not___in) {
            this.ICD9_4___not___in = ICD9_4___not___in;
            return this;
        }

        public Builder setICD9_4___lt(String ICD9_4___lt) {
            this.ICD9_4___lt = ICD9_4___lt;
            return this;
        }

        public Builder setICD9_4___lte(String ICD9_4___lte) {
            this.ICD9_4___lte = ICD9_4___lte;
            return this;
        }

        public Builder setICD9_4___gt(String ICD9_4___gt) {
            this.ICD9_4___gt = ICD9_4___gt;
            return this;
        }

        public Builder setICD9_4___gte(String ICD9_4___gte) {
            this.ICD9_4___gte = ICD9_4___gte;
            return this;
        }

        public Builder setICD9_4___contains(String ICD9_4___contains) {
            this.ICD9_4___contains = ICD9_4___contains;
            return this;
        }

        public Builder setICD9_4___not___contains(String ICD9_4___not___contains) {
            this.ICD9_4___not___contains = ICD9_4___not___contains;
            return this;
        }

        public Builder setICD9_4___starts_with(String ICD9_4___starts_with) {
            this.ICD9_4___starts_with = ICD9_4___starts_with;
            return this;
        }

        public Builder setICD9_4___not___starts_with(String ICD9_4___not___starts_with) {
            this.ICD9_4___not___starts_with = ICD9_4___not___starts_with;
            return this;
        }

        public Builder setICD9_4___ends_with(String ICD9_4___ends_with) {
            this.ICD9_4___ends_with = ICD9_4___ends_with;
            return this;
        }

        public Builder setICD9_4___not___ends_with(String ICD9_4___not___ends_with) {
            this.ICD9_4___not___ends_with = ICD9_4___not___ends_with;
            return this;
        }

        public Builder setICD9_5___eq(String ICD9_5___eq) {
            this.ICD9_5___eq = ICD9_5___eq;
            return this;
        }

        public Builder setICD9_5___ne(String ICD9_5___ne) {
            this.ICD9_5___ne = ICD9_5___ne;
            return this;
        }

        public Builder setICD9_5___null(Boolean ICD9_5___null) {
            this.ICD9_5___null = ICD9_5___null;
            return this;
        }

        public Builder setICD9_5___not___null(Boolean ICD9_5___not___null) {
            this.ICD9_5___not___null = ICD9_5___not___null;
            return this;
        }

        public Builder setICD9_5___in(java.util.List<String> ICD9_5___in) {
            this.ICD9_5___in = ICD9_5___in;
            return this;
        }

        public Builder setICD9_5___not___in(java.util.List<String> ICD9_5___not___in) {
            this.ICD9_5___not___in = ICD9_5___not___in;
            return this;
        }

        public Builder setICD9_5___lt(String ICD9_5___lt) {
            this.ICD9_5___lt = ICD9_5___lt;
            return this;
        }

        public Builder setICD9_5___lte(String ICD9_5___lte) {
            this.ICD9_5___lte = ICD9_5___lte;
            return this;
        }

        public Builder setICD9_5___gt(String ICD9_5___gt) {
            this.ICD9_5___gt = ICD9_5___gt;
            return this;
        }

        public Builder setICD9_5___gte(String ICD9_5___gte) {
            this.ICD9_5___gte = ICD9_5___gte;
            return this;
        }

        public Builder setICD9_5___contains(String ICD9_5___contains) {
            this.ICD9_5___contains = ICD9_5___contains;
            return this;
        }

        public Builder setICD9_5___not___contains(String ICD9_5___not___contains) {
            this.ICD9_5___not___contains = ICD9_5___not___contains;
            return this;
        }

        public Builder setICD9_5___starts_with(String ICD9_5___starts_with) {
            this.ICD9_5___starts_with = ICD9_5___starts_with;
            return this;
        }

        public Builder setICD9_5___not___starts_with(String ICD9_5___not___starts_with) {
            this.ICD9_5___not___starts_with = ICD9_5___not___starts_with;
            return this;
        }

        public Builder setICD9_5___ends_with(String ICD9_5___ends_with) {
            this.ICD9_5___ends_with = ICD9_5___ends_with;
            return this;
        }

        public Builder setICD9_5___not___ends_with(String ICD9_5___not___ends_with) {
            this.ICD9_5___not___ends_with = ICD9_5___not___ends_with;
            return this;
        }

        public Builder setICD9_6___eq(String ICD9_6___eq) {
            this.ICD9_6___eq = ICD9_6___eq;
            return this;
        }

        public Builder setICD9_6___ne(String ICD9_6___ne) {
            this.ICD9_6___ne = ICD9_6___ne;
            return this;
        }

        public Builder setICD9_6___null(Boolean ICD9_6___null) {
            this.ICD9_6___null = ICD9_6___null;
            return this;
        }

        public Builder setICD9_6___not___null(Boolean ICD9_6___not___null) {
            this.ICD9_6___not___null = ICD9_6___not___null;
            return this;
        }

        public Builder setICD9_6___in(java.util.List<String> ICD9_6___in) {
            this.ICD9_6___in = ICD9_6___in;
            return this;
        }

        public Builder setICD9_6___not___in(java.util.List<String> ICD9_6___not___in) {
            this.ICD9_6___not___in = ICD9_6___not___in;
            return this;
        }

        public Builder setICD9_6___lt(String ICD9_6___lt) {
            this.ICD9_6___lt = ICD9_6___lt;
            return this;
        }

        public Builder setICD9_6___lte(String ICD9_6___lte) {
            this.ICD9_6___lte = ICD9_6___lte;
            return this;
        }

        public Builder setICD9_6___gt(String ICD9_6___gt) {
            this.ICD9_6___gt = ICD9_6___gt;
            return this;
        }

        public Builder setICD9_6___gte(String ICD9_6___gte) {
            this.ICD9_6___gte = ICD9_6___gte;
            return this;
        }

        public Builder setICD9_6___contains(String ICD9_6___contains) {
            this.ICD9_6___contains = ICD9_6___contains;
            return this;
        }

        public Builder setICD9_6___not___contains(String ICD9_6___not___contains) {
            this.ICD9_6___not___contains = ICD9_6___not___contains;
            return this;
        }

        public Builder setICD9_6___starts_with(String ICD9_6___starts_with) {
            this.ICD9_6___starts_with = ICD9_6___starts_with;
            return this;
        }

        public Builder setICD9_6___not___starts_with(String ICD9_6___not___starts_with) {
            this.ICD9_6___not___starts_with = ICD9_6___not___starts_with;
            return this;
        }

        public Builder setICD9_6___ends_with(String ICD9_6___ends_with) {
            this.ICD9_6___ends_with = ICD9_6___ends_with;
            return this;
        }

        public Builder setICD9_6___not___ends_with(String ICD9_6___not___ends_with) {
            this.ICD9_6___not___ends_with = ICD9_6___not___ends_with;
            return this;
        }

        public Builder setICD9_7___eq(String ICD9_7___eq) {
            this.ICD9_7___eq = ICD9_7___eq;
            return this;
        }

        public Builder setICD9_7___ne(String ICD9_7___ne) {
            this.ICD9_7___ne = ICD9_7___ne;
            return this;
        }

        public Builder setICD9_7___null(Boolean ICD9_7___null) {
            this.ICD9_7___null = ICD9_7___null;
            return this;
        }

        public Builder setICD9_7___not___null(Boolean ICD9_7___not___null) {
            this.ICD9_7___not___null = ICD9_7___not___null;
            return this;
        }

        public Builder setICD9_7___in(java.util.List<String> ICD9_7___in) {
            this.ICD9_7___in = ICD9_7___in;
            return this;
        }

        public Builder setICD9_7___not___in(java.util.List<String> ICD9_7___not___in) {
            this.ICD9_7___not___in = ICD9_7___not___in;
            return this;
        }

        public Builder setICD9_7___lt(String ICD9_7___lt) {
            this.ICD9_7___lt = ICD9_7___lt;
            return this;
        }

        public Builder setICD9_7___lte(String ICD9_7___lte) {
            this.ICD9_7___lte = ICD9_7___lte;
            return this;
        }

        public Builder setICD9_7___gt(String ICD9_7___gt) {
            this.ICD9_7___gt = ICD9_7___gt;
            return this;
        }

        public Builder setICD9_7___gte(String ICD9_7___gte) {
            this.ICD9_7___gte = ICD9_7___gte;
            return this;
        }

        public Builder setICD9_7___contains(String ICD9_7___contains) {
            this.ICD9_7___contains = ICD9_7___contains;
            return this;
        }

        public Builder setICD9_7___not___contains(String ICD9_7___not___contains) {
            this.ICD9_7___not___contains = ICD9_7___not___contains;
            return this;
        }

        public Builder setICD9_7___starts_with(String ICD9_7___starts_with) {
            this.ICD9_7___starts_with = ICD9_7___starts_with;
            return this;
        }

        public Builder setICD9_7___not___starts_with(String ICD9_7___not___starts_with) {
            this.ICD9_7___not___starts_with = ICD9_7___not___starts_with;
            return this;
        }

        public Builder setICD9_7___ends_with(String ICD9_7___ends_with) {
            this.ICD9_7___ends_with = ICD9_7___ends_with;
            return this;
        }

        public Builder setICD9_7___not___ends_with(String ICD9_7___not___ends_with) {
            this.ICD9_7___not___ends_with = ICD9_7___not___ends_with;
            return this;
        }

        public Builder setICD9_8___eq(String ICD9_8___eq) {
            this.ICD9_8___eq = ICD9_8___eq;
            return this;
        }

        public Builder setICD9_8___ne(String ICD9_8___ne) {
            this.ICD9_8___ne = ICD9_8___ne;
            return this;
        }

        public Builder setICD9_8___null(Boolean ICD9_8___null) {
            this.ICD9_8___null = ICD9_8___null;
            return this;
        }

        public Builder setICD9_8___not___null(Boolean ICD9_8___not___null) {
            this.ICD9_8___not___null = ICD9_8___not___null;
            return this;
        }

        public Builder setICD9_8___in(java.util.List<String> ICD9_8___in) {
            this.ICD9_8___in = ICD9_8___in;
            return this;
        }

        public Builder setICD9_8___not___in(java.util.List<String> ICD9_8___not___in) {
            this.ICD9_8___not___in = ICD9_8___not___in;
            return this;
        }

        public Builder setICD9_8___lt(String ICD9_8___lt) {
            this.ICD9_8___lt = ICD9_8___lt;
            return this;
        }

        public Builder setICD9_8___lte(String ICD9_8___lte) {
            this.ICD9_8___lte = ICD9_8___lte;
            return this;
        }

        public Builder setICD9_8___gt(String ICD9_8___gt) {
            this.ICD9_8___gt = ICD9_8___gt;
            return this;
        }

        public Builder setICD9_8___gte(String ICD9_8___gte) {
            this.ICD9_8___gte = ICD9_8___gte;
            return this;
        }

        public Builder setICD9_8___contains(String ICD9_8___contains) {
            this.ICD9_8___contains = ICD9_8___contains;
            return this;
        }

        public Builder setICD9_8___not___contains(String ICD9_8___not___contains) {
            this.ICD9_8___not___contains = ICD9_8___not___contains;
            return this;
        }

        public Builder setICD9_8___starts_with(String ICD9_8___starts_with) {
            this.ICD9_8___starts_with = ICD9_8___starts_with;
            return this;
        }

        public Builder setICD9_8___not___starts_with(String ICD9_8___not___starts_with) {
            this.ICD9_8___not___starts_with = ICD9_8___not___starts_with;
            return this;
        }

        public Builder setICD9_8___ends_with(String ICD9_8___ends_with) {
            this.ICD9_8___ends_with = ICD9_8___ends_with;
            return this;
        }

        public Builder setICD9_8___not___ends_with(String ICD9_8___not___ends_with) {
            this.ICD9_8___not___ends_with = ICD9_8___not___ends_with;
            return this;
        }

        public Builder setICD9_9___eq(String ICD9_9___eq) {
            this.ICD9_9___eq = ICD9_9___eq;
            return this;
        }

        public Builder setICD9_9___ne(String ICD9_9___ne) {
            this.ICD9_9___ne = ICD9_9___ne;
            return this;
        }

        public Builder setICD9_9___null(Boolean ICD9_9___null) {
            this.ICD9_9___null = ICD9_9___null;
            return this;
        }

        public Builder setICD9_9___not___null(Boolean ICD9_9___not___null) {
            this.ICD9_9___not___null = ICD9_9___not___null;
            return this;
        }

        public Builder setICD9_9___in(java.util.List<String> ICD9_9___in) {
            this.ICD9_9___in = ICD9_9___in;
            return this;
        }

        public Builder setICD9_9___not___in(java.util.List<String> ICD9_9___not___in) {
            this.ICD9_9___not___in = ICD9_9___not___in;
            return this;
        }

        public Builder setICD9_9___lt(String ICD9_9___lt) {
            this.ICD9_9___lt = ICD9_9___lt;
            return this;
        }

        public Builder setICD9_9___lte(String ICD9_9___lte) {
            this.ICD9_9___lte = ICD9_9___lte;
            return this;
        }

        public Builder setICD9_9___gt(String ICD9_9___gt) {
            this.ICD9_9___gt = ICD9_9___gt;
            return this;
        }

        public Builder setICD9_9___gte(String ICD9_9___gte) {
            this.ICD9_9___gte = ICD9_9___gte;
            return this;
        }

        public Builder setICD9_9___contains(String ICD9_9___contains) {
            this.ICD9_9___contains = ICD9_9___contains;
            return this;
        }

        public Builder setICD9_9___not___contains(String ICD9_9___not___contains) {
            this.ICD9_9___not___contains = ICD9_9___not___contains;
            return this;
        }

        public Builder setICD9_9___starts_with(String ICD9_9___starts_with) {
            this.ICD9_9___starts_with = ICD9_9___starts_with;
            return this;
        }

        public Builder setICD9_9___not___starts_with(String ICD9_9___not___starts_with) {
            this.ICD9_9___not___starts_with = ICD9_9___not___starts_with;
            return this;
        }

        public Builder setICD9_9___ends_with(String ICD9_9___ends_with) {
            this.ICD9_9___ends_with = ICD9_9___ends_with;
            return this;
        }

        public Builder setICD9_9___not___ends_with(String ICD9_9___not___ends_with) {
            this.ICD9_9___not___ends_with = ICD9_9___not___ends_with;
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

        public Builder setCodice_centro___eq(String codice_centro___eq) {
            this.codice_centro___eq = codice_centro___eq;
            return this;
        }

        public Builder setCodice_centro___ne(String codice_centro___ne) {
            this.codice_centro___ne = codice_centro___ne;
            return this;
        }

        public Builder setCodice_centro___null(Boolean codice_centro___null) {
            this.codice_centro___null = codice_centro___null;
            return this;
        }

        public Builder setCodice_centro___not___null(Boolean codice_centro___not___null) {
            this.codice_centro___not___null = codice_centro___not___null;
            return this;
        }

        public Builder setCodice_centro___in(java.util.List<String> codice_centro___in) {
            this.codice_centro___in = codice_centro___in;
            return this;
        }

        public Builder setCodice_centro___not___in(java.util.List<String> codice_centro___not___in) {
            this.codice_centro___not___in = codice_centro___not___in;
            return this;
        }

        public Builder setCodice_centro___lt(String codice_centro___lt) {
            this.codice_centro___lt = codice_centro___lt;
            return this;
        }

        public Builder setCodice_centro___lte(String codice_centro___lte) {
            this.codice_centro___lte = codice_centro___lte;
            return this;
        }

        public Builder setCodice_centro___gt(String codice_centro___gt) {
            this.codice_centro___gt = codice_centro___gt;
            return this;
        }

        public Builder setCodice_centro___gte(String codice_centro___gte) {
            this.codice_centro___gte = codice_centro___gte;
            return this;
        }

        public Builder setCodice_centro___contains(String codice_centro___contains) {
            this.codice_centro___contains = codice_centro___contains;
            return this;
        }

        public Builder setCodice_centro___not___contains(String codice_centro___not___contains) {
            this.codice_centro___not___contains = codice_centro___not___contains;
            return this;
        }

        public Builder setCodice_centro___starts_with(String codice_centro___starts_with) {
            this.codice_centro___starts_with = codice_centro___starts_with;
            return this;
        }

        public Builder setCodice_centro___not___starts_with(String codice_centro___not___starts_with) {
            this.codice_centro___not___starts_with = codice_centro___not___starts_with;
            return this;
        }

        public Builder setCodice_centro___ends_with(String codice_centro___ends_with) {
            this.codice_centro___ends_with = codice_centro___ends_with;
            return this;
        }

        public Builder setCodice_centro___not___ends_with(String codice_centro___not___ends_with) {
            this.codice_centro___not___ends_with = codice_centro___not___ends_with;
            return this;
        }

        public Builder setData_approssimata___eq(Boolean data_approssimata___eq) {
            this.data_approssimata___eq = data_approssimata___eq;
            return this;
        }

        public Builder setData_approssimata___ne(Boolean data_approssimata___ne) {
            this.data_approssimata___ne = data_approssimata___ne;
            return this;
        }

        public Builder setData_approssimata___null(Boolean data_approssimata___null) {
            this.data_approssimata___null = data_approssimata___null;
            return this;
        }

        public Builder setData_approssimata___not___null(Boolean data_approssimata___not___null) {
            this.data_approssimata___not___null = data_approssimata___not___null;
            return this;
        }

        public Builder setData_dimissione___eq(String data_dimissione___eq) {
            this.data_dimissione___eq = data_dimissione___eq;
            return this;
        }

        public Builder setData_dimissione___ne(String data_dimissione___ne) {
            this.data_dimissione___ne = data_dimissione___ne;
            return this;
        }

        public Builder setData_dimissione___null(Boolean data_dimissione___null) {
            this.data_dimissione___null = data_dimissione___null;
            return this;
        }

        public Builder setData_dimissione___not___null(Boolean data_dimissione___not___null) {
            this.data_dimissione___not___null = data_dimissione___not___null;
            return this;
        }

        public Builder setData_dimissione___in(java.util.List<String> data_dimissione___in) {
            this.data_dimissione___in = data_dimissione___in;
            return this;
        }

        public Builder setData_dimissione___not___in(java.util.List<String> data_dimissione___not___in) {
            this.data_dimissione___not___in = data_dimissione___not___in;
            return this;
        }

        public Builder setData_dimissione___lt(String data_dimissione___lt) {
            this.data_dimissione___lt = data_dimissione___lt;
            return this;
        }

        public Builder setData_dimissione___lte(String data_dimissione___lte) {
            this.data_dimissione___lte = data_dimissione___lte;
            return this;
        }

        public Builder setData_dimissione___gt(String data_dimissione___gt) {
            this.data_dimissione___gt = data_dimissione___gt;
            return this;
        }

        public Builder setData_dimissione___gte(String data_dimissione___gte) {
            this.data_dimissione___gte = data_dimissione___gte;
            return this;
        }

        public Builder setData_ricovero___eq(String data_ricovero___eq) {
            this.data_ricovero___eq = data_ricovero___eq;
            return this;
        }

        public Builder setData_ricovero___ne(String data_ricovero___ne) {
            this.data_ricovero___ne = data_ricovero___ne;
            return this;
        }

        public Builder setData_ricovero___null(Boolean data_ricovero___null) {
            this.data_ricovero___null = data_ricovero___null;
            return this;
        }

        public Builder setData_ricovero___not___null(Boolean data_ricovero___not___null) {
            this.data_ricovero___not___null = data_ricovero___not___null;
            return this;
        }

        public Builder setData_ricovero___in(java.util.List<String> data_ricovero___in) {
            this.data_ricovero___in = data_ricovero___in;
            return this;
        }

        public Builder setData_ricovero___not___in(java.util.List<String> data_ricovero___not___in) {
            this.data_ricovero___not___in = data_ricovero___not___in;
            return this;
        }

        public Builder setData_ricovero___lt(String data_ricovero___lt) {
            this.data_ricovero___lt = data_ricovero___lt;
            return this;
        }

        public Builder setData_ricovero___lte(String data_ricovero___lte) {
            this.data_ricovero___lte = data_ricovero___lte;
            return this;
        }

        public Builder setData_ricovero___gt(String data_ricovero___gt) {
            this.data_ricovero___gt = data_ricovero___gt;
            return this;
        }

        public Builder setData_ricovero___gte(String data_ricovero___gte) {
            this.data_ricovero___gte = data_ricovero___gte;
            return this;
        }

        public Builder setDiagnosi___eq(String diagnosi___eq) {
            this.diagnosi___eq = diagnosi___eq;
            return this;
        }

        public Builder setDiagnosi___ne(String diagnosi___ne) {
            this.diagnosi___ne = diagnosi___ne;
            return this;
        }

        public Builder setDiagnosi___null(Boolean diagnosi___null) {
            this.diagnosi___null = diagnosi___null;
            return this;
        }

        public Builder setDiagnosi___not___null(Boolean diagnosi___not___null) {
            this.diagnosi___not___null = diagnosi___not___null;
            return this;
        }

        public Builder setDiagnosi___in(java.util.List<String> diagnosi___in) {
            this.diagnosi___in = diagnosi___in;
            return this;
        }

        public Builder setDiagnosi___not___in(java.util.List<String> diagnosi___not___in) {
            this.diagnosi___not___in = diagnosi___not___in;
            return this;
        }

        public Builder setDiagnosi___lt(String diagnosi___lt) {
            this.diagnosi___lt = diagnosi___lt;
            return this;
        }

        public Builder setDiagnosi___lte(String diagnosi___lte) {
            this.diagnosi___lte = diagnosi___lte;
            return this;
        }

        public Builder setDiagnosi___gt(String diagnosi___gt) {
            this.diagnosi___gt = diagnosi___gt;
            return this;
        }

        public Builder setDiagnosi___gte(String diagnosi___gte) {
            this.diagnosi___gte = diagnosi___gte;
            return this;
        }

        public Builder setDiagnosi___contains(String diagnosi___contains) {
            this.diagnosi___contains = diagnosi___contains;
            return this;
        }

        public Builder setDiagnosi___not___contains(String diagnosi___not___contains) {
            this.diagnosi___not___contains = diagnosi___not___contains;
            return this;
        }

        public Builder setDiagnosi___starts_with(String diagnosi___starts_with) {
            this.diagnosi___starts_with = diagnosi___starts_with;
            return this;
        }

        public Builder setDiagnosi___not___starts_with(String diagnosi___not___starts_with) {
            this.diagnosi___not___starts_with = diagnosi___not___starts_with;
            return this;
        }

        public Builder setDiagnosi___ends_with(String diagnosi___ends_with) {
            this.diagnosi___ends_with = diagnosi___ends_with;
            return this;
        }

        public Builder setDiagnosi___not___ends_with(String diagnosi___not___ends_with) {
            this.diagnosi___not___ends_with = diagnosi___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliRicoveroFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliRicoveroFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliRicoveroFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliRicoveroFilterDTO build() {
            CliRicoveroFilterDTO result = new CliRicoveroFilterDTO();
            result.set_clientId___eq(this._clientId___eq);
            result.setICD9_1___eq(this.ICD9_1___eq);
            result.setICD9_1___ne(this.ICD9_1___ne);
            result.setICD9_1___null(this.ICD9_1___null);
            result.setICD9_1___not___null(this.ICD9_1___not___null);
            result.setICD9_1___in(this.ICD9_1___in);
            result.setICD9_1___not___in(this.ICD9_1___not___in);
            result.setICD9_1___lt(this.ICD9_1___lt);
            result.setICD9_1___lte(this.ICD9_1___lte);
            result.setICD9_1___gt(this.ICD9_1___gt);
            result.setICD9_1___gte(this.ICD9_1___gte);
            result.setICD9_1___contains(this.ICD9_1___contains);
            result.setICD9_1___not___contains(this.ICD9_1___not___contains);
            result.setICD9_1___starts_with(this.ICD9_1___starts_with);
            result.setICD9_1___not___starts_with(this.ICD9_1___not___starts_with);
            result.setICD9_1___ends_with(this.ICD9_1___ends_with);
            result.setICD9_1___not___ends_with(this.ICD9_1___not___ends_with);
            result.setICD9_10___eq(this.ICD9_10___eq);
            result.setICD9_10___ne(this.ICD9_10___ne);
            result.setICD9_10___null(this.ICD9_10___null);
            result.setICD9_10___not___null(this.ICD9_10___not___null);
            result.setICD9_10___in(this.ICD9_10___in);
            result.setICD9_10___not___in(this.ICD9_10___not___in);
            result.setICD9_10___lt(this.ICD9_10___lt);
            result.setICD9_10___lte(this.ICD9_10___lte);
            result.setICD9_10___gt(this.ICD9_10___gt);
            result.setICD9_10___gte(this.ICD9_10___gte);
            result.setICD9_10___contains(this.ICD9_10___contains);
            result.setICD9_10___not___contains(this.ICD9_10___not___contains);
            result.setICD9_10___starts_with(this.ICD9_10___starts_with);
            result.setICD9_10___not___starts_with(this.ICD9_10___not___starts_with);
            result.setICD9_10___ends_with(this.ICD9_10___ends_with);
            result.setICD9_10___not___ends_with(this.ICD9_10___not___ends_with);
            result.setICD9_2___eq(this.ICD9_2___eq);
            result.setICD9_2___ne(this.ICD9_2___ne);
            result.setICD9_2___null(this.ICD9_2___null);
            result.setICD9_2___not___null(this.ICD9_2___not___null);
            result.setICD9_2___in(this.ICD9_2___in);
            result.setICD9_2___not___in(this.ICD9_2___not___in);
            result.setICD9_2___lt(this.ICD9_2___lt);
            result.setICD9_2___lte(this.ICD9_2___lte);
            result.setICD9_2___gt(this.ICD9_2___gt);
            result.setICD9_2___gte(this.ICD9_2___gte);
            result.setICD9_2___contains(this.ICD9_2___contains);
            result.setICD9_2___not___contains(this.ICD9_2___not___contains);
            result.setICD9_2___starts_with(this.ICD9_2___starts_with);
            result.setICD9_2___not___starts_with(this.ICD9_2___not___starts_with);
            result.setICD9_2___ends_with(this.ICD9_2___ends_with);
            result.setICD9_2___not___ends_with(this.ICD9_2___not___ends_with);
            result.setICD9_3___eq(this.ICD9_3___eq);
            result.setICD9_3___ne(this.ICD9_3___ne);
            result.setICD9_3___null(this.ICD9_3___null);
            result.setICD9_3___not___null(this.ICD9_3___not___null);
            result.setICD9_3___in(this.ICD9_3___in);
            result.setICD9_3___not___in(this.ICD9_3___not___in);
            result.setICD9_3___lt(this.ICD9_3___lt);
            result.setICD9_3___lte(this.ICD9_3___lte);
            result.setICD9_3___gt(this.ICD9_3___gt);
            result.setICD9_3___gte(this.ICD9_3___gte);
            result.setICD9_3___contains(this.ICD9_3___contains);
            result.setICD9_3___not___contains(this.ICD9_3___not___contains);
            result.setICD9_3___starts_with(this.ICD9_3___starts_with);
            result.setICD9_3___not___starts_with(this.ICD9_3___not___starts_with);
            result.setICD9_3___ends_with(this.ICD9_3___ends_with);
            result.setICD9_3___not___ends_with(this.ICD9_3___not___ends_with);
            result.setICD9_4___eq(this.ICD9_4___eq);
            result.setICD9_4___ne(this.ICD9_4___ne);
            result.setICD9_4___null(this.ICD9_4___null);
            result.setICD9_4___not___null(this.ICD9_4___not___null);
            result.setICD9_4___in(this.ICD9_4___in);
            result.setICD9_4___not___in(this.ICD9_4___not___in);
            result.setICD9_4___lt(this.ICD9_4___lt);
            result.setICD9_4___lte(this.ICD9_4___lte);
            result.setICD9_4___gt(this.ICD9_4___gt);
            result.setICD9_4___gte(this.ICD9_4___gte);
            result.setICD9_4___contains(this.ICD9_4___contains);
            result.setICD9_4___not___contains(this.ICD9_4___not___contains);
            result.setICD9_4___starts_with(this.ICD9_4___starts_with);
            result.setICD9_4___not___starts_with(this.ICD9_4___not___starts_with);
            result.setICD9_4___ends_with(this.ICD9_4___ends_with);
            result.setICD9_4___not___ends_with(this.ICD9_4___not___ends_with);
            result.setICD9_5___eq(this.ICD9_5___eq);
            result.setICD9_5___ne(this.ICD9_5___ne);
            result.setICD9_5___null(this.ICD9_5___null);
            result.setICD9_5___not___null(this.ICD9_5___not___null);
            result.setICD9_5___in(this.ICD9_5___in);
            result.setICD9_5___not___in(this.ICD9_5___not___in);
            result.setICD9_5___lt(this.ICD9_5___lt);
            result.setICD9_5___lte(this.ICD9_5___lte);
            result.setICD9_5___gt(this.ICD9_5___gt);
            result.setICD9_5___gte(this.ICD9_5___gte);
            result.setICD9_5___contains(this.ICD9_5___contains);
            result.setICD9_5___not___contains(this.ICD9_5___not___contains);
            result.setICD9_5___starts_with(this.ICD9_5___starts_with);
            result.setICD9_5___not___starts_with(this.ICD9_5___not___starts_with);
            result.setICD9_5___ends_with(this.ICD9_5___ends_with);
            result.setICD9_5___not___ends_with(this.ICD9_5___not___ends_with);
            result.setICD9_6___eq(this.ICD9_6___eq);
            result.setICD9_6___ne(this.ICD9_6___ne);
            result.setICD9_6___null(this.ICD9_6___null);
            result.setICD9_6___not___null(this.ICD9_6___not___null);
            result.setICD9_6___in(this.ICD9_6___in);
            result.setICD9_6___not___in(this.ICD9_6___not___in);
            result.setICD9_6___lt(this.ICD9_6___lt);
            result.setICD9_6___lte(this.ICD9_6___lte);
            result.setICD9_6___gt(this.ICD9_6___gt);
            result.setICD9_6___gte(this.ICD9_6___gte);
            result.setICD9_6___contains(this.ICD9_6___contains);
            result.setICD9_6___not___contains(this.ICD9_6___not___contains);
            result.setICD9_6___starts_with(this.ICD9_6___starts_with);
            result.setICD9_6___not___starts_with(this.ICD9_6___not___starts_with);
            result.setICD9_6___ends_with(this.ICD9_6___ends_with);
            result.setICD9_6___not___ends_with(this.ICD9_6___not___ends_with);
            result.setICD9_7___eq(this.ICD9_7___eq);
            result.setICD9_7___ne(this.ICD9_7___ne);
            result.setICD9_7___null(this.ICD9_7___null);
            result.setICD9_7___not___null(this.ICD9_7___not___null);
            result.setICD9_7___in(this.ICD9_7___in);
            result.setICD9_7___not___in(this.ICD9_7___not___in);
            result.setICD9_7___lt(this.ICD9_7___lt);
            result.setICD9_7___lte(this.ICD9_7___lte);
            result.setICD9_7___gt(this.ICD9_7___gt);
            result.setICD9_7___gte(this.ICD9_7___gte);
            result.setICD9_7___contains(this.ICD9_7___contains);
            result.setICD9_7___not___contains(this.ICD9_7___not___contains);
            result.setICD9_7___starts_with(this.ICD9_7___starts_with);
            result.setICD9_7___not___starts_with(this.ICD9_7___not___starts_with);
            result.setICD9_7___ends_with(this.ICD9_7___ends_with);
            result.setICD9_7___not___ends_with(this.ICD9_7___not___ends_with);
            result.setICD9_8___eq(this.ICD9_8___eq);
            result.setICD9_8___ne(this.ICD9_8___ne);
            result.setICD9_8___null(this.ICD9_8___null);
            result.setICD9_8___not___null(this.ICD9_8___not___null);
            result.setICD9_8___in(this.ICD9_8___in);
            result.setICD9_8___not___in(this.ICD9_8___not___in);
            result.setICD9_8___lt(this.ICD9_8___lt);
            result.setICD9_8___lte(this.ICD9_8___lte);
            result.setICD9_8___gt(this.ICD9_8___gt);
            result.setICD9_8___gte(this.ICD9_8___gte);
            result.setICD9_8___contains(this.ICD9_8___contains);
            result.setICD9_8___not___contains(this.ICD9_8___not___contains);
            result.setICD9_8___starts_with(this.ICD9_8___starts_with);
            result.setICD9_8___not___starts_with(this.ICD9_8___not___starts_with);
            result.setICD9_8___ends_with(this.ICD9_8___ends_with);
            result.setICD9_8___not___ends_with(this.ICD9_8___not___ends_with);
            result.setICD9_9___eq(this.ICD9_9___eq);
            result.setICD9_9___ne(this.ICD9_9___ne);
            result.setICD9_9___null(this.ICD9_9___null);
            result.setICD9_9___not___null(this.ICD9_9___not___null);
            result.setICD9_9___in(this.ICD9_9___in);
            result.setICD9_9___not___in(this.ICD9_9___not___in);
            result.setICD9_9___lt(this.ICD9_9___lt);
            result.setICD9_9___lte(this.ICD9_9___lte);
            result.setICD9_9___gt(this.ICD9_9___gt);
            result.setICD9_9___gte(this.ICD9_9___gte);
            result.setICD9_9___contains(this.ICD9_9___contains);
            result.setICD9_9___not___contains(this.ICD9_9___not___contains);
            result.setICD9_9___starts_with(this.ICD9_9___starts_with);
            result.setICD9_9___not___starts_with(this.ICD9_9___not___starts_with);
            result.setICD9_9___ends_with(this.ICD9_9___ends_with);
            result.setICD9_9___not___ends_with(this.ICD9_9___not___ends_with);
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
            result.setCodice_centro___eq(this.codice_centro___eq);
            result.setCodice_centro___ne(this.codice_centro___ne);
            result.setCodice_centro___null(this.codice_centro___null);
            result.setCodice_centro___not___null(this.codice_centro___not___null);
            result.setCodice_centro___in(this.codice_centro___in);
            result.setCodice_centro___not___in(this.codice_centro___not___in);
            result.setCodice_centro___lt(this.codice_centro___lt);
            result.setCodice_centro___lte(this.codice_centro___lte);
            result.setCodice_centro___gt(this.codice_centro___gt);
            result.setCodice_centro___gte(this.codice_centro___gte);
            result.setCodice_centro___contains(this.codice_centro___contains);
            result.setCodice_centro___not___contains(this.codice_centro___not___contains);
            result.setCodice_centro___starts_with(this.codice_centro___starts_with);
            result.setCodice_centro___not___starts_with(this.codice_centro___not___starts_with);
            result.setCodice_centro___ends_with(this.codice_centro___ends_with);
            result.setCodice_centro___not___ends_with(this.codice_centro___not___ends_with);
            result.setData_approssimata___eq(this.data_approssimata___eq);
            result.setData_approssimata___ne(this.data_approssimata___ne);
            result.setData_approssimata___null(this.data_approssimata___null);
            result.setData_approssimata___not___null(this.data_approssimata___not___null);
            result.setData_dimissione___eq(this.data_dimissione___eq);
            result.setData_dimissione___ne(this.data_dimissione___ne);
            result.setData_dimissione___null(this.data_dimissione___null);
            result.setData_dimissione___not___null(this.data_dimissione___not___null);
            result.setData_dimissione___in(this.data_dimissione___in);
            result.setData_dimissione___not___in(this.data_dimissione___not___in);
            result.setData_dimissione___lt(this.data_dimissione___lt);
            result.setData_dimissione___lte(this.data_dimissione___lte);
            result.setData_dimissione___gt(this.data_dimissione___gt);
            result.setData_dimissione___gte(this.data_dimissione___gte);
            result.setData_ricovero___eq(this.data_ricovero___eq);
            result.setData_ricovero___ne(this.data_ricovero___ne);
            result.setData_ricovero___null(this.data_ricovero___null);
            result.setData_ricovero___not___null(this.data_ricovero___not___null);
            result.setData_ricovero___in(this.data_ricovero___in);
            result.setData_ricovero___not___in(this.data_ricovero___not___in);
            result.setData_ricovero___lt(this.data_ricovero___lt);
            result.setData_ricovero___lte(this.data_ricovero___lte);
            result.setData_ricovero___gt(this.data_ricovero___gt);
            result.setData_ricovero___gte(this.data_ricovero___gte);
            result.setDiagnosi___eq(this.diagnosi___eq);
            result.setDiagnosi___ne(this.diagnosi___ne);
            result.setDiagnosi___null(this.diagnosi___null);
            result.setDiagnosi___not___null(this.diagnosi___not___null);
            result.setDiagnosi___in(this.diagnosi___in);
            result.setDiagnosi___not___in(this.diagnosi___not___in);
            result.setDiagnosi___lt(this.diagnosi___lt);
            result.setDiagnosi___lte(this.diagnosi___lte);
            result.setDiagnosi___gt(this.diagnosi___gt);
            result.setDiagnosi___gte(this.diagnosi___gte);
            result.setDiagnosi___contains(this.diagnosi___contains);
            result.setDiagnosi___not___contains(this.diagnosi___not___contains);
            result.setDiagnosi___starts_with(this.diagnosi___starts_with);
            result.setDiagnosi___not___starts_with(this.diagnosi___not___starts_with);
            result.setDiagnosi___ends_with(this.diagnosi___ends_with);
            result.setDiagnosi___not___ends_with(this.diagnosi___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
