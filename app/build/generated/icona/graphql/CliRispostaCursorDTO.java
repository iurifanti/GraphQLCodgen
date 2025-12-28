package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Risposta.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRispostaCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliRispostaCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getAlert_obbligatoria() {
        return alert_obbligatoria;
    }
    public void setAlert_obbligatoria(Boolean alert_obbligatoria) {
        this.alert_obbligatoria = alert_obbligatoria;
    }

    public String getCodice_interno_i() {
        return codice_interno_i;
    }
    public void setCodice_interno_i(String codice_interno_i) {
        this.codice_interno_i = codice_interno_i;
    }

    public Boolean getDecimale() {
        return decimale;
    }
    public void setDecimale(Boolean decimale) {
        this.decimale = decimale;
    }

    public String getDomanda() {
        return domanda;
    }
    public void setDomanda(String domanda) {
        this.domanda = domanda;
    }

    public Integer getDomanda_id() {
        return domanda_id;
    }
    public void setDomanda_id(Integer domanda_id) {
        this.domanda_id = domanda_id;
    }

    public String getDomande_questionario_ids() {
        return domande_questionario_ids;
    }
    public void setDomande_questionario_ids(String domande_questionario_ids) {
        this.domande_questionario_ids = domande_questionario_ids;
    }

    public Integer getId_risposta_peso() {
        return id_risposta_peso;
    }
    public void setId_risposta_peso(Integer id_risposta_peso) {
        this.id_risposta_peso = id_risposta_peso;
    }

    public Boolean getIntero() {
        return intero;
    }
    public void setIntero(Boolean intero) {
        this.intero = intero;
    }

    public Boolean getObbligatoria() {
        return obbligatoria;
    }
    public void setObbligatoria(Boolean obbligatoria) {
        this.obbligatoria = obbligatoria;
    }

    public Boolean getOpzioni_multipla() {
        return opzioni_multipla;
    }
    public void setOpzioni_multipla(Boolean opzioni_multipla) {
        this.opzioni_multipla = opzioni_multipla;
    }

    public Boolean getOpzioni_singola() {
        return opzioni_singola;
    }
    public void setOpzioni_singola(Boolean opzioni_singola) {
        this.opzioni_singola = opzioni_singola;
    }

    public Integer getOrdine() {
        return ordine;
    }
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }

    public Integer getOrdine_risposta() {
        return ordine_risposta;
    }
    public void setOrdine_risposta(Integer ordine_risposta) {
        this.ordine_risposta = ordine_risposta;
    }

    public String getPeso_punteggio() {
        return peso_punteggio;
    }
    public void setPeso_punteggio(String peso_punteggio) {
        this.peso_punteggio = peso_punteggio;
    }

    public String getPunteggio_risposta() {
        return punteggio_risposta;
    }
    public void setPunteggio_risposta(String punteggio_risposta) {
        this.punteggio_risposta = punteggio_risposta;
    }

    public String getPunteggio_totale() {
        return punteggio_totale;
    }
    public void setPunteggio_totale(String punteggio_totale) {
        this.punteggio_totale = punteggio_totale;
    }

    public Integer getQuestionario_id() {
        return questionario_id;
    }
    public void setQuestionario_id(Integer questionario_id) {
        this.questionario_id = questionario_id;
    }

    public Integer getQuestionario_pro_app_id() {
        return questionario_pro_app_id;
    }
    public void setQuestionario_pro_app_id(Integer questionario_pro_app_id) {
        this.questionario_pro_app_id = questionario_pro_app_id;
    }

    public String getRisposta() {
        return risposta;
    }
    public void setRisposta(String risposta) {
        this.risposta = risposta;
    }

    public String getRisposta_dec() {
        return risposta_dec;
    }
    public void setRisposta_dec(String risposta_dec) {
        this.risposta_dec = risposta_dec;
    }

    public Integer getRisposta_int() {
        return risposta_int;
    }
    public void setRisposta_int(Integer risposta_int) {
        this.risposta_int = risposta_int;
    }

    public String getRisposta_multipla() {
        return risposta_multipla;
    }
    public void setRisposta_multipla(String risposta_multipla) {
        this.risposta_multipla = risposta_multipla;
    }

    public String getRisposta_str() {
        return risposta_str;
    }
    public void setRisposta_str(String risposta_str) {
        this.risposta_str = risposta_str;
    }

    public Boolean getScala_intera() {
        return scala_intera;
    }
    public void setScala_intera(Boolean scala_intera) {
        this.scala_intera = scala_intera;
    }

    public Boolean getSolo_intro() {
        return solo_intro;
    }
    public void setSolo_intro(Boolean solo_intro) {
        this.solo_intro = solo_intro;
    }

    public Boolean getStringa() {
        return stringa;
    }
    public void setStringa(Boolean stringa) {
        this.stringa = stringa;
    }

    public Integer getStudio_questionario_id() {
        return studio_questionario_id;
    }
    public void setStudio_questionario_id(Integer studio_questionario_id) {
        this.studio_questionario_id = studio_questionario_id;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static CliRispostaCursorDTO.Builder builder() {
        return new CliRispostaCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

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

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAlert_obbligatoria(Boolean alert_obbligatoria) {
            this.alert_obbligatoria = alert_obbligatoria;
            return this;
        }

        public Builder setCodice_interno_i(String codice_interno_i) {
            this.codice_interno_i = codice_interno_i;
            return this;
        }

        public Builder setDecimale(Boolean decimale) {
            this.decimale = decimale;
            return this;
        }

        public Builder setDomanda(String domanda) {
            this.domanda = domanda;
            return this;
        }

        public Builder setDomanda_id(Integer domanda_id) {
            this.domanda_id = domanda_id;
            return this;
        }

        public Builder setDomande_questionario_ids(String domande_questionario_ids) {
            this.domande_questionario_ids = domande_questionario_ids;
            return this;
        }

        public Builder setId_risposta_peso(Integer id_risposta_peso) {
            this.id_risposta_peso = id_risposta_peso;
            return this;
        }

        public Builder setIntero(Boolean intero) {
            this.intero = intero;
            return this;
        }

        public Builder setObbligatoria(Boolean obbligatoria) {
            this.obbligatoria = obbligatoria;
            return this;
        }

        public Builder setOpzioni_multipla(Boolean opzioni_multipla) {
            this.opzioni_multipla = opzioni_multipla;
            return this;
        }

        public Builder setOpzioni_singola(Boolean opzioni_singola) {
            this.opzioni_singola = opzioni_singola;
            return this;
        }

        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }

        public Builder setOrdine_risposta(Integer ordine_risposta) {
            this.ordine_risposta = ordine_risposta;
            return this;
        }

        public Builder setPeso_punteggio(String peso_punteggio) {
            this.peso_punteggio = peso_punteggio;
            return this;
        }

        public Builder setPunteggio_risposta(String punteggio_risposta) {
            this.punteggio_risposta = punteggio_risposta;
            return this;
        }

        public Builder setPunteggio_totale(String punteggio_totale) {
            this.punteggio_totale = punteggio_totale;
            return this;
        }

        public Builder setQuestionario_id(Integer questionario_id) {
            this.questionario_id = questionario_id;
            return this;
        }

        public Builder setQuestionario_pro_app_id(Integer questionario_pro_app_id) {
            this.questionario_pro_app_id = questionario_pro_app_id;
            return this;
        }

        public Builder setRisposta(String risposta) {
            this.risposta = risposta;
            return this;
        }

        public Builder setRisposta_dec(String risposta_dec) {
            this.risposta_dec = risposta_dec;
            return this;
        }

        public Builder setRisposta_int(Integer risposta_int) {
            this.risposta_int = risposta_int;
            return this;
        }

        public Builder setRisposta_multipla(String risposta_multipla) {
            this.risposta_multipla = risposta_multipla;
            return this;
        }

        public Builder setRisposta_str(String risposta_str) {
            this.risposta_str = risposta_str;
            return this;
        }

        public Builder setScala_intera(Boolean scala_intera) {
            this.scala_intera = scala_intera;
            return this;
        }

        public Builder setSolo_intro(Boolean solo_intro) {
            this.solo_intro = solo_intro;
            return this;
        }

        public Builder setStringa(Boolean stringa) {
            this.stringa = stringa;
            return this;
        }

        public Builder setStudio_questionario_id(Integer studio_questionario_id) {
            this.studio_questionario_id = studio_questionario_id;
            return this;
        }


        public CliRispostaCursorDTO build() {
            CliRispostaCursorDTO result = new CliRispostaCursorDTO();
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
            return result;
        }

    }
}
