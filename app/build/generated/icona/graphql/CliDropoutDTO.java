package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Dropout, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDropoutDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _createdby;
    private String _createdon;
    private String _id;
    private String _lastmodifiedby;
    private String _lastmodifiedon;
    private String _ownedby;
    private String _ownedon;
    private String altro_causa_decesso;
    private String altro_motivo_drop;
    private String altro_sede_decesso;
    private Boolean autopsia;
    private String causa_decesso_nome1;
    private String causa_decesso_nome2;
    private String codice_centro;
    private String data;
    private String data_decesso;
    private String data_status_vita;
    private Boolean deceduto;
    private String luogo_decesso;
    private String motivo_decesso;
    private String motivo_dropout;
    private String paziente;
    private String status_vita;
    private String ultima_visita_ok;
    private Boolean undropped;
    private CliCausa_decessoDTO causa_decesso;
    private CliCausa_decessoDTO causa_decesso_sec;
    private CliCausa_decessoDTO causa_decesso_stimata;
    private CliMotivazione_dropoutDTO motivazione_dropout;
    private CliRelazione_decessoDTO relazione_decesso_1;
    private CliRelazione_decessoDTO relazione_decesso_2;
    private CliSede_decessoDTO sede_decesso;
    private CliPazienteDTO Paziente_dropout;

    public CliDropoutDTO() {
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
     * The attribute _createdby of Dropout. It is of type String. Cannot be null.
     */
    public String get_createdby() {
        return _createdby;
    }
    /**
     * The attribute _createdby of Dropout. It is of type String. Cannot be null.
     */
    public void set_createdby(String _createdby) {
        this._createdby = _createdby;
    }

    /**
     * The attribute _createdon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_createdon() {
        return _createdon;
    }
    /**
     * The attribute _createdon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_createdon(String _createdon) {
        this._createdon = _createdon;
    }

    /**
     * The attribute _id of Dropout. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Dropout. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute _lastmodifiedby of Dropout. It is of type String. Cannot be null.
     */
    public String get_lastmodifiedby() {
        return _lastmodifiedby;
    }
    /**
     * The attribute _lastmodifiedby of Dropout. It is of type String. Cannot be null.
     */
    public void set_lastmodifiedby(String _lastmodifiedby) {
        this._lastmodifiedby = _lastmodifiedby;
    }

    /**
     * The attribute _lastmodifiedon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_lastmodifiedon() {
        return _lastmodifiedon;
    }
    /**
     * The attribute _lastmodifiedon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_lastmodifiedon(String _lastmodifiedon) {
        this._lastmodifiedon = _lastmodifiedon;
    }

    /**
     * The attribute _ownedby of Dropout. It is of type String. Cannot be null.
     */
    public String get_ownedby() {
        return _ownedby;
    }
    /**
     * The attribute _ownedby of Dropout. It is of type String. Cannot be null.
     */
    public void set_ownedby(String _ownedby) {
        this._ownedby = _ownedby;
    }

    /**
     * The attribute _ownedon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public String get_ownedon() {
        return _ownedon;
    }
    /**
     * The attribute _ownedon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
     */
    public void set_ownedon(String _ownedon) {
        this._ownedon = _ownedon;
    }

    /**
     * The attribute altro_causa_decesso of Dropout. It is of type String. Max length: 255.
     */
    public String getAltro_causa_decesso() {
        return altro_causa_decesso;
    }
    /**
     * The attribute altro_causa_decesso of Dropout. It is of type String. Max length: 255.
     */
    public void setAltro_causa_decesso(String altro_causa_decesso) {
        this.altro_causa_decesso = altro_causa_decesso;
    }

    /**
     * The attribute altro_motivo_drop of Dropout. It is of type String. Max length: 255.
     */
    public String getAltro_motivo_drop() {
        return altro_motivo_drop;
    }
    /**
     * The attribute altro_motivo_drop of Dropout. It is of type String. Max length: 255.
     */
    public void setAltro_motivo_drop(String altro_motivo_drop) {
        this.altro_motivo_drop = altro_motivo_drop;
    }

    /**
     * The attribute altro_sede_decesso of Dropout. It is of type String. Max length: 255.
     */
    public String getAltro_sede_decesso() {
        return altro_sede_decesso;
    }
    /**
     * The attribute altro_sede_decesso of Dropout. It is of type String. Max length: 255.
     */
    public void setAltro_sede_decesso(String altro_sede_decesso) {
        this.altro_sede_decesso = altro_sede_decesso;
    }

    /**
     * The attribute autopsia of Dropout. It is of type Boolean.
     */
    public Boolean getAutopsia() {
        return autopsia;
    }
    /**
     * The attribute autopsia of Dropout. It is of type Boolean.
     */
    public void setAutopsia(Boolean autopsia) {
        this.autopsia = autopsia;
    }

    /**
     * The attribute causa_decesso_nome1 of Dropout. It is of type String. Path: causa_decesso nome.
     */
    public String getCausa_decesso_nome1() {
        return causa_decesso_nome1;
    }
    /**
     * The attribute causa_decesso_nome1 of Dropout. It is of type String. Path: causa_decesso nome.
     */
    public void setCausa_decesso_nome1(String causa_decesso_nome1) {
        this.causa_decesso_nome1 = causa_decesso_nome1;
    }

    /**
     * The attribute causa_decesso_nome2 of Dropout. It is of type String. Path: causa_decesso_sec nome.
     */
    public String getCausa_decesso_nome2() {
        return causa_decesso_nome2;
    }
    /**
     * The attribute causa_decesso_nome2 of Dropout. It is of type String. Path: causa_decesso_sec nome.
     */
    public void setCausa_decesso_nome2(String causa_decesso_nome2) {
        this.causa_decesso_nome2 = causa_decesso_nome2;
    }

    /**
     * The attribute codice_centro of Dropout. It is of type String. Path: Paziente_dropout.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Dropout. It is of type String. Path: Paziente_dropout.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data of Dropout. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Dropout. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute data_decesso of Dropout. It is of type Date @dateFormat.
     */
    public String getData_decesso() {
        return data_decesso;
    }
    /**
     * The attribute data_decesso of Dropout. It is of type Date @dateFormat.
     */
    public void setData_decesso(String data_decesso) {
        this.data_decesso = data_decesso;
    }

    /**
     * The attribute data_status_vita of Dropout. It is of type Date @dateFormat.
     */
    public String getData_status_vita() {
        return data_status_vita;
    }
    /**
     * The attribute data_status_vita of Dropout. It is of type Date @dateFormat.
     */
    public void setData_status_vita(String data_status_vita) {
        this.data_status_vita = data_status_vita;
    }

    /**
     * The attribute deceduto of Dropout. It is of type Boolean.
     */
    public Boolean getDeceduto() {
        return deceduto;
    }
    /**
     * The attribute deceduto of Dropout. It is of type Boolean.
     */
    public void setDeceduto(Boolean deceduto) {
        this.deceduto = deceduto;
    }

    /**
     * The attribute luogo_decesso of Dropout. It is of type String. Path: sede_decesso nome.
     */
    public String getLuogo_decesso() {
        return luogo_decesso;
    }
    /**
     * The attribute luogo_decesso of Dropout. It is of type String. Path: sede_decesso nome.
     */
    public void setLuogo_decesso(String luogo_decesso) {
        this.luogo_decesso = luogo_decesso;
    }

    /**
     * The attribute motivo_decesso of Dropout. It is of type String. Path: causa_decesso nome.
     */
    public String getMotivo_decesso() {
        return motivo_decesso;
    }
    /**
     * The attribute motivo_decesso of Dropout. It is of type String. Path: causa_decesso nome.
     */
    public void setMotivo_decesso(String motivo_decesso) {
        this.motivo_decesso = motivo_decesso;
    }

    /**
     * The attribute motivo_dropout of Dropout. It is of type String. Path: motivazione_dropout nome.
     */
    public String getMotivo_dropout() {
        return motivo_dropout;
    }
    /**
     * The attribute motivo_dropout of Dropout. It is of type String. Path: motivazione_dropout nome.
     */
    public void setMotivo_dropout(String motivo_dropout) {
        this.motivo_dropout = motivo_dropout;
    }

    /**
     * The attribute paziente of Dropout. It is of type String. Path: Paziente_dropout codice_interno. Cannot be null.
     */
    public String getPaziente() {
        return paziente;
    }
    /**
     * The attribute paziente of Dropout. It is of type String. Path: Paziente_dropout codice_interno. Cannot be null.
     */
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    /**
     * The attribute status_vita of Dropout. It is of type String. Domain: Vivo OR Informazione non reperibile.}Max length: 255.
     */
    public String getStatus_vita() {
        return status_vita;
    }
    /**
     * The attribute status_vita of Dropout. It is of type String. Domain: Vivo OR Informazione non reperibile.}Max length: 255.
     */
    public void setStatus_vita(String status_vita) {
        this.status_vita = status_vita;
    }

    /**
     * The attribute ultima_visita_ok of Dropout. It is of type Date @dateFormat. Expression: 'firstNotNull(ultima_visita_i,ultima_visita_h, ultima_visita_b,ultima_visita_r)'.Cannot be null.
     */
    public String getUltima_visita_ok() {
        return ultima_visita_ok;
    }
    /**
     * The attribute ultima_visita_ok of Dropout. It is of type Date @dateFormat. Expression: 'firstNotNull(ultima_visita_i,ultima_visita_h, ultima_visita_b,ultima_visita_r)'.Cannot be null.
     */
    public void setUltima_visita_ok(String ultima_visita_ok) {
        this.ultima_visita_ok = ultima_visita_ok;
    }

    /**
     * The attribute undropped of Dropout. It is of type Boolean.
     */
    public Boolean getUndropped() {
        return undropped;
    }
    /**
     * The attribute undropped of Dropout. It is of type Boolean.
     */
    public void setUndropped(Boolean undropped) {
        this.undropped = undropped;
    }

    /**
     * The associated object for the role causa_decesso.
     */
    public CliCausa_decessoDTO getCausa_decesso() {
        return causa_decesso;
    }
    /**
     * The associated object for the role causa_decesso.
     */
    public void setCausa_decesso(CliCausa_decessoDTO causa_decesso) {
        this.causa_decesso = causa_decesso;
    }

    /**
     * The associated object for the role causa_decesso_sec.
     */
    public CliCausa_decessoDTO getCausa_decesso_sec() {
        return causa_decesso_sec;
    }
    /**
     * The associated object for the role causa_decesso_sec.
     */
    public void setCausa_decesso_sec(CliCausa_decessoDTO causa_decesso_sec) {
        this.causa_decesso_sec = causa_decesso_sec;
    }

    /**
     * The associated object for the role causa_decesso_stimata.
     */
    public CliCausa_decessoDTO getCausa_decesso_stimata() {
        return causa_decesso_stimata;
    }
    /**
     * The associated object for the role causa_decesso_stimata.
     */
    public void setCausa_decesso_stimata(CliCausa_decessoDTO causa_decesso_stimata) {
        this.causa_decesso_stimata = causa_decesso_stimata;
    }

    /**
     * The associated object for the role motivazione_dropout.
     */
    public CliMotivazione_dropoutDTO getMotivazione_dropout() {
        return motivazione_dropout;
    }
    /**
     * The associated object for the role motivazione_dropout.
     */
    public void setMotivazione_dropout(CliMotivazione_dropoutDTO motivazione_dropout) {
        this.motivazione_dropout = motivazione_dropout;
    }

    /**
     * The associated object for the role relazione_decesso_1.
     */
    public CliRelazione_decessoDTO getRelazione_decesso_1() {
        return relazione_decesso_1;
    }
    /**
     * The associated object for the role relazione_decesso_1.
     */
    public void setRelazione_decesso_1(CliRelazione_decessoDTO relazione_decesso_1) {
        this.relazione_decesso_1 = relazione_decesso_1;
    }

    /**
     * The associated object for the role relazione_decesso_2.
     */
    public CliRelazione_decessoDTO getRelazione_decesso_2() {
        return relazione_decesso_2;
    }
    /**
     * The associated object for the role relazione_decesso_2.
     */
    public void setRelazione_decesso_2(CliRelazione_decessoDTO relazione_decesso_2) {
        this.relazione_decesso_2 = relazione_decesso_2;
    }

    /**
     * The associated object for the role sede_decesso.
     */
    public CliSede_decessoDTO getSede_decesso() {
        return sede_decesso;
    }
    /**
     * The associated object for the role sede_decesso.
     */
    public void setSede_decesso(CliSede_decessoDTO sede_decesso) {
        this.sede_decesso = sede_decesso;
    }

    /**
     * The associated object for the role Paziente_dropout.
     */
    public CliPazienteDTO getPaziente_dropout() {
        return Paziente_dropout;
    }
    /**
     * The associated object for the role Paziente_dropout.
     */
    public void setPaziente_dropout(CliPazienteDTO Paziente_dropout) {
        this.Paziente_dropout = Paziente_dropout;
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
        if (altro_causa_decesso != null) {
            joiner.add("altro_causa_decesso: " + GraphQLRequestSerializer.getEntry(altro_causa_decesso));
        }
        if (altro_motivo_drop != null) {
            joiner.add("altro_motivo_drop: " + GraphQLRequestSerializer.getEntry(altro_motivo_drop));
        }
        if (altro_sede_decesso != null) {
            joiner.add("altro_sede_decesso: " + GraphQLRequestSerializer.getEntry(altro_sede_decesso));
        }
        if (autopsia != null) {
            joiner.add("autopsia: " + GraphQLRequestSerializer.getEntry(autopsia));
        }
        if (causa_decesso_nome1 != null) {
            joiner.add("causa_decesso_nome1: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome1));
        }
        if (causa_decesso_nome2 != null) {
            joiner.add("causa_decesso_nome2: " + GraphQLRequestSerializer.getEntry(causa_decesso_nome2));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (data_decesso != null) {
            joiner.add("data_decesso: " + GraphQLRequestSerializer.getEntry(data_decesso));
        }
        if (data_status_vita != null) {
            joiner.add("data_status_vita: " + GraphQLRequestSerializer.getEntry(data_status_vita));
        }
        if (deceduto != null) {
            joiner.add("deceduto: " + GraphQLRequestSerializer.getEntry(deceduto));
        }
        if (luogo_decesso != null) {
            joiner.add("luogo_decesso: " + GraphQLRequestSerializer.getEntry(luogo_decesso));
        }
        if (motivo_decesso != null) {
            joiner.add("motivo_decesso: " + GraphQLRequestSerializer.getEntry(motivo_decesso));
        }
        if (motivo_dropout != null) {
            joiner.add("motivo_dropout: " + GraphQLRequestSerializer.getEntry(motivo_dropout));
        }
        if (paziente != null) {
            joiner.add("paziente: " + GraphQLRequestSerializer.getEntry(paziente));
        }
        if (status_vita != null) {
            joiner.add("status_vita: " + GraphQLRequestSerializer.getEntry(status_vita));
        }
        if (ultima_visita_ok != null) {
            joiner.add("ultima_visita_ok: " + GraphQLRequestSerializer.getEntry(ultima_visita_ok));
        }
        if (undropped != null) {
            joiner.add("undropped: " + GraphQLRequestSerializer.getEntry(undropped));
        }
        if (causa_decesso != null) {
            joiner.add("causa_decesso: " + GraphQLRequestSerializer.getEntry(causa_decesso));
        }
        if (causa_decesso_sec != null) {
            joiner.add("causa_decesso_sec: " + GraphQLRequestSerializer.getEntry(causa_decesso_sec));
        }
        if (causa_decesso_stimata != null) {
            joiner.add("causa_decesso_stimata: " + GraphQLRequestSerializer.getEntry(causa_decesso_stimata));
        }
        if (motivazione_dropout != null) {
            joiner.add("motivazione_dropout: " + GraphQLRequestSerializer.getEntry(motivazione_dropout));
        }
        if (relazione_decesso_1 != null) {
            joiner.add("relazione_decesso_1: " + GraphQLRequestSerializer.getEntry(relazione_decesso_1));
        }
        if (relazione_decesso_2 != null) {
            joiner.add("relazione_decesso_2: " + GraphQLRequestSerializer.getEntry(relazione_decesso_2));
        }
        if (sede_decesso != null) {
            joiner.add("sede_decesso: " + GraphQLRequestSerializer.getEntry(sede_decesso));
        }
        if (Paziente_dropout != null) {
            joiner.add("Paziente_dropout: " + GraphQLRequestSerializer.getEntry(Paziente_dropout));
        }
        return joiner.toString();
    }

    public static CliDropoutDTO.Builder builder() {
        return new CliDropoutDTO.Builder();
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
        private String altro_causa_decesso;
        private String altro_motivo_drop;
        private String altro_sede_decesso;
        private Boolean autopsia;
        private String causa_decesso_nome1;
        private String causa_decesso_nome2;
        private String codice_centro;
        private String data;
        private String data_decesso;
        private String data_status_vita;
        private Boolean deceduto;
        private String luogo_decesso;
        private String motivo_decesso;
        private String motivo_dropout;
        private String paziente;
        private String status_vita;
        private String ultima_visita_ok;
        private Boolean undropped;
        private CliCausa_decessoDTO causa_decesso;
        private CliCausa_decessoDTO causa_decesso_sec;
        private CliCausa_decessoDTO causa_decesso_stimata;
        private CliMotivazione_dropoutDTO motivazione_dropout;
        private CliRelazione_decessoDTO relazione_decesso_1;
        private CliRelazione_decessoDTO relazione_decesso_2;
        private CliSede_decessoDTO sede_decesso;
        private CliPazienteDTO Paziente_dropout;

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
         * The attribute _createdby of Dropout. It is of type String. Cannot be null.
         */
        public Builder set_createdby(String _createdby) {
            this._createdby = _createdby;
            return this;
        }

        /**
         * The attribute _createdon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_createdon(String _createdon) {
            this._createdon = _createdon;
            return this;
        }

        /**
         * The attribute _id of Dropout. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute _lastmodifiedby of Dropout. It is of type String. Cannot be null.
         */
        public Builder set_lastmodifiedby(String _lastmodifiedby) {
            this._lastmodifiedby = _lastmodifiedby;
            return this;
        }

        /**
         * The attribute _lastmodifiedon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_lastmodifiedon(String _lastmodifiedon) {
            this._lastmodifiedon = _lastmodifiedon;
            return this;
        }

        /**
         * The attribute _ownedby of Dropout. It is of type String. Cannot be null.
         */
        public Builder set_ownedby(String _ownedby) {
            this._ownedby = _ownedby;
            return this;
        }

        /**
         * The attribute _ownedon of Dropout. It is of type Datetime @datetimeFormat. Cannot be null.
         */
        public Builder set_ownedon(String _ownedon) {
            this._ownedon = _ownedon;
            return this;
        }

        /**
         * The attribute altro_causa_decesso of Dropout. It is of type String. Max length: 255.
         */
        public Builder setAltro_causa_decesso(String altro_causa_decesso) {
            this.altro_causa_decesso = altro_causa_decesso;
            return this;
        }

        /**
         * The attribute altro_motivo_drop of Dropout. It is of type String. Max length: 255.
         */
        public Builder setAltro_motivo_drop(String altro_motivo_drop) {
            this.altro_motivo_drop = altro_motivo_drop;
            return this;
        }

        /**
         * The attribute altro_sede_decesso of Dropout. It is of type String. Max length: 255.
         */
        public Builder setAltro_sede_decesso(String altro_sede_decesso) {
            this.altro_sede_decesso = altro_sede_decesso;
            return this;
        }

        /**
         * The attribute autopsia of Dropout. It is of type Boolean.
         */
        public Builder setAutopsia(Boolean autopsia) {
            this.autopsia = autopsia;
            return this;
        }

        /**
         * The attribute causa_decesso_nome1 of Dropout. It is of type String. Path: causa_decesso nome.
         */
        public Builder setCausa_decesso_nome1(String causa_decesso_nome1) {
            this.causa_decesso_nome1 = causa_decesso_nome1;
            return this;
        }

        /**
         * The attribute causa_decesso_nome2 of Dropout. It is of type String. Path: causa_decesso_sec nome.
         */
        public Builder setCausa_decesso_nome2(String causa_decesso_nome2) {
            this.causa_decesso_nome2 = causa_decesso_nome2;
            return this;
        }

        /**
         * The attribute codice_centro of Dropout. It is of type String. Path: Paziente_dropout.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data of Dropout. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute data_decesso of Dropout. It is of type Date @dateFormat.
         */
        public Builder setData_decesso(String data_decesso) {
            this.data_decesso = data_decesso;
            return this;
        }

        /**
         * The attribute data_status_vita of Dropout. It is of type Date @dateFormat.
         */
        public Builder setData_status_vita(String data_status_vita) {
            this.data_status_vita = data_status_vita;
            return this;
        }

        /**
         * The attribute deceduto of Dropout. It is of type Boolean.
         */
        public Builder setDeceduto(Boolean deceduto) {
            this.deceduto = deceduto;
            return this;
        }

        /**
         * The attribute luogo_decesso of Dropout. It is of type String. Path: sede_decesso nome.
         */
        public Builder setLuogo_decesso(String luogo_decesso) {
            this.luogo_decesso = luogo_decesso;
            return this;
        }

        /**
         * The attribute motivo_decesso of Dropout. It is of type String. Path: causa_decesso nome.
         */
        public Builder setMotivo_decesso(String motivo_decesso) {
            this.motivo_decesso = motivo_decesso;
            return this;
        }

        /**
         * The attribute motivo_dropout of Dropout. It is of type String. Path: motivazione_dropout nome.
         */
        public Builder setMotivo_dropout(String motivo_dropout) {
            this.motivo_dropout = motivo_dropout;
            return this;
        }

        /**
         * The attribute paziente of Dropout. It is of type String. Path: Paziente_dropout codice_interno. Cannot be null.
         */
        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        /**
         * The attribute status_vita of Dropout. It is of type String. Domain: Vivo OR Informazione non reperibile.}Max length: 255.
         */
        public Builder setStatus_vita(String status_vita) {
            this.status_vita = status_vita;
            return this;
        }

        /**
         * The attribute ultima_visita_ok of Dropout. It is of type Date @dateFormat. Expression: 'firstNotNull(ultima_visita_i,ultima_visita_h, ultima_visita_b,ultima_visita_r)'.Cannot be null.
         */
        public Builder setUltima_visita_ok(String ultima_visita_ok) {
            this.ultima_visita_ok = ultima_visita_ok;
            return this;
        }

        /**
         * The attribute undropped of Dropout. It is of type Boolean.
         */
        public Builder setUndropped(Boolean undropped) {
            this.undropped = undropped;
            return this;
        }

        /**
         * The associated object for the role causa_decesso.
         */
        public Builder setCausa_decesso(CliCausa_decessoDTO causa_decesso) {
            this.causa_decesso = causa_decesso;
            return this;
        }

        /**
         * The associated object for the role causa_decesso_sec.
         */
        public Builder setCausa_decesso_sec(CliCausa_decessoDTO causa_decesso_sec) {
            this.causa_decesso_sec = causa_decesso_sec;
            return this;
        }

        /**
         * The associated object for the role causa_decesso_stimata.
         */
        public Builder setCausa_decesso_stimata(CliCausa_decessoDTO causa_decesso_stimata) {
            this.causa_decesso_stimata = causa_decesso_stimata;
            return this;
        }

        /**
         * The associated object for the role motivazione_dropout.
         */
        public Builder setMotivazione_dropout(CliMotivazione_dropoutDTO motivazione_dropout) {
            this.motivazione_dropout = motivazione_dropout;
            return this;
        }

        /**
         * The associated object for the role relazione_decesso_1.
         */
        public Builder setRelazione_decesso_1(CliRelazione_decessoDTO relazione_decesso_1) {
            this.relazione_decesso_1 = relazione_decesso_1;
            return this;
        }

        /**
         * The associated object for the role relazione_decesso_2.
         */
        public Builder setRelazione_decesso_2(CliRelazione_decessoDTO relazione_decesso_2) {
            this.relazione_decesso_2 = relazione_decesso_2;
            return this;
        }

        /**
         * The associated object for the role sede_decesso.
         */
        public Builder setSede_decesso(CliSede_decessoDTO sede_decesso) {
            this.sede_decesso = sede_decesso;
            return this;
        }

        /**
         * The associated object for the role Paziente_dropout.
         */
        public Builder setPaziente_dropout(CliPazienteDTO Paziente_dropout) {
            this.Paziente_dropout = Paziente_dropout;
            return this;
        }


        public CliDropoutDTO build() {
            CliDropoutDTO result = new CliDropoutDTO();
            result.set_clientId(this._clientId);
            result.set_createdby(this._createdby);
            result.set_createdon(this._createdon);
            result.set_id(this._id);
            result.set_lastmodifiedby(this._lastmodifiedby);
            result.set_lastmodifiedon(this._lastmodifiedon);
            result.set_ownedby(this._ownedby);
            result.set_ownedon(this._ownedon);
            result.setAltro_causa_decesso(this.altro_causa_decesso);
            result.setAltro_motivo_drop(this.altro_motivo_drop);
            result.setAltro_sede_decesso(this.altro_sede_decesso);
            result.setAutopsia(this.autopsia);
            result.setCausa_decesso_nome1(this.causa_decesso_nome1);
            result.setCausa_decesso_nome2(this.causa_decesso_nome2);
            result.setCodice_centro(this.codice_centro);
            result.setData(this.data);
            result.setData_decesso(this.data_decesso);
            result.setData_status_vita(this.data_status_vita);
            result.setDeceduto(this.deceduto);
            result.setLuogo_decesso(this.luogo_decesso);
            result.setMotivo_decesso(this.motivo_decesso);
            result.setMotivo_dropout(this.motivo_dropout);
            result.setPaziente(this.paziente);
            result.setStatus_vita(this.status_vita);
            result.setUltima_visita_ok(this.ultima_visita_ok);
            result.setUndropped(this.undropped);
            result.setCausa_decesso(this.causa_decesso);
            result.setCausa_decesso_sec(this.causa_decesso_sec);
            result.setCausa_decesso_stimata(this.causa_decesso_stimata);
            result.setMotivazione_dropout(this.motivazione_dropout);
            result.setRelazione_decesso_1(this.relazione_decesso_1);
            result.setRelazione_decesso_2(this.relazione_decesso_2);
            result.setSede_decesso(this.sede_decesso);
            result.setPaziente_dropout(this.Paziente_dropout);
            return result;
        }

    }
}
