package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Tempo_dose_vaccino, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliTempo_dose_vaccinoDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String nome;
    private Integer ordine;

    public CliTempo_dose_vaccinoDTO() {
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
     * The attribute _id of Tempo_dose_vaccino. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Tempo_dose_vaccino. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute nome of Tempo_dose_vaccino. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Tempo_dose_vaccino. It is of type String. Max length: 255.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute ordine of Tempo_dose_vaccino. It is of type Int.
     */
    public Integer getOrdine() {
        return ordine;
    }
    /**
     * The attribute ordine of Tempo_dose_vaccino. It is of type Int.
     */
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
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
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        return joiner.toString();
    }

    public static CliTempo_dose_vaccinoDTO.Builder builder() {
        return new CliTempo_dose_vaccinoDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String nome;
        private Integer ordine;

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
         * The attribute _id of Tempo_dose_vaccino. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute nome of Tempo_dose_vaccino. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute ordine of Tempo_dose_vaccino. It is of type Int.
         */
        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }


        public CliTempo_dose_vaccinoDTO build() {
            CliTempo_dose_vaccinoDTO result = new CliTempo_dose_vaccinoDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setNome(this.nome);
            result.setOrdine(this.ordine);
            return result;
        }

    }
}
