package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific filter for objects of type Episodio_MPOX.
Each attribute can be filtered in different ways (depending on the type of the attribute).
Filters can be composed with the boolean operators AND, OR and NOT.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEpisodio_MPOXFilterDTO implements java.io.Serializable {

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
    private String altra_terapia___eq;
    private String altra_terapia___ne;
    private Boolean altra_terapia___null;
    private Boolean altra_terapia___not___null;
    private java.util.List<String> altra_terapia___in;
    private java.util.List<String> altra_terapia___not___in;
    private String altra_terapia___lt;
    private String altra_terapia___lte;
    private String altra_terapia___gt;
    private String altra_terapia___gte;
    private String altra_terapia___contains;
    private String altra_terapia___not___contains;
    private String altra_terapia___starts_with;
    private String altra_terapia___not___starts_with;
    private String altra_terapia___ends_with;
    private String altra_terapia___not___ends_with;
    private String data___eq;
    private String data___ne;
    private Boolean data___null;
    private Boolean data___not___null;
    private java.util.List<String> data___in;
    private java.util.List<String> data___not___in;
    private String data___lt;
    private String data___lte;
    private String data___gt;
    private String data___gte;
    private Boolean ricoverato___eq;
    private Boolean ricoverato___ne;
    private Boolean ricoverato___null;
    private Boolean ricoverato___not___null;
    private Boolean terapia___eq;
    private Boolean terapia___ne;
    private Boolean terapia___null;
    private Boolean terapia___not___null;
    private String tipo_terapia___eq;
    private String tipo_terapia___ne;
    private Boolean tipo_terapia___null;
    private Boolean tipo_terapia___not___null;
    private java.util.List<String> tipo_terapia___in;
    private java.util.List<String> tipo_terapia___not___in;
    private String tipo_terapia___lt;
    private String tipo_terapia___lte;
    private String tipo_terapia___gt;
    private String tipo_terapia___gte;
    private String tipo_terapia___contains;
    private String tipo_terapia___not___contains;
    private String tipo_terapia___starts_with;
    private String tipo_terapia___not___starts_with;
    private String tipo_terapia___ends_with;
    private String tipo_terapia___not___ends_with;
    private java.util.List<CliEpisodio_MPOXFilterDTO> AND;
    private java.util.List<CliEpisodio_MPOXFilterDTO> OR;
    private CliEpisodio_MPOXFilterDTO NOT;

    public CliEpisodio_MPOXFilterDTO() {
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

    public String getAltra_terapia___eq() {
        return altra_terapia___eq;
    }
    public void setAltra_terapia___eq(String altra_terapia___eq) {
        this.altra_terapia___eq = altra_terapia___eq;
    }

    public String getAltra_terapia___ne() {
        return altra_terapia___ne;
    }
    public void setAltra_terapia___ne(String altra_terapia___ne) {
        this.altra_terapia___ne = altra_terapia___ne;
    }

    public Boolean getAltra_terapia___null() {
        return altra_terapia___null;
    }
    public void setAltra_terapia___null(Boolean altra_terapia___null) {
        this.altra_terapia___null = altra_terapia___null;
    }

    public Boolean getAltra_terapia___not___null() {
        return altra_terapia___not___null;
    }
    public void setAltra_terapia___not___null(Boolean altra_terapia___not___null) {
        this.altra_terapia___not___null = altra_terapia___not___null;
    }

    public java.util.List<String> getAltra_terapia___in() {
        return altra_terapia___in;
    }
    public void setAltra_terapia___in(java.util.List<String> altra_terapia___in) {
        this.altra_terapia___in = altra_terapia___in;
    }

    public java.util.List<String> getAltra_terapia___not___in() {
        return altra_terapia___not___in;
    }
    public void setAltra_terapia___not___in(java.util.List<String> altra_terapia___not___in) {
        this.altra_terapia___not___in = altra_terapia___not___in;
    }

    public String getAltra_terapia___lt() {
        return altra_terapia___lt;
    }
    public void setAltra_terapia___lt(String altra_terapia___lt) {
        this.altra_terapia___lt = altra_terapia___lt;
    }

    public String getAltra_terapia___lte() {
        return altra_terapia___lte;
    }
    public void setAltra_terapia___lte(String altra_terapia___lte) {
        this.altra_terapia___lte = altra_terapia___lte;
    }

    public String getAltra_terapia___gt() {
        return altra_terapia___gt;
    }
    public void setAltra_terapia___gt(String altra_terapia___gt) {
        this.altra_terapia___gt = altra_terapia___gt;
    }

    public String getAltra_terapia___gte() {
        return altra_terapia___gte;
    }
    public void setAltra_terapia___gte(String altra_terapia___gte) {
        this.altra_terapia___gte = altra_terapia___gte;
    }

    public String getAltra_terapia___contains() {
        return altra_terapia___contains;
    }
    public void setAltra_terapia___contains(String altra_terapia___contains) {
        this.altra_terapia___contains = altra_terapia___contains;
    }

    public String getAltra_terapia___not___contains() {
        return altra_terapia___not___contains;
    }
    public void setAltra_terapia___not___contains(String altra_terapia___not___contains) {
        this.altra_terapia___not___contains = altra_terapia___not___contains;
    }

    public String getAltra_terapia___starts_with() {
        return altra_terapia___starts_with;
    }
    public void setAltra_terapia___starts_with(String altra_terapia___starts_with) {
        this.altra_terapia___starts_with = altra_terapia___starts_with;
    }

    public String getAltra_terapia___not___starts_with() {
        return altra_terapia___not___starts_with;
    }
    public void setAltra_terapia___not___starts_with(String altra_terapia___not___starts_with) {
        this.altra_terapia___not___starts_with = altra_terapia___not___starts_with;
    }

    public String getAltra_terapia___ends_with() {
        return altra_terapia___ends_with;
    }
    public void setAltra_terapia___ends_with(String altra_terapia___ends_with) {
        this.altra_terapia___ends_with = altra_terapia___ends_with;
    }

    public String getAltra_terapia___not___ends_with() {
        return altra_terapia___not___ends_with;
    }
    public void setAltra_terapia___not___ends_with(String altra_terapia___not___ends_with) {
        this.altra_terapia___not___ends_with = altra_terapia___not___ends_with;
    }

    public String getData___eq() {
        return data___eq;
    }
    public void setData___eq(String data___eq) {
        this.data___eq = data___eq;
    }

    public String getData___ne() {
        return data___ne;
    }
    public void setData___ne(String data___ne) {
        this.data___ne = data___ne;
    }

    public Boolean getData___null() {
        return data___null;
    }
    public void setData___null(Boolean data___null) {
        this.data___null = data___null;
    }

    public Boolean getData___not___null() {
        return data___not___null;
    }
    public void setData___not___null(Boolean data___not___null) {
        this.data___not___null = data___not___null;
    }

    public java.util.List<String> getData___in() {
        return data___in;
    }
    public void setData___in(java.util.List<String> data___in) {
        this.data___in = data___in;
    }

    public java.util.List<String> getData___not___in() {
        return data___not___in;
    }
    public void setData___not___in(java.util.List<String> data___not___in) {
        this.data___not___in = data___not___in;
    }

    public String getData___lt() {
        return data___lt;
    }
    public void setData___lt(String data___lt) {
        this.data___lt = data___lt;
    }

    public String getData___lte() {
        return data___lte;
    }
    public void setData___lte(String data___lte) {
        this.data___lte = data___lte;
    }

    public String getData___gt() {
        return data___gt;
    }
    public void setData___gt(String data___gt) {
        this.data___gt = data___gt;
    }

    public String getData___gte() {
        return data___gte;
    }
    public void setData___gte(String data___gte) {
        this.data___gte = data___gte;
    }

    public Boolean getRicoverato___eq() {
        return ricoverato___eq;
    }
    public void setRicoverato___eq(Boolean ricoverato___eq) {
        this.ricoverato___eq = ricoverato___eq;
    }

    public Boolean getRicoverato___ne() {
        return ricoverato___ne;
    }
    public void setRicoverato___ne(Boolean ricoverato___ne) {
        this.ricoverato___ne = ricoverato___ne;
    }

    public Boolean getRicoverato___null() {
        return ricoverato___null;
    }
    public void setRicoverato___null(Boolean ricoverato___null) {
        this.ricoverato___null = ricoverato___null;
    }

    public Boolean getRicoverato___not___null() {
        return ricoverato___not___null;
    }
    public void setRicoverato___not___null(Boolean ricoverato___not___null) {
        this.ricoverato___not___null = ricoverato___not___null;
    }

    public Boolean getTerapia___eq() {
        return terapia___eq;
    }
    public void setTerapia___eq(Boolean terapia___eq) {
        this.terapia___eq = terapia___eq;
    }

    public Boolean getTerapia___ne() {
        return terapia___ne;
    }
    public void setTerapia___ne(Boolean terapia___ne) {
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

    public String getTipo_terapia___eq() {
        return tipo_terapia___eq;
    }
    public void setTipo_terapia___eq(String tipo_terapia___eq) {
        this.tipo_terapia___eq = tipo_terapia___eq;
    }

    public String getTipo_terapia___ne() {
        return tipo_terapia___ne;
    }
    public void setTipo_terapia___ne(String tipo_terapia___ne) {
        this.tipo_terapia___ne = tipo_terapia___ne;
    }

    public Boolean getTipo_terapia___null() {
        return tipo_terapia___null;
    }
    public void setTipo_terapia___null(Boolean tipo_terapia___null) {
        this.tipo_terapia___null = tipo_terapia___null;
    }

    public Boolean getTipo_terapia___not___null() {
        return tipo_terapia___not___null;
    }
    public void setTipo_terapia___not___null(Boolean tipo_terapia___not___null) {
        this.tipo_terapia___not___null = tipo_terapia___not___null;
    }

    public java.util.List<String> getTipo_terapia___in() {
        return tipo_terapia___in;
    }
    public void setTipo_terapia___in(java.util.List<String> tipo_terapia___in) {
        this.tipo_terapia___in = tipo_terapia___in;
    }

    public java.util.List<String> getTipo_terapia___not___in() {
        return tipo_terapia___not___in;
    }
    public void setTipo_terapia___not___in(java.util.List<String> tipo_terapia___not___in) {
        this.tipo_terapia___not___in = tipo_terapia___not___in;
    }

    public String getTipo_terapia___lt() {
        return tipo_terapia___lt;
    }
    public void setTipo_terapia___lt(String tipo_terapia___lt) {
        this.tipo_terapia___lt = tipo_terapia___lt;
    }

    public String getTipo_terapia___lte() {
        return tipo_terapia___lte;
    }
    public void setTipo_terapia___lte(String tipo_terapia___lte) {
        this.tipo_terapia___lte = tipo_terapia___lte;
    }

    public String getTipo_terapia___gt() {
        return tipo_terapia___gt;
    }
    public void setTipo_terapia___gt(String tipo_terapia___gt) {
        this.tipo_terapia___gt = tipo_terapia___gt;
    }

    public String getTipo_terapia___gte() {
        return tipo_terapia___gte;
    }
    public void setTipo_terapia___gte(String tipo_terapia___gte) {
        this.tipo_terapia___gte = tipo_terapia___gte;
    }

    public String getTipo_terapia___contains() {
        return tipo_terapia___contains;
    }
    public void setTipo_terapia___contains(String tipo_terapia___contains) {
        this.tipo_terapia___contains = tipo_terapia___contains;
    }

    public String getTipo_terapia___not___contains() {
        return tipo_terapia___not___contains;
    }
    public void setTipo_terapia___not___contains(String tipo_terapia___not___contains) {
        this.tipo_terapia___not___contains = tipo_terapia___not___contains;
    }

    public String getTipo_terapia___starts_with() {
        return tipo_terapia___starts_with;
    }
    public void setTipo_terapia___starts_with(String tipo_terapia___starts_with) {
        this.tipo_terapia___starts_with = tipo_terapia___starts_with;
    }

    public String getTipo_terapia___not___starts_with() {
        return tipo_terapia___not___starts_with;
    }
    public void setTipo_terapia___not___starts_with(String tipo_terapia___not___starts_with) {
        this.tipo_terapia___not___starts_with = tipo_terapia___not___starts_with;
    }

    public String getTipo_terapia___ends_with() {
        return tipo_terapia___ends_with;
    }
    public void setTipo_terapia___ends_with(String tipo_terapia___ends_with) {
        this.tipo_terapia___ends_with = tipo_terapia___ends_with;
    }

    public String getTipo_terapia___not___ends_with() {
        return tipo_terapia___not___ends_with;
    }
    public void setTipo_terapia___not___ends_with(String tipo_terapia___not___ends_with) {
        this.tipo_terapia___not___ends_with = tipo_terapia___not___ends_with;
    }

    public java.util.List<CliEpisodio_MPOXFilterDTO> getAND() {
        return AND;
    }
    public void setAND(java.util.List<CliEpisodio_MPOXFilterDTO> AND) {
        this.AND = AND;
    }

    public java.util.List<CliEpisodio_MPOXFilterDTO> getOR() {
        return OR;
    }
    public void setOR(java.util.List<CliEpisodio_MPOXFilterDTO> OR) {
        this.OR = OR;
    }

    public CliEpisodio_MPOXFilterDTO getNOT() {
        return NOT;
    }
    public void setNOT(CliEpisodio_MPOXFilterDTO NOT) {
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
        if (altra_terapia___eq != null) {
            joiner.add("altra_terapia___eq: " + GraphQLRequestSerializer.getEntry(altra_terapia___eq));
        }
        if (altra_terapia___ne != null) {
            joiner.add("altra_terapia___ne: " + GraphQLRequestSerializer.getEntry(altra_terapia___ne));
        }
        if (altra_terapia___null != null) {
            joiner.add("altra_terapia___null: " + GraphQLRequestSerializer.getEntry(altra_terapia___null));
        }
        if (altra_terapia___not___null != null) {
            joiner.add("altra_terapia___not___null: " + GraphQLRequestSerializer.getEntry(altra_terapia___not___null));
        }
        if (altra_terapia___in != null) {
            joiner.add("altra_terapia___in: " + GraphQLRequestSerializer.getEntry(altra_terapia___in));
        }
        if (altra_terapia___not___in != null) {
            joiner.add("altra_terapia___not___in: " + GraphQLRequestSerializer.getEntry(altra_terapia___not___in));
        }
        if (altra_terapia___lt != null) {
            joiner.add("altra_terapia___lt: " + GraphQLRequestSerializer.getEntry(altra_terapia___lt));
        }
        if (altra_terapia___lte != null) {
            joiner.add("altra_terapia___lte: " + GraphQLRequestSerializer.getEntry(altra_terapia___lte));
        }
        if (altra_terapia___gt != null) {
            joiner.add("altra_terapia___gt: " + GraphQLRequestSerializer.getEntry(altra_terapia___gt));
        }
        if (altra_terapia___gte != null) {
            joiner.add("altra_terapia___gte: " + GraphQLRequestSerializer.getEntry(altra_terapia___gte));
        }
        if (altra_terapia___contains != null) {
            joiner.add("altra_terapia___contains: " + GraphQLRequestSerializer.getEntry(altra_terapia___contains));
        }
        if (altra_terapia___not___contains != null) {
            joiner.add("altra_terapia___not___contains: " + GraphQLRequestSerializer.getEntry(altra_terapia___not___contains));
        }
        if (altra_terapia___starts_with != null) {
            joiner.add("altra_terapia___starts_with: " + GraphQLRequestSerializer.getEntry(altra_terapia___starts_with));
        }
        if (altra_terapia___not___starts_with != null) {
            joiner.add("altra_terapia___not___starts_with: " + GraphQLRequestSerializer.getEntry(altra_terapia___not___starts_with));
        }
        if (altra_terapia___ends_with != null) {
            joiner.add("altra_terapia___ends_with: " + GraphQLRequestSerializer.getEntry(altra_terapia___ends_with));
        }
        if (altra_terapia___not___ends_with != null) {
            joiner.add("altra_terapia___not___ends_with: " + GraphQLRequestSerializer.getEntry(altra_terapia___not___ends_with));
        }
        if (data___eq != null) {
            joiner.add("data___eq: " + GraphQLRequestSerializer.getEntry(data___eq));
        }
        if (data___ne != null) {
            joiner.add("data___ne: " + GraphQLRequestSerializer.getEntry(data___ne));
        }
        if (data___null != null) {
            joiner.add("data___null: " + GraphQLRequestSerializer.getEntry(data___null));
        }
        if (data___not___null != null) {
            joiner.add("data___not___null: " + GraphQLRequestSerializer.getEntry(data___not___null));
        }
        if (data___in != null) {
            joiner.add("data___in: " + GraphQLRequestSerializer.getEntry(data___in));
        }
        if (data___not___in != null) {
            joiner.add("data___not___in: " + GraphQLRequestSerializer.getEntry(data___not___in));
        }
        if (data___lt != null) {
            joiner.add("data___lt: " + GraphQLRequestSerializer.getEntry(data___lt));
        }
        if (data___lte != null) {
            joiner.add("data___lte: " + GraphQLRequestSerializer.getEntry(data___lte));
        }
        if (data___gt != null) {
            joiner.add("data___gt: " + GraphQLRequestSerializer.getEntry(data___gt));
        }
        if (data___gte != null) {
            joiner.add("data___gte: " + GraphQLRequestSerializer.getEntry(data___gte));
        }
        if (ricoverato___eq != null) {
            joiner.add("ricoverato___eq: " + GraphQLRequestSerializer.getEntry(ricoverato___eq));
        }
        if (ricoverato___ne != null) {
            joiner.add("ricoverato___ne: " + GraphQLRequestSerializer.getEntry(ricoverato___ne));
        }
        if (ricoverato___null != null) {
            joiner.add("ricoverato___null: " + GraphQLRequestSerializer.getEntry(ricoverato___null));
        }
        if (ricoverato___not___null != null) {
            joiner.add("ricoverato___not___null: " + GraphQLRequestSerializer.getEntry(ricoverato___not___null));
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
        if (tipo_terapia___eq != null) {
            joiner.add("tipo_terapia___eq: " + GraphQLRequestSerializer.getEntry(tipo_terapia___eq));
        }
        if (tipo_terapia___ne != null) {
            joiner.add("tipo_terapia___ne: " + GraphQLRequestSerializer.getEntry(tipo_terapia___ne));
        }
        if (tipo_terapia___null != null) {
            joiner.add("tipo_terapia___null: " + GraphQLRequestSerializer.getEntry(tipo_terapia___null));
        }
        if (tipo_terapia___not___null != null) {
            joiner.add("tipo_terapia___not___null: " + GraphQLRequestSerializer.getEntry(tipo_terapia___not___null));
        }
        if (tipo_terapia___in != null) {
            joiner.add("tipo_terapia___in: " + GraphQLRequestSerializer.getEntry(tipo_terapia___in));
        }
        if (tipo_terapia___not___in != null) {
            joiner.add("tipo_terapia___not___in: " + GraphQLRequestSerializer.getEntry(tipo_terapia___not___in));
        }
        if (tipo_terapia___lt != null) {
            joiner.add("tipo_terapia___lt: " + GraphQLRequestSerializer.getEntry(tipo_terapia___lt));
        }
        if (tipo_terapia___lte != null) {
            joiner.add("tipo_terapia___lte: " + GraphQLRequestSerializer.getEntry(tipo_terapia___lte));
        }
        if (tipo_terapia___gt != null) {
            joiner.add("tipo_terapia___gt: " + GraphQLRequestSerializer.getEntry(tipo_terapia___gt));
        }
        if (tipo_terapia___gte != null) {
            joiner.add("tipo_terapia___gte: " + GraphQLRequestSerializer.getEntry(tipo_terapia___gte));
        }
        if (tipo_terapia___contains != null) {
            joiner.add("tipo_terapia___contains: " + GraphQLRequestSerializer.getEntry(tipo_terapia___contains));
        }
        if (tipo_terapia___not___contains != null) {
            joiner.add("tipo_terapia___not___contains: " + GraphQLRequestSerializer.getEntry(tipo_terapia___not___contains));
        }
        if (tipo_terapia___starts_with != null) {
            joiner.add("tipo_terapia___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_terapia___starts_with));
        }
        if (tipo_terapia___not___starts_with != null) {
            joiner.add("tipo_terapia___not___starts_with: " + GraphQLRequestSerializer.getEntry(tipo_terapia___not___starts_with));
        }
        if (tipo_terapia___ends_with != null) {
            joiner.add("tipo_terapia___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_terapia___ends_with));
        }
        if (tipo_terapia___not___ends_with != null) {
            joiner.add("tipo_terapia___not___ends_with: " + GraphQLRequestSerializer.getEntry(tipo_terapia___not___ends_with));
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

    public static CliEpisodio_MPOXFilterDTO.Builder builder() {
        return new CliEpisodio_MPOXFilterDTO.Builder();
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
        private String altra_terapia___eq;
        private String altra_terapia___ne;
        private Boolean altra_terapia___null;
        private Boolean altra_terapia___not___null;
        private java.util.List<String> altra_terapia___in;
        private java.util.List<String> altra_terapia___not___in;
        private String altra_terapia___lt;
        private String altra_terapia___lte;
        private String altra_terapia___gt;
        private String altra_terapia___gte;
        private String altra_terapia___contains;
        private String altra_terapia___not___contains;
        private String altra_terapia___starts_with;
        private String altra_terapia___not___starts_with;
        private String altra_terapia___ends_with;
        private String altra_terapia___not___ends_with;
        private String data___eq;
        private String data___ne;
        private Boolean data___null;
        private Boolean data___not___null;
        private java.util.List<String> data___in;
        private java.util.List<String> data___not___in;
        private String data___lt;
        private String data___lte;
        private String data___gt;
        private String data___gte;
        private Boolean ricoverato___eq;
        private Boolean ricoverato___ne;
        private Boolean ricoverato___null;
        private Boolean ricoverato___not___null;
        private Boolean terapia___eq;
        private Boolean terapia___ne;
        private Boolean terapia___null;
        private Boolean terapia___not___null;
        private String tipo_terapia___eq;
        private String tipo_terapia___ne;
        private Boolean tipo_terapia___null;
        private Boolean tipo_terapia___not___null;
        private java.util.List<String> tipo_terapia___in;
        private java.util.List<String> tipo_terapia___not___in;
        private String tipo_terapia___lt;
        private String tipo_terapia___lte;
        private String tipo_terapia___gt;
        private String tipo_terapia___gte;
        private String tipo_terapia___contains;
        private String tipo_terapia___not___contains;
        private String tipo_terapia___starts_with;
        private String tipo_terapia___not___starts_with;
        private String tipo_terapia___ends_with;
        private String tipo_terapia___not___ends_with;
        private java.util.List<CliEpisodio_MPOXFilterDTO> AND;
        private java.util.List<CliEpisodio_MPOXFilterDTO> OR;
        private CliEpisodio_MPOXFilterDTO NOT;

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

        public Builder setAltra_terapia___eq(String altra_terapia___eq) {
            this.altra_terapia___eq = altra_terapia___eq;
            return this;
        }

        public Builder setAltra_terapia___ne(String altra_terapia___ne) {
            this.altra_terapia___ne = altra_terapia___ne;
            return this;
        }

        public Builder setAltra_terapia___null(Boolean altra_terapia___null) {
            this.altra_terapia___null = altra_terapia___null;
            return this;
        }

        public Builder setAltra_terapia___not___null(Boolean altra_terapia___not___null) {
            this.altra_terapia___not___null = altra_terapia___not___null;
            return this;
        }

        public Builder setAltra_terapia___in(java.util.List<String> altra_terapia___in) {
            this.altra_terapia___in = altra_terapia___in;
            return this;
        }

        public Builder setAltra_terapia___not___in(java.util.List<String> altra_terapia___not___in) {
            this.altra_terapia___not___in = altra_terapia___not___in;
            return this;
        }

        public Builder setAltra_terapia___lt(String altra_terapia___lt) {
            this.altra_terapia___lt = altra_terapia___lt;
            return this;
        }

        public Builder setAltra_terapia___lte(String altra_terapia___lte) {
            this.altra_terapia___lte = altra_terapia___lte;
            return this;
        }

        public Builder setAltra_terapia___gt(String altra_terapia___gt) {
            this.altra_terapia___gt = altra_terapia___gt;
            return this;
        }

        public Builder setAltra_terapia___gte(String altra_terapia___gte) {
            this.altra_terapia___gte = altra_terapia___gte;
            return this;
        }

        public Builder setAltra_terapia___contains(String altra_terapia___contains) {
            this.altra_terapia___contains = altra_terapia___contains;
            return this;
        }

        public Builder setAltra_terapia___not___contains(String altra_terapia___not___contains) {
            this.altra_terapia___not___contains = altra_terapia___not___contains;
            return this;
        }

        public Builder setAltra_terapia___starts_with(String altra_terapia___starts_with) {
            this.altra_terapia___starts_with = altra_terapia___starts_with;
            return this;
        }

        public Builder setAltra_terapia___not___starts_with(String altra_terapia___not___starts_with) {
            this.altra_terapia___not___starts_with = altra_terapia___not___starts_with;
            return this;
        }

        public Builder setAltra_terapia___ends_with(String altra_terapia___ends_with) {
            this.altra_terapia___ends_with = altra_terapia___ends_with;
            return this;
        }

        public Builder setAltra_terapia___not___ends_with(String altra_terapia___not___ends_with) {
            this.altra_terapia___not___ends_with = altra_terapia___not___ends_with;
            return this;
        }

        public Builder setData___eq(String data___eq) {
            this.data___eq = data___eq;
            return this;
        }

        public Builder setData___ne(String data___ne) {
            this.data___ne = data___ne;
            return this;
        }

        public Builder setData___null(Boolean data___null) {
            this.data___null = data___null;
            return this;
        }

        public Builder setData___not___null(Boolean data___not___null) {
            this.data___not___null = data___not___null;
            return this;
        }

        public Builder setData___in(java.util.List<String> data___in) {
            this.data___in = data___in;
            return this;
        }

        public Builder setData___not___in(java.util.List<String> data___not___in) {
            this.data___not___in = data___not___in;
            return this;
        }

        public Builder setData___lt(String data___lt) {
            this.data___lt = data___lt;
            return this;
        }

        public Builder setData___lte(String data___lte) {
            this.data___lte = data___lte;
            return this;
        }

        public Builder setData___gt(String data___gt) {
            this.data___gt = data___gt;
            return this;
        }

        public Builder setData___gte(String data___gte) {
            this.data___gte = data___gte;
            return this;
        }

        public Builder setRicoverato___eq(Boolean ricoverato___eq) {
            this.ricoverato___eq = ricoverato___eq;
            return this;
        }

        public Builder setRicoverato___ne(Boolean ricoverato___ne) {
            this.ricoverato___ne = ricoverato___ne;
            return this;
        }

        public Builder setRicoverato___null(Boolean ricoverato___null) {
            this.ricoverato___null = ricoverato___null;
            return this;
        }

        public Builder setRicoverato___not___null(Boolean ricoverato___not___null) {
            this.ricoverato___not___null = ricoverato___not___null;
            return this;
        }

        public Builder setTerapia___eq(Boolean terapia___eq) {
            this.terapia___eq = terapia___eq;
            return this;
        }

        public Builder setTerapia___ne(Boolean terapia___ne) {
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

        public Builder setTipo_terapia___eq(String tipo_terapia___eq) {
            this.tipo_terapia___eq = tipo_terapia___eq;
            return this;
        }

        public Builder setTipo_terapia___ne(String tipo_terapia___ne) {
            this.tipo_terapia___ne = tipo_terapia___ne;
            return this;
        }

        public Builder setTipo_terapia___null(Boolean tipo_terapia___null) {
            this.tipo_terapia___null = tipo_terapia___null;
            return this;
        }

        public Builder setTipo_terapia___not___null(Boolean tipo_terapia___not___null) {
            this.tipo_terapia___not___null = tipo_terapia___not___null;
            return this;
        }

        public Builder setTipo_terapia___in(java.util.List<String> tipo_terapia___in) {
            this.tipo_terapia___in = tipo_terapia___in;
            return this;
        }

        public Builder setTipo_terapia___not___in(java.util.List<String> tipo_terapia___not___in) {
            this.tipo_terapia___not___in = tipo_terapia___not___in;
            return this;
        }

        public Builder setTipo_terapia___lt(String tipo_terapia___lt) {
            this.tipo_terapia___lt = tipo_terapia___lt;
            return this;
        }

        public Builder setTipo_terapia___lte(String tipo_terapia___lte) {
            this.tipo_terapia___lte = tipo_terapia___lte;
            return this;
        }

        public Builder setTipo_terapia___gt(String tipo_terapia___gt) {
            this.tipo_terapia___gt = tipo_terapia___gt;
            return this;
        }

        public Builder setTipo_terapia___gte(String tipo_terapia___gte) {
            this.tipo_terapia___gte = tipo_terapia___gte;
            return this;
        }

        public Builder setTipo_terapia___contains(String tipo_terapia___contains) {
            this.tipo_terapia___contains = tipo_terapia___contains;
            return this;
        }

        public Builder setTipo_terapia___not___contains(String tipo_terapia___not___contains) {
            this.tipo_terapia___not___contains = tipo_terapia___not___contains;
            return this;
        }

        public Builder setTipo_terapia___starts_with(String tipo_terapia___starts_with) {
            this.tipo_terapia___starts_with = tipo_terapia___starts_with;
            return this;
        }

        public Builder setTipo_terapia___not___starts_with(String tipo_terapia___not___starts_with) {
            this.tipo_terapia___not___starts_with = tipo_terapia___not___starts_with;
            return this;
        }

        public Builder setTipo_terapia___ends_with(String tipo_terapia___ends_with) {
            this.tipo_terapia___ends_with = tipo_terapia___ends_with;
            return this;
        }

        public Builder setTipo_terapia___not___ends_with(String tipo_terapia___not___ends_with) {
            this.tipo_terapia___not___ends_with = tipo_terapia___not___ends_with;
            return this;
        }

        public Builder setAND(java.util.List<CliEpisodio_MPOXFilterDTO> AND) {
            this.AND = AND;
            return this;
        }

        public Builder setOR(java.util.List<CliEpisodio_MPOXFilterDTO> OR) {
            this.OR = OR;
            return this;
        }

        public Builder setNOT(CliEpisodio_MPOXFilterDTO NOT) {
            this.NOT = NOT;
            return this;
        }


        public CliEpisodio_MPOXFilterDTO build() {
            CliEpisodio_MPOXFilterDTO result = new CliEpisodio_MPOXFilterDTO();
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
            result.setAltra_terapia___eq(this.altra_terapia___eq);
            result.setAltra_terapia___ne(this.altra_terapia___ne);
            result.setAltra_terapia___null(this.altra_terapia___null);
            result.setAltra_terapia___not___null(this.altra_terapia___not___null);
            result.setAltra_terapia___in(this.altra_terapia___in);
            result.setAltra_terapia___not___in(this.altra_terapia___not___in);
            result.setAltra_terapia___lt(this.altra_terapia___lt);
            result.setAltra_terapia___lte(this.altra_terapia___lte);
            result.setAltra_terapia___gt(this.altra_terapia___gt);
            result.setAltra_terapia___gte(this.altra_terapia___gte);
            result.setAltra_terapia___contains(this.altra_terapia___contains);
            result.setAltra_terapia___not___contains(this.altra_terapia___not___contains);
            result.setAltra_terapia___starts_with(this.altra_terapia___starts_with);
            result.setAltra_terapia___not___starts_with(this.altra_terapia___not___starts_with);
            result.setAltra_terapia___ends_with(this.altra_terapia___ends_with);
            result.setAltra_terapia___not___ends_with(this.altra_terapia___not___ends_with);
            result.setData___eq(this.data___eq);
            result.setData___ne(this.data___ne);
            result.setData___null(this.data___null);
            result.setData___not___null(this.data___not___null);
            result.setData___in(this.data___in);
            result.setData___not___in(this.data___not___in);
            result.setData___lt(this.data___lt);
            result.setData___lte(this.data___lte);
            result.setData___gt(this.data___gt);
            result.setData___gte(this.data___gte);
            result.setRicoverato___eq(this.ricoverato___eq);
            result.setRicoverato___ne(this.ricoverato___ne);
            result.setRicoverato___null(this.ricoverato___null);
            result.setRicoverato___not___null(this.ricoverato___not___null);
            result.setTerapia___eq(this.terapia___eq);
            result.setTerapia___ne(this.terapia___ne);
            result.setTerapia___null(this.terapia___null);
            result.setTerapia___not___null(this.terapia___not___null);
            result.setTipo_terapia___eq(this.tipo_terapia___eq);
            result.setTipo_terapia___ne(this.tipo_terapia___ne);
            result.setTipo_terapia___null(this.tipo_terapia___null);
            result.setTipo_terapia___not___null(this.tipo_terapia___not___null);
            result.setTipo_terapia___in(this.tipo_terapia___in);
            result.setTipo_terapia___not___in(this.tipo_terapia___not___in);
            result.setTipo_terapia___lt(this.tipo_terapia___lt);
            result.setTipo_terapia___lte(this.tipo_terapia___lte);
            result.setTipo_terapia___gt(this.tipo_terapia___gt);
            result.setTipo_terapia___gte(this.tipo_terapia___gte);
            result.setTipo_terapia___contains(this.tipo_terapia___contains);
            result.setTipo_terapia___not___contains(this.tipo_terapia___not___contains);
            result.setTipo_terapia___starts_with(this.tipo_terapia___starts_with);
            result.setTipo_terapia___not___starts_with(this.tipo_terapia___not___starts_with);
            result.setTipo_terapia___ends_with(this.tipo_terapia___ends_with);
            result.setTipo_terapia___not___ends_with(this.tipo_terapia___not___ends_with);
            result.setAND(this.AND);
            result.setOR(this.OR);
            result.setNOT(this.NOT);
            return result;
        }

    }
}
