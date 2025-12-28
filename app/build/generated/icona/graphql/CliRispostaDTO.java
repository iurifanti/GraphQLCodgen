package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class Risposta, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliRispostaDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private Boolean alert_obbligatoria;
    private String codice_interno_i;
    private Boolean decimale;
    private String domanda;
    private Integer domanda_id;
    private String domande_questionario_ids;
    private Integer id_risposta_peso;
    private Boolean intero;
    private Boolean obbligatoria;
    private Boolean opzioni_multipla;
    private Boolean opzioni_singola;
    private Integer ordine;
    private Integer ordine_risposta;
    private String peso_punteggio;
    private String punteggio_risposta;
    private String punteggio_totale;
    private Integer questionario_id;
    private Integer questionario_pro_app_id;
    private String risposta;
    private String risposta_dec;
    private Integer risposta_int;
    private String risposta_multipla;
    private String risposta_str;
    private Boolean scala_intera;
    private Boolean solo_intro;
    private Boolean stringa;
    private Integer studio_questionario_id;
    private CliDomandaDTO domanda_;
    private CliQuestionario_PRO_appDTO questionario_PRO_app_;

    public CliRispostaDTO() {
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
     * The attribute _id of Risposta. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of Risposta. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute alert_obbligatoria of Risposta. It is of type Boolean. Expression: 'obbligatoria && risposta=concat("")'.
     */
    public Boolean getAlert_obbligatoria() {
        return alert_obbligatoria;
    }
    /**
     * The attribute alert_obbligatoria of Risposta. It is of type Boolean. Expression: 'obbligatoria && risposta=concat("")'.
     */
    public void setAlert_obbligatoria(Boolean alert_obbligatoria) {
        this.alert_obbligatoria = alert_obbligatoria;
    }

    /**
     * The attribute codice_interno_i of Risposta. It is of type String. Path: questionario_PRO_app_ codice_interno_i. Cannot be null.
     */
    public String getCodice_interno_i() {
        return codice_interno_i;
    }
    /**
     * The attribute codice_interno_i of Risposta. It is of type String. Path: questionario_PRO_app_ codice_interno_i. Cannot be null.
     */
    public void setCodice_interno_i(String codice_interno_i) {
        this.codice_interno_i = codice_interno_i;
    }

    /**
     * The attribute decimale of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ decimale.
     */
    public Boolean getDecimale() {
        return decimale;
    }
    /**
     * The attribute decimale of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ decimale.
     */
    public void setDecimale(Boolean decimale) {
        this.decimale = decimale;
    }

    /**
     * The attribute domanda of Risposta. It is of type String. Path: domanda_ descrizione.
     */
    public String getDomanda() {
        return domanda;
    }
    /**
     * The attribute domanda of Risposta. It is of type String. Path: domanda_ descrizione.
     */
    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    /**
     * The attribute domanda_id of Risposta. It is of type Int. Path: domanda_ __id. Cannot be null.
     */
    public Integer getDomanda_id() {
        return domanda_id;
    }
    /**
     * The attribute domanda_id of Risposta. It is of type Int. Path: domanda_ __id. Cannot be null.
     */
    public void setDomanda_id(Integer domanda_id) {
        this.domanda_id = domanda_id;
    }

    /**
     * The attribute domande_questionario_ids of Risposta. It is of type String. Path: CONCAT_CS - Concat (comma separated)questionario_PRO_app_.questionario_.domanda_ __id. Cannot be null.
     */
    public String getDomande_questionario_ids() {
        return domande_questionario_ids;
    }
    /**
     * The attribute domande_questionario_ids of Risposta. It is of type String. Path: CONCAT_CS - Concat (comma separated)questionario_PRO_app_.questionario_.domanda_ __id. Cannot be null.
     */
    public void setDomande_questionario_ids(String domande_questionario_ids) {
        this.domande_questionario_ids = domande_questionario_ids;
    }

    /**
     * The attribute id_risposta_peso of Risposta. It is of type Int. Path: COUNT_DISTINCT - Count distinct [Risposta.questionario_pro_app_id= Risposta.domanda_.peso_domanda.risposta_.questionario_pro_app_id]domanda_.peso_domanda.risposta_ __id. Cannot be null.
     */
    public Integer getId_risposta_peso() {
        return id_risposta_peso;
    }
    /**
     * The attribute id_risposta_peso of Risposta. It is of type Int. Path: COUNT_DISTINCT - Count distinct [Risposta.questionario_pro_app_id= Risposta.domanda_.peso_domanda.risposta_.questionario_pro_app_id]domanda_.peso_domanda.risposta_ __id. Cannot be null.
     */
    public void setId_risposta_peso(Integer id_risposta_peso) {
        this.id_risposta_peso = id_risposta_peso;
    }

    /**
     * The attribute intero of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ intero.
     */
    public Boolean getIntero() {
        return intero;
    }
    /**
     * The attribute intero of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ intero.
     */
    public void setIntero(Boolean intero) {
        this.intero = intero;
    }

    /**
     * The attribute obbligatoria of Risposta. It is of type Boolean. Path: domanda_ obbligatoria. Cannot be null.
     */
    public Boolean getObbligatoria() {
        return obbligatoria;
    }
    /**
     * The attribute obbligatoria of Risposta. It is of type Boolean. Path: domanda_ obbligatoria. Cannot be null.
     */
    public void setObbligatoria(Boolean obbligatoria) {
        this.obbligatoria = obbligatoria;
    }

    /**
     * The attribute opzioni_multipla of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scelta_multipla.
     */
    public Boolean getOpzioni_multipla() {
        return opzioni_multipla;
    }
    /**
     * The attribute opzioni_multipla of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scelta_multipla.
     */
    public void setOpzioni_multipla(Boolean opzioni_multipla) {
        this.opzioni_multipla = opzioni_multipla;
    }

    /**
     * The attribute opzioni_singola of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scelta_singola.
     */
    public Boolean getOpzioni_singola() {
        return opzioni_singola;
    }
    /**
     * The attribute opzioni_singola of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scelta_singola.
     */
    public void setOpzioni_singola(Boolean opzioni_singola) {
        this.opzioni_singola = opzioni_singola;
    }

    /**
     * The attribute ordine of Risposta. It is of type Int. Path: domanda_ ordine.
     */
    public Integer getOrdine() {
        return ordine;
    }
    /**
     * The attribute ordine of Risposta. It is of type Int. Path: domanda_ ordine.
     */
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }

    /**
     * The attribute ordine_risposta of Risposta. It is of type Int. Path: MIN - Minrisposta_possibile_multipla ordine.
     */
    public Integer getOrdine_risposta() {
        return ordine_risposta;
    }
    /**
     * The attribute ordine_risposta of Risposta. It is of type Int. Path: MIN - Minrisposta_possibile_multipla ordine.
     */
    public void setOrdine_risposta(Integer ordine_risposta) {
        this.ordine_risposta = ordine_risposta;
    }

    /**
     * The attribute peso_punteggio of Risposta. It is of type Real @realFormat. Path: SUM - Sum [Risposta.questionario_pro_app_id= Risposta.domanda_.peso_domanda.risposta_.questionario_pro_app_id]domanda_.peso_domanda.risposta_ punteggio_risposta.
     */
    public String getPeso_punteggio() {
        return peso_punteggio;
    }
    /**
     * The attribute peso_punteggio of Risposta. It is of type Real @realFormat. Path: SUM - Sum [Risposta.questionario_pro_app_id= Risposta.domanda_.peso_domanda.risposta_.questionario_pro_app_id]domanda_.peso_domanda.risposta_ punteggio_risposta.
     */
    public void setPeso_punteggio(String peso_punteggio) {
        this.peso_punteggio = peso_punteggio;
    }

    /**
     * The attribute punteggio_risposta of Risposta. It is of type Real @realFormat. Path: SUM - Sumrisposta_possibile_multipla punteggio.
     */
    public String getPunteggio_risposta() {
        return punteggio_risposta;
    }
    /**
     * The attribute punteggio_risposta of Risposta. It is of type Real @realFormat. Path: SUM - Sumrisposta_possibile_multipla punteggio.
     */
    public void setPunteggio_risposta(String punteggio_risposta) {
        this.punteggio_risposta = punteggio_risposta;
    }

    /**
     * The attribute punteggio_totale of Risposta. It is of type Real @realFormat. Expression: 'punteggio_risposta*if(isNull(id_risposta_peso),1,peso_punteggio)'.
     */
    public String getPunteggio_totale() {
        return punteggio_totale;
    }
    /**
     * The attribute punteggio_totale of Risposta. It is of type Real @realFormat. Expression: 'punteggio_risposta*if(isNull(id_risposta_peso),1,peso_punteggio)'.
     */
    public void setPunteggio_totale(String punteggio_totale) {
        this.punteggio_totale = punteggio_totale;
    }

    /**
     * The attribute questionario_id of Risposta. It is of type Int. Path: questionario_PRO_app_.questionario_ __id. Cannot be null.
     */
    public Integer getQuestionario_id() {
        return questionario_id;
    }
    /**
     * The attribute questionario_id of Risposta. It is of type Int. Path: questionario_PRO_app_.questionario_ __id. Cannot be null.
     */
    public void setQuestionario_id(Integer questionario_id) {
        this.questionario_id = questionario_id;
    }

    /**
     * The attribute questionario_pro_app_id of Risposta. It is of type Int. Path: questionario_PRO_app_ __id. Cannot be null.
     */
    public Integer getQuestionario_pro_app_id() {
        return questionario_pro_app_id;
    }
    /**
     * The attribute questionario_pro_app_id of Risposta. It is of type Int. Path: questionario_PRO_app_ __id. Cannot be null.
     */
    public void setQuestionario_pro_app_id(Integer questionario_pro_app_id) {
        this.questionario_pro_app_id = questionario_pro_app_id;
    }

    /**
     * The attribute risposta of Risposta. It is of type String. Expression: 'concat(
	ifNull(concat(risposta_int),""),
	ifNull(concat(risposta_dec),""),
	ifNull(risposta_str,""),
	ifNull(risposta_multipla,"")
)'.
     */
    public String getRisposta() {
        return risposta;
    }
    /**
     * The attribute risposta of Risposta. It is of type String. Expression: 'concat(
	ifNull(concat(risposta_int),""),
	ifNull(concat(risposta_dec),""),
	ifNull(risposta_str,""),
	ifNull(risposta_multipla,"")
)'.
     */
    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }

    /**
     * The attribute risposta_dec of Risposta. It is of type Real @realFormat.
     */
    public String getRisposta_dec() {
        return risposta_dec;
    }
    /**
     * The attribute risposta_dec of Risposta. It is of type Real @realFormat.
     */
    public void setRisposta_dec(String risposta_dec) {
        this.risposta_dec = risposta_dec;
    }

    /**
     * The attribute risposta_int of Risposta. It is of type Int.
     */
    public Integer getRisposta_int() {
        return risposta_int;
    }
    /**
     * The attribute risposta_int of Risposta. It is of type Int.
     */
    public void setRisposta_int(Integer risposta_int) {
        this.risposta_int = risposta_int;
    }

    /**
     * The attribute risposta_multipla of Risposta. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)risposta_possibile_multipla testo.
     */
    public String getRisposta_multipla() {
        return risposta_multipla;
    }
    /**
     * The attribute risposta_multipla of Risposta. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)risposta_possibile_multipla testo.
     */
    public void setRisposta_multipla(String risposta_multipla) {
        this.risposta_multipla = risposta_multipla;
    }

    /**
     * The attribute risposta_str of Risposta. It is of type Text.
     */
    public String getRisposta_str() {
        return risposta_str;
    }
    /**
     * The attribute risposta_str of Risposta. It is of type Text.
     */
    public void setRisposta_str(String risposta_str) {
        this.risposta_str = risposta_str;
    }

    /**
     * The attribute scala_intera of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scala_intera.
     */
    public Boolean getScala_intera() {
        return scala_intera;
    }
    /**
     * The attribute scala_intera of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scala_intera.
     */
    public void setScala_intera(Boolean scala_intera) {
        this.scala_intera = scala_intera;
    }

    /**
     * The attribute solo_intro of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ solo_intro.
     */
    public Boolean getSolo_intro() {
        return solo_intro;
    }
    /**
     * The attribute solo_intro of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ solo_intro.
     */
    public void setSolo_intro(Boolean solo_intro) {
        this.solo_intro = solo_intro;
    }

    /**
     * The attribute stringa of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ stringa.
     */
    public Boolean getStringa() {
        return stringa;
    }
    /**
     * The attribute stringa of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ stringa.
     */
    public void setStringa(Boolean stringa) {
        this.stringa = stringa;
    }

    /**
     * The attribute studio_questionario_id of Risposta. It is of type Int. Path: questionario_PRO_app_.studio_questionario_ __id. Cannot be null.
     */
    public Integer getStudio_questionario_id() {
        return studio_questionario_id;
    }
    /**
     * The attribute studio_questionario_id of Risposta. It is of type Int. Path: questionario_PRO_app_.studio_questionario_ __id. Cannot be null.
     */
    public void setStudio_questionario_id(Integer studio_questionario_id) {
        this.studio_questionario_id = studio_questionario_id;
    }

    /**
     * The associated object for the role domanda_.
     */
    public CliDomandaDTO getDomanda_() {
        return domanda_;
    }
    /**
     * The associated object for the role domanda_.
     */
    public void setDomanda_(CliDomandaDTO domanda_) {
        this.domanda_ = domanda_;
    }

    /**
     * The associated object for the role questionario_PRO_app_.
     */
    public CliQuestionario_PRO_appDTO getQuestionario_PRO_app_() {
        return questionario_PRO_app_;
    }
    /**
     * The associated object for the role questionario_PRO_app_.
     */
    public void setQuestionario_PRO_app_(CliQuestionario_PRO_appDTO questionario_PRO_app_) {
        this.questionario_PRO_app_ = questionario_PRO_app_;
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
        if (alert_obbligatoria != null) {
            joiner.add("alert_obbligatoria: " + GraphQLRequestSerializer.getEntry(alert_obbligatoria));
        }
        if (codice_interno_i != null) {
            joiner.add("codice_interno_i: " + GraphQLRequestSerializer.getEntry(codice_interno_i));
        }
        if (decimale != null) {
            joiner.add("decimale: " + GraphQLRequestSerializer.getEntry(decimale));
        }
        if (domanda != null) {
            joiner.add("domanda: " + GraphQLRequestSerializer.getEntry(domanda));
        }
        if (domanda_id != null) {
            joiner.add("domanda_id: " + GraphQLRequestSerializer.getEntry(domanda_id));
        }
        if (domande_questionario_ids != null) {
            joiner.add("domande_questionario_ids: " + GraphQLRequestSerializer.getEntry(domande_questionario_ids));
        }
        if (id_risposta_peso != null) {
            joiner.add("id_risposta_peso: " + GraphQLRequestSerializer.getEntry(id_risposta_peso));
        }
        if (intero != null) {
            joiner.add("intero: " + GraphQLRequestSerializer.getEntry(intero));
        }
        if (obbligatoria != null) {
            joiner.add("obbligatoria: " + GraphQLRequestSerializer.getEntry(obbligatoria));
        }
        if (opzioni_multipla != null) {
            joiner.add("opzioni_multipla: " + GraphQLRequestSerializer.getEntry(opzioni_multipla));
        }
        if (opzioni_singola != null) {
            joiner.add("opzioni_singola: " + GraphQLRequestSerializer.getEntry(opzioni_singola));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        if (ordine_risposta != null) {
            joiner.add("ordine_risposta: " + GraphQLRequestSerializer.getEntry(ordine_risposta));
        }
        if (peso_punteggio != null) {
            joiner.add("peso_punteggio: " + GraphQLRequestSerializer.getEntry(peso_punteggio));
        }
        if (punteggio_risposta != null) {
            joiner.add("punteggio_risposta: " + GraphQLRequestSerializer.getEntry(punteggio_risposta));
        }
        if (punteggio_totale != null) {
            joiner.add("punteggio_totale: " + GraphQLRequestSerializer.getEntry(punteggio_totale));
        }
        if (questionario_id != null) {
            joiner.add("questionario_id: " + GraphQLRequestSerializer.getEntry(questionario_id));
        }
        if (questionario_pro_app_id != null) {
            joiner.add("questionario_pro_app_id: " + GraphQLRequestSerializer.getEntry(questionario_pro_app_id));
        }
        if (risposta != null) {
            joiner.add("risposta: " + GraphQLRequestSerializer.getEntry(risposta));
        }
        if (risposta_dec != null) {
            joiner.add("risposta_dec: " + GraphQLRequestSerializer.getEntry(risposta_dec));
        }
        if (risposta_int != null) {
            joiner.add("risposta_int: " + GraphQLRequestSerializer.getEntry(risposta_int));
        }
        if (risposta_multipla != null) {
            joiner.add("risposta_multipla: " + GraphQLRequestSerializer.getEntry(risposta_multipla));
        }
        if (risposta_str != null) {
            joiner.add("risposta_str: " + GraphQLRequestSerializer.getEntry(risposta_str));
        }
        if (scala_intera != null) {
            joiner.add("scala_intera: " + GraphQLRequestSerializer.getEntry(scala_intera));
        }
        if (solo_intro != null) {
            joiner.add("solo_intro: " + GraphQLRequestSerializer.getEntry(solo_intro));
        }
        if (stringa != null) {
            joiner.add("stringa: " + GraphQLRequestSerializer.getEntry(stringa));
        }
        if (studio_questionario_id != null) {
            joiner.add("studio_questionario_id: " + GraphQLRequestSerializer.getEntry(studio_questionario_id));
        }
        if (domanda_ != null) {
            joiner.add("domanda_: " + GraphQLRequestSerializer.getEntry(domanda_));
        }
        if (questionario_PRO_app_ != null) {
            joiner.add("questionario_PRO_app_: " + GraphQLRequestSerializer.getEntry(questionario_PRO_app_));
        }
        return joiner.toString();
    }

    public static CliRispostaDTO.Builder builder() {
        return new CliRispostaDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private Boolean alert_obbligatoria;
        private String codice_interno_i;
        private Boolean decimale;
        private String domanda;
        private Integer domanda_id;
        private String domande_questionario_ids;
        private Integer id_risposta_peso;
        private Boolean intero;
        private Boolean obbligatoria;
        private Boolean opzioni_multipla;
        private Boolean opzioni_singola;
        private Integer ordine;
        private Integer ordine_risposta;
        private String peso_punteggio;
        private String punteggio_risposta;
        private String punteggio_totale;
        private Integer questionario_id;
        private Integer questionario_pro_app_id;
        private String risposta;
        private String risposta_dec;
        private Integer risposta_int;
        private String risposta_multipla;
        private String risposta_str;
        private Boolean scala_intera;
        private Boolean solo_intro;
        private Boolean stringa;
        private Integer studio_questionario_id;
        private CliDomandaDTO domanda_;
        private CliQuestionario_PRO_appDTO questionario_PRO_app_;

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
         * The attribute _id of Risposta. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute alert_obbligatoria of Risposta. It is of type Boolean. Expression: 'obbligatoria && risposta=concat("")'.
         */
        public Builder setAlert_obbligatoria(Boolean alert_obbligatoria) {
            this.alert_obbligatoria = alert_obbligatoria;
            return this;
        }

        /**
         * The attribute codice_interno_i of Risposta. It is of type String. Path: questionario_PRO_app_ codice_interno_i. Cannot be null.
         */
        public Builder setCodice_interno_i(String codice_interno_i) {
            this.codice_interno_i = codice_interno_i;
            return this;
        }

        /**
         * The attribute decimale of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ decimale.
         */
        public Builder setDecimale(Boolean decimale) {
            this.decimale = decimale;
            return this;
        }

        /**
         * The attribute domanda of Risposta. It is of type String. Path: domanda_ descrizione.
         */
        public Builder setDomanda(String domanda) {
            this.domanda = domanda;
            return this;
        }

        /**
         * The attribute domanda_id of Risposta. It is of type Int. Path: domanda_ __id. Cannot be null.
         */
        public Builder setDomanda_id(Integer domanda_id) {
            this.domanda_id = domanda_id;
            return this;
        }

        /**
         * The attribute domande_questionario_ids of Risposta. It is of type String. Path: CONCAT_CS - Concat (comma separated)questionario_PRO_app_.questionario_.domanda_ __id. Cannot be null.
         */
        public Builder setDomande_questionario_ids(String domande_questionario_ids) {
            this.domande_questionario_ids = domande_questionario_ids;
            return this;
        }

        /**
         * The attribute id_risposta_peso of Risposta. It is of type Int. Path: COUNT_DISTINCT - Count distinct [Risposta.questionario_pro_app_id= Risposta.domanda_.peso_domanda.risposta_.questionario_pro_app_id]domanda_.peso_domanda.risposta_ __id. Cannot be null.
         */
        public Builder setId_risposta_peso(Integer id_risposta_peso) {
            this.id_risposta_peso = id_risposta_peso;
            return this;
        }

        /**
         * The attribute intero of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ intero.
         */
        public Builder setIntero(Boolean intero) {
            this.intero = intero;
            return this;
        }

        /**
         * The attribute obbligatoria of Risposta. It is of type Boolean. Path: domanda_ obbligatoria. Cannot be null.
         */
        public Builder setObbligatoria(Boolean obbligatoria) {
            this.obbligatoria = obbligatoria;
            return this;
        }

        /**
         * The attribute opzioni_multipla of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scelta_multipla.
         */
        public Builder setOpzioni_multipla(Boolean opzioni_multipla) {
            this.opzioni_multipla = opzioni_multipla;
            return this;
        }

        /**
         * The attribute opzioni_singola of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scelta_singola.
         */
        public Builder setOpzioni_singola(Boolean opzioni_singola) {
            this.opzioni_singola = opzioni_singola;
            return this;
        }

        /**
         * The attribute ordine of Risposta. It is of type Int. Path: domanda_ ordine.
         */
        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }

        /**
         * The attribute ordine_risposta of Risposta. It is of type Int. Path: MIN - Minrisposta_possibile_multipla ordine.
         */
        public Builder setOrdine_risposta(Integer ordine_risposta) {
            this.ordine_risposta = ordine_risposta;
            return this;
        }

        /**
         * The attribute peso_punteggio of Risposta. It is of type Real @realFormat. Path: SUM - Sum [Risposta.questionario_pro_app_id= Risposta.domanda_.peso_domanda.risposta_.questionario_pro_app_id]domanda_.peso_domanda.risposta_ punteggio_risposta.
         */
        public Builder setPeso_punteggio(String peso_punteggio) {
            this.peso_punteggio = peso_punteggio;
            return this;
        }

        /**
         * The attribute punteggio_risposta of Risposta. It is of type Real @realFormat. Path: SUM - Sumrisposta_possibile_multipla punteggio.
         */
        public Builder setPunteggio_risposta(String punteggio_risposta) {
            this.punteggio_risposta = punteggio_risposta;
            return this;
        }

        /**
         * The attribute punteggio_totale of Risposta. It is of type Real @realFormat. Expression: 'punteggio_risposta*if(isNull(id_risposta_peso),1,peso_punteggio)'.
         */
        public Builder setPunteggio_totale(String punteggio_totale) {
            this.punteggio_totale = punteggio_totale;
            return this;
        }

        /**
         * The attribute questionario_id of Risposta. It is of type Int. Path: questionario_PRO_app_.questionario_ __id. Cannot be null.
         */
        public Builder setQuestionario_id(Integer questionario_id) {
            this.questionario_id = questionario_id;
            return this;
        }

        /**
         * The attribute questionario_pro_app_id of Risposta. It is of type Int. Path: questionario_PRO_app_ __id. Cannot be null.
         */
        public Builder setQuestionario_pro_app_id(Integer questionario_pro_app_id) {
            this.questionario_pro_app_id = questionario_pro_app_id;
            return this;
        }

        /**
         * The attribute risposta of Risposta. It is of type String. Expression: 'concat(
	ifNull(concat(risposta_int),""),
	ifNull(concat(risposta_dec),""),
	ifNull(risposta_str,""),
	ifNull(risposta_multipla,"")
)'.
         */
        public Builder setRisposta(String risposta) {
            this.risposta = risposta;
            return this;
        }

        /**
         * The attribute risposta_dec of Risposta. It is of type Real @realFormat.
         */
        public Builder setRisposta_dec(String risposta_dec) {
            this.risposta_dec = risposta_dec;
            return this;
        }

        /**
         * The attribute risposta_int of Risposta. It is of type Int.
         */
        public Builder setRisposta_int(Integer risposta_int) {
            this.risposta_int = risposta_int;
            return this;
        }

        /**
         * The attribute risposta_multipla of Risposta. It is of type String. Path: CONCAT_DS_CS - Concat distinct (comma separated)risposta_possibile_multipla testo.
         */
        public Builder setRisposta_multipla(String risposta_multipla) {
            this.risposta_multipla = risposta_multipla;
            return this;
        }

        /**
         * The attribute risposta_str of Risposta. It is of type Text.
         */
        public Builder setRisposta_str(String risposta_str) {
            this.risposta_str = risposta_str;
            return this;
        }

        /**
         * The attribute scala_intera of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ scala_intera.
         */
        public Builder setScala_intera(Boolean scala_intera) {
            this.scala_intera = scala_intera;
            return this;
        }

        /**
         * The attribute solo_intro of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ solo_intro.
         */
        public Builder setSolo_intro(Boolean solo_intro) {
            this.solo_intro = solo_intro;
            return this;
        }

        /**
         * The attribute stringa of Risposta. It is of type Boolean. Path: domanda_.tipo_risposta_ stringa.
         */
        public Builder setStringa(Boolean stringa) {
            this.stringa = stringa;
            return this;
        }

        /**
         * The attribute studio_questionario_id of Risposta. It is of type Int. Path: questionario_PRO_app_.studio_questionario_ __id. Cannot be null.
         */
        public Builder setStudio_questionario_id(Integer studio_questionario_id) {
            this.studio_questionario_id = studio_questionario_id;
            return this;
        }

        /**
         * The associated object for the role domanda_.
         */
        public Builder setDomanda_(CliDomandaDTO domanda_) {
            this.domanda_ = domanda_;
            return this;
        }

        /**
         * The associated object for the role questionario_PRO_app_.
         */
        public Builder setQuestionario_PRO_app_(CliQuestionario_PRO_appDTO questionario_PRO_app_) {
            this.questionario_PRO_app_ = questionario_PRO_app_;
            return this;
        }


        public CliRispostaDTO build() {
            CliRispostaDTO result = new CliRispostaDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setAlert_obbligatoria(this.alert_obbligatoria);
            result.setCodice_interno_i(this.codice_interno_i);
            result.setDecimale(this.decimale);
            result.setDomanda(this.domanda);
            result.setDomanda_id(this.domanda_id);
            result.setDomande_questionario_ids(this.domande_questionario_ids);
            result.setId_risposta_peso(this.id_risposta_peso);
            result.setIntero(this.intero);
            result.setObbligatoria(this.obbligatoria);
            result.setOpzioni_multipla(this.opzioni_multipla);
            result.setOpzioni_singola(this.opzioni_singola);
            result.setOrdine(this.ordine);
            result.setOrdine_risposta(this.ordine_risposta);
            result.setPeso_punteggio(this.peso_punteggio);
            result.setPunteggio_risposta(this.punteggio_risposta);
            result.setPunteggio_totale(this.punteggio_totale);
            result.setQuestionario_id(this.questionario_id);
            result.setQuestionario_pro_app_id(this.questionario_pro_app_id);
            result.setRisposta(this.risposta);
            result.setRisposta_dec(this.risposta_dec);
            result.setRisposta_int(this.risposta_int);
            result.setRisposta_multipla(this.risposta_multipla);
            result.setRisposta_str(this.risposta_str);
            result.setScala_intera(this.scala_intera);
            result.setSolo_intro(this.solo_intro);
            result.setStringa(this.stringa);
            result.setStudio_questionario_id(this.studio_questionario_id);
            result.setDomanda_(this.domanda_);
            result.setQuestionario_PRO_app_(this.questionario_PRO_app_);
            return result;
        }

    }
}
