package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the Centro_provenienza___updateBulk mutation on objects of class Centro_provenienza.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliCentro_provenienzaBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliCentro_provenienzaDTO> items;
    private int totalCount;

    public CliCentro_provenienzaBulkResultDTO() {
    }


    /**
     * An array of objects of class Centro_provenienza affected by the mutation.
     */
    public java.util.List<CliCentro_provenienzaDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class Centro_provenienza affected by the mutation.
     */
    public void setItems(java.util.List<CliCentro_provenienzaDTO> items) {
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

    public static CliCentro_provenienzaBulkResultDTO.Builder builder() {
        return new CliCentro_provenienzaBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private java.util.List<CliCentro_provenienzaDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class Centro_provenienza affected by the mutation.
         */
        public Builder setItems(java.util.List<CliCentro_provenienzaDTO> items) {
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


        public CliCentro_provenienzaBulkResultDTO build() {
            CliCentro_provenienzaBulkResultDTO result = new CliCentro_provenienzaBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
