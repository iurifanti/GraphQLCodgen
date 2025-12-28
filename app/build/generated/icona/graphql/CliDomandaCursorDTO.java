package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Domanda.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDomandaCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String condizioni_abilitazione_associate;
    private Integer ordine;
    private Boolean parametri_personali;
    private Boolean peso;
    private String testo;

    public CliDomandaCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCondizioni_abilitazione_associate() {
        return condizioni_abilitazione_associate;
    }
    public void setCondizioni_abilitazione_associate(String condizioni_abilitazione_associate) {
        this.condizioni_abilitazione_associate = condizioni_abilitazione_associate;
    }

    public Integer getOrdine() {
        return ordine;
    }
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }

    public Boolean getParametri_personali() {
        return parametri_personali;
    }
    public void setParametri_personali(Boolean parametri_personali) {
        this.parametri_personali = parametri_personali;
    }

    public Boolean getPeso() {
        return peso;
    }
    public void setPeso(Boolean peso) {
        this.peso = peso;
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
        if (condizioni_abilitazione_associate != null) {
            joiner.add("condizioni_abilitazione_associate: " + GraphQLRequestSerializer.getEntry(condizioni_abilitazione_associate));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        if (parametri_personali != null) {
            joiner.add("parametri_personali: " + GraphQLRequestSerializer.getEntry(parametri_personali));
        }
        if (peso != null) {
            joiner.add("peso: " + GraphQLRequestSerializer.getEntry(peso));
        }
        if (testo != null) {
            joiner.add("testo: " + GraphQLRequestSerializer.getEntry(testo));
        }
        return joiner.toString();
    }

    public static CliDomandaCursorDTO.Builder builder() {
        return new CliDomandaCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String condizioni_abilitazione_associate;
        private Integer ordine;
        private Boolean parametri_personali;
        private Boolean peso;
        private String testo;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setCondizioni_abilitazione_associate(String condizioni_abilitazione_associate) {
            this.condizioni_abilitazione_associate = condizioni_abilitazione_associate;
            return this;
        }

        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }

        public Builder setParametri_personali(Boolean parametri_personali) {
            this.parametri_personali = parametri_personali;
            return this;
        }

        public Builder setPeso(Boolean peso) {
            this.peso = peso;
            return this;
        }

        public Builder setTesto(String testo) {
            this.testo = testo;
            return this;
        }


        public CliDomandaCursorDTO build() {
            CliDomandaCursorDTO result = new CliDomandaCursorDTO();
            result.set_id(this._id);
            result.setCondizioni_abilitazione_associate(this.condizioni_abilitazione_associate);
            result.setOrdine(this.ordine);
            result.setParametri_personali(this.parametri_personali);
            result.setPeso(this.peso);
            result.setTesto(this.testo);
            return result;
        }

    }
}
