package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of singleton class Settings_PRO, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliSettings_PRODTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private CliFileInfoDTO template_credenziali;
    private Integer tempo_disponibile_mesi;

    public CliSettings_PRODTO() {
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
     * The attribute _id of Settings_PRO. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Settings_PRO. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute template_credenziali of Settings_PRO. It is of type FileInfo. Supported extensions: pdf
Max file size: 5242880.
     */
    public CliFileInfoDTO getTemplate_credenziali() {
        return template_credenziali;
    }
    /**
     * The attribute template_credenziali of Settings_PRO. It is of type FileInfo. Supported extensions: pdf
Max file size: 5242880.
     */
    public void setTemplate_credenziali(CliFileInfoDTO template_credenziali) {
        this.template_credenziali = template_credenziali;
    }

    /**
     * The attribute tempo_disponibile_mesi of Settings_PRO. It is of type Int.
     */
    public Integer getTempo_disponibile_mesi() {
        return tempo_disponibile_mesi;
    }
    /**
     * The attribute tempo_disponibile_mesi of Settings_PRO. It is of type Int.
     */
    public void setTempo_disponibile_mesi(Integer tempo_disponibile_mesi) {
        this.tempo_disponibile_mesi = tempo_disponibile_mesi;
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
        if (template_credenziali != null) {
            joiner.add("template_credenziali: " + GraphQLRequestSerializer.getEntry(template_credenziali));
        }
        if (tempo_disponibile_mesi != null) {
            joiner.add("tempo_disponibile_mesi: " + GraphQLRequestSerializer.getEntry(tempo_disponibile_mesi));
        }
        return joiner.toString();
    }

    public static CliSettings_PRODTO.Builder builder() {
        return new CliSettings_PRODTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private CliFileInfoDTO template_credenziali;
        private Integer tempo_disponibile_mesi;

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
         * The attribute _id of Settings_PRO. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute template_credenziali of Settings_PRO. It is of type FileInfo. Supported extensions: pdf
Max file size: 5242880.
         */
        public Builder setTemplate_credenziali(CliFileInfoDTO template_credenziali) {
            this.template_credenziali = template_credenziali;
            return this;
        }

        /**
         * The attribute tempo_disponibile_mesi of Settings_PRO. It is of type Int.
         */
        public Builder setTempo_disponibile_mesi(Integer tempo_disponibile_mesi) {
            this.tempo_disponibile_mesi = tempo_disponibile_mesi;
            return this;
        }


        public CliSettings_PRODTO build() {
            CliSettings_PRODTO result = new CliSettings_PRODTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setTemplate_credenziali(this.template_credenziali);
            result.setTempo_disponibile_mesi(this.tempo_disponibile_mesi);
            return result;
        }

    }
}
