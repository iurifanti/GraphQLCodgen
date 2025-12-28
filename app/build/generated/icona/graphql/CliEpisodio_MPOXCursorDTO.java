package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Episodio_MPOX.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliEpisodio_MPOXCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String altra_terapia;
    private String data;
    private Boolean ricoverato;
    private Boolean terapia;
    private String tipo_terapia;

    public CliEpisodio_MPOXCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAltra_terapia() {
        return altra_terapia;
    }
    public void setAltra_terapia(String altra_terapia) {
        this.altra_terapia = altra_terapia;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public Boolean getRicoverato() {
        return ricoverato;
    }
    public void setRicoverato(Boolean ricoverato) {
        this.ricoverato = ricoverato;
    }

    public Boolean getTerapia() {
        return terapia;
    }
    public void setTerapia(Boolean terapia) {
        this.terapia = terapia;
    }

    public String getTipo_terapia() {
        return tipo_terapia;
    }
    public void setTipo_terapia(String tipo_terapia) {
        this.tipo_terapia = tipo_terapia;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (altra_terapia != null) {
            joiner.add("altra_terapia: " + GraphQLRequestSerializer.getEntry(altra_terapia));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (ricoverato != null) {
            joiner.add("ricoverato: " + GraphQLRequestSerializer.getEntry(ricoverato));
        }
        if (terapia != null) {
            joiner.add("terapia: " + GraphQLRequestSerializer.getEntry(terapia));
        }
        if (tipo_terapia != null) {
            joiner.add("tipo_terapia: " + GraphQLRequestSerializer.getEntry(tipo_terapia));
        }
        return joiner.toString();
    }

    public static CliEpisodio_MPOXCursorDTO.Builder builder() {
        return new CliEpisodio_MPOXCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String altra_terapia;
        private String data;
        private Boolean ricoverato;
        private Boolean terapia;
        private String tipo_terapia;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAltra_terapia(String altra_terapia) {
            this.altra_terapia = altra_terapia;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setRicoverato(Boolean ricoverato) {
            this.ricoverato = ricoverato;
            return this;
        }

        public Builder setTerapia(Boolean terapia) {
            this.terapia = terapia;
            return this;
        }

        public Builder setTipo_terapia(String tipo_terapia) {
            this.tipo_terapia = tipo_terapia;
            return this;
        }


        public CliEpisodio_MPOXCursorDTO build() {
            CliEpisodio_MPOXCursorDTO result = new CliEpisodio_MPOXCursorDTO();
            result.set_id(this._id);
            result.setAltra_terapia(this.altra_terapia);
            result.setData(this.data);
            result.setRicoverato(this.ricoverato);
            result.setTerapia(this.terapia);
            result.setTipo_terapia(this.tipo_terapia);
            return result;
        }

    }
}
