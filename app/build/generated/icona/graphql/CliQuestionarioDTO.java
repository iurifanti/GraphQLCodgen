package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Questionario, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliQuestionarioDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private String descrizione;
    private Integer domande;
    private Integer intervallo_compil_mesi;
    private String nome;
    private Boolean parametri_personali;
    private String studi_appartenenza;
    private String titolo;

    public CliQuestionarioDTO() {
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
     * The attribute _id of Questionario. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Questionario. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute descrizione of Questionario. It is of type Text.
     */
    public String getDescrizione() {
        return descrizione;
    }
    /**
     * The attribute descrizione of Questionario. It is of type Text.
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * The attribute domande of Questionario. It is of type Int. Path: COUNT_ALL - Count alldomanda_ __id. Cannot be null.
     */
    public Integer getDomande() {
        return domande;
    }
    /**
     * The attribute domande of Questionario. It is of type Int. Path: COUNT_ALL - Count alldomanda_ __id. Cannot be null.
     */
    public void setDomande(Integer domande) {
        this.domande = domande;
    }

    /**
     * The attribute intervallo_compil_mesi of Questionario. It is of type Int.
     */
    public Integer getIntervallo_compil_mesi() {
        return intervallo_compil_mesi;
    }
    /**
     * The attribute intervallo_compil_mesi of Questionario. It is of type Int.
     */
    public void setIntervallo_compil_mesi(Integer intervallo_compil_mesi) {
        this.intervallo_compil_mesi = intervallo_compil_mesi;
    }

    /**
     * The attribute nome of Questionario. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Questionario. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute parametri_personali of Questionario. It is of type Boolean.
     */
    public Boolean getParametri_personali() {
        return parametri_personali;
    }
    /**
     * The attribute parametri_personali of Questionario. It is of type Boolean.
     */
    public void setParametri_personali(Boolean parametri_personali) {
        this.parametri_personali = parametri_personali;
    }

    /**
     * The attribute studi_appartenenza of Questionario. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)studio_questionario_ nome. Cannot be null.
     */
    public String getStudi_appartenenza() {
        return studi_appartenenza;
    }
    /**
     * The attribute studi_appartenenza of Questionario. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)studio_questionario_ nome. Cannot be null.
     */
    public void setStudi_appartenenza(String studi_appartenenza) {
        this.studi_appartenenza = studi_appartenenza;
    }

    /**
     * The attribute titolo of Questionario. It is of type String. Max length: 255.
     */
    public String getTitolo() {
        return titolo;
    }
    /**
     * The attribute titolo of Questionario. It is of type String. Max length: 255.
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
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
        if (descrizione != null) {
            joiner.add("descrizione: " + GraphQLRequestSerializer.getEntry(descrizione));
        }
        if (domande != null) {
            joiner.add("domande: " + GraphQLRequestSerializer.getEntry(domande));
        }
        if (intervallo_compil_mesi != null) {
            joiner.add("intervallo_compil_mesi: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (parametri_personali != null) {
            joiner.add("parametri_personali: " + GraphQLRequestSerializer.getEntry(parametri_personali));
        }
        if (studi_appartenenza != null) {
            joiner.add("studi_appartenenza: " + GraphQLRequestSerializer.getEntry(studi_appartenenza));
        }
        if (titolo != null) {
            joiner.add("titolo: " + GraphQLRequestSerializer.getEntry(titolo));
        }
        return joiner.toString();
    }

    public static CliQuestionarioDTO.Builder builder() {
        return new CliQuestionarioDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private String descrizione;
        private Integer domande;
        private Integer intervallo_compil_mesi;
        private String nome;
        private Boolean parametri_personali;
        private String studi_appartenenza;
        private String titolo;

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
         * The attribute _id of Questionario. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute descrizione of Questionario. It is of type Text.
         */
        public Builder setDescrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        /**
         * The attribute domande of Questionario. It is of type Int. Path: COUNT_ALL - Count alldomanda_ __id. Cannot be null.
         */
        public Builder setDomande(Integer domande) {
            this.domande = domande;
            return this;
        }

        /**
         * The attribute intervallo_compil_mesi of Questionario. It is of type Int.
         */
        public Builder setIntervallo_compil_mesi(Integer intervallo_compil_mesi) {
            this.intervallo_compil_mesi = intervallo_compil_mesi;
            return this;
        }

        /**
         * The attribute nome of Questionario. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute parametri_personali of Questionario. It is of type Boolean.
         */
        public Builder setParametri_personali(Boolean parametri_personali) {
            this.parametri_personali = parametri_personali;
            return this;
        }

        /**
         * The attribute studi_appartenenza of Questionario. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)studio_questionario_ nome. Cannot be null.
         */
        public Builder setStudi_appartenenza(String studi_appartenenza) {
            this.studi_appartenenza = studi_appartenenza;
            return this;
        }

        /**
         * The attribute titolo of Questionario. It is of type String. Max length: 255.
         */
        public Builder setTitolo(String titolo) {
            this.titolo = titolo;
            return this;
        }


        public CliQuestionarioDTO build() {
            CliQuestionarioDTO result = new CliQuestionarioDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setDescrizione(this.descrizione);
            result.setDomande(this.domande);
            result.setIntervallo_compil_mesi(this.intervallo_compil_mesi);
            result.setNome(this.nome);
            result.setParametri_personali(this.parametri_personali);
            result.setStudi_appartenenza(this.studi_appartenenza);
            result.setTitolo(this.titolo);
            return result;
        }

    }
}
