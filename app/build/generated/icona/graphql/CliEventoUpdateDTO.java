package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class Evento.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliEventoUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String IPI;
    private String aaIPI;
    private String altro;
    private Boolean anamnesi;
    private String data;
    private String episodio;
    private String metodo_diagnosi_tumore;
    private String performance_status;
    private String siti_coinvolti_M;
    private String siti_coinvolti_N;
    private String siti_coinvolti_T;
    private String stadio_tumore;
    private String stato_accertamento;
    private String tipo_imaging;
    private CliClassificazione_ICD10RoleRefDTO classificazione_ICD10_;
    private CliPatologiaRoleRefDTO patologia;

    public CliEventoUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getIPI() {
        return IPI;
    }
    public void setIPI(String IPI) {
        this.IPI = IPI;
    }

    public String getAaIPI() {
        return aaIPI;
    }
    public void setAaIPI(String aaIPI) {
        this.aaIPI = aaIPI;
    }

    public String getAltro() {
        return altro;
    }
    public void setAltro(String altro) {
        this.altro = altro;
    }

    public Boolean getAnamnesi() {
        return anamnesi;
    }
    public void setAnamnesi(Boolean anamnesi) {
        this.anamnesi = anamnesi;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getEpisodio() {
        return episodio;
    }
    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    public String getMetodo_diagnosi_tumore() {
        return metodo_diagnosi_tumore;
    }
    public void setMetodo_diagnosi_tumore(String metodo_diagnosi_tumore) {
        this.metodo_diagnosi_tumore = metodo_diagnosi_tumore;
    }

    public String getPerformance_status() {
        return performance_status;
    }
    public void setPerformance_status(String performance_status) {
        this.performance_status = performance_status;
    }

    public String getSiti_coinvolti_M() {
        return siti_coinvolti_M;
    }
    public void setSiti_coinvolti_M(String siti_coinvolti_M) {
        this.siti_coinvolti_M = siti_coinvolti_M;
    }

    public String getSiti_coinvolti_N() {
        return siti_coinvolti_N;
    }
    public void setSiti_coinvolti_N(String siti_coinvolti_N) {
        this.siti_coinvolti_N = siti_coinvolti_N;
    }

    public String getSiti_coinvolti_T() {
        return siti_coinvolti_T;
    }
    public void setSiti_coinvolti_T(String siti_coinvolti_T) {
        this.siti_coinvolti_T = siti_coinvolti_T;
    }

    public String getStadio_tumore() {
        return stadio_tumore;
    }
    public void setStadio_tumore(String stadio_tumore) {
        this.stadio_tumore = stadio_tumore;
    }

    public String getStato_accertamento() {
        return stato_accertamento;
    }
    public void setStato_accertamento(String stato_accertamento) {
        this.stato_accertamento = stato_accertamento;
    }

    public String getTipo_imaging() {
        return tipo_imaging;
    }
    public void setTipo_imaging(String tipo_imaging) {
        this.tipo_imaging = tipo_imaging;
    }

    public CliClassificazione_ICD10RoleRefDTO getClassificazione_ICD10_() {
        return classificazione_ICD10_;
    }
    public void setClassificazione_ICD10_(CliClassificazione_ICD10RoleRefDTO classificazione_ICD10_) {
        this.classificazione_ICD10_ = classificazione_ICD10_;
    }

    public CliPatologiaRoleRefDTO getPatologia() {
        return patologia;
    }
    public void setPatologia(CliPatologiaRoleRefDTO patologia) {
        this.patologia = patologia;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (IPI != null) {
            joiner.add("IPI: " + GraphQLRequestSerializer.getEntry(IPI));
        }
        if (aaIPI != null) {
            joiner.add("aaIPI: " + GraphQLRequestSerializer.getEntry(aaIPI));
        }
        if (altro != null) {
            joiner.add("altro: " + GraphQLRequestSerializer.getEntry(altro));
        }
        if (anamnesi != null) {
            joiner.add("anamnesi: " + GraphQLRequestSerializer.getEntry(anamnesi));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (episodio != null) {
            joiner.add("episodio: " + GraphQLRequestSerializer.getEntry(episodio));
        }
        if (metodo_diagnosi_tumore != null) {
            joiner.add("metodo_diagnosi_tumore: " + GraphQLRequestSerializer.getEntry(metodo_diagnosi_tumore));
        }
        if (performance_status != null) {
            joiner.add("performance_status: " + GraphQLRequestSerializer.getEntry(performance_status));
        }
        if (siti_coinvolti_M != null) {
            joiner.add("siti_coinvolti_M: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_M));
        }
        if (siti_coinvolti_N != null) {
            joiner.add("siti_coinvolti_N: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_N));
        }
        if (siti_coinvolti_T != null) {
            joiner.add("siti_coinvolti_T: " + GraphQLRequestSerializer.getEntry(siti_coinvolti_T));
        }
        if (stadio_tumore != null) {
            joiner.add("stadio_tumore: " + GraphQLRequestSerializer.getEntry(stadio_tumore));
        }
        if (stato_accertamento != null) {
            joiner.add("stato_accertamento: " + GraphQLRequestSerializer.getEntry(stato_accertamento));
        }
        if (tipo_imaging != null) {
            joiner.add("tipo_imaging: " + GraphQLRequestSerializer.getEntry(tipo_imaging));
        }
        if (classificazione_ICD10_ != null) {
            joiner.add("classificazione_ICD10_: " + GraphQLRequestSerializer.getEntry(classificazione_ICD10_));
        }
        if (patologia != null) {
            joiner.add("patologia: " + GraphQLRequestSerializer.getEntry(patologia));
        }
        return joiner.toString();
    }

    public static CliEventoUpdateDTO.Builder builder() {
        return new CliEventoUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String IPI;
        private String aaIPI;
        private String altro;
        private Boolean anamnesi;
        private String data;
        private String episodio;
        private String metodo_diagnosi_tumore;
        private String performance_status;
        private String siti_coinvolti_M;
        private String siti_coinvolti_N;
        private String siti_coinvolti_T;
        private String stadio_tumore;
        private String stato_accertamento;
        private String tipo_imaging;
        private CliClassificazione_ICD10RoleRefDTO classificazione_ICD10_;
        private CliPatologiaRoleRefDTO patologia;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setIPI(String IPI) {
            this.IPI = IPI;
            return this;
        }

        public Builder setAaIPI(String aaIPI) {
            this.aaIPI = aaIPI;
            return this;
        }

        public Builder setAltro(String altro) {
            this.altro = altro;
            return this;
        }

        public Builder setAnamnesi(Boolean anamnesi) {
            this.anamnesi = anamnesi;
            return this;
        }

        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        public Builder setEpisodio(String episodio) {
            this.episodio = episodio;
            return this;
        }

        public Builder setMetodo_diagnosi_tumore(String metodo_diagnosi_tumore) {
            this.metodo_diagnosi_tumore = metodo_diagnosi_tumore;
            return this;
        }

        public Builder setPerformance_status(String performance_status) {
            this.performance_status = performance_status;
            return this;
        }

        public Builder setSiti_coinvolti_M(String siti_coinvolti_M) {
            this.siti_coinvolti_M = siti_coinvolti_M;
            return this;
        }

        public Builder setSiti_coinvolti_N(String siti_coinvolti_N) {
            this.siti_coinvolti_N = siti_coinvolti_N;
            return this;
        }

        public Builder setSiti_coinvolti_T(String siti_coinvolti_T) {
            this.siti_coinvolti_T = siti_coinvolti_T;
            return this;
        }

        public Builder setStadio_tumore(String stadio_tumore) {
            this.stadio_tumore = stadio_tumore;
            return this;
        }

        public Builder setStato_accertamento(String stato_accertamento) {
            this.stato_accertamento = stato_accertamento;
            return this;
        }

        public Builder setTipo_imaging(String tipo_imaging) {
            this.tipo_imaging = tipo_imaging;
            return this;
        }

        public Builder setClassificazione_ICD10_(CliClassificazione_ICD10RoleRefDTO classificazione_ICD10_) {
            this.classificazione_ICD10_ = classificazione_ICD10_;
            return this;
        }

        public Builder setPatologia(CliPatologiaRoleRefDTO patologia) {
            this.patologia = patologia;
            return this;
        }


        public CliEventoUpdateDTO build() {
            CliEventoUpdateDTO result = new CliEventoUpdateDTO();
            result.set_id(this._id);
            result.setIPI(this.IPI);
            result.setAaIPI(this.aaIPI);
            result.setAltro(this.altro);
            result.setAnamnesi(this.anamnesi);
            result.setData(this.data);
            result.setEpisodio(this.episodio);
            result.setMetodo_diagnosi_tumore(this.metodo_diagnosi_tumore);
            result.setPerformance_status(this.performance_status);
            result.setSiti_coinvolti_M(this.siti_coinvolti_M);
            result.setSiti_coinvolti_N(this.siti_coinvolti_N);
            result.setSiti_coinvolti_T(this.siti_coinvolti_T);
            result.setStadio_tumore(this.stadio_tumore);
            result.setStato_accertamento(this.stato_accertamento);
            result.setTipo_imaging(this.tipo_imaging);
            result.setClassificazione_ICD10_(this.classificazione_ICD10_);
            result.setPatologia(this.patologia);
            return result;
        }

    }
}
