package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of Centro_provenienza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCentro_provenienzaCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private Boolean altro;
    private int cod;
    @javax.validation.constraints.NotNull
    private String nome;
    private Boolean visibile;

    public CliCentro_provenienzaCreateDTO() {
    }


    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public Boolean getAltro() {
        return altro;
    }
    public void setAltro(Boolean altro) {
        this.altro = altro;
    }

    public int getCod() {
        return cod;
    }
    public void setCod(int cod) {
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
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (altro != null) {
            joiner.add("altro: " + GraphQLRequestSerializer.getEntry(altro));
        }
        joiner.add("cod: " + GraphQLRequestSerializer.getEntry(cod));
        if (nome != null) {
            joiner.add("nome: " + GraphQLRequestSerializer.getEntry(nome));
        }
        if (visibile != null) {
            joiner.add("visibile: " + GraphQLRequestSerializer.getEntry(visibile));
        }
        return joiner.toString();
    }

    public static CliCentro_provenienzaCreateDTO.Builder builder() {
        return new CliCentro_provenienzaCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private Boolean altro;
        private int cod;
        private String nome;
        private Boolean visibile;

        public Builder() {
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setAltro(Boolean altro) {
            this.altro = altro;
            return this;
        }

        public Builder setCod(int cod) {
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


        public CliCentro_provenienzaCreateDTO build() {
            CliCentro_provenienzaCreateDTO result = new CliCentro_provenienzaCreateDTO();
            result.set_clientId(this._clientId);
            result.setAltro(this.altro);
            result.setCod(this.cod);
            result.setNome(this.nome);
            result.setVisibile(this.visibile);
            return result;
        }

    }
}
