package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Questionario_PRO_app, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliQuestionario_PRO_appDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean alert_obbligatoria1;
    private Boolean alert_obbligatoria2;
    private String codice_interno_i;
    private String codice_interno_p;
    private Boolean confermato;
    private String data_compilazione;
    private String domanda_obblig_ids;
    private String domanda_risp_ids;
    private Integer domande_totali;
    private Boolean filtro_classe;
    private Boolean i_filtro_classe;
    private Integer intervallo_compil_mesi;
    private Integer mesi_trascorsi;
    private Boolean p_filtro_classe;
    private Boolean parametri_personali;
    private String questionario;
    private Integer risposte_date;
    private Integer risposte_mancanti;
    private String studi_ids;
    private String studi_ids_b;
    private String studi_ids_i;
    private String studi_ids_p;
    private String studi_ids_r;
    private String studio_questionario;
    private CliQuestionarioDTO questionario_;
    private CliStudio_questionarioDTO studio_questionario_;
    private CliP_PazienteDTO p_Paziente_;
    private CliPazienteDTO paziente_;

    public CliQuestionario_PRO_appDTO() {
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
     * The attribute _id of Questionario_PRO_app. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Questionario_PRO_app. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute alert_obbligatoria1 of Questionario_PRO_app. It is of type Boolean. Path: OR - Logical ORrisposta_ alert_obbligatoria.
     */
    public Boolean getAlert_obbligatoria1() {
        return alert_obbligatoria1;
    }
    /**
     * The attribute alert_obbligatoria1 of Questionario_PRO_app. It is of type Boolean. Path: OR - Logical ORrisposta_ alert_obbligatoria.
     */
    public void setAlert_obbligatoria1(Boolean alert_obbligatoria1) {
        this.alert_obbligatoria1 = alert_obbligatoria1;
    }

    /**
     * The attribute alert_obbligatoria2 of Questionario_PRO_app. It is of type Boolean. Expression: 'differenceCS(domanda_obblig_ids, domanda_risp_ids)!=concat("")'.Cannot be null.
     */
    public Boolean getAlert_obbligatoria2() {
        return alert_obbligatoria2;
    }
    /**
     * The attribute alert_obbligatoria2 of Questionario_PRO_app. It is of type Boolean. Expression: 'differenceCS(domanda_obblig_ids, domanda_risp_ids)!=concat("")'.Cannot be null.
     */
    public void setAlert_obbligatoria2(Boolean alert_obbligatoria2) {
        this.alert_obbligatoria2 = alert_obbligatoria2;
    }

    /**
     * The attribute codice_interno_i of Questionario_PRO_app. It is of type String. Path: paziente_ codice_interno. Cannot be null.
     */
    public String getCodice_interno_i() {
        return codice_interno_i;
    }
    /**
     * The attribute codice_interno_i of Questionario_PRO_app. It is of type String. Path: paziente_ codice_interno. Cannot be null.
     */
    public void setCodice_interno_i(String codice_interno_i) {
        this.codice_interno_i = codice_interno_i;
    }

    /**
     * The attribute codice_interno_p of Questionario_PRO_app. It is of type String. Path: p_Paziente_ codice_interno. Cannot be null.
     */
    public String getCodice_interno_p() {
        return codice_interno_p;
    }
    /**
     * The attribute codice_interno_p of Questionario_PRO_app. It is of type String. Path: p_Paziente_ codice_interno. Cannot be null.
     */
    public void setCodice_interno_p(String codice_interno_p) {
        this.codice_interno_p = codice_interno_p;
    }

    /**
     * The attribute confermato of Questionario_PRO_app. It is of type Boolean.
     */
    public Boolean getConfermato() {
        return confermato;
    }
    /**
     * The attribute confermato of Questionario_PRO_app. It is of type Boolean.
     */
    public void setConfermato(Boolean confermato) {
        this.confermato = confermato;
    }

    /**
     * The attribute data_compilazione of Questionario_PRO_app. It is of type Date @dateFormat. Cannot be null.
     */
    public String getData_compilazione() {
        return data_compilazione;
    }
    /**
     * The attribute data_compilazione of Questionario_PRO_app. It is of type Date @dateFormat. Cannot be null.
     */
    public void setData_compilazione(String data_compilazione) {
        this.data_compilazione = data_compilazione;
    }

    /**
     * The attribute domanda_obblig_ids of Questionario_PRO_app. It is of type String. Path: CONCAT_CS - Concat (comma separated) [Domanda.obbligatoria]questionario_.domanda_ __id. Cannot be null.
     */
    public String getDomanda_obblig_ids() {
        return domanda_obblig_ids;
    }
    /**
     * The attribute domanda_obblig_ids of Questionario_PRO_app. It is of type String. Path: CONCAT_CS - Concat (comma separated) [Domanda.obbligatoria]questionario_.domanda_ __id. Cannot be null.
     */
    public void setDomanda_obblig_ids(String domanda_obblig_ids) {
        this.domanda_obblig_ids = domanda_obblig_ids;
    }

    /**
     * The attribute domanda_risp_ids of Questionario_PRO_app. It is of type String. Path: CONCAT_CS - Concat (comma separated)risposta_.domanda_ __id. Cannot be null.
     */
    public String getDomanda_risp_ids() {
        return domanda_risp_ids;
    }
    /**
     * The attribute domanda_risp_ids of Questionario_PRO_app. It is of type String. Path: CONCAT_CS - Concat (comma separated)risposta_.domanda_ __id. Cannot be null.
     */
    public void setDomanda_risp_ids(String domanda_risp_ids) {
        this.domanda_risp_ids = domanda_risp_ids;
    }

    /**
     * The attribute domande_totali of Questionario_PRO_app. It is of type Int. Path: questionario_ domande. Cannot be null.
     */
    public Integer getDomande_totali() {
        return domande_totali;
    }
    /**
     * The attribute domande_totali of Questionario_PRO_app. It is of type Int. Path: questionario_ domande. Cannot be null.
     */
    public void setDomande_totali(Integer domande_totali) {
        this.domande_totali = domande_totali;
    }

    /**
     * The attribute filtro_classe of Questionario_PRO_app. It is of type Boolean. Expression: 'firstNotNull(i_filtro_classe,p_filtro_classe)'.
     */
    public Boolean getFiltro_classe() {
        return filtro_classe;
    }
    /**
     * The attribute filtro_classe of Questionario_PRO_app. It is of type Boolean. Expression: 'firstNotNull(i_filtro_classe,p_filtro_classe)'.
     */
    public void setFiltro_classe(Boolean filtro_classe) {
        this.filtro_classe = filtro_classe;
    }

    /**
     * The attribute i_filtro_classe of Questionario_PRO_app. It is of type Boolean. Path: paziente_ filtro_classe.
     */
    public Boolean getI_filtro_classe() {
        return i_filtro_classe;
    }
    /**
     * The attribute i_filtro_classe of Questionario_PRO_app. It is of type Boolean. Path: paziente_ filtro_classe.
     */
    public void setI_filtro_classe(Boolean i_filtro_classe) {
        this.i_filtro_classe = i_filtro_classe;
    }

    /**
     * The attribute intervallo_compil_mesi of Questionario_PRO_app. It is of type Int. Path: questionario_ intervallo_compil_mesi.
     */
    public Integer getIntervallo_compil_mesi() {
        return intervallo_compil_mesi;
    }
    /**
     * The attribute intervallo_compil_mesi of Questionario_PRO_app. It is of type Int. Path: questionario_ intervallo_compil_mesi.
     */
    public void setIntervallo_compil_mesi(Integer intervallo_compil_mesi) {
        this.intervallo_compil_mesi = intervallo_compil_mesi;
    }

    /**
     * The attribute mesi_trascorsi of Questionario_PRO_app. It is of type Int. Expression: 'dateDiff(__System.date,data_compilazione,field.month)'.Cannot be null.
     */
    public Integer getMesi_trascorsi() {
        return mesi_trascorsi;
    }
    /**
     * The attribute mesi_trascorsi of Questionario_PRO_app. It is of type Int. Expression: 'dateDiff(__System.date,data_compilazione,field.month)'.Cannot be null.
     */
    public void setMesi_trascorsi(Integer mesi_trascorsi) {
        this.mesi_trascorsi = mesi_trascorsi;
    }

    /**
     * The attribute p_filtro_classe of Questionario_PRO_app. It is of type Boolean. Path: p_Paziente_ filtro_classe.
     */
    public Boolean getP_filtro_classe() {
        return p_filtro_classe;
    }
    /**
     * The attribute p_filtro_classe of Questionario_PRO_app. It is of type Boolean. Path: p_Paziente_ filtro_classe.
     */
    public void setP_filtro_classe(Boolean p_filtro_classe) {
        this.p_filtro_classe = p_filtro_classe;
    }

    /**
     * The attribute parametri_personali of Questionario_PRO_app. It is of type Boolean. Path: questionario_ parametri_personali.
     */
    public Boolean getParametri_personali() {
        return parametri_personali;
    }
    /**
     * The attribute parametri_personali of Questionario_PRO_app. It is of type Boolean. Path: questionario_ parametri_personali.
     */
    public void setParametri_personali(Boolean parametri_personali) {
        this.parametri_personali = parametri_personali;
    }

    /**
     * The attribute questionario of Questionario_PRO_app. It is of type String. Path: questionario_ nome. Cannot be null.
     */
    public String getQuestionario() {
        return questionario;
    }
    /**
     * The attribute questionario of Questionario_PRO_app. It is of type String. Path: questionario_ nome. Cannot be null.
     */
    public void setQuestionario(String questionario) {
        this.questionario = questionario;
    }

    /**
     * The attribute risposte_date of Questionario_PRO_app. It is of type Int. Path: COUNT_ALL - Count all [Risposta.risposta!="" && !isNull(Risposta.risposta)]risposta_ risposta.
     */
    public Integer getRisposte_date() {
        return risposte_date;
    }
    /**
     * The attribute risposte_date of Questionario_PRO_app. It is of type Int. Path: COUNT_ALL - Count all [Risposta.risposta!="" && !isNull(Risposta.risposta)]risposta_ risposta.
     */
    public void setRisposte_date(Integer risposte_date) {
        this.risposte_date = risposte_date;
    }

    /**
     * The attribute risposte_mancanti of Questionario_PRO_app. It is of type Int. Expression: 'zeroIfNull(domande_totali)-zeroIfNull(risposte_date)'.
     */
    public Integer getRisposte_mancanti() {
        return risposte_mancanti;
    }
    /**
     * The attribute risposte_mancanti of Questionario_PRO_app. It is of type Int. Expression: 'zeroIfNull(domande_totali)-zeroIfNull(risposte_date)'.
     */
    public void setRisposte_mancanti(Integer risposte_mancanti) {
        this.risposte_mancanti = risposte_mancanti;
    }

    /**
     * The attribute studi_ids of Questionario_PRO_app. It is of type String. Expression: 'firstNotNull(studi_ids_b,studi_ids_i,studi_ids_p,studi_ids_r)'.Cannot be null.
     */
    public String getStudi_ids() {
        return studi_ids;
    }
    /**
     * The attribute studi_ids of Questionario_PRO_app. It is of type String. Expression: 'firstNotNull(studi_ids_b,studi_ids_i,studi_ids_p,studi_ids_r)'.Cannot be null.
     */
    public void setStudi_ids(String studi_ids) {
        this.studi_ids = studi_ids;
    }

    /**
     * The attribute studi_ids_b of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)b_Paziente_.studio_questionario_ __id. Cannot be null.
     */
    public String getStudi_ids_b() {
        return studi_ids_b;
    }
    /**
     * The attribute studi_ids_b of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)b_Paziente_.studio_questionario_ __id. Cannot be null.
     */
    public void setStudi_ids_b(String studi_ids_b) {
        this.studi_ids_b = studi_ids_b;
    }

    /**
     * The attribute studi_ids_i of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)paziente_.studio_questionario_ __id. Cannot be null.
     */
    public String getStudi_ids_i() {
        return studi_ids_i;
    }
    /**
     * The attribute studi_ids_i of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)paziente_.studio_questionario_ __id. Cannot be null.
     */
    public void setStudi_ids_i(String studi_ids_i) {
        this.studi_ids_i = studi_ids_i;
    }

    /**
     * The attribute studi_ids_p of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)p_Paziente_.studio_questionario_ __id. Cannot be null.
     */
    public String getStudi_ids_p() {
        return studi_ids_p;
    }
    /**
     * The attribute studi_ids_p of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)p_Paziente_.studio_questionario_ __id. Cannot be null.
     */
    public void setStudi_ids_p(String studi_ids_p) {
        this.studi_ids_p = studi_ids_p;
    }

    /**
     * The attribute studi_ids_r of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)r_Paziente_.studio_questionario_ __id. Cannot be null.
     */
    public String getStudi_ids_r() {
        return studi_ids_r;
    }
    /**
     * The attribute studi_ids_r of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)r_Paziente_.studio_questionario_ __id. Cannot be null.
     */
    public void setStudi_ids_r(String studi_ids_r) {
        this.studi_ids_r = studi_ids_r;
    }

    /**
     * The attribute studio_questionario of Questionario_PRO_app. It is of type String. Path: studio_questionario_ nome. Cannot be null.
     */
    public String getStudio_questionario() {
        return studio_questionario;
    }
    /**
     * The attribute studio_questionario of Questionario_PRO_app. It is of type String. Path: studio_questionario_ nome. Cannot be null.
     */
    public void setStudio_questionario(String studio_questionario) {
        this.studio_questionario = studio_questionario;
    }

    /**
     * The associated object for the role questionario_.
     */
    public CliQuestionarioDTO getQuestionario_() {
        return questionario_;
    }
    /**
     * The associated object for the role questionario_.
     */
    public void setQuestionario_(CliQuestionarioDTO questionario_) {
        this.questionario_ = questionario_;
    }

    /**
     * The associated object for the role studio_questionario_.
     */
    public CliStudio_questionarioDTO getStudio_questionario_() {
        return studio_questionario_;
    }
    /**
     * The associated object for the role studio_questionario_.
     */
    public void setStudio_questionario_(CliStudio_questionarioDTO studio_questionario_) {
        this.studio_questionario_ = studio_questionario_;
    }

    /**
     * The associated object for the role p_Paziente_.
     */
    public CliP_PazienteDTO getP_Paziente_() {
        return p_Paziente_;
    }
    /**
     * The associated object for the role p_Paziente_.
     */
    public void setP_Paziente_(CliP_PazienteDTO p_Paziente_) {
        this.p_Paziente_ = p_Paziente_;
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
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (alert_obbligatoria1 != null) {
            joiner.add("alert_obbligatoria1: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria1));
        }
        if (alert_obbligatoria2 != null) {
            joiner.add("alert_obbligatoria2: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria2));
        }
        if (codice_interno_i != null) {
            joiner.add("codice_interno_i: " + GraphQLRequestSerializer.getEntry(codice_interno_i));
        }
        if (codice_interno_p != null) {
            joiner.add("codice_interno_p: " + GraphQLRequestSerializer.getEntry(codice_interno_p));
        }
        if (confermato != null) {
            joiner.add("confermato: " + GraphQLRequestSerializer.getEntry(confermato));
        }
        if (data_compilazione != null) {
            joiner.add("data_compilazione: " + GraphQLRequestSerializer.getEntry(data_compilazione));
        }
        if (domanda_obblig_ids != null) {
            joiner.add("domanda_obblig_ids: " + GraphQLRequestSerializer.getEntry(domanda_obblig_ids));
        }
        if (domanda_risp_ids != null) {
            joiner.add("domanda_risp_ids: " + GraphQLRequestSerializer.getEntry(domanda_risp_ids));
        }
        if (domande_totali != null) {
            joiner.add("domande_totali: " + GraphQLRequestSerializer.getEntry(domande_totali));
        }
        if (filtro_classe != null) {
            joiner.add("filtro_classe: " + GraphQLRequestSerializer.getEntry(filtro_classe));
        }
        if (i_filtro_classe != null) {
            joiner.add("i_filtro_classe: " + GraphQLRequestSerializer.getEntry(i_filtro_classe));
        }
        if (intervallo_compil_mesi != null) {
            joiner.add("intervallo_compil_mesi: " + GraphQLRequestSerializer.getEntry(intervallo_compil_mesi));
        }
        if (mesi_trascorsi != null) {
            joiner.add("mesi_trascorsi: " + GraphQLRequestSerializer.getEntry(mesi_trascorsi));
        }
        if (p_filtro_classe != null) {
            joiner.add("p_filtro_classe: " + GraphQLRequestSerializer.getEntry(p_filtro_classe));
        }
        if (parametri_personali != null) {
            joiner.add("parametri_personali: " + GraphQLRequestSerializer.getEntry(parametri_personali));
        }
        if (questionario != null) {
            joiner.add("questionario: " + GraphQLRequestSerializer.getEntry(questionario));
        }
        if (risposte_date != null) {
            joiner.add("risposte_date: " + GraphQLRequestSerializer.getEntry(risposte_date));
        }
        if (risposte_mancanti != null) {
            joiner.add("risposte_mancanti: " + GraphQLRequestSerializer.getEntry(risposte_mancanti));
        }
        if (studi_ids != null) {
            joiner.add("studi_ids: " + GraphQLRequestSerializer.getEntry(studi_ids));
        }
        if (studi_ids_b != null) {
            joiner.add("studi_ids_b: " + GraphQLRequestSerializer.getEntry(studi_ids_b));
        }
        if (studi_ids_i != null) {
            joiner.add("studi_ids_i: " + GraphQLRequestSerializer.getEntry(studi_ids_i));
        }
        if (studi_ids_p != null) {
            joiner.add("studi_ids_p: " + GraphQLRequestSerializer.getEntry(studi_ids_p));
        }
        if (studi_ids_r != null) {
            joiner.add("studi_ids_r: " + GraphQLRequestSerializer.getEntry(studi_ids_r));
        }
        if (studio_questionario != null) {
            joiner.add("studio_questionario: " + GraphQLRequestSerializer.getEntry(studio_questionario));
        }
        if (questionario_ != null) {
            joiner.add("questionario_: " + GraphQLRequestSerializer.getEntry(questionario_));
        }
        if (studio_questionario_ != null) {
            joiner.add("studio_questionario_: " + GraphQLRequestSerializer.getEntry(studio_questionario_));
        }
        if (p_Paziente_ != null) {
            joiner.add("p_Paziente_: " + GraphQLRequestSerializer.getEntry(p_Paziente_));
        }
        if (paziente_ != null) {
            joiner.add("paziente_: " + GraphQLRequestSerializer.getEntry(paziente_));
        }
        return joiner.toString();
    }

    public static CliQuestionario_PRO_appDTO.Builder builder() {
        return new CliQuestionario_PRO_appDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean alert_obbligatoria1;
        private Boolean alert_obbligatoria2;
        private String codice_interno_i;
        private String codice_interno_p;
        private Boolean confermato;
        private String data_compilazione;
        private String domanda_obblig_ids;
        private String domanda_risp_ids;
        private Integer domande_totali;
        private Boolean filtro_classe;
        private Boolean i_filtro_classe;
        private Integer intervallo_compil_mesi;
        private Integer mesi_trascorsi;
        private Boolean p_filtro_classe;
        private Boolean parametri_personali;
        private String questionario;
        private Integer risposte_date;
        private Integer risposte_mancanti;
        private String studi_ids;
        private String studi_ids_b;
        private String studi_ids_i;
        private String studi_ids_p;
        private String studi_ids_r;
        private String studio_questionario;
        private CliQuestionarioDTO questionario_;
        private CliStudio_questionarioDTO studio_questionario_;
        private CliP_PazienteDTO p_Paziente_;
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
         * The attribute _id of Questionario_PRO_app. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute alert_obbligatoria1 of Questionario_PRO_app. It is of type Boolean. Path: OR - Logical ORrisposta_ alert_obbligatoria.
         */
        public Builder setAlert_obbligatoria1(Boolean alert_obbligatoria1) {
            this.alert_obbligatoria1 = alert_obbligatoria1;
            return this;
        }

        /**
         * The attribute alert_obbligatoria2 of Questionario_PRO_app. It is of type Boolean. Expression: 'differenceCS(domanda_obblig_ids, domanda_risp_ids)!=concat("")'.Cannot be null.
         */
        public Builder setAlert_obbligatoria2(Boolean alert_obbligatoria2) {
            this.alert_obbligatoria2 = alert_obbligatoria2;
            return this;
        }

        /**
         * The attribute codice_interno_i of Questionario_PRO_app. It is of type String. Path: paziente_ codice_interno. Cannot be null.
         */
        public Builder setCodice_interno_i(String codice_interno_i) {
            this.codice_interno_i = codice_interno_i;
            return this;
        }

        /**
         * The attribute codice_interno_p of Questionario_PRO_app. It is of type String. Path: p_Paziente_ codice_interno. Cannot be null.
         */
        public Builder setCodice_interno_p(String codice_interno_p) {
            this.codice_interno_p = codice_interno_p;
            return this;
        }

        /**
         * The attribute confermato of Questionario_PRO_app. It is of type Boolean.
         */
        public Builder setConfermato(Boolean confermato) {
            this.confermato = confermato;
            return this;
        }

        /**
         * The attribute data_compilazione of Questionario_PRO_app. It is of type Date @dateFormat. Cannot be null.
         */
        public Builder setData_compilazione(String data_compilazione) {
            this.data_compilazione = data_compilazione;
            return this;
        }

        /**
         * The attribute domanda_obblig_ids of Questionario_PRO_app. It is of type String. Path: CONCAT_CS - Concat (comma separated) [Domanda.obbligatoria]questionario_.domanda_ __id. Cannot be null.
         */
        public Builder setDomanda_obblig_ids(String domanda_obblig_ids) {
            this.domanda_obblig_ids = domanda_obblig_ids;
            return this;
        }

        /**
         * The attribute domanda_risp_ids of Questionario_PRO_app. It is of type String. Path: CONCAT_CS - Concat (comma separated)risposta_.domanda_ __id. Cannot be null.
         */
        public Builder setDomanda_risp_ids(String domanda_risp_ids) {
            this.domanda_risp_ids = domanda_risp_ids;
            return this;
        }

        /**
         * The attribute domande_totali of Questionario_PRO_app. It is of type Int. Path: questionario_ domande. Cannot be null.
         */
        public Builder setDomande_totali(Integer domande_totali) {
            this.domande_totali = domande_totali;
            return this;
        }

        /**
         * The attribute filtro_classe of Questionario_PRO_app. It is of type Boolean. Expression: 'firstNotNull(i_filtro_classe,p_filtro_classe)'.
         */
        public Builder setFiltro_classe(Boolean filtro_classe) {
            this.filtro_classe = filtro_classe;
            return this;
        }

        /**
         * The attribute i_filtro_classe of Questionario_PRO_app. It is of type Boolean. Path: paziente_ filtro_classe.
         */
        public Builder setI_filtro_classe(Boolean i_filtro_classe) {
            this.i_filtro_classe = i_filtro_classe;
            return this;
        }

        /**
         * The attribute intervallo_compil_mesi of Questionario_PRO_app. It is of type Int. Path: questionario_ intervallo_compil_mesi.
         */
        public Builder setIntervallo_compil_mesi(Integer intervallo_compil_mesi) {
            this.intervallo_compil_mesi = intervallo_compil_mesi;
            return this;
        }

        /**
         * The attribute mesi_trascorsi of Questionario_PRO_app. It is of type Int. Expression: 'dateDiff(__System.date,data_compilazione,field.month)'.Cannot be null.
         */
        public Builder setMesi_trascorsi(Integer mesi_trascorsi) {
            this.mesi_trascorsi = mesi_trascorsi;
            return this;
        }

        /**
         * The attribute p_filtro_classe of Questionario_PRO_app. It is of type Boolean. Path: p_Paziente_ filtro_classe.
         */
        public Builder setP_filtro_classe(Boolean p_filtro_classe) {
            this.p_filtro_classe = p_filtro_classe;
            return this;
        }

        /**
         * The attribute parametri_personali of Questionario_PRO_app. It is of type Boolean. Path: questionario_ parametri_personali.
         */
        public Builder setParametri_personali(Boolean parametri_personali) {
            this.parametri_personali = parametri_personali;
            return this;
        }

        /**
         * The attribute questionario of Questionario_PRO_app. It is of type String. Path: questionario_ nome. Cannot be null.
         */
        public Builder setQuestionario(String questionario) {
            this.questionario = questionario;
            return this;
        }

        /**
         * The attribute risposte_date of Questionario_PRO_app. It is of type Int. Path: COUNT_ALL - Count all [Risposta.risposta!="" && !isNull(Risposta.risposta)]risposta_ risposta.
         */
        public Builder setRisposte_date(Integer risposte_date) {
            this.risposte_date = risposte_date;
            return this;
        }

        /**
         * The attribute risposte_mancanti of Questionario_PRO_app. It is of type Int. Expression: 'zeroIfNull(domande_totali)-zeroIfNull(risposte_date)'.
         */
        public Builder setRisposte_mancanti(Integer risposte_mancanti) {
            this.risposte_mancanti = risposte_mancanti;
            return this;
        }

        /**
         * The attribute studi_ids of Questionario_PRO_app. It is of type String. Expression: 'firstNotNull(studi_ids_b,studi_ids_i,studi_ids_p,studi_ids_r)'.Cannot be null.
         */
        public Builder setStudi_ids(String studi_ids) {
            this.studi_ids = studi_ids;
            return this;
        }

        /**
         * The attribute studi_ids_b of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)b_Paziente_.studio_questionario_ __id. Cannot be null.
         */
        public Builder setStudi_ids_b(String studi_ids_b) {
            this.studi_ids_b = studi_ids_b;
            return this;
        }

        /**
         * The attribute studi_ids_i of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)paziente_.studio_questionario_ __id. Cannot be null.
         */
        public Builder setStudi_ids_i(String studi_ids_i) {
            this.studi_ids_i = studi_ids_i;
            return this;
        }

        /**
         * The attribute studi_ids_p of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)p_Paziente_.studio_questionario_ __id. Cannot be null.
         */
        public Builder setStudi_ids_p(String studi_ids_p) {
            this.studi_ids_p = studi_ids_p;
            return this;
        }

        /**
         * The attribute studi_ids_r of Questionario_PRO_app. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)r_Paziente_.studio_questionario_ __id. Cannot be null.
         */
        public Builder setStudi_ids_r(String studi_ids_r) {
            this.studi_ids_r = studi_ids_r;
            return this;
        }

        /**
         * The attribute studio_questionario of Questionario_PRO_app. It is of type String. Path: studio_questionario_ nome. Cannot be null.
         */
        public Builder setStudio_questionario(String studio_questionario) {
            this.studio_questionario = studio_questionario;
            return this;
        }

        /**
         * The associated object for the role questionario_.
         */
        public Builder setQuestionario_(CliQuestionarioDTO questionario_) {
            this.questionario_ = questionario_;
            return this;
        }

        /**
         * The associated object for the role studio_questionario_.
         */
        public Builder setStudio_questionario_(CliStudio_questionarioDTO studio_questionario_) {
            this.studio_questionario_ = studio_questionario_;
            return this;
        }

        /**
         * The associated object for the role p_Paziente_.
         */
        public Builder setP_Paziente_(CliP_PazienteDTO p_Paziente_) {
            this.p_Paziente_ = p_Paziente_;
            return this;
        }

        /**
         * The associated object for the role paziente_.
         */
        public Builder setPaziente_(CliPazienteDTO paziente_) {
            this.paziente_ = paziente_;
            return this;
        }


        public CliQuestionario_PRO_appDTO build() {
            CliQuestionario_PRO_appDTO result = new CliQuestionario_PRO_appDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAlert_obbligatoria1(this.alert_obbligatoria1);
            result.setAlert_obbligatoria2(this.alert_obbligatoria2);
            result.setCodice_interno_i(this.codice_interno_i);
            result.setCodice_interno_p(this.codice_interno_p);
            result.setConfermato(this.confermato);
            result.setData_compilazione(this.data_compilazione);
            result.setDomanda_obblig_ids(this.domanda_obblig_ids);
            result.setDomanda_risp_ids(this.domanda_risp_ids);
            result.setDomande_totali(this.domande_totali);
            result.setFiltro_classe(this.filtro_classe);
            result.setI_filtro_classe(this.i_filtro_classe);
            result.setIntervallo_compil_mesi(this.intervallo_compil_mesi);
            result.setMesi_trascorsi(this.mesi_trascorsi);
            result.setP_filtro_classe(this.p_filtro_classe);
            result.setParametri_personali(this.parametri_personali);
            result.setQuestionario(this.questionario);
            result.setRisposte_date(this.risposte_date);
            result.setRisposte_mancanti(this.risposte_mancanti);
            result.setStudi_ids(this.studi_ids);
            result.setStudi_ids_b(this.studi_ids_b);
            result.setStudi_ids_i(this.studi_ids_i);
            result.setStudi_ids_p(this.studi_ids_p);
            result.setStudi_ids_r(this.studi_ids_r);
            result.setStudio_questionario(this.studio_questionario);
            result.setQuestionario_(this.questionario_);
            result.setStudio_questionario_(this.studio_questionario_);
            result.setP_Paziente_(this.p_Paziente_);
            result.setPaziente_(this.paziente_);
            return result;
        }

    }
}
