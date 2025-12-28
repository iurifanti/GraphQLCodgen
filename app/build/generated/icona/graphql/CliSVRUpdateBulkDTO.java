package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class SVR.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliSVRUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String altro_svr;
    private Boolean clearance_spontanea;
    private String data_valutazione;
    private String svr;
    private String terapia;

    public CliSVRUpdateBulkDTO() {
    }


    public String getAltro_svr() {
        return altro_svr;
    }
    public void setAltro_svr(String altro_svr) {
        this.altro_svr = altro_svr;
    }

    public Boolean getClearance_spontanea() {
        return clearance_spontanea;
    }
    public void setClearance_spontanea(Boolean clearance_spontanea) {
        this.clearance_spontanea = clearance_spontanea;
    }

    public String getData_valutazione() {
        return data_valutazione;
    }
    public void setData_valutazione(String data_valutazione) {
        this.data_valutazione = data_valutazione;
    }

    public String getSvr() {
        return svr;
    }
    public void setSvr(String svr) {
        this.svr = svr;
    }

    public String getTerapia() {
        return terapia;
    }
    public void setTerapia(String terapia) {
        this.terapia = terapia;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (altro_svr != null) {
            joiner.add("altro_svr: " + GraphQLRequestSerializer.getEntry(altro_svr));
        }
        if (clearance_spontanea != null) {
            joiner.add("clearance_spontanea: " + GraphQLRequestSerializer.getEntry(clearance_spontanea));
        }
        if (data_valutazione != null) {
            joiner.add("data_valutazione: " + GraphQLRequestSerializer.getEntry(data_valutazione));
        }
        if (svr != null) {
            joiner.add("svr: " + GraphQLRequestSerializer.getEntry(svr));
        }
        if (terapia != null) {
            joiner.add("terapia: " + GraphQLRequestSerializer.getEntry(terapia));
        }
        return joiner.toString();
    }

    public static CliSVRUpdateBulkDTO.Builder builder() {
        return new CliSVRUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String altro_svr;
        private Boolean clearance_spontanea;
        private String data_valutazione;
        private String svr;
        private String terapia;

        public Builder() {
        }

        public Builder setAltro_svr(String altro_svr) {
            this.altro_svr = altro_svr;
            return this;
        }

        public Builder setClearance_spontanea(Boolean clearance_spontanea) {
            this.clearance_spontanea = clearance_spontanea;
            return this;
        }

        public Builder setData_valutazione(String data_valutazione) {
            this.data_valutazione = data_valutazione;
            return this;
        }

        public Builder setSvr(String svr) {
            this.svr = svr;
            return this;
        }

        public Builder setTerapia(String terapia) {
            this.terapia = terapia;
            return this;
        }


        public CliSVRUpdateBulkDTO build() {
            CliSVRUpdateBulkDTO result = new CliSVRUpdateBulkDTO();
            result.setAltro_svr(this.altro_svr);
            result.setClearance_spontanea(this.clearance_spontanea);
            result.setData_valutazione(this.data_valutazione);
            result.setSvr(this.svr);
            result.setTerapia(this.terapia);
            return result;
        }

    }
}
