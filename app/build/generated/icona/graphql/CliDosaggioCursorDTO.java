package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
dosaggio.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliDosaggioCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private Integer farmaco_altro_id;
    private Integer farmaco_arv_id;
    private String nome;

    public CliDosaggioCursorDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public Integer getFarmaco_altro_id() {
        return farmaco_altro_id;
    }
    public void setFarmaco_altro_id(Integer farmaco_altro_id) {
        this.farmaco_altro_id = farmaco_altro_id;
    }

    public Integer getFarmaco_arv_id() {
        return farmaco_arv_id;
    }
    public void setFarmaco_arv_id(Integer farmaco_arv_id) {
        this.farmaco_arv_id = farmaco_arv_id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (farmaco_altro_id != null) {
            joiner.add("farmaco_altro_id: " + GraphQLRequestSerializer.getEntry(farmaco_altro_id));
        }
        if (farmaco_arv_id != null) {
            joiner.add("farmaco_arv_id: " + GraphQLRequestSerializer.getEntry(farmaco_arv_id));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliDosaggioCursorDTO.Builder builder() {
        return new CliDosaggioCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private Integer farmaco_altro_id;
        private Integer farmaco_arv_id;
        private String nome;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setFarmaco_altro_id(Integer farmaco_altro_id) {
            this.farmaco_altro_id = farmaco_altro_id;
            return this;
        }

        public Builder setFarmaco_arv_id(Integer farmaco_arv_id) {
            this.farmaco_arv_id = farmaco_arv_id;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliDosaggioCursorDTO build() {
            CliDosaggioCursorDTO result = new CliDosaggioCursorDTO();
            result.set_id(this._id);
            result.setFarmaco_altro_id(this.farmaco_altro_id);
            result.setFarmaco_arv_id(this.farmaco_arv_id);
            result.setNome(this.nome);
            return result;
        }

    }
}
