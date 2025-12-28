package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for draft create objects of class Modalita_somministrazione.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliModalita_somministrazioneDraftCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private Integer cod;
    private String nome;

    public CliModalita_somministrazioneDraftCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
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
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (cod != null) {
            joiner.add("cod: " + GraphQLRequestSerializer.getEntry(cod));
        }
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        return joiner.toString();
    }

    public static CliModalita_somministrazioneDraftCreateDTO.Builder builder() {
        return new CliModalita_somministrazioneDraftCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private Integer cod;
        private String nome;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
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


        public CliModalita_somministrazioneDraftCreateDTO build() {
            CliModalita_somministrazioneDraftCreateDTO result = new CliModalita_somministrazioneDraftCreateDTO();
            result.set_clientId(this._clientId);
            result.setCod(this.cod);
            result.setNome(this.nome);
            return result;
        }

    }
}
