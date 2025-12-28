package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class Centro_provenienza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliCentro_provenienzaDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String _clientId;
    private Boolean altro;
    private Integer cod;
    private String nome;
    private Boolean visibile;

    public CliCentro_provenienzaDraftDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
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
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
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

    public static CliCentro_provenienzaDraftDTO.Builder builder() {
        return new CliCentro_provenienzaDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String _clientId;
        private Boolean altro;
        private Integer cod;
        private String nome;
        private Boolean visibile;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
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


        public CliCentro_provenienzaDraftDTO build() {
            CliCentro_provenienzaDraftDTO result = new CliCentro_provenienzaDraftDTO();
            result.set_id(this._id);
            result.set_clientId(this._clientId);
            result.setAltro(this.altro);
            result.setCod(this.cod);
            result.setNome(this.nome);
            result.setVisibile(this.visibile);
            return result;
        }

    }
}
