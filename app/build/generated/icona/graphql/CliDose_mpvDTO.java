package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Dose_mpv, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDose_mpvDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String ciclo;
    private String modalita_somministrazione;
    private Integer numero_dose;
    private CliModalita_somministrazioneDTO modalita_somministrazione_;
    private CliVisita_mpvDTO visita_mpv_;

    public CliDose_mpvDTO() {
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
     * The attribute _id of Dose_mpv. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Dose_mpv. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute ciclo of Dose_mpv. It is of type String. Domain: Primario OR Booster.}Max length: 255.Cannot be null.
     */
    public String getCiclo() {
        return ciclo;
    }
    /**
     * The attribute ciclo of Dose_mpv. It is of type String. Domain: Primario OR Booster.}Max length: 255.Cannot be null.
     */
    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    /**
     * The attribute modalita_somministrazione of Dose_mpv. It is of type String. Path: modalita_somministrazione_ nome. Cannot be null.
     */
    public String getModalita_somministrazione() {
        return modalita_somministrazione;
    }
    /**
     * The attribute modalita_somministrazione of Dose_mpv. It is of type String. Path: modalita_somministrazione_ nome. Cannot be null.
     */
    public void setModalita_somministrazione(String modalita_somministrazione) {
        this.modalita_somministrazione = modalita_somministrazione;
    }

    /**
     * The attribute numero_dose of Dose_mpv. It is of type Int. Ranges: 1:3.
     */
    public Integer getNumero_dose() {
        return numero_dose;
    }
    /**
     * The attribute numero_dose of Dose_mpv. It is of type Int. Ranges: 1:3.
     */
    public void setNumero_dose(Integer numero_dose) {
        this.numero_dose = numero_dose;
    }

    /**
     * The associated object for the role modalita_somministrazione_.
     */
    public CliModalita_somministrazioneDTO getModalita_somministrazione_() {
        return modalita_somministrazione_;
    }
    /**
     * The associated object for the role modalita_somministrazione_.
     */
    public void setModalita_somministrazione_(CliModalita_somministrazioneDTO modalita_somministrazione_) {
        this.modalita_somministrazione_ = modalita_somministrazione_;
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
        if (ciclo != null) {
            joiner.add("ciclo: " + GraphQLRequestSerializer.getEntry(ciclo));
        }
        if (modalita_somministrazione != null) {
            joiner.add("modalita_somministrazione: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione));
        }
        if (numero_dose != null) {
            joiner.add("numero_dose: " + GraphQLRequestSerializer.getEntry(numero_dose));
        }
        if (modalita_somministrazione_ != null) {
            joiner.add("modalita_somministrazione_: " + GraphQLRequestSerializer.getEntry(modalita_somministrazione_));
        }
        if (visita_mpv_ != null) {
            joiner.add("visita_mpv_: " + GraphQLRequestSerializer.getEntry(visita_mpv_));
        }
        return joiner.toString();
    }

    public static CliDose_mpvDTO.Builder builder() {
        return new CliDose_mpvDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String ciclo;
        private String modalita_somministrazione;
        private Integer numero_dose;
        private CliModalita_somministrazioneDTO modalita_somministrazione_;
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
         * The attribute _id of Dose_mpv. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute ciclo of Dose_mpv. It is of type String. Domain: Primario OR Booster.}Max length: 255.Cannot be null.
         */
        public Builder setCiclo(String ciclo) {
            this.ciclo = ciclo;
            return this;
        }

        /**
         * The attribute modalita_somministrazione of Dose_mpv. It is of type String. Path: modalita_somministrazione_ nome. Cannot be null.
         */
        public Builder setModalita_somministrazione(String modalita_somministrazione) {
            this.modalita_somministrazione = modalita_somministrazione;
            return this;
        }

        /**
         * The attribute numero_dose of Dose_mpv. It is of type Int. Ranges: 1:3.
         */
        public Builder setNumero_dose(Integer numero_dose) {
            this.numero_dose = numero_dose;
            return this;
        }

        /**
         * The associated object for the role modalita_somministrazione_.
         */
        public Builder setModalita_somministrazione_(CliModalita_somministrazioneDTO modalita_somministrazione_) {
            this.modalita_somministrazione_ = modalita_somministrazione_;
            return this;
        }

        /**
         * The associated object for the role visita_mpv_.
         */
        public Builder setVisita_mpv_(CliVisita_mpvDTO visita_mpv_) {
            this.visita_mpv_ = visita_mpv_;
            return this;
        }


        public CliDose_mpvDTO build() {
            CliDose_mpvDTO result = new CliDose_mpvDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCiclo(this.ciclo);
            result.setModalita_somministrazione(this.modalita_somministrazione);
            result.setNumero_dose(this.numero_dose);
            result.setModalita_somministrazione_(this.modalita_somministrazione_);
            result.setVisita_mpv_(this.visita_mpv_);
            return result;
        }

    }
}
