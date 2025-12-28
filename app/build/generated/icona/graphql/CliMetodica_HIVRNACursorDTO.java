package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Metodica_HIVRNA.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliMetodica_HIVRNACursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private Integer codice;
    private String codice_DAD;
    private Integer limite_di_rilevabilita;
    private Integer limite_superiore;
    private String nome;
    private Boolean visibile;

    public CliMetodica_HIVRNACursorDTO() {
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

    public Integer getCodice() {
        return codice;
    }
    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    public String getCodice_DAD() {
        return codice_DAD;
    }
    public void setCodice_DAD(String codice_DAD) {
        this.codice_DAD = codice_DAD;
    }

    public Integer getLimite_di_rilevabilita() {
        return limite_di_rilevabilita;
    }
    public void setLimite_di_rilevabilita(Integer limite_di_rilevabilita) {
        this.limite_di_rilevabilita = limite_di_rilevabilita;
    }

    public Integer getLimite_superiore() {
        return limite_superiore;
    }
    public void setLimite_superiore(Integer limite_superiore) {
        this.limite_superiore = limite_superiore;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getVisibile() {
        return visibile;
    }
    public void setVisibile(Boolean visibile) {
        this.visibile = visibile;
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
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (codice_DAD != null) {
            joiner.add("codice_DAD: " + GraphQLRequestSerializer.getEntry(codice_DAD));
        }
        if (limite_di_rilevabilita != null) {
            joiner.add("limite_di_rilevabilita: " + GraphQLRequestSerializer.getEntry(limite_di_rilevabilita));
        }
        if (limite_superiore != null) {
            joiner.add("limite_superiore: " + GraphQLRequestSerializer.getEntry(limite_superiore));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (visibile != null) {
            joiner.add("visibile: " + GraphQLRequestSerializer.getEntry(visibile));
        }
        return joiner.toString();
    }

    public static CliMetodica_HIVRNACursorDTO.Builder builder() {
        return new CliMetodica_HIVRNACursorDTO.Builder();
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
        private Integer codice;
        private String codice_DAD;
        private Integer limite_di_rilevabilita;
        private Integer limite_superiore;
        private String nome;
        private Boolean visibile;

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

        public Builder setCodice(Integer codice) {
            this.codice = codice;
            return this;
        }

        public Builder setCodice_DAD(String codice_DAD) {
            this.codice_DAD = codice_DAD;
            return this;
        }

        public Builder setLimite_di_rilevabilita(Integer limite_di_rilevabilita) {
            this.limite_di_rilevabilita = limite_di_rilevabilita;
            return this;
        }

        public Builder setLimite_superiore(Integer limite_superiore) {
            this.limite_superiore = limite_superiore;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setVisibile(Boolean visibile) {
            this.visibile = visibile;
            return this;
        }


        public CliMetodica_HIVRNACursorDTO build() {
            CliMetodica_HIVRNACursorDTO result = new CliMetodica_HIVRNACursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setCodice(this.codice);
            result.setCodice_DAD(this.codice_DAD);
            result.setLimite_di_rilevabilita(this.limite_di_rilevabilita);
            result.setLimite_superiore(this.limite_superiore);
            result.setNome(this.nome);
            result.setVisibile(this.visibile);
            return result;
        }

    }
}
