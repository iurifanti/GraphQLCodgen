package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for draft create objects of class Dropout.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDropoutDraftCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String altro_causa_decesso;
    private String altro_motivo_drop;
    private String altro_sede_decesso;
    private Boolean autopsia;
    private String data;
    private String data_decesso;
    private String data_status_vita;
    private Boolean deceduto;
    private String status_vita;
    private Boolean undropped;
    private String causa_decesso;
    private String causa_decesso_sec;
    private String causa_decesso_stimata;
    private String motivazione_dropout;
    private String relazione_decesso_1;
    private String relazione_decesso_2;
    private String sede_decesso;

    public CliDropoutDraftCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
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

    public String getStatus_vita() {
        return status_vita;
    }
    public void setStatus_vita(String status_vita) {
        this.status_vita = status_vita;
    }

    public Boolean getUndropped() {
        return undropped;
    }
    public void setUndropped(Boolean undropped) {
        this.undropped = undropped;
    }

    public String getCausa_decesso() {
        return causa_decesso;
    }
    public void setCausa_decesso(String causa_decesso) {
        this.causa_decesso = causa_decesso;
    }

    public String getCausa_decesso_sec() {
        return causa_decesso_sec;
    }
    public void setCausa_decesso_sec(String causa_decesso_sec) {
        this.causa_decesso_sec = causa_decesso_sec;
    }

    public String getCausa_decesso_stimata() {
        return causa_decesso_stimata;
    }
    public void setCausa_decesso_stimata(String causa_decesso_stimata) {
        this.causa_decesso_stimata = causa_decesso_stimata;
    }

    public String getMotivazione_dropout() {
        return motivazione_dropout;
    }
    public void setMotivazione_dropout(String motivazione_dropout) {
        this.motivazione_dropout = motivazione_dropout;
    }

    public String getRelazione_decesso_1() {
        return relazione_decesso_1;
    }
    public void setRelazione_decesso_1(String relazione_decesso_1) {
        this.relazione_decesso_1 = relazione_decesso_1;
    }

    public String getRelazione_decesso_2() {
        return relazione_decesso_2;
    }
    public void setRelazione_decesso_2(String relazione_decesso_2) {
        this.relazione_decesso_2 = relazione_decesso_2;
    }

    public String getSede_decesso() {
        return sede_decesso;
    }
    public void setSede_decesso(String sede_decesso) {
        this.sede_decesso = sede_decesso;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
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
        if (status_vita != null) {
            joiner.add("status_vita: " + GraphQLRequestSerializer.getEntry(status_vita));
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
        return joiner.toString();
    }

    public static CliDropoutDraftCreateDTO.Builder builder() {
        return new CliDropoutDraftCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private String altro_causa_decesso;
        private String altro_motivo_drop;
        private String altro_sede_decesso;
        private Boolean autopsia;
        private String data;
        private String data_decesso;
        private String data_status_vita;
        private Boolean deceduto;
        private String status_vita;
        private Boolean undropped;
        private String causa_decesso;
        private String causa_decesso_sec;
        private String causa_decesso_stimata;
        private String motivazione_dropout;
        private String relazione_decesso_1;
        private String relazione_decesso_2;
        private String sede_decesso;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
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

        public Builder setStatus_vita(String status_vita) {
            this.status_vita = status_vita;
            return this;
        }

        public Builder setUndropped(Boolean undropped) {
            this.undropped = undropped;
            return this;
        }

        public Builder setCausa_decesso(String causa_decesso) {
            this.causa_decesso = causa_decesso;
            return this;
        }

        public Builder setCausa_decesso_sec(String causa_decesso_sec) {
            this.causa_decesso_sec = causa_decesso_sec;
            return this;
        }

        public Builder setCausa_decesso_stimata(String causa_decesso_stimata) {
            this.causa_decesso_stimata = causa_decesso_stimata;
            return this;
        }

        public Builder setMotivazione_dropout(String motivazione_dropout) {
            this.motivazione_dropout = motivazione_dropout;
            return this;
        }

        public Builder setRelazione_decesso_1(String relazione_decesso_1) {
            this.relazione_decesso_1 = relazione_decesso_1;
            return this;
        }

        public Builder setRelazione_decesso_2(String relazione_decesso_2) {
            this.relazione_decesso_2 = relazione_decesso_2;
            return this;
        }

        public Builder setSede_decesso(String sede_decesso) {
            this.sede_decesso = sede_decesso;
            return this;
        }


        public CliDropoutDraftCreateDTO build() {
            CliDropoutDraftCreateDTO result = new CliDropoutDraftCreateDTO();
            result.set_clientId(this._clientId);
            result.setAltro_causa_decesso(this.altro_causa_decesso);
            result.setAltro_motivo_drop(this.altro_motivo_drop);
            result.setAltro_sede_decesso(this.altro_sede_decesso);
            result.setAutopsia(this.autopsia);
            result.setData(this.data);
            result.setData_decesso(this.data_decesso);
            result.setData_status_vita(this.data_status_vita);
            result.setDeceduto(this.deceduto);
            result.setStatus_vita(this.status_vita);
            result.setUndropped(this.undropped);
            result.setCausa_decesso(this.causa_decesso);
            result.setCausa_decesso_sec(this.causa_decesso_sec);
            result.setCausa_decesso_stimata(this.causa_decesso_stimata);
            result.setMotivazione_dropout(this.motivazione_dropout);
            result.setRelazione_decesso_1(this.relazione_decesso_1);
            result.setRelazione_decesso_2(this.relazione_decesso_2);
            result.setSede_decesso(this.sede_decesso);
            return result;
        }

    }
}
