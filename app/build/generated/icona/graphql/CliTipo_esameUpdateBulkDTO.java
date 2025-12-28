package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class Tipo_esame.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTipo_esameUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;

    public CliTipo_esameUpdateBulkDTO() {
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
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliTipo_esameUpdateBulkDTO.Builder builder() {
        return new CliTipo_esameUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String nome;

        public Builder() {
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }


        public CliTipo_esameUpdateBulkDTO build() {
            CliTipo_esameUpdateBulkDTO result = new CliTipo_esameUpdateBulkDTO();
            result.setNome(this.nome);
            return result;
        }

    }
}
