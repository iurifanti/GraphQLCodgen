package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
Indicazioni_arruolamento_studi.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliIndicazioni_arruolamento_studiCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private CliPendingFileReferenceDTO documento;
    private String studio;

    public CliIndicazioni_arruolamento_studiCursorDTO() {
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

    public static CliIndicazioni_arruolamento_studiCursorDTO.Builder builder() {
        return new CliIndicazioni_arruolamento_studiCursorDTO.Builder();
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


        public CliIndicazioni_arruolamento_studiCursorDTO build() {
            CliIndicazioni_arruolamento_studiCursorDTO result = new CliIndicazioni_arruolamento_studiCursorDTO();
            result.set_id(this._id);
            result.setDocumento(this.documento);
            result.setStudio(this.studio);
            return result;
        }

    }
}
