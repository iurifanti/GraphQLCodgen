package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Esame_strumentale, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliEsame_strumentaleDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String IQR;
    private String _id;
    private String altro_esame;
    private String bmd_colonna;
    private String bmd_femore;
    private Integer cap_iqr;
    private Integer cap_mediano;
    private String classe_rischio_hpv;
    private String codice_centro;
    private String data;
    private String esame;
    private String esito;
    private String genotipi_hpv;
    private Integer i_paziente;
    private String metavir;
    private Boolean patologico;
    private Integer paziente_ok;
    private String stifness;
    private String success_rate;
    private String t_score_colonna;
    private String t_score_femore;
    private String z_score_colonna;
    private String z_score_femore;
    private CliPazienteDTO paziente_;

    public CliEsame_strumentaleDTO() {
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
     * The attribute IQR of Esame_strumentale. It is of type Real @realFormat.
     */
    public String getIQR() {
        return IQR;
    }
    /**
     * The attribute IQR of Esame_strumentale. It is of type Real @realFormat.
     */
    public void setIQR(String IQR) {
        this.IQR = IQR;
    }

    /**
     * The attribute _id of Esame_strumentale. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Esame_strumentale. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute altro_esame of Esame_strumentale. It is of type String. Max length: 255.
     */
    public String getAltro_esame() {
        return altro_esame;
    }
    /**
     * The attribute altro_esame of Esame_strumentale. It is of type String. Max length: 255.
     */
    public void setAltro_esame(String altro_esame) {
        this.altro_esame = altro_esame;
    }

    /**
     * The attribute bmd_colonna of Esame_strumentale. It is of type Real @realFormat.
     */
    public String getBmd_colonna() {
        return bmd_colonna;
    }
    /**
     * The attribute bmd_colonna of Esame_strumentale. It is of type Real @realFormat.
     */
    public void setBmd_colonna(String bmd_colonna) {
        this.bmd_colonna = bmd_colonna;
    }

    /**
     * The attribute bmd_femore of Esame_strumentale. It is of type Real @realFormat.
     */
    public String getBmd_femore() {
        return bmd_femore;
    }
    /**
     * The attribute bmd_femore of Esame_strumentale. It is of type Real @realFormat.
     */
    public void setBmd_femore(String bmd_femore) {
        this.bmd_femore = bmd_femore;
    }

    /**
     * The attribute cap_iqr of Esame_strumentale. It is of type Int.
     */
    public Integer getCap_iqr() {
        return cap_iqr;
    }
    /**
     * The attribute cap_iqr of Esame_strumentale. It is of type Int.
     */
    public void setCap_iqr(Integer cap_iqr) {
        this.cap_iqr = cap_iqr;
    }

    /**
     * The attribute cap_mediano of Esame_strumentale. It is of type Int.
     */
    public Integer getCap_mediano() {
        return cap_mediano;
    }
    /**
     * The attribute cap_mediano of Esame_strumentale. It is of type Int.
     */
    public void setCap_mediano(Integer cap_mediano) {
        this.cap_mediano = cap_mediano;
    }

    /**
     * The attribute classe_rischio_hpv of Esame_strumentale. It is of type String. Domain: Ad alto rischio OR A rischio OR A basso Rischio OR A rischio molto basso.}Max length: 255.
     */
    public String getClasse_rischio_hpv() {
        return classe_rischio_hpv;
    }
    /**
     * The attribute classe_rischio_hpv of Esame_strumentale. It is of type String. Domain: Ad alto rischio OR A rischio OR A basso Rischio OR A rischio molto basso.}Max length: 255.
     */
    public void setClasse_rischio_hpv(String classe_rischio_hpv) {
        this.classe_rischio_hpv = classe_rischio_hpv;
    }

    /**
     * The attribute codice_centro of Esame_strumentale. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public String getCodice_centro() {
        return codice_centro;
    }
    /**
     * The attribute codice_centro of Esame_strumentale. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
     */
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    /**
     * The attribute data of Esame_strumentale. It is of type Date @dateFormat.
     */
    public String getData() {
        return data;
    }
    /**
     * The attribute data of Esame_strumentale. It is of type Date @dateFormat.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * The attribute esame of Esame_strumentale. It is of type String. Domain: Fibroscan OR Biopsia OR TAC OR Altro esame (specificare) OR Eco addome OR RMN OR EGDS OR HPV-DNA OR MOC/DEXA.}Max length: 255.
     */
    public String getEsame() {
        return esame;
    }
    /**
     * The attribute esame of Esame_strumentale. It is of type String. Domain: Fibroscan OR Biopsia OR TAC OR Altro esame (specificare) OR Eco addome OR RMN OR EGDS OR HPV-DNA OR MOC/DEXA.}Max length: 255.
     */
    public void setEsame(String esame) {
        this.esame = esame;
    }

    /**
     * The attribute esito of Esame_strumentale. It is of type Text.
     */
    public String getEsito() {
        return esito;
    }
    /**
     * The attribute esito of Esame_strumentale. It is of type Text.
     */
    public void setEsito(String esito) {
        this.esito = esito;
    }

    /**
     * The attribute genotipi_hpv of Esame_strumentale. It is of type String. Max length: 255.
     */
    public String getGenotipi_hpv() {
        return genotipi_hpv;
    }
    /**
     * The attribute genotipi_hpv of Esame_strumentale. It is of type String. Max length: 255.
     */
    public void setGenotipi_hpv(String genotipi_hpv) {
        this.genotipi_hpv = genotipi_hpv;
    }

    /**
     * The attribute i_paziente of Esame_strumentale. It is of type Int. Path: paziente_ __id. Cannot be null.
     */
    public Integer getI_paziente() {
        return i_paziente;
    }
    /**
     * The attribute i_paziente of Esame_strumentale. It is of type Int. Path: paziente_ __id. Cannot be null.
     */
    public void setI_paziente(Integer i_paziente) {
        this.i_paziente = i_paziente;
    }

    /**
     * The attribute metavir of Esame_strumentale. It is of type String. Domain: F0 OR F1 OR F2 OR F3 OR F4.}Max length: 255.
     */
    public String getMetavir() {
        return metavir;
    }
    /**
     * The attribute metavir of Esame_strumentale. It is of type String. Domain: F0 OR F1 OR F2 OR F3 OR F4.}Max length: 255.
     */
    public void setMetavir(String metavir) {
        this.metavir = metavir;
    }

    /**
     * The attribute patologico of Esame_strumentale. It is of type Boolean.
     */
    public Boolean getPatologico() {
        return patologico;
    }
    /**
     * The attribute patologico of Esame_strumentale. It is of type Boolean.
     */
    public void setPatologico(Boolean patologico) {
        this.patologico = patologico;
    }

    /**
     * The attribute paziente_ok of Esame_strumentale. It is of type Int. Expression: 'firstNotNull(
i_paziente,
h_paziente
)'.Cannot be null.
     */
    public Integer getPaziente_ok() {
        return paziente_ok;
    }
    /**
     * The attribute paziente_ok of Esame_strumentale. It is of type Int. Expression: 'firstNotNull(
i_paziente,
h_paziente
)'.Cannot be null.
     */
    public void setPaziente_ok(Integer paziente_ok) {
        this.paziente_ok = paziente_ok;
    }

    /**
     * The attribute stifness of Esame_strumentale. It is of type Real @realFormat.
     */
    public String getStifness() {
        return stifness;
    }
    /**
     * The attribute stifness of Esame_strumentale. It is of type Real @realFormat.
     */
    public void setStifness(String stifness) {
        this.stifness = stifness;
    }

    /**
     * The attribute success_rate of Esame_strumentale. It is of type Real @realFormat. Ranges: 0.0:100.0.
     */
    public String getSuccess_rate() {
        return success_rate;
    }
    /**
     * The attribute success_rate of Esame_strumentale. It is of type Real @realFormat. Ranges: 0.0:100.0.
     */
    public void setSuccess_rate(String success_rate) {
        this.success_rate = success_rate;
    }

    /**
     * The attribute t_score_colonna of Esame_strumentale. It is of type Real @realFormat.
     */
    public String getT_score_colonna() {
        return t_score_colonna;
    }
    /**
     * The attribute t_score_colonna of Esame_strumentale. It is of type Real @realFormat.
     */
    public void setT_score_colonna(String t_score_colonna) {
        this.t_score_colonna = t_score_colonna;
    }

    /**
     * The attribute t_score_femore of Esame_strumentale. It is of type Real @realFormat.
     */
    public String getT_score_femore() {
        return t_score_femore;
    }
    /**
     * The attribute t_score_femore of Esame_strumentale. It is of type Real @realFormat.
     */
    public void setT_score_femore(String t_score_femore) {
        this.t_score_femore = t_score_femore;
    }

    /**
     * The attribute z_score_colonna of Esame_strumentale. It is of type Real @realFormat.
     */
    public String getZ_score_colonna() {
        return z_score_colonna;
    }
    /**
     * The attribute z_score_colonna of Esame_strumentale. It is of type Real @realFormat.
     */
    public void setZ_score_colonna(String z_score_colonna) {
        this.z_score_colonna = z_score_colonna;
    }

    /**
     * The attribute z_score_femore of Esame_strumentale. It is of type Real @realFormat.
     */
    public String getZ_score_femore() {
        return z_score_femore;
    }
    /**
     * The attribute z_score_femore of Esame_strumentale. It is of type Real @realFormat.
     */
    public void setZ_score_femore(String z_score_femore) {
        this.z_score_femore = z_score_femore;
    }

    /**
     * The associated object for the role paziente_.
     */
    public CliPazienteDTO getPaziente_() {
        return paziente_;
    }
    /**
     * The associated object for the role paziente_.
     */
    public void setPaziente_(CliPazienteDTO paziente_) {
        this.paziente_ = paziente_;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (IQR != null) {
            joiner.add("IQR: " + GraphQLRequestSerializer.getEntry(IQR));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (altro_esame != null) {
            joiner.add("altro_esame: " + GraphQLRequestSerializer.getEntry(altro_esame));
        }
        if (bmd_colonna != null) {
            joiner.add("bmd_colonna: " + GraphQLRequestSerializer.getEntry(bmd_colonna));
        }
        if (bmd_femore != null) {
            joiner.add("bmd_femore: " + GraphQLRequestSerializer.getEntry(bmd_femore));
        }
        if (cap_iqr != null) {
            joiner.add("cap_iqr: " + GraphQLRequestSerializer.getEntry(cap_iqr));
        }
        if (cap_mediano != null) {
            joiner.add("cap_mediano: " + GraphQLRequestSerializer.getEntry(cap_mediano));
        }
        if (classe_rischio_hpv != null) {
            joiner.add("classe_rischio_hpv: " + GraphQLRequestSerializer.getEntry(classe_rischio_hpv));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data != null) {
            joiner.add("data: " + GraphQLRequestSerializer.getEntry(data));
        }
        if (esame != null) {
            joiner.add("esame: " + GraphQLRequestSerializer.getEntry(esame));
        }
        if (esito != null) {
            joiner.add("esito: " + GraphQLRequestSerializer.getEntry(esito));
        }
        if (genotipi_hpv != null) {
            joiner.add("genotipi_hpv: " + GraphQLRequestSerializer.getEntry(genotipi_hpv));
        }
        if (i_paziente != null) {
            joiner.add("i_paziente: " + GraphQLRequestSerializer.getEntry(i_paziente));
        }
        if (metavir != null) {
            joiner.add("metavir: " + GraphQLRequestSerializer.getEntry(metavir));
        }
        if (patologico != null) {
            joiner.add("patologico: " + GraphQLRequestSerializer.getEntry(patologico));
        }
        if (paziente_ok != null) {
            joiner.add("paziente_ok: " + GraphQLRequestSerializer.getEntry(paziente_ok));
        }
        if (stifness != null) {
            joiner.add("stifness: " + GraphQLRequestSerializer.getEntry(stifness));
        }
        if (success_rate != null) {
            joiner.add("success_rate: " + GraphQLRequestSerializer.getEntry(success_rate));
        }
        if (t_score_colonna != null) {
            joiner.add("t_score_colonna: " + GraphQLRequestSerializer.getEntry(t_score_colonna));
        }
        if (t_score_femore != null) {
            joiner.add("t_score_femore: " + GraphQLRequestSerializer.getEntry(t_score_femore));
        }
        if (z_score_colonna != null) {
            joiner.add("z_score_colonna: " + GraphQLRequestSerializer.getEntry(z_score_colonna));
        }
        if (z_score_femore != null) {
            joiner.add("z_score_femore: " + GraphQLRequestSerializer.getEntry(z_score_femore));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliEsame_strumentaleDTO.Builder builder() {
        return new CliEsame_strumentaleDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String IQR;
        private String _id;
        private String altro_esame;
        private String bmd_colonna;
        private String bmd_femore;
        private Integer cap_iqr;
        private Integer cap_mediano;
        private String classe_rischio_hpv;
        private String codice_centro;
        private String data;
        private String esame;
        private String esito;
        private String genotipi_hpv;
        private Integer i_paziente;
        private String metavir;
        private Boolean patologico;
        private Integer paziente_ok;
        private String stifness;
        private String success_rate;
        private String t_score_colonna;
        private String t_score_femore;
        private String z_score_colonna;
        private String z_score_femore;
        private CliPazienteDTO paziente_;

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
         * The attribute IQR of Esame_strumentale. It is of type Real @realFormat.
         */
        public Builder setIQR(String IQR) {
            this.IQR = IQR;
            return this;
        }

        /**
         * The attribute _id of Esame_strumentale. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute altro_esame of Esame_strumentale. It is of type String. Max length: 255.
         */
        public Builder setAltro_esame(String altro_esame) {
            this.altro_esame = altro_esame;
            return this;
        }

        /**
         * The attribute bmd_colonna of Esame_strumentale. It is of type Real @realFormat.
         */
        public Builder setBmd_colonna(String bmd_colonna) {
            this.bmd_colonna = bmd_colonna;
            return this;
        }

        /**
         * The attribute bmd_femore of Esame_strumentale. It is of type Real @realFormat.
         */
        public Builder setBmd_femore(String bmd_femore) {
            this.bmd_femore = bmd_femore;
            return this;
        }

        /**
         * The attribute cap_iqr of Esame_strumentale. It is of type Int.
         */
        public Builder setCap_iqr(Integer cap_iqr) {
            this.cap_iqr = cap_iqr;
            return this;
        }

        /**
         * The attribute cap_mediano of Esame_strumentale. It is of type Int.
         */
        public Builder setCap_mediano(Integer cap_mediano) {
            this.cap_mediano = cap_mediano;
            return this;
        }

        /**
         * The attribute classe_rischio_hpv of Esame_strumentale. It is of type String. Domain: Ad alto rischio OR A rischio OR A basso Rischio OR A rischio molto basso.}Max length: 255.
         */
        public Builder setClasse_rischio_hpv(String classe_rischio_hpv) {
            this.classe_rischio_hpv = classe_rischio_hpv;
            return this;
        }

        /**
         * The attribute codice_centro of Esame_strumentale. It is of type String. Path: paziente_.centro_appartenenza_attuale codice_centro.
         */
        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        /**
         * The attribute data of Esame_strumentale. It is of type Date @dateFormat.
         */
        public Builder setData(String data) {
            this.data = data;
            return this;
        }

        /**
         * The attribute esame of Esame_strumentale. It is of type String. Domain: Fibroscan OR Biopsia OR TAC OR Altro esame (specificare) OR Eco addome OR RMN OR EGDS OR HPV-DNA OR MOC/DEXA.}Max length: 255.
         */
        public Builder setEsame(String esame) {
            this.esame = esame;
            return this;
        }

        /**
         * The attribute esito of Esame_strumentale. It is of type Text.
         */
        public Builder setEsito(String esito) {
            this.esito = esito;
            return this;
        }

        /**
         * The attribute genotipi_hpv of Esame_strumentale. It is of type String. Max length: 255.
         */
        public Builder setGenotipi_hpv(String genotipi_hpv) {
            this.genotipi_hpv = genotipi_hpv;
            return this;
        }

        /**
         * The attribute i_paziente of Esame_strumentale. It is of type Int. Path: paziente_ __id. Cannot be null.
         */
        public Builder setI_paziente(Integer i_paziente) {
            this.i_paziente = i_paziente;
            return this;
        }

        /**
         * The attribute metavir of Esame_strumentale. It is of type String. Domain: F0 OR F1 OR F2 OR F3 OR F4.}Max length: 255.
         */
        public Builder setMetavir(String metavir) {
            this.metavir = metavir;
            return this;
        }

        /**
         * The attribute patologico of Esame_strumentale. It is of type Boolean.
         */
        public Builder setPatologico(Boolean patologico) {
            this.patologico = patologico;
            return this;
        }

        /**
         * The attribute paziente_ok of Esame_strumentale. It is of type Int. Expression: 'firstNotNull(
i_paziente,
h_paziente
)'.Cannot be null.
         */
        public Builder setPaziente_ok(Integer paziente_ok) {
            this.paziente_ok = paziente_ok;
            return this;
        }

        /**
         * The attribute stifness of Esame_strumentale. It is of type Real @realFormat.
         */
        public Builder setStifness(String stifness) {
            this.stifness = stifness;
            return this;
        }

        /**
         * The attribute success_rate of Esame_strumentale. It is of type Real @realFormat. Ranges: 0.0:100.0.
         */
        public Builder setSuccess_rate(String success_rate) {
            this.success_rate = success_rate;
            return this;
        }

        /**
         * The attribute t_score_colonna of Esame_strumentale. It is of type Real @realFormat.
         */
        public Builder setT_score_colonna(String t_score_colonna) {
            this.t_score_colonna = t_score_colonna;
            return this;
        }

        /**
         * The attribute t_score_femore of Esame_strumentale. It is of type Real @realFormat.
         */
        public Builder setT_score_femore(String t_score_femore) {
            this.t_score_femore = t_score_femore;
            return this;
        }

        /**
         * The attribute z_score_colonna of Esame_strumentale. It is of type Real @realFormat.
         */
        public Builder setZ_score_colonna(String z_score_colonna) {
            this.z_score_colonna = z_score_colonna;
            return this;
        }

        /**
         * The attribute z_score_femore of Esame_strumentale. It is of type Real @realFormat.
         */
        public Builder setZ_score_femore(String z_score_femore) {
            this.z_score_femore = z_score_femore;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliEsame_strumentaleDTO build() {
            CliEsame_strumentaleDTO result = new CliEsame_strumentaleDTO();
            result.set_clientId(this._clientId);
            result.setIQR(this.IQR);
            result.set_id(this._id);
            result.setAltro_esame(this.altro_esame);
            result.setBmd_colonna(this.bmd_colonna);
            result.setBmd_femore(this.bmd_femore);
            result.setCap_iqr(this.cap_iqr);
            result.setCap_mediano(this.cap_mediano);
            result.setClasse_rischio_hpv(this.classe_rischio_hpv);
            result.setCodice_centro(this.codice_centro);
            result.setData(this.data);
            result.setEsame(this.esame);
            result.setEsito(this.esito);
            result.setGenotipi_hpv(this.genotipi_hpv);
            result.setI_paziente(this.i_paziente);
            result.setMetavir(this.metavir);
            result.setPatologico(this.patologico);
            result.setPaziente_ok(this.paziente_ok);
            result.setStifness(this.stifness);
            result.setSuccess_rate(this.success_rate);
            result.setT_score_colonna(this.t_score_colonna);
            result.setT_score_femore(this.t_score_femore);
            result.setZ_score_colonna(this.z_score_colonna);
            result.setZ_score_femore(this.z_score_femore);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
