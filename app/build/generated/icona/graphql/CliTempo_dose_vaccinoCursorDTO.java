package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Tempo_dose_vaccino.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTempo_dose_vaccinoCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String nome;
    private Integer ordine;

    public CliTempo_dose_vaccinoCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getOrdine() {
        return ordine;
    }
    public void setOrdine(Integer ordine) {
        this.ordine = ordine;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (ordine != null) {
            joiner.add("ordine: " + GraphQLRequestSerializer.getEntry(ordine));
        }
        return joiner.toString();
    }

    public static CliTempo_dose_vaccinoCursorDTO.Builder builder() {
        return new CliTempo_dose_vaccinoCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String nome;
        private Integer ordine;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setOrdine(Integer ordine) {
            this.ordine = ordine;
            return this;
        }


        public CliTempo_dose_vaccinoCursorDTO build() {
            CliTempo_dose_vaccinoCursorDTO result = new CliTempo_dose_vaccinoCursorDTO();
            result.set_id(this._id);
            result.setNome(this.nome);
            result.setOrdine(this.ordine);
            return result;
        }

    }
}
