package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the Tipo_esame___updateBulk mutation on objects of class Tipo_esame.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliTipo_esameBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliTipo_esameDTO> items;
    private int totalCount;

    public CliTipo_esameBulkResultDTO() {
    }


    /**
     * An array of objects of class Tipo_esame affected by the mutation.
     */
    public java.util.List<CliTipo_esameDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class Tipo_esame affected by the mutation.
     */
    public void setItems(java.util.List<CliTipo_esameDTO> items) {
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

    public static CliTipo_esameBulkResultDTO.Builder builder() {
        return new CliTipo_esameBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliTipo_esameDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class Tipo_esame affected by the mutation.
         */
        public Builder setItems(java.util.List<CliTipo_esameDTO> items) {
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


        public CliTipo_esameBulkResultDTO build() {
            CliTipo_esameBulkResultDTO result = new CliTipo_esameBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
