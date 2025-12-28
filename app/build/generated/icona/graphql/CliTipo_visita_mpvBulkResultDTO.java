package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the Tipo_visita_mpv___updateBulk mutation on objects of class Tipo_visita_mpv.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliTipo_visita_mpvBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliTipo_visita_mpvDTO> items;
    private int totalCount;

    public CliTipo_visita_mpvBulkResultDTO() {
    }


    /**
     * An array of objects of class Tipo_visita_mpv affected by the mutation.
     */
    public java.util.List<CliTipo_visita_mpvDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class Tipo_visita_mpv affected by the mutation.
     */
    public void setItems(java.util.List<CliTipo_visita_mpvDTO> items) {
        this.items = items;
    }

    /**
     * The total count of objects affected by the mutation,
     */
    public int getTotalCount() {
        return totalCount;
    }
    /**
     * The total count of objects affected by the mutation,
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (items != null) {
            joiner.add("items: " + GraphQLRequestSerializer.getEntry(items));
        }
        joiner.add("totalCount: " + GraphQLRequestSerializer.getEntry(totalCount));
        return joiner.toString();
    }

    public static CliTipo_visita_mpvBulkResultDTO.Builder builder() {
        return new CliTipo_visita_mpvBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private java.util.List<CliTipo_visita_mpvDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class Tipo_visita_mpv affected by the mutation.
         */
        public Builder setItems(java.util.List<CliTipo_visita_mpvDTO> items) {
            this.items = items;
            return this;
        }

        /**
         * The total count of objects affected by the mutation,
         */
        public Builder setTotalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }


        public CliTipo_visita_mpvBulkResultDTO build() {
            CliTipo_visita_mpvBulkResultDTO result = new CliTipo_visita_mpvBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
