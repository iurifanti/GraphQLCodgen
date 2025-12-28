package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Risposta_possibile.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliRisposta_possibileCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String conc;
    private Integer domande_associate;
    private String domande_associate_ids;
    private Integer ordine;
    private String punteggio;
    private Integer risposte_associate;
    private String risposte_associate_ids;
    private String testo;

    public CliRisposta_possibileCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getConc() {
        return conc;
    }
    public void setConc(String conc) {
        this.conc = conc;
    }

    public Integer getDomande_associate() {
        return domande_associate;
    }
    public void setDomande_associate(Integer domande_associate) {
        this.domande_associate = domande_associate;
    }

    public String getDomande_associate_ids() {
        return domande_associate_ids;
    }
    public void setDomande_associate_ids(String domande_associate_ids) {
        this.domande_associate_ids = domande_associate_ids;
    }

    public Integer getOrdine() {
        return ordine;
    }
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }

    public String getPunteggio() {
        return punteggio;
    }
    public void setPunteggio(String punteggio) {
        this.punteggio = punteggio;
    }

    public Integer getRisposte_associate() {
        return risposte_associate;
    }
    public void setRisposte_associate(Integer risposte_associate) {
        this.risposte_associate = risposte_associate;
    }

    public String getRisposte_associate_ids() {
        return risposte_associate_ids;
    }
    public void setRisposte_associate_ids(String risposte_associate_ids) {
        this.risposte_associate_ids = risposte_associate_ids;
    }

    public String getTesto() {
        return testo;
    }
    public void setTesto(String testo) {
        this.testo = testo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (conc != null) {
            joiner.add("conc: " + GraphQLRequestSerializer.getEntry(conc));
        }
        if (domande_associate != null) {
            joiner.add("domande_associate: " + GraphQLRequestSerializer.getEntry(domande_associate));
        }
        if (domande_associate_ids != null) {
            joiner.add("domande_associate_ids: " + GraphQLRequestSerializer.getEntry(domande_associate_ids));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        if (punteggio != null) {
            joiner.add("punteggio: " + GraphQLRequestSerializer.getEntry(punteggio));
        }
        if (risposte_associate != null) {
            joiner.add("risposte_associate: " + GraphQLRequestSerializer.getEntry(risposte_associate));
        }
        if (risposte_associate_ids != null) {
            joiner.add("risposte_associate_ids: " + GraphQLRequestSerializer.getEntry(risposte_associate_ids));
        }
        if (testo != null) {
            joiner.add("testo: " + GraphQLRequestSerializer.getEntry(testo));
        }
        return joiner.toString();
    }

    public static CliRisposta_possibileCursorDTO.Builder builder() {
        return new CliRisposta_possibileCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String conc;
        private Integer domande_associate;
        private String domande_associate_ids;
        private Integer ordine;
        private String punteggio;
        private Integer risposte_associate;
        private String risposte_associate_ids;
        private String testo;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setConc(String conc) {
            this.conc = conc;
            return this;
        }

        public Builder setDomande_associate(Integer domande_associate) {
            this.domande_associate = domande_associate;
            return this;
        }

        public Builder setDomande_associate_ids(String domande_associate_ids) {
            this.domande_associate_ids = domande_associate_ids;
            return this;
        }

        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }

        public Builder setPunteggio(String punteggio) {
            this.punteggio = punteggio;
            return this;
        }

        public Builder setRisposte_associate(Integer risposte_associate) {
            this.risposte_associate = risposte_associate;
            return this;
        }

        public Builder setRisposte_associate_ids(String risposte_associate_ids) {
            this.risposte_associate_ids = risposte_associate_ids;
            return this;
        }

        public Builder setTesto(String testo) {
            this.testo = testo;
            return this;
        }


        public CliRisposta_possibileCursorDTO build() {
            CliRisposta_possibileCursorDTO result = new CliRisposta_possibileCursorDTO();
            result.set_id(this._id);
            result.setConc(this.conc);
            result.setDomande_associate(this.domande_associate);
            result.setDomande_associate_ids(this.domande_associate_ids);
            result.setOrdine(this.ordine);
            result.setPunteggio(this.punteggio);
            result.setRisposte_associate(this.risposte_associate);
            result.setRisposte_associate_ids(this.risposte_associate_ids);
            result.setTesto(this.testo);
            return result;
        }

    }
}
