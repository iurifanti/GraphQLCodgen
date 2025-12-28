package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class dosaggio.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliDosaggioUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;

    public CliDosaggioUpdateBulkDTO() {
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

    public static CliDosaggioUpdateBulkDTO.Builder builder() {
        return new CliDosaggioUpdateBulkDTO.Builder();
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


        public CliDosaggioUpdateBulkDTO build() {
            CliDosaggioUpdateBulkDTO result = new CliDosaggioUpdateBulkDTO();
            result.setNome(this.nome);
            return result;
        }

    }
}
