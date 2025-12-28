package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class Testo_intro.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTesto_introUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private Integer ordine;
    private String testo;
    private String titolo;

    public CliTesto_introUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getOrdine() {
        return ordine;
    }
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }

    public String getTesto() {
        return testo;
    }
    public void setTesto(String testo) {
        this.testo = testo;
    }

    public String getTitolo() {
        return titolo;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        if (testo != null) {
            joiner.add("testo: " + GraphQLRequestSerializer.getEntry(testo));
        }
        if (titolo != null) {
            joiner.add("titolo: " + GraphQLRequestSerializer.getEntry(titolo));
        }
        return joiner.toString();
    }

    public static CliTesto_introUpdateDTO.Builder builder() {
        return new CliTesto_introUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private Integer ordine;
        private String testo;
        private String titolo;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }

        public Builder setTesto(String testo) {
            this.testo = testo;
            return this;
        }

        public Builder setTitolo(String titolo) {
            this.titolo = titolo;
            return this;
        }


        public CliTesto_introUpdateDTO build() {
            CliTesto_introUpdateDTO result = new CliTesto_introUpdateDTO();
            result.set_id(this._id);
            result.setOrdine(this.ordine);
            result.setTesto(this.testo);
            result.setTitolo(this.titolo);
            return result;
        }

    }
}
