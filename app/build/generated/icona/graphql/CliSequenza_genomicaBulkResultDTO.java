package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the Sequenza_genomica___updateBulk mutation on objects of class Sequenza_genomica.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:42+0100"
)
public class CliSequenza_genomicaBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliSequenza_genomicaDTO> items;
    private int totalCount;

    public CliSequenza_genomicaBulkResultDTO() {
    }


    /**
     * An array of objects of class Sequenza_genomica affected by the mutation.
     */
    public java.util.List<CliSequenza_genomicaDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class Sequenza_genomica affected by the mutation.
     */
    public void setItems(java.util.List<CliSequenza_genomicaDTO> items) {
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

    public static CliSequenza_genomicaBulkResultDTO.Builder builder() {
        return new CliSequenza_genomicaBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:42+0100"
    )
    public static class Builder {

        private java.util.List<CliSequenza_genomicaDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class Sequenza_genomica affected by the mutation.
         */
        public Builder setItems(java.util.List<CliSequenza_genomicaDTO> items) {
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


        public CliSequenza_genomicaBulkResultDTO build() {
            CliSequenza_genomicaBulkResultDTO result = new CliSequenza_genomicaBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
