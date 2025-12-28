package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Farmaco_ARV.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliFarmaco_ARVCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliFarmaco_ARVCursorDTO() {
    }


    public String get_createdby() {
        return _createdby;
    }
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    public String get_createdon() {
        return _createdon;
    }
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    public String get_ownedby() {
        return _ownedby;
    }
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    public String get_ownedon() {
        return _ownedon;
    }
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    public Integer getAnno_generico() {
        return anno_generico;
    }
    public void setAnno_generico(Integer anno_generico) {
        this.anno_generico = anno_generico;
    }

    public String getCodice_DAD() {
        return codice_DAD;
    }
    public void setCodice_DAD(String codice_DAD) {
        this.codice_DAD = codice_DAD;
    }

    public String getComponenti() {
        return componenti;
    }
    public void setComponenti(String componenti) {
        this.componenti = componenti;
    }

    public Boolean getGenerico() {
        return generico;
    }
    public void setGenerico(Boolean generico) {
        this.generico = generico;
    }

    public String getGruppo() {
        return gruppo;
    }
    public void setGruppo(String gruppo) {
        this.gruppo = gruppo;
    }

    public Boolean getLong_acting() {
        return long_acting;
    }
    public void setLong_acting(Boolean long_acting) {
        this.long_acting = long_acting;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome_gruppo() {
        return nome_gruppo;
    }
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    public String getNome_tipo() {
        return nome_tipo;
    }
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    public Boolean getObsoleto() {
        return obsoleto;
    }
    public void setObsoleto(Boolean obsoleto) {
        this.obsoleto = obsoleto;
    }

    public Boolean getPosologia() {
        return posologia;
    }
    public void setPosologia(Boolean posologia) {
        this.posologia = posologia;
    }

    public Boolean getPrep() {
        return prep;
    }
    public void setPrep(Boolean prep) {
        this.prep = prep;
    }

    public String getSottogruppo() {
        return sottogruppo;
    }
    public void setSottogruppo(String sottogruppo) {
        this.sottogruppo = sottogruppo;
    }

    public Integer getTipo() {
        return tipo;
    }
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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

    public static CliFarmaco_ARVCursorDTO.Builder builder() {
        return new CliFarmaco_ARVCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

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

        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        public Builder setAnno_generico(Integer anno_generico) {
            this.anno_generico = anno_generico;
            return this;
        }

        public Builder setCodice_DAD(String codice_DAD) {
            this.codice_DAD = codice_DAD;
            return this;
        }

        public Builder setComponenti(String componenti) {
            this.componenti = componenti;
            return this;
        }

        public Builder setGenerico(Boolean generico) {
            this.generico = generico;
            return this;
        }

        public Builder setGruppo(String gruppo) {
            this.gruppo = gruppo;
            return this;
        }

        public Builder setLong_acting(Boolean long_acting) {
            this.long_acting = long_acting;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        public Builder setObsoleto(Boolean obsoleto) {
            this.obsoleto = obsoleto;
            return this;
        }

        public Builder setPosologia(Boolean posologia) {
            this.posologia = posologia;
            return this;
        }

        public Builder setPrep(Boolean prep) {
            this.prep = prep;
            return this;
        }

        public Builder setSottogruppo(String sottogruppo) {
            this.sottogruppo = sottogruppo;
            return this;
        }

        public Builder setTipo(Integer tipo) {
            this.tipo = tipo;
            return this;
        }


        public CliFarmaco_ARVCursorDTO build() {
            CliFarmaco_ARVCursorDTO result = new CliFarmaco_ARVCursorDTO();
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
