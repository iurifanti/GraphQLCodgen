package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Patologia, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliPatologiaDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private Integer cdc;
    private String codice_dad;
    private String codice_hicdep;
    private Boolean comorbidita_covid;
    private Boolean comorbidita_vax;
    private String descrizione;
    private Boolean documentazione;
    private Boolean evento_covid;
    private Boolean evento_vaccino_covid;
    private String gruppo;
    private String label_epatiche;
    private Boolean mostra_specifica_tumori;
    private String nome;
    private String nome_gruppo;
    private String nome_tipo;
    private Boolean pride;
    private Boolean ricovero;
    private Boolean solo_F;
    private Boolean solo_M;
    private String sottogruppo;
    private Integer tipo;
    private Boolean visibile;
    private Boolean warning_respond;

    public CliPatologiaDTO() {
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
     * The attribute _createdby of Patologia. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Patologia. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Patologia. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Patologia. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Patologia. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Patologia. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Patologia. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Patologia. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute cdc of Patologia. It is of type Int.
     */
    public Integer getCdc() {
        return cdc;
    }
    /**
     * The attribute cdc of Patologia. It is of type Int.
     */
    public void setCdc(Integer cdc) {
        this.cdc = cdc;
    }

    /**
     * The attribute codice_dad of Patologia. It is of type String. Max length: 255.
     */
    public String getCodice_dad() {
        return codice_dad;
    }
    /**
     * The attribute codice_dad of Patologia. It is of type String. Max length: 255.
     */
    public void setCodice_dad(String codice_dad) {
        this.codice_dad = codice_dad;
    }

    /**
     * The attribute codice_hicdep of Patologia. It is of type String. Max length: 255.
     */
    public String getCodice_hicdep() {
        return codice_hicdep;
    }
    /**
     * The attribute codice_hicdep of Patologia. It is of type String. Max length: 255.
     */
    public void setCodice_hicdep(String codice_hicdep) {
        this.codice_hicdep = codice_hicdep;
    }

    /**
     * The attribute comorbidita_covid of Patologia. It is of type Boolean.
     */
    public Boolean getComorbidita_covid() {
        return comorbidita_covid;
    }
    /**
     * The attribute comorbidita_covid of Patologia. It is of type Boolean.
     */
    public void setComorbidita_covid(Boolean comorbidita_covid) {
        this.comorbidita_covid = comorbidita_covid;
    }

    /**
     * The attribute comorbidita_vax of Patologia. It is of type Boolean.
     */
    public Boolean getComorbidita_vax() {
        return comorbidita_vax;
    }
    /**
     * The attribute comorbidita_vax of Patologia. It is of type Boolean.
     */
    public void setComorbidita_vax(Boolean comorbidita_vax) {
        this.comorbidita_vax = comorbidita_vax;
    }

    /**
     * The attribute descrizione of Patologia. It is of type String. Expression: 'concat(nome_tipo,", ",nome_gruppo,", ",nome)'.Cannot be null.
     */
    public String getDescrizione() {
        return descrizione;
    }
    /**
     * The attribute descrizione of Patologia. It is of type String. Expression: 'concat(nome_tipo,", ",nome_gruppo,", ",nome)'.Cannot be null.
     */
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * The attribute documentazione of Patologia. It is of type Boolean.
     */
    public Boolean getDocumentazione() {
        return documentazione;
    }
    /**
     * The attribute documentazione of Patologia. It is of type Boolean.
     */
    public void setDocumentazione(Boolean documentazione) {
        this.documentazione = documentazione;
    }

    /**
     * The attribute evento_covid of Patologia. It is of type Boolean.
     */
    public Boolean getEvento_covid() {
        return evento_covid;
    }
    /**
     * The attribute evento_covid of Patologia. It is of type Boolean.
     */
    public void setEvento_covid(Boolean evento_covid) {
        this.evento_covid = evento_covid;
    }

    /**
     * The attribute evento_vaccino_covid of Patologia. It is of type Boolean.
     */
    public Boolean getEvento_vaccino_covid() {
        return evento_vaccino_covid;
    }
    /**
     * The attribute evento_vaccino_covid of Patologia. It is of type Boolean.
     */
    public void setEvento_vaccino_covid(Boolean evento_vaccino_covid) {
        this.evento_vaccino_covid = evento_vaccino_covid;
    }

    /**
     * The attribute gruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public String getGruppo() {
        return gruppo;
    }
    /**
     * The attribute gruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public void setGruppo(String gruppo) {
        this.gruppo = gruppo;
    }

    /**
     * The attribute label_epatiche of Patologia. It is of type String. Expression: 'concat(nome_gruppo,": ", lowerCase(nome))'.Cannot be null.
     */
    public String getLabel_epatiche() {
        return label_epatiche;
    }
    /**
     * The attribute label_epatiche of Patologia. It is of type String. Expression: 'concat(nome_gruppo,": ", lowerCase(nome))'.Cannot be null.
     */
    public void setLabel_epatiche(String label_epatiche) {
        this.label_epatiche = label_epatiche;
    }

    /**
     * The attribute mostra_specifica_tumori of Patologia. It is of type Boolean.
     */
    public Boolean getMostra_specifica_tumori() {
        return mostra_specifica_tumori;
    }
    /**
     * The attribute mostra_specifica_tumori of Patologia. It is of type Boolean.
     */
    public void setMostra_specifica_tumori(Boolean mostra_specifica_tumori) {
        this.mostra_specifica_tumori = mostra_specifica_tumori;
    }

    /**
     * The attribute nome of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome() {
        return nome;
    }
    /**
     * The attribute nome of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * The attribute nome_gruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome_gruppo() {
        return nome_gruppo;
    }
    /**
     * The attribute nome_gruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome_gruppo(String nome_gruppo) {
        this.nome_gruppo = nome_gruppo;
    }

    /**
     * The attribute nome_tipo of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public String getNome_tipo() {
        return nome_tipo;
    }
    /**
     * The attribute nome_tipo of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public void setNome_tipo(String nome_tipo) {
        this.nome_tipo = nome_tipo;
    }

    /**
     * The attribute pride of Patologia. It is of type Boolean.
     */
    public Boolean getPride() {
        return pride;
    }
    /**
     * The attribute pride of Patologia. It is of type Boolean.
     */
    public void setPride(Boolean pride) {
        this.pride = pride;
    }

    /**
     * The attribute ricovero of Patologia. It is of type Boolean.
     */
    public Boolean getRicovero() {
        return ricovero;
    }
    /**
     * The attribute ricovero of Patologia. It is of type Boolean.
     */
    public void setRicovero(Boolean ricovero) {
        this.ricovero = ricovero;
    }

    /**
     * The attribute solo_F of Patologia. It is of type Boolean.
     */
    public Boolean getSolo_F() {
        return solo_F;
    }
    /**
     * The attribute solo_F of Patologia. It is of type Boolean.
     */
    public void setSolo_F(Boolean solo_F) {
        this.solo_F = solo_F;
    }

    /**
     * The attribute solo_M of Patologia. It is of type Boolean.
     */
    public Boolean getSolo_M() {
        return solo_M;
    }
    /**
     * The attribute solo_M of Patologia. It is of type Boolean.
     */
    public void setSolo_M(Boolean solo_M) {
        this.solo_M = solo_M;
    }

    /**
     * The attribute sottogruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public String getSottogruppo() {
        return sottogruppo;
    }
    /**
     * The attribute sottogruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
     */
    public void setSottogruppo(String sottogruppo) {
        this.sottogruppo = sottogruppo;
    }

    /**
     * The attribute tipo of Patologia. It is of type Int. Cannot be null.
     */
    public Integer getTipo() {
        return tipo;
    }
    /**
     * The attribute tipo of Patologia. It is of type Int. Cannot be null.
     */
    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    /**
     * The attribute visibile of Patologia. It is of type Boolean.
     */
    public Boolean getVisibile() {
        return visibile;
    }
    /**
     * The attribute visibile of Patologia. It is of type Boolean.
     */
    public void setVisibile(Boolean visibile) {
        this.visibile = visibile;
    }

    /**
     * The attribute warning_respond of Patologia. It is of type Boolean.
     */
    public Boolean getWarning_respond() {
        return warning_respond;
    }
    /**
     * The attribute warning_respond of Patologia. It is of type Boolean.
     */
    public void setWarning_respond(Boolean warning_respond) {
        this.warning_respond = warning_respond;
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
        if (cdc != null) {
            joiner.add("cdc: " + GraphQLRequestSerializer.getEntry(cdc));
        }
        if (codice_dad != null) {
            joiner.add("codice_dad: " + GraphQLRequestSerializer.getEntry(codice_dad));
        }
        if (codice_hicdep != null) {
            joiner.add("codice_hicdep: " + GraphQLRequestSerializer.getEntry(codice_hicdep));
        }
        if (comorbidita_covid != null) {
            joiner.add("comorbidita_covid: " + GraphQLRequestSerializer.getEntry(comorbidita_covid));
        }
        if (comorbidita_vax != null) {
            joiner.add("comorbidita_vax: " + GraphQLRequestSerializer.getEntry(comorbidita_vax));
        }
        if (descrizione != null) {
            joiner.add("descrizione: " + GraphQLRequestSerializer.getEntry(descrizione));
        }
        if (documentazione != null) {
            joiner.add("documentazione: " + GraphQLRequestSerializer.getEntry(documentazione));
        }
        if (evento_covid != null) {
            joiner.add("evento_covid: " + GraphQLRequestSerializer.getEntry(evento_covid));
        }
        if (evento_vaccino_covid != null) {
            joiner.add("evento_vaccino_covid: " + GraphQLRequestSerializer.getEntry(evento_vaccino_covid));
        }
        if (gruppo != null) {
            joiner.add("gruppo: " + GraphQLRequestSerializer.getEntry(gruppo));
        }
        if (label_epatiche != null) {
            joiner.add("label_epatiche: " + GraphQLRequestSerializer.getEntry(label_epatiche));
        }
        if (mostra_specifica_tumori != null) {
            joiner.add("mostra_specifica_tumori: " + GraphQLRequestSerializer.getEntry(mostra_specifica_tumori));
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
        if (pride != null) {
            joiner.add("pride: " + GraphQLRequestSerializer.getEntry(pride));
        }
        if (ricovero != null) {
            joiner.add("ricovero: " + GraphQLRequestSerializer.getEntry(ricovero));
        }
        if (solo_F != null) {
            joiner.add("solo_F: " + GraphQLRequestSerializer.getEntry(solo_F));
        }
        if (solo_M != null) {
            joiner.add("solo_M: " + GraphQLRequestSerializer.getEntry(solo_M));
        }
        if (sottogruppo != null) {
            joiner.add("sottogruppo: " + GraphQLRequestSerializer.getEntry(sottogruppo));
        }
        if (tipo != null) {
            joiner.add("tipo: " + GraphQLRequestSerializer.getEntry(tipo));
        }
        if (visibile != null) {
            joiner.add("visibile: " + GraphQLRequestSerializer.getEntry(visibile));
        }
        if (warning_respond != null) {
            joiner.add("warning_respond: " + GraphQLRequestSerializer.getEntry(warning_respond));
        }
        return joiner.toString();
    }

    public static CliPatologiaDTO.Builder builder() {
        return new CliPatologiaDTO.Builder();
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
        private Integer cdc;
        private String codice_dad;
        private String codice_hicdep;
        private Boolean comorbidita_covid;
        private Boolean comorbidita_vax;
        private String descrizione;
        private Boolean documentazione;
        private Boolean evento_covid;
        private Boolean evento_vaccino_covid;
        private String gruppo;
        private String label_epatiche;
        private Boolean mostra_specifica_tumori;
        private String nome;
        private String nome_gruppo;
        private String nome_tipo;
        private Boolean pride;
        private Boolean ricovero;
        private Boolean solo_F;
        private Boolean solo_M;
        private String sottogruppo;
        private Integer tipo;
        private Boolean visibile;
        private Boolean warning_respond;

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
         * The attribute _createdby of Patologia. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Patologia. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Patologia. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Patologia. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Patologia. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute cdc of Patologia. It is of type Int.
         */
        public Builder setCdc(Integer cdc) {
            this.cdc = cdc;
            return this;
        }

        /**
         * The attribute codice_dad of Patologia. It is of type String. Max length: 255.
         */
        public Builder setCodice_dad(String codice_dad) {
            this.codice_dad = codice_dad;
            return this;
        }

        /**
         * The attribute codice_hicdep of Patologia. It is of type String. Max length: 255.
         */
        public Builder setCodice_hicdep(String codice_hicdep) {
            this.codice_hicdep = codice_hicdep;
            return this;
        }

        /**
         * The attribute comorbidita_covid of Patologia. It is of type Boolean.
         */
        public Builder setComorbidita_covid(Boolean comorbidita_covid) {
            this.comorbidita_covid = comorbidita_covid;
            return this;
        }

        /**
         * The attribute comorbidita_vax of Patologia. It is of type Boolean.
         */
        public Builder setComorbidita_vax(Boolean comorbidita_vax) {
            this.comorbidita_vax = comorbidita_vax;
            return this;
        }

        /**
         * The attribute descrizione of Patologia. It is of type String. Expression: 'concat(nome_tipo,", ",nome_gruppo,", ",nome)'.Cannot be null.
         */
        public Builder setDescrizione(String descrizione) {
            this.descrizione = descrizione;
            return this;
        }

        /**
         * The attribute documentazione of Patologia. It is of type Boolean.
         */
        public Builder setDocumentazione(Boolean documentazione) {
            this.documentazione = documentazione;
            return this;
        }

        /**
         * The attribute evento_covid of Patologia. It is of type Boolean.
         */
        public Builder setEvento_covid(Boolean evento_covid) {
            this.evento_covid = evento_covid;
            return this;
        }

        /**
         * The attribute evento_vaccino_covid of Patologia. It is of type Boolean.
         */
        public Builder setEvento_vaccino_covid(Boolean evento_vaccino_covid) {
            this.evento_vaccino_covid = evento_vaccino_covid;
            return this;
        }

        /**
         * The attribute gruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setGruppo(String gruppo) {
            this.gruppo = gruppo;
            return this;
        }

        /**
         * The attribute label_epatiche of Patologia. It is of type String. Expression: 'concat(nome_gruppo,": ", lowerCase(nome))'.Cannot be null.
         */
        public Builder setLabel_epatiche(String label_epatiche) {
            this.label_epatiche = label_epatiche;
            return this;
        }

        /**
         * The attribute mostra_specifica_tumori of Patologia. It is of type Boolean.
         */
        public Builder setMostra_specifica_tumori(Boolean mostra_specifica_tumori) {
            this.mostra_specifica_tumori = mostra_specifica_tumori;
            return this;
        }

        /**
         * The attribute nome of Patologia. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        /**
         * The attribute nome_gruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome_gruppo(String nome_gruppo) {
            this.nome_gruppo = nome_gruppo;
            return this;
        }

        /**
         * The attribute nome_tipo of Patologia. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setNome_tipo(String nome_tipo) {
            this.nome_tipo = nome_tipo;
            return this;
        }

        /**
         * The attribute pride of Patologia. It is of type Boolean.
         */
        public Builder setPride(Boolean pride) {
            this.pride = pride;
            return this;
        }

        /**
         * The attribute ricovero of Patologia. It is of type Boolean.
         */
        public Builder setRicovero(Boolean ricovero) {
            this.ricovero = ricovero;
            return this;
        }

        /**
         * The attribute solo_F of Patologia. It is of type Boolean.
         */
        public Builder setSolo_F(Boolean solo_F) {
            this.solo_F = solo_F;
            return this;
        }

        /**
         * The attribute solo_M of Patologia. It is of type Boolean.
         */
        public Builder setSolo_M(Boolean solo_M) {
            this.solo_M = solo_M;
            return this;
        }

        /**
         * The attribute sottogruppo of Patologia. It is of type String. Max length: 255.Cannot be null.
         */
        public Builder setSottogruppo(String sottogruppo) {
            this.sottogruppo = sottogruppo;
            return this;
        }

        /**
         * The attribute tipo of Patologia. It is of type Int. Cannot be null.
         */
        public Builder setTipo(Integer tipo) {
            this.tipo = tipo;
            return this;
        }

        /**
         * The attribute visibile of Patologia. It is of type Boolean.
         */
        public Builder setVisibile(Boolean visibile) {
            this.visibile = visibile;
            return this;
        }

        /**
         * The attribute warning_respond of Patologia. It is of type Boolean.
         */
        public Builder setWarning_respond(Boolean warning_respond) {
            this.warning_respond = warning_respond;
            return this;
        }


        public CliPatologiaDTO build() {
            CliPatologiaDTO result = new CliPatologiaDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setCdc(this.cdc);
            result.setCodice_dad(this.codice_dad);
            result.setCodice_hicdep(this.codice_hicdep);
            result.setComorbidita_covid(this.comorbidita_covid);
            result.setComorbidita_vax(this.comorbidita_vax);
            result.setDescrizione(this.descrizione);
            result.setDocumentazione(this.documentazione);
            result.setEvento_covid(this.evento_covid);
            result.setEvento_vaccino_covid(this.evento_vaccino_covid);
            result.setGruppo(this.gruppo);
            result.setLabel_epatiche(this.label_epatiche);
            result.setMostra_specifica_tumori(this.mostra_specifica_tumori);
            result.setNome(this.nome);
            result.setNome_gruppo(this.nome_gruppo);
            result.setNome_tipo(this.nome_tipo);
            result.setPride(this.pride);
            result.setRicovero(this.ricovero);
            result.setSolo_F(this.solo_F);
            result.setSolo_M(this.solo_M);
            result.setSottogruppo(this.sottogruppo);
            result.setTipo(this.tipo);
            result.setVisibile(this.visibile);
            result.setWarning_respond(this.warning_respond);
            return result;
        }

    }
}
