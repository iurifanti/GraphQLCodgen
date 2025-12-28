package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Componente, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliComponenteDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String classe;
    private String codice;
    private Integer codice_classe;
    private String desc;
    private String nome;
    private CliClasseDTO classe_;

    public CliComponenteDTO() {
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
     * The attribute _createdby of Componente. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Componente. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Componente. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Componente. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Componente. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Componente. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Componente. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Componente. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute classe of Componente. It is of type String. Domain: nrti OR nnrti OR altro OR fi OR ei OR ii OR booster OR pi OR nrtti OR cai OR ai.}Max length: 255.
     */
    public String getClasse() {
        return classe;
    }
    /**
     * The attribute classe of Componente. It is of type String. Domain: nrti OR nnrti OR altro OR fi OR ei OR ii OR booster OR pi OR nrtti OR cai OR ai.}Max length: 255.
     */
    public void setClasse(String classe) {
        this.classe = classe;
    }

    /**
     * The attribute codice of Componente. It is of type String. Max length: 255.
     */
    public String getCodice() {
        return codice;
    }
    /**
     * The attribute codice of Componente. It is of type String. Max length: 255.
     */
    public void setCodice(String codice) {
        this.codice = codice;
    }

    /**
     * The attribute codice_classe of Componente. It is of type Int.
     */
    public Integer getCodice_classe() {
        return codice_classe;
    }
    /**
     * The attribute codice_classe of Componente. It is of type Int.
     */
    public void setCodice_classe(Integer codice_classe) {
        this.codice_classe = codice_classe;
    }

    /**
     * The attribute desc of Componente. It is of type String. Expression: 'concat(nome," (",codice,")")'.
     */
    public String getDesc() {
        return desc;
    }
    /**
     * The attribute desc of Componente. It is of type String. Expression: 'concat(nome," (",codice,")")'.
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * The attribute nome of Componente. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Componente. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The associated object for the role classe_.
     */
    public CliClasseDTO getClasse_() {
        return classe_;
    }
    /**
     * The associated object for the role classe_.
     */
    public void setClasse_(CliClasseDTO classe_) {
        this.classe_ = classe_;
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
        if (classe != null) {
            joiner.add("classe: " + GraphQLRequestSerializer.getEntry(classe));
        }
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (codice_classe != null) {
            joiner.add("codice_classe: " + GraphQLRequestSerializer.getEntry(codice_classe));
        }
        if (desc != null) {
            joiner.add("desc: " + GraphQLRequestSerializer.getEntry(desc));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (classe_ != null) {
            joiner.add("classe_: " + GraphQLRequestSerializer.getEntry(classe_));
        }
        return joiner.toString();
    }

    public static CliComponenteDTO.Builder builder() {
        return new CliComponenteDTO.Builder();
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
        private String classe;
        private String codice;
        private Integer codice_classe;
        private String desc;
        private String nome;
        private CliClasseDTO classe_;

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
         * The attribute _createdby of Componente. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Componente. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Componente. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Componente. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Componente. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute classe of Componente. It is of type String. Domain: nrti OR nnrti OR altro OR fi OR ei OR ii OR booster OR pi OR nrtti OR cai OR ai.}Max length: 255.
         */
        public Builder setClasse(String classe) {
            this.classe = classe;
            return this;
        }

        /**
         * The attribute codice of Componente. It is of type String. Max length: 255.
         */
        public Builder setCodice(String codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute codice_classe of Componente. It is of type Int.
         */
        public Builder setCodice_classe(Integer codice_classe) {
            this.codice_classe = codice_classe;
            return this;
        }

        /**
         * The attribute desc of Componente. It is of type String. Expression: 'concat(nome," (",codice,")")'.
         */
        public Builder setDesc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * The attribute nome of Componente. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The associated object for the role classe_.
         */
        public Builder setClasse_(CliClasseDTO classe_) {
            this.classe_ = classe_;
            return this;
        }


        public CliComponenteDTO build() {
            CliComponenteDTO result = new CliComponenteDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setClasse(this.classe);
            result.setCodice(this.codice);
            result.setCodice_classe(this.codice_classe);
            result.setDesc(this.desc);
            result.setNome(this.nome);
            result.setClasse_(this.classe_);
            return result;
        }

    }
}
