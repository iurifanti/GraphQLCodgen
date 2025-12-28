package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Farmaco_ARV, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliFarmaco_ARVDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private Integer anno_generico;
    private String codice_DAD;
    private String componenti;
    private Boolean generico;
    private String gruppo;
    private Boolean long_acting;
    private String nome;
    private String nome_gruppo;
    private String nome_tipo;
    private Boolean obsoleto;
    private Boolean posologia;
    private Boolean prep;
    private String sottogruppo;
    private Integer tipo;

    public CliFarmaco_ARVDTO() {
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
     * The attribute _createdby of Farmaco_ARV. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Farmaco_ARV. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Farmaco_ARV. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Farmaco_ARV. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Farmaco_ARV. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Farmaco_ARV. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Farmaco_ARV. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Farmaco_ARV. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute anno_generico of Farmaco_ARV. It is of type Int.
     */
    public Integer getAnno_generico() {
        return anno_generico;
    }
    /**
     * The attribute anno_generico of Farmaco_ARV. It is of type Int.
     */
    public void setAnno_generico(Integer anno_generico) {
        this.anno_generico = anno_generico;
    }

    /**
     * The attribute codice_DAD of Farmaco_ARV. It is of type String. Max length: 255.
     */
    public String getCodice_DAD() {
        return codice_DAD;
    }
    /**
     * The attribute codice_DAD of Farmaco_ARV. It is of type String. Max length: 255.
     */
    public void setCodice_DAD(String codice_DAD) {
        this.codice_DAD = codice_DAD;
    }

    /**
     * The attribute componenti of Farmaco_ARV. It is of type String. Path: CONCAT_CS - Concat (comma separated)componente nome. Cannot be null.
     */
    public String getComponenti() {
        return componenti;
    }
    /**
     * The attribute componenti of Farmaco_ARV. It is of type String. Path: CONCAT_CS - Concat (comma separated)componente nome. Cannot be null.
     */
    public void setComponenti(String componenti) {
        this.componenti = componenti;
    }

    /**
     * The attribute generico of Farmaco_ARV. It is of type Boolean.
     */
    public Boolean getGenerico() {
        return generico;
    }
    /**
     * The attribute generico of Farmaco_ARV. It is of type Boolean.
     */
    public void setGenerico(Boolean generico) {
        this.generico = generico;
    }

    /**
     * The attribute gruppo of Farmaco_ARV. It is of type String. Max length: 255.
     */
    public String getGruppo() {
        return gruppo;
    }
    /**
     * The attribute gruppo of Farmaco_ARV. It is of type String. Max length: 255.
     */
    public void setGruppo(String gruppo) {
        this.gruppo = gruppo;
    }

    /**
     * The attribute long_acting of Farmaco_ARV. It is of type Boolean.
     */
    public Boolean getLong_acting() {
        return long_acting;
    }
    /**
     * The attribute long_acting of Farmaco_ARV. It is of type Boolean.
     */
    public void setLong_acting(Boolean long_acting) {
        this.long_acting = long_acting;
    }

    /**
     * The attribute nome of Farmaco_ARV. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Farmaco_ARV. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute nome_gruppo of Farmaco_ARV. It is of type String. Max length: 255.
     */
    public String getNome_gruppo() {
        return nome_gruppo;
    }
    /**
     * The attribute nome_gruppo of Farmaco_ARV. It is of type String. Max length: 255.
     */
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    /**
     * The attribute nome_tipo of Farmaco_ARV. It is of type String. Max length: 255.
     */
    public String getNome_tipo() {
        return nome_tipo;
    }
    /**
     * The attribute nome_tipo of Farmaco_ARV. It is of type String. Max length: 255.
     */
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    /**
     * The attribute obsoleto of Farmaco_ARV. It is of type Boolean.
     */
    public Boolean getObsoleto() {
        return obsoleto;
    }
    /**
     * The attribute obsoleto of Farmaco_ARV. It is of type Boolean.
     */
    public void setObsoleto(Boolean obsoleto) {
        this.obsoleto = obsoleto;
    }

    /**
     * The attribute posologia of Farmaco_ARV. It is of type Boolean.
     */
    public Boolean getPosologia() {
        return posologia;
    }
    /**
     * The attribute posologia of Farmaco_ARV. It is of type Boolean.
     */
    public void setPosologia(Boolean posologia) {
        this.posologia = posologia;
    }

    /**
     * The attribute prep of Farmaco_ARV. It is of type Boolean.
     */
    public Boolean getPrep() {
        return prep;
    }
    /**
     * The attribute prep of Farmaco_ARV. It is of type Boolean.
     */
    public void setPrep(Boolean prep) {
        this.prep = prep;
    }

    /**
     * The attribute sottogruppo of Farmaco_ARV. It is of type String. Max length: 255.Cannot be null.
     */
    public String getSottogruppo() {
        return sottogruppo;
    }
    /**
     * The attribute sottogruppo of Farmaco_ARV. It is of type String. Max length: 255.Cannot be null.
     */
    public void setSottogruppo(String sottogruppo) {
        this.sottogruppo = sottogruppo;
    }

    /**
     * The attribute tipo of Farmaco_ARV. It is of type Int.
     */
    public Integer getTipo() {
        return tipo;
    }
    /**
     * The attribute tipo of Farmaco_ARV. It is of type Int.
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
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
        if (anno_generico != null) {
            joiner.add("anno_generico: " + GraphQLRequestSerializer.getEntry(anno_generico));
        }
        if (codice_DAD != null) {
            joiner.add("codice_DAD: " + GraphQLRequestSerializer.getEntry(codice_DAD));
        }
        if (componenti != null) {
            joiner.add("componenti: " + GraphQLRequestSerializer.getEntry(componenti));
        }
        if (generico != null) {
            joiner.add("generico: " + GraphQLRequestSerializer.getEntry(generico));
        }
        if (gruppo != null) {
            joiner.add("gruppo: " + GraphQLRequestSerializer.getEntry(gruppo));
        }
        if (long_acting != null) {
            joiner.add("long_acting: " + GraphQLRequestSerializer.getEntry(long_acting));
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
        if (obsoleto != null) {
            joiner.add("obsoleto: " + GraphQLRequestSerializer.getEntry(obsoleto));
        }
        if (posologia != null) {
            joiner.add("posologia: " + GraphQLRequestSerializer.getEntry(posologia));
        }
        if (prep != null) {
            joiner.add("prep: " + GraphQLRequestSerializer.getEntry(prep));
        }
        if (sottogruppo != null) {
            joiner.add("sottogruppo: " + GraphQLRequestSerializer.getEntry(sottogruppo));
        }
        if (tipo != null) {
            joiner.add("tipo: " + GraphQLRequestSerializer.getEntry(tipo));
        }
        return joiner.toString();
    }

    public static CliFarmaco_ARVDTO.Builder builder() {
        return new CliFarmaco_ARVDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
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
        private Integer anno_generico;
        private String codice_DAD;
        private String componenti;
        private Boolean generico;
        private String gruppo;
        private Boolean long_acting;
        private String nome;
        private String nome_gruppo;
        private String nome_tipo;
        private Boolean obsoleto;
        private Boolean posologia;
        private Boolean prep;
        private String sottogruppo;
        private Integer tipo;

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
         * The attribute _createdby of Farmaco_ARV. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Farmaco_ARV. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Farmaco_ARV. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Farmaco_ARV. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Farmaco_ARV. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute anno_generico of Farmaco_ARV. It is of type Int.
         */
        public Builder setAnno_generico(Integer anno_generico) {
            this.anno_generico = anno_generico;
            return this;
        }

        /**
         * The attribute codice_DAD of Farmaco_ARV. It is of type String. Max length: 255.
         */
        public Builder setCodice_DAD(String codice_DAD) {
            this.codice_DAD = codice_DAD;
            return this;
        }

        /**
         * The attribute componenti of Farmaco_ARV. It is of type String. Path: CONCAT_CS - Concat (comma separated)componente nome. Cannot be null.
         */
        public Builder setComponenti(String componenti) {
            this.componenti = componenti;
            return this;
        }

        /**
         * The attribute generico of Farmaco_ARV. It is of type Boolean.
         */
        public Builder setGenerico(Boolean generico) {
            this.generico = generico;
            return this;
        }

        /**
         * The attribute gruppo of Farmaco_ARV. It is of type String. Max length: 255.
         */
        public Builder setGruppo(String gruppo) {
            this.gruppo = gruppo;
            return this;
        }

        /**
         * The attribute long_acting of Farmaco_ARV. It is of type Boolean.
         */
        public Builder setLong_acting(Boolean long_acting) {
            this.long_acting = long_acting;
            return this;
        }

        /**
         * The attribute nome of Farmaco_ARV. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute nome_gruppo of Farmaco_ARV. It is of type String. Max length: 255.
         */
        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        /**
         * The attribute nome_tipo of Farmaco_ARV. It is of type String. Max length: 255.
         */
        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        /**
         * The attribute obsoleto of Farmaco_ARV. It is of type Boolean.
         */
        public Builder setObsoleto(Boolean obsoleto) {
            this.obsoleto = obsoleto;
            return this;
        }

        /**
         * The attribute posologia of Farmaco_ARV. It is of type Boolean.
         */
        public Builder setPosologia(Boolean posologia) {
            this.posologia = posologia;
            return this;
        }

        /**
         * The attribute prep of Farmaco_ARV. It is of type Boolean.
         */
        public Builder setPrep(Boolean prep) {
            this.prep = prep;
            return this;
        }

        /**
         * The attribute sottogruppo of Farmaco_ARV. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setSottogruppo(String sottogruppo) {
            this.sottogruppo = sottogruppo;
            return this;
        }

        /**
         * The attribute tipo of Farmaco_ARV. It is of type Int.
         */
        public Builder setTipo(Integer tipo) {
            this.tipo = tipo;
            return this;
        }


        public CliFarmaco_ARVDTO build() {
            CliFarmaco_ARVDTO result = new CliFarmaco_ARVDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAnno_generico(this.anno_generico);
            result.setCodice_DAD(this.codice_DAD);
            result.setComponenti(this.componenti);
            result.setGenerico(this.generico);
            result.setGruppo(this.gruppo);
            result.setLong_acting(this.long_acting);
            result.setNome(this.nome);
            result.setNome_gruppo(this.nome_gruppo);
            result.setNome_tipo(this.nome_tipo);
            result.setObsoleto(this.obsoleto);
            result.setPosologia(this.posologia);
            result.setPrep(this.prep);
            result.setSottogruppo(this.sottogruppo);
            result.setTipo(this.tipo);
            return result;
        }

    }
}
