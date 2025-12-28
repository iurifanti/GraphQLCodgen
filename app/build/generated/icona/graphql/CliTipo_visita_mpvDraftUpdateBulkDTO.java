package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update objects of class Tipo_visita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTipo_visita_mpvDraftUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean booster;
    private Integer cod;
    private String nome;

    public CliTipo_visita_mpvDraftUpdateBulkDTO() {
    }


    public Boolean getBooster() {
        return booster;
    }
    public void setBooster(Boolean booster) {
        this.booster = booster;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (booster != null) {
            joiner.add("booster: " + GraphQLRequestSerializer.getEntry(booster));
        }
        if (cod != null) {
            joiner.add("cod: " + GraphQLRequestSerializer.getEntry(cod));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliTipo_visita_mpvDraftUpdateBulkDTO.Builder builder() {
        return new CliTipo_visita_mpvDraftUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private Boolean booster;
        private Integer cod;
        private String nome;

        public Builder() {
        }

        public Builder setBooster(Boolean booster) {
            this.booster = booster;
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


        public CliTipo_visita_mpvDraftUpdateBulkDTO build() {
            CliTipo_visita_mpvDraftUpdateBulkDTO result = new CliTipo_visita_mpvDraftUpdateBulkDTO();
            result.setBooster(this.booster);
            result.setCod(this.cod);
            result.setNome(this.nome);
            return result;
        }

    }
}
