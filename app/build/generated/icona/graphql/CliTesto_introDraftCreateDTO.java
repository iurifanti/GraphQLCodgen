package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for draft create objects of class Testo_intro.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTesto_introDraftCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private Integer ordine;
    private String testo;
    private String titolo;

    public CliTesto_introDraftCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
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
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
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

    public static CliTesto_introDraftCreateDTO.Builder builder() {
        return new CliTesto_introDraftCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private Integer ordine;
        private String testo;
        private String titolo;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
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


        public CliTesto_introDraftCreateDTO build() {
            CliTesto_introDraftCreateDTO result = new CliTesto_introDraftCreateDTO();
            result.set_clientId(this._clientId);
            result.setOrdine(this.ordine);
            result.setTesto(this.testo);
            result.setTitolo(this.titolo);
            return result;
        }

    }
}
