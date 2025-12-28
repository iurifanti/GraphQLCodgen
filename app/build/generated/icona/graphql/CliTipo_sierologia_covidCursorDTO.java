package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Tipo_sierologia_covid.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliTipo_sierologia_covidCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String nome;
    private Boolean solo_esito;

    public CliTipo_sierologia_covidCursorDTO() {
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

    public Boolean getSolo_esito() {
        return solo_esito;
    }
    public void setSolo_esito(Boolean solo_esito) {
        this.solo_esito = solo_esito;
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
        if (solo_esito != null) {
            joiner.add("solo_esito: " + GraphQLRequestSerializer.getEntry(solo_esito));
        }
        return joiner.toString();
    }

    public static CliTipo_sierologia_covidCursorDTO.Builder builder() {
        return new CliTipo_sierologia_covidCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String nome;
        private Boolean solo_esito;

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

        public Builder setSolo_esito(Boolean solo_esito) {
            this.solo_esito = solo_esito;
            return this;
        }


        public CliTipo_sierologia_covidCursorDTO build() {
            CliTipo_sierologia_covidCursorDTO result = new CliTipo_sierologia_covidCursorDTO();
            result.set_id(this._id);
            result.setNome(this.nome);
            result.setSolo_esito(this.solo_esito);
            return result;
        }

    }
}
