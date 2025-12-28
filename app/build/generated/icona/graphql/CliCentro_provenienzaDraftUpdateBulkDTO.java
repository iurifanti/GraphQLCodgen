package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Centro_provenienza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCentro_provenienzaDraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean altro;
    private Integer cod;
    private String nome;
    private Boolean visibile;

    public CliCentro_provenienzaDraftUpdateBulkDTO() {
    }


    public Boolean getAltro() {
        return altro;
    }
    public void setAltro(Boolean altro) {
        this.altro = altro;
    }

    public Integer getCod() {
        return cod;
    }
    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getVisibile() {
        return visibile;
    }
    public void setVisibile(Boolean visibile) {
        this.visibile = visibile;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (altro != null) {
            joiner.add("altro: " + GraphQLRequestSerializer.getEntry(altro));
        }
        if (cod != null) {
            joiner.add("cod: " + GraphQLRequestSerializer.getEntry(cod));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (visibile != null) {
            joiner.add("visibile: " + GraphQLRequestSerializer.getEntry(visibile));
        }
        return joiner.toString();
    }

    public static CliCentro_provenienzaDraftUpdateBulkDTO.Builder builder() {
        return new CliCentro_provenienzaDraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private Boolean altro;
        private Integer cod;
        private String nome;
        private Boolean visibile;

        public Builder() {
        }

        public Builder setAltro(Boolean altro) {
            this.altro = altro;
            return this;
        }

        public Builder setCod(Integer cod) {
            this.cod = cod;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setVisibile(Boolean visibile) {
            this.visibile = visibile;
            return this;
        }


        public CliCentro_provenienzaDraftUpdateBulkDTO build() {
            CliCentro_provenienzaDraftUpdateBulkDTO result = new CliCentro_provenienzaDraftUpdateBulkDTO();
            result.setAltro(this.altro);
            result.setCod(this.cod);
            result.setNome(this.nome);
            result.setVisibile(this.visibile);
            return result;
        }

    }
}
