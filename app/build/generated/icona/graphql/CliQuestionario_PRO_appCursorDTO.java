package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Questionario_PRO_app.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliQuestionario_PRO_appCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

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

    public CliQuestionario_PRO_appCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Boolean getAlert_obbligatoria1() {
        return alert_obbligatoria1;
    }
    public void setAlert_obbligatoria1(Boolean alert_obbligatoria1) {
        this.alert_obbligatoria1 = alert_obbligatoria1;
    }

    public Boolean getAlert_obbligatoria2() {
        return alert_obbligatoria2;
    }
    public void setAlert_obbligatoria2(Boolean alert_obbligatoria2) {
        this.alert_obbligatoria2 = alert_obbligatoria2;
    }

    public String getCodice_interno_i() {
        return codice_interno_i;
    }
    public void setCodice_interno_i(String codice_interno_i) {
        this.codice_interno_i = codice_interno_i;
    }

    public String getCodice_interno_p() {
        return codice_interno_p;
    }
    public void setCodice_interno_p(String codice_interno_p) {
        this.codice_interno_p = codice_interno_p;
    }

    public Boolean getConfermato() {
        return confermato;
    }
    public void setConfermato(Boolean confermato) {
        this.confermato = confermato;
    }

    public String getData_compilazione() {
        return data_compilazione;
    }
    public void setData_compilazione(String data_compilazione) {
        this.data_compilazione = data_compilazione;
    }

    public String getDomanda_obblig_ids() {
        return domanda_obblig_ids;
    }
    public void setDomanda_obblig_ids(String domanda_obblig_ids) {
        this.domanda_obblig_ids = domanda_obblig_ids;
    }

    public String getDomanda_risp_ids() {
        return domanda_risp_ids;
    }
    public void setDomanda_risp_ids(String domanda_risp_ids) {
        this.domanda_risp_ids = domanda_risp_ids;
    }

    public Integer getDomande_totali() {
        return domande_totali;
    }
    public void setDomande_totali(Integer domande_totali) {
        this.domande_totali = domande_totali;
    }

    public Boolean getFiltro_classe() {
        return filtro_classe;
    }
    public void setFiltro_classe(Boolean filtro_classe) {
        this.filtro_classe = filtro_classe;
    }

    public Boolean getI_filtro_classe() {
        return i_filtro_classe;
    }
    public void setI_filtro_classe(Boolean i_filtro_classe) {
        this.i_filtro_classe = i_filtro_classe;
    }

    public Integer getIntervallo_compil_mesi() {
        return intervallo_compil_mesi;
    }
    public void setIntervallo_compil_mesi(Integer intervallo_compil_mesi) {
        this.intervallo_compil_mesi = intervallo_compil_mesi;
    }

    public Integer getMesi_trascorsi() {
        return mesi_trascorsi;
    }
    public void setMesi_trascorsi(Integer mesi_trascorsi) {
        this.mesi_trascorsi = mesi_trascorsi;
    }

    public Boolean getP_filtro_classe() {
        return p_filtro_classe;
    }
    public void setP_filtro_classe(Boolean p_filtro_classe) {
        this.p_filtro_classe = p_filtro_classe;
    }

    public Boolean getParametri_personali() {
        return parametri_personali;
    }
    public void setParametri_personali(Boolean parametri_personali) {
        this.parametri_personali = parametri_personali;
    }

    public String getQuestionario() {
        return questionario;
    }
    public void setQuestionario(String questionario) {
        this.questionario = questionario;
    }

    public Integer getRisposte_date() {
        return risposte_date;
    }
    public void setRisposte_date(Integer risposte_date) {
        this.risposte_date = risposte_date;
    }

    public Integer getRisposte_mancanti() {
        return risposte_mancanti;
    }
    public void setRisposte_mancanti(Integer risposte_mancanti) {
        this.risposte_mancanti = risposte_mancanti;
    }

    public String getStudi_ids() {
        return studi_ids;
    }
    public void setStudi_ids(String studi_ids) {
        this.studi_ids = studi_ids;
    }

    public String getStudi_ids_b() {
        return studi_ids_b;
    }
    public void setStudi_ids_b(String studi_ids_b) {
        this.studi_ids_b = studi_ids_b;
    }

    public String getStudi_ids_i() {
        return studi_ids_i;
    }
    public void setStudi_ids_i(String studi_ids_i) {
        this.studi_ids_i = studi_ids_i;
    }

    public String getStudi_ids_p() {
        return studi_ids_p;
    }
    public void setStudi_ids_p(String studi_ids_p) {
        this.studi_ids_p = studi_ids_p;
    }

    public String getStudi_ids_r() {
        return studi_ids_r;
    }
    public void setStudi_ids_r(String studi_ids_r) {
        this.studi_ids_r = studi_ids_r;
    }

    public String getStudio_questionario() {
        return studio_questionario;
    }
    public void setStudio_questionario(String studio_questionario) {
        this.studio_questionario = studio_questionario;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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
        return joiner.toString();
    }

    public static CliQuestionario_PRO_appCursorDTO.Builder builder() {
        return new CliQuestionario_PRO_appCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

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

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAlert_obbligatoria1(Boolean alert_obbligatoria1) {
            this.alert_obbligatoria1 = alert_obbligatoria1;
            return this;
        }

        public Builder setAlert_obbligatoria2(Boolean alert_obbligatoria2) {
            this.alert_obbligatoria2 = alert_obbligatoria2;
            return this;
        }

        public Builder setCodice_interno_i(String codice_interno_i) {
            this.codice_interno_i = codice_interno_i;
            return this;
        }

        public Builder setCodice_interno_p(String codice_interno_p) {
            this.codice_interno_p = codice_interno_p;
            return this;
        }

        public Builder setConfermato(Boolean confermato) {
            this.confermato = confermato;
            return this;
        }

        public Builder setData_compilazione(String data_compilazione) {
            this.data_compilazione = data_compilazione;
            return this;
        }

        public Builder setDomanda_obblig_ids(String domanda_obblig_ids) {
            this.domanda_obblig_ids = domanda_obblig_ids;
            return this;
        }

        public Builder setDomanda_risp_ids(String domanda_risp_ids) {
            this.domanda_risp_ids = domanda_risp_ids;
            return this;
        }

        public Builder setDomande_totali(Integer domande_totali) {
            this.domande_totali = domande_totali;
            return this;
        }

        public Builder setFiltro_classe(Boolean filtro_classe) {
            this.filtro_classe = filtro_classe;
            return this;
        }

        public Builder setI_filtro_classe(Boolean i_filtro_classe) {
            this.i_filtro_classe = i_filtro_classe;
            return this;
        }

        public Builder setIntervallo_compil_mesi(Integer intervallo_compil_mesi) {
            this.intervallo_compil_mesi = intervallo_compil_mesi;
            return this;
        }

        public Builder setMesi_trascorsi(Integer mesi_trascorsi) {
            this.mesi_trascorsi = mesi_trascorsi;
            return this;
        }

        public Builder setP_filtro_classe(Boolean p_filtro_classe) {
            this.p_filtro_classe = p_filtro_classe;
            return this;
        }

        public Builder setParametri_personali(Boolean parametri_personali) {
            this.parametri_personali = parametri_personali;
            return this;
        }

        public Builder setQuestionario(String questionario) {
            this.questionario = questionario;
            return this;
        }

        public Builder setRisposte_date(Integer risposte_date) {
            this.risposte_date = risposte_date;
            return this;
        }

        public Builder setRisposte_mancanti(Integer risposte_mancanti) {
            this.risposte_mancanti = risposte_mancanti;
            return this;
        }

        public Builder setStudi_ids(String studi_ids) {
            this.studi_ids = studi_ids;
            return this;
        }

        public Builder setStudi_ids_b(String studi_ids_b) {
            this.studi_ids_b = studi_ids_b;
            return this;
        }

        public Builder setStudi_ids_i(String studi_ids_i) {
            this.studi_ids_i = studi_ids_i;
            return this;
        }

        public Builder setStudi_ids_p(String studi_ids_p) {
            this.studi_ids_p = studi_ids_p;
            return this;
        }

        public Builder setStudi_ids_r(String studi_ids_r) {
            this.studi_ids_r = studi_ids_r;
            return this;
        }

        public Builder setStudio_questionario(String studio_questionario) {
            this.studio_questionario = studio_questionario;
            return this;
        }


        public CliQuestionario_PRO_appCursorDTO build() {
            CliQuestionario_PRO_appCursorDTO result = new CliQuestionario_PRO_appCursorDTO();
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
            return result;
        }

    }
}
