package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a single object of class Indicazioni_arruolamento_studi.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliIndicazioni_arruolamento_studiUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private CliPendingFileReferenceDTO documento;
    private String studio;

    public CliIndicazioni_arruolamento_studiUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public CliPendingFileReferenceDTO getDocumento() {
        return documento;
    }
    public void setDocumento(CliPendingFileReferenceDTO documento) {
        this.documento = documento;
    }

    public String getStudio() {
        return studio;
    }
    public void setStudio(String studio) {
        this.studio = studio;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (documento != null) {
            joiner.add("documento: " + GraphQLRequestSerializer.getEntry(documento));
        }
        if (studio != null) {
            joiner.add("studio: " + GraphQLRequestSerializer.getEntry(studio));
        }
        return joiner.toString();
    }

    public static CliIndicazioni_arruolamento_studiUpdateDTO.Builder builder() {
        return new CliIndicazioni_arruolamento_studiUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private CliPendingFileReferenceDTO documento;
        private String studio;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder setDocumento(CliPendingFileReferenceDTO documento) {
            this.documento = documento;
            return this;
        }

        public Builder setStudio(String studio) {
            this.studio = studio;
            return this;
        }


        public CliIndicazioni_arruolamento_studiUpdateDTO build() {
            CliIndicazioni_arruolamento_studiUpdateDTO result = new CliIndicazioni_arruolamento_studiUpdateDTO();
            result.set_id(this._id);
            result.setDocumento(this.documento);
            result.setStudio(this.studio);
            return result;
        }

    }
}
