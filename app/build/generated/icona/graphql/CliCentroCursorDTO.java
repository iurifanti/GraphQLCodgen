package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Centro.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliCentroCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String addetto;
    private Integer codice;
    private String codice_centro;
    private String email_pro;
    private Integer gestione_scelta;
    private Integer in_elenco;
    private String indirizzo;
    private String nome;
    private String primario;
    private String telefono;
    private String trasferimento_a_centro;
    private String trasferimento_da_centro;
    private Boolean vax;

    public CliCentroCursorDTO() {
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

    public String getAddetto() {
        return addetto;
    }
    public void setAddetto(String addetto) {
        this.addetto = addetto;
    }

    public Integer getCodice() {
        return codice;
    }
    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public String getEmail_pro() {
        return email_pro;
    }
    public void setEmail_pro(String email_pro) {
        this.email_pro = email_pro;
    }

    public Integer getGestione_scelta() {
        return gestione_scelta;
    }
    public void setGestione_scelta(Integer gestione_scelta) {
        this.gestione_scelta = gestione_scelta;
    }

    public Integer getIn_elenco() {
        return in_elenco;
    }
    public void setIn_elenco(Integer in_elenco) {
        this.in_elenco = in_elenco;
    }

    public String getIndirizzo() {
        return indirizzo;
    }
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPrimario() {
        return primario;
    }
    public void setPrimario(String primario) {
        this.primario = primario;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTrasferimento_a_centro() {
        return trasferimento_a_centro;
    }
    public void setTrasferimento_a_centro(String trasferimento_a_centro) {
        this.trasferimento_a_centro = trasferimento_a_centro;
    }

    public String getTrasferimento_da_centro() {
        return trasferimento_da_centro;
    }
    public void setTrasferimento_da_centro(String trasferimento_da_centro) {
        this.trasferimento_da_centro = trasferimento_da_centro;
    }

    public Boolean getVax() {
        return vax;
    }
    public void setVax(Boolean vax) {
        this.vax = vax;
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
        if (addetto != null) {
            joiner.add("addetto: " + GraphQLRequestSerializer.getEntry(addetto));
        }
        if (codice != null) {
            joiner.add("codice: " + GraphQLRequestSerializer.getEntry(codice));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (email_pro != null) {
            joiner.add("email_pro: " + GraphQLRequestSerializer.getEntry(email_pro));
        }
        if (gestione_scelta != null) {
            joiner.add("gestione_scelta: " + GraphQLRequestSerializer.getEntry(gestione_scelta));
        }
        if (in_elenco != null) {
            joiner.add("in_elenco: " + GraphQLRequestSerializer.getEntry(in_elenco));
        }
        if (indirizzo != null) {
            joiner.add("indirizzo: " + GraphQLRequestSerializer.getEntry(indirizzo));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (primario != null) {
            joiner.add("primario: " + GraphQLRequestSerializer.getEntry(primario));
        }
        if (telefono != null) {
            joiner.add("telefono: " + GraphQLRequestSerializer.getEntry(telefono));
        }
        if (trasferimento_a_centro != null) {
            joiner.add("trasferimento_a_centro: " + GraphQLRequestSerializer.getEntry(trasferimento_a_centro));
        }
        if (trasferimento_da_centro != null) {
            joiner.add("trasferimento_da_centro: " + GraphQLRequestSerializer.getEntry(trasferimento_da_centro));
        }
        if (vax != null) {
            joiner.add("vax: " + GraphQLRequestSerializer.getEntry(vax));
        }
        return joiner.toString();
    }

    public static CliCentroCursorDTO.Builder builder() {
        return new CliCentroCursorDTO.Builder();
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
        private String addetto;
        private Integer codice;
        private String codice_centro;
        private String email_pro;
        private Integer gestione_scelta;
        private Integer in_elenco;
        private String indirizzo;
        private String nome;
        private String primario;
        private String telefono;
        private String trasferimento_a_centro;
        private String trasferimento_da_centro;
        private Boolean vax;

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

        public Builder setAddetto(String addetto) {
            this.addetto = addetto;
            return this;
        }

        public Builder setCodice(Integer codice) {
            this.codice = codice;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setEmail_pro(String email_pro) {
            this.email_pro = email_pro;
            return this;
        }

        public Builder setGestione_scelta(Integer gestione_scelta) {
            this.gestione_scelta = gestione_scelta;
            return this;
        }

        public Builder setIn_elenco(Integer in_elenco) {
            this.in_elenco = in_elenco;
            return this;
        }

        public Builder setIndirizzo(String indirizzo) {
            this.indirizzo = indirizzo;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setPrimario(String primario) {
            this.primario = primario;
            return this;
        }

        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setTrasferimento_a_centro(String trasferimento_a_centro) {
            this.trasferimento_a_centro = trasferimento_a_centro;
            return this;
        }

        public Builder setTrasferimento_da_centro(String trasferimento_da_centro) {
            this.trasferimento_da_centro = trasferimento_da_centro;
            return this;
        }

        public Builder setVax(Boolean vax) {
            this.vax = vax;
            return this;
        }


        public CliCentroCursorDTO build() {
            CliCentroCursorDTO result = new CliCentroCursorDTO();
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAddetto(this.addetto);
            result.setCodice(this.codice);
            result.setCodice_centro(this.codice_centro);
            result.setEmail_pro(this.email_pro);
            result.setGestione_scelta(this.gestione_scelta);
            result.setIn_elenco(this.in_elenco);
            result.setIndirizzo(this.indirizzo);
            result.setNome(this.nome);
            result.setPrimario(this.primario);
            result.setTelefono(this.telefono);
            result.setTrasferimento_a_centro(this.trasferimento_a_centro);
            result.setTrasferimento_da_centro(this.trasferimento_da_centro);
            result.setVax(this.vax);
            return result;
        }

    }
}
