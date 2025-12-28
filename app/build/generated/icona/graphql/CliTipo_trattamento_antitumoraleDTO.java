package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Tipo_trattamento_antitumorale, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliTipo_trattamento_antitumoraleDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean cellulare;
    private Boolean chemioterapia;
    private Boolean chirurgico;
    private String farmaco_antitumorali_associati;
    private Boolean immunoterapia;
    private Integer n_farmaci_antitumorali_associati;
    private String nome;
    private Boolean ormonale;
    private Boolean radioterapia;
    private Boolean staminali;

    public CliTipo_trattamento_antitumoraleDTO() {
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
     * The attribute _id of Tipo_trattamento_antitumorale. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Tipo_trattamento_antitumorale. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute cellulare of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getCellulare() {
        return cellulare;
    }
    /**
     * The attribute cellulare of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public void setCellulare(Boolean cellulare) {
        this.cellulare = cellulare;
    }

    /**
     * The attribute chemioterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getChemioterapia() {
        return chemioterapia;
    }
    /**
     * The attribute chemioterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public void setChemioterapia(Boolean chemioterapia) {
        this.chemioterapia = chemioterapia;
    }

    /**
     * The attribute chirurgico of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getChirurgico() {
        return chirurgico;
    }
    /**
     * The attribute chirurgico of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public void setChirurgico(Boolean chirurgico) {
        this.chirurgico = chirurgico;
    }

    /**
     * The attribute farmaco_antitumorali_associati of Tipo_trattamento_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)farmaco_antitumorale_ nome.
     */
    public String getFarmaco_antitumorali_associati() {
        return farmaco_antitumorali_associati;
    }
    /**
     * The attribute farmaco_antitumorali_associati of Tipo_trattamento_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)farmaco_antitumorale_ nome.
     */
    public void setFarmaco_antitumorali_associati(String farmaco_antitumorali_associati) {
        this.farmaco_antitumorali_associati = farmaco_antitumorali_associati;
    }

    /**
     * The attribute immunoterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getImmunoterapia() {
        return immunoterapia;
    }
    /**
     * The attribute immunoterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public void setImmunoterapia(Boolean immunoterapia) {
        this.immunoterapia = immunoterapia;
    }

    /**
     * The attribute n_farmaci_antitumorali_associati of Tipo_trattamento_antitumorale. It is of type Int. Path: COUNT_DISTINCT - Count distinctfarmaco_antitumorale_ nome.
     */
    public Integer getN_farmaci_antitumorali_associati() {
        return n_farmaci_antitumorali_associati;
    }
    /**
     * The attribute n_farmaci_antitumorali_associati of Tipo_trattamento_antitumorale. It is of type Int. Path: COUNT_DISTINCT - Count distinctfarmaco_antitumorale_ nome.
     */
    public void setN_farmaci_antitumorali_associati(Integer n_farmaci_antitumorali_associati) {
        this.n_farmaci_antitumorali_associati = n_farmaci_antitumorali_associati;
    }

    /**
     * The attribute nome of Tipo_trattamento_antitumorale. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Tipo_trattamento_antitumorale. It is of type String. Max length: 255.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute ormonale of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getOrmonale() {
        return ormonale;
    }
    /**
     * The attribute ormonale of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public void setOrmonale(Boolean ormonale) {
        this.ormonale = ormonale;
    }

    /**
     * The attribute radioterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getRadioterapia() {
        return radioterapia;
    }
    /**
     * The attribute radioterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public void setRadioterapia(Boolean radioterapia) {
        this.radioterapia = radioterapia;
    }

    /**
     * The attribute staminali of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public Boolean getStaminali() {
        return staminali;
    }
    /**
     * The attribute staminali of Tipo_trattamento_antitumorale. It is of type Boolean.
     */
    public void setStaminali(Boolean staminali) {
        this.staminali = staminali;
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
        if (cellulare != null) {
            joiner.add("cellulare: " + GraphQLRequestSerializer.getEntry(cellulare));
        }
        if (chemioterapia != null) {
            joiner.add("chemioterapia: " + GraphQLRequestSerializer.getEntry(chemioterapia));
        }
        if (chirurgico != null) {
            joiner.add("chirurgico: " + GraphQLRequestSerializer.getEntry(chirurgico));
        }
        if (farmaco_antitumorali_associati != null) {
            joiner.add("farmaco_antitumorali_associati: " + GraphQLRequestSerializer.getEntry(farmaco_antitumorali_associati));
        }
        if (immunoterapia != null) {
            joiner.add("immunoterapia: " + GraphQLRequestSerializer.getEntry(immunoterapia));
        }
        if (n_farmaci_antitumorali_associati != null) {
            joiner.add("n_farmaci_antitumorali_associati: " + GraphQLRequestSerializer.getEntry(n_farmaci_antitumorali_associati));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (ormonale != null) {
            joiner.add("ormonale: " + GraphQLRequestSerializer.getEntry(ormonale));
        }
        if (radioterapia != null) {
            joiner.add("radioterapia: " + GraphQLRequestSerializer.getEntry(radioterapia));
        }
        if (staminali != null) {
            joiner.add("staminali: " + GraphQLRequestSerializer.getEntry(staminali));
        }
        return joiner.toString();
    }

    public static CliTipo_trattamento_antitumoraleDTO.Builder builder() {
        return new CliTipo_trattamento_antitumoraleDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean cellulare;
        private Boolean chemioterapia;
        private Boolean chirurgico;
        private String farmaco_antitumorali_associati;
        private Boolean immunoterapia;
        private Integer n_farmaci_antitumorali_associati;
        private String nome;
        private Boolean ormonale;
        private Boolean radioterapia;
        private Boolean staminali;

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
         * The attribute _id of Tipo_trattamento_antitumorale. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute cellulare of Tipo_trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setCellulare(Boolean cellulare) {
            this.cellulare = cellulare;
            return this;
        }

        /**
         * The attribute chemioterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setChemioterapia(Boolean chemioterapia) {
            this.chemioterapia = chemioterapia;
            return this;
        }

        /**
         * The attribute chirurgico of Tipo_trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setChirurgico(Boolean chirurgico) {
            this.chirurgico = chirurgico;
            return this;
        }

        /**
         * The attribute farmaco_antitumorali_associati of Tipo_trattamento_antitumorale. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)farmaco_antitumorale_ nome.
         */
        public Builder setFarmaco_antitumorali_associati(String farmaco_antitumorali_associati) {
            this.farmaco_antitumorali_associati = farmaco_antitumorali_associati;
            return this;
        }

        /**
         * The attribute immunoterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setImmunoterapia(Boolean immunoterapia) {
            this.immunoterapia = immunoterapia;
            return this;
        }

        /**
         * The attribute n_farmaci_antitumorali_associati of Tipo_trattamento_antitumorale. It is of type Int. Path: COUNT_DISTINCT - Count distinctfarmaco_antitumorale_ nome.
         */
        public Builder setN_farmaci_antitumorali_associati(Integer n_farmaci_antitumorali_associati) {
            this.n_farmaci_antitumorali_associati = n_farmaci_antitumorali_associati;
            return this;
        }

        /**
         * The attribute nome of Tipo_trattamento_antitumorale. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute ormonale of Tipo_trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setOrmonale(Boolean ormonale) {
            this.ormonale = ormonale;
            return this;
        }

        /**
         * The attribute radioterapia of Tipo_trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setRadioterapia(Boolean radioterapia) {
            this.radioterapia = radioterapia;
            return this;
        }

        /**
         * The attribute staminali of Tipo_trattamento_antitumorale. It is of type Boolean.
         */
        public Builder setStaminali(Boolean staminali) {
            this.staminali = staminali;
            return this;
        }


        public CliTipo_trattamento_antitumoraleDTO build() {
            CliTipo_trattamento_antitumoraleDTO result = new CliTipo_trattamento_antitumoraleDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setCellulare(this.cellulare);
            result.setChemioterapia(this.chemioterapia);
            result.setChirurgico(this.chirurgico);
            result.setFarmaco_antitumorali_associati(this.farmaco_antitumorali_associati);
            result.setImmunoterapia(this.immunoterapia);
            result.setN_farmaci_antitumorali_associati(this.n_farmaci_antitumorali_associati);
            result.setNome(this.nome);
            result.setOrmonale(this.ormonale);
            result.setRadioterapia(this.radioterapia);
            result.setStaminali(this.staminali);
            return result;
        }

    }
}
