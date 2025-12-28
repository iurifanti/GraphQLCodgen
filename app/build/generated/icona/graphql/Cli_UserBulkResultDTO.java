package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * The result of the _User___updateBulk mutation on objects of class _User.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class Cli_UserBulkResultDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private java.util.List<Cli_UserDTO> items;
    private int totalCount;

    public Cli_UserBulkResultDTO() {
    }


    /**
     * An array of objects of class _User affected by the mutation.
     */
    public java.util.List<Cli_UserDTO> getItems() {
        return items;
    }
    /**
     * An array of objects of class _User affected by the mutation.
     */
    public void setItems(java.util.List<Cli_UserDTO> items) {
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

    public static Cli_UserBulkResultDTO.Builder builder() {
        return new Cli_UserBulkResultDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private java.util.List<Cli_UserDTO> items;
        private int totalCount;

        public Builder() {
        }

        /**
         * An array of objects of class _User affected by the mutation.
         */
        public Builder setItems(java.util.List<Cli_UserDTO> items) {
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


        public Cli_UserBulkResultDTO build() {
            Cli_UserBulkResultDTO result = new Cli_UserBulkResultDTO();
            result.setItems(this.items);
            result.setTotalCount(this.totalCount);
            return result;
        }

    }
}
