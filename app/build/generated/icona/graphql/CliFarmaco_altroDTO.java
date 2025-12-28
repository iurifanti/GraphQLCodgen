package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Farmaco_altro, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFarmaco_altroDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean anche_da_solo;
    private String codice_DAD;
    private String combinazioni_accettate;
    private String gruppo;
    private String nome;
    private String nome_gruppo;
    private String nome_tipo;
    private String sottogruppo;
    private String tag;
    private Integer tipo;
    private Boolean vaccino_covid;
    private Boolean vaccino_non_covid;

    public CliFarmaco_altroDTO() {
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
     * The attribute _id of Farmaco_altro. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Farmaco_altro. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute anche_da_solo of Farmaco_altro. It is of type Boolean.
     */
    public Boolean getAnche_da_solo() {
        return anche_da_solo;
    }
    /**
     * The attribute anche_da_solo of Farmaco_altro. It is of type Boolean.
     */
    public void setAnche_da_solo(Boolean anche_da_solo) {
        this.anche_da_solo = anche_da_solo;
    }

    /**
     * The attribute codice_DAD of Farmaco_altro. It is of type String. Max length: 255.
     */
    public String getCodice_DAD() {
        return codice_DAD;
    }
    /**
     * The attribute codice_DAD of Farmaco_altro. It is of type String. Max length: 255.
     */
    public void setCodice_DAD(String codice_DAD) {
        this.codice_DAD = codice_DAD;
    }

    /**
     * The attribute combinazioni_accettate of Farmaco_altro. It is of type String. Path: CONCAT_CS - Concat (comma separated)combinazioni_accettate_non_ARV_ farmaci. Cannot be null.
     */
    public String getCombinazioni_accettate() {
        return combinazioni_accettate;
    }
    /**
     * The attribute combinazioni_accettate of Farmaco_altro. It is of type String. Path: CONCAT_CS - Concat (comma separated)combinazioni_accettate_non_ARV_ farmaci. Cannot be null.
     */
    public void setCombinazioni_accettate(String combinazioni_accettate) {
        this.combinazioni_accettate = combinazioni_accettate;
    }

    /**
     * The attribute gruppo of Farmaco_altro. It is of type String. Max length: 255.
     */
    public String getGruppo() {
        return gruppo;
    }
    /**
     * The attribute gruppo of Farmaco_altro. It is of type String. Max length: 255.
     */
    public void setGruppo(String gruppo) {
        this.gruppo = gruppo;
    }

    /**
     * The attribute nome of Farmaco_altro. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Farmaco_altro. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute nome_gruppo of Farmaco_altro. It is of type String. Max length: 255.
     */
    public String getNome_gruppo() {
        return nome_gruppo;
    }
    /**
     * The attribute nome_gruppo of Farmaco_altro. It is of type String. Max length: 255.
     */
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    /**
     * The attribute nome_tipo of Farmaco_altro. It is of type String. Max length: 255.
     */
    public String getNome_tipo() {
        return nome_tipo;
    }
    /**
     * The attribute nome_tipo of Farmaco_altro. It is of type String. Max length: 255.
     */
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    /**
     * The attribute sottogruppo of Farmaco_altro. It is of type String. Max length: 255.Cannot be null.
     */
    public String getSottogruppo() {
        return sottogruppo;
    }
    /**
     * The attribute sottogruppo of Farmaco_altro. It is of type String. Max length: 255.Cannot be null.
     */
    public void setSottogruppo(String sottogruppo) {
        this.sottogruppo = sottogruppo;
    }

    /**
     * The attribute tag of Farmaco_altro. It is of type String. Max length: 255.
     */
    public String getTag() {
        return tag;
    }
    /**
     * The attribute tag of Farmaco_altro. It is of type String. Max length: 255.
     */
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * The attribute tipo of Farmaco_altro. It is of type Int.
     */
    public Integer getTipo() {
        return tipo;
    }
    /**
     * The attribute tipo of Farmaco_altro. It is of type Int.
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * The attribute vaccino_covid of Farmaco_altro. It is of type Boolean.
     */
    public Boolean getVaccino_covid() {
        return vaccino_covid;
    }
    /**
     * The attribute vaccino_covid of Farmaco_altro. It is of type Boolean.
     */
    public void setVaccino_covid(Boolean vaccino_covid) {
        this.vaccino_covid = vaccino_covid;
    }

    /**
     * The attribute vaccino_non_covid of Farmaco_altro. It is of type Boolean.
     */
    public Boolean getVaccino_non_covid() {
        return vaccino_non_covid;
    }
    /**
     * The attribute vaccino_non_covid of Farmaco_altro. It is of type Boolean.
     */
    public void setVaccino_non_covid(Boolean vaccino_non_covid) {
        this.vaccino_non_covid = vaccino_non_covid;
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
        if (anche_da_solo != null) {
            joiner.add("anche_da_solo: " + GraphQLRequestSerializer.getEntry(anche_da_solo));
        }
        if (codice_DAD != null) {
            joiner.add("codice_DAD: " + GraphQLRequestSerializer.getEntry(codice_DAD));
        }
        if (combinazioni_accettate != null) {
            joiner.add("combinazioni_accettate: " + GraphQLRequestSerializer.getEntry(combinazioni_accettate));
        }
        if (gruppo != null) {
            joiner.add("gruppo: " + GraphQLRequestSerializer.getEntry(gruppo));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (nome_gruppo != null) {
            joiner.add("nome_gruppo: " + GraphQLRequestSerializer.getEntry(nome_gruppo));
        }
        if (nome_tipo != null) {
            joiner.add("nome_tipo: " + GraphQLRequestSerializer.getEntry(nome_tipo));
        }
        if (sottogruppo != null) {
            joiner.add("sottogruppo: " + GraphQLRequestSerializer.getEntry(sottogruppo));
        }
        if (tag != null) {
            joiner.add("tag: " + GraphQLRequestSerializer.getEntry(tag));
        }
        if (tipo != null) {
            joiner.add("tipo: " + GraphQLRequestSerializer.getEntry(tipo));
        }
        if (vaccino_covid != null) {
            joiner.add("vaccino_covid: " + GraphQLRequestSerializer.getEntry(vaccino_covid));
        }
        if (vaccino_non_covid != null) {
            joiner.add("vaccino_non_covid: " + GraphQLRequestSerializer.getEntry(vaccino_non_covid));
        }
        return joiner.toString();
    }

    public static CliFarmaco_altroDTO.Builder builder() {
        return new CliFarmaco_altroDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean anche_da_solo;
        private String codice_DAD;
        private String combinazioni_accettate;
        private String gruppo;
        private String nome;
        private String nome_gruppo;
        private String nome_tipo;
        private String sottogruppo;
        private String tag;
        private Integer tipo;
        private Boolean vaccino_covid;
        private Boolean vaccino_non_covid;

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
         * The attribute _id of Farmaco_altro. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute anche_da_solo of Farmaco_altro. It is of type Boolean.
         */
        public Builder setAnche_da_solo(Boolean anche_da_solo) {
            this.anche_da_solo = anche_da_solo;
            return this;
        }

        /**
         * The attribute codice_DAD of Farmaco_altro. It is of type String. Max length: 255.
         */
        public Builder setCodice_DAD(String codice_DAD) {
            this.codice_DAD = codice_DAD;
            return this;
        }

        /**
         * The attribute combinazioni_accettate of Farmaco_altro. It is of type String. Path: CONCAT_CS - Concat (comma separated)combinazioni_accettate_non_ARV_ farmaci. Cannot be null.
         */
        public Builder setCombinazioni_accettate(String combinazioni_accettate) {
            this.combinazioni_accettate = combinazioni_accettate;
            return this;
        }

        /**
         * The attribute gruppo of Farmaco_altro. It is of type String. Max length: 255.
         */
        public Builder setGruppo(String gruppo) {
            this.gruppo = gruppo;
            return this;
        }

        /**
         * The attribute nome of Farmaco_altro. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute nome_gruppo of Farmaco_altro. It is of type String. Max length: 255.
         */
        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        /**
         * The attribute nome_tipo of Farmaco_altro. It is of type String. Max length: 255.
         */
        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        /**
         * The attribute sottogruppo of Farmaco_altro. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setSottogruppo(String sottogruppo) {
            this.sottogruppo = sottogruppo;
            return this;
        }

        /**
         * The attribute tag of Farmaco_altro. It is of type String. Max length: 255.
         */
        public Builder setTag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * The attribute tipo of Farmaco_altro. It is of type Int.
         */
        public Builder setTipo(Integer tipo) {
            this.tipo = tipo;
            return this;
        }

        /**
         * The attribute vaccino_covid of Farmaco_altro. It is of type Boolean.
         */
        public Builder setVaccino_covid(Boolean vaccino_covid) {
            this.vaccino_covid = vaccino_covid;
            return this;
        }

        /**
         * The attribute vaccino_non_covid of Farmaco_altro. It is of type Boolean.
         */
        public Builder setVaccino_non_covid(Boolean vaccino_non_covid) {
            this.vaccino_non_covid = vaccino_non_covid;
            return this;
        }


        public CliFarmaco_altroDTO build() {
            CliFarmaco_altroDTO result = new CliFarmaco_altroDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAnche_da_solo(this.anche_da_solo);
            result.setCodice_DAD(this.codice_DAD);
            result.setCombinazioni_accettate(this.combinazioni_accettate);
            result.setGruppo(this.gruppo);
            result.setNome(this.nome);
            result.setNome_gruppo(this.nome_gruppo);
            result.setNome_tipo(this.nome_tipo);
            result.setSottogruppo(this.sottogruppo);
            result.setTag(this.tag);
            result.setTipo(this.tipo);
            result.setVaccino_covid(this.vaccino_covid);
            result.setVaccino_non_covid(this.vaccino_non_covid);
            return result;
        }

    }
}
