package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Gravidanza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliGravidanzaCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String allattamento_seno1;
    private String allattamento_seno2;
    private String codice_centro;
    private String data_esito;
    private Integer eta_gestazionale;
    private Integer neonati;
    private String note;
    private String padre_hiv;
    private Integer peso1;
    private Integer peso2;
    private String probelma_ostetrico_specificare;
    private String problema_ostetrico_nome;
    private String sesso1;
    private String sesso2;
    private String ultima_mestruazione;

    public CliGravidanzaCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getAllattamento_seno1() {
        return allattamento_seno1;
    }
    public void setAllattamento_seno1(String allattamento_seno1) {
        this.allattamento_seno1 = allattamento_seno1;
    }

    public String getAllattamento_seno2() {
        return allattamento_seno2;
    }
    public void setAllattamento_seno2(String allattamento_seno2) {
        this.allattamento_seno2 = allattamento_seno2;
    }

    public String getCodice_centro() {
        return codice_centro;
    }
    public void setCodice_centro(String codice_centro) {
        this.codice_centro = codice_centro;
    }

    public String getData_esito() {
        return data_esito;
    }
    public void setData_esito(String data_esito) {
        this.data_esito = data_esito;
    }

    public Integer getEta_gestazionale() {
        return eta_gestazionale;
    }
    public void setEta_gestazionale(Integer eta_gestazionale) {
        this.eta_gestazionale = eta_gestazionale;
    }

    public Integer getNeonati() {
        return neonati;
    }
    public void setNeonati(Integer neonati) {
        this.neonati = neonati;
    }

    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }

    public String getPadre_hiv() {
        return padre_hiv;
    }
    public void setPadre_hiv(String padre_hiv) {
        this.padre_hiv = padre_hiv;
    }

    public Integer getPeso1() {
        return peso1;
    }
    public void setPeso1(Integer peso1) {
        this.peso1 = peso1;
    }

    public Integer getPeso2() {
        return peso2;
    }
    public void setPeso2(Integer peso2) {
        this.peso2 = peso2;
    }

    public String getProbelma_ostetrico_specificare() {
        return probelma_ostetrico_specificare;
    }
    public void setProbelma_ostetrico_specificare(String probelma_ostetrico_specificare) {
        this.probelma_ostetrico_specificare = probelma_ostetrico_specificare;
    }

    public String getProblema_ostetrico_nome() {
        return problema_ostetrico_nome;
    }
    public void setProblema_ostetrico_nome(String problema_ostetrico_nome) {
        this.problema_ostetrico_nome = problema_ostetrico_nome;
    }

    public String getSesso1() {
        return sesso1;
    }
    public void setSesso1(String sesso1) {
        this.sesso1 = sesso1;
    }

    public String getSesso2() {
        return sesso2;
    }
    public void setSesso2(String sesso2) {
        this.sesso2 = sesso2;
    }

    public String getUltima_mestruazione() {
        return ultima_mestruazione;
    }
    public void setUltima_mestruazione(String ultima_mestruazione) {
        this.ultima_mestruazione = ultima_mestruazione;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (allattamento_seno1 != null) {
            joiner.add("allattamento_seno1: " + GraphQLRequestSerializer.getEntry(allattamento_seno1));
        }
        if (allattamento_seno2 != null) {
            joiner.add("allattamento_seno2: " + GraphQLRequestSerializer.getEntry(allattamento_seno2));
        }
        if (codice_centro != null) {
            joiner.add("codice_centro: " + GraphQLRequestSerializer.getEntry(codice_centro));
        }
        if (data_esito != null) {
            joiner.add("data_esito: " + GraphQLRequestSerializer.getEntry(data_esito));
        }
        if (eta_gestazionale != null) {
            joiner.add("eta_gestazionale: " + GraphQLRequestSerializer.getEntry(eta_gestazionale));
        }
        if (neonati != null) {
            joiner.add("neonati: " + GraphQLRequestSerializer.getEntry(neonati));
        }
        if (note != null) {
            joiner.add("note: " + GraphQLRequestSerializer.getEntry(note));
        }
        if (padre_hiv != null) {
            joiner.add("padre_hiv: " + GraphQLRequestSerializer.getEntry(padre_hiv));
        }
        if (peso1 != null) {
            joiner.add("peso1: " + GraphQLRequestSerializer.getEntry(peso1));
        }
        if (peso2 != null) {
            joiner.add("peso2: " + GraphQLRequestSerializer.getEntry(peso2));
        }
        if (probelma_ostetrico_specificare != null) {
            joiner.add("probelma_ostetrico_specificare: " + GraphQLRequestSerializer.getEntry(probelma_ostetrico_specificare));
        }
        if (problema_ostetrico_nome != null) {
            joiner.add("problema_ostetrico_nome: " + GraphQLRequestSerializer.getEntry(problema_ostetrico_nome));
        }
        if (sesso1 != null) {
            joiner.add("sesso1: " + GraphQLRequestSerializer.getEntry(sesso1));
        }
        if (sesso2 != null) {
            joiner.add("sesso2: " + GraphQLRequestSerializer.getEntry(sesso2));
        }
        if (ultima_mestruazione != null) {
            joiner.add("ultima_mestruazione: " + GraphQLRequestSerializer.getEntry(ultima_mestruazione));
        }
        return joiner.toString();
    }

    public static CliGravidanzaCursorDTO.Builder builder() {
        return new CliGravidanzaCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String allattamento_seno1;
        private String allattamento_seno2;
        private String codice_centro;
        private String data_esito;
        private Integer eta_gestazionale;
        private Integer neonati;
        private String note;
        private String padre_hiv;
        private Integer peso1;
        private Integer peso2;
        private String probelma_ostetrico_specificare;
        private String problema_ostetrico_nome;
        private String sesso1;
        private String sesso2;
        private String ultima_mestruazione;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setAllattamento_seno1(String allattamento_seno1) {
            this.allattamento_seno1 = allattamento_seno1;
            return this;
        }

        public Builder setAllattamento_seno2(String allattamento_seno2) {
            this.allattamento_seno2 = allattamento_seno2;
            return this;
        }

        public Builder setCodice_centro(String codice_centro) {
            this.codice_centro = codice_centro;
            return this;
        }

        public Builder setData_esito(String data_esito) {
            this.data_esito = data_esito;
            return this;
        }

        public Builder setEta_gestazionale(Integer eta_gestazionale) {
            this.eta_gestazionale = eta_gestazionale;
            return this;
        }

        public Builder setNeonati(Integer neonati) {
            this.neonati = neonati;
            return this;
        }

        public Builder setNote(String note) {
            this.note = note;
            return this;
        }

        public Builder setPadre_hiv(String padre_hiv) {
            this.padre_hiv = padre_hiv;
            return this;
        }

        public Builder setPeso1(Integer peso1) {
            this.peso1 = peso1;
            return this;
        }

        public Builder setPeso2(Integer peso2) {
            this.peso2 = peso2;
            return this;
        }

        public Builder setProbelma_ostetrico_specificare(String probelma_ostetrico_specificare) {
            this.probelma_ostetrico_specificare = probelma_ostetrico_specificare;
            return this;
        }

        public Builder setProblema_ostetrico_nome(String problema_ostetrico_nome) {
            this.problema_ostetrico_nome = problema_ostetrico_nome;
            return this;
        }

        public Builder setSesso1(String sesso1) {
            this.sesso1 = sesso1;
            return this;
        }

        public Builder setSesso2(String sesso2) {
            this.sesso2 = sesso2;
            return this;
        }

        public Builder setUltima_mestruazione(String ultima_mestruazione) {
            this.ultima_mestruazione = ultima_mestruazione;
            return this;
        }


        public CliGravidanzaCursorDTO build() {
            CliGravidanzaCursorDTO result = new CliGravidanzaCursorDTO();
            result.set_id(this._id);
            result.setAllattamento_seno1(this.allattamento_seno1);
            result.setAllattamento_seno2(this.allattamento_seno2);
            result.setCodice_centro(this.codice_centro);
            result.setData_esito(this.data_esito);
            result.setEta_gestazionale(this.eta_gestazionale);
            result.setNeonati(this.neonati);
            result.setNote(this.note);
            result.setPadre_hiv(this.padre_hiv);
            result.setPeso1(this.peso1);
            result.setPeso2(this.peso2);
            result.setProbelma_ostetrico_specificare(this.probelma_ostetrico_specificare);
            result.setProblema_ostetrico_nome(this.problema_ostetrico_nome);
            result.setSesso1(this.sesso1);
            result.setSesso2(this.sesso2);
            result.setUltima_mestruazione(this.ultima_mestruazione);
            return result;
        }

    }
}
