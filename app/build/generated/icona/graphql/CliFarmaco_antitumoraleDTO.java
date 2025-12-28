package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Farmaco_antitumorale, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFarmaco_antitumoraleDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String combinazioni;
    private String farmaco_ATC;
    private Integer n_tipi_trattamento_associati;
    private String nome;
    private String tipi_trattamento_associati;

    public CliFarmaco_antitumoraleDTO() {
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
     * The attribute _id of Farmaco_antitumorale. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Farmaco_antitumorale. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute combinazioni of Farmaco_antitumorale. It is of type String. Max length: 255.
     */
    public String getCombinazioni() {
        return combinazioni;
    }
    /**
     * The attribute combinazioni of Farmaco_antitumorale. It is of type String. Max length: 255.
     */
    public void setCombinazioni(String combinazioni) {
        this.combinazioni = combinazioni;
    }

    /**
     * The attribute farmaco_ATC of Farmaco_antitumorale. It is of type String. Path: farmaco_ATC_ titolo.
     */
    public String getFarmaco_ATC() {
        return farmaco_ATC;
    }
    /**
     * The attribute farmaco_ATC of Farmaco_antitumorale. It is of type String. Path: farmaco_ATC_ titolo.
     */
    public void setFarmaco_ATC(String farmaco_ATC) {
        this.farmaco_ATC = farmaco_ATC;
    }

    /**
     * The attribute n_tipi_trattamento_associati of Farmaco_antitumorale. It is of type Int. Path: COUNT_DISTINCT - Count distincttipo_trattamento_antitumorale_ nome.
     */
    public Integer getN_tipi_trattamento_associati() {
        return n_tipi_trattamento_associati;
    }
    /**
     * The attribute n_tipi_trattamento_associati of Farmaco_antitumorale. It is of type Int. Path: COUNT_DISTINCT - Count distincttipo_trattamento_antitumorale_ nome.
     */
    public void setN_tipi_trattamento_associati(Integer n_tipi_trattamento_associati) {
        this.n_tipi_trattamento_associati = n_tipi_trattamento_associati;
    }

    /**
     * The attribute nome of Farmaco_antitumorale. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Farmaco_antitumorale. It is of type String. Max length: 255.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute tipi_trattamento_associati of Farmaco_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)tipo_trattamento_antitumorale_ nome.
     */
    public String getTipi_trattamento_associati() {
        return tipi_trattamento_associati;
    }
    /**
     * The attribute tipi_trattamento_associati of Farmaco_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)tipo_trattamento_antitumorale_ nome.
     */
    public void setTipi_trattamento_associati(String tipi_trattamento_associati) {
        this.tipi_trattamento_associati = tipi_trattamento_associati;
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
        if (combinazioni != null) {
            joiner.add("combinazioni: " + GraphQLRequestSerializer.getEntry(combinazioni));
        }
        if (farmaco_ATC != null) {
            joiner.add("farmaco_ATC: " + GraphQLRequestSerializer.getEntry(farmaco_ATC));
        }
        if (n_tipi_trattamento_associati != null) {
            joiner.add("n_tipi_trattamento_associati: " + GraphQLRequestSerializer.getEntry(n_tipi_trattamento_associati));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (tipi_trattamento_associati != null) {
            joiner.add("tipi_trattamento_associati: " + GraphQLRequestSerializer.getEntry(tipi_trattamento_associati));
        }
        return joiner.toString();
    }

    public static CliFarmaco_antitumoraleDTO.Builder builder() {
        return new CliFarmaco_antitumoraleDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String combinazioni;
        private String farmaco_ATC;
        private Integer n_tipi_trattamento_associati;
        private String nome;
        private String tipi_trattamento_associati;

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
         * The attribute _id of Farmaco_antitumorale. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute combinazioni of Farmaco_antitumorale. It is of type String. Max length: 255.
         */
        public Builder setCombinazioni(String combinazioni) {
            this.combinazioni = combinazioni;
            return this;
        }

        /**
         * The attribute farmaco_ATC of Farmaco_antitumorale. It is of type String. Path: farmaco_ATC_ titolo.
         */
        public Builder setFarmaco_ATC(String farmaco_ATC) {
            this.farmaco_ATC = farmaco_ATC;
            return this;
        }

        /**
         * The attribute n_tipi_trattamento_associati of Farmaco_antitumorale. It is of type Int. Path: COUNT_DISTINCT - Count distincttipo_trattamento_antitumorale_ nome.
         */
        public Builder setN_tipi_trattamento_associati(Integer n_tipi_trattamento_associati) {
            this.n_tipi_trattamento_associati = n_tipi_trattamento_associati;
            return this;
        }

        /**
         * The attribute nome of Farmaco_antitumorale. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute tipi_trattamento_associati of Farmaco_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)tipo_trattamento_antitumorale_ nome.
         */
        public Builder setTipi_trattamento_associati(String tipi_trattamento_associati) {
            this.tipi_trattamento_associati = tipi_trattamento_associati;
            return this;
        }


        public CliFarmaco_antitumoraleDTO build() {
            CliFarmaco_antitumoraleDTO result = new CliFarmaco_antitumoraleDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCombinazioni(this.combinazioni);
            result.setFarmaco_ATC(this.farmaco_ATC);
            result.setN_tipi_trattamento_associati(this.n_tipi_trattamento_associati);
            result.setNome(this.nome);
            result.setTipi_trattamento_associati(this.tipi_trattamento_associati);
            return result;
        }

    }
}
