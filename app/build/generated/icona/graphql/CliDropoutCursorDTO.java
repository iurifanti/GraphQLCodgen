package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Dropout.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDropoutCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliDropoutCursorDTO() {
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

    public String getAltro_causa_decesso() {
        return altro_causa_decesso;
    }
    public void setAltro_causa_decesso(String altro_causa_decesso) {
        this.altro_causa_decesso = altro_causa_decesso;
    }

    public String getAltro_motivo_drop() {
        return altro_motivo_drop;
    }
    public void setAltro_motivo_drop(String altro_motivo_drop) {
        this.altro_motivo_drop = altro_motivo_drop;
    }

    public String getAltro_sede_decesso() {
        return altro_sede_decesso;
    }
    public void setAltro_sede_decesso(String altro_sede_decesso) {
        this.altro_sede_decesso = altro_sede_decesso;
    }

    public Boolean getAutopsia() {
        return autopsia;
    }
    public void setAutopsia(Boolean autopsia) {
        this.autopsia = autopsia;
    }

    public String getCausa_decesso_nome1() {
        return causa_decesso_nome1;
    }
    public void setCausa_decesso_nome1(String causa_decesso_nome1) {
        this.causa_decesso_nome1 = causa_decesso_nome1;
    }

    public String getCausa_decesso_nome2() {
        return causa_decesso_nome2;
    }
    public void setCausa_decesso_nome2(String causa_decesso_nome2) {
        this.causa_decesso_nome2 = causa_decesso_nome2;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getData_decesso() {
        return data_decesso;
    }
    public void setData_decesso(String data_decesso) {
        this.data_decesso = data_decesso;
    }

    public String getData_status_vita() {
        return data_status_vita;
    }
    public void setData_status_vita(String data_status_vita) {
        this.data_status_vita = data_status_vita;
    }

    public Boolean getDeceduto() {
        return deceduto;
    }
    public void setDeceduto(Boolean deceduto) {
        this.deceduto = deceduto;
    }

    public String getLuogo_decesso() {
        return luogo_decesso;
    }
    public void setLuogo_decesso(String luogo_decesso) {
        this.luogo_decesso = luogo_decesso;
    }

    public String getMotivo_decesso() {
        return motivo_decesso;
    }
    public void setMotivo_decesso(String motivo_decesso) {
        this.motivo_decesso = motivo_decesso;
    }

    public String getMotivo_dropout() {
        return motivo_dropout;
    }
    public void setMotivo_dropout(String motivo_dropout) {
        this.motivo_dropout = motivo_dropout;
    }

    public String getPaziente() {
        return paziente;
    }
    public void setPaziente(String paziente) {
        this.paziente = paziente;
    }

    public String getStatus_vita() {
        return status_vita;
    }
    public void setStatus_vita(String status_vita) {
        this.status_vita = status_vita;
    }

    public String getUltima_visita_ok() {
        return ultima_visita_ok;
    }
    public void setUltima_visita_ok(String ultima_visita_ok) {
        this.ultima_visita_ok = ultima_visita_ok;
    }

    public Boolean getUndropped() {
        return undropped;
    }
    public void setUndropped(Boolean undropped) {
        this.undropped = undropped;
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
        return joiner.toString();
    }

    public static CliDropoutCursorDTO.Builder builder() {
        return new CliDropoutCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

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

        public Builder setAltro_causa_decesso(String altro_causa_decesso) {
            this.altro_causa_decesso = altro_causa_decesso;
            return this;
        }

        public Builder setAltro_motivo_drop(String altro_motivo_drop) {
            this.altro_motivo_drop = altro_motivo_drop;
            return this;
        }

        public Builder setAltro_sede_decesso(String altro_sede_decesso) {
            this.altro_sede_decesso = altro_sede_decesso;
            return this;
        }

        public Builder setAutopsia(Boolean autopsia) {
            this.autopsia = autopsia;
            return this;
        }

        public Builder setCausa_decesso_nome1(String causa_decesso_nome1) {
            this.causa_decesso_nome1 = causa_decesso_nome1;
            return this;
        }

        public Builder setCausa_decesso_nome2(String causa_decesso_nome2) {
            this.causa_decesso_nome2 = causa_decesso_nome2;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setData_decesso(String data_decesso) {
            this.data_decesso = data_decesso;
            return this;
        }

        public Builder setData_status_vita(String data_status_vita) {
            this.data_status_vita = data_status_vita;
            return this;
        }

        public Builder setDeceduto(Boolean deceduto) {
            this.deceduto = deceduto;
            return this;
        }

        public Builder setLuogo_decesso(String luogo_decesso) {
            this.luogo_decesso = luogo_decesso;
            return this;
        }

        public Builder setMotivo_decesso(String motivo_decesso) {
            this.motivo_decesso = motivo_decesso;
            return this;
        }

        public Builder setMotivo_dropout(String motivo_dropout) {
            this.motivo_dropout = motivo_dropout;
            return this;
        }

        public Builder setPaziente(String paziente) {
            this.paziente = paziente;
            return this;
        }

        public Builder setStatus_vita(String status_vita) {
            this.status_vita = status_vita;
            return this;
        }

        public Builder setUltima_visita_ok(String ultima_visita_ok) {
            this.ultima_visita_ok = ultima_visita_ok;
            return this;
        }

        public Builder setUndropped(Boolean undropped) {
            this.undropped = undropped;
            return this;
        }


        public CliDropoutCursorDTO build() {
            CliDropoutCursorDTO result = new CliDropoutCursorDTO();
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
            return result;
        }

    }
}
