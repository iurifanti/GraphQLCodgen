package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the Gruppo___updateBulk mutation on objects of class Gruppo.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliGruppoBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<CliGruppoDTO> items;
    private int totalCount;

    public CliGruppoBulkResultDTO() {
    }


    /**
     * An array of objects of class Gruppo affected by the mutation.
     */
    public java.util.List<CliGruppoDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class Gruppo affected by the mutation.
     */
    public void setItems(java.util.List<CliGruppoDTO> items) {
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

    public static CliGruppoBulkResultDTO.Builder builder() {
        return new CliGruppoBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<CliGruppoDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class Gruppo affected by the mutation.
         */
        public Builder setItems(java.util.List<CliGruppoDTO> items) {
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


        public CliGruppoBulkResultDTO build() {
            CliGruppoBulkResultDTO result = new CliGruppoBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
