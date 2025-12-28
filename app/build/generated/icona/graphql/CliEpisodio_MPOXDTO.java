package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Episodio_MPOX, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEpisodio_MPOXDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String altra_terapia;
    private String data;
    private Boolean ricoverato;
    private Boolean terapia;
    private String tipo_terapia;
    private CliVisita_mpvDTO visita_mpv_;

    public CliEpisodio_MPOXDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _id of Episodio_MPOX. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Episodio_MPOX. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altra_terapia of Episodio_MPOX. It is of type String. Max length: 255.
     */
    public String getAltra_terapia() {
        return altra_terapia;
    }
    /**
     * The attribute altra_terapia of Episodio_MPOX. It is of type String. Max length: 255.
     */
    public void setAltra_terapia(String altra_terapia) {
        this.altra_terapia = altra_terapia;
    }

    /**
     * The attribute data of Episodio_MPOX. It is of type Date @dateFormat.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Episodio_MPOX. It is of type Date @dateFormat.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute ricoverato of Episodio_MPOX. It is of type Boolean.
     */
    public Boolean getRicoverato() {
        return ricoverato;
    }
    /**
     * The attribute ricoverato of Episodio_MPOX. It is of type Boolean.
     */
    public void setRicoverato(Boolean ricoverato) {
        this.ricoverato = ricoverato;
    }

    /**
     * The attribute terapia of Episodio_MPOX. It is of type Boolean.
     */
    public Boolean getTerapia() {
        return terapia;
    }
    /**
     * The attribute terapia of Episodio_MPOX. It is of type Boolean.
     */
    public void setTerapia(Boolean terapia) {
        this.terapia = terapia;
    }

    /**
     * The attribute tipo_terapia of Episodio_MPOX. It is of type String. Domain: Tecovirimat OR Cidofovir.}Max length: 255.
     */
    public String getTipo_terapia() {
        return tipo_terapia;
    }
    /**
     * The attribute tipo_terapia of Episodio_MPOX. It is of type String. Domain: Tecovirimat OR Cidofovir.}Max length: 255.
     */
    public void setTipo_terapia(String tipo_terapia) {
        this.tipo_terapia = tipo_terapia;
    }

    /**
     * The associated object for the role visita_mpv_.
     */
    public CliVisita_mpvDTO getVisita_mpv_() {
        return visita_mpv_;
    }
    /**
     * The associated object for the role visita_mpv_.
     */
    public void setVisita_mpv_(CliVisita_mpvDTO visita_mpv_) {
        this.visita_mpv_ = visita_mpv_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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
        if (visita_mpv_ != null) {
            joiner.add("visita_mpv_: " + GraphQLRequestSerializer.getEntry(visita_mpv_));
        }
        return joiner.toString();
    }

    public static CliEpisodio_MPOXDTO.Builder builder() {
        return new CliEpisodio_MPOXDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String altra_terapia;
        private String data;
        private Boolean ricoverato;
        private Boolean terapia;
        private String tipo_terapia;
        private CliVisita_mpvDTO visita_mpv_;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _id of Episodio_MPOX. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altra_terapia of Episodio_MPOX. It is of type String. Max length: 255.
         */
        public Builder setAltra_terapia(String altra_terapia) {
            this.altra_terapia = altra_terapia;
            return this;
        }

        /**
         * The attribute data of Episodio_MPOX. It is of type Date @dateFormat.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute ricoverato of Episodio_MPOX. It is of type Boolean.
         */
        public Builder setRicoverato(Boolean ricoverato) {
            this.ricoverato = ricoverato;
            return this;
        }

        /**
         * The attribute terapia of Episodio_MPOX. It is of type Boolean.
         */
        public Builder setTerapia(Boolean terapia) {
            this.terapia = terapia;
            return this;
        }

        /**
         * The attribute tipo_terapia of Episodio_MPOX. It is of type String. Domain: Tecovirimat OR Cidofovir.}Max length: 255.
         */
        public Builder setTipo_terapia(String tipo_terapia) {
            this.tipo_terapia = tipo_terapia;
            return this;
        }

        /**
         * The associated object for the role visita_mpv_.
         */
        public Builder setVisita_mpv_(CliVisita_mpvDTO visita_mpv_) {
            this.visita_mpv_ = visita_mpv_;
            return this;
        }


        public CliEpisodio_MPOXDTO build() {
            CliEpisodio_MPOXDTO result = new CliEpisodio_MPOXDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAltra_terapia(this.altra_terapia);
            result.setData(this.data);
            result.setRicoverato(this.ricoverato);
            result.setTerapia(this.terapia);
            result.setTipo_terapia(this.tipo_terapia);
            result.setVisita_mpv_(this.visita_mpv_);
            return result;
        }

    }
}
