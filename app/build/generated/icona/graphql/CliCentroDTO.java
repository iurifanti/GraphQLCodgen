package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Centro, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliCentroDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
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

    public CliCentroDTO() {
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
     * The attribute _createdby of Centro. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Centro. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Centro. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Centro. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Centro. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Centro. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Centro. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Centro. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute addetto of Centro. It is of type String. Max length: 255.
     */
    public String getAddetto() {
        return addetto;
    }
    /**
     * The attribute addetto of Centro. It is of type String. Max length: 255.
     */
    public void setAddetto(String addetto) {
        this.addetto = addetto;
    }

    /**
     * The attribute codice of Centro. It is of type Int.
     */
    public Integer getCodice() {
        return codice;
    }
    /**
     * The attribute codice of Centro. It is of type Int.
     */
    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    /**
     * The attribute codice_centro of Centro. It is of type String. Max length: 255.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Centro. It is of type String. Max length: 255.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute email_pro of Centro. It is of type String. Max length: 255.
     */
    public String getEmail_pro() {
        return email_pro;
    }
    /**
     * The attribute email_pro of Centro. It is of type String. Max length: 255.
     */
    public void setEmail_pro(String email_pro) {
        this.email_pro = email_pro;
    }

    /**
     * The attribute gestione_scelta of Centro. It is of type Int.
     */
    public Integer getGestione_scelta() {
        return gestione_scelta;
    }
    /**
     * The attribute gestione_scelta of Centro. It is of type Int.
     */
    public void setGestione_scelta(Integer gestione_scelta) {
        this.gestione_scelta = gestione_scelta;
    }

    /**
     * The attribute in_elenco of Centro. It is of type Int.
     */
    public Integer getIn_elenco() {
        return in_elenco;
    }
    /**
     * The attribute in_elenco of Centro. It is of type Int.
     */
    public void setIn_elenco(Integer in_elenco) {
        this.in_elenco = in_elenco;
    }

    /**
     * The attribute indirizzo of Centro. It is of type String. Max length: 255.
     */
    public String getIndirizzo() {
        return indirizzo;
    }
    /**
     * The attribute indirizzo of Centro. It is of type String. Max length: 255.
     */
    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    /**
     * The attribute nome of Centro. It is of type String. Max length: 255.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Centro. It is of type String. Max length: 255.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute primario of Centro. It is of type String. Max length: 255.
     */
    public String getPrimario() {
        return primario;
    }
    /**
     * The attribute primario of Centro. It is of type String. Max length: 255.
     */
    public void setPrimario(String primario) {
        this.primario = primario;
    }

    /**
     * The attribute telefono of Centro. It is of type String. Max length: 255.
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * The attribute telefono of Centro. It is of type String. Max length: 255.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * The attribute trasferimento_a_centro of Centro. It is of type Date @dateFormat.
     */
    public String getTrasferimento_a_centro() {
        return trasferimento_a_centro;
    }
    /**
     * The attribute trasferimento_a_centro of Centro. It is of type Date @dateFormat.
     */
    public void setTrasferimento_a_centro(String trasferimento_a_centro) {
        this.trasferimento_a_centro = trasferimento_a_centro;
    }

    /**
     * The attribute trasferimento_da_centro of Centro. It is of type Date @dateFormat.
     */
    public String getTrasferimento_da_centro() {
        return trasferimento_da_centro;
    }
    /**
     * The attribute trasferimento_da_centro of Centro. It is of type Date @dateFormat.
     */
    public void setTrasferimento_da_centro(String trasferimento_da_centro) {
        this.trasferimento_da_centro = trasferimento_da_centro;
    }

    /**
     * The attribute vax of Centro. It is of type Boolean.
     */
    public Boolean getVax() {
        return vax;
    }
    /**
     * The attribute vax of Centro. It is of type Boolean.
     */
    public void setVax(Boolean vax) {
        this.vax = vax;
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

    public static CliCentroDTO.Builder builder() {
        return new CliCentroDTO.Builder();
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

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _createdby of Centro. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Centro. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Centro. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Centro. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Centro. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute addetto of Centro. It is of type String. Max length: 255.
         */
        public Builder setAddetto(String addetto) {
            this.addetto = addetto;
            return this;
        }

        /**
         * The attribute codice of Centro. It is of type Int.
         */
        public Builder setCodice(Integer codice) {
            this.codice = codice;
            return this;
        }

        /**
         * The attribute codice_centro of Centro. It is of type String. Max length: 255.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute email_pro of Centro. It is of type String. Max length: 255.
         */
        public Builder setEmail_pro(String email_pro) {
            this.email_pro = email_pro;
            return this;
        }

        /**
         * The attribute gestione_scelta of Centro. It is of type Int.
         */
        public Builder setGestione_scelta(Integer gestione_scelta) {
            this.gestione_scelta = gestione_scelta;
            return this;
        }

        /**
         * The attribute in_elenco of Centro. It is of type Int.
         */
        public Builder setIn_elenco(Integer in_elenco) {
            this.in_elenco = in_elenco;
            return this;
        }

        /**
         * The attribute indirizzo of Centro. It is of type String. Max length: 255.
         */
        public Builder setIndirizzo(String indirizzo) {
            this.indirizzo = indirizzo;
            return this;
        }

        /**
         * The attribute nome of Centro. It is of type String. Max length: 255.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute primario of Centro. It is of type String. Max length: 255.
         */
        public Builder setPrimario(String primario) {
            this.primario = primario;
            return this;
        }

        /**
         * The attribute telefono of Centro. It is of type String. Max length: 255.
         */
        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        /**
         * The attribute trasferimento_a_centro of Centro. It is of type Date @dateFormat.
         */
        public Builder setTrasferimento_a_centro(String trasferimento_a_centro) {
            this.trasferimento_a_centro = trasferimento_a_centro;
            return this;
        }

        /**
         * The attribute trasferimento_da_centro of Centro. It is of type Date @dateFormat.
         */
        public Builder setTrasferimento_da_centro(String trasferimento_da_centro) {
            this.trasferimento_da_centro = trasferimento_da_centro;
            return this;
        }

        /**
         * The attribute vax of Centro. It is of type Boolean.
         */
        public Builder setVax(Boolean vax) {
            this.vax = vax;
            return this;
        }


        public CliCentroDTO build() {
            CliCentroDTO result = new CliCentroDTO();
            result.set_clientId(this._clientId);
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
