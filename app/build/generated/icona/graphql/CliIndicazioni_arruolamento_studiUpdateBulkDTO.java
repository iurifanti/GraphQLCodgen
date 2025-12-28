package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of class Indicazioni_arruolamento_studi.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliIndicazioni_arruolamento_studiUpdateBulkDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CliPendingFileReferenceDTO documento;
    private String studio;

    public CliIndicazioni_arruolamento_studiUpdateBulkDTO() {
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
        if (documento != null) {
            joiner.add("documento: " + GraphQLRequestSerializer.getEntry(documento));
        }
        if (studio != null) {
            joiner.add("studio: " + GraphQLRequestSerializer.getEntry(studio));
        }
        return joiner.toString();
    }

    public static CliIndicazioni_arruolamento_studiUpdateBulkDTO.Builder builder() {
        return new CliIndicazioni_arruolamento_studiUpdateBulkDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private CliPendingFileReferenceDTO documento;
        private String studio;

        public Builder() {
        }

        public Builder setDocumento(CliPendingFileReferenceDTO documento) {
            this.documento = documento;
            return this;
        }

        public Builder setStudio(String studio) {
            this.studio = studio;
            return this;
        }


        public CliIndicazioni_arruolamento_studiUpdateBulkDTO build() {
            CliIndicazioni_arruolamento_studiUpdateBulkDTO result = new CliIndicazioni_arruolamento_studiUpdateBulkDTO();
            result.setDocumento(this.documento);
            result.setStudio(this.studio);
            return result;
        }

    }
}
