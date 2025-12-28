package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Genotipo_HCV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliGenotipo_HCVDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private Integer codice;
    private Boolean ico;
    private String nome;
    private Boolean pride;

    public CliGenotipo_HCVDTO() {
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
     * The attribute _createdby of Genotipo_HCV. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Genotipo_HCV. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Genotipo_HCV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Genotipo_HCV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Genotipo_HCV. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Genotipo_HCV. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Genotipo_HCV. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Genotipo_HCV. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute codice of Genotipo_HCV. It is of type Int.
     */
    public Integer getCodice() {
        return codice;
    }
    /**
     * The attribute codice of Genotipo_HCV. It is of type Int.
     */
    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    /**
     * The attribute ico of Genotipo_HCV. It is of type Boolean.
     */
    public Boolean getIco() {
        return ico;
    }
    /**
     * The attribute ico of Genotipo_HCV. It is of type Boolean.
     */
    public void setIco(Boolean ico) {
        this.ico = ico;
    }

    /**
     * The attribute nome of Genotipo_HCV. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Genotipo_HCV. It is of type String. Max length: 255.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute pride of Genotipo_HCV. It is of type Boolean.
     */
    public Boolean getPride() {
        return pride;
    }
    /**
     * The attribute pride of Genotipo_HCV. It is of type Boolean.
     */
    public void setPride(Boolean pride) {
        this.pride = pride;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (_createdby != null) {
            joiner.add("_createdby: " + GraphQLRequestSerializer.getEntry(_createdby));
        }
        if (_createdon != null) {
            joiner.add("_createdon: " + GraphQLRequestSerializer.getEntry(_createdon));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_lastmodifiedby != null) {
            joiner.add("_lastmodifiedby: " + GraphQLRequestSerializer.getEntry(_lastmodifiedby));
        }
        if (_lastmodifiedon != null) {
            joiner.add("_lastmodifiedon: " + GraphQLRequestSerializer.getEntry(_lastmodifiedon));
        }
        if (_ownedby != null) {
            joiner.add("_ownedby: " + GraphQLRequestSerializer.getEntry(_ownedby));
        }
        if (_ownedon != null) {
            joiner.add("_ownedon: " + GraphQLRequestSerializer.getEntry(_ownedon));
        }
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (ico != null) {
            joiner.add("ico: " + GraphQLRequestSerializer.getEntry(ico));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (pride != null) {
            joiner.add("pride: " + GraphQLRequestSerializer.getEntry(pride));
        }
        return joiner.toString();
    }

    public static CliGenotipo_HCVDTO.Builder builder() {
        return new CliGenotipo_HCVDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _createdby;
        private String _createdon;
        private String _id;
        private String _lastmodifiedby;
        private String _lastmodifiedon;
        private String _ownedby;
        private String _ownedon;
        private Integer codice;
        private Boolean ico;
        private String nome;
        private Boolean pride;

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
         * The attribute _createdby of Genotipo_HCV. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Genotipo_HCV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Genotipo_HCV. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Genotipo_HCV. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Genotipo_HCV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute codice of Genotipo_HCV. It is of type Int.
         */
        public Builder setCodice(Integer codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute ico of Genotipo_HCV. It is of type Boolean.
         */
        public Builder setIco(Boolean ico) {
            this.ico = ico;
            return this;
        }

        /**
         * The attribute nome of Genotipo_HCV. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute pride of Genotipo_HCV. It is of type Boolean.
         */
        public Builder setPride(Boolean pride) {
            this.pride = pride;
            return this;
        }


        public CliGenotipo_HCVDTO build() {
            CliGenotipo_HCVDTO result = new CliGenotipo_HCVDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setCodice(this.codice);
            result.setIco(this.ico);
            result.setNome(this.nome);
            result.setPride(this.pride);
            return result;
        }

    }
}
