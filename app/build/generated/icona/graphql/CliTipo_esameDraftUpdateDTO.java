package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update object of class Tipo_esame.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTipo_esameDraftUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private String nome;

    public CliTipo_esameDraftUpdateDTO() {
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliTipo_esameDraftUpdateDTO.Builder builder() {
        return new CliTipo_esameDraftUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private String nome;

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


        public CliTipo_esameDraftUpdateDTO build() {
            CliTipo_esameDraftUpdateDTO result = new CliTipo_esameDraftUpdateDTO();
            result.set_id(this._id);
            result.setNome(this.nome);
            return result;
        }

    }
}
